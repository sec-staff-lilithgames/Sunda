package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f15766c;

    public /* synthetic */ t9(m3 m3Var, int i10) {
        this.f15765b = i10;
        this.f15766c = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15765b) {
            case 0:
                this.f15766c.h();
                break;
            default:
                this.f15766c.d();
                break;
        }
    }
}
