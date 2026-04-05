package r0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import kv.l;
import kv.p;
import kv.q;
import qv.m;
import qv.v;
import tu.k;
import uu.f0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public Object[] f83647b;

    /* renamed from: c, reason: collision with root package name */
    public a f83648c;

    /* renamed from: e, reason: collision with root package name */
    public int f83649e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements List, lv.d {

        /* renamed from: b, reason: collision with root package name */
        public final c f83650b;

        public a(c cVar) {
            this.f83650b = cVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f83650b.add(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<Object> collection) {
            return this.f83650b.addAll(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f83650b.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f83650b.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f83650b.containsAll(collection);
        }

        @Override // java.util.List
        public Object get(int i10) {
            d.checkIndex(this, i10);
            return this.f83650b.f83647b[i10];
        }

        public int getSize() {
            return this.f83650b.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f83650b.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f83650b.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new C0774c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f83650b.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            return new C0774c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.f83650b.removeAll(collection);
        }

        public Object removeAt(int i10) {
            d.checkIndex(this, i10);
            return this.f83650b.removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.f83650b.retainAll(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            d.checkIndex(this, i10);
            return this.f83650b.set(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<Object> subList(int i10, int i11) {
            d.checkSubIndex(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return t.toArray(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f83650b.add(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            return this.f83650b.addAll(collection);
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i10) {
            return new C0774c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f83650b.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) t.toArray(this, tArr);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements List, lv.d {

        /* renamed from: b, reason: collision with root package name */
        public final List f83651b;

        /* renamed from: c, reason: collision with root package name */
        public final int f83652c;

        /* renamed from: e, reason: collision with root package name */
        public int f83653e;

        public b(List<Object> list, int i10, int i11) {
            this.f83651b = list;
            this.f83652c = i10;
            this.f83653e = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            int i10 = this.f83653e;
            this.f83653e = i10 + 1;
            this.f83651b.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<Object> collection) {
            this.f83651b.addAll(i10 + this.f83652c, collection);
            int size = collection.size();
            this.f83653e += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f83653e - 1;
            int i11 = this.f83652c;
            if (i11 <= i10) {
                while (true) {
                    this.f83651b.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f83653e = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f83653e;
            for (int i11 = this.f83652c; i11 < i10; i11++) {
                if (e0.areEqual(this.f83651b.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            d.checkIndex(this, i10);
            return this.f83651b.get(i10 + this.f83652c);
        }

        public int getSize() {
            return this.f83653e - this.f83652c;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f83653e;
            int i11 = this.f83652c;
            for (int i12 = i11; i12 < i10; i12++) {
                if (e0.areEqual(this.f83651b.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f83653e == this.f83652c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new C0774c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f83653e - 1;
            int i11 = this.f83652c;
            if (i11 > i10) {
                return -1;
            }
            while (!e0.areEqual(this.f83651b.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            return new C0774c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return removeAt(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i10 = this.f83653e;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f83653e;
        }

        public Object removeAt(int i10) {
            d.checkIndex(this, i10);
            this.f83653e--;
            return this.f83651b.remove(i10 + this.f83652c);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i10 = this.f83653e;
            int i11 = i10 - 1;
            int i12 = this.f83652c;
            if (i12 <= i11) {
                while (true) {
                    List list = this.f83651b;
                    if (!collection.contains(list.get(i11))) {
                        list.remove(i11);
                        this.f83653e--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f83653e;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            d.checkIndex(this, i10);
            return this.f83651b.set(i10 + this.f83652c, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<Object> subList(int i10, int i11) {
            d.checkSubIndex(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return t.toArray(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f83651b.add(i10 + this.f83652c, obj);
            this.f83653e++;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i10) {
            return new C0774c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f83653e;
            for (int i11 = this.f83652c; i11 < i10; i11++) {
                List list = this.f83651b;
                if (e0.areEqual(list.get(i11), obj)) {
                    list.remove(i11);
                    this.f83653e--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) t.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            this.f83651b.addAll(this.f83653e, collection);
            int size = collection.size();
            this.f83653e += size;
            return size > 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: r0.c$c, reason: collision with other inner class name */
    public static final class C0774c implements ListIterator, lv.e {

        /* renamed from: b, reason: collision with root package name */
        public final List f83654b;

        /* renamed from: c, reason: collision with root package name */
        public int f83655c;

        public C0774c(List<Object> list, int i10) {
            this.f83654b = list;
            this.f83655c = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f83654b.add(this.f83655c, obj);
            this.f83655c++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f83655c < this.f83654b.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f83655c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i10 = this.f83655c;
            this.f83655c = i10 + 1;
            return this.f83654b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f83655c;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f83655c - 1;
            this.f83655c = i10;
            return this.f83654b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f83655c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f83655c - 1;
            this.f83655c = i10;
            this.f83654b.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f83654b.set(this.f83655c, obj);
        }
    }

    public c(Object[] objArr, int i10) {
        this.f83647b = objArr;
        this.f83649e = i10;
    }

    public final boolean add(Object obj) {
        int i10 = this.f83649e + 1;
        if (this.f83647b.length < i10) {
            resizeStorage(i10);
        }
        Object[] objArr = this.f83647b;
        int i11 = this.f83649e;
        objArr[i11] = obj;
        this.f83649e = i11 + 1;
        return true;
    }

    public final boolean addAll(int i10, List<Object> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i11 = this.f83649e + size;
        if (this.f83647b.length < i11) {
            resizeStorage(i11);
        }
        Object[] objArr = this.f83647b;
        int i12 = this.f83649e;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f83649e += size;
        return true;
    }

    public final boolean any(l lVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) lVar.invoke(objArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<Object> asMutableList() {
        a aVar = this.f83648c;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f83648c = aVar2;
        return aVar2;
    }

    public final void clear() {
        Object[] objArr = this.f83647b;
        int i10 = this.f83649e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f83649e = 0;
    }

    public final boolean contains(Object obj) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; !e0.areEqual(this.f83647b[i10], obj); i10++) {
                if (i10 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(c cVar) {
        if (cVar.f83649e != this.f83649e) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; e0.areEqual(cVar.f83647b[i10], this.f83647b[i10]); i10++) {
                if (i10 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i10) {
        if (this.f83647b.length < i10) {
            resizeStorage(i10);
        }
    }

    public final Object first(l lVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new k();
    }

    public final Object firstOrNull(l lVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        return null;
    }

    public final <R> R fold(R r10, p pVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) pVar.invoke(r10, objArr[i10]);
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, q qVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) qVar.invoke(Integer.valueOf(i10), r10, objArr[i10]);
        }
        return r10;
    }

    public final <R> R foldRight(R r10, p pVar) {
        int size = getSize() - 1;
        Object[] objArr = this.f83647b;
        if (size >= objArr.length) {
            return r10;
        }
        while (size >= 0) {
            r10 = (R) pVar.invoke(objArr[size], r10);
            size--;
        }
        return r10;
    }

    public final <R> R foldRightIndexed(R r10, q qVar) {
        int size = getSize() - 1;
        Object[] objArr = this.f83647b;
        if (size >= objArr.length) {
            return r10;
        }
        while (size >= 0) {
            r10 = (R) qVar.invoke(Integer.valueOf(size), objArr[size], r10);
            size--;
        }
        return r10;
    }

    public final void forEach(l lVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(objArr[i10]);
        }
    }

    public final void forEachIndexed(p pVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(i10), objArr[i10]);
        }
    }

    public final void forEachReversed(l lVar) {
        int size = getSize() - 1;
        Object[] objArr = this.f83647b;
        if (size >= objArr.length) {
            return;
        }
        while (size >= 0) {
            lVar.invoke(objArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(p pVar) {
        int size = getSize() - 1;
        Object[] objArr = this.f83647b;
        if (size >= objArr.length) {
            return;
        }
        while (size >= 0) {
            pVar.invoke(Integer.valueOf(size), objArr[size]);
            size--;
        }
    }

    public final Object get(int i10) {
        return this.f83647b[i10];
    }

    public final Object[] getContent() {
        return this.f83647b;
    }

    public final m getIndices() {
        return v.until(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.f83649e;
    }

    public final int indexOf(Object obj) {
        Object[] objArr = this.f83647b;
        int i10 = this.f83649e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (e0.areEqual(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(l lVar) {
        Object[] objArr = this.f83647b;
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) lVar.invoke(objArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public final int indexOfLast(l lVar) {
        int size = getSize() - 1;
        Object[] objArr = this.f83647b;
        if (size >= objArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (((Boolean) lVar.invoke(objArr[size])).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final Object last(l lVar) {
        Object[] objArr = this.f83647b;
        for (int size = getSize() - 1; size >= 0; size--) {
            Object obj = objArr[size];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new k();
    }

    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f83647b;
        for (int i10 = this.f83649e - 1; i10 >= 0; i10--) {
            if (e0.areEqual(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final Object lastOrNull(l lVar) {
        Object[] objArr = this.f83647b;
        for (int size = getSize() - 1; size >= 0; size--) {
            Object obj = objArr[size];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(l lVar) {
        int size = getSize();
        e0.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = lVar.invoke(this.f83647b[i10]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(p pVar) {
        int size = getSize();
        e0.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            rArr[i10] = pVar.invoke(Integer.valueOf(i10), this.f83647b[i10]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> c mapIndexedNotNull(p pVar) {
        int size = getSize();
        e0.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        Object[] objArr2 = this.f83647b;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object objInvoke = pVar.invoke(Integer.valueOf(i11), objArr2[i11]);
            if (objInvoke != null) {
                objArr[i10] = objInvoke;
                i10++;
            }
        }
        return new c(objArr, i10);
    }

    public final /* synthetic */ <R> c mapNotNull(l lVar) {
        int size = getSize();
        e0.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        Object[] objArr2 = this.f83647b;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object objInvoke = lVar.invoke(objArr2[i11]);
            if (objInvoke != null) {
                objArr[i10] = objInvoke;
                i10++;
            }
        }
        return new c(objArr, i10);
    }

    public final void minusAssign(Object obj) {
        remove(obj);
    }

    public final void plusAssign(Object obj) {
        add(obj);
    }

    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(List<Object> list) {
        int i10 = this.f83649e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            remove(list.get(i11));
        }
        return i10 != this.f83649e;
    }

    public final Object removeAt(int i10) {
        Object[] objArr = this.f83647b;
        Object obj = objArr[i10];
        if (i10 != getSize() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(objArr, i11, objArr, i10, this.f83649e - i11);
        }
        int i12 = this.f83649e - 1;
        this.f83649e = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void removeIf(l lVar) {
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((Boolean) lVar.invoke(this.f83647b[i11])).booleanValue()) {
                i10++;
            } else if (i10 > 0) {
                Object[] objArr = this.f83647b;
                objArr[i11 - i10] = objArr[i11];
            }
        }
        int i12 = size - i10;
        f0.fill(this.f83647b, (Object) null, i12, size);
        setSize(i12);
    }

    public final void removeRange(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f83649e;
            if (i11 < i12) {
                Object[] objArr = this.f83647b;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f83649e - (i11 - i10);
            int size = getSize() - 1;
            if (i13 <= size) {
                int i14 = i13;
                while (true) {
                    this.f83647b[i14] = null;
                    if (i14 == size) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f83649e = i13;
        }
    }

    public final void resizeStorage(int i10) {
        Object[] objArr = this.f83647b;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f83647b = objArr2;
    }

    public final boolean retainAll(Collection<Object> collection) {
        int i10 = this.f83649e;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(this.f83647b[size])) {
                removeAt(size);
            }
        }
        return i10 != this.f83649e;
    }

    public final boolean reversedAny(l lVar) {
        Object[] objArr = this.f83647b;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (((Boolean) lVar.invoke(objArr[size])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final Object set(int i10, Object obj) {
        Object[] objArr = this.f83647b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void setSize(int i10) {
        this.f83649e = i10;
    }

    public final void sortWith(Comparator<Object> comparator) {
        f0.sortWith(this.f83647b, comparator, 0, this.f83649e);
    }

    public final int sumBy(l lVar) {
        Object[] objArr = this.f83647b;
        int iIntValue = 0;
        for (int i10 = 0; i10 < getSize(); i10++) {
            iIntValue += ((Number) lVar.invoke(objArr[i10])).intValue();
        }
        return iIntValue;
    }

    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new k();
    }

    public final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public final boolean containsAll(Collection<Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.f83647b[0];
    }

    public final Object lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.f83647b[getSize() - 1];
    }

    public final boolean removeAll(c cVar) {
        int i10 = this.f83649e;
        int size = cVar.getSize() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                remove(cVar.f83647b[i11]);
                if (i11 == size) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.f83649e;
    }

    public final void add(int i10, Object obj) {
        int i11 = this.f83649e + 1;
        if (this.f83647b.length < i11) {
            resizeStorage(i11);
        }
        Object[] objArr = this.f83647b;
        int i12 = this.f83649e;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f83649e++;
    }

    public final boolean containsAll(c cVar) {
        m mVarUntil = v.until(0, cVar.getSize());
        int first = mVarUntil.getFirst();
        int last = mVarUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(cVar.f83647b[first])) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final Object first() {
        if (getSize() != 0) {
            return this.f83647b[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new k();
    }

    public final Object last() {
        if (getSize() != 0) {
            return this.f83647b[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new k();
    }

    public final boolean removeAll(Collection<Object> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f83649e;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f83649e;
    }

    public final boolean addAll(int i10, c cVar) {
        int i11 = cVar.f83649e;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f83649e + i11;
        if (this.f83647b.length < i12) {
            resizeStorage(i12);
        }
        Object[] objArr = this.f83647b;
        int i13 = this.f83649e;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(cVar.f83647b, 0, objArr, i10, i11);
        this.f83649e += i11;
        return true;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean addAll(List<Object> list) {
        return addAll(getSize(), list);
    }

    public final boolean addAll(c cVar) {
        return addAll(getSize(), cVar);
    }

    public final boolean addAll(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return false;
        }
        int i10 = this.f83649e + length;
        if (this.f83647b.length < i10) {
            resizeStorage(i10);
        }
        System.arraycopy(objArr, 0, this.f83647b, this.f83649e, length);
        this.f83649e += length;
        return true;
    }

    public final boolean addAll(int i10, Collection<Object> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f83649e + size;
        if (this.f83647b.length < i12) {
            resizeStorage(i12);
        }
        Object[] objArr = this.f83647b;
        int i13 = this.f83649e;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                p0.throwIndexOverflow();
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f83649e += size;
        return true;
    }

    public final boolean addAll(Collection<Object> collection) {
        return addAll(this.f83649e, collection);
    }
}
