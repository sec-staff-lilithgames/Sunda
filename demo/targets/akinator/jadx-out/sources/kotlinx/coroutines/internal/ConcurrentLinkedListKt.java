package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_ARRAY$Int(AtomicIntegerArray atomicIntegerArray, int i10, int i11, l lVar) {
        int i12;
        do {
            i12 = atomicIntegerArray.get(i10);
            if (!((Boolean) lVar.invoke(Integer.valueOf(i12))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i12, i12 + i11));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i10, l lVar) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
            if (!((Boolean) lVar.invoke(Integer.valueOf(i11))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, i11 + i10));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$BOXED_ATOMIC$Int(AtomicInteger atomicInteger, int i10, l lVar) {
        int i11;
        do {
            i11 = atomicInteger.get();
            if (!((Boolean) lVar.invoke(Integer.valueOf(i11))).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + i10));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n9) {
        while (true) {
            Object nextOrClosed = n9.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n9;
            }
            ?? r02 = (ConcurrentLinkedListNode) nextOrClosed;
            if (r02 != 0) {
                n9 = r02;
            } else if (n9.markAsClosed()) {
                return n9;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i10, long j10, S s10, p pVar) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s10, j10, pVar);
            if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceArray.get(i10);
                if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceArray.compareAndSet(i10, segment, segmentM5203getSegmentimpl)) {
                    if (atomicReferenceArray.get(i10) != segment) {
                        if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM5203getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return objFindSegmentInternal;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j10, S s10, p pVar) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s10, j10, pVar);
            if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, segmentM5203getSegmentimpl)) {
                    if (atomicReferenceFieldUpdater.get(obj) != segment) {
                        if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM5203getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return objFindSegmentInternal;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, long j10, S s10, p pVar) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s10, j10, pVar);
            if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReference.get();
                if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReference.compareAndSet(segment, segmentM5203getSegmentimpl)) {
                    if (atomicReference.get() != segment) {
                        if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM5203getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return objFindSegmentInternal;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode, kotlinx.coroutines.internal.Segment] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.internal.Segment] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final <S extends Segment<S>> Object findSegmentInternal(S s10, long j10, p pVar) {
        while (true) {
            if (s10.f71893id >= j10 && !s10.isRemoved()) {
                return SegmentOrClosed.m5200constructorimpl(s10);
            }
            Object nextOrClosed = s10.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m5200constructorimpl(CLOSED);
            }
            ?? r02 = (Segment) ((ConcurrentLinkedListNode) nextOrClosed);
            if (r02 == 0) {
                r02 = (Segment) pVar.invoke(Long.valueOf(s10.f71893id + 1), s10);
                if (s10.trySetNext(r02)) {
                    if (s10.isRemoved()) {
                        s10.remove();
                    }
                }
            }
            s10 = r02;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i10, S s10) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i10);
            if (segment.f71893id >= s10.f71893id) {
                return true;
            }
            if (!s10.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceArray.compareAndSet(i10, segment, s10)) {
                if (atomicReferenceArray.get(i10) != segment) {
                    if (s10.decPointers$kotlinx_coroutines_core()) {
                        s10.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s10) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.f71893id >= s10.f71893id) {
                return true;
            }
            if (!s10.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, s10)) {
                if (atomicReferenceFieldUpdater.get(obj) != segment) {
                    if (s10.decPointers$kotlinx_coroutines_core()) {
                        s10.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, S s10) {
        while (true) {
            Segment segment = (Segment) atomicReference.get();
            if (segment.f71893id >= s10.f71893id) {
                return true;
            }
            if (!s10.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReference.compareAndSet(segment, s10)) {
                if (atomicReference.get() != segment) {
                    if (s10.decPointers$kotlinx_coroutines_core()) {
                        s10.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }
}
