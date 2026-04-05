package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52792b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52793c;

    public n(mt.q0 q0Var, mt.t0 t0Var) {
        this.f52792b = q0Var;
        this.f52793c = t0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        this.f52793c.subscribe(new wt.v(this, this.f52792b));
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f52792b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f52792b.onSubscribe(this);
        }
    }
}
