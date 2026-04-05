package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f8013b;

    public b0(c0 c0Var) {
        this.f8013b = c0Var;
    }

    @Override // mt.f
    public void onComplete() {
        c0 c0Var = this.f8013b;
        c0Var.f8026k = false;
        c0Var.a();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        c0 c0Var = this.f8013b;
        if (!c0Var.f8021f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (c0Var.f8020e != iu.k.f68411b) {
            c0Var.f8026k = false;
            c0Var.a();
            return;
        }
        c0Var.f8028m = true;
        c0Var.f8025j.dispose();
        Throwable thTerminate = c0Var.f8021f.terminate();
        if (thTerminate != iu.m.f68415a) {
            c0Var.f8018b.onError(thTerminate);
        }
        if (c0Var.getAndIncrement() == 0) {
            c0Var.f8024i.clear();
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
