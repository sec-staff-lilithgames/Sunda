package com.pgl.ssdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f50478a;

    /* renamed from: b, reason: collision with root package name */
    private final B f50479b;

    public o(A a10, B b10) {
        this.f50478a = a10;
        this.f50479b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public B b() {
        return this.f50479b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f50478a;
        if (a10 == null) {
            if (oVar.f50478a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f50478a)) {
            return false;
        }
        B b10 = this.f50479b;
        if (b10 == null) {
            if (oVar.f50479b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f50479b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f50478a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f50479b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public A a() {
        return this.f50478a;
    }
}
