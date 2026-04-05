package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.n;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class t implements Cloneable {
    static final List<u> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(u.HTTP_2, u.HTTP_1_1);
    static final List<i> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(i.f43274h, i.f43276j);

    /* renamed from: a, reason: collision with root package name */
    final l f43693a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f43694b;

    /* renamed from: c, reason: collision with root package name */
    final List<u> f43695c;

    /* renamed from: d, reason: collision with root package name */
    final List<i> f43696d;

    /* renamed from: e, reason: collision with root package name */
    final List<r> f43697e;

    /* renamed from: f, reason: collision with root package name */
    final List<r> f43698f;

    /* renamed from: g, reason: collision with root package name */
    final n.c f43699g;

    /* renamed from: h, reason: collision with root package name */
    final ProxySelector f43700h;

    /* renamed from: i, reason: collision with root package name */
    final k f43701i;

    /* renamed from: j, reason: collision with root package name */
    final SocketFactory f43702j;

    /* renamed from: k, reason: collision with root package name */
    final SSLSocketFactory f43703k;

    /* renamed from: l, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.tls.c f43704l;

    /* renamed from: m, reason: collision with root package name */
    final HostnameVerifier f43705m;

    /* renamed from: n, reason: collision with root package name */
    final e f43706n;

    /* renamed from: o, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f43707o;

    /* renamed from: p, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f43708p;

    /* renamed from: q, reason: collision with root package name */
    final h f43709q;

    /* renamed from: r, reason: collision with root package name */
    final m f43710r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f43711s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f43712t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f43713u;

    /* renamed from: v, reason: collision with root package name */
    final int f43714v;

    /* renamed from: w, reason: collision with root package name */
    final int f43715w;

    /* renamed from: x, reason: collision with root package name */
    final int f43716x;

    /* renamed from: y, reason: collision with root package name */
    final int f43717y;

    /* renamed from: z, reason: collision with root package name */
    final int f43718z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(p.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(h hVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            hVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(p.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(h hVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return hVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(h hVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, a0 a0Var) {
            return hVar.a(aVar, gVar, a0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(h hVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return hVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(h hVar) {
            return hVar.f43268e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(y.a aVar) {
            return aVar.f43792c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(i iVar, SSLSocket sSLSocket, boolean z10) {
            iVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public IOException a(d dVar, IOException iOException) {
            return ((v) dVar).a(iOException);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        l f43719a;

        /* renamed from: b, reason: collision with root package name */
        Proxy f43720b;

        /* renamed from: c, reason: collision with root package name */
        List<u> f43721c;

        /* renamed from: d, reason: collision with root package name */
        List<i> f43722d;

        /* renamed from: e, reason: collision with root package name */
        final List<r> f43723e;

        /* renamed from: f, reason: collision with root package name */
        final List<r> f43724f;

        /* renamed from: g, reason: collision with root package name */
        n.c f43725g;

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f43726h;

        /* renamed from: i, reason: collision with root package name */
        k f43727i;

        /* renamed from: j, reason: collision with root package name */
        SocketFactory f43728j;

        /* renamed from: k, reason: collision with root package name */
        SSLSocketFactory f43729k;

        /* renamed from: l, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.tls.c f43730l;

        /* renamed from: m, reason: collision with root package name */
        HostnameVerifier f43731m;

        /* renamed from: n, reason: collision with root package name */
        e f43732n;

        /* renamed from: o, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f43733o;

        /* renamed from: p, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f43734p;

        /* renamed from: q, reason: collision with root package name */
        h f43735q;

        /* renamed from: r, reason: collision with root package name */
        m f43736r;

        /* renamed from: s, reason: collision with root package name */
        boolean f43737s;

        /* renamed from: t, reason: collision with root package name */
        boolean f43738t;

        /* renamed from: u, reason: collision with root package name */
        boolean f43739u;

        /* renamed from: v, reason: collision with root package name */
        int f43740v;

        /* renamed from: w, reason: collision with root package name */
        int f43741w;

        /* renamed from: x, reason: collision with root package name */
        int f43742x;

        /* renamed from: y, reason: collision with root package name */
        int f43743y;

        /* renamed from: z, reason: collision with root package name */
        int f43744z;

        public b() {
            this.f43723e = new ArrayList();
            this.f43724f = new ArrayList();
            this.f43719a = new l();
            this.f43721c = t.A;
            this.f43722d = t.B;
            this.f43725g = n.factory(n.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f43726h = proxySelector;
            if (proxySelector == null) {
                this.f43726h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f43727i = k.f43658a;
            this.f43728j = SocketFactory.getDefault();
            this.f43731m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f43644a;
            this.f43732n = e.f43184c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f43153a;
            this.f43733o = bVar;
            this.f43734p = bVar;
            this.f43735q = new h();
            this.f43736r = m.f43667a;
            this.f43737s = true;
            this.f43738t = true;
            this.f43739u = true;
            this.f43740v = 0;
            this.f43741w = 10000;
            this.f43742x = 10000;
            this.f43743y = 10000;
            this.f43744z = 0;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f43740v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f43741w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f43744z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f43742x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f43743y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(m mVar) {
            if (mVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f43736r = mVar;
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f43731m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(h hVar) {
            if (hVar != null) {
                this.f43735q = hVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z10) {
            this.f43739u = z10;
            return this;
        }

        public b a(l lVar) {
            if (lVar != null) {
                this.f43719a = lVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<u> list) {
            ArrayList arrayList = new ArrayList(list);
            u uVar = u.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(uVar) && !arrayList.contains(u.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(uVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(u.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(u.SPDY_3);
                    this.f43721c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(n nVar) {
            if (nVar != null) {
                this.f43725g = n.factory(nVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public t a() {
            return new t(this);
        }

        public b(t tVar) {
            ArrayList arrayList = new ArrayList();
            this.f43723e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f43724f = arrayList2;
            this.f43719a = tVar.f43693a;
            this.f43720b = tVar.f43694b;
            this.f43721c = tVar.f43695c;
            this.f43722d = tVar.f43696d;
            arrayList.addAll(tVar.f43697e);
            arrayList2.addAll(tVar.f43698f);
            this.f43725g = tVar.f43699g;
            this.f43726h = tVar.f43700h;
            this.f43727i = tVar.f43701i;
            this.f43728j = tVar.f43702j;
            this.f43729k = tVar.f43703k;
            this.f43730l = tVar.f43704l;
            this.f43731m = tVar.f43705m;
            this.f43732n = tVar.f43706n;
            this.f43733o = tVar.f43707o;
            this.f43734p = tVar.f43708p;
            this.f43735q = tVar.f43709q;
            this.f43736r = tVar.f43710r;
            this.f43737s = tVar.f43711s;
            this.f43738t = tVar.f43712t;
            this.f43739u = tVar.f43713u;
            this.f43740v = tVar.f43714v;
            this.f43741w = tVar.f43715w;
            this.f43742x = tVar.f43716x;
            this.f43743y = tVar.f43717y;
            this.f43744z = tVar.f43718z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f43285a = new a();
    }

    public t() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public SocketFactory A() {
        return this.f43702j;
    }

    public SSLSocketFactory B() {
        return this.f43703k;
    }

    public int C() {
        return this.f43717y;
    }

    public int b() {
        return this.f43714v;
    }

    public e c() {
        return this.f43706n;
    }

    public int e() {
        return this.f43715w;
    }

    public h f() {
        return this.f43709q;
    }

    public List<i> g() {
        return this.f43696d;
    }

    public k i() {
        return this.f43701i;
    }

    public l j() {
        return this.f43693a;
    }

    public m k() {
        return this.f43710r;
    }

    public n.c l() {
        return this.f43699g;
    }

    public boolean m() {
        return this.f43712t;
    }

    public boolean n() {
        return this.f43711s;
    }

    public HostnameVerifier o() {
        return this.f43705m;
    }

    public List<r> p() {
        return this.f43697e;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<r> r() {
        return this.f43698f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f43718z;
    }

    public List<u> u() {
        return this.f43695c;
    }

    public Proxy v() {
        return this.f43694b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f43707o;
    }

    public ProxySelector x() {
        return this.f43700h;
    }

    public int y() {
        return this.f43716x;
    }

    public boolean z() {
        return this.f43713u;
    }

    public t(b bVar) throws NoSuchAlgorithmException, KeyStoreException {
        boolean z10;
        this.f43693a = bVar.f43719a;
        this.f43694b = bVar.f43720b;
        this.f43695c = bVar.f43721c;
        List<i> list = bVar.f43722d;
        this.f43696d = list;
        this.f43697e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f43723e);
        this.f43698f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f43724f);
        this.f43699g = bVar.f43725g;
        this.f43700h = bVar.f43726h;
        this.f43701i = bVar.f43727i;
        this.f43702j = bVar.f43728j;
        Iterator<i> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (it.hasNext()) {
                z10 = (z10 || it.next().b()) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f43729k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f43703k = a(x509TrustManagerA);
            this.f43704l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f43703k = sSLSocketFactory;
            this.f43704l = bVar.f43730l;
        }
        if (this.f43703k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f43703k);
        }
        this.f43705m = bVar.f43731m;
        this.f43706n = bVar.f43732n.a(this.f43704l);
        this.f43707o = bVar.f43733o;
        this.f43708p = bVar.f43734p;
        this.f43709q = bVar.f43735q;
        this.f43710r = bVar.f43736r;
        this.f43711s = bVar.f43737s;
        this.f43712t = bVar.f43738t;
        this.f43713u = bVar.f43739u;
        this.f43714v = bVar.f43740v;
        this.f43715w = bVar.f43741w;
        this.f43716x = bVar.f43742x;
        this.f43717y = bVar.f43743y;
        this.f43718z = bVar.f43744z;
        if (this.f43697e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f43697e);
        }
        if (this.f43698f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f43698f);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f43708p;
    }

    public d a(w wVar) {
        return v.a(this, wVar, false);
    }
}
