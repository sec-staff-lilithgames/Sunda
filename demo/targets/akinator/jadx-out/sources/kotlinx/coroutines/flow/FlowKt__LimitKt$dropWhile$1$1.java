package kotlinx.coroutines.flow;

import kotlin.jvm.internal.w0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    final /* synthetic */ w0 $matched;
    final /* synthetic */ p $predicate;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(w0 w0Var, FlowCollector<? super T> flowCollector, p pVar) {
        this.$matched = w0Var;
        this.$this_flow = flowCollector;
        this.$predicate = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, zu.d<? super tu.x0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            tu.x0 r5 = tu.x0.f87415a
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            tu.a0.throwOnFailure(r9)
            goto L88
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            tu.a0.throwOnFailure(r9)
            goto L6c
        L43:
            tu.a0.throwOnFailure(r9)
            goto L5b
        L47:
            tu.a0.throwOnFailure(r9)
            kotlin.jvm.internal.w0 r9 = r7.$matched
            boolean r9 = r9.f71863b
            if (r9 == 0) goto L5c
            kotlinx.coroutines.flow.FlowCollector<T> r9 = r7.$this_flow
            r0.label = r6
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L5b
            goto L87
        L5b:
            return r5
        L5c:
            kv.p r9 = r7.$predicate
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L6b
            goto L87
        L6b:
            r2 = r7
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L88
            kotlin.jvm.internal.w0 r9 = r2.$matched
            r9.f71863b = r6
            kotlinx.coroutines.flow.FlowCollector<T> r9 = r2.$this_flow
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, zu.d):java.lang.Object");
    }
}
