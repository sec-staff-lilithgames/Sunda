package com.applovin.impl.mediation;

import com.applovin.impl.mediation.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14827c;

    public /* synthetic */ u(Object obj, int i10) {
        this.f14826b = i10;
        this.f14827c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14826b) {
            case 0:
                ((h.b) this.f14827c).a();
                break;
            default:
                ((h) this.f14827c).l();
                break;
        }
    }
}
