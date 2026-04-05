package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11228c;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f11229e;

    /* renamed from: f, reason: collision with root package name */
    public Collection f11230f;

    /* renamed from: g, reason: collision with root package name */
    public int f11231g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f11232h;

    public y(mt.i0 i0Var, int i10, Callable callable) {
        this.f11227b = i0Var;
        this.f11228c = i10;
        this.f11229e = callable;
    }

    public final boolean a() {
        try {
            this.f11230f = (Collection) ut.o0.requireNonNull(this.f11229e.call(), "Empty buffer supplied");
            return true;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f11230f = null;
            pt.c cVar = this.f11232h;
            mt.i0 i0Var = this.f11227b;
            if (cVar == null) {
                tt.e.error(th2, i0Var);
                return false;
            }
            cVar.dispose();
            i0Var.onError(th2);
            return false;
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f11232h.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11232h.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Collection collection = this.f11230f;
        if (collection != null) {
            this.f11230f = null;
            boolean zIsEmpty = collection.isEmpty();
            mt.i0 i0Var = this.f11227b;
            if (!zIsEmpty) {
                i0Var.onNext(collection);
            }
            i0Var.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11230f = null;
        this.f11227b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        Collection collection = this.f11230f;
        if (collection != null) {
            collection.add(obj);
            int i10 = this.f11231g + 1;
            this.f11231g = i10;
            if (i10 >= this.f11228c) {
                this.f11227b.onNext(collection);
                this.f11231g = 0;
                a();
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11232h, cVar)) {
            this.f11232h = cVar;
            this.f11227b.onSubscribe(this);
        }
    }
}
