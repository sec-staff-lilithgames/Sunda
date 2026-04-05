package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ad extends wt.u implements pt.c, Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f10094r = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final long f10095j;

    /* renamed from: k, reason: collision with root package name */
    public final TimeUnit f10096k;

    /* renamed from: l, reason: collision with root package name */
    public final mt.m0 f10097l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10098m;

    /* renamed from: n, reason: collision with root package name */
    public pt.c f10099n;

    /* renamed from: o, reason: collision with root package name */
    public pu.h f10100o;

    /* renamed from: p, reason: collision with root package name */
    public final tt.h f10101p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f10102q;

    public ad(ku.m mVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10) {
        super(mVar, new eu.b());
        this.f10101p = new tt.h();
        this.f10095j = j10;
        this.f10096k = timeUnit;
        this.f10097l = m0Var;
        this.f10098m = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r3.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r8.f10101p.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r8.f10100o = null;
        r1.clear();
        r0 = r8.f91289i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r3.onError(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            r8 = this;
            java.lang.Object r0 = bu.ad.f10094r
            vt.n r1 = r8.f91286f
            eu.b r1 = (eu.b) r1
            mt.i0 r2 = r8.f91285e
            pu.h r3 = r8.f10100o
            r4 = 1
        Lb:
            boolean r5 = r8.f10102q
            boolean r6 = r8.f91288h
            java.lang.Object r7 = r1.poll()
            if (r6 == 0) goto L30
            if (r7 == 0) goto L19
            if (r7 != r0) goto L30
        L19:
            r0 = 0
            r8.f10100o = r0
            r1.clear()
            java.lang.Throwable r0 = r8.f91289i
            if (r0 == 0) goto L27
            r3.onError(r0)
            goto L2a
        L27:
            r3.onComplete()
        L2a:
            tt.h r0 = r8.f10101p
            r0.dispose()
            return
        L30:
            if (r7 != 0) goto L3a
            int r4 = -r4
            int r4 = r8.leave(r4)
            if (r4 != 0) goto Lb
            return
        L3a:
            if (r7 != r0) goto L53
            r3.onComplete()
            if (r5 != 0) goto L4d
            int r3 = r8.f10098m
            pu.h r3 = pu.h.create(r3)
            r8.f10100o = r3
            r2.onNext(r3)
            goto Lb
        L4d:
            pt.c r5 = r8.f10099n
            r5.dispose()
            goto Lb
        L53:
            java.lang.Object r5 = iu.u.getValue(r7)
            r3.onNext(r5)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.ad.U():void");
    }

    @Override // pt.c
    public void dispose() {
        this.f91287g = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91287g;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        this.f91288h = true;
        if (enter()) {
            U();
        }
        this.f91285e.onComplete();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f91289i = th2;
        this.f91288h = true;
        if (enter()) {
            U();
        }
        this.f91285e.onError(th2);
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        if (this.f10102q) {
            return;
        }
        if (fastEnter()) {
            this.f10100o.onNext(obj);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f91286f.offer(iu.u.next(obj));
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10099n, cVar)) {
            this.f10099n = cVar;
            this.f10100o = pu.h.create(this.f10098m);
            mt.i0 i0Var = this.f91285e;
            i0Var.onSubscribe(this);
            i0Var.onNext(this.f10100o);
            if (!this.f91287g) {
                mt.m0 m0Var = this.f10097l;
                long j10 = this.f10095j;
                this.f10101p.replace(m0Var.schedulePeriodicallyDirect(this, j10, j10, this.f10096k));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f91287g) {
            this.f10102q = true;
        }
        this.f91286f.offer(f10094r);
        if (enter()) {
            U();
        }
    }
}
