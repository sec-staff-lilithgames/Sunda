package xv;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import j1.o2;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import xv.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final z f93556a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f93557b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f93558c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f93559d;

    /* renamed from: e, reason: collision with root package name */
    public final l f93560e;

    /* renamed from: f, reason: collision with root package name */
    public final c f93561f;

    /* renamed from: g, reason: collision with root package name */
    public final Proxy f93562g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f93563h;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f93564i;

    /* renamed from: j, reason: collision with root package name */
    public final List f93565j;

    /* renamed from: k, reason: collision with root package name */
    public final List f93566k;

    public a(String uriHost, int i10, z dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, l lVar, c proxyAuthenticator, Proxy proxy, List<? extends n0> protocols, List<s> connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uriHost, "uriHost");
        kotlin.jvm.internal.e0.checkNotNullParameter(dns, "dns");
        kotlin.jvm.internal.e0.checkNotNullParameter(socketFactory, "socketFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.e0.checkNotNullParameter(protocols, "protocols");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxySelector, "proxySelector");
        this.f93556a = dns;
        this.f93557b = socketFactory;
        this.f93558c = sSLSocketFactory;
        this.f93559d = hostnameVerifier;
        this.f93560e = lVar;
        this.f93561f = proxyAuthenticator;
        this.f93562g = proxy;
        this.f93563h = proxySelector;
        this.f93564i = new g0.a().scheme(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").host(uriHost).port(i10).build();
        this.f93565j = yv.i.toImmutableList(protocols);
        this.f93566k = yv.i.toImmutableList(connectionSpecs);
    }

    @tu.f
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final l m7870deprecated_certificatePinner() {
        return this.f93560e;
    }

    @tu.f
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<s> m7871deprecated_connectionSpecs() {
        return this.f93566k;
    }

    @tu.f
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final z m7872deprecated_dns() {
        return this.f93556a;
    }

    @tu.f
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m7873deprecated_hostnameVerifier() {
        return this.f93559d;
    }

    @tu.f
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<n0> m7874deprecated_protocols() {
        return this.f93565j;
    }

    @tu.f
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m7875deprecated_proxy() {
        return this.f93562g;
    }

    @tu.f
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final c m7876deprecated_proxyAuthenticator() {
        return this.f93561f;
    }

    @tu.f
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m7877deprecated_proxySelector() {
        return this.f93563h;
    }

    @tu.f
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m7878deprecated_socketFactory() {
        return this.f93557b;
    }

    @tu.f
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m7879deprecated_sslSocketFactory() {
        return this.f93558c;
    }

    @tu.f
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final g0 m7880deprecated_url() {
        return this.f93564i;
    }

    public final l certificatePinner() {
        return this.f93560e;
    }

    public final List<s> connectionSpecs() {
        return this.f93566k;
    }

    public final z dns() {
        return this.f93556a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f93564i, aVar.f93564i) && equalsNonHost$okhttp(aVar);
    }

    public final boolean equalsNonHost$okhttp(a that) {
        kotlin.jvm.internal.e0.checkNotNullParameter(that, "that");
        return kotlin.jvm.internal.e0.areEqual(this.f93556a, that.f93556a) && kotlin.jvm.internal.e0.areEqual(this.f93561f, that.f93561f) && kotlin.jvm.internal.e0.areEqual(this.f93565j, that.f93565j) && kotlin.jvm.internal.e0.areEqual(this.f93566k, that.f93566k) && kotlin.jvm.internal.e0.areEqual(this.f93563h, that.f93563h) && kotlin.jvm.internal.e0.areEqual(this.f93562g, that.f93562g) && kotlin.jvm.internal.e0.areEqual(this.f93558c, that.f93558c) && kotlin.jvm.internal.e0.areEqual(this.f93559d, that.f93559d) && kotlin.jvm.internal.e0.areEqual(this.f93560e, that.f93560e) && this.f93564i.port() == that.f93564i.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.f93560e) + ((Objects.hashCode(this.f93559d) + ((Objects.hashCode(this.f93558c) + ((Objects.hashCode(this.f93562g) + ((this.f93563h.hashCode() + o2.c(o2.c((this.f93561f.hashCode() + ((this.f93556a.hashCode() + ((this.f93564i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31, 31, this.f93565j), 31, this.f93566k)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.f93559d;
    }

    public final List<n0> protocols() {
        return this.f93565j;
    }

    public final Proxy proxy() {
        return this.f93562g;
    }

    public final c proxyAuthenticator() {
        return this.f93561f;
    }

    public final ProxySelector proxySelector() {
        return this.f93563h;
    }

    public final SocketFactory socketFactory() {
        return this.f93557b;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.f93558c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        g0 g0Var = this.f93564i;
        sb2.append(g0Var.host());
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(g0Var.port());
        sb2.append(", ");
        Proxy proxy = this.f93562g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f93563h;
        }
        return p0.o2.q(sb2, str, AbstractJsonLexerKt.END_OBJ);
    }

    public final g0 url() {
        return this.f93564i;
    }
}
