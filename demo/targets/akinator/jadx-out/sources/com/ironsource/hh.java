package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class hh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Da f36876c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3375o7 f36877e;

    public /* synthetic */ hh(Da da2, InterfaceC3375o7 interfaceC3375o7, int i10) {
        this.f36875b = i10;
        this.f36876c = da2;
        this.f36877e = interfaceC3375o7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36875b) {
            case 0:
                Da.b(this.f36876c, this.f36877e);
                break;
            default:
                Da.a(this.f36876c, this.f36877e);
                break;
        }
    }
}
