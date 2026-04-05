package io.odeeo.internal.t0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class q<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f66448a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.t0.q$a$a, reason: collision with other inner class name */
        public class C0651a extends b<T> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<? extends q<? extends T>> f66449c;

            public C0651a() {
                this.f66449c = (Iterator) u.checkNotNull(a.this.f66448a.iterator());
            }

            @Override // io.odeeo.internal.t0.b
            public T a() {
                while (this.f66449c.hasNext()) {
                    q<? extends T> next = this.f66449c.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return b();
            }
        }

        public a(Iterable iterable) {
            this.f66448a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0651a();
        }
    }

    public static <T> q<T> absent() {
        return io.odeeo.internal.t0.a.a();
    }

    public static <T> q<T> fromNullable(T t10) {
        return t10 == null ? absent() : new x(t10);
    }

    public static <T> q<T> of(T t10) {
        return new x(u.checkNotNull(t10));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends q<? extends T>> iterable) {
        u.checkNotNull(iterable);
        return new a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract q<T> or(q<? extends T> qVar);

    public abstract T or(b0<? extends T> b0Var);

    public abstract T or(T t10);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> q<V> transform(k<? super T, V> kVar);
}
