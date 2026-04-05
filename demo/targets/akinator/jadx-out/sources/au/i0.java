package au;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f8085b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8086c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.d f8087e = new iu.d();

    /* renamed from: f, reason: collision with root package name */
    public final h0 f8088f = new h0(this);

    /* renamed from: g, reason: collision with root package name */
    public final eu.d f8089g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.k f8090h;

    /* renamed from: i, reason: collision with root package name */
    public pt.c f8091i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f8092j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f8093k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8094l;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f8095m;

    public i0(mt.i0 i0Var, st.o oVar, int i10, iu.k kVar) {
        this.f8085b = i0Var;
        this.f8086c = oVar;
        this.f8090h = kVar;
        this.f8089g = new eu.d(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r2.clear();
        r10.f8094l = null;
        r0.onError(r3.terminate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L8
            goto La0
        L8:
            mt.i0 r0 = r10.f8085b
            iu.k r1 = r10.f8090h
            eu.d r2 = r10.f8089g
            iu.d r3 = r10.f8087e
            r4 = 1
            r5 = r4
        L12:
            boolean r6 = r10.f8093k
            r7 = 0
            if (r6 == 0) goto L1e
            r2.clear()
            r10.f8094l = r7
            goto L99
        L1e:
            int r6 = r10.f8095m
            java.lang.Object r8 = r3.get()
            if (r8 == 0) goto L3d
            iu.k r8 = iu.k.f68411b
            if (r1 == r8) goto L30
            iu.k r8 = iu.k.f68412c
            if (r1 != r8) goto L3d
            if (r6 != 0) goto L3d
        L30:
            r2.clear()
            r10.f8094l = r7
            java.lang.Throwable r1 = r3.terminate()
            r0.onError(r1)
            return
        L3d:
            r8 = 0
            if (r6 != 0) goto L8b
            boolean r6 = r10.f8092j
            java.lang.Object r7 = r2.poll()
            if (r7 != 0) goto L49
            r8 = r4
        L49:
            if (r6 == 0) goto L5b
            if (r8 == 0) goto L5b
            java.lang.Throwable r1 = r3.terminate()
            if (r1 != 0) goto L57
            r0.onComplete()
            return
        L57:
            r0.onError(r1)
            return
        L5b:
            if (r8 == 0) goto L5e
            goto L99
        L5e:
            st.o r6 = r10.f8086c     // Catch: java.lang.Throwable -> L74
            java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = "The mapper returned a null SingleSource"
            java.lang.Object r6 = ut.o0.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L74
            mt.t0 r6 = (mt.t0) r6     // Catch: java.lang.Throwable -> L74
            r10.f8095m = r4
            au.h0 r7 = r10.f8088f
            r6.subscribe(r7)
            goto L99
        L74:
            r1 = move-exception
            qt.d.throwIfFatal(r1)
            pt.c r4 = r10.f8091i
            r4.dispose()
            r2.clear()
            r3.addThrowable(r1)
            java.lang.Throwable r1 = r3.terminate()
            r0.onError(r1)
            return
        L8b:
            r9 = 2
            if (r6 != r9) goto L99
            java.lang.Object r6 = r10.f8094l
            r10.f8094l = r7
            r0.onNext(r6)
            r10.f8095m = r8
            goto L12
        L99:
            int r5 = -r5
            int r5 = r10.addAndGet(r5)
            if (r5 != 0) goto L12
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.i0.a():void");
    }

    @Override // pt.c
    public void dispose() {
        this.f8093k = true;
        this.f8091i.dispose();
        h0 h0Var = this.f8088f;
        h0Var.getClass();
        tt.d.dispose(h0Var);
        if (getAndIncrement() == 0) {
            this.f8089g.clear();
            this.f8094l = null;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8093k;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f8092j = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f8087e.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f8090h == iu.k.f68411b) {
            h0 h0Var = this.f8088f;
            h0Var.getClass();
            tt.d.dispose(h0Var);
        }
        this.f8092j = true;
        a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f8089g.offer(obj);
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8091i, cVar)) {
            this.f8091i = cVar;
            this.f8085b.onSubscribe(this);
        }
    }
}
