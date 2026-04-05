package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d1;
import io.odeeo.internal.u0.h2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o1<E> extends p1<E> implements h2<E> {

    /* renamed from: b, reason: collision with root package name */
    public transient h1<E> f67003b;

    /* renamed from: c, reason: collision with root package name */
    public transient q1<h2.a<E>> f67004c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends q3<E> {

        /* renamed from: a, reason: collision with root package name */
        public int f67005a;

        /* renamed from: b, reason: collision with root package name */
        public E f67006b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f67007c;

        public a(Iterator it) {
            this.f67007c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67005a > 0 || this.f67007c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f67005a <= 0) {
                h2.a aVar = (h2.a) this.f67007c.next();
                this.f67006b = (E) aVar.getElement();
                this.f67005a = aVar.getCount();
            }
            this.f67005a--;
            return this.f67006b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E> extends d1.b<E> {

        /* renamed from: a, reason: collision with root package name */
        public n2<E> f67009a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f67010b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f67011c;

        public b() {
            this(4);
        }

        public static <T> n2<T> a(Iterable<T> iterable) {
            if (iterable instanceof x2) {
                return ((x2) iterable).f67186d;
            }
            if (iterable instanceof e) {
                return ((e) iterable).f66717c;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.b add(Object obj) {
            return add((b<E>) obj);
        }

        public b<E> addCopies(E e10, int i10) {
            if (i10 == 0) {
                return this;
            }
            if (this.f67010b) {
                this.f67009a = new n2<>(this.f67009a);
                this.f67011c = false;
            }
            this.f67010b = false;
            io.odeeo.internal.t0.u.checkNotNull(e10);
            n2<E> n2Var = this.f67009a;
            n2Var.put(e10, n2Var.get(e10) + i10);
            return this;
        }

        public b<E> setCount(E e10, int i10) {
            if (i10 == 0 && !this.f67011c) {
                this.f67009a = new o2(this.f67009a);
                this.f67011c = true;
            } else if (this.f67010b) {
                this.f67009a = new n2<>(this.f67009a);
                this.f67011c = false;
            }
            this.f67010b = false;
            io.odeeo.internal.t0.u.checkNotNull(e10);
            if (i10 == 0) {
                this.f67009a.remove(e10);
                return this;
            }
            this.f67009a.put(io.odeeo.internal.t0.u.checkNotNull(e10), i10);
            return this;
        }

        public b(int i10) {
            this.f67010b = false;
            this.f67011c = false;
            this.f67009a = n2.createWithExpectedSize(i10);
        }

        @Override // io.odeeo.internal.u0.d1.b
        public o1<E> build() {
            if (this.f67009a.c() == 0) {
                return o1.of();
            }
            if (this.f67011c) {
                this.f67009a = new n2<>(this.f67009a);
                this.f67011c = false;
            }
            this.f67010b = true;
            return new x2(this.f67009a);
        }

        @Override // io.odeeo.internal.u0.d1.b
        public b<E> add(E e10) {
            return addCopies(e10, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.b
        public b<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof h2) {
                h2 h2VarA = i2.a(iterable);
                n2 n2VarA = a(h2VarA);
                if (n2VarA != null) {
                    n2<E> n2Var = this.f67009a;
                    n2Var.a(Math.max(n2Var.c(), n2VarA.c()));
                    for (int iA = n2VarA.a(); iA >= 0; iA = n2VarA.h(iA)) {
                        addCopies(n2VarA.c(iA), n2VarA.d(iA));
                    }
                } else {
                    Set<h2.a<E>> setEntrySet = h2VarA.entrySet();
                    n2<E> n2Var2 = this.f67009a;
                    n2Var2.a(Math.max(n2Var2.c(), setEntrySet.size()));
                    for (h2.a<E> aVar : h2VarA.entrySet()) {
                        addCopies(aVar.getElement(), aVar.getCount());
                    }
                }
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.b
        public b<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.b
        public b<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c extends u1<h2.a<E>> {
        private static final long serialVersionUID = 0;

        public c() {
        }

        @Override // io.odeeo.internal.u0.u1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h2.a<E> get(int i10) {
            return o1.this.a(i10);
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof h2.a) {
                h2.a aVar = (h2.a) obj;
                if (aVar.getCount() > 0 && o1.this.count(aVar.getElement()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
        public int hashCode() {
            return o1.this.hashCode();
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return o1.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o1.this.elementSet().size();
        }

        @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
        public Object writeReplace() {
            return new d(o1.this);
        }

        public /* synthetic */ c(o1 o1Var, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<E> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final o1<E> f67013a;

        public d(o1<E> o1Var) {
            this.f67013a = o1Var;
        }

        public Object readResolve() {
            return this.f67013a.entrySet();
        }
    }

    public static <E> o1<E> a(E... eArr) {
        return new b().add((Object[]) eArr).build();
    }

    public static <E> b<E> builder() {
        return new b<>();
    }

    public static <E> o1<E> copyOf(E[] eArr) {
        return a(eArr);
    }

    private q1<h2.a<E>> d() {
        return isEmpty() ? q1.of() : new c(this, null);
    }

    public static <E> o1<E> of() {
        return x2.f67185g;
    }

    public abstract h2.a<E> a(int i10);

    @Override // io.odeeo.internal.u0.h2
    @Deprecated
    public final int add(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.d1
    public h1<E> asList() {
        h1<E> h1Var = this.f67003b;
        if (h1Var != null) {
            return h1Var;
        }
        h1<E> h1VarAsList = super.asList();
        this.f67003b = h1VarAsList;
        return h1VarAsList;
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public abstract /* synthetic */ int count(Object obj);

    @Override // io.odeeo.internal.u0.h2
    public abstract q1<E> elementSet();

    @Override // java.util.Collection, io.odeeo.internal.u0.h2
    public boolean equals(Object obj) {
        return i2.a(this, obj);
    }

    @Override // java.util.Collection, io.odeeo.internal.u0.h2
    public int hashCode() {
        return e3.a(entrySet());
    }

    @Override // io.odeeo.internal.u0.h2
    @Deprecated
    public final int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.h2
    @Deprecated
    public final int setCount(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, io.odeeo.internal.u0.h2
    public String toString() {
        return entrySet().toString();
    }

    @Override // io.odeeo.internal.u0.d1
    public abstract Object writeReplace();

    public static <E> o1<E> a(Collection<? extends h2.a<? extends E>> collection) {
        b bVar = new b(collection.size());
        for (h2.a<? extends E> aVar : collection) {
            bVar.addCopies(aVar.getElement(), aVar.getCount());
        }
        return bVar.build();
    }

    public static <E> o1<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof o1) {
            o1<E> o1Var = (o1) iterable;
            if (!o1Var.isPartialView()) {
                return o1Var;
            }
        }
        b bVar = new b(i2.b(iterable));
        bVar.addAll((Iterable) iterable);
        return bVar.build();
    }

    public static <E> o1<E> of(E e10) {
        return a(e10);
    }

    @Override // io.odeeo.internal.u0.h2
    public q1<h2.a<E>> entrySet() {
        q1<h2.a<E>> q1Var = this.f67004c;
        if (q1Var != null) {
            return q1Var;
        }
        q1<h2.a<E>> q1VarD = d();
        this.f67004c = q1VarD;
        return q1VarD;
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return new a(entrySet().iterator());
    }

    @Override // io.odeeo.internal.u0.h2
    @Deprecated
    public final boolean setCount(E e10, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public static <E> o1<E> of(E e10, E e11) {
        return a(e10, e11);
    }

    public static <E> o1<E> of(E e10, E e11, E e12) {
        return a(e10, e11, e12);
    }

    public static <E> o1<E> of(E e10, E e11, E e12, E e13) {
        return a(e10, e11, e12, e13);
    }

    public static <E> o1<E> of(E e10, E e11, E e12, E e13, E e14) {
        return a(e10, e11, e12, e13, e14);
    }

    @Override // io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        q3<h2.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            h2.a<E> next = it.next();
            Arrays.fill(objArr, i10, next.getCount() + i10, next.getElement());
            i10 += next.getCount();
        }
        return i10;
    }

    public static <E> o1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        return new b().add((b) e10).add((b<E>) e11).add((b<E>) e12).add((b<E>) e13).add((b<E>) e14).add((b<E>) e15).add((Object[]) eArr).build();
    }

    public static <E> o1<E> copyOf(Iterator<? extends E> it) {
        return new b().addAll((Iterator) it).build();
    }
}
