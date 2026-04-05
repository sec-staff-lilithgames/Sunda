package nh;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class we implements Comparator {
    public static we allEqual() {
        return o0.f76518b;
    }

    public static we arbitrary() {
        return ue.f76694a;
    }

    public static <T> we explicit(List<T> list) {
        return new e3(list);
    }

    public static <T> we from(Comparator<T> comparator) {
        return comparator instanceof we ? (we) comparator : new k2(comparator);
    }

    public static <C extends Comparable> we natural() {
        return me.f76479e;
    }

    public static we usingToString() {
        return hj.f76338b;
    }

    @Deprecated
    public int binarySearch(List<Object> list, Object obj) {
        return Collections.binarySearch(list, obj, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public <U> we compound(Comparator<? super U> comparator) {
        return new o2(this, (Comparator) mh.p1.checkNotNull(comparator));
    }

    public <E> List<E> greatestOf(Iterable<E> iterable, int i10) {
        return reverse().leastOf(iterable, i10);
    }

    public <E> b5 immutableSortedCopy(Iterable<E> iterable) {
        return b5.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E> List<E> leastOf(Iterable<E> iterable, int i10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i10 * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i10) {
                    array = Arrays.copyOf(array, i10);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i10);
    }

    public <S> we lexicographical() {
        return new a8(this);
    }

    public <E> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <S> we nullsFirst() {
        return new ne(this);
    }

    public <S> we nullsLast() {
        return new oe(this);
    }

    public <F> we onResultOf(mh.v0 v0Var) {
        return new s0(v0Var, this);
    }

    public <S> we reverse() {
        return new rf(this);
    }

    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : p8.newArrayList(iterable.iterator())).toArray();
        Arrays.sort(array, this);
        return new ArrayList(Arrays.asList(array));
    }

    public static <T> we compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new o2(iterable);
    }

    public static <T> we explicit(T t10, T... tArr) {
        return explicit(p8.asList(t10, tArr));
    }

    public <E> List<E> greatestOf(Iterator<E> it, int i10) {
        return reverse().leastOf(it, i10);
    }

    @Deprecated
    public static <T> we from(we weVar) {
        return (we) mh.p1.checkNotNull(weVar);
    }

    public <E> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    public <E> E max(E e10, E e11) {
        return compare(e10, e11) >= 0 ? e10 : e11;
    }

    public <E> E min(E e10, E e11) {
        return compare(e10, e11) <= 0 ? e10 : e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E max(E e10, E e11, E e12, E... eArr) {
        E e13 = (E) max(max(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) max(e13, e14);
        }
        return e13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E min(E e10, E e11, E e12, E... eArr) {
        E e13 = (E) min(min(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) min(e13, e14);
        }
        return e13;
    }

    public <E> List<E> leastOf(Iterator<E> it, int i10) {
        mh.p1.checkNotNull(it);
        jh.i.o(i10, CampaignEx.JSON_KEY_AD_K);
        if (i10 == 0 || !it.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (i10 >= 1073741823) {
            ArrayList arrayListNewArrayList = p8.newArrayList(it);
            Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > i10) {
                arrayListNewArrayList.subList(i10, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return Collections.unmodifiableList(arrayListNewArrayList);
        }
        ui uiVarLeast = ui.least(i10, this);
        uiVarLeast.offerAll(it);
        return (List<E>) uiVarLeast.topK();
    }
}
