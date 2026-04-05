package com.applovin.impl.mediation.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f14599c;

    public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, int i10) {
        this.f14598b = i10;
        this.f14599c = maxAdViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14598b) {
            case 0:
                this.f14599c.g();
                break;
            default:
                this.f14599c.c();
                break;
        }
    }
}
