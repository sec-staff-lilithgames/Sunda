package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import kotlin.jvm.internal.b0;
import kv.p;
import tu.x0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ p $transform$inlined$1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ p $transform$inlined;

        @f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, p pVar) {
            this.$this_unsafeFlow = flowCollector;
            this.$transform$inlined = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                tu.a0.throwOnFailure(r8)
                goto L5d
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                tu.a0.throwOnFailure(r8)
                goto L51
            L3c:
                tu.a0.throwOnFailure(r8)
                kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                kv.p r2 = r6.$transform$inlined
                r0.L$0 = r8
                r0.label = r4
                java.lang.Object r7 = r2.invoke(r7, r0)
                if (r7 != r1) goto L4e
                goto L5c
            L4e:
                r5 = r8
                r8 = r7
                r7 = r5
            L51:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L5d
            L5c:
                return r1
            L5d:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object emit$$forInline(Object obj, zu.d dVar) {
            b0.mark(4);
            new AnonymousClass1(dVar);
            b0.mark(5);
            FlowCollector flowCollector = this.$this_unsafeFlow;
            Object objInvoke = this.$transform$inlined.invoke(obj, dVar);
            b0.mark(0);
            flowCollector.emit(objInvoke, dVar);
            b0.mark(1);
            return x0.f87415a;
        }
    }

    public FlowKt__TransformKt$map$$inlined$unsafeTransform$1(Flow flow, p pVar) {
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined$1 = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, zu.d dVar) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$transform$inlined$1), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, zu.d dVar) {
        b0.mark(4);
        new bv.d(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$map$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        b0.mark(5);
        Flow flow = this.$this_unsafeTransform$inlined;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(flowCollector, this.$transform$inlined$1);
        b0.mark(0);
        flow.collect(anonymousClass2, dVar);
        b0.mark(1);
        return x0.f87415a;
    }
}
