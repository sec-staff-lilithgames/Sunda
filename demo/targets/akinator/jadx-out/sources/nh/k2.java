package nh;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k2 extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f76413b;

    public k2(Comparator comparator) {
        this.f76413b = (Comparator) mh.p1.checkNotNull(comparator);
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f76413b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            return this.f76413b.equals(((k2) obj).f76413b);
        }
        return false;
    }

    public int hashCode() {
        return this.f76413b.hashCode();
    }

    public String toString() {
        return this.f76413b.toString();
    }
}
