package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2696b4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32675b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32676c;

    public C2696b4(int i10, float f10, int i11) {
        this.f32674a = i10;
        this.f32675b = i11;
        this.f32676c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2696b4)) {
            return false;
        }
        C2696b4 c2696b4 = (C2696b4) obj;
        return this.f32674a == c2696b4.f32674a && this.f32675b == c2696b4.f32675b && Float.compare(this.f32676c, c2696b4.f32676c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32676c) + e3.g.d(this.f32675b, Integer.hashCode(this.f32674a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayProperties(width=");
        sb2.append(this.f32674a);
        sb2.append(", height=");
        sb2.append(this.f32675b);
        sb2.append(", density=");
        return a.b.n(sb2, this.f32676c, ')');
    }
}
