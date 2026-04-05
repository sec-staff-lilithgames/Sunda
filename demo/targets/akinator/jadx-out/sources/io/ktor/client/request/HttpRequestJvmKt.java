package io.ktor.client.request;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsJvmKt;
import java.net.URL;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestJvmKt {
    public static final HttpRequestBuilder invoke(HttpRequestBuilder.Companion companion, URL url) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(url, "url");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, url);
        return httpRequestBuilder;
    }

    public static final URLBuilder url(HttpRequestBuilder httpRequestBuilder, URL url) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(url, "url");
        return URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }
}
