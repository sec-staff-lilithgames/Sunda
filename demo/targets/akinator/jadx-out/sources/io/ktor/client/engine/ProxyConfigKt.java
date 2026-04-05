package io.ktor.client.engine;

import io.ktor.http.URLUtilsKt;
import java.net.Proxy;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ProxyConfigKt {
    public static final Proxy http(ProxyBuilder proxyBuilder, String urlString) {
        e0.checkNotNullParameter(proxyBuilder, "<this>");
        e0.checkNotNullParameter(urlString, "urlString");
        return proxyBuilder.http(URLUtilsKt.Url(urlString));
    }
}
