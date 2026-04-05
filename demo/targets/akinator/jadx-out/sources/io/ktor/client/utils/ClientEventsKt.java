package io.ktor.client.utils;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ClientEventsKt {
    private static final EventDefinition<HttpRequestBuilder> HttpRequestCreated = new EventDefinition<>();
    private static final EventDefinition<HttpRequestBuilder> HttpRequestIsReadyForSending = new EventDefinition<>();
    private static final EventDefinition<HttpResponse> HttpResponseReceived = new EventDefinition<>();
    private static final EventDefinition<HttpResponseReceiveFail> HttpResponseReceiveFailed = new EventDefinition<>();
    private static final EventDefinition<HttpResponse> HttpResponseCancelled = new EventDefinition<>();

    public static final EventDefinition<HttpRequestBuilder> getHttpRequestCreated() {
        return HttpRequestCreated;
    }

    public static final EventDefinition<HttpRequestBuilder> getHttpRequestIsReadyForSending() {
        return HttpRequestIsReadyForSending;
    }

    public static final EventDefinition<HttpResponse> getHttpResponseCancelled() {
        return HttpResponseCancelled;
    }

    public static final EventDefinition<HttpResponseReceiveFail> getHttpResponseReceiveFailed() {
        return HttpResponseReceiveFailed;
    }

    public static final EventDefinition<HttpResponse> getHttpResponseReceived() {
        return HttpResponseReceived;
    }
}
