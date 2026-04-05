package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kv.l;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ThreadState extends JobNode {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _state$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    private DisposableHandle cancelHandle;
    private final Thread targetThread = Thread.currentThread();

    private final /* synthetic */ int get_state$volatile() {
        return this._state$volatile;
    }

    private final Void invalidState(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_state$volatile(int i10) {
        this._state$volatile = i10;
    }

    public final void clearInterrupt() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _state$volatile$FU;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        invalidState(i10);
                        throw new k();
                    }
                }
            } else if (_state$volatile$FU.compareAndSet(this, i10, 1)) {
                DisposableHandle disposableHandle = this.cancelHandle;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _state$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                invalidState(i10);
                throw new k();
            }
        } while (!_state$volatile$FU.compareAndSet(this, i10, 2));
        this.targetThread.interrupt();
        _state$volatile$FU.set(this, 3);
    }

    public final void setup(Job job) {
        int i10;
        this.cancelHandle = JobKt__JobKt.invokeOnCompletion$default(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _state$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                invalidState(i10);
                throw new k();
            }
        } while (!_state$volatile$FU.compareAndSet(this, i10, 0));
    }
}
