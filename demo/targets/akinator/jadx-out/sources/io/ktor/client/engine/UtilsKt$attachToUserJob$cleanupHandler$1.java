package io.ktor.client.engine;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.Job;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class UtilsKt$attachToUserJob$cleanupHandler$1 extends f0 implements l {
    final /* synthetic */ Job $callJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$attachToUserJob$cleanupHandler$1(Job job) {
        super(1);
        this.$callJob = job;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        if (th2 == null) {
            return;
        }
        this.$callJob.cancel(new CancellationException(th2.getMessage()));
    }
}
