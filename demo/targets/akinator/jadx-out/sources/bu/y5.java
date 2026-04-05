package bu;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y5 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f11245b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11246c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11247e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11248f;

    public y5(mt.q0 q0Var, Object obj) {
        this.f11245b = q0Var;
        this.f11246c = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f11247e.dispose();
        this.f11247e = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11247e == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11247e = tt.d.f87352b;
        Object obj = this.f11248f;
        mt.q0 q0Var = this.f11245b;
        if (obj != null) {
            this.f11248f = null;
            q0Var.onSuccess(obj);
            return;
        }
        Object obj2 = this.f11246c;
        if (obj2 != null) {
            q0Var.onSuccess(obj2);
        } else {
            q0Var.onError(new NoSuchElementException());
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11247e = tt.d.f87352b;
        this.f11248f = null;
        this.f11245b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11248f = obj;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11247e, cVar)) {
            this.f11247e = cVar;
            this.f11245b.onSubscribe(this);
        }
    }
}
