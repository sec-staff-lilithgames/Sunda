package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends w implements c8 {
    @Override // nh.e0, nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // nh.e0, nh.fc, nh.c8
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // nh.w
    public final Collection h() {
        return Collections.EMPTY_LIST;
    }

    @Override // nh.w
    public final Collection i(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // nh.w
    public final Collection j(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new m(this, obj, list, null) : new s(this, obj, list, null);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public List<Object> get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public List<Object> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // nh.w, nh.e0, nh.fc, nh.c8
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (List) super.replaceValues(obj, iterable);
    }
}
