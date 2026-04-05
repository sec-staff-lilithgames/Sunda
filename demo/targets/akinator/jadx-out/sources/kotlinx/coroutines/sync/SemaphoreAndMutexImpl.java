package kotlinx.coroutines.sync;

import av.e;
import bv.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import kv.l;
import kv.q;
import p0.o2;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final q onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    public SemaphoreAndMutexImpl(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(a.b.e(i10, "The number of acquired permits should be in 0..").toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i10 - i11;
        this.onCancellationRelease = new kotlinx.coroutines.a(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(d<? super x0> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(av.b.intercepted(dVar));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super x0>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return result == e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        long j10 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                        break loop0;
                    }
                    if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM5203getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM5203getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
        int i10 = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i10, null, waiter)) {
            if (acquirers.get(i10) != null) {
                Symbol symbol = SemaphoreKt.PERMIT;
                Symbol symbol2 = SemaphoreKt.TAKEN;
                AtomicReferenceArray acquirers2 = semaphoreSegment2.getAcquirers();
                while (!acquirers2.compareAndSet(i10, symbol, symbol2)) {
                    if (acquirers2.get(i10) != symbol) {
                        return false;
                    }
                }
                boolean z10 = waiter instanceof CancellableContinuation;
                x0 x0Var = x0.f87415a;
                if (z10) {
                    e0.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((CancellableContinuation) waiter).resume((CancellableContinuation) x0Var, this.onCancellationRelease);
                } else {
                    if (!(waiter instanceof SelectInstance)) {
                        throw new IllegalStateException(("unexpected: " + waiter).toString());
                    }
                    ((SelectInstance) waiter).selectInRegistrationPhase(x0Var);
                }
                return true;
            }
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i10);
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i10;
        do {
            i10 = _availablePermits$volatile$FU.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i10, this.permits));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onCancellationRelease$lambda$2(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th2, x0 x0Var, m mVar) {
        semaphoreAndMutexImpl.release();
        return x0.f87415a;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j10) {
        this.deqIdx$volatile = j10;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j10) {
        this.enqIdx$volatile = j10;
    }

    private final /* synthetic */ void setHead$volatile(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i10) {
        this._availablePermits$volatile = i10;
    }

    private final boolean tryResumeAcquire(Object obj) {
        boolean z10 = obj instanceof CancellableContinuation;
        x0 x0Var = x0.f87415a;
        if (!z10) {
            if (obj instanceof SelectInstance) {
                return ((SelectInstance) obj).trySelect(this, x0Var);
            }
            throw new IllegalStateException(o2.o(obj, "unexpected: "));
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object objTryResume = cancellableContinuation.tryResume(x0Var, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j10 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                    break loop0;
                }
                if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM5203getSegmentimpl)) {
                    if (atomicReferenceFieldUpdater.get(this) != segment) {
                        if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM5203getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
        semaphoreSegment2.cleanPrev();
        boolean z10 = false;
        if (semaphoreSegment2.f71893id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i10, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        int i11 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i12 = 0; i12 < i11; i12++) {
            if (semaphoreSegment2.getAcquirers().get(i10) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        Symbol symbol = SemaphoreKt.PERMIT;
        Symbol symbol2 = SemaphoreKt.BROKEN;
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (true) {
            if (acquirers.compareAndSet(i10, symbol, symbol2)) {
                z10 = true;
                break;
            }
            if (acquirers.get(i10) != symbol) {
                break;
            }
        }
        return !z10;
    }

    public final Object acquire(d<? super x0> dVar) {
        Object objAcquireSlowPath;
        int iDecPermits = decPermits();
        x0 x0Var = x0.f87415a;
        return (iDecPermits <= 0 && (objAcquireSlowPath = acquireSlowPath(dVar)) == e.getCOROUTINE_SUSPENDED()) ? objAcquireSlowPath : x0Var;
    }

    public final int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(SelectInstance<?> selectInstance, Object obj) {
        while (decPermits() <= 0) {
            e0.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) selectInstance)) {
                return;
            }
        }
        selectInstance.selectInRegistrationPhase(x0.f87415a);
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryAcquire() {
        while (true) {
            int i10 = _availablePermits$volatile$FU.get(this);
            if (i10 > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W w10, l lVar, l lVar2) {
        while (decPermits() <= 0) {
            if (((Boolean) lVar.invoke(w10)).booleanValue()) {
                return;
            }
        }
        lVar2.invoke(w10);
    }

    public final void acquire(CancellableContinuation<? super x0> cancellableContinuation) {
        while (decPermits() <= 0) {
            e0.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.resume((CancellableContinuation<? super x0>) x0.f87415a, this.onCancellationRelease);
    }
}
