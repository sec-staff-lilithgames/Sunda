package uu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q0 extends p0 {
    public static <T> int collectionSizeOrDefault(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final <T> Integer collectionSizeOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> List<T> flatten(Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> tu.v unzip(Iterable<? extends tu.v> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        int iCollectionSizeOrDefault = collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(iCollectionSizeOrDefault);
        for (tu.v vVar : iterable) {
            arrayList.add(vVar.getFirst());
            arrayList2.add(vVar.getSecond());
        }
        return tu.e0.to(arrayList, arrayList2);
    }
}
