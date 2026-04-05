package yr;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import mh.p1;
import wr.e2;
import wr.h5;
import wr.m6;
import wr.n6;
import wr.q1;
import wr.u1;
import xr.c5;
import xr.s4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f94833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f94834c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f94835e;

    public a0(d0 d0Var, CountDownLatch countDownLatch, f fVar) {
        this.f94835e = d0Var;
        this.f94833b = countDownLatch;
        this.f94834c = fVar;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        d0 d0Var;
        c0 c0Var;
        Socket socketB;
        SSLSession session;
        Socket socket;
        try {
            this.f94833b.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        pw.k kVarBuffer = pw.h0.buffer(new z());
        try {
            try {
                try {
                    d0 d0Var2 = this.f94835e;
                    u1 u1Var = d0Var2.R;
                    if (u1Var == null) {
                        socketB = d0Var2.A.createSocket(d0Var2.f94849a.getAddress(), this.f94835e.f94849a.getPort());
                    } else {
                        if (!(u1Var.getProxyAddress() instanceof InetSocketAddress)) {
                            throw m6.f91046n.withDescription("Unsupported SocketAddress implementation " + this.f94835e.R.getProxyAddress().getClass()).asException();
                        }
                        d0 d0Var3 = this.f94835e;
                        socketB = d0.b(d0Var3, d0Var3.R.getTargetAddress(), (InetSocketAddress) this.f94835e.R.getProxyAddress(), this.f94835e.R.getUsername(), this.f94835e.R.getPassword());
                    }
                    Socket socket2 = socketB;
                    d0 d0Var4 = this.f94835e;
                    SSLSocketFactory sSLSocketFactory = d0Var4.B;
                    if (sSLSocketFactory != null) {
                        HostnameVerifier hostnameVerifier = d0Var4.C;
                        String host = d0Var4.f94850b;
                        URI uriAuthorityToUri = c5.authorityToUri(host);
                        if (uriAuthorityToUri.getHost() != null) {
                            host = uriAuthorityToUri.getHost();
                        }
                        SSLSocket sSLSocketUpgrade = a1.upgrade(sSLSocketFactory, hostnameVerifier, socket2, host, this.f94835e.e(), this.f94835e.G);
                        session = sSLSocketUpgrade.getSession();
                        socket = sSLSocketUpgrade;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    pw.k kVarBuffer2 = pw.h0.buffer(pw.h0.source(socket));
                    this.f94834c.a(pw.h0.sink(socket), socket);
                    d0 d0Var5 = this.f94835e;
                    d0Var5.f94869u = d0Var5.f94869u.toBuilder().set(q1.f91097a, socket.getRemoteSocketAddress()).set(q1.f91098b, socket.getLocalSocketAddress()).set(q1.f91099c, session).set(s4.f92979a, session == null ? h5.f90958b : h5.f90959c).build();
                    d0 d0Var6 = this.f94835e;
                    d0Var6.f94868t = new c0(d0Var6, d0Var6.f94855g.newReader(kVarBuffer2, true));
                    synchronized (this.f94835e.f94859k) {
                        try {
                            this.f94835e.D = (Socket) p1.checkNotNull(socket, "socket");
                            if (session != null) {
                                this.f94835e.Q = new e2.c(new e2.i(session));
                            }
                        } finally {
                        }
                    }
                } catch (Exception e10) {
                    this.f94835e.onException(e10);
                    d0Var = this.f94835e;
                    c0Var = new c0(d0Var, d0Var.f94855g.newReader(kVarBuffer, true));
                    d0Var.f94868t = c0Var;
                }
            } catch (n6 e11) {
                d0 d0Var7 = this.f94835e;
                as.a aVar = as.a.INTERNAL_ERROR;
                m6 status = e11.getStatus();
                Map map = d0.T;
                d0Var7.k(0, aVar, status);
                d0Var = this.f94835e;
                c0Var = new c0(d0Var, d0Var.f94855g.newReader(kVarBuffer, true));
                d0Var.f94868t = c0Var;
            }
        } catch (Throwable th2) {
            d0 d0Var8 = this.f94835e;
            d0Var8.f94868t = new c0(d0Var8, d0Var8.f94855g.newReader(kVarBuffer, true));
            throw th2;
        }
    }
}
