package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class yb extends e4 {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f76792b;

    public yb(Collection collection) {
        this.f76792b = collection;
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        return this.f76792b;
    }

    @Override // nh.e4, nh.l4
    public final Object delegate() {
        return this.f76792b;
    }

    @Override // nh.e4, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new ma(this.f76792b.iterator());
    }

    @Override // nh.e4, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // nh.e4, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) pe.c(this, tArr);
    }
}
