package z;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements Collection, Set, lv.b, lv.h {

    /* renamed from: b, reason: collision with root package name */
    public int[] f96814b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f96815c;

    /* renamed from: e, reason: collision with root package name */
    public int f96816e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends m {
        public a() {
            super(g.this.get_size$collection());
        }

        @Override // z.m
        public final Object a(int i10) {
            return g.this.valueAt(i10);
        }

        @Override // z.m
        public final void b(int i10) {
            g.this.removeAt(i10);
        }
    }

    public g() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iIndexOf;
        int i11 = get_size$collection();
        if (obj == null) {
            iIndexOf = h.indexOfNull(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iIndexOf = h.indexOf(this, obj, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i12 = ~iIndexOf;
        if (i11 >= getHashes$collection().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            h.allocArrays(this, i13);
            if (i11 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes$collection().length == 0)) {
                uu.f0.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, (Object) null);
                uu.f0.copyInto$default(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, (Object) null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            uu.f0.copyInto(getHashes$collection(), getHashes$collection(), i14, i12, i11);
            uu.f0.copyInto(getArray$collection(), getArray$collection(), i14, i12, i11);
        }
        if (i11 != get_size$collection() || i12 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i12] = i10;
        getArray$collection()[i12] = obj;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(g array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i10);
        if (get_size$collection() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(array.valueAt(i11));
            }
            return;
        }
        if (i10 > 0) {
            uu.f0.copyInto$default(array.getHashes$collection(), getHashes$collection(), 0, 0, i10, 6, (Object) null);
            uu.f0.copyInto$default(array.getArray$collection(), getArray$collection(), 0, 0, i10, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(a0.a.f3382a);
            setArray$collection(a0.a.f3384c);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i10) {
        int i11 = get_size$collection();
        if (getHashes$collection().length < i10) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            h.allocArrays(this, i10);
            if (get_size$collection() > 0) {
                uu.f0.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, (Object) null);
                uu.f0.copyInto$default(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = get_size$collection();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(valueAt(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object[] getArray$collection() {
        return this.f96815c;
    }

    public final int[] getHashes$collection() {
        return this.f96814b;
    }

    public int getSize() {
        return this.f96816e;
    }

    public final int get_size$collection() {
        return this.f96816e;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i10 = get_size$collection();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += hashes$collection[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? h.indexOfNull(this) : h.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(g array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        int i11 = get_size$collection();
        for (int i12 = 0; i12 < i10; i12++) {
            remove(array.valueAt(i12));
        }
        return i11 != get_size$collection();
    }

    public final Object removeAt(int i10) {
        int i11;
        Object[] objArr;
        int i12 = get_size$collection();
        Object obj = getArray$collection()[i10];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                uu.f0.copyInto(getHashes$collection(), getHashes$collection(), i10, i14, i12);
                uu.f0.copyInto(getArray$collection(), getArray$collection(), i10, i14, i12);
            }
            getArray$collection()[i13] = null;
        } else {
            int i15 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            h.allocArrays(this, i15);
            if (i10 > 0) {
                uu.f0.copyInto$default(hashes$collection, getHashes$collection(), 0, 0, i10, 6, (Object) null);
                objArr = array$collection;
                uu.f0.copyInto$default(objArr, getArray$collection(), 0, 0, i10, 6, (Object) null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = array$collection;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                uu.f0.copyInto(hashes$collection, getHashes$collection(), i11, i16, i12);
                uu.f0.copyInto(objArr, getArray$collection(), i11, i16, i12);
            }
        }
        if (i12 != get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        set_size$collection(i13);
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int i10 = get_size$collection() - 1; -1 < i10; i10--) {
            if (!uu.y0.contains(elements, getArray$collection()[i10])) {
                removeAt(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void setArray$collection(Object[] objArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objArr, "<set-?>");
        this.f96815c = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<set-?>");
        this.f96814b = iArr;
    }

    public final void set_size$collection(int i10) {
        this.f96816e = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return uu.f0.copyOfRange(this.f96815c, 0, this.f96816e);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = get_size$collection();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objValueAt = valueAt(i11);
            if (objValueAt != this) {
                sb2.append(objValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final Object valueAt(int i10) {
        return getArray$collection()[i10];
    }

    public g(int i10) {
        this.f96814b = a0.a.f3382a;
        this.f96815c = a0.a.f3384c;
        if (i10 > 0) {
            h.allocArrays(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int i10 = this.f96816e;
        if (array.length < i10) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), i10));
        } else if (array.length > i10) {
            array[i10] = null;
        }
        uu.f0.copyInto(this.f96815c, array, 0, 0, this.f96816e);
        kotlin.jvm.internal.e0.checkNotNull(array);
        return array;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ g(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public g(g gVar) {
        this(0);
        if (gVar != null) {
            addAll(gVar);
        }
    }

    public g(Collection<Object> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        ensureCapacity(elements.size() + get_size$collection());
        Iterator<Object> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public g(Object[] objArr) {
        this(0);
        if (objArr != null) {
            Iterator it = kotlin.jvm.internal.i.iterator(objArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }
}
