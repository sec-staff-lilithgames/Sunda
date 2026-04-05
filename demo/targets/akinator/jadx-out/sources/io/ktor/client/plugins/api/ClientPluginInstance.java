package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.InternalAPI;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kv.a;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ClientPluginInstance<PluginConfig> implements Closeable {
    private final l body;
    private final PluginConfig config;
    private final String name;
    private a onClose;

    public ClientPluginInstance(PluginConfig config, String name, l body) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(body, "body");
        this.config = config;
        this.name = name;
        this.body = body;
        this.onClose = ClientPluginInstance$onClose$1.INSTANCE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onClose.invoke();
    }

    public final l getBody$ktor_client_core() {
        return this.body;
    }

    public final PluginConfig getConfig$ktor_client_core() {
        return this.config;
    }

    public final String getName$ktor_client_core() {
        return this.name;
    }

    @InternalAPI
    public final void install(HttpClient scope) {
        e0.checkNotNullParameter(scope, "scope");
        ClientPluginBuilder clientPluginBuilder = new ClientPluginBuilder(new AttributeKey(this.name), scope, this.config);
        this.body.invoke(clientPluginBuilder);
        this.onClose = clientPluginBuilder.getOnClose$ktor_client_core();
        Iterator<T> it = clientPluginBuilder.getHooks$ktor_client_core().iterator();
        while (it.hasNext()) {
            ((HookHandler) it.next()).install(scope);
        }
    }
}
