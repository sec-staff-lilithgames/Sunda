package u0;

import i2.hQ.aTNDubNmpwAqdU;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import p0.a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f87502e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final t f87503f = new t(0, 0, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public int f87504a;

    /* renamed from: b, reason: collision with root package name */
    public int f87505b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.e f87506c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f87507d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final t getEMPTY$runtime() {
            return t.f87503f;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public t f87508a;

        /* renamed from: b, reason: collision with root package name */
        public final int f87509b;

        public b(t tVar, int i10) {
            this.f87508a = tVar;
            this.f87509b = i10;
        }

        public final t getNode() {
            return this.f87508a;
        }

        public final int getSizeDelta() {
            return this.f87509b;
        }

        public final b replaceNode(kv.l lVar) {
            setNode((t) lVar.invoke(getNode()));
            return this;
        }

        public final void setNode(t tVar) {
            this.f87508a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr, y0.e eVar) {
        this.f87504a = i10;
        this.f87505b = i11;
        this.f87506c = eVar;
        this.f87507d = objArr;
    }

    public static t g(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, y0.e eVar) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iIndexSegment = x.indexSegment(i10, i12);
        int iIndexSegment2 = x.indexSegment(i11, i12);
        if (iIndexSegment != iIndexSegment2) {
            return new t((1 << iIndexSegment) | (1 << iIndexSegment2), 0, iIndexSegment < iIndexSegment2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new t(0, 1 << iIndexSegment, new Object[]{g(i10, obj, obj2, i11, obj3, obj4, i12 + 5, eVar)}, eVar);
    }

    public final void a(kv.s sVar, int i10, int i11) {
        sVar.invoke(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f87504a), Integer.valueOf(this.f87505b));
        int i12 = this.f87505b;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            nodeAtIndex$runtime(nodeIndex$runtime(iLowestOneBit)).a(sVar, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    public final void accept$runtime(kv.s sVar) {
        a(sVar, 0, 0);
    }

    public final Object[] b(int i10, int i11, int i12, Object obj, Object obj2, int i13, y0.e eVar) {
        Object obj3 = this.f87507d[i10];
        return x.access$replaceEntryWithNode(this.f87507d, i10, nodeIndex$runtime(i11) + 1, g(obj3 != null ? obj3.hashCode() : 0, obj3, n(i10), i12, obj, obj2, i13 + 5, eVar));
    }

    public final int c() {
        if (this.f87505b == 0) {
            return this.f87507d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f87504a);
        int length = this.f87507d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += nodeAtIndex$runtime(i10).c();
        }
        return iBitCount;
    }

    public final boolean containsKey(int i10, Object obj, int i11) {
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        if (hasEntryAt$runtime(iIndexSegment)) {
            return e0.areEqual(obj, this.f87507d[entryKeyIndex$runtime(iIndexSegment)]);
        }
        if (!f(iIndexSegment)) {
            return false;
        }
        t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(iIndexSegment));
        return i11 == 30 ? tVarNodeAtIndex$runtime.d(obj) : tVarNodeAtIndex$runtime.containsKey(i10, obj, i11 + 5);
    }

    public final boolean d(Object obj) {
        qv.k kVarStep = qv.v.step(qv.v.until(0, this.f87507d.length), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!e0.areEqual(obj, this.f87507d[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f87505b == tVar.f87505b && this.f87504a == tVar.f87504a) {
            int length = this.f87507d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f87507d[i10] == tVar.f87507d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int entryCount$runtime() {
        return Integer.bitCount(this.f87504a);
    }

    public final int entryKeyIndex$runtime(int i10) {
        return Integer.bitCount((i10 - 1) & this.f87504a) * 2;
    }

    public final boolean f(int i10) {
        return (i10 & this.f87505b) != 0;
    }

    public final Object get(int i10, Object obj, int i11) {
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (e0.areEqual(obj, this.f87507d[iEntryKeyIndex$runtime])) {
                return n(iEntryKeyIndex$runtime);
            }
            return null;
        }
        if (!f(iIndexSegment)) {
            return null;
        }
        t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(iIndexSegment));
        if (i11 != 30) {
            return tVarNodeAtIndex$runtime.get(i10, obj, i11 + 5);
        }
        qv.k kVarStep = qv.v.step(qv.v.until(0, tVarNodeAtIndex$runtime.f87507d.length), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!e0.areEqual(obj, tVarNodeAtIndex$runtime.f87507d[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return tVarNodeAtIndex$runtime.n(first);
        }
        return null;
    }

    public final Object[] getBuffer$runtime() {
        return this.f87507d;
    }

    public final t h(int i10, f fVar) {
        fVar.setSize(fVar.size() - 1);
        fVar.setOperationResult$runtime(n(i10));
        if (this.f87507d.length == 2) {
            return null;
        }
        if (this.f87506c != fVar.getOwnership()) {
            return new t(0, 0, x.access$removeEntryAtIndex(this.f87507d, i10), fVar.getOwnership());
        }
        this.f87507d = x.access$removeEntryAtIndex(this.f87507d, i10);
        return this;
    }

    public final boolean hasEntryAt$runtime(int i10) {
        return (i10 & this.f87504a) != 0;
    }

    public final t i(int i10, int i11, f fVar) {
        fVar.setSize(fVar.size() - 1);
        fVar.setOperationResult$runtime(n(i10));
        if (this.f87507d.length == 2) {
            return null;
        }
        if (this.f87506c != fVar.getOwnership()) {
            return new t(i11 ^ this.f87504a, this.f87505b, x.access$removeEntryAtIndex(this.f87507d, i10), fVar.getOwnership());
        }
        this.f87507d = x.access$removeEntryAtIndex(this.f87507d, i10);
        this.f87504a ^= i11;
        return this;
    }

    public final t j(t tVar, t tVar2, int i10, int i11, y0.e eVar) {
        y0.e eVar2 = this.f87506c;
        if (tVar2 != null) {
            return (eVar2 == eVar || tVar != tVar2) ? k(i10, tVar2, eVar) : this;
        }
        Object[] objArr = this.f87507d;
        if (objArr.length == 1) {
            return null;
        }
        if (eVar2 != eVar) {
            return new t(this.f87504a, i11 ^ this.f87505b, x.access$removeNodeAtIndex(objArr, i10), eVar);
        }
        this.f87507d = x.access$removeNodeAtIndex(objArr, i10);
        this.f87505b ^= i11;
        return this;
    }

    public final t k(int i10, t tVar, y0.e eVar) {
        Object[] objArr = this.f87507d;
        if (objArr.length == 1 && tVar.f87507d.length == 2 && tVar.f87505b == 0) {
            tVar.f87504a = this.f87505b;
            return tVar;
        }
        if (this.f87506c == eVar) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = tVar;
        return new t(this.f87504a, this.f87505b, objArrCopyOf, eVar);
    }

    public final t l(t tVar, t tVar2, int i10, int i11) {
        if (tVar2 != null) {
            return tVar != tVar2 ? m(i10, i11, tVar2) : this;
        }
        Object[] objArr = this.f87507d;
        if (objArr.length == 1) {
            return null;
        }
        return new t(this.f87504a, i11 ^ this.f87505b, x.access$removeNodeAtIndex(objArr, i10));
    }

    public final t m(int i10, int i11, t tVar) {
        Object[] objArr = tVar.f87507d;
        if (objArr.length != 2 || tVar.f87505b != 0) {
            Object[] objArr2 = this.f87507d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = tVar;
            return new t(this.f87504a, this.f87505b, objArrCopyOf);
        }
        if (this.f87507d.length == 1) {
            tVar.f87504a = this.f87505b;
            return tVar;
        }
        return new t(this.f87504a ^ i11, i11 ^ this.f87505b, x.access$replaceNodeWithEntry(this.f87507d, i10, entryKeyIndex$runtime(i11), objArr[0], objArr[1]));
    }

    public final t mutablePut(int i10, Object obj, Object obj2, int i11, f fVar) {
        f fVar2;
        t tVarMutablePut;
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        boolean zHasEntryAt$runtime = hasEntryAt$runtime(iIndexSegment);
        y0.e eVar = this.f87506c;
        if (zHasEntryAt$runtime) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (!e0.areEqual(obj, this.f87507d[iEntryKeyIndex$runtime])) {
                fVar.setSize(fVar.size() + 1);
                y0.e ownership = fVar.getOwnership();
                if (eVar != ownership) {
                    return new t(this.f87504a ^ iIndexSegment, this.f87505b | iIndexSegment, b(iEntryKeyIndex$runtime, iIndexSegment, i10, obj, obj2, i11, ownership), ownership);
                }
                this.f87507d = b(iEntryKeyIndex$runtime, iIndexSegment, i10, obj, obj2, i11, ownership);
                this.f87504a ^= iIndexSegment;
                this.f87505b |= iIndexSegment;
                return this;
            }
            fVar.setOperationResult$runtime(n(iEntryKeyIndex$runtime));
            if (n(iEntryKeyIndex$runtime) == obj2) {
                return this;
            }
            if (eVar == fVar.getOwnership()) {
                this.f87507d[iEntryKeyIndex$runtime + 1] = obj2;
                return this;
            }
            fVar.setModCount$runtime(fVar.getModCount$runtime() + 1);
            Object[] objArr = this.f87507d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iEntryKeyIndex$runtime + 1] = obj2;
            return new t(this.f87504a, this.f87505b, objArrCopyOf, fVar.getOwnership());
        }
        if (!f(iIndexSegment)) {
            fVar.setSize(fVar.size() + 1);
            y0.e ownership2 = fVar.getOwnership();
            int iEntryKeyIndex$runtime2 = entryKeyIndex$runtime(iIndexSegment);
            if (eVar != ownership2) {
                return new t(this.f87504a | iIndexSegment, this.f87505b, x.access$insertEntryAtIndex(this.f87507d, iEntryKeyIndex$runtime2, obj, obj2), ownership2);
            }
            this.f87507d = x.access$insertEntryAtIndex(this.f87507d, iEntryKeyIndex$runtime2, obj, obj2);
            this.f87504a |= iIndexSegment;
            return this;
        }
        int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
        t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
        if (i11 == 30) {
            qv.k kVarStep = qv.v.step(qv.v.until(0, tVarNodeAtIndex$runtime.f87507d.length), 2);
            int first = kVarStep.getFirst();
            int last = kVarStep.getLast();
            int step = kVarStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                fVar.setSize(fVar.size() + 1);
                tVarMutablePut = new t(0, 0, x.access$insertEntryAtIndex(tVarNodeAtIndex$runtime.f87507d, 0, obj, obj2), fVar.getOwnership());
                fVar2 = fVar;
            } else {
                while (!e0.areEqual(obj, tVarNodeAtIndex$runtime.f87507d[first])) {
                    if (first == last) {
                        fVar.setSize(fVar.size() + 1);
                        tVarMutablePut = new t(0, 0, x.access$insertEntryAtIndex(tVarNodeAtIndex$runtime.f87507d, 0, obj, obj2), fVar.getOwnership());
                        break;
                    }
                    first += step;
                }
                fVar.setOperationResult$runtime(tVarNodeAtIndex$runtime.n(first));
                if (tVarNodeAtIndex$runtime.f87506c == fVar.getOwnership()) {
                    tVarNodeAtIndex$runtime.f87507d[first + 1] = obj2;
                    tVarMutablePut = tVarNodeAtIndex$runtime;
                } else {
                    fVar.setModCount$runtime(fVar.getModCount$runtime() + 1);
                    Object[] objArr2 = tVarNodeAtIndex$runtime.f87507d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    e0.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[first + 1] = obj2;
                    tVarMutablePut = new t(0, 0, objArrCopyOf2, fVar.getOwnership());
                }
                fVar2 = fVar;
            }
        } else {
            fVar2 = fVar;
            tVarMutablePut = tVarNodeAtIndex$runtime.mutablePut(i10, obj, obj2, i11 + 5, fVar2);
        }
        return tVarNodeAtIndex$runtime == tVarMutablePut ? this : k(iNodeIndex$runtime, tVarMutablePut, fVar2.getOwnership());
    }

    public final t mutableRemove(int i10, Object obj, int i11, f fVar) {
        t tVarMutableRemove;
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (e0.areEqual(obj, this.f87507d[iEntryKeyIndex$runtime])) {
                return i(iEntryKeyIndex$runtime, iIndexSegment, fVar);
            }
        } else if (f(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (i11 == 30) {
                qv.k kVarStep = qv.v.step(qv.v.until(0, tVarNodeAtIndex$runtime.f87507d.length), 2);
                int first = kVarStep.getFirst();
                int last = kVarStep.getLast();
                int step = kVarStep.getStep();
                if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                    tVarMutableRemove = tVarNodeAtIndex$runtime;
                    break;
                }
                while (!e0.areEqual(obj, tVarNodeAtIndex$runtime.f87507d[first])) {
                    if (first == last) {
                        tVarMutableRemove = tVarNodeAtIndex$runtime;
                        break;
                    }
                    first += step;
                }
                tVarMutableRemove = tVarNodeAtIndex$runtime.h(first, fVar);
            } else {
                tVarMutableRemove = tVarNodeAtIndex$runtime.mutableRemove(i10, obj, i11 + 5, fVar);
            }
            return j(tVarNodeAtIndex$runtime, tVarMutableRemove, iNodeIndex$runtime, iIndexSegment, fVar.getOwnership());
        }
        return this;
    }

    public final Object n(int i10) {
        return this.f87507d[i10 + 1];
    }

    public final t nodeAtIndex$runtime(int i10) {
        Object obj = this.f87507d[i10];
        e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int nodeIndex$runtime(int i10) {
        return (this.f87507d.length - 1) - Integer.bitCount((i10 - 1) & this.f87505b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r11 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        r11.setNode(m(r13, r4, r11.getNode()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u0.t.b put(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.t.put(int, java.lang.Object, java.lang.Object, int):u0.t$b");
    }

    public final t remove(int i10, Object obj, int i11) {
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        t tVarRemove = null;
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (e0.areEqual(obj, this.f87507d[iEntryKeyIndex$runtime])) {
                Object[] objArr = this.f87507d;
                if (objArr.length == 2) {
                    return null;
                }
                return new t(this.f87504a ^ iIndexSegment, this.f87505b, x.access$removeEntryAtIndex(objArr, iEntryKeyIndex$runtime));
            }
        } else if (f(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (i11 == 30) {
                qv.k kVarStep = qv.v.step(qv.v.until(0, tVarNodeAtIndex$runtime.f87507d.length), 2);
                int first = kVarStep.getFirst();
                int last = kVarStep.getLast();
                int step = kVarStep.getStep();
                if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                    tVarRemove = tVarNodeAtIndex$runtime;
                    break;
                }
                while (!e0.areEqual(obj, tVarNodeAtIndex$runtime.f87507d[first])) {
                    if (first == last) {
                        tVarRemove = tVarNodeAtIndex$runtime;
                        break;
                    }
                    first += step;
                }
                Object[] objArr2 = tVarNodeAtIndex$runtime.f87507d;
                if (objArr2.length != 2) {
                    tVarRemove = new t(0, 0, x.access$removeEntryAtIndex(objArr2, first));
                }
            } else {
                tVarRemove = tVarNodeAtIndex$runtime.remove(i10, obj, i11 + 5);
            }
            return l(tVarNodeAtIndex$runtime, tVarRemove, iNodeIndex$runtime, iIndexSegment);
        }
        return this;
    }

    public final t mutablePutAll(t tVar, int i10, y0.b bVar, f fVar) {
        int i11;
        t tVarG;
        if (this == tVar) {
            bVar.plusAssign(c());
            return this;
        }
        int i12 = 1;
        if (i10 > 30) {
            y0.e ownership = fVar.getOwnership();
            y0.a.m8013assert(this.f87505b == 0);
            y0.a.m8013assert(this.f87504a == 0);
            y0.a.m8013assert(tVar.f87505b == 0);
            y0.a.m8013assert(tVar.f87504a == 0);
            Object[] objArr = this.f87507d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f87507d.length);
            String str = aTNDubNmpwAqdU.WWcRYFtJactB;
            e0.checkNotNullExpressionValue(objArrCopyOf, str);
            int length = this.f87507d.length;
            qv.k kVarStep = qv.v.step(qv.v.until(0, tVar.f87507d.length), 2);
            int first = kVarStep.getFirst();
            int last = kVarStep.getLast();
            int step = kVarStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (d(tVar.f87507d[first])) {
                        bVar.setCount(bVar.getCount() + 1);
                    } else {
                        Object[] objArr2 = tVar.f87507d;
                        objArrCopyOf[length] = objArr2[first];
                        objArrCopyOf[length + 1] = objArr2[first + 1];
                        length += 2;
                    }
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            if (length != this.f87507d.length) {
                if (length == tVar.f87507d.length) {
                    return tVar;
                }
                if (length == objArrCopyOf.length) {
                    return new t(0, 0, objArrCopyOf, ownership);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                e0.checkNotNullExpressionValue(objArrCopyOf2, str);
                return new t(0, 0, objArrCopyOf2, ownership);
            }
        } else {
            int i13 = this.f87505b | tVar.f87505b;
            int i14 = this.f87504a;
            int i15 = tVar.f87504a;
            int i16 = (i14 ^ i15) & (~i13);
            int i17 = i14 & i15;
            while (i17 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i17);
                if (e0.areEqual(this.f87507d[entryKeyIndex$runtime(iLowestOneBit)], tVar.f87507d[tVar.entryKeyIndex$runtime(iLowestOneBit)])) {
                    i16 |= iLowestOneBit;
                } else {
                    i13 |= iLowestOneBit;
                }
                i17 ^= iLowestOneBit;
            }
            if ((i13 & i16) != 0) {
                a3.throwIllegalStateException("Check failed.");
            }
            t tVar2 = (e0.areEqual(this.f87506c, fVar.getOwnership()) && this.f87504a == i16 && this.f87505b == i13) ? this : new t(i16, i13, new Object[Integer.bitCount(i13) + (Integer.bitCount(i16) * 2)]);
            int i18 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr3 = tVar2.f87507d;
                int length2 = (objArr3.length - i12) - i18;
                if (f(iLowestOneBit2)) {
                    tVarG = nodeAtIndex$runtime(nodeIndex$runtime(iLowestOneBit2));
                    if (tVar.f(iLowestOneBit2)) {
                        tVarG = tVarG.mutablePutAll(tVar.nodeAtIndex$runtime(tVar.nodeIndex$runtime(iLowestOneBit2)), i10 + 5, bVar, fVar);
                    } else if (tVar.hasEntryAt$runtime(iLowestOneBit2)) {
                        int iEntryKeyIndex$runtime = tVar.entryKeyIndex$runtime(iLowestOneBit2);
                        Object obj = tVar.f87507d[iEntryKeyIndex$runtime];
                        Object objN = tVar.n(iEntryKeyIndex$runtime);
                        int size = fVar.size();
                        tVarG = tVarG.mutablePut(obj != null ? obj.hashCode() : 0, obj, objN, i10 + 5, fVar);
                        if (fVar.size() == size) {
                            bVar.setCount(bVar.getCount() + i12);
                        }
                    }
                    i11 = i12;
                } else if (tVar.f(iLowestOneBit2)) {
                    tVarG = tVar.nodeAtIndex$runtime(tVar.nodeIndex$runtime(iLowestOneBit2));
                    if (hasEntryAt$runtime(iLowestOneBit2)) {
                        int iEntryKeyIndex$runtime2 = entryKeyIndex$runtime(iLowestOneBit2);
                        Object obj2 = this.f87507d[iEntryKeyIndex$runtime2];
                        i11 = i12;
                        int i19 = i10 + 5;
                        if (tVarG.containsKey(obj2 != null ? obj2.hashCode() : 0, obj2, i19)) {
                            bVar.setCount(bVar.getCount() + 1);
                        } else {
                            tVarG = tVarG.mutablePut(obj2 != null ? obj2.hashCode() : 0, obj2, n(iEntryKeyIndex$runtime2), i19, fVar);
                        }
                    } else {
                        i11 = i12;
                    }
                } else {
                    i11 = i12;
                    int iEntryKeyIndex$runtime3 = entryKeyIndex$runtime(iLowestOneBit2);
                    Object obj3 = this.f87507d[iEntryKeyIndex$runtime3];
                    Object objN2 = n(iEntryKeyIndex$runtime3);
                    int iEntryKeyIndex$runtime4 = tVar.entryKeyIndex$runtime(iLowestOneBit2);
                    Object obj4 = tVar.f87507d[iEntryKeyIndex$runtime4];
                    tVarG = g(obj3 != null ? obj3.hashCode() : 0, obj3, objN2, obj4 != null ? obj4.hashCode() : 0, obj4, tVar.n(iEntryKeyIndex$runtime4), i10 + 5, fVar.getOwnership());
                }
                objArr3[length2] = tVarG;
                i18++;
                i13 ^= iLowestOneBit2;
                i12 = i11;
            }
            int i20 = 0;
            while (i16 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i16);
                int i21 = i20 * 2;
                if (tVar.hasEntryAt$runtime(iLowestOneBit3)) {
                    int iEntryKeyIndex$runtime5 = tVar.entryKeyIndex$runtime(iLowestOneBit3);
                    Object[] objArr4 = tVar2.f87507d;
                    objArr4[i21] = tVar.f87507d[iEntryKeyIndex$runtime5];
                    objArr4[i21 + 1] = tVar.n(iEntryKeyIndex$runtime5);
                    if (hasEntryAt$runtime(iLowestOneBit3)) {
                        bVar.setCount(bVar.getCount() + 1);
                    }
                } else {
                    int iEntryKeyIndex$runtime6 = entryKeyIndex$runtime(iLowestOneBit3);
                    Object[] objArr5 = tVar2.f87507d;
                    objArr5[i21] = this.f87507d[iEntryKeyIndex$runtime6];
                    objArr5[i21 + 1] = n(iEntryKeyIndex$runtime6);
                }
                i20++;
                i16 ^= iLowestOneBit3;
            }
            if (!e(tVar2)) {
                return tVar.e(tVar2) ? tVar : tVar2;
            }
        }
        return this;
    }

    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }

    public final t mutableRemove(int i10, Object obj, Object obj2, int i11, f fVar) {
        t tVar;
        t tVarMutableRemove;
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (e0.areEqual(obj, this.f87507d[iEntryKeyIndex$runtime]) && e0.areEqual(obj2, n(iEntryKeyIndex$runtime))) {
                return i(iEntryKeyIndex$runtime, iIndexSegment, fVar);
            }
        } else if (f(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (i11 == 30) {
                qv.k kVarStep = qv.v.step(qv.v.until(0, tVarNodeAtIndex$runtime.f87507d.length), 2);
                int first = kVarStep.getFirst();
                int last = kVarStep.getLast();
                int step = kVarStep.getStep();
                if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                    tVarMutableRemove = tVarNodeAtIndex$runtime;
                    tVar = tVarNodeAtIndex$runtime;
                } else {
                    while (true) {
                        if (!e0.areEqual(obj, tVarNodeAtIndex$runtime.f87507d[first]) || !e0.areEqual(obj2, tVarNodeAtIndex$runtime.n(first))) {
                            if (first == last) {
                                break;
                            }
                            first += step;
                        } else {
                            tVarMutableRemove = tVarNodeAtIndex$runtime.h(first, fVar);
                            break;
                        }
                    }
                    tVarMutableRemove = tVarNodeAtIndex$runtime;
                    tVar = tVarNodeAtIndex$runtime;
                }
            } else {
                tVar = tVarNodeAtIndex$runtime;
                tVarMutableRemove = tVar.mutableRemove(i10, obj, obj2, i11 + 5, fVar);
            }
            return j(tVar, tVarMutableRemove, iNodeIndex$runtime, iIndexSegment, fVar.getOwnership());
        }
        return this;
    }

    public final t remove(int i10, Object obj, Object obj2, int i11) {
        int iIndexSegment = 1 << x.indexSegment(i10, i11);
        t tVarRemove = null;
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (e0.areEqual(obj, this.f87507d[iEntryKeyIndex$runtime]) && e0.areEqual(obj2, n(iEntryKeyIndex$runtime))) {
                Object[] objArr = this.f87507d;
                if (objArr.length == 2) {
                    return null;
                }
                return new t(this.f87504a ^ iIndexSegment, this.f87505b, x.access$removeEntryAtIndex(objArr, iEntryKeyIndex$runtime));
            }
        } else if (f(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            t tVarNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (i11 == 30) {
                qv.k kVarStep = qv.v.step(qv.v.until(0, tVarNodeAtIndex$runtime.f87507d.length), 2);
                int first = kVarStep.getFirst();
                int last = kVarStep.getLast();
                int step = kVarStep.getStep();
                if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                    tVarRemove = tVarNodeAtIndex$runtime;
                } else {
                    while (true) {
                        if (!e0.areEqual(obj, tVarNodeAtIndex$runtime.f87507d[first]) || !e0.areEqual(obj2, tVarNodeAtIndex$runtime.n(first))) {
                            if (first == last) {
                                break;
                            }
                            first += step;
                        } else {
                            Object[] objArr2 = tVarNodeAtIndex$runtime.f87507d;
                            if (objArr2.length != 2) {
                                tVarRemove = new t(0, 0, x.access$removeEntryAtIndex(objArr2, first));
                            }
                        }
                    }
                    tVarRemove = tVarNodeAtIndex$runtime;
                }
            } else {
                tVarRemove = tVarNodeAtIndex$runtime.remove(i10, obj, obj2, i11 + 5);
            }
            return l(tVarNodeAtIndex$runtime, tVarRemove, iNodeIndex$runtime, iIndexSegment);
        }
        return this;
    }
}
