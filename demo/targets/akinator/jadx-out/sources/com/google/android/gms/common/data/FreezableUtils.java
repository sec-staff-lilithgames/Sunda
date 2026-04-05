package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import vw.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        j0 j0Var = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0Var.add(arrayList.get(i10).freeze());
        }
        return j0Var;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        j0 j0Var = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            j0Var.add(it.next().freeze());
        }
        return j0Var;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        j0 j0Var = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            j0Var.add(e10.freeze());
        }
        return j0Var;
    }
}
