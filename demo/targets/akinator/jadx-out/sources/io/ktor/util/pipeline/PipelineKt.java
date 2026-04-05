package io.ktor.util.pipeline;

import av.e;
import bv.f;
import bv.n;
import io.ktor.util.debug.ContextUtilsKt;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PipelineKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", i = {}, l = {478}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.pipeline.PipelineKt$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements l {
        final /* synthetic */ TContext $context;
        final /* synthetic */ Pipeline<x0, TContext> $this_execute;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Pipeline<x0, TContext> pipeline, TContext tcontext, d<? super AnonymousClass2> dVar) {
            super(1, dVar);
            this.$this_execute = pipeline;
            this.$context = tcontext;
        }

        @Override // bv.a
        public final d<x0> create(d<?> dVar) {
            return new AnonymousClass2(this.$this_execute, this.$context, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Pipeline<x0, TContext> pipeline = this.$this_execute;
                TContext tcontext = this.$context;
                this.label = 1;
                if (pipeline.execute(tcontext, x0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0Var;
        }

        @Override // kv.l
        public final Object invoke(d<? super x0> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", i = {}, l = {494}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.pipeline.PipelineKt$intercept$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        final /* synthetic */ q $block;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$block = qVar;
        }

        @Override // kv.q
        public final Object invoke(PipelineContext<? extends Object, TContext> pipelineContext, Object obj, d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, dVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                Object obj2 = this.L$1;
                e0.reifiedOperationMarker(3, "TSubject");
                if (obj2 == null) {
                    return x0Var;
                }
                if (pipelineContext == null) {
                    pipelineContext = null;
                }
                if (pipelineContext != null) {
                    q qVar = this.$block;
                    this.L$0 = null;
                    this.label = 1;
                    if (qVar.invoke(pipelineContext, obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0Var;
        }
    }

    public static final <TContext> Object execute(Pipeline<x0, TContext> pipeline, TContext tcontext, d<? super x0> dVar) {
        Object objInitContextInDebugMode = ContextUtilsKt.initContextInDebugMode(new AnonymousClass2(pipeline, tcontext, null), dVar);
        return objInitContextInDebugMode == e.getCOROUTINE_SUSPENDED() ? objInitContextInDebugMode : x0.f87415a;
    }

    private static final <TContext> Object execute$$forInline(Pipeline<x0, TContext> pipeline, TContext tcontext, d<? super x0> dVar) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(pipeline, tcontext, null);
        b0.mark(0);
        ContextUtilsKt.initContextInDebugMode(anonymousClass2, dVar);
        b0.mark(1);
        return x0.f87415a;
    }

    public static final /* synthetic */ <TSubject, TContext> void intercept(Pipeline<?, TContext> pipeline, PipelinePhase phase, q block) {
        e0.checkNotNullParameter(pipeline, "<this>");
        e0.checkNotNullParameter(phase, "phase");
        e0.checkNotNullParameter(block, "block");
        e0.needClassReification();
        pipeline.intercept(phase, new AnonymousClass1(block, null));
    }
}
