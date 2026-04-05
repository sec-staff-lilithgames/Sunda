package bu;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o4 extends AtomicInteger implements pt.c, p4 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10729b;

    /* renamed from: i, reason: collision with root package name */
    public final st.o f10735i;

    /* renamed from: j, reason: collision with root package name */
    public final st.o f10736j;

    /* renamed from: k, reason: collision with root package name */
    public final st.c f10737k;

    /* renamed from: m, reason: collision with root package name */
    public int f10739m;

    /* renamed from: n, reason: collision with root package name */
    public int f10740n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f10741o;

    /* renamed from: e, reason: collision with root package name */
    public final pt.b f10731e = new pt.b();

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f10730c = new eu.d(mt.b0.bufferSize());

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10732f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f10733g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f10734h = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f10738l = new AtomicInteger(2);

    public o4(mt.i0 i0Var, st.o oVar, st.o oVar2, st.c cVar) {
        this.f10729b = i0Var;
        this.f10735i = oVar;
        this.f10736j = oVar2;
        this.f10737k = cVar;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        eu.d dVar = this.f10730c;
        mt.i0 i0Var = this.f10729b;
        int iAddAndGet = 1;
        while (!this.f10741o) {
            if (((Throwable) this.f10734h.get()) != null) {
                dVar.clear();
                this.f10731e.dispose();
                b(i0Var);
                return;
            }
            boolean z10 = this.f10738l.get() == 0;
            Integer num = (Integer) dVar.poll();
            boolean z11 = num == null;
            if (z10 && z11) {
                Iterator it = this.f10732f.values().iterator();
                while (it.hasNext()) {
                    ((pu.h) it.next()).onComplete();
                }
                this.f10732f.clear();
                this.f10733g.clear();
                this.f10731e.dispose();
                i0Var.onComplete();
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
                    pu.h hVarCreate = pu.h.create();
                    int i10 = this.f10739m;
                    this.f10739m = i10 + 1;
                    this.f10732f.put(Integer.valueOf(i10), hVarCreate);
                    try {
                        mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10735i.apply(objPoll), "The leftEnd returned a null ObservableSource");
                        q4 q4Var = new q4(this, true, i10);
                        this.f10731e.add(q4Var);
                        g0Var.subscribe(q4Var);
                        if (((Throwable) this.f10734h.get()) != null) {
                            dVar.clear();
                            this.f10731e.dispose();
                            b(i0Var);
                            return;
                        } else {
                            try {
                                i0Var.onNext(ut.o0.requireNonNull(this.f10737k.apply(objPoll, hVarCreate), "The resultSelector returned a null value"));
                                Iterator it2 = this.f10733g.values().iterator();
                                while (it2.hasNext()) {
                                    hVarCreate.onNext(it2.next());
                                }
                            } catch (Throwable th2) {
                                c(th2, i0Var, dVar);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        c(th3, i0Var, dVar);
                        return;
                    }
                } else if (num == 2) {
                    int i11 = this.f10740n;
                    this.f10740n = i11 + 1;
                    this.f10733g.put(Integer.valueOf(i11), objPoll);
                    try {
                        mt.g0 g0Var2 = (mt.g0) ut.o0.requireNonNull(this.f10736j.apply(objPoll), "The rightEnd returned a null ObservableSource");
                        q4 q4Var2 = new q4(this, false, i11);
                        this.f10731e.add(q4Var2);
                        g0Var2.subscribe(q4Var2);
                        if (((Throwable) this.f10734h.get()) != null) {
                            dVar.clear();
                            this.f10731e.dispose();
                            b(i0Var);
                            return;
                        } else {
                            Iterator it3 = this.f10732f.values().iterator();
                            while (it3.hasNext()) {
                                ((pu.h) it3.next()).onNext(objPoll);
                            }
                        }
                    } catch (Throwable th4) {
                        c(th4, i0Var, dVar);
                        return;
                    }
                } else if (num == 3) {
                    q4 q4Var3 = (q4) objPoll;
                    pu.h hVar = (pu.h) this.f10732f.remove(Integer.valueOf(q4Var3.f10849e));
                    this.f10731e.remove(q4Var3);
                    if (hVar != null) {
                        hVar.onComplete();
                    }
                } else if (num == 4) {
                    q4 q4Var4 = (q4) objPoll;
                    this.f10733g.remove(Integer.valueOf(q4Var4.f10849e));
                    this.f10731e.remove(q4Var4);
                }
            }
        }
        dVar.clear();
    }

    public final void b(mt.i0 i0Var) {
        Throwable thTerminate = iu.m.terminate(this.f10734h);
        LinkedHashMap linkedHashMap = this.f10732f;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((pu.h) it.next()).onError(thTerminate);
        }
        linkedHashMap.clear();
        this.f10733g.clear();
        i0Var.onError(thTerminate);
    }

    public final void c(Throwable th2, mt.i0 i0Var, eu.d dVar) {
        qt.d.throwIfFatal(th2);
        iu.m.addThrowable(this.f10734h, th2);
        dVar.clear();
        this.f10731e.dispose();
        b(i0Var);
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10741o) {
            return;
        }
        this.f10741o = true;
        this.f10731e.dispose();
        if (getAndIncrement() == 0) {
            this.f10730c.clear();
        }
    }

    @Override // bu.p4
    public void innerClose(boolean z10, q4 q4Var) {
        synchronized (this) {
            try {
                this.f10730c.offer(z10 ? 3 : 4, q4Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    @Override // bu.p4
    public void innerCloseError(Throwable th2) {
        if (iu.m.addThrowable(this.f10734h, th2)) {
            a();
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // bu.p4
    public void innerComplete(r4 r4Var) {
        this.f10731e.delete(r4Var);
        this.f10738l.decrementAndGet();
        a();
    }

    @Override // bu.p4
    public void innerError(Throwable th2) {
        if (!iu.m.addThrowable(this.f10734h, th2)) {
            mu.a.onError(th2);
        } else {
            this.f10738l.decrementAndGet();
            a();
        }
    }

    @Override // bu.p4
    public void innerValue(boolean z10, Object obj) {
        synchronized (this) {
            try {
                this.f10730c.offer(z10 ? 1 : 2, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10741o;
    }
}
