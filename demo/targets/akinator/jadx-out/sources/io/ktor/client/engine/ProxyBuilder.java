package io.ktor.client.engine;

import io.ktor.http.Url;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ProxyBuilder {
    public static final ProxyBuilder INSTANCE = new ProxyBuilder();

    private ProxyBuilder() {
    }

    public final Proxy http(Url url) {
        e0.checkNotNullParameter(url, "url");
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(url.getHost(), url.getPort()));
    }

    public final Proxy socks(String host, int i10) {
        e0.checkNotNullParameter(host, "host");
        return new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(host, i10));
    }
}
