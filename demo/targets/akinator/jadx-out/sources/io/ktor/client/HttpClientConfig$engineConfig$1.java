package io.ktor.client;

import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HttpClientConfig$engineConfig$1 extends f0 implements l {
    public static final HttpClientConfig$engineConfig$1 INSTANCE = new HttpClientConfig$engineConfig$1();

    public HttpClientConfig$engineConfig$1() {
        super(1);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(HttpClientEngineConfig httpClientEngineConfig) {
        e0.checkNotNullParameter(httpClientEngineConfig, "$this$null");
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpClientEngineConfig) obj);
        return x0.f87415a;
    }
}
