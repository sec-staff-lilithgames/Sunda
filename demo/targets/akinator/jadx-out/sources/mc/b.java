package mc;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f74151a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f74152b;

    static {
        HashMap map = new HashMap();
        map.put(Collection.class.getName(), ArrayList.class);
        map.put(List.class.getName(), ArrayList.class);
        map.put(Set.class.getName(), HashSet.class);
        map.put(SortedSet.class.getName(), TreeSet.class);
        map.put(Queue.class.getName(), LinkedList.class);
        map.put(AbstractList.class.getName(), ArrayList.class);
        map.put(AbstractSet.class.getName(), HashSet.class);
        map.put(Deque.class.getName(), LinkedList.class);
        map.put(NavigableSet.class.getName(), TreeSet.class);
        map.put("java.util.SequencedCollection", ArrayList.class);
        map.put("java.util.SequencedSet", LinkedHashSet.class);
        f74151a = map;
        HashMap map2 = new HashMap();
        map2.put(Map.class.getName(), LinkedHashMap.class);
        map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
        map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        map2.put(SortedMap.class.getName(), TreeMap.class);
        map2.put(NavigableMap.class.getName(), TreeMap.class);
        map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        map2.put("java.util.SequencedMap", LinkedHashMap.class);
        f74152b = map2;
    }

    public static Class<?> findCollectionFallback(jc.o oVar) {
        return (Class) f74151a.get(oVar.getRawClass().getName());
    }

    public static Class<?> findMapFallback(jc.o oVar) {
        return (Class) f74152b.get(oVar.getRawClass().getName());
    }
}
