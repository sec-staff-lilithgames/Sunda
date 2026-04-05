package io.ktor.client.plugins;

import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CompletableJob;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultTransformKt$defaultTransformers$2$result$channel$2$1 extends f0 implements l {
    final /* synthetic */ CompletableJob $responseJobHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$2$1(CompletableJob completableJob) {
        super(1);
        this.$responseJobHolder = completableJob;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        this.$responseJobHolder.complete();
    }
}
