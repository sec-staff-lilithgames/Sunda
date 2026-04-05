package kotlinx.coroutines.flow;

import bv.f;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1<T> implements Flow<List<? extends T>> {
    final /* synthetic */ int $size$inlined;
    final /* synthetic */ Flow $this_chunked$inlined;

    @f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0}, l = {110, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL}, m = "collect", n = {"$this$chunked_u24lambda_u2413", "result"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(Flow flow, int i10) {
        this.$this_chunked$inlined = flow;
        this.$size$inlined = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r2.emit(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends T>> r8, zu.d<? super tu.x0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r9)
            goto L70
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.b1 r8 = (kotlin.jvm.internal.b1) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            tu.a0.throwOnFailure(r9)
            goto L5c
        L40:
            kotlin.jvm.internal.b1 r9 = com.google.android.gms.internal.play_billing.a.m(r9)
            kotlinx.coroutines.flow.Flow r2 = r7.$this_chunked$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1
            int r6 = r7.$size$inlined
            r5.<init>(r9, r6, r8)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r2.collect(r5, r0)
            if (r2 != r1) goto L5a
            goto L6f
        L5a:
            r2 = r8
            r8 = r9
        L5c:
            java.lang.Object r8 = r8.f71816b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L70
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, zu.d):java.lang.Object");
    }
}
