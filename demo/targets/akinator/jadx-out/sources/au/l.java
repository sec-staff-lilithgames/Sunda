package au;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f8106b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8107c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8108e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f8109f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f8110g = new iu.d();

    /* renamed from: h, reason: collision with root package name */
    public final k f8111h = new k(this);

    /* renamed from: i, reason: collision with root package name */
    public final eu.c f8112i;

    /* renamed from: j, reason: collision with root package name */
    public final iu.k f8113j;

    /* renamed from: k, reason: collision with root package name */
    public tw.d f8114k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f8115l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f8116m;

    /* renamed from: n, reason: collision with root package name */
    public long f8117n;

    /* renamed from: o, reason: collision with root package name */
    public int f8118o;

    /* renamed from: p, reason: collision with root package name */
    public Object f8119p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f8120q;

    public l(tw.c cVar, st.o oVar, int i10, iu.k kVar) {
        this.f8106b = cVar;
        this.f8107c = oVar;
        this.f8108e = i10;
        this.f8113j = kVar;
        this.f8112i = new eu.c(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r2.clear();
        r15.f8119p = null;
        r0.onError(r3.terminate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r15 = this;
            int r0 = r15.getAndIncrement()
            if (r0 == 0) goto L8
            goto Lc8
        L8:
            tw.c r0 = r15.f8106b
            iu.k r1 = r15.f8113j
            eu.c r2 = r15.f8112i
            iu.d r3 = r15.f8110g
            java.util.concurrent.atomic.AtomicLong r4 = r15.f8109f
            int r5 = r15.f8108e
            int r6 = r5 >> 1
            int r5 = r5 - r6
            r6 = 1
            r7 = r6
        L19:
            boolean r8 = r15.f8116m
            r9 = 0
            if (r8 == 0) goto L25
            r2.clear()
            r15.f8119p = r9
            goto Lc1
        L25:
            int r8 = r15.f8120q
            java.lang.Object r10 = r3.get()
            if (r10 == 0) goto L44
            iu.k r10 = iu.k.f68411b
            if (r1 == r10) goto L37
            iu.k r10 = iu.k.f68412c
            if (r1 != r10) goto L44
            if (r8 != 0) goto L44
        L37:
            r2.clear()
            r15.f8119p = r9
            java.lang.Throwable r1 = r3.terminate()
            r0.onError(r1)
            return
        L44:
            r10 = 0
            if (r8 != 0) goto La4
            boolean r8 = r15.f8115l
            java.lang.Object r9 = r2.poll()
            if (r9 != 0) goto L51
            r11 = r6
            goto L52
        L51:
            r11 = r10
        L52:
            if (r8 == 0) goto L64
            if (r11 == 0) goto L64
            java.lang.Throwable r1 = r3.terminate()
            if (r1 != 0) goto L60
            r0.onComplete()
            return
        L60:
            r0.onError(r1)
            return
        L64:
            if (r11 == 0) goto L67
            goto Lc1
        L67:
            int r8 = r15.f8118o
            int r8 = r8 + r6
            if (r8 != r5) goto L75
            r15.f8118o = r10
            tw.d r8 = r15.f8114k
            long r10 = (long) r5
            r8.request(r10)
            goto L77
        L75:
            r15.f8118o = r8
        L77:
            st.o r8 = r15.f8107c     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r8 = r8.apply(r9)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r9 = "The mapper returned a null SingleSource"
            java.lang.Object r8 = ut.o0.requireNonNull(r8, r9)     // Catch: java.lang.Throwable -> L8d
            mt.t0 r8 = (mt.t0) r8     // Catch: java.lang.Throwable -> L8d
            r15.f8120q = r6
            au.k r9 = r15.f8111h
            r8.subscribe(r9)
            goto Lc1
        L8d:
            r1 = move-exception
            qt.d.throwIfFatal(r1)
            tw.d r4 = r15.f8114k
            r4.cancel()
            r2.clear()
            r3.addThrowable(r1)
            java.lang.Throwable r1 = r3.terminate()
            r0.onError(r1)
            return
        La4:
            r11 = 2
            if (r8 != r11) goto Lc1
            long r11 = r15.f8117n
            long r13 = r4.get()
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 == 0) goto Lc1
            java.lang.Object r8 = r15.f8119p
            r15.f8119p = r9
            r0.onNext(r8)
            r8 = 1
            long r11 = r11 + r8
            r15.f8117n = r11
            r15.f8120q = r10
            goto L19
        Lc1:
            int r7 = -r7
            int r7 = r15.addAndGet(r7)
            if (r7 != 0) goto L19
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.l.a():void");
    }

    @Override // tw.d
    public void cancel() {
        this.f8116m = true;
        this.f8114k.cancel();
        k kVar = this.f8111h;
        kVar.getClass();
        tt.d.dispose(kVar);
        if (getAndIncrement() == 0) {
            this.f8112i.clear();
            this.f8119p = null;
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f8115l = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f8110g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f8113j == iu.k.f68411b) {
            k kVar = this.f8111h;
            kVar.getClass();
            tt.d.dispose(kVar);
        }
        this.f8115l = true;
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f8112i.offer(obj)) {
            a();
        } else {
            this.f8114k.cancel();
            onError(new qt.e("queue full?!"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f8114k, dVar)) {
            this.f8114k = dVar;
            this.f8106b.onSubscribe(this);
            dVar.request(this.f8108e);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f8109f, j10);
        a();
    }
}
