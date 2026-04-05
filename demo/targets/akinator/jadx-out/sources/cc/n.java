package cc;

import com.apm.insight.b.El.rJqlArycrfkilN;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.ironsource.Hc;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12101a = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final String f12102b = String.valueOf(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f12103c = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f12104d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f12105e;

    public static int a(int i10, int i11, byte[] bArr) {
        int i12 = f12103c[i10];
        bArr[i11] = (byte) (i12 >> 16);
        int i13 = i11 + 2;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        int i14 = i11 + 3;
        bArr[i13] = (byte) i12;
        return i14;
    }

    public static int b(int i10, char[] cArr, int i11) {
        int i12 = f12103c[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & 127);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & 127);
        return i14;
    }

    public static int c(int i10, int i11, byte[] bArr) {
        int i12 = f12103c[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i11] = (byte) (i12 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i12 >> 8);
            i11++;
        }
        int i13 = i11 + 1;
        bArr[i11] = (byte) i12;
        return i13;
    }

    public static int d(int i10, char[] cArr, int i11) {
        int i12 = f12103c[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    public static int e(int i10, int i11, byte[] bArr) {
        int iG = g(i10);
        int i12 = i10 - (iG * 1000);
        int iG2 = g(iG);
        int i13 = iG - (iG2 * 1000);
        int[] iArr = f12103c;
        int i14 = iArr[iG2];
        bArr[i11] = (byte) (i14 >> 16);
        bArr[i11 + 1] = (byte) (i14 >> 8);
        bArr[i11 + 2] = (byte) i14;
        int i15 = iArr[i13];
        bArr[i11 + 3] = (byte) (i15 >> 16);
        bArr[i11 + 4] = (byte) (i15 >> 8);
        bArr[i11 + 5] = (byte) i15;
        int i16 = iArr[i12];
        bArr[i11 + 6] = (byte) (i16 >> 16);
        int i17 = i11 + 8;
        bArr[i11 + 7] = (byte) (i16 >> 8);
        int i18 = i11 + 9;
        bArr[i17] = (byte) i16;
        return i18;
    }

    public static int f(int i10, char[] cArr, int i11) {
        int iG = g(i10);
        int i12 = i10 - (iG * 1000);
        int iG2 = g(iG);
        int[] iArr = f12103c;
        int i13 = iArr[iG2];
        cArr[i11] = (char) (i13 >> 16);
        cArr[i11 + 1] = (char) ((i13 >> 8) & 127);
        cArr[i11 + 2] = (char) (i13 & 127);
        int i14 = iArr[iG - (iG2 * 1000)];
        cArr[i11 + 3] = (char) (i14 >> 16);
        cArr[i11 + 4] = (char) ((i14 >> 8) & 127);
        cArr[i11 + 5] = (char) (i14 & 127);
        int i15 = iArr[i12];
        cArr[i11 + 6] = (char) (i15 >> 16);
        int i16 = i11 + 8;
        cArr[i11 + 7] = (char) ((i15 >> 8) & 127);
        int i17 = i11 + 9;
        cArr[i16] = (char) (i15 & 127);
        return i17;
    }

    public static int g(int i10) {
        return (int) ((i10 * 274877907) >>> 38);
    }

    public static boolean notFinite(double d10) {
        return !Double.isFinite(d10);
    }

    public static int outputInt(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                String str = f12101a;
                int length = str.length();
                str.getChars(0, length, cArr, i11);
                return length + i11;
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 < 1000000) {
            if (i10 >= 1000) {
                int iG = g(i10);
                return b(i10 - (iG * 1000), cArr, d(iG, cArr, i11));
            }
            if (i10 >= 10) {
                return d(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        if (i10 < 1000000000) {
            int iG2 = g(i10);
            int i13 = i10 - (iG2 * 1000);
            int iG3 = g(iG2);
            return b(i13, cArr, b(iG2 - (iG3 * 1000), cArr, d(iG3, cArr, i11)));
        }
        int i14 = i10 - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        if (i14 >= 1000000000) {
            i14 = i10 - 2000000000;
            i12 = i11 + 1;
            cArr[i11] = '2';
        } else {
            i12 = i11 + 1;
            cArr[i11] = '1';
        }
        return f(i14, cArr, i12);
    }

    public static int outputLong(long j10, char[] cArr, int i10) {
        int iF;
        if (j10 < 0) {
            if (j10 > -2147483648L) {
                return outputInt((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                String str = f12102b;
                int length = str.length();
                str.getChars(0, length, cArr, i10);
                return length + i10;
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= 2147483647L) {
            return outputInt((int) j10, cArr, i10);
        }
        long j11 = j10 / C.NANOS_PER_SECOND;
        long j12 = j10 - (j11 * C.NANOS_PER_SECOND);
        if (j11 < C.NANOS_PER_SECOND) {
            int i11 = (int) j11;
            int[] iArr = f12103c;
            if (i11 >= 1000000) {
                int iG = g(i11);
                int i12 = i11 - (iG * 1000);
                int iG2 = g(iG);
                int iD = d(iG2, cArr, i10);
                int i13 = iArr[iG - (iG2 * 1000)];
                cArr[iD] = (char) (i13 >> 16);
                cArr[iD + 1] = (char) ((i13 >> 8) & 127);
                cArr[iD + 2] = (char) (i13 & 127);
                int i14 = iArr[i12];
                cArr[iD + 3] = (char) (i14 >> 16);
                int i15 = iD + 5;
                cArr[iD + 4] = (char) ((i14 >> 8) & 127);
                iF = iD + 6;
                cArr[i15] = (char) (i14 & 127);
            } else if (i11 < 1000) {
                iF = d(i11, cArr, i10);
            } else {
                int iG3 = g(i11);
                int i16 = i11 - (iG3 * 1000);
                int i17 = iArr[iG3];
                if (iG3 > 9) {
                    if (iG3 > 99) {
                        cArr[i10] = (char) (i17 >> 16);
                        i10++;
                    }
                    cArr[i10] = (char) ((i17 >> 8) & 127);
                    i10++;
                }
                cArr[i10] = (char) (i17 & 127);
                int i18 = iArr[i16];
                cArr[i10 + 1] = (char) (i18 >> 16);
                int i19 = i10 + 3;
                cArr[i10 + 2] = (char) ((i18 >> 8) & 127);
                iF = i10 + 4;
                cArr[i19] = (char) (i18 & 127);
            }
        } else {
            long j13 = j11 / C.NANOS_PER_SECOND;
            long j14 = j11 - (C.NANOS_PER_SECOND * j13);
            iF = f((int) j14, cArr, d((int) j13, cArr, i10));
        }
        return f((int) j12, cArr, iF);
    }

    public static String toString(int i10) {
        String[] strArr = f12104d;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = f12105e;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f12103c[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        f12104d = new String[]{"0", "1", "2", "3", "4", CampaignEx.CLICKMODE_ON, "6", Hc.f34588e, "8", "9", "10"};
        f12105e = new String[]{Y1.f35726f, "-2", "-3", rJqlArycrfkilN.xKSrNJ, "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static boolean notFinite(float f10) {
        return !Float.isFinite(f10);
    }

    public static String toString(long j10) {
        if (j10 <= 2147483647L && j10 >= -2147483648L) {
            return toString((int) j10);
        }
        return Long.toString(j10);
    }

    public static String toString(double d10) {
        return toString(d10, false);
    }

    public static String toString(double d10, boolean z10) {
        return z10 ? dc.a.toString(d10) : Double.toString(d10);
    }

    public static String toString(float f10) {
        return toString(f10, false);
    }

    public static String toString(float f10, boolean z10) {
        return z10 ? dc.b.toString(f10) : Float.toString(f10);
    }

    public static int outputInt(int i10, byte[] bArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                String str = f12101a;
                int length = str.length();
                int i13 = 0;
                while (i13 < length) {
                    bArr[i11] = (byte) str.charAt(i13);
                    i13++;
                    i11++;
                }
                return i11;
            }
            bArr[i11] = 45;
            i10 = -i10;
            i11++;
        }
        if (i10 < 1000000) {
            if (i10 >= 1000) {
                int iG = g(i10);
                return a(i10 - (iG * 1000), c(iG, i11, bArr), bArr);
            }
            if (i10 < 10) {
                int i14 = i11 + 1;
                bArr[i11] = (byte) (i10 + 48);
                return i14;
            }
            return c(i10, i11, bArr);
        }
        if (i10 >= 1000000000) {
            int i15 = i10 - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            if (i15 >= 1000000000) {
                i15 = i10 - 2000000000;
                i12 = i11 + 1;
                bArr[i11] = 50;
            } else {
                i12 = i11 + 1;
                bArr[i11] = 49;
            }
            return e(i15, i12, bArr);
        }
        int iG2 = g(i10);
        int i16 = i10 - (iG2 * 1000);
        int iG3 = g(iG2);
        return a(i16, a(iG2 - (iG3 * 1000), c(iG3, i11, bArr), bArr), bArr);
    }

    public static int outputLong(long j10, byte[] bArr, int i10) {
        int iE;
        if (j10 < 0) {
            if (j10 > -2147483648L) {
                return outputInt((int) j10, bArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                String str = f12102b;
                int length = str.length();
                int i11 = 0;
                while (i11 < length) {
                    bArr[i10] = (byte) str.charAt(i11);
                    i11++;
                    i10++;
                }
                return i10;
            }
            bArr[i10] = 45;
            j10 = -j10;
            i10++;
        } else if (j10 <= 2147483647L) {
            return outputInt((int) j10, bArr, i10);
        }
        long j11 = j10 / C.NANOS_PER_SECOND;
        long j12 = j10 - (j11 * C.NANOS_PER_SECOND);
        if (j11 < C.NANOS_PER_SECOND) {
            int i12 = (int) j11;
            int[] iArr = f12103c;
            if (i12 >= 1000000) {
                int iG = g(i12);
                int i13 = i12 - (iG * 1000);
                int iG2 = g(iG);
                int iC = c(iG2, i10, bArr);
                int i14 = iArr[iG - (iG2 * 1000)];
                bArr[iC] = (byte) (i14 >> 16);
                bArr[iC + 1] = (byte) (i14 >> 8);
                bArr[iC + 2] = (byte) i14;
                int i15 = iArr[i13];
                bArr[iC + 3] = (byte) (i15 >> 16);
                int i16 = iC + 5;
                bArr[iC + 4] = (byte) (i15 >> 8);
                iE = iC + 6;
                bArr[i16] = (byte) i15;
            } else if (i12 < 1000) {
                iE = c(i12, i10, bArr);
            } else {
                int iG3 = g(i12);
                int i17 = i12 - (iG3 * 1000);
                int i18 = iArr[iG3];
                if (iG3 > 9) {
                    if (iG3 > 99) {
                        bArr[i10] = (byte) (i18 >> 16);
                        i10++;
                    }
                    bArr[i10] = (byte) (i18 >> 8);
                    i10++;
                }
                bArr[i10] = (byte) i18;
                int i19 = iArr[i17];
                bArr[i10 + 1] = (byte) (i19 >> 16);
                int i20 = i10 + 3;
                bArr[i10 + 2] = (byte) (i19 >> 8);
                iE = i10 + 4;
                bArr[i20] = (byte) i19;
            }
        } else {
            long j13 = j11 / C.NANOS_PER_SECOND;
            long j14 = j11 - (C.NANOS_PER_SECOND * j13);
            iE = e((int) j14, c((int) j13, i10, bArr), bArr);
        }
        return e((int) j12, iE, bArr);
    }
}
