package com.bytedance.adsdk.jd;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class jpo<E> implements Collection<E>, Set<E> {

    /* renamed from: jj, reason: collision with root package name */
    private static int f17282jj;
    private static Object[] my;

    /* renamed from: qk, reason: collision with root package name */
    private static Object[] f17283qk;
    private static int xyk;

    /* renamed from: jd, reason: collision with root package name */
    int f17284jd;
    Object[] jpo;

    /* renamed from: yd, reason: collision with root package name */
    private prr<E, E> f17285yd;
    private int[] zz;
    private static final int[] wqx = new int[0];

    /* renamed from: cm, reason: collision with root package name */
    private static final Object[] f17281cm = new Object[0];

    public jpo() {
        this(0);
    }

    private void cm(int i10) {
        if (i10 == 8) {
            synchronized (jpo.class) {
                Object[] objArr = f17283qk;
                if (objArr != null) {
                    this.jpo = objArr;
                    f17283qk = (Object[]) objArr[0];
                    this.zz = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    xyk--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (jpo.class) {
                Object[] objArr2 = my;
                if (objArr2 != null) {
                    this.jpo = objArr2;
                    my = (Object[]) objArr2[0];
                    this.zz = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17282jj--;
                    return;
                }
            }
        }
        this.zz = new int[i10];
        this.jpo = new Object[i10];
    }

    private int jpo(Object obj, int i10) {
        int i11 = this.f17284jd;
        if (i11 == 0) {
            return -1;
        }
        int iJpo = jd.jpo(this.zz, i11, i10);
        if (iJpo < 0 || obj.equals(this.jpo[iJpo])) {
            return iJpo;
        }
        int i12 = iJpo + 1;
        while (i12 < i11 && this.zz[i12] == i10) {
            if (obj.equals(this.jpo[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iJpo - 1; i13 >= 0 && this.zz[i13] == i10; i13--) {
            if (obj.equals(this.jpo[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iJpo;
        if (e10 == null) {
            iJpo = jpo();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iJpo = jpo(e10, iHashCode);
        }
        if (iJpo >= 0) {
            return false;
        }
        int i11 = ~iJpo;
        int i12 = this.f17284jd;
        int[] iArr = this.zz;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.jpo;
            cm(i13);
            int[] iArr2 = this.zz;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.jpo, 0, objArr.length);
            }
            jpo(iArr, objArr, this.f17284jd);
        }
        int i14 = this.f17284jd;
        if (i11 < i14) {
            int[] iArr3 = this.zz;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.jpo;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f17284jd - i11);
        }
        this.zz[i11] = i10;
        this.jpo[i11] = e10;
        this.f17284jd++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        jpo(collection.size() + this.f17284jd);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f17284jd;
        if (i10 != 0) {
            jpo(this.zz, this.jpo, i10);
            this.zz = wqx;
            this.jpo = f17281cm;
            this.f17284jd = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return jpo(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17284jd; i10++) {
                try {
                    if (!set.contains(jd(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.zz;
        int i10 = this.f17284jd;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17284jd <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return jd().cm().iterator();
    }

    public E jd(int i10) {
        return (E) this.jpo[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iJpo = jpo(obj);
        if (iJpo < 0) {
            return false;
        }
        wqx(iJpo);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f17284jd - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.jpo[i10])) {
                wqx(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f17284jd;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f17284jd;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.jpo, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17284jd * 14);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i10 = 0; i10 < this.f17284jd; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eJd = jd(i10);
            if (eJd != this) {
                sb2.append(eJd);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public E wqx(int i10) {
        Object[] objArr = this.jpo;
        E e10 = (E) objArr[i10];
        int i11 = this.f17284jd;
        if (i11 <= 1) {
            jpo(this.zz, objArr, i11);
            this.zz = wqx;
            this.jpo = f17281cm;
            this.f17284jd = 0;
            return e10;
        }
        int[] iArr = this.zz;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f17284jd = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.jpo;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f17284jd - i10);
            }
            this.jpo[this.f17284jd] = null;
            return e10;
        }
        cm(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f17284jd--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.zz, 0, i10);
            System.arraycopy(objArr, 0, this.jpo, 0, i10);
        }
        int i14 = this.f17284jd;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.zz, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.jpo, i10, this.f17284jd - i10);
        }
        return e10;
    }

    public jpo(int i10) {
        if (i10 == 0) {
            this.zz = wqx;
            this.jpo = f17281cm;
        } else {
            cm(i10);
        }
        this.f17284jd = 0;
    }

    private prr<E, E> jd() {
        if (this.f17285yd == null) {
            this.f17285yd = new prr<E, E>() { // from class: com.bytedance.adsdk.jd.jpo.1
                @Override // com.bytedance.adsdk.jd.prr
                public Map<E, E> jd() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.jd.prr
                public int jpo() {
                    return jpo.this.f17284jd;
                }

                @Override // com.bytedance.adsdk.jd.prr
                public void wqx() {
                    jpo.this.clear();
                }

                @Override // com.bytedance.adsdk.jd.prr
                public Object jpo(int i10, int i11) {
                    return jpo.this.jpo[i10];
                }

                @Override // com.bytedance.adsdk.jd.prr
                public int jpo(Object obj) {
                    return jpo.this.jpo(obj);
                }

                @Override // com.bytedance.adsdk.jd.prr
                public void jpo(int i10) {
                    jpo.this.wqx(i10);
                }
            };
        }
        return this.f17285yd;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17284jd) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17284jd));
        }
        System.arraycopy(this.jpo, 0, tArr, 0, this.f17284jd);
        int length = tArr.length;
        int i10 = this.f17284jd;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int jpo() {
        int i10 = this.f17284jd;
        if (i10 == 0) {
            return -1;
        }
        int iJpo = jd.jpo(this.zz, i10, 0);
        if (iJpo < 0 || this.jpo[iJpo] == null) {
            return iJpo;
        }
        int i11 = iJpo + 1;
        while (i11 < i10 && this.zz[i11] == 0) {
            if (this.jpo[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iJpo - 1; i12 >= 0 && this.zz[i12] == 0; i12--) {
            if (this.jpo[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void jpo(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (jpo.class) {
                try {
                    if (xyk < 10) {
                        objArr[0] = f17283qk;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f17283qk = objArr;
                        xyk++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (jpo.class) {
                try {
                    if (f17282jj < 10) {
                        objArr[0] = my;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        my = objArr;
                        f17282jj++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void jpo(int i10) {
        int[] iArr = this.zz;
        if (iArr.length < i10) {
            Object[] objArr = this.jpo;
            cm(i10);
            int i11 = this.f17284jd;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.zz, 0, i11);
                System.arraycopy(objArr, 0, this.jpo, 0, this.f17284jd);
            }
            jpo(iArr, objArr, this.f17284jd);
        }
    }

    public int jpo(Object obj) {
        return obj == null ? jpo() : jpo(obj, obj.hashCode());
    }
}
