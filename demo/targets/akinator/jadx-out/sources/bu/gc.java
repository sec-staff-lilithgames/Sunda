package bu;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gc extends AtomicBoolean implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10365b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f10366c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10367e;

    public gc(mt.i0 i0Var, mt.m0 m0Var) {
        this.f10365b = i0Var;
        this.f10366c = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        if (compareAndSet(false, true)) {
            this.f10366c.scheduleDirect(new fc(this));
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (get()) {
            return;
        }
        this.f10365b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (get()) {
            mu.a.onError(th2);
        } else {
            this.f10365b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (get()) {
            return;
        }
        this.f10365b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10367e, cVar)) {
            this.f10367e = cVar;
            this.f10365b.onSubscribe(this);
        }
    }
}
