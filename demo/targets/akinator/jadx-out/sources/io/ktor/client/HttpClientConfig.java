package io.ktor.client;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.KtorDsl;
import io.ktor.util.PlatformUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@KtorDsl
/* loaded from: classes2.dex */
public final class HttpClientConfig<T extends HttpClientEngineConfig> {
    private boolean expectSuccess;
    private final Map<AttributeKey<?>, l> plugins = new LinkedHashMap();
    private final Map<AttributeKey<?>, l> pluginConfigurations = new LinkedHashMap();
    private final Map<String, l> customInterceptors = new LinkedHashMap();
    private l engineConfig = HttpClientConfig$engineConfig$1.INSTANCE;
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientConfig$engine$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ l $block;
        final /* synthetic */ l $oldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, l lVar2) {
            super(1);
            this.$oldConfig = lVar;
            this.$block = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnonymousClass1) obj);
            return x0.f87415a;
        }

        public final void invoke(T t10) {
            e0.checkNotNullParameter(t10, "$this$null");
            this.$oldConfig.invoke(t10);
            this.$block.invoke(t10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientConfig$install$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C38931 extends f0 implements l {
        public static final C38931 INSTANCE = new C38931();

        public C38931() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4273invoke(Object obj) {
            e0.checkNotNullParameter(obj, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4273invoke(obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientConfig$install$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ l $configure;
        final /* synthetic */ l $previousConfigBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, l lVar2) {
            super(1);
            this.$previousConfigBlock = lVar;
            this.$configure = lVar2;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4274invoke(obj);
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4274invoke(Object obj) {
            e0.checkNotNullParameter(obj, "$this$null");
            l lVar = this.$previousConfigBlock;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            this.$configure.invoke(obj);
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: io.ktor.client.plugins.HttpClientPlugin<TBuilder, TPlugin> */
    /* JADX WARN: Unknown type variable: TPlugin in type: io.ktor.client.plugins.HttpClientPlugin<TBuilder, TPlugin> */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientConfig$install$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends f0 implements l {
        final /* synthetic */ HttpClientPlugin<TBuilder, TPlugin> $plugin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: io.ktor.client.plugins.HttpClientPlugin<? extends TBuilder, TPlugin> */
        /* JADX WARN: Unknown type variable: TPlugin in type: io.ktor.client.plugins.HttpClientPlugin<? extends TBuilder, TPlugin> */
        public AnonymousClass3(HttpClientPlugin<? extends TBuilder, TPlugin> httpClientPlugin) {
            super(1);
            this.$plugin = httpClientPlugin;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpClient) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpClient scope) {
            e0.checkNotNullParameter(scope, "scope");
            Attributes attributes = (Attributes) scope.getAttributes().computeIfAbsent(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), HttpClientConfig$install$3$attributes$1.INSTANCE);
            Object obj = ((HttpClientConfig) scope.getConfig$ktor_client_core()).pluginConfigurations.get(this.$plugin.getKey());
            e0.checkNotNull(obj);
            Object objPrepare = this.$plugin.prepare((l) obj);
            this.$plugin.install(objPrepare, scope);
            attributes.put(this.$plugin.getKey(), objPrepare);
        }
    }

    public static /* synthetic */ void install$default(HttpClientConfig httpClientConfig, HttpClientPlugin httpClientPlugin, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C38931.INSTANCE;
        }
        httpClientConfig.install(httpClientPlugin, lVar);
    }

    public final HttpClientConfig<T> clone() {
        HttpClientConfig<T> httpClientConfig = new HttpClientConfig<>();
        httpClientConfig.plusAssign(this);
        return httpClientConfig;
    }

    public final void engine(l block) {
        e0.checkNotNullParameter(block, "block");
        this.engineConfig = new AnonymousClass1(this.engineConfig, block);
    }

    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final l getEngineConfig$ktor_client_core() {
        return this.engineConfig;
    }

    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final boolean getUseDefaultTransformers() {
        return this.useDefaultTransformers;
    }

    public final <TBuilder, TPlugin> void install(HttpClientPlugin<? extends TBuilder, TPlugin> plugin, l configure) {
        e0.checkNotNullParameter(plugin, "plugin");
        e0.checkNotNullParameter(configure, "configure");
        this.pluginConfigurations.put(plugin.getKey(), new AnonymousClass2(this.pluginConfigurations.get(plugin.getKey()), configure));
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new AnonymousClass3(plugin));
    }

    public final void plusAssign(HttpClientConfig<? extends T> other) {
        e0.checkNotNullParameter(other, "other");
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.plugins.putAll(other.plugins);
        this.pluginConfigurations.putAll(other.pluginConfigurations);
        this.customInterceptors.putAll(other.customInterceptors);
    }

    public final void setDevelopmentMode(boolean z10) {
        this.developmentMode = z10;
    }

    public final void setEngineConfig$ktor_client_core(l lVar) {
        e0.checkNotNullParameter(lVar, "<set-?>");
        this.engineConfig = lVar;
    }

    public final void setExpectSuccess(boolean z10) {
        this.expectSuccess = z10;
    }

    public final void setFollowRedirects(boolean z10) {
        this.followRedirects = z10;
    }

    public final void setUseDefaultTransformers(boolean z10) {
        this.useDefaultTransformers = z10;
    }

    public final void install(String key, l lVar) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(lVar, wHkgq.gSuWquycoDdOqza);
        this.customInterceptors.put(key, lVar);
    }

    public final void install(HttpClient client) {
        e0.checkNotNullParameter(client, "client");
        Iterator<T> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(client);
        }
    }
}
