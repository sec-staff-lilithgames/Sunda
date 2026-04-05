package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class ConstantBitrateSeeker implements Mp3Extractor.Seeker {
    private static final int BITS_PER_BYTE = 8;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j10, long j11, MpegAudioHeader mpegAudioHeader) {
        this.firstFramePosition = j11;
        this.frameSize = mpegAudioHeader.frameSize;
        this.bitrate = mpegAudioHeader.bitrate;
        if (j10 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j10 - j11;
            this.durationUs = getTimeUs(j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long j11 = this.dataSize;
        if (j11 == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFramePosition));
        }
        long j12 = this.frameSize;
        long jConstrainValue = Util.constrainValue((((this.bitrate * j10) / 8000000) / j12) * j12, 0L, j11 - j12);
        long j13 = this.firstFramePosition + jConstrainValue;
        long timeUs = getTimeUs(j13);
        SeekPoint seekPoint = new SeekPoint(timeUs, j13);
        if (timeUs < j10) {
            long j14 = this.dataSize;
            long j15 = this.frameSize;
            if (jConstrainValue != j14 - j15) {
                long j16 = j13 + j15;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j16), j16));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j10) {
        return (Math.max(0L, j10 - this.firstFramePosition) * 8000000) / this.bitrate;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1;
    }
}
