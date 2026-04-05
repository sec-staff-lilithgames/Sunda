package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class xh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3167cg f39244c;

    public /* synthetic */ xh(C3167cg c3167cg, int i10) {
        this.f39243b = i10;
        this.f39244c = c3167cg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39243b) {
            case 0:
                C3167cg.a(this.f39244c);
                break;
            default:
                C3167cg.b(this.f39244c);
                break;
        }
    }
}
