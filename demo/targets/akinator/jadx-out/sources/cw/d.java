package cw;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import pw.d1;
import sv.k0;
import xv.e0;
import xv.n0;
import xv.o0;
import xv.v0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements e0, dw.f {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f51115y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final bw.g f51116a;

    /* renamed from: b, reason: collision with root package name */
    public final w f51117b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51119d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51120e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51121f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51122g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f51123h;

    /* renamed from: i, reason: collision with root package name */
    public final h f51124i;

    /* renamed from: j, reason: collision with root package name */
    public final z f51125j;

    /* renamed from: k, reason: collision with root package name */
    public final y0 f51126k;

    /* renamed from: l, reason: collision with root package name */
    public final List f51127l;

    /* renamed from: m, reason: collision with root package name */
    public final int f51128m;

    /* renamed from: n, reason: collision with root package name */
    public final o0 f51129n;

    /* renamed from: o, reason: collision with root package name */
    public final int f51130o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f51131p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f51132q;

    /* renamed from: r, reason: collision with root package name */
    public Socket f51133r;

    /* renamed from: s, reason: collision with root package name */
    public Socket f51134s;

    /* renamed from: t, reason: collision with root package name */
    public xv.e0 f51135t;

    /* renamed from: u, reason: collision with root package name */
    public n0 f51136u;

    /* renamed from: v, reason: collision with root package name */
    public pw.k f51137v;

    /* renamed from: w, reason: collision with root package name */
    public pw.j f51138w;

    /* renamed from: x, reason: collision with root package name */
    public u f51139x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public d(bw.g taskRunner, w connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, h user, z routePlanner, y0 route, List<y0> list, int i15, o0 o0Var, int i16, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionPool, "connectionPool");
        kotlin.jvm.internal.e0.checkNotNullParameter(user, "user");
        kotlin.jvm.internal.e0.checkNotNullParameter(routePlanner, "routePlanner");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        this.f51116a = taskRunner;
        this.f51117b = connectionPool;
        this.f51118c = i10;
        this.f51119d = i11;
        this.f51120e = i12;
        this.f51121f = i13;
        this.f51122g = i14;
        this.f51123h = z10;
        this.f51124i = user;
        this.f51125j = routePlanner;
        this.f51126k = route;
        this.f51127l = list;
        this.f51128m = i15;
        this.f51129n = o0Var;
        this.f51130o = i16;
        this.f51131p = z11;
    }

    public static d c(d dVar, int i10, o0 o0Var, int i11, boolean z10, int i12) {
        return new d(dVar.f51116a, dVar.f51117b, dVar.f51118c, dVar.f51119d, dVar.f51120e, dVar.f51121f, dVar.f51122g, dVar.f51123h, dVar.f51124i, dVar.f51125j, dVar.getRoute(), dVar.f51127l, (i12 & 1) != 0 ? dVar.f51128m : i10, (i12 & 2) != 0 ? dVar.f51129n : o0Var, (i12 & 4) != 0 ? dVar.f51130o : i11, (i12 & 8) != 0 ? dVar.f51131p : z10);
    }

    public final void a() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().proxy().type();
        int i10 = type == null ? -1 : e.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = getRoute().address().socketFactory().createSocket();
            kotlin.jvm.internal.e0.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(getRoute().proxy());
        }
        this.f51133r = socketCreateSocket;
        if (this.f51132q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f51121f);
        try {
            okhttp3.internal.platform.c.f79515a.get().connectSocket(socketCreateSocket, getRoute().socketAddress(), this.f51120e);
            try {
                this.f51137v = pw.h0.buffer(pw.h0.source(socketCreateSocket));
                this.f51138w = pw.h0.buffer(pw.h0.sink(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (kotlin.jvm.internal.e0.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void b(SSLSocket sSLSocket, xv.s sVar) throws IOException {
        xv.a aVarAddress = getRoute().address();
        try {
            if (sVar.supportsTlsExtensions()) {
                okhttp3.internal.platform.c.f79515a.get().configureTlsExtensions(sSLSocket, aVarAddress.url().host(), aVarAddress.protocols());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            e0.a aVar = xv.e0.f93614e;
            kotlin.jvm.internal.e0.checkNotNull(session);
            xv.e0 e0Var = aVar.get(session);
            HostnameVerifier hostnameVerifier = aVarAddress.hostnameVerifier();
            kotlin.jvm.internal.e0.checkNotNull(hostnameVerifier);
            if (hostnameVerifier.verify(aVarAddress.url().host(), session)) {
                xv.l lVarCertificatePinner = aVarAddress.certificatePinner();
                kotlin.jvm.internal.e0.checkNotNull(lVarCertificatePinner);
                xv.e0 e0Var2 = new xv.e0(e0Var.tlsVersion(), e0Var.cipherSuite(), e0Var.localCertificates(), new com.moloco.sdk.internal.ilrd.j(lVarCertificatePinner, 1, e0Var, aVarAddress));
                this.f51135t = e0Var2;
                lVarCertificatePinner.check$okhttp(aVarAddress.url().host(), new a1.e(e0Var2, 21));
                String selectedProtocol = sVar.supportsTlsExtensions() ? okhttp3.internal.platform.c.f79515a.get().getSelectedProtocol(sSLSocket) : null;
                this.f51134s = sSLSocket;
                this.f51137v = pw.h0.buffer(pw.h0.source(sSLSocket));
                this.f51138w = pw.h0.buffer(pw.h0.sink(sSLSocket));
                this.f51136u = selectedProtocol != null ? n0.f93758c.get(selectedProtocol) : n0.f93760f;
                okhttp3.internal.platform.c.f79515a.get().afterHandshake(sSLSocket);
                return;
            }
            List<Certificate> listPeerCertificates = e0Var.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVarAddress.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = listPeerCertificates.get(0);
            kotlin.jvm.internal.e0.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(sv.d0.trimMargin$default("\n            |Hostname " + aVarAddress.url().host() + " not verified:\n            |    certificate: " + xv.l.f93694c.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + mw.d.f74964b.allSubjectAltNames(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th2) {
            okhttp3.internal.platform.c.f79515a.get().afterHandshake(sSLSocket);
            yv.i.closeQuietly(sSLSocket);
            throw th2;
        }
    }

    @Override // cw.e0
    /* renamed from: cancel */
    public void mo3673cancel() throws IOException {
        this.f51132q = true;
        Socket socket = this.f51133r;
        if (socket != null) {
            yv.i.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.f51134s;
        if (socket != null) {
            yv.i.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    @Override // cw.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cw.d0 connectTcp() throws java.lang.Throwable {
        /*
            r15 = this;
            java.net.Socket r0 = r15.f51133r
            if (r0 != 0) goto La5
            cw.h r1 = r15.f51124i
            r1.addPlanToCancel(r15)
            r2 = 0
            xv.y0 r0 = r15.getRoute()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r1.connectStart(r0)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r15.a()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r2 = 1
            cw.d0 r3 = new cw.d0     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r4 = r15
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
            r1.removePlanToCancel(r15)
            return r3
        L23:
            r0 = move-exception
            goto L98
        L26:
            r0 = move-exception
        L27:
            r12 = r0
            goto L2f
        L29:
            r0 = move-exception
            r4 = r15
            goto L98
        L2c:
            r0 = move-exception
            r4 = r15
            goto L27
        L2f:
            xv.y0 r0 = r15.getRoute()     // Catch: java.lang.Throwable -> L23
            xv.a r0 = r0.address()     // Catch: java.lang.Throwable -> L23
            java.net.Proxy r0 = r0.proxy()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L78
            xv.y0 r0 = r15.getRoute()     // Catch: java.lang.Throwable -> L23
            java.net.Proxy r0 = r0.proxy()     // Catch: java.lang.Throwable -> L23
            java.net.Proxy$Type r0 = r0.type()     // Catch: java.lang.Throwable -> L23
            java.net.Proxy$Type r3 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L23
            if (r0 == r3) goto L78
            xv.y0 r0 = r15.getRoute()     // Catch: java.lang.Throwable -> L23
            xv.a r0 = r0.address()     // Catch: java.lang.Throwable -> L23
            java.net.ProxySelector r0 = r0.proxySelector()     // Catch: java.lang.Throwable -> L23
            xv.y0 r3 = r15.getRoute()     // Catch: java.lang.Throwable -> L23
            xv.a r3 = r3.address()     // Catch: java.lang.Throwable -> L23
            xv.g0 r3 = r3.url()     // Catch: java.lang.Throwable -> L23
            java.net.URI r3 = r3.uri()     // Catch: java.lang.Throwable -> L23
            xv.y0 r5 = r15.getRoute()     // Catch: java.lang.Throwable -> L23
            java.net.Proxy r5 = r5.proxy()     // Catch: java.lang.Throwable -> L23
            java.net.SocketAddress r5 = r5.address()     // Catch: java.lang.Throwable -> L23
            r0.connectFailed(r3, r5, r12)     // Catch: java.lang.Throwable -> L23
        L78:
            xv.y0 r0 = r15.getRoute()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r1.connectFailed(r0, r3, r12)     // Catch: java.lang.Throwable -> L23
            cw.d0 r9 = new cw.d0     // Catch: java.lang.Throwable -> L23
            r13 = 2
            r14 = 0
            r11 = 0
            r10 = r4
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L96
            r1.removePlanToCancel(r15)
            if (r2 != 0) goto L95
            java.net.Socket r0 = r4.f51133r
            if (r0 == 0) goto L95
            yv.i.closeQuietly(r0)
        L95:
            return r9
        L96:
            r0 = move-exception
            r4 = r10
        L98:
            r1.removePlanToCancel(r15)
            if (r2 != 0) goto La4
            java.net.Socket r1 = r4.f51133r
            if (r1 == 0) goto La4
            yv.i.closeQuietly(r1)
        La4:
            throw r0
        La5:
            r4 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TCP already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cw.d.connectTcp():cw.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
    @Override // cw.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cw.d0 connectTlsEtc() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw.d.connectTlsEtc():cw.d0");
    }

    public final d0 connectTunnel$okhttp() throws IOException {
        o0 o0Var;
        o0 o0Var2 = this.f51129n;
        kotlin.jvm.internal.e0.checkNotNull(o0Var2);
        String str = "CONNECT " + yv.i.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            pw.k kVar = this.f51137v;
            if (kVar == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("source");
                kVar = null;
            }
            pw.j jVar = this.f51138w;
            if (jVar == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("sink");
                jVar = null;
            }
            ew.b bVar = new ew.b(null, this, kVar, jVar);
            pw.k kVar2 = this.f51137v;
            if (kVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("source");
                kVar2 = null;
            }
            d1 d1VarTimeout = kVar2.timeout();
            long j10 = this.f51118c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            d1VarTimeout.timeout(j10, timeUnit);
            pw.j jVar2 = this.f51138w;
            if (jVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("sink");
                jVar2 = null;
            }
            jVar2.timeout().timeout(this.f51119d, timeUnit);
            bVar.writeRequest(o0Var2.headers(), str);
            bVar.finishRequest();
            v0.a responseHeaders = bVar.readResponseHeaders(false);
            kotlin.jvm.internal.e0.checkNotNull(responseHeaders);
            v0 v0VarBuild = responseHeaders.request(o0Var2).build();
            bVar.skipConnectBody(v0VarBuild);
            int iCode = v0VarBuild.code();
            if (iCode == 200) {
                o0Var = null;
                break;
            }
            if (iCode != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + v0VarBuild.code());
            }
            o0 o0VarAuthenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), v0VarBuild);
            if (o0VarAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (k0.equals("close", v0.header$default(v0VarBuild, "Connection", null, 2, null), true)) {
                o0Var = o0VarAuthenticate;
                break;
            }
            o0Var2 = o0VarAuthenticate;
        }
        if (o0Var == null) {
            return new d0(this, null, null, 6, null);
        }
        Socket socket = this.f51133r;
        if (socket != null) {
            yv.i.closeQuietly(socket);
        }
        int i10 = 1 + this.f51128m;
        h hVar = this.f51124i;
        if (i10 < 21) {
            hVar.callConnectEnd(getRoute(), null);
            return new d0(this, c(this, i10, o0Var, 0, false, 12), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        hVar.connectFailed(getRoute(), null, protocolException);
        return new d0(this, null, protocolException, 2, null);
    }

    public final int getConnectionSpecIndex$okhttp() {
        return this.f51130o;
    }

    @Override // dw.f
    public y0 getRoute() {
        return this.f51126k;
    }

    public final List<y0> getRoutes$okhttp() {
        return this.f51127l;
    }

    public final Socket getSocket$okhttp() {
        return this.f51134s;
    }

    @Override // cw.e0
    public u handleSuccess() throws IOException {
        this.f51124i.updateRouteDatabaseAfterSuccess(getRoute());
        u uVar = this.f51139x;
        kotlin.jvm.internal.e0.checkNotNull(uVar);
        this.f51124i.connectionConnectEnd(uVar, getRoute());
        b0 b0VarPlanReusePooledConnection$okhttp = this.f51125j.planReusePooledConnection$okhttp(this, this.f51127l);
        if (b0VarPlanReusePooledConnection$okhttp != null) {
            return b0VarPlanReusePooledConnection$okhttp.getConnection();
        }
        synchronized (uVar) {
            this.f51117b.put(uVar);
            this.f51124i.acquireConnectionNoEvents(uVar);
        }
        this.f51124i.connectionAcquired(uVar);
        this.f51124i.connectionConnectionAcquired(uVar);
        return uVar;
    }

    @Override // cw.e0
    public boolean isReady() {
        return this.f51136u != null;
    }

    public final boolean isTlsFallback$okhttp() {
        return this.f51131p;
    }

    public final d nextConnectionSpec$okhttp(List<xv.s> connectionSpecs, SSLSocket sslSocket) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.e0.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f51130o;
        int size = connectionSpecs.size();
        for (int i11 = i10 + 1; i11 < size; i11++) {
            if (connectionSpecs.get(i11).isCompatible(sslSocket)) {
                return c(this, 0, null, i11, i10 != -1, 3);
            }
        }
        return null;
    }

    public final d planWithCurrentOrInitialConnectionSpec$okhttp(List<xv.s> connectionSpecs, SSLSocket sslSocket) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.e0.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f51130o != -1) {
            return this;
        }
        d dVarNextConnectionSpec$okhttp = nextConnectionSpec$okhttp(connectionSpecs, sslSocket);
        if (dVarNextConnectionSpec$okhttp != null) {
            return dVarNextConnectionSpec$okhttp;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f51131p);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        kotlin.jvm.internal.e0.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // cw.e0
    public e0 retry() {
        return new d(this.f51116a, this.f51117b, this.f51118c, this.f51119d, this.f51120e, this.f51121f, this.f51122g, this.f51123h, this.f51124i, this.f51125j, getRoute(), this.f51127l, this.f51128m, this.f51129n, this.f51130o, this.f51131p);
    }

    public final void setSocket$okhttp(Socket socket) {
        this.f51134s = socket;
    }

    @Override // dw.f
    public void trackFailure(q call, IOException iOException) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    @Override // dw.f
    public void noNewExchanges() {
    }
}
