package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13998a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f13999b;

    public g3(String str, MaxAdFormat maxAdFormat) {
        this.f13998a = str;
        this.f13999b = maxAdFormat;
    }

    public boolean a(Object obj) {
        return obj instanceof g3;
    }

    public String b() {
        return this.f13998a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        if (!g3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = g3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = g3Var.a();
        return maxAdFormatA != null ? maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 == null;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        return ((iHashCode + 59) * 59) + (maxAdFormatA != null ? maxAdFormatA.hashCode() : 43);
    }

    public String toString() {
        return this.f13998a + "-" + this.f13999b.getLabel();
    }

    public MaxAdFormat a() {
        return this.f13999b;
    }

    public static g3 a(String str) {
        String[] strArrSplit = str.split("-");
        return new g3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }
}
