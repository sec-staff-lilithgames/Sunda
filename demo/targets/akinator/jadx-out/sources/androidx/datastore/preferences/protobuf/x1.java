package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public Map.Entry f6115b;

    public y1 getField() {
        return (y1) this.f6115b.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f6115b.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        y1 y1Var = (y1) this.f6115b.getValue();
        if (y1Var == null) {
            return null;
        }
        return y1Var.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof r2) {
            return ((y1) this.f6115b.getValue()).setValue((r2) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
