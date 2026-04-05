package vu;

import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    public static final boolean access$subarrayContentEquals(Object[] objArr, int i10, int i11, List list) {
        if (i11 == list.size()) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (e0.areEqual(objArr[i10 + i12], list.get(i12))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final int access$subarrayContentHashCode(Object[] objArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String access$subarrayContentToString(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append(C3191e4.i.f36529d);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append(C3191e4.i.f36531e);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <E> E[] arrayOfUninitializedElements(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i10) {
        e0.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        e0.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i10) {
        e0.checkNotNullParameter(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i10, int i11) {
        e0.checkNotNullParameter(eArr, "<this>");
        while (i10 < i11) {
            resetAt(eArr, i10);
            i10++;
        }
    }
}
