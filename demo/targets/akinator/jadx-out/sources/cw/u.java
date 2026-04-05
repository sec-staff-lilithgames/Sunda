package cw;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import fw.q;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ow.d;
import pw.d1;
import xv.l0;
import xv.n0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends q.c implements xv.p, dw.f {

    /* renamed from: b, reason: collision with root package name */
    public final bw.g f51208b;

    /* renamed from: c, reason: collision with root package name */
    public final w f51209c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f51210d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f51211e;

    /* renamed from: f, reason: collision with root package name */
    public final Socket f51212f;

    /* renamed from: g, reason: collision with root package name */
    public final xv.e0 f51213g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f51214h;

    /* renamed from: i, reason: collision with root package name */
    public final pw.k f51215i;

    /* renamed from: j, reason: collision with root package name */
    public final pw.j f51216j;

    /* renamed from: k, reason: collision with root package name */
    public final int f51217k;

    /* renamed from: l, reason: collision with root package name */
    public final g f51218l;

    /* renamed from: m, reason: collision with root package name */
    public fw.q f51219m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51220n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51221o;

    /* renamed from: p, reason: collision with root package name */
    public int f51222p;

    /* renamed from: q, reason: collision with root package name */
    public int f51223q;

    /* renamed from: r, reason: collision with root package name */
    public int f51224r;

    /* renamed from: s, reason: collision with root package name */
    public int f51225s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f51226t;

    /* renamed from: u, reason: collision with root package name */
    public long f51227u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final u newTestConnection(bw.g taskRunner, w connectionPool, y0 route, Socket socket, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
            kotlin.jvm.internal.e0.checkNotNullParameter(connectionPool, "connectionPool");
            kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
            kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
            u uVar = new u(taskRunner, connectionPool, route, new Socket(), socket, null, n0.f93762h, pw.h0.buffer(new s()), pw.h0.buffer(new t()), 0, g.f51143a.getNONE());
            uVar.setIdleAtNs(j10);
            return uVar;
        }
    }

    static {
        new a(null);
    }

    public u(bw.g taskRunner, w connectionPool, y0 route, Socket rawSocket, Socket socket, xv.e0 e0Var, n0 protocol, pw.k source, pw.j sink, int i10, g connectionListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionPool, "connectionPool");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(rawSocket, "rawSocket");
        kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
        kotlin.jvm.internal.e0.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionListener, "connectionListener");
        this.f51208b = taskRunner;
        this.f51209c = connectionPool;
        this.f51210d = route;
        this.f51211e = rawSocket;
        this.f51212f = socket;
        this.f51213g = e0Var;
        this.f51214h = protocol;
        this.f51215i = source;
        this.f51216j = sink;
        this.f51217k = i10;
        this.f51218l = connectionListener;
        this.f51225s = 1;
        this.f51226t = new ArrayList();
        this.f51227u = Long.MAX_VALUE;
    }

    @Override // dw.f
    public void cancel() throws IOException {
        yv.i.closeQuietly(this.f51211e);
    }

    public final void connectFailed$okhttp(l0 client, y0 failedRoute, IOException failure) {
        kotlin.jvm.internal.e0.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.e0.checkNotNullParameter(failedRoute, "failedRoute");
        kotlin.jvm.internal.e0.checkNotNullParameter(failure, "failure");
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            xv.a aVarAddress = failedRoute.address();
            aVarAddress.proxySelector().connectFailed(aVarAddress.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase$okhttp().failed(failedRoute);
    }

    public final int getAllocationLimit$okhttp() {
        return this.f51225s;
    }

    public final List<Reference<q>> getCalls() {
        return this.f51226t;
    }

    public final g getConnectionListener$okhttp() {
        return this.f51218l;
    }

    public final w getConnectionPool() {
        return this.f51209c;
    }

    public final long getIdleAtNs() {
        return this.f51227u;
    }

    public final boolean getNoNewExchanges() {
        return this.f51220n;
    }

    @Override // dw.f
    public y0 getRoute() {
        return this.f51210d;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.f51222p;
    }

    public final bw.g getTaskRunner() {
        return this.f51208b;
    }

    @Override // xv.p
    public xv.e0 handshake() {
        return this.f51213g;
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.f51223q++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEligible$okhttp(xv.a r7, java.util.List<xv.y0> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            java.util.TimeZone r0 = yv.i.f96667a
            java.util.ArrayList r0 = r6.f51226t
            int r0 = r0.size()
            int r1 = r6.f51225s
            r2 = 0
            if (r0 >= r1) goto L11b
            boolean r0 = r6.f51220n
            if (r0 == 0) goto L18
            goto L11b
        L18:
            xv.y0 r0 = r6.getRoute()
            xv.a r0 = r0.address()
            boolean r0 = r0.equalsNonHost$okhttp(r7)
            if (r0 != 0) goto L28
            goto L11b
        L28:
            xv.g0 r0 = r7.url()
            java.lang.String r0 = r0.host()
            xv.y0 r1 = r6.route()
            xv.a r1 = r1.address()
            xv.g0 r1 = r1.url()
            java.lang.String r1 = r1.host()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r1)
            r1 = 1
            if (r0 == 0) goto L48
            return r1
        L48:
            fw.q r0 = r6.f51219m
            if (r0 != 0) goto L4e
            goto L11b
        L4e:
            if (r8 == 0) goto L11b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L61
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L61
            goto L11b
        L61:
            java.util.Iterator r8 = r8.iterator()
        L65:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r8.next()
            xv.y0 r0 = (xv.y0) r0
            java.net.Proxy r3 = r0.proxy()
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L65
            xv.y0 r3 = r6.getRoute()
            java.net.Proxy r3 = r3.proxy()
            java.net.Proxy$Type r3 = r3.type()
            if (r3 != r4) goto L65
            xv.y0 r3 = r6.getRoute()
            java.net.InetSocketAddress r3 = r3.socketAddress()
            java.net.InetSocketAddress r0 = r0.socketAddress()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r3, r0)
            if (r0 == 0) goto L65
            javax.net.ssl.HostnameVerifier r8 = r7.hostnameVerifier()
            mw.d r0 = mw.d.f74964b
            if (r8 == r0) goto La7
            goto L11b
        La7:
            xv.g0 r8 = r7.url()
            java.util.TimeZone r3 = yv.i.f96667a
            xv.y0 r3 = r6.getRoute()
            xv.a r3 = r3.address()
            xv.g0 r3 = r3.url()
            int r4 = r8.port()
            int r5 = r3.port()
            if (r4 == r5) goto Lc4
            goto L11b
        Lc4:
            java.lang.String r4 = r8.host()
            java.lang.String r3 = r3.host()
            boolean r3 = kotlin.jvm.internal.e0.areEqual(r4, r3)
            if (r3 == 0) goto Ld3
            goto Lfd
        Ld3:
            boolean r3 = r6.f51221o
            if (r3 != 0) goto L11b
            xv.e0 r3 = r6.f51213g
            if (r3 == 0) goto L11b
            java.util.List r3 = r3.peerCertificates()
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L11b
            java.lang.String r8 = r8.host()
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.e0.checkNotNull(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r8 = r0.verify(r8, r3)
            if (r8 == 0) goto L11b
        Lfd:
            xv.l r8 = r7.certificatePinner()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            kotlin.jvm.internal.e0.checkNotNull(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            xv.g0 r7 = r7.url()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            java.lang.String r7 = r7.host()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            xv.e0 r0 = r6.handshake()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            kotlin.jvm.internal.e0.checkNotNull(r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            java.util.List r0 = r0.peerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            r8.check(r7, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L11b
            return r1
        L11b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cw.u.isEligible$okhttp(xv.a, java.util.List):boolean");
    }

    public final boolean isHealthy(boolean z10) {
        long j10;
        TimeZone timeZone = yv.i.f96667a;
        long jNanoTime = System.nanoTime();
        if (this.f51211e.isClosed() || this.f51212f.isClosed() || this.f51212f.isInputShutdown() || this.f51212f.isOutputShutdown()) {
            return false;
        }
        fw.q qVar = this.f51219m;
        if (qVar != null) {
            return qVar.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f51227u;
        }
        if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z10) {
            return true;
        }
        return yv.i.isHealthy(this.f51212f, this.f51215i);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.f51219m != null;
    }

    public final dw.g newCodec$okhttp(l0 client, dw.k chain) throws SocketException {
        kotlin.jvm.internal.e0.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        fw.q qVar = this.f51219m;
        if (qVar != null) {
            return new fw.u(client, this, chain, qVar);
        }
        this.f51212f.setSoTimeout(chain.readTimeoutMillis());
        pw.k kVar = this.f51215i;
        d1 d1VarTimeout = kVar.timeout();
        long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d1VarTimeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        pw.j jVar = this.f51216j;
        jVar.timeout().timeout(chain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new ew.b(client, this, kVar, jVar);
    }

    public final d.AbstractC0758d newWebSocketStreams$okhttp(i exchange) throws SocketException {
        kotlin.jvm.internal.e0.checkNotNullParameter(exchange, "exchange");
        this.f51212f.setSoTimeout(0);
        noNewExchanges();
        return new v(exchange, this.f51215i, this.f51216j);
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.f51221o = true;
        }
    }

    @Override // dw.f
    public void noNewExchanges() {
        synchronized (this) {
            this.f51220n = true;
        }
        this.f51218l.noNewExchanges(this);
    }

    @Override // fw.q.c
    public void onSettings(fw.q connection, fw.d0 settings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                int i10 = this.f51225s;
                int maxConcurrentStreams = settings.getMaxConcurrentStreams();
                this.f51225s = maxConcurrentStreams;
                if (maxConcurrentStreams < i10) {
                    this.f51209c.scheduleOpener(getRoute().address());
                } else if (maxConcurrentStreams > i10) {
                    this.f51209c.scheduleCloser();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fw.q.c
    public void onStream(fw.x stream) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(stream, "stream");
        stream.close(fw.c.f56127i, null);
    }

    @Override // xv.p
    public n0 protocol() {
        return this.f51214h;
    }

    @Override // xv.p
    public y0 route() {
        return getRoute();
    }

    public final void setIdleAtNs(long j10) {
        this.f51227u = j10;
    }

    public final void setNoNewExchanges(boolean z10) {
        this.f51220n = z10;
    }

    public final void setRouteFailureCount$okhttp(int i10) {
        this.f51222p = i10;
    }

    @Override // xv.p
    public Socket socket() {
        return this.f51212f;
    }

    public final void start() throws IOException {
        this.f51227u = System.nanoTime();
        n0 n0Var = n0.f93762h;
        n0 n0Var2 = this.f51214h;
        if (n0Var2 == n0Var || n0Var2 == n0.f93763i) {
            Socket socket = this.f51212f;
            socket.setSoTimeout(0);
            Object obj = this.f51218l;
            fw.e eVar = obj instanceof fw.e ? (fw.e) obj : null;
            if (eVar == null) {
                eVar = fw.d.f56133a;
            }
            fw.q qVarBuild = new q.a(true, this.f51208b).socket(socket, getRoute().address().url().host(), this.f51215i, this.f51216j).listener(this).pingIntervalMillis(this.f51217k).flowControlListener(eVar).build();
            this.f51219m = qVarBuild;
            this.f51225s = fw.q.F.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
            fw.q.start$default(qVarBuild, false, 1, null);
        }
    }

    public String toString() {
        Object objCipherSuite;
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(getRoute().address().url().host());
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(getRoute().address().url().port());
        sb2.append(", proxy=");
        sb2.append(getRoute().proxy());
        sb2.append(" hostAddress=");
        sb2.append(getRoute().socketAddress());
        sb2.append(" cipherSuite=");
        xv.e0 e0Var = this.f51213g;
        if (e0Var == null || (objCipherSuite = e0Var.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        sb2.append(objCipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.f51214h);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // dw.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trackFailure(cw.q r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof fw.e0     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            fw.e0 r0 = (fw.e0) r0     // Catch: java.lang.Throwable -> L26
            fw.c r0 = r0.f56136b     // Catch: java.lang.Throwable -> L26
            fw.c r2 = fw.c.f56127i     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.f51224r     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f51224r = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.f51220n     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f51220n = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f51222p     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f51222p = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L73
        L28:
            fw.e0 r5 = (fw.e0) r5     // Catch: java.lang.Throwable -> L26
            fw.c r5 = r5.f56136b     // Catch: java.lang.Throwable -> L26
            fw.c r0 = fw.c.f56128j     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.isCanceled()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.f51220n     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f51220n = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f51222p     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f51222p = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof fw.a     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.f51220n     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.f51220n = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.f51223q     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            xv.l0 r4 = r4.getClient()     // Catch: java.lang.Throwable -> L26
            xv.y0 r2 = r3.getRoute()     // Catch: java.lang.Throwable -> L26
            r3.connectFailed$okhttp(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.f51222p     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f51222p = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            monitor-exit(r3)
            if (r4 == 0) goto L72
            cw.g r4 = r3.f51218l
            r4.noNewExchanges(r3)
        L72:
            return
        L73:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cw.u.trackFailure(cw.q, java.io.IOException):void");
    }
}
