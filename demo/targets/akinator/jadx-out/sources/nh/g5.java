package nh;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g5 {

    /* renamed from: a, reason: collision with root package name */
    public Comparator f76284a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f76285b;

    /* renamed from: c, reason: collision with root package name */
    public int f76286c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76287d;

    /* renamed from: e, reason: collision with root package name */
    public f5 f76288e;

    public g5() {
        this(4);
    }

    public static void d(Comparator comparator, int i10, Object[] objArr) {
        Map.Entry[] entryArr = new Map.Entry[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 + 1];
            Objects.requireNonNull(obj2);
            entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }
        Arrays.sort(entryArr, 0, i10, we.from(comparator).onResultOf(wa.f76740c));
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i13 * 2;
            objArr[i14] = entryArr[i13].getKey();
            objArr[i14 + 1] = entryArr[i13].getValue();
        }
    }

    public final lf a(boolean z10) {
        Object[] objArr;
        f5 f5Var;
        f5 f5Var2;
        if (z10 && (f5Var2 = this.f76288e) != null) {
            throw f5Var2.a();
        }
        int length = this.f76286c;
        if (this.f76284a == null) {
            objArr = this.f76285b;
        } else {
            if (this.f76287d) {
                this.f76285b = Arrays.copyOf(this.f76285b, length * 2);
            }
            objArr = this.f76285b;
            if (!z10) {
                int i10 = this.f76286c;
                HashSet hashSet = new HashSet();
                BitSet bitSet = new BitSet();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    Object obj = objArr[i11 * 2];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        bitSet.set(i11);
                    }
                }
                if (!bitSet.isEmpty()) {
                    Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < i10 * 2) {
                        if (bitSet.get(i12 >>> 1)) {
                            i12 += 2;
                        } else {
                            int i14 = i13 + 1;
                            int i15 = i12 + 1;
                            Object obj2 = objArr[i12];
                            Objects.requireNonNull(obj2);
                            objArr2[i13] = obj2;
                            i13 += 2;
                            i12 += 2;
                            Object obj3 = objArr[i15];
                            Objects.requireNonNull(obj3);
                            objArr2[i14] = obj3;
                        }
                    }
                    objArr = objArr2;
                }
                if (objArr.length < this.f76285b.length) {
                    length = objArr.length >>> 1;
                }
            }
            d(this.f76284a, length, objArr);
        }
        this.f76287d = true;
        lf lfVarH = lf.h(length, objArr, this);
        if (!z10 || (f5Var = this.f76288e) == null) {
            return lfVarH;
        }
        throw f5Var.a();
    }

    public g5 b(g5 g5Var) {
        mh.p1.checkNotNull(g5Var);
        c(this.f76286c + g5Var.f76286c);
        System.arraycopy(g5Var.f76285b, 0, this.f76285b, this.f76286c * 2, g5Var.f76286c * 2);
        this.f76286c += g5Var.f76286c;
        return this;
    }

    public m5 build() {
        return buildOrThrow();
    }

    public m5 buildKeepingLast() {
        return a(false);
    }

    public m5 buildOrThrow() {
        return a(true);
    }

    public final void c(int i10) {
        int i11 = i10 * 2;
        Object[] objArr = this.f76285b;
        if (i11 > objArr.length) {
            this.f76285b = Arrays.copyOf(objArr, t4.a(objArr.length, i11));
            this.f76287d = false;
        }
    }

    public g5 orderEntriesByValue(Comparator<Object> comparator) {
        mh.p1.checkState(this.f76284a == null, "valueComparator was already set");
        this.f76284a = (Comparator) mh.p1.checkNotNull(comparator, "valueComparator");
        return this;
    }

    public g5 put(Object obj, Object obj2) {
        c(this.f76286c + 1);
        jh.i.i(obj, obj2);
        Object[] objArr = this.f76285b;
        int i10 = this.f76286c;
        objArr[i10 * 2] = obj;
        objArr[(i10 * 2) + 1] = obj2;
        this.f76286c = i10 + 1;
        return this;
    }

    public g5 putAll(Map<Object, Object> map) {
        return putAll(map.entrySet());
    }

    public g5(int i10) {
        this.f76285b = new Object[i10 * 2];
        this.f76286c = 0;
        this.f76287d = false;
    }

    public g5 putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
        if (iterable instanceof Collection) {
            c(((Collection) iterable).size() + this.f76286c);
        }
        Iterator<? extends Map.Entry<Object, Object>> it = iterable.iterator();
        while (it.hasNext()) {
            put(it.next());
        }
        return this;
    }

    public g5 put(Map.Entry<Object, Object> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
