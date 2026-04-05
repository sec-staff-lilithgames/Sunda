package au;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: m, reason: collision with root package name */
    public static final q f8166m = new q(null);

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f8167b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8168c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8169e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8170f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f8171g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f8172h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public tw.d f8173i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f8174j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f8175k;

    /* renamed from: l, reason: collision with root package name */
    public long f8176l;

    public r(tw.c cVar, st.o oVar, boolean z10) {
        this.f8167b = cVar;
        this.f8168c = oVar;
        this.f8169e = z10;
    }

    public final void a() {
        AtomicReference atomicReference = this.f8172h;
        q qVar = f8166m;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == null || qVar2 == qVar) {
            return;
        }
        tt.d.dispose(qVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f8167b;
        iu.d dVar = this.f8170f;
        AtomicReference atomicReference = this.f8172h;
        AtomicLong atomicLong = this.f8171g;
        long j10 = this.f8176l;
        int iAddAndGet = 1;
        while (!this.f8175k) {
            if (dVar.get() != null && !this.f8169e) {
                cVar.onError(dVar.terminate());
                return;
            }
            boolean z10 = this.f8174j;
            q qVar = (q) atomicReference.get();
            boolean z11 = qVar == null;
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
            if (z11 || qVar.f8163c == null || j10 == atomicLong.get()) {
                this.f8176l = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(qVar, null) && atomicReference.get() == qVar) {
                }
                cVar.onNext(qVar.f8163c);
                j10++;
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        this.f8175k = true;
        this.f8173i.cancel();
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f8174j = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f8170f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f8169e) {
            a();
        }
        this.f8174j = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        q qVar = f8166m;
        AtomicReference atomicReference = this.f8172h;
        q qVar2 = (q) atomicReference.get();
        if (qVar2 != null) {
            tt.d.dispose(qVar2);
        }
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f8168c.apply(obj), "The mapper returned a null MaybeSource");
            q qVar3 = new q(this);
            while (true) {
                q qVar4 = (q) atomicReference.get();
                if (qVar4 == qVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(qVar4, qVar3)) {
                    if (atomicReference.get() != qVar4) {
                        break;
                    }
                }
                yVar.subscribe(qVar3);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8173i.cancel();
            atomicReference.getAndSet(qVar);
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f8173i, dVar)) {
            this.f8173i = dVar;
            this.f8167b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f8171g, j10);
        b();
    }
}
