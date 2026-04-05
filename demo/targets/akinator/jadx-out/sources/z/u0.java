package z;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends l1 {

    /* renamed from: f, reason: collision with root package name */
    public int f96947f;

    public u0() {
        this(0, 1, null);
    }

    public final int a(int i10) {
        int i11 = this.f96868d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f96865a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void adjustStorage$collection() {
        if (this.f96868d > 8) {
            if (Long.compare(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96869e) * 32) ^ Long.MIN_VALUE, tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96868d) * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(m1.nextCapacity(this.f96868d));
    }

    public final Map<Object, Object> asMutableMap() {
        return new r0(this);
    }

    public final void b(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, m1.normalizeCapacity(i10)) : 0;
        this.f96868d = iMax;
        if (iMax == 0) {
            jArr = m1.f96876a;
        } else {
            long[] jArr2 = new long[((iMax + 15) & (-8)) >> 3];
            uu.f0.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i11 = iMax >> 3;
            long j10 = 255 << ((iMax & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.f96865a = jArr;
        this.f96947f = m1.loadedCapacity(getCapacity()) - this.f96869e;
        Object[] objArr = a0.a.f3384c;
        this.f96866b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f96867c = objArr;
    }

    public final void clear() {
        this.f96869e = 0;
        long[] jArr = this.f96865a;
        if (jArr != m1.f96876a) {
            uu.f0.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f96865a;
            int i10 = this.f96868d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        uu.f0.fill(this.f96867c, (Object) null, 0, this.f96868d);
        uu.f0.fill(this.f96866b, (Object) null, 0, this.f96868d);
        this.f96947f = m1.loadedCapacity(getCapacity()) - this.f96869e;
    }

    public final Object compute(Object obj, kv.p computeBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(obj);
        boolean z10 = iFindInsertIndex < 0;
        Object objInvoke = computeBlock.invoke(obj, z10 ? null : this.f96867c[iFindInsertIndex]);
        if (!z10) {
            this.f96867c[iFindInsertIndex] = objInvoke;
            return objInvoke;
        }
        int i10 = ~iFindInsertIndex;
        this.f96866b[i10] = obj;
        this.f96867c[i10] = objInvoke;
        return objInvoke;
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.f96865a;
        int i10 = this.f96868d;
        Object[] objArr = this.f96866b;
        Object[] objArr2 = this.f96867c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = uu.k0.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iA = a(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iA - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[uu.k0.getLastIndex(jArr)] = jArr[i20];
                } else {
                    int i21 = iA >> 3;
                    long j12 = jArr[i21];
                    int i22 = (iA & 7) << 3;
                    if (((j12 >> i22) & 255) == 128) {
                        jArr[i21] = ((r8 & 127) << i22) | (j12 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iA] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iA] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i21] = ((r8 & 127) << i22) | (j12 & (~(255 << i22)));
                        Object obj2 = objArr[iA];
                        objArr[iA] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iA];
                        objArr2[iA] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[uu.k0.getLastIndex(jArr)] = jArr[i20];
                }
                i15++;
                i12 = i20;
            } else {
                i15++;
            }
        }
        this.f96947f = m1.loadedCapacity(getCapacity()) - this.f96869e;
    }

    public final int findInsertIndex(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f96868d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f96865a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.e0.areEqual(this.f96866b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                if (this.f96947f == 0 && ((this.f96865a[iA >> 3] >> ((iA & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iA = a(i11);
                }
                this.f96869e++;
                int i19 = this.f96947f;
                long[] jArr2 = this.f96865a;
                int i20 = iA >> 3;
                long j14 = jArr2[i20];
                int i21 = (iA & 7) << 3;
                this.f96947f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f96868d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iA - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iA;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final Object getOrPut(Object obj, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj2 = get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = defaultValue.invoke();
        set(obj, objInvoke);
        return objInvoke;
    }

    public final void minusAssign(Object obj) {
        remove(obj);
    }

    public final void plusAssign(tu.v pair) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    public final Object put(Object obj, Object obj2) {
        int iFindInsertIndex = findInsertIndex(obj);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.f96867c;
        Object obj3 = objArr[iFindInsertIndex];
        this.f96866b[iFindInsertIndex] = obj;
        objArr[iFindInsertIndex] = obj2;
        return obj3;
    }

    public final void putAll(tu.v[] pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        for (tu.v vVar : pairs) {
            set(vVar.component1(), vVar.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f96868d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f96865a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f96866b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.e0.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u0.remove(java.lang.Object):java.lang.Object");
    }

    public final void removeIf(kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (((Boolean) predicate.invoke(this.f96866b[i13], this.f96867c[i13])).booleanValue()) {
                            removeValueAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final Object removeValueAt(int i10) {
        this.f96869e--;
        long[] jArr = this.f96865a;
        int i11 = this.f96868d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f96866b[i10] = null;
        Object[] objArr = this.f96867c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void resizeStorage$collection(int i10) {
        int i11;
        long[] jArr = this.f96865a;
        Object[] objArr = this.f96866b;
        Object[] objArr2 = this.f96867c;
        int i12 = this.f96868d;
        b(i10);
        long[] jArr2 = this.f96865a;
        Object[] objArr3 = this.f96866b;
        Object[] objArr4 = this.f96867c;
        int i13 = this.f96868d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iA = a(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iA >> 3;
                int i17 = (iA & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iA - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iA] = obj;
                objArr4[iA] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void set(Object obj, Object obj2) {
        int iFindInsertIndex = findInsertIndex(obj);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.f96866b[iFindInsertIndex] = obj;
        this.f96867c[iFindInsertIndex] = obj2;
    }

    public final int trim() {
        int i10 = this.f96868d;
        int iNormalizeCapacity = m1.normalizeCapacity(m1.unloadedCapacity(this.f96869e));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this.f96868d;
    }

    public /* synthetic */ u0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(Object[] keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        for (Object obj : keys) {
            remove(obj);
        }
    }

    public final void plusAssign(tu.v[] pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public u0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            a0.d.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        b(m1.unloadedCapacity(i10));
    }

    public final void plusAssign(Iterable<? extends tu.v> pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(Iterable<? extends tu.v> pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        for (tu.v vVar : pairs) {
            set(vVar.component1(), vVar.component2());
        }
    }

    public final void minusAssign(Iterable<Object> keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Iterator<Object> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(rv.t pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Map<Object, Object> from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(rv.t pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        Iterator<Object> it = pairs.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) it.next();
            set(vVar.component1(), vVar.component2());
        }
    }

    public final void minusAssign(rv.t keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Iterator<Object> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(l1 from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(Map<Object, Object> from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        for (Map.Entry<Object, Object> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    public final void minusAssign(o1 keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.f96888b;
        long[] jArr = keys.f96887a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f96868d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f96865a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f96866b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.e0.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.f96867c
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r7)
            if (r1 == 0) goto L83
            r0.removeValueAt(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u0.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final void putAll(l1 from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        Object[] objArr = from.f96866b;
        Object[] objArr2 = from.f96867c;
        long[] jArr = from.f96865a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        set(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void minusAssign(f1 keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.f96812a;
        int i10 = keys.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }
}
