package kotlinx.coroutines.debug.internal;

import a1.n;
import com.ironsource.C3191e4;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import lv.c;
import lv.f;
import qv.v;
import tu.k;
import tu.x0;
import uu.p;
import uu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ConcurrentWeakMap<K, V> extends p {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater core$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;
    private final ReferenceQueue<K> weakRefQueue;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class Core {
        private static final /* synthetic */ AtomicIntegerFieldUpdater load$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");
        private final int allocated;
        private final /* synthetic */ AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        private final int threshold;
        private final /* synthetic */ AtomicReferenceArray values;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public final class KeyValueIterator<E> implements Iterator<E>, c {
            private final kv.p factory;
            private int index = -1;
            private K key;
            private V value;

            public KeyValueIterator(kv.p pVar) {
                this.factory = pVar;
                findNext();
            }

            private final void findNext() {
                K k10;
                while (true) {
                    int i10 = this.index + 1;
                    this.index = i10;
                    if (i10 >= ((Core) Core.this).allocated) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.getKeys().get(this.index);
                    if (hashedWeakRef != null && (k10 = (K) hashedWeakRef.get()) != null) {
                        this.key = k10;
                        Object obj = (V) Core.this.getValues().get(this.index);
                        if (obj instanceof Marked) {
                            obj = (V) ((Marked) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((Core) Core.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((Core) Core.this).allocated) {
                    throw new NoSuchElementException();
                }
                kv.p pVar = this.factory;
                Object obj = this.key;
                Object obj2 = x0.f87415a;
                if (obj == null) {
                    e0.throwUninitializedPropertyAccessException(C3191e4.h.W);
                    obj = obj2;
                }
                V v10 = this.value;
                if (v10 == null) {
                    e0.throwUninitializedPropertyAccessException("value");
                } else {
                    obj2 = v10;
                }
                E e10 = (E) pVar.invoke(obj, obj2);
                findNext();
                return e10;
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.noImpl();
                throw new k();
            }
        }

        public Core(int i10) {
            this.allocated = i10;
            this.shift = Integer.numberOfLeadingZeros(i10) + 1;
            this.threshold = (i10 * 2) / 3;
            this.keys = new AtomicReferenceArray(i10);
            this.values = new AtomicReferenceArray(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.keys;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getValues() {
            return this.values;
        }

        private final int index(int i10) {
            return (i10 * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i10, Object obj3) {
            if ((i10 & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        private final void removeCleanedAt(int i10) {
            while (true) {
                Object obj = getValues().get(i10);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
                AtomicReferenceArray values = getValues();
                while (!values.compareAndSet(i10, obj, null)) {
                    if (values.get(i10) != obj) {
                        break;
                    }
                }
                ConcurrentWeakMap.this.decrementSize();
                return;
            }
        }

        private final /* synthetic */ void setLoad$volatile(int i10) {
            this.load$volatile = i10;
        }

        private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
            int i10;
            do {
                i10 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, ((Number) lVar.invoke(Integer.valueOf(i10))).intValue()));
        }

        public final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
            int iIndex = index(hashedWeakRef.hash);
            while (true) {
                HashedWeakRef<?> hashedWeakRef2 = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef2 == null) {
                    return;
                }
                if (hashedWeakRef2 == hashedWeakRef) {
                    removeCleanedAt(iIndex);
                    return;
                } else {
                    if (iIndex == 0) {
                        iIndex = this.allocated;
                    }
                    iIndex--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K k10) {
            int iIndex = index(k10.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef == null) {
                    return null;
                }
                T t10 = hashedWeakRef.get();
                if (e0.areEqual(k10, t10)) {
                    V v10 = (V) getValues().get(iIndex);
                    return v10 instanceof Marked ? (V) ((Marked) v10).ref : v10;
                }
                if (t10 == 0) {
                    removeCleanedAt(iIndex);
                }
                if (iIndex == 0) {
                    iIndex = this.allocated;
                }
                iIndex--;
            }
        }

        public final <E> Iterator<E> keyValueIterator(kv.p pVar) {
            return new KeyValueIterator(pVar);
        }

        public final Object putImpl(K k10, V v10, HashedWeakRef<K> hashedWeakRef) {
            int i10;
            int iIndex = index(k10.hashCode());
            boolean z10 = false;
            loop0: while (true) {
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) getKeys().get(iIndex);
                if (hashedWeakRef2 == null) {
                    if (v10 != null) {
                        if (!z10) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = load$volatile$FU;
                            do {
                                i10 = atomicIntegerFieldUpdater.get(this);
                                if (i10 >= this.threshold) {
                                    return ConcurrentWeakMapKt.REHASH;
                                }
                            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1));
                            z10 = true;
                        }
                        boolean z11 = z10;
                        if (hashedWeakRef == null) {
                            hashedWeakRef = new HashedWeakRef<>(k10, ((ConcurrentWeakMap) ConcurrentWeakMap.this).weakRefQueue);
                        }
                        HashedWeakRef<K> hashedWeakRef3 = hashedWeakRef;
                        AtomicReferenceArray keys = getKeys();
                        while (!keys.compareAndSet(iIndex, null, hashedWeakRef3)) {
                            if (keys.get(iIndex) != null) {
                                z10 = z11;
                                hashedWeakRef = hashedWeakRef3;
                            }
                        }
                        break loop0;
                    }
                    return null;
                }
                T t10 = hashedWeakRef2.get();
                if (!e0.areEqual(k10, t10)) {
                    if (t10 == 0) {
                        removeCleanedAt(iIndex);
                    }
                    if (iIndex == 0) {
                        iIndex = this.allocated;
                    }
                    iIndex--;
                } else if (z10) {
                    load$volatile$FU.decrementAndGet(this);
                }
            }
            while (true) {
                Object obj = getValues().get(iIndex);
                if (obj instanceof Marked) {
                    return ConcurrentWeakMapKt.REHASH;
                }
                AtomicReferenceArray values = getValues();
                while (!values.compareAndSet(iIndex, obj, v10)) {
                    if (values.get(iIndex) != obj) {
                        break;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
            int i10;
            Object obj;
            while (true) {
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) ConcurrentWeakMap.this.new Core(Integer.highestOneBit(v.coerceAtLeast(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i11 = this.allocated;
                while (i10 < i11) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(i10);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i10);
                    }
                    while (true) {
                        obj = getValues().get(i10);
                        if (!(obj instanceof Marked)) {
                            AtomicReferenceArray values = getValues();
                            Marked markedMark = ConcurrentWeakMapKt.mark(obj);
                            while (!values.compareAndSet(i10, obj, markedMark)) {
                                if (values.get(i10) != obj) {
                                    break;
                                }
                            }
                            break;
                        }
                        obj = ((Marked) obj).ref;
                        break;
                    }
                    i10 = (obj2 == null || obj == null || core.putImpl(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.REHASH) ? i10 + 1 : 0;
                }
                return core;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Entry<K, V> implements Map.Entry<K, V>, f {
        private final K key;
        private final V value;

        public Entry(K k10, V v10) {
            this.key = k10;
            this.value = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            ConcurrentWeakMapKt.noImpl();
            throw new k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class KeyValueSet<E> extends q {
        private final kv.p factory;

        public KeyValueSet(kv.p pVar) {
            this.factory = pVar;
        }

        @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            ConcurrentWeakMapKt.noImpl();
            throw new k();
        }

        @Override // uu.q
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.getCore$volatile$FU().get(ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry _get_entries_$lambda$1(Object obj, Object obj2) {
        return new Entry(obj, obj2);
    }

    private final void cleanWeakRef(HashedWeakRef<?> hashedWeakRef) {
        ((Core) core$volatile$FU.get(this)).cleanWeakRef(hashedWeakRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        _size$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return core$volatile$FU;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final synchronized V putSynchronized(K k10, V v10) {
        V v11;
        Core coreRehash = (Core) core$volatile$FU.get(this);
        while (true) {
            K k11 = k10;
            V v12 = v10;
            v11 = (V) Core.putImpl$default(coreRehash, k11, v12, null, 4, null);
            if (v11 == ConcurrentWeakMapKt.REHASH) {
                coreRehash = coreRehash.rehash();
                core$volatile$FU.set(this, coreRehash);
                k10 = k11;
                v10 = v12;
            }
        }
        return v11;
    }

    private final /* synthetic */ void setCore$volatile(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void set_size$volatile(int i10) {
        this._size$volatile = i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<Object> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((Core) core$volatile$FU.get(this)).getImpl(obj);
    }

    @Override // uu.p
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(new n(9));
    }

    @Override // uu.p
    public Set<K> getKeys() {
        return new KeyValueSet(new n(8));
    }

    @Override // uu.p
    public int getSize() {
        return _size$volatile$FU.get(this);
    }

    @Override // uu.p, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        V vPutSynchronized = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), k10, v10, null, 4, null);
        if (vPutSynchronized == ConcurrentWeakMapKt.REHASH) {
            vPutSynchronized = putSynchronized(k10, v10);
        }
        if (vPutSynchronized == null) {
            _size$volatile$FU.incrementAndGet(this);
        }
        return vPutSynchronized;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == 0) {
            return null;
        }
        V vPutSynchronized = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), obj, null, null, 4, null);
        if (vPutSynchronized == ConcurrentWeakMapKt.REHASH) {
            vPutSynchronized = putSynchronized(obj, null);
        }
        if (vPutSynchronized != null) {
            _size$volatile$FU.decrementAndGet(this);
        }
        return vPutSynchronized;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.weakRefQueue.remove();
                e0.checkNotNull(referenceRemove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                cleanWeakRef((HashedWeakRef) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public ConcurrentWeakMap(boolean z10) {
        this.core$volatile = new Core(16);
        this.weakRefQueue = z10 ? new ReferenceQueue<>() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _get_keys_$lambda$0(Object obj, Object obj2) {
        return obj;
    }
}
