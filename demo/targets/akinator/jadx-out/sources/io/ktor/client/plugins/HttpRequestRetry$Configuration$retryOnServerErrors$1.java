package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$retryOnServerErrors$1 extends f0 implements q {
    public static final HttpRequestRetry$Configuration$retryOnServerErrors$1 INSTANCE = new HttpRequestRetry$Configuration$retryOnServerErrors$1();

    public HttpRequestRetry$Configuration$retryOnServerErrors$1() {
        super(3);
    }

    @Override // kv.q
    public final Boolean invoke(HttpRequestRetry.ShouldRetryContext retryIf, HttpRequest httpRequest, HttpResponse response) {
        e0.checkNotNullParameter(retryIf, "$this$retryIf");
        e0.checkNotNullParameter(httpRequest, "<anonymous parameter 0>");
        e0.checkNotNullParameter(response, "response");
        int value = response.getStatus().getValue();
        boolean z10 = false;
        if (500 <= value && value < 600) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
