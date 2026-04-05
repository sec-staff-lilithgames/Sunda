package io.ktor.client.plugins.websocket;

import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CompletableDeferred;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BuildersKt$webSocketSession$2$1$1 extends f0 implements l {
    final /* synthetic */ CompletableDeferred<x0> $sessionCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$webSocketSession$2$1$1(CompletableDeferred<x0> completableDeferred) {
        super(1);
        this.$sessionCompleted = completableDeferred;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            this.$sessionCompleted.completeExceptionally(th2);
        } else {
            this.$sessionCompleted.complete(x0.f87415a);
        }
    }
}
