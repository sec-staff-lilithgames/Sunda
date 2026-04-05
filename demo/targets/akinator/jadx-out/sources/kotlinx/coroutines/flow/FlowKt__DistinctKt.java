package kotlinx.coroutines.flow;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    private static final l defaultKeySelector = new c(0);
    private static final p defaultAreEquivalent = new d();

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return flow instanceof StateFlow ? flow : distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, l lVar) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, lVar, defaultAreEquivalent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(Flow<? extends T> flow, l lVar, p pVar) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.keySelector == lVar && distinctFlowImpl.areEquivalent == pVar) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, lVar, pVar);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, p pVar) {
        l lVar = defaultKeySelector;
        e0.checkNotNull(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, lVar, (p) h1.beforeCheckcastToFunctionOfArity(pVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object defaultKeySelector$lambda$0$FlowKt__DistinctKt(Object obj) {
        return obj;
    }
}
