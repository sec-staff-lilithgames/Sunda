package io.ktor.client.request;

import io.ktor.client.call.HttpClientCall;
import io.ktor.http.HttpMessage;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import kotlinx.coroutines.CoroutineScope;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface HttpRequest extends HttpMessage, CoroutineScope {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static m getCoroutineContext(HttpRequest httpRequest) {
            return httpRequest.getCall().getCoroutineContext();
        }
    }

    Attributes getAttributes();

    HttpClientCall getCall();

    OutgoingContent getContent();

    m getCoroutineContext();

    HttpMethod getMethod();

    Url getUrl();
}
