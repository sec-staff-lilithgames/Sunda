package u0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends b implements Map.Entry, lv.f {

    /* renamed from: e, reason: collision with root package name */
    public final i f87476e;

    /* renamed from: f, reason: collision with root package name */
    public Object f87477f;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f87476e = iVar;
        this.f87477f = obj2;
    }

    @Override // u0.b, java.util.Map.Entry
    public Object getValue() {
        return this.f87477f;
    }

    @Override // java.util.Map.Entry
    public void setValue(Object obj) {
        this.f87477f = obj;
    }

    @Override // u0.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        setValue(obj);
        this.f87476e.setValue(getKey(), obj);
        return value;
    }
}
