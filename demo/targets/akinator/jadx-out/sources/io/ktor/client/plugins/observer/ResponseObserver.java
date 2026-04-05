package io.ktor.client.plugins.observer;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ResponseObserver {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<ResponseObserver> key = new AttributeKey<>("BodyInterceptor");
    private final l filter;
    private final p responseHandler;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private l filter;
        private p responseHandler = new ResponseObserver$Config$responseHandler$1(null);

        public final void filter(l block) {
            e0.checkNotNullParameter(block, "block");
            this.filter = block;
        }

        public final l getFilter$ktor_client_core() {
            return this.filter;
        }

        public final p getResponseHandler$ktor_client_core() {
            return this.responseHandler;
        }

        public final void onResponse(p block) {
            e0.checkNotNullParameter(block, "block");
            this.responseHandler = block;
        }

        public final void setFilter$ktor_client_core(l lVar) {
            this.filter = lVar;
        }

        public final void setResponseHandler$ktor_client_core(p pVar) {
            e0.checkNotNullParameter(pVar, "<set-?>");
            this.responseHandler = pVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Config, ResponseObserver> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<ResponseObserver> getKey() {
            return ResponseObserver.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(ResponseObserver plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getReceivePipeline().intercept(HttpReceivePipeline.Phases.getAfter(), new ResponseObserver$Plugin$install$1(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public ResponseObserver prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new ResponseObserver(config.getResponseHandler$ktor_client_core(), config.getFilter$ktor_client_core());
        }
    }

    public ResponseObserver(p responseHandler, l lVar) {
        e0.checkNotNullParameter(responseHandler, "responseHandler");
        this.responseHandler = responseHandler;
        this.filter = lVar;
    }

    public /* synthetic */ ResponseObserver(p pVar, l lVar, int i10, u uVar) {
        this(pVar, (i10 & 2) != 0 ? null : lVar);
    }
}
