package com.applovin.impl.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f15707c;

    public /* synthetic */ x(int i10, k kVar) {
        this.f15706b = i10;
        this.f15707c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15706b) {
            case 0:
                this.f15707c.J0();
                break;
            case 1:
                this.f15707c.K0();
                break;
            case 2:
                this.f15707c.L0();
                break;
            default:
                this.f15707c.M0();
                break;
        }
    }
}
