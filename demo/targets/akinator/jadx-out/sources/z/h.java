package z;

import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class h {
    public static final <E> void addAllInternal(g gVar, g array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        gVar.ensureCapacity(gVar.get_size$collection() + i10);
        if (gVar.get_size$collection() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                gVar.add(array.valueAt(i11));
            }
            return;
        }
        if (i10 > 0) {
            uu.f0.copyInto$default(array.getHashes$collection(), gVar.getHashes$collection(), 0, 0, i10, 6, (Object) null);
            uu.f0.copyInto$default(array.getArray$collection(), gVar.getArray$collection(), 0, 0, i10, 6, (Object) null);
            if (gVar.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            gVar.set_size$collection(i10);
        }
    }

    public static final <E> boolean addInternal(g gVar, E e10) {
        int i10;
        int iIndexOf;
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        int i11 = gVar.get_size$collection();
        if (e10 == null) {
            iIndexOf = indexOfNull(gVar);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iIndexOf = indexOf(gVar, e10, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i12 = ~iIndexOf;
        if (i11 >= gVar.getHashes$collection().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] hashes$collection = gVar.getHashes$collection();
            Object[] array$collection = gVar.getArray$collection();
            allocArrays(gVar, i13);
            if (i11 != gVar.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(gVar.getHashes$collection().length == 0)) {
                uu.f0.copyInto$default(hashes$collection, gVar.getHashes$collection(), 0, 0, hashes$collection.length, 6, (Object) null);
                uu.f0.copyInto$default(array$collection, gVar.getArray$collection(), 0, 0, array$collection.length, 6, (Object) null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            uu.f0.copyInto(gVar.getHashes$collection(), gVar.getHashes$collection(), i14, i12, i11);
            uu.f0.copyInto(gVar.getArray$collection(), gVar.getArray$collection(), i14, i12, i11);
        }
        if (i11 != gVar.get_size$collection() || i12 >= gVar.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        gVar.getHashes$collection()[i12] = i10;
        gVar.getArray$collection()[i12] = e10;
        gVar.set_size$collection(gVar.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(g gVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        gVar.setHashes$collection(new int[i10]);
        gVar.setArray$collection(new Object[i10]);
    }

    public static final <T> g arraySetOf() {
        return new g(0, 1, null);
    }

    public static final <E> int binarySearchInternal(g gVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        try {
            return a0.a.binarySearch(gVar.getHashes$collection(), gVar.get_size$collection(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        if (gVar.get_size$collection() != 0) {
            gVar.setHashes$collection(a0.a.f3382a);
            gVar.setArray$collection(a0.a.f3384c);
            gVar.set_size$collection(0);
        }
        if (gVar.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(g gVar, Collection<? extends E> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!gVar.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(g gVar, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return gVar.indexOf(e10) >= 0;
    }

    public static final <E> void ensureCapacityInternal(g gVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        int i11 = gVar.get_size$collection();
        if (gVar.getHashes$collection().length < i10) {
            int[] hashes$collection = gVar.getHashes$collection();
            Object[] array$collection = gVar.getArray$collection();
            allocArrays(gVar, i10);
            if (gVar.get_size$collection() > 0) {
                uu.f0.copyInto$default(hashes$collection, gVar.getHashes$collection(), 0, 0, gVar.get_size$collection(), 6, (Object) null);
                uu.f0.copyInto$default(array$collection, gVar.getArray$collection(), 0, 0, gVar.get_size$collection(), 6, (Object) null);
            }
        }
        if (gVar.get_size$collection() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(g gVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        if (gVar == obj) {
            return true;
        }
        if (!(obj instanceof Set) || gVar.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = gVar.get_size$collection();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(gVar.valueAt(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        int[] hashes$collection = gVar.getHashes$collection();
        int i10 = gVar.get_size$collection();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += hashes$collection[i12];
        }
        return i11;
    }

    public static final <E> int indexOf(g gVar, Object obj, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        int i11 = gVar.get_size$collection();
        if (i11 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(gVar, i10);
        if (iBinarySearchInternal < 0 || kotlin.jvm.internal.e0.areEqual(obj, gVar.getArray$collection()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i12 = iBinarySearchInternal + 1;
        while (i12 < i11 && gVar.getHashes$collection()[i12] == i10) {
            if (kotlin.jvm.internal.e0.areEqual(obj, gVar.getArray$collection()[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iBinarySearchInternal - 1; i13 >= 0 && gVar.getHashes$collection()[i13] == i10; i13--) {
            if (kotlin.jvm.internal.e0.areEqual(obj, gVar.getArray$collection()[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public static final <E> int indexOfInternal(g gVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return obj == null ? indexOfNull(gVar) : indexOf(gVar, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return indexOf(gVar, null, 0);
    }

    public static final <E> boolean isEmptyInternal(g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return gVar.get_size$collection() <= 0;
    }

    public static final <E> boolean removeAllInternal(g gVar, g array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int i10 = array.get_size$collection();
        int i11 = gVar.get_size$collection();
        for (int i12 = 0; i12 < i10; i12++) {
            gVar.remove(array.valueAt(i12));
        }
        return i11 != gVar.get_size$collection();
    }

    public static final <E> E removeAtInternal(g gVar, int i10) {
        int i11;
        Object[] objArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        int i12 = gVar.get_size$collection();
        E e10 = (E) gVar.getArray$collection()[i10];
        if (i12 <= 1) {
            gVar.clear();
            return e10;
        }
        int i13 = i12 - 1;
        if (gVar.getHashes$collection().length <= 8 || gVar.get_size$collection() >= gVar.getHashes$collection().length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                uu.f0.copyInto(gVar.getHashes$collection(), gVar.getHashes$collection(), i10, i14, i12);
                uu.f0.copyInto(gVar.getArray$collection(), gVar.getArray$collection(), i10, i14, i12);
            }
            gVar.getArray$collection()[i13] = null;
        } else {
            int i15 = gVar.get_size$collection() > 8 ? gVar.get_size$collection() + (gVar.get_size$collection() >> 1) : 8;
            int[] hashes$collection = gVar.getHashes$collection();
            Object[] array$collection = gVar.getArray$collection();
            allocArrays(gVar, i15);
            if (i10 > 0) {
                uu.f0.copyInto$default(hashes$collection, gVar.getHashes$collection(), 0, 0, i10, 6, (Object) null);
                objArr = array$collection;
                uu.f0.copyInto$default(objArr, gVar.getArray$collection(), 0, 0, i10, 6, (Object) null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = array$collection;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                uu.f0.copyInto(hashes$collection, gVar.getHashes$collection(), i11, i16, i12);
                uu.f0.copyInto(objArr, gVar.getArray$collection(), i11, i16, i12);
            }
        }
        if (i12 != gVar.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        gVar.set_size$collection(i13);
        return e10;
    }

    public static final <E> boolean removeInternal(g gVar, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        int iIndexOf = gVar.indexOf(e10);
        if (iIndexOf < 0) {
            return false;
        }
        gVar.removeAt(iIndexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(g gVar, Collection<? extends E> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int i10 = gVar.get_size$collection() - 1; -1 < i10; i10--) {
            if (!uu.y0.contains(elements, gVar.getArray$collection()[i10])) {
                gVar.removeAt(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public static final <E> E valueAtInternal(g gVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return (E) gVar.getArray$collection()[i10];
    }

    public static final <T> g arraySetOf(T... values) {
        kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
        g gVar = new g(values.length);
        for (T t10 : values) {
            gVar.add(t10);
        }
        return gVar;
    }

    public static final <E> String toStringInternal(g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, NyKZx.TLD);
        if (gVar.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(gVar.get_size$collection() * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = gVar.get_size$collection();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objValueAt = gVar.valueAt(i11);
            if (objValueAt != gVar) {
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

    public static final <E> boolean removeAllInternal(g gVar, Collection<? extends E> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= gVar.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean addAllInternal(g gVar, Collection<? extends E> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        gVar.ensureCapacity(elements.size() + gVar.get_size$collection());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= gVar.add(it.next());
        }
        return zAdd;
    }
}
