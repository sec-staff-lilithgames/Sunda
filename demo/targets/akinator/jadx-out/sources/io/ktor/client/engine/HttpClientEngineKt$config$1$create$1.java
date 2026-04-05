package io.ktor.client.engine;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientEngineKt$config$1$create$1 extends f0 implements l {
    final /* synthetic */ l $block;
    final /* synthetic */ l $nested;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngineKt$config$1$create$1(l lVar, l lVar2) {
        super(1);
        this.$nested = lVar;
        this.$block = lVar2;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpClientEngineConfig) obj);
        return x0.f87415a;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public final void invoke(HttpClientEngineConfig create) {
        e0.checkNotNullParameter(create, "$this$create");
        this.$nested.invoke(create);
        this.$block.invoke(create);
    }
}
