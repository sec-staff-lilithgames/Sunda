package io.ktor.client.plugins;

import bx.a;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetryKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestRetry");
    private static final AttributeKey<Integer> MaxRetriesPerRequestAttributeKey = new AttributeKey<>("MaxRetriesPerRequestAttributeKey");
    private static final AttributeKey<q> ShouldRetryPerRequestAttributeKey = new AttributeKey<>("ShouldRetryPerRequestAttributeKey");
    private static final AttributeKey<q> ShouldRetryOnExceptionPerRequestAttributeKey = new AttributeKey<>("ShouldRetryOnExceptionPerRequestAttributeKey");
    private static final AttributeKey<p> ModifyRequestPerRequestAttributeKey = new AttributeKey<>("ModifyRequestPerRequestAttributeKey");
    private static final AttributeKey<p> RetryDelayPerRequestAttributeKey = new AttributeKey<>("RetryDelayPerRequestAttributeKey");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTimeoutException(Throwable th2) {
        Throwable thUnwrapCancellationException = ExceptionUtilsJvmKt.unwrapCancellationException(th2);
        return (thUnwrapCancellationException instanceof HttpRequestTimeoutException) || (thUnwrapCancellationException instanceof ConnectTimeoutException) || (thUnwrapCancellationException instanceof SocketTimeoutException);
    }

    public static final void retry(HttpRequestBuilder httpRequestBuilder, l block) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        HttpRequestRetry.Configuration configuration = new HttpRequestRetry.Configuration();
        block.invoke(configuration);
        httpRequestBuilder.getAttributes().put(ShouldRetryPerRequestAttributeKey, configuration.getShouldRetry$ktor_client_core());
        httpRequestBuilder.getAttributes().put(ShouldRetryOnExceptionPerRequestAttributeKey, configuration.getShouldRetryOnException$ktor_client_core());
        httpRequestBuilder.getAttributes().put(RetryDelayPerRequestAttributeKey, configuration.getDelayMillis$ktor_client_core());
        httpRequestBuilder.getAttributes().put(MaxRetriesPerRequestAttributeKey, Integer.valueOf(configuration.getMaxRetries()));
        httpRequestBuilder.getAttributes().put(ModifyRequestPerRequestAttributeKey, configuration.getModifyRequest$ktor_client_core());
    }
}
