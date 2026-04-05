package bu;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10138b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f10139c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f10140e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f10141f;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10145j;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f10147l;

    /* renamed from: m, reason: collision with root package name */
    public long f10148m;

    /* renamed from: k, reason: collision with root package name */
    public final eu.d f10146k = new eu.d(mt.b0.bufferSize());

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f10142g = new pt.b();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f10143h = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f10149n = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final iu.d f10144i = new iu.d();

    public c0(mt.i0 i0Var, mt.g0 g0Var, st.o oVar, Callable callable) {
        this.f10138b = i0Var;
        this.f10139c = callable;
        this.f10140e = g0Var;
        this.f10141f = oVar;
    }

    public final void a(d0 d0Var, long j10) {
        boolean z10;
        this.f10142g.delete(d0Var);
        if (this.f10142g.size() == 0) {
            tt.d.dispose(this.f10143h);
            z10 = true;
        } else {
            z10 = false;
        }
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f10149n;
                if (linkedHashMap == null) {
                    return;
                }
                this.f10146k.offer(linkedHashMap.remove(Long.valueOf(j10)));
                if (z10) {
                    this.f10145j = true;
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
        mt.i0 i0Var = this.f10138b;
        eu.d dVar = this.f10146k;
        int iAddAndGet = 1;
        while (!this.f10147l) {
            boolean z10 = this.f10145j;
            if (z10 && this.f10144i.get() != null) {
                dVar.clear();
                i0Var.onError(this.f10144i.terminate());
                return;
            }
            Collection collection = (Collection) dVar.poll();
            boolean z11 = collection == null;
            if (z10 && z11) {
                i0Var.onComplete();
                return;
            } else if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                i0Var.onNext(collection);
            }
        }
        dVar.clear();
    }

    @Override // pt.c
    public void dispose() {
        if (tt.d.dispose(this.f10143h)) {
            this.f10147l = true;
            this.f10142g.dispose();
            synchronized (this) {
                this.f10149n = null;
            }
            if (getAndIncrement() != 0) {
                this.f10146k.clear();
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10143h.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10142g.dispose();
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f10149n;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    this.f10146k.offer((Collection) it.next());
                }
                this.f10149n = null;
                this.f10145j = true;
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f10144i.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f10142g.dispose();
        synchronized (this) {
            this.f10149n = null;
        }
        this.f10145j = true;
        b();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f10149n;
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

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this.f10143h, cVar)) {
            b0 b0Var = new b0(this);
            this.f10142g.add(b0Var);
            this.f10140e.subscribe(b0Var);
        }
    }
}
