package au;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends AtomicInteger implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f8037b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8038c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.k f8039e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8040f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final e f8041g = new e(this);

    /* renamed from: h, reason: collision with root package name */
    public final int f8042h;

    /* renamed from: i, reason: collision with root package name */
    public final eu.c f8043i;

    /* renamed from: j, reason: collision with root package name */
    public tw.d f8044j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f8045k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f8046l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f8047m;

    /* renamed from: n, reason: collision with root package name */
    public int f8048n;

    public f(mt.f fVar, st.o oVar, iu.k kVar, int i10) {
        this.f8037b = fVar;
        this.f8038c = oVar;
        this.f8039e = kVar;
        this.f8042h = i10;
        this.f8043i = new eu.c(i10);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.f8047m) {
            if (!this.f8045k) {
                if (this.f8039e == iu.k.f68412c && this.f8040f.get() != null) {
                    this.f8043i.clear();
                    this.f8037b.onError(this.f8040f.terminate());
                    return;
                }
                boolean z10 = this.f8046l;
                Object objPoll = this.f8043i.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate = this.f8040f.terminate();
                    if (thTerminate != null) {
                        this.f8037b.onError(thTerminate);
                        return;
                    } else {
                        this.f8037b.onComplete();
                        return;
                    }
                }
                if (!z11) {
                    int i10 = this.f8042h;
                    int i11 = i10 - (i10 >> 1);
                    int i12 = this.f8048n + 1;
                    if (i12 == i11) {
                        this.f8048n = 0;
                        this.f8044j.request(i11);
                    } else {
                        this.f8048n = i12;
                    }
                    try {
                        mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f8038c.apply(objPoll), "The mapper returned a null CompletableSource");
                        this.f8045k = true;
                        iVar.subscribe(this.f8041g);
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        this.f8043i.clear();
                        this.f8044j.cancel();
                        this.f8040f.addThrowable(th2);
                        this.f8037b.onError(this.f8040f.terminate());
                        return;
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f8043i.clear();
    }

    @Override // pt.c
    public void dispose() {
        this.f8047m = true;
        this.f8044j.cancel();
        e eVar = this.f8041g;
        eVar.getClass();
        tt.d.dispose(eVar);
        if (getAndIncrement() == 0) {
            this.f8043i.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8047m;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f8046l = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f8040f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f8039e != iu.k.f68411b) {
            this.f8046l = true;
            a();
            return;
        }
        e eVar = this.f8041g;
        eVar.getClass();
        tt.d.dispose(eVar);
        Throwable thTerminate = this.f8040f.terminate();
        if (thTerminate != iu.m.f68415a) {
            this.f8037b.onError(thTerminate);
        }
        if (getAndIncrement() == 0) {
            this.f8043i.clear();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f8043i.offer(obj)) {
            a();
        } else {
            this.f8044j.cancel();
            onError(new qt.e("Queue full?!"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f8044j, dVar)) {
            this.f8044j = dVar;
            this.f8037b.onSubscribe(this);
            dVar.request(this.f8042h);
        }
    }
}
