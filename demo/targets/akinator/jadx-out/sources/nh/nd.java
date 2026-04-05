package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class nd extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final fc f76504h;

    /* renamed from: i, reason: collision with root package name */
    public final ya f76505i;

    public nd(fc fcVar, ya yaVar) {
        this.f76504h = (fc) mh.p1.checkNotNull(fcVar);
        this.f76505i = (ya) mh.p1.checkNotNull(yaVar);
    }

    @Override // nh.e0
    public final Map a() {
        return ec.transformEntries(this.f76504h.asMap(), new ga(this, 5));
    }

    @Override // nh.e0
    public final Collection b() {
        return new b0(this);
    }

    @Override // nh.e0
    public final Set c() {
        return this.f76504h.keySet();
    }

    @Override // nh.e0, nh.fc
    public void clear() {
        this.f76504h.clear();
    }

    @Override // nh.e0, nh.fc
    public boolean containsKey(Object obj) {
        return this.f76504h.containsKey(obj);
    }

    @Override // nh.e0
    public final ud d() {
        return this.f76504h.keys();
    }

    @Override // nh.e0
    public final Collection e() {
        return y1.transform(this.f76504h.entries(), new ep.r(this, 4));
    }

    @Override // nh.e0
    public final Iterator f() {
        Iterator<Map.Entry<Object, Object>> it = this.f76504h.entries().iterator();
        ya yaVar = this.f76505i;
        mh.p1.checkNotNull(yaVar);
        return z7.transform(it, new ep.r(yaVar, 2));
    }

    public Collection g(Object obj, Collection collection) {
        ld ldVar = new ld(this, obj, 1);
        return collection instanceof List ? p8.transform((List) collection, ldVar) : y1.transform(collection, ldVar);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> get(Object obj) {
        return g(obj, this.f76504h.get(obj));
    }

    @Override // nh.e0, nh.fc
    public boolean isEmpty() {
        return this.f76504h.isEmpty();
    }

    @Override // nh.e0, nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> removeAll(Object obj) {
        return g(obj, this.f76504h.removeAll(obj));
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public int size() {
        return this.f76504h.size();
    }

    @Override // nh.e0, nh.fc
    public boolean putAll(fc fcVar) {
        throw new UnsupportedOperationException();
    }
}
