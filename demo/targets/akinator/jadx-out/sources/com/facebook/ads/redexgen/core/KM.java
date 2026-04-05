package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KM {
    public static byte[] A05;
    public static String[] A06 = {"gE3mKe15PNIaoXw7ttCb9BorVTDWlR1u", "LRWwjDWdMU47wKVJIcB7Dut7mBvG0frC", "1lKwwAamcRIeYNpKQmj3IU07DDHuEgLY", "PqJP3Ph6GQQTo5wwFfkOi3DhrQyazUzj", "oFDIgUdhkULxBDQwmRB0TUbB416shGBK", "6jC", "Mah1O8vNWMLKc07TjmSj8tDHohOggjyp", "Z13UpOvZxGzeJ6F9B1HjNNGKJhd06uk1"};
    public static final byte[] A07;
    public int A00;
    public int A01;
    public byte[] A02;
    public int A03;
    public boolean A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 40;
            if (A06[1].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "wQP1xK4QaPLi3BINLWGwqVwIKxpADjCS";
            strArr[4] = "tYYHT9Q4g7LWTA4ojTcqgpuHTrSkfP7y";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-63, -85, -81, -84, -53, -34, -38, -35, -34, -21, 125, -106, -115, -96, -104, -115, -117, -100, -115, -116, 72, -101, -100, -119, -102, -100, 72, -117, -105, -116, -115, 72, -98, -119, -108, -99, -115};
    }

    static {
        A01();
        A07 = new byte[]{0, 0, 1};
    }

    public KM(int i10) {
        this.A02 = new byte[i10];
    }

    public final void A02() {
        this.A04 = false;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A03(byte[] bArr, int i10, int i11) {
        if (!this.A04) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.A02;
        String[] strArr = A06;
        String str = strArr[6];
        String str2 = strArr[4];
        int iCharAt = str.charAt(10);
        int readLength = str2.charAt(10);
        if (iCharAt != readLength) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "qvT0stT6nyeuoq7Xaws2DTrioTiQOWPH";
        strArr2[3] = "mzlXvCjE0xOVoENXvkyoTP7ZFwdNwR6s";
        int length = bArr2.length;
        int readLength2 = this.A00;
        if (length < readLength2 + i12) {
            byte[] bArr3 = this.A02;
            int readLength3 = this.A00;
            this.A02 = Arrays.copyOf(bArr3, (readLength3 + i12) * 2);
        }
        byte[] bArr4 = this.A02;
        int readLength4 = this.A00;
        System.arraycopy(bArr, i10, bArr4, readLength4, i12);
        int readLength5 = this.A00;
        this.A00 = readLength5 + i12;
    }

    public final boolean A04(int i10, int i11) {
        int i12 = this.A03;
        String strA00 = A00(10, 27, 0);
        String strA002 = A00(0, 10, 81);
        switch (i12) {
            case 0:
                if (i10 == 176) {
                    this.A03 = 1;
                    this.A04 = true;
                    break;
                }
                break;
            case 1:
                if (i10 != 181) {
                    AnonymousClass44.A07(strA002, strA00);
                    A02();
                    break;
                } else {
                    this.A03 = 2;
                    break;
                }
            case 2:
                if (i10 > 31) {
                    AnonymousClass44.A07(strA002, strA00);
                    A02();
                    break;
                } else {
                    this.A03 = 3;
                    break;
                }
            case 3:
                if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                    AnonymousClass44.A07(strA002, strA00);
                    if (A06[1].charAt(21) != 'L') {
                        A06[5] = "gGPh0dY5R1jiAvQEAzw3sN7yDmu";
                        A02();
                        break;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    this.A01 = this.A00;
                    this.A03 = 4;
                    break;
                }
            case 4:
                if (i10 == 179 || i10 == 181) {
                    this.A00 -= i11;
                    String[] strArr = A06;
                    if (strArr[0].charAt(12) != strArr[3].charAt(12)) {
                        throw new RuntimeException();
                    }
                    A06[1] = "cUZSIM6xSUtrWMgJjUWxh9bxB3Jsh26G";
                    this.A04 = false;
                    return true;
                }
            default:
                throw new IllegalStateException();
        }
        A03(A07, 0, A07.length);
        return false;
    }
}
