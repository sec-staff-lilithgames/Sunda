package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.o2;
import com.applovin.impl.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p4 extends o2 {

    /* renamed from: n, reason: collision with root package name */
    private final p0.a f15037n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f15038o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f15039p;

    public p4(p0.a aVar, boolean z10, Context context) {
        super(o2.c.RIGHT_DETAIL);
        this.f15037n = aVar;
        this.f15038o = context;
        this.f14906c = new SpannedString(aVar.a());
        this.f15039p = z10;
    }

    @Override // com.applovin.impl.o2
    public SpannedString f() {
        return new SpannedString(this.f15037n.a(this.f15038o));
    }

    @Override // com.applovin.impl.o2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.o2
    public boolean p() {
        Boolean boolB = this.f15037n.b(this.f15038o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f15039p));
        }
        return false;
    }
}
