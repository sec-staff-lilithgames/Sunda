package xv;

import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j$.time.Duration;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import mw.c;
import okhttp3.internal.platform.c;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l0 implements i, d1 {
    public static final b H = new b(null);
    public static final List I = yv.i.immutableListOf(n0.f93762h, n0.f93760f);
    public static final List J = yv.i.immutableListOf(s.f93821g, s.f93822h);
    public final int A;
    public final int B;
    public final int C;
    public final long D;
    public final cw.c0 E;
    public final bw.g F;
    public final r G;

    /* renamed from: a, reason: collision with root package name */
    public final x f93702a;

    /* renamed from: b, reason: collision with root package name */
    public final List f93703b;

    /* renamed from: c, reason: collision with root package name */
    public final List f93704c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f93705d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93706e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93707f;

    /* renamed from: g, reason: collision with root package name */
    public final c f93708g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f93709h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f93710i;

    /* renamed from: j, reason: collision with root package name */
    public final v f93711j;

    /* renamed from: k, reason: collision with root package name */
    public final e f93712k;

    /* renamed from: l, reason: collision with root package name */
    public final z f93713l;

    /* renamed from: m, reason: collision with root package name */
    public final Proxy f93714m;

    /* renamed from: n, reason: collision with root package name */
    public final ProxySelector f93715n;

    /* renamed from: o, reason: collision with root package name */
    public final c f93716o;

    /* renamed from: p, reason: collision with root package name */
    public final SocketFactory f93717p;

    /* renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f93718q;

    /* renamed from: r, reason: collision with root package name */
    public final X509TrustManager f93719r;

    /* renamed from: s, reason: collision with root package name */
    public final List f93720s;

    /* renamed from: t, reason: collision with root package name */
    public final List f93721t;

    /* renamed from: u, reason: collision with root package name */
    public final HostnameVerifier f93722u;

    /* renamed from: v, reason: collision with root package name */
    public final l f93723v;

    /* renamed from: w, reason: collision with root package name */
    public final mw.c f93724w;

    /* renamed from: x, reason: collision with root package name */
    public final int f93725x;

    /* renamed from: y, reason: collision with root package name */
    public final int f93726y;

    /* renamed from: z, reason: collision with root package name */
    public final int f93727z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public long E;
        public cw.c0 F;
        public bw.g G;

        /* renamed from: a, reason: collision with root package name */
        public x f93728a;

        /* renamed from: b, reason: collision with root package name */
        public r f93729b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f93730c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f93731d;

        /* renamed from: e, reason: collision with root package name */
        public c0 f93732e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f93733f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f93734g;

        /* renamed from: h, reason: collision with root package name */
        public c f93735h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f93736i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f93737j;

        /* renamed from: k, reason: collision with root package name */
        public v f93738k;

        /* renamed from: l, reason: collision with root package name */
        public e f93739l;

        /* renamed from: m, reason: collision with root package name */
        public z f93740m;

        /* renamed from: n, reason: collision with root package name */
        public Proxy f93741n;

        /* renamed from: o, reason: collision with root package name */
        public ProxySelector f93742o;

        /* renamed from: p, reason: collision with root package name */
        public c f93743p;

        /* renamed from: q, reason: collision with root package name */
        public SocketFactory f93744q;

        /* renamed from: r, reason: collision with root package name */
        public SSLSocketFactory f93745r;

        /* renamed from: s, reason: collision with root package name */
        public X509TrustManager f93746s;

        /* renamed from: t, reason: collision with root package name */
        public List f93747t;

        /* renamed from: u, reason: collision with root package name */
        public List f93748u;

        /* renamed from: v, reason: collision with root package name */
        public HostnameVerifier f93749v;

        /* renamed from: w, reason: collision with root package name */
        public l f93750w;

        /* renamed from: x, reason: collision with root package name */
        public mw.c f93751x;

        /* renamed from: y, reason: collision with root package name */
        public int f93752y;

        /* renamed from: z, reason: collision with root package name */
        public int f93753z;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: xv.l0$a$a, reason: collision with other inner class name */
        public static final class C0809a implements i0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kv.l f93754a;

            public C0809a(kv.l lVar) {
                this.f93754a = lVar;
            }

            @Override // xv.i0
            public final v0 intercept(h0 chain) {
                kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
                return (v0) this.f93754a.invoke(chain);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b implements i0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kv.l f93755a;

            public b(kv.l lVar) {
                this.f93755a = lVar;
            }

            @Override // xv.i0
            public final v0 intercept(h0 chain) {
                kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
                return (v0) this.f93755a.invoke(chain);
            }
        }

        public a() {
            this.f93728a = new x();
            this.f93730c = new ArrayList();
            this.f93731d = new ArrayList();
            this.f93732e = yv.i.asFactory(b0.f93576a);
            this.f93733f = true;
            this.f93734g = true;
            xv.b bVar = c.f93577a;
            this.f93735h = bVar;
            this.f93736i = true;
            this.f93737j = true;
            this.f93738k = v.f93862a;
            this.f93740m = z.f93911a;
            this.f93743p = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
            this.f93744q = socketFactory;
            b bVar2 = l0.H;
            this.f93747t = bVar2.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.f93748u = bVar2.getDEFAULT_PROTOCOLS$okhttp();
            this.f93749v = mw.d.f74964b;
            this.f93750w = l.f93695d;
            this.f93753z = 10000;
            this.A = 10000;
            this.B = 10000;
            this.D = DtbConstants.NETWORK_READ_TIMEOUT;
            this.E = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final a m7966addInterceptor(kv.l block) {
            kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
            return addInterceptor(new C0809a(block));
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final a m7967addNetworkInterceptor(kv.l block) {
            kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
            return addNetworkInterceptor(new b(block));
        }

        public final a addInterceptor(i0 interceptor) {
            kotlin.jvm.internal.e0.checkNotNullParameter(interceptor, "interceptor");
            this.f93730c.add(interceptor);
            return this;
        }

        public final a addNetworkInterceptor(i0 interceptor) {
            kotlin.jvm.internal.e0.checkNotNullParameter(interceptor, "interceptor");
            this.f93731d.add(interceptor);
            return this;
        }

        public final a authenticator(c authenticator) {
            kotlin.jvm.internal.e0.checkNotNullParameter(authenticator, "authenticator");
            this.f93735h = authenticator;
            return this;
        }

        public final l0 build() {
            return new l0(this);
        }

        public final a cache(e eVar) {
            this.f93739l = eVar;
            return this;
        }

        public final a callTimeout(long j10, TimeUnit unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            this.f93752y = yv.i.checkDuration("timeout", j10, unit);
            return this;
        }

        /* renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final a m7968callTimeoutLRDsOJo(long j10) {
            this.f93752y = yv.i.m8014checkDurationHG0u8IE(IronSourceConstants.EVENTS_DURATION, j10);
            return this;
        }

        public final a certificatePinner(l certificatePinner) {
            kotlin.jvm.internal.e0.checkNotNullParameter(certificatePinner, "certificatePinner");
            if (!kotlin.jvm.internal.e0.areEqual(certificatePinner, this.f93750w)) {
                this.F = null;
            }
            this.f93750w = certificatePinner;
            return this;
        }

        public final a connectTimeout(long j10, TimeUnit unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            this.f93753z = yv.i.checkDuration("timeout", j10, unit);
            return this;
        }

        /* renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final a m7969connectTimeoutLRDsOJo(long j10) {
            this.f93753z = yv.i.m8014checkDurationHG0u8IE(IronSourceConstants.EVENTS_DURATION, j10);
            return this;
        }

        public final a connectionPool(r connectionPool) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connectionPool, "connectionPool");
            this.f93729b = connectionPool;
            return this;
        }

        public final a connectionSpecs(List<s> connectionSpecs) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!kotlin.jvm.internal.e0.areEqual(connectionSpecs, this.f93747t)) {
                this.F = null;
            }
            this.f93747t = yv.i.toImmutableList(connectionSpecs);
            return this;
        }

        public final a cookieJar(v cookieJar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cookieJar, "cookieJar");
            this.f93738k = cookieJar;
            return this;
        }

        public final a dispatcher(x dispatcher) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
            this.f93728a = dispatcher;
            return this;
        }

        public final a dns(z dns) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dns, "dns");
            if (!kotlin.jvm.internal.e0.areEqual(dns, this.f93740m)) {
                this.F = null;
            }
            this.f93740m = dns;
            return this;
        }

        public final a eventListener(b0 eventListener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventListener, "eventListener");
            this.f93732e = yv.i.asFactory(eventListener);
            return this;
        }

        public final a eventListenerFactory(c0 eventListenerFactory) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.f93732e = eventListenerFactory;
            return this;
        }

        public final a fastFallback(boolean z10) {
            this.f93734g = z10;
            return this;
        }

        public final a followRedirects(boolean z10) {
            this.f93736i = z10;
            return this;
        }

        public final a followSslRedirects(boolean z10) {
            this.f93737j = z10;
            return this;
        }

        public final c getAuthenticator$okhttp() {
            return this.f93735h;
        }

        public final e getCache$okhttp() {
            return this.f93739l;
        }

        public final int getCallTimeout$okhttp() {
            return this.f93752y;
        }

        public final mw.c getCertificateChainCleaner$okhttp() {
            return this.f93751x;
        }

        public final l getCertificatePinner$okhttp() {
            return this.f93750w;
        }

        public final int getConnectTimeout$okhttp() {
            return this.f93753z;
        }

        public final r getConnectionPool$okhttp() {
            return this.f93729b;
        }

        public final List<s> getConnectionSpecs$okhttp() {
            return this.f93747t;
        }

        public final v getCookieJar$okhttp() {
            return this.f93738k;
        }

        public final x getDispatcher$okhttp() {
            return this.f93728a;
        }

        public final z getDns$okhttp() {
            return this.f93740m;
        }

        public final c0 getEventListenerFactory$okhttp() {
            return this.f93732e;
        }

        public final boolean getFastFallback$okhttp() {
            return this.f93734g;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.f93736i;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.f93737j;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.f93749v;
        }

        public final List<i0> getInterceptors$okhttp() {
            return this.f93730c;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.E;
        }

        public final List<i0> getNetworkInterceptors$okhttp() {
            return this.f93731d;
        }

        public final int getPingInterval$okhttp() {
            return this.C;
        }

        public final List<n0> getProtocols$okhttp() {
            return this.f93748u;
        }

        public final Proxy getProxy$okhttp() {
            return this.f93741n;
        }

        public final c getProxyAuthenticator$okhttp() {
            return this.f93743p;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.f93742o;
        }

        public final int getReadTimeout$okhttp() {
            return this.A;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.f93733f;
        }

        public final cw.c0 getRouteDatabase$okhttp() {
            return this.F;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.f93744q;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.f93745r;
        }

        public final bw.g getTaskRunner$okhttp() {
            return this.G;
        }

        public final int getWebSocketCloseTimeout$okhttp() {
            return this.D;
        }

        public final int getWriteTimeout$okhttp() {
            return this.B;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.f93746s;
        }

        public final a hostnameVerifier(HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.e0.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!kotlin.jvm.internal.e0.areEqual(hostnameVerifier, this.f93749v)) {
                this.F = null;
            }
            this.f93749v = hostnameVerifier;
            return this;
        }

        public final List<i0> interceptors() {
            return this.f93730c;
        }

        public final a minWebSocketMessageToCompress(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(o2.m(j10, "minWebSocketMessageToCompress must be positive: ").toString());
            }
            this.E = j10;
            return this;
        }

        public final List<i0> networkInterceptors() {
            return this.f93731d;
        }

        public final a pingInterval(long j10, TimeUnit unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            this.C = yv.i.checkDuration("interval", j10, unit);
            return this;
        }

        /* renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final a m7970pingIntervalLRDsOJo(long j10) {
            this.C = yv.i.m8014checkDurationHG0u8IE(IronSourceConstants.EVENTS_DURATION, j10);
            return this;
        }

        public final a protocols(List<? extends n0> protocols) {
            kotlin.jvm.internal.e0.checkNotNullParameter(protocols, "protocols");
            List mutableList = uu.y0.toMutableList((Collection) protocols);
            n0 n0Var = n0.f93763i;
            if (!mutableList.contains(n0Var) && !mutableList.contains(n0.f93760f)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (mutableList.contains(n0Var) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (mutableList.contains(n0.f93759e)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            kotlin.jvm.internal.e0.checkNotNull(mutableList, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            mutableList.remove(n0.f93761g);
            if (!kotlin.jvm.internal.e0.areEqual(mutableList, this.f93748u)) {
                this.F = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(mutableList);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            this.f93748u = listUnmodifiableList;
            return this;
        }

        public final a proxy(Proxy proxy) {
            if (!kotlin.jvm.internal.e0.areEqual(proxy, this.f93741n)) {
                this.F = null;
            }
            this.f93741n = proxy;
            return this;
        }

        public final a proxyAuthenticator(c proxyAuthenticator) {
            kotlin.jvm.internal.e0.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
            if (!kotlin.jvm.internal.e0.areEqual(proxyAuthenticator, this.f93743p)) {
                this.F = null;
            }
            this.f93743p = proxyAuthenticator;
            return this;
        }

        public final a proxySelector(ProxySelector proxySelector) {
            kotlin.jvm.internal.e0.checkNotNullParameter(proxySelector, "proxySelector");
            if (!kotlin.jvm.internal.e0.areEqual(proxySelector, this.f93742o)) {
                this.F = null;
            }
            this.f93742o = proxySelector;
            return this;
        }

        public final a readTimeout(long j10, TimeUnit unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            this.A = yv.i.checkDuration("timeout", j10, unit);
            return this;
        }

        /* renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final a m7971readTimeoutLRDsOJo(long j10) {
            this.A = yv.i.m8014checkDurationHG0u8IE(IronSourceConstants.EVENTS_DURATION, j10);
            return this;
        }

        public final a retryOnConnectionFailure(boolean z10) {
            this.f93733f = z10;
            return this;
        }

        public final void setAuthenticator$okhttp(c cVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<set-?>");
            this.f93735h = cVar;
        }

        public final void setCache$okhttp(e eVar) {
            this.f93739l = eVar;
        }

        public final void setCallTimeout$okhttp(int i10) {
            this.f93752y = i10;
        }

        public final void setCertificateChainCleaner$okhttp(mw.c cVar) {
            this.f93751x = cVar;
        }

        public final void setCertificatePinner$okhttp(l lVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
            this.f93750w = lVar;
        }

        public final void setConnectTimeout$okhttp(int i10) {
            this.f93753z = i10;
        }

        public final void setConnectionPool$okhttp(r rVar) {
            this.f93729b = rVar;
        }

        public final void setConnectionSpecs$okhttp(List<s> list) {
            kotlin.jvm.internal.e0.checkNotNullParameter(list, "<set-?>");
            this.f93747t = list;
        }

        public final void setCookieJar$okhttp(v vVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<set-?>");
            this.f93738k = vVar;
        }

        public final void setDispatcher$okhttp(x xVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<set-?>");
            this.f93728a = xVar;
        }

        public final void setDns$okhttp(z zVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<set-?>");
            this.f93740m = zVar;
        }

        public final void setEventListenerFactory$okhttp(c0 c0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<set-?>");
            this.f93732e = c0Var;
        }

        public final void setFastFallback$okhttp(boolean z10) {
            this.f93734g = z10;
        }

        public final void setFollowRedirects$okhttp(boolean z10) {
            this.f93736i = z10;
        }

        public final void setFollowSslRedirects$okhttp(boolean z10) {
            this.f93737j = z10;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.e0.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.f93749v = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j10) {
            this.E = j10;
        }

        public final void setPingInterval$okhttp(int i10) {
            this.C = i10;
        }

        public final void setProtocols$okhttp(List<? extends n0> list) {
            kotlin.jvm.internal.e0.checkNotNullParameter(list, "<set-?>");
            this.f93748u = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.f93741n = proxy;
        }

        public final void setProxyAuthenticator$okhttp(c cVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<set-?>");
            this.f93743p = cVar;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.f93742o = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i10) {
            this.A = i10;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z10) {
            this.f93733f = z10;
        }

        public final void setRouteDatabase$okhttp(cw.c0 c0Var) {
            this.F = c0Var;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            kotlin.jvm.internal.e0.checkNotNullParameter(socketFactory, "<set-?>");
            this.f93744q = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.f93745r = sSLSocketFactory;
        }

        public final void setTaskRunner$okhttp(bw.g gVar) {
            this.G = gVar;
        }

        public final void setWebSocketCloseTimeout$okhttp(int i10) {
            this.D = i10;
        }

        public final void setWriteTimeout$okhttp(int i10) {
            this.B = i10;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.f93746s = x509TrustManager;
        }

        public final a socketFactory(SocketFactory socketFactory) {
            kotlin.jvm.internal.e0.checkNotNullParameter(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!kotlin.jvm.internal.e0.areEqual(socketFactory, this.f93744q)) {
                this.F = null;
            }
            this.f93744q = socketFactory;
            return this;
        }

        @tu.f
        public final a sslSocketFactory(SSLSocketFactory sslSocketFactory) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
            kotlin.jvm.internal.e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!kotlin.jvm.internal.e0.areEqual(sslSocketFactory, this.f93745r)) {
                this.F = null;
            }
            this.f93745r = sslSocketFactory;
            c.a aVar = okhttp3.internal.platform.c.f79515a;
            X509TrustManager x509TrustManagerTrustManager = aVar.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + aVar.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
            }
            this.f93746s = x509TrustManagerTrustManager;
            okhttp3.internal.platform.c cVar = aVar.get();
            X509TrustManager x509TrustManager = this.f93746s;
            kotlin.jvm.internal.e0.checkNotNull(x509TrustManager);
            this.f93751x = cVar.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        public final a taskRunner$okhttp(bw.g taskRunner) {
            kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
            this.G = taskRunner;
            return this;
        }

        public final a webSocketCloseTimeout(long j10, TimeUnit unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            this.D = yv.i.checkDuration("webSocketCloseTimeout", j10, unit);
            return this;
        }

        /* renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final a m7972webSocketCloseTimeoutLRDsOJo(long j10) {
            this.D = yv.i.m8014checkDurationHG0u8IE(IronSourceConstants.EVENTS_DURATION, j10);
            return this;
        }

        public final a writeTimeout(long j10, TimeUnit unit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
            this.B = yv.i.checkDuration("timeout", j10, unit);
            return this;
        }

        /* renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final a m7973writeTimeoutLRDsOJo(long j10) {
            this.B = yv.i.m8014checkDurationHG0u8IE(IronSourceConstants.EVENTS_DURATION, j10);
            return this;
        }

        public final a callTimeout(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a connectTimeout(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a pingInterval(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a readTimeout(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a webSocketCloseTimeout(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            webSocketCloseTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a writeTimeout(Duration duration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(duration, "duration");
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a sslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            kotlin.jvm.internal.e0.checkNotNullParameter(trustManager, "trustManager");
            if (!kotlin.jvm.internal.e0.areEqual(sslSocketFactory, this.f93745r) || !kotlin.jvm.internal.e0.areEqual(trustManager, this.f93746s)) {
                this.F = null;
            }
            this.f93745r = sslSocketFactory;
            this.f93751x = mw.c.f74963a.get(trustManager);
            this.f93746s = trustManager;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(l0 okHttpClient) {
            this();
            kotlin.jvm.internal.e0.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f93728a = okHttpClient.dispatcher();
            this.f93729b = okHttpClient.connectionPool();
            uu.v0.addAll(this.f93730c, okHttpClient.interceptors());
            uu.v0.addAll(this.f93731d, okHttpClient.networkInterceptors());
            this.f93732e = okHttpClient.eventListenerFactory();
            this.f93733f = okHttpClient.retryOnConnectionFailure();
            this.f93734g = okHttpClient.fastFallback();
            this.f93735h = okHttpClient.authenticator();
            this.f93736i = okHttpClient.followRedirects();
            this.f93737j = okHttpClient.followSslRedirects();
            this.f93738k = okHttpClient.cookieJar();
            this.f93739l = okHttpClient.cache();
            this.f93740m = okHttpClient.dns();
            this.f93741n = okHttpClient.proxy();
            this.f93742o = okHttpClient.proxySelector();
            this.f93743p = okHttpClient.proxyAuthenticator();
            this.f93744q = okHttpClient.socketFactory();
            this.f93745r = okHttpClient.f93718q;
            this.f93746s = okHttpClient.x509TrustManager();
            this.f93747t = okHttpClient.connectionSpecs();
            this.f93748u = okHttpClient.protocols();
            this.f93749v = okHttpClient.hostnameVerifier();
            this.f93750w = okHttpClient.certificatePinner();
            this.f93751x = okHttpClient.certificateChainCleaner();
            this.f93752y = okHttpClient.callTimeoutMillis();
            this.f93753z = okHttpClient.connectTimeoutMillis();
            this.A = okHttpClient.readTimeoutMillis();
            this.B = okHttpClient.writeTimeoutMillis();
            this.C = okHttpClient.pingIntervalMillis();
            this.D = okHttpClient.webSocketCloseTimeout();
            this.E = okHttpClient.minWebSocketMessageToCompress();
            this.F = okHttpClient.getRouteDatabase$okhttp();
            this.G = okHttpClient.getTaskRunner$okhttp();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final List<s> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return l0.J;
        }

        public final List<n0> getDEFAULT_PROTOCOLS$okhttp() {
            return l0.I;
        }
    }

    public l0(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector$okhttp;
        List<s> list;
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        this.f93702a = builder.getDispatcher$okhttp();
        this.f93703b = yv.i.toImmutableList(builder.getInterceptors$okhttp());
        this.f93704c = yv.i.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.f93705d = builder.getEventListenerFactory$okhttp();
        boolean retryOnConnectionFailure$okhttp = builder.getRetryOnConnectionFailure$okhttp();
        this.f93706e = retryOnConnectionFailure$okhttp;
        boolean fastFallback$okhttp = builder.getFastFallback$okhttp();
        this.f93707f = fastFallback$okhttp;
        this.f93708g = builder.getAuthenticator$okhttp();
        this.f93709h = builder.getFollowRedirects$okhttp();
        this.f93710i = builder.getFollowSslRedirects$okhttp();
        this.f93711j = builder.getCookieJar$okhttp();
        this.f93712k = builder.getCache$okhttp();
        this.f93713l = builder.getDns$okhttp();
        this.f93714m = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = kw.a.f72042a;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            if (proxySelector$okhttp == null && (proxySelector$okhttp = ProxySelector.getDefault()) == null) {
                proxySelector$okhttp = kw.a.f72042a;
            }
        }
        this.f93715n = proxySelector$okhttp;
        this.f93716o = builder.getProxyAuthenticator$okhttp();
        this.f93717p = builder.getSocketFactory$okhttp();
        List<s> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.f93720s = connectionSpecs$okhttp;
        this.f93721t = builder.getProtocols$okhttp();
        this.f93722u = builder.getHostnameVerifier$okhttp();
        this.f93725x = builder.getCallTimeout$okhttp();
        int connectTimeout$okhttp = builder.getConnectTimeout$okhttp();
        this.f93726y = connectTimeout$okhttp;
        int readTimeout$okhttp = builder.getReadTimeout$okhttp();
        this.f93727z = readTimeout$okhttp;
        int writeTimeout$okhttp = builder.getWriteTimeout$okhttp();
        this.A = writeTimeout$okhttp;
        int pingInterval$okhttp = builder.getPingInterval$okhttp();
        this.B = pingInterval$okhttp;
        this.C = builder.getWebSocketCloseTimeout$okhttp();
        this.D = builder.getMinWebSocketMessageToCompress$okhttp();
        cw.c0 routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        routeDatabase$okhttp = routeDatabase$okhttp == null ? new cw.c0() : routeDatabase$okhttp;
        this.E = routeDatabase$okhttp;
        bw.g taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.F = taskRunner$okhttp == null ? bw.g.f11363l : taskRunner$okhttp;
        r connectionPool$okhttp = builder.getConnectionPool$okhttp();
        if (connectionPool$okhttp == null) {
            list = connectionSpecs$okhttp;
            r rVar = new r(0, 0L, null, null, null, readTimeout$okhttp, writeTimeout$okhttp, connectTimeout$okhttp, readTimeout$okhttp, pingInterval$okhttp, retryOnConnectionFailure$okhttp, fastFallback$okhttp, routeDatabase$okhttp, 31, null);
            builder.setConnectionPool$okhttp(rVar);
            connectionPool$okhttp = rVar;
        } else {
            list = connectionSpecs$okhttp;
        }
        this.G = connectionPool$okhttp;
        List<s> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f93718q = null;
            this.f93724w = null;
            this.f93719r = null;
            this.f93723v = l.f93695d;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((s) it.next()).isTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.f93718q = builder.getSslSocketFactoryOrNull$okhttp();
                        mw.c certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        kotlin.jvm.internal.e0.checkNotNull(certificateChainCleaner$okhttp);
                        this.f93724w = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        kotlin.jvm.internal.e0.checkNotNull(x509TrustManagerOrNull$okhttp);
                        this.f93719r = x509TrustManagerOrNull$okhttp;
                        l certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
                        kotlin.jvm.internal.e0.checkNotNull(certificateChainCleaner$okhttp);
                        this.f93723v = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        c.a aVar = okhttp3.internal.platform.c.f79515a;
                        X509TrustManager x509TrustManagerPlatformTrustManager = aVar.get().platformTrustManager();
                        this.f93719r = x509TrustManagerPlatformTrustManager;
                        okhttp3.internal.platform.c cVar = aVar.get();
                        kotlin.jvm.internal.e0.checkNotNull(x509TrustManagerPlatformTrustManager);
                        this.f93718q = cVar.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        c.a aVar2 = mw.c.f74963a;
                        kotlin.jvm.internal.e0.checkNotNull(x509TrustManagerPlatformTrustManager);
                        mw.c cVar2 = aVar2.get(x509TrustManagerPlatformTrustManager);
                        this.f93724w = cVar2;
                        l certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
                        kotlin.jvm.internal.e0.checkNotNull(cVar2);
                        this.f93723v = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(cVar2);
                    }
                }
            }
            this.f93718q = null;
            this.f93724w = null;
            this.f93719r = null;
            this.f93723v = l.f93695d;
        }
        X509TrustManager x509TrustManager = this.f93719r;
        mw.c cVar3 = this.f93724w;
        SSLSocketFactory sSLSocketFactory = this.f93718q;
        List list3 = this.f93704c;
        List list4 = this.f93703b;
        kotlin.jvm.internal.e0.checkNotNull(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list4).toString());
        }
        kotlin.jvm.internal.e0.checkNotNull(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list5 = this.f93720s;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((s) it2.next()).isTls()) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (cVar3 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (cVar3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.e0.areEqual(this.f93723v, l.f93695d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @tu.f
    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final c m7940deprecated_authenticator() {
        return this.f93708g;
    }

    @tu.f
    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final e m7941deprecated_cache() {
        return this.f93712k;
    }

    @tu.f
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m7942deprecated_callTimeoutMillis() {
        return this.f93725x;
    }

    @tu.f
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final l m7943deprecated_certificatePinner() {
        return this.f93723v;
    }

    @tu.f
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m7944deprecated_connectTimeoutMillis() {
        return this.f93726y;
    }

    @tu.f
    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final r m7945deprecated_connectionPool() {
        return this.G;
    }

    @tu.f
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<s> m7946deprecated_connectionSpecs() {
        return this.f93720s;
    }

    @tu.f
    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final v m7947deprecated_cookieJar() {
        return this.f93711j;
    }

    @tu.f
    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final x m7948deprecated_dispatcher() {
        return this.f93702a;
    }

    @tu.f
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final z m7949deprecated_dns() {
        return this.f93713l;
    }

    @tu.f
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final c0 m7950deprecated_eventListenerFactory() {
        return this.f93705d;
    }

    @tu.f
    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m7951deprecated_followRedirects() {
        return this.f93709h;
    }

    @tu.f
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m7952deprecated_followSslRedirects() {
        return this.f93710i;
    }

    @tu.f
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m7953deprecated_hostnameVerifier() {
        return this.f93722u;
    }

    @tu.f
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<i0> m7954deprecated_interceptors() {
        return this.f93703b;
    }

    @tu.f
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<i0> m7955deprecated_networkInterceptors() {
        return this.f93704c;
    }

    @tu.f
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m7956deprecated_pingIntervalMillis() {
        return this.B;
    }

    @tu.f
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<n0> m7957deprecated_protocols() {
        return this.f93721t;
    }

    @tu.f
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m7958deprecated_proxy() {
        return this.f93714m;
    }

    @tu.f
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final c m7959deprecated_proxyAuthenticator() {
        return this.f93716o;
    }

    @tu.f
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m7960deprecated_proxySelector() {
        return this.f93715n;
    }

    @tu.f
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m7961deprecated_readTimeoutMillis() {
        return this.f93727z;
    }

    @tu.f
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m7962deprecated_retryOnConnectionFailure() {
        return this.f93706e;
    }

    @tu.f
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m7963deprecated_socketFactory() {
        return this.f93717p;
    }

    @tu.f
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m7964deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @tu.f
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m7965deprecated_writeTimeoutMillis() {
        return this.A;
    }

    public final xv.a address(g0 url) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        l lVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        if (url.isHttps()) {
            sslSocketFactory = sslSocketFactory();
            hostnameVerifier = this.f93722u;
            lVar = this.f93723v;
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            lVar = null;
        }
        return new xv.a(url.host(), url.port(), this.f93713l, this.f93717p, sslSocketFactory, hostnameVerifier, lVar, this.f93716o, this.f93714m, this.f93721t, this.f93720s, this.f93715n);
    }

    public final c authenticator() {
        return this.f93708g;
    }

    public final e cache() {
        return this.f93712k;
    }

    public final int callTimeoutMillis() {
        return this.f93725x;
    }

    public final mw.c certificateChainCleaner() {
        return this.f93724w;
    }

    public final l certificatePinner() {
        return this.f93723v;
    }

    public final int connectTimeoutMillis() {
        return this.f93726y;
    }

    public final r connectionPool() {
        return this.G;
    }

    public final List<s> connectionSpecs() {
        return this.f93720s;
    }

    public final v cookieJar() {
        return this.f93711j;
    }

    public final x dispatcher() {
        return this.f93702a;
    }

    public final z dns() {
        return this.f93713l;
    }

    public final c0 eventListenerFactory() {
        return this.f93705d;
    }

    public final boolean fastFallback() {
        return this.f93707f;
    }

    public final boolean followRedirects() {
        return this.f93709h;
    }

    public final boolean followSslRedirects() {
        return this.f93710i;
    }

    public final cw.c0 getRouteDatabase$okhttp() {
        return this.E;
    }

    public final bw.g getTaskRunner$okhttp() {
        return this.F;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.f93722u;
    }

    public final List<i0> interceptors() {
        return this.f93703b;
    }

    public final long minWebSocketMessageToCompress() {
        return this.D;
    }

    public final List<i0> networkInterceptors() {
        return this.f93704c;
    }

    public a newBuilder() {
        return new a(this);
    }

    @Override // xv.i
    public j newCall(o0 request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return new cw.q(this, request, false);
    }

    @Override // xv.d1
    public e1 newWebSocket(o0 request, f1 listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        ow.d dVar = new ow.d(this.F, request, listener, new Random(), this.B, null, this.D, this.C);
        dVar.connect(this);
        return dVar;
    }

    public final int pingIntervalMillis() {
        return this.B;
    }

    public final List<n0> protocols() {
        return this.f93721t;
    }

    public final Proxy proxy() {
        return this.f93714m;
    }

    public final c proxyAuthenticator() {
        return this.f93716o;
    }

    public final ProxySelector proxySelector() {
        return this.f93715n;
    }

    public final int readTimeoutMillis() {
        return this.f93727z;
    }

    public final boolean retryOnConnectionFailure() {
        return this.f93706e;
    }

    public final SocketFactory socketFactory() {
        return this.f93717p;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.f93718q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int webSocketCloseTimeout() {
        return this.C;
    }

    public final int writeTimeoutMillis() {
        return this.A;
    }

    public final X509TrustManager x509TrustManager() {
        return this.f93719r;
    }

    public l0() {
        this(new a());
    }
}
