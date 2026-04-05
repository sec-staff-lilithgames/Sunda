package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class vb extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96456b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96457c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f96458e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f96459f;

    /* renamed from: g, reason: collision with root package name */
    public final eu.d f96460g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f96461h;

    /* renamed from: i, reason: collision with root package name */
    public tw.d f96462i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f96463j = new AtomicLong();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f96464k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f96465l;

    /* renamed from: m, reason: collision with root package name */
    public Throwable f96466m;

    public vb(tw.c cVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        this.f96456b = cVar;
        this.f96457c = j10;
        this.f96458e = timeUnit;
        this.f96459f = m0Var;
        this.f96460g = new eu.d(i10);
        this.f96461h = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r14 == r19) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        iu.e.produced(r23.f96463j, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r9 = addAndGet(-r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.getAndIncrement()
            if (r1 == 0) goto La
            goto L98
        La:
            tw.c r1 = r0.f96456b
            eu.d r2 = r0.f96460g
            boolean r3 = r0.f96461h
            java.util.concurrent.TimeUnit r4 = r0.f96458e
            mt.m0 r5 = r0.f96459f
            long r6 = r0.f96457c
            r9 = 1
        L17:
            java.util.concurrent.atomic.AtomicLong r10 = r0.f96463j
            long r10 = r10.get()
            r14 = 0
        L1f:
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 == 0) goto L86
            boolean r8 = r0.f96465l
            java.lang.Object r17 = r2.peek()
            java.lang.Long r17 = (java.lang.Long) r17
            if (r17 != 0) goto L30
            r18 = 1
            goto L32
        L30:
            r18 = 0
        L32:
            long r19 = r5.now(r4)
            if (r18 != 0) goto L44
            long r21 = r17.longValue()
            long r19 = r19 - r6
            int r17 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r17 <= 0) goto L44
            r18 = 1
        L44:
            r19 = 0
            boolean r12 = r0.f96464k
            if (r12 == 0) goto L50
            eu.d r1 = r0.f96460g
            r1.clear()
            return
        L50:
            if (r8 == 0) goto L75
            if (r3 == 0) goto L62
            if (r18 == 0) goto L75
            java.lang.Throwable r2 = r0.f96466m
            if (r2 == 0) goto L5e
            r1.onError(r2)
            return
        L5e:
            r1.onComplete()
            return
        L62:
            java.lang.Throwable r8 = r0.f96466m
            if (r8 == 0) goto L6f
            eu.d r2 = r0.f96460g
            r2.clear()
            r1.onError(r8)
            return
        L6f:
            if (r18 == 0) goto L75
            r1.onComplete()
            return
        L75:
            if (r18 == 0) goto L78
            goto L88
        L78:
            r2.poll()
            java.lang.Object r8 = r2.poll()
            r1.onNext(r8)
            r12 = 1
            long r14 = r14 + r12
            goto L1f
        L86:
            r19 = 0
        L88:
            int r8 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r8 == 0) goto L91
            java.util.concurrent.atomic.AtomicLong r8 = r0.f96463j
            iu.e.produced(r8, r14)
        L91:
            int r8 = -r9
            int r9 = r0.addAndGet(r8)
            if (r9 != 0) goto L17
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.vb.a():void");
    }

    @Override // tw.d
    public void cancel() {
        if (this.f96464k) {
            return;
        }
        this.f96464k = true;
        this.f96462i.cancel();
        if (getAndIncrement() == 0) {
            this.f96460g.clear();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96465l = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96466m = th2;
        this.f96465l = true;
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96460g.offer(Long.valueOf(this.f96459f.now(this.f96458e)), obj);
        a();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96462i, dVar)) {
            this.f96462i = dVar;
            this.f96456b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96463j, j10);
            a();
        }
    }
}
