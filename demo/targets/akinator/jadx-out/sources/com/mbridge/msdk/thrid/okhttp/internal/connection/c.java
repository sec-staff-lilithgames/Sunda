package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.g;
import com.mbridge.msdk.thrid.okhttp.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.x;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okio.l;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c extends g.j implements com.mbridge.msdk.thrid.okhttp.g {

    /* renamed from: b, reason: collision with root package name */
    private final h f43327b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f43328c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f43329d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f43330e;

    /* renamed from: f, reason: collision with root package name */
    private o f43331f;

    /* renamed from: g, reason: collision with root package name */
    private u f43332g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g f43333h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.e f43334i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.d f43335j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f43336k;

    /* renamed from: l, reason: collision with root package name */
    public int f43337l;

    /* renamed from: m, reason: collision with root package name */
    public int f43338m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f43339n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f43340o = Long.MAX_VALUE;

    public c(h hVar, a0 a0Var) {
        this.f43327b = hVar;
        this.f43328c = a0Var;
    }

    private w e() throws IOException {
        w wVarA = new w.a().a(this.f43328c.a().k()).a("CONNECT", (x) null).b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43328c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b(Command.HTTP_HEADER_USER_AGENT, com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        w wVarA2 = this.f43328c.a().g().a(this.f43328c, new y.a().a(wVarA).a(u.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.f43289c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return wVarA2 != null ? wVarA2 : wVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r13, int r14, int r15, int r16, boolean r17, com.mbridge.msdk.thrid.okhttp.d r18, com.mbridge.msdk.thrid.okhttp.n r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.c.a(int, int, int, int, boolean, com.mbridge.msdk.thrid.okhttp.d, com.mbridge.msdk.thrid.okhttp.n):void");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.g
    public o b() {
        return this.f43331f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.g
    public a0 c() {
        return this.f43328c;
    }

    public void d() throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43329d);
    }

    public boolean f() {
        return this.f43333h != null;
    }

    public Socket g() {
        return this.f43330e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(this.f43328c.a().k().g());
        sb2.append(":");
        sb2.append(this.f43328c.a().k().j());
        sb2.append(", proxy=");
        sb2.append(this.f43328c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f43328c.d());
        sb2.append(" cipherSuite=");
        o oVar = this.f43331f;
        sb2.append(oVar != null ? oVar.a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f43332g);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    private void a(int i10, int i11, int i12, com.mbridge.msdk.thrid.okhttp.d dVar, n nVar) throws IOException {
        w wVarE = e();
        q qVarG = wVarE.g();
        for (int i13 = 0; i13 < 21; i13++) {
            a(i10, i11, dVar, nVar);
            wVarE = a(i11, i12, wVarE, qVarG);
            if (wVarE == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43329d);
            this.f43329d = null;
            this.f43335j = null;
            this.f43334i = null;
            nVar.connectEnd(dVar, this.f43328c.d(), this.f43328c.b(), null);
        }
    }

    private void a(int i10, int i11, com.mbridge.msdk.thrid.okhttp.d dVar, n nVar) throws IOException {
        Proxy proxyB = this.f43328c.b();
        this.f43329d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f43328c.a().i().createSocket() : new Socket(proxyB);
        nVar.connectStart(dVar, this.f43328c.d(), proxyB);
        this.f43329d.setSoTimeout(i11);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f43329d, this.f43328c.d(), i10);
            try {
                this.f43334i = l.a(l.b(this.f43329d));
                this.f43335j = l.a(l.a(this.f43329d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f43328c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void a(b bVar, int i10, com.mbridge.msdk.thrid.okhttp.d dVar, n nVar) throws Throwable {
        if (this.f43328c.a().j() == null) {
            List<u> listE = this.f43328c.a().e();
            u uVar = u.H2_PRIOR_KNOWLEDGE;
            if (listE.contains(uVar)) {
                this.f43330e = this.f43329d;
                this.f43332g = uVar;
                a(i10);
                return;
            } else {
                this.f43330e = this.f43329d;
                this.f43332g = u.HTTP_1_1;
                return;
            }
        }
        nVar.secureConnectStart(dVar);
        a(bVar);
        nVar.secureConnectEnd(dVar, this.f43331f);
        if (this.f43332g == u.HTTP_2) {
            a(i10);
        }
    }

    private void a(int i10) throws IOException {
        this.f43330e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVarA = new g.h(true).a(this.f43330e, this.f43328c.a().k().g(), this.f43334i, this.f43335j).a(this).a(i10).a();
        this.f43333h = gVarA;
        gVarA.m();
    }

    private void a(b bVar) throws Throwable {
        SSLSocket sSLSocket;
        com.mbridge.msdk.thrid.okhttp.a aVarA = this.f43328c.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) aVarA.j().createSocket(this.f43329d, aVarA.k().g(), aVarA.k().j(), true);
            } catch (AssertionError e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            i iVarA = bVar.a(sSLSocket);
            if (iVarA.c()) {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket, aVarA.k().g(), aVarA.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            o oVarA = o.a(session);
            if (!aVarA.d().verify(aVarA.k().g(), session)) {
                List<Certificate> listB = oVarA.b();
                if (!listB.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) listB.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.e.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified (no certificates)");
            }
            aVarA.a().a(aVarA.k().g(), oVarA.b());
            String strB = iVarA.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket) : null;
            this.f43330e = sSLSocket;
            this.f43334i = l.a(l.b(sSLSocket));
            this.f43335j = l.a(l.a(this.f43330e));
            this.f43331f = oVarA;
            this.f43332g = strB != null ? u.a(strB) : u.HTTP_1_1;
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
        } catch (AssertionError e11) {
            e = e11;
            if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket2);
            throw th;
        }
    }

    private w a(int i10, int i11, w wVar, q qVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(qVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.f43334i, this.f43335j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f43334i.b().a(i10, timeUnit);
            this.f43335j.b().a(i11, timeUnit);
            aVar.a(wVar.c(), str);
            aVar.a();
            y yVarA = aVar.a(false).a(wVar).a();
            long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(yVarA);
            if (jA == -1) {
                jA = 0;
            }
            s sVarB = aVar.b(jA);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(sVarB, Integer.MAX_VALUE, timeUnit);
            sVarB.close();
            int iK = yVarA.k();
            if (iK == 200) {
                if (this.f43334i.a().f() && this.f43335j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iK == 407) {
                w wVarA = this.f43328c.a().g().a(this.f43328c, yVarA);
                if (wVarA != null) {
                    if ("close".equalsIgnoreCase(yVarA.b("Connection"))) {
                        return wVarA;
                    }
                    wVar = wVarA;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + yVarA.k());
            }
        }
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, a0 a0Var) {
        if (this.f43339n.size() >= this.f43338m || this.f43336k || !com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43328c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f43333h == null || a0Var == null) {
            return false;
        }
        Proxy.Type type = a0Var.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f43328c.b().type() != type2 || !this.f43328c.d().equals(a0Var.d()) || a0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.f43644a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(q qVar) {
        if (qVar.j() != this.f43328c.a().k().j()) {
            return false;
        }
        if (qVar.g().equals(this.f43328c.a().k().g())) {
            return true;
        }
        return this.f43331f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.f43644a.a(qVar.g(), (X509Certificate) this.f43331f.b().get(0));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(t tVar, r.a aVar, g gVar) throws SocketException {
        if (this.f43333h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(tVar, aVar, gVar, this.f43333h);
        }
        this.f43330e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t tVarB = this.f43334i.b();
        long jB = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarB.a(jB, timeUnit);
        this.f43335j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(tVar, gVar, this.f43334i, this.f43335j);
    }

    public boolean a(boolean z10) throws SocketException {
        if (this.f43330e.isClosed() || this.f43330e.isInputShutdown() || this.f43330e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.f43333h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f43330e.getSoTimeout();
                try {
                    this.f43330e.setSoTimeout(1);
                    return !this.f43334i.f();
                } finally {
                    this.f43330e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.f43327b) {
            this.f43338m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.g
    public u a() {
        return this.f43332g;
    }
}
