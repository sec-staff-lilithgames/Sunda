package io.ktor.client.utils;

import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpResponseReceiveFail {
    private final Throwable cause;
    private final HttpResponse response;

    public HttpResponseReceiveFail(HttpResponse response, Throwable cause) {
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(cause, "cause");
        this.response = response;
        this.cause = cause;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }
}
