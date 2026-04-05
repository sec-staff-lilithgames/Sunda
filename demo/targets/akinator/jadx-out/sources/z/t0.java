package z;

import ao.kwoC.zAQQWzBxnS;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends f1 {

    /* renamed from: c, reason: collision with root package name */
    public b f96935c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements ListIterator, lv.e {

        /* renamed from: b, reason: collision with root package name */
        public final List f96936b;

        /* renamed from: c, reason: collision with root package name */
        public int f96937c;

        public a(List<Object> list, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
            this.f96936b = list;
            this.f96937c = i10 - 1;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            int i10 = this.f96937c + 1;
            this.f96937c = i10;
            this.f96936b.add(i10, obj);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f96937c < this.f96936b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f96937c >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i10 = this.f96937c + 1;
            this.f96937c = i10;
            return this.f96936b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f96937c + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f96937c;
            this.f96937c = i10 - 1;
            return this.f96936b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f96937c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f96936b.remove(this.f96937c);
            this.f96937c--;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f96936b.set(this.f96937c, obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements List, lv.d {

        /* renamed from: b, reason: collision with root package name */
        public final t0 f96938b;

        public b(t0 objectList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(objectList, "objectList");
            this.f96938b = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f96938b.add(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            return this.f96938b.addAll(i10, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f96938b.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f96938b.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            return this.f96938b.containsAll(elements);
        }

        @Override // java.util.List
        public Object get(int i10) {
            g1.access$checkIndex(this, i10);
            return this.f96938b.get(i10);
        }

        public int getSize() {
            return this.f96938b.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f96938b.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f96938b.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f96938b.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            return this.f96938b.removeAll(elements);
        }

        public Object removeAt(int i10) {
            g1.access$checkIndex(this, i10);
            return this.f96938b.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            return this.f96938b.retainAll((Collection<Object>) elements);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            g1.access$checkIndex(this, i10);
            return this.f96938b.set(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<Object> subList(int i10, int i11) {
            g1.access$checkSubIndex(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.toArray(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f96938b.add(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            return this.f96938b.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f96938b.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
            return (T[]) kotlin.jvm.internal.t.toArray(this, array);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class c implements List, lv.d {

        /* renamed from: b, reason: collision with root package name */
        public final List f96939b;

        /* renamed from: c, reason: collision with root package name */
        public final int f96940c;

        /* renamed from: e, reason: collision with root package name */
        public int f96941e;

        public c(List<Object> list, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
            this.f96939b = list;
            this.f96940c = i10;
            this.f96941e = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            int i10 = this.f96941e;
            this.f96941e = i10 + 1;
            this.f96939b.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            this.f96939b.addAll(i10 + this.f96940c, elements);
            this.f96941e = elements.size() + this.f96941e;
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f96941e - 1;
            int i11 = this.f96940c;
            if (i11 <= i10) {
                while (true) {
                    this.f96939b.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f96941e = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f96941e;
            for (int i11 = this.f96940c; i11 < i10; i11++) {
                if (kotlin.jvm.internal.e0.areEqual(this.f96939b.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List
        public Object get(int i10) {
            g1.access$checkIndex(this, i10);
            return this.f96939b.get(i10 + this.f96940c);
        }

        public int getSize() {
            return this.f96941e - this.f96940c;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f96941e;
            int i11 = this.f96940c;
            for (int i12 = i11; i12 < i10; i12++) {
                if (kotlin.jvm.internal.e0.areEqual(this.f96939b.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f96941e == this.f96940c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f96941e - 1;
            int i11 = this.f96940c;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.e0.areEqual(this.f96939b.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            int i10 = this.f96941e;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f96941e;
        }

        public Object removeAt(int i10) {
            g1.access$checkIndex(this, i10);
            this.f96941e--;
            return this.f96939b.remove(i10 + this.f96940c);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            int i10 = this.f96941e;
            int i11 = i10 - 1;
            int i12 = this.f96940c;
            if (i12 <= i11) {
                while (true) {
                    List list = this.f96939b;
                    if (!elements.contains(list.get(i11))) {
                        list.remove(i11);
                        this.f96941e--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f96941e;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            g1.access$checkIndex(this, i10);
            return this.f96939b.set(i10 + this.f96940c, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<Object> subList(int i10, int i11) {
            g1.access$checkSubIndex(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.toArray(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f96939b.add(i10 + this.f96940c, obj);
            this.f96941e++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            kotlin.jvm.internal.e0.checkNotNullParameter(collection, zAQQWzBxnS.vZFUckRNsWyB);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f96941e;
            for (int i11 = this.f96940c; i11 < i10; i11++) {
                List list = this.f96939b;
                if (kotlin.jvm.internal.e0.areEqual(list.get(i11), obj)) {
                    list.remove(i11);
                    this.f96941e--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
            return (T[]) kotlin.jvm.internal.t.toArray(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<Object> elements) {
            kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
            this.f96939b.addAll(this.f96941e, elements);
            this.f96941e = elements.size() + this.f96941e;
            return elements.size() > 0;
        }
    }

    public t0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(t0 t0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = t0Var.f96813b;
        }
        t0Var.trim(i10);
    }

    public final void a(int i10) {
        StringBuilder sbT = o2.t(i10, "Index ", " must be in 0..");
        sbT.append(this.f96813b);
        a0.d.throwIndexOutOfBoundsException(sbT.toString());
    }

    public final boolean add(Object obj) {
        int i10 = this.f96813b + 1;
        Object[] objArr = this.f96812a;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
        Object[] objArr2 = this.f96812a;
        int i11 = this.f96813b;
        objArr2[i11] = obj;
        this.f96813b = i11 + 1;
        return true;
    }

    public final boolean addAll(int i10, Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96813b) {
            a(i10);
        }
        if (elements.length == 0) {
            return false;
        }
        int length = this.f96813b + elements.length;
        Object[] objArr = this.f96812a;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        Object[] objArr2 = this.f96812a;
        int i11 = this.f96813b;
        if (i10 != i11) {
            uu.f0.copyInto(objArr2, objArr2, elements.length + i10, i10, i11);
        }
        uu.f0.copyInto$default(elements, objArr2, i10, 0, 0, 12, (Object) null);
        this.f96813b += elements.length;
        return true;
    }

    @Override // z.f1
    public List<Object> asList() {
        return asMutableList();
    }

    public final List<Object> asMutableList() {
        b bVar = this.f96935c;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f96935c = bVar2;
        return bVar2;
    }

    public final void clear() {
        uu.f0.fill(this.f96812a, (Object) null, 0, this.f96813b);
        this.f96813b = 0;
    }

    public final void ensureCapacity(int i10) {
        Object[] objArr = this.f96812a;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
    }

    public final int getCapacity() {
        return this.f96812a.length;
    }

    public final void minusAssign(Object obj) {
        remove(obj);
    }

    public final void plusAssign(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f96813b + elements.f96813b;
        Object[] objArr = this.f96812a;
        if (objArr.length < i10) {
            resizeStorage(i10, objArr);
        }
        uu.f0.copyInto(elements.f96812a, this.f96812a, this.f96813b, 0, elements.f96813b);
        this.f96813b += elements.f96813b;
    }

    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        for (Object obj : elements) {
            remove(obj);
        }
        return i10 != this.f96813b;
    }

    public final Object removeAt(int i10) {
        if (i10 < 0 || i10 >= this.f96813b) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        Object[] objArr = this.f96812a;
        Object obj = objArr[i10];
        int i11 = this.f96813b;
        if (i10 != i11 - 1) {
            uu.f0.copyInto(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f96813b - 1;
        this.f96813b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void removeIf(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = this.f96813b;
        Object[] objArr = this.f96812a;
        int i11 = 0;
        qv.m mVarUntil = qv.v.until(0, i10);
        int first = mVarUntil.getFirst();
        int last = mVarUntil.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i11] = objArr[first];
                if (((Boolean) predicate.invoke(objArr[first])).booleanValue()) {
                    i11++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        uu.f0.fill(objArr, (Object) null, i10 - i11, i10);
        this.f96813b -= i11;
    }

    public final void removeRange(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f96813b) || i11 < 0 || i11 > i12) {
            StringBuilder sbF = w0.i.f(i10, i11, "Start (", ") and end (", ") must be in 0..");
            sbF.append(this.f96813b);
            a0.d.throwIndexOutOfBoundsException(sbF.toString());
        }
        if (i11 < i10) {
            a0.d.throwIllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            int i13 = this.f96813b;
            if (i11 < i13) {
                Object[] objArr = this.f96812a;
                uu.f0.copyInto(objArr, objArr, i10, i11, i13);
            }
            int i14 = this.f96813b;
            int i15 = i14 - (i11 - i10);
            uu.f0.fill(this.f96812a, (Object) null, i15, i14);
            this.f96813b = i15;
        }
    }

    public final void resizeStorage(int i10, Object[] oldContent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oldContent, "oldContent");
        int length = oldContent.length;
        this.f96812a = uu.f0.copyInto(oldContent, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean retainAll(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        Object[] objArr = this.f96812a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (uu.k0.indexOf(elements, objArr[i11]) < 0) {
                removeAt(i11);
            }
        }
        return i10 != this.f96813b;
    }

    public final Object set(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f96813b) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        Object[] objArr = this.f96812a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this.f96813b);
        Object[] objArr = this.f96812a;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96812a = objArrCopyOf;
        }
    }

    public t0(int i10) {
        super(i10, null);
    }

    public final void minusAssign(List<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            remove(elements.get(i10));
        }
    }

    public /* synthetic */ t0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void minusAssign(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (Object obj : elements) {
            remove(obj);
        }
    }

    public final boolean removeAll(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        minusAssign(elements);
        return i10 != this.f96813b;
    }

    public final void add(int i10, Object obj) {
        if (i10 < 0 || i10 > this.f96813b) {
            a(i10);
        }
        int i11 = this.f96813b + 1;
        Object[] objArr = this.f96812a;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
        Object[] objArr2 = this.f96812a;
        int i12 = this.f96813b;
        if (i10 != i12) {
            uu.f0.copyInto(objArr2, objArr2, i10 + 1, i10, i12);
        }
        objArr2[i10] = obj;
        this.f96813b++;
    }

    public final void minusAssign(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96812a;
        int i10 = elements.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    public final boolean retainAll(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        Object[] objArr = this.f96812a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this.f96813b;
    }

    public final boolean removeAll(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        minusAssign(elements);
        return i10 != this.f96813b;
    }

    public final void minusAssign(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96888b;
        long[] jArr = elements.f96887a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean removeAll(List<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        minusAssign(elements);
        return i10 != this.f96813b;
    }

    public final void plusAssign(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int size = elements.getSize() + this.f96813b;
        Object[] objArr = this.f96812a;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = elements.f96888b;
        long[] jArr = elements.f96887a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        add(objArr2[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean retainAll(Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        Object[] objArr = this.f96812a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this.f96813b;
    }

    public final boolean addAll(int i10, Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96813b) {
            a(i10);
        }
        int i11 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size() + this.f96813b;
        Object[] objArr = this.f96812a;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.f96812a;
        if (i10 != this.f96813b) {
            uu.f0.copyInto(objArr2, objArr2, elements.size() + i10, i10, this.f96813b);
        }
        for (Object obj : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                uu.p0.throwIndexOverflow();
            }
            objArr2[i11 + i10] = obj;
            i11 = i12;
        }
        this.f96813b = elements.size() + this.f96813b;
        return true;
    }

    public final boolean removeAll(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        minusAssign(elements);
        return i10 != this.f96813b;
    }

    public final void minusAssign(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean removeAll(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        minusAssign(elements);
        return i10 != this.f96813b;
    }

    public final void minusAssign(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        Object[] objArr = this.f96812a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!uu.y0.contains(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this.f96813b;
    }

    public final void plusAssign(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        int length = this.f96813b + elements.length;
        Object[] objArr = this.f96812a;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        uu.f0.copyInto$default(elements, this.f96812a, this.f96813b, 0, 0, 12, (Object) null);
        this.f96813b += elements.length;
    }

    public final boolean retainAll(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        Object[] objArr = this.f96812a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!rv.f0.contains(elements, objArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this.f96813b;
    }

    public final boolean addAll(int i10, f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f96813b) {
            a(i10);
        }
        if (elements.isEmpty()) {
            return false;
        }
        int i11 = this.f96813b + elements.f96813b;
        Object[] objArr = this.f96812a;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
        Object[] objArr2 = this.f96812a;
        int i12 = this.f96813b;
        if (i10 != i12) {
            uu.f0.copyInto(objArr2, objArr2, elements.f96813b + i10, i10, i12);
        }
        uu.f0.copyInto(elements.f96812a, objArr2, i10, 0, elements.f96813b);
        this.f96813b += elements.f96813b;
        return true;
    }

    public final void plusAssign(List<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f96813b;
        int size = elements.size() + i10;
        Object[] objArr = this.f96812a;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.f96812a;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this.f96813b = elements.size() + this.f96813b;
    }

    public final void plusAssign(Object obj) {
        add(obj);
    }

    public final void plusAssign(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        plusAssign(elements);
        return i10 != this.f96813b;
    }

    public final boolean addAll(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        plusAssign(elements);
        return i10 != this.f96813b;
    }

    public final boolean addAll(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        plusAssign(elements);
        return i10 != this.f96813b;
    }

    public final boolean addAll(List<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        plusAssign(elements);
        return i10 != this.f96813b;
    }

    public final boolean addAll(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        plusAssign(elements);
        return i10 != this.f96813b;
    }

    public final boolean addAll(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96813b;
        plusAssign(elements);
        return i10 != this.f96813b;
    }
}
