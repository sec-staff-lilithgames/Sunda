package com.applovin.impl.mediation.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f14604c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14605e;

    public /* synthetic */ e(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i10) {
        this.f14603b = i10;
        this.f14604c = maxFullscreenAdImpl;
        this.f14605e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14603b) {
            case 0:
                this.f14604c.c(this.f14605e);
                break;
            case 1:
                this.f14604c.a(this.f14605e);
                break;
            default:
                this.f14604c.b(this.f14605e);
                break;
        }
    }
}
