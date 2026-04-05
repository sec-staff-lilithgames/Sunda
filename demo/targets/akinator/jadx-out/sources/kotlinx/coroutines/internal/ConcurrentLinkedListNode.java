package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kv.l;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ConcurrentLinkedListNode(N n9) {
        this._prev$volatile = n9;
    }

    private final N getAliveSegmentLeft() {
        N n9 = (N) getPrev();
        while (n9 != null && n9.isRemoved()) {
            n9 = (N) _prev$volatile$FU.get(n9);
        }
        return n9;
    }

    private final N getAliveSegmentRight() {
        ConcurrentLinkedListNode next;
        N n9 = (N) getNext();
        e0.checkNotNull(n9);
        while (n9.isRemoved() && (next = n9.getNext()) != null) {
            n9 = (N) next;
        }
        return n9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return _next$volatile$FU.get(this);
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lVar.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    break;
                }
            }
            return;
        }
    }

    public final void cleanPrev() {
        _prev$volatile$FU.set(this, null);
    }

    public final N getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == ConcurrentLinkedListKt.CLOSED) {
            return null;
        }
        return (N) nextOrClosed;
    }

    public final N getPrev() {
        return (N) _prev$volatile$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        Symbol symbol = ConcurrentLinkedListKt.CLOSED;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }

    public final N nextOrIfClosed(kv.a aVar) {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed != ConcurrentLinkedListKt.CLOSED) {
            return (N) nextOrClosed;
        }
        aVar.invoke();
        throw new k();
    }

    public final void remove() {
        if (isTail()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
            ConcurrentLinkedListNode aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
                ConcurrentLinkedListNode concurrentLinkedListNode = ((ConcurrentLinkedListNode) obj) == null ? null : aliveSegmentLeft;
                while (!atomicReferenceFieldUpdater.compareAndSet(aliveSegmentRight, obj, concurrentLinkedListNode)) {
                    if (atomicReferenceFieldUpdater.get(aliveSegmentRight) != obj) {
                        break;
                    }
                }
            }
            if (aliveSegmentLeft != null) {
                _next$volatile$FU.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(N n9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n9)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }
}
