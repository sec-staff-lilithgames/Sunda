package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class fi extends ni implements Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean zEquals;
        synchronized (this.f76516c) {
            zEquals = ((Map.Entry) this.f76515b).equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        Object key;
        synchronized (this.f76516c) {
            key = ((Map.Entry) this.f76515b).getKey();
        }
        return key;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        Object value;
        synchronized (this.f76516c) {
            value = ((Map.Entry) this.f76515b).getValue();
        }
        return value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76516c) {
            iHashCode = ((Map.Entry) this.f76515b).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value;
        synchronized (this.f76516c) {
            value = ((Map.Entry) this.f76515b).setValue(obj);
        }
        return value;
    }
}
