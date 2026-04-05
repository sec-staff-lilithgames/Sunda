package io.ktor.util.pipeline;

import bv.d;
import bv.f;
import io.ktor.util.KtorDsl;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.q;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@KtorDsl
/* loaded from: classes8.dex */
public final class DebugPipelineContext<TSubject, TContext> extends PipelineContext<TSubject, TContext> {
    private final m coroutineContext;
    private int index;
    private final List<q> interceptors;
    private TSubject subject;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {0}, l = {80}, m = "proceedLoop", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DebugPipelineContext<TSubject, TContext> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DebugPipelineContext<TSubject, TContext> debugPipelineContext, zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = debugPipelineContext;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.proceedLoop(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(TContext context, List<? extends q> interceptors, TSubject subject, m coroutineContext) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(interceptors, "interceptors");
        e0.checkNotNullParameter(subject, "subject");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.interceptors = interceptors;
        this.coroutineContext = coroutineContext;
        this.subject = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object proceedLoop(zu.d<? super TSubject> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = (io.ktor.util.pipeline.DebugPipelineContext.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = new io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.L$0
            io.ktor.util.pipeline.DebugPipelineContext r2 = (io.ktor.util.pipeline.DebugPipelineContext) r2
            tu.a0.throwOnFailure(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            tu.a0.throwOnFailure(r7)
            r2 = r6
        L39:
            int r7 = r2.index
            r4 = -1
            if (r7 != r4) goto L3f
            goto L4a
        L3f:
            java.util.List<kv.q> r4 = r2.interceptors
            int r5 = r4.size()
            if (r7 < r5) goto L4f
            r2.finish()
        L4a:
            java.lang.Object r7 = r2.getSubject()
            return r7
        L4f:
            java.lang.Object r4 = r4.get(r7)
            kv.q r4 = (kv.q) r4
            int r7 = r7 + 1
            r2.index = r7
            java.lang.String r7 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }"
            kotlin.jvm.internal.e0.checkNotNull(r4, r7)
            java.lang.Object r7 = r2.getSubject()
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r4.invoke(r2, r7, r0)
            if (r7 != r1) goto L39
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.DebugPipelineContext.proceedLoop(zu.d):java.lang.Object");
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object execute$ktor_utils(TSubject tsubject, zu.d<? super TSubject> dVar) {
        this.index = 0;
        setSubject(tsubject);
        return proceed(dVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = -1;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceed(zu.d<? super TSubject> dVar) {
        int i10 = this.index;
        if (i10 < 0) {
            return getSubject();
        }
        if (i10 < this.interceptors.size()) {
            return proceedLoop(dVar);
        }
        finish();
        return getSubject();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceedWith(TSubject tsubject, zu.d<? super TSubject> dVar) {
        setSubject(tsubject);
        return proceed(dVar);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(TSubject tsubject) {
        e0.checkNotNullParameter(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
