package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
    }

    private void assertValidOffset() {
        int i10;
        int i11 = this.byteOffset;
        Assertions.checkState(i11 >= 0 && (i11 < (i10 = this.byteLimit) || (i11 == i10 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Assertions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.bitOffset, i11);
        int i12 = this.bitOffset;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.data;
        int i14 = this.byteOffset;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.data[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.data;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        skipBits(i11);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z10 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z10;
    }

    public int readBits(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.bitOffset += i10;
        int i12 = 0;
        while (true) {
            i11 = this.bitOffset;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.bitOffset = i13;
            byte[] bArr = this.data;
            int i14 = this.byteOffset;
            this.byteOffset = i14 + 1;
            i12 |= (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13;
        }
        byte[] bArr2 = this.data;
        int i15 = this.byteOffset;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i15 + 1;
        }
        assertValidOffset();
        return i16;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        Assertions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i10, i11);
        this.byteOffset += i11;
        assertValidOffset();
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i10) {
        int i11 = i10 / 8;
        this.byteOffset = i11;
        this.bitOffset = i10 - (i11 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i10 = this.bitOffset + 1;
        this.bitOffset = i10;
        if (i10 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
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

    public void skipBytes(int i10) {
        Assertions.checkState(this.bitOffset == 0);
        this.byteOffset += i10;
        assertValidOffset();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.data, parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr, int i10) {
        this.data = bArr;
        this.byteLimit = i10;
    }

    public void reset(byte[] bArr, int i10) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i10;
    }

    public void readBits(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.data;
            int i13 = this.byteOffset;
            int i14 = i13 + 1;
            this.byteOffset = i14;
            byte b10 = bArr2[i13];
            int i15 = this.bitOffset;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.bitOffset;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.data;
            int i18 = this.byteOffset;
            this.byteOffset = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i17));
            this.bitOffset = i17 - 8;
        }
        int i19 = this.bitOffset + i16;
        this.bitOffset = i19;
        byte[] bArr4 = this.data;
        int i20 = this.byteOffset;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i20 + 1;
        }
        assertValidOffset();
    }
}
