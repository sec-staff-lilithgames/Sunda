package nh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class cc extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Map f76155b;

    public cc(Map map) {
        this.f76155b = (Map) mh.p1.checkNotNull(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76155b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f76155b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f76155b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new ha(1, this.f76155b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Map map = this.f76155b;
            for (Map.Entry entry : map.entrySet()) {
                if (Objects.equals(obj, entry.getValue())) {
                    map.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) mh.p1.checkNotNull(collection));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            Map map = this.f76155b;
            for (Map.Entry entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) mh.p1.checkNotNull(collection));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            Map map = this.f76155b;
            for (Map.Entry entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76155b.size();
    }
}
