package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i10;
        int i11 = this.byteOffset;
        Assertions.checkState(i11 >= 0 && (i11 < (i10 = this.byteLimit) || (i11 == i10 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z10 = (((this.data[this.byteOffset] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z10;
    }

    public int readBits(int i10) {
        int i11 = this.byteOffset;
        int iMin = Math.min(i10, 8 - this.bitOffset);
        int i12 = i11 + 1;
        int i13 = ((this.data[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.data[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        skipBits(i10);
        return i14;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i10) {
        int i11 = i10 / 8;
        this.byteOffset = i11;
        this.bitOffset = i10 - (i11 * 8);
        assertValidOffset();
    }

    public void skipBits(int i10) {
        int i11 = i10 / 8;
        int i12 = this.byteOffset + i11;
        this.byteOffset = i12;
        int i13 = (i10 - (i11 * 8)) + this.bitOffset;
        this.bitOffset = i13;
        if (i13 > 7) {
            this.byteOffset = i12 + 1;
            this.bitOffset = i13 - 8;
        }
        assertValidOffset();
    }
}
