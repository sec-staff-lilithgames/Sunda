package kotlinx.coroutines.flow;

import bv.f;
import bv.n;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.p;
import kv.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {258, 258}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__ZipKt$combineUnsafe$1$1 extends n implements q {
    final /* synthetic */ p $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineUnsafe$1$1(p pVar, zu.d<? super FlowKt__ZipKt$combineUnsafe$1$1> dVar) {
        super(3, dVar);
        this.$transform = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            tu.a0.throwOnFailure(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            tu.a0.throwOnFailure(r6)
            goto L3b
        L22:
            tu.a0.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kv.p r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L3b
            goto L46
        L3b:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Object objInvoke = this.$transform.invoke((Object[]) this.L$1, this);
        b0.mark(0);
        flowCollector.emit(objInvoke, this);
        b0.mark(1);
        return x0.f87415a;
    }

    @Override // kv.q
    public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, zu.d<? super x0> dVar) {
        e0.needClassReification();
        FlowKt__ZipKt$combineUnsafe$1$1 flowKt__ZipKt$combineUnsafe$1$1 = new FlowKt__ZipKt$combineUnsafe$1$1(this.$transform, dVar);
        flowKt__ZipKt$combineUnsafe$1$1.L$0 = flowCollector;
        flowKt__ZipKt$combineUnsafe$1$1.L$1 = tArr;
        return flowKt__ZipKt$combineUnsafe$1$1.invokeSuspend(x0.f87415a);
    }
}
