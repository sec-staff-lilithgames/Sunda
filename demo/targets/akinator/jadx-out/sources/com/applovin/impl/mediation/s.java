package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.b f14820c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f14821e;

    public /* synthetic */ s(h.b bVar, Bundle bundle, int i10) {
        this.f14819b = i10;
        this.f14820c = bVar;
        this.f14821e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14819b) {
            case 0:
                this.f14820c.j(this.f14821e);
                break;
            case 1:
                this.f14820c.e(this.f14821e);
                break;
            case 2:
                this.f14820c.i(this.f14821e);
                break;
            case 3:
                this.f14820c.a(this.f14821e);
                break;
            case 4:
                this.f14820c.f(this.f14821e);
                break;
            case 5:
                this.f14820c.g(this.f14821e);
                break;
            case 6:
                this.f14820c.h(this.f14821e);
                break;
            case 7:
                this.f14820c.d(this.f14821e);
                break;
            case 8:
                this.f14820c.c(this.f14821e);
                break;
            default:
                this.f14820c.b(this.f14821e);
                break;
        }
    }
}
