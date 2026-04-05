package yr;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import mh.p1;
import xr.a2;
import xr.ff;
import xr.q1;
import xr.r1;
import xr.y9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements r1 {

    /* renamed from: b, reason: collision with root package name */
    public final y9 f94994b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f94995c;

    /* renamed from: e, reason: collision with root package name */
    public final y9 f94996e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f94997f;

    /* renamed from: g, reason: collision with root package name */
    public final ff.a f94998g;

    /* renamed from: h, reason: collision with root package name */
    public final SocketFactory f94999h;

    /* renamed from: i, reason: collision with root package name */
    public final SSLSocketFactory f95000i;

    /* renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f95001j;

    /* renamed from: k, reason: collision with root package name */
    public final zr.c f95002k;

    /* renamed from: l, reason: collision with root package name */
    public final int f95003l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f95004m;

    /* renamed from: n, reason: collision with root package name */
    public final long f95005n;

    /* renamed from: o, reason: collision with root package name */
    public final xr.e0 f95006o;

    /* renamed from: p, reason: collision with root package name */
    public final long f95007p;

    /* renamed from: q, reason: collision with root package name */
    public final int f95008q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f95009r;

    /* renamed from: s, reason: collision with root package name */
    public final int f95010s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f95011t;

    public r(y9 y9Var, y9 y9Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, zr.c cVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, ff.a aVar) {
        this.f94994b = y9Var;
        this.f94995c = (Executor) y9Var.getObject();
        this.f94996e = y9Var2;
        this.f94997f = (ScheduledExecutorService) y9Var2.getObject();
        this.f94999h = socketFactory;
        this.f95000i = sSLSocketFactory;
        this.f95001j = hostnameVerifier;
        this.f95002k = cVar;
        this.f95003l = i10;
        this.f95004m = z10;
        this.f95005n = j10;
        this.f95006o = new xr.e0("keepalive time nanos", j10);
        this.f95007p = j11;
        this.f95008q = i11;
        this.f95009r = z11;
        this.f95010s = i12;
        this.f94998g = (ff.a) p1.checkNotNull(aVar, "transportTracerFactory");
    }

    @Override // xr.r1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f95011t) {
            return;
        }
        this.f95011t = true;
        this.f94994b.returnObject(this.f94995c);
        this.f94996e.returnObject(this.f94997f);
    }

    @Override // xr.r1
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f94997f;
    }

    @Override // xr.r1
    public Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes() {
        Logger logger = t.f95032q;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // xr.r1
    public a2 newClientTransport(SocketAddress socketAddress, xr.p1 p1Var, wr.m mVar) {
        if (this.f95011t) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        xr.d0 state = this.f95006o.getState();
        d0 d0Var = new d0(this, (InetSocketAddress) socketAddress, p1Var.getAuthority(), p1Var.getUserAgent(), p1Var.getEagAttributes(), p1Var.getHttpConnectProxiedSocketAddress(), new q(state));
        if (this.f95004m) {
            long j10 = state.get();
            d0Var.I = true;
            d0Var.J = j10;
            d0Var.K = this.f95007p;
            d0Var.L = this.f95009r;
        }
        return d0Var;
    }

    @Override // xr.r1
    public q1 swapChannelCredentials(wr.k kVar) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        s sVarD = t.d(kVar);
        if (sVarD.f95029c != null) {
            return null;
        }
        return new q1(new r(this.f94994b, this.f94996e, this.f94999h, sVarD.f95027a, this.f95001j, this.f95002k, this.f95003l, this.f95004m, this.f95005n, this.f95007p, this.f95008q, this.f95009r, this.f95010s, this.f94998g), sVarD.f95028b);
    }
}
