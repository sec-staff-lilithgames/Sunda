package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ge {

    /* renamed from: a, reason: collision with root package name */
    public final long f31828a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31829b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31830c;

    public Ge(long j10, long j11, long j12) {
        this.f31828a = j10;
        this.f31829b = j11;
        this.f31830c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ge)) {
            return false;
        }
        Ge ge2 = (Ge) obj;
        return this.f31828a == ge2.f31828a && this.f31829b == ge2.f31829b && this.f31830c == ge2.f31830c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31830c) + p0.o2.d(Long.hashCode(this.f31828a) * 31, 31, this.f31829b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeoutConfig(connectTimeoutInSec=");
        sb2.append(this.f31828a);
        sb2.append(", readTimeoutInSec=");
        sb2.append(this.f31829b);
        sb2.append(", callTimeoutInSec=");
        return e3.g.n(sb2, this.f31830c, ')');
    }
}
