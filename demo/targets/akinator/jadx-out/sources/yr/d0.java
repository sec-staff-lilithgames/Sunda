package yr;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.BKC.JzVV;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import mh.p1;
import mh.t2;
import mh.v2;
import rw.hIT.uQjDr;
import sh.n1;
import wr.e2;
import wr.e4;
import wr.h4;
import wr.k4;
import wr.m6;
import wr.n2;
import wr.n6;
import wr.u1;
import xr.a2;
import xr.c5;
import xr.fd;
import xr.ff;
import xr.g9;
import xr.j5;
import xr.l1;
import xr.o5;
import xr.s4;
import xr.te;
import xr.v6;
import xr.w4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d0 implements a2, g, f1 {
    public static final Map T;
    public static final Logger U;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public final HostnameVerifier C;
    public Socket D;
    public int E;
    public final LinkedList F;
    public final zr.c G;
    public v6 H;
    public boolean I;
    public long J;
    public long K;
    public boolean L;
    public final Runnable M;
    public final int N;
    public final ff O;
    public final o5 P;
    public e2.c Q;
    public final u1 R;
    public final int S;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f94849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94850b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94851c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f94852d;

    /* renamed from: e, reason: collision with root package name */
    public final v2 f94853e;

    /* renamed from: f, reason: collision with root package name */
    public final int f94854f;

    /* renamed from: g, reason: collision with root package name */
    public final as.q f94855g;

    /* renamed from: h, reason: collision with root package name */
    public g9 f94856h;

    /* renamed from: i, reason: collision with root package name */
    public h f94857i;

    /* renamed from: j, reason: collision with root package name */
    public g1 f94858j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f94859k;

    /* renamed from: l, reason: collision with root package name */
    public final n2 f94860l;

    /* renamed from: m, reason: collision with root package name */
    public int f94861m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f94862n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f94863o;

    /* renamed from: p, reason: collision with root package name */
    public final fd f94864p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f94865q;

    /* renamed from: r, reason: collision with root package name */
    public final int f94866r;

    /* renamed from: s, reason: collision with root package name */
    public int f94867s;

    /* renamed from: t, reason: collision with root package name */
    public c0 f94868t;

    /* renamed from: u, reason: collision with root package name */
    public wr.c f94869u;

    /* renamed from: v, reason: collision with root package name */
    public m6 f94870v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f94871w;

    /* renamed from: x, reason: collision with root package name */
    public j5 f94872x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f94873y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f94874z;

    static {
        EnumMap enumMap = new EnumMap(as.a.class);
        m6 m6Var = m6.f91046n;
        enumMap.put((EnumMap) as.a.NO_ERROR, (as.a) m6Var.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) as.a.PROTOCOL_ERROR, (as.a) m6Var.withDescription("Protocol error"));
        enumMap.put((EnumMap) as.a.INTERNAL_ERROR, (as.a) m6Var.withDescription(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR));
        enumMap.put((EnumMap) as.a.FLOW_CONTROL_ERROR, (as.a) m6Var.withDescription("Flow control error"));
        enumMap.put((EnumMap) as.a.STREAM_CLOSED, (as.a) m6Var.withDescription("Stream closed"));
        enumMap.put((EnumMap) as.a.FRAME_TOO_LARGE, (as.a) m6Var.withDescription("Frame too large"));
        enumMap.put((EnumMap) as.a.REFUSED_STREAM, (as.a) m6.f91047o.withDescription("Refused stream"));
        enumMap.put((EnumMap) as.a.CANCEL, (as.a) m6.f91038f.withDescription("Cancelled"));
        enumMap.put((EnumMap) as.a.COMPRESSION_ERROR, (as.a) m6Var.withDescription("Compression error"));
        enumMap.put((EnumMap) as.a.CONNECT_ERROR, (as.a) m6Var.withDescription("Connect error"));
        enumMap.put((EnumMap) as.a.ENHANCE_YOUR_CALM, (as.a) m6.f91043k.withDescription("Enhance your calm"));
        enumMap.put((EnumMap) as.a.INADEQUATE_SECURITY, (as.a) m6.f91041i.withDescription("Inadequate security"));
        T = Collections.unmodifiableMap(enumMap);
        U = Logger.getLogger(d0.class.getName());
    }

    public d0(r rVar, InetSocketAddress inetSocketAddress, String str, String str2, wr.c cVar, u1 u1Var, Runnable runnable) {
        w4 w4Var = c5.f92327v;
        as.j jVar = new as.j();
        this.f94852d = new Random();
        Object obj = new Object();
        this.f94859k = obj;
        this.f94862n = new HashMap();
        this.E = 0;
        this.F = new LinkedList();
        this.P = new o5(this, 2);
        this.S = 30000;
        this.f94849a = (InetSocketAddress) p1.checkNotNull(inetSocketAddress, "address");
        this.f94850b = str;
        this.f94866r = rVar.f95003l;
        this.f94854f = rVar.f95008q;
        this.f94863o = (Executor) p1.checkNotNull(rVar.f94995c, "executor");
        this.f94864p = new fd(rVar.f94995c);
        this.f94865q = (ScheduledExecutorService) p1.checkNotNull(rVar.f94997f, "scheduledExecutorService");
        this.f94861m = 3;
        SocketFactory socketFactory = rVar.f94999h;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = rVar.f95000i;
        this.C = rVar.f95001j;
        this.G = (zr.c) p1.checkNotNull(rVar.f95002k, "connectionSpec");
        this.f94853e = (v2) p1.checkNotNull(w4Var, "stopwatchFactory");
        this.f94855g = (as.q) p1.checkNotNull(jVar, "variant");
        this.f94851c = c5.getGrpcUserAgent(OkHttp3Client.NETWORK_CLIENT_OKHTTP, str2);
        this.R = u1Var;
        this.M = (Runnable) p1.checkNotNull(runnable, "tooManyPingsRunnable");
        this.N = rVar.f95010s;
        ff ffVarCreate = rVar.f94998g.create();
        this.O = ffVarCreate;
        this.f94860l = n2.allocate(getClass(), inetSocketAddress.toString());
        this.f94869u = wr.c.newBuilder().set(s4.f92980b, cVar).build();
        synchronized (obj) {
            ffVarCreate.setFlowControlWindowReader(new y(this));
        }
    }

    public static void a(d0 d0Var, String str) {
        as.a aVar = as.a.PROTOCOL_ERROR;
        d0Var.k(0, aVar, o(aVar).augmentDescription(str));
    }

    public static Socket b(d0 d0Var, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws NumberFormatException, IOException, n6 {
        SocketFactory socketFactory = d0Var.A;
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(d0Var.S);
            pw.b1 b1VarSource = pw.h0.source(socketCreateSocket);
            pw.j jVarBuffer = pw.h0.buffer(pw.h0.sink(socketCreateSocket));
            bs.d dVarC = d0Var.c(inetSocketAddress, str, str2);
            bs.b bVarHttpUrl = dVarC.httpUrl();
            Locale locale = Locale.US;
            jVarBuffer.writeUtf8("CONNECT " + bVarHttpUrl.host() + ":" + bVarHttpUrl.port() + " HTTP/1.1").writeUtf8("\r\n");
            int size = dVarC.headers().size();
            for (int i10 = 0; i10 < size; i10++) {
                jVarBuffer.writeUtf8(dVarC.headers().name(i10)).writeUtf8(": ").writeUtf8(dVarC.headers().value(i10)).writeUtf8("\r\n");
            }
            jVarBuffer.writeUtf8("\r\n");
            jVarBuffer.flush();
            zr.q qVar = zr.q.parse(i(b1VarSource));
            while (!i(b1VarSource).equals("")) {
            }
            int i11 = qVar.f98515b;
            if (i11 >= 200 && i11 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            pw.g gVar = new pw.g();
            try {
                socketCreateSocket.shutdownOutput();
                b1VarSource.read(gVar, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            } catch (IOException e10) {
                gVar.writeUtf8("Unable to read body: " + e10.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            Locale locale2 = Locale.US;
            throw m6.f91047o.withDescription("Response returned from proxy was not successful (expected 2xx, got " + qVar.f98515b + " " + qVar.f98516c + "). Response body:\n" + gVar.readUtf8()).asException();
        } catch (IOException e11) {
            if (socketCreateSocket != null) {
                c5.closeQuietly(socketCreateSocket);
            }
            throw m6.f91047o.withDescription("Failed trying to connect with proxy").withCause(e11).asException();
        }
    }

    public static String i(pw.b1 b1Var) throws EOFException {
        pw.g gVar = new pw.g();
        while (b1Var.read(gVar, 1L) != -1) {
            if (gVar.getByte(gVar.size() - 1) == 10) {
                return gVar.readUtf8LineStrict();
            }
        }
        throw new EOFException("\\n not found: " + gVar.readByteString().hex());
    }

    public final void d(int i10, m6 m6Var, l1 l1Var, boolean z10, as.a aVar, e4 e4Var) {
        synchronized (this.f94859k) {
            try {
                x xVar = (x) this.f94862n.remove(Integer.valueOf(i10));
                if (xVar != null) {
                    if (aVar != null) {
                        this.f94857i.rstStream(i10, as.a.CANCEL);
                    }
                    if (m6Var != null) {
                        w wVar = xVar.f95115l;
                        if (e4Var == null) {
                            e4Var = new e4();
                        }
                        wVar.transportReportStatus(m6Var, l1Var, z10, e4Var);
                    }
                    if (!l()) {
                        n();
                        h(xVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int e() {
        URI uriAuthorityToUri = c5.authorityToUri(this.f94850b);
        return uriAuthorityToUri.getPort() != -1 ? uriAuthorityToUri.getPort() : this.f94849a.getPort();
    }

    public final n6 f() {
        synchronized (this.f94859k) {
            try {
                m6 m6Var = this.f94870v;
                if (m6Var != null) {
                    return m6Var.asException();
                }
                return m6.f91047o.withDescription("Connection closed").asException();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f94859k
            monitor-enter(r0)
            int r1 = r2.f94861m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.d0.g(int):boolean");
    }

    @Override // yr.f1
    public e1[] getActiveStreams() {
        e1[] e1VarArr;
        e1 e1Var;
        synchronized (this.f94859k) {
            e1VarArr = new e1[this.f94862n.size()];
            Iterator it = this.f94862n.values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                w wVar = ((x) it.next()).f95115l;
                synchronized (wVar.f95103y) {
                    e1Var = wVar.L;
                }
                e1VarArr[i10] = e1Var;
                i10 = i11;
            }
        }
        return e1VarArr;
    }

    @Override // xr.a2
    public wr.c getAttributes() {
        return this.f94869u;
    }

    @Override // xr.a2, xr.h9, xr.o1, wr.m2, wr.v2
    public n2 getLogId() {
        return this.f94860l;
    }

    @Override // xr.a2, xr.h9, xr.o1, wr.m2
    public n1 getStats() {
        sh.a2 a2VarCreate = sh.a2.create();
        synchronized (this.f94859k) {
            try {
                if (this.D == null) {
                    a2VarCreate.set(new e2.h(this.O.getStats(), null, null, new e2.g.a().build(), null));
                } else {
                    a2VarCreate.set(new e2.h(this.O.getStats(), this.D.getLocalSocketAddress(), this.D.getRemoteSocketAddress(), k1.c(this.D), this.Q));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a2VarCreate;
    }

    public final void h(x xVar) {
        if (this.f94874z && this.F.isEmpty() && this.f94862n.isEmpty()) {
            this.f94874z = false;
            v6 v6Var = this.H;
            if (v6Var != null) {
                v6Var.onTransportIdle();
            }
        }
        if (xVar.shouldBeCountedForInUse()) {
            this.P.updateObjectInUse(xVar, false);
        }
    }

    public final void j() {
        synchronized (this.f94859k) {
            try {
                this.f94857i.connectionPreface();
                as.p pVar = new as.p();
                z0.set(pVar, 7, this.f94854f);
                this.f94857i.settings(pVar);
                if (this.f94854f > 65535) {
                    this.f94857i.windowUpdate(0, r1 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(int i10, as.a aVar, m6 m6Var) {
        synchronized (this.f94859k) {
            try {
                if (this.f94870v == null) {
                    this.f94870v = m6Var;
                    this.f94856h.transportShutdown(m6Var);
                }
                if (aVar != null && !this.f94871w) {
                    this.f94871w = true;
                    this.f94857i.goAway(0, aVar, new byte[0]);
                }
                Iterator it = this.f94862n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i10) {
                        it.remove();
                        ((x) entry.getValue()).f95115l.transportReportStatus(m6Var, l1.f92749c, false, new e4());
                        h((x) entry.getValue());
                    }
                }
                for (x xVar : this.F) {
                    xVar.f95115l.transportReportStatus(m6Var, l1.f92751f, true, new e4());
                    h(xVar);
                }
                this.F.clear();
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l() {
        boolean z10 = false;
        while (true) {
            LinkedList linkedList = this.F;
            if (linkedList.isEmpty() || this.f94862n.size() >= this.E) {
                break;
            }
            m((x) linkedList.poll());
            z10 = true;
        }
        return z10;
    }

    public final void m(x xVar) {
        p1.checkState(xVar.f95115l.M == -1, "StreamId already assigned");
        this.f94862n.put(Integer.valueOf(this.f94861m), xVar);
        if (!this.f94874z) {
            this.f94874z = true;
            v6 v6Var = this.H;
            if (v6Var != null) {
                v6Var.onTransportActive();
            }
        }
        if (xVar.shouldBeCountedForInUse()) {
            this.P.updateObjectInUse(xVar, true);
        }
        xVar.f95115l.start(this.f94861m);
        if ((xVar.getType() != h4.f90954b && xVar.getType() != h4.f90956e) || xVar.f95118o) {
            this.f94857i.flush();
        }
        int i10 = this.f94861m;
        if (i10 < 2147483645) {
            this.f94861m = i10 + 2;
        } else {
            this.f94861m = Integer.MAX_VALUE;
            k(Integer.MAX_VALUE, as.a.NO_ERROR, m6.f91047o.withDescription("Stream ids exhausted"));
        }
    }

    public final void n() throws IOException {
        if (this.f94870v == null || !this.f94862n.isEmpty() || !this.F.isEmpty() || this.f94873y) {
            return;
        }
        this.f94873y = true;
        v6 v6Var = this.H;
        if (v6Var != null) {
            v6Var.onTransportTermination();
        }
        j5 j5Var = this.f94872x;
        if (j5Var != null) {
            j5Var.failed(f());
            this.f94872x = null;
        }
        if (!this.f94871w) {
            this.f94871w = true;
            this.f94857i.goAway(0, as.a.NO_ERROR, new byte[0]);
        }
        this.f94857i.close();
    }

    @Override // yr.g
    public void onException(Throwable th2) {
        p1.checkNotNull(th2, "failureCause");
        k(0, as.a.INTERNAL_ERROR, m6.f91047o.withCause(th2));
    }

    @Override // xr.a2, xr.h9, xr.o1
    public void ping(xr.n1 n1Var, Executor executor) {
        long jNextLong;
        synchronized (this.f94859k) {
            try {
                boolean z10 = true;
                p1.checkState(this.f94857i != null);
                if (this.f94873y) {
                    j5.notifyFailed(n1Var, executor, f());
                    return;
                }
                j5 j5Var = this.f94872x;
                if (j5Var != null) {
                    jNextLong = 0;
                    z10 = false;
                } else {
                    jNextLong = this.f94852d.nextLong();
                    t2 t2Var = (t2) this.f94853e.get();
                    t2Var.start();
                    j5 j5Var2 = new j5(jNextLong, t2Var);
                    this.f94872x = j5Var2;
                    this.O.reportKeepAliveSent();
                    j5Var = j5Var2;
                }
                if (z10) {
                    this.f94857i.ping(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                j5Var.addCallback(n1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.a2, xr.h9
    public void shutdown(m6 m6Var) {
        synchronized (this.f94859k) {
            try {
                if (this.f94870v != null) {
                    return;
                }
                this.f94870v = m6Var;
                this.f94856h.transportShutdown(m6Var);
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.a2, xr.h9
    public void shutdownNow(m6 m6Var) {
        shutdown(m6Var);
        synchronized (this.f94859k) {
            try {
                Iterator it = this.f94862n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((x) entry.getValue()).f95115l.transportReportStatus(m6Var, false, new e4());
                    h((x) entry.getValue());
                }
                for (x xVar : this.F) {
                    xVar.f95115l.transportReportStatus(m6Var, l1.f92751f, true, new e4());
                    h(xVar);
                }
                this.F.clear();
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.a2, xr.h9
    public Runnable start(g9 g9Var) {
        this.f94856h = (g9) p1.checkNotNull(g9Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.I) {
            v6 v6Var = new v6(new v6.a(this), this.f94865q, this.J, this.K, this.L);
            this.H = v6Var;
            v6Var.onTransportStarted();
        }
        f fVar = new f(this.f94864p, this);
        d dVar = new d(fVar, this.f94855g.newWriter(pw.h0.buffer(fVar), true));
        synchronized (this.f94859k) {
            h hVar = new h(this, dVar);
            this.f94857i = hVar;
            this.f94858j = new g1(this, hVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f94864p.execute(new a0(this, countDownLatch, fVar));
        try {
            j();
            countDownLatch.countDown();
            this.f94864p.execute(new b0(this));
            return null;
        } catch (Throwable th2) {
            countDownLatch.countDown();
            throw th2;
        }
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("logId", this.f94860l.getId()).add("address", this.f94849a).toString();
    }

    public static m6 o(as.a aVar) {
        m6 m6Var = (m6) T.get(aVar);
        if (m6Var != null) {
            return m6Var;
        }
        return m6.f91039g.withDescription(JzVV.xDaUKSfvxSNahR + aVar.f7938b);
    }

    public final bs.d c(InetSocketAddress inetSocketAddress, String str, String str2) {
        bs.b bVarBuild = new bs.a().scheme(HttpRequest.DEFAULT_SCHEME).host(inetSocketAddress.getHostName()).port(inetSocketAddress.getPort()).build();
        bs.c cVarHeader = new bs.c().url(bVarBuild).header("Host", bVarBuild.host() + ":" + bVarBuild.port()).header(uQjDr.COiQlBimmHj, this.f94851c);
        if (str != null && str2 != null) {
            cVarHeader.header("Proxy-Authorization", zr.d.basic(str, str2));
        }
        return cVarHeader.build();
    }

    @Override // xr.a2, xr.h9, xr.o1
    public x newStream(k4 k4Var, e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        x xVar;
        p1.checkNotNull(k4Var, "method");
        p1.checkNotNull(e4Var, "headers");
        te teVarNewClientContext = te.newClientContext(uVarArr, getAttributes(), e4Var);
        synchronized (this.f94859k) {
            xVar = new x(k4Var, e4Var, this.f94857i, this, this.f94858j, this.f94859k, this.f94866r, this.f94854f, this.f94850b, this.f94851c, teVarNewClientContext, this.O, iVar);
        }
        return xVar;
    }
}
