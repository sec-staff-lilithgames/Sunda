package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CancelledContinuation extends CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _resumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public CancelledContinuation(d<?> dVar, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    private final /* synthetic */ int get_resumed$volatile() {
        return this._resumed$volatile;
    }

    private final /* synthetic */ void set_resumed$volatile(int i10) {
        this._resumed$volatile = i10;
    }

    public final boolean makeResumed() {
        return _resumed$volatile$FU.compareAndSet(this, 0, 1);
    }
}
