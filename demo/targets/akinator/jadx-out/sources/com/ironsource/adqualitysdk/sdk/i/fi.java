package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class fi<T> extends ee {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private T f2233;

    public fi(T t10, Cdo cdo) {
        super(cdo);
        this.f2233 = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t10 = this.f2233;
            T t11 = ((fi) obj).f2233;
            if (t10 != null) {
                return t10.equals(t11);
            }
            if (t11 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f2233;
        if (t10 != null) {
            return t10.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2233);
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        return new du(this.f2233);
    }
}
