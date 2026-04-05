package io.ktor.client.engine.android;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class Android implements HttpClientEngineFactory<AndroidEngineConfig> {
    public static final Android INSTANCE = new Android();

    private Android() {
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public HttpClientEngine create(l block) {
        e0.checkNotNullParameter(block, "block");
        AndroidEngineConfig androidEngineConfig = new AndroidEngineConfig();
        block.invoke(androidEngineConfig);
        return new AndroidClientEngine(androidEngineConfig);
    }
}
