package xr;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d4 extends wr.p4 {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f92381s;

    /* renamed from: t, reason: collision with root package name */
    public static final Set f92382t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f92383u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f92384v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f92385w;

    /* renamed from: x, reason: collision with root package name */
    public static final b4 f92386x;

    /* renamed from: y, reason: collision with root package name */
    public static String f92387y;

    /* renamed from: a, reason: collision with root package name */
    public final wr.g5 f92388a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f92389b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile x3 f92390c = x3.f93228b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f92391d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final String f92392e;

    /* renamed from: f, reason: collision with root package name */
    public final String f92393f;

    /* renamed from: g, reason: collision with root package name */
    public final int f92394g;

    /* renamed from: h, reason: collision with root package name */
    public final oe f92395h;

    /* renamed from: i, reason: collision with root package name */
    public final long f92396i;

    /* renamed from: j, reason: collision with root package name */
    public final wr.u6 f92397j;

    /* renamed from: k, reason: collision with root package name */
    public final mh.t2 f92398k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f92399l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92400m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f92401n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f92402o;

    /* renamed from: p, reason: collision with root package name */
    public final p4.c f92403p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f92404q;

    /* renamed from: r, reason: collision with root package name */
    public p4.b f92405r;

    static {
        Logger logger = Logger.getLogger(d4.class.getName());
        f92381s = logger;
        f92382t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f92383u = Boolean.parseBoolean(property);
        f92384v = Boolean.parseBoolean(property2);
        f92385w = Boolean.parseBoolean(property3);
        b4 b4Var = null;
        try {
            try {
                try {
                    b4 b4Var2 = (b4) Class.forName("xr.k6", true, d4.class.getClassLoader()).asSubclass(b4.class).getConstructor(null).newInstance(null);
                    if (b4Var2.unavailabilityCause() != null) {
                        logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", b4Var2.unavailabilityCause());
                    } else {
                        b4Var = b4Var2;
                    }
                } catch (Exception e10) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e10);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e11);
            }
        } catch (ClassCastException e12) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e12);
        } catch (ClassNotFoundException e13) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e13);
        }
        f92386x = b4Var;
    }

    public d4(String str, wr.n4 n4Var, oe oeVar, mh.t2 t2Var, boolean z10) throws NumberFormatException {
        mh.p1.checkNotNull(n4Var, "args");
        this.f92395h = oeVar;
        URI uriCreate = URI.create("//" + ((String) mh.p1.checkNotNull(str, "name")));
        mh.p1.checkArgument(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        this.f92392e = (String) mh.p1.checkNotNull(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f92393f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f92394g = n4Var.getDefaultPort();
        } else {
            this.f92394g = uriCreate.getPort();
        }
        this.f92388a = (wr.g5) mh.p1.checkNotNull(n4Var.getProxyDetector(), "proxyDetector");
        long nanos = 0;
        if (!z10) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j10 = 30;
            if (property != null) {
                try {
                    j10 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f92381s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
        }
        this.f92396i = nanos;
        this.f92398k = (mh.t2) mh.p1.checkNotNull(t2Var, NotificationCompat.CATEGORY_STOPWATCH);
        this.f92397j = (wr.u6) mh.p1.checkNotNull(n4Var.getSynchronizationContext(), "syncContext");
        Executor offloadExecutor = n4Var.getOffloadExecutor();
        this.f92401n = offloadExecutor;
        this.f92402o = offloadExecutor == null;
        this.f92403p = (p4.c) mh.p1.checkNotNull(n4Var.getServiceConfigParser(), "serviceConfigParser");
    }

    public static Map b(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            mh.j3.verify(f92382t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> listOfStrings = o6.getListOfStrings(map, "clientLanguage");
        if (listOfStrings != null && !listOfStrings.isEmpty()) {
            Iterator<String> it = listOfStrings.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase(it.next())) {
                }
            }
            return null;
        }
        Double numberAsDouble = o6.getNumberAsDouble(map, "percentage");
        if (numberAsDouble != null) {
            int iIntValue = numberAsDouble.intValue();
            mh.j3.verify(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", numberAsDouble);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List<String> listOfStrings2 = o6.getListOfStrings(map, "clientHostname");
        if (listOfStrings2 != null && !listOfStrings2.isEmpty()) {
            Iterator<String> it2 = listOfStrings2.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(str)) {
                }
            }
            return null;
        }
        Map<String, ?> object = o6.getObject(map, "serviceConfig");
        if (object != null) {
            return object;
        }
        throw new mh.k3(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList c(List list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object obj = n6.parse(str.substring(12));
                if (!(obj instanceof List)) {
                    throw new ClassCastException(j1.o2.j(obj, "wrong type "));
                }
                arrayList.addAll(o6.checkObjectList((List) obj));
            } else {
                f92381s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    public final androidx.appcompat.app.i1 a() {
        a4 a4VarNewResourceResolver;
        b4 b4Var;
        wr.o4 o4VarFromError;
        String str = this.f92393f;
        androidx.appcompat.app.i1 i1Var = new androidx.appcompat.app.i1();
        try {
            i1Var.f4755b = e();
            if (f92385w) {
                List<String> listResolveTxt = Collections.EMPTY_LIST;
                boolean z10 = false;
                if (f92383u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z10 = f92384v;
                    } else if (!str.contains(":")) {
                        boolean z11 = true;
                        for (int i10 = 0; i10 < str.length(); i10++) {
                            char cCharAt = str.charAt(i10);
                            if (cCharAt != '.') {
                                z11 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z10 = !z11;
                    }
                }
                wr.o4 o4VarFromError2 = null;
                if (z10) {
                    a4VarNewResourceResolver = (a4) this.f92391d.get();
                    if (a4VarNewResourceResolver == null && (b4Var = f92386x) != null) {
                        a4VarNewResourceResolver = b4Var.newResourceResolver();
                    }
                } else {
                    a4VarNewResourceResolver = null;
                }
                Logger logger = f92381s;
                if (a4VarNewResourceResolver != null) {
                    try {
                        listResolveTxt = a4VarNewResourceResolver.resolveTxt("_grpc_config." + str);
                    } catch (Exception e10) {
                        logger.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
                    }
                }
                if (listResolveTxt.isEmpty()) {
                    logger.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f92389b;
                    if (f92387y == null) {
                        try {
                            f92387y = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e11) {
                            throw new RuntimeException(e11);
                        }
                    }
                    String str2 = f92387y;
                    try {
                        Iterator it = c(listResolveTxt).iterator();
                        Map mapB = null;
                        while (it.hasNext()) {
                            try {
                                mapB = b((Map) it.next(), random, str2);
                                if (mapB != null) {
                                    break;
                                }
                            } catch (RuntimeException e12) {
                                o4VarFromError = wr.o4.fromError(wr.m6.f91039g.withDescription("failed to pick service config choice").withCause(e12));
                            }
                        }
                        o4VarFromError = mapB == null ? null : wr.o4.fromConfig(mapB);
                    } catch (IOException | RuntimeException e13) {
                        o4VarFromError = wr.o4.fromError(wr.m6.f91039g.withDescription("failed to parse TXT records").withCause(e13));
                    }
                    if (o4VarFromError != null) {
                        o4VarFromError2 = o4VarFromError.getError() != null ? wr.o4.fromError(o4VarFromError.getError()) : this.f92403p.parseServiceConfig((Map) o4VarFromError.getConfig());
                    }
                }
                i1Var.f4756c = o4VarFromError2;
            }
            return i1Var;
        } catch (Exception e14) {
            i1Var.f4754a = wr.m6.f91047o.withDescription("Unable to resolve host " + str).withCause(e14);
            return i1Var;
        }
    }

    public final void d() {
        if (this.f92404q || this.f92400m) {
            return;
        }
        if (this.f92399l) {
            long j10 = this.f92396i;
            if (j10 != 0 && (j10 <= 0 || this.f92398k.elapsed(TimeUnit.NANOSECONDS) <= j10)) {
                return;
            }
        }
        this.f92404q = true;
        this.f92401n.execute(new z3(this, this.f92405r));
    }

    public final List e() {
        Exception e10 = null;
        try {
            try {
                List<InetAddress> listResolveAddress = this.f92390c.resolveAddress(this.f92393f);
                ArrayList arrayList = new ArrayList(listResolveAddress.size());
                Iterator<InetAddress> it = listResolveAddress.iterator();
                while (it.hasNext()) {
                    arrayList.add(new wr.f1(new InetSocketAddress(it.next(), this.f92394g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e11) {
                e10 = e11;
                mh.g3.throwIfUnchecked(e10);
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            if (e10 != null) {
                f92381s.log(Level.FINE, "Address resolution failure", (Throwable) e10);
            }
            throw th2;
        }
    }

    @Override // wr.p4
    public String getServiceAuthority() {
        return this.f92392e;
    }

    @Override // wr.p4
    public void refresh() {
        mh.p1.checkState(this.f92405r != null, "not started");
        d();
    }

    @Override // wr.p4
    public void shutdown() {
        if (this.f92400m) {
            return;
        }
        this.f92400m = true;
        Executor executor = this.f92401n;
        if (executor == null || !this.f92402o) {
            return;
        }
        this.f92401n = (Executor) qe.release(this.f92395h, executor);
    }

    @Override // wr.p4
    public void start(p4.b bVar) {
        mh.p1.checkState(this.f92405r == null, "already started");
        if (this.f92402o) {
            this.f92401n = (Executor) qe.get(this.f92395h);
        }
        this.f92405r = (p4.b) mh.p1.checkNotNull(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        d();
    }
}
