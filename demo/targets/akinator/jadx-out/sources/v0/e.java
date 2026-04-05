package v0;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f88837d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final e f88838e = new e(0, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public int f88839a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f88840b;

    /* renamed from: c, reason: collision with root package name */
    public y0.e f88841c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final e getEMPTY$runtime() {
            return e.f88838e;
        }
    }

    public e(int i10, Object[] objArr, y0.e eVar) {
        this.f88839a = i10;
        this.f88840b = objArr;
        this.f88841c = eVar;
    }

    public static e d(int i10, Object obj, int i11, Object obj2, int i12, y0.e eVar) {
        if (i12 > 30) {
            return new e(0, new Object[]{obj, obj2}, eVar);
        }
        int iIndexSegment = g.indexSegment(i10, i12);
        int iIndexSegment2 = g.indexSegment(i11, i12);
        if (iIndexSegment != iIndexSegment2) {
            return new e((1 << iIndexSegment) | (1 << iIndexSegment2), iIndexSegment < iIndexSegment2 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, eVar);
        }
        return new e(1 << iIndexSegment, new Object[]{d(i10, obj, i11, obj2, i12 + 5, eVar)}, eVar);
    }

    public final int a() {
        if (this.f88839a == 0) {
            return this.f88840b.length;
        }
        int iA = 0;
        for (Object obj : this.f88840b) {
            iA += obj instanceof e ? ((e) obj).a() : 1;
        }
        return iA;
    }

    public final e add(int i10, Object obj, int i11) {
        int iIndexSegment = 1 << g.indexSegment(i10, i11);
        if (c(iIndexSegment)) {
            return new e(this.f88839a | iIndexSegment, g.access$addElementAtIndex(this.f88840b, indexOfCellAt$runtime(iIndexSegment), obj));
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj2 = this.f88840b[iIndexOfCellAt$runtime];
        if (obj2 instanceof e) {
            e eVarG = g(iIndexOfCellAt$runtime);
            e eVar = i11 == 30 ? k0.contains(eVarG.f88840b, obj) ? eVarG : new e(0, g.access$addElementAtIndex(eVarG.f88840b, 0, obj)) : eVarG.add(i10, obj, i11 + 5);
            if (eVarG != eVar) {
                return h(eVar, iIndexOfCellAt$runtime);
            }
        } else if (!e0.areEqual(obj, obj2)) {
            Object[] objArr = this.f88840b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iIndexOfCellAt$runtime] = e(iIndexOfCellAt$runtime, i10, obj, i11, null);
            return new e(this.f88839a, objArrCopyOf);
        }
        return this;
    }

    public final boolean b(e eVar) {
        if (this == eVar) {
            return true;
        }
        if (this.f88839a == eVar.f88839a) {
            int length = this.f88840b.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f88840b[i10] == eVar.f88840b[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean c(int i10) {
        return (i10 & this.f88839a) == 0;
    }

    public final boolean contains(int i10, Object obj, int i11) {
        int iIndexSegment = 1 << g.indexSegment(i10, i11);
        if (c(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj2 = this.f88840b[iIndexOfCellAt$runtime];
        if (!(obj2 instanceof e)) {
            return e0.areEqual(obj, obj2);
        }
        e eVarG = g(iIndexOfCellAt$runtime);
        return i11 == 30 ? k0.contains(eVarG.f88840b, obj) : eVarG.contains(i10, obj, i11 + 5);
    }

    public final boolean containsAll(e eVar, int i10) {
        if (this == eVar) {
            return true;
        }
        if (i10 > 30) {
            for (Object obj : eVar.f88840b) {
                if (!k0.contains(this.f88840b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i11 = this.f88839a;
        int i12 = eVar.f88839a;
        int i13 = i11 & i12;
        if (i13 != i12) {
            return false;
        }
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = eVar.indexOfCellAt$runtime(iLowestOneBit);
            Object obj2 = this.f88840b[iIndexOfCellAt$runtime];
            Object obj3 = eVar.f88840b[iIndexOfCellAt$runtime2];
            boolean z10 = obj2 instanceof e;
            boolean z11 = obj3 instanceof e;
            if (z10 && z11) {
                e0.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                e0.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((e) obj2).containsAll((e) obj3, i10 + 5)) {
                    return false;
                }
            } else if (z10) {
                e0.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((e) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i10 + 5)) {
                    return false;
                }
            } else if (z11 || !e0.areEqual(obj2, obj3)) {
                return false;
            }
            i13 ^= iLowestOneBit;
        }
        return true;
    }

    public final e e(int i10, int i11, Object obj, int i12, y0.e eVar) {
        Object obj2 = this.f88840b[i10];
        return d(obj2 != null ? obj2.hashCode() : 0, obj2, i11, obj, i12 + 5, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final e f(int i10, e eVar, y0.e eVar2) {
        ?? r02 = eVar.f88840b;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof e)) {
                if (this.f88840b.length == 1) {
                    eVar.f88839a = this.f88839a;
                    return eVar;
                }
                eVar = r03;
            }
        }
        if (this.f88841c == eVar2) {
            this.f88840b[i10] = eVar;
            return this;
        }
        Object[] objArr = this.f88840b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = eVar;
        return new e(this.f88839a, objArrCopyOf, eVar2);
    }

    public final e g(int i10) {
        Object obj = this.f88840b[i10];
        e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (e) obj;
    }

    public final int getBitmap() {
        return this.f88839a;
    }

    public final Object[] getBuffer() {
        return this.f88840b;
    }

    public final y0.e getOwnedBy() {
        return this.f88841c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final e h(e eVar, int i10) {
        ?? r02 = eVar.f88840b;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof e)) {
                if (this.f88840b.length == 1) {
                    eVar.f88839a = this.f88839a;
                    return eVar;
                }
                eVar = r03;
            }
        }
        Object[] objArr = this.f88840b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = eVar;
        return new e(this.f88839a, objArrCopyOf);
    }

    public final int indexOfCellAt$runtime(int i10) {
        return Integer.bitCount((i10 - 1) & this.f88839a);
    }

    public final e mutableAdd(int i10, Object obj, int i11, b bVar) {
        e eVarMutableAdd;
        int iIndexSegment = 1 << g.indexSegment(i10, i11);
        if (c(iIndexSegment)) {
            bVar.setSize(bVar.size() + 1);
            y0.e ownership$runtime = bVar.getOwnership$runtime();
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
            if (this.f88841c != ownership$runtime) {
                return new e(this.f88839a | iIndexSegment, g.access$addElementAtIndex(this.f88840b, iIndexOfCellAt$runtime, obj), ownership$runtime);
            }
            this.f88840b = g.access$addElementAtIndex(this.f88840b, iIndexOfCellAt$runtime, obj);
            this.f88839a |= iIndexSegment;
            return this;
        }
        int iIndexOfCellAt$runtime2 = indexOfCellAt$runtime(iIndexSegment);
        Object obj2 = this.f88840b[iIndexOfCellAt$runtime2];
        if (obj2 instanceof e) {
            e eVarG = g(iIndexOfCellAt$runtime2);
            if (i11 != 30) {
                eVarMutableAdd = eVarG.mutableAdd(i10, obj, i11 + 5, bVar);
            } else if (k0.contains(eVarG.f88840b, obj)) {
                eVarMutableAdd = eVarG;
            } else {
                bVar.setSize(bVar.size() + 1);
                if (eVarG.f88841c == bVar.getOwnership$runtime()) {
                    eVarG.f88840b = g.access$addElementAtIndex(eVarG.f88840b, 0, obj);
                    eVarMutableAdd = eVarG;
                } else {
                    eVarMutableAdd = new e(0, g.access$addElementAtIndex(eVarG.f88840b, 0, obj), bVar.getOwnership$runtime());
                }
            }
            if (eVarG != eVarMutableAdd) {
                return f(iIndexOfCellAt$runtime2, eVarMutableAdd, bVar.getOwnership$runtime());
            }
        } else if (!e0.areEqual(obj, obj2)) {
            bVar.setSize(bVar.size() + 1);
            y0.e ownership$runtime2 = bVar.getOwnership$runtime();
            if (this.f88841c == ownership$runtime2) {
                this.f88840b[iIndexOfCellAt$runtime2] = e(iIndexOfCellAt$runtime2, i10, obj, i11, ownership$runtime2);
                return this;
            }
            Object[] objArr = this.f88840b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iIndexOfCellAt$runtime2] = e(iIndexOfCellAt$runtime2, i10, obj, i11, ownership$runtime2);
            return new e(this.f88839a, objArrCopyOf, ownership$runtime2);
        }
        return this;
    }

    public final e mutableAddAll(e eVar, int i10, y0.b bVar, b bVar2) {
        Object objD;
        if (this == eVar) {
            bVar.setCount(a() + bVar.getCount());
            return this;
        }
        if (i10 > 30) {
            y0.e ownership$runtime = bVar2.getOwnership$runtime();
            if (this == eVar) {
                bVar.plusAssign(this.f88840b.length);
                return this;
            }
            Object[] objArr = this.f88840b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + eVar.f88840b.length);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            Object[] objArr2 = eVar.f88840b;
            int length = this.f88840b.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < objArr2.length) {
                y0.a.m8013assert(i12 <= i11);
                if (!k0.contains(this.f88840b, objArr2[i11])) {
                    objArrCopyOf[length + i12] = objArr2[i11];
                    i12++;
                    y0.a.m8013assert(length + i12 <= objArrCopyOf.length);
                }
                i11++;
            }
            int length2 = i12 + this.f88840b.length;
            bVar.plusAssign(objArrCopyOf.length - length2);
            if (length2 != this.f88840b.length) {
                if (length2 == eVar.f88840b.length) {
                    return eVar;
                }
                if (length2 != objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
                    e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                }
                if (!e0.areEqual(this.f88841c, ownership$runtime)) {
                    return new e(0, objArrCopyOf, ownership$runtime);
                }
                this.f88840b = objArrCopyOf;
                return this;
            }
        } else {
            int i13 = this.f88839a;
            int i14 = eVar.f88839a | i13;
            e eVar2 = (i14 == i13 && e0.areEqual(this.f88841c, bVar2.getOwnership$runtime())) ? this : new e(i14, new Object[Integer.bitCount(i14)], bVar2.getOwnership$runtime());
            int i15 = 0;
            while (i14 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i14);
                int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
                int iIndexOfCellAt$runtime2 = eVar.indexOfCellAt$runtime(iLowestOneBit);
                Object[] objArr3 = eVar2.f88840b;
                if (c(iLowestOneBit)) {
                    objD = eVar.f88840b[iIndexOfCellAt$runtime2];
                } else if (eVar.c(iLowestOneBit)) {
                    objD = this.f88840b[iIndexOfCellAt$runtime];
                } else {
                    objD = this.f88840b[iIndexOfCellAt$runtime];
                    Object obj = eVar.f88840b[iIndexOfCellAt$runtime2];
                    boolean z10 = objD instanceof e;
                    boolean z11 = obj instanceof e;
                    if (z10 && z11) {
                        e0.checkNotNull(objD, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        objD = ((e) objD).mutableAddAll((e) obj, i10 + 5, bVar, bVar2);
                    } else if (z10) {
                        e0.checkNotNull(objD, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        e eVar3 = (e) objD;
                        int size = bVar2.size();
                        objD = eVar3.mutableAdd(obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2);
                        if (bVar2.size() == size) {
                            bVar.setCount(bVar.getCount() + 1);
                        }
                    } else if (z11) {
                        e0.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        e eVar4 = (e) obj;
                        int size2 = bVar2.size();
                        objD = eVar4.mutableAdd(objD != null ? objD.hashCode() : 0, objD, i10 + 5, bVar2);
                        if (bVar2.size() == size2) {
                            bVar.setCount(bVar.getCount() + 1);
                        }
                    } else if (e0.areEqual(objD, obj)) {
                        bVar.setCount(bVar.getCount() + 1);
                    } else {
                        objD = d(objD != null ? objD.hashCode() : 0, objD, obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2.getOwnership$runtime());
                    }
                    objArr3[i15] = objD;
                    i15++;
                    i14 ^= iLowestOneBit;
                }
                objArr3[i15] = objD;
                i15++;
                i14 ^= iLowestOneBit;
            }
            if (!b(eVar2)) {
                return eVar.b(eVar2) ? eVar : eVar2;
            }
        }
        return this;
    }

    public final e mutableRemove(int i10, Object obj, int i11, b bVar) {
        e eVarMutableRemove;
        int iIndexSegment = 1 << g.indexSegment(i10, i11);
        if (!c(iIndexSegment)) {
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
            Object obj2 = this.f88840b[iIndexOfCellAt$runtime];
            if (obj2 instanceof e) {
                e eVarG = g(iIndexOfCellAt$runtime);
                if (i11 == 30) {
                    int iIndexOf = k0.indexOf(eVarG.f88840b, obj);
                    if (iIndexOf != -1) {
                        bVar.setSize(bVar.size() - 1);
                        y0.e ownership$runtime = bVar.getOwnership$runtime();
                        if (eVarG.f88841c == ownership$runtime) {
                            eVarG.f88840b = g.access$removeCellAtIndex(eVarG.f88840b, iIndexOf);
                            eVarMutableRemove = eVarG;
                        } else {
                            eVarMutableRemove = new e(0, g.access$removeCellAtIndex(eVarG.f88840b, iIndexOf), ownership$runtime);
                        }
                    } else {
                        eVarMutableRemove = eVarG;
                    }
                } else {
                    eVarMutableRemove = eVarG.mutableRemove(i10, obj, i11 + 5, bVar);
                }
                if (this.f88841c == bVar.getOwnership$runtime() || eVarG != eVarMutableRemove) {
                    return f(iIndexOfCellAt$runtime, eVarMutableRemove, bVar.getOwnership$runtime());
                }
            } else if (e0.areEqual(obj, obj2)) {
                bVar.setSize(bVar.size() - 1);
                y0.e ownership$runtime2 = bVar.getOwnership$runtime();
                if (this.f88841c != ownership$runtime2) {
                    return new e(this.f88839a ^ iIndexSegment, g.access$removeCellAtIndex(this.f88840b, iIndexOfCellAt$runtime), ownership$runtime2);
                }
                this.f88840b = g.access$removeCellAtIndex(this.f88840b, iIndexOfCellAt$runtime);
                this.f88839a ^= iIndexSegment;
                return this;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRemoveAll(v0.e r18, int r19, y0.b r20, v0.b r21) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e.mutableRemoveAll(v0.e, int, y0.b, v0.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRetainAll(v0.e r17, int r18, y0.b r19, v0.b r20) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e.mutableRetainAll(v0.e, int, y0.b, v0.b):java.lang.Object");
    }

    public final e remove(int i10, Object obj, int i11) {
        e eVarRemove;
        int iIndexSegment = 1 << g.indexSegment(i10, i11);
        if (!c(iIndexSegment)) {
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
            Object obj2 = this.f88840b[iIndexOfCellAt$runtime];
            if (obj2 instanceof e) {
                e eVarG = g(iIndexOfCellAt$runtime);
                if (i11 == 30) {
                    int iIndexOf = k0.indexOf(eVarG.f88840b, obj);
                    eVarRemove = iIndexOf != -1 ? new e(0, g.access$removeCellAtIndex(eVarG.f88840b, iIndexOf)) : eVarG;
                } else {
                    eVarRemove = eVarG.remove(i10, obj, i11 + 5);
                }
                if (eVarG != eVarRemove) {
                    return h(eVarRemove, iIndexOfCellAt$runtime);
                }
            } else if (e0.areEqual(obj, obj2)) {
                return new e(this.f88839a ^ iIndexSegment, g.access$removeCellAtIndex(this.f88840b, iIndexOfCellAt$runtime));
            }
        }
        return this;
    }

    public final void setBitmap(int i10) {
        this.f88839a = i10;
    }

    public final void setBuffer(Object[] objArr) {
        this.f88840b = objArr;
    }

    public final void setOwnedBy(y0.e eVar) {
        this.f88841c = eVar;
    }

    public e(int i10, Object[] objArr) {
        this(i10, objArr, null);
    }
}
