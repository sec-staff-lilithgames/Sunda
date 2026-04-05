package pu;

import iu.u;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends f implements iu.a {

    /* renamed from: b, reason: collision with root package name */
    public final f f81846b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f81847c;

    /* renamed from: e, reason: collision with root package name */
    public iu.b f81848e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f81849f;

    public e(f fVar) {
        this.f81846b = fVar;
    }

    public final void d() {
        iu.b bVar;
        while (true) {
            synchronized (this) {
                try {
                    bVar = this.f81848e;
                    if (bVar == null) {
                        this.f81847c = false;
                        return;
                    }
                    this.f81848e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            bVar.forEachWhile(this);
        }
    }

    @Override // pu.f
    public Throwable getThrowable() {
        return this.f81846b.getThrowable();
    }

    @Override // pu.f
    public boolean hasComplete() {
        return this.f81846b.hasComplete();
    }

    @Override // pu.f
    public boolean hasObservers() {
        return this.f81846b.hasObservers();
    }

    @Override // pu.f
    public boolean hasThrowable() {
        return this.f81846b.hasThrowable();
    }

    @Override // pu.f, mt.i0, mt.f
    public void onComplete() {
        if (this.f81849f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f81849f) {
                    return;
                }
                this.f81849f = true;
                if (!this.f81847c) {
                    this.f81847c = true;
                    this.f81846b.onComplete();
                    return;
                }
                iu.b bVar = this.f81848e;
                if (bVar == null) {
                    bVar = new iu.b(4);
                    this.f81848e = bVar;
                }
                bVar.add(u.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pu.f, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f81849f) {
            mu.a.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f81849f) {
                    this.f81849f = true;
                    if (this.f81847c) {
                        iu.b bVar = this.f81848e;
                        if (bVar == null) {
                            bVar = new iu.b(4);
                            this.f81848e = bVar;
                        }
                        bVar.setFirst(u.error(th2));
                        return;
                    }
                    this.f81847c = true;
                    z10 = false;
                }
                if (z10) {
                    mu.a.onError(th2);
                } else {
                    this.f81846b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pu.f, mt.i0
    public void onNext(Object obj) {
        if (this.f81849f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f81849f) {
                    return;
                }
                if (!this.f81847c) {
                    this.f81847c = true;
                    this.f81846b.onNext(obj);
                    d();
                } else {
                    iu.b bVar = this.f81848e;
                    if (bVar == null) {
                        bVar = new iu.b(4);
                        this.f81848e = bVar;
                    }
                    bVar.add(u.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pu.f, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        boolean z10 = true;
        if (!this.f81849f) {
            synchronized (this) {
                try {
                    if (!this.f81849f) {
                        if (this.f81847c) {
                            iu.b bVar = this.f81848e;
                            if (bVar == null) {
                                bVar = new iu.b(4);
                                this.f81848e = bVar;
                            }
                            bVar.add(u.disposable(cVar));
                            return;
                        }
                        this.f81847c = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            cVar.dispose();
        } else {
            this.f81846b.onSubscribe(cVar);
            d();
        }
    }

    @Override // mt.b0
    public final void subscribeActual(i0 i0Var) {
        this.f81846b.subscribe(i0Var);
    }

    @Override // iu.a, st.q
    public boolean test(Object obj) {
        return u.acceptFull(obj, this.f81846b);
    }
}
