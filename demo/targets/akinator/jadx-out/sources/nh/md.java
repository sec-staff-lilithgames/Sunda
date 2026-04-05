package nh;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class md extends nd implements c8 {
    @Override // nh.nd
    public final Collection g(Object obj, Collection collection) {
        return p8.transform((List) collection, new ld(this, obj, 0));
    }

    @Override // nh.nd, nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.nd, nh.e0, nh.fc, nh.c8
    public List<Object> get(Object obj) {
        return p8.transform((List) this.f76504h.get(obj), new ld(this, obj, 0));
    }

    @Override // nh.nd, nh.e0, nh.fc, nh.c8
    public List<Object> removeAll(Object obj) {
        return p8.transform((List) this.f76504h.removeAll(obj), new ld(this, obj, 0));
    }

    @Override // nh.nd, nh.e0, nh.fc, nh.c8
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }
}
