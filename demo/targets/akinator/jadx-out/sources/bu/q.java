package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final p f10822b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10823c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.i0 f10824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10825f;

    public q(p pVar, int i10, mt.i0 i0Var) {
        this.f10822b = pVar;
        this.f10823c = i10;
        this.f10824e = i0Var;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        boolean z10 = this.f10825f;
        mt.i0 i0Var = this.f10824e;
        if (z10) {
            i0Var.onComplete();
        } else if (this.f10822b.win(this.f10823c)) {
            this.f10825f = true;
            i0Var.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f10825f;
        mt.i0 i0Var = this.f10824e;
        if (z10) {
            i0Var.onError(th2);
        } else if (!this.f10822b.win(this.f10823c)) {
            mu.a.onError(th2);
        } else {
            this.f10825f = true;
            i0Var.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        boolean z10 = this.f10825f;
        mt.i0 i0Var = this.f10824e;
        if (z10) {
            i0Var.onNext(obj);
        } else if (!this.f10822b.win(this.f10823c)) {
            ((pt.c) get()).dispose();
        } else {
            this.f10825f = true;
            i0Var.onNext(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
