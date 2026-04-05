package io.ktor.client.plugins;

import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.JobKt;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestLifecycleKt$attachToClientEngineJob$handler$1 extends f0 implements l {
    final /* synthetic */ CompletableJob $requestJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycleKt$attachToClientEngineJob$handler$1(CompletableJob completableJob) {
        super(1);
        this.$requestJob = completableJob;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        if (th2 == null) {
            HttpRequestLifecycleKt.LOGGER.trace("Cancelling request because engine Job completed");
            this.$requestJob.complete();
            return;
        }
        HttpRequestLifecycleKt.LOGGER.trace("Cancelling request because engine Job failed with error: " + th2);
        JobKt.cancel(this.$requestJob, "Engine failed", th2);
    }
}
