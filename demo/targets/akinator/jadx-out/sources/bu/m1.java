package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1 extends AtomicReference implements mt.i0, mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10634b;

    /* renamed from: c, reason: collision with root package name */
    public mt.t0 f10635c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10636e;

    public m1(mt.i0 i0Var, mt.t0 t0Var) {
        this.f10634b = i0Var;
        this.f10635c = t0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10636e = true;
        tt.d.replace(this, null);
        mt.t0 t0Var = this.f10635c;
        this.f10635c = null;
        t0Var.subscribe(this);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10634b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10634b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (!tt.d.setOnce(this, cVar) || this.f10636e) {
            return;
        }
        this.f10634b.onSubscribe(this);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.i0 i0Var = this.f10634b;
        i0Var.onNext(obj);
        i0Var.onComplete();
    }
}
