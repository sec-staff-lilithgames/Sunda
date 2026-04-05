package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h4 extends l4 implements Map.Entry {
    public abstract Map.Entry c();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return c().equals(obj);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return c().getKey();
    }

    public Object getValue() {
        return c().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return c().hashCode();
    }

    public Object setValue(Object obj) {
        return c().setValue(obj);
    }
}
