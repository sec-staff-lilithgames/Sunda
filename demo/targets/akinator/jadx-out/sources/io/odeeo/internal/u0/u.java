package io.odeeo.internal.u0;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient int[] f67086a;

    /* renamed from: b, reason: collision with root package name */
    public transient long[] f67087b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f67088c;

    /* renamed from: d, reason: collision with root package name */
    public transient float f67089d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f67090e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f67091f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f67092g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f67093a;

        /* renamed from: b, reason: collision with root package name */
        public int f67094b;

        /* renamed from: c, reason: collision with root package name */
        public int f67095c = -1;

        public a() {
            this.f67093a = u.this.f67090e;
            this.f67094b = u.this.a();
        }

        public final void a() {
            if (u.this.f67090e != this.f67093a) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67094b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f67094b;
            this.f67095c = i10;
            u uVar = u.this;
            E e10 = (E) uVar.f67088c[i10];
            this.f67094b = uVar.a(i10);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            r.a(this.f67095c >= 0);
            this.f67093a++;
            u uVar = u.this;
            uVar.a(uVar.f67088c[this.f67095c], u.b(uVar.f67087b[this.f67095c]));
            this.f67094b = u.this.a(this.f67094b, this.f67095c);
            this.f67095c = -1;
        }
    }

    public u() {
        a(3, 1.0f);
    }

    public static int b(long j10) {
        return (int) (j10 >>> 32);
    }

    public static int c(long j10) {
        return (int) j10;
    }

    public static <E> u<E> create() {
        return new u<>();
    }

    public static <E> u<E> createWithExpectedSize(int i10) {
        return new u<>(i10);
    }

    public static int[] d(int i10) {
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
                add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f67092g);
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        long[] jArr = this.f67087b;
        Object[] objArr = this.f67088c;
        int iA = b1.a(e10);
        int iB = b() & iA;
        int i10 = this.f67092g;
        int[] iArr = this.f67086a;
        int i11 = iArr[iB];
        if (i11 == -1) {
            iArr[iB] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (b(j10) == iA && io.odeeo.internal.t0.p.equal(e10, objArr[i11])) {
                    return false;
                }
                int iC = c(j10);
                if (iC == -1) {
                    jArr[i11] = a(j10, i10);
                    break;
                }
                i11 = iC;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i12 = i10 + 1;
        f(i12);
        a(i10, (int) e10, iA);
        this.f67092g = i12;
        if (i10 >= this.f67091f) {
            g(this.f67086a.length * 2);
        }
        this.f67090e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f67090e++;
        Arrays.fill(this.f67088c, 0, this.f67092g, (Object) null);
        Arrays.fill(this.f67086a, -1);
        Arrays.fill(this.f67087b, -1L);
        this.f67092g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int iA = b1.a(obj);
        int iC = this.f67086a[b() & iA];
        while (iC != -1) {
            long j10 = this.f67087b[iC];
            if (b(j10) == iA && io.odeeo.internal.t0.p.equal(obj, this.f67088c[iC])) {
                return true;
            }
            iC = c(j10);
        }
        return false;
    }

    public void e(int i10) {
        this.f67088c = Arrays.copyOf(this.f67088c, i10);
        long[] jArr = this.f67087b;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f67087b = jArrCopyOf;
    }

    public final void f(int i10) {
        int length = this.f67087b.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                e(iMax);
            }
        }
    }

    public final void g(int i10) {
        if (this.f67086a.length >= 1073741824) {
            this.f67091f = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f67089d)) + 1;
        int[] iArrD = d(i10);
        long[] jArr = this.f67087b;
        int length = iArrD.length - 1;
        for (int i12 = 0; i12 < this.f67092g; i12++) {
            int iB = b(jArr[i12]);
            int i13 = iB & length;
            int i14 = iArrD[i13];
            iArrD[i13] = i12;
            jArr[i12] = (iB << 32) | (i14 & 4294967295L);
        }
        this.f67091f = i11;
        this.f67086a = iArrD;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f67092g == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return a(obj, b1.a(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f67092g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return Arrays.copyOf(this.f67088c, this.f67092g);
    }

    public void trimToSize() {
        int i10 = this.f67092g;
        if (i10 < this.f67087b.length) {
            e(i10);
        }
        int iMax = Math.max(1, Integer.highestOneBit((int) (i10 / this.f67089d)));
        if (iMax < 1073741824 && i10 / iMax > this.f67089d) {
            iMax <<= 1;
        }
        if (iMax < this.f67086a.length) {
            g(iMax);
        }
    }

    public static long a(long j10, int i10) {
        return (j10 & (-4294967296L)) | (i10 & 4294967295L);
    }

    public static long[] c(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static <E> u<E> create(Collection<? extends E> collection) {
        u<E> uVarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        uVarCreateWithExpectedSize.addAll(collection);
        return uVarCreateWithExpectedSize;
    }

    public final int b() {
        return this.f67086a.length - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) m2.a(this.f67088c, 0, this.f67092g, tArr);
    }

    public u(int i10) {
        a(i10, 1.0f);
    }

    public void b(int i10) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f67088c;
            objArr[i10] = objArr[size];
            objArr[size] = null;
            long[] jArr = this.f67087b;
            long j10 = jArr[size];
            jArr[i10] = j10;
            jArr[size] = -1;
            int iB = b(j10) & b();
            int[] iArr = this.f67086a;
            int i11 = iArr[iB];
            if (i11 == size) {
                iArr[iB] = i10;
                return;
            }
            while (true) {
                long j11 = this.f67087b[i11];
                int iC = c(j11);
                if (iC == size) {
                    this.f67087b[i11] = a(j11, i10);
                    return;
                }
                i11 = iC;
            }
        } else {
            this.f67088c[i10] = null;
            this.f67087b[i10] = -1;
        }
    }

    public static <E> u<E> create(E... eArr) {
        u<E> uVarCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(uVarCreateWithExpectedSize, eArr);
        return uVarCreateWithExpectedSize;
    }

    public void a(int i10, float f10) {
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        io.odeeo.internal.t0.u.checkArgument(f10 > 0.0f, "Illegal load factor");
        int iA = b1.a(i10, f10);
        this.f67086a = d(iA);
        this.f67089d = f10;
        this.f67088c = new Object[i10];
        this.f67087b = c(i10);
        this.f67091f = Math.max(1, (int) (iA * f10));
    }

    public void a(int i10, E e10, int i11) {
        this.f67087b[i10] = (i11 << 32) | 4294967295L;
        this.f67088c[i10] = e10;
    }

    public final boolean a(Object obj, int i10) {
        int iB = b() & i10;
        int i11 = this.f67086a[iB];
        if (i11 == -1) {
            return false;
        }
        int i12 = -1;
        while (true) {
            if (b(this.f67087b[i11]) == i10 && io.odeeo.internal.t0.p.equal(obj, this.f67088c[i11])) {
                if (i12 == -1) {
                    this.f67086a[iB] = c(this.f67087b[i11]);
                } else {
                    long[] jArr = this.f67087b;
                    jArr[i12] = a(jArr[i12], c(jArr[i11]));
                }
                b(i11);
                this.f67092g--;
                this.f67090e++;
                return true;
            }
            int iC = c(this.f67087b[i11]);
            if (iC == -1) {
                return false;
            }
            i12 = i11;
            i11 = iC;
        }
    }

    public int a() {
        return isEmpty() ? -1 : 0;
    }

    public int a(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f67092g) {
            return i11;
        }
        return -1;
    }
}
