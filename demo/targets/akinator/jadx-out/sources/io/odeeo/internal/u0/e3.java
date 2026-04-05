package io.odeeo.internal.u0;

import io.ktor.http.ContentDisposition;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.q1;
import io.odeeo.internal.u0.s;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e3 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<E> extends l<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f66728a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f66729b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.u0.e3$a$a, reason: collision with other inner class name */
        public class C0660a extends io.odeeo.internal.u0.b<E> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<? extends E> f66730c;

            /* renamed from: d, reason: collision with root package name */
            public final Iterator<? extends E> f66731d;

            public C0660a() {
                this.f66730c = a.this.f66728a.iterator();
                this.f66731d = a.this.f66729b.iterator();
            }

            @Override // io.odeeo.internal.u0.b
            public E computeNext() {
                if (this.f66730c.hasNext()) {
                    return this.f66730c.next();
                }
                while (this.f66731d.hasNext()) {
                    E next = this.f66731d.next();
                    if (!a.this.f66728a.contains(next)) {
                        return next;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f66728a = set;
            this.f66729b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f66728a.contains(obj) || this.f66729b.contains(obj);
        }

        @Override // io.odeeo.internal.u0.e3.l
        public <S extends Set<E>> S copyInto(S s10) {
            s10.addAll(this.f66728a);
            s10.addAll(this.f66729b);
            return s10;
        }

        @Override // io.odeeo.internal.u0.e3.l
        public q1<E> immutableCopy() {
            return new q1.a().addAll((Iterable) this.f66728a).addAll((Iterable) this.f66729b).build();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f66728a.isEmpty() && this.f66729b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f66728a.size();
            Iterator<E> it = this.f66729b.iterator();
            while (it.hasNext()) {
                if (!this.f66728a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // io.odeeo.internal.u0.e3.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public q3<E> iterator() {
            return new C0660a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E> extends l<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f66733a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f66734b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<E> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<E> f66735c;

            public a() {
                this.f66735c = b.this.f66733a.iterator();
            }

            @Override // io.odeeo.internal.u0.b
            public E computeNext() {
                while (this.f66735c.hasNext()) {
                    E next = this.f66735c.next();
                    if (b.this.f66734b.contains(next)) {
                        return next;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, Set set2) {
            super(null);
            this.f66733a = set;
            this.f66734b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f66733a.contains(obj) && this.f66734b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f66733a.containsAll(collection) && this.f66734b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f66734b, this.f66733a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f66733a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f66734b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // io.odeeo.internal.u0.e3.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public q3<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<E> extends l<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f66737a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f66738b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<E> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<E> f66739c;

            public a() {
                this.f66739c = c.this.f66737a.iterator();
            }

            @Override // io.odeeo.internal.u0.b
            public E computeNext() {
                while (this.f66739c.hasNext()) {
                    E next = this.f66739c.next();
                    if (!c.this.f66738b.contains(next)) {
                        return next;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set, Set set2) {
            super(null);
            this.f66737a = set;
            this.f66738b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f66737a.contains(obj) && !this.f66738b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f66738b.containsAll(this.f66737a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f66737a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f66738b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // io.odeeo.internal.u0.e3.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public q3<E> iterator() {
            return new a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<E> extends l<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f66741a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f66742b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<E> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f66743c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f66744d;

            public a(Iterator it, Iterator it2) {
                this.f66743c = it;
                this.f66744d = it2;
            }

            @Override // io.odeeo.internal.u0.b
            public E computeNext() {
                while (this.f66743c.hasNext()) {
                    E e10 = (E) this.f66743c.next();
                    if (!d.this.f66742b.contains(e10)) {
                        return e10;
                    }
                }
                while (this.f66744d.hasNext()) {
                    E e11 = (E) this.f66744d.next();
                    if (!d.this.f66741a.contains(e11)) {
                        return e11;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set set, Set set2) {
            super(null);
            this.f66741a = set;
            this.f66742b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f66742b.contains(obj) ^ this.f66741a.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f66741a.equals(this.f66742b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f66741a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f66742b.contains(it.next())) {
                    i10++;
                }
            }
            Iterator<E> it2 = this.f66742b.iterator();
            while (it2.hasNext()) {
                if (!this.f66741a.contains(it2.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // io.odeeo.internal.u0.e3.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public q3<E> iterator() {
            return new a(this.f66741a.iterator(), this.f66742b.iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<E> extends AbstractSet<Set<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f66746a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j1 f66747b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<Set<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final BitSet f66748c;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.e3$e$a$a, reason: collision with other inner class name */
            public class C0661a extends AbstractSet<E> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ BitSet f66750a;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: io.odeeo.internal.u0.e3$e$a$a$a, reason: collision with other inner class name */
                public class C0662a extends io.odeeo.internal.u0.b<E> {

                    /* renamed from: c, reason: collision with root package name */
                    public int f66752c = -1;

                    public C0662a() {
                    }

                    @Override // io.odeeo.internal.u0.b
                    public E computeNext() {
                        int iNextSetBit = C0661a.this.f66750a.nextSetBit(this.f66752c + 1);
                        this.f66752c = iNextSetBit;
                        return iNextSetBit == -1 ? a() : e.this.f66747b.keySet().asList().get(this.f66752c);
                    }
                }

                public C0661a(BitSet bitSet) {
                    this.f66750a = bitSet;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    Integer num = (Integer) e.this.f66747b.get(obj);
                    return num != null && this.f66750a.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C0662a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.f66746a;
                }
            }

            public a() {
                this.f66748c = new BitSet(e.this.f66747b.size());
            }

            @Override // io.odeeo.internal.u0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Set<E> computeNext() {
                if (this.f66748c.isEmpty()) {
                    this.f66748c.set(0, e.this.f66746a);
                } else {
                    int iNextSetBit = this.f66748c.nextSetBit(0);
                    int iNextClearBit = this.f66748c.nextClearBit(iNextSetBit);
                    if (iNextClearBit == e.this.f66747b.size()) {
                        return a();
                    }
                    int i10 = (iNextClearBit - iNextSetBit) - 1;
                    this.f66748c.set(0, i10);
                    this.f66748c.clear(i10, iNextClearBit);
                    this.f66748c.set(iNextClearBit);
                }
                return new C0661a((BitSet) this.f66748c.clone());
            }
        }

        public e(int i10, j1 j1Var) {
            this.f66746a = i10;
            this.f66747b = j1Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (set.size() == this.f66746a && this.f66747b.keySet().containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return io.odeeo.internal.v0.a.binomial(this.f66747b.size(), this.f66746a);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Sets.combinations(");
            sb2.append(this.f66747b.keySet());
            sb2.append(", ");
            return a.b.f(this.f66746a, ")", sb2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g<E> extends i<E> implements NavigableSet<E> {
        public g(NavigableSet<E> navigableSet, io.odeeo.internal.t0.v<? super E> vVar) {
            super(navigableSet, vVar);
        }

        public NavigableSet<E> a() {
            return (NavigableSet) this.f67037a;
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e10) {
            return (E) v1.find(a().tailSet(e10, true), this.f67038b, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return w1.filter(a().descendingIterator(), this.f67038b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return e3.filter((NavigableSet) a().descendingSet(), (io.odeeo.internal.t0.v) this.f67038b);
        }

        @Override // java.util.NavigableSet
        public E floor(E e10) {
            return (E) w1.find(a().headSet(e10, true).descendingIterator(), this.f67038b, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            return e3.filter((NavigableSet) a().headSet(e10, z10), (io.odeeo.internal.t0.v) this.f67038b);
        }

        @Override // java.util.NavigableSet
        public E higher(E e10) {
            return (E) v1.find(a().tailSet(e10, false), this.f67038b, null);
        }

        @Override // io.odeeo.internal.u0.e3.i, java.util.SortedSet
        public E last() {
            return (E) w1.find(a().descendingIterator(), this.f67038b);
        }

        @Override // java.util.NavigableSet
        public E lower(E e10) {
            return (E) w1.find(a().headSet(e10, false).descendingIterator(), this.f67038b, null);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) v1.a(a(), this.f67038b);
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) v1.a(a().descendingSet(), this.f67038b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            return e3.filter((NavigableSet) a().subSet(e10, z10, e11, z11), (io.odeeo.internal.t0.v) this.f67038b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            return e3.filter((NavigableSet) a().tailSet(e10, z10), (io.odeeo.internal.t0.v) this.f67038b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<E> extends s.a<E> implements Set<E> {
        public h(Set<E> set, io.odeeo.internal.t0.v<? super E> vVar) {
            super(set, vVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return e3.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return e3.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<E> extends h<E> implements SortedSet<E> {
        public i(SortedSet<E> sortedSet, io.odeeo.internal.t0.v<? super E> vVar) {
            super(sortedSet, vVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f67037a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) w1.find(this.f67037a.iterator(), this.f67038b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new i(((SortedSet) this.f67037a).headSet(e10), this.f67038b);
        }

        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f67037a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f67038b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new i(((SortedSet) this.f67037a).subSet(e10, e11), this.f67038b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new i(((SortedSet) this.f67037a).tailSet(e10), this.f67038b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class j<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return e3.a((Set<?>) this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k<E> extends AbstractSet<Set<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final j1<E, Integer> f66757a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.a<Set<E>> {
            public a(int i10) {
                super(i10);
            }

            @Override // io.odeeo.internal.u0.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Set<E> get(int i10) {
                return new m(k.this.f66757a, i10);
            }
        }

        public k(Set<E> set) {
            io.odeeo.internal.t0.u.checkArgument(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.f66757a = d2.a((Collection) set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f66757a.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return obj instanceof k ? this.f66757a.equals(((k) obj).f66757a) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f66757a.keySet().hashCode() << (this.f66757a.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f66757a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f66757a + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class l<E> extends AbstractSet<E> {
        public /* synthetic */ l(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public <S extends Set<E>> S copyInto(S s10) {
            s10.addAll(this);
            return s10;
        }

        public q1<E> immutableCopy() {
            return q1.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract q3<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public l() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m<E> extends AbstractSet<E> {

        /* renamed from: a, reason: collision with root package name */
        public final j1<E, Integer> f66759a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66760b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends q3<E> {

            /* renamed from: a, reason: collision with root package name */
            public final h1<E> f66761a;

            /* renamed from: b, reason: collision with root package name */
            public int f66762b;

            public a() {
                this.f66761a = m.this.f66759a.keySet().asList();
                this.f66762b = m.this.f66760b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f66762b != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f66762b);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f66762b &= ~(1 << iNumberOfTrailingZeros);
                return this.f66761a.get(iNumberOfTrailingZeros);
            }
        }

        public m(j1<E, Integer> j1Var, int i10) {
            this.f66759a = j1Var;
            this.f66760b = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Integer num = this.f66759a.get(obj);
            if (num != null) {
                return ((1 << num.intValue()) & this.f66760b) != 0;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f66760b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n<E> extends a1<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final NavigableSet<E> f66764a;

        /* renamed from: b, reason: collision with root package name */
        public final SortedSet<E> f66765b;

        /* renamed from: c, reason: collision with root package name */
        public transient n<E> f66766c;

        public n(NavigableSet<E> navigableSet) {
            this.f66764a = (NavigableSet) io.odeeo.internal.t0.u.checkNotNull(navigableSet);
            this.f66765b = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e10) {
            return this.f66764a.ceiling(e10);
        }

        @Override // io.odeeo.internal.u0.a1, io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: d */
        public SortedSet<E> delegate() {
            return this.f66765b;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return w1.unmodifiableIterator(this.f66764a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            n<E> nVar = this.f66766c;
            if (nVar != null) {
                return nVar;
            }
            n<E> nVar2 = new n<>(this.f66764a.descendingSet());
            this.f66766c = nVar2;
            nVar2.f66766c = this;
            return nVar2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e10) {
            return this.f66764a.floor(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            return e3.unmodifiableNavigableSet(this.f66764a.headSet(e10, z10));
        }

        @Override // java.util.NavigableSet
        public E higher(E e10) {
            return this.f66764a.higher(e10);
        }

        @Override // java.util.NavigableSet
        public E lower(E e10) {
            return this.f66764a.lower(e10);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            return e3.unmodifiableNavigableSet(this.f66764a.subSet(e10, z10, e11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            return e3.unmodifiableNavigableSet(this.f66764a.tailSet(e10, z10));
        }
    }

    public static <E extends Enum<E>> EnumSet<E> a(Collection<E> collection, Class<E> cls) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return f.a(list);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, int i10) {
        j1 j1VarA = d2.a((Collection) set);
        r.a(i10, ContentDisposition.Parameters.Size);
        io.odeeo.internal.t0.u.checkArgument(i10 <= j1VarA.size(), "size (%s) must be <= set.size() (%s)", i10, j1VarA.size());
        return i10 == 0 ? q1.of(q1.of()) : i10 == j1VarA.size() ? q1.of(j1VarA.keySet()) : new e(i10, j1VarA);
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        io.odeeo.internal.t0.u.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return a(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E> l<E> difference(Set<E> set, Set<?> set2) {
        io.odeeo.internal.t0.u.checkNotNull(set, "set1");
        io.odeeo.internal.t0.u.checkNotNull(set2, "set2");
        return new c(set, set2);
    }

    public static <E> Set<E> filter(Set<E> set, io.odeeo.internal.t0.v<? super E> vVar) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, (io.odeeo.internal.t0.v) vVar);
        }
        if (!(set instanceof h)) {
            return new h((Set) io.odeeo.internal.t0.u.checkNotNull(set), (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar));
        }
        h hVar = (h) set;
        return new h((Set) hVar.f67037a, io.odeeo.internal.t0.w.and(hVar.f67038b, vVar));
    }

    public static <E extends Enum<E>> q1<E> immutableEnumSet(E e10, E... eArr) {
        return g1.a(EnumSet.of((Enum) e10, (Enum[]) eArr));
    }

    public static <E> l<E> intersection(Set<E> set, Set<?> set2) {
        io.odeeo.internal.t0.u.checkNotNull(set, "set1");
        io.odeeo.internal.t0.u.checkNotNull(set2, "set2");
        return new b(set, set2);
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        v1.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(d2.a(i10));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(d2.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(d2.a(i10));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new k(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, s2<K> s2Var) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != p2.natural() && s2Var.hasLowerBound() && s2Var.hasUpperBound()) {
            io.odeeo.internal.t0.u.checkArgument(navigableSet.comparator().compare(s2Var.lowerEndpoint(), s2Var.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (s2Var.hasLowerBound() && s2Var.hasUpperBound()) {
            Comparable comparableLowerEndpoint = s2Var.lowerEndpoint();
            o oVarLowerBoundType = s2Var.lowerBoundType();
            o oVar = o.CLOSED;
            return navigableSet.subSet(comparableLowerEndpoint, oVarLowerBoundType == oVar, s2Var.upperEndpoint(), s2Var.upperBoundType() == oVar);
        }
        if (s2Var.hasLowerBound()) {
            return navigableSet.tailSet(s2Var.lowerEndpoint(), s2Var.lowerBoundType() == o.CLOSED);
        }
        if (s2Var.hasUpperBound()) {
            return navigableSet.headSet(s2Var.upperEndpoint(), s2Var.upperBoundType() == o.CLOSED);
        }
        return (NavigableSet) io.odeeo.internal.t0.u.checkNotNull(navigableSet);
    }

    public static <E> l<E> symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
        io.odeeo.internal.t0.u.checkNotNull(set, "set1");
        io.odeeo.internal.t0.u.checkNotNull(set2, "set2");
        return new d(set, set2);
    }

    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return m3.a(navigableSet);
    }

    public static <E> l<E> union(Set<? extends E> set, Set<? extends E> set2) {
        io.odeeo.internal.t0.u.checkNotNull(set, "set1");
        io.odeeo.internal.t0.u.checkNotNull(set2, "set2");
        return new a(set, set2);
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof d1) || (navigableSet instanceof n)) ? navigableSet : new n(navigableSet);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    public static <E extends Enum<E>> q1<E> immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof g1) {
            return (g1) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? q1.of() : g1.a(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return q1.of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        w1.addAll(enumSetOf, it);
        return g1.a(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        v1.addAll(setNewConcurrentHashSet, iterable);
        return setNewConcurrentHashSet;
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? s.a(iterable) : z1.newArrayList(iterable));
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, eArr);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>(s.a(iterable));
        }
        LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        v1.addAll(linkedHashSetNewLinkedHashSet, iterable);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        v1.addAll(treeSetNewTreeSet, iterable);
        return treeSetNewTreeSet;
    }

    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>(s.a(iterable));
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator));
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return a(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> hashSetNewHashSet = newHashSet();
        w1.addAll(hashSetNewHashSet, it);
        return hashSetNewHashSet;
    }

    public static boolean a(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, io.odeeo.internal.t0.v<? super E> vVar) {
        if (sortedSet instanceof h) {
            h hVar = (h) sortedSet;
            return new i((SortedSet) hVar.f67037a, io.odeeo.internal.t0.w.and(hVar.f67038b, vVar));
        }
        return new i((SortedSet) io.odeeo.internal.t0.u.checkNotNull(sortedSet), (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f<E> extends p0<List<E>> implements Set<List<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final transient h1<q1<E>> f66754a;

        /* renamed from: b, reason: collision with root package name */
        public final transient q<E> f66755b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a extends h1<List<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h1 f66756c;

            public a(h1 h1Var) {
                this.f66756c = h1Var;
            }

            @Override // io.odeeo.internal.u0.d1
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f66756c.size();
            }

            @Override // java.util.List
            public List<E> get(int i10) {
                return ((q1) this.f66756c.get(i10)).asList();
            }
        }

        public f(h1<q1<E>> h1Var, q<E> qVar) {
            this.f66754a = h1Var;
            this.f66755b = qVar;
        }

        public static <E> Set<List<E>> a(List<? extends Set<? extends E>> list) {
            h1.a aVar = new h1.a(list.size());
            Iterator<? extends Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                q1 q1VarCopyOf = q1.copyOf((Collection) it.next());
                if (q1VarCopyOf.isEmpty()) {
                    return q1.of();
                }
                aVar.add((h1.a) q1VarCopyOf);
            }
            h1<E> h1VarBuild = aVar.build();
            return new f(h1VarBuild, new q(new a(h1VarBuild)));
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return obj instanceof f ? this.f66754a.equals(((f) obj).f66754a) : super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i10 = 1;
            int size = size() - 1;
            for (int i11 = 0; i11 < this.f66754a.size(); i11++) {
                size = ~(~(size * 31));
            }
            q3<q1<E>> it = this.f66754a.iterator();
            while (it.hasNext()) {
                q1<E> next = it.next();
                i10 = ~(~((next.hashCode() * (size() / next.size())) + (i10 * 31)));
            }
            return ~(~(i10 + size));
        }

        @Override // io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: a */
        public Collection<List<E>> delegate() {
            return this.f66755b;
        }
    }

    public static boolean a(Set<?> set, Collection<?> collection) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        if (collection instanceof h2) {
            collection = ((h2) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return w1.removeAll(set.iterator(), collection);
        }
        return a(set, collection.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, io.odeeo.internal.t0.v<? super E> vVar) {
        if (navigableSet instanceof h) {
            h hVar = (h) navigableSet;
            return new g((NavigableSet) hVar.f67037a, io.odeeo.internal.t0.w.and(hVar.f67038b, vVar));
        }
        return new g((NavigableSet) io.odeeo.internal.t0.u.checkNotNull(navigableSet), (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar));
    }
}
