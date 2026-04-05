package yr;

import com.amazon.device.ads.DTBMetricReport;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3271ic;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.p1;
import sh.n1;
import wr.b6;
import wr.e2;
import wr.e4;
import wr.j6;
import wr.m6;
import wr.n2;
import wr.u2;
import xr.a5;
import xr.c5;
import xr.fd;
import xr.ff;
import xr.ge;
import xr.gf;
import xr.he;
import xr.l9;
import xr.r6;
import xr.te;
import xr.v6;
import xr.y9;
import xr.yd;
import yr.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 implements ge, g, f1 {
    public static final Logger B = Logger.getLogger(v0.class.getName());
    public static final long C = TimeUnit.SECONDS.toNanos(1);
    public static final pw.l D = pw.l.encodeUtf8(Header.TARGET_METHOD_UTF8);
    public static final pw.l E = pw.l.encodeUtf8("CONNECT");
    public static final pw.l F = pw.l.encodeUtf8(C3271ic.f36944b);
    public static final pw.l G = pw.l.encodeUtf8(Header.TARGET_SCHEME_UTF8);
    public static final pw.l H = pw.l.encodeUtf8(Header.TARGET_PATH_UTF8);
    public static final pw.l I = pw.l.encodeUtf8(Header.TARGET_AUTHORITY_UTF8);
    public static final pw.l J = pw.l.encodeUtf8(DTBMetricReport.CONNECTION);
    public static final pw.l K = pw.l.encodeUtf8("host");
    public static final pw.l L = pw.l.encodeUtf8("te");
    public static final pw.l M = pw.l.encodeUtf8("trailers");
    public static final pw.l N = pw.l.encodeUtf8("content-type");
    public static final pw.l O = pw.l.encodeUtf8("content-length");

    /* renamed from: a, reason: collision with root package name */
    public final a f95056a;

    /* renamed from: c, reason: collision with root package name */
    public final ff f95058c;

    /* renamed from: d, reason: collision with root package name */
    public final n2 f95059d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f95060e;

    /* renamed from: f, reason: collision with root package name */
    public he f95061f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f95062g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f95063h;

    /* renamed from: i, reason: collision with root package name */
    public wr.c f95064i;

    /* renamed from: j, reason: collision with root package name */
    public v6 f95065j;

    /* renamed from: k, reason: collision with root package name */
    public l9 f95066k;

    /* renamed from: l, reason: collision with root package name */
    public ScheduledFuture f95067l;

    /* renamed from: m, reason: collision with root package name */
    public final r6 f95068m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95070o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95071p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95072q;

    /* renamed from: r, reason: collision with root package name */
    public e2.c f95073r;

    /* renamed from: s, reason: collision with root package name */
    public h f95074s;

    /* renamed from: t, reason: collision with root package name */
    public g1 f95075t;

    /* renamed from: v, reason: collision with root package name */
    public int f95077v;

    /* renamed from: x, reason: collision with root package name */
    public m6 f95079x;

    /* renamed from: y, reason: collision with root package name */
    public ScheduledFuture f95080y;

    /* renamed from: z, reason: collision with root package name */
    public ScheduledFuture f95081z;

    /* renamed from: b, reason: collision with root package name */
    public final as.j f95057b = new as.j();

    /* renamed from: n, reason: collision with root package name */
    public final Object f95069n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final TreeMap f95076u = new TreeMap();

    /* renamed from: w, reason: collision with root package name */
    public int f95078w = Integer.MAX_VALUE;
    public Long A = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f95082a;

        /* renamed from: b, reason: collision with root package name */
        public final y9 f95083b;

        /* renamed from: c, reason: collision with root package name */
        public final y9 f95084c;

        /* renamed from: d, reason: collision with root package name */
        public final ff.a f95085d;

        /* renamed from: e, reason: collision with root package name */
        public final k f95086e;

        /* renamed from: f, reason: collision with root package name */
        public final long f95087f;

        /* renamed from: g, reason: collision with root package name */
        public final long f95088g;

        /* renamed from: h, reason: collision with root package name */
        public final int f95089h;

        /* renamed from: i, reason: collision with root package name */
        public final int f95090i;

        /* renamed from: j, reason: collision with root package name */
        public final int f95091j;

        /* renamed from: k, reason: collision with root package name */
        public final long f95092k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f95093l;

        /* renamed from: m, reason: collision with root package name */
        public final long f95094m;

        /* renamed from: n, reason: collision with root package name */
        public final long f95095n;

        /* renamed from: o, reason: collision with root package name */
        public final long f95096o;

        public a(o0 o0Var, List<? extends b6.a> list) {
            this.f95082a = (List) p1.checkNotNull(list, "streamTracerFactories");
            this.f95083b = (y9) p1.checkNotNull(o0Var.f94978e, "transportExecutorPool");
            this.f95084c = (y9) p1.checkNotNull(o0Var.f94979f, "scheduledExecutorServicePool");
            this.f95085d = (ff.a) p1.checkNotNull(o0Var.f94977d, "transportTracerFactory");
            this.f95086e = (k) p1.checkNotNull(o0Var.f94976c, "handshakerSocketFactory");
            this.f95087f = o0Var.f94981h;
            this.f95088g = o0Var.f94982i;
            this.f95089h = o0Var.f94983j;
            this.f95090i = o0Var.f94985l;
            this.f95091j = o0Var.f94984k;
            this.f95092k = o0Var.f94986m;
            this.f95093l = o0Var.f94987n;
            this.f95094m = o0Var.f94988o;
            this.f95095n = o0Var.f94989p;
            this.f95096o = o0Var.f94990q;
        }
    }

    public v0(a aVar, Socket socket) {
        this.f95056a = (a) p1.checkNotNull(aVar, DTBMetricsConfiguration.CONFIG_DIR);
        this.f95060e = (Socket) p1.checkNotNull(socket, "bareSocket");
        ff ffVarCreate = aVar.f95085d.create();
        this.f95058c = ffVarCreate;
        ffVarCreate.setFlowControlWindowReader(new gf() { // from class: yr.t0
            @Override // xr.gf
            public final ff.b read() {
                ff.b bVar;
                v0 v0Var = this.f95053a;
                synchronized (v0Var.f95069n) {
                    bVar = new ff.b(v0Var.f95075t == null ? -1L : r2.windowUpdate(null, 0), (long) (v0Var.f95056a.f95089h * 0.5f));
                }
                return bVar;
            }
        });
        this.f95059d = n2.allocate((Class<?>) v0.class, this.f95060e.getRemoteSocketAddress().toString());
        this.f95062g = (Executor) aVar.f95083b.getObject();
        this.f95063h = (ScheduledExecutorService) aVar.f95084c.getObject();
        this.f95068m = new r6(aVar.f95093l, aVar.f95094m, TimeUnit.NANOSECONDS);
    }

    public static String b(pw.l lVar) {
        for (int i10 = 0; i10 < lVar.size(); i10++) {
            if (lVar.getByte(i10) < 0) {
                return lVar.string(c5.f92308c);
            }
        }
        return lVar.utf8();
    }

    public static int c(List list, pw.l lVar, int i10) {
        while (i10 < list.size()) {
            if (((as.e) list.get(i10)).f7946a.equals(lVar)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void a(as.a aVar, String str, m6 m6Var, boolean z10) {
        synchronized (this.f95069n) {
            try {
                if (this.f95070o) {
                    return;
                }
                this.f95070o = true;
                this.f95079x = m6Var;
                ScheduledFuture scheduledFuture = this.f95080y;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f95080y = null;
                }
                for (Map.Entry entry : this.f95076u.entrySet()) {
                    if (z10) {
                        this.f95074s.rstStream(((Integer) entry.getKey()).intValue(), as.a.CANCEL);
                    }
                    ((y0) entry.getValue()).transportReportStatus(m6Var);
                }
                this.f95076u.clear();
                this.f95074s.goAway(this.f95077v, aVar, str.getBytes(c5.f92308c));
                this.f95078w = this.f95077v;
                this.f95074s.close();
                this.f95081z = this.f95063h.schedule(new s0(this, 0), 1L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Long l9) {
        synchronized (this.f95069n) {
            try {
                if (!this.f95071p && !this.f95070o) {
                    this.f95071p = true;
                    this.A = l9;
                    if (this.f95074s == null) {
                        this.f95072q = true;
                        c5.closeQuietly(this.f95060e);
                    } else {
                        this.f95080y = this.f95063h.schedule(new s0(this, 1), C, TimeUnit.NANOSECONDS);
                        this.f95074s.goAway(Integer.MAX_VALUE, as.a.NO_ERROR, new byte[0]);
                        this.f95074s.ping(false, 0, 4369);
                        this.f95074s.flush();
                    }
                }
            } finally {
            }
        }
    }

    public final void e(int i10, boolean z10) {
        synchronized (this.f95069n) {
            try {
                this.f95076u.remove(Integer.valueOf(i10));
                if (this.f95076u.isEmpty()) {
                    this.f95068m.onTransportIdle();
                    l9 l9Var = this.f95066k;
                    if (l9Var != null) {
                        l9Var.onTransportIdle();
                    }
                }
                if (this.f95071p && this.f95076u.isEmpty()) {
                    this.f95074s.close();
                } else if (z10) {
                    this.f95074s.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f95069n) {
            try {
                ScheduledFuture scheduledFuture = this.f95081z;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f95081z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v6 v6Var = this.f95065j;
        if (v6Var != null) {
            v6Var.onTransportTermination();
        }
        l9 l9Var = this.f95066k;
        if (l9Var != null) {
            l9Var.onTransportTermination();
        }
        ScheduledFuture scheduledFuture2 = this.f95067l;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.f95062g = (Executor) this.f95056a.f95083b.returnObject(this.f95062g);
        this.f95063h = (ScheduledExecutorService) this.f95056a.f95084c.returnObject(this.f95063h);
        ((yd) this.f95061f).transportTerminated();
    }

    public final void g() {
        synchronized (this.f95069n) {
            try {
                ScheduledFuture scheduledFuture = this.f95080y;
                if (scheduledFuture == null) {
                    return;
                }
                scheduledFuture.cancel(false);
                this.f95080y = null;
                this.f95074s.goAway(this.f95077v, as.a.NO_ERROR, new byte[0]);
                this.f95078w = this.f95077v;
                if (this.f95076u.isEmpty()) {
                    this.f95074s.close();
                } else {
                    this.f95074s.flush();
                }
                Long l9 = this.A;
                if (l9 != null) {
                    this.f95081z = this.f95063h.schedule(new s0(this, 0), l9.longValue(), TimeUnit.NANOSECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // yr.f1
    public e1[] getActiveStreams() {
        e1[] e1VarArr;
        synchronized (this.f95069n) {
            try {
                e1VarArr = new e1[this.f95076u.size()];
                Iterator it = this.f95076u.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    e1VarArr[i10] = ((y0) it.next()).getOutboundFlowState();
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e1VarArr;
    }

    @Override // xr.ge, wr.m2, wr.v2
    public n2 getLogId() {
        return this.f95059d;
    }

    @Override // xr.ge
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f95063h;
    }

    @Override // xr.ge, wr.m2
    public n1 getStats() {
        n1 n1VarImmediateFuture;
        synchronized (this.f95069n) {
            n1VarImmediateFuture = sh.b1.immediateFuture(new e2.h(this.f95058c.getStats(), this.f95060e.getLocalSocketAddress(), this.f95060e.getRemoteSocketAddress(), k1.c(this.f95060e), this.f95073r));
        }
        return n1VarImmediateFuture;
    }

    @Override // yr.g
    public void onException(Throwable th2) {
        p1.checkNotNull(th2, "failureCause");
        a(as.a.INTERNAL_ERROR, "I/O failure", m6.f91047o.withCause(th2), false);
    }

    @Override // xr.ge
    public void shutdown() {
        d(null);
    }

    @Override // xr.ge
    public void shutdownNow(m6 m6Var) {
        synchronized (this.f95069n) {
            try {
                if (this.f95074s != null) {
                    a(as.a.NO_ERROR, "", m6Var, true);
                } else {
                    this.f95072q = true;
                    c5.closeQuietly(this.f95060e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void start(he heVar) {
        this.f95061f = (he) p1.checkNotNull(heVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        fd fdVar = new fd(this.f95062g);
        fdVar.execute(new on.z(26, this, fdVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements as.b, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final g0 f95097b;

        /* renamed from: c, reason: collision with root package name */
        public final as.c f95098c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f95099e;

        /* renamed from: f, reason: collision with root package name */
        public int f95100f;

        public b(as.c cVar) {
            Level level = Level.FINE;
            this.f95097b = new g0(v0.class);
            this.f95098c = cVar;
        }

        public final void a(as.a aVar, String str) {
            m6 m6VarWithDescription = a5.statusForCode(aVar.f7938b).withDescription("HTTP2 connection error: " + aVar + " '" + str + "'");
            Logger logger = v0.B;
            v0.this.a(aVar, str, m6VarWithDescription, false);
        }

        public final void b(int i10, boolean z10, int i11, j6 j6Var, String str) {
            e4 e4Var = new e4();
            e4Var.put(u2.f91151b, j6Var.toStatus());
            e4Var.put(u2.f91150a, str);
            List<as.e> listCreateHttpResponseHeaders = l.createHttpResponseHeaders(i11, "text/plain; charset=utf-8", e4Var);
            pw.g gVarWriteUtf8 = new pw.g().writeUtf8(str);
            synchronized (v0.this.f95069n) {
                try {
                    v0 v0Var = v0.this;
                    w0 w0Var = new w0(i10, v0Var.f95069n, v0Var.f95075t, v0Var.f95056a.f95089h);
                    if (v0.this.f95076u.isEmpty()) {
                        v0.this.f95068m.onTransportActive();
                        l9 l9Var = v0.this.f95066k;
                        if (l9Var != null) {
                            l9Var.onTransportActive();
                        }
                    }
                    v0.this.f95076u.put(Integer.valueOf(i10), w0Var);
                    if (z10) {
                        w0Var.inboundDataReceived(new pw.g(), 0, 0, true);
                    }
                    v0.this.f95074s.headers(i10, listCreateHttpResponseHeaders);
                    v0.this.f95075t.data(true, w0Var.getOutboundFlowState(), gVarWriteUtf8, true);
                    v0.this.f95075t.notifyWhenNoPendingData(w0Var.getOutboundFlowState(), new on.z(27, this, w0Var));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c(int i10, as.a aVar, String str) {
            if (aVar == as.a.PROTOCOL_ERROR) {
                v0.B.log(Level.FINE, "Responding with RST_STREAM {0}: {1}", new Object[]{aVar, str});
            }
            synchronized (v0.this.f95069n) {
                try {
                    v0.this.f95074s.rstStream(i10, aVar);
                    v0.this.f95074s.flush();
                    y0 y0Var = (y0) v0.this.f95076u.get(Integer.valueOf(i10));
                    if (y0Var != null) {
                        y0Var.transportReportStatus(m6.f91046n.withDescription("Responded with RST_STREAM " + aVar + ": " + str));
                        v0.this.e(i10, false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // as.b
        public void data(boolean z10, int i10, pw.k kVar, int i11, int i12) throws IOException {
            this.f95097b.b(e0.f94876b, i10, kVar.getBuffer(), i11, z10);
            if (i10 == 0) {
                a(as.a.PROTOCOL_ERROR, "Stream 0 is reserved for control messages. RFC7540 section 5.1.1");
                return;
            }
            if ((i10 & 1) == 0) {
                a(as.a.PROTOCOL_ERROR, "Clients cannot open even numbered streams. RFC7540 section 5.1.1");
                return;
            }
            long j10 = i11;
            kVar.require(j10);
            synchronized (v0.this.f95069n) {
                try {
                    y0 y0Var = (y0) v0.this.f95076u.get(Integer.valueOf(i10));
                    if (y0Var == null) {
                        kVar.skip(j10);
                        c(i10, as.a.STREAM_CLOSED, "Received data for closed stream");
                        return;
                    }
                    if (y0Var.hasReceivedEndOfStream()) {
                        kVar.skip(j10);
                        c(i10, as.a.STREAM_CLOSED, "Received DATA for half-closed (remote) stream. RFC7540 section 5.1");
                        return;
                    }
                    if (y0Var.inboundWindowAvailable() < i12) {
                        kVar.skip(j10);
                        c(i10, as.a.FLOW_CONTROL_ERROR, "Received DATA size exceeded window size. RFC7540 section 6.9");
                        return;
                    }
                    pw.g gVar = new pw.g();
                    gVar.write(kVar.getBuffer(), j10);
                    y0Var.inboundDataReceived(gVar, i11, i12 - i11, z10);
                    int i13 = this.f95100f + i12;
                    this.f95100f = i13;
                    float f10 = i13;
                    v0 v0Var = v0.this;
                    if (f10 >= v0Var.f95056a.f95089h * 0.5f) {
                        synchronized (v0Var.f95069n) {
                            v0.this.f95074s.windowUpdate(0, this.f95100f);
                            v0.this.f95074s.flush();
                        }
                        this.f95100f = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // as.b
        public void goAway(int i10, as.a aVar, pw.l lVar) {
            this.f95097b.c(e0.f94876b, i10, aVar, lVar);
            m6 m6VarWithDescription = a5.statusForCode(aVar.f7938b).withDescription("Received GOAWAY: " + aVar + " '" + lVar.utf8() + "'");
            if (!as.a.NO_ERROR.equals(aVar)) {
                v0.B.log(Level.WARNING, "Received GOAWAY: {0} {1}", new Object[]{aVar, lVar.utf8()});
            }
            synchronized (v0.this.f95069n) {
                v0.this.f95079x = m6VarWithDescription;
            }
        }

        @Override // as.b
        public void headers(boolean z10, boolean z11, int i10, int i11, List<as.e> list, as.f fVar) throws Throwable {
            Object obj;
            v0 v0Var;
            a aVar;
            pw.l lVar;
            int iC;
            this.f95097b.d(e0.f94876b, i10, list, z11);
            if ((i10 & 1) == 0) {
                a(as.a.PROTOCOL_ERROR, "Clients cannot open even numbered streams. RFC7540 section 5.1.1");
                return;
            }
            synchronized (v0.this.f95069n) {
                try {
                    v0 v0Var2 = v0.this;
                    if (i10 > v0Var2.f95078w) {
                        return;
                    }
                    boolean z12 = i10 > v0Var2.f95077v;
                    if (z12) {
                        v0Var2.f95077v = i10;
                    }
                    long size = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        as.e eVar = list.get(i12);
                        size += eVar.f7947b.size() + eVar.f7946a.size() + 32;
                    }
                    int iMin = (int) Math.min(size, 2147483647L);
                    int i13 = v0.this.f95056a.f95091j;
                    if (iMin > i13) {
                        j6 j6Var = j6.RESOURCE_EXHAUSTED;
                        Locale locale = Locale.US;
                        b(i10, z11, 431, j6Var, w0.i.a(i13, iMin, "Request metadata larger than ", ": "));
                        return;
                    }
                    pw.l lVar2 = pw.l.f81912g;
                    int iC2 = 0;
                    while (true) {
                        iC2 = v0.c(list, lVar2, iC2);
                        if (iC2 == -1) {
                            break;
                        } else {
                            list.remove(iC2);
                        }
                    }
                    pw.l lVar3 = null;
                    pw.l lVar4 = null;
                    pw.l lVar5 = null;
                    pw.l lVar6 = null;
                    while (list.size() > 0 && list.get(0).f7946a.getByte(0) == 58) {
                        as.e eVarRemove = list.remove(0);
                        if (v0.D.equals(eVarRemove.f7946a) && lVar3 == null) {
                            lVar3 = eVarRemove.f7947b;
                        } else if (v0.G.equals(eVarRemove.f7946a) && lVar4 == null) {
                            lVar4 = eVarRemove.f7947b;
                        } else if (v0.H.equals(eVarRemove.f7946a) && lVar5 == null) {
                            lVar5 = eVarRemove.f7947b;
                        } else {
                            if (!v0.I.equals(eVarRemove.f7946a) || lVar6 != null) {
                                c(i10, as.a.PROTOCOL_ERROR, "Unexpected pseudo header. RFC7540 section 8.1.2.1");
                                return;
                            }
                            lVar6 = eVarRemove.f7947b;
                        }
                    }
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (list.get(i14).f7946a.getByte(0) == 58) {
                            c(i10, as.a.PROTOCOL_ERROR, "Pseudo header not before regular headers. RFC7540 section 8.1.2.1");
                            return;
                        }
                    }
                    if (!v0.E.equals(lVar3) && z12 && (lVar3 == null || lVar4 == null || lVar5 == null)) {
                        c(i10, as.a.PROTOCOL_ERROR, "Missing required pseudo header. RFC7540 section 8.1.2.3");
                        return;
                    }
                    if (v0.c(list, v0.J, 0) != -1) {
                        c(i10, as.a.PROTOCOL_ERROR, "Connection-specific headers not permitted. RFC7540 section 8.1.2.2");
                        return;
                    }
                    if (!z12) {
                        if (!z11) {
                            c(i10, as.a.PROTOCOL_ERROR, "Headers disallowed in the middle of the stream. RFC7540 section 8.1");
                            return;
                        }
                        synchronized (v0.this.f95069n) {
                            try {
                                y0 y0Var = (y0) v0.this.f95076u.get(Integer.valueOf(i10));
                                if (y0Var == null) {
                                    c(i10, as.a.STREAM_CLOSED, "Received headers for closed stream");
                                    return;
                                } else if (y0Var.hasReceivedEndOfStream()) {
                                    c(i10, as.a.STREAM_CLOSED, "Received HEADERS for half-closed (remote) stream. RFC7540 section 5.1");
                                    return;
                                } else {
                                    y0Var.inboundDataReceived(new pw.g(), 0, 0, true);
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    if (lVar6 == null && (iC = v0.c(list, (lVar = v0.K), 0)) != -1) {
                        if (v0.c(list, lVar, iC + 1) != -1) {
                            b(i10, z11, 400, j6.INTERNAL, "Multiple host headers disallowed. RFC7230 section 5.4");
                            return;
                        }
                        lVar6 = list.get(iC).f7947b;
                    }
                    pw.l lVar7 = lVar6;
                    pw.l lVar8 = v0.K;
                    int iC3 = 0;
                    while (true) {
                        iC3 = v0.c(list, lVar8, iC3);
                        if (iC3 == -1) {
                            break;
                        } else {
                            list.remove(iC3);
                        }
                    }
                    if (lVar5.size() == 0 || lVar5.getByte(0) != 47) {
                        b(i10, z11, 404, j6.UNIMPLEMENTED, "Expected path to start with /: " + v0.b(lVar5));
                        return;
                    }
                    String strSubstring = v0.b(lVar5).substring(1);
                    pw.l lVar9 = v0.N;
                    int iC4 = v0.c(list, lVar9, 0);
                    pw.l lVar10 = (iC4 != -1 && v0.c(list, lVar9, iC4 + 1) == -1) ? list.get(iC4).f7947b : null;
                    if (lVar10 == null) {
                        b(i10, z11, TTAdConstant.VIDEO_COVER_URL_CODE, j6.INTERNAL, "Content-Type is missing or duplicated");
                        return;
                    }
                    String strB = v0.b(lVar10);
                    if (!c5.isGrpcContentType(strB)) {
                        b(i10, z11, TTAdConstant.VIDEO_COVER_URL_CODE, j6.INTERNAL, a.b.k("Content-Type is not supported: ", strB));
                        return;
                    }
                    if (!v0.F.equals(lVar3)) {
                        b(i10, z11, 405, j6.INTERNAL, "HTTP Method is not supported: " + v0.b(lVar3));
                        return;
                    }
                    pw.l lVar11 = v0.L;
                    int iC5 = v0.c(list, lVar11, 0);
                    pw.l lVar12 = (iC5 != -1 && v0.c(list, lVar11, iC5 + 1) == -1) ? list.get(iC5).f7947b : null;
                    pw.l lVar13 = v0.M;
                    if (!lVar13.equals(lVar12)) {
                        j6 j6Var2 = j6.INTERNAL;
                        String strL = e3.g.l("Expected header TE: ", v0.b(lVar13), ", but ", lVar12 == null ? "<missing>" : v0.b(lVar12), " is received. Some intermediate proxy may not support trailers");
                        e4 e4Var = new e4();
                        e4Var.put(u2.f91151b, j6Var2.toStatus());
                        e4Var.put(u2.f91150a, strL);
                        List<as.e> listCreateResponseTrailers = l.createResponseTrailers(e4Var, false);
                        synchronized (v0.this.f95069n) {
                            try {
                                v0.this.f95074s.synReply(true, i10, listCreateResponseTrailers);
                                if (!z11) {
                                    v0.this.f95074s.rstStream(i10, as.a.NO_ERROR);
                                }
                                v0.this.f95074s.flush();
                            } finally {
                            }
                        }
                        return;
                    }
                    pw.l lVar14 = v0.O;
                    int iC6 = 0;
                    while (true) {
                        iC6 = v0.c(list, lVar14, iC6);
                        if (iC6 == -1) {
                            break;
                        } else {
                            list.remove(iC6);
                        }
                    }
                    e4 e4VarConvertHeaders = k1.convertHeaders(list);
                    te teVarNewServerContext = te.newServerContext(v0.this.f95056a.f95082a, strSubstring, e4VarConvertHeaders);
                    Object obj2 = v0.this.f95069n;
                    synchronized (obj2) {
                        try {
                            try {
                                try {
                                    v0Var = v0.this;
                                    aVar = v0Var.f95056a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = obj2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj = obj2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            r0.a aVar2 = new r0.a(v0Var, i10, aVar.f95090i, teVarNewServerContext, v0Var.f95069n, v0Var.f95074s, v0Var.f95075t, aVar.f95089h, v0Var.f95058c, strSubstring);
                            r0 r0Var = new r0(aVar2, v0.this.f95064i, lVar7 == null ? null : v0.b(lVar7), teVarNewServerContext, v0.this.f95058c);
                            if (v0.this.f95076u.isEmpty()) {
                                v0.this.f95068m.onTransportActive();
                                l9 l9Var = v0.this.f95066k;
                                if (l9Var != null) {
                                    l9Var.onTransportActive();
                                }
                            }
                            v0.this.f95076u.put(Integer.valueOf(i10), aVar2);
                            ((yd) v0.this.f95061f).streamCreated(r0Var, strSubstring, e4VarConvertHeaders);
                            aVar2.onStreamAllocated();
                            if (z11) {
                                aVar2.inboundDataReceived(new pw.g(), 0, 0, z11);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // as.b
        public void ping(boolean z10, int i10, int i11) {
            if (!v0.this.f95068m.pingAcceptable()) {
                v0.this.a(as.a.ENHANCE_YOUR_CALM, "too_many_pings", m6.f91043k.withDescription("Too many pings from client"), false);
                return;
            }
            long j10 = (i10 << 32) | (i11 & 4294967295L);
            if (!z10) {
                this.f95097b.e(e0.f94876b, j10);
                synchronized (v0.this.f95069n) {
                    v0.this.f95074s.ping(true, i10, i11);
                    v0.this.f95074s.flush();
                }
                return;
            }
            this.f95097b.f(e0.f94876b, j10);
            if (57005 == j10) {
                return;
            }
            if (4369 == j10) {
                v0.this.g();
                return;
            }
            v0.B.log(Level.INFO, "Received unexpected ping ack: " + j10);
        }

        @Override // as.b
        public void priority(int i10, int i11, int i12, boolean z10) {
            this.f95097b.logPriority(e0.f94876b, i10, i11, i12, z10);
        }

        @Override // as.b
        public void pushPromise(int i10, int i11, List<as.e> list) throws IOException {
            this.f95097b.g(e0.f94876b, i10, i11, list);
            a(as.a.PROTOCOL_ERROR, "PUSH_PROMISE only allowed on peer-initiated streams. RFC7540 section 6.6");
        }

        @Override // as.b
        public void rstStream(int i10, as.a aVar) {
            this.f95097b.h(e0.f94876b, i10, aVar);
            if (!as.a.NO_ERROR.equals(aVar) && !as.a.CANCEL.equals(aVar) && !as.a.STREAM_CLOSED.equals(aVar)) {
                v0.B.log(Level.INFO, "Received RST_STREAM: " + aVar);
            }
            m6 m6VarWithDescription = a5.statusForCode(aVar.f7938b).withDescription("RST_STREAM");
            synchronized (v0.this.f95069n) {
                try {
                    y0 y0Var = (y0) v0.this.f95076u.get(Integer.valueOf(i10));
                    if (y0Var != null) {
                        y0Var.inboundRstReceived(m6VarWithDescription);
                        v0.this.e(i10, false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            InputStream inputStream;
            m6 m6VarWithDescription;
            InputStream inputStream2;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpServerTransport");
            try {
                try {
                    ((as.l) this.f95098c).readConnectionPreface();
                } catch (Throwable th2) {
                    try {
                        v0.B.log(Level.WARNING, "Error decoding HTTP/2 frames", th2);
                        v0.this.a(as.a.INTERNAL_ERROR, "Error in frame decoder", m6.f91046n.withDescription("Error decoding HTTP/2 frames").withCause(th2), false);
                        inputStream = v0.this.f95060e.getInputStream();
                    } catch (Throwable th3) {
                        try {
                            c5.exhaust(v0.this.f95060e.getInputStream());
                        } catch (IOException unused) {
                        }
                        c5.closeQuietly(v0.this.f95060e);
                        v0.this.f();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            } catch (IOException unused2) {
            }
            if (!((as.l) this.f95098c).nextFrame(this)) {
                a(as.a.INTERNAL_ERROR, "Failed to read initial SETTINGS");
                inputStream2 = v0.this.f95060e.getInputStream();
            } else {
                if (this.f95099e) {
                    while (((as.l) this.f95098c).nextFrame(this)) {
                        v6 v6Var = v0.this.f95065j;
                        if (v6Var != null) {
                            v6Var.onDataReceived();
                        }
                    }
                    synchronized (v0.this.f95069n) {
                        m6VarWithDescription = v0.this.f95079x;
                    }
                    if (m6VarWithDescription == null) {
                        m6VarWithDescription = m6.f91047o.withDescription("TCP connection closed or IOException");
                    }
                    v0.this.a(as.a.INTERNAL_ERROR, "I/O failure", m6VarWithDescription, false);
                    inputStream = v0.this.f95060e.getInputStream();
                    c5.exhaust(inputStream);
                    c5.closeQuietly(v0.this.f95060e);
                    v0.this.f();
                    Thread.currentThread().setName(name);
                    return;
                }
                a(as.a.PROTOCOL_ERROR, "First HTTP/2 frame must be SETTINGS. RFC7540 section 3.5");
                inputStream2 = v0.this.f95060e.getInputStream();
            }
            c5.exhaust(inputStream2);
            c5.closeQuietly(v0.this.f95060e);
            v0.this.f();
            Thread.currentThread().setName(name);
        }

        @Override // as.b
        public void settings(boolean z10, as.p pVar) {
            boolean zInitialOutboundWindowSize;
            this.f95097b.i(e0.f94876b, pVar);
            synchronized (v0.this.f95069n) {
                try {
                    if (z0.isSet(pVar, 7)) {
                        zInitialOutboundWindowSize = v0.this.f95075t.initialOutboundWindowSize(z0.get(pVar, 7));
                    } else {
                        zInitialOutboundWindowSize = false;
                    }
                    v0.this.f95074s.ackSettings(pVar);
                    v0.this.f95074s.flush();
                    if (!this.f95099e) {
                        this.f95099e = true;
                        v0 v0Var = v0.this;
                        v0Var.f95064i = ((yd) v0Var.f95061f).transportReady(v0Var.f95064i);
                    }
                    if (zInitialOutboundWindowSize) {
                        v0.this.f95075t.writeStreams();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // as.b
        public void windowUpdate(int i10, long j10) {
            this.f95097b.j(e0.f94876b, i10, j10);
            synchronized (v0.this.f95069n) {
                try {
                    if (i10 == 0) {
                        v0.this.f95075t.windowUpdate(null, (int) j10);
                    } else {
                        y0 y0Var = (y0) v0.this.f95076u.get(Integer.valueOf(i10));
                        if (y0Var != null) {
                            v0.this.f95075t.windowUpdate(y0Var.getOutboundFlowState(), (int) j10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // as.b
        public void ackSettings() {
        }

        @Override // as.b
        public void alternateService(int i10, String str, pw.l lVar, String str2, int i11, long j10) {
        }
    }
}
