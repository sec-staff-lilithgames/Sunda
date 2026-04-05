package kotlinx.coroutines.flow;

import av.e;
import bv.h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    public final Object awaitPending(zu.d<? super x0> dVar) {
        x0 x0Var;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReference atomicReference = this._state;
        Symbol symbol = StateFlowKt.NONE;
        while (true) {
            boolean zCompareAndSet = atomicReference.compareAndSet(symbol, cancellableContinuationImpl);
            x0Var = x0.f87415a;
            if (zCompareAndSet) {
                break;
            }
            if (atomicReference.get() != symbol) {
                int i10 = z.f87419c;
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(x0Var));
                break;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result == e.getCOROUTINE_SUSPENDED() ? result : x0Var;
    }

    public final void makePending() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object value = Concurrent_commonKt.getValue(atomicReference);
            if (value == null || value == StateFlowKt.PENDING) {
                return;
            }
            if (value == StateFlowKt.NONE) {
                AtomicReference<Object> atomicReference2 = this._state;
                Symbol symbol = StateFlowKt.PENDING;
                while (!atomicReference2.compareAndSet(value, symbol)) {
                    if (atomicReference2.get() != value) {
                        break;
                    }
                }
                return;
            }
            AtomicReference<Object> atomicReference3 = this._state;
            Symbol symbol2 = StateFlowKt.NONE;
            while (!atomicReference3.compareAndSet(value, symbol2)) {
                if (atomicReference3.get() != value) {
                    break;
                }
            }
            int i10 = z.f87419c;
            ((CancellableContinuationImpl) value).resumeWith(z.m7131constructorimpl(x0.f87415a));
            return;
        }
    }

    public final boolean takePending() {
        Object andSet = this._state.getAndSet(StateFlowKt.NONE);
        e0.checkNotNull(andSet);
        return andSet == StateFlowKt.PENDING;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(StateFlowImpl<?> stateFlowImpl) {
        if (Concurrent_commonKt.getValue(this._state) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(this._state, StateFlowKt.NONE);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public zu.d<x0>[] freeLocked(StateFlowImpl<?> stateFlowImpl) {
        Concurrent_commonKt.setValue(this._state, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }
}
