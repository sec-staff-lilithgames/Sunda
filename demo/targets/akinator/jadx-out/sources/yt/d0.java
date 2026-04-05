package yt;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95310b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95311c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95312e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95313f;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f95318k;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f95320m;

    /* renamed from: n, reason: collision with root package name */
    public long f95321n;

    /* renamed from: p, reason: collision with root package name */
    public long f95323p;

    /* renamed from: l, reason: collision with root package name */
    public final eu.d f95319l = new eu.d(mt.l.bufferSize());

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f95314g = new pt.b();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f95315h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f95316i = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f95322o = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final iu.d f95317j = new iu.d();

    public d0(tw.c cVar, tw.b bVar, st.o oVar, Callable callable) {
        this.f95310b = cVar;
        this.f95311c = callable;
        this.f95312e = bVar;
        this.f95313f = oVar;
    }

    public final void a(e0 e0Var, long j10) {
        boolean z10;
        this.f95314g.delete(e0Var);
        if (this.f95314g.size() == 0) {
            hu.g.cancel(this.f95316i);
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f95322o;
                if (linkedHashMap == null) {
                    return;
                }
                this.f95319l.offer(linkedHashMap.remove(Long.valueOf(j10)));
                if (z10) {
                    this.f95318k = true;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        long j10 = this.f95323p;
        tw.c cVar = this.f95310b;
        eu.d dVar = this.f95319l;
        int iAddAndGet = 1;
        do {
            long j11 = this.f95315h.get();
            while (j10 != j11) {
                if (this.f95320m) {
                    dVar.clear();
                    return;
                }
                boolean z10 = this.f95318k;
                if (z10 && this.f95317j.get() != null) {
                    dVar.clear();
                    cVar.onError(this.f95317j.terminate());
                    return;
                }
                Collection collection = (Collection) dVar.poll();
                boolean z11 = collection == null;
                if (z10 && z11) {
                    cVar.onComplete();
                    return;
                } else {
                    if (z11) {
                        break;
                    }
                    cVar.onNext(collection);
                    j10++;
                }
            }
            if (j10 == j11) {
                if (this.f95320m) {
                    dVar.clear();
                    return;
                }
                if (this.f95318k) {
                    if (this.f95317j.get() != null) {
                        dVar.clear();
                        cVar.onError(this.f95317j.terminate());
                        return;
                    } else if (dVar.isEmpty()) {
                        cVar.onComplete();
                        return;
                    }
                }
            }
            this.f95323p = j10;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // tw.d
    public void cancel() {
        if (hu.g.cancel(this.f95316i)) {
            this.f95320m = true;
            this.f95314g.dispose();
            synchronized (this) {
                this.f95322o = null;
            }
            if (getAndIncrement() != 0) {
                this.f95319l.clear();
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95314g.dispose();
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f95322o;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    this.f95319l.offer((Collection) it.next());
                }
                this.f95322o = null;
                this.f95318k = true;
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f95317j.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f95314g.dispose();
        synchronized (this) {
            this.f95322o = null;
        }
        this.f95318k = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f95322o;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f95316i, dVar)) {
            c0 c0Var = new c0(this);
            this.f95314g.add(c0Var);
            this.f95312e.subscribe(c0Var);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f95315h, j10);
        b();
    }
}
