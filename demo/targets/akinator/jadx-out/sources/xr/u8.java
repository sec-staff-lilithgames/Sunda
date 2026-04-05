package xr;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import wr.b3;
import wr.p4;
import xr.f4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u8 extends wr.k3 implements wr.m2 {

    /* renamed from: l0, reason: collision with root package name */
    public static final Logger f93089l0 = Logger.getLogger(u8.class.getName());

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f93090m0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: n0, reason: collision with root package name */
    public static final wr.m6 f93091n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final wr.m6 f93092o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final wr.m6 f93093p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final f9 f93094q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final a7 f93095r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final n7 f93096s0;
    public final ArrayList A;
    public final String B;
    public p4 C;
    public boolean D;
    public d8 E;
    public volatile b3.f F;
    public boolean G;
    public final HashSet H;
    public LinkedHashSet I;
    public final Object J;
    public final HashSet K;
    public final a3 L;
    public final e6.w0 M;
    public final AtomicBoolean N;
    public boolean O;
    public boolean P;
    public volatile boolean Q;
    public final CountDownLatch R;
    public final c7 S;
    public final v0 T;
    public final y0 U;
    public final w0 V;
    public final wr.e2 W;
    public final q8 X;
    public f9 Y;
    public final f9 Z;

    /* renamed from: a, reason: collision with root package name */
    public final wr.n2 f93097a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f93098a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f93099b;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f93100b0;

    /* renamed from: c, reason: collision with root package name */
    public final String f93101c;

    /* renamed from: c0, reason: collision with root package name */
    public final androidx.recyclerview.widget.l1 f93102c0;

    /* renamed from: d, reason: collision with root package name */
    public final wr.w4 f93103d;

    /* renamed from: d0, reason: collision with root package name */
    public final long f93104d0;

    /* renamed from: e, reason: collision with root package name */
    public final wr.n4 f93105e;

    /* renamed from: e0, reason: collision with root package name */
    public final long f93106e0;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f93107f;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f93108f0;

    /* renamed from: g, reason: collision with root package name */
    public final r1 f93109g;

    /* renamed from: g0, reason: collision with root package name */
    public final wr.y0 f93110g0;

    /* renamed from: h, reason: collision with root package name */
    public final wr.k f93111h;

    /* renamed from: h0, reason: collision with root package name */
    public final o5 f93112h0;

    /* renamed from: i, reason: collision with root package name */
    public final s0 f93113i;

    /* renamed from: i0, reason: collision with root package name */
    public final q7 f93114i0;

    /* renamed from: j, reason: collision with root package name */
    public final s0 f93115j;

    /* renamed from: j0, reason: collision with root package name */
    public final jb f93116j0;

    /* renamed from: k, reason: collision with root package name */
    public final r8 f93117k;

    /* renamed from: k0, reason: collision with root package name */
    public int f93118k0;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f93119l;

    /* renamed from: m, reason: collision with root package name */
    public final y9 f93120m;

    /* renamed from: n, reason: collision with root package name */
    public final y9 f93121n;

    /* renamed from: o, reason: collision with root package name */
    public final u7 f93122o;

    /* renamed from: p, reason: collision with root package name */
    public final u7 f93123p;

    /* renamed from: q, reason: collision with root package name */
    public final cf f93124q;

    /* renamed from: r, reason: collision with root package name */
    public final int f93125r;

    /* renamed from: s, reason: collision with root package name */
    public final wr.u6 f93126s;

    /* renamed from: t, reason: collision with root package name */
    public final wr.c1 f93127t;

    /* renamed from: u, reason: collision with root package name */
    public final wr.e0 f93128u;

    /* renamed from: v, reason: collision with root package name */
    public final mh.v2 f93129v;

    /* renamed from: w, reason: collision with root package name */
    public final long f93130w;

    /* renamed from: x, reason: collision with root package name */
    public final bu.s0 f93131x;

    /* renamed from: y, reason: collision with root package name */
    public final f4.a f93132y;

    /* renamed from: z, reason: collision with root package name */
    public final wr.j f93133z;

    static {
        wr.m6 m6Var = wr.m6.f91047o;
        f93091n0 = m6Var.withDescription("Channel shutdownNow invoked");
        f93092o0 = m6Var.withDescription("Channel shutdown invoked");
        f93093p0 = m6Var.withDescription("Subchannel shutdown invoked");
        f93094q0 = new f9(null, new HashMap(), new HashMap(), null, null, null);
        f93095r0 = new a7();
        f93096s0 = new n7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [wr.j] */
    public u8(z8 z8Var, r1 r1Var, f4.a aVar, re reVar, mh.v2 v2Var, ArrayList arrayList) {
        bf bfVar = cf.f92362a;
        wr.u6 u6Var = new wr.u6(new l7(this));
        this.f93126s = u6Var;
        bu.s0 s0Var = new bu.s0();
        s0Var.f10941a = new ArrayList();
        s0Var.f10942b = wr.f0.f90915f;
        this.f93131x = s0Var;
        this.H = new HashSet(16, 0.75f);
        this.J = new Object();
        this.K = new HashSet(1, 0.75f);
        this.M = new e6.w0(this);
        this.N = new AtomicBoolean(false);
        this.R = new CountDownLatch(1);
        this.f93118k0 = 1;
        this.Y = f93094q0;
        this.f93098a0 = false;
        this.f93102c0 = new androidx.recyclerview.widget.l1(10);
        this.f93110g0 = wr.z0.getSystemTicker();
        t7 t7Var = new t7(this);
        this.f93112h0 = new o5(this, 1);
        this.f93114i0 = new q7(this);
        String str = (String) mh.p1.checkNotNull(z8Var.f93303f, "target");
        this.f93099b = str;
        wr.n2 n2VarAllocate = wr.n2.allocate("Channel", str);
        this.f93097a = n2VarAllocate;
        this.f93124q = (cf) mh.p1.checkNotNull(bfVar, "timeProvider");
        y9 y9Var = (y9) mh.p1.checkNotNull(z8Var.f93298a, "executorPool");
        this.f93120m = y9Var;
        Executor executor = (Executor) mh.p1.checkNotNull((Executor) y9Var.getObject(), "executor");
        this.f93119l = executor;
        this.f93111h = z8Var.f93304g;
        this.f93109g = r1Var;
        u7 u7Var = new u7((y9) mh.p1.checkNotNull(z8Var.f93299b, "offloadExecutorPool"));
        this.f93123p = u7Var;
        s0 s0Var2 = new s0(r1Var, z8Var.f93305h, u7Var);
        this.f93113i = s0Var2;
        this.f93115j = new s0(r1Var, null, u7Var);
        r8 r8Var = new r8(s0Var2.getScheduledExecutorService());
        this.f93117k = r8Var;
        this.f93125r = z8Var.f93319v;
        y0 y0Var = new y0(n2VarAllocate, z8Var.f93319v, bfVar.currentTimeNanos(), a.b.l("Channel for '", str, "'"));
        this.U = y0Var;
        w0 w0Var = new w0(y0Var, bfVar);
        this.V = w0Var;
        wr.g5 g5Var = z8Var.f93323z;
        g5Var = g5Var == null ? c5.f92322q : g5Var;
        boolean z10 = z8Var.f93317t;
        this.f93108f0 = z10;
        l0 l0Var = new l0(z8Var.f93309l);
        this.f93107f = l0Var;
        wr.w4 w4Var = z8Var.f93301d;
        this.f93103d = w4Var;
        ad adVar = new ad(z10, z8Var.f93313p, z8Var.f93314q, l0Var);
        String str2 = z8Var.f93308k;
        this.f93101c = str2;
        wr.n4 n4VarBuild = wr.n4.newBuilder().setDefaultPort(z8Var.I.getDefaultPort()).setProxyDetector(g5Var).setSynchronizationContext(u6Var).setScheduledExecutorService(r8Var).setServiceConfigParser(adVar).setChannelLogger(w0Var).setOffloadExecutor(u7Var).setOverrideAuthority(str2).build();
        this.f93105e = n4VarBuild;
        this.C = f(str, str2, w4Var, n4VarBuild, s0Var2.getSupportedSocketAddressTypes());
        this.f93121n = (y9) mh.p1.checkNotNull(reVar, "balancerRpcExecutorPool");
        this.f93122o = new u7(reVar);
        a3 a3Var = new a3(executor, u6Var);
        this.L = a3Var;
        a3Var.start(t7Var);
        this.f93132y = aVar;
        Map<String, ?> map = z8Var.f93320w;
        if (map != null) {
            wr.o4 serviceConfig = adVar.parseServiceConfig(map);
            mh.p1.checkState(serviceConfig.getError() == null, "Default config is invalid: %s", serviceConfig.getError());
            f9 f9Var = (f9) serviceConfig.getConfig();
            this.Z = f9Var;
            this.Y = f9Var;
        } else {
            this.Z = null;
        }
        boolean z11 = z8Var.f93321x;
        this.f93100b0 = z11;
        q8 q8Var = new q8(this, this.C.getServiceAuthority());
        this.X = q8Var;
        wr.d dVar = z8Var.f93322y;
        this.f93133z = wr.t.intercept(dVar != null ? dVar.wrapChannel(q8Var) : q8Var, arrayList);
        this.A = new ArrayList(z8Var.f93302e);
        this.f93129v = (mh.v2) mh.p1.checkNotNull(v2Var, "stopwatchSupplier");
        long j10 = z8Var.f93312o;
        if (j10 == -1) {
            this.f93130w = j10;
        } else {
            mh.p1.checkArgument(j10 >= z8.L, "invalid idleTimeoutMillis %s", j10);
            this.f93130w = z8Var.f93312o;
        }
        this.f93116j0 = new jb(new v7(this), u6Var, s0Var2.getScheduledExecutorService(), (mh.t2) v2Var.get());
        this.f93127t = (wr.c1) mh.p1.checkNotNull(z8Var.f93310m, "decompressorRegistry");
        this.f93128u = (wr.e0) mh.p1.checkNotNull(z8Var.f93311n, "compressorRegistry");
        this.B = z8Var.f93307j;
        this.f93106e0 = z8Var.f93315r;
        this.f93104d0 = z8Var.f93316s;
        c7 c7Var = new c7();
        this.S = c7Var;
        this.T = c7Var.create();
        wr.e2 e2Var = (wr.e2) mh.p1.checkNotNull(z8Var.f93318u);
        this.W = e2Var;
        e2Var.addRootChannel(this);
        if (z11) {
            return;
        }
        if (this.Z != null) {
            w0Var.log(wr.l.f91018c, "Service config look-up disabled, using default service config");
        }
        this.f93098a0 = true;
    }

    public static void a(u8 u8Var) {
        u8Var.i(true);
        a3 a3Var = u8Var.L;
        a3Var.b(null);
        u8Var.V.log(wr.l.f91018c, "Entering IDLE state");
        u8Var.f93131x.a(wr.f0.f90915f);
        if (u8Var.f93112h0.anyObjectInUse(u8Var.J, a3Var)) {
            u8Var.e();
        }
    }

    public static void b(u8 u8Var) {
        wr.m6 m6Var;
        if (u8Var.O) {
            Iterator it = u8Var.H.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                m6Var = f93091n0;
                if (!zHasNext) {
                    break;
                }
                i6 i6Var = (i6) it.next();
                i6Var.shutdown(m6Var);
                i6Var.f92620m.execute(new x5(i6Var, m6Var));
            }
            Iterator it2 = u8Var.K.iterator();
            while (it2.hasNext()) {
                i6 i6Var2 = ((ea) it2.next()).f92471a;
                i6Var2.shutdown(m6Var);
                i6Var2.f92620m.execute(new x5(i6Var2, m6Var));
            }
        }
    }

    public static void c(u8 u8Var) {
        if (!u8Var.Q && u8Var.N.get() && u8Var.H.isEmpty() && u8Var.K.isEmpty()) {
            u8Var.V.log(wr.l.f91018c, "Terminated");
            u8Var.W.removeRootChannel(u8Var);
            u8Var.f93120m.returnObject(u8Var.f93119l);
            u8Var.f93122o.release();
            u8Var.f93123p.release();
            u8Var.f93113i.close();
            u8Var.Q = true;
            u8Var.R.countDown();
        }
    }

    public static p4 f(String str, String str2, wr.w4 w4Var, wr.n4 n4Var, Collection collection) {
        URI uri;
        StringBuilder sb2 = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb2.append(e10.getMessage());
            uri = null;
        }
        wr.t4 providerForScheme = uri != null ? w4Var.getProviderForScheme(uri.getScheme()) : null;
        String str3 = "";
        if (providerForScheme == null && !f93090m0.matcher(str).matches()) {
            try {
                uri = new URI(w4Var.getDefaultScheme(), "", "/" + str, null);
                providerForScheme = w4Var.getProviderForScheme(uri.getScheme());
            } catch (URISyntaxException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        if (providerForScheme == null) {
            if (sb2.length() > 0) {
                str3 = " (" + ((Object) sb2) + ")";
            }
            throw new IllegalArgumentException(a.b.l("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(providerForScheme.getProducedSocketAddressTypes())) {
            throw new IllegalArgumentException(e3.g.l("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        }
        wr.p4 p4VarNewNameResolver = providerForScheme.newNameResolver(uri, n4Var);
        if (p4VarNewNameResolver != null) {
            zc zcVar = new zc(p4VarNewNameResolver, new o0(new f4.a(), n4Var.getScheduledExecutorService(), n4Var.getSynchronizationContext()), n4Var.getSynchronizationContext());
            return str2 == null ? zcVar : new m7(zcVar, str2);
        }
        if (sb2.length() > 0) {
            str3 = " (" + ((Object) sb2) + ")";
        }
        throw new IllegalArgumentException(a.b.l("cannot create a NameResolver for ", str, str3));
    }

    @Override // wr.j
    public String authority() {
        return this.f93133z.authority();
    }

    @Override // wr.k3
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.R.await(j10, timeUnit);
    }

    public final void d(boolean z10) {
        ScheduledFuture scheduledFuture;
        jb jbVar = this.f93116j0;
        jbVar.f92715f = false;
        if (!z10 || (scheduledFuture = jbVar.f92716g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        jbVar.f92716g = null;
    }

    public final void e() {
        this.f93126s.throwIfNotInThisSynchronizationContext();
        if (this.N.get() || this.G) {
            return;
        }
        if (this.f93112h0.isInUse()) {
            d(false);
        } else {
            h();
        }
        if (this.E != null) {
            return;
        }
        this.V.log(wr.l.f91018c, "Exiting idle mode");
        d8 d8Var = new d8(this);
        d8Var.f92425a = this.f93107f.newLoadBalancer(d8Var);
        this.E = d8Var;
        this.C.start((p4.b) new g8(this, d8Var, this.C));
        this.D = true;
    }

    @Override // wr.k3
    public void enterIdle() {
        this.f93126s.execute(new f7(this));
    }

    public final void g() {
        this.f93126s.throwIfNotInThisSynchronizationContext();
        if (this.D) {
            this.C.refresh();
        }
    }

    @Override // wr.m2, wr.v2
    public wr.n2 getLogId() {
        return this.f93097a;
    }

    @Override // wr.k3
    public wr.f0 getState(boolean z10) {
        wr.f0 f0Var = (wr.f0) this.f93131x.f10942b;
        if (f0Var == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (z10 && f0Var == wr.f0.f90915f) {
            this.f93126s.execute(new g7(this));
        }
        return f0Var;
    }

    @Override // wr.m2
    public sh.n1 getStats() {
        sh.a2 a2VarCreate = sh.a2.create();
        this.f93126s.execute(new k7(this, a2VarCreate));
        return a2VarCreate;
    }

    public final void h() {
        long j10 = this.f93130w;
        if (j10 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jb jbVar = this.f93116j0;
        jbVar.getClass();
        long nanos = timeUnit.toNanos(j10);
        mh.t2 t2Var = jbVar.f92713d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jElapsed = t2Var.elapsed(timeUnit2) + nanos;
        jbVar.f92715f = true;
        if (jElapsed - jbVar.f92714e < 0 || jbVar.f92716g == null) {
            ScheduledFuture scheduledFuture = jbVar.f92716g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            jbVar.f92716g = jbVar.f92710a.schedule(new ib(jbVar), nanos, timeUnit2);
        }
        jbVar.f92714e = jElapsed;
    }

    public final void i(boolean z10) {
        this.f93126s.throwIfNotInThisSynchronizationContext();
        if (z10) {
            mh.p1.checkState(this.D, "nameResolver is not started");
            mh.p1.checkState(this.E != null, "lbHelper is null");
        }
        p4 p4Var = this.C;
        if (p4Var != null) {
            p4Var.shutdown();
            this.D = false;
            if (z10) {
                this.C = f(this.f93099b, this.f93101c, this.f93103d, this.f93105e, this.f93113i.getSupportedSocketAddressTypes());
            } else {
                this.C = null;
            }
        }
        d8 d8Var = this.E;
        if (d8Var != null) {
            g0 g0Var = d8Var.f92425a;
            g0Var.f92540b.shutdown();
            g0Var.f92540b = null;
            this.E = null;
        }
        this.F = null;
    }

    @Override // wr.k3
    public boolean isShutdown() {
        return this.N.get();
    }

    @Override // wr.k3
    public boolean isTerminated() {
        return this.Q;
    }

    @Override // wr.j
    public <ReqT, RespT> wr.p newCall(wr.k4 k4Var, wr.i iVar) {
        return this.f93133z.newCall(k4Var, iVar);
    }

    @Override // wr.k3
    public void notifyWhenStateChanged(wr.f0 f0Var, Runnable runnable) {
        this.f93126s.execute(new d7(this, runnable, f0Var));
    }

    @Override // wr.k3
    public void resetConnectBackoff() {
        this.f93126s.execute(new h7(this));
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("logId", this.f93097a.getId()).add("target", this.f93099b).toString();
    }

    @Override // wr.k3
    public u8 shutdown() {
        this.V.log(wr.l.f91017b, "shutdown() called");
        if (!this.N.compareAndSet(false, true)) {
            return this;
        }
        i7 i7Var = new i7(this);
        wr.u6 u6Var = this.f93126s;
        u6Var.execute(i7Var);
        q8 q8Var = this.X;
        q8Var.f92927d.f93126s.execute(new i8(q8Var));
        u6Var.execute(new b7(this));
        return this;
    }

    @Override // wr.k3
    public u8 shutdownNow() {
        this.V.log(wr.l.f91017b, "shutdownNow() called");
        shutdown();
        q8 q8Var = this.X;
        q8Var.f92927d.f93126s.execute(new j8(q8Var));
        this.f93126s.execute(new j7(this));
        return this;
    }
}
