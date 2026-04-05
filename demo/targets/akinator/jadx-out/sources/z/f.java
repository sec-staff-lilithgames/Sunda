package z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f extends t1 implements Map {

    /* renamed from: f, reason: collision with root package name */
    public a f96806f;

    /* renamed from: g, reason: collision with root package name */
    public c f96807g;

    /* renamed from: h, reason: collision with root package name */
    public e f96808h;

    public f() {
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // z.t1, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // z.t1, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        a aVar = this.f96806f;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f96806f = aVar2;
        return aVar2;
    }

    @Override // z.t1, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        c cVar = this.f96807g;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f96807g = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        ensureCapacity(map.size() + size());
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // z.t1, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean retainAll(Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        e eVar = this.f96808h;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f96808h = eVar2;
        return eVar2;
    }

    public f(int i10) {
        super(i10);
    }

    public f(t1 t1Var) {
        super(t1Var);
    }
}
