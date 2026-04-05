package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRedirect {
    private final boolean allowHttpsDowngrade;
    private final boolean checkHttpMethod;
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<HttpRedirect> key = new AttributeKey<>("HttpRedirect");
    private static final EventDefinition<HttpResponse> HttpResponseRedirect = new EventDefinition<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private boolean allowHttpsDowngrade;
        private boolean checkHttpMethod = true;

        public final boolean getAllowHttpsDowngrade() {
            return this.allowHttpsDowngrade;
        }

        public final boolean getCheckHttpMethod() {
            return this.checkHttpMethod;
        }

        public final void setAllowHttpsDowngrade(boolean z10) {
            this.allowHttpsDowngrade = z10;
        }

        public final void setCheckHttpMethod(boolean z10) {
            this.checkHttpMethod = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Config, HttpRedirect> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:20:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x019b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x019c -> B:35:0x01a2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object handleCall(io.ktor.client.plugins.Sender r17, io.ktor.client.request.HttpRequestBuilder r18, io.ktor.client.call.HttpClientCall r19, boolean r20, io.ktor.client.HttpClient r21, zu.d<? super io.ktor.client.call.HttpClientCall> r22) {
            /*
                Method dump skipped, instructions count: 449
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRedirect.Plugin.handleCall(io.ktor.client.plugins.Sender, io.ktor.client.request.HttpRequestBuilder, io.ktor.client.call.HttpClientCall, boolean, io.ktor.client.HttpClient, zu.d):java.lang.Object");
        }

        public final EventDefinition<HttpResponse> getHttpResponseRedirect() {
            return HttpRedirect.HttpResponseRedirect;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpRedirect> getKey() {
            return HttpRedirect.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpRedirect plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            ((HttpSend) HttpClientPluginKt.plugin(scope, HttpSend.Plugin)).intercept(new HttpRedirect$Plugin$install$1(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpRedirect prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpRedirect(config.getCheckHttpMethod(), config.getAllowHttpsDowngrade(), null);
        }
    }

    public /* synthetic */ HttpRedirect(boolean z10, boolean z11, u uVar) {
        this(z10, z11);
    }

    private HttpRedirect(boolean z10, boolean z11) {
        this.checkHttpMethod = z10;
        this.allowHttpsDowngrade = z11;
    }
}
