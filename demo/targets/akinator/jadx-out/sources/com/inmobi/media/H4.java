package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f31835a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31837c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31838d;

    public H4(float f10, float f11, int i10, int i11) {
        this.f31835a = f10;
        this.f31836b = f11;
        this.f31837c = i10;
        this.f31838d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H4)) {
            return false;
        }
        H4 h42 = (H4) obj;
        return Float.compare(this.f31835a, h42.f31835a) == 0 && Float.compare(this.f31836b, h42.f31836b) == 0 && this.f31837c == h42.f31837c && this.f31838d == h42.f31838d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31838d) + e3.g.d(this.f31837c, b0.e2.b(this.f31836b, Float.hashCode(this.f31835a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExposureRectangle(x=");
        sb2.append(this.f31835a);
        sb2.append(", y=");
        sb2.append(this.f31836b);
        sb2.append(", width=");
        sb2.append(this.f31837c);
        sb2.append(", height=");
        return e3.g.m(sb2, this.f31838d, ')');
    }
}
