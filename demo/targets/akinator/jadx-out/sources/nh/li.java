package nh;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class li extends ri implements NavigableMap {

    /* renamed from: h, reason: collision with root package name */
    public transient mi f76460h;

    /* renamed from: i, reason: collision with root package name */
    public transient li f76461i;

    /* renamed from: j, reason: collision with root package name */
    public transient mi f76462j;

    @Override // nh.ri, nh.ii
    public final Map c() {
        return (NavigableMap) super.c();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).ceilingEntry(obj), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        Object objCeilingKey;
        synchronized (this.f76516c) {
            objCeilingKey = ((NavigableMap) super.c()).ceilingKey(obj);
        }
        return objCeilingKey;
    }

    @Override // nh.ri
    /* renamed from: d */
    public final SortedMap c() {
        return (NavigableMap) super.c();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> descendingKeySet() {
        synchronized (this.f76516c) {
            try {
                mi miVar = this.f76460h;
                if (miVar != null) {
                    return miVar;
                }
                mi miVar2 = new mi(((NavigableMap) super.c()).descendingKeySet(), this.f76516c);
                this.f76460h = miVar2;
                return miVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> descendingMap() {
        synchronized (this.f76516c) {
            try {
                li liVar = this.f76461i;
                if (liVar != null) {
                    return liVar;
                }
                li liVar2 = new li(((NavigableMap) super.c()).descendingMap(), this.f76516c);
                this.f76461i = liVar2;
                return liVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> firstEntry() {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).firstEntry(), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).floorEntry(obj), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        Object objFloorKey;
        synchronized (this.f76516c) {
            objFloorKey = ((NavigableMap) super.c()).floorKey(obj);
        }
        return objFloorKey;
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> headMap(Object obj, boolean z10) {
        li liVar;
        synchronized (this.f76516c) {
            liVar = new li(((NavigableMap) super.c()).headMap(obj, z10), this.f76516c);
        }
        return liVar;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).higherEntry(obj), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        Object objHigherKey;
        synchronized (this.f76516c) {
            objHigherKey = ((NavigableMap) super.c()).higherKey(obj);
        }
        return objHigherKey;
    }

    @Override // nh.ii, java.util.Map
    public Set<Object> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lastEntry() {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).lastEntry(), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).lowerEntry(obj), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        Object objLowerKey;
        synchronized (this.f76516c) {
            objLowerKey = ((NavigableMap) super.c()).lowerKey(obj);
        }
        return objLowerKey;
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> navigableKeySet() {
        synchronized (this.f76516c) {
            try {
                mi miVar = this.f76462j;
                if (miVar != null) {
                    return miVar;
                }
                mi miVar2 = new mi(((NavigableMap) super.c()).navigableKeySet(), this.f76516c);
                this.f76462j = miVar2;
                return miVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> pollFirstEntry() {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).pollFirstEntry(), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> pollLastEntry() {
        fi fiVarD;
        synchronized (this.f76516c) {
            fiVarD = jh.i.d(((NavigableMap) super.c()).pollLastEntry(), this.f76516c);
        }
        return fiVarD;
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        li liVar;
        synchronized (this.f76516c) {
            liVar = new li(((NavigableMap) super.c()).subMap(obj, z10, obj2, z11), this.f76516c);
        }
        return liVar;
    }

    @Override // java.util.NavigableMap
    public NavigableMap<Object, Object> tailMap(Object obj, boolean z10) {
        li liVar;
        synchronized (this.f76516c) {
            liVar = new li(((NavigableMap) super.c()).tailMap(obj, z10), this.f76516c);
        }
        return liVar;
    }

    @Override // nh.ri, java.util.SortedMap, java.util.NavigableMap
    public SortedMap<Object, Object> headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // nh.ri, java.util.SortedMap, java.util.NavigableMap
    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // nh.ri, java.util.SortedMap, java.util.NavigableMap
    public SortedMap<Object, Object> tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
