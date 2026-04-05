package nh;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class oa extends dc {

    /* renamed from: f, reason: collision with root package name */
    public final Map f76530f;

    /* renamed from: g, reason: collision with root package name */
    public final mh.q1 f76531g;

    public oa(Map map, mh.q1 q1Var) {
        this.f76530f = map;
        this.f76531g = q1Var;
    }

    @Override // nh.dc
    public final Collection b() {
        return new kb(this, this.f76530f, this.f76531g);
    }

    public final boolean c(Object obj, Object obj2) {
        return this.f76531g.apply(ec.immutableEntry(obj, obj2));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map map = this.f76530f;
        return map.containsKey(obj) && c(obj, map.get(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2 = this.f76530f.get(obj);
        if (obj2 == null || !c(obj, obj2)) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        mh.p1.checkArgument(c(obj, obj2));
        return this.f76530f.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            mh.p1.checkArgument(c(entry.getKey(), entry.getValue()));
        }
        this.f76530f.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (containsKey(obj)) {
            return this.f76530f.remove(obj);
        }
        return null;
    }
}
