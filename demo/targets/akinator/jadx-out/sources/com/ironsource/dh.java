package com.ironsource;

import com.ironsource.Ae;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class dh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3326le f36310c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3432re f36311e;

    public /* synthetic */ dh(C3326le c3326le, InterfaceC3432re interfaceC3432re) {
        this.f36309b = 1;
        this.f36310c = c3326le;
        this.f36311e = interfaceC3432re;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36309b) {
            case 0:
                Ae.a(this.f36311e, this.f36310c);
                break;
            case 1:
                Ae.a.a(this.f36310c, this.f36311e);
                break;
            default:
                C3568ze.b(this.f36311e, this.f36310c);
                break;
        }
    }

    public /* synthetic */ dh(InterfaceC3432re interfaceC3432re, C3326le c3326le, int i10) {
        this.f36309b = i10;
        this.f36311e = interfaceC3432re;
        this.f36310c = c3326le;
    }
}
