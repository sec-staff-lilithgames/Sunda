package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
abstract class CeaDecoder implements SubtitleDecoder {
    private static final int NUM_INPUT_BUFFERS = 10;
    private static final int NUM_OUTPUT_BUFFERS = 2;
    private final ArrayDeque<CeaInputBuffer> availableInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<SubtitleOutputBuffer> availableOutputBuffers;
    private CeaInputBuffer dequeuedInputBuffer;
    private long playbackPositionUs;
    private long queuedInputBufferCount;
    private final PriorityQueue<CeaInputBuffer> queuedInputBuffers;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {
        private long queuedInputBufferCount;

        private CeaInputBuffer() {
        }

        @Override // java.lang.Comparable
        public int compareTo(CeaInputBuffer ceaInputBuffer) {
            if (isEndOfStream() != ceaInputBuffer.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.timeUs - ceaInputBuffer.timeUs;
            if (j10 == 0) {
                j10 = this.queuedInputBufferCount - ceaInputBuffer.queuedInputBufferCount;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CeaOutputBuffer extends SubtitleOutputBuffer {
        private CeaOutputBuffer() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer, com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
        public final void release() {
            CeaDecoder.this.releaseOutputBuffer(this);
        }
    }

    public CeaDecoder() {
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                break;
            }
            this.availableInputBuffers.add(new CeaInputBuffer());
            i10++;
        }
        this.availableOutputBuffers = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.availableOutputBuffers.add(new CeaOutputBuffer());
        }
        this.queuedInputBuffers = new PriorityQueue<>();
    }

    private void releaseInputBuffer(CeaInputBuffer ceaInputBuffer) {
        ceaInputBuffer.clear();
        this.availableInputBuffers.add(ceaInputBuffer);
    }

    public abstract Subtitle createSubtitle();

    public abstract void decode(SubtitleInputBuffer subtitleInputBuffer);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void flush() {
        this.queuedInputBufferCount = 0L;
        this.playbackPositionUs = 0L;
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBuffer(this.queuedInputBuffers.poll());
        }
        CeaInputBuffer ceaInputBuffer = this.dequeuedInputBuffer;
        if (ceaInputBuffer != null) {
            releaseInputBuffer(ceaInputBuffer);
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public abstract String getName();

    public abstract boolean isNewSubtitleDataAvailable();

    public void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.add(subtitleOutputBuffer);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j10) {
        this.playbackPositionUs = j10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(this.dequeuedInputBuffer == null);
        if (this.availableInputBuffers.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBufferPollFirst = this.availableInputBuffers.pollFirst();
        this.dequeuedInputBuffer = ceaInputBufferPollFirst;
        return ceaInputBufferPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        while (!this.queuedInputBuffers.isEmpty() && this.queuedInputBuffers.peek().timeUs <= this.playbackPositionUs) {
            CeaInputBuffer ceaInputBufferPoll = this.queuedInputBuffers.poll();
            if (ceaInputBufferPoll.isEndOfStream()) {
                SubtitleOutputBuffer subtitleOutputBufferPollFirst = this.availableOutputBuffers.pollFirst();
                subtitleOutputBufferPollFirst.addFlag(4);
                releaseInputBuffer(ceaInputBufferPoll);
                return subtitleOutputBufferPollFirst;
            }
            decode(ceaInputBufferPoll);
            if (isNewSubtitleDataAvailable()) {
                Subtitle subtitleCreateSubtitle = createSubtitle();
                if (!ceaInputBufferPoll.isDecodeOnly()) {
                    SubtitleOutputBuffer subtitleOutputBufferPollFirst2 = this.availableOutputBuffers.pollFirst();
                    subtitleOutputBufferPollFirst2.setContent(ceaInputBufferPoll.timeUs, subtitleCreateSubtitle, Long.MAX_VALUE);
                    releaseInputBuffer(ceaInputBufferPoll);
                    return subtitleOutputBufferPollFirst2;
                }
            }
            releaseInputBuffer(ceaInputBufferPoll);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        Assertions.checkArgument(subtitleInputBuffer == this.dequeuedInputBuffer);
        if (subtitleInputBuffer.isDecodeOnly()) {
            releaseInputBuffer(this.dequeuedInputBuffer);
        } else {
            CeaInputBuffer ceaInputBuffer = this.dequeuedInputBuffer;
            long j10 = this.queuedInputBufferCount;
            this.queuedInputBufferCount = 1 + j10;
            ceaInputBuffer.queuedInputBufferCount = j10;
            this.queuedInputBuffers.add(this.dequeuedInputBuffer);
        }
        this.dequeuedInputBuffer = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void release() {
    }
}
