package io.odeeo.internal.u0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o0<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.t0.q<Iterable<E>> f66998a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends o0<E> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f66999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f66999b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f66999b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67000b;

        public b(Iterable iterable) {
            this.f67000b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.concat(w1.transform(this.f67000b.iterator(), v1.a()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable[] f67001b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.a<Iterator<? extends T>> {
            public a(int i10) {
                super(i10);
            }

            @Override // io.odeeo.internal.u0.a
            public Iterator<? extends T> get(int i10) {
                return c.this.f67001b[i10].iterator();
            }
        }

        public c(Iterable[] iterableArr) {
            this.f67001b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.concat(new a(this.f67001b.length));
        }
    }

    public o0() {
        this.f66998a = io.odeeo.internal.t0.q.absent();
    }

    public static <T> o0<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return a(iterable, iterable2);
    }

    public static <E> o0<E> from(Iterable<E> iterable) {
        return iterable instanceof o0 ? (o0) iterable : new a(iterable, iterable);
    }

    public static <E> o0<E> of() {
        return from(h1.of());
    }

    public final Iterable<E> a() {
        return this.f66998a.or((io.odeeo.internal.t0.q<Iterable<E>>) this);
    }

    public final boolean allMatch(io.odeeo.internal.t0.v<? super E> vVar) {
        return v1.all(a(), vVar);
    }

    public final boolean anyMatch(io.odeeo.internal.t0.v<? super E> vVar) {
        return v1.any(a(), vVar);
    }

    public final o0<E> append(Iterable<? extends E> iterable) {
        return concat(a(), iterable);
    }

    public final boolean contains(Object obj) {
        return v1.contains(a(), obj);
    }

    public final <C extends Collection<? super E>> C copyInto(C c10) {
        io.odeeo.internal.t0.u.checkNotNull(c10);
        Iterable<E> iterableA = a();
        if (iterableA instanceof Collection) {
            c10.addAll(s.a(iterableA));
            return c10;
        }
        Iterator<E> it = iterableA.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public final o0<E> cycle() {
        return from(v1.cycle(a()));
    }

    public final o0<E> filter(io.odeeo.internal.t0.v<? super E> vVar) {
        return from(v1.filter(a(), vVar));
    }

    public final io.odeeo.internal.t0.q<E> first() {
        Iterator<E> it = a().iterator();
        return it.hasNext() ? io.odeeo.internal.t0.q.of(it.next()) : io.odeeo.internal.t0.q.absent();
    }

    public final io.odeeo.internal.t0.q<E> firstMatch(io.odeeo.internal.t0.v<? super E> vVar) {
        return v1.tryFind(a(), vVar);
    }

    public final E get(int i10) {
        return (E) v1.get(a(), i10);
    }

    public final <K> i1<K, E> index(io.odeeo.internal.t0.k<? super E, K> kVar) {
        return g2.index(a(), kVar);
    }

    public final boolean isEmpty() {
        return !a().iterator().hasNext();
    }

    public final String join(io.odeeo.internal.t0.n nVar) {
        return nVar.join(this);
    }

    public final io.odeeo.internal.t0.q<E> last() {
        E next;
        Iterable<E> iterableA = a();
        if (iterableA instanceof List) {
            List list = (List) iterableA;
            return list.isEmpty() ? io.odeeo.internal.t0.q.absent() : io.odeeo.internal.t0.q.of(list.get(list.size() - 1));
        }
        Iterator<E> it = iterableA.iterator();
        if (!it.hasNext()) {
            return io.odeeo.internal.t0.q.absent();
        }
        if (iterableA instanceof SortedSet) {
            return io.odeeo.internal.t0.q.of(((SortedSet) iterableA).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return io.odeeo.internal.t0.q.of(next);
    }

    public final o0<E> limit(int i10) {
        return from(v1.limit(a(), i10));
    }

    public final int size() {
        return v1.size(a());
    }

    public final o0<E> skip(int i10) {
        return from(v1.skip(a(), i10));
    }

    public final E[] toArray(Class<E> cls) {
        return (E[]) v1.toArray(a(), cls);
    }

    public final h1<E> toList() {
        return h1.copyOf(a());
    }

    public final <V> j1<E, V> toMap(io.odeeo.internal.t0.k<? super E, V> kVar) {
        return d2.toMap(a(), kVar);
    }

    public final o1<E> toMultiset() {
        return o1.copyOf(a());
    }

    public final q1<E> toSet() {
        return q1.copyOf(a());
    }

    public final h1<E> toSortedList(Comparator<? super E> comparator) {
        return p2.from(comparator).immutableSortedCopy(a());
    }

    public final s1<E> toSortedSet(Comparator<? super E> comparator) {
        return s1.copyOf(comparator, a());
    }

    public String toString() {
        return v1.toString(a());
    }

    public final <T> o0<T> transform(io.odeeo.internal.t0.k<? super E, T> kVar) {
        return from(v1.transform(a(), kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> o0<T> transformAndConcat(io.odeeo.internal.t0.k<? super E, ? extends Iterable<? extends T>> kVar) {
        return concat(transform(kVar));
    }

    public final <K> j1<K, E> uniqueIndex(io.odeeo.internal.t0.k<? super E, K> kVar) {
        return d2.uniqueIndex(a(), kVar);
    }

    public static <T> o0<T> a(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            io.odeeo.internal.t0.u.checkNotNull(iterable);
        }
        return new c(iterableArr);
    }

    public static <T> o0<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return a(iterable, iterable2, iterable3);
    }

    public static <E> o0<E> from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    public static <E> o0<E> of(E e10, E... eArr) {
        return from(z1.asList(e10, eArr));
    }

    public final o0<E> append(E... eArr) {
        return concat(a(), Arrays.asList(eArr));
    }

    public final <T> o0<T> filter(Class<T> cls) {
        return from(v1.filter((Iterable<?>) a(), (Class) cls));
    }

    public o0(Iterable<E> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        this.f66998a = io.odeeo.internal.t0.q.fromNullable(this == iterable ? null : iterable);
    }

    public static <T> o0<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return a(iterable, iterable2, iterable3, iterable4);
    }

    @Deprecated
    public static <E> o0<E> from(o0<E> o0Var) {
        return (o0) io.odeeo.internal.t0.u.checkNotNull(o0Var);
    }

    public static <T> o0<T> concat(Iterable<? extends T>... iterableArr) {
        return a((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <T> o0<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return new b(iterable);
    }
}
