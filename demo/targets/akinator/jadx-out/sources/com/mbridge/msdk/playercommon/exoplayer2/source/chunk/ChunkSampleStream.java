package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream;
import com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {
    private static final String TAG = "ChunkSampleStream";
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> callback;
    private final T chunkSource;
    long decodeOnlyUntilPositionUs;
    private final SampleQueue[] embeddedSampleQueues;
    private final Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private long lastSeekPositionUs;
    boolean loadingFinished;
    private final BaseMediaChunkOutput mediaChunkOutput;
    private final ArrayList<BaseMediaChunk> mediaChunks;
    private final int minLoadableRetryCount;
    private long pendingResetPositionUs;
    private Format primaryDownstreamTrackFormat;
    private final SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final List<BaseMediaChunk> readOnlyMediaChunks;
    private ReleaseCallback<T> releaseCallback;
    private final Loader loader = new Loader("Loader:ChunkSampleStream");
    private final ChunkHolder nextChunkHolder = new ChunkHolder();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i10, int[] iArr, Format[] formatArr, T t10, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j10, int i11, MediaSourceEventListener.EventDispatcher eventDispatcher) {
        this.primaryTrackType = i10;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr;
        this.chunkSource = t10;
        this.callback = callback;
        this.eventDispatcher = eventDispatcher;
        this.minLoadableRetryCount = i11;
        ArrayList<BaseMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        int i12 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.embeddedSampleQueues = new SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i13 = length + 1;
        int[] iArr2 = new int[i13];
        SampleQueue[] sampleQueueArr = new SampleQueue[i13];
        SampleQueue sampleQueue = new SampleQueue(allocator);
        this.primarySampleQueue = sampleQueue;
        iArr2[0] = i10;
        sampleQueueArr[0] = sampleQueue;
        while (i12 < length) {
            SampleQueue sampleQueue2 = new SampleQueue(allocator);
            this.embeddedSampleQueues[i12] = sampleQueue2;
            int i14 = i12 + 1;
            sampleQueueArr[i14] = sampleQueue2;
            iArr2[i14] = iArr[i12];
            i12 = i14;
        }
        this.mediaChunkOutput = new BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j10;
        this.lastSeekPositionUs = j10;
    }

    private void discardDownstreamMediaChunks(int i10) {
        int iPrimaryStreamIndexToMediaChunkIndex = primaryStreamIndexToMediaChunkIndex(i10, 0);
        if (iPrimaryStreamIndexToMediaChunkIndex > 0) {
            Util.removeRange(this.mediaChunks, 0, iPrimaryStreamIndexToMediaChunkIndex);
        }
    }

    private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i10) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i10);
        ArrayList<BaseMediaChunk> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i10, arrayList.size());
        int i11 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i11 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            SampleQueue sampleQueue = sampleQueueArr[i11];
            i11++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i11));
        }
    }

    private BaseMediaChunk getLastMediaChunk() {
        return (BaseMediaChunk) o2.e(1, this.mediaChunks);
    }

    private boolean haveReadFromMediaChunk(int i10) {
        int readIndex;
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i10);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i11 = 0;
        do {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i11 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i11].getReadIndex();
            i11++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i11));
        return true;
    }

    private boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof BaseMediaChunk;
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i10, int i11) {
        int iPrimaryStreamIndexToMediaChunkIndex = primaryStreamIndexToMediaChunkIndex(i10 - i11, 0);
        int iPrimaryStreamIndexToMediaChunkIndex2 = i11 == 1 ? iPrimaryStreamIndexToMediaChunkIndex : primaryStreamIndexToMediaChunkIndex(i10 - 1, iPrimaryStreamIndexToMediaChunkIndex);
        while (iPrimaryStreamIndexToMediaChunkIndex <= iPrimaryStreamIndexToMediaChunkIndex2) {
            maybeNotifyPrimaryTrackFormatChanged(iPrimaryStreamIndexToMediaChunkIndex);
            iPrimaryStreamIndexToMediaChunkIndex++;
        }
    }

    private int primaryStreamIndexToMediaChunkIndex(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i11).getFirstSampleIndex(0) <= i10);
        return i11 - 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        BaseMediaChunk lastMediaChunk;
        long j11;
        if (this.loadingFinished || this.loader.isLoading()) {
            return false;
        }
        boolean zIsPendingReset = isPendingReset();
        if (zIsPendingReset) {
            j11 = this.pendingResetPositionUs;
            lastMediaChunk = null;
        } else {
            lastMediaChunk = getLastMediaChunk();
            j11 = lastMediaChunk.endTimeUs;
        }
        this.chunkSource.getNextChunk(lastMediaChunk, j10, j11, this.nextChunkHolder);
        ChunkHolder chunkHolder = this.nextChunkHolder;
        boolean z10 = chunkHolder.endOfStream;
        Chunk chunk = chunkHolder.chunk;
        chunkHolder.clear();
        if (z10) {
            this.pendingResetPositionUs = C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        if (isMediaChunk(chunk)) {
            BaseMediaChunk baseMediaChunk = (BaseMediaChunk) chunk;
            if (zIsPendingReset) {
                long j12 = baseMediaChunk.startTimeUs;
                long j13 = this.pendingResetPositionUs;
                if (j12 == j13) {
                    j13 = Long.MIN_VALUE;
                }
                this.decodeOnlyUntilPositionUs = j13;
                this.pendingResetPositionUs = C.TIME_UNSET;
            }
            baseMediaChunk.init(this.mediaChunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        }
        this.eventDispatcher.loadStarted(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, this.loader.startLoading(chunk, this, this.minLoadableRetryCount));
        return true;
    }

    public void discardBuffer(long j10, boolean z10) {
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j10, z10, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 <= firstIndex) {
            return;
        }
        long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
        int i10 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i10 >= sampleQueueArr.length) {
                discardDownstreamMediaChunks(firstIndex2);
                return;
            } else {
                sampleQueueArr[i10].discardTo(firstTimestampUs, z10, this.embeddedTracksSelected[i10]);
                i10++;
            }
        }
    }

    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j10, seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long jMax = this.lastSeekPositionUs;
        BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            lastMediaChunk = this.mediaChunks.size() > 1 ? (BaseMediaChunk) o2.e(2, this.mediaChunks) : null;
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        return Math.max(jMax, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.chunkSource;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    public boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public boolean isReady() {
        if (this.loadingFinished) {
            return true;
        }
        return !isPendingReset() && this.primarySampleQueue.hasNextSample();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
        ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) throws IllegalStateException {
        if (isPendingReset()) {
            return -3;
        }
        int i10 = this.primarySampleQueue.read(formatHolder, decoderInputBuffer, z10, this.loadingFinished, this.decodeOnlyUntilPositionUs);
        if (i10 == -4) {
            maybeNotifyPrimaryTrackFormatChanged(this.primarySampleQueue.getReadIndex(), 1);
        }
        return i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        int size;
        int preferredQueueSize;
        if (this.loader.isLoading() || isPendingReset() || (size = this.mediaChunks.size()) <= (preferredQueueSize = this.chunkSource.getPreferredQueueSize(j10, this.readOnlyMediaChunks))) {
            return;
        }
        while (true) {
            if (preferredQueueSize >= size) {
                preferredQueueSize = size;
                break;
            } else if (!haveReadFromMediaChunk(preferredQueueSize)) {
                break;
            } else {
                preferredQueueSize++;
            }
        }
        if (preferredQueueSize == size) {
            return;
        }
        long j11 = getLastMediaChunk().endTimeUs;
        BaseMediaChunk baseMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(preferredQueueSize);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.eventDispatcher.upstreamDiscarded(this.primaryTrackType, baseMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j11);
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j10) {
        BaseMediaChunk baseMediaChunk;
        boolean readPosition;
        this.lastSeekPositionUs = j10;
        this.primarySampleQueue.rewind();
        if (isPendingReset()) {
            readPosition = false;
        } else {
            for (int i10 = 0; i10 < this.mediaChunks.size(); i10++) {
                baseMediaChunk = this.mediaChunks.get(i10);
                long j11 = baseMediaChunk.startTimeUs;
                if (j11 == j10 && baseMediaChunk.seekTimeUs == C.TIME_UNSET) {
                    break;
                } else {
                    if (j11 > j10) {
                        break;
                    }
                }
            }
            baseMediaChunk = null;
            if (baseMediaChunk != null) {
                readPosition = this.primarySampleQueue.setReadPosition(baseMediaChunk.getFirstSampleIndex(0));
                this.decodeOnlyUntilPositionUs = Long.MIN_VALUE;
            } else {
                readPosition = this.primarySampleQueue.advanceTo(j10, true, (j10 > getNextLoadPositionUs() ? 1 : (j10 == getNextLoadPositionUs() ? 0 : -1)) < 0) != -1;
                this.decodeOnlyUntilPositionUs = this.lastSeekPositionUs;
            }
        }
        if (readPosition) {
            for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
                sampleQueue.rewind();
                sampleQueue.advanceTo(j10, true, false);
            }
            return;
        }
        this.pendingResetPositionUs = j10;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            this.loader.cancelLoading();
            return;
        }
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue2 : this.embeddedSampleQueues) {
            sampleQueue2.reset();
        }
    }

    public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j10, int i10) {
        for (int i11 = 0; i11 < this.embeddedSampleQueues.length; i11++) {
            if (this.embeddedTrackTypes[i11] == i10) {
                Assertions.checkState(!this.embeddedTracksSelected[i11]);
                this.embeddedTracksSelected[i11] = true;
                this.embeddedSampleQueues[i11].rewind();
                this.embeddedSampleQueues[i11].advanceTo(j10, true, true);
                return new EmbeddedSampleStream(this, this.embeddedSampleQueues[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int skipData(long j10) {
        int iAdvanceToEnd = 0;
        if (isPendingReset()) {
            return 0;
        }
        if (!this.loadingFinished || j10 <= this.primarySampleQueue.getLargestQueuedTimestampUs()) {
            int iAdvanceTo = this.primarySampleQueue.advanceTo(j10, true, true);
            if (iAdvanceTo != -1) {
                iAdvanceToEnd = iAdvanceTo;
            }
        } else {
            iAdvanceToEnd = this.primarySampleQueue.advanceToEnd();
        }
        if (iAdvanceToEnd > 0) {
            maybeNotifyPrimaryTrackFormatChanged(this.primarySampleQueue.getReadIndex(), iAdvanceToEnd);
        }
        return iAdvanceToEnd;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j10, long j11, boolean z10) {
        this.eventDispatcher.loadCanceled(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j10, j11, chunk.bytesLoaded());
        if (z10) {
            return;
        }
        this.primarySampleQueue.reset();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j10, long j11) {
        this.chunkSource.onChunkLoadCompleted(chunk);
        this.eventDispatcher.loadCompleted(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j10, j11, chunk.bytesLoaded());
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public int onLoadError(Chunk chunk, long j10, long j11, IOException iOException) {
        boolean z10;
        long jBytesLoaded = chunk.bytesLoaded();
        boolean zIsMediaChunk = isMediaChunk(chunk);
        int size = this.mediaChunks.size() - 1;
        boolean z11 = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        if (!this.chunkSource.onChunkLoadError(chunk, z11, iOException)) {
            z10 = false;
        } else if (z11) {
            if (zIsMediaChunk) {
                Assertions.checkState(discardUpstreamMediaChunksFromIndex(size) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
            z10 = true;
        } else {
            Log.w(TAG, "Ignoring attempt to cancel non-cancelable load.");
            z10 = false;
        }
        this.eventDispatcher.loadError(chunk.dataSpec, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j10, j11, jBytesLoaded, iOException, z10);
        if (!z10) {
            return 0;
        }
        this.callback.onContinueLoadingRequested(this);
        return 2;
    }

    public void release(ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.discardToEnd();
        for (SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.discardToEnd();
        }
        this.loader.release(this);
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i10) {
        BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i10);
        Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.eventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class EmbeddedSampleStream implements SampleStream {
        private boolean formatNotificationSent;
        private final int index;
        public final ChunkSampleStream<T> parent;
        private final SampleQueue sampleQueue;

        public EmbeddedSampleStream(ChunkSampleStream<T> chunkSampleStream, SampleQueue sampleQueue, int i10) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i10;
        }

        private void maybeNotifyTrackFormatChanged() {
            if (this.formatNotificationSent) {
                return;
            }
            ChunkSampleStream.this.eventDispatcher.downstreamFormatChanged(ChunkSampleStream.this.embeddedTrackTypes[this.index], ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, ChunkSampleStream.this.lastSeekPositionUs);
            this.formatNotificationSent = true;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public boolean isReady() {
            ChunkSampleStream chunkSampleStream = ChunkSampleStream.this;
            if (chunkSampleStream.loadingFinished) {
                return true;
            }
            return !chunkSampleStream.isPendingReset() && this.sampleQueue.hasNextSample();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) throws IllegalStateException {
            if (ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            SampleQueue sampleQueue = this.sampleQueue;
            ChunkSampleStream chunkSampleStream = ChunkSampleStream.this;
            int i10 = sampleQueue.read(formatHolder, decoderInputBuffer, z10, chunkSampleStream.loadingFinished, chunkSampleStream.decodeOnlyUntilPositionUs);
            if (i10 == -4) {
                maybeNotifyTrackFormatChanged();
            }
            return i10;
        }

        public void release() {
            Assertions.checkState(ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public int skipData(long j10) {
            int iAdvanceTo;
            if (!ChunkSampleStream.this.loadingFinished || j10 <= this.sampleQueue.getLargestQueuedTimestampUs()) {
                iAdvanceTo = this.sampleQueue.advanceTo(j10, true, true);
                if (iAdvanceTo == -1) {
                    iAdvanceTo = 0;
                }
            } else {
                iAdvanceTo = this.sampleQueue.advanceToEnd();
            }
            if (iAdvanceTo > 0) {
                maybeNotifyTrackFormatChanged();
            }
            return iAdvanceTo;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
        }
    }
}
