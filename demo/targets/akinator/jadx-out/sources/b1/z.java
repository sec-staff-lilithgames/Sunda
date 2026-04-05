package b1;

import b0.e2;
import b1.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h1;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends b0 {
    public z(i0 i0Var) {
        super(i0Var);
    }

    public Void add(Map.Entry<Object, Object> entry) {
        throw e2.u();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends Map.Entry<Object, Object>> collection) {
        throw e2.u();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (h1.isMutableMapEntry(obj)) {
            return contains((Map.Entry<Object, Object>) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new s0(getMap(), ((s0.f) getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (h1.isMutableMapEntry(obj)) {
            return remove((Map.Entry<Object, Object>) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (getMap().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        s0.l map$runtime;
        int modification$runtime;
        m current;
        boolean zAccess$attemptUpdate;
        Collection<?> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(uu.q0.collectionSizeOrDefault(collection2, 10)), 16));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tu.v vVar = tu.e0.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        i0 map = getMap();
        boolean z10 = false;
        do {
            synchronized (j0.f8622a) {
                y0 firstStateRecord = map.getFirstStateRecord();
                kotlin.jvm.internal.e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                i0.a aVar = (i0.a) y.current((i0.a) firstStateRecord);
                map$runtime = aVar.getMap$runtime();
                modification$runtime = aVar.getModification$runtime();
            }
            kotlin.jvm.internal.e0.checkNotNull(map$runtime);
            s0.k kVarBuilder = map$runtime.builder();
            for (Map.Entry<Object, Object> entry2 : map.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.e0.areEqual(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    kVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            s0.l lVarBuild = kVarBuilder.build();
            if (kotlin.jvm.internal.e0.areEqual(lVarBuild, map$runtime)) {
                break;
            }
            y0 firstStateRecord2 = map.getFirstStateRecord();
            kotlin.jvm.internal.e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            i0.a aVar2 = (i0.a) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAccess$attemptUpdate = i0.access$attemptUpdate(map, (i0.a) y.writableRecord(aVar2, map, current), modification$runtime, lVarBuild);
            }
            y.notifyWrite(current, map);
        } while (!zAccess$attemptUpdate);
        return z10;
    }

    public boolean contains(Map.Entry<Object, Object> entry) {
        return kotlin.jvm.internal.e0.areEqual(getMap().get(entry.getKey()), entry.getValue());
    }

    public boolean remove(Map.Entry<Object, Object> entry) {
        return getMap().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry<Object, Object>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll((Collection<? extends Map.Entry<Object, Object>>) collection)).booleanValue();
    }
}
