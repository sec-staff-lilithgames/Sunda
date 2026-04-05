package yt;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g5 extends yt.a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95516e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95517f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95518g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95519h;

    /* renamed from: i, reason: collision with root package name */
    public final st.o f95520i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends hu.a implements mt.q {

        /* renamed from: s, reason: collision with root package name */
        public static final Object f95521s = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final tw.c f95522b;

        /* renamed from: c, reason: collision with root package name */
        public final st.o f95523c;

        /* renamed from: e, reason: collision with root package name */
        public final st.o f95524e;

        /* renamed from: f, reason: collision with root package name */
        public final int f95525f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f95526g;

        /* renamed from: h, reason: collision with root package name */
        public final Map f95527h;

        /* renamed from: i, reason: collision with root package name */
        public final eu.d f95528i;

        /* renamed from: j, reason: collision with root package name */
        public final Queue f95529j;

        /* renamed from: k, reason: collision with root package name */
        public tw.d f95530k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicBoolean f95531l = new AtomicBoolean();

        /* renamed from: m, reason: collision with root package name */
        public final AtomicLong f95532m = new AtomicLong();

        /* renamed from: n, reason: collision with root package name */
        public final AtomicInteger f95533n = new AtomicInteger(1);

        /* renamed from: o, reason: collision with root package name */
        public Throwable f95534o;

        /* renamed from: p, reason: collision with root package name */
        public volatile boolean f95535p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f95536q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f95537r;

        public a(tw.c cVar, st.o oVar, st.o oVar2, int i10, boolean z10, Map<Object, h5> map, Queue<h5> queue) {
            this.f95522b = cVar;
            this.f95523c = oVar;
            this.f95524e = oVar2;
            this.f95525f = i10;
            this.f95526g = z10;
            this.f95527h = map;
            this.f95529j = queue;
            this.f95528i = new eu.d(i10);
        }

        public final boolean a(boolean z10, boolean z11, tw.c cVar, eu.d dVar) {
            if (this.f95531l.get()) {
                dVar.clear();
                return true;
            }
            if (this.f95526g) {
                if (!z10 || !z11) {
                    return false;
                }
                Throwable th2 = this.f95534o;
                if (th2 != null) {
                    cVar.onError(th2);
                    return true;
                }
                cVar.onComplete();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th3 = this.f95534o;
            if (th3 != null) {
                dVar.clear();
                cVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            cVar.onComplete();
            return true;
        }

        public final void b() {
            Queue queue = this.f95529j;
            if (queue != null) {
                int i10 = 0;
                while (true) {
                    h5 h5Var = (h5) queue.poll();
                    if (h5Var == null) {
                        break;
                    }
                    h5Var.onComplete();
                    i10++;
                }
                if (i10 != 0) {
                    this.f95533n.addAndGet(-i10);
                }
            }
        }

        @Override // hu.a, vt.l, tw.d
        public void cancel() {
            if (this.f95531l.compareAndSet(false, true)) {
                b();
                if (this.f95533n.decrementAndGet() == 0) {
                    this.f95530k.cancel();
                }
            }
        }

        @Override // hu.a, vt.l, vt.k, vt.o
        public void clear() {
            this.f95528i.clear();
        }

        public final void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.f95537r) {
                eu.d dVar = this.f95528i;
                tw.c cVar = this.f95522b;
                while (!this.f95531l.get()) {
                    boolean z10 = this.f95535p;
                    if (z10 && !this.f95526g && (th2 = this.f95534o) != null) {
                        dVar.clear();
                        cVar.onError(th2);
                        return;
                    }
                    cVar.onNext(null);
                    if (z10) {
                        Throwable th3 = this.f95534o;
                        if (th3 != null) {
                            cVar.onError(th3);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            eu.d dVar2 = this.f95528i;
            tw.c cVar2 = this.f95522b;
            int iAddAndGet2 = 1;
            do {
                long j10 = this.f95532m.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z11 = this.f95535p;
                    rt.b bVar = (rt.b) dVar2.poll();
                    boolean z12 = bVar == null;
                    if (a(z11, z12, cVar2, dVar2)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    cVar2.onNext(bVar);
                    j11++;
                }
                if (j11 == j10 && a(this.f95535p, dVar2.isEmpty(), cVar2, dVar2)) {
                    return;
                }
                if (j11 != 0) {
                    if (j10 != Long.MAX_VALUE) {
                        this.f95532m.addAndGet(-j11);
                    }
                    this.f95530k.request(j11);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        @Override // hu.a, vt.l, vt.k, vt.o
        public boolean isEmpty() {
            return this.f95528i.isEmpty();
        }

        @Override // mt.q, tw.c, mt.f
        public void onComplete() {
            if (this.f95536q) {
                return;
            }
            Iterator it = this.f95527h.values().iterator();
            while (it.hasNext()) {
                ((h5) it.next()).onComplete();
            }
            this.f95527h.clear();
            Queue queue = this.f95529j;
            if (queue != null) {
                queue.clear();
            }
            this.f95536q = true;
            this.f95535p = true;
            drain();
        }

        @Override // mt.q, tw.c, mt.f
        public void onError(Throwable th2) {
            if (this.f95536q) {
                mu.a.onError(th2);
                return;
            }
            this.f95536q = true;
            Iterator it = this.f95527h.values().iterator();
            while (it.hasNext()) {
                ((h5) it.next()).onError(th2);
            }
            this.f95527h.clear();
            Queue queue = this.f95529j;
            if (queue != null) {
                queue.clear();
            }
            this.f95534o = th2;
            this.f95535p = true;
            drain();
        }

        @Override // mt.q, tw.c
        public void onNext(Object obj) {
            boolean z10;
            if (this.f95536q) {
                return;
            }
            try {
                Object objApply = this.f95523c.apply(obj);
                Object obj2 = objApply != null ? objApply : f95521s;
                Map map = this.f95527h;
                h5 h5VarCreateWith = (h5) map.get(obj2);
                if (h5VarCreateWith != null) {
                    z10 = false;
                } else {
                    if (this.f95531l.get()) {
                        return;
                    }
                    h5VarCreateWith = h5.createWith(objApply, this.f95525f, this, this.f95526g);
                    map.put(obj2, h5VarCreateWith);
                    this.f95533n.getAndIncrement();
                    z10 = true;
                }
                try {
                    h5VarCreateWith.onNext(ut.o0.requireNonNull(this.f95524e.apply(obj), "The valueSelector returned null"));
                    b();
                    if (z10) {
                        this.f95528i.offer(h5VarCreateWith);
                        drain();
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f95530k.cancel();
                    onError(th2);
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f95530k.cancel();
                onError(th3);
            }
        }

        @Override // mt.q, tw.c
        public void onSubscribe(tw.d dVar) {
            if (hu.g.validate(this.f95530k, dVar)) {
                this.f95530k = dVar;
                this.f95522b.onSubscribe(this);
                dVar.request(this.f95525f);
            }
        }

        @Override // hu.a, vt.l, tw.d
        public void request(long j10) {
            if (hu.g.validate(j10)) {
                iu.e.add(this.f95532m, j10);
                drain();
            }
        }

        @Override // hu.a, vt.l, vt.k
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f95537r = true;
            return 2;
        }

        @Override // hu.a, vt.l, vt.k, vt.o
        public rt.b poll() {
            return (rt.b) this.f95528i.poll();
        }

        public void cancel(Object obj) {
            if (obj == null) {
                obj = f95521s;
            }
            this.f95527h.remove(obj);
            if (this.f95533n.decrementAndGet() == 0) {
                this.f95530k.cancel();
                if (this.f95537r || getAndIncrement() != 0) {
                    return;
                }
                this.f95528i.clear();
            }
        }
    }

    public g5(mt.l lVar, st.o oVar, st.o oVar2, int i10, boolean z10, st.o oVar3) {
        super(lVar);
        this.f95516e = oVar;
        this.f95517f = oVar2;
        this.f95518g = i10;
        this.f95519h = z10;
        this.f95520i = oVar3;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map concurrentHashMap;
        st.o oVar = this.f95520i;
        try {
            if (oVar == null) {
                concurrentHashMap = new ConcurrentHashMap();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                concurrentHashMap = (Map) oVar.apply(new f5(concurrentLinkedQueue));
            }
            Map map = concurrentHashMap;
            ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
            this.f95121c.subscribe((mt.q) new a(cVar, this.f95516e, this.f95517f, this.f95518g, this.f95519h, map, concurrentLinkedQueue2));
        } catch (Exception e10) {
            qt.d.throwIfFatal(e10);
            cVar.onSubscribe(iu.i.f68409b);
            cVar.onError(e10);
        }
    }
}
