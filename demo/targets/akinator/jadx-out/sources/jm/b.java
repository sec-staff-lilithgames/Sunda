package jm;

import tm.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f69673b;

    public b(c cVar) {
        this.f69673b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            c cVar = this.f69673b;
            l0 l0Var = cVar.f69675b;
            if (l0Var != null) {
                l0Var.destroy();
                cVar.f69675b = null;
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
