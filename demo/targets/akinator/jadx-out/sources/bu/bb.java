package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class bb extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cb f10130b;

    public bb(cb cbVar) {
        this.f10130b = cbVar;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        cb cbVar = this.f10130b;
        tt.d.dispose(cbVar.f10183c);
        iu.n.onComplete(cbVar.f10182b, cbVar, cbVar.f10185f);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        cb cbVar = this.f10130b;
        tt.d.dispose(cbVar.f10183c);
        iu.n.onError(cbVar.f10182b, th2, cbVar, cbVar.f10185f);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        tt.d.dispose(this);
        cb cbVar = this.f10130b;
        tt.d.dispose(cbVar.f10183c);
        iu.n.onComplete(cbVar.f10182b, cbVar, cbVar.f10185f);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
