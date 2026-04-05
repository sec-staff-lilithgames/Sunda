package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Nc {

    /* renamed from: a, reason: collision with root package name */
    public final int f32078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32079b;

    public Nc(int i10, int i11) {
        this.f32078a = i10;
        this.f32079b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nc)) {
            return false;
        }
        Nc nc2 = (Nc) obj;
        return this.f32078a == nc2.f32078a && this.f32079b == nc2.f32079b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + e3.g.d(this.f32079b, Integer.hashCode(this.f32078a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryPolicy(maxNoOfRetries=");
        sb2.append(this.f32078a);
        sb2.append(", delayInMillis=");
        return a.b.f(this.f32079b, ", delayFactor=1.0)", sb2);
    }
}
