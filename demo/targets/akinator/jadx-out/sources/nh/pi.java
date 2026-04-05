package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class pi extends ei implements Set {
    @Override // nh.ei
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Set c() {
        return (Set) ((Collection) this.f76515b);
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76516c) {
            zEquals = c().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76516c) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }
}
