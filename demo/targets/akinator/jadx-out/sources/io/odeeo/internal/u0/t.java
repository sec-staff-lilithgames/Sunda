package io.odeeo.internal.u0;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class t<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient int[] f67061a;

    /* renamed from: b, reason: collision with root package name */
    public transient long[] f67062b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f67063c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f67064d;

    /* renamed from: e, reason: collision with root package name */
    public transient float f67065e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f67066f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f67067g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f67068h;

    /* renamed from: i, reason: collision with root package name */
    public transient Set<K> f67069i;

    /* renamed from: j, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f67070j;

    /* renamed from: k, reason: collision with root package name */
    public transient Collection<V> f67071k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends t<K, V>.e<K> {
        public a() {
            super(t.this, null);
        }

        @Override // io.odeeo.internal.u0.t.e
        public K a(int i10) {
            return (K) t.this.f67063c[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends t<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(t.this, null);
        }

        @Override // io.odeeo.internal.u0.t.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(int i10) {
            return new g(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends t<K, V>.e<V> {
        public c() {
            super(t.this, null);
        }

        @Override // io.odeeo.internal.u0.t.e
        public V a(int i10) {
            return (V) t.this.f67064d[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iA = t.this.a(entry.getKey());
                if (iA != -1 && io.odeeo.internal.t0.p.equal(t.this.f67064d[iA], entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return t.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = t.this.a(entry.getKey());
            if (iA == -1 || !io.odeeo.internal.t0.p.equal(t.this.f67064d[iA], entry.getValue())) {
                return false;
            }
            t.this.f(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.f67068h;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return t.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return t.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iA = t.this.a(obj);
            if (iA == -1) {
                return false;
            }
            t.this.f(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.f67068h;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class g extends io.odeeo.internal.u0.f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f67081a;

        /* renamed from: b, reason: collision with root package name */
        public int f67082b;

        public g(int i10) {
            this.f67081a = (K) t.this.f67063c[i10];
            this.f67082b = i10;
        }

        public final void a() {
            int i10 = this.f67082b;
            if (i10 == -1 || i10 >= t.this.size() || !io.odeeo.internal.t0.p.equal(this.f67081a, t.this.f67063c[this.f67082b])) {
                this.f67082b = t.this.a(this.f67081a);
            }
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public K getKey() {
            return this.f67081a;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f67082b;
            if (i10 == -1) {
                return null;
            }
            return (V) t.this.f67064d[i10];
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public V setValue(V v10) {
            a();
            int i10 = this.f67082b;
            if (i10 == -1) {
                t.this.put(this.f67081a, v10);
                return null;
            }
            Object[] objArr = t.this.f67064d;
            V v11 = (V) objArr[i10];
            objArr[i10] = v10;
            return v11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return t.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return t.this.f67068h;
        }
    }

    public t() {
        a(3, 1.0f);
    }

    public static int b(long j10) {
        return (int) j10;
    }

    public static <K, V> t<K, V> create() {
        return new t<>();
    }

    public static <K, V> t<K, V> createWithExpectedSize(int i10) {
        return new t<>(i10);
    }

    public static long[] d(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] e(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(3, 1.0f);
        int i10 = objectInputStream.readInt();
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            } else {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f67068h);
        for (int i10 = 0; i10 < this.f67068h; i10++) {
            objectOutputStream.writeObject(this.f67063c[i10]);
            objectOutputStream.writeObject(this.f67064d[i10]);
        }
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    public void c(int i10) {
        int size = size() - 1;
        if (i10 >= size) {
            this.f67063c[i10] = null;
            this.f67064d[i10] = null;
            this.f67062b[i10] = -1;
            return;
        }
        Object[] objArr = this.f67063c;
        objArr[i10] = objArr[size];
        Object[] objArr2 = this.f67064d;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        long[] jArr = this.f67062b;
        long j10 = jArr[size];
        jArr[i10] = j10;
        jArr[size] = -1;
        int iA = a(j10) & f();
        int[] iArr = this.f67061a;
        int i11 = iArr[iA];
        if (i11 == size) {
            iArr[iA] = i10;
            return;
        }
        while (true) {
            long j11 = this.f67062b[i11];
            int iB = b(j11);
            if (iB == size) {
                this.f67062b[i11] = a(j11, i10);
                return;
            }
            i11 = iB;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f67066f++;
        Arrays.fill(this.f67063c, 0, this.f67068h, (Object) null);
        Arrays.fill(this.f67064d, 0, this.f67068h, (Object) null);
        Arrays.fill(this.f67061a, -1);
        Arrays.fill(this.f67062b, -1L);
        this.f67068h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i10 = 0; i10 < this.f67068h; i10++) {
            if (io.odeeo.internal.t0.p.equal(obj, this.f67064d[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f67070j;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setA = a();
        this.f67070j = setA;
        return setA;
    }

    public final int f() {
        return this.f67061a.length - 1;
    }

    public void g(int i10) {
        this.f67063c = Arrays.copyOf(this.f67063c, i10);
        this.f67064d = Arrays.copyOf(this.f67064d, i10);
        long[] jArr = this.f67062b;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f67062b = jArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iA = a(obj);
        a(iA);
        if (iA == -1) {
            return null;
        }
        return (V) this.f67064d[iA];
    }

    public final void h(int i10) {
        int length = this.f67062b.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                g(iMax);
            }
        }
    }

    public final void i(int i10) {
        if (this.f67061a.length >= 1073741824) {
            this.f67067g = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f67065e)) + 1;
        int[] iArrE = e(i10);
        long[] jArr = this.f67062b;
        int length = iArrE.length - 1;
        for (int i12 = 0; i12 < this.f67068h; i12++) {
            int iA = a(jArr[i12]);
            int i13 = iA & length;
            int i14 = iArrE[i13];
            iArrE[i13] = i12;
            jArr[i12] = (iA << 32) | (i14 & 4294967295L);
        }
        this.f67067g = i11;
        this.f67061a = iArrE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f67068h == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f67069i;
        if (set != null) {
            return set;
        }
        Set<K> setB = b();
        this.f67069i = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        long[] jArr = this.f67062b;
        Object[] objArr = this.f67063c;
        Object[] objArr2 = this.f67064d;
        int iA = b1.a(k10);
        int iF = f() & iA;
        int i10 = this.f67068h;
        int[] iArr = this.f67061a;
        int i11 = iArr[iF];
        if (i11 == -1) {
            iArr[iF] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (a(j10) == iA && io.odeeo.internal.t0.p.equal(k10, objArr[i11])) {
                    V v11 = (V) objArr2[i11];
                    objArr2[i11] = v10;
                    a(i11);
                    return v11;
                }
                int iB = b(j10);
                if (iB == -1) {
                    jArr[i11] = a(j10, i10);
                    break;
                }
                i11 = iB;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i12 = i10 + 1;
        h(i12);
        a(i10, k10, v10, iA);
        this.f67068h = i12;
        if (i10 >= this.f67067g) {
            i(this.f67061a.length * 2);
        }
        this.f67066f++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return a(obj, b1.a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f67068h;
    }

    public void trimToSize() {
        int i10 = this.f67068h;
        if (i10 < this.f67062b.length) {
            g(i10);
        }
        int iMax = Math.max(1, Integer.highestOneBit((int) (i10 / this.f67065e)));
        if (iMax < 1073741824 && i10 / iMax > this.f67065e) {
            iMax <<= 1;
        }
        if (iMax < this.f67061a.length) {
            i(iMax);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f67071k;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionC = c();
        this.f67071k = collectionC;
        return collectionC;
    }

    public static int a(long j10) {
        return (int) (j10 >>> 32);
    }

    public int b(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f67068h) {
            return i11;
        }
        return -1;
    }

    public final V f(int i10) {
        return a(this.f67063c[i10], a(this.f67062b[i10]));
    }

    public t(int i10) {
        this(i10, 1.0f);
    }

    public static long a(long j10, int i10) {
        return (j10 & (-4294967296L)) | (i10 & 4294967295L);
    }

    public Set<K> b() {
        return new f();
    }

    public Iterator<Map.Entry<K, V>> d() {
        return new b();
    }

    public int e() {
        return isEmpty() ? -1 : 0;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f67076a;

        /* renamed from: b, reason: collision with root package name */
        public int f67077b;

        /* renamed from: c, reason: collision with root package name */
        public int f67078c;

        public e() {
            this.f67076a = t.this.f67066f;
            this.f67077b = t.this.e();
            this.f67078c = -1;
        }

        public abstract T a(int i10);

        public final void a() {
            if (t.this.f67066f != this.f67076a) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67077b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f67077b;
            this.f67078c = i10;
            T tA = a(i10);
            this.f67077b = t.this.b(this.f67077b);
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            r.a(this.f67078c >= 0);
            this.f67076a++;
            t.this.f(this.f67078c);
            this.f67077b = t.this.a(this.f67077b, this.f67078c);
            this.f67078c = -1;
        }

        public /* synthetic */ e(t tVar, a aVar) {
            this();
        }
    }

    public t(int i10, float f10) {
        a(i10, f10);
    }

    public void a(int i10) {
    }

    public Iterator<V> h() {
        return new c();
    }

    public void a(int i10, float f10) {
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        io.odeeo.internal.t0.u.checkArgument(f10 > 0.0f, "Illegal load factor");
        int iA = b1.a(i10, f10);
        this.f67061a = e(iA);
        this.f67065e = f10;
        this.f67063c = new Object[i10];
        this.f67064d = new Object[i10];
        this.f67062b = d(i10);
        this.f67067g = Math.max(1, (int) (iA * f10));
    }

    public Iterator<K> g() {
        return new a();
    }

    public void a(int i10, K k10, V v10, int i11) {
        this.f67062b[i10] = (i11 << 32) | 4294967295L;
        this.f67063c[i10] = k10;
        this.f67064d[i10] = v10;
    }

    public Collection<V> c() {
        return new h();
    }

    public final int a(Object obj) {
        int iA = b1.a(obj);
        int iB = this.f67061a[f() & iA];
        while (iB != -1) {
            long j10 = this.f67062b[iB];
            if (a(j10) == iA && io.odeeo.internal.t0.p.equal(obj, this.f67063c[iB])) {
                return iB;
            }
            iB = b(j10);
        }
        return -1;
    }

    public final V a(Object obj, int i10) {
        int iF = f() & i10;
        int i11 = this.f67061a[iF];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (a(this.f67062b[i11]) == i10 && io.odeeo.internal.t0.p.equal(obj, this.f67063c[i11])) {
                V v10 = (V) this.f67064d[i11];
                if (i12 == -1) {
                    this.f67061a[iF] = b(this.f67062b[i11]);
                } else {
                    long[] jArr = this.f67062b;
                    jArr[i12] = a(jArr[i12], b(jArr[i11]));
                }
                c(i11);
                this.f67068h--;
                this.f67066f++;
                return v10;
            }
            int iB = b(this.f67062b[i11]);
            if (iB == -1) {
                return null;
            }
            i12 = i11;
            i11 = iB;
        }
    }

    public Set<Map.Entry<K, V>> a() {
        return new d();
    }
}
