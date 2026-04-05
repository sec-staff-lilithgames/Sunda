package qu;

import hu.g;
import iu.u;
import mt.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f83499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83500c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f83501e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83502f;

    /* renamed from: g, reason: collision with root package name */
    public iu.b f83503g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f83504h;

    public d(tw.c cVar) {
        this(cVar, false);
    }

    @Override // tw.d
    public void cancel() {
        this.f83501e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f83504h) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f83504h) {
                    return;
                }
                if (!this.f83502f) {
                    this.f83504h = true;
                    this.f83502f = true;
                    this.f83499b.onComplete();
                } else {
                    iu.b bVar = this.f83503g;
                    if (bVar == null) {
                        bVar = new iu.b(4);
                        this.f83503g = bVar;
                    }
                    bVar.add(u.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f83504h) {
            mu.a.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f83504h) {
                    if (this.f83502f) {
                        this.f83504h = true;
                        iu.b bVar = this.f83503g;
                        if (bVar == null) {
                            bVar = new iu.b(4);
                            this.f83503g = bVar;
                        }
                        Object objError = u.error(th2);
                        if (this.f83500c) {
                            bVar.add(objError);
                        } else {
                            bVar.setFirst(objError);
                        }
                        return;
                    }
                    this.f83504h = true;
                    this.f83502f = true;
                    z10 = false;
                }
                if (z10) {
                    mu.a.onError(th2);
                } else {
                    this.f83499b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        iu.b bVar;
        if (this.f83504h) {
            return;
        }
        if (obj == null) {
            this.f83501e.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f83504h) {
                    return;
                }
                if (this.f83502f) {
                    iu.b bVar2 = this.f83503g;
                    if (bVar2 == null) {
                        bVar2 = new iu.b(4);
                        this.f83503g = bVar2;
                    }
                    bVar2.add(u.next(obj));
                    return;
                }
                this.f83502f = true;
                this.f83499b.onNext(obj);
                do {
                    synchronized (this) {
                        try {
                            bVar = this.f83503g;
                            if (bVar == null) {
                                this.f83502f = false;
                                return;
                            }
                            this.f83503g = null;
                        } finally {
                        }
                    }
                } while (!bVar.accept(this.f83499b));
            } finally {
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (g.validate(this.f83501e, dVar)) {
            this.f83501e = dVar;
            this.f83499b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f83501e.request(j10);
    }

    public d(tw.c cVar, boolean z10) {
        this.f83499b = cVar;
        this.f83500c = z10;
    }
}
