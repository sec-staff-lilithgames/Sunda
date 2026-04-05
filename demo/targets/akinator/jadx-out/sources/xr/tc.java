package xr;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class tc implements k1 {
    public static final wr.z3 A;
    public static final wr.z3 B;
    public static final wr.m6 C;
    public static final Random D;

    /* renamed from: a, reason: collision with root package name */
    public final wr.k4 f93039a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f93040b;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f93042d;

    /* renamed from: e, reason: collision with root package name */
    public final wr.e4 f93043e;

    /* renamed from: f, reason: collision with root package name */
    public final uc f93044f;

    /* renamed from: g, reason: collision with root package name */
    public final e5 f93045g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f93046h;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.recyclerview.widget.l1 f93048j;

    /* renamed from: k, reason: collision with root package name */
    public final long f93049k;

    /* renamed from: l, reason: collision with root package name */
    public final long f93050l;

    /* renamed from: m, reason: collision with root package name */
    public final sc f93051m;

    /* renamed from: s, reason: collision with root package name */
    public androidx.appcompat.app.i1 f93057s;

    /* renamed from: t, reason: collision with root package name */
    public long f93058t;

    /* renamed from: u, reason: collision with root package name */
    public m1 f93059u;

    /* renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.manager.d0 f93060v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.manager.d0 f93061w;

    /* renamed from: x, reason: collision with root package name */
    public long f93062x;

    /* renamed from: y, reason: collision with root package name */
    public wr.m6 f93063y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f93064z;

    /* renamed from: c, reason: collision with root package name */
    public final wr.u6 f93041c = new wr.u6(new kb());

    /* renamed from: i, reason: collision with root package name */
    public final Object f93047i = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final l5 f93052n = new l5();

    /* renamed from: o, reason: collision with root package name */
    public volatile ic f93053o = new ic(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f93054p = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f93055q = new AtomicInteger();

    /* renamed from: r, reason: collision with root package name */
    public final AtomicInteger f93056r = new AtomicInteger();

    static {
        wr.r3 r3Var = wr.e4.f90905d;
        A = wr.z3.of("grpc-previous-rpc-attempts", r3Var);
        B = wr.z3.of("grpc-retry-pushback-ms", r3Var);
        C = wr.m6.f91038f.withDescription("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    public tc(wr.k4 k4Var, wr.e4 e4Var, androidx.recyclerview.widget.l1 l1Var, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, uc ucVar, e5 e5Var, sc scVar) {
        this.f93039a = k4Var;
        this.f93048j = l1Var;
        this.f93049k = j10;
        this.f93050l = j11;
        this.f93040b = executor;
        this.f93042d = scheduledExecutorService;
        this.f93043e = e4Var;
        this.f93044f = ucVar;
        if (ucVar != null) {
            this.f93062x = ucVar.f93137b;
        }
        this.f93045g = e5Var;
        mh.p1.checkArgument(ucVar == null || e5Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f93046h = e5Var != null;
        this.f93051m = scVar;
    }

    public static void a(tc tcVar, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            tcVar.f();
            return;
        }
        synchronized (tcVar.f93047i) {
            try {
                com.bumptech.glide.manager.d0 d0Var = tcVar.f93061w;
                if (d0Var == null) {
                    return;
                }
                d0Var.f16629a = true;
                Future future = (Future) d0Var.f16631c;
                com.bumptech.glide.manager.d0 d0Var2 = new com.bumptech.glide.manager.d0(tcVar.f93047i);
                tcVar.f93061w = d0Var2;
                if (future != null) {
                    future.cancel(false);
                }
                d0Var2.c(tcVar.f93042d.schedule(new gc(tcVar, d0Var2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.k1
    public void appendTimeoutInsight(l5 l5Var) {
        ic icVar;
        synchronized (this.f93047i) {
            l5Var.appendKeyValue("closed", this.f93052n);
            icVar = this.f93053o;
        }
        if (icVar.f92645f != null) {
            l5 l5Var2 = new l5();
            icVar.f92645f.f92966a.appendTimeoutInsight(l5Var2);
            l5Var.appendKeyValue("committed", l5Var2);
            return;
        }
        l5 l5Var3 = new l5();
        for (rc rcVar : icVar.f92642c) {
            l5 l5Var4 = new l5();
            rcVar.f92966a.appendTimeoutInsight(l5Var4);
            l5Var3.append(l5Var4);
        }
        l5Var.appendKeyValue("open", l5Var3);
    }

    public final mb b(rc rcVar) {
        List list;
        boolean z10;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.f93047i) {
            try {
                if (this.f93053o.f92645f != null) {
                    return null;
                }
                Collection collection = this.f93053o.f92642c;
                ic icVar = this.f93053o;
                mh.p1.checkState(icVar.f92645f == null, "Already committed");
                List list2 = icVar.f92641b;
                if (icVar.f92642c.contains(rcVar)) {
                    list = null;
                    collectionSingleton = Collections.singleton(rcVar);
                    z10 = true;
                } else {
                    list = list2;
                    z10 = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.f93053o = new ic(list, collectionSingleton, icVar.f92643d, rcVar, icVar.f92646g, z10, icVar.f92647h, icVar.f92644e);
                ((AtomicLong) this.f93048j.f7184a).addAndGet(-this.f93058t);
                com.bumptech.glide.manager.d0 d0Var = this.f93060v;
                if (d0Var != null) {
                    d0Var.f16629a = true;
                    Future future3 = (Future) d0Var.f16631c;
                    this.f93060v = null;
                    future = future3;
                } else {
                    future = null;
                }
                com.bumptech.glide.manager.d0 d0Var2 = this.f93061w;
                if (d0Var2 != null) {
                    d0Var2.f16629a = true;
                    Future future4 = (Future) d0Var2.f16631c;
                    this.f93061w = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new mb(this, collection, rcVar, future, future2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final rc c(int i10, boolean z10) {
        AtomicInteger atomicInteger;
        int i11;
        do {
            atomicInteger = this.f93056r;
            i11 = atomicInteger.get();
            if (i11 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + 1));
        rc rcVar = new rc(i10);
        zb zbVar = new zb(new dc(this, rcVar));
        wr.e4 e4Var = new wr.e4();
        e4Var.merge(this.f93043e);
        if (i10 > 0) {
            e4Var.put(A, String.valueOf(i10));
        }
        p7 p7Var = (p7) this;
        wr.i iVarWithStreamTracerFactory = p7Var.F.withStreamTracerFactory(zbVar);
        wr.u[] clientStreamTracers = c5.getClientStreamTracers(iVarWithStreamTracerFactory, e4Var, i10, z10);
        wr.k4 k4Var = p7Var.E;
        o1 o1VarA = p7Var.H.a(new va(k4Var, e4Var, iVarWithStreamTracerFactory));
        wr.u0 u0Var = p7Var.G;
        wr.u0 u0VarAttach = u0Var.attach();
        try {
            k1 k1VarNewStream = o1VarA.newStream(k4Var, e4Var, iVarWithStreamTracerFactory, clientStreamTracers);
            u0Var.detach(u0VarAttach);
            rcVar.f92966a = k1VarNewStream;
            return rcVar;
        } catch (Throwable th2) {
            u0Var.detach(u0VarAttach);
            throw th2;
        }
    }

    @Override // xr.k1
    public final void cancel(wr.m6 m6Var) {
        rc rcVar;
        rc rcVar2 = new rc(0);
        rcVar2.f92966a = new x9();
        mb mbVarB = b(rcVar2);
        if (mbVarB != null) {
            synchronized (this.f93047i) {
                this.f93053o = this.f93053o.e(rcVar2);
            }
            mbVarB.run();
            h(m6Var, l1.f92748b, new wr.e4());
            return;
        }
        synchronized (this.f93047i) {
            try {
                if (this.f93053o.f92642c.contains(this.f93053o.f92645f)) {
                    rcVar = this.f93053o.f92645f;
                } else {
                    this.f93063y = m6Var;
                    rcVar = null;
                }
                ic icVar = this.f93053o;
                this.f93053o = new ic(icVar.f92641b, icVar.f92642c, icVar.f92643d, icVar.f92645f, true, icVar.f92640a, icVar.f92647h, icVar.f92644e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (rcVar != null) {
            rcVar.f92966a.cancel(m6Var);
        }
    }

    public final void d(cc ccVar) {
        Collection collection;
        synchronized (this.f93047i) {
            try {
                if (!this.f93053o.f92640a) {
                    this.f93053o.f92641b.add(ccVar);
                }
                collection = this.f93053o.f92642c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ccVar.runWith((rc) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        r8.f93041c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r9.f92966a.start(new xr.qc(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r0 = r9.f92966a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r8.f93053o.f92645f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r9 = r8.f93063y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = xr.tc.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r0.cancel(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (xr.cc) r0.next();
        r4.runWith(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof xr.hc) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.f93053o;
        r5 = r4.f92645f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.f92646g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(xr.rc r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f93047i
            monitor-enter(r4)
            xr.ic r5 = r8.f93053o     // Catch: java.lang.Throwable -> L11
            xr.rc r6 = r5.f92645f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.f92646g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List r6 = r5.f92641b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            xr.ic r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.f93053o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            xr.ac r1 = new xr.ac     // Catch: java.lang.Throwable -> L11
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            wr.u6 r9 = r8.f93041c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            xr.k1 r0 = r9.f92966a
            xr.qc r1 = new xr.qc
            r1.<init>(r8, r9)
            r0.start(r1)
        L4a:
            xr.k1 r0 = r9.f92966a
            xr.ic r1 = r8.f93053o
            xr.rc r1 = r1.f92645f
            if (r1 != r9) goto L55
            wr.m6 r9 = r8.f93063y
            goto L57
        L55:
            wr.m6 r9 = xr.tc.C
        L57:
            r0.cancel(r9)
            return
        L5b:
            boolean r6 = r9.f92967b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List r7 = r5.f92641b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f92641b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f92641b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            xr.cc r4 = (xr.cc) r4
            r4.runWith(r9)
            boolean r4 = r4 instanceof xr.hc
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            xr.ic r4 = r8.f93053o
            xr.rc r5 = r4.f92645f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.f92646g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.tc.e(xr.rc):void");
    }

    public final void f() {
        Future future;
        synchronized (this.f93047i) {
            try {
                com.bumptech.glide.manager.d0 d0Var = this.f93061w;
                future = null;
                if (d0Var != null) {
                    d0Var.f16629a = true;
                    Future future2 = (Future) d0Var.f16631c;
                    this.f93061w = null;
                    future = future2;
                }
                ic icVar = this.f93053o;
                if (!icVar.f92647h) {
                    icVar = new ic(icVar.f92641b, icVar.f92642c, icVar.f92643d, icVar.f92645f, icVar.f92646g, icVar.f92640a, true, icVar.f92644e);
                }
                this.f93053o = icVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // xr.k1, xr.ue
    public final void flush() {
        ic icVar = this.f93053o;
        if (icVar.f92640a) {
            icVar.f92645f.f92966a.flush();
        } else {
            d(new qb());
        }
    }

    public final boolean g(ic icVar) {
        return icVar.f92645f == null && icVar.f92644e < this.f93045g.f92461a && !icVar.f92647h;
    }

    @Override // xr.k1
    public final wr.c getAttributes() {
        return this.f93053o.f92645f != null ? this.f93053o.f92645f.f92966a.getAttributes() : wr.c.f90841b;
    }

    public final void h(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        androidx.appcompat.app.i1 i1Var = new androidx.appcompat.app.i1();
        i1Var.f4754a = m6Var;
        i1Var.f4755b = l1Var;
        i1Var.f4756c = e4Var;
        this.f93057s = i1Var;
        if (this.f93056r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f93041c.execute(new bc(this, m6Var, l1Var, e4Var));
        }
    }

    @Override // xr.k1
    public final void halfClose() {
        d(new sb());
    }

    public final void i(Object obj) {
        ic icVar = this.f93053o;
        if (icVar.f92640a) {
            icVar.f92645f.f92966a.writeMessage(this.f93039a.streamRequest(obj));
        } else {
            d(new yb(this, obj));
        }
    }

    @Override // xr.k1
    public final boolean isReady() {
        Iterator it = this.f93053o.f92642c.iterator();
        while (it.hasNext()) {
            if (((rc) it.next()).f92966a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // xr.k1, xr.ue
    public void optimizeForDirectExecutor() {
        d(new wb());
    }

    @Override // xr.k1, xr.ue
    public final void request(int i10) {
        ic icVar = this.f93053o;
        if (icVar.f92640a) {
            icVar.f92645f.f92966a.request(i10);
        } else {
            d(new xb(i10));
        }
    }

    @Override // xr.k1
    public final void setAuthority(String str) {
        d(new lb(str));
    }

    @Override // xr.k1, xr.ue
    public final void setCompressor(wr.d0 d0Var) {
        d(new nb(d0Var));
    }

    @Override // xr.k1
    public final void setDeadline(wr.z0 z0Var) {
        d(new ob(z0Var));
    }

    @Override // xr.k1
    public final void setDecompressorRegistry(wr.c1 c1Var) {
        d(new pb(c1Var));
    }

    @Override // xr.k1
    public final void setFullStreamDecompression(boolean z10) {
        d(new rb(z10));
    }

    @Override // xr.k1
    public final void setMaxInboundMessageSize(int i10) {
        d(new tb(i10));
    }

    @Override // xr.k1
    public final void setMaxOutboundMessageSize(int i10) {
        d(new ub(i10));
    }

    @Override // xr.k1, xr.ue
    public final void setMessageCompression(boolean z10) {
        d(new vb(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x0048, B:29:0x0058, B:31:0x005c, B:35:0x0069, B:38:0x0075), top: B:50:0x0048 }] */
    @Override // xr.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(xr.m1 r7) {
        /*
            r6 = this;
            r6.f93059u = r7
            r7 = r6
            xr.p7 r7 = (xr.p7) r7
            xr.q7 r0 = r7.H
            xr.u8 r0 = r0.f92923b
            e6.w0 r0 = r0.M
            java.lang.Object r1 = r0.f53883a
            monitor-enter(r1)
            java.lang.Object r2 = r0.f53885c     // Catch: java.lang.Throwable -> L17
            wr.m6 r2 = (wr.m6) r2     // Catch: java.lang.Throwable -> L17
            r3 = 0
            if (r2 == 0) goto L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            goto L23
        L17:
            r7 = move-exception
            goto L96
        L1a:
            java.lang.Object r0 = r0.f53884b     // Catch: java.lang.Throwable -> L17
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L17
            r0.add(r7)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r2 = r3
        L23:
            if (r2 == 0) goto L29
            r6.cancel(r2)
            return
        L29:
            java.lang.Object r7 = r6.f93047i
            monitor-enter(r7)
            xr.ic r0 = r6.f93053o     // Catch: java.lang.Throwable -> L93
            java.util.List r0 = r0.f92641b     // Catch: java.lang.Throwable -> L93
            xr.hc r1 = new xr.hc     // Catch: java.lang.Throwable -> L93
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L93
            r0.add(r1)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L93
            r7 = 0
            xr.rc r0 = r6.c(r7, r7)
            if (r0 != 0) goto L41
            return
        L41:
            boolean r1 = r6.f93046h
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r6.f93047i
            monitor-enter(r1)
            xr.ic r2 = r6.f93053o     // Catch: java.lang.Throwable -> L73
            xr.ic r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L73
            r6.f93053o = r2     // Catch: java.lang.Throwable -> L73
            xr.ic r2 = r6.f93053o     // Catch: java.lang.Throwable -> L73
            boolean r2 = r6.g(r2)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L75
            xr.sc r2 = r6.f93051m     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L69
            java.util.concurrent.atomic.AtomicInteger r4 = r2.f92997d     // Catch: java.lang.Throwable -> L73
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L73
            int r2 = r2.f92995b     // Catch: java.lang.Throwable -> L73
            if (r4 <= r2) goto L67
            r7 = 1
        L67:
            if (r7 == 0) goto L75
        L69:
            com.bumptech.glide.manager.d0 r3 = new com.bumptech.glide.manager.d0     // Catch: java.lang.Throwable -> L73
            java.lang.Object r7 = r6.f93047i     // Catch: java.lang.Throwable -> L73
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L73
            r6.f93061w = r3     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            r7 = move-exception
            goto L8d
        L75:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L8f
            java.util.concurrent.ScheduledExecutorService r7 = r6.f93042d
            xr.gc r1 = new xr.gc
            r1.<init>(r6, r3)
            xr.e5 r2 = r6.f93045g
            long r4 = r2.f92462b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r1, r4, r2)
            r3.c(r7)
            goto L8f
        L8d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L73
            throw r7
        L8f:
            r6.e(r0)
            return
        L93:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L93
            throw r0
        L96:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.tc.start(xr.m1):void");
    }

    @Override // xr.k1, xr.ue
    public final void writeMessage(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }
}
