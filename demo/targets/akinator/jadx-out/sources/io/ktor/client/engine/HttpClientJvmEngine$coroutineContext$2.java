package io.ktor.client.engine;

import j1.o2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineName;
import kv.a;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientJvmEngine$coroutineContext$2 extends f0 implements a {
    final /* synthetic */ String $engineName;
    final /* synthetic */ HttpClientJvmEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientJvmEngine$coroutineContext$2(HttpClientJvmEngine httpClientJvmEngine, String str) {
        super(0);
        this.this$0 = httpClientJvmEngine;
        this.$engineName = str;
    }

    @Override // kv.a
    public final m invoke() {
        return this.this$0.getDispatcher().plus(this.this$0.clientContext).plus(new CoroutineName(o2.o(new StringBuilder(), this.$engineName, "-context")));
    }
}
