package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kv.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StateFlowKt {
    private static final Symbol NONE = new Symbol("NONE");
    private static final Symbol PENDING = new Symbol("PENDING");

    public static final <T> MutableStateFlow<T> MutableStateFlow(T t10) {
        if (t10 == null) {
            t10 = (T) NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(t10);
    }

    public static final <T> Flow<T> fuseStateFlow(StateFlow<? extends T> stateFlow, m mVar, int i10, BufferOverflow bufferOverflow) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? SharedFlowKt.fuseSharedFlow(stateFlow, mVar, i10, bufferOverflow) : stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getAndUpdate(MutableStateFlow<T> mutableStateFlow, l lVar) {
        T t10;
        do {
            t10 = (T) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(t10, lVar.invoke(t10)));
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(MutableStateFlow<T> mutableStateFlow, l lVar) {
        Object value;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, lVar.invoke(value)));
    }

    public static final <T> T updateAndGet(MutableStateFlow<T> mutableStateFlow, l lVar) {
        T value;
        T t10;
        do {
            value = mutableStateFlow.getValue();
            t10 = (T) lVar.invoke(value);
        } while (!mutableStateFlow.compareAndSet(value, t10));
        return t10;
    }
}
