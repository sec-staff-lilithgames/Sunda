package uu;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v {
    public static final <T> T[] arrayOfNulls(T[] reference, int i10) throws NegativeArraySizeException {
        kotlin.jvm.internal.e0.checkNotNullParameter(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    public static <T> int contentDeepHashCode(T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    public static final void copyOfRangeToIndexCheck(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(o2.i(i10, i11, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.e0.reifiedOperationMarker(0, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T[]) new Object[0];
    }

    public static final /* synthetic */ <T> T[] toTypedArray(Collection<? extends T> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.reifiedOperationMarker(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
