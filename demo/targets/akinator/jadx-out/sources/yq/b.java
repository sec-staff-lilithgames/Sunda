package yq;

import cr.q;
import dq.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f94790b;

    public b(e eVar) {
        this.f94790b = eVar;
    }

    @Override // dq.c0, ir.k
    public void onRun() {
        d dVar;
        e eVar = this.f94790b;
        boolean z10 = !eVar.c() || eVar.isShown();
        if (z10) {
            eVar.f94800h.j();
        } else {
            eVar.f94800h.i();
        }
        long jB = eVar.f94800h.b();
        long jC = eVar.f94800h.c();
        if (z10) {
            eVar.a((jC * 100.0f) / jB, (int) Math.ceil((jB - jC) / 1000.0d));
        }
        if (!eVar.f94800h.e()) {
            q.onUiThread(this, 16L);
        } else if (eVar.f94801i.compareAndSet(false, true) && (dVar = eVar.f94802j) != null) {
            dVar.a();
        }
    }

    @Override // dq.c0, ir.k
    public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
        super.onThrows(th2);
    }

    @Override // dq.c0, ir.k, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
