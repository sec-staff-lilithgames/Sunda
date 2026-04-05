package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class ub extends mb {

    /* renamed from: b, reason: collision with root package name */
    public final Map f76692b;

    /* renamed from: c, reason: collision with root package name */
    public final ya f76693c;

    public ub(Map map, ya yaVar) {
        this.f76692b = (Map) mh.p1.checkNotNull(map);
        this.f76693c = (ya) mh.p1.checkNotNull(yaVar);
    }

    @Override // nh.mb
    public final Iterator a() {
        Iterator it = this.f76692b.entrySet().iterator();
        ya yaVar = this.f76693c;
        mh.p1.checkNotNull(yaVar);
        return z7.transform(it, new ep.r(yaVar, 2));
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f76692b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76692b.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map map = this.f76692b;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.f76693c.transformEntry(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        return this.f76692b.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map map = this.f76692b;
        if (map.containsKey(obj)) {
            return this.f76693c.transformEntry(obj, map.remove(obj));
        }
        return null;
    }

    @Override // nh.mb, java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f76692b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        return new cc(this);
    }
}
