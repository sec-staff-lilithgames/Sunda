package nh;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t1 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final b5 f76648b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator f76649c;

    /* renamed from: e, reason: collision with root package name */
    public final int f76650e;

    public t1(Iterable iterable, Comparator comparator) {
        int iSaturatedMultiply;
        b5 b5VarSortedCopyOf = b5.sortedCopyOf(comparator, iterable);
        this.f76648b = b5VarSortedCopyOf;
        this.f76649c = comparator;
        int i10 = 1;
        int iSaturatedMultiply2 = 1;
        int i11 = 1;
        while (true) {
            if (i10 >= b5VarSortedCopyOf.size()) {
                iSaturatedMultiply = qh.f.saturatedMultiply(iSaturatedMultiply2, qh.f.binomial(i10, i11));
                break;
            }
            if (comparator.compare(b5VarSortedCopyOf.get(i10 - 1), b5VarSortedCopyOf.get(i10)) < 0) {
                iSaturatedMultiply2 = qh.f.saturatedMultiply(iSaturatedMultiply2, qh.f.binomial(i10, i11));
                iSaturatedMultiply = Integer.MAX_VALUE;
                if (iSaturatedMultiply2 == Integer.MAX_VALUE) {
                    break;
                } else {
                    i11 = 0;
                }
            }
            i10++;
            i11++;
        }
        this.f76650e = iSaturatedMultiply;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return y1.a(this.f76648b, (List) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<List<Object>> iterator() {
        return new u1(this.f76648b, this.f76649c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76650e;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "orderedPermutationCollection(" + this.f76648b + ")";
    }
}
