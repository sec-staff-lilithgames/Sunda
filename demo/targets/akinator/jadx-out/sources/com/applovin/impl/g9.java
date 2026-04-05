package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f14018c;

    public /* synthetic */ g9(h0 h0Var, int i10) {
        this.f14017b = i10;
        this.f14018c = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14017b) {
            case 0:
                this.f14018c.e();
                break;
            case 1:
                this.f14018c.f();
                break;
            case 2:
                this.f14018c.a();
                break;
            default:
                this.f14018c.d();
                break;
        }
    }
}
