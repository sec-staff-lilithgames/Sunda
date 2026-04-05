package io.odeeo.internal.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class u1<E> extends q1<E> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends h1<E> {
        public a() {
        }

        @Override // java.util.List
        public E get(int i10) {
            return (E) u1.this.get(i10);
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return u1.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return u1.this.size();
        }
    }

    @Override // io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        return asList().a(objArr, i10);
    }

    @Override // io.odeeo.internal.u0.q1
    public h1<E> d() {
        return new a();
    }

    public abstract E get(int i10);

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return asList().iterator();
    }
}
