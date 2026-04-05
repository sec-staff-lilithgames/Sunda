package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v3 extends t3 implements y3 {
    @Override // nh.t3, nh.e0
    public final Collection b() {
        return new u3(this);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.e0, nh.fc
    public Set<Map.Entry<Object, Object>> entries() {
        return (Set) super.entries();
    }

    @Override // nh.t3, nh.e0, nh.fc, nh.c8
    public Set<Object> get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // nh.t3, nh.e0, nh.fc, nh.c8
    public Set<Object> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }

    @Override // nh.t3, nh.w3
    public sf unfiltered() {
        return (sf) this.f76652h;
    }
}
