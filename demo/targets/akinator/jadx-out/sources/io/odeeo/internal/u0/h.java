package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import io.odeeo.internal.u0.i2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h<E> extends AbstractCollection<E> implements h2<E> {

    /* renamed from: a, reason: collision with root package name */
    public transient Set<E> f66846a;

    /* renamed from: b, reason: collision with root package name */
    public transient Set<h2.a<E>> f66847b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends i2.g<E> {
        public a() {
        }

        @Override // io.odeeo.internal.u0.i2.g
        public h2<E> a() {
            return h.this;
        }

        @Override // io.odeeo.internal.u0.i2.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return h.this.d();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends i2.h<E> {
        public b() {
        }

        @Override // io.odeeo.internal.u0.i2.h
        public h2<E> a() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<h2.a<E>> iterator() {
            return h.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.c();
        }
    }

    public Set<E> a() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public final boolean add(E e10) {
        add(e10, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return i2.a((h2) this, (Collection) collection);
    }

    public Set<h2.a<E>> b() {
        return new b();
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public abstract /* synthetic */ int count(Object obj);

    public abstract Iterator<E> d();

    public abstract Iterator<h2.a<E>> e();

    public Set<E> elementSet() {
        Set<E> set = this.f66846a;
        if (set != null) {
            return set;
        }
        Set<E> setA = a();
        this.f66846a = setA;
        return setA;
    }

    public Set<h2.a<E>> entrySet() {
        Set<h2.a<E>> set = this.f66847b;
        if (set != null) {
            return set;
        }
        Set<h2.a<E>> setB = b();
        this.f66847b = setB;
        return setB;
    }

    @Override // java.util.Collection, io.odeeo.internal.u0.h2
    public final boolean equals(Object obj) {
        return i2.a(this, obj);
    }

    @Override // java.util.Collection, io.odeeo.internal.u0.h2
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public final boolean removeAll(Collection<?> collection) {
        return i2.b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public final boolean retainAll(Collection<?> collection) {
        return i2.c(this, collection);
    }

    public int setCount(E e10, int i10) {
        return i2.a(this, e10, i10);
    }

    @Override // java.util.AbstractCollection, io.odeeo.internal.u0.h2
    public final String toString() {
        return entrySet().toString();
    }

    public int add(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e10, int i10, int i11) {
        return i2.a(this, e10, i10, i11);
    }
}
