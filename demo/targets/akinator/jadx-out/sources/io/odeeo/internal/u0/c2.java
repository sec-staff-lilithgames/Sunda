package io.odeeo.internal.u0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.u0.c2.i;
import io.odeeo.internal.u0.c2.n;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c2<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final c0<Object, Object, e> f66547j = new a();
    private static final long serialVersionUID = 5;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f66548a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f66549b;

    /* renamed from: c, reason: collision with root package name */
    public final transient n<K, V, E, S>[] f66550c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66551d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.t0.i<Object> f66552e;

    /* renamed from: f, reason: collision with root package name */
    public final transient j<K, V, E, S> f66553f;

    /* renamed from: g, reason: collision with root package name */
    public transient Set<K> f66554g;

    /* renamed from: h, reason: collision with root package name */
    public transient Collection<V> f66555h;

    /* renamed from: i, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f66556i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a0<K, V> extends n<K, V, z<K, V>, a0<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        public final ReferenceQueue<K> f66557h;

        /* renamed from: i, reason: collision with root package name */
        public final ReferenceQueue<V> f66558i;

        public a0(c2<K, V, z<K, V>, a0<K, V>> c2Var, int i10, int i11) {
            super(c2Var, i10, i11);
            this.f66557h = new ReferenceQueue<>();
            this.f66558i = new ReferenceQueue<>();
        }

        @Override // io.odeeo.internal.u0.c2.n
        public void c() {
            a(this.f66557h);
        }

        @Override // io.odeeo.internal.u0.c2.n
        public void d() {
            b(this.f66557h);
            c(this.f66558i);
        }

        public c0<K, V, z<K, V>> getWeakValueReferenceForTesting(i<K, V, ?> iVar) {
            return castForTesting((i) iVar).getValueReference();
        }

        public c0<K, V, z<K, V>> newWeakValueReferenceForTesting(i<K, V, ?> iVar, V v10) {
            return new d0(this.f66558i, v10, castForTesting((i) iVar));
        }

        public void setWeakValueReferenceForTesting(i<K, V, ?> iVar, c0<K, V, ? extends i<K, V, ?>> c0Var) {
            z<K, V> zVarCastForTesting = castForTesting((i) iVar);
            c0 c0Var2 = zVarCastForTesting.f66606c;
            zVarCastForTesting.f66606c = c0Var;
            c0Var2.clear();
        }

        public z<K, V> castForTesting(i<K, V, ?> iVar) {
            return (z) iVar;
        }

        @Override // io.odeeo.internal.u0.c2.n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a0<K, V> i() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b<K, V> extends q0<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: a, reason: collision with root package name */
        public final p f66559a;

        /* renamed from: b, reason: collision with root package name */
        public final p f66560b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.t0.i<Object> f66561c;

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.t0.i<Object> f66562d;

        /* renamed from: e, reason: collision with root package name */
        public final int f66563e;

        /* renamed from: f, reason: collision with root package name */
        public transient ConcurrentMap<K, V> f66564f;

        public b(p pVar, p pVar2, io.odeeo.internal.t0.i<Object> iVar, io.odeeo.internal.t0.i<Object> iVar2, int i10, ConcurrentMap<K, V> concurrentMap) {
            this.f66559a = pVar;
            this.f66560b = pVar2;
            this.f66561c = iVar;
            this.f66562d = iVar2;
            this.f66563e = i10;
            this.f66564f = concurrentMap;
        }

        public b2 b(ObjectInputStream objectInputStream) throws IOException {
            return new b2().initialCapacity(objectInputStream.readInt()).a(this.f66559a).b(this.f66560b).a(this.f66561c).concurrencyLevel(this.f66563e);
        }

        @Override // io.odeeo.internal.u0.q0, io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
        /* renamed from: d */
        public ConcurrentMap<K, V> delegate() {
            return this.f66564f;
        }

        public void a(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f66564f.size());
            for (Map.Entry<K, V> entry : this.f66564f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f66564f.put(object, objectInputStream.readObject());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b0<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        void clearValue();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ int getHash();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ Object getKey();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ i getNext();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ Object getValue();

        c0<K, V, E> getValueReference();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66565a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66566b;

        /* renamed from: c, reason: collision with root package name */
        public final E f66567c;

        public c(K k10, int i10, E e10) {
            this.f66565a = k10;
            this.f66566b = i10;
            this.f66567c = e10;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public int getHash() {
            return this.f66566b;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public K getKey() {
            return this.f66565a;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public E getNext() {
            return this.f66567c;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public abstract /* synthetic */ Object getValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c0<K, V, E extends i<K, V, E>> {
        void clear();

        c0<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e10);

        V get();

        E getEntry();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f66568a;

        /* renamed from: b, reason: collision with root package name */
        public final E f66569b;

        public d(ReferenceQueue<K> referenceQueue, K k10, int i10, E e10) {
            super(k10, referenceQueue);
            this.f66568a = i10;
            this.f66569b = e10;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public int getHash() {
            return this.f66568a;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public K getKey() {
            return get();
        }

        @Override // io.odeeo.internal.u0.c2.i
        public E getNext() {
            return this.f66569b;
        }

        @Override // io.odeeo.internal.u0.c2.i
        public abstract /* synthetic */ Object getValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements c0<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        public final E f66570a;

        public d0(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f66570a = e10;
        }

        @Override // io.odeeo.internal.u0.c2.c0
        public c0<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e10) {
            return new d0(referenceQueue, get(), e10);
        }

        @Override // io.odeeo.internal.u0.c2.c0
        public E getEntry() {
            return this.f66570a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements i<Object, Object, e> {
        public e() {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.u0.c2.i
        public int getHash() {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.u0.c2.i
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.u0.c2.i
        public Object getValue() {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.u0.c2.i
        public e getNext() {
            throw new AssertionError();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class e0 extends io.odeeo.internal.u0.f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66571a;

        /* renamed from: b, reason: collision with root package name */
        public V f66572b;

        public e0(K k10, V v10) {
            this.f66571a = k10;
            this.f66572b = v10;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f66571a.equals(entry.getKey()) && this.f66572b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public K getKey() {
            return this.f66571a;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public V getValue() {
            return this.f66572b;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public int hashCode() {
            return this.f66571a.hashCode() ^ this.f66572b.hashCode();
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) c2.this.put(this.f66571a, v10);
            this.f66572b = v10;
            return v11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class f extends c2<K, V, E, S>.h<Map.Entry<K, V>> {
        public f() {
            super();
        }

        @Override // io.odeeo.internal.u0.c2.h, java.util.Iterator
        public Map.Entry<K, V> next() {
            return b();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class g extends m<Map.Entry<K, V>> {
        public g() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = c2.this.get(key)) != null && c2.this.b().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && c2.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c2.this.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface i<K, V, E extends i<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface j<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> {
        E copy(S s10, E e10, E e11);

        p keyStrength();

        E newEntry(S s10, K k10, int i10, E e10);

        S newSegment(c2<K, V, E, S> c2Var, int i10, int i11);

        void setValue(S s10, E e10, V v10);

        p valueStrength();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class k extends c2<K, V, E, S>.h<K> {
        public k() {
            super();
        }

        @Override // io.odeeo.internal.u0.c2.h, java.util.Iterator
        public K next() {
            return b().getKey();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class l extends m<K> {
        public l() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return c2.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c2.this.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class m<E> extends AbstractSet<E> {
        public m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return c2.b(this).toArray();
        }

        public /* synthetic */ m(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c2.b(this).toArray(tArr);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class n<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        public final c2<K, V, E, S> f66586a;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f66587b;

        /* renamed from: c, reason: collision with root package name */
        public int f66588c;

        /* renamed from: d, reason: collision with root package name */
        public int f66589d;

        /* renamed from: e, reason: collision with root package name */
        public volatile AtomicReferenceArray<E> f66590e;

        /* renamed from: f, reason: collision with root package name */
        public final int f66591f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f66592g = new AtomicInteger();

        public n(c2<K, V, E, S> c2Var, int i10, int i11) {
            this.f66586a = c2Var;
            this.f66591f = i11;
            a(b(i10));
        }

        public void a(E e10, V v10) {
            this.f66586a.f66553f.setValue(i(), e10, v10);
        }

        public AtomicReferenceArray<E> b(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        public void c() {
        }

        public void d() {
        }

        public V e(Object obj, int i10) {
            lock();
            try {
                f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                for (i next = iVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f66586a.f66552e.equivalent(obj, key)) {
                        V v10 = (V) next.getValue();
                        if (v10 == null && !b(next)) {
                            return null;
                        }
                        this.f66588c++;
                        i iVarB = b(iVar, next);
                        int i11 = this.f66587b - 1;
                        atomicReferenceArray.set(length, iVarB);
                        this.f66587b = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public void f() {
            h();
        }

        public void g() {
            h();
        }

        public void h() {
            if (tryLock()) {
                try {
                    d();
                    this.f66592g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S i();

        public void j() {
            if (tryLock()) {
                try {
                    d();
                } finally {
                    unlock();
                }
            }
        }

        public E a(E e10, E e11) {
            return (E) this.f66586a.f66553f.copy(i(), e10, e11);
        }

        public void b(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f66586a.b((c2<K, V, E, S>) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        public void c(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f66586a.a((c0) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        public E d(Object obj, int i10) {
            return (E) c(obj, i10);
        }

        public void a(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f66589d = length;
            if (length == this.f66591f) {
                this.f66589d = length + 1;
            }
            this.f66590e = atomicReferenceArray;
        }

        public V b(Object obj, int i10) {
            try {
                i iVarD = d(obj, i10);
                if (iVarD == null) {
                    e();
                    return null;
                }
                V v10 = (V) iVarD.getValue();
                if (v10 == null) {
                    j();
                }
                return v10;
            } finally {
                e();
            }
        }

        public E c(Object obj, int i10) {
            if (this.f66587b == 0) {
                return null;
            }
            for (E e10 = (E) a(i10); e10 != null; e10 = (E) e10.getNext()) {
                if (e10.getHash() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        j();
                    } else if (this.f66586a.f66552e.equivalent(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        public <T> void a(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        public E a(int i10) {
            return this.f66590e.get(i10 & (r0.length() - 1));
        }

        public boolean a(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f66587b == 0) {
                    return false;
                }
                i iVarD = d(obj, i10);
                if (iVarD != null) {
                    if (iVarD.getValue() != null) {
                        z10 = true;
                    }
                }
                return z10;
            } finally {
                e();
            }
        }

        public void b() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f66587b;
            AtomicReferenceArray<E> atomicReferenceArrayB = b(length << 1);
            this.f66589d = (atomicReferenceArrayB.length() * 3) / 4;
            int length2 = atomicReferenceArrayB.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E next = atomicReferenceArray.get(i11);
                if (next != null) {
                    i next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayB.set(hash, next);
                    } else {
                        i iVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                iVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayB.set(hash, iVar);
                        while (next != iVar) {
                            int hash3 = next.getHash() & length2;
                            i iVarA = a(next, (i) atomicReferenceArrayB.get(hash3));
                            if (iVarA != null) {
                                atomicReferenceArrayB.set(hash3, iVarA);
                            } else {
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f66590e = atomicReferenceArrayB;
            this.f66587b = i10;
        }

        public V a(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                f();
                int i11 = this.f66587b + 1;
                if (i11 > this.f66589d) {
                    b();
                    i11 = this.f66587b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                for (i next = iVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f66586a.f66552e.equivalent(k10, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 == null) {
                            this.f66588c++;
                            a((n<K, V, E, S>) next, (i) v10);
                            this.f66587b = this.f66587b;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return v11;
                        }
                        this.f66588c++;
                        a((n<K, V, E, S>) next, (i) v10);
                        unlock();
                        return v11;
                    }
                }
                this.f66588c++;
                i iVarNewEntry = this.f66586a.f66553f.newEntry(i(), k10, i10, iVar);
                a((n<K, V, E, S>) iVarNewEntry, (i) v10);
                atomicReferenceArray.set(length, iVarNewEntry);
                this.f66587b = i11;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        public void e() {
            if ((this.f66592g.incrementAndGet() & 63) == 0) {
                g();
            }
        }

        public V b(K k10, int i10, V v10) {
            lock();
            try {
                f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                for (i next = iVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f66586a.f66552e.equivalent(k10, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 == null) {
                            if (b(next)) {
                                this.f66588c++;
                                i iVarB = b(iVar, next);
                                int i11 = this.f66587b - 1;
                                atomicReferenceArray.set(length, iVarB);
                                this.f66587b = i11;
                            }
                            return null;
                        }
                        this.f66588c++;
                        a((n<K, V, E, S>) next, (i) v10);
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public boolean a(K k10, int i10, V v10, V v11) {
            lock();
            try {
                f();
                AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                for (i next = iVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f66586a.f66552e.equivalent(k10, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            if (b(next)) {
                                this.f66588c++;
                                i iVarB = b(iVar, next);
                                int i11 = this.f66587b - 1;
                                atomicReferenceArray.set(length, iVarB);
                                this.f66587b = i11;
                            }
                            return false;
                        }
                        if (!this.f66586a.b().equivalent(v10, value)) {
                            return false;
                        }
                        this.f66588c++;
                        a((n<K, V, E, S>) next, (i) v11);
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public E b(E e10, E e11) {
            int i10 = this.f66587b;
            E e12 = (E) e11.getNext();
            while (e10 != e11) {
                i iVarA = a((i) e10, (i) e12);
                if (iVarA != null) {
                    e12 = (E) iVarA;
                } else {
                    i10--;
                }
                e10 = (E) e10.getNext();
            }
            this.f66587b = i10;
            return e12;
        }

        public static <K, V, E extends i<K, V, E>> boolean b(E e10) {
            return e10.getValue() == null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f66586a.b().equivalent(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (b(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f66588c++;
            r9 = b(r3, r4);
            r10 = r8.f66587b - 1;
            r0.set(r1, r9);
            r8.f66587b = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.f()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends io.odeeo.internal.u0.c2$i<K, V, E>> r0 = r8.f66590e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                io.odeeo.internal.u0.c2$i r3 = (io.odeeo.internal.u0.c2.i) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                io.odeeo.internal.u0.c2<K, V, E extends io.odeeo.internal.u0.c2$i<K, V, E>, S extends io.odeeo.internal.u0.c2$n<K, V, E, S>> r7 = r8.f66586a     // Catch: java.lang.Throwable -> L5c
                io.odeeo.internal.t0.i<java.lang.Object> r7 = r7.f66552e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                io.odeeo.internal.u0.c2<K, V, E extends io.odeeo.internal.u0.c2$i<K, V, E>, S extends io.odeeo.internal.u0.c2$n<K, V, E, S>> r10 = r8.f66586a     // Catch: java.lang.Throwable -> L5c
                io.odeeo.internal.t0.i r10 = r10.b()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = b(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f66588c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f66588c = r9     // Catch: java.lang.Throwable -> L5c
                io.odeeo.internal.u0.c2$i r9 = r8.b(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f66587b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f66587b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                io.odeeo.internal.u0.c2$i r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.u0.c2.n.a(java.lang.Object, int, java.lang.Object):boolean");
        }

        public void a() {
            if (this.f66587b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    c();
                    this.f66592g.set(0);
                    this.f66588c++;
                    this.f66587b = 0;
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        public boolean a(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                int length = i10 & (atomicReferenceArray.length() - 1);
                i iVar = (i) atomicReferenceArray.get(length);
                for (i next = iVar; next != null; next = next.getNext()) {
                    if (next == e10) {
                        this.f66588c++;
                        i iVarB = b(iVar, next);
                        int i11 = this.f66587b - 1;
                        atomicReferenceArray.set(length, iVarB);
                        this.f66587b = i11;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        public boolean a(K k10, int i10, c0<K, V, E> c0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f66590e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                for (i next = iVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f66586a.f66552e.equivalent(k10, key)) {
                        if (((b0) next).getValueReference() != c0Var) {
                            return false;
                        }
                        this.f66588c++;
                        i iVarB = b(iVar, next);
                        int i11 = this.f66587b - 1;
                        atomicReferenceArray.set(length, iVarB);
                        this.f66587b = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public V a(E e10) {
            if (e10.getKey() == null) {
                j();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 != null) {
                return v10;
            }
            j();
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o<K, V> extends b<K, V> {
        private static final long serialVersionUID = 3;

        public o(p pVar, p pVar2, io.odeeo.internal.t0.i<Object> iVar, io.odeeo.internal.t0.i<Object> iVar2, int i10, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, iVar, iVar2, i10, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f66564f = b(objectInputStream).makeMap();
            a(objectInputStream);
        }

        private Object readResolve() {
            return this.f66564f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            a(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        public static final p f66593a;

        /* renamed from: b, reason: collision with root package name */
        public static final p f66594b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ p[] f66595c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum a extends p {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.odeeo.internal.u0.c2.p
            public io.odeeo.internal.t0.i<Object> a() {
                return io.odeeo.internal.t0.i.equals();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum b extends p {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.odeeo.internal.u0.c2.p
            public io.odeeo.internal.t0.i<Object> a() {
                return io.odeeo.internal.t0.i.identity();
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            f66593a = aVar;
            b bVar = new b("WEAK", 1);
            f66594b = bVar;
            f66595c = new p[]{aVar, bVar};
        }

        public p(String str, int i10) {
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f66595c.clone();
        }

        public abstract io.odeeo.internal.t0.i<Object> a();

        public /* synthetic */ p(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class q<K, V> extends c<K, V, q<K, V>> implements u<K, V, q<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        public volatile V f66596d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a<K, V> implements j<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f66597a = new a<>();

            public static <K, V> a<K, V> a() {
                return (a<K, V>) f66597a;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p keyStrength() {
                return p.f66593a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ i newEntry(n nVar, Object obj, int i10, i iVar) {
                return newEntry((r<r<K, V>, V>) nVar, (r<K, V>) obj, i10, (q<r<K, V>, V>) iVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ void setValue(n nVar, i iVar, Object obj) {
                setValue((r<K, q<K, V>>) nVar, (q<K, q<K, V>>) iVar, (q<K, V>) obj);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p valueStrength() {
                return p.f66593a;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public q<K, V> copy(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                return qVar.a((q) qVar2);
            }

            public q<K, V> newEntry(r<K, V> rVar, K k10, int i10, q<K, V> qVar) {
                return new q<>(k10, i10, qVar);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public r<K, V> newSegment(c2<K, V, q<K, V>, r<K, V>> c2Var, int i10, int i11) {
                return new r<>(c2Var, i10, i11);
            }

            public void setValue(r<K, V> rVar, q<K, V> qVar, V v10) {
                qVar.a((q<K, V>) v10);
            }
        }

        public q(K k10, int i10, q<K, V> qVar) {
            super(k10, i10, qVar);
            this.f66596d = null;
        }

        public void a(V v10) {
            this.f66596d = v10;
        }

        @Override // io.odeeo.internal.u0.c2.c, io.odeeo.internal.u0.c2.i
        public V getValue() {
            return this.f66596d;
        }

        public q<K, V> a(q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f66565a, this.f66566b, qVar);
            qVar2.f66596d = this.f66596d;
            return qVar2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class r<K, V> extends n<K, V, q<K, V>, r<K, V>> {
        public r(c2<K, V, q<K, V>, r<K, V>> c2Var, int i10, int i11) {
            super(c2Var, i10, i11);
        }

        public q<K, V> castForTesting(i<K, V, ?> iVar) {
            return (q) iVar;
        }

        @Override // io.odeeo.internal.u0.c2.n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public r<K, V> i() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class s<K, V> extends c<K, V, s<K, V>> implements b0<K, V, s<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        public volatile c0<K, V, s<K, V>> f66598d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a<K, V> implements j<K, V, s<K, V>, t<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f66599a = new a<>();

            public static <K, V> a<K, V> a() {
                return (a<K, V>) f66599a;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p keyStrength() {
                return p.f66593a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ i newEntry(n nVar, Object obj, int i10, i iVar) {
                return newEntry((t<t<K, V>, V>) nVar, (t<K, V>) obj, i10, (s<t<K, V>, V>) iVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ void setValue(n nVar, i iVar, Object obj) {
                setValue((t<K, s<K, V>>) nVar, (s<K, s<K, V>>) iVar, (s<K, V>) obj);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p valueStrength() {
                return p.f66594b;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public s<K, V> copy(t<K, V> tVar, s<K, V> sVar, s<K, V> sVar2) {
                if (n.b(sVar)) {
                    return null;
                }
                return sVar.a(tVar.f66600h, sVar2);
            }

            public s<K, V> newEntry(t<K, V> tVar, K k10, int i10, s<K, V> sVar) {
                return new s<>(k10, i10, sVar);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public t<K, V> newSegment(c2<K, V, s<K, V>, t<K, V>> c2Var, int i10, int i11) {
                return new t<>(c2Var, i10, i11);
            }

            public void setValue(t<K, V> tVar, s<K, V> sVar, V v10) {
                sVar.a((s<K, V>) v10, (ReferenceQueue<s<K, V>>) tVar.f66600h);
            }
        }

        public s(K k10, int i10, s<K, V> sVar) {
            super(k10, i10, sVar);
            this.f66598d = c2.a();
        }

        @Override // io.odeeo.internal.u0.c2.b0
        public void clearValue() {
            this.f66598d.clear();
        }

        @Override // io.odeeo.internal.u0.c2.c, io.odeeo.internal.u0.c2.i
        public V getValue() {
            return this.f66598d.get();
        }

        @Override // io.odeeo.internal.u0.c2.b0
        public c0<K, V, s<K, V>> getValueReference() {
            return this.f66598d;
        }

        public void a(V v10, ReferenceQueue<V> referenceQueue) {
            c0<K, V, s<K, V>> c0Var = this.f66598d;
            this.f66598d = new d0(referenceQueue, v10, this);
            c0Var.clear();
        }

        public s<K, V> a(ReferenceQueue<V> referenceQueue, s<K, V> sVar) {
            s<K, V> sVar2 = new s<>(this.f66565a, this.f66566b, sVar);
            sVar2.f66598d = this.f66598d.copyFor(referenceQueue, sVar2);
            return sVar2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        public final ReferenceQueue<V> f66600h;

        public t(c2<K, V, s<K, V>, t<K, V>> c2Var, int i10, int i11) {
            super(c2Var, i10, i11);
            this.f66600h = new ReferenceQueue<>();
        }

        @Override // io.odeeo.internal.u0.c2.n
        public void c() {
            a(this.f66600h);
        }

        @Override // io.odeeo.internal.u0.c2.n
        public void d() {
            c(this.f66600h);
        }

        public c0<K, V, s<K, V>> getWeakValueReferenceForTesting(i<K, V, ?> iVar) {
            return castForTesting((i) iVar).getValueReference();
        }

        public c0<K, V, s<K, V>> newWeakValueReferenceForTesting(i<K, V, ?> iVar, V v10) {
            return new d0(this.f66600h, v10, castForTesting((i) iVar));
        }

        public void setWeakValueReferenceForTesting(i<K, V, ?> iVar, c0<K, V, ? extends i<K, V, ?>> c0Var) {
            s<K, V> sVarCastForTesting = castForTesting((i) iVar);
            c0 c0Var2 = sVarCastForTesting.f66598d;
            sVarCastForTesting.f66598d = c0Var;
            c0Var2.clear();
        }

        public s<K, V> castForTesting(i<K, V, ?> iVar) {
            return (s) iVar;
        }

        @Override // io.odeeo.internal.u0.c2.n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public t<K, V> i() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface u<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ int getHash();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ Object getKey();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ i getNext();

        @Override // io.odeeo.internal.u0.c2.i
        /* synthetic */ Object getValue();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class v extends c2<K, V, E, S>.h<V> {
        public v() {
            super();
        }

        @Override // io.odeeo.internal.u0.c2.h, java.util.Iterator
        public V next() {
            return b().getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class w extends AbstractCollection<V> {
        public w() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c2.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return c2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new v();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c2.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return c2.b(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c2.b(this).toArray(tArr);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class x<K, V> extends d<K, V, x<K, V>> implements u<K, V, x<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public volatile V f66603c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a<K, V> implements j<K, V, x<K, V>, y<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f66604a = new a<>();

            public static <K, V> a<K, V> a() {
                return (a<K, V>) f66604a;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p keyStrength() {
                return p.f66594b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ i newEntry(n nVar, Object obj, int i10, i iVar) {
                return newEntry((y<y<K, V>, V>) nVar, (y<K, V>) obj, i10, (x<y<K, V>, V>) iVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ void setValue(n nVar, i iVar, Object obj) {
                setValue((y<K, x<K, V>>) nVar, (x<K, x<K, V>>) iVar, (x<K, V>) obj);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p valueStrength() {
                return p.f66593a;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public x<K, V> copy(y<K, V> yVar, x<K, V> xVar, x<K, V> xVar2) {
                if (xVar.getKey() == null) {
                    return null;
                }
                return xVar.a(yVar.f66605h, xVar2);
            }

            public x<K, V> newEntry(y<K, V> yVar, K k10, int i10, x<K, V> xVar) {
                return new x<>(yVar.f66605h, k10, i10, xVar);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public y<K, V> newSegment(c2<K, V, x<K, V>, y<K, V>> c2Var, int i10, int i11) {
                return new y<>(c2Var, i10, i11);
            }

            public void setValue(y<K, V> yVar, x<K, V> xVar, V v10) {
                xVar.a(v10);
            }
        }

        public x(ReferenceQueue<K> referenceQueue, K k10, int i10, x<K, V> xVar) {
            super(referenceQueue, k10, i10, xVar);
            this.f66603c = null;
        }

        public void a(V v10) {
            this.f66603c = v10;
        }

        @Override // io.odeeo.internal.u0.c2.d, io.odeeo.internal.u0.c2.i
        public V getValue() {
            return this.f66603c;
        }

        public x<K, V> a(ReferenceQueue<K> referenceQueue, x<K, V> xVar) {
            x<K, V> xVar2 = new x<>(referenceQueue, getKey(), this.f66568a, xVar);
            xVar2.a(this.f66603c);
            return xVar2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class y<K, V> extends n<K, V, x<K, V>, y<K, V>> {

        /* renamed from: h, reason: collision with root package name */
        public final ReferenceQueue<K> f66605h;

        public y(c2<K, V, x<K, V>, y<K, V>> c2Var, int i10, int i11) {
            super(c2Var, i10, i11);
            this.f66605h = new ReferenceQueue<>();
        }

        @Override // io.odeeo.internal.u0.c2.n
        public void c() {
            a(this.f66605h);
        }

        @Override // io.odeeo.internal.u0.c2.n
        public void d() {
            b(this.f66605h);
        }

        public x<K, V> castForTesting(i<K, V, ?> iVar) {
            return (x) iVar;
        }

        @Override // io.odeeo.internal.u0.c2.n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public y<K, V> i() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class z<K, V> extends d<K, V, z<K, V>> implements b0<K, V, z<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public volatile c0<K, V, z<K, V>> f66606c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a<K, V> implements j<K, V, z<K, V>, a0<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f66607a = new a<>();

            public static <K, V> a<K, V> a() {
                return (a<K, V>) f66607a;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p keyStrength() {
                return p.f66594b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ i newEntry(n nVar, Object obj, int i10, i iVar) {
                return newEntry((a0<a0<K, V>, V>) nVar, (a0<K, V>) obj, i10, (z<a0<K, V>, V>) iVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.odeeo.internal.u0.c2.j
            public /* bridge */ /* synthetic */ void setValue(n nVar, i iVar, Object obj) {
                setValue((a0<K, z<K, V>>) nVar, (z<K, z<K, V>>) iVar, (z<K, V>) obj);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public p valueStrength() {
                return p.f66594b;
            }

            @Override // io.odeeo.internal.u0.c2.j
            public z<K, V> copy(a0<K, V> a0Var, z<K, V> zVar, z<K, V> zVar2) {
                if (zVar.getKey() == null || n.b(zVar)) {
                    return null;
                }
                return zVar.a(a0Var.f66557h, a0Var.f66558i, zVar2);
            }

            public z<K, V> newEntry(a0<K, V> a0Var, K k10, int i10, z<K, V> zVar) {
                return new z<>(a0Var.f66557h, k10, i10, zVar);
            }

            @Override // io.odeeo.internal.u0.c2.j
            public a0<K, V> newSegment(c2<K, V, z<K, V>, a0<K, V>> c2Var, int i10, int i11) {
                return new a0<>(c2Var, i10, i11);
            }

            public void setValue(a0<K, V> a0Var, z<K, V> zVar, V v10) {
                zVar.a((z<K, V>) v10, (ReferenceQueue<z<K, V>>) a0Var.f66558i);
            }
        }

        public z(ReferenceQueue<K> referenceQueue, K k10, int i10, z<K, V> zVar) {
            super(referenceQueue, k10, i10, zVar);
            this.f66606c = c2.a();
        }

        @Override // io.odeeo.internal.u0.c2.b0
        public void clearValue() {
            this.f66606c.clear();
        }

        @Override // io.odeeo.internal.u0.c2.d, io.odeeo.internal.u0.c2.i
        public V getValue() {
            return this.f66606c.get();
        }

        @Override // io.odeeo.internal.u0.c2.b0
        public c0<K, V, z<K, V>> getValueReference() {
            return this.f66606c;
        }

        public z<K, V> a(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, z<K, V> zVar) {
            z<K, V> zVar2 = new z<>(referenceQueue, getKey(), this.f66568a, zVar);
            zVar2.f66606c = this.f66606c.copyFor(referenceQueue2, zVar2);
            return zVar2;
        }

        public void a(V v10, ReferenceQueue<V> referenceQueue) {
            c0<K, V, z<K, V>> c0Var = this.f66606c;
            this.f66606c = new d0(referenceQueue, v10, this);
            c0Var.clear();
        }
    }

    public c2(b2 b2Var, j<K, V, E, S> jVar) {
        this.f66551d = Math.min(b2Var.a(), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f66552e = b2Var.c();
        this.f66553f = jVar;
        int iMin = Math.min(b2Var.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f66551d) {
            i12++;
            i13 <<= 1;
        }
        this.f66549b = 32 - i12;
        this.f66548a = i13 - 1;
        this.f66550c = a(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.f66550c;
            if (i10 >= nVarArr.length) {
                return;
            }
            nVarArr[i10] = a(i11, -1);
            i10++;
        }
    }

    public static int b(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = (i14 << 2) + (i14 << 14) + i14;
        return (i15 >>> 16) ^ i15;
    }

    public n<K, V, E, S> c(int i10) {
        return this.f66550c[(i10 >>> this.f66549b) & this.f66548a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (n<K, V, E, S> nVar : this.f66550c) {
            nVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        return c(iA).a(obj, iA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.f66550c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = nVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                n<K, V, E, S> nVar = nVarArr[r10];
                int i11 = nVar.f66587b;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f66590e;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    E next = atomicReferenceArray.get(r13);
                    while (next != null) {
                        V vA = nVar.a((n<K, V, E, S>) next);
                        boolean z11 = z10;
                        if (vA != null && b().equivalent(obj, vA)) {
                            return true;
                        }
                        next = next.getNext();
                        z10 = z11;
                    }
                }
                j11 += nVar.f66588c;
                z10 = z10;
            }
            boolean z12 = z10;
            if (j11 == j10) {
                return z12;
            }
            i10++;
            j10 = j11;
            z10 = z12;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f66556i;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f66556i = gVar;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        return c(iA).b(obj, iA);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.f66550c;
        long j10 = 0;
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            if (nVarArr[i10].f66587b != 0) {
                return false;
            }
            j10 += nVarArr[i10].f66588c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < nVarArr.length; i11++) {
            if (nVarArr[i11].f66587b != 0) {
                return false;
            }
            j10 -= nVarArr[i11].f66588c;
        }
        return j10 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f66554g;
        if (set != null) {
            return set;
        }
        l lVar = new l();
        this.f66554g = lVar;
        return lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        io.odeeo.internal.t0.u.checkNotNull(k10);
        io.odeeo.internal.t0.u.checkNotNull(v10);
        int iA = a(k10);
        return c(iA).a((n<K, V, E, S>) k10, iA, (int) v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        io.odeeo.internal.t0.u.checkNotNull(k10);
        io.odeeo.internal.t0.u.checkNotNull(v10);
        int iA = a(k10);
        return c(iA).a((n<K, V, E, S>) k10, iA, (int) v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        return c(iA).e(obj, iA);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        io.odeeo.internal.t0.u.checkNotNull(k10);
        io.odeeo.internal.t0.u.checkNotNull(v11);
        if (v10 == null) {
            return false;
        }
        int iA = a(k10);
        return c(iA).a((n<K, V, E, S>) k10, iA, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f66550c.length; i10++) {
            j10 += r0[i10].f66587b;
        }
        return io.odeeo.internal.w0.d.saturatedCast(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f66555h;
        if (collection != null) {
            return collection;
        }
        w wVar = new w();
        this.f66555h = wVar;
        return wVar;
    }

    public Object writeReplace() {
        return new o(this.f66553f.keyStrength(), this.f66553f.valueStrength(), this.f66552e, this.f66553f.valueStrength().a(), this.f66551d, this);
    }

    public static <K, V> c2<K, V, ? extends i<K, V, ?>, ?> a(b2 b2Var) {
        p pVarD = b2Var.d();
        p pVar = p.f66593a;
        if (pVarD == pVar && b2Var.e() == pVar) {
            return new c2<>(b2Var, q.a.a());
        }
        if (b2Var.d() == pVar && b2Var.e() == p.f66594b) {
            return new c2<>(b2Var, s.a.a());
        }
        p pVarD2 = b2Var.d();
        p pVar2 = p.f66594b;
        if (pVarD2 == pVar2 && b2Var.e() == pVar) {
            return new c2<>(b2Var, x.a.a());
        }
        if (b2Var.d() == pVar2 && b2Var.e() == pVar2) {
            return new c2<>(b2Var, z.a.a());
        }
        throw new AssertionError();
    }

    public void b(E e10) {
        int hash = e10.getHash();
        c(hash).a((n<K, V, E, S>) e10, hash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        return c(iA).a(obj, iA, obj2);
    }

    public io.odeeo.internal.t0.i<Object> b() {
        return this.f66553f.valueStrength().a();
    }

    public static <E> ArrayList<E> b(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        w1.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        io.odeeo.internal.t0.u.checkNotNull(k10);
        io.odeeo.internal.t0.u.checkNotNull(v10);
        int iA = a(k10);
        return c(iA).b(k10, iA, v10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class h<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f66576a;

        /* renamed from: b, reason: collision with root package name */
        public int f66577b = -1;

        /* renamed from: c, reason: collision with root package name */
        public n<K, V, E, S> f66578c;

        /* renamed from: d, reason: collision with root package name */
        public AtomicReferenceArray<E> f66579d;

        /* renamed from: e, reason: collision with root package name */
        public E f66580e;

        /* renamed from: f, reason: collision with root package name */
        public c2<K, V, E, S>.e0 f66581f;

        /* renamed from: g, reason: collision with root package name */
        public c2<K, V, E, S>.e0 f66582g;

        public h() {
            this.f66576a = c2.this.f66550c.length - 1;
            a();
        }

        public final void a() {
            this.f66581f = null;
            if (c() || d()) {
                return;
            }
            while (true) {
                int i10 = this.f66576a;
                if (i10 < 0) {
                    return;
                }
                n<K, V, E, S>[] nVarArr = c2.this.f66550c;
                this.f66576a = i10 - 1;
                n<K, V, E, S> nVar = nVarArr[i10];
                this.f66578c = nVar;
                if (nVar.f66587b != 0) {
                    this.f66579d = this.f66578c.f66590e;
                    this.f66577b = r0.length() - 1;
                    if (d()) {
                        return;
                    }
                }
            }
        }

        public c2<K, V, E, S>.e0 b() {
            c2<K, V, E, S>.e0 e0Var = this.f66581f;
            if (e0Var == null) {
                throw new NoSuchElementException();
            }
            this.f66582g = e0Var;
            a();
            return this.f66582g;
        }

        public boolean c() {
            E e10 = this.f66580e;
            if (e10 == null) {
                return false;
            }
            this.f66580e = (E) e10.getNext();
            while (true) {
                E e11 = this.f66580e;
                if (e11 == null) {
                    return false;
                }
                if (a(e11)) {
                    return true;
                }
                this.f66580e = (E) this.f66580e.getNext();
            }
        }

        public boolean d() {
            while (true) {
                int i10 = this.f66577b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f66579d;
                this.f66577b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f66580e = e10;
                if (e10 != null && (a(e10) || c())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66581f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            io.odeeo.internal.u0.r.a(this.f66582g != null);
            c2.this.remove(this.f66582g.getKey());
            this.f66582g = null;
        }

        public boolean a(E e10) {
            try {
                Object key = e10.getKey();
                Object objA = c2.this.a((c2) e10);
                if (objA == null) {
                    this.f66578c.e();
                    return false;
                }
                this.f66581f = new e0(key, objA);
                this.f66578c.e();
                return true;
            } catch (Throwable th2) {
                this.f66578c.e();
                throw th2;
            }
        }
    }

    public static <K, V, E extends i<K, V, E>> c0<K, V, E> a() {
        return (c0<K, V, E>) f66547j;
    }

    public int a(Object obj) {
        return b(this.f66552e.hash(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(c0<K, V, E> c0Var) {
        i entry = c0Var.getEntry();
        int hash = entry.getHash();
        c(hash).a((n<K, V, E, S>) entry.getKey(), hash, (c0<n<K, V, E, S>, V, E>) c0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements c0<Object, Object, e> {
        @Override // io.odeeo.internal.u0.c2.c0
        public c0<Object, Object, e> copyFor(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }

        @Override // io.odeeo.internal.u0.c2.c0
        public Object get() {
            return null;
        }

        @Override // io.odeeo.internal.u0.c2.c0
        public e getEntry() {
            return null;
        }

        @Override // io.odeeo.internal.u0.c2.c0
        public void clear() {
        }
    }

    public n<K, V, E, S> a(int i10, int i11) {
        return this.f66553f.newSegment(this, i10, i11);
    }

    public V a(E e10) {
        V v10;
        if (e10.getKey() == null || (v10 = (V) e10.getValue()) == null) {
            return null;
        }
        return v10;
    }

    public final n<K, V, E, S>[] a(int i10) {
        return new n[i10];
    }
}
