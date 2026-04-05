package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d1;
import io.odeeo.internal.u0.q1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s1<E> extends t1<E> implements NavigableSet<E>, g3<E> {

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparator<? super E> f67051c;

    /* renamed from: d, reason: collision with root package name */
    public transient s1<E> f67052d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<E> extends q1.a<E> {

        /* renamed from: f, reason: collision with root package name */
        public final Comparator<? super E> f67053f;

        public a(Comparator<? super E> comparator) {
            this.f67053f = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.a add(Object obj) {
            return add((a<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.b add(Object obj) {
            return add((a<E>) obj);
        }

        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.b
        public s1<E> build() {
            s1<E> s1VarA = s1.a(this.f67053f, this.f66650b, this.f66649a);
            this.f66650b = s1VarA.size();
            this.f66651c = true;
            return s1VarA;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ q1.a add(Object obj) {
            return add((a<E>) obj);
        }

        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> add(E e10) {
            super.add((a<E>) e10);
            return this;
        }

        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.b
        public a<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // io.odeeo.internal.u0.q1.a, io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<? super E> f67054a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f67055b;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f67054a = comparator;
            this.f67055b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new a(this.f67054a).add(this.f67055b).build();
        }
    }

    public s1(Comparator<? super E> comparator) {
        this.f67051c = comparator;
    }

    public static <E> z2<E> a(Comparator<? super E> comparator) {
        return p2.natural().equals(comparator) ? (z2<E>) z2.f67222f : new z2<>(h1.of(), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 copyOf(Comparable[] comparableArr) {
        return a(p2.natural(), comparableArr.length, (Object[]) comparableArr.clone());
    }

    public static <E> s1<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparator = h3.comparator(sortedSet);
        h1 h1VarCopyOf = h1.copyOf((Collection) sortedSet);
        return h1VarCopyOf.isEmpty() ? a(comparator) : new z2(h1VarCopyOf, comparator);
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(p2.natural());
    }

    public static <E> s1<E> of() {
        return z2.f67222f;
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(Collections.reverseOrder());
    }

    public abstract s1<E> a(E e10, boolean z10);

    public abstract s1<E> a(E e10, boolean z10, E e11, boolean z11);

    public abstract s1<E> b(E e10, boolean z10);

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        return (E) v1.getFirst(tailSet((s1<E>) e10, true), null);
    }

    @Override // java.util.SortedSet, io.odeeo.internal.u0.g3
    public Comparator<? super E> comparator() {
        return this.f67051c;
    }

    @Override // java.util.NavigableSet
    public abstract q3<E> descendingIterator();

    public abstract s1<E> f();

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return (E) w1.getNext(headSet((s1<E>) e10, true).descendingIterator(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        return headSet((s1<E>) obj, z10);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return (E) v1.getFirst(tailSet((s1<E>) e10, false), null);
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract q3<E> iterator();

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        return (E) w1.getNext(headSet((s1<E>) e10, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return subSet((boolean) obj, z10, (boolean) obj2, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        return tailSet((s1<E>) obj, z10);
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new b(this.f67051c, toArray());
    }

    public static <E> s1<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(p2.natural(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 of(Comparable comparable) {
        return new z2(h1.of(comparable), p2.natural());
    }

    @Override // java.util.NavigableSet
    public s1<E> descendingSet() {
        s1<E> s1Var = this.f67052d;
        if (s1Var != null) {
            return s1Var;
        }
        s1<E> s1VarF = f();
        this.f67052d = s1VarF;
        s1VarF.f67052d = this;
        return s1VarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet((s1<E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet((s1<E>) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 of(Comparable comparable, Comparable comparable2) {
        return a(p2.natural(), 2, comparable, comparable2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public s1<E> headSet(E e10) {
        return headSet((s1<E>) e10, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public s1<E> subSet(E e10, E e11) {
        return subSet((boolean) e10, true, (boolean) e11, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public s1<E> tailSet(E e10) {
        return tailSet((s1<E>) e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> s1<E> a(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return a(comparator);
        }
        m2.a((Object[]) eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            a0.d dVar = (Object) eArr[i12];
            if (comparator.compare(dVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = dVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new z2(h1.b(eArr, i11), comparator);
    }

    public static <E> s1<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) p2.natural(), (Collection) collection);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return a(p2.natural(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public s1<E> headSet(E e10, boolean z10) {
        return a((s1<E>) io.odeeo.internal.t0.u.checkNotNull(e10), z10);
    }

    @Override // java.util.NavigableSet
    public s1<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        io.odeeo.internal.t0.u.checkNotNull(e10);
        io.odeeo.internal.t0.u.checkNotNull(e11);
        io.odeeo.internal.t0.u.checkArgument(this.f67051c.compare(e10, e11) <= 0);
        return a(e10, z10, e11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public s1<E> tailSet(E e10, boolean z10) {
        return b((s1<E>) io.odeeo.internal.t0.u.checkNotNull(e10), z10);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return a(p2.natural(), 4, comparable, comparable2, comparable3, comparable4);
    }

    public static <E> s1<E> copyOf(Iterator<? extends E> it) {
        return copyOf(p2.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return a(p2.natural(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lio/odeeo/internal/u0/s1<TE;>; */
    public static s1 of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return a(p2.natural(), length, comparableArr2);
    }

    public static <E> s1<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).addAll((Iterator) it).build();
    }

    public static <E> s1<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(comparator);
        if (h3.hasSameComparator(comparator, iterable) && (iterable instanceof s1)) {
            s1<E> s1Var = (s1) iterable;
            if (!s1Var.isPartialView()) {
                return s1Var;
            }
        }
        Object[] objArrB = v1.b(iterable);
        return a(comparator, objArrB.length, objArrB);
    }

    public static <E> s1<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    public int a(Object obj, Object obj2) {
        return a(this.f67051c, obj, obj2);
    }

    public static int a(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }
}
