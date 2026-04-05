package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m0 extends w implements sf {
    @Override // nh.e0, nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // nh.e0, nh.fc, nh.c8
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // nh.w
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Set h() {
        return Collections.EMPTY_SET;
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.w, nh.e0, nh.fc
    public Set<Map.Entry<Object, Object>> entries() {
        return (Set) super.entries();
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public Set<Object> get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public Set<Object> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}
