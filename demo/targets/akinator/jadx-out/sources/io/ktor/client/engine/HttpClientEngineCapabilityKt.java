package io.ktor.client.engine;

import io.ktor.client.plugins.HttpTimeout;
import io.ktor.util.AttributeKey;
import java.util.Map;
import java.util.Set;
import uu.b2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientEngineCapabilityKt {
    private static final AttributeKey<Map<HttpClientEngineCapability<?>, Object>> ENGINE_CAPABILITIES_KEY = new AttributeKey<>("EngineCapabilities");
    private static final Set<HttpTimeout.Plugin> DEFAULT_CAPABILITIES = b2.setOf(HttpTimeout.Plugin);

    public static final Set<HttpTimeout.Plugin> getDEFAULT_CAPABILITIES() {
        return DEFAULT_CAPABILITIES;
    }

    public static final AttributeKey<Map<HttpClientEngineCapability<?>, Object>> getENGINE_CAPABILITIES_KEY() {
        return ENGINE_CAPABILITIES_KEY;
    }
}
