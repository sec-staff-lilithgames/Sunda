package io.ktor.client.engine;

import io.ktor.util.CoroutinesUtilsKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineName;
import kv.a;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientEngineBase$coroutineContext$2 extends f0 implements a {
    final /* synthetic */ HttpClientEngineBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngineBase$coroutineContext$2(HttpClientEngineBase httpClientEngineBase) {
        super(0);
        this.this$0 = httpClientEngineBase;
    }

    @Override // kv.a
    public final m invoke() {
        return CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null).plus(this.this$0.getDispatcher()).plus(new CoroutineName(this.this$0.engineName + "-context"));
    }
}
