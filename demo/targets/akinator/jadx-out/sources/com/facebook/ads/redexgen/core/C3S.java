package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3S {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> SparseArray<T> A00(C1R<T> c1r, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            parcelableSparseArray.put(sparseArray.keyAt(i10), c1r.A6X(sparseArray.valueAt(i10)));
        }
        return parcelableSparseArray;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> AbstractC1081Am<T> A01(C1R<T> c1r, List<Bundle> list) {
        C08571h c08571hA01 = AbstractC1081Am.A01();
        int i10 = 0;
        while (true) {
            int size = list.size();
            int i11 = A00[2].length();
            if (i11 == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i10 < size) {
                c08571hA01.A04(c1r.A6X((Bundle) C3M.A01(list.get(i10))));
                i10++;
            } else {
                return c08571hA01.A05();
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC09264a.A0f(C3S.class.getClassLoader()));
        }
    }
}
