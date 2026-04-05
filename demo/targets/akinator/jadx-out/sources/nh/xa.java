package nh;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class xa extends ig {
    public abstract Map c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        c().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapC = c();
        mh.p1.checkNotNull(mapC);
        try {
            obj2 = mapC.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (Objects.equals(obj2, entry.getValue())) {
            return obj2 != null || c().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return c().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // nh.ig, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) mh.p1.checkNotNull(collection));
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // nh.ig, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) mh.p1.checkNotNull(collection));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetNewHashSetWithExpectedSize = og.newHashSetWithExpectedSize(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                }
            }
            return c().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return c().size();
    }
}
