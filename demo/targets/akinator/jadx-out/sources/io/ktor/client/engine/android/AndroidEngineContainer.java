package io.ktor.client.engine.android;

import io.ktor.client.HttpClientEngineContainer;
import io.ktor.client.engine.HttpClientEngineFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidEngineContainer implements HttpClientEngineContainer {
    private final HttpClientEngineFactory<?> factory = Android.INSTANCE;

    @Override // io.ktor.client.HttpClientEngineContainer
    public HttpClientEngineFactory<?> getFactory() {
        return this.factory;
    }

    public String toString() {
        return "Android";
    }
}
