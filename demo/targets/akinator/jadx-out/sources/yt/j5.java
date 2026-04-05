package yt;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j5 extends AtomicInteger implements tw.d, k5 {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95721b;

    /* renamed from: j, reason: collision with root package name */
    public final st.o f95728j;

    /* renamed from: k, reason: collision with root package name */
    public final st.o f95729k;

    /* renamed from: l, reason: collision with root package name */
    public final st.c f95730l;

    /* renamed from: n, reason: collision with root package name */
    public int f95732n;

    /* renamed from: o, reason: collision with root package name */
    public int f95733o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f95734p;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f95722c = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final pt.b f95724f = new pt.b();

    /* renamed from: e, reason: collision with root package name */
    public final eu.d f95723e = new eu.d(mt.l.bufferSize());

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f95725g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f95726h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f95727i = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f95731m = new AtomicInteger(2);

    public j5(tw.c cVar, st.o oVar, st.o oVar2, st.c cVar2) {
        this.f95721b = cVar;
        this.f95728j = oVar;
        this.f95729k = oVar2;
        this.f95730l = cVar2;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        eu.d dVar = this.f95723e;
        tw.c cVar = this.f95721b;
        int iAddAndGet = 1;
        while (!this.f95734p) {
            if (((Throwable) this.f95727i.get()) != null) {
                dVar.clear();
                this.f95724f.dispose();
                b(cVar);
                return;
            }
            boolean z10 = this.f95731m.get() == 0;
            Integer num = (Integer) dVar.poll();
            boolean z11 = num == null;
            if (z10 && z11) {
                Iterator it = this.f95725g.values().iterator();
                while (it.hasNext()) {
                    ((nu.d) it.next()).onComplete();
                }
                this.f95725g.clear();
                this.f95726h.clear();
                this.f95724f.dispose();
                cVar.onComplete();
                return;
            }
            if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                Object objPoll = dVar.poll();
                if (num == 1) {
                    nu.d dVarCreate = nu.d.create();
                    int i10 = this.f95732n;
                    this.f95732n = i10 + 1;
                    this.f95725g.put(Integer.valueOf(i10), dVarCreate);
                    try {
                        tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95728j.apply(objPoll), "The leftEnd returned a null Publisher");
                        l5 l5Var = new l5(this, true, i10);
                        this.f95724f.add(l5Var);
                        bVar.subscribe(l5Var);
                        if (((Throwable) this.f95727i.get()) != null) {
                            dVar.clear();
                            this.f95724f.dispose();
                            b(cVar);
                            return;
                        }
                        try {
                            Object objRequireNonNull = ut.o0.requireNonNull(this.f95730l.apply(objPoll, dVarCreate), "The resultSelector returned a null value");
                            if (this.f95722c.get() == 0) {
                                c(new qt.e("Could not emit value due to lack of requests"), cVar, dVar);
                                return;
                            }
                            cVar.onNext(objRequireNonNull);
                            iu.e.produced(this.f95722c, 1L);
                            Iterator it2 = this.f95726h.values().iterator();
                            while (it2.hasNext()) {
                                dVarCreate.onNext(it2.next());
                            }
                        } catch (Throwable th2) {
                            c(th2, cVar, dVar);
                            return;
                        }
                    } catch (Throwable th3) {
                        c(th3, cVar, dVar);
                        return;
                    }
                } else if (num == 2) {
                    int i11 = this.f95733o;
                    this.f95733o = i11 + 1;
                    this.f95726h.put(Integer.valueOf(i11), objPoll);
                    try {
                        tw.b bVar2 = (tw.b) ut.o0.requireNonNull(this.f95729k.apply(objPoll), "The rightEnd returned a null Publisher");
                        l5 l5Var2 = new l5(this, false, i11);
                        this.f95724f.add(l5Var2);
                        bVar2.subscribe(l5Var2);
                        if (((Throwable) this.f95727i.get()) != null) {
                            dVar.clear();
                            this.f95724f.dispose();
                            b(cVar);
                            return;
                        } else {
                            Iterator it3 = this.f95725g.values().iterator();
                            while (it3.hasNext()) {
                                ((nu.d) it3.next()).onNext(objPoll);
                            }
                        }
                    } catch (Throwable th4) {
                        c(th4, cVar, dVar);
                        return;
                    }
                } else if (num == 3) {
                    l5 l5Var3 = (l5) objPoll;
                    nu.d dVar2 = (nu.d) this.f95725g.remove(Integer.valueOf(l5Var3.f95853e));
                    this.f95724f.remove(l5Var3);
                    if (dVar2 != null) {
                        dVar2.onComplete();
                    }
                } else if (num == 4) {
                    l5 l5Var4 = (l5) objPoll;
                    this.f95726h.remove(Integer.valueOf(l5Var4.f95853e));
                    this.f95724f.remove(l5Var4);
                }
            }
        }
        dVar.clear();
    }

    public final void b(tw.c cVar) {
        Throwable thTerminate = iu.m.terminate(this.f95727i);
        LinkedHashMap linkedHashMap = this.f95725g;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((nu.d) it.next()).onError(thTerminate);
        }
        linkedHashMap.clear();
        this.f95726h.clear();
        cVar.onError(thTerminate);
    }

    public final void c(Throwable th2, tw.c cVar, vt.o oVar) {
        qt.d.throwIfFatal(th2);
        iu.m.addThrowable(this.f95727i, th2);
        oVar.clear();
        this.f95724f.dispose();
        b(cVar);
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95734p) {
            return;
        }
        this.f95734p = true;
        this.f95724f.dispose();
        if (getAndIncrement() == 0) {
            this.f95723e.clear();
        }
    }

    @Override // yt.k5
    public void innerClose(boolean z10, l5 l5Var) {
        synchronized (this) {
            try {
                this.f95723e.offer(z10 ? 3 : 4, l5Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    @Override // yt.k5
    public void innerCloseError(Throwable th2) {
        if (iu.m.addThrowable(this.f95727i, th2)) {
            a();
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // yt.k5
    public void innerComplete(m5 m5Var) {
        this.f95724f.delete(m5Var);
        this.f95731m.decrementAndGet();
        a();
    }

    @Override // yt.k5
    public void innerError(Throwable th2) {
        if (!iu.m.addThrowable(this.f95727i, th2)) {
            mu.a.onError(th2);
        } else {
            this.f95731m.decrementAndGet();
            a();
        }
    }

    @Override // yt.k5
    public void innerValue(boolean z10, Object obj) {
        synchronized (this) {
            try {
                this.f95723e.offer(z10 ? 1 : 2, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95722c, j10);
        }
    }
}
