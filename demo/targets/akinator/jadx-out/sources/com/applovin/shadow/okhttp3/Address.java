package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
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
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String uriHost, int i10, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List<? extends Protocol> protocols, List<ConnectionSpec> connectionSpecs, ProxySelector proxySelector) {
        e0.checkNotNullParameter(uriHost, "uriHost");
        e0.checkNotNullParameter(dns, "dns");
        e0.checkNotNullParameter(socketFactory, "socketFactory");
        e0.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        e0.checkNotNullParameter(protocols, "protocols");
        e0.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        e0.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? HttpRequest.DEFAULT_SCHEME : "http").host(uriHost).port(i10).build();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @f
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m211deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @f
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m212deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @f
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m213deprecated_dns() {
        return this.dns;
    }

    @f
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m214deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @f
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m215deprecated_protocols() {
        return this.protocols;
    }

    @f
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m216deprecated_proxy() {
        return this.proxy;
    }

    @f
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m217deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @f
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m218deprecated_proxySelector() {
        return this.proxySelector;
    }

    @f
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m219deprecated_socketFactory() {
        return this.socketFactory;
    }

    @f
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m220deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @f
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m221deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return e0.areEqual(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(Address that) {
        e0.checkNotNullParameter(that, "that");
        return e0.areEqual(this.dns, that.dns) && e0.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && e0.areEqual(this.protocols, that.protocols) && e0.areEqual(this.connectionSpecs, that.connectionSpecs) && e0.areEqual(this.proxySelector, that.proxySelector) && e0.areEqual(this.proxy, that.proxy) && e0.areEqual(this.sslSocketFactory, that.sslSocketFactory) && e0.areEqual(this.hostnameVerifier, that.hostnameVerifier) && e0.areEqual(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + o2.c(o2.c((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31, 31, this.protocols), 31, this.connectionSpecs)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder("Address{");
        sb3.append(this.url.host());
        sb3.append(AbstractJsonLexerKt.COLON);
        sb3.append(this.url.port());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        return p0.o2.q(sb3, sb2.toString(), AbstractJsonLexerKt.END_OBJ);
    }

    public final HttpUrl url() {
        return this.url;
    }
}
