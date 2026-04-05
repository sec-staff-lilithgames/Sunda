package io.odeeo.internal.u0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m2 {
    public static <T> T[] a(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        a((Iterable<?>) collection, (Object[]) tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] newArray(Class<T> cls, int i10) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
    }

    public static <T> T[] newArray(T[] tArr, int i10) {
        return (T[]) r2.a(tArr, i10);
    }

    public static <T> T[] concat(T t10, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t10;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        io.odeeo.internal.t0.u.checkPositionIndexes(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = (T[]) newArray(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }

    public static <T> T[] concat(T[] tArr, T t10) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t10;
        return tArr2;
    }

    public static Object[] a(Collection<?> collection) {
        return a((Iterable<?>) collection, new Object[collection.size()]);
    }

    public static Object[] a(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public static Object[] a(Object... objArr) {
        return a(objArr, objArr.length);
    }

    public static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.b.e(i10, "at index "));
    }
}
