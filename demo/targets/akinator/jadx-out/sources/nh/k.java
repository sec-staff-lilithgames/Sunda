package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends n implements NavigableMap {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f76412j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w wVar, NavigableMap navigableMap) {
        super(wVar, navigableMap);
        this.f76412j = wVar;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = e().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override // nh.n, nh.dc
    public final Set createKeySet() {
        return new l(this.f76412j, e());
    }

    @Override // nh.n
    /* renamed from: d */
    public final SortedSet createKeySet() {
        return new l(this.f76412j, e());
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> descendingMap() {
        return new k(this.f76412j, e().descendingMap());
    }

    public final Map.Entry f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        w wVar = this.f76412j;
        Collection collectionG = wVar.g();
        collectionG.addAll((Collection) entry.getValue());
        it.remove();
        return ec.immutableEntry(entry.getKey(), wVar.i(collectionG));
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> firstEntry() {
        Map.Entry entryFirstEntry = e().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> floorEntry(Object obj) {
        Map.Entry entryFloorEntry = e().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return e().floorKey(obj);
    }

    @Override // nh.n
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.f76274f);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> higherEntry(Object obj) {
        Map.Entry entryHigherEntry = e().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return e().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> lastEntry() {
        Map.Entry entryLastEntry = e().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = e().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return e().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        return keySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> pollFirstEntry() {
        return f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Collection<Object>> pollLastEntry() {
        return f(descendingMap().entrySet().iterator());
    }

    @Override // nh.n, java.util.SortedMap, java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // nh.n, java.util.SortedMap, java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // nh.n, java.util.SortedMap, java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> headMap(Object obj, boolean z10) {
        return new k(this.f76412j, e().headMap(obj, z10));
    }

    @Override // nh.n, nh.g, nh.dc, java.util.AbstractMap, java.util.Map
    public NavigableSet<Object> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new k(this.f76412j, e().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Collection<Object>> tailMap(Object obj, boolean z10) {
        return new k(this.f76412j, e().tailMap(obj, z10));
    }
}
