package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final f f8035b;

    public e(f fVar) {
        this.f8035b = fVar;
    }

    @Override // mt.f
    public void onComplete() {
        f fVar = this.f8035b;
        fVar.f8045k = false;
        fVar.a();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        f fVar = this.f8035b;
        if (!fVar.f8040f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (fVar.f8039e != iu.k.f68411b) {
            fVar.f8045k = false;
            fVar.a();
            return;
        }
        fVar.f8044j.cancel();
        Throwable thTerminate = fVar.f8040f.terminate();
        if (thTerminate != iu.m.f68415a) {
            fVar.f8037b.onError(thTerminate);
        }
        if (fVar.getAndIncrement() == 0) {
            fVar.f8043i.clear();
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
