package z1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements List, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public Object[] f97390b = new Object[16];

    /* renamed from: c, reason: collision with root package name */
    public long[] f97391c = new long[16];

    /* renamed from: e, reason: collision with root package name */
    public int f97392e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f97393f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements List, lv.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f97398b;

        /* renamed from: c, reason: collision with root package name */
        public final int f97399c;

        public b(int i10, int i11) {
            this.f97398b = i10;
            this.f97399c = i11;
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            return s.this.f97390b[i10 + this.f97398b];
        }

        public final int getMaxIndex() {
            return this.f97399c;
        }

        public final int getMinIndex() {
            return this.f97398b;
        }

        public int getSize() {
            return this.f97399c - this.f97398b;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f97398b;
            int i11 = this.f97399c;
            if (i10 > i11) {
                return -1;
            }
            int i12 = i10;
            while (!kotlin.jvm.internal.e0.areEqual(s.this.f97390b[i12], obj)) {
                if (i12 == i11) {
                    return -1;
                }
                i12++;
            }
            return i12 - i10;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            int i10 = this.f97398b;
            return s.this.new a(i10, i10, this.f97399c);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f97399c;
            int i11 = this.f97398b;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.e0.areEqual(s.this.f97390b[i10], obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            int i10 = this.f97398b;
            return s.this.new a(i10, i10, this.f97399c);
        }

        @Override // java.util.List
        public Object remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Object> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<Object> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<Object> subList(int i10, int i11) {
            int i12 = this.f97398b;
            return s.this.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i10) {
            int i11 = this.f97398b;
            int i12 = this.f97399c;
            return s.this.new a(i10 + i11, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
            return (T[]) kotlin.jvm.internal.t.toArray(this, array);
        }
    }

    public final void acceptHits() {
        this.f97392e = size() - 1;
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long c() {
        long jM8037constructorimpl = k.m8037constructorimpl(((false ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(Float.POSITIVE_INFINITY) << 32));
        int i10 = this.f97392e + 1;
        int lastIndex = uu.p0.getLastIndex(this);
        if (i10 <= lastIndex) {
            while (true) {
                long jM8037constructorimpl2 = k.m8037constructorimpl(this.f97391c[i10]);
                if (k.m8036compareToS_HNhKs(jM8037constructorimpl2, jM8037constructorimpl) < 0) {
                    jM8037constructorimpl = jM8037constructorimpl2;
                }
                if ((k.m8040getDistanceimpl(jM8037constructorimpl) < 0.0f && k.m8042isInLayerimpl(jM8037constructorimpl)) || i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jM8037constructorimpl;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f97392e = -1;
        d();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i10 = this.f97392e + 1;
        int lastIndex = uu.p0.getLastIndex(this);
        if (i10 <= lastIndex) {
            while (true) {
                this.f97390b[i10] = null;
                if (i10 == lastIndex) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f97393f = this.f97392e + 1;
    }

    @Override // java.util.List
    public Object get(int i10) {
        return this.f97390b[i10];
    }

    public int getSize() {
        return this.f97393f;
    }

    public final boolean hasHit() {
        long jC = c();
        return k.m8040getDistanceimpl(jC) < 0.0f && k.m8042isInLayerimpl(jC);
    }

    public final void hit(Object obj, boolean z10, kv.a childHitTest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childHitTest, "childHitTest");
        hitInMinimumTouchTarget(obj, -1.0f, z10, childHitTest);
    }

    public final void hitInMinimumTouchTarget(Object obj, float f10, boolean z10, kv.a childHitTest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childHitTest, "childHitTest");
        int i10 = this.f97392e;
        int i11 = i10 + 1;
        this.f97392e = i11;
        Object[] objArr = this.f97390b;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f97390b = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f97391c, length);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f97391c = jArrCopyOf;
        }
        Object[] objArr2 = this.f97390b;
        int i12 = this.f97392e;
        objArr2[i12] = obj;
        this.f97391c[i12] = k.m8037constructorimpl(((false ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
        d();
        childHitTest.invoke();
        this.f97392e = i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int lastIndex = uu.p0.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i10 = 0;
        while (!kotlin.jvm.internal.e0.areEqual(this.f97390b[i10], obj)) {
            if (i10 == lastIndex) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f10, boolean z10) {
        if (this.f97392e == uu.p0.getLastIndex(this)) {
            return true;
        }
        return k.m8036compareToS_HNhKs(c(), k.m8037constructorimpl(((false ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f10) << 32))) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        for (int lastIndex = uu.p0.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (kotlin.jvm.internal.e0.areEqual(this.f97390b[lastIndex], obj)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Object> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int i10 = this.f97392e;
        block.invoke();
        this.f97392e = i10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<Object> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(Object obj, float f10, boolean z10, kv.a childHitTest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childHitTest, "childHitTest");
        if (this.f97392e == uu.p0.getLastIndex(this)) {
            hitInMinimumTouchTarget(obj, f10, z10, childHitTest);
            if (this.f97392e + 1 == uu.p0.getLastIndex(this)) {
                d();
                return;
            }
            return;
        }
        long jC = c();
        int i10 = this.f97392e;
        this.f97392e = uu.p0.getLastIndex(this);
        hitInMinimumTouchTarget(obj, f10, z10, childHitTest);
        if (this.f97392e + 1 < uu.p0.getLastIndex(this) && k.m8036compareToS_HNhKs(jC, c()) > 0) {
            int i11 = this.f97392e + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f97390b;
            uu.f0.copyInto(objArr, objArr, i12, i11, size());
            long[] jArr = this.f97391c;
            uu.f0.copyInto(jArr, jArr, i12, i11, size());
            this.f97392e = ((size() + i10) - this.f97392e) - 1;
        }
        d();
        this.f97392e = i10;
    }

    @Override // java.util.List
    public List<Object> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements ListIterator, lv.a {

        /* renamed from: b, reason: collision with root package name */
        public int f97394b;

        /* renamed from: c, reason: collision with root package name */
        public final int f97395c;

        /* renamed from: e, reason: collision with root package name */
        public final int f97396e;

        public a(int i10, int i11, int i12) {
            this.f97394b = i10;
            this.f97395c = i11;
            this.f97396e = i12;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.f97394b;
        }

        public final int getMaxIndex() {
            return this.f97396e;
        }

        public final int getMinIndex() {
            return this.f97395c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f97394b < this.f97396e;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f97394b > this.f97395c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            Object[] objArr = s.this.f97390b;
            int i10 = this.f97394b;
            this.f97394b = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f97394b - this.f97395c;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            Object[] objArr = s.this.f97390b;
            int i10 = this.f97394b - 1;
            this.f97394b = i10;
            return objArr[i10];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f97394b - this.f97395c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.f97394b = i10;
        }

        public /* synthetic */ a(s sVar, int i10, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? sVar.size() : i12);
        }
    }
}
