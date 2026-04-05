package uu;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r1 extends q1 {
    public static final <K, V> boolean all(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    public static <K, V> rv.t asSequence(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        return y0.asSequence(map.entrySet());
    }

    public static final <K, V> int count(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    public static final <K, V, R> List<R> flatMap(Map<? extends K, ? extends V> map, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, (Iterable) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> List<R> flatMapSequence(Map<? extends K, ? extends V> map, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, (rv.t) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapSequenceTo(Map<? extends K, ? extends V> map, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v0.addAll(destination, (rv.t) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V, R, C extends Collection<? super R>> C flatMapTo(Map<? extends K, ? extends V> map, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            v0.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V> void forEach(Map<? extends K, ? extends V> map, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <K, V, R> List<R> map(Map<? extends K, ? extends V> map, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <K, V, R> List<R> mapNotNull(Map<? extends K, ? extends V> map, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapNotNullTo(Map<? extends K, ? extends V> map, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEach(M m9, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(m9, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        Iterator<Map.Entry<K, V>> it = m9.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m9;
    }

    public static final <K, V, M extends Map<? extends K, ? extends V>> M onEachIndexed(M m9, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(m9, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int i10 = 0;
        for (Object obj : m9.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i10), obj);
            i10 = i11;
        }
        return m9;
    }

    public static <K, V> List<tu.v> toList(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return p0.emptyList();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return p0.emptyList();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return o0.listOf(new tu.v(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new tu.v(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new tu.v(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean any(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <K, V, R, C extends Collection<? super R>> C mapTo(Map<? extends K, ? extends V> map, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, TJzY.xDpFXWyV);
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <K, V> boolean none(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
