package kotlinx.coroutines.internal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {
    private static final /* synthetic */ AtomicIntegerFieldUpdater cleanedAndPointers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: id, reason: collision with root package name */
    public final long f71893id;

    public Segment(long j10, S s10, int i10) {
        super(s10);
        this.f71893id = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    private final /* synthetic */ int getCleanedAndPointers$volatile() {
        return this.cleanedAndPointers$volatile;
    }

    private final /* synthetic */ void setCleanedAndPointers$volatile(int i10) {
        this.cleanedAndPointers$volatile = i10;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return cleanedAndPointers$volatile$FU.addAndGet(this, -65536) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean isRemoved() {
        return cleanedAndPointers$volatile$FU.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i10, Throwable th2, m mVar);

    public final void onSlotCleaned() {
        if (cleanedAndPointers$volatile$FU.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = cleanedAndPointers$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == getNumberOfSlots() && !isTail()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE + i10));
        return true;
    }
}
