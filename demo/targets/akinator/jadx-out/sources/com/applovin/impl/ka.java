package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.adview.g f14263c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f14264e;

    public /* synthetic */ ka(com.applovin.impl.adview.g gVar, Runnable runnable, int i10) {
        this.f14262b = i10;
        this.f14263c = gVar;
        this.f14264e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14262b) {
            case 0:
                v1.c(this.f14263c, this.f14264e);
                break;
            case 1:
                v1.b(this.f14263c, this.f14264e);
                break;
            default:
                v1.a(this.f14263c, this.f14264e);
                break;
        }
    }
}
