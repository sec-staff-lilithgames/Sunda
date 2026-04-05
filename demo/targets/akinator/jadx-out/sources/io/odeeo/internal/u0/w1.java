package io.odeeo.internal.u0;

import com.ironsource.C3191e4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<T> extends q3<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Enumeration f67135a;

        public a(Enumeration enumeration) {
            this.f67135a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67135a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f67135a.nextElement();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<T> implements Enumeration<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f67136a;

        public b(Iterator it) {
            this.f67136a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f67136a.hasNext();
        }

        @Override // java.util.Enumeration
        public T nextElement() {
            return (T) this.f67136a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<T> extends q3<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f67137a;

        public c(Iterator it) {
            this.f67137a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67137a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f67137a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<T> f67138a = w1.c();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f67139b;

        public d(Iterable iterable) {
            this.f67139b = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67138a.hasNext() || this.f67139b.iterator().hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f67138a.hasNext()) {
                Iterator<T> it = this.f67139b.iterator();
                this.f67138a = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f67138a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f67138a.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<T> extends q3<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f67140a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object[] f67141b;

        public e(Object[] objArr) {
            this.f67141b = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67140a < this.f67141b.length;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = this.f67141b;
            int i10 = this.f67140a;
            T t10 = (T) objArr[i10];
            objArr[i10] = null;
            this.f67140a = i10 + 1;
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<T> extends q3<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f67142a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67143b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f67144c;

        public f(Iterator it, int i10, boolean z10) {
            this.f67142a = it;
            this.f67143b = i10;
            this.f67144c = z10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67142a.hasNext();
        }

        @Override // java.util.Iterator
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f67143b];
            int i10 = 0;
            while (i10 < this.f67143b && this.f67142a.hasNext()) {
                objArr[i10] = this.f67142a.next();
                i10++;
            }
            for (int i11 = i10; i11 < this.f67143b; i11++) {
                objArr[i11] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f67144c || i10 == this.f67143b) ? listUnmodifiableList : listUnmodifiableList.subList(0, i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g<T> extends io.odeeo.internal.u0.b<T> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f67145c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.v f67146d;

        public g(Iterator it, io.odeeo.internal.t0.v vVar) {
            this.f67145c = it;
            this.f67146d = vVar;
        }

        @Override // io.odeeo.internal.u0.b
        public T computeNext() {
            while (this.f67145c.hasNext()) {
                T t10 = (T) this.f67145c.next();
                if (this.f67146d.apply(t10)) {
                    return t10;
                }
            }
            return a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<F, T> extends o3<F, T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.k f67147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Iterator it, io.odeeo.internal.t0.k kVar) {
            super(it);
            this.f67147b = kVar;
        }

        @Override // io.odeeo.internal.u0.o3
        public T a(F f10) {
            return (T) this.f67147b.apply(f10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f67148a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67149b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f67150c;

        public i(int i10, Iterator it) {
            this.f67149b = i10;
            this.f67150c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67148a < this.f67149b && this.f67150c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f67148a++;
            return (T) this.f67150c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f67150c.remove();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<T> extends q3<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f67151a;

        public j(Iterator it) {
            this.f67151a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67151a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            T t10 = (T) this.f67151a.next();
            this.f67151a.remove();
            return t10;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k<T> extends q3<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f67152a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f67153b;

        public k(Object obj) {
            this.f67153b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f67152a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f67152a) {
                throw new NoSuchElementException();
            }
            this.f67152a = true;
            return (T) this.f67153b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l<T> extends io.odeeo.internal.u0.a<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final r3<Object> f67154e = new l(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        public final T[] f67155c;

        /* renamed from: d, reason: collision with root package name */
        public final int f67156d;

        public l(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f67155c = tArr;
            this.f67156d = i10;
        }

        @Override // io.odeeo.internal.u0.a
        public T get(int i10) {
            return this.f67155c[this.f67156d + i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class m<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<? extends T> f67157a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f67158b = w1.a();

        /* renamed from: c, reason: collision with root package name */
        public Iterator<? extends Iterator<? extends T>> f67159c;

        /* renamed from: d, reason: collision with root package name */
        public Deque<Iterator<? extends Iterator<? extends T>>> f67160d;

        public m(Iterator<? extends Iterator<? extends T>> it) {
            this.f67159c = (Iterator) io.odeeo.internal.t0.u.checkNotNull(it);
        }

        public final Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f67159c;
                if (it != null && it.hasNext()) {
                    return this.f67159c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f67160d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f67159c = this.f67160d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) io.odeeo.internal.t0.u.checkNotNull(this.f67158b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.f67159c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f67158b = next;
                if (next instanceof m) {
                    m mVar = (m) next;
                    this.f67158b = mVar.f67158b;
                    if (this.f67160d == null) {
                        this.f67160d = new ArrayDeque();
                    }
                    this.f67160d.addFirst(this.f67159c);
                    if (mVar.f67160d != null) {
                        while (!mVar.f67160d.isEmpty()) {
                            this.f67160d.addFirst(mVar.f67160d.removeLast());
                        }
                    }
                    this.f67159c = mVar.f67159c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f67158b;
            this.f67157a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            r.a(this.f67157a != null);
            this.f67157a.remove();
            this.f67157a = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum n implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            r.a(false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class o<T> extends q3<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<q2<T>> f67163a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Comparator<q2<T>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f67164a;

            public a(Comparator comparator) {
                this.f67164a = comparator;
            }

            @Override // java.util.Comparator
            public int compare(q2<T> q2Var, q2<T> q2Var2) {
                return this.f67164a.compare(q2Var.peek(), q2Var2.peek());
            }
        }

        public o(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.f67163a = new PriorityQueue(2, new a(comparator));
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f67163a.add(w1.peekingIterator(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f67163a.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            q2<T> q2VarRemove = this.f67163a.remove();
            T next = q2VarRemove.next();
            if (q2VarRemove.hasNext()) {
                this.f67163a.add(q2VarRemove);
            }
            return next;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class p<E> implements q2<E> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<? extends E> f67166a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f67167b;

        /* renamed from: c, reason: collision with root package name */
        public E f67168c;

        public p(Iterator<? extends E> it) {
            this.f67166a = (Iterator) io.odeeo.internal.t0.u.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67167b || this.f67166a.hasNext();
        }

        @Override // io.odeeo.internal.u0.q2, java.util.Iterator
        public E next() {
            if (!this.f67167b) {
                return this.f67166a.next();
            }
            E e10 = this.f67168c;
            this.f67167b = false;
            this.f67168c = null;
            return e10;
        }

        @Override // io.odeeo.internal.u0.q2
        public E peek() {
            if (!this.f67167b) {
                this.f67168c = this.f67166a.next();
                this.f67167b = true;
            }
            return this.f67168c;
        }

        @Override // io.odeeo.internal.u0.q2, java.util.Iterator
        public void remove() {
            io.odeeo.internal.t0.u.checkState(!this.f67167b, "Can't remove after you've peeked at next");
            this.f67166a.remove();
        }
    }

    public static <T> q3<T> a() {
        return b();
    }

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        io.odeeo.internal.t0.u.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int advance(Iterator<?> it, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        int i11 = 0;
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static <T> boolean all(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        while (it.hasNext()) {
            if (!vVar.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        return indexOf(it, vVar) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        return new b(it);
    }

    public static <T> r3<T> b() {
        return (r3<T>) l.f67154e;
    }

    public static <T> Iterator<T> c() {
        return n.INSTANCE;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(it2);
        return concat(a((Object[]) new Iterator[]{it, it2}));
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        return new j(it);
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return new d(iterable);
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !io.odeeo.internal.t0.p.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> q3<T> filter(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        return new g(it, vVar);
    }

    public static <T> T find(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        while (it.hasNext()) {
            T next = it.next();
            if (vVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> q3<T> forArray(T... tArr) {
        return a(tArr, 0, tArr.length, 0);
    }

    public static <T> q3<T> forEnumeration(Enumeration<T> enumeration) {
        io.odeeo.internal.t0.u.checkNotNull(enumeration);
        return new a(enumeration);
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i10 = 0;
        while (contains(it, obj)) {
            i10++;
        }
        return i10;
    }

    public static <T> T get(Iterator<T> it, int i10) {
        a(i10);
        int iAdvance = advance(it, i10);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(p0.o2.i(i10, iAdvance, "position (", ") must be less than the number of elements that remained (", ")"));
    }

    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getNext(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int indexOf(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (vVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(Iterator<T> it, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "limit is negative");
        return new i(i10, it);
    }

    public static <T> q3<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        io.odeeo.internal.t0.u.checkNotNull(iterable, "iterators");
        io.odeeo.internal.t0.u.checkNotNull(comparator, "comparator");
        return new o(iterable, comparator);
    }

    public static <T> q3<List<T>> paddedPartition(Iterator<T> it, int i10) {
        return a(it, i10, true);
    }

    public static <T> q3<List<T>> partition(Iterator<T> it, int i10) {
        return a(it, i10, false);
    }

    public static <T> q2<T> peekingIterator(Iterator<? extends T> it) {
        return it instanceof p ? (p) it : new p(it);
    }

    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean removeIf(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (vVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> q3<T> singletonIterator(T t10) {
        return new k(t10);
    }

    public static int size(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return io.odeeo.internal.w0.d.saturatedCast(j10);
    }

    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) v1.toArray(z1.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, io.odeeo.internal.t0.k<? super F, ? extends T> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        return new h(it, kVar);
    }

    public static <T> io.odeeo.internal.t0.q<T> tryFind(Iterator<T> it, io.odeeo.internal.t0.v<? super T> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        while (it.hasNext()) {
            T next = it.next();
            if (vVar.apply(next)) {
                return io.odeeo.internal.t0.q.of(next);
            }
        }
        return io.odeeo.internal.t0.q.absent();
    }

    public static <T> q3<T> unmodifiableIterator(Iterator<? extends T> it) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        return it instanceof q3 ? (q3) it : new c(it);
    }

    public static <T> Iterator<T> a(T... tArr) {
        return new e(tArr);
    }

    public static void b(Iterator<?> it) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> T c(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static <T> Iterator<T> a(Iterator<? extends T>... itArr) {
        for (Iterator it : (Iterator[]) io.odeeo.internal.t0.u.checkNotNull(itArr)) {
            io.odeeo.internal.t0.u.checkNotNull(it);
        }
        return concat(a((Object[]) itArr));
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(z1.newArrayList(tArr));
    }

    public static <T> T getLast(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) getLast(it) : t10;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(it2);
        io.odeeo.internal.t0.u.checkNotNull(it3);
        return concat(a((Object[]) new Iterator[]{it, it2, it3}));
    }

    public static <T> q3<T> filter(Iterator<?> it, Class<T> cls) {
        return filter(it, io.odeeo.internal.t0.w.instanceOf(cls));
    }

    @Deprecated
    public static <T> q2<T> peekingIterator(q2<T> q2Var) {
        return (q2) io.odeeo.internal.t0.u.checkNotNull(q2Var);
    }

    @Deprecated
    public static <T> q3<T> unmodifiableIterator(q3<T> q3Var) {
        return (q3) io.odeeo.internal.t0.u.checkNotNull(q3Var);
    }

    public static <T> q3<List<T>> a(Iterator<T> it, int i10, boolean z10) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkArgument(i10 > 0);
        return new f(it, i10, z10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(Iterator<? extends T> it, io.odeeo.internal.t0.v<? super T> vVar, T t10) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        while (it.hasNext()) {
            T next = it.next();
            if (vVar.apply(next)) {
                return next;
            }
        }
        return t10;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        io.odeeo.internal.t0.u.checkNotNull(it2);
        io.odeeo.internal.t0.u.checkNotNull(it3);
        io.odeeo.internal.t0.u.checkNotNull(it4);
        return concat(a((Object[]) new Iterator[]{it, it2, it3, it4}));
    }

    public static void a(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(p0.o2.k(i10, "position (", ") must not be negative"));
        }
    }

    public static <T> T getOnlyElement(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) getOnlyElement(it) : t10;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return a((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new m(it);
    }

    public static <T> T get(Iterator<? extends T> it, int i10, T t10) {
        a(i10);
        advance(it, i10);
        return (T) getNext(it, t10);
    }

    public static <T> r3<T> a(T[] tArr, int i10, int i11, int i12) {
        io.odeeo.internal.t0.u.checkArgument(i11 >= 0);
        io.odeeo.internal.t0.u.checkPositionIndexes(i10, i10 + i11, tArr.length);
        io.odeeo.internal.t0.u.checkPositionIndex(i12, i11);
        if (i11 == 0) {
            return b();
        }
        return new l(tArr, i10, i11, i12);
    }

    public static <T> ListIterator<T> a(Iterator<T> it) {
        return (ListIterator) it;
    }
}
