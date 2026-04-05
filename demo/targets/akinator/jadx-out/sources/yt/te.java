package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class te extends gu.n implements tw.d, Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f96376s = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final long f96377k;

    /* renamed from: l, reason: collision with root package name */
    public final TimeUnit f96378l;

    /* renamed from: m, reason: collision with root package name */
    public final mt.m0 f96379m;

    /* renamed from: n, reason: collision with root package name */
    public final int f96380n;

    /* renamed from: o, reason: collision with root package name */
    public tw.d f96381o;

    /* renamed from: p, reason: collision with root package name */
    public nu.d f96382p;

    /* renamed from: q, reason: collision with root package name */
    public final tt.h f96383q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f96384r;

    public te(qu.d dVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10) {
        super(dVar, new eu.b());
        this.f96383q = new tt.h();
        this.f96377k = j10;
        this.f96378l = timeUnit;
        this.f96379m = m0Var;
        this.f96380n = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r3.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r11.f96383q.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r11.f96382p = null;
        r1.clear();
        r0 = r11.f58458j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r3.onError(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            r11 = this;
            java.lang.Object r0 = yt.te.f96376s
            vt.n r1 = r11.f58455g
            tw.c r2 = r11.f58454f
            nu.d r3 = r11.f96382p
            r4 = 1
        L9:
            boolean r5 = r11.f96384r
            boolean r6 = r11.f58457i
            java.lang.Object r7 = r1.poll()
            r8 = 0
            if (r6 == 0) goto L2e
            if (r7 == 0) goto L18
            if (r7 != r0) goto L2e
        L18:
            r11.f96382p = r8
            r1.clear()
            java.lang.Throwable r0 = r11.f58458j
            if (r0 == 0) goto L25
            r3.onError(r0)
            goto L28
        L25:
            r3.onComplete()
        L28:
            tt.h r0 = r11.f96383q
            r0.dispose()
            return
        L2e:
            if (r7 != 0) goto L38
            int r4 = -r4
            int r4 = r11.leave(r4)
            if (r4 != 0) goto L9
            return
        L38:
            if (r7 != r0) goto L85
            r3.onComplete()
            if (r5 != 0) goto L7f
            int r3 = r11.f96380n
            nu.d r3 = nu.d.create(r3)
            r11.f96382p = r3
            long r5 = r11.requested()
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L63
            r2.onNext(r3)
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L9
            r5 = 1
            r11.produced(r5)
            goto L9
        L63:
            r11.f96382p = r8
            vt.n r0 = r11.f58455g
            r0.clear()
            tw.d r0 = r11.f96381o
            r0.cancel()
            qt.e r0 = new qt.e
            java.lang.String r1 = "Could not deliver first window due to lack of requests."
            r0.<init>(r1)
            r2.onError(r0)
            tt.h r0 = r11.f96383q
            r0.dispose()
            return
        L7f:
            tw.d r5 = r11.f96381o
            r5.cancel()
            goto L9
        L85:
            java.lang.Object r5 = iu.u.getValue(r7)
            r3.onNext(r5)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.te.U():void");
    }

    @Override // tw.d
    public void cancel() {
        this.f58456h = true;
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f58457i = true;
        if (enter()) {
            U();
        }
        this.f58454f.onComplete();
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58458j = th2;
        this.f58457i = true;
        if (enter()) {
            U();
        }
        this.f58454f.onError(th2);
    }

    @Override // gu.n, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96384r) {
            return;
        }
        if (fastEnter()) {
            this.f96382p.onNext(obj);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f58455g.offer(iu.u.next(obj));
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96381o, dVar)) {
            this.f96381o = dVar;
            this.f96382p = nu.d.create(this.f96380n);
            tw.c cVar = this.f58454f;
            cVar.onSubscribe(this);
            long jRequested = requested();
            if (jRequested == 0) {
                this.f58456h = true;
                dVar.cancel();
                cVar.onError(new qt.e("Could not deliver first window due to lack of requests."));
                return;
            }
            cVar.onNext(this.f96382p);
            if (jRequested != Long.MAX_VALUE) {
                produced(1L);
            }
            if (!this.f58456h) {
                tt.h hVar = this.f96383q;
                mt.m0 m0Var = this.f96379m;
                long j10 = this.f96377k;
                if (hVar.replace(m0Var.schedulePeriodicallyDirect(this, j10, j10, this.f96378l))) {
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f58456h) {
            this.f96384r = true;
        }
        this.f58455g.offer(f96376s);
        if (enter()) {
            U();
        }
    }
}
