package io.bidmachine.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nh.b5;
import nh.m5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f {
    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static m5 bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? m5.of() : m5.copyOf((Map) bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) a1.castNonNull(f.class.getClassLoader()));
        }
    }

    public static <T> b5 fromBundleList(mh.v0 v0Var, List<Bundle> list) {
        x4 x4VarBuilder = b5.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            x4VarBuilder.add(v0Var.apply((Bundle) a.checkNotNull(list.get(i10))));
        }
        return x4VarBuilder.build();
    }

    public static <T> SparseArray<T> fromBundleSparseArray(mh.v0 v0Var, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            parcelableSparseArray.put(sparseArray.keyAt(i10), v0Var.apply(sparseArray.valueAt(i10)));
        }
        return parcelableSparseArray;
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, mh.v0 v0Var) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) v0Var.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> b5 toBundleList(List<T> list, mh.v0 v0Var) {
        x4 x4VarBuilder = b5.builder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            x4VarBuilder.add(v0Var.apply(list.get(i10)));
        }
        return x4VarBuilder.build();
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, mh.v0 v0Var) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), (Bundle) v0Var.apply(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
