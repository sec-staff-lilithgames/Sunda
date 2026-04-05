package io.odeeo.internal.u0;

import io.ktor.http.ContentDisposition;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<E> extends AbstractCollection<E> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<E> f67037a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super E> f67038b;

        public a(Collection<E> collection, io.odeeo.internal.t0.v<? super E> vVar) {
            this.f67037a = collection;
            this.f67038b = vVar;
        }

        public a<E> a(io.odeeo.internal.t0.v<? super E> vVar) {
            return new a<>(this.f67037a, io.odeeo.internal.t0.w.and(this.f67038b, vVar));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            io.odeeo.internal.t0.u.checkArgument(this.f67038b.apply(e10));
            return this.f67037a.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                io.odeeo.internal.t0.u.checkArgument(this.f67038b.apply(it.next()));
            }
            return this.f67037a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            v1.removeIf(this.f67037a, this.f67038b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (s.a((Collection<?>) this.f67037a, obj)) {
                return this.f67038b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return s.a((Collection<?>) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !v1.any(this.f67037a, this.f67038b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return w1.filter(this.f67037a.iterator(), this.f67038b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f67037a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f67037a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f67038b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f67037a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f67038b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f67037a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f67038b.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return z1.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) z1.newArrayList(iterator()).toArray(tArr);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<E> extends AbstractCollection<List<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final h1<E> f67039a;

        /* renamed from: b, reason: collision with root package name */
        public final Comparator<? super E> f67040b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67041c;

        public b(Iterable<E> iterable, Comparator<? super E> comparator) {
            h1<E> h1VarSortedCopyOf = h1.sortedCopyOf(comparator, iterable);
            this.f67039a = h1VarSortedCopyOf;
            this.f67040b = comparator;
            this.f67041c = a(h1VarSortedCopyOf, comparator);
        }

        public static <E> int a(List<E> list, Comparator<? super E> comparator) {
            int i10 = 1;
            int iSaturatedMultiply = 1;
            int i11 = 1;
            while (i10 < list.size()) {
                if (comparator.compare(list.get(i10 - 1), list.get(i10)) < 0) {
                    iSaturatedMultiply = io.odeeo.internal.v0.a.saturatedMultiply(iSaturatedMultiply, io.odeeo.internal.v0.a.binomial(i10, i11));
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i11 = 0;
                }
                i10++;
                i11++;
            }
            return io.odeeo.internal.v0.a.saturatedMultiply(iSaturatedMultiply, io.odeeo.internal.v0.a.binomial(i10, i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return s.b(this.f67039a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.f67039a, this.f67040b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f67041c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f67039a + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<E> extends io.odeeo.internal.u0.b<List<E>> {

        /* renamed from: c, reason: collision with root package name */
        public List<E> f67042c;

        /* renamed from: d, reason: collision with root package name */
        public final Comparator<? super E> f67043d;

        public c(List<E> list, Comparator<? super E> comparator) {
            this.f67042c = z1.newArrayList(list);
            this.f67043d = comparator;
        }

        public int a(int i10) {
            E e10 = this.f67042c.get(i10);
            for (int size = this.f67042c.size() - 1; size > i10; size--) {
                if (this.f67043d.compare(e10, this.f67042c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }

        public void c() {
            int iE = e();
            if (iE == -1) {
                this.f67042c = null;
                return;
            }
            Collections.swap(this.f67042c, iE, a(iE));
            Collections.reverse(this.f67042c.subList(iE + 1, this.f67042c.size()));
        }

        @Override // io.odeeo.internal.u0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<E> computeNext() {
            List<E> list = this.f67042c;
            if (list == null) {
                return a();
            }
            h1 h1VarCopyOf = h1.copyOf((Collection) list);
            c();
            return h1VarCopyOf;
        }

        public int e() {
            for (int size = this.f67042c.size() - 2; size >= 0; size--) {
                if (this.f67043d.compare(this.f67042c.get(size), this.f67042c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<E> extends AbstractCollection<List<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final h1<E> f67044a;

        public d(h1<E> h1Var) {
            this.f67044a = h1Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return s.b(this.f67044a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.f67044a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return io.odeeo.internal.v0.a.factorial(this.f67044a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f67044a + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<E> extends io.odeeo.internal.u0.b<List<E>> {

        /* renamed from: c, reason: collision with root package name */
        public final List<E> f67045c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f67046d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f67047e;

        /* renamed from: f, reason: collision with root package name */
        public int f67048f;

        public e(List<E> list) {
            this.f67045c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f67046d = iArr;
            int[] iArr2 = new int[size];
            this.f67047e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f67048f = Integer.MAX_VALUE;
        }

        public void c() {
            int size = this.f67045c.size() - 1;
            this.f67048f = size;
            if (size == -1) {
                return;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f67046d;
                int i11 = this.f67048f;
                int i12 = iArr[i11];
                int i13 = this.f67047e[i11] + i12;
                if (i13 < 0) {
                    e();
                } else if (i13 != i11 + 1) {
                    Collections.swap(this.f67045c, (i11 - i12) + i10, (i11 - i13) + i10);
                    this.f67046d[this.f67048f] = i13;
                    return;
                } else {
                    if (i11 == 0) {
                        return;
                    }
                    i10++;
                    e();
                }
            }
        }

        @Override // io.odeeo.internal.u0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<E> computeNext() {
            if (this.f67048f <= 0) {
                return a();
            }
            h1 h1VarCopyOf = h1.copyOf((Collection) this.f67045c);
            c();
            return h1VarCopyOf;
        }

        public void e() {
            int[] iArr = this.f67047e;
            int i10 = this.f67048f;
            iArr[i10] = -iArr[i10];
            this.f67048f = i10 - 1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<F, T> extends AbstractCollection<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<F> f67049a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.k<? super F, ? extends T> f67050b;

        public f(Collection<F> collection, io.odeeo.internal.t0.k<? super F, ? extends T> kVar) {
            this.f67049a = (Collection) io.odeeo.internal.t0.u.checkNotNull(collection);
            this.f67050b = (io.odeeo.internal.t0.k) io.odeeo.internal.t0.u.checkNotNull(kVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f67049a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f67049a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return w1.transform(this.f67049a.iterator(), this.f67050b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f67049a.size();
        }
    }

    public static boolean b(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        n2 n2VarA = a((Collection) list);
        n2 n2VarA2 = a((Collection) list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (n2VarA.d(i10) != n2VarA2.get(n2VarA.c(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <E> Collection<E> filter(Collection<E> collection, io.odeeo.internal.t0.v<? super E> vVar) {
        return collection instanceof a ? ((a) collection).a(vVar) : new a((Collection) io.odeeo.internal.t0.u.checkNotNull(collection), (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar));
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, p2.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new d(h1.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, io.odeeo.internal.t0.k<? super F, T> kVar) {
        return new f(collection, kVar);
    }

    public static boolean a(Collection<?> collection, Object obj) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new b(iterable, comparator);
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder a(int i10) {
        r.a(i10, ContentDisposition.Parameters.Size);
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    public static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    public static <E> n2<E> a(Collection<E> collection) {
        n2<E> n2Var = new n2<>();
        for (E e10 : collection) {
            n2Var.put(e10, n2Var.get(e10) + 1);
        }
        return n2Var;
    }
}
