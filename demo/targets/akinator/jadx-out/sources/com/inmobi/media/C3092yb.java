package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.yb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3092yb {

    /* renamed from: a, reason: collision with root package name */
    public int f33608a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f33609b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3092yb)) {
            return false;
        }
        C3092yb c3092yb = (C3092yb) obj;
        return this.f33608a == c3092yb.f33608a && this.f33609b == c3092yb.f33609b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33609b) + (Integer.hashCode(this.f33608a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PurchaseData(noOfInAppPurchases=");
        sb2.append(this.f33608a);
        sb2.append(", noOfSubscriptions=");
        return e3.g.m(sb2, this.f33609b, ')');
    }
}
