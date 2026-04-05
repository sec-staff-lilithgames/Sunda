package io.odeeo.internal.u0;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<T> implements io.odeeo.internal.t0.k<Iterable<? extends T>, Iterator<? extends T>> {
        @Override // io.odeeo.internal.t0.k
        public Iterator<? extends T> apply(Iterable<? extends T> iterable) {
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67108b;

        public b(Iterable iterable) {
            this.f67108b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.cycle(this.f67108b);
        }

        @Override // io.odeeo.internal.u0.o0
        public String toString() {
            return this.f67108b.toString() + " (cycled)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<T> extends o0<List<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67109b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f67110c;

        public c(Iterable iterable, int i10) {
            this.f67109b = iterable;
            this.f67110c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return w1.partition(this.f67109b.iterator(), this.f67110c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<T> extends o0<List<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67111b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f67112c;

        public d(Iterable iterable, int i10) {
            this.f67111b = iterable;
            this.f67112c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return w1.paddedPartition(this.f67111b.iterator(), this.f67112c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67113b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.v f67114c;

        public e(Iterable iterable, io.odeeo.internal.t0.v vVar) {
            this.f67113b = iterable;
            this.f67114c = vVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.filter(this.f67113b.iterator(), this.f67114c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67115b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.k f67116c;

        public f(Iterable iterable, io.odeeo.internal.t0.k kVar) {
            this.f67115b = iterable;
            this.f67116c = kVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.transform(this.f67115b.iterator(), this.f67116c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67117b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f67118c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f67119a = true;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f67120b;

            public a(Iterator it) {
                this.f67120b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f67120b.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t10 = (T) this.f67120b.next();
                this.f67119a = false;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                r.a(!this.f67119a);
                this.f67120b.remove();
            }
        }

        public g(Iterable iterable, int i10) {
            this.f67117b = iterable;
            this.f67118c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f67117b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f67118c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            w1.advance(it, this.f67118c);
            return new a(it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f67123c;

        public h(Iterable iterable, int i10) {
            this.f67122b = iterable;
            this.f67123c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.limit(this.f67122b.iterator(), this.f67123c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67124b;

        public i(Iterable iterable) {
            this.f67124b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f67124b;
            return iterable instanceof Queue ? new a0((Queue) iterable) : w1.consumingIterator(iterable.iterator());
        }

        @Override // io.odeeo.internal.u0.o0
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67125b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Comparator f67126c;

        public j(Iterable iterable, Comparator comparator) {
            this.f67125b = iterable;
            this.f67126c = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.mergeSorted(v1.transform(this.f67125b, v1.a()), this.f67126c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k<T> extends o0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterable<? extends T> f67127b;

        public /* synthetic */ k(Iterable iterable, b bVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.unmodifiableIterator(this.f67127b.iterator());
        }

        @Override // io.odeeo.internal.u0.o0
        public String toString() {
            return this.f67127b.toString();
        }

        public k(Iterable<? extends T> iterable) {
            this.f67127b = iterable;
        }
    }

    public static <T> T a(List<T> list) {
        return (T) p0.o2.g(1, list);
    }

    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll(s.a(iterable)) : w1.addAll(collection, ((Iterable) io.odeeo.internal.t0.u.checkNotNull(iterable)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        return w1.all(iterable.iterator(), vVar);
    }

    public static <T> boolean any(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        return w1.any(iterable.iterator(), vVar);
    }

    public static Object[] b(Iterable<?> iterable) {
        return a(iterable).toArray();
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return o0.concat(iterable, iterable2);
    }

    public static <T> Iterable<T> consumingIterable(Iterable<T> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return new i(iterable);
    }

    public static boolean contains(Iterable<?> iterable, Object obj) {
        return iterable instanceof Collection ? s.a((Collection<?>) iterable, obj) : w1.contains(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> cycle(Iterable<T> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return new b(iterable);
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return w1.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        return new e(iterable, vVar);
    }

    public static <T> T find(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        return (T) w1.find(iterable.iterator(), vVar);
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
        return iterable instanceof h2 ? ((h2) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : w1.frequency(iterable.iterator(), obj);
    }

    public static <T> T get(Iterable<T> iterable, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) w1.get(iterable.iterator(), i10);
    }

    public static <T> T getFirst(Iterable<? extends T> iterable, T t10) {
        return (T) w1.getNext(iterable.iterator(), t10);
    }

    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) w1.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) a(list);
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) w1.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        return w1.indexOf(iterable.iterator(), vVar);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        io.odeeo.internal.t0.u.checkNotNull(iterable, "iterables");
        io.odeeo.internal.t0.u.checkNotNull(comparator, "comparator");
        return new k(new j(iterable, comparator), null);
    }

    public static <T> Iterable<List<T>> paddedPartition(Iterable<T> iterable, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        io.odeeo.internal.t0.u.checkArgument(i10 > 0);
        return new d(iterable, i10);
    }

    public static <T> Iterable<List<T>> partition(Iterable<T> iterable, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        io.odeeo.internal.t0.u.checkArgument(i10 > 0);
        return new c(iterable, i10);
    }

    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection)) : w1.removeAll(iterable.iterator(), collection);
    }

    public static <T> boolean removeIf(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? a((List) iterable, (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar)) : w1.removeIf(iterable.iterator(), vVar);
    }

    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection)) : w1.retainAll(iterable.iterator(), collection);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : w1.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(Iterable<T> iterable, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "number to skip cannot be negative");
        return new g(iterable, i10);
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) a(iterable, m2.newArray(cls, 0));
    }

    public static String toString(Iterable<?> iterable) {
        return w1.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, io.odeeo.internal.t0.k<? super F, ? extends T> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        return new f(iterable, kVar);
    }

    public static <T> io.odeeo.internal.t0.q<T> tryFind(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        return w1.tryFind(iterable.iterator(), vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return ((iterable instanceof k) || (iterable instanceof d1)) ? iterable : new k(iterable, null);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return o0.concat(iterable, iterable2, iterable3);
    }

    public static <T> T find(Iterable<? extends T> iterable, io.odeeo.internal.t0.v<? super T> vVar, T t10) {
        return (T) w1.find(iterable.iterator(), vVar, t10);
    }

    public static <T> T getOnlyElement(Iterable<? extends T> iterable, T t10) {
        return (T) w1.getOnlyElement(iterable.iterator(), t10);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return o0.concat(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(z1.newArrayList(tArr));
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i10) {
        boolean z10;
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        io.odeeo.internal.t0.u.checkArgument(z10, OcvDtWCQ.NxnuIzXrTWZdy);
        return new h(iterable, i10);
    }

    public static <T> boolean a(List<T> list, io.odeeo.internal.t0.v<? super T> vVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!vVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        a(list, vVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        a(list, vVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return o0.concat(iterableArr);
    }

    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        io.odeeo.internal.t0.u.checkNotNull(cls);
        return filter(iterable, io.odeeo.internal.t0.w.instanceOf(cls));
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(d1<E> d1Var) {
        return (Iterable) io.odeeo.internal.t0.u.checkNotNull(d1Var);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        return o0.concat(iterable);
    }

    public static <T> T get(Iterable<? extends T> iterable, int i10, T t10) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        w1.a(i10);
        if (iterable instanceof List) {
            List listA = z1.a(iterable);
            return i10 < listA.size() ? (T) listA.get(i10) : t10;
        }
        Iterator<? extends T> it = iterable.iterator();
        w1.advance(it, i10);
        return (T) w1.getNext(it, t10);
    }

    public static <T> T getLast(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (s.a(iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) a(z1.a(iterable));
            }
        }
        return (T) w1.getLast(iterable.iterator(), t10);
    }

    public static <T> void a(List<T> list, io.odeeo.internal.t0.v<? super T> vVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (vVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static <T> T a(Iterable<T> iterable, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (vVar.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) a(iterable).toArray(tArr);
    }

    public static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : z1.newArrayList(iterable.iterator());
    }

    public static <T> io.odeeo.internal.t0.k<Iterable<? extends T>, Iterator<? extends T>> a() {
        return new a();
    }
}
