package nh;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class qf extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final qf f76588b = new qf();

    @Override // nh.we
    public <S extends Comparable<?>> we reverse() {
        return we.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        mh.p1.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E max(E e10, E e11) {
        return (E) me.f76479e.min(e10, e11);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E min(E e10, E e11) {
        return (E) me.f76479e.max(e10, e11);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E max(E e10, E e11, E e12, E... eArr) {
        return (E) me.f76479e.min(e10, e11, e12, eArr);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E min(E e10, E e11, E e12, E... eArr) {
        return (E) me.f76479e.max(e10, e11, e12, eArr);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E max(Iterator<E> it) {
        return (E) me.f76479e.min(it);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E min(Iterator<E> it) {
        return (E) me.f76479e.max(it);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) me.f76479e.min(iterable);
    }

    @Override // nh.we
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) me.f76479e.max(iterable);
    }
}
