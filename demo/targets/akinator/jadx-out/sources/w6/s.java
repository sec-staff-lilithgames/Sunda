package w6;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f90433a = {13, 15, 14};

    public static final int[] getCapabilitiesCompat(NetworkRequest networkRequest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return q.f90429a.capabilities(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 30; i10++) {
            int i11 = iArr[i10];
            if (o.f90427a.hasCapability$work_runtime_release(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return y0.toIntArray(arrayList);
    }

    public static final int[] getTransportTypesCompat(NetworkRequest networkRequest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return q.f90429a.transportTypes(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = iArr[i10];
            if (o.f90427a.hasTransport$work_runtime_release(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return y0.toIntArray(arrayList);
    }
}
