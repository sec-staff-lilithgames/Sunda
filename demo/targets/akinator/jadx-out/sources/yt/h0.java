package yt;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 extends gu.n implements tw.d, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public final Callable f95566k;

    /* renamed from: l, reason: collision with root package name */
    public final Callable f95567l;

    /* renamed from: m, reason: collision with root package name */
    public tw.d f95568m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f95569n;

    /* renamed from: o, reason: collision with root package name */
    public Collection f95570o;

    public h0(qu.d dVar, Callable callable, Callable callable2) {
        super(dVar, new eu.b());
        this.f95569n = new AtomicReference();
        this.f95566k = callable;
        this.f95567l = callable2;
    }

    public final void U() {
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f95566k.call(), "The buffer supplied is null");
            try {
                tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95567l.call(), "The boundary publisher supplied is null");
                g0 g0Var = new g0(this);
                if (tt.d.replace(this.f95569n, g0Var)) {
                    synchronized (this) {
                        try {
                            Collection collection2 = this.f95570o;
                            if (collection2 == null) {
                                return;
                            }
                            this.f95570o = collection;
                            bVar.subscribe(g0Var);
                            S(collection2, this);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f58456h = true;
                this.f95568m.cancel();
                this.f58454f.onError(th3);
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            cancel();
            this.f58454f.onError(th4);
        }
    }

    @Override // tw.d
    public void cancel() {
        if (this.f58456h) {
            return;
        }
        this.f58456h = true;
        this.f95568m.cancel();
        tt.d.dispose(this.f95569n);
        if (enter()) {
            this.f58455g.clear();
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f95568m.cancel();
        tt.d.dispose(this.f95569n);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95569n.get() == tt.d.f87352b;
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        synchronized (this) {
            try {
                Collection collection = this.f95570o;
                if (collection == null) {
                    return;
                }
                this.f95570o = null;
                this.f58455g.offer(collection);
                this.f58457i = true;
                if (enter()) {
                    iu.z.drainMaxLoop(this.f58455g, this.f58454f, false, this, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        cancel();
        this.f58454f.onError(th2);
    }

    @Override // gu.n, mt.q, tw.c
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f95570o;
                if (collection == null) {
                    return;
                }
                collection.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95568m, dVar)) {
            this.f95568m = dVar;
            tw.c cVar = this.f58454f;
            try {
                this.f95570o = (Collection) ut.o0.requireNonNull(this.f95566k.call(), "The buffer supplied is null");
                try {
                    tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95567l.call(), "The boundary publisher supplied is null");
                    g0 g0Var = new g0(this);
                    this.f95569n.set(g0Var);
                    cVar.onSubscribe(this);
                    if (this.f58456h) {
                        return;
                    }
                    dVar.request(Long.MAX_VALUE);
                    bVar.subscribe(g0Var);
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f58456h = true;
                    dVar.cancel();
                    hu.d.error(th2, cVar);
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f58456h = true;
                dVar.cancel();
                hu.d.error(th3, cVar);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }

    @Override // gu.n, iu.y
    public boolean accept(tw.c cVar, Collection<Object> collection) {
        this.f58454f.onNext(collection);
        return true;
    }
}
