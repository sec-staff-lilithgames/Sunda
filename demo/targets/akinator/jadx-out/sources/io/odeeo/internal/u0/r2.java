package io.odeeo.internal.u0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r2 {
    public static <K, V> Map<K, V> a(int i10) {
        return t.createWithExpectedSize(i10);
    }

    public static <E> Set<E> b(int i10) {
        return u.createWithExpectedSize(i10);
    }

    public static <K, V> Map<K, V> c(int i10) {
        return v.createWithExpectedSize(i10);
    }

    public static <E> Set<E> d(int i10) {
        return w.createWithExpectedSize(i10);
    }

    public static <E> Set<E> a() {
        return u.create();
    }

    public static <K, V> Map<K, V> b() {
        return t.create();
    }

    public static <T> T[] a(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    public static b2 a(b2 b2Var) {
        return b2Var.weakKeys();
    }
}
