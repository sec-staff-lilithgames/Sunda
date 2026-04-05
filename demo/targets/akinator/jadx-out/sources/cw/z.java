package cw;

import com.mbridge.msdk.foundation.download.Command;
import cw.g0;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import xv.n0;
import xv.o0;
import xv.v0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final bw.g f51246a;

    /* renamed from: b, reason: collision with root package name */
    public final w f51247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51248c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51249d;

    /* renamed from: e, reason: collision with root package name */
    public final int f51250e;

    /* renamed from: f, reason: collision with root package name */
    public final int f51251f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51252g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f51253h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f51254i;

    /* renamed from: j, reason: collision with root package name */
    public final xv.a f51255j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f51256k;

    /* renamed from: l, reason: collision with root package name */
    public final h f51257l;

    /* renamed from: m, reason: collision with root package name */
    public g0.b f51258m;

    /* renamed from: n, reason: collision with root package name */
    public g0 f51259n;

    /* renamed from: o, reason: collision with root package name */
    public y0 f51260o;

    /* renamed from: p, reason: collision with root package name */
    public final uu.u f51261p;

    public z(bw.g taskRunner, w connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, xv.a address, c0 routeDatabase, h connectionUser) {
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionPool, "connectionPool");
        kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.e0.checkNotNullParameter(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionUser, "connectionUser");
        this.f51246a = taskRunner;
        this.f51247b = connectionPool;
        this.f51248c = i10;
        this.f51249d = i11;
        this.f51250e = i12;
        this.f51251f = i13;
        this.f51252g = i14;
        this.f51253h = z10;
        this.f51254i = z11;
        this.f51255j = address;
        this.f51256k = routeDatabase;
        this.f51257l = connectionUser;
        this.f51261p = new uu.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d planConnectToRoute$okhttp$default(z zVar, y0 y0Var, List list, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return zVar.planConnectToRoute$okhttp(y0Var, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 planReusePooledConnection$okhttp$default(z zVar, d dVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return zVar.planReusePooledConnection$okhttp(dVar, list);
    }

    @Override // cw.f0
    public xv.a getAddress() {
        return this.f51255j;
    }

    @Override // cw.f0
    public uu.u getDeferredPlans() {
        return this.f51261p;
    }

    @Override // cw.f0
    public boolean hasNext(u uVar) {
        g0 g0Var;
        y0 y0VarRoute;
        if (!getDeferredPlans().isEmpty() || this.f51260o != null) {
            return true;
        }
        if (uVar != null) {
            synchronized (uVar) {
                y0VarRoute = null;
                if (uVar.getRouteFailureCount$okhttp() == 0 && uVar.getNoNewExchanges() && yv.i.canReuseConnectionFor(uVar.route().address().url(), getAddress().url())) {
                    y0VarRoute = uVar.route();
                }
            }
            if (y0VarRoute != null) {
                this.f51260o = y0VarRoute;
                return true;
            }
        }
        g0.b bVar = this.f51258m;
        if ((bVar == null || !bVar.hasNext()) && (g0Var = this.f51259n) != null) {
            return g0Var.hasNext();
        }
        return true;
    }

    @Override // cw.f0
    public boolean isCanceled() {
        return this.f51257l.isCanceled();
    }

    @Override // cw.f0
    public e0 plan() throws IOException {
        Socket socketReleaseConnectionNoEvents;
        boolean z10;
        b0 b0Var;
        u uVarCandidateConnection = this.f51257l.candidateConnection();
        if (uVarCandidateConnection == null) {
            b0Var = null;
        } else {
            boolean zIsHealthy = uVarCandidateConnection.isHealthy(this.f51257l.doExtensiveHealthChecks());
            synchronized (uVarCandidateConnection) {
                try {
                    if (!zIsHealthy) {
                        z10 = !uVarCandidateConnection.getNoNewExchanges();
                        uVarCandidateConnection.setNoNewExchanges(true);
                        socketReleaseConnectionNoEvents = this.f51257l.releaseConnectionNoEvents();
                    } else if (uVarCandidateConnection.getNoNewExchanges() || !sameHostAndPort(uVarCandidateConnection.route().address().url())) {
                        socketReleaseConnectionNoEvents = this.f51257l.releaseConnectionNoEvents();
                        z10 = false;
                    } else {
                        z10 = false;
                        socketReleaseConnectionNoEvents = null;
                    }
                } finally {
                }
            }
            if (this.f51257l.candidateConnection() == null) {
                if (socketReleaseConnectionNoEvents != null) {
                    yv.i.closeQuietly(socketReleaseConnectionNoEvents);
                }
                this.f51257l.connectionReleased(uVarCandidateConnection);
                this.f51257l.connectionConnectionReleased(uVarCandidateConnection);
                if (socketReleaseConnectionNoEvents != null) {
                    this.f51257l.connectionConnectionClosed(uVarCandidateConnection);
                } else if (z10) {
                    this.f51257l.noNewExchanges(uVarCandidateConnection);
                }
                b0Var = null;
            } else {
                if (socketReleaseConnectionNoEvents != null) {
                    throw new IllegalStateException("Check failed.");
                }
                b0Var = new b0(uVarCandidateConnection);
            }
        }
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0VarPlanReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (b0VarPlanReusePooledConnection$okhttp$default != null) {
            return b0VarPlanReusePooledConnection$okhttp$default;
        }
        if (!getDeferredPlans().isEmpty()) {
            return (e0) getDeferredPlans().removeFirst();
        }
        d dVarPlanConnect$okhttp = planConnect$okhttp();
        b0 b0VarPlanReusePooledConnection$okhttp = planReusePooledConnection$okhttp(dVarPlanConnect$okhttp, dVarPlanConnect$okhttp.getRoutes$okhttp());
        return b0VarPlanReusePooledConnection$okhttp != null ? b0VarPlanReusePooledConnection$okhttp : dVarPlanConnect$okhttp;
    }

    public final d planConnect$okhttp() throws IOException {
        y0 y0Var = this.f51260o;
        if (y0Var != null) {
            this.f51260o = null;
            return planConnectToRoute$okhttp$default(this, y0Var, null, 2, null);
        }
        g0.b bVar = this.f51258m;
        if (bVar != null && bVar.hasNext()) {
            return planConnectToRoute$okhttp$default(this, bVar.next(), null, 2, null);
        }
        g0 g0Var = this.f51259n;
        if (g0Var == null) {
            g0Var = new g0(getAddress(), this.f51256k, this.f51257l, this.f51254i);
            this.f51259n = g0Var;
        }
        if (!g0Var.hasNext()) {
            throw new IOException("exhausted all routes");
        }
        g0.b next = g0Var.next();
        this.f51258m = next;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return planConnectToRoute$okhttp(next.next(), next.getRoutes());
    }

    public final d planConnectToRoute$okhttp(y0 route, List<y0> list) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(xv.s.f93822h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strHost = route.address().url().host();
            if (!okhttp3.internal.platform.c.f79515a.get().isCleartextTrafficPermitted(strHost)) {
                throw new UnknownServiceException(a.b.l("CLEARTEXT communication to ", strHost, " not permitted by network security policy"));
            }
        } else if (route.address().protocols().contains(n0.f93763i)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        o0 o0VarAuthenticate = null;
        if (route.requiresTunnel()) {
            o0 o0VarBuild = new o0.a().url(route.address().url()).method("CONNECT", null).header("Host", yv.i.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header(Command.HTTP_HEADER_USER_AGENT, "okhttp/5.1.0").build();
            o0VarAuthenticate = route.address().proxyAuthenticator().authenticate(route, new v0.a().request(o0VarBuild).protocol(n0.f93760f).code(407).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
            if (o0VarAuthenticate == null) {
                o0VarAuthenticate = o0VarBuild;
            }
        }
        return new d(this.f51246a, this.f51247b, this.f51248c, this.f51249d, this.f51250e, this.f51251f, this.f51252g, this.f51253h, this.f51257l, this, route, list, 0, o0VarAuthenticate, -1, false);
    }

    public final b0 planReusePooledConnection$okhttp(d dVar, List<y0> list) throws IOException {
        h hVar = this.f51257l;
        u uVarCallAcquirePooledConnection = this.f51247b.callAcquirePooledConnection(hVar.doExtensiveHealthChecks(), getAddress(), this.f51257l, list, dVar != null && dVar.isReady());
        if (uVarCallAcquirePooledConnection == null) {
            return null;
        }
        if (dVar != null) {
            this.f51260o = dVar.getRoute();
            dVar.closeQuietly();
        }
        hVar.connectionAcquired(uVarCallAcquirePooledConnection);
        hVar.connectionConnectionAcquired(uVarCallAcquirePooledConnection);
        return new b0(uVarCallAcquirePooledConnection);
    }

    @Override // cw.f0
    public boolean sameHostAndPort(xv.g0 url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        xv.g0 g0VarUrl = getAddress().url();
        return url.port() == g0VarUrl.port() && kotlin.jvm.internal.e0.areEqual(url.host(), g0VarUrl.host());
    }
}
