package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2400lK implements InterfaceC1244Gw {
    public static String[] A02 = {"1Tt6ltc55g", "ops4n6D0RsDIbcNK2iFIW7Ay7S5Nano", "QFUbJLsUaFmSVLdjzr36RpAXorrqi07i", "7FxugF0ZmqBQk4dAnarwpNTfiaTe1g6g", "N3T7HRrxqFzk5rl0dpC6S3h47ocLp3rK", "Rq3uRmlvLOcLbWX3oXceNMTvaDTByq6j", "8TmLuftHICqYkzwVWbIwZIwFPzZSJxQj", "4hmJxBFNQAJLWam3xj85pvhcrB85xjeQ"};
    public final long A00;
    public final C1229Gh A01;

    public C2400lK(C1229Gh c1229Gh, long j10) {
        this.A01 = c1229Gh;
        this.A00 = j10;
    }

    private C1245Gx A00(long j10, long j11) {
        return new C1245Gx((1000000 * j10) / this.A01.A07, this.A00 + j11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A01.A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        long j11;
        C3M.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int iA0L = AbstractC09264a.A0L(jArr, this.A01.A07(j10), true, false);
        long j12 = 0;
        if (iA0L == -1) {
            j11 = 0;
        } else {
            j11 = jArr[iA0L];
        }
        if (iA0L != -1) {
            j12 = jArr2[iA0L];
        }
        C1245Gx c1245GxA00 = A00(j11, j12);
        if (c1245GxA00.A01 != j10) {
            int length = jArr.length - 1;
            String[] strArr = A02;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "o5tsTNyqew751hc5myqwVOdw8F1gICkG";
            strArr2[6] = "VidtQTuToVY7NImzxnJwSrK8bx75lEQY";
            if (iA0L != length) {
                C1245Gx secondSeekPoint = A00(jArr[iA0L + 1], jArr2[iA0L + 1]);
                return new C1243Gv(c1245GxA00, secondSeekPoint);
            }
        }
        return new C1243Gv(c1245GxA00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }
}
