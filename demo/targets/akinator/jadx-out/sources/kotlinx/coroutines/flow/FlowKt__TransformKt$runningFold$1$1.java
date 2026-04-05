package kotlinx.coroutines.flow;

import kotlin.jvm.internal.b1;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    final /* synthetic */ b1 $accumulator;
    final /* synthetic */ q $operation;
    final /* synthetic */ FlowCollector<R> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1(b1 b1Var, q qVar, FlowCollector<? super R> flowCollector) {
        this.$accumulator = b1Var;
        this.$operation = qVar;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, zu.d<? super tu.x0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r8)
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.b1 r7 = (kotlin.jvm.internal.b1) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r2
            tu.a0.throwOnFailure(r8)
            goto L5a
        L40:
            tu.a0.throwOnFailure(r8)
            kotlin.jvm.internal.b1 r8 = r6.$accumulator
            kv.q r2 = r6.$operation
            java.lang.Object r5 = r8.f71816b
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r7 = r2.invoke(r5, r7, r0)
            if (r7 != r1) goto L56
            goto L6f
        L56:
            r2 = r8
            r8 = r7
            r7 = r2
            r2 = r6
        L5a:
            r7.f71816b = r8
            kotlinx.coroutines.flow.FlowCollector<R> r7 = r2.$this_flow
            kotlin.jvm.internal.b1 r8 = r2.$accumulator
            java.lang.Object r8 = r8.f71816b
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, zu.d):java.lang.Object");
    }
}
