package yt;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 extends gu.n implements tw.d, Runnable, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public final Callable f95909k;

    /* renamed from: l, reason: collision with root package name */
    public final long f95910l;

    /* renamed from: m, reason: collision with root package name */
    public final TimeUnit f95911m;

    /* renamed from: n, reason: collision with root package name */
    public final int f95912n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f95913o;

    /* renamed from: p, reason: collision with root package name */
    public final m0.a f95914p;

    /* renamed from: q, reason: collision with root package name */
    public Collection f95915q;

    /* renamed from: r, reason: collision with root package name */
    public pt.c f95916r;

    /* renamed from: s, reason: collision with root package name */
    public tw.d f95917s;

    /* renamed from: t, reason: collision with root package name */
    public long f95918t;

    /* renamed from: u, reason: collision with root package name */
    public long f95919u;

    public m0(qu.d dVar, Callable callable, long j10, TimeUnit timeUnit, int i10, boolean z10, m0.a aVar) {
        super(dVar, new eu.b());
        this.f95909k = callable;
        this.f95910l = j10;
        this.f95911m = timeUnit;
        this.f95912n = i10;
        this.f95913o = z10;
        this.f95914p = aVar;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f58456h) {
            return;
        }
        this.f58456h = true;
        dispose();
    }

    @Override // pt.c
    public void dispose() {
        synchronized (this) {
            this.f95915q = null;
        }
        this.f95917s.cancel();
        this.f95914p.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95914p.isDisposed();
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        Collection collection;
        synchronized (this) {
            collection = this.f95915q;
            this.f95915q = null;
        }
        if (collection != null) {
            this.f58455g.offer(collection);
            this.f58457i = true;
            if (enter()) {
                iu.z.drainMaxLoop(this.f58455g, this.f58454f, false, this, this);
            }
            this.f95914p.dispose();
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        synchronized (this) {
            this.f95915q = null;
        }
        this.f58454f.onError(th2);
        this.f95914p.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0077
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // gu.n, mt.q, tw.c
    public void onNext(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Collection r0 = r7.f95915q     // Catch: java.lang.Throwable -> L72
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
            int r1 = r7.f95912n     // Catch: java.lang.Throwable -> L72
            if (r8 >= r1) goto L19
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L19:
            r8 = 0
            r7.f95915q = r8     // Catch: java.lang.Throwable -> L72
            long r1 = r7.f95918t     // Catch: java.lang.Throwable -> L72
            r3 = 1
            long r1 = r1 + r3
            r7.f95918t = r1     // Catch: java.lang.Throwable -> L72
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            boolean r8 = r7.f95913o
            if (r8 == 0) goto L2d
            pt.c r8 = r7.f95916r
            r8.dispose()
        L2d:
            r7.T(r0, r7)
            java.util.concurrent.Callable r8 = r7.f95909k     // Catch: java.lang.Throwable -> L63
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "The supplied buffer is null"
            java.lang.Object r8 = ut.o0.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L63
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L63
            monitor-enter(r7)
            r7.f95915q = r8     // Catch: java.lang.Throwable -> L5c
            long r0 = r7.f95919u     // Catch: java.lang.Throwable -> L5c
            long r0 = r0 + r3
            r7.f95919u = r0     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = r7.f95913o
            if (r8 == 0) goto L5a
            mt.m0$a r0 = r7.f95914p
            long r2 = r7.f95910l
            java.util.concurrent.TimeUnit r6 = r7.f95911m
            r4 = r2
            r1 = r7
            pt.c r8 = r0.schedulePeriodically(r1, r2, r4, r6)
            r1.f95916r = r8
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
            r7.cancel()
            tw.c r0 = r1.f58454f
            r0.onError(r8)
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
        throw new UnsupportedOperationException("Method not decompiled: yt.m0.onNext(java.lang.Object):void");
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        tw.c cVar = this.f58454f;
        if (hu.g.validate(this.f95917s, dVar)) {
            this.f95917s = dVar;
            try {
                this.f95915q = (Collection) ut.o0.requireNonNull(this.f95909k.call(), "The supplied buffer is null");
                cVar.onSubscribe(this);
                long j10 = this.f95910l;
                this.f95916r = this.f95914p.schedulePeriodically(this, j10, j10, this.f95911m);
                dVar.request(Long.MAX_VALUE);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f95914p.dispose();
                dVar.cancel();
                hu.d.error(th2, cVar);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f95909k.call(), "The supplied buffer is null");
            synchronized (this) {
                Collection collection2 = this.f95915q;
                if (collection2 != null && this.f95918t == this.f95919u) {
                    this.f95915q = collection;
                    T(collection2, this);
                }
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            this.f58454f.onError(th2);
        }
    }

    @Override // gu.n, iu.y
    public boolean accept(tw.c cVar, Collection<Object> collection) {
        cVar.onNext(collection);
        return true;
    }
}
