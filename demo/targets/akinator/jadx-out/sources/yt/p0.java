package yt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends gu.n implements tw.d, Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final Callable f96090k;

    /* renamed from: l, reason: collision with root package name */
    public final long f96091l;

    /* renamed from: m, reason: collision with root package name */
    public final long f96092m;

    /* renamed from: n, reason: collision with root package name */
    public final TimeUnit f96093n;

    /* renamed from: o, reason: collision with root package name */
    public final m0.a f96094o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedList f96095p;

    /* renamed from: q, reason: collision with root package name */
    public tw.d f96096q;

    public p0(qu.d dVar, Callable callable, long j10, long j11, TimeUnit timeUnit, m0.a aVar) {
        super(dVar, new eu.b());
        this.f96090k = callable;
        this.f96091l = j10;
        this.f96092m = j11;
        this.f96093n = timeUnit;
        this.f96094o = aVar;
        this.f96095p = new LinkedList();
    }

    @Override // tw.d
    public void cancel() {
        this.f58456h = true;
        this.f96096q.cancel();
        this.f96094o.dispose();
        synchronized (this) {
            this.f96095p.clear();
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f96095p);
            this.f96095p.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f58455g.offer((Collection) it.next());
        }
        this.f58457i = true;
        if (enter()) {
            iu.z.drainMaxLoop(this.f58455g, this.f58454f, false, this.f96094o, this);
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58457i = true;
        this.f96094o.dispose();
        synchronized (this) {
            this.f96095p.clear();
        }
        this.f58454f.onError(th2);
    }

    @Override // gu.n, mt.q, tw.c
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                Iterator it = this.f96095p.iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        m0.a aVar = this.f96094o;
        tw.c cVar = this.f58454f;
        if (hu.g.validate(this.f96096q, dVar)) {
            this.f96096q = dVar;
            try {
                Collection collection = (Collection) ut.o0.requireNonNull(this.f96090k.call(), "The supplied buffer is null");
                this.f96095p.add(collection);
                cVar.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
                long j10 = this.f96092m;
                this.f96094o.schedulePeriodically(this, j10, j10, this.f96093n);
                aVar.schedule(new o0(this, collection), this.f96091l, this.f96093n);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                aVar.dispose();
                dVar.cancel();
                hu.d.error(th2, cVar);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f58456h) {
            return;
        }
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f96090k.call(), "The supplied buffer is null");
            synchronized (this) {
                try {
                    if (this.f58456h) {
                        return;
                    }
                    this.f96095p.add(collection);
                    this.f96094o.schedule(new o0(this, collection), this.f96091l, this.f96093n);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            cancel();
            this.f58454f.onError(th3);
        }
    }

    @Override // gu.n, iu.y
    public boolean accept(tw.c cVar, Collection<Object> collection) {
        cVar.onNext(collection);
        return true;
    }
}
