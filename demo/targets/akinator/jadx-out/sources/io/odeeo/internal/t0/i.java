package io.odeeo.internal.t0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends i<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66422a = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f66422a;
        }

        @Override // io.odeeo.internal.t0.i
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // io.odeeo.internal.t0.i
        public int a(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final i<T> f66423a;

        /* renamed from: b, reason: collision with root package name */
        public final T f66424b;

        public c(i<T> iVar, T t10) {
            this.f66423a = (i) u.checkNotNull(iVar);
            this.f66424b = t10;
        }

        @Override // io.odeeo.internal.t0.v
        public boolean apply(T t10) {
            return this.f66423a.equivalent(t10, this.f66424b);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f66423a.equals(cVar.f66423a) && p.equal(this.f66424b, cVar.f66424b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return p.hashCode(this.f66423a, this.f66424b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f66423a);
            sb2.append(".equivalentTo(");
            return w0.i.e(sb2, this.f66424b, ")");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends i<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final d f66425a = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f66425a;
        }

        @Override // io.odeeo.internal.t0.i
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // io.odeeo.internal.t0.i
        public int a(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final i<? super T> f66426a;

        /* renamed from: b, reason: collision with root package name */
        public final T f66427b;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f66426a.equals(eVar.f66426a)) {
                return this.f66426a.equivalent(this.f66427b, eVar.f66427b);
            }
            return false;
        }

        public T get() {
            return this.f66427b;
        }

        public int hashCode() {
            return this.f66426a.hash(this.f66427b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f66426a);
            sb2.append(".wrap(");
            return w0.i.e(sb2, this.f66427b, ")");
        }

        public e(i<? super T> iVar, T t10) {
            this.f66426a = (i) u.checkNotNull(iVar);
            this.f66427b = t10;
        }
    }

    public static i<Object> equals() {
        return b.f66422a;
    }

    public static i<Object> identity() {
        return d.f66425a;
    }

    public abstract int a(T t10);

    public abstract boolean a(T t10, T t11);

    public final boolean equivalent(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final v<T> equivalentTo(T t10) {
        return new c(this, t10);
    }

    public final int hash(T t10) {
        if (t10 == null) {
            return 0;
        }
        return a(t10);
    }

    public final <F> i<F> onResultOf(k<F, ? extends T> kVar) {
        return new l(kVar, this);
    }

    public final <S extends T> i<Iterable<S>> pairwise() {
        return new r(this);
    }

    public final <S extends T> e<S> wrap(S s10) {
        return new e<>(s10);
    }
}
