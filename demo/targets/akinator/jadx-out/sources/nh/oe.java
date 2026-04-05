package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class oe extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final we f76538b;

    public oe(we weVar) {
        this.f76538b = weVar;
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.f76538b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oe) {
            return this.f76538b.equals(((oe) obj).f76538b);
        }
        return false;
    }

    public int hashCode() {
        return this.f76538b.hashCode() ^ (-921210296);
    }

    @Override // nh.we
    public <S> we nullsFirst() {
        return this.f76538b.nullsFirst();
    }

    @Override // nh.we
    public <S> we reverse() {
        return this.f76538b.reverse().nullsFirst();
    }

    public String toString() {
        return this.f76538b + ".nullsLast()";
    }

    @Override // nh.we
    public <S> we nullsLast() {
        return this;
    }
}
