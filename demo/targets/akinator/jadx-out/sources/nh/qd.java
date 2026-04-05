package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class qd extends pd implements sf {
    @Override // nh.pd, nh.i4, nh.l4
    public sf delegate() {
        return (sf) this.f76561b;
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.pd, nh.i4, nh.fc
    public Set<Map.Entry<Object, Object>> entries() {
        return new zb(Collections.unmodifiableSet(delegate().entries()));
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public Set<Object> get(Object obj) {
        return Collections.unmodifiableSet(delegate().get(obj));
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public Set<Object> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }
}
