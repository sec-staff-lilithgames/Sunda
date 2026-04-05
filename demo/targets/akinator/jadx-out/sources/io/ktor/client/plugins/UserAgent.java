package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UserAgent {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<UserAgent> key = new AttributeKey<>("UserAgent");
    private final String agent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private String agent;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String getAgent() {
            return this.agent;
        }

        public final void setAgent(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.agent = str;
        }

        public Config(String agent) {
            e0.checkNotNullParameter(agent, "agent");
            this.agent = agent;
        }

        public /* synthetic */ Config(String str, int i10, u uVar) {
            this((i10 & 1) != 0 ? "Ktor http-client" : str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Config, UserAgent> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<UserAgent> getKey() {
            return UserAgent.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(UserAgent plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getState(), new UserAgent$Plugin$install$1(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public UserAgent prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config(null, 1, 0 == true ? 1 : 0);
            block.invoke(config);
            return new UserAgent(config.getAgent(), 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ UserAgent(String str, u uVar) {
        this(str);
    }

    public final String getAgent() {
        return this.agent;
    }

    private UserAgent(String str) {
        this.agent = str;
    }
}
