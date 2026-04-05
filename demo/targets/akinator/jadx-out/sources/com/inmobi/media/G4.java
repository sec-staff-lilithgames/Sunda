package com.inmobi.media;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f31813a;

    /* renamed from: b, reason: collision with root package name */
    public final H4 f31814b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31815c;

    public G4(float f10, H4 h42, ArrayList arrayList) {
        this.f31813a = f10;
        this.f31814b = h42;
        this.f31815c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G4)) {
            return false;
        }
        G4 g42 = (G4) obj;
        return Float.compare(this.f31813a, g42.f31813a) == 0 && kotlin.jvm.internal.e0.areEqual(this.f31814b, g42.f31814b) && kotlin.jvm.internal.e0.areEqual(this.f31815c, g42.f31815c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f31813a) * 31;
        H4 h42 = this.f31814b;
        int iHashCode2 = (iHashCode + (h42 == null ? 0 : h42.hashCode())) * 31;
        ArrayList arrayList = this.f31815c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f31813a + ", visibleRectangle=" + this.f31814b + ", occlusionRectangles=" + this.f31815c + ')';
    }
}
