package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$retryOnException$1 extends f0 implements q {
    final /* synthetic */ boolean $retryOnTimeout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetry$Configuration$retryOnException$1(boolean z10) {
        super(3);
        this.$retryOnTimeout = z10;
    }

    @Override // kv.q
    public final Boolean invoke(HttpRequestRetry.ShouldRetryContext retryOnExceptionIf, HttpRequestBuilder httpRequestBuilder, Throwable cause) {
        e0.checkNotNullParameter(retryOnExceptionIf, "$this$retryOnExceptionIf");
        e0.checkNotNullParameter(httpRequestBuilder, "<anonymous parameter 0>");
        e0.checkNotNullParameter(cause, "cause");
        return Boolean.valueOf(HttpRequestRetryKt.isTimeoutException(cause) ? this.$retryOnTimeout : !(cause instanceof CancellationException));
    }
}
