package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f14221c;

    public /* synthetic */ ja(v1 v1Var, int i10) {
        this.f14220b = i10;
        this.f14221c = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14220b) {
            case 0:
                this.f14221c.i();
                break;
            default:
                this.f14221c.j();
                break;
        }
    }
}
