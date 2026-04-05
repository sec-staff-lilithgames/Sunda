package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class WavHeader implements SeekMap {
    private final int averageBytesPerSecond;
    private final int bitsPerSample;
    private final int blockAlignment;
    private long dataSize;
    private long dataStartPosition;
    private final int encoding;
    private final int numChannels;
    private final int sampleRateHz;

    public WavHeader(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.numChannels = i10;
        this.sampleRateHz = i11;
        this.averageBytesPerSecond = i12;
        this.blockAlignment = i13;
        this.bitsPerSample = i14;
        this.encoding = i15;
    }

    public int getBitrate() {
        return this.sampleRateHz * this.bitsPerSample * this.numChannels;
    }

    public int getBytesPerFrame() {
        return this.blockAlignment;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return ((this.dataSize / this.blockAlignment) * 1000000) / this.sampleRateHz;
    }

    public int getEncoding() {
        return this.encoding;
    }

    public int getNumChannels() {
        return this.numChannels;
    }

    public int getSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long j11 = this.blockAlignment;
        long jConstrainValue = Util.constrainValue((((this.averageBytesPerSecond * j10) / 1000000) / j11) * j11, 0L, this.dataSize - j11);
        long j12 = this.dataStartPosition + jConstrainValue;
        long timeUs = getTimeUs(j12);
        SeekPoint seekPoint = new SeekPoint(timeUs, j12);
        if (timeUs < j10) {
            long j13 = this.dataSize;
            long j14 = this.blockAlignment;
            if (jConstrainValue != j13 - j14) {
                long j15 = j12 + j14;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j15), j15));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUs(long j10) {
        return (Math.max(0L, j10 - this.dataStartPosition) * 1000000) / this.averageBytesPerSecond;
    }

    public boolean hasDataBounds() {
        return (this.dataStartPosition == 0 || this.dataSize == 0) ? false : true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public void setDataBounds(long j10, long j11) {
        this.dataStartPosition = j10;
        this.dataSize = j11;
    }
}
