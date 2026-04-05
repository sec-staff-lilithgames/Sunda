package xr;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z8 extends wr.l3 {
    public static final Logger J = Logger.getLogger(z8.class.getName());
    public static final long K = TimeUnit.MINUTES.toMillis(30);
    public static final long L = TimeUnit.SECONDS.toMillis(1);
    public static final re M = re.forResource(c5.f92325t);
    public static final wr.c1 N = wr.c1.getDefaultInstance();
    public static final wr.e0 O = wr.e0.getDefaultInstance();
    public static final Method P;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final w8 H;
    public final v8 I;

    /* renamed from: a, reason: collision with root package name */
    public y9 f93298a;

    /* renamed from: b, reason: collision with root package name */
    public y9 f93299b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f93300c;

    /* renamed from: d, reason: collision with root package name */
    public wr.w4 f93301d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f93302e;

    /* renamed from: f, reason: collision with root package name */
    public final String f93303f;

    /* renamed from: g, reason: collision with root package name */
    public final wr.k f93304g;

    /* renamed from: h, reason: collision with root package name */
    public final wr.f f93305h;

    /* renamed from: i, reason: collision with root package name */
    public final SocketAddress f93306i;

    /* renamed from: j, reason: collision with root package name */
    public String f93307j;

    /* renamed from: k, reason: collision with root package name */
    public String f93308k;

    /* renamed from: l, reason: collision with root package name */
    public String f93309l;

    /* renamed from: m, reason: collision with root package name */
    public wr.c1 f93310m;

    /* renamed from: n, reason: collision with root package name */
    public wr.e0 f93311n;

    /* renamed from: o, reason: collision with root package name */
    public long f93312o;

    /* renamed from: p, reason: collision with root package name */
    public int f93313p;

    /* renamed from: q, reason: collision with root package name */
    public int f93314q;

    /* renamed from: r, reason: collision with root package name */
    public long f93315r;

    /* renamed from: s, reason: collision with root package name */
    public long f93316s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f93317t;

    /* renamed from: u, reason: collision with root package name */
    public final wr.e2 f93318u;

    /* renamed from: v, reason: collision with root package name */
    public int f93319v;

    /* renamed from: w, reason: collision with root package name */
    public Map f93320w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f93321x;

    /* renamed from: y, reason: collision with root package name */
    public wr.d f93322y;

    /* renamed from: z, reason: collision with root package name */
    public wr.g5 f93323z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements v8 {

        /* renamed from: a, reason: collision with root package name */
        public final int f93324a;

        public a(int i10) {
            this.f93324a = i10;
        }

        @Override // xr.v8
        public int getDefaultPort() {
            return this.f93324a;
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e10) {
            J.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            declaredMethod = null;
            P = declaredMethod;
        } catch (NoSuchMethodException e11) {
            J.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            declaredMethod = null;
            P = declaredMethod;
        }
        P = declaredMethod;
    }

    public z8(String str, w8 w8Var, v8 v8Var) {
        this(str, null, null, w8Var, v8Var);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(b((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(a((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj + "' is of type '" + obj.getClass() + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Map b(Map map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            mh.p1.checkArgument(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, b((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, a((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + entry + "' is of type '" + value.getClass() + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static wr.l3 forAddress(String str, int i10) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    public static wr.l3 forTarget(String str) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    @Override // wr.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wr.k3 build() {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.z8.build():wr.k3");
    }

    @Override // wr.l3
    public /* bridge */ /* synthetic */ wr.l3 defaultServiceConfig(Map map) {
        return defaultServiceConfig((Map<String, ?>) map);
    }

    public z8 disableCheckAuthority() {
        this.A = true;
        return this;
    }

    public z8 enableCheckAuthority() {
        this.A = false;
        return this;
    }

    public y9 getOffloadExecutorPool() {
        return this.f93299b;
    }

    @Override // wr.l3
    public /* bridge */ /* synthetic */ wr.l3 intercept(List list) {
        return intercept((List<wr.q>) list);
    }

    public void setStatsEnabled(boolean z10) {
        this.B = z10;
    }

    public void setStatsRecordFinishedRpcs(boolean z10) {
        this.D = z10;
    }

    public void setStatsRecordRealTimeMetrics(boolean z10) {
        this.E = z10;
    }

    public void setStatsRecordRetryMetrics(boolean z10) {
        this.F = z10;
    }

    public void setStatsRecordStartedRpcs(boolean z10) {
        this.C = z10;
    }

    public void setTracingEnabled(boolean z10) {
        this.G = z10;
    }

    public z8(String str, wr.k kVar, wr.f fVar, w8 w8Var, v8 v8Var) {
        re reVar = M;
        this.f93298a = reVar;
        this.f93299b = reVar;
        this.f93300c = new ArrayList();
        this.f93301d = wr.w4.getDefaultRegistry();
        this.f93302e = new ArrayList();
        this.f93309l = "pick_first";
        this.f93310m = N;
        this.f93311n = O;
        this.f93312o = K;
        this.f93313p = 5;
        this.f93314q = 5;
        this.f93315r = 16777216L;
        this.f93316s = 1048576L;
        this.f93317t = true;
        this.f93318u = wr.e2.instance();
        this.f93321x = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = true;
        this.G = true;
        this.f93303f = (String) mh.p1.checkNotNull(str, "target");
        this.f93304g = kVar;
        this.f93305h = fVar;
        this.H = (w8) mh.p1.checkNotNull(w8Var, "clientTransportFactoryBuilder");
        this.f93306i = null;
        if (v8Var != null) {
            this.I = v8Var;
        } else {
            this.I = new a9();
        }
    }

    @Override // wr.l3
    public z8 addTransportFilter(wr.x xVar) {
        this.f93302e.add((wr.x) mh.p1.checkNotNull(xVar, "transport filter"));
        return this;
    }

    @Override // wr.l3
    public z8 compressorRegistry(wr.e0 e0Var) {
        if (e0Var != null) {
            this.f93311n = e0Var;
            return this;
        }
        this.f93311n = O;
        return this;
    }

    @Override // wr.l3
    public z8 decompressorRegistry(wr.c1 c1Var) {
        if (c1Var != null) {
            this.f93310m = c1Var;
            return this;
        }
        this.f93310m = N;
        return this;
    }

    @Override // wr.l3
    public z8 defaultLoadBalancingPolicy(String str) {
        SocketAddress socketAddress = this.f93306i;
        mh.p1.checkState(socketAddress == null, "directServerAddress is set (%s), which forbids the use of load-balancing policy", socketAddress);
        mh.p1.checkArgument(str != null, "policy cannot be null");
        this.f93309l = str;
        return this;
    }

    @Override // wr.l3
    public z8 defaultServiceConfig(Map<String, ?> map) {
        this.f93320w = b(map);
        return this;
    }

    @Override // wr.l3
    public z8 directExecutor() {
        return executor(sh.w1.directExecutor());
    }

    @Override // wr.l3
    public z8 disableRetry() {
        this.f93317t = false;
        return this;
    }

    @Override // wr.l3
    public z8 disableServiceConfigLookUp() {
        this.f93321x = false;
        return this;
    }

    @Override // wr.l3
    public z8 enableRetry() {
        this.f93317t = true;
        return this;
    }

    @Override // wr.l3
    public z8 executor(Executor executor) {
        if (executor != null) {
            this.f93298a = new j4(executor);
            return this;
        }
        this.f93298a = M;
        return this;
    }

    @Override // wr.l3
    public z8 idleTimeout(long j10, TimeUnit timeUnit) {
        mh.p1.checkArgument(j10 > 0, "idle timeout is %s, but must be positive", j10);
        if (timeUnit.toDays(j10) >= 30) {
            this.f93312o = -1L;
            return this;
        }
        this.f93312o = Math.max(timeUnit.toMillis(j10), L);
        return this;
    }

    @Override // wr.l3
    public z8 maxHedgedAttempts(int i10) {
        this.f93314q = i10;
        return this;
    }

    @Override // wr.l3
    public z8 maxRetryAttempts(int i10) {
        this.f93313p = i10;
        return this;
    }

    @Override // wr.l3
    public z8 maxTraceEvents(int i10) {
        mh.p1.checkArgument(i10 >= 0, "maxTraceEvents must be non-negative");
        this.f93319v = i10;
        return this;
    }

    @Override // wr.l3
    @Deprecated
    public z8 nameResolverFactory(p4.a aVar) {
        SocketAddress socketAddress = this.f93306i;
        mh.p1.checkState(socketAddress == null, "directServerAddress is set (%s), which forbids the use of NameResolverFactory", socketAddress);
        if (aVar == null) {
            this.f93301d = wr.w4.getDefaultRegistry();
            return this;
        }
        wr.w4 w4Var = new wr.w4();
        if (aVar instanceof wr.t4) {
            w4Var.register((wr.t4) aVar);
        } else {
            w9 w9Var = new w9();
            w9Var.f93219a = aVar;
            w4Var.register(w9Var);
        }
        this.f93301d = w4Var;
        return this;
    }

    @Override // wr.l3
    public z8 offloadExecutor(Executor executor) {
        if (executor != null) {
            this.f93299b = new j4(executor);
            return this;
        }
        this.f93299b = M;
        return this;
    }

    @Override // wr.l3
    public z8 overrideAuthority(String str) {
        if (!this.A) {
            str = c5.checkAuthority(str);
        }
        this.f93308k = str;
        return this;
    }

    @Override // wr.l3
    public z8 perRpcBufferLimit(long j10) {
        mh.p1.checkArgument(j10 > 0, "per RPC buffer limit must be positive");
        this.f93316s = j10;
        return this;
    }

    @Override // wr.l3
    public z8 proxyDetector(wr.g5 g5Var) {
        this.f93323z = g5Var;
        return this;
    }

    @Override // wr.l3
    public z8 retryBufferSize(long j10) {
        mh.p1.checkArgument(j10 > 0, "retry buffer size must be positive");
        this.f93315r = j10;
        return this;
    }

    @Override // wr.l3
    public z8 setBinaryLog(wr.d dVar) {
        this.f93322y = dVar;
        return this;
    }

    @Override // wr.l3
    public z8 userAgent(String str) {
        this.f93307j = str;
        return this;
    }

    @Override // wr.l3
    public z8 intercept(List<wr.q> list) {
        this.f93300c.addAll(list);
        return this;
    }

    @Override // wr.l3
    public z8 intercept(wr.q... qVarArr) {
        return intercept(Arrays.asList(qVarArr));
    }

    public z8(SocketAddress socketAddress, String str, w8 w8Var, v8 v8Var) {
        this(socketAddress, str, null, null, w8Var, v8Var);
    }

    public z8(SocketAddress socketAddress, String str, wr.k kVar, wr.f fVar, w8 w8Var, v8 v8Var) {
        re reVar = M;
        this.f93298a = reVar;
        this.f93299b = reVar;
        this.f93300c = new ArrayList();
        this.f93301d = wr.w4.getDefaultRegistry();
        this.f93302e = new ArrayList();
        this.f93309l = "pick_first";
        this.f93310m = N;
        this.f93311n = O;
        this.f93312o = K;
        this.f93313p = 5;
        this.f93314q = 5;
        this.f93315r = 16777216L;
        this.f93316s = 1048576L;
        this.f93317t = true;
        this.f93318u = wr.e2.instance();
        this.f93321x = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = true;
        this.G = true;
        try {
            this.f93303f = new URI("directaddress", "", "/" + socketAddress, null).toString();
            this.f93304g = kVar;
            this.f93305h = fVar;
            this.H = (w8) mh.p1.checkNotNull(w8Var, "clientTransportFactoryBuilder");
            this.f93306i = socketAddress;
            wr.w4 w4Var = new wr.w4();
            w4Var.register(new y8(socketAddress, str));
            this.f93301d = w4Var;
            if (v8Var != null) {
                this.I = v8Var;
            } else {
                this.I = new a9();
            }
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }
}
