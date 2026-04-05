package com.applovin.impl.mediation.ads;

import com.applovin.impl.y2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f14601c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2 f14602e;

    public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, y2 y2Var, int i10) {
        this.f14600b = i10;
        this.f14601c = maxAdViewImpl;
        this.f14602e = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14600b) {
            case 0:
                this.f14601c.a(this.f14602e);
                break;
            default:
                this.f14601c.b(this.f14602e);
                break;
        }
    }
}
