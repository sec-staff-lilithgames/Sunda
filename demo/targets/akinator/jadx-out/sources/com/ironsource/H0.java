package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f34546a;

    public H0(long j10) {
        this.f34546a = j10;
    }

    public final long a() {
        return this.f34546a;
    }

    public final long b() {
        return this.f34546a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H0) && this.f34546a == ((H0) obj).f34546a;
    }

    public int hashCode() {
        return Long.hashCode(this.f34546a);
    }

    public String toString() {
        return p0.o2.n(this.f34546a, "AdUnitInteractionData(impressionTimeout=", ")");
    }

    public final H0 a(long j10) {
        return new H0(j10);
    }

    public static /* synthetic */ H0 a(H0 h02, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = h02.f34546a;
        }
        return h02.a(j10);
    }
}
