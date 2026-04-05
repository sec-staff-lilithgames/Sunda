package bu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r6 extends wt.b implements mt.i0, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10898b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.a f10899c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10901f;

    /* renamed from: g, reason: collision with root package name */
    public vt.o f10902g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f10903h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f10904i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10905j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f10906k;

    /* renamed from: l, reason: collision with root package name */
    public int f10907l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10908m;

    public r6(mt.i0 i0Var, m0.a aVar, boolean z10, int i10) {
        this.f10898b = i0Var;
        this.f10899c = aVar;
        this.f10900e = z10;
        this.f10901f = i10;
    }

    public final boolean a(boolean z10, boolean z11, mt.i0 i0Var) {
        if (this.f10906k) {
            this.f10902g.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        Throwable th2 = this.f10904i;
        if (this.f10900e) {
            if (!z11) {
                return false;
            }
            this.f10906k = true;
            if (th2 != null) {
                i0Var.onError(th2);
            } else {
                i0Var.onComplete();
            }
            this.f10899c.dispose();
            return true;
        }
        if (th2 != null) {
            this.f10906k = true;
            this.f10902g.clear();
            i0Var.onError(th2);
            this.f10899c.dispose();
            return true;
        }
        if (!z11) {
            return false;
        }
        this.f10906k = true;
        i0Var.onComplete();
        this.f10899c.dispose();
        return true;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
        this.f10902g.clear();
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        if (this.f10906k) {
            return;
        }
        this.f10906k = true;
        this.f10903h.dispose();
        this.f10899c.dispose();
        if (this.f10908m || getAndIncrement() != 0) {
            return;
        }
        this.f10902g.clear();
    }

    @Override // wt.b, vt.j, pt.c
    public boolean isDisposed() {
        return this.f10906k;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f10902g.isEmpty();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10905j) {
            return;
        }
        this.f10905j = true;
        if (getAndIncrement() == 0) {
            this.f10899c.schedule(this);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10905j) {
            mu.a.onError(th2);
            return;
        }
        this.f10904i = th2;
        this.f10905j = true;
        if (getAndIncrement() == 0) {
            this.f10899c.schedule(this);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10905j) {
            return;
        }
        if (this.f10907l != 2) {
            this.f10902g.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f10899c.schedule(this);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10903h, cVar)) {
            this.f10903h = cVar;
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f10907l = iRequestFusion;
                    this.f10902g = jVar;
                    this.f10905j = true;
                    this.f10898b.onSubscribe(this);
                    if (getAndIncrement() == 0) {
                        this.f10899c.schedule(this);
                        return;
                    }
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f10907l = iRequestFusion;
                    this.f10902g = jVar;
                    this.f10898b.onSubscribe(this);
                    return;
                }
            }
            this.f10902g = new eu.d(this.f10901f);
            this.f10898b.onSubscribe(this);
        }
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        return this.f10902g.poll();
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f10908m = true;
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r3 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            boolean r0 = r7.f10908m
            r1 = 1
            if (r0 == 0) goto L4e
            r0 = r1
        L6:
            boolean r2 = r7.f10906k
            if (r2 == 0) goto Lc
            goto L7b
        Lc:
            boolean r2 = r7.f10905j
            java.lang.Throwable r3 = r7.f10904i
            boolean r4 = r7.f10900e
            if (r4 != 0) goto L27
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            r7.f10906k = r1
            mt.i0 r0 = r7.f10898b
            java.lang.Throwable r1 = r7.f10904i
            r0.onError(r1)
            mt.m0$a r0 = r7.f10899c
            r0.dispose()
            return
        L27:
            mt.i0 r3 = r7.f10898b
            r4 = 0
            r3.onNext(r4)
            if (r2 == 0) goto L46
            r7.f10906k = r1
            java.lang.Throwable r0 = r7.f10904i
            if (r0 == 0) goto L3b
            mt.i0 r1 = r7.f10898b
            r1.onError(r0)
            goto L40
        L3b:
            mt.i0 r0 = r7.f10898b
            r0.onComplete()
        L40:
            mt.m0$a r0 = r7.f10899c
            r0.dispose()
            return
        L46:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L7b
        L4e:
            vt.o r0 = r7.f10902g
            mt.i0 r2 = r7.f10898b
            r3 = r1
        L53:
            boolean r4 = r7.f10905j
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.a(r4, r5, r2)
            if (r4 == 0) goto L60
            goto L7b
        L60:
            boolean r4 = r7.f10905j
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L80
            if (r5 != 0) goto L6a
            r6 = r1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            boolean r4 = r7.a(r4, r6, r2)
            if (r4 == 0) goto L72
            goto L7b
        L72:
            if (r6 == 0) goto L7c
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L53
        L7b:
            return
        L7c:
            r2.onNext(r5)
            goto L60
        L80:
            r3 = move-exception
            qt.d.throwIfFatal(r3)
            r7.f10906k = r1
            pt.c r1 = r7.f10903h
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            mt.m0$a r0 = r7.f10899c
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.r6.run():void");
    }
}
