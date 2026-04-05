package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import io.odeeo.internal.u0.i2;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s3<E> extends i2.l<E> implements j3<E> {
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient s3<E> f67060d;

    public s3(j3<E> j3Var) {
        super(j3Var);
    }

    @Override // io.odeeo.internal.u0.j3, io.odeeo.internal.u0.g3
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // io.odeeo.internal.u0.j3
    public j3<E> descendingMultiset() {
        s3<E> s3Var = this.f67060d;
        if (s3Var != null) {
            return s3Var;
        }
        s3<E> s3Var2 = new s3<>(delegate().descendingMultiset());
        s3Var2.f67060d = this;
        this.f67060d = s3Var2;
        return s3Var2;
    }

    @Override // io.odeeo.internal.u0.i2.l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> d() {
        return e3.unmodifiableNavigableSet(delegate().elementSet());
    }

    @Override // io.odeeo.internal.u0.i2.l, io.odeeo.internal.u0.v0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j3<E> delegate() {
        return (j3) super.delegate();
    }

    @Override // io.odeeo.internal.u0.j3
    public h2.a<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // io.odeeo.internal.u0.j3
    public j3<E> headMultiset(E e10, o oVar) {
        return i2.unmodifiableSortedMultiset(delegate().headMultiset(e10, oVar));
    }

    @Override // io.odeeo.internal.u0.j3
    public h2.a<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // io.odeeo.internal.u0.j3
    public h2.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.j3
    public h2.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.j3
    public j3<E> subMultiset(E e10, o oVar, E e11, o oVar2) {
        return i2.unmodifiableSortedMultiset(delegate().subMultiset(e10, oVar, e11, oVar2));
    }

    @Override // io.odeeo.internal.u0.j3
    public j3<E> tailMultiset(E e10, o oVar) {
        return i2.unmodifiableSortedMultiset(delegate().tailMultiset(e10, oVar));
    }

    @Override // io.odeeo.internal.u0.i2.l, io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
