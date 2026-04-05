package lc;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends n implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final m f73134e = new m(Collections.EMPTY_MAP);

    /* renamed from: f, reason: collision with root package name */
    public static final Object f73135f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map f73136b;

    /* renamed from: c, reason: collision with root package name */
    public final transient HashMap f73137c;

    public m(Map map) {
        this.f73136b = map;
        this.f73137c = null;
    }

    public static n getEmpty() {
        return f73134e;
    }

    @Override // lc.n
    public Object getAttribute(Object obj) {
        Object obj2;
        HashMap map = this.f73137c;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return this.f73136b.get(obj);
        }
        if (obj2 == f73135f) {
            return null;
        }
        return obj2;
    }

    @Override // lc.n
    public n withPerCallAttribute(Object obj, Object obj2) {
        Object obj3 = f73135f;
        Map map = this.f73136b;
        HashMap map2 = this.f73137c;
        if (obj2 == null) {
            if (!map.containsKey(obj)) {
                if (map2 != null && map2.containsKey(obj)) {
                    map2.remove(obj);
                }
                return this;
            }
            obj2 = obj3;
        }
        if (map2 != null) {
            map2.put(obj, obj2);
            return this;
        }
        HashMap map3 = new HashMap();
        if (obj2 != null) {
            obj3 = obj2;
        }
        map3.put(obj, obj3);
        return new m(map3, map);
    }

    @Override // lc.n
    public n withSharedAttribute(Object obj, Object obj2) {
        HashMap map = this == f73134e ? new HashMap(8) : new HashMap(this.f73136b);
        map.put(obj, obj2);
        return new m(map);
    }

    @Override // lc.n
    public n withSharedAttributes(Map<?, ?> map) {
        return new m(map);
    }

    @Override // lc.n
    public n withoutSharedAttribute(Object obj) {
        Map map = this.f73136b;
        if (map.isEmpty() || !map.containsKey(obj)) {
            return this;
        }
        if (map.size() == 1) {
            return f73134e;
        }
        HashMap map2 = new HashMap(map);
        map2.remove(obj);
        return new m(map2);
    }

    public m(HashMap map, Map map2) {
        this.f73136b = map2;
        this.f73137c = map;
    }
}
