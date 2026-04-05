package kotlinx.coroutines.flow;

import bv.f;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {
    private final p action;
    private final FlowCollector<T> collector;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {422, 426}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedFlowCollector<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedFlowCollector<T> subscribedFlowCollector, zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = subscribedFlowCollector;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onSubscription(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(FlowCollector<? super T> flowCollector, p pVar) {
        this.collector = flowCollector;
        this.action = pVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t10, zu.d<? super x0> dVar) {
        return this.collector.emit(t10, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onSubscription(zu.d<? super tu.x0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            tu.a0.throwOnFailure(r8)
            goto L7b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SubscribedFlowCollector r5 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r5
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L42
            goto L62
        L42:
            r8 = move-exception
            goto L7c
        L44:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r7.collector
            zu.m r6 = r0.getContext()
            r2.<init>(r8, r6)
            kv.p r8 = r7.action     // Catch: java.lang.Throwable -> L42
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L42
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L42
            r0.label = r5     // Catch: java.lang.Throwable -> L42
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L42
            if (r8 != r1) goto L61
            goto L7a
        L61:
            r5 = r7
        L62:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r5.collector
            boolean r2 = r8 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L7b
            kotlinx.coroutines.flow.SubscribedFlowCollector r8 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r8
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r8 = r8.onSubscription(r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r3
        L7c:
            r2.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.onSubscription(zu.d):java.lang.Object");
    }
}
