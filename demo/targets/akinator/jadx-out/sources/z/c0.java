package z;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements Map.Entry, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f96776b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f96777c;

    public c0(Object obj, Object obj2) {
        this.f96776b = obj;
        this.f96777c = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f96776b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f96777c;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
