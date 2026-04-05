package kotlinx.coroutines.flow;

import av.e;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kv.l;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class DistinctFlowImpl<T> implements Flow<T> {
    public final p areEquivalent;
    public final l keySelector;
    private final Flow<T> upstream;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ b1 $previousKey;
        final /* synthetic */ DistinctFlowImpl<T> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, b1 b1Var, FlowCollector<? super T> flowCollector) {
            this.this$0 = distinctFlowImpl;
            this.$previousKey = b1Var;
            this.$collector = flowCollector;
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                tu.x0 r3 = tu.x0.f87415a
                r4 = 1
                if (r2 == 0) goto L33
                if (r2 != r4) goto L2b
                tu.a0.throwOnFailure(r8)
                goto L67
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L33:
                tu.a0.throwOnFailure(r8)
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r8 = r6.this$0
                kv.l r8 = r8.keySelector
                java.lang.Object r8 = r8.invoke(r7)
                kotlin.jvm.internal.b1 r2 = r6.$previousKey
                java.lang.Object r2 = r2.f71816b
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                if (r2 == r5) goto L58
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r5 = r6.this$0
                kv.p r5 = r5.areEquivalent
                java.lang.Object r2 = r5.invoke(r2, r8)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L57
                goto L58
            L57:
                return r3
            L58:
                kotlin.jvm.internal.b1 r2 = r6.$previousKey
                r2.f71816b = r8
                kotlinx.coroutines.flow.FlowCollector<T> r8 = r6.$collector
                r0.label = r4
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L67
                return r1
            L67:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(Flow<? extends T> flow, l lVar, p pVar) {
        this.upstream = flow;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
        b1 b1Var = new b1();
        b1Var.f71816b = NullSurrogateKt.NULL;
        Object objCollect = this.upstream.collect(new AnonymousClass2(this, b1Var, flowCollector), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }
}
