package kotlinx.coroutines.flow;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(T t10, zu.d<? super x0> dVar);

    StateFlow<Integer> getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(T t10);
}
