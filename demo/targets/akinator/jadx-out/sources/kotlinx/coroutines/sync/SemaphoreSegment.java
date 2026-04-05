package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class SemaphoreSegment extends Segment<SemaphoreSegment> {
    private final /* synthetic */ AtomicReferenceArray acquirers;

    public SemaphoreSegment(long j10, SemaphoreSegment semaphoreSegment, int i10) {
        super(j10, semaphoreSegment, i10);
        this.acquirers = new AtomicReferenceArray(SemaphoreKt.SEGMENT_SIZE);
    }

    public final boolean cas(int i10, Object obj, Object obj2) {
        AtomicReferenceArray acquirers = getAcquirers();
        while (!acquirers.compareAndSet(i10, obj, obj2)) {
            if (acquirers.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        return getAcquirers().get(i10);
    }

    public final /* synthetic */ AtomicReferenceArray getAcquirers() {
        return this.acquirers;
    }

    public final Object getAndSet(int i10, Object obj) {
        return getAcquirers().getAndSet(i10, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return SemaphoreKt.SEGMENT_SIZE;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int i10, Throwable th2, m mVar) {
        getAcquirers().set(i10, SemaphoreKt.CANCELLED);
        onSlotCleaned();
    }

    public final void set(int i10, Object obj) {
        getAcquirers().set(i10, obj);
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f71893id + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}
