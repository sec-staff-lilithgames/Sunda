package com.google.android.gms.common.util;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w0.i;
import z.f;
import z.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> mapOf(K k10, V v10, K k11, V v11, K k12, V v12) {
        Map mapZza = zza(3, false);
        mapZza.put(k10, v10);
        mapZza.put(k11, v11);
        mapZza.put(k12, v12);
        return Collections.unmodifiableMap(mapZza);
    }

    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException(i.a(length, length2, "Key and values array lengths not equal: ", " != "));
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i10 = 0; i10 < kArr.length; i10++) {
            mapZza.put(kArr[i10], vArr[i10]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    public static <T> Set<T> mutableSetOfWithSize(int i10) {
        return i10 == 0 ? new g() : zzb(i10, true);
    }

    @Deprecated
    public static <T> Set<T> setOf(T t10, T t11, T t12) {
        Set setZzb = zzb(3, false);
        setZzb.add(t10);
        setZzb.add(t11);
        setZzb.add(t12);
        return Collections.unmodifiableSet(setZzb);
    }

    private static Map zza(int i10, boolean z10) {
        return i10 <= 256 ? new f(i10) : new HashMap(i10, 1.0f);
    }

    private static Set zzb(int i10, boolean z10) {
        if (i10 <= (true != z10 ? NotificationCompat.FLAG_LOCAL_ONLY : 128)) {
            return new g(i10);
        }
        return new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }

    @Deprecated
    public static <T> List<T> listOf(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    public static <K, V> Map<K, V> mapOf(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        Map mapZza = zza(6, false);
        mapZza.put(k10, v10);
        mapZza.put(k11, v11);
        mapZza.put(k12, v12);
        mapZza.put(k13, v13);
        mapZza.put(k14, v14);
        mapZza.put(k15, v15);
        return Collections.unmodifiableMap(mapZza);
    }

    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t10 = tArr[0];
            T t11 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t10);
            setZzb.add(t11);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t12 = tArr[0];
        T t13 = tArr[1];
        T t14 = tArr[2];
        T t15 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t12);
        setZzb3.add(t13);
        setZzb3.add(t14);
        setZzb3.add(t15);
        return Collections.unmodifiableSet(setZzb3);
    }
}
