package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.z0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kv.p;
import kv.q;
import p0.o2;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__LimitKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {134}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.collectWhile(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41551 extends n implements p {
        final /* synthetic */ Flow<T> $this_transformWhile;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41551(Flow<? extends T> flow, q qVar, zu.d<? super C41551> dVar) {
            super(2, dVar);
            this.$this_transformWhile = flow;
            this.$transform = qVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C41551 c41551 = new C41551(this.$this_transformWhile, this.$transform, dVar);
            c41551.L$0 = obj;
            return c41551;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T> flow = this.$this_transformWhile;
                FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.$transform, flowCollector);
                try {
                    this.L$0 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                    this.label = 1;
                    if (flow.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (AbortFlowException e10) {
                    e = e10;
                    flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                    FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                    JobKt.ensureActive(getContext());
                    return x0.f87415a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.L$0;
                try {
                    a0.throwOnFailure(obj);
                } catch (AbortFlowException e11) {
                    e = e11;
                    FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                    JobKt.ensureActive(getContext());
                    return x0.f87415a;
                }
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
            return ((C41551) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    private static final <T> Object collectWhile$$forInline(Flow<? extends T> flow, p pVar, zu.d<? super x0> dVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            b0.mark(0);
            flow.collect(flowKt__LimitKt$collectWhile$collector$1, dVar);
            b0.mark(1);
            return x0.f87415a;
        } catch (AbortFlowException e10) {
            FlowExceptions_commonKt.checkOwnership(e10, flowKt__LimitKt$collectWhile$collector$1);
            b0.mark(3);
            throw null;
        }
    }

    public static final <T> Flow<T> drop(final Flow<? extends T> flow, final int i10) {
        if (i10 >= 0) {
            return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
                    Object objCollect = flow.collect(new FlowKt__LimitKt$drop$2$1(new z0(), i10, flowCollector), dVar);
                    return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
                }
            };
        }
        throw new IllegalArgumentException(a.b.e(i10, "Drop count should be non-negative, but had ").toString());
    }

    public static final <T> Flow<T> dropWhile(final Flow<? extends T> flow, final p pVar) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
                Object objCollect = flow.collect(new FlowKt__LimitKt$dropWhile$1$1(new w0(), flowCollector, pVar), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object emitAbort$FlowKt__LimitKt(kotlinx.coroutines.flow.FlowCollector<? super T> r4, T r5, java.lang.Object r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.L$0
            tu.a0.throwOnFailure(r7)
            goto L41
        L33:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(kotlinx.coroutines.flow.FlowCollector, java.lang.Object, java.lang.Object, zu.d):java.lang.Object");
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(flow, i10);
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " should be positive").toString());
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, p pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(flow, pVar);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, q qVar) {
        return FlowKt.flow(new C41551(flow, qVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object collectWhile(kotlinx.coroutines.flow.Flow<? extends T> r4, kv.p r5, zu.d<? super tu.x0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            tu.a0.throwOnFailure(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L57
        L2d:
            r5 = move-exception
            goto L4d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 0
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB.vRWFSQcdl
            r4.<init>(r5)
            throw r4
        L38:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            if (r4 != r1) goto L57
            return r1
        L4b:
            r5 = move-exception
            r4 = r6
        L4d:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r5, r4)
            zu.m r4 = r0.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r4)
        L57:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile(kotlinx.coroutines.flow.Flow, kv.p, zu.d):java.lang.Object");
    }
}
