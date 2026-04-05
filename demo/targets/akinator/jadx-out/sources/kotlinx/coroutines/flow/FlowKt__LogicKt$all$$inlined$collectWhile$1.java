package kotlinx.coroutines.flow;

import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.w0;
import kv.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__LogicKt$all$$inlined$collectWhile$1<T> implements FlowCollector<T> {
    final /* synthetic */ w0 $foundCounterExample$inlined;
    final /* synthetic */ p $predicate$inlined;

    @f(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1", f = "Logic.kt", i = {0}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LogicKt$all$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LogicKt$all$$inlined$collectWhile$1(p pVar, w0 w0Var) {
        this.$predicate$inlined = pVar;
        this.$foundCounterExample$inlined = w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(T r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1 r5 = (kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1) r5
            tu.a0.throwOnFailure(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            kv.p r6 = r4.$predicate$inlined
            r0.L$0 = r4
            r0.label = r3
            r2 = 6
            kotlin.jvm.internal.b0.mark(r2)
            java.lang.Object r6 = r6.invoke(r5, r0)
            r5 = 7
            kotlin.jvm.internal.b0.mark(r5)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r4
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5a
            kotlin.jvm.internal.w0 r0 = r5.$foundCounterExample$inlined
            r0.f71863b = r3
        L5a:
            if (r6 == 0) goto L5f
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L5f:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1.emit(java.lang.Object, zu.d):java.lang.Object");
    }
}
