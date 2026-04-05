package nh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p8 {
    public static <E> List<E> asList(E e10, E[] eArr) {
        return new e8(e10, eArr);
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        int i10 = u0.f76674e;
        x4 x4Var = new x4(list.size());
        Iterator<? extends List<? extends B>> it = list.iterator();
        while (it.hasNext()) {
            b5 b5VarCopyOf = b5.copyOf((Collection) it.next());
            if (b5VarCopyOf.isEmpty()) {
                return b5.of();
            }
            x4Var.add((Object) b5VarCopyOf);
        }
        return new u0(x4Var.build());
    }

    public static b5 charactersOf(String str) {
        return new k8((String) mh.p1.checkNotNull(str));
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i10) {
        jh.i.o(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i10) {
        jh.i.o(i10, "arraySize");
        return new ArrayList<>(rh.w.saturatedCast(i10 + 5 + (i10 / 10)));
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i10) {
        mh.p1.checkNotNull(list);
        mh.p1.checkArgument(i10 > 0);
        return list instanceof RandomAccess ? new g8(list, i10) : new f8(list, i10);
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof b5 ? ((b5) list).reverse() : list instanceof j8 ? ((j8) list).f76392b : list instanceof RandomAccess ? new h8(list) : new j8(list);
    }

    public static <F, T> List<T> transform(List<F> list, mh.v0 v0Var) {
        return list instanceof RandomAccess ? new m8(list, v0Var) : new n8(list, v0Var);
    }

    public static <E> List<E> asList(E e10, E e11, E[] eArr) {
        return new o8(e10, e11, eArr);
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new d8((CharSequence) mh.p1.checkNotNull(charSequence));
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        mh.p1.checkNotNull(eArr);
        int length = eArr.length;
        jh.i.o(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(rh.w.saturatedCast(length + 5 + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedList = new LinkedList<>();
        i7.addAll(linkedList, iterable);
        return linkedList;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        mh.p1.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        z7.addAll(arrayList, it);
        return arrayList;
    }
}
