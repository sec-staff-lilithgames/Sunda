package nh;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class rb extends qa implements SortedMap {
    @Override // nh.qa
    public final Set c() {
        return (SortedSet) this.f76581f;
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return ((SortedSet) this.f76581f).comparator();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return ((SortedSet) this.f76581f).first();
    }

    @Override // java.util.SortedMap
    public SortedMap<Object, Object> headMap(Object obj) {
        return ec.asMap(((SortedSet) this.f76581f).headSet(obj), this.f76582g);
    }

    @Override // nh.dc, java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        return new ja((SortedSet) this.f76581f);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return ((SortedSet) this.f76581f).last();
    }

    @Override // java.util.SortedMap
    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return ec.asMap(((SortedSet) this.f76581f).subSet(obj, obj2), this.f76582g);
    }

    @Override // java.util.SortedMap
    public SortedMap<Object, Object> tailMap(Object obj) {
        return ec.asMap(((SortedSet) this.f76581f).tailSet(obj), this.f76582g);
    }
}
