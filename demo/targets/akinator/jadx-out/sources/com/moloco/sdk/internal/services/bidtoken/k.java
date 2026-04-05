package com.moloco.sdk.internal.services.bidtoken;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f46854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46855b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46856c;

    public k(long j10, int i10, long j11) {
        this.f46854a = j10;
        this.f46855b = i10;
        this.f46856c = j11;
    }

    public final long a() {
        return this.f46854a;
    }

    public final int b() {
        return this.f46855b;
    }

    public final long c() {
        return this.f46856c;
    }

    public final long d() {
        return this.f46856c;
    }

    public final int e() {
        return this.f46855b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f46854a == kVar.f46854a && this.f46855b == kVar.f46855b && this.f46856c == kVar.f46856c;
    }

    public final long f() {
        return this.f46854a;
    }

    public int hashCode() {
        return Long.hashCode(this.f46856c) + e3.g.d(this.f46855b, Long.hashCode(this.f46854a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BidTokenHttpRequestInfo(requestTimeoutMillis=");
        sb2.append(this.f46854a);
        sb2.append(", fetchRetryMax=");
        sb2.append(this.f46855b);
        sb2.append(", fetchRetryDelayMillis=");
        return e3.g.n(sb2, this.f46856c, ')');
    }

    public final k a(long j10, int i10, long j11) {
        return new k(j10, i10, j11);
    }

    public static /* synthetic */ k a(k kVar, long j10, int i10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = kVar.f46854a;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            i10 = kVar.f46855b;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            j11 = kVar.f46856c;
        }
        return kVar.a(j12, i12, j11);
    }
}
