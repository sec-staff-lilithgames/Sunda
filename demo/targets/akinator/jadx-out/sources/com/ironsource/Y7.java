package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35784a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35785b;

    public Y7(int i10, int i11) {
        this.f35784a = i10;
        this.f35785b = i11;
    }

    public final int a() {
        return this.f35784a;
    }

    public final int b() {
        return this.f35785b;
    }

    public final int c() {
        return this.f35785b;
    }

    public final int d() {
        return this.f35784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y72 = (Y7) obj;
        return this.f35784a == y72.f35784a && this.f35785b == y72.f35785b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f35785b) + (Integer.hashCode(this.f35784a) * 31);
    }

    public String toString() {
        return p0.o2.i(this.f35784a, this.f35785b, "ISContainerParams(width=", ", height=", ")");
    }

    public final Y7 a(int i10, int i11) {
        return new Y7(i10, i11);
    }

    public static /* synthetic */ Y7 a(Y7 y72, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = y72.f35784a;
        }
        if ((i12 & 2) != 0) {
            i11 = y72.f35785b;
        }
        return y72.a(i10, i11);
    }
}
