package nh;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h2 extends AbstractSet implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient Object f76315b;

    /* renamed from: c, reason: collision with root package name */
    public transient int[] f76316c;

    /* renamed from: e, reason: collision with root package name */
    public transient Object[] f76317e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f76318f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f76319g;

    public h2() {
        i(3);
    }

    public static <E> h2 create() {
        return new h2();
    }

    public static <E> h2 createWithExpectedSize(int i10) {
        return new h2(i10);
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int iMin;
        if (n()) {
            c();
        }
        Set setE = e();
        if (setE != null) {
            return setE.add(obj);
        }
        int[] iArrP = p();
        Object[] objArrO = o();
        int i10 = this.f76319g;
        int i11 = i10 + 1;
        int iG = kotlin.jvm.internal.d0.G(obj);
        int iH = h();
        int i12 = iG & iH;
        Object obj2 = this.f76315b;
        Objects.requireNonNull(obj2);
        int iR = kc.p.R(i12, obj2);
        if (iR != 0) {
            int i13 = ~iH;
            int i14 = iG & i13;
            int i15 = 0;
            while (true) {
                int i16 = iR - 1;
                int i17 = iArrP[i16];
                if ((i17 & i13) == i14 && Objects.equals(obj, objArrO[i16])) {
                    return false;
                }
                int i18 = i17 & iH;
                i15++;
                if (i18 != 0) {
                    iR = i18;
                } else {
                    if (i15 >= 9) {
                        return d().add(obj);
                    }
                    if (i11 > iH) {
                        iH = r(iH, kc.p.G(iH), iG, i10);
                    } else {
                        iArrP[i16] = kc.p.F(i17, i11, iH);
                    }
                }
            }
        } else if (i11 > iH) {
            iH = r(iH, kc.p.G(iH), iG, i10);
        } else {
            Object obj3 = this.f76315b;
            Objects.requireNonNull(obj3);
            kc.p.S(i12, i11, obj3);
        }
        int length = p().length;
        if (i11 > length && (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            q(iMin);
        }
        j(i10, iG, iH, obj);
        this.f76319g = i11;
        this.f76318f += 32;
        return true;
    }

    public int c() {
        mh.p1.checkState(n(), "Arrays already allocated");
        int i10 = this.f76318f;
        int iT = kc.p.T(i10);
        this.f76315b = kc.p.f(iT);
        this.f76318f = kc.p.F(this.f76318f, 32 - Integer.numberOfLeadingZeros(iT - 1), 31);
        this.f76316c = new int[i10];
        this.f76317e = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (n()) {
            return;
        }
        this.f76318f += 32;
        Set setE = e();
        if (setE != null) {
            this.f76318f = rh.w.constrainToRange(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            setE.clear();
            this.f76315b = null;
            this.f76319g = 0;
            return;
        }
        Arrays.fill(o(), 0, this.f76319g, (Object) null);
        Object obj = this.f76315b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(p(), 0, this.f76319g, 0);
        this.f76319g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (n()) {
            return false;
        }
        Set setE = e();
        if (setE != null) {
            return setE.contains(obj);
        }
        int iG = kotlin.jvm.internal.d0.G(obj);
        int iH = h();
        Object obj2 = this.f76315b;
        Objects.requireNonNull(obj2);
        int iR = kc.p.R(iG & iH, obj2);
        if (iR == 0) {
            return false;
        }
        int i10 = ~iH;
        int i11 = iG & i10;
        do {
            int i12 = iR - 1;
            int i13 = p()[i12];
            if ((i13 & i10) == i11 && Objects.equals(obj, o()[i12])) {
                return true;
            }
            iR = i13 & iH;
        } while (iR != 0);
        return false;
    }

    public LinkedHashSet d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
        int iF = f();
        while (iF >= 0) {
            linkedHashSet.add(o()[iF]);
            iF = g(iF);
        }
        this.f76315b = linkedHashSet;
        this.f76316c = null;
        this.f76317e = null;
        this.f76318f += 32;
        return linkedHashSet;
    }

    public final Set e() {
        Object obj = this.f76315b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int f() {
        return isEmpty() ? -1 : 0;
    }

    public int g(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f76319g) {
            return i11;
        }
        return -1;
    }

    public final int h() {
        return (1 << (this.f76318f & 31)) - 1;
    }

    public void i(int i10) {
        mh.p1.checkArgument(i10 >= 0, "Expected size must be >= 0");
        this.f76318f = rh.w.constrainToRange(i10, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        Set setE = e();
        return setE != null ? setE.iterator() : new g2(this);
    }

    public void j(int i10, int i11, int i12, Object obj) {
        p()[i10] = kc.p.F(i11, 0, i12);
        o()[i10] = obj;
    }

    public void m(int i10, int i11) {
        Object obj = this.f76315b;
        Objects.requireNonNull(obj);
        int[] iArrP = p();
        Object[] objArrO = o();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrO[i10] = null;
            iArrP[i10] = 0;
            return;
        }
        Object obj2 = objArrO[i12];
        objArrO[i10] = obj2;
        objArrO[i12] = null;
        iArrP[i10] = iArrP[i12];
        iArrP[i12] = 0;
        int iG = kotlin.jvm.internal.d0.G(obj2) & i11;
        int iR = kc.p.R(iG, obj);
        if (iR == size) {
            kc.p.S(iG, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iR - 1;
            int i14 = iArrP[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrP[i13] = kc.p.F(i14, i10 + 1, i11);
                return;
            }
            iR = i15;
        }
    }

    public final boolean n() {
        return this.f76315b == null;
    }

    public final Object[] o() {
        Object[] objArr = this.f76317e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] p() {
        int[] iArr = this.f76316c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void q(int i10) {
        this.f76316c = Arrays.copyOf(p(), i10);
        this.f76317e = Arrays.copyOf(o(), i10);
    }

    public final int r(int i10, int i11, int i12, int i13) {
        Object objF = kc.p.f(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            kc.p.S(i12 & i14, i13 + 1, objF);
        }
        Object obj = this.f76315b;
        Objects.requireNonNull(obj);
        int[] iArrP = p();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iR = kc.p.R(i15, obj);
            while (iR != 0) {
                int i16 = iR - 1;
                int i17 = iArrP[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iR2 = kc.p.R(i19, objF);
                kc.p.S(i19, iR, objF);
                iArrP[i16] = kc.p.F(i18, iR2, i14);
                iR = i17 & i10;
            }
        }
        this.f76315b = objF;
        this.f76318f = kc.p.F(this.f76318f, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (n()) {
            return false;
        }
        Set setE = e();
        if (setE != null) {
            return setE.remove(obj);
        }
        int iH = h();
        Object obj2 = this.f76315b;
        Objects.requireNonNull(obj2);
        int iO = kc.p.O(obj, null, iH, obj2, p(), o(), null);
        if (iO == -1) {
            return false;
        }
        m(iO, iH);
        this.f76319g--;
        this.f76318f += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set setE = e();
        return setE != null ? setE.size() : this.f76319g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (n()) {
            return new Object[0];
        }
        Set setE = e();
        return setE != null ? setE.toArray() : Arrays.copyOf(o(), this.f76319g);
    }

    public void trimToSize() {
        if (n()) {
            return;
        }
        Set setE = e();
        if (setE != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(size(), 1.0f);
            linkedHashSet.addAll(setE);
            this.f76315b = linkedHashSet;
            return;
        }
        int i10 = this.f76319g;
        if (i10 < p().length) {
            q(i10);
        }
        int iT = kc.p.T(i10);
        int iH = h();
        if (iT < iH) {
            r(iH, iT, 0, 0);
        }
    }

    public static <E> h2 create(Collection<? extends E> collection) {
        h2 h2VarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        h2VarCreateWithExpectedSize.addAll(collection);
        return h2VarCreateWithExpectedSize;
    }

    public h2(int i10) {
        i(i10);
    }

    @SafeVarargs
    public static <E> h2 create(E... eArr) {
        h2 h2VarCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(h2VarCreateWithExpectedSize, eArr);
        return h2VarCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (n()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set setE = e();
        if (setE != null) {
            return (T[]) setE.toArray(tArr);
        }
        Object[] objArrO = o();
        int i10 = this.f76319g;
        mh.p1.checkPositionIndexes(0, i10, objArrO.length);
        if (tArr.length < i10) {
            tArr = (T[]) pe.newArray(tArr, i10);
        } else if (tArr.length > i10) {
            tArr[i10] = null;
        }
        System.arraycopy(objArrO, 0, tArr, 0, i10);
        return tArr;
    }
}
