package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ai implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3341mb f36010c;

    public /* synthetic */ ai(C3341mb c3341mb, int i10) {
        this.f36009b = i10;
        this.f36010c = c3341mb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36009b) {
            case 0:
                C3341mb.a(this.f36010c);
                break;
            default:
                C3341mb.b(this.f36010c);
                break;
        }
    }
}
