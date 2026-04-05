package io.odeeo.internal.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f63012c;

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f63013d;

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f63014e;

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f63015f;

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f63016g;

    /* renamed from: a, reason: collision with root package name */
    public final long f63017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f63018b;

    static {
        t0 t0Var = new t0(0L, 0L);
        f63012c = t0Var;
        f63013d = new t0(Long.MAX_VALUE, Long.MAX_VALUE);
        f63014e = new t0(Long.MAX_VALUE, 0L);
        f63015f = new t0(0L, Long.MAX_VALUE);
        f63016g = t0Var;
    }

    public t0(long j10, long j11) {
        io.odeeo.internal.q0.a.checkArgument(j10 >= 0);
        io.odeeo.internal.q0.a.checkArgument(j11 >= 0);
        this.f63017a = j10;
        this.f63018b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.f63017a == t0Var.f63017a && this.f63018b == t0Var.f63018b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f63017a) * 31) + ((int) this.f63018b);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long resolveSeekPositionUs(long r9, long r11, long r13) {
        /*
            r8 = this;
            long r2 = r8.f63017a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.f63018b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r9 = io.odeeo.internal.q0.g0.subtractWithOverflowDefault(r0, r2, r4)
            long r2 = r8.f63018b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = io.odeeo.internal.q0.g0.addWithOverflowDefault(r0, r2, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.b.t0.resolveSeekPositionUs(long, long, long):long");
    }
}
