package vu;

import com.ironsource.G5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements Map, Serializable, lv.g {

    /* renamed from: p, reason: collision with root package name */
    public static final a f89629p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final d f89630q;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f89631b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f89632c;

    /* renamed from: e, reason: collision with root package name */
    public int[] f89633e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f89634f;

    /* renamed from: g, reason: collision with root package name */
    public int f89635g;

    /* renamed from: h, reason: collision with root package name */
    public int f89636h;

    /* renamed from: i, reason: collision with root package name */
    public int f89637i;

    /* renamed from: j, reason: collision with root package name */
    public int f89638j;

    /* renamed from: k, reason: collision with root package name */
    public int f89639k;

    /* renamed from: l, reason: collision with root package name */
    public vu.f f89640l;

    /* renamed from: m, reason: collision with root package name */
    public g f89641m;

    /* renamed from: n, reason: collision with root package name */
    public vu.e f89642n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f89643o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final int access$computeHashSize(a aVar, int i10) {
            aVar.getClass();
            return Integer.highestOneBit(v.coerceAtLeast(i10, 1) * 3);
        }

        public static final int access$computeShift(a aVar, int i10) {
            aVar.getClass();
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d getEmpty$kotlin_stdlib() {
            return d.f89630q;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends C0805d implements Iterator, lv.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            e0.checkNotNullParameter(map, "map");
        }

        public final void nextAppendString(StringBuilder sb2) {
            e0.checkNotNullParameter(sb2, "sb");
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f89636h) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f89631b[getLastIndex$kotlin_stdlib()];
            if (obj == getMap$kotlin_stdlib()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append(G5.T);
            Object[] objArr = getMap$kotlin_stdlib().f89632c;
            e0.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f89636h) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f89631b[getLastIndex$kotlin_stdlib()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = getMap$kotlin_stdlib().f89632c;
            e0.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return iHashCode2;
        }

        @Override // java.util.Iterator
        public c next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f89636h) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            c cVar = new c(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return cVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Map.Entry, lv.f {

        /* renamed from: b, reason: collision with root package name */
        public final d f89644b;

        /* renamed from: c, reason: collision with root package name */
        public final int f89645c;

        /* renamed from: e, reason: collision with root package name */
        public final int f89646e;

        public c(d map, int i10) {
            e0.checkNotNullParameter(map, "map");
            this.f89644b = map;
            this.f89645c = i10;
            this.f89646e = map.f89638j;
        }

        public final void a() {
            if (this.f89644b.f89638j != this.f89646e) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e0.areEqual(entry.getKey(), getKey()) && e0.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f89644b.f89631b[this.f89645c];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f89644b.f89632c;
            e0.checkNotNull(objArr);
            return objArr[this.f89645c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            d dVar = this.f89644b;
            dVar.checkIsMutable$kotlin_stdlib();
            Object[] objArrAccess$allocateValuesArray = d.access$allocateValuesArray(dVar);
            int i10 = this.f89645c;
            Object obj2 = objArrAccess$allocateValuesArray[i10];
            objArrAccess$allocateValuesArray[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(G5.T);
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: vu.d$d, reason: collision with other inner class name */
    public static class C0805d {

        /* renamed from: b, reason: collision with root package name */
        public final d f89647b;

        /* renamed from: c, reason: collision with root package name */
        public int f89648c;

        /* renamed from: e, reason: collision with root package name */
        public int f89649e;

        /* renamed from: f, reason: collision with root package name */
        public int f89650f;

        public C0805d(d map) {
            e0.checkNotNullParameter(map, "map");
            this.f89647b = map;
            this.f89649e = -1;
            this.f89650f = map.f89638j;
            initNext$kotlin_stdlib();
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (this.f89647b.f89638j != this.f89650f) {
                throw new ConcurrentModificationException();
            }
        }

        public final int getIndex$kotlin_stdlib() {
            return this.f89648c;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.f89649e;
        }

        public final d getMap$kotlin_stdlib() {
            return this.f89647b;
        }

        public final boolean hasNext() {
            return this.f89648c < this.f89647b.f89636h;
        }

        public final void initNext$kotlin_stdlib() {
            while (true) {
                int i10 = this.f89648c;
                d dVar = this.f89647b;
                if (i10 >= dVar.f89636h) {
                    return;
                }
                int[] iArr = dVar.f89633e;
                int i11 = this.f89648c;
                if (iArr[i11] >= 0) {
                    return;
                } else {
                    this.f89648c = i11 + 1;
                }
            }
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.f89649e == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            d dVar = this.f89647b;
            dVar.checkIsMutable$kotlin_stdlib();
            dVar.g(this.f89649e);
            this.f89649e = -1;
            this.f89650f = dVar.f89638j;
        }

        public final void setIndex$kotlin_stdlib(int i10) {
            this.f89648c = i10;
        }

        public final void setLastIndex$kotlin_stdlib(int i10) {
            this.f89649e = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends C0805d implements Iterator, lv.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            e0.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f89636h) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = getMap$kotlin_stdlib().f89631b[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends C0805d implements Iterator, lv.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            e0.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex$kotlin_stdlib() >= getMap$kotlin_stdlib().f89636h) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = getMap$kotlin_stdlib().f89632c;
            e0.checkNotNull(objArr);
            Object obj = objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f89643o = true;
        f89630q = dVar;
    }

    public d() {
        this(8);
    }

    public static final Object[] access$allocateValuesArray(d dVar) {
        Object[] objArr = dVar.f89632c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrArrayOfUninitializedElements = vu.c.arrayOfUninitializedElements(dVar.getCapacity$kotlin_stdlib());
        dVar.f89632c = objArrArrayOfUninitializedElements;
        return objArrArrayOfUninitializedElements;
    }

    public final void a(boolean z10) {
        int i10;
        Object[] objArr = this.f89632c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f89636h;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f89633e;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f89631b;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f89634f[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        vu.c.resetRange(this.f89631b, i12, i10);
        if (objArr != null) {
            vu.c.resetRange(objArr, i12, this.f89636h);
        }
        this.f89636h = i12;
    }

    public final int addKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iE = e(obj);
            int iCoerceAtMost = v.coerceAtMost(this.f89635g * 2, this.f89634f.length / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f89634f[iE];
                if (i11 <= 0) {
                    if (this.f89636h < getCapacity$kotlin_stdlib()) {
                        int i12 = this.f89636h;
                        int i13 = i12 + 1;
                        this.f89636h = i13;
                        this.f89631b[i12] = obj;
                        this.f89633e[i12] = iE;
                        this.f89634f[iE] = i13;
                        this.f89639k = size() + 1;
                        this.f89638j++;
                        if (i10 > this.f89635g) {
                            this.f89635g = i10;
                        }
                        return i12;
                    }
                    b(1);
                } else {
                    if (e0.areEqual(this.f89631b[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iCoerceAtMost) {
                        f(this.f89634f.length * 2);
                        break;
                    }
                    iE = iE == 0 ? this.f89634f.length - 1 : iE - 1;
                }
            }
        }
    }

    public final void b(int i10) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i11 = this.f89636h;
        int i12 = capacity$kotlin_stdlib - i11;
        int size = i11 - size();
        if (i12 < i10 && i12 + size >= i10 && size >= getCapacity$kotlin_stdlib() / 4) {
            a(true);
            return;
        }
        int i13 = this.f89636h + i10;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > getCapacity$kotlin_stdlib()) {
            int iNewCapacity$kotlin_stdlib = uu.g.Companion.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), i13);
            this.f89631b = vu.c.copyOfUninitializedElements(this.f89631b, iNewCapacity$kotlin_stdlib);
            Object[] objArr = this.f89632c;
            this.f89632c = objArr != null ? vu.c.copyOfUninitializedElements(objArr, iNewCapacity$kotlin_stdlib) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f89633e, iNewCapacity$kotlin_stdlib);
            e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f89633e = iArrCopyOf;
            int iAccess$computeHashSize = a.access$computeHashSize(f89629p, iNewCapacity$kotlin_stdlib);
            if (iAccess$computeHashSize > this.f89634f.length) {
                f(iAccess$computeHashSize);
            }
        }
    }

    public final Map<Object, Object> build() {
        checkIsMutable$kotlin_stdlib();
        this.f89643o = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f89630q;
        e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final int c(Object obj) {
        int iE = e(obj);
        int i10 = this.f89635g;
        while (true) {
            int i11 = this.f89634f[iE];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (e0.areEqual(this.f89631b[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iE = iE == 0 ? this.f89634f.length - 1 : iE - 1;
        }
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.f89643o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i10 = this.f89636h - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f89633e;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f89634f[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        vu.c.resetRange(this.f89631b, 0, this.f89636h);
        Object[] objArr = this.f89632c;
        if (objArr != null) {
            vu.c.resetRange(objArr, 0, this.f89636h);
        }
        this.f89639k = 0;
        this.f89636h = 0;
        this.f89638j++;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m9) {
        e0.checkNotNullParameter(m9, "m");
        for (Object obj : m9) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<Object, Object> entry) {
        e0.checkNotNullParameter(entry, "entry");
        int iC = c(entry.getKey());
        if (iC < 0) {
            return false;
        }
        Object[] objArr = this.f89632c;
        e0.checkNotNull(objArr);
        return e0.areEqual(objArr[iC], entry.getValue());
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return d(obj) >= 0;
    }

    public final int d(Object obj) {
        int i10 = this.f89636h;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f89633e[i10] >= 0) {
                Object[] objArr = this.f89632c;
                e0.checkNotNull(objArr);
                if (e0.areEqual(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    public final int e(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f89637i;
    }

    public final b entriesIterator$kotlin_stdlib() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r3[r0] = r6;
        r5.f89633e[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r6) {
        /*
            r5 = this;
            int r0 = r5.f89638j
            int r0 = r0 + 1
            r5.f89638j = r0
            int r0 = r5.f89636h
            int r1 = r5.size()
            r2 = 0
            if (r0 <= r1) goto L12
            r5.a(r2)
        L12:
            int[] r0 = new int[r6]
            r5.f89634f = r0
            vu.d$a r0 = vu.d.f89629p
            int r6 = vu.d.a.access$computeShift(r0, r6)
            r5.f89637i = r6
        L1e:
            int r6 = r5.f89636h
            if (r2 >= r6) goto L52
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f89631b
            r0 = r0[r2]
            int r0 = r5.e(r0)
            int r1 = r5.f89635g
        L2e:
            int[] r3 = r5.f89634f
            r4 = r3[r0]
            if (r4 != 0) goto L3c
            r3[r0] = r6
            int[] r1 = r5.f89633e
            r1[r2] = r0
            r2 = r6
            goto L1e
        L3c:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4a
            int r4 = r0 + (-1)
            if (r0 != 0) goto L48
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2e
        L48:
            r0 = r4
            goto L2e
        L4a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.d.f(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:6:0x0021->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f89631b
            vu.c.resetAt(r0, r12)
            java.lang.Object[] r0 = r11.f89632c
            if (r0 == 0) goto Lc
            vu.c.resetAt(r0, r12)
        Lc:
            int[] r0 = r11.f89633e
            r0 = r0[r12]
            int r1 = r11.f89635g
            int r1 = r1 * 2
            int[] r2 = r11.f89634f
            int r2 = r2.length
            int r2 = r2 / 2
            int r1 = qv.v.coerceAtMost(r1, r2)
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L21:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2b
            int[] r0 = r11.f89634f
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2c
        L2b:
            r0 = r5
        L2c:
            int r4 = r4 + 1
            int r5 = r11.f89635g
            r6 = -1
            if (r4 <= r5) goto L38
            int[] r0 = r11.f89634f
            r0[r1] = r2
            goto L69
        L38:
            int[] r5 = r11.f89634f
            r7 = r5[r0]
            if (r7 != 0) goto L41
            r5[r1] = r2
            goto L69
        L41:
            if (r7 >= 0) goto L48
            r5[r1] = r6
        L45:
            r1 = r0
            r4 = r2
            goto L62
        L48:
            java.lang.Object[] r5 = r11.f89631b
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.e(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f89634f
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L62
            r9[r1] = r7
            int[] r4 = r11.f89633e
            r4[r8] = r1
            goto L45
        L62:
            int r3 = r3 + r6
            if (r3 >= 0) goto L21
            int[] r0 = r11.f89634f
            r0[r1] = r6
        L69:
            int[] r0 = r11.f89633e
            r0[r12] = r6
            int r12 = r11.size()
            int r12 = r12 + r6
            r11.f89639k = r12
            int r12 = r11.f89638j
            int r12 = r12 + 1
            r11.f89638j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vu.d.g(int):void");
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return null;
        }
        Object[] objArr = this.f89632c;
        e0.checkNotNull(objArr);
        return objArr[iC];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.f89631b.length;
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        vu.e eVar = this.f89642n;
        if (eVar != null) {
            return eVar;
        }
        vu.e eVar2 = new vu.e(this);
        this.f89642n = eVar2;
        return eVar2;
    }

    public Set<Object> getKeys() {
        vu.f fVar = this.f89640l;
        if (fVar != null) {
            return fVar;
        }
        vu.f fVar2 = new vu.f(this);
        this.f89640l = fVar2;
        return fVar2;
    }

    public int getSize() {
        return this.f89639k;
    }

    public Collection<Object> getValues() {
        g gVar = this.f89641m;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f89641m = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iNextHashCode$kotlin_stdlib = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            iNextHashCode$kotlin_stdlib += bVarEntriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return iNextHashCode$kotlin_stdlib;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.f89643o;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    public final e keysIterator$kotlin_stdlib() {
        return new e(this);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(obj);
        Object[] objArrArrayOfUninitializedElements = this.f89632c;
        if (objArrArrayOfUninitializedElements == null) {
            objArrArrayOfUninitializedElements = vu.c.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
            this.f89632c = objArrArrayOfUninitializedElements;
        }
        if (iAddKey$kotlin_stdlib >= 0) {
            objArrArrayOfUninitializedElements[iAddKey$kotlin_stdlib] = obj2;
            return null;
        }
        int i10 = (-iAddKey$kotlin_stdlib) - 1;
        Object obj3 = objArrArrayOfUninitializedElements[i10];
        objArrArrayOfUninitializedElements[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> from) {
        e0.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        Set<Map.Entry<Object, Object>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        b(setEntrySet.size());
        for (Map.Entry<Object, Object> entry : setEntrySet) {
            int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
            Object[] objArrArrayOfUninitializedElements = this.f89632c;
            if (objArrArrayOfUninitializedElements == null) {
                objArrArrayOfUninitializedElements = vu.c.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
                this.f89632c = objArrArrayOfUninitializedElements;
            }
            if (iAddKey$kotlin_stdlib >= 0) {
                objArrArrayOfUninitializedElements[iAddKey$kotlin_stdlib] = entry.getValue();
            } else {
                int i10 = (-iAddKey$kotlin_stdlib) - 1;
                if (!e0.areEqual(entry.getValue(), objArrArrayOfUninitializedElements[i10])) {
                    objArrArrayOfUninitializedElements[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iC = c(obj);
        if (iC < 0) {
            return null;
        }
        Object[] objArr = this.f89632c;
        e0.checkNotNull(objArr);
        Object obj2 = objArr[iC];
        g(iC);
        return obj2;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<Object, Object> entry) {
        e0.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iC = c(entry.getKey());
        if (iC < 0) {
            return false;
        }
        Object[] objArr = this.f89632c;
        e0.checkNotNull(objArr);
        if (!e0.areEqual(objArr[iC], entry.getValue())) {
            return false;
        }
        g(iC);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        g(iC);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int iD = d(obj);
        if (iD < 0) {
            return false;
        }
        g(iD);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i10 = 0;
        while (bVarEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarEntriesIterator$kotlin_stdlib.nextAppendString(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public final f valuesIterator$kotlin_stdlib() {
        return new f(this);
    }

    public d(int i10) {
        Object[] objArrArrayOfUninitializedElements = vu.c.arrayOfUninitializedElements(i10);
        int[] iArr = new int[i10];
        a aVar = f89629p;
        int iAccess$computeHashSize = a.access$computeHashSize(aVar, i10);
        this.f89631b = objArrArrayOfUninitializedElements;
        this.f89632c = null;
        this.f89633e = iArr;
        this.f89634f = new int[iAccess$computeHashSize];
        this.f89635g = 2;
        this.f89636h = 0;
        this.f89637i = a.access$computeShift(aVar, iAccess$computeHashSize);
    }
}
