package io.odeeo.internal.u0;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1<E extends Enum<E>> extends q1<E> {

    /* renamed from: c, reason: collision with root package name */
    public final transient EnumSet<E> f66816c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f66817d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final EnumSet<E> f66818a;

        public b(EnumSet<E> enumSet) {
            this.f66818a = enumSet;
        }

        public Object readResolve() {
            return new g1(this.f66818a.clone());
        }
    }

    public static q1 a(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new g1(enumSet) : q1.of(v1.getOnlyElement(enumSet)) : q1.of();
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f66816c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof g1) {
            collection = ((g1) collection).f66816c;
        }
        return this.f66816c.containsAll(collection);
    }

    @Override // io.odeeo.internal.u0.q1
    public boolean e() {
        return true;
    }

    @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            obj = ((g1) obj).f66816c;
        }
        return this.f66816c.equals(obj);
    }

    @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
    public int hashCode() {
        int i10 = this.f66817d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f66816c.hashCode();
        this.f66817d = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f66816c.isEmpty();
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f66816c.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f66816c.toString();
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new b(this.f66816c);
    }

    public g1(EnumSet<E> enumSet) {
        this.f66816c = enumSet;
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return w1.unmodifiableIterator(this.f66816c.iterator());
    }
}
