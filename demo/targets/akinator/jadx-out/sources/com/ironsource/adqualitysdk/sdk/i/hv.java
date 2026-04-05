package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hv {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<List<Field>> f2579;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private int f2580;

    public hv() {
        ArrayList arrayList = new ArrayList();
        this.f2579 = arrayList;
        int i10 = (-1) + 1;
        this.f2580 = i10;
        arrayList.add(i10, new ArrayList());
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<List<Field>> m2674() {
        return this.f2579;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2675(Field field) {
        this.f2579.get(this.f2580).remove(field);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2677(Field field) {
        this.f2579.get(this.f2580).add(field);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m2678() {
        int i10 = this.f2580 + 1;
        this.f2580 = i10;
        this.f2579.add(i10, new ArrayList());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2676() {
        this.f2579.remove(this.f2580);
        this.f2580--;
    }
}
