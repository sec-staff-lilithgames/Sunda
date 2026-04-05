package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52809b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52810c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52811e;

    public p(mt.q0 q0Var, mt.t0 t0Var) {
        this.f52809b = q0Var;
        this.f52810c = t0Var;
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
        if (this.f52811e) {
            return;
        }
        this.f52811e = true;
        this.f52810c.subscribe(new wt.v(this, this.f52809b));
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f52811e) {
            mu.a.onError(th2);
        } else {
            this.f52811e = true;
            this.f52809b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        ((pt.c) get()).dispose();
        onComplete();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.set(this, cVar)) {
            this.f52809b.onSubscribe(this);
        }
    }
}
