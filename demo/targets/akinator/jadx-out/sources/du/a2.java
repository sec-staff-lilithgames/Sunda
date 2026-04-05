package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a2 extends AtomicReference implements mt.q0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52665b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f52666c;

    /* renamed from: e, reason: collision with root package name */
    public Object f52667e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f52668f;

    public a2(mt.q0 q0Var, mt.m0 m0Var) {
        this.f52665b = q0Var;
        this.f52666c = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52668f = th2;
        tt.d.replace(this, this.f52666c.scheduleDirect(this));
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f52665b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52667e = obj;
        tt.d.replace(this, this.f52666c.scheduleDirect(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2 = this.f52668f;
        mt.q0 q0Var = this.f52665b;
        if (th2 != null) {
            q0Var.onError(th2);
        } else {
            q0Var.onSuccess(this.f52667e);
        }
    }
}
