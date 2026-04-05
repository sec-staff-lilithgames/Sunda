package uu;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends o {

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f88785f;

    /* renamed from: b, reason: collision with root package name */
    public int f88786b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f88787c;

    /* renamed from: e, reason: collision with root package name */
    public int f88788e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f88785f = new Object[0];
    }

    public u() {
        this.f88787c = f88785f;
    }

    public final void a(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f88787c.length;
        while (i10 < length && it.hasNext()) {
            this.f88787c[i10] = it.next();
            i10++;
        }
        int i11 = this.f88786b;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f88787c[i12] = it.next();
        }
        this.f88788e = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        h();
        c(elements.size() + size());
        a(g(size() + this.f88786b), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        h();
        c(size() + 1);
        int i10 = this.f88786b;
        int lastIndex = i10 == 0 ? k0.getLastIndex(this.f88787c) : i10 - 1;
        this.f88786b = lastIndex;
        this.f88787c[lastIndex] = obj;
        this.f88788e = size() + 1;
    }

    public final void addLast(Object obj) {
        h();
        c(size() + 1);
        this.f88787c[g(size() + this.f88786b)] = obj;
        this.f88788e = size() + 1;
    }

    public final void c(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f88787c;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f88785f) {
            this.f88787c = new Object[qv.v.coerceAtLeast(i10, 10)];
            return;
        }
        Object[] objArr2 = new Object[g.Companion.newCapacity$kotlin_stdlib(objArr.length, i10)];
        Object[] objArr3 = this.f88787c;
        f0.copyInto(objArr3, objArr2, 0, this.f88786b, objArr3.length);
        Object[] objArr4 = this.f88787c;
        int length = objArr4.length;
        int i11 = this.f88786b;
        f0.copyInto(objArr4, objArr2, length - i11, 0, i11);
        this.f88786b = 0;
        this.f88787c = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            h();
            f(this.f88786b, g(size() + this.f88786b));
        }
        this.f88786b = 0;
        this.f88788e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        if (i10 == k0.getLastIndex(this.f88787c)) {
            return 0;
        }
        return i10 + 1;
    }

    public final int e(int i10) {
        return i10 < 0 ? i10 + this.f88787c.length : i10;
    }

    public final void f(int i10, int i11) {
        if (i10 < i11) {
            f0.fill(this.f88787c, (Object) null, i10, i11);
            return;
        }
        Object[] objArr = this.f88787c;
        f0.fill(objArr, (Object) null, i10, objArr.length);
        f0.fill(this.f88787c, (Object) null, 0, i11);
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f88787c[this.f88786b];
    }

    public final Object firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.f88787c[this.f88786b];
    }

    public final int g(int i10) {
        Object[] objArr = this.f88787c;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        g.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        return this.f88787c[g(this.f88786b + i10)];
    }

    @Override // uu.o
    public int getSize() {
        return this.f88788e;
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iG = g(size() + this.f88786b);
        int length = this.f88786b;
        if (length < iG) {
            while (length < iG) {
                if (kotlin.jvm.internal.e0.areEqual(obj, this.f88787c[length])) {
                    i10 = this.f88786b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iG) {
            return -1;
        }
        int length2 = this.f88787c.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iG; i11++) {
                    if (kotlin.jvm.internal.e0.areEqual(obj, this.f88787c[i11])) {
                        length = i11 + this.f88787c.length;
                        i10 = this.f88786b;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.e0.areEqual(obj, this.f88787c[length])) {
                i10 = this.f88786b;
                break;
            }
            length++;
        }
        return length - i10;
    }

    public final void internalStructure$kotlin_stdlib(kv.p structure) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.f88786b) < g(size() + this.f88786b)) ? this.f88786b : i10 - this.f88787c.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f88787c[g(p0.getLastIndex(this) + this.f88786b)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i10;
        int iG = g(size() + this.f88786b);
        int i11 = this.f88786b;
        if (i11 < iG) {
            lastIndex = iG - 1;
            if (i11 <= lastIndex) {
                while (!kotlin.jvm.internal.e0.areEqual(obj, this.f88787c[lastIndex])) {
                    if (lastIndex != i11) {
                        lastIndex--;
                    }
                }
                i10 = this.f88786b;
                return lastIndex - i10;
            }
            return -1;
        }
        if (i11 > iG) {
            int i12 = iG - 1;
            while (true) {
                if (-1 >= i12) {
                    lastIndex = k0.getLastIndex(this.f88787c);
                    int i13 = this.f88786b;
                    if (i13 <= lastIndex) {
                        while (!kotlin.jvm.internal.e0.areEqual(obj, this.f88787c[lastIndex])) {
                            if (lastIndex != i13) {
                                lastIndex--;
                            }
                        }
                        i10 = this.f88786b;
                    }
                } else {
                    if (kotlin.jvm.internal.e0.areEqual(obj, this.f88787c[i12])) {
                        lastIndex = i12 + this.f88787c.length;
                        i10 = this.f88786b;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    public final Object lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.f88787c[g(p0.getLastIndex(this) + this.f88786b)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int iG;
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f88787c.length != 0) {
            int iG2 = g(size() + this.f88786b);
            int i10 = this.f88786b;
            if (i10 < iG2) {
                iG = i10;
                while (i10 < iG2) {
                    Object obj = this.f88787c[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f88787c[iG] = obj;
                        iG++;
                    }
                    i10++;
                }
                f0.fill(this.f88787c, (Object) null, iG, iG2);
            } else {
                int length = this.f88787c.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f88787c;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f88787c[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iG = g(i11);
                for (int i12 = 0; i12 < iG2; i12++) {
                    Object[] objArr2 = this.f88787c;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f88787c[iG] = obj3;
                        iG = d(iG);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                h();
                this.f88788e = e(iG - this.f88786b);
            }
        }
        return z10;
    }

    @Override // uu.o
    public Object removeAt(int i10) {
        g.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        if (i10 == p0.getLastIndex(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        h();
        int iG = g(this.f88786b + i10);
        Object obj = this.f88787c[iG];
        if (i10 < (size() >> 1)) {
            int i11 = this.f88786b;
            if (iG >= i11) {
                Object[] objArr = this.f88787c;
                f0.copyInto(objArr, objArr, i11 + 1, i11, iG);
            } else {
                Object[] objArr2 = this.f88787c;
                f0.copyInto(objArr2, objArr2, 1, 0, iG);
                Object[] objArr3 = this.f88787c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f88786b;
                f0.copyInto(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f88787c;
            int i13 = this.f88786b;
            objArr4[i13] = null;
            this.f88786b = d(i13);
        } else {
            int iG2 = g(p0.getLastIndex(this) + this.f88786b);
            if (iG <= iG2) {
                Object[] objArr5 = this.f88787c;
                f0.copyInto(objArr5, objArr5, iG, iG + 1, iG2 + 1);
            } else {
                Object[] objArr6 = this.f88787c;
                f0.copyInto(objArr6, objArr6, iG, iG + 1, objArr6.length);
                Object[] objArr7 = this.f88787c;
                objArr7[objArr7.length - 1] = objArr7[0];
                f0.copyInto(objArr7, objArr7, 0, 1, iG2 + 1);
            }
            this.f88787c[iG2] = null;
        }
        this.f88788e = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        Object[] objArr = this.f88787c;
        int i10 = this.f88786b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f88786b = d(i10);
        this.f88788e = size() - 1;
        return obj;
    }

    public final Object removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        int iG = g(p0.getLastIndex(this) + this.f88786b);
        Object[] objArr = this.f88787c;
        Object obj = objArr[iG];
        objArr[iG] = null;
        this.f88788e = size() - 1;
        return obj;
    }

    public final Object removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            removeAt(i10);
            return;
        }
        h();
        if (i10 < size() - i11) {
            int iG = g(this.f88786b + (i10 - 1));
            int iG2 = g(this.f88786b + (i11 - 1));
            while (i10 > 0) {
                int i13 = iG + 1;
                int iMin = Math.min(i10, Math.min(i13, iG2 + 1));
                Object[] objArr = this.f88787c;
                int i14 = iG2 - iMin;
                int i15 = iG - iMin;
                f0.copyInto(objArr, objArr, i14 + 1, i15 + 1, i13);
                iG = e(i15);
                iG2 = e(i14);
                i10 -= iMin;
            }
            int iG3 = g(this.f88786b + i12);
            f(this.f88786b, iG3);
            this.f88786b = iG3;
        } else {
            int iG4 = g(this.f88786b + i11);
            int iG5 = g(this.f88786b + i10);
            int size = size();
            while (true) {
                size -= i11;
                if (size <= 0) {
                    break;
                }
                Object[] objArr2 = this.f88787c;
                i11 = Math.min(size, Math.min(objArr2.length - iG4, objArr2.length - iG5));
                Object[] objArr3 = this.f88787c;
                int i16 = iG4 + i11;
                f0.copyInto(objArr3, objArr3, iG5, iG4, i16);
                iG4 = g(i16);
                iG5 = g(iG5 + i11);
            }
            int iG6 = g(size() + this.f88786b);
            f(e(iG6 - i12), iG6);
        }
        this.f88788e = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int iG;
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f88787c.length != 0) {
            int iG2 = g(size() + this.f88786b);
            int i10 = this.f88786b;
            if (i10 < iG2) {
                iG = i10;
                while (i10 < iG2) {
                    Object obj = this.f88787c[i10];
                    if (elements.contains(obj)) {
                        this.f88787c[iG] = obj;
                        iG++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f0.fill(this.f88787c, (Object) null, iG, iG2);
            } else {
                int length = this.f88787c.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f88787c;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f88787c[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iG = g(i11);
                for (int i12 = 0; i12 < iG2; i12++) {
                    Object[] objArr2 = this.f88787c;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f88787c[iG] = obj3;
                        iG = d(iG);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                h();
                this.f88788e = e(iG - this.f88786b);
            }
        }
        return z10;
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        g.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        int iG = g(this.f88786b + i10);
        Object[] objArr = this.f88787c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final void testRemoveRange$kotlin_stdlib(int i10, int i11) {
        removeRange(i10, i11);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) v.arrayOfNulls(array, size());
        }
        T[] tArr = array;
        int iG = g(size() + this.f88786b);
        int i10 = this.f88786b;
        if (i10 < iG) {
            f0.copyInto$default(this.f88787c, tArr, 0, i10, iG, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f88787c;
            f0.copyInto(objArr, tArr, 0, this.f88786b, objArr.length);
            Object[] objArr2 = this.f88787c;
            f0.copyInto(objArr2, tArr, objArr2.length - this.f88786b, 0, iG);
        }
        return (T[]) o0.terminateCollectionToArray(size(), tArr);
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        g.Companion.checkPositionIndex$kotlin_stdlib(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        h();
        c(size() + 1);
        int iG = g(this.f88786b + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int lastIndex = iG == 0 ? k0.getLastIndex(this.f88787c) : iG - 1;
            int i11 = this.f88786b;
            int lastIndex2 = i11 == 0 ? k0.getLastIndex(this.f88787c) : i11 - 1;
            int i12 = this.f88786b;
            if (lastIndex >= i12) {
                Object[] objArr = this.f88787c;
                objArr[lastIndex2] = objArr[i12];
                f0.copyInto(objArr, objArr, i12, i12 + 1, lastIndex + 1);
            } else {
                Object[] objArr2 = this.f88787c;
                f0.copyInto(objArr2, objArr2, i12 - 1, i12, objArr2.length);
                Object[] objArr3 = this.f88787c;
                objArr3[objArr3.length - 1] = objArr3[0];
                f0.copyInto(objArr3, objArr3, 0, 1, lastIndex + 1);
            }
            this.f88787c[lastIndex] = obj;
            this.f88786b = lastIndex2;
        } else {
            int iG2 = g(size() + this.f88786b);
            if (iG < iG2) {
                Object[] objArr4 = this.f88787c;
                f0.copyInto(objArr4, objArr4, iG + 1, iG, iG2);
            } else {
                Object[] objArr5 = this.f88787c;
                f0.copyInto(objArr5, objArr5, 1, 0, iG2);
                Object[] objArr6 = this.f88787c;
                objArr6[0] = objArr6[objArr6.length - 1];
                f0.copyInto(objArr6, objArr6, iG + 1, iG, objArr6.length - 1);
            }
            this.f88787c[iG] = obj;
        }
        this.f88788e = size() + 1;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public u(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f88785f;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(a.b.e(i10, "Illegal Capacity: "));
        }
        this.f88787c = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        g.Companion.checkPositionIndex$kotlin_stdlib(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        h();
        c(elements.size() + size());
        int iG = g(size() + this.f88786b);
        int iG2 = g(this.f88786b + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f88786b;
            int length = i11 - size;
            if (iG2 < i11) {
                Object[] objArr = this.f88787c;
                f0.copyInto(objArr, objArr, length, i11, objArr.length);
                if (size >= iG2) {
                    Object[] objArr2 = this.f88787c;
                    f0.copyInto(objArr2, objArr2, objArr2.length - size, 0, iG2);
                } else {
                    Object[] objArr3 = this.f88787c;
                    f0.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f88787c;
                    f0.copyInto(objArr4, objArr4, 0, size, iG2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f88787c;
                f0.copyInto(objArr5, objArr5, length, i11, iG2);
            } else {
                Object[] objArr6 = this.f88787c;
                length += objArr6.length;
                int i12 = iG2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    f0.copyInto(objArr6, objArr6, length, i11, iG2);
                } else {
                    f0.copyInto(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f88787c;
                    f0.copyInto(objArr7, objArr7, 0, this.f88786b + length2, iG2);
                }
            }
            this.f88786b = length;
            a(e(iG2 - size), elements);
        } else {
            int i13 = iG2 + size;
            if (iG2 < iG) {
                int i14 = size + iG;
                Object[] objArr8 = this.f88787c;
                if (i14 <= objArr8.length) {
                    f0.copyInto(objArr8, objArr8, i13, iG2, iG);
                } else if (i13 >= objArr8.length) {
                    f0.copyInto(objArr8, objArr8, i13 - objArr8.length, iG2, iG);
                } else {
                    int length3 = iG - (i14 - objArr8.length);
                    f0.copyInto(objArr8, objArr8, 0, length3, iG);
                    Object[] objArr9 = this.f88787c;
                    f0.copyInto(objArr9, objArr9, i13, iG2, length3);
                }
            } else {
                Object[] objArr10 = this.f88787c;
                f0.copyInto(objArr10, objArr10, size, 0, iG);
                Object[] objArr11 = this.f88787c;
                if (i13 >= objArr11.length) {
                    f0.copyInto(objArr11, objArr11, i13 - objArr11.length, iG2, objArr11.length);
                } else {
                    f0.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f88787c;
                    f0.copyInto(objArr12, objArr12, i13, iG2, objArr12.length - size);
                }
            }
            a(iG2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public u(Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f88787c = array;
        this.f88788e = array.length;
        if (array.length == 0) {
            this.f88787c = f88785f;
        }
    }
}
