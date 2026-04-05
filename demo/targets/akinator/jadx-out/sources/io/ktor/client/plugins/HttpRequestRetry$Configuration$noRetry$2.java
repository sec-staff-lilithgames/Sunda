package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$noRetry$2 extends f0 implements q {
    public static final HttpRequestRetry$Configuration$noRetry$2 INSTANCE = new HttpRequestRetry$Configuration$noRetry$2();

    public HttpRequestRetry$Configuration$noRetry$2() {
        super(3);
    }

    @Override // kv.q
    public final Boolean invoke(HttpRequestRetry.ShouldRetryContext shouldRetryContext, HttpRequestBuilder httpRequestBuilder, Throwable th2) {
        e0.checkNotNullParameter(shouldRetryContext, "$this$null");
        e0.checkNotNullParameter(httpRequestBuilder, "<anonymous parameter 0>");
        e0.checkNotNullParameter(th2, "<anonymous parameter 1>");
        return Boolean.FALSE;
    }
}
