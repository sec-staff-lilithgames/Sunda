package io.ktor.util.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CollectionUtilsKt {
    @f
    public static final <V> List<V> sharedList() {
        return new ArrayList();
    }

    @f
    public static final <T> List<T> sharedListOf(T... values) {
        e0.checkNotNullParameter(values, "values");
        return p0.mutableListOf(Arrays.copyOf(values, values.length));
    }

    @f
    public static final <K, V> Map<K, V> sharedMap(int i10) {
        return new LinkedHashMap(i10);
    }

    public static /* synthetic */ Map sharedMap$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return sharedMap(i10);
    }
}
