package nh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class kb extends cc {

    /* renamed from: c, reason: collision with root package name */
    public final Map f76422c;

    /* renamed from: e, reason: collision with root package name */
    public final mh.q1 f76423e;

    public kb(AbstractMap abstractMap, Map map, mh.q1 q1Var) {
        super(abstractMap);
        this.f76422c = map;
        this.f76423e = q1Var;
    }

    @Override // nh.cc, java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        Iterator it = this.f76422c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f76423e.apply(entry) && Objects.equals(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // nh.cc, java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator it = this.f76422c.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f76423e.apply(entry) && collection.contains(entry.getValue())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // nh.cc, java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator it = this.f76422c.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f76423e.apply(entry) && !collection.contains(entry.getValue())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return p8.newArrayList(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p8.newArrayList(iterator()).toArray(tArr);
    }
}
