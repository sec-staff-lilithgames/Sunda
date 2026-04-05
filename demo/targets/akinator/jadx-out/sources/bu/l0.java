package bu;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 extends wt.u implements Runnable, pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final Callable f10558j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10559k;

    /* renamed from: l, reason: collision with root package name */
    public final TimeUnit f10560l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10561m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10562n;

    /* renamed from: o, reason: collision with root package name */
    public final m0.a f10563o;

    /* renamed from: p, reason: collision with root package name */
    public Collection f10564p;

    /* renamed from: q, reason: collision with root package name */
    public pt.c f10565q;

    /* renamed from: r, reason: collision with root package name */
    public pt.c f10566r;

    /* renamed from: s, reason: collision with root package name */
    public long f10567s;

    /* renamed from: t, reason: collision with root package name */
    public long f10568t;

    public l0(ku.m mVar, Callable callable, long j10, TimeUnit timeUnit, int i10, boolean z10, m0.a aVar) {
        super(mVar, new eu.b());
        this.f10558j = callable;
        this.f10559k = j10;
        this.f10560l = timeUnit;
        this.f10561m = i10;
        this.f10562n = z10;
        this.f10563o = aVar;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f91287g) {
            return;
        }
        this.f91287g = true;
        this.f10566r.dispose();
        this.f10563o.dispose();
        synchronized (this) {
            this.f10564p = null;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91287g;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        Collection collection;
        this.f10563o.dispose();
        synchronized (this) {
            collection = this.f10564p;
            this.f10564p = null;
        }
        if (collection != null) {
            this.f91286f.offer(collection);
            this.f91288h = true;
            if (enter()) {
                iu.z.drainLoop(this.f91286f, this.f91285e, false, this, this);
            }
        }
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        synchronized (this) {
            this.f10564p = null;
        }
        this.f91285e.onError(th2);
        this.f10563o.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0077
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // wt.u, mt.i0
    public void onNext(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Collection r0 = r7.f10564p     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto Lc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L75
        Lc:
            r0.add(r8)     // Catch: java.lang.Throwable -> L72
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L72
            int r1 = r7.f10561m     // Catch: java.lang.Throwable -> L72
            if (r8 >= r1) goto L19
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L19:
            r8 = 0
            r7.f10564p = r8     // Catch: java.lang.Throwable -> L72
            long r1 = r7.f10567s     // Catch: java.lang.Throwable -> L72
            r3 = 1
            long r1 = r1 + r3
            r7.f10567s = r1     // Catch: java.lang.Throwable -> L72
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            boolean r8 = r7.f10562n
            if (r8 == 0) goto L2d
            pt.c r8 = r7.f10565q
            r8.dispose()
        L2d:
            r7.T(r0, r7)
            java.util.concurrent.Callable r8 = r7.f10558j     // Catch: java.lang.Throwable -> L63
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "The buffer supplied is null"
            java.lang.Object r8 = ut.o0.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L63
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L63
            monitor-enter(r7)
            r7.f10564p = r8     // Catch: java.lang.Throwable -> L5c
            long r0 = r7.f10568t     // Catch: java.lang.Throwable -> L5c
            long r0 = r0 + r3
            r7.f10568t = r0     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = r7.f10562n
            if (r8 == 0) goto L5a
            mt.m0$a r0 = r7.f10563o
            long r2 = r7.f10559k
            java.util.concurrent.TimeUnit r6 = r7.f10560l
            r4 = r2
            r1 = r7
            pt.c r8 = r0.schedulePeriodically(r1, r2, r4, r6)
            r1.f10565q = r8
            return
        L5a:
            r1 = r7
            return
        L5c:
            r0 = move-exception
            r1 = r7
        L5e:
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L61
            throw r8
        L61:
            r0 = move-exception
            goto L5e
        L63:
            r0 = move-exception
            r1 = r7
            r8 = r0
            qt.d.throwIfFatal(r8)
            mt.i0 r0 = r1.f91285e
            r0.onError(r8)
            r7.dispose()
            return
        L72:
            r0 = move-exception
            r1 = r7
        L74:
            r8 = r0
        L75:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
            throw r8
        L77:
            r0 = move-exception
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.l0.onNext(java.lang.Object):void");
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        mt.i0 i0Var = this.f91285e;
        if (tt.d.validate(this.f10566r, cVar)) {
            this.f10566r = cVar;
            try {
                this.f10564p = (Collection) ut.o0.requireNonNull(this.f10558j.call(), "The buffer supplied is null");
                i0Var.onSubscribe(this);
                long j10 = this.f10559k;
                this.f10565q = this.f10563o.schedulePeriodically(this, j10, j10, this.f10560l);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cVar.dispose();
                tt.e.error(th2, i0Var);
                this.f10563o.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f10558j.call(), "The bufferSupplier returned a null buffer");
            synchronized (this) {
                Collection collection2 = this.f10564p;
                if (collection2 != null && this.f10567s == this.f10568t) {
                    this.f10564p = collection;
                    T(collection2, this);
                }
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            dispose();
            this.f91285e.onError(th2);
        }
    }

    @Override // wt.u, iu.v
    public void accept(mt.i0 i0Var, Collection<Object> collection) {
        i0Var.onNext(collection);
    }
}
