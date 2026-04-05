package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.z0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class y {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f50215i;

        /* renamed from: j, reason: collision with root package name */
        public int f50216j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f50217k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f50218l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f50218l = i10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super tu.k0> flowCollector, zu.d<? super x0> dVar) {
            return ((a) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(this.f50218l, dVar);
            aVar.f50217k = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:16:0x0049). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.f50216j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                int r1 = r7.f50215i
                java.lang.Object r4 = r7.f50217k
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                tu.a0.throwOnFailure(r8)
                goto L62
            L24:
                int r1 = r7.f50215i
                java.lang.Object r4 = r7.f50217k
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                tu.a0.throwOnFailure(r8)
                goto L49
            L2e:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.f50217k
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                int r1 = r7.f50218l
                tu.k0 r5 = tu.k0.m7055boximpl(r1)
                r7.f50217k = r8
                r7.f50215i = r1
                r7.f50216j = r4
                java.lang.Object r4 = r8.emit(r5, r7)
                if (r4 != r0) goto L48
                goto L78
            L48:
                r4 = r8
            L49:
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r1 ^ r8
                int r8 = java.lang.Integer.compare(r5, r8)
                if (r8 <= 0) goto L79
                r7.f50217k = r4
                r7.f50215i = r1
                r7.f50216j = r3
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L62
                goto L78
            L62:
                int r1 = r1 + (-1)
                int r1 = tu.k0.m7056constructorimpl(r1)
                tu.k0 r8 = tu.k0.m7055boximpl(r1)
                r7.f50217k = r4
                r7.f50215i = r1
                r7.f50216j = r2
                java.lang.Object r8 = r4.emit(r8, r7)
                if (r8 != r0) goto L49
            L78:
                return r0
            L79:
                tu.x0 r8 = tu.x0.f87415a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f50219i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f50220j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ z0 f50221k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z0 f50222b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f50223c;

            public a(z0 z0Var, FlowCollector<? super tu.k0> flowCollector) {
                this.f50222b = z0Var;
                this.f50223c = flowCollector;
            }

            public final Object a(int i10, zu.d<? super x0> dVar) {
                this.f50222b.f71866b = i10;
                Object objEmit = this.f50223c.emit(tu.k0.m7055boximpl(i10), dVar);
                return objEmit == av.e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return a(((tu.k0) obj).m7061unboximpl(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z0 z0Var, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f50221k = z0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super tu.k0> flowCollector, zu.d<? super x0> dVar) {
            return ((b) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = new b(this.f50221k, dVar);
            bVar.f50220j = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50219i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f50220j;
                z0 z0Var = this.f50221k;
                Flow<tu.k0> flowA = y.a(z0Var.f71866b);
                a aVar = new a(z0Var, flowCollector);
                this.f50219i = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    public static final Flow<tu.k0> a(int i10) {
        return FlowKt.flow(new a(i10, null));
    }

    public static final StateFlow<tu.k0> a(int i10, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        z0 z0Var = new z0();
        z0Var.f71866b = i10;
        return FlowKt.stateIn(FlowKt.flow(new b(z0Var, null)), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), tu.k0.m7055boximpl(i10));
    }
}
