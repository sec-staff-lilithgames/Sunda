package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e3 {

    /* renamed from: c, reason: collision with root package name */
    public static final e3 f27444c;

    /* renamed from: a, reason: collision with root package name */
    public final long f27445a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27446b;

    static {
        e3 e3Var = new e3(0L, 0L);
        new e3(Long.MAX_VALUE, Long.MAX_VALUE);
        new e3(Long.MAX_VALUE, 0L);
        new e3(0L, Long.MAX_VALUE);
        f27444c = e3Var;
    }

    public e3(long j10, long j11) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 >= 0);
        com.google.android.exoplayer2.util.a.checkArgument(j11 >= 0);
        this.f27445a = j10;
        this.f27446b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e3.class == obj.getClass()) {
            e3 e3Var = (e3) obj;
            if (this.f27445a == e3Var.f27445a && this.f27446b == e3Var.f27446b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f27445a) * 31) + ((int) this.f27446b);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long resolveSeekPositionUs(long r9, long r11, long r13) {
        /*
            r8 = this;
            long r2 = r8.f27445a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.f27446b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r9 = com.google.android.exoplayer2.util.n1.subtractWithOverflowDefault(r0, r2, r4)
            long r2 = r8.f27446b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = com.google.android.exoplayer2.util.n1.addWithOverflowDefault(r0, r2, r4)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 > 0) goto L2d
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L2d
            r4 = r6
            goto L2e
        L2d:
            r4 = r5
        L2e:
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 > 0) goto L37
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L37
            r5 = r6
        L37:
            if (r4 == 0) goto L4c
            if (r5 == 0) goto L4c
            long r9 = r11 - r0
            long r9 = java.lang.Math.abs(r9)
            long r0 = r13 - r0
            long r0 = java.lang.Math.abs(r0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L51
            goto L4e
        L4c:
            if (r4 == 0) goto L4f
        L4e:
            return r11
        L4f:
            if (r5 == 0) goto L52
        L51:
            return r13
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.e3.resolveSeekPositionUs(long, long, long):long");
    }
}
