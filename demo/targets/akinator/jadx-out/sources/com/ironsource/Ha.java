package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ha {

    /* renamed from: a, reason: collision with root package name */
    private final long f34580a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34581b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34582c;

    public Ha(long j10, long j11, boolean z10) {
        this.f34580a = j10;
        this.f34581b = j11;
        this.f34582c = z10;
    }

    public final long a() {
        return this.f34580a;
    }

    public final long b() {
        return this.f34581b;
    }

    public final boolean c() {
        return this.f34582c;
    }

    public final long d() {
        return this.f34580a;
    }

    public final long e() {
        return this.f34581b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ha)) {
            return false;
        }
        Ha ha2 = (Ha) obj;
        return this.f34580a == ha2.f34580a && this.f34581b == ha2.f34581b && this.f34582c == ha2.f34582c;
    }

    public final boolean f() {
        return this.f34582c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD = p0.o2.d(Long.hashCode(this.f34580a) * 31, 31, this.f34581b);
        boolean z10 = this.f34582c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iD + i10;
    }

    public String toString() {
        long j10 = this.f34580a;
        long j11 = this.f34581b;
        boolean z10 = this.f34582c;
        StringBuilder sbR = b0.e2.r(j10, "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=", ", visibilityCheckerInterval=");
        sbR.append(j11);
        sbR.append(", isAutoRefreshEnabled=");
        sbR.append(z10);
        sbR.append(")");
        return sbR.toString();
    }

    public final Ha a(long j10, long j11, boolean z10) {
        return new Ha(j10, j11, z10);
    }

    public static /* synthetic */ Ha a(Ha ha2, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = ha2.f34580a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = ha2.f34581b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z10 = ha2.f34582c;
        }
        return ha2.a(j12, j13, z10);
    }
}
