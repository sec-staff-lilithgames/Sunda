package jm;

import tm.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f69687b;

    public h(i iVar) {
        this.f69687b = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            i iVar = this.f69687b;
            q qVar = iVar.f69689b;
            if (qVar != null) {
                qVar.destroy();
                iVar.f69689b = null;
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
