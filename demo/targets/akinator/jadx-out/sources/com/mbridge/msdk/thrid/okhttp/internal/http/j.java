package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.C3271ic;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.n;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.x;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    private final t f43393a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43394b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.thrid.okhttp.internal.connection.g f43395c;

    /* renamed from: d, reason: collision with root package name */
    private Object f43396d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f43397e;

    public j(t tVar, boolean z10) {
        this.f43393a = tVar;
        this.f43394b = z10;
    }

    public void a() throws IOException {
        this.f43397e = true;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f43395c;
        if (gVar != null) {
            gVar.a();
        }
    }

    public boolean b() {
        return this.f43397e;
    }

    public void a(Object obj) {
        this.f43396d = obj;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        y yVarA;
        w wVarA;
        w wVarD = aVar.d();
        g gVar = (g) aVar;
        com.mbridge.msdk.thrid.okhttp.d dVarE = gVar.e();
        n nVarG = gVar.g();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f43393a.f(), a(wVarD.g()), dVarE, nVarG, this.f43396d);
        this.f43395c = gVar2;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar3 = gVar2;
        int i10 = 0;
        y yVar = null;
        w wVar = wVarD;
        while (!this.f43397e) {
            try {
                try {
                    try {
                        yVarA = gVar.a(wVar, gVar3, null, null);
                        if (yVar != null) {
                            yVarA = yVarA.o().d(yVar.o().a((z) null).a()).a();
                        }
                        try {
                            wVarA = a(yVarA, gVar3.h());
                        } catch (IOException e10) {
                            gVar3.f();
                            throw e10;
                        }
                    } catch (com.mbridge.msdk.thrid.okhttp.internal.connection.e e11) {
                        if (!a(e11.b(), gVar3, false, wVar)) {
                            throw e11.a();
                        }
                    }
                } catch (IOException e12) {
                    if (!a(e12, gVar3, !(e12 instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a), wVar)) {
                        throw e12;
                    }
                }
                if (wVarA == null) {
                    gVar3.f();
                    return yVarA;
                }
                com.mbridge.msdk.thrid.okhttp.internal.c.a(yVarA.d());
                int i11 = i10 + 1;
                if (i11 <= 20) {
                    wVarA.a();
                    if (!a(yVarA, wVarA.g())) {
                        gVar3.f();
                        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar4 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f43393a.f(), a(wVarA.g()), dVarE, nVarG, this.f43396d);
                        this.f43395c = gVar4;
                        yVar = yVarA;
                        gVar3 = gVar4;
                    } else {
                        if (gVar3.b() != null) {
                            throw new IllegalStateException("Closing the body of " + yVarA + " didn't close its backing stream. Bad interceptor?");
                        }
                        yVar = yVarA;
                    }
                    wVar = wVarA;
                    i10 = i11;
                } else {
                    gVar3.f();
                    throw new ProtocolException(a.b.e(i11, "Too many follow-up requests: "));
                }
            } catch (Throwable th2) {
                gVar3.a((IOException) null);
                gVar3.f();
                throw th2;
            }
        }
        gVar3.f();
        throw new IOException("Canceled");
    }

    private com.mbridge.msdk.thrid.okhttp.a a(q qVar) {
        SSLSocketFactory sSLSocketFactoryB;
        HostnameVerifier hostnameVerifierO;
        com.mbridge.msdk.thrid.okhttp.e eVarC;
        if (qVar.h()) {
            sSLSocketFactoryB = this.f43393a.B();
            hostnameVerifierO = this.f43393a.o();
            eVarC = this.f43393a.c();
        } else {
            sSLSocketFactoryB = null;
            hostnameVerifierO = null;
            eVarC = null;
        }
        return new com.mbridge.msdk.thrid.okhttp.a(qVar.g(), qVar.j(), this.f43393a.k(), this.f43393a.A(), sSLSocketFactoryB, hostnameVerifierO, eVarC, this.f43393a.w(), this.f43393a.v(), this.f43393a.u(), this.f43393a.g(), this.f43393a.x());
    }

    private boolean a(IOException iOException, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, boolean z10, w wVar) throws IOException {
        gVar.a(iOException);
        if (this.f43393a.z()) {
            return !(z10 && a(iOException, wVar)) && a(iOException, z10) && gVar.d();
        }
        return false;
    }

    private boolean a(IOException iOException, w wVar) {
        wVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private boolean a(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private w a(y yVar, a0 a0Var) throws IOException {
        String strB;
        q qVarE;
        if (yVar != null) {
            int iK = yVar.k();
            String strE = yVar.r().e();
            if (iK == 307 || iK == 308) {
                if (!strE.equals(C3271ic.f36943a) && !strE.equals("HEAD")) {
                    return null;
                }
            } else {
                if (iK == 401) {
                    return this.f43393a.a().a(a0Var, yVar);
                }
                if (iK == 503) {
                    if ((yVar.p() == null || yVar.p().k() != 503) && a(yVar, Integer.MAX_VALUE) == 0) {
                        return yVar.r();
                    }
                    return null;
                }
                if (iK == 407) {
                    if (a0Var.b().type() == Proxy.Type.HTTP) {
                        return this.f43393a.w().a(a0Var, yVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (iK == 408) {
                    if (!this.f43393a.z()) {
                        return null;
                    }
                    yVar.r().a();
                    if ((yVar.p() == null || yVar.p().k() != 408) && a(yVar, 0) <= 0) {
                        return yVar.r();
                    }
                    return null;
                }
                switch (iK) {
                    case 300:
                    case MRAID_ERROR_VALUE:
                    case INVALID_IFA_STATUS_VALUE:
                    case 303:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.f43393a.m() || (strB = yVar.b("Location")) == null || (qVarE = yVar.r().g().e(strB)) == null) {
                return null;
            }
            if (!qVarE.l().equals(yVar.r().g().l()) && !this.f43393a.n()) {
                return null;
            }
            w.a aVarF = yVar.r().f();
            if (f.a(strE)) {
                boolean zC = f.c(strE);
                if (f.b(strE)) {
                    aVarF.a(C3271ic.f36943a, (x) null);
                } else {
                    aVarF.a(strE, zC ? yVar.r().a() : null);
                }
                if (!zC) {
                    aVarF.a("Transfer-Encoding");
                    aVarF.a("Content-Length");
                    aVarF.a("Content-Type");
                }
            }
            if (!a(yVar, qVarE)) {
                aVarF.a("Authorization");
            }
            return aVarF.a(qVarE).a();
        }
        throw new IllegalStateException();
    }

    private int a(y yVar, int i10) {
        String strB = yVar.b(CommonGatewayClient.HEADER_RETRY_AFTER);
        if (strB == null) {
            return i10;
        }
        if (strB.matches("\\d+")) {
            return Integer.valueOf(strB).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean a(y yVar, q qVar) {
        q qVarG = yVar.r().g();
        return qVarG.g().equals(qVar.g()) && qVarG.j() == qVar.j() && qVarG.l().equals(qVar.l());
    }
}
