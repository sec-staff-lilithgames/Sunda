package io.ktor.client;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.engine.HttpClientEngineFactory;
import io.ktor.util.KtorDsl;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.Job;
import kv.l;
import tu.x0;
import zu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HttpClientKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientKt$HttpClient$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(HttpClientConfig httpClientConfig) {
            e0.checkNotNullParameter(httpClientConfig, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpClientConfig) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientKt$HttpClient$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ HttpClientEngine $engine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpClientEngine httpClientEngine) {
            super(1);
            this.$engine = httpClientEngine;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) throws IOException {
            this.$engine.close();
        }
    }

    @KtorDsl
    public static final <T extends HttpClientEngineConfig> HttpClient HttpClient(HttpClientEngineFactory<? extends T> engineFactory, l block) {
        e0.checkNotNullParameter(engineFactory, "engineFactory");
        e0.checkNotNullParameter(block, "block");
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        block.invoke(httpClientConfig);
        HttpClientEngine httpClientEngineCreate = engineFactory.create(httpClientConfig.getEngineConfig$ktor_client_core());
        HttpClient httpClient = new HttpClient(httpClientEngineCreate, httpClientConfig, true);
        k kVar = httpClient.getCoroutineContext().get(Job.Key);
        e0.checkNotNull(kVar);
        ((Job) kVar).invokeOnCompletion(new AnonymousClass2(httpClientEngineCreate));
        return httpClient;
    }

    public static /* synthetic */ HttpClient HttpClient$default(HttpClientEngineFactory httpClientEngineFactory, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return HttpClient(httpClientEngineFactory, lVar);
    }

    @KtorDsl
    public static final HttpClient HttpClient(HttpClientEngine engine, l block) {
        e0.checkNotNullParameter(engine, "engine");
        e0.checkNotNullParameter(block, "block");
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        block.invoke(httpClientConfig);
        return new HttpClient(engine, httpClientConfig, false);
    }
}
