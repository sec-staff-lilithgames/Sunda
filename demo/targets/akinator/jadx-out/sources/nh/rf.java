package nh;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class rf extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final we f76612b;

    public rf(we weVar) {
        this.f76612b = (we) mh.p1.checkNotNull(weVar);
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f76612b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rf) {
            return this.f76612b.equals(((rf) obj).f76612b);
        }
        return false;
    }

    public int hashCode() {
        return -this.f76612b.hashCode();
    }

    @Override // nh.we
    public <E> E max(E e10, E e11) {
        return (E) this.f76612b.min(e10, e11);
    }

    @Override // nh.we
    public <E> E min(E e10, E e11) {
        return (E) this.f76612b.max(e10, e11);
    }

    @Override // nh.we
    public <S> we reverse() {
        return this.f76612b;
    }

    public String toString() {
        return this.f76612b + ".reverse()";
    }

    @Override // nh.we
    public <E> E max(E e10, E e11, E e12, E... eArr) {
        return (E) this.f76612b.min(e10, e11, e12, eArr);
    }

    @Override // nh.we
    public <E> E min(E e10, E e11, E e12, E... eArr) {
        return (E) this.f76612b.max(e10, e11, e12, eArr);
    }

    @Override // nh.we
    public <E> E max(Iterator<E> it) {
        return (E) this.f76612b.min(it);
    }

    @Override // nh.we
    public <E> E min(Iterator<E> it) {
        return (E) this.f76612b.max(it);
    }

    @Override // nh.we
    public <E> E max(Iterable<E> iterable) {
        return (E) this.f76612b.min(iterable);
    }

    @Override // nh.we
    public <E> E min(Iterable<E> iterable) {
        return (E) this.f76612b.max(iterable);
    }
}
