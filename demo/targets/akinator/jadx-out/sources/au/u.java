package au;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: m, reason: collision with root package name */
    public static final t f8196m = new t(null);

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f8197b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8198c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8199e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8200f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f8201g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f8202h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public tw.d f8203i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f8204j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f8205k;

    /* renamed from: l, reason: collision with root package name */
    public long f8206l;

    public u(tw.c cVar, st.o oVar, boolean z10) {
        this.f8197b = cVar;
        this.f8198c = oVar;
        this.f8199e = z10;
    }

    public final void a() {
        AtomicReference atomicReference = this.f8202h;
        t tVar = f8196m;
        t tVar2 = (t) atomicReference.getAndSet(tVar);
        if (tVar2 == null || tVar2 == tVar) {
            return;
        }
        tt.d.dispose(tVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f8197b;
        iu.d dVar = this.f8200f;
        AtomicReference atomicReference = this.f8202h;
        AtomicLong atomicLong = this.f8201g;
        long j10 = this.f8206l;
        int iAddAndGet = 1;
        while (!this.f8205k) {
            if (dVar.get() != null && !this.f8199e) {
                cVar.onError(dVar.terminate());
                return;
            }
            boolean z10 = this.f8204j;
            t tVar = (t) atomicReference.get();
            boolean z11 = tVar == null;
            if (z10 && z11) {
                Throwable thTerminate = dVar.terminate();
                if (thTerminate != null) {
                    cVar.onError(thTerminate);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            if (z11 || tVar.f8193c == null || j10 == atomicLong.get()) {
                this.f8206l = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(tVar, null) && atomicReference.get() == tVar) {
                }
                cVar.onNext(tVar.f8193c);
                j10++;
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        this.f8205k = true;
        this.f8203i.cancel();
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f8204j = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f8200f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f8199e) {
            a();
        }
        this.f8204j = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        t tVar = f8196m;
        AtomicReference atomicReference = this.f8202h;
        t tVar2 = (t) atomicReference.get();
        if (tVar2 != null) {
            tt.d.dispose(tVar2);
        }
        try {
            mt.t0 t0Var = (mt.t0) ut.o0.requireNonNull(this.f8198c.apply(obj), "The mapper returned a null SingleSource");
            t tVar3 = new t(this);
            while (true) {
                t tVar4 = (t) atomicReference.get();
                if (tVar4 == tVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(tVar4, tVar3)) {
                    if (atomicReference.get() != tVar4) {
                        break;
                    }
                }
                t0Var.subscribe(tVar3);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8203i.cancel();
            atomicReference.getAndSet(tVar);
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f8203i, dVar)) {
            this.f8203i = dVar;
            this.f8197b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f8201g, j10);
        b();
    }
}
