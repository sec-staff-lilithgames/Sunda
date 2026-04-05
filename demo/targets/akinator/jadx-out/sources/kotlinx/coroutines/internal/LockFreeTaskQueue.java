package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _cur$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public LockFreeTaskQueue(boolean z10) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, z10);
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_cur$volatile(Object obj) {
        this._cur$volatile = obj;
    }

    public final boolean addLast(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int iAddLast = lockFreeTaskQueueCore.addLast(e10);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _cur$volatile$FU;
                LockFreeTaskQueueCore<E> next = lockFreeTaskQueueCore.next();
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeTaskQueueCore, next) && atomicReferenceFieldUpdater2.get(this) == lockFreeTaskQueueCore) {
                }
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final void close() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore.close()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _cur$volatile$FU;
            LockFreeTaskQueueCore<E> next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeTaskQueueCore, next) && atomicReferenceFieldUpdater2.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }

    public final int getSize() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).isEmpty();
    }

    public final <R> List<R> map(l lVar) {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).map(lVar);
    }

    public final E removeFirstOrNull() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) lockFreeTaskQueueCore.removeFirstOrNull();
            if (e10 != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _cur$volatile$FU;
            LockFreeTaskQueueCore<E> next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeTaskQueueCore, next) && atomicReferenceFieldUpdater2.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }
}
