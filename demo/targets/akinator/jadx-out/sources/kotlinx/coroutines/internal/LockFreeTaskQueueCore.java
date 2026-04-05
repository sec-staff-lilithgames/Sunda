package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;
    public static final Companion Companion = new Companion(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int addFailReason(long j10) {
            return (j10 & LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j10, int i10) {
            return wo(j10, LockFreeTaskQueueCore.HEAD_MASK) | i10;
        }

        public final long updateTail(long j10, int i10) {
            return wo(j10, LockFreeTaskQueueCore.TAIL_MASK) | (i10 << 30);
        }

        public final <T> T withState(long j10, p pVar) {
            return (T) pVar.invoke(Integer.valueOf((int) (LockFreeTaskQueueCore.HEAD_MASK & j10)), Integer.valueOf((int) ((j10 & LockFreeTaskQueueCore.TAIL_MASK) >> 30)));
        }

        public final long wo(long j10, long j11) {
            return j10 & (~j11);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Placeholder {
        public final int index;

        public Placeholder(int i10) {
            this.index = i10;
        }
    }

    public LockFreeTaskQueueCore(int i10, boolean z10) {
        this.capacity = i10;
        this.singleConsumer = z10;
        int i11 = i10 - 1;
        this.mask = i11;
        this.array = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long j10) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i10 = (int) (HEAD_MASK & j10);
        int i11 = (int) ((TAIL_MASK & j10) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i12 & i11)) {
                _state$volatile$FU.set(lockFreeTaskQueueCore, Companion.wo(j10, FROZEN_MASK));
                return lockFreeTaskQueueCore;
            }
            Object placeholder = getArray().get(this.mask & i10);
            if (placeholder == null) {
                placeholder = new Placeholder(i10);
            }
            lockFreeTaskQueueCore.getArray().set(lockFreeTaskQueueCore.mask & i10, placeholder);
            i10++;
        }
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$volatile$FU;
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreAllocateNextCopy = allocateNextCopy(j10);
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, lockFreeTaskQueueCoreAllocateNextCopy) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int i10, E e10) {
        Object obj = getArray().get(this.mask & i10);
        if (!(obj instanceof Placeholder) || ((Placeholder) obj).index != i10) {
            return null;
        }
        getArray().set(i10 & this.mask, e10);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray getArray() {
        return this.array;
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ long get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final long markFrozen() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & FROZEN_MASK) != 0) {
                return j10;
            }
            j11 = FROZEN_MASK | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (HEAD_MASK & j10);
            if ((FROZEN_MASK & j10) != 0) {
                return next();
            }
        } while (!_state$volatile$FU.compareAndSet(this, j10, Companion.updateHead(j10, i11)));
        getArray().set(this.mask & i12, null);
        return null;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(long j10) {
        this._state$volatile = j10;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, ((Number) lVar.invoke(Long.valueOf(j10))).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final /* synthetic */ long updateAndGet$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            Number number = (Number) lVar.invoke(Long.valueOf(j10));
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, number.longValue())) {
                return number.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int addLast(E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r13 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            int r13 = r13.addFailReason(r3)
            return r13
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.mask
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.singleConsumer
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.getArray()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.capacity
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = get_state$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r5 = r5.updateTail(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.getArray()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = get_state$volatile$FU()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.fillPlaceholder(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueueCore.addLast(java.lang.Object):int");
    }

    public final boolean close() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, CLOSED_MASK | j10));
        return true;
    }

    public final int getSize() {
        long j10 = _state$volatile$FU.get(this);
        return (((int) ((j10 & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j10))) & MAX_CAPACITY_MASK;
    }

    public final boolean isClosed() {
        return (_state$volatile$FU.get(this) & CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j10 = _state$volatile$FU.get(this);
        return ((int) (HEAD_MASK & j10)) == ((int) ((j10 & TAIL_MASK) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> List<R> map(l lVar) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j10 = _state$volatile$FU.get(this);
        int i10 = (int) (HEAD_MASK & j10);
        int i11 = (int) ((j10 & TAIL_MASK) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i12 & i11)) {
                return arrayList;
            }
            Object obj = getArray().get(this.mask & i10);
            if (obj != null && !(obj instanceof Placeholder)) {
                arrayList.add(lVar.invoke(obj));
            }
            i10++;
        }
    }

    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK & j10) != 0) {
                return REMOVE_FROZEN;
            }
            int i10 = (int) (HEAD_MASK & j10);
            int i11 = (int) ((TAIL_MASK & j10) >> 30);
            int i12 = this.mask;
            if ((i11 & i12) == (i12 & i10)) {
                return null;
            }
            Object obj = getArray().get(this.mask & i10);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i13 = (i10 + 1) & MAX_CAPACITY_MASK;
                if (_state$volatile$FU.compareAndSet(this, j10, Companion.updateHead(j10, i13))) {
                    getArray().set(this.mask & i10, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreRemoveSlowPath = this;
                    do {
                        lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i10, i13);
                    } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                    return obj;
                }
            }
        }
    }
}
