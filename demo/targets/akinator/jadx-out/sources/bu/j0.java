package bu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 extends wt.u implements pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final Callable f10442j;

    /* renamed from: k, reason: collision with root package name */
    public final mt.g0 f10443k;

    /* renamed from: l, reason: collision with root package name */
    public pt.c f10444l;

    /* renamed from: m, reason: collision with root package name */
    public i0 f10445m;

    /* renamed from: n, reason: collision with root package name */
    public Collection f10446n;

    public j0(ku.m mVar, Callable callable, mt.g0 g0Var) {
        super(mVar, new eu.b());
        this.f10442j = callable;
        this.f10443k = g0Var;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f91287g) {
            return;
        }
        this.f91287g = true;
        this.f10445m.dispose();
        this.f10444l.dispose();
        if (enter()) {
            this.f91286f.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91287g;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        synchronized (this) {
            try {
                Collection collection = this.f10446n;
                if (collection == null) {
                    return;
                }
                this.f10446n = null;
                this.f91286f.offer(collection);
                this.f91288h = true;
                if (enter()) {
                    iu.z.drainLoop(this.f91286f, this.f91285e, false, this, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        dispose();
        this.f91285e.onError(th2);
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f10446n;
                if (collection == null) {
                    return;
                }
                collection.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10444l, cVar)) {
            this.f10444l = cVar;
            try {
                this.f10446n = (Collection) ut.o0.requireNonNull(this.f10442j.call(), "The buffer supplied is null");
                i0 i0Var = new i0(this);
                this.f10445m = i0Var;
                this.f91285e.onSubscribe(this);
                if (this.f91287g) {
                    return;
                }
                this.f10443k.subscribe(i0Var);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f91287g = true;
                cVar.dispose();
                tt.e.error(th2, this.f91285e);
            }
        }
    }

    @Override // wt.u, iu.v
    public void accept(mt.i0 i0Var, Collection<Object> collection) {
        this.f91285e.onNext(collection);
    }
}
