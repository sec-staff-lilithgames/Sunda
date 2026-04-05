package xt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends AtomicInteger implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93530b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f93531c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f93532e;

    public x(mt.f fVar, st.a aVar) {
        this.f93530b = fVar;
        this.f93531c = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f93531c.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f93532e.dispose();
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93532e.isDisposed();
    }

    @Override // mt.f
    public void onComplete() {
        this.f93530b.onComplete();
        a();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93530b.onError(th2);
        a();
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f93532e, cVar)) {
            this.f93532e = cVar;
            this.f93530b.onSubscribe(this);
        }
    }
}
