package nu;

import iu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public final a f77202c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77203e;

    /* renamed from: f, reason: collision with root package name */
    public iu.b f77204f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f77205g;

    public b(a aVar) {
        this.f77202c = aVar;
    }

    public final void e() {
        iu.b bVar;
        while (true) {
            synchronized (this) {
                try {
                    bVar = this.f77204f;
                    if (bVar == null) {
                        this.f77203e = false;
                        return;
                    }
                    this.f77204f = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            bVar.accept(this.f77202c);
        }
    }

    @Override // nu.a
    public Throwable getThrowable() {
        return this.f77202c.getThrowable();
    }

    @Override // nu.a
    public boolean hasComplete() {
        return this.f77202c.hasComplete();
    }

    @Override // nu.a
    public boolean hasSubscribers() {
        return this.f77202c.hasSubscribers();
    }

    @Override // nu.a
    public boolean hasThrowable() {
        return this.f77202c.hasThrowable();
    }

    @Override // nu.a, tw.a, tw.c, mt.f
    public void onComplete() {
        if (this.f77205g) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f77205g) {
                    return;
                }
                this.f77205g = true;
                if (!this.f77203e) {
                    this.f77203e = true;
                    this.f77202c.onComplete();
                    return;
                }
                iu.b bVar = this.f77204f;
                if (bVar == null) {
                    bVar = new iu.b(4);
                    this.f77204f = bVar;
                }
                bVar.add(u.complete());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nu.a, tw.a, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f77205g) {
            mu.a.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f77205g) {
                    this.f77205g = true;
                    if (this.f77203e) {
                        iu.b bVar = this.f77204f;
                        if (bVar == null) {
                            bVar = new iu.b(4);
                            this.f77204f = bVar;
                        }
                        bVar.setFirst(u.error(th2));
                        return;
                    }
                    this.f77203e = true;
                    z10 = false;
                }
                if (z10) {
                    mu.a.onError(th2);
                } else {
                    this.f77202c.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // nu.a, tw.a, tw.c
    public void onNext(Object obj) {
        if (this.f77205g) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f77205g) {
                    return;
                }
                if (!this.f77203e) {
                    this.f77203e = true;
                    this.f77202c.onNext(obj);
                    e();
                } else {
                    iu.b bVar = this.f77204f;
                    if (bVar == null) {
                        bVar = new iu.b(4);
                        this.f77204f = bVar;
                    }
                    bVar.add(u.next(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nu.a, tw.a, tw.c
    public void onSubscribe(tw.d dVar) {
        boolean z10 = true;
        if (!this.f77205g) {
            synchronized (this) {
                try {
                    if (!this.f77205g) {
                        if (this.f77203e) {
                            iu.b bVar = this.f77204f;
                            if (bVar == null) {
                                bVar = new iu.b(4);
                                this.f77204f = bVar;
                            }
                            bVar.add(u.subscription(dVar));
                            return;
                        }
                        this.f77203e = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            dVar.cancel();
        } else {
            this.f77202c.onSubscribe(dVar);
            e();
        }
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f77202c.subscribe(cVar);
    }
}
