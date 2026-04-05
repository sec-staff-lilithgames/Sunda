package io.ktor.client.plugins;

import bx.a;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.e0;
import kv.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCallValidatorKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final AttributeKey<Boolean> ExpectSuccessAttributeKey = new AttributeKey<>("ExpectSuccessAttributeKey");

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1] */
    public static final AnonymousClass1 HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        return new HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt.HttpRequest.1
            private final Attributes attributes;
            private final Headers headers;
            private final HttpMethod method;
            private final Url url;

            {
                this.method = this.$builder.getMethod();
                this.url = this.$builder.getUrl().build();
                this.attributes = this.$builder.getAttributes();
                this.headers = this.$builder.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized");
            }

            @Override // io.ktor.client.request.HttpRequest
            public OutgoingContent getContent() {
                Object body = this.$builder.getBody();
                OutgoingContent outgoingContent = body instanceof OutgoingContent ? (OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.$builder.getBody()).toString());
            }

            @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
            public m getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Url getUrl() {
                return this.url;
            }
        };
    }

    public static final void HttpResponseValidator(HttpClientConfig<?> httpClientConfig, l block) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        e0.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpCallValidator.Companion, block);
    }

    public static final boolean getExpectSuccess(HttpRequestBuilder httpRequestBuilder) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        Boolean bool = (Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final AttributeKey<Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }

    public static final void setExpectSuccess(HttpRequestBuilder httpRequestBuilder, boolean z10) {
        e0.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, Boolean.valueOf(z10));
    }
}
