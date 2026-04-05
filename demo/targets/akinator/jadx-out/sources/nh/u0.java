package nh;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 extends AbstractList implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f76674e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final transient b5 f76675b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int[] f76676c;

    public u0(b5 b5Var) {
        this.f76675b = b5Var;
        int[] iArr = new int[b5Var.size() + 1];
        iArr[b5Var.size()] = 1;
        try {
            for (int size = b5Var.size() - 1; size >= 0; size--) {
                iArr[size] = Math.multiplyExact(iArr[size + 1], ((List) b5Var.get(size)).size());
            }
            this.f76676c = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    public static int a(u0 u0Var, int i10, int i11) {
        return (i10 / u0Var.f76676c[i11 + 1]) % ((List) u0Var.f76675b.get(i11)).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = list.size();
        b5 b5Var = this.f76675b;
        if (size != b5Var.size()) {
            return false;
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!((List) b5Var.get(i10)).contains(it.next())) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        int size = list.size();
        b5 b5Var = this.f76675b;
        if (size != b5Var.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = ((List) b5Var.get(iNextIndex)).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i10 += iIndexOf * this.f76676c[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        int size = list.size();
        b5 b5Var = this.f76675b;
        if (size != b5Var.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = ((List) b5Var.get(iNextIndex)).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i10 += iLastIndexOf * this.f76676c[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76676c[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public b5 get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        return new t0(this, i10);
    }
}
