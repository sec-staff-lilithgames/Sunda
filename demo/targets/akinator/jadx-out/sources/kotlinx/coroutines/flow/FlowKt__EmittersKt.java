package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b0;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__EmittersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Flow<T> $this_transform;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07331<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ q $transform;

            /* JADX WARN: Multi-variable type inference failed */
            public C07331(q qVar, FlowCollector<? super R> flowCollector) {
                this.$transform = qVar;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, zu.d<? super tu.x0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    kv.q r6 = r4.$transform
                    kotlinx.coroutines.flow.FlowCollector<R> r2 = r4.$$this$flow
                    r0.label = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1.C07331.emit(java.lang.Object, zu.d):java.lang.Object");
            }

            public final Object emit$$forInline(T t10, zu.d<? super x0> dVar) {
                b0.mark(4);
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, dVar);
                b0.mark(5);
                this.$transform.invoke(this.$$this$flow, t10, dVar);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, q qVar, zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_transform = flow;
            this.$transform = qVar;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_transform, this.$transform, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<T> flow = this.$this_transform;
                C07331 c07331 = new C07331(this.$transform, flowCollector);
                this.label = 1;
                if (flow.collect(c07331, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T> flow = this.$this_transform;
            C07331 c07331 = new C07331(this.$transform, flowCollector);
            b0.mark(0);
            flow.collect(c07331, this);
            b0.mark(1);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).f71886e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector<? super T> r4, kv.q r5, java.lang.Throwable r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2e
            r0.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            tu.h.addSuppressed(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.invokeSafely$FlowKt__EmittersKt(kotlinx.coroutines.flow.FlowCollector, kv.q, java.lang.Throwable, zu.d):java.lang.Object");
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, q qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, qVar);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, p pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, pVar);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, p pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, flow);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, q qVar) {
        return FlowKt.flow(new AnonymousClass1(flow, qVar, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, q qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, qVar);
    }
}
