package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CreatePluginUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.api.CreatePluginUtilsKt$createClientPlugin$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4278invoke() {
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4278invoke();
            return x0.f87415a;
        }
    }

    public static final <PluginConfigT> ClientPlugin<PluginConfigT> createClientPlugin(String name, a createConfiguration, l body) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(createConfiguration, "createConfiguration");
        e0.checkNotNullParameter(body, "body");
        return new ClientPlugin<PluginConfigT>(name, createConfiguration, body) { // from class: io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin.1
            final /* synthetic */ l $body;
            final /* synthetic */ a $createConfiguration;
            final /* synthetic */ String $name;
            private final AttributeKey<ClientPluginInstance<PluginConfigT>> key;

            {
                this.$name = name;
                this.$createConfiguration = createConfiguration;
                this.$body = body;
                this.key = new AttributeKey<>(name);
            }

            @Override // io.ktor.client.plugins.HttpClientPlugin
            public AttributeKey<ClientPluginInstance<PluginConfigT>> getKey() {
                return this.key;
            }

            @Override // io.ktor.client.plugins.HttpClientPlugin
            public void install(ClientPluginInstance<PluginConfigT> plugin, HttpClient scope) {
                e0.checkNotNullParameter(plugin, "plugin");
                e0.checkNotNullParameter(scope, "scope");
                plugin.install(scope);
            }

            @Override // io.ktor.client.plugins.HttpClientPlugin
            public ClientPluginInstance<PluginConfigT> prepare(l block) {
                e0.checkNotNullParameter(block, "block");
                Object objInvoke = this.$createConfiguration.invoke();
                block.invoke(objInvoke);
                return new ClientPluginInstance<>(objInvoke, this.$name, this.$body);
            }
        };
    }

    public static final ClientPlugin<x0> createClientPlugin(String name, l body) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(body, "body");
        return createClientPlugin(name, AnonymousClass2.INSTANCE, body);
    }
}
