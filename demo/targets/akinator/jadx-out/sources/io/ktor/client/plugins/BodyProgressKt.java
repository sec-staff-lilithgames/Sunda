package io.ktor.client.plugins;

import io.ktor.client.plugins.observer.DelegatedCallKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ByteChannelUtilsKt;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.AttributeKey;
import kotlin.jvm.internal.e0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BodyProgressKt {
    private static final AttributeKey<q> UploadProgressListenerAttributeKey = new AttributeKey<>("UploadProgressListenerAttributeKey");
    private static final AttributeKey<q> DownloadProgressListenerAttributeKey = new AttributeKey<>("DownloadProgressListenerAttributeKey");

    public static final void onDownload(HttpRequestBuilder httpRequestBuilder, q qVar) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        if (qVar == null) {
            httpRequestBuilder.getAttributes().remove(DownloadProgressListenerAttributeKey);
        } else {
            httpRequestBuilder.getAttributes().put(DownloadProgressListenerAttributeKey, qVar);
        }
    }

    public static final void onUpload(HttpRequestBuilder httpRequestBuilder, q qVar) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        if (qVar == null) {
            httpRequestBuilder.getAttributes().remove(UploadProgressListenerAttributeKey);
        } else {
            httpRequestBuilder.getAttributes().put(UploadProgressListenerAttributeKey, qVar);
        }
    }

    public static final HttpResponse withObservableDownload(HttpResponse httpResponse, q listener) {
        e0.checkNotNullParameter(httpResponse, "<this>");
        e0.checkNotNullParameter(listener, "listener");
        return DelegatedCallKt.wrapWithContent(httpResponse.getCall(), ByteChannelUtilsKt.observable(httpResponse.getContent(), httpResponse.getCoroutineContext(), HttpMessagePropertiesKt.contentLength(httpResponse), listener)).getResponse();
    }
}
