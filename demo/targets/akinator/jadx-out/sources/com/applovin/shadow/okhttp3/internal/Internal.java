package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        e0.checkNotNullParameter(builder, "builder");
        e0.checkNotNullParameter(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z10) {
        e0.checkNotNullParameter(connectionSpec, "connectionSpec");
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z10);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        e0.checkNotNullParameter(cache, "cache");
        e0.checkNotNullParameter(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        e0.checkNotNullParameter(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final Cookie parseCookie(long j10, HttpUrl url, String setCookie) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j10, url, setCookie);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        e0.checkNotNullParameter(builder, "builder");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
