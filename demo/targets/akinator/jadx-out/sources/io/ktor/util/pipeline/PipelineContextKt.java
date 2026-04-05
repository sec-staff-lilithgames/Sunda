package io.ktor.util.pipeline;

import java.util.List;
import kotlin.jvm.internal.e0;
import kv.q;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PipelineContextKt {
    public static final <TSubject, TContext> PipelineContext<TSubject, TContext> pipelineContextFor(TContext context, List<? extends q> interceptors, TSubject subject, m coroutineContext, boolean z10) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(interceptors, "interceptors");
        e0.checkNotNullParameter(subject, "subject");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return (PipelineContext_jvmKt.getDISABLE_SFG() || z10) ? new DebugPipelineContext(context, interceptors, subject, coroutineContext) : new SuspendFunctionGun(subject, context, interceptors);
    }

    public static /* synthetic */ PipelineContext pipelineContextFor$default(Object obj, List list, Object obj2, m mVar, boolean z10, int i10, Object obj3) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return pipelineContextFor(obj, list, obj2, mVar, z10);
    }
}
