package io.odeeo.internal.t0;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h<A, B> implements k<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66410a;

    /* renamed from: b, reason: collision with root package name */
    public transient h<B, A> f66411b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Iterable<B> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f66412a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.t0.h$a$a, reason: collision with other inner class name */
        public class C0650a implements Iterator<B> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<? extends A> f66414a;

            public C0650a() {
                this.f66414a = a.this.f66412a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f66414a.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) h.this.convert(this.f66414a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f66414a.remove();
            }
        }

        public a(Iterable iterable) {
            this.f66412a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
            return new C0650a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<A, B, C> extends h<A, C> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final h<A, B> f66416c;

        /* renamed from: d, reason: collision with root package name */
        public final h<B, C> f66417d;

        public b(h<A, B> hVar, h<B, C> hVar2) {
            this.f66416c = hVar;
            this.f66417d = hVar2;
        }

        @Override // io.odeeo.internal.t0.h
        public A a(C c10) {
            return (A) this.f66416c.a((h<A, B>) this.f66417d.a((h<B, C>) c10));
        }

        @Override // io.odeeo.internal.t0.h
        public C b(A a10) {
            return (C) this.f66417d.b(this.f66416c.b(a10));
        }

        @Override // io.odeeo.internal.t0.h
        public A c(C c10) {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.t0.h
        public C d(A a10) {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.t0.h, io.odeeo.internal.t0.k
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f66416c.equals(bVar.f66416c) && this.f66417d.equals(bVar.f66417d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f66417d.hashCode() + (this.f66416c.hashCode() * 31);
        }

        public String toString() {
            return this.f66416c + ".andThen(" + this.f66417d + LJjmO.pfU;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<A, B> extends h<A, B> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public final k<? super A, ? extends B> f66418c;

        /* renamed from: d, reason: collision with root package name */
        public final k<? super B, ? extends A> f66419d;

        public /* synthetic */ c(k kVar, k kVar2, a aVar) {
            this(kVar, kVar2);
        }

        @Override // io.odeeo.internal.t0.h
        public A c(B b10) {
            return this.f66419d.apply(b10);
        }

        @Override // io.odeeo.internal.t0.h
        public B d(A a10) {
            return this.f66418c.apply(a10);
        }

        @Override // io.odeeo.internal.t0.h, io.odeeo.internal.t0.k
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f66418c.equals(cVar.f66418c) && this.f66419d.equals(cVar.f66419d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f66419d.hashCode() + (this.f66418c.hashCode() * 31);
        }

        public String toString() {
            return "Converter.from(" + this.f66418c + ", " + this.f66419d + ")";
        }

        public c(k<? super A, ? extends B> kVar, k<? super B, ? extends A> kVar2) {
            this.f66418c = (k) u.checkNotNull(kVar);
            this.f66419d = (k) u.checkNotNull(kVar2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e<A, B> extends h<B, A> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final h<A, B> f66421c;

        public e(h<A, B> hVar) {
            this.f66421c = hVar;
        }

        @Override // io.odeeo.internal.t0.h
        public B a(A a10) {
            return this.f66421c.b(a10);
        }

        @Override // io.odeeo.internal.t0.h
        public A b(B b10) {
            return this.f66421c.a((h<A, B>) b10);
        }

        @Override // io.odeeo.internal.t0.h
        public B c(A a10) {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.t0.h
        public A d(B b10) {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.t0.h, io.odeeo.internal.t0.k
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f66421c.equals(((e) obj).f66421c);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f66421c.hashCode();
        }

        @Override // io.odeeo.internal.t0.h
        public h<A, B> reverse() {
            return this.f66421c;
        }

        public String toString() {
            return this.f66421c + ".reverse()";
        }
    }

    public h() {
        this(true);
    }

    public static <A, B> h<A, B> from(k<? super A, ? extends B> kVar, k<? super B, ? extends A> kVar2) {
        return new c(kVar, kVar2, null);
    }

    public static <T> h<T, T> identity() {
        return d.f66420c;
    }

    public A a(B b10) {
        if (!this.f66410a) {
            return c(b10);
        }
        if (b10 == null) {
            return null;
        }
        return (A) u.checkNotNull(c(b10));
    }

    public final <C> h<A, C> andThen(h<B, C> hVar) {
        return a((h) hVar);
    }

    @Override // io.odeeo.internal.t0.k
    @Deprecated
    public final B apply(A a10) {
        return convert(a10);
    }

    public B b(A a10) {
        if (!this.f66410a) {
            return d(a10);
        }
        if (a10 == null) {
            return null;
        }
        return (B) u.checkNotNull(d(a10));
    }

    public abstract A c(B b10);

    public final B convert(A a10) {
        return b(a10);
    }

    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        u.checkNotNull(iterable, "fromIterable");
        return new a(iterable);
    }

    public abstract B d(A a10);

    @Override // io.odeeo.internal.t0.k
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public h<B, A> reverse() {
        h<B, A> hVar = this.f66411b;
        if (hVar != null) {
            return hVar;
        }
        e eVar = new e(this);
        this.f66411b = eVar;
        return eVar;
    }

    public h(boolean z10) {
        this.f66410a = z10;
    }

    public <C> h<A, C> a(h<B, C> hVar) {
        return new b(this, (h) u.checkNotNull(hVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<T> extends h<T, T> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final d f66420c = new d();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f66420c;
        }

        @Override // io.odeeo.internal.t0.h
        public <S> h<T, S> a(h<T, S> hVar) {
            return (h) u.checkNotNull(hVar, "otherConverter");
        }

        @Override // io.odeeo.internal.t0.h
        public d<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }

        @Override // io.odeeo.internal.t0.h
        public T c(T t10) {
            return t10;
        }

        @Override // io.odeeo.internal.t0.h
        public T d(T t10) {
            return t10;
        }
    }
}
