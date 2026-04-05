package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;

/* renamed from: com.facebook.ads.redexgen.X.4I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4I {
    public static String[] A04 = {"2nOz0KIFgcZZRyVuqo5bgbDjVecAtY1v", "p1", "VjnGs3e14C04tf63tHLQ77fvb0vUFjjn", "IkQ8iUjtLJey7cJCEXqpfqsJOKT4tfzv", "YU3RrDfZvA3XfQSmqlFrDyJy2XBZ9ug4", "OCexcvgEmqqQdA89aMsn", "lWBBh2DwBKc0yUEroYjNXxq0TEDXKrUS", "n4CP0YvmwhnKHbqe32bPZYKzOuFmYPOb"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C4I() {
    }

    public C4I(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C4I(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A02 = i10;
    }

    private void A00() {
        C3M.A08(this.A03 >= 0 && (this.A03 < this.A02 || (this.A03 == this.A02 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        C3M.A08(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 0;
        this.A01 += i10;
        while (this.A01 > 8) {
            this.A01 -= 8;
            byte[] bArr = this.A00;
            int returnValue = this.A03;
            this.A03 = returnValue + 1;
            i11 |= (bArr[returnValue] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << this.A01;
        }
        int returnValue2 = this.A00[this.A03] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = i11 | (returnValue2 >> (8 - this.A01));
        int returnValue3 = 32 - i10;
        int i13 = i12 & ((-1) >>> returnValue3);
        if (this.A01 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
        return i13;
    }

    public final long A05(int i10) {
        if (i10 > 32) {
            return AbstractC09264a.A0N(A04(i10 - 32), A04(32));
        }
        long jA0M = AbstractC09264a.A0M(A04(i10));
        String[] strArr = A04;
        if (strArr[1].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "hPuSpAkHwt40nYe5baQSvI4ZKxCRAlL0";
        strArr2[0] = "ANsKpIz8SdbAQh9e0XlF7KjBsp30BEL1";
        return jA0M;
    }

    public final void A06() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A07() {
        int i10 = this.A01 + 1;
        this.A01 = i10;
        if (i10 == 8) {
            this.A01 = 0;
            int i11 = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "IsW8CSRSYhigEF2wlh1BrMeLUc4CvJhM";
            strArr2[0] = "lfcfpjtp1JtJxQNQeccncamol0LRwTjJ";
            this.A03 = i11 + 1;
        }
        A00();
    }

    public final void A08(int i10) {
        this.A03 = i10 / 8;
        this.A01 = i10 - (this.A03 * 8);
        A00();
    }

    public final void A09(int i10) {
        int i11 = i10 / 8;
        int numBytes = this.A03;
        this.A03 = numBytes + i11;
        int numBytes2 = i11 * 8;
        this.A01 += i10 - numBytes2;
        if (this.A01 > 7) {
            int numBytes3 = this.A03;
            this.A03 = numBytes3 + 1;
            int numBytes4 = this.A01;
            this.A01 = numBytes4 - 8;
        }
        A00();
    }

    public final void A0A(int i10) {
        C3M.A08(this.A01 == 0);
        this.A03 += i10;
        A00();
    }

    public final void A0B(int i10, int i11) {
        if (i11 < 32) {
            int remainingBitsToRead = 1 << i11;
            i10 &= remainingBitsToRead - 1;
        }
        int remainingBitsToRead2 = this.A01;
        int iMin = Math.min(8 - remainingBitsToRead2, i11);
        int remainingBitsToRead3 = this.A01;
        int firstByteInputBits = (8 - remainingBitsToRead3) - iMin;
        int remainingBitsToRead4 = this.A01;
        int i12 = 65280 >> remainingBitsToRead4;
        int remainingBitsToRead5 = 1 << firstByteInputBits;
        int firstByteBitmask = i12 | (remainingBitsToRead5 - 1);
        byte[] bArr = this.A00;
        int i13 = this.A03;
        byte[] bArr2 = this.A00;
        int remainingBitsToRead6 = this.A03;
        bArr[i13] = (byte) (bArr2[remainingBitsToRead6] & firstByteBitmask);
        int remainingBitsToRead7 = i11 - iMin;
        int firstByteBitmask2 = i10 >>> remainingBitsToRead7;
        byte[] bArr3 = this.A00;
        int i14 = this.A03;
        byte[] bArr4 = this.A00;
        int remainingBitsToRead8 = this.A03;
        bArr3[i14] = (byte) (bArr4[remainingBitsToRead8] | (firstByteBitmask2 << firstByteInputBits));
        int firstByteBitmask3 = i11 - iMin;
        int firstByteRightPaddingSize = this.A03;
        int firstByteRightPaddingSize2 = firstByteRightPaddingSize + 1;
        while (firstByteBitmask3 > 8) {
            int firstByteReadSize = firstByteRightPaddingSize2 + 1;
            int remainingBitsToRead9 = firstByteBitmask3 - 8;
            this.A00[firstByteRightPaddingSize2] = (byte) (i10 >>> remainingBitsToRead9);
            firstByteBitmask3 -= 8;
            firstByteRightPaddingSize2 = firstByteReadSize;
        }
        int lastByteRightPaddingSize = 8 - firstByteBitmask3;
        byte[] bArr5 = this.A00;
        int firstByteReadSize2 = this.A00[firstByteRightPaddingSize2];
        int remainingBitsToRead10 = 1 << lastByteRightPaddingSize;
        bArr5[firstByteRightPaddingSize2] = (byte) (firstByteReadSize2 & (remainingBitsToRead10 - 1));
        int remainingBitsToRead11 = 1 << firstByteBitmask3;
        int i15 = i10 & (remainingBitsToRead11 - 1);
        byte[] bArr6 = this.A00;
        int remainingBitsToRead12 = this.A00[firstByteRightPaddingSize2];
        bArr6[firstByteRightPaddingSize2] = (byte) (remainingBitsToRead12 | (i15 << lastByteRightPaddingSize));
        A09(i11);
        A00();
    }

    public final void A0C(C4J c4j) {
        A0E(c4j.A0l(), c4j.A0A());
        A08(c4j.A09() * 8);
    }

    public final void A0D(byte[] bArr) {
        A0E(bArr, bArr.length);
    }

    public final void A0E(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i10;
    }

    public final void A0F(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.A00;
            int i13 = this.A03;
            int to2 = i13 + 1;
            this.A03 = to2;
            int i14 = bArr2[i13];
            int to3 = this.A01;
            bArr[i10] = (byte) (i14 << to3);
            byte b10 = bArr[i10];
            byte[] bArr3 = this.A00;
            int to4 = this.A03;
            int i15 = 255 & bArr3[to4];
            int to5 = this.A01;
            bArr[i10] = (byte) ((i15 >> (8 - to5)) | b10);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        int bitsLeft = bArr[i12];
        int to6 = 255 >> i16;
        bArr[i12] = (byte) (bitsLeft & to6);
        int to7 = this.A01;
        if (to7 + i16 > 8) {
            byte b11 = bArr[i12];
            byte[] bArr4 = this.A00;
            int bitsLeft2 = this.A03;
            int to8 = bitsLeft2 + 1;
            this.A03 = to8;
            int bitsLeft3 = bArr4[bitsLeft2] & 255;
            int to9 = this.A01;
            bArr[i12] = (byte) (b11 | (bitsLeft3 << to9));
            int to10 = this.A01;
            this.A01 = to10 - 8;
        }
        int to11 = this.A01;
        this.A01 = to11 + i16;
        byte[] bArr5 = this.A00;
        int to12 = this.A03;
        int i17 = 255 & bArr5[to12];
        int to13 = this.A01;
        int i18 = i17 >> (8 - to13);
        int bitsLeft4 = bArr[i12];
        int to14 = 8 - i16;
        bArr[i12] = (byte) (bitsLeft4 | ((byte) (i18 << to14)));
        int to15 = this.A01;
        if (to15 == 8) {
            this.A01 = 0;
            int to16 = this.A03;
            this.A03 = to16 + 1;
        }
        A00();
    }

    public final void A0G(byte[] bArr, int i10, int i11) {
        C3M.A08(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i10, i11);
        this.A03 += i11;
        A00();
    }

    public final boolean A0H() {
        boolean returnValue = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A07();
        return returnValue;
    }
}
