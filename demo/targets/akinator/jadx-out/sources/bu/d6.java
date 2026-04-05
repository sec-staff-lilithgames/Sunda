package bu;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d6 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10209b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10210c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10211e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f10212f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f10213g;

    public d6(mt.i0 i0Var, st.o oVar, st.o oVar2, Callable callable) {
        this.f10209b = i0Var;
        this.f10210c = oVar;
        this.f10211e = oVar2;
        this.f10212f = callable;
    }

    @Override // pt.c
    public void dispose() {
        this.f10213g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10213g.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        mt.i0 i0Var = this.f10209b;
        try {
            i0Var.onNext((mt.g0) ut.o0.requireNonNull(this.f10212f.call(), "The onComplete ObservableSource returned is null"));
            i0Var.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            i0Var.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        mt.i0 i0Var = this.f10209b;
        try {
            i0Var.onNext((mt.g0) ut.o0.requireNonNull(this.f10211e.apply(th2), "The onError ObservableSource returned is null"));
            i0Var.onComplete();
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            i0Var.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        mt.i0 i0Var = this.f10209b;
        try {
            i0Var.onNext((mt.g0) ut.o0.requireNonNull(this.f10210c.apply(obj), "The onNext ObservableSource returned is null"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            i0Var.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10213g, cVar)) {
            this.f10213g = cVar;
            this.f10209b.onSubscribe(this);
        }
    }
}
