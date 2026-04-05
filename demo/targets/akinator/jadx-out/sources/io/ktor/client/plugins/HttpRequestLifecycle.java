package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestLifecycle {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<HttpRequestLifecycle> key = new AttributeKey<>("RequestLifecycle");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<x0, HttpRequestLifecycle> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpRequestLifecycle> getKey() {
            return HttpRequestLifecycle.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpRequestLifecycle plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getBefore(), new HttpRequestLifecycle$Plugin$install$1(scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpRequestLifecycle prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            return new HttpRequestLifecycle(null);
        }
    }

    public /* synthetic */ HttpRequestLifecycle(u uVar) {
        this();
    }

    private HttpRequestLifecycle() {
    }
}
