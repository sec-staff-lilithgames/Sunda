package com.ironsource;

import com.ironsource.Ae;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class eh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3432re f36622c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3364ne f36623e;

    public /* synthetic */ eh(InterfaceC3432re interfaceC3432re, C3364ne c3364ne, int i10) {
        this.f36621b = i10;
        this.f36622c = interfaceC3432re;
        this.f36623e = c3364ne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36621b) {
            case 0:
                Ae.a.a(this.f36622c, this.f36623e);
                break;
            default:
                C3568ze.b(this.f36622c, this.f36623e);
                break;
        }
    }
}
