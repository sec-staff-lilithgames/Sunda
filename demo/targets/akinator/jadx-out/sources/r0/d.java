package r0;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.l;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ <T> c MutableVector(int i10) {
        e0.reifiedOperationMarker(0, "T?");
        return new c(new Object[i10], 0);
    }

    public static /* synthetic */ c MutableVector$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        e0.reifiedOperationMarker(0, "T?");
        return new c(new Object[i10], 0);
    }

    private static final void a(int i10, int i11) {
        throw new IndexOutOfBoundsException(o2.i(i10, i11, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void b(int i10) {
        throw new IndexOutOfBoundsException(o2.k(i10, "fromIndex (", ") is less than 0."));
    }

    private static final void c(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    public static final void checkIndex(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            a(i10, size);
        }
    }

    public static final void checkSubIndex(List<?> list, int i10, int i11) {
        if (i10 > i11) {
            d(i10, i11);
        }
        if (i10 < 0) {
            b(i10);
        }
        if (i11 > list.size()) {
            c(i11, list.size());
        }
    }

    private static final void d(int i10, int i11) {
        throw new IllegalArgumentException(o2.i(i10, i11, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final /* synthetic */ <T> c mutableVectorOf(T... tArr) {
        return new c(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> c MutableVector(int i10, l lVar) {
        e0.reifiedOperationMarker(0, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = lVar.invoke(Integer.valueOf(i11));
        }
        return new c(objArr, i10);
    }

    public static final /* synthetic */ <T> c mutableVectorOf() {
        e0.reifiedOperationMarker(0, "T?");
        return new c(new Object[16], 0);
    }
}
