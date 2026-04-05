package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import com.mbridge.msdk.thrid.okhttp.q;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final q f43139a;

    /* renamed from: b, reason: collision with root package name */
    final m f43140b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f43141c;

    /* renamed from: d, reason: collision with root package name */
    final b f43142d;

    /* renamed from: e, reason: collision with root package name */
    final List<u> f43143e;

    /* renamed from: f, reason: collision with root package name */
    final List<i> f43144f;

    /* renamed from: g, reason: collision with root package name */
    final ProxySelector f43145g;

    /* renamed from: h, reason: collision with root package name */
    final Proxy f43146h;

    /* renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f43147i;

    /* renamed from: j, reason: collision with root package name */
    final HostnameVerifier f43148j;

    /* renamed from: k, reason: collision with root package name */
    final e f43149k;

    public a(String str, int i10, m mVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b bVar, Proxy proxy, List<u> list, List<i> list2, ProxySelector proxySelector) {
        this.f43139a = new q.a().e(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").b(str).a(i10).a();
        if (mVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f43140b = mVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f43141c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f43142d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f43143e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f43144f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f43145g = proxySelector;
        this.f43146h = proxy;
        this.f43147i = sSLSocketFactory;
        this.f43148j = hostnameVerifier;
        this.f43149k = eVar;
    }

    public e a() {
        return this.f43149k;
    }

    public List<i> b() {
        return this.f43144f;
    }

    public m c() {
        return this.f43140b;
    }

    public HostnameVerifier d() {
        return this.f43148j;
    }

    public List<u> e() {
        return this.f43143e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f43139a.equals(aVar.f43139a) && a(aVar);
    }

    public Proxy f() {
        return this.f43146h;
    }

    public b g() {
        return this.f43142d;
    }

    public ProxySelector h() {
        return this.f43145g;
    }

    public int hashCode() {
        int iHashCode = (this.f43145g.hashCode() + ((this.f43144f.hashCode() + ((this.f43143e.hashCode() + ((this.f43142d.hashCode() + ((this.f43140b.hashCode() + ((this.f43139a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f43146h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f43147i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f43148j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        e eVar = this.f43149k;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f43141c;
    }

    public SSLSocketFactory j() {
        return this.f43147i;
    }

    public q k() {
        return this.f43139a;
    }

    public boolean a(a aVar) {
        return this.f43140b.equals(aVar.f43140b) && this.f43142d.equals(aVar.f43142d) && this.f43143e.equals(aVar.f43143e) && this.f43144f.equals(aVar.f43144f) && this.f43145g.equals(aVar.f43145g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43146h, aVar.f43146h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43147i, aVar.f43147i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43148j, aVar.f43148j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43149k, aVar.f43149k) && k().j() == aVar.k().j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.f43139a.g());
        sb2.append(":");
        sb2.append(this.f43139a.j());
        if (this.f43146h != null) {
            sb2.append(SUvoXnn.tYyvOR);
            sb2.append(this.f43146h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f43145g);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
