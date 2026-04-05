package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class cb extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95264b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f95265c;

    /* renamed from: e, reason: collision with root package name */
    public final eu.c f95266e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f95267f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95268g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95269h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95270i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f95271j;

    /* renamed from: k, reason: collision with root package name */
    public Throwable f95272k;

    /* renamed from: l, reason: collision with root package name */
    public tw.d f95273l;

    /* renamed from: m, reason: collision with root package name */
    public Object f95274m;

    /* renamed from: n, reason: collision with root package name */
    public int f95275n;

    public cb(tw.c cVar, st.c cVar2, Object obj, int i10) {
        this.f95264b = cVar;
        this.f95265c = cVar2;
        this.f95274m = obj;
        this.f95268g = i10;
        this.f95269h = i10 - (i10 >> 2);
        eu.c cVar3 = new eu.c(i10);
        this.f95266e = cVar3;
        cVar3.offer(obj);
        this.f95267f = new AtomicLong();
    }

    public final void a() {
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f95264b;
        eu.c cVar2 = this.f95266e;
        int i10 = this.f95269h;
        int i11 = this.f95275n;
        int iAddAndGet = 1;
        do {
            long j10 = this.f95267f.get();
            long j11 = 0;
            while (j11 != j10) {
                if (this.f95270i) {
                    cVar2.clear();
                    return;
                }
                boolean z10 = this.f95271j;
                if (z10 && (th2 = this.f95272k) != null) {
                    cVar2.clear();
                    cVar.onError(th2);
                    return;
                }
                Object objPoll = cVar2.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    cVar.onComplete();
                    return;
                }
                if (z11) {
                    break;
                }
                cVar.onNext(objPoll);
                j11++;
                i11++;
                if (i11 == i10) {
                    this.f95273l.request(i10);
                    i11 = 0;
                }
            }
            if (j11 == j10 && this.f95271j) {
                Throwable th3 = this.f95272k;
                if (th3 != null) {
                    cVar2.clear();
                    cVar.onError(th3);
                    return;
                } else if (cVar2.isEmpty()) {
                    cVar.onComplete();
                    return;
                }
            }
            if (j11 != 0) {
                iu.e.produced(this.f95267f, j11);
            }
            this.f95275n = i11;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // tw.d
    public void cancel() {
        this.f95270i = true;
        this.f95273l.cancel();
        if (getAndIncrement() == 0) {
            this.f95266e.clear();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95271j) {
            return;
        }
        this.f95271j = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95271j) {
            mu.a.onError(th2);
            return;
        }
        this.f95272k = th2;
        this.f95271j = true;
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95271j) {
            return;
        }
        try {
            Object objRequireNonNull = ut.o0.requireNonNull(this.f95265c.apply(this.f95274m, obj), "The accumulator returned a null value");
            this.f95274m = objRequireNonNull;
            this.f95266e.offer(objRequireNonNull);
            a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95273l.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95273l, dVar)) {
            this.f95273l = dVar;
            this.f95264b.onSubscribe(this);
            dVar.request(this.f95268g - 1);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95267f, j10);
            a();
        }
    }
}
