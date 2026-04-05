package io.ktor.util.pipeline;

import io.ktor.util.KtorDsl;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@KtorDsl
/* loaded from: classes8.dex */
public abstract class PipelineContext<TSubject, TContext> implements CoroutineScope {
    private final TContext context;

    public PipelineContext(TContext context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public abstract Object execute$ktor_utils(TSubject tsubject, d<? super TSubject> dVar);

    public abstract void finish();

    public final TContext getContext() {
        return this.context;
    }

    public abstract TSubject getSubject();

    public abstract Object proceed(d<? super TSubject> dVar);

    public abstract Object proceedWith(TSubject tsubject, d<? super TSubject> dVar);

    public abstract void setSubject(TSubject tsubject);
}
