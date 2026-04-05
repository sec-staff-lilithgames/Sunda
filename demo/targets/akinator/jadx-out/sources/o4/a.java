package o4;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        e0.checkNotNullParameter(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(y0.toSet(set));
        e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        e0.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public static final CoroutineDispatcher ioDispatcher() {
        return Dispatchers.getIO();
    }
}
