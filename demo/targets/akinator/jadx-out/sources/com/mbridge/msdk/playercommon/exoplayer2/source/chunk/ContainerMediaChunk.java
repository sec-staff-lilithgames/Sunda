package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DefaultExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ContainerMediaChunk extends BaseMediaChunk {
    private volatile int bytesLoaded;
    private final int chunkCount;
    private final ChunkExtractorWrapper extractorWrapper;
    private volatile boolean loadCanceled;
    private volatile boolean loadCompleted;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, Object obj, long j10, long j11, long j12, long j13, int i11, long j14, ChunkExtractorWrapper chunkExtractorWrapper) {
        super(dataSource, dataSpec, format, i10, obj, j10, j11, j12, j13);
        this.chunkCount = i11;
        this.sampleOffsetUs = j14;
        this.extractorWrapper = chunkExtractorWrapper;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk
    public final long bytesLoaded() {
        return this.bytesLoaded;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + this.chunkCount;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public final void load() throws InterruptedException, IOException {
        DataSpec dataSpecSubrange = this.dataSpec.subrange(this.bytesLoaded);
        try {
            DataSource dataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpecSubrange.absoluteStreamPosition, dataSource.open(dataSpecSubrange));
            if (this.bytesLoaded == 0) {
                BaseMediaChunkOutput output = getOutput();
                output.setSampleOffsetUs(this.sampleOffsetUs);
                ChunkExtractorWrapper chunkExtractorWrapper = this.extractorWrapper;
                long j10 = this.seekTimeUs;
                chunkExtractorWrapper.init(output, j10 == C.TIME_UNSET ? 0L : j10 - this.sampleOffsetUs);
            }
            try {
                Extractor extractor = this.extractorWrapper.extractor;
                int i10 = 0;
                while (i10 == 0 && !this.loadCanceled) {
                    i10 = extractor.read(defaultExtractorInput, null);
                }
                Assertions.checkState(i10 != 1);
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
                Util.closeQuietly(this.dataSource);
                this.loadCompleted = true;
            } catch (Throwable th2) {
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
                throw th2;
            }
        } catch (Throwable th3) {
            Util.closeQuietly(this.dataSource);
            throw th3;
        }
    }
}
