package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.jvm.internal.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__TransformKt$chunked$2$1<T> implements FlowCollector {
    final /* synthetic */ b1 $result;
    final /* synthetic */ int $size;
    final /* synthetic */ FlowCollector<List<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$chunked$2$1(b1 b1Var, int i10, FlowCollector<? super List<? extends T>> flowCollector) {
        this.$result = b1Var;
        this.$size = i10;
        this.$this_flow = flowCollector;
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
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r5 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1) r5
            tu.a0.throwOnFailure(r6)
            goto L64
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            kotlin.jvm.internal.b1 r6 = r4.$result
            java.lang.Object r6 = r6.f71816b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L4b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = r4.$size
            r6.<init>(r2)
            kotlin.jvm.internal.b1 r2 = r4.$result
            r2.f71816b = r6
        L4b:
            r6.add(r5)
            int r5 = r6.size()
            int r2 = r4.$size
            if (r5 != r2) goto L69
            kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> r5 = r4.$this_flow
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            r5 = r4
        L64:
            kotlin.jvm.internal.b1 r5 = r5.$result
            r6 = 0
            r5.f71816b = r6
        L69:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1.emit(java.lang.Object, zu.d):java.lang.Object");
    }
}
