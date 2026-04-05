package io.ktor.client.request;

import ao.kwoC.zAQQWzBxnS;
import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.client.utils.EmptyContent;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.AttributesKt;
import io.ktor.util.InternalAPI;
import io.ktor.util.StringValuesKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestBuilder implements HttpMessageBuilder {
    public static final Companion Companion = new Companion(null);
    private final URLBuilder url = new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null);
    private HttpMethod method = HttpMethod.Companion.getGet();
    private final HeadersBuilder headers = new HeadersBuilder(0, 1, null);
    private Object body = EmptyContent.INSTANCE;
    private Job executionContext = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
    private final Attributes attributes = AttributesJvmKt.Attributes(true);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public final HttpRequestData build() {
        Url urlBuild = this.url.build();
        HttpMethod httpMethod = this.method;
        Headers headersBuild = getHeaders().build();
        Object obj = this.body;
        OutgoingContent outgoingContent = obj instanceof OutgoingContent ? (OutgoingContent) obj : null;
        if (outgoingContent != null) {
            return new HttpRequestData(urlBuild, httpMethod, headersBuild, outgoingContent, this.executionContext, this.attributes);
        }
        throw new IllegalStateException(("No request transformation found: " + this.body).toString());
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final Object getBody() {
        return this.body;
    }

    public final TypeInfo getBodyType() {
        return (TypeInfo) this.attributes.getOrNull(RequestBodyKt.getBodyTypeAttributeKey());
    }

    public final <T> T getCapabilityOrNull(HttpClientEngineCapability<T> key) {
        e0.checkNotNullParameter(key, "key");
        Map map = (Map) this.attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    public final Job getExecutionContext() {
        return this.executionContext;
    }

    @Override // io.ktor.http.HttpMessageBuilder
    public HeadersBuilder getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final URLBuilder getUrl() {
        return this.url;
    }

    public final void setAttributes(l block) {
        e0.checkNotNullParameter(block, "block");
        block.invoke(this.attributes);
    }

    @InternalAPI
    public final void setBodyType(TypeInfo typeInfo) {
        if (typeInfo != null) {
            this.attributes.put(RequestBodyKt.getBodyTypeAttributeKey(), typeInfo);
        } else {
            this.attributes.remove(RequestBodyKt.getBodyTypeAttributeKey());
        }
    }

    public final <T> void setCapability(HttpClientEngineCapability<T> key, T capability) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(capability, "capability");
        ((Map) this.attributes.computeIfAbsent(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY(), HttpRequestBuilder$setCapability$capabilities$1.INSTANCE)).put(key, capability);
    }

    public final void setExecutionContext$ktor_client_core(Job job) {
        e0.checkNotNullParameter(job, "<set-?>");
        this.executionContext = job;
    }

    public final void setMethod(HttpMethod httpMethod) {
        e0.checkNotNullParameter(httpMethod, "<set-?>");
        this.method = httpMethod;
    }

    public final HttpRequestBuilder takeFrom(HttpRequestBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        this.method = builder.method;
        this.body = builder.body;
        setBodyType(builder.getBodyType());
        URLUtilsKt.takeFrom(this.url, builder.url);
        URLBuilder uRLBuilder = this.url;
        uRLBuilder.setEncodedPathSegments(uRLBuilder.getEncodedPathSegments());
        StringValuesKt.appendAll(getHeaders(), builder.getHeaders());
        AttributesKt.putAll(this.attributes, builder.attributes);
        return this;
    }

    @InternalAPI
    public final HttpRequestBuilder takeFromWithExecutionContext(HttpRequestBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        this.executionContext = builder.executionContext;
        return takeFrom(builder);
    }

    public final void url(p block) {
        e0.checkNotNullParameter(block, "block");
        URLBuilder uRLBuilder = this.url;
        block.invoke(uRLBuilder, uRLBuilder);
    }

    @InternalAPI
    public final void setBody(Object obj) {
        e0.checkNotNullParameter(obj, zAQQWzBxnS.todCHM);
        this.body = obj;
    }
}
