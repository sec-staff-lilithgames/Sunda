package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.q;
import kv.r;
import kv.s;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@KtorDsl
/* loaded from: classes7.dex */
public final class ClientPluginBuilder<PluginConfig> {
    private final HttpClient client;
    private final List<HookHandler<?>> hooks;
    private final AttributeKey<ClientPluginInstance<PluginConfig>> key;
    private a onClose;
    private final PluginConfig pluginConfig;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.api.ClientPluginBuilder$onClose$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4276invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4276invoke();
            return x0.f87415a;
        }
    }

    public ClientPluginBuilder(AttributeKey<ClientPluginInstance<PluginConfig>> key, HttpClient client, PluginConfig pluginConfig) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(pluginConfig, "pluginConfig");
        this.key = key;
        this.client = client;
        this.pluginConfig = pluginConfig;
        this.hooks = new ArrayList();
        this.onClose = AnonymousClass1.INSTANCE;
    }

    public final HttpClient getClient() {
        return this.client;
    }

    public final List<HookHandler<?>> getHooks$ktor_client_core() {
        return this.hooks;
    }

    public final AttributeKey<ClientPluginInstance<PluginConfig>> getKey$ktor_client_core() {
        return this.key;
    }

    public final a getOnClose$ktor_client_core() {
        return this.onClose;
    }

    public final PluginConfig getPluginConfig() {
        return this.pluginConfig;
    }

    public final <HookHandler> void on(ClientHook<HookHandler> hook, HookHandler hookhandler) {
        e0.checkNotNullParameter(hook, "hook");
        this.hooks.add(new HookHandler<>(hook, hookhandler));
    }

    public final void onClose(a block) {
        e0.checkNotNullParameter(block, "block");
        this.onClose = block;
    }

    public final void onRequest(r block) {
        e0.checkNotNullParameter(block, "block");
        on(RequestHook.INSTANCE, block);
    }

    public final void onResponse(q block) {
        e0.checkNotNullParameter(block, "block");
        on(ResponseHook.INSTANCE, block);
    }

    public final void setOnClose$ktor_client_core(a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.onClose = aVar;
    }

    public final void transformRequestBody(s block) {
        e0.checkNotNullParameter(block, "block");
        on(TransformRequestBodyHook.INSTANCE, block);
    }

    public final void transformResponseBody(s block) {
        e0.checkNotNullParameter(block, "block");
        on(TransformResponseBodyHook.INSTANCE, block);
    }
}
