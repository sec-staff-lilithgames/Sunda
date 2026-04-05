package kotlinx.coroutines;

import av.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kv.l;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decision$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public DispatchedCoroutine(m mVar, d<? super T> dVar) {
        super(mVar, dVar);
    }

    private final /* synthetic */ int get_decision$volatile() {
        return this._decision$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_decision$volatile(int i10) {
        this._decision$volatile = i10;
    }

    private final boolean tryResume() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$volatile$FU;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!_decision$volatile$FU.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean trySuspend() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$volatile$FU;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!_decision$volatile$FU.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        afterResume(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        if (tryResume()) {
            return;
        }
        DispatchedContinuationKt.resumeCancellableWith(av.b.intercepted(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont));
    }

    public final Object getResult$kotlinx_coroutines_core() {
        if (trySuspend()) {
            return e.getCOROUTINE_SUSPENDED();
        }
        Object objUnboxState = JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
        if (objUnboxState instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objUnboxState).cause;
        }
        return objUnboxState;
    }
}
