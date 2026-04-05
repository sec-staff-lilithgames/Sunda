package com.inmobi.media;

import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f31641a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f31642b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f31643c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f31644d;

    public B(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f31641a = rectF;
        this.f31642b = rectF2;
        this.f31643c = rectF3;
        this.f31644d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f31641a, b10.f31641a) && kotlin.jvm.internal.e0.areEqual(this.f31642b, b10.f31642b) && kotlin.jvm.internal.e0.areEqual(this.f31643c, b10.f31643c) && kotlin.jvm.internal.e0.areEqual(this.f31644d, b10.f31644d);
    }

    public final int hashCode() {
        RectF rectF = this.f31641a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f31642b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f31643c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.f31644d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f31641a + ", topRight=" + this.f31642b + ", bottomLeft=" + this.f31643c + ", bottomRight=" + this.f31644d + ')';
    }
}
