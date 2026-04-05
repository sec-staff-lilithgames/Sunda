package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f15055c;

    public /* synthetic */ pa(z1 z1Var, int i10) {
        this.f15054b = i10;
        this.f15055c = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15054b) {
            case 0:
                this.f15055c.H();
                break;
            case 1:
                this.f15055c.I();
                break;
            case 2:
                this.f15055c.O();
                break;
            case 3:
                this.f15055c.K();
                break;
            case 4:
                this.f15055c.J();
                break;
            case 5:
                this.f15055c.G();
                break;
            default:
                this.f15055c.M();
                break;
        }
    }
}
