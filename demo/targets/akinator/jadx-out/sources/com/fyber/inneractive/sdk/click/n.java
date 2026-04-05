package com.fyber.inneractive.sdk.click;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f23191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f23192b;

    public n(r rVar, b bVar) {
        this.f23192b = rVar;
        this.f23191a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f23192b.f23196d;
        if (oVar != null) {
            oVar.a(this.f23191a);
        }
    }
}
