package nh;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f2 extends AbstractMap implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f76237l = new Object();

    /* renamed from: b, reason: collision with root package name */
    public transient Object f76238b;

    /* renamed from: c, reason: collision with root package name */
    public transient int[] f76239c;

    /* renamed from: e, reason: collision with root package name */
    public transient Object[] f76240e;

    /* renamed from: f, reason: collision with root package name */
    public transient Object[] f76241f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f76242g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f76243h;

    /* renamed from: i, reason: collision with root package name */
    public transient c2 f76244i;

    /* renamed from: j, reason: collision with root package name */
    public transient a2 f76245j;

    /* renamed from: k, reason: collision with root package name */
    public transient e2 f76246k;

    public f2(int i10) {
        l(i10);
    }

    public static <K, V> f2 create() {
        f2 f2Var = new f2();
        f2Var.l(3);
        return f2Var;
    }

    public static <K, V> f2 createWithExpectedSize(int i10) {
        return new f2(i10);
    }

    public int b(int i10, int i11) {
        return i10 - 1;
    }

    public int c() {
        mh.p1.checkState(o(), "Arrays already allocated");
        int i10 = this.f76242g;
        int iT = kc.p.T(i10);
        this.f76238b = kc.p.f(iT);
        this.f76242g = kc.p.F(this.f76242g, 32 - Integer.numberOfLeadingZeros(iT - 1), 31);
        this.f76239c = new int[i10];
        this.f76240e = new Object[i10];
        this.f76241f = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (o()) {
            return;
        }
        j();
        Map mapF = f();
        if (mapF != null) {
            this.f76242g = rh.w.constrainToRange(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapF.clear();
            this.f76238b = null;
            this.f76243h = 0;
            return;
        }
        Arrays.fill(r(), 0, this.f76243h, (Object) null);
        Arrays.fill(s(), 0, this.f76243h, (Object) null);
        Object obj = this.f76238b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(q(), 0, this.f76243h, 0);
        this.f76243h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapF = f();
        return mapF != null ? mapF.containsKey(obj) : k(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f76243h; i10++) {
            if (Objects.equals(obj, s()[i10])) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        LinkedHashMap linkedHashMapE = e(i() + 1);
        int iG = g();
        while (iG >= 0) {
            linkedHashMapE.put(r()[iG], s()[iG]);
            iG = h(iG);
        }
        this.f76238b = linkedHashMapE;
        this.f76239c = null;
        this.f76240e = null;
        this.f76241f = null;
        j();
        return linkedHashMapE;
    }

    public LinkedHashMap e(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        a2 a2Var = this.f76245j;
        if (a2Var != null) {
            return a2Var;
        }
        a2 a2Var2 = new a2(this);
        this.f76245j = a2Var2;
        return a2Var2;
    }

    public final Map f() {
        Object obj = this.f76238b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.get(obj);
        }
        int iK = k(obj);
        if (iK == -1) {
            return null;
        }
        a(iK);
        return s()[iK];
    }

    public int h(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f76243h) {
            return i11;
        }
        return -1;
    }

    public final int i() {
        return (1 << (this.f76242g & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void j() {
        this.f76242g += 32;
    }

    public final int k(Object obj) {
        if (o()) {
            return -1;
        }
        int iG = kotlin.jvm.internal.d0.G(obj);
        int i10 = i();
        Object obj2 = this.f76238b;
        Objects.requireNonNull(obj2);
        int iR = kc.p.R(iG & i10, obj2);
        if (iR == 0) {
            return -1;
        }
        int i11 = ~i10;
        int i12 = iG & i11;
        do {
            int i13 = iR - 1;
            int i14 = q()[i13];
            if ((i14 & i11) == i12 && Objects.equals(obj, r()[i13])) {
                return i13;
            }
            iR = i14 & i10;
        } while (iR != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        c2 c2Var = this.f76244i;
        if (c2Var != null) {
            return c2Var;
        }
        c2 c2Var2 = new c2(this);
        this.f76244i = c2Var2;
        return c2Var2;
    }

    public void l(int i10) {
        mh.p1.checkArgument(i10 >= 0, "Expected size must be >= 0");
        this.f76242g = rh.w.constrainToRange(i10, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public void m(int i10, Object obj, Object obj2, int i11, int i12) {
        q()[i10] = kc.p.F(i11, 0, i12);
        r()[i10] = obj;
        s()[i10] = obj2;
    }

    public void n(int i10, int i11) {
        Object obj = this.f76238b;
        Objects.requireNonNull(obj);
        int[] iArrQ = q();
        Object[] objArrR = r();
        Object[] objArrS = s();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrR[i10] = null;
            objArrS[i10] = null;
            iArrQ[i10] = 0;
            return;
        }
        Object obj2 = objArrR[i12];
        objArrR[i10] = obj2;
        objArrS[i10] = objArrS[i12];
        objArrR[i12] = null;
        objArrS[i12] = null;
        iArrQ[i10] = iArrQ[i12];
        iArrQ[i12] = 0;
        int iG = kotlin.jvm.internal.d0.G(obj2) & i11;
        int iR = kc.p.R(iG, obj);
        if (iR == size) {
            kc.p.S(iG, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iR - 1;
            int i14 = iArrQ[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrQ[i13] = kc.p.F(i14, i10 + 1, i11);
                return;
            }
            iR = i15;
        }
    }

    public final boolean o() {
        return this.f76238b == null;
    }

    public final Object p(Object obj) {
        boolean zO = o();
        Object obj2 = f76237l;
        if (zO) {
            return obj2;
        }
        int i10 = i();
        Object obj3 = this.f76238b;
        Objects.requireNonNull(obj3);
        int iO = kc.p.O(obj, null, i10, obj3, q(), r(), null);
        if (iO == -1) {
            return obj2;
        }
        Object obj4 = s()[iO];
        n(iO, i10);
        this.f76243h--;
        j();
        return obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object put(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = r18
            r3 = r19
            boolean r1 = r0.o()
            if (r1 == 0) goto Lf
            r0.c()
        Lf:
            java.util.Map r1 = r0.f()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r1.put(r2, r3)
            return r1
        L1a:
            int[] r1 = r0.q()
            java.lang.Object[] r4 = r0.r()
            java.lang.Object[] r5 = r0.s()
            r6 = r1
            int r1 = r0.f76243h
            int r7 = r1 + 1
            r8 = r4
            int r4 = kotlin.jvm.internal.d0.G(r2)
            int r9 = r0.i()
            r10 = r4 & r9
            java.lang.Object r11 = r0.f76238b
            java.util.Objects.requireNonNull(r11)
            int r11 = kc.p.R(r10, r11)
            r12 = 1
            if (r11 != 0) goto L5b
            if (r7 <= r9) goto L50
            int r5 = kc.p.G(r9)
            int r9 = r0.u(r9, r5, r4, r1)
            r5 = r9
            r16 = r12
            goto L9e
        L50:
            java.lang.Object r5 = r0.f76238b
            java.util.Objects.requireNonNull(r5)
            kc.p.S(r10, r7, r5)
            r16 = r12
            goto L95
        L5b:
            int r10 = ~r9
            r13 = r4 & r10
            r14 = 0
        L5f:
            int r11 = r11 - r12
            r15 = r6[r11]
            r16 = r12
            r12 = r15 & r10
            if (r12 != r13) goto L78
            r12 = r8[r11]
            boolean r12 = java.util.Objects.equals(r2, r12)
            if (r12 == 0) goto L78
            r1 = r5[r11]
            r5[r11] = r3
            r0.a(r11)
            return r1
        L78:
            r12 = r15 & r9
            int r14 = r14 + 1
            if (r12 != 0) goto Lc5
            r5 = 9
            if (r14 < r5) goto L8b
            java.util.Map r1 = r0.d()
            java.lang.Object r1 = r1.put(r2, r3)
            return r1
        L8b:
            if (r7 <= r9) goto L97
            int r5 = kc.p.G(r9)
            int r9 = r0.u(r9, r5, r4, r1)
        L95:
            r5 = r9
            goto L9e
        L97:
            int r5 = kc.p.F(r15, r7, r9)
            r6[r11] = r5
            goto L95
        L9e:
            int[] r6 = r0.q()
            int r6 = r6.length
            if (r7 <= r6) goto Lbb
            int r8 = r6 >>> 1
            r11 = r16
            int r8 = java.lang.Math.max(r11, r8)
            int r8 = r8 + r6
            r8 = r8 | r11
            r9 = 1073741823(0x3fffffff, float:1.9999999)
            int r8 = java.lang.Math.min(r9, r8)
            if (r8 == r6) goto Lbb
            r0.t(r8)
        Lbb:
            r0.m(r1, r2, r3, r4, r5)
            r0.f76243h = r7
            r0.j()
            r1 = 0
            return r1
        Lc5:
            r2 = r18
            r3 = r19
            r11 = r12
            r12 = r16
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.f2.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int[] q() {
        int[] iArr = this.f76239c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] r() {
        Object[] objArr = this.f76240e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapF = f();
        if (mapF != null) {
            return mapF.remove(obj);
        }
        Object objP = p(obj);
        if (objP == f76237l) {
            return null;
        }
        return objP;
    }

    public final Object[] s() {
        Object[] objArr = this.f76241f;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapF = f();
        return mapF != null ? mapF.size() : this.f76243h;
    }

    public void t(int i10) {
        this.f76239c = Arrays.copyOf(q(), i10);
        this.f76240e = Arrays.copyOf(r(), i10);
        this.f76241f = Arrays.copyOf(s(), i10);
    }

    public void trimToSize() {
        if (o()) {
            return;
        }
        Map mapF = f();
        if (mapF != null) {
            LinkedHashMap linkedHashMapE = e(size());
            linkedHashMapE.putAll(mapF);
            this.f76238b = linkedHashMapE;
            return;
        }
        int i10 = this.f76243h;
        if (i10 < q().length) {
            t(i10);
        }
        int iT = kc.p.T(i10);
        int i11 = i();
        if (iT < i11) {
            u(i11, iT, 0, 0);
        }
    }

    public final int u(int i10, int i11, int i12, int i13) {
        Object objF = kc.p.f(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            kc.p.S(i12 & i14, i13 + 1, objF);
        }
        Object obj = this.f76238b;
        Objects.requireNonNull(obj);
        int[] iArrQ = q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iR = kc.p.R(i15, obj);
            while (iR != 0) {
                int i16 = iR - 1;
                int i17 = iArrQ[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iR2 = kc.p.R(i19, objF);
                kc.p.S(i19, iR, objF);
                iArrQ[i16] = kc.p.F(i18, iR2, i14);
                iR = i17 & i10;
            }
        }
        this.f76238b = objF;
        this.f76242g = kc.p.F(this.f76242g, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        e2 e2Var = this.f76246k;
        if (e2Var != null) {
            return e2Var;
        }
        e2 e2Var2 = new e2(this);
        this.f76246k = e2Var2;
        return e2Var2;
    }

    public void a(int i10) {
    }
}
