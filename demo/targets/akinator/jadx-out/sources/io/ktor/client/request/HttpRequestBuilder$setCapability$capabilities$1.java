package io.ktor.client.request;

import io.ktor.client.engine.HttpClientEngineCapability;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestBuilder$setCapability$capabilities$1 extends f0 implements a {
    public static final HttpRequestBuilder$setCapability$capabilities$1 INSTANCE = new HttpRequestBuilder$setCapability$capabilities$1();

    public HttpRequestBuilder$setCapability$capabilities$1() {
        super(0);
    }

    @Override // kv.a
    public final Map<HttpClientEngineCapability<?>, Object> invoke() {
        return new LinkedHashMap();
    }
}
