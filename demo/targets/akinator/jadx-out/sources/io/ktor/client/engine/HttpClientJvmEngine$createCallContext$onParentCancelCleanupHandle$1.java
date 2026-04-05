package io.ktor.client.engine;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.JobKt__JobKt;
import kv.l;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class HttpClientJvmEngine$createCallContext$onParentCancelCleanupHandle$1 extends f0 implements l {
    final /* synthetic */ m $callContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientJvmEngine$createCallContext$onParentCancelCleanupHandle$1(m mVar) {
        super(1);
        this.$callContext = mVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            JobKt__JobKt.cancel$default(this.$callContext, (CancellationException) null, 1, (Object) null);
        }
    }
}
