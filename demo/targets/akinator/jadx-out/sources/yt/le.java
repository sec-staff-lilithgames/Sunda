package yt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class le extends gu.n implements tw.d {

    /* renamed from: k, reason: collision with root package name */
    public final tw.b f95899k;

    /* renamed from: l, reason: collision with root package name */
    public final st.o f95900l;

    /* renamed from: m, reason: collision with root package name */
    public final int f95901m;

    /* renamed from: n, reason: collision with root package name */
    public final pt.b f95902n;

    /* renamed from: o, reason: collision with root package name */
    public tw.d f95903o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f95904p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f95905q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicLong f95906r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f95907s;

    public le(qu.d dVar, tw.b bVar, st.o oVar, int i10) {
        super(dVar, new eu.b());
        this.f95904p = new AtomicReference();
        AtomicLong atomicLong = new AtomicLong();
        this.f95906r = atomicLong;
        this.f95907s = new AtomicBoolean();
        this.f95899k = bVar;
        this.f95900l = oVar;
        this.f95901m = i10;
        this.f95902n = new pt.b();
        this.f95905q = new ArrayList();
        atomicLong.lazySet(1L);
    }

    public final void U() {
        vt.n nVar = this.f58455g;
        tw.c cVar = this.f58454f;
        ArrayList arrayList = this.f95905q;
        int iLeave = 1;
        while (true) {
            boolean z10 = this.f58457i;
            Object objPoll = nVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                this.f95902n.dispose();
                tt.d.dispose(this.f95904p);
                Throwable th2 = this.f58458j;
                if (th2 != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((nu.d) it.next()).onError(th2);
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((nu.d) it2.next()).onComplete();
                    }
                }
                arrayList.clear();
                return;
            }
            if (z11) {
                iLeave = leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else if (objPoll instanceof me) {
                me meVar = (me) objPoll;
                nu.d dVar = meVar.f95967a;
                if (dVar != null) {
                    if (arrayList.remove(dVar)) {
                        meVar.f95967a.onComplete();
                        if (this.f95906r.decrementAndGet() == 0) {
                            this.f95902n.dispose();
                            tt.d.dispose(this.f95904p);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else if (!this.f95907s.get()) {
                    nu.d dVarCreate = nu.d.create(this.f95901m);
                    long jRequested = requested();
                    if (jRequested != 0) {
                        arrayList.add(dVarCreate);
                        cVar.onNext(dVarCreate);
                        if (jRequested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        try {
                            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95900l.apply(meVar.f95968b), "The publisher supplied is null");
                            je jeVar = new je(this, dVarCreate);
                            if (this.f95902n.add(jeVar)) {
                                this.f95906r.getAndIncrement();
                                bVar.subscribe(jeVar);
                            }
                        } catch (Throwable th3) {
                            cancel();
                            cVar.onError(th3);
                        }
                    } else {
                        cancel();
                        cVar.onError(new qt.e("Could not deliver new window due to lack of requests"));
                    }
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((nu.d) it3.next()).onNext(iu.u.getValue(objPoll));
                }
            }
        }
    }

    @Override // gu.n, iu.y
    public boolean accept(tw.c cVar, Object obj) {
        return false;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95907s.compareAndSet(false, true)) {
            tt.d.dispose(this.f95904p);
            if (this.f95906r.decrementAndGet() == 0) {
                this.f95903o.cancel();
            }
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58457i) {
            return;
        }
        this.f58457i = true;
        if (enter()) {
            U();
        }
        if (this.f95906r.decrementAndGet() == 0) {
            this.f95902n.dispose();
        }
        this.f58454f.onComplete();
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f58457i) {
            mu.a.onError(th2);
            return;
        }
        this.f58458j = th2;
        this.f58457i = true;
        if (enter()) {
            U();
        }
        if (this.f95906r.decrementAndGet() == 0) {
            this.f95902n.dispose();
        }
        this.f58454f.onError(th2);
    }

    @Override // gu.n, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f58457i) {
            return;
        }
        if (fastEnter()) {
            Iterator it = this.f95905q.iterator();
            while (it.hasNext()) {
                ((nu.d) it.next()).onNext(obj);
            }
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f58455g.offer(iu.u.next(obj));
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        AtomicReference atomicReference;
        if (hu.g.validate(this.f95903o, dVar)) {
            this.f95903o = dVar;
            this.f58454f.onSubscribe(this);
            if (this.f95907s.get()) {
                return;
            }
            ke keVar = new ke(this);
            do {
                atomicReference = this.f95904p;
                if (atomicReference.compareAndSet(null, keVar)) {
                    dVar.request(Long.MAX_VALUE);
                    this.f95899k.subscribe(keVar);
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }
}
