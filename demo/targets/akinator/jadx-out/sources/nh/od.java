package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class od extends pd implements c8 {
    @Override // nh.pd, nh.i4, nh.l4
    public c8 delegate() {
        return (c8) this.f76561b;
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public List<Object> get(Object obj) {
        return Collections.unmodifiableList(delegate().get(obj));
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public List<Object> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.pd, nh.i4, nh.fc, nh.c8
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }
}
