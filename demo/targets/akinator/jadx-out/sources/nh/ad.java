package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ad extends dc {

    /* renamed from: f, reason: collision with root package name */
    public final fc f76100f;

    public ad(kd kdVar) {
        this.f76100f = (fc) mh.p1.checkNotNull(kdVar);
    }

    @Override // nh.dc
    public final Set a() {
        return new zc(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f76100f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76100f.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f76100f.isEmpty();
    }

    @Override // nh.dc, java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        return this.f76100f.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f76100f.keySet().size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> get(Object obj) {
        if (containsKey(obj)) {
            return this.f76100f.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> remove(Object obj) {
        if (containsKey(obj)) {
            return this.f76100f.removeAll(obj);
        }
        return null;
    }
}
