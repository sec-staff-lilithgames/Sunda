package kotlinx.coroutines.flow;

import kotlin.jvm.internal.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ z0 $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ Object $ownershipMarker;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(z0 z0Var, int i10, FlowCollector<? super T> flowCollector, Object obj) {
        this.$consumed = z0Var;
        this.$count = i10;
        this.$this_flow = flowCollector;
        this.$ownershipMarker = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r7, zu.d<? super tu.x0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            tu.a0.throwOnFailure(r8)
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            tu.a0.throwOnFailure(r8)
            goto L53
        L3a:
            tu.a0.throwOnFailure(r8)
            kotlin.jvm.internal.z0 r8 = r6.$consumed
            int r2 = r8.f71866b
            int r2 = r2 + r5
            r8.f71866b = r2
            int r8 = r6.$count
            if (r2 >= r8) goto L54
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r6.$this_flow
            r0.label = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L53
            goto L60
        L53:
            return r3
        L54:
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r6.$this_flow
            java.lang.Object r2 = r6.$ownershipMarker
            r0.label = r4
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(r8, r7, r2, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, zu.d):java.lang.Object");
    }
}
