package com.moloco.sdk.acm.db;

import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f45533c;

    public /* synthetic */ f(g gVar, int i10) {
        this.f45532b = i10;
        this.f45533c = gVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f45532b) {
            case 0:
                return this.f45533c.e((zu.d) obj);
            default:
                return this.f45533c.f((zu.d) obj);
        }
    }
}
