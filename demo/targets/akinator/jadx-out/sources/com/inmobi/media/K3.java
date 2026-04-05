package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f31940a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31941b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31942c;

    public K3(long j10, long j11, long j12) {
        this.f31940a = j10;
        this.f31941b = j11;
        this.f31942c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K3)) {
            return false;
        }
        K3 k32 = (K3) obj;
        return this.f31940a == k32.f31940a && this.f31941b == k32.f31941b && this.f31942c == k32.f31942c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31942c) + p0.o2.d(Long.hashCode(this.f31940a) * 31, 31, this.f31941b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceMemoryInfo(maxHeapSize=");
        sb2.append(this.f31940a);
        sb2.append(", freeHeapSize=");
        sb2.append(this.f31941b);
        sb2.append(", currentHeapSize=");
        return e3.g.n(sb2, this.f31942c, ')');
    }
}
