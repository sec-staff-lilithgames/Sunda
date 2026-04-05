package io.odeeo.internal.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f67345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67347c;

    public a(int i10, int i11, int i12) {
        this.f67345a = i10;
        this.f67346b = i11;
        this.f67347c = i12;
    }

    public static /* synthetic */ a copy$default(a aVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = aVar.f67345a;
        }
        if ((i13 & 2) != 0) {
            i11 = aVar.f67346b;
        }
        if ((i13 & 4) != 0) {
            i12 = aVar.f67347c;
        }
        return aVar.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.f67345a;
    }

    public final int component2() {
        return this.f67346b;
    }

    public final int component3() {
        return this.f67347c;
    }

    public final a copy(int i10, int i11, int i12) {
        return new a(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67345a == aVar.f67345a && this.f67346b == aVar.f67346b && this.f67347c == aVar.f67347c;
    }

    public final int getLength() {
        return this.f67345a;
    }

    public final int getSpace() {
        return this.f67346b;
    }

    public final int getWidth() {
        return this.f67347c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f67347c) + e3.g.d(this.f67346b, Integer.hashCode(this.f67345a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioOnlyVisualizerSize(length=");
        sb2.append(this.f67345a);
        sb2.append(", space=");
        sb2.append(this.f67346b);
        sb2.append(", width=");
        return e3.g.m(sb2, this.f67347c, ')');
    }
}
