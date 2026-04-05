package b1;

import b0.e2;
import b1.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends b0 {
    public a0(i0 i0Var) {
        super(i0Var);
    }

    @Override // java.util.Set, java.util.Collection
    public Void add(Object obj) {
        throw e2.u();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<Object> collection) {
        throw e2.u();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (getMap().remove(it.next()) != null || z10) {
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
        Set set = uu.y0.toSet(collection);
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
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                if (!set.contains(entry.getKey())) {
                    kVarBuilder.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public u0 iterator() {
        return new u0(getMap(), ((s0.f) getMap().getReadable$runtime().getMap$runtime().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll((Collection<Object>) collection)).booleanValue();
    }
}
