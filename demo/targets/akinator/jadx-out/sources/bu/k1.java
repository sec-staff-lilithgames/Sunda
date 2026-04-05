package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k1 extends AtomicReference implements mt.i0, mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10491b;

    /* renamed from: c, reason: collision with root package name */
    public mt.y f10492c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10493e;

    public k1(mt.i0 i0Var, mt.y yVar) {
        this.f10491b = i0Var;
        this.f10492c = yVar;
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
        if (this.f10493e) {
            this.f10491b.onComplete();
            return;
        }
        this.f10493e = true;
        tt.d.replace(this, null);
        mt.y yVar = this.f10492c;
        this.f10492c = null;
        yVar.subscribe(this);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10491b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10491b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (!tt.d.setOnce(this, cVar) || this.f10493e) {
            return;
        }
        this.f10491b.onSubscribe(this);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.i0 i0Var = this.f10491b;
        i0Var.onNext(obj);
        i0Var.onComplete();
    }
}
