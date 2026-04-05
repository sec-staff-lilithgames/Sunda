package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i4 f14152c;

    public /* synthetic */ i9(i4 i4Var, int i10) {
        this.f14151b = i10;
        this.f14152c = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14151b) {
            case 0:
                this.f14152c.s();
                break;
            case 1:
                this.f14152c.u();
                break;
            case 2:
                this.f14152c.q();
                break;
            case 3:
                this.f14152c.r();
                break;
            case 4:
                this.f14152c.o();
                break;
            case 5:
                this.f14152c.l();
                break;
            case 6:
                this.f14152c.m();
                break;
            case 7:
                this.f14152c.k();
                break;
            case 8:
                this.f14152c.t();
                break;
            case 9:
                this.f14152c.n();
                break;
            default:
                this.f14152c.p();
                break;
        }
    }
}
