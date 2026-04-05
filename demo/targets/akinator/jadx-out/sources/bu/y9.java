package bu;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y9 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f11257b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11258c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11259e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11260f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11261g;

    public y9(mt.q0 q0Var, Object obj) {
        this.f11257b = q0Var;
        this.f11258c = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f11259e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11259e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11261g) {
            return;
        }
        this.f11261g = true;
        Object obj = this.f11260f;
        this.f11260f = null;
        if (obj == null) {
            obj = this.f11258c;
        }
        mt.q0 q0Var = this.f11257b;
        if (obj != null) {
            q0Var.onSuccess(obj);
        } else {
            q0Var.onError(new NoSuchElementException());
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11261g) {
            mu.a.onError(th2);
        } else {
            this.f11261g = true;
            this.f11257b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11261g) {
            return;
        }
        if (this.f11260f == null) {
            this.f11260f = obj;
            return;
        }
        this.f11261g = true;
        this.f11259e.dispose();
        this.f11257b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11259e, cVar)) {
            this.f11259e = cVar;
            this.f11257b.onSubscribe(this);
        }
    }
}
