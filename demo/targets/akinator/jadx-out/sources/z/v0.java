package z;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class v0 extends o1 {

    /* renamed from: e, reason: collision with root package name */
    public int f96956e;

    public v0() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f96889c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f96887a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.e0.areEqual(this.f96888b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iB = b(i11);
                if (this.f96956e == 0 && ((this.f96887a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iB = b(i11);
                }
                this.f96890d++;
                int i19 = this.f96956e;
                long[] jArr2 = this.f96887a;
                int i20 = iB >> 3;
                long j14 = jArr2[i20];
                int i21 = (iB & 7) << 3;
                this.f96956e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f96889c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iB - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iB;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final boolean add(Object obj) {
        int size = getSize();
        this.f96888b[a(obj)] = obj;
        return getSize() != size;
    }

    public final boolean addAll(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    public final void adjustStorage$collection() {
        if (this.f96889c > 8) {
            if (Long.compare(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96890d) * 32) ^ Long.MIN_VALUE, tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96889c) * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(m1.nextCapacity(this.f96889c));
    }

    public final Set<Object> asMutableSet() {
        return new y0(this);
    }

    public final int b(int i10) {
        int i11 = this.f96889c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f96887a;
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

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, m1.normalizeCapacity(i10)) : 0;
        this.f96889c = iMax;
        if (iMax == 0) {
            jArr = m1.f96876a;
        } else {
            long[] jArr2 = new long[((iMax + 15) & (-8)) >> 3];
            uu.f0.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f96887a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f96956e = m1.loadedCapacity(getCapacity()) - this.f96890d;
        this.f96888b = iMax == 0 ? a0.a.f3384c : new Object[iMax];
    }

    public final void clear() {
        this.f96890d = 0;
        long[] jArr = this.f96887a;
        if (jArr != m1.f96876a) {
            uu.f0.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f96887a;
            int i10 = this.f96889c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        uu.f0.fill(this.f96888b, (Object) null, 0, this.f96889c);
        this.f96956e = m1.loadedCapacity(getCapacity()) - this.f96890d;
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.f96887a;
        int i10 = this.f96889c;
        Object[] objArr = this.f96888b;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = uu.k0.getLastIndex(jArr);
        int i14 = lastIndex - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iB = b(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iB - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r7 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[uu.k0.getLastIndex(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iB >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iB & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r7 & 127) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iB] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r7 & 127) << i22) | (j14 & (~(255 << i22)));
                        Object obj2 = objArr[iB];
                        objArr[iB] = objArr[i15];
                        objArr[i15] = obj2;
                        i15--;
                    }
                    jArr[uu.k0.getLastIndex(jArr)] = (jArr[i20] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        this.f96956e = m1.loadedCapacity(getCapacity()) - this.f96890d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(java.lang.Object r14) {
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
            int r3 = r13.f96889c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f96887a
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
            java.lang.Object[] r11 = r13.f96888b
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
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v0.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(Object obj) {
        this.f96888b[a(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r18) {
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
            int r5 = r0.f96889c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f96887a
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
            java.lang.Object[] r15 = r0.f96888b
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
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v0.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void removeElementAt(int i10) {
        this.f96890d--;
        long[] jArr = this.f96887a;
        int i11 = this.f96889c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f96888b[i10] = null;
    }

    public final void removeIf(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96888b;
        long[] jArr = this.f96887a;
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
                        if (((Boolean) predicate.invoke(objArr[i13])).booleanValue()) {
                            removeElementAt(i13);
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

    public final void resizeStorage$collection(int i10) {
        long[] jArr = this.f96887a;
        Object[] objArr = this.f96888b;
        int i11 = this.f96889c;
        c(i10);
        long[] jArr2 = this.f96887a;
        Object[] objArr2 = this.f96888b;
        int i12 = this.f96889c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iB = b(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iB >> 3;
                int i16 = (iB & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iB - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iB] = obj;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection<java.lang.Object> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.f96888b
            int r3 = r0.f96890d
            long[] r4 = r0.f96887a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = uu.y0.contains(r14, r15)
            if (r14 != 0) goto L4c
            r0.removeElementAt(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f96890d
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v0.retainAll(java.util.Collection):boolean");
    }

    public final int trim() {
        int i10 = this.f96889c;
        int iNormalizeCapacity = m1.normalizeCapacity(m1.unloadedCapacity(this.f96890d));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this.f96889c;
    }

    public v0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            a0.d.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        c(m1.unloadedCapacity(i10));
    }

    public final void plusAssign(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (Object obj : elements) {
            plusAssign(obj);
        }
    }

    public final boolean addAll(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    public final boolean removeAll(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void plusAssign(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public /* synthetic */ v0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final boolean addAll(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    public final void plusAssign(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final boolean removeAll(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void minusAssign(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (Object obj : elements) {
            minusAssign(obj);
        }
    }

    public final void plusAssign(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96888b;
        long[] jArr = elements.f96887a;
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
                        plusAssign(objArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(z.o1 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            java.lang.String r2 = com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ.boQLzKaRMVPCkE
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.f96888b
            int r3 = r0.f96890d
            long[] r4 = r0.f96887a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L55
            r7 = r6
        L17:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L50
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L31:
            if (r12 >= r10) goto L4e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L4a
            r0.removeElementAt(r13)
        L4a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L4e:
            if (r10 != r11) goto L55
        L50:
            if (r7 == r5) goto L55
            int r7 = r7 + 1
            goto L17
        L55:
            int r1 = r0.f96890d
            if (r3 == r1) goto L5b
            r1 = 1
            return r1
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v0.retainAll(z.o1):boolean");
    }

    public final boolean addAll(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    public final void minusAssign(rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final boolean removeAll(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void minusAssign(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final boolean addAll(i1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    public final boolean removeAll(i1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    public final void minusAssign(o1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96888b;
        long[] jArr = elements.f96887a;
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
                        minusAssign(objArr[(i10 << 3) + i12]);
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

    public final void plusAssign(i1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96828b;
        long[] jArr = elements.f96829c;
        int i10 = elements.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & 2147483647L);
            plusAssign(objArr[i10]);
            i10 = i11;
        }
    }

    public final boolean addAll(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign(elements);
        return size != getSize();
    }

    public final boolean removeAll(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign(elements);
        return size != getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(z.i1 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.f96888b
            int r3 = r0.f96890d
            long[] r4 = r0.f96887a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L54
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4f
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L4d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L49
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L49
            r0.removeElementAt(r13)
        L49:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L4d:
            if (r10 != r11) goto L54
        L4f:
            if (r7 == r5) goto L54
            int r7 = r7 + 1
            goto L16
        L54:
            int r1 = r0.f96890d
            if (r3 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v0.retainAll(z.i1):boolean");
    }

    public final void minusAssign(i1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96828b;
        long[] jArr = elements.f96829c;
        int i10 = elements.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & 2147483647L);
            minusAssign(objArr[i10]);
            i10 = i11;
        }
    }

    public final void plusAssign(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96812a;
        int i10 = elements.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            plusAssign(objArr[i11]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(kv.l r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.f96888b
            int r3 = r0.f96890d
            long[] r4 = r0.f96887a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5a
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L55
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L53
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L4f
            r0.removeElementAt(r13)
        L4f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L53:
            if (r10 != r11) goto L5a
        L55:
            if (r7 == r5) goto L5a
            int r7 = r7 + 1
            goto L16
        L5a:
            int r1 = r0.f96890d
            if (r3 == r1) goto L60
            r1 = 1
            return r1
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v0.retainAll(kv.l):boolean");
    }

    public final void minusAssign(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96812a;
        int i10 = elements.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            minusAssign(objArr[i11]);
        }
    }
}
