package io.odeeo.internal.q0;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import io.odeeo.internal.b.g;
import io.odeeo.internal.u0.h1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {
    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) g0.castNonNull(c.class.getClassLoader()));
        }
    }

    public static <T extends io.odeeo.internal.b.g> h1<T> fromBundleList(g.a<T> aVar, List<Bundle> list) {
        h1.a aVarBuilder = h1.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarBuilder.add((h1.a) aVar.mo3834fromBundle((Bundle) a.checkNotNull(list.get(i10))));
        }
        return aVarBuilder.build();
    }

    public static <T extends io.odeeo.internal.b.g> List<T> fromBundleNullableList(g.a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : fromBundleList(aVar, list);
    }

    public static <T extends io.odeeo.internal.b.g> SparseArray<T> fromBundleNullableSparseArray(g.a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            parcelableSparseArray.put(sparseArray.keyAt(i10), aVar.mo3834fromBundle(sparseArray.valueAt(i10)));
        }
        return parcelableSparseArray;
    }

    public static <T extends io.odeeo.internal.b.g> T fromNullableBundle(g.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) aVar.mo3834fromBundle(bundle);
    }

    public static <T extends io.odeeo.internal.b.g> ArrayList<Bundle> toBundleArrayList(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends io.odeeo.internal.b.g> h1<Bundle> toBundleList(List<T> list) {
        h1.a aVarBuilder = h1.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarBuilder.add((h1.a) list.get(i10).toBundle());
        }
        return aVarBuilder.build();
    }

    public static <T extends io.odeeo.internal.b.g> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10).toBundle());
        }
        return sparseArray2;
    }

    public static Bundle toNullableBundle(io.odeeo.internal.b.g gVar) {
        if (gVar == null) {
            return null;
        }
        return gVar.toBundle();
    }

    public static <T extends io.odeeo.internal.b.g> T fromNullableBundle(g.a<T> aVar, Bundle bundle, T t10) {
        return bundle == null ? t10 : (T) aVar.mo3834fromBundle(bundle);
    }
}
