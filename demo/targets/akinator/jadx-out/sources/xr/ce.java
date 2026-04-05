package xr;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import wr.b6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ce extends wr.j5 {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f92337t = Logger.getLogger(ce.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public static final re f92338u = re.forResource(c5.f92325t);

    /* renamed from: v, reason: collision with root package name */
    public static final be f92339v = new be();

    /* renamed from: w, reason: collision with root package name */
    public static final wr.c1 f92340w = wr.c1.getDefaultInstance();

    /* renamed from: x, reason: collision with root package name */
    public static final wr.e0 f92341x = wr.e0.getDefaultInstance();

    /* renamed from: y, reason: collision with root package name */
    public static final long f92342y = TimeUnit.SECONDS.toMillis(120);

    /* renamed from: e, reason: collision with root package name */
    public final ae f92347e;

    /* renamed from: q, reason: collision with root package name */
    public wr.d f92359q;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.l1 f92343a = new androidx.recyclerview.widget.l1(9);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f92344b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f92345c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f92346d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public wr.r1 f92348f = f92339v;

    /* renamed from: g, reason: collision with root package name */
    public y9 f92349g = f92338u;

    /* renamed from: h, reason: collision with root package name */
    public wr.c1 f92350h = f92340w;

    /* renamed from: i, reason: collision with root package name */
    public wr.e0 f92351i = f92341x;

    /* renamed from: j, reason: collision with root package name */
    public long f92352j = f92342y;

    /* renamed from: k, reason: collision with root package name */
    public wr.y0 f92353k = wr.z0.getSystemTicker();

    /* renamed from: l, reason: collision with root package name */
    public boolean f92354l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92355m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92356n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92357o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92358p = true;

    /* renamed from: r, reason: collision with root package name */
    public final wr.e2 f92360r = wr.e2.instance();

    /* renamed from: s, reason: collision with root package name */
    public final u0 f92361s = v0.getDefaultFactory();

    public ce(ae aeVar) {
        this.f92347e = (ae) mh.p1.checkNotNull(aeVar, "clientTransportServersBuilder");
    }

    public static wr.j5 forPort(int i10) {
        throw new UnsupportedOperationException("ClientTransportServersBuilder is required, use a constructor");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    @Override // wr.j5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wr.i5 build() throws java.lang.ClassNotFoundException {
        /*
            r11 = this;
            xr.zd r0 = new xr.zd
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = wr.l2.getServerInterceptors()
            java.util.List r3 = wr.l2.getServerStreamTracerFactories()
            if (r2 == 0) goto L1b
            r1.addAll(r3)
            java.util.ArrayList r3 = r11.f92345c
            r3.addAll(r2)
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r3 = "getServerStreamTracerFactory"
            r4 = 0
            java.lang.String r5 = "Unable to apply census stats"
            java.util.logging.Logger r6 = xr.ce.f92337t
            if (r2 != 0) goto L7b
            boolean r7 = r11.f92354l
            if (r7 == 0) goto L7b
            java.lang.String r7 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Class[] r8 = new java.lang.Class[]{r8, r8, r8}     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r3, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            boolean r8 = r11.f92355m     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            boolean r9 = r11.f92356n     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            boolean r10 = r11.f92357o     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9, r10}     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            java.lang.Object r7 = r7.invoke(r4, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            wr.b6$a r7 = (wr.b6.a) r7     // Catch: java.lang.reflect.InvocationTargetException -> L56 java.lang.IllegalAccessException -> L58 java.lang.NoSuchMethodException -> L5a java.lang.ClassNotFoundException -> L5c
            goto L76
        L56:
            r7 = move-exception
            goto L5e
        L58:
            r7 = move-exception
            goto L64
        L5a:
            r7 = move-exception
            goto L6a
        L5c:
            r7 = move-exception
            goto L70
        L5e:
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r6.log(r8, r5, r7)
            goto L75
        L64:
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r6.log(r8, r5, r7)
            goto L75
        L6a:
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r6.log(r8, r5, r7)
            goto L75
        L70:
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r6.log(r8, r5, r7)
        L75:
            r7 = r4
        L76:
            if (r7 == 0) goto L7b
            r1.add(r7)
        L7b:
            if (r2 != 0) goto Lb7
            boolean r2 = r11.f92358p
            if (r2 == 0) goto Lb7
            java.lang.String r2 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L93 java.lang.IllegalAccessException -> L95 java.lang.NoSuchMethodException -> L97 java.lang.ClassNotFoundException -> L99
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L93 java.lang.IllegalAccessException -> L95 java.lang.NoSuchMethodException -> L97 java.lang.ClassNotFoundException -> L99
            java.lang.Object r2 = r2.invoke(r4, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L93 java.lang.IllegalAccessException -> L95 java.lang.NoSuchMethodException -> L97 java.lang.ClassNotFoundException -> L99
            wr.b6$a r2 = (wr.b6.a) r2     // Catch: java.lang.reflect.InvocationTargetException -> L93 java.lang.IllegalAccessException -> L95 java.lang.NoSuchMethodException -> L97 java.lang.ClassNotFoundException -> L99
            r4 = r2
            goto Lb2
        L93:
            r2 = move-exception
            goto L9b
        L95:
            r2 = move-exception
            goto La1
        L97:
            r2 = move-exception
            goto La7
        L99:
            r2 = move-exception
            goto Lad
        L9b:
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r6.log(r3, r5, r2)
            goto Lb2
        La1:
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r6.log(r3, r5, r2)
            goto Lb2
        La7:
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r6.log(r3, r5, r2)
            goto Lb2
        Lad:
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r6.log(r3, r5, r2)
        Lb2:
            if (r4 == 0) goto Lb7
            r1.add(r4)
        Lb7:
            java.util.ArrayList r2 = r11.f92346d
            r1.addAll(r2)
            r1.trimToSize()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            xr.ae r2 = r11.f92347e
            yr.l0 r2 = (yr.l0) r2
            xr.n5 r1 = r2.buildClientTransportServers(r1)
            wr.u0 r2 = wr.u0.f91142g
            yr.k0 r1 = (yr.k0) r1
            r0.<init>(r11, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.ce.build():wr.i5");
    }

    public wr.e2 getChannelz() {
        return this.f92360r;
    }

    public y9 getExecutorPool() {
        return this.f92349g;
    }

    public void setDeadlineTicker(wr.y0 y0Var) {
        this.f92353k = (wr.y0) mh.p1.checkNotNull(y0Var, "ticker");
    }

    public void setStatsEnabled(boolean z10) {
        this.f92354l = z10;
    }

    public void setStatsRecordFinishedRpcs(boolean z10) {
        this.f92356n = z10;
    }

    public void setStatsRecordRealTimeMetrics(boolean z10) {
        this.f92357o = z10;
    }

    public void setStatsRecordStartedRpcs(boolean z10) {
        this.f92355m = z10;
    }

    public void setTracingEnabled(boolean z10) {
        this.f92358p = z10;
    }

    @Override // wr.j5
    public ce addStreamTracerFactory(b6.a aVar) {
        this.f92346d.add((b6.a) mh.p1.checkNotNull(aVar, "factory"));
        return this;
    }

    @Override // wr.j5
    public ce addTransportFilter(wr.d6 d6Var) {
        this.f92344b.add((wr.d6) mh.p1.checkNotNull(d6Var, "filter"));
        return this;
    }

    @Override // wr.j5
    public ce callExecutor(wr.l5 l5Var) {
        if (mh.p1.checkNotNull(l5Var) == null) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // wr.j5
    public ce compressorRegistry(wr.e0 e0Var) {
        if (e0Var == null) {
            e0Var = f92341x;
        }
        this.f92351i = e0Var;
        return this;
    }

    @Override // wr.j5
    public ce decompressorRegistry(wr.c1 c1Var) {
        if (c1Var == null) {
            c1Var = f92340w;
        }
        this.f92350h = c1Var;
        return this;
    }

    @Override // wr.j5
    public ce directExecutor() {
        return executor(sh.w1.directExecutor());
    }

    @Override // wr.j5
    public ce executor(Executor executor) {
        this.f92349g = executor != null ? new j4(executor) : f92338u;
        return this;
    }

    @Override // wr.j5
    public ce fallbackHandlerRegistry(wr.r1 r1Var) {
        if (r1Var == null) {
            r1Var = f92339v;
        }
        this.f92348f = r1Var;
        return this;
    }

    @Override // wr.j5
    public ce handshakeTimeout(long j10, TimeUnit timeUnit) {
        mh.p1.checkArgument(j10 > 0, "handshake timeout is %s, but must be positive", j10);
        this.f92352j = ((TimeUnit) mh.p1.checkNotNull(timeUnit, "unit")).toMillis(j10);
        return this;
    }

    @Override // wr.j5
    public ce intercept(wr.o5 o5Var) {
        if (mh.p1.checkNotNull(o5Var, "interceptor") != null) {
            throw new ClassCastException();
        }
        this.f92345c.add(null);
        return this;
    }

    @Override // wr.j5
    public ce setBinaryLog(wr.d dVar) {
        this.f92359q = dVar;
        return this;
    }

    @Override // wr.j5
    public ce useTransportSecurity(File file, File file2) {
        throw new UnsupportedOperationException("TLS not supported in ServerImplBuilder");
    }

    @Override // wr.j5
    public ce addService(wr.a6 a6Var) {
        wr.a6 a6Var2 = (wr.a6) mh.p1.checkNotNull(a6Var, NotificationCompat.CATEGORY_SERVICE);
        ((LinkedHashMap) this.f92343a.f7184a).put(a6Var2.getServiceDescriptor().getName(), a6Var2);
        return this;
    }

    @Override // wr.j5
    public ce addService(wr.e eVar) {
        mh.p1.checkNotNull(eVar, "bindableService").getClass();
        throw new ClassCastException();
    }
}
