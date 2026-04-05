package dv;

import ao.kwoC.zAQQWzBxnS;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d {
    public static final int getProgressionLastElement(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static final long getProgressionLastElement(long j10, long j11, long j12) {
        if (j12 > 0) {
            if (j10 < j11) {
                long j13 = j11 % j12;
                if (j13 < 0) {
                    j13 += j12;
                }
                long j14 = j10 % j12;
                if (j14 < 0) {
                    j14 += j12;
                }
                long j15 = (j13 - j14) % j12;
                if (j15 < 0) {
                    j15 += j12;
                }
                return j11 - j15;
            }
        } else {
            if (j12 >= 0) {
                throw new IllegalArgumentException(zAQQWzBxnS.hiryRmzR);
            }
            if (j10 > j11) {
                long j16 = -j12;
                long j17 = j10 % j16;
                if (j17 < 0) {
                    j17 += j16;
                }
                long j18 = j11 % j16;
                if (j18 < 0) {
                    j18 += j16;
                }
                long j19 = (j17 - j18) % j16;
                if (j19 < 0) {
                    j19 += j16;
                }
                return j11 + j19;
            }
        }
        return j11;
    }
}
