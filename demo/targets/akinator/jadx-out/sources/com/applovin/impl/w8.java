package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f16156c;

    public /* synthetic */ w8(d1 d1Var, int i10) {
        this.f16155b = i10;
        this.f16156c = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16155b) {
            case 0:
                this.f16156c.e();
                break;
            case 1:
                this.f16156c.j();
                break;
            default:
                this.f16156c.i();
                break;
        }
    }
}
