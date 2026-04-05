package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d6 extends u4 implements ud {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f76175f = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient b5 f76176c;

    /* renamed from: e, reason: collision with root package name */
    public transient l6 f76177e;

    public static <E> b6 builder() {
        return new b6();
    }

    public static <E> d6 copyOf(E[] eArr) {
        return f(eArr);
    }

    public static d6 f(Object... objArr) {
        return new b6().add(objArr).build();
    }

    public static d6 g(Collection collection) {
        b6 b6Var = new b6(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            td tdVar = (td) it.next();
            b6Var.addCopies(tdVar.getElement(), tdVar.getCount());
        }
        return b6Var.build();
    }

    public static <E> d6 of() {
        return nf.f76507j;
    }

    public static <E> Collector<E, ?, d6> toImmutableMultiset() {
        return i1.b(Function.identity(), new z5());
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        ej it = entrySet().iterator();
        while (it.hasNext()) {
            td tdVar = (td) it.next();
            Arrays.fill(objArr, i10, tdVar.getCount() + i10, tdVar.getElement());
            i10 += tdVar.getCount();
        }
        return i10;
    }

    @Override // nh.ud
    @Deprecated
    public final int add(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.u4
    public b5 asList() {
        b5 b5Var = this.f76176c;
        if (b5Var != null) {
            return b5Var;
        }
        b5 b5VarAsList = super.asList();
        this.f76176c = b5VarAsList;
        return b5VarAsList;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // nh.ud
    public abstract /* synthetic */ int count(Object obj);

    @Override // nh.ud
    public abstract l6 elementSet();

    @Override // java.util.Collection, nh.ud
    public boolean equals(Object obj) {
        return le.a(this, obj);
    }

    public abstract td h(int i10);

    @Override // java.util.Collection, nh.ud
    public int hashCode() {
        return og.b(entrySet());
    }

    @Override // nh.ud
    @Deprecated
    public final int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.ud
    @Deprecated
    public final int setCount(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, nh.ud
    public String toString() {
        return entrySet().toString();
    }

    public static <E> d6 copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof d6) {
            d6 d6Var = (d6) iterable;
            if (!d6Var.isPartialView()) {
                return d6Var;
            }
        }
        b6 b6Var = new b6(iterable instanceof ud ? ((ud) iterable).elementSet().size() : 11);
        b6Var.addAll((Iterable<Object>) iterable);
        return b6Var.build();
    }

    public static <E> d6 of(E e10) {
        return f(e10);
    }

    public static <T, E> Collector<T, ?, d6> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return i1.b(function, toIntFunction);
    }

    @Override // nh.ud
    public l6 entrySet() {
        l6 l6VarOf = this.f76177e;
        if (l6VarOf == null) {
            l6VarOf = isEmpty() ? l6.of() : new c6(this);
            this.f76177e = l6VarOf;
        }
        return l6VarOf;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return new a6(entrySet().iterator());
    }

    @Override // nh.ud
    @Deprecated
    public final boolean setCount(Object obj, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public static <E> d6 of(E e10, E e11) {
        return f(e10, e11);
    }

    public static <E> d6 of(E e10, E e11, E e12) {
        return f(e10, e11, e12);
    }

    public static <E> d6 of(E e10, E e11, E e12, E e13) {
        return f(e10, e11, e12, e13);
    }

    public static <E> d6 of(E e10, E e11, E e12, E e13, E e14) {
        return f(e10, e11, e12, e13, e14);
    }

    public static <E> d6 of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        return new b6().add((Object) e10).add((Object) e11).add((Object) e12).add((Object) e13).add((Object) e14).add((Object) e15).add((Object[]) eArr).build();
    }

    public static <E> d6 copyOf(Iterator<? extends E> it) {
        return new b6().addAll((Iterator<Object>) it).build();
    }
}
