package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class yh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3167cg f39300c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3236gd f39301e;

    public /* synthetic */ yh(C3167cg c3167cg, AbstractC3236gd abstractC3236gd, int i10) {
        this.f39299b = i10;
        this.f39300c = c3167cg;
        this.f39301e = abstractC3236gd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39299b) {
            case 0:
                C3167cg.a(this.f39300c, this.f39301e);
                break;
            default:
                C3167cg.b(this.f39300c, this.f39301e);
                break;
        }
    }
}
