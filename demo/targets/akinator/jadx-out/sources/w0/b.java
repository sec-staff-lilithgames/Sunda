package w0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends u0.b implements Map.Entry, lv.f {

    /* renamed from: e, reason: collision with root package name */
    public final Map f90286e;

    /* renamed from: f, reason: collision with root package name */
    public a f90287f;

    public b(Map<Object, a> map, Object obj, a aVar) {
        super(obj, aVar.getValue());
        this.f90286e = map;
        this.f90287f = aVar;
    }

    @Override // u0.b, java.util.Map.Entry
    public Object getValue() {
        return this.f90287f.getValue();
    }

    @Override // u0.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = this.f90287f.getValue();
        this.f90287f = this.f90287f.withValue(obj);
        this.f90286e.put(getKey(), this.f90287f);
        return value;
    }
}
