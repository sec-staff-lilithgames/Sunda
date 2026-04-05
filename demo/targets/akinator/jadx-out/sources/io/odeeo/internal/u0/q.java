package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h1;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final transient h1<List<E>> f67024a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int[] f67025b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends h1<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f67026c;

        public a(int i10) {
            this.f67026c = i10;
        }

        @Override // java.util.List
        public E get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            return (E) ((List) q.this.f67024a.get(i10)).get(q.this.a(this.f67026c, i10));
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return q.this.f67024a.size();
        }
    }

    public q(h1<List<E>> h1Var) {
        this.f67024a = h1Var;
        int[] iArr = new int[h1Var.size() + 1];
        iArr[h1Var.size()] = 1;
        try {
            for (int size = h1Var.size() - 1; size >= 0; size--) {
                iArr[size] = io.odeeo.internal.v0.a.checkedMultiply(iArr[size + 1], h1Var.get(size).size());
            }
            this.f67025b = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f67024a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.f67024a.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i10 += iIndexOf * this.f67025b[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f67025b[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public h1<E> get(int i10) {
        io.odeeo.internal.t0.u.checkElementIndex(i10, size());
        return new a(i10);
    }

    public static <E> List<List<E>> a(List<? extends List<? extends E>> list) {
        h1.a aVar = new h1.a(list.size());
        Iterator<? extends List<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            h1 h1VarCopyOf = h1.copyOf((Collection) it.next());
            if (h1VarCopyOf.isEmpty()) {
                return h1.of();
            }
            aVar.add((h1.a) h1VarCopyOf);
        }
        return new q(aVar.build());
    }

    public final int a(int i10, int i11) {
        return (i10 / this.f67025b[i11 + 1]) % this.f67024a.get(i11).size();
    }
}
