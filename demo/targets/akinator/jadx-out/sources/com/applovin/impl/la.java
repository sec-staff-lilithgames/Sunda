package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f14403c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14404e;

    public /* synthetic */ la(v1 v1Var, String str, int i10) {
        this.f14402b = i10;
        this.f14403c = v1Var;
        this.f14404e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14402b) {
            case 0:
                this.f14403c.b(this.f14404e);
                break;
            default:
                this.f14403c.c(this.f14404e);
                break;
        }
    }
}
