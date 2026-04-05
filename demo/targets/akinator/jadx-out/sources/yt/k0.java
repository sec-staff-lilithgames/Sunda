package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 extends gu.n implements tw.d, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public final Callable f95770k;

    /* renamed from: l, reason: collision with root package name */
    public final tw.b f95771l;

    /* renamed from: m, reason: collision with root package name */
    public tw.d f95772m;

    /* renamed from: n, reason: collision with root package name */
    public j0 f95773n;

    /* renamed from: o, reason: collision with root package name */
    public Collection f95774o;

    public k0(qu.d dVar, Callable callable, tw.b bVar) {
        super(dVar, new eu.b());
        this.f95770k = callable;
        this.f95771l = bVar;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f58456h) {
            return;
        }
        this.f58456h = true;
        this.f95773n.dispose();
        this.f95772m.cancel();
        if (enter()) {
            this.f58455g.clear();
        }
    }

    @Override // pt.c
    public void dispose() {
        cancel();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f58456h;
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        synchronized (this) {
            try {
                Collection collection = this.f95774o;
                if (collection == null) {
                    return;
                }
                this.f95774o = null;
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
                Collection collection = this.f95774o;
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
        if (hu.g.validate(this.f95772m, dVar)) {
            this.f95772m = dVar;
            try {
                this.f95774o = (Collection) ut.o0.requireNonNull(this.f95770k.call(), "The buffer supplied is null");
                j0 j0Var = new j0(this);
                this.f95773n = j0Var;
                this.f58454f.onSubscribe(this);
                if (this.f58456h) {
                    return;
                }
                dVar.request(Long.MAX_VALUE);
                this.f95771l.subscribe(j0Var);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f58456h = true;
                dVar.cancel();
                hu.d.error(th2, this.f58454f);
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
