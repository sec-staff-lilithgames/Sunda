package io.ktor.client;

import io.ktor.client.engine.HttpClientEngineFactory;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HttpClientJvmKt {
    private static final HttpClientEngineFactory<?> FACTORY;
    private static final List<HttpClientEngineContainer> engines;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.HttpClientJvmKt$HttpClient$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(HttpClientConfig<?> httpClientConfig) {
            e0.checkNotNullParameter(httpClientConfig, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpClientConfig<?>) obj);
            return x0.f87415a;
        }
    }

    static {
        HttpClientEngineFactory<?> factory;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(HttpClientEngineContainer.class, HttpClientEngineContainer.class.getClassLoader());
        e0.checkNotNullExpressionValue(serviceLoaderLoad, "load(it, it.classLoader)");
        List<HttpClientEngineContainer> list = y0.toList(serviceLoaderLoad);
        engines = list;
        HttpClientEngineContainer httpClientEngineContainer = (HttpClientEngineContainer) y0.firstOrNull((List) list);
        if (httpClientEngineContainer == null || (factory = httpClientEngineContainer.getFactory()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation in the classpath: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        FACTORY = factory;
    }

    public static final HttpClient HttpClient(l block) {
        e0.checkNotNullParameter(block, "block");
        return HttpClientKt.HttpClient(FACTORY, block);
    }

    public static /* synthetic */ HttpClient HttpClient$default(l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return HttpClient(lVar);
    }
}
