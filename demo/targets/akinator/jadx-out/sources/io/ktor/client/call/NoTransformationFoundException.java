package io.ktor.client.call;

import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import sv.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {
    private final String message;

    public NoTransformationFoundException(HttpResponse response, KClass<?> from, KClass<?> to2) {
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(to2, "to");
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(to2);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(HttpResponseKt.getRequest(response).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(response.getStatus());
        sb2.append("`\n        Response header `ContentType: ");
        Headers headers = response.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        sb2.append(headers.get(httpHeaders.getContentType()));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(HttpResponseKt.getRequest(response).getHeaders().get(httpHeaders.getAccept()));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = d0.trimIndent(sb2.toString());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
