package nh;

import java.util.Collection;
import java.util.EnumSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w4 extends l6 {

    /* renamed from: e, reason: collision with root package name */
    public final transient EnumSet f76734e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f76735f;

    public w4(EnumSet enumSet) {
        this.f76734e = enumSet;
    }

    public static l6 j(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new w4(enumSet) : l6.of((Enum) i7.getOnlyElement(enumSet)) : l6.of();
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76734e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof w4) {
            collection = ((w4) collection).f76734e;
        }
        return this.f76734e.containsAll(collection);
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w4) {
            obj = ((w4) obj).f76734e;
        }
        return this.f76734e.equals(obj);
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public int hashCode() {
        int i10 = this.f76735f;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f76734e.hashCode();
        this.f76735f = iHashCode;
        return iHashCode;
    }

    @Override // nh.l6
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f76734e.isEmpty();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76734e.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f76734e.toString();
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return z7.unmodifiableIterator(this.f76734e.iterator());
    }
}
