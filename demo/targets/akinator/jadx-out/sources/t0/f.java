package t0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.e0;
import p0.a3;
import qv.v;
import uu.f0;
import uu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends o implements s0.i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f86226k = 0;

    /* renamed from: b, reason: collision with root package name */
    public s0.j f86227b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f86228c;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f86229e;

    /* renamed from: f, reason: collision with root package name */
    public int f86230f;

    /* renamed from: g, reason: collision with root package name */
    public y0.e f86231g = new y0.e();

    /* renamed from: h, reason: collision with root package name */
    public Object[] f86232h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f86233i;

    /* renamed from: j, reason: collision with root package name */
    public int f86234j;

    public f(s0.j jVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f86227b = jVar;
        this.f86228c = objArr;
        this.f86229e = objArr2;
        this.f86230f = i10;
        this.f86232h = this.f86228c;
        this.f86233i = this.f86229e;
        this.f86234j = this.f86227b.size();
    }

    public static void a(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final void A(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrI;
        if (i12 < 1) {
            a3.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrG = g(objArr);
        objArr2[0] = objArrG;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            f0.copyInto(objArrG, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrI = objArrG;
            } else {
                objArrI = i();
                i12--;
                objArr2[i12] = objArrI;
            }
            int i16 = i11 - i15;
            f0.copyInto(objArrG, objArr3, 0, i16, i11);
            f0.copyInto(objArrG, objArrI, size + 1, i13, i16);
            objArr3 = objArrI;
        }
        Iterator it = collection.iterator();
        a(objArrG, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrI2 = i();
            a(objArrI2, 0, it);
            objArr2[i17] = objArrI2;
        }
        a(objArr3, 0, it);
    }

    public final int B() {
        int size = size();
        return size <= 32 ? size : size - l.rootSize(size);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iB = B();
        if (iB < 32) {
            Object[] objArrG = g(this.f86233i);
            objArrG[iB] = obj;
            this.f86233i = objArrG;
            this.f86234j = size() + 1;
        } else {
            r(this.f86232h, this.f86233i, j(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iB = B();
        Iterator<Object> it = collection.iterator();
        if (32 - iB >= collection.size()) {
            Object[] objArrG = g(this.f86233i);
            a(objArrG, iB, it);
            this.f86233i = objArrG;
            this.f86234j = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + iB) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrG2 = g(this.f86233i);
        a(objArrG2, iB, it);
        objArr[0] = objArrG2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrI = i();
            a(objArrI, 0, it);
            objArr[i10] = objArrI;
        }
        this.f86232h = q(this.f86232h, y(), objArr);
        Object[] objArrI2 = i();
        a(objArrI2, 0, it);
        this.f86233i = objArrI2;
        this.f86234j = collection.size() + size();
        return true;
    }

    public final void b(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f86232h == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarF = f(y() >> 5);
        int i14 = i12;
        Object[] objArrH = objArr2;
        while (aVarF.previousIndex() != i13) {
            Object[] objArr3 = (Object[]) aVarF.previous();
            f0.copyInto(objArr3, objArrH, 0, 32 - i11, 32);
            objArrH = h(i11, objArr3);
            i14--;
            objArr[i14] = objArrH;
        }
        Object[] objArr4 = (Object[]) aVarF.previous();
        int iY = i12 - (((y() >> 5) - 1) - i13);
        if (iY < i12) {
            objArr2 = objArr[iY];
            e0.checkNotNull(objArr2);
        }
        A(collection, i10, objArr4, 32, objArr, iY, objArr2);
    }

    public final Object[] c(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object obj2;
        int iIndexSegment = l.indexSegment(i11, i10);
        if (i10 == 0) {
            dVar.setValue(objArr[31]);
            Object[] objArrCopyInto = f0.copyInto(objArr, g(objArr), iIndexSegment + 1, iIndexSegment, 31);
            objArrCopyInto[iIndexSegment] = obj;
            return objArrCopyInto;
        }
        Object[] objArrG = g(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrG[iIndexSegment];
        e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrG[iIndexSegment] = c((Object[]) obj3, i12, i11, obj, dVar);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj2 = objArrG[iIndexSegment]) == null) {
                break;
            }
            e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrG[iIndexSegment] = c((Object[]) obj2, i12, 0, dVar.getValue(), dVar);
        }
        return objArrG;
    }

    public final void d(Object obj, Object[] objArr, int i10) {
        int iB = B();
        Object[] objArrG = g(this.f86233i);
        if (iB < 32) {
            f0.copyInto(this.f86233i, objArrG, i10 + 1, i10, iB);
            objArrG[i10] = obj;
            this.f86232h = objArr;
            this.f86233i = objArrG;
            this.f86234j = size() + 1;
            return;
        }
        Object[] objArr2 = this.f86233i;
        Object obj2 = objArr2[31];
        f0.copyInto(objArr2, objArrG, i10 + 1, i10, 31);
        objArrG[i10] = obj;
        r(objArr, objArrG, j(obj2));
    }

    public final boolean e(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f86231g;
    }

    public final a f(int i10) {
        Object[] objArr = this.f86232h;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iY = y() >> 5;
        y0.d.checkPositionIndex$runtime(i10, iY);
        int i11 = this.f86230f;
        return i11 == 0 ? new i(objArr, i10) : new k(objArr, i10, iY, i11 / 5);
    }

    public final Object[] g(Object[] objArr) {
        return objArr == null ? i() : e(objArr) ? objArr : f0.copyInto$default(objArr, i(), 0, 0, v.coerceAtMost(objArr.length, 32), 6, (Object) null);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        Object[] objArr;
        y0.d.checkElementIndex$runtime(i10, size());
        if (y() <= i10) {
            objArr = this.f86233i;
        } else {
            objArr = this.f86232h;
            e0.checkNotNull(objArr);
            for (int i11 = this.f86230f; i11 > 0; i11 -= 5) {
                Object obj = objArr[l.indexSegment(i10, i11)];
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final int getModCount$runtime() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] getRoot$runtime() {
        return this.f86232h;
    }

    public final int getRootShift$runtime() {
        return this.f86230f;
    }

    @Override // uu.o
    public int getSize() {
        return this.f86234j;
    }

    public final Object[] getTail$runtime() {
        return this.f86233i;
    }

    public final Object[] h(int i10, Object[] objArr) {
        return e(objArr) ? f0.copyInto(objArr, objArr, i10, 0, 32 - i10) : f0.copyInto(objArr, i(), i10, 0, 32 - i10);
    }

    public final Object[] i() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f86231g;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator();
    }

    public final Object[] j(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f86231g;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    public final Object[] m(int i10, int i11, Object[] objArr) {
        if (!(i11 >= 0)) {
            a3.throwIllegalArgumentException("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iIndexSegment = l.indexSegment(i10, i11);
        Object obj = objArr[iIndexSegment];
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM = m(i10, i11 - 5, (Object[]) obj);
        if (iIndexSegment < 31) {
            int i12 = iIndexSegment + 1;
            if (objArr[i12] != null) {
                if (e(objArr)) {
                    f0.fill(objArr, (Object) null, i12, 32);
                }
                objArr = f0.copyInto(objArr, i(), 0, 0, i12);
            }
        }
        if (objM == objArr[iIndexSegment]) {
            return objArr;
        }
        Object[] objArrG = g(objArr);
        objArrG[iIndexSegment] = objM;
        return objArrG;
    }

    public final Object[] n(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrN;
        int iIndexSegment = l.indexSegment(i11 - 1, i10);
        if (i10 == 5) {
            dVar.setValue(objArr[iIndexSegment]);
            objArrN = null;
        } else {
            Object obj = objArr[iIndexSegment];
            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN = n((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrN == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrG = g(objArr);
        objArrG[iIndexSegment] = objArrN;
        return objArrG;
    }

    public final void o(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.f86232h = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f86233i = objArr;
            this.f86234j = i10;
            this.f86230f = i11;
            return;
        }
        d dVar = new d(null);
        e0.checkNotNull(objArr);
        Object[] objArrN = n(objArr, i11, i10, dVar);
        e0.checkNotNull(objArrN);
        Object value = dVar.getValue();
        e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f86233i = (Object[]) value;
        this.f86234j = i10;
        if (objArrN[1] == null) {
            this.f86232h = (Object[]) objArrN[0];
            this.f86230f = i11 - 5;
        } else {
            this.f86232h = objArrN;
            this.f86230f = i11;
        }
    }

    public final Object[] p(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            a3.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            a3.throwIllegalArgumentException("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrG = g(objArr);
        int iIndexSegment = l.indexSegment(i10, i11);
        int i12 = i11 - 5;
        objArrG[iIndexSegment] = p((Object[]) objArrG[iIndexSegment], i10, i12, it);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !it.hasNext()) {
                break;
            }
            objArrG[iIndexSegment] = p((Object[]) objArrG[iIndexSegment], 0, i12, it);
        }
        return objArrG;
    }

    public final Object[] q(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator it = kotlin.jvm.internal.i.iterator(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f86230f;
        Object[] objArrP = i11 < (1 << i12) ? p(objArr, i10, i12, it) : g(objArr);
        while (it.hasNext()) {
            this.f86230f += 5;
            objArrP = j(objArrP);
            int i13 = this.f86230f;
            p(objArrP, 1 << i13, i13, it);
        }
        return objArrP;
    }

    public final void r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f86230f;
        if (size > (1 << i10)) {
            this.f86232h = s(j(objArr), objArr2, this.f86230f + 5);
            this.f86233i = objArr3;
            this.f86230f += 5;
            this.f86234j = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f86232h = objArr2;
            this.f86233i = objArr3;
            this.f86234j = size() + 1;
        } else {
            this.f86232h = s(objArr, objArr2, i10);
            this.f86233i = objArr3;
            this.f86234j = size() + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return removeAllWithPredicate(new b1.e0(5, collection));
    }

    public final boolean removeAllWithPredicate(kv.l lVar) {
        Object[] objArrP;
        int i10;
        kv.l lVar2 = lVar;
        int iB = B();
        Object[] objArrM = null;
        d dVar = new d(null);
        boolean z10 = false;
        if (this.f86232h != null) {
            a aVarF = f(0);
            int iU = 32;
            while (iU == 32 && aVarF.hasNext()) {
                iU = u(lVar2, (Object[]) aVarF.next(), 32, dVar);
            }
            if (iU == 32) {
                y0.a.m8013assert(!aVarF.hasNext());
                int iV = v(lVar2, iB, dVar);
                if (iV == 0) {
                    o(size(), this.f86230f, this.f86232h);
                }
                if (iV != iB) {
                }
            } else {
                int iPreviousIndex = aVarF.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iT = iU;
                while (aVarF.hasNext()) {
                    iT = t(lVar2, (Object[]) aVarF.next(), 32, iT, dVar, arrayList2, arrayList);
                    lVar2 = lVar;
                }
                int iT2 = t(lVar, this.f86233i, iB, iT, dVar, arrayList2, arrayList);
                Object value = dVar.getValue();
                e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) value;
                f0.fill(objArr, (Object) null, iT2, 32);
                if (arrayList.isEmpty()) {
                    objArrP = this.f86232h;
                    e0.checkNotNull(objArrP);
                } else {
                    objArrP = p(this.f86232h, iPreviousIndex, this.f86230f, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    a3.throwIllegalArgumentException("invalid size");
                }
                if (size == 0) {
                    this.f86230f = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i10 = this.f86230f;
                        if ((i11 >> i10) != 0) {
                            break;
                        }
                        this.f86230f = i10 - 5;
                        Object[] objArr2 = objArrP[0];
                        e0.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrP = objArr2;
                    }
                    objArrM = m(i11, i10, objArrP);
                }
                this.f86232h = objArrM;
                this.f86233i = objArr;
                this.f86234j = size + iT2;
            }
            z10 = true;
        } else if (v(lVar2, iB, dVar) != iB) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    @Override // uu.o
    public Object removeAt(int i10) {
        y0.d.checkElementIndex$runtime(i10, size());
        ((AbstractList) this).modCount++;
        int iY = y();
        if (i10 >= iY) {
            return x(this.f86232h, iY, this.f86230f, i10 - iY);
        }
        d dVar = new d(this.f86233i[0]);
        Object[] objArr = this.f86232h;
        e0.checkNotNull(objArr);
        x(w(objArr, this.f86230f, i10, dVar), iY, this.f86230f, 0);
        return dVar.getValue();
    }

    public final Object[] s(Object[] objArr, Object[] objArr2, int i10) {
        int iIndexSegment = l.indexSegment(size() - 1, i10);
        Object[] objArrG = g(objArr);
        if (i10 == 5) {
            objArrG[iIndexSegment] = objArr2;
            return objArrG;
        }
        objArrG[iIndexSegment] = s((Object[]) objArrG[iIndexSegment], objArr2, i10 - 5);
        return objArrG;
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        y0.d.checkElementIndex$runtime(i10, size());
        if (y() > i10) {
            d dVar = new d(null);
            Object[] objArr = this.f86232h;
            e0.checkNotNull(objArr);
            this.f86232h = z(objArr, this.f86230f, i10, obj, dVar);
            return dVar.getValue();
        }
        Object[] objArrG = g(this.f86233i);
        if (objArrG != this.f86233i) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrG[i11];
        objArrG[i11] = obj;
        this.f86233i = objArrG;
        return obj2;
    }

    public final void setRootShift$runtime(int i10) {
        this.f86230f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int t(kv.l lVar, Object[] objArr, int i10, int i11, d dVar, ArrayList arrayList, ArrayList arrayList2) {
        if (e(objArr)) {
            arrayList.add(objArr);
        }
        Object value = dVar.getValue();
        e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArrI = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrI = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : i();
                    i11 = 0;
                }
                objArrI[i11] = obj;
                i11++;
            }
        }
        dVar.setValue(objArrI);
        if (objArr2 != dVar.getValue()) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int u(kv.l lVar, Object[] objArr, int i10, d dVar) {
        Object[] objArrG = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrG = g(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrG[i11] = obj;
                i11++;
            }
        }
        dVar.setValue(objArrG);
        return i11;
    }

    public final int v(kv.l lVar, int i10, d dVar) {
        int iU = u(lVar, this.f86233i, i10, dVar);
        if (iU == i10) {
            y0.a.m8013assert(dVar.getValue() == this.f86233i);
            return i10;
        }
        Object value = dVar.getValue();
        e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        f0.fill(objArr, (Object) null, iU, i10);
        this.f86233i = objArr;
        this.f86234j = size() - (i10 - iU);
        return iU;
    }

    public final Object[] w(Object[] objArr, int i10, int i11, d dVar) {
        int iIndexSegment = l.indexSegment(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iIndexSegment];
            Object[] objArrCopyInto = f0.copyInto(objArr, g(objArr), iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyInto[31] = dVar.getValue();
            dVar.setValue(obj);
            return objArrCopyInto;
        }
        int iIndexSegment2 = objArr[31] == null ? l.indexSegment(y() - 1, i10) : 31;
        Object[] objArrG = g(objArr);
        int i12 = i10 - 5;
        int i13 = iIndexSegment + 1;
        if (i13 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrG[iIndexSegment2];
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrG[iIndexSegment2] = w((Object[]) obj2, i12, 0, dVar);
                if (iIndexSegment2 == i13) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrG[iIndexSegment];
        e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrG[iIndexSegment] = w((Object[]) obj3, i12, i11, dVar);
        return objArrG;
    }

    public final Object x(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        y0.a.m8013assert(i12 < size);
        if (size == 1) {
            Object obj = this.f86233i[0];
            o(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f86233i;
        Object obj2 = objArr2[i12];
        Object[] objArrCopyInto = f0.copyInto(objArr2, g(objArr2), i12, i12 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.f86232h = objArr;
        this.f86233i = objArrCopyInto;
        this.f86234j = (i10 + size) - 1;
        this.f86230f = i11;
        return obj2;
    }

    public final int y() {
        if (size() <= 32) {
            return 0;
        }
        return l.rootSize(size());
    }

    public final Object[] z(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        int iIndexSegment = l.indexSegment(i11, i10);
        Object[] objArrG = g(objArr);
        if (i10 != 0) {
            Object obj2 = objArrG[iIndexSegment];
            e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrG[iIndexSegment] = z((Object[]) obj2, i10 - 5, i11, obj, dVar);
            return objArrG;
        }
        if (objArrG != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.setValue(objArrG[iIndexSegment]);
        objArrG[iIndexSegment] = obj;
        return objArrG;
    }

    @Override // s0.i, s0.g
    public s0.j build() {
        s0.j eVar;
        if (this.f86232h == this.f86228c && this.f86233i == this.f86229e) {
            eVar = this.f86227b;
        } else {
            this.f86231g = new y0.e();
            Object[] objArr = this.f86232h;
            this.f86228c = objArr;
            Object[] objArr2 = this.f86233i;
            this.f86229e = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f86232h;
                e0.checkNotNull(objArr3);
                eVar = new e(objArr3, this.f86233i, size(), this.f86230f);
            } else if (objArr2.length == 0) {
                eVar = l.persistentVectorOf();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f86233i, size());
                e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.f86227b = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        y0.d.checkPositionIndex$runtime(i10, size());
        return new h(this, i10);
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        y0.d.checkPositionIndex$runtime(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iY = y();
        if (i10 >= iY) {
            d(obj, this.f86232h, i10 - iY);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f86232h;
        e0.checkNotNull(objArr);
        d(dVar.getValue(), c(objArr, this.f86230f, i10, obj, dVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        Collection<Object> collection2;
        f fVar;
        Object[] objArrCopyInto;
        y0.d.checkPositionIndex$runtime(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (size() - i11)) - 1) / 32;
        if (size == 0) {
            y0.a.m8013assert(i10 >= y());
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f86233i;
            Object[] objArrCopyInto2 = f0.copyInto(objArr, g(objArr), size2 + 1, i12, B());
            a(objArrCopyInto2, i12, collection.iterator());
            this.f86233i = objArrCopyInto2;
            this.f86234j = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iB = B();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= l.rootSize(size3);
        }
        if (i10 >= y()) {
            objArrCopyInto = i();
            collection2 = collection;
            A(collection2, i10, this.f86233i, iB, objArr2, size, objArrCopyInto);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iB) {
                int i13 = size3 - iB;
                Object[] objArrH = h(i13, fVar.f86233i);
                fVar.b(collection2, i10, i13, objArr2, size, objArrH);
                objArr2 = objArr2;
                objArrCopyInto = objArrH;
            } else {
                int i14 = iB - size3;
                objArrCopyInto = f0.copyInto(fVar.f86233i, i(), 0, i14, iB);
                int i15 = 32 - i14;
                Object[] objArrH2 = h(i15, fVar.f86233i);
                int i16 = size - 1;
                objArr2[i16] = objArrH2;
                fVar.b(collection2, i10, i15, objArr2, i16, objArrH2);
                collection2 = collection2;
            }
        }
        fVar.f86232h = q(fVar.f86232h, i11, objArr2);
        fVar.f86233i = objArrCopyInto;
        fVar.f86234j = collection2.size() + size();
        return true;
    }
}
