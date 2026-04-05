package nh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ch {
    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e10, bh bhVar, vg vgVar) {
        mh.p1.checkNotNull(e10);
        return binarySearch(list, e10, we.natural(), bhVar, vgVar);
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, mh.v0 v0Var, K k10, bh bhVar, vg vgVar) {
        mh.p1.checkNotNull(k10);
        return binarySearch(list, v0Var, k10, we.natural(), bhVar, vgVar);
    }

    public static <E, K> int binarySearch(List<E> list, mh.v0 v0Var, K k10, Comparator<? super K> comparator, bh bhVar, vg vgVar) {
        return binarySearch((List<? extends K>) p8.transform(list, v0Var), k10, comparator, bhVar, vgVar);
    }

    public static <E> int binarySearch(List<? extends E> list, E e10, Comparator<? super E> comparator, bh bhVar, vg vgVar) {
        mh.p1.checkNotNull(comparator);
        mh.p1.checkNotNull(list);
        mh.p1.checkNotNull(bhVar);
        mh.p1.checkNotNull(vgVar);
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iCompare = comparator.compare(e10, list.get(i11));
            if (iCompare < 0) {
                size = i11 - 1;
            } else {
                if (iCompare <= 0) {
                    return bhVar.resultIndex(comparator, e10, list.subList(i10, size + 1), i11 - i10) + i10;
                }
                i10 = i11 + 1;
            }
        }
        return vgVar.resultIndex(i10);
    }
}
