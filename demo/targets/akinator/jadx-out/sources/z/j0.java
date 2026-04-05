package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends p {

    /* renamed from: f, reason: collision with root package name */
    public int f96836f;

    public j0() {
        this(0, 1, null);
    }

    public final int a(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f96894d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f96891a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f96892b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iB = b(i12);
                if (this.f96836f == 0 && ((this.f96891a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iB = b(i12);
                }
                this.f96895e++;
                int i23 = this.f96836f;
                long[] jArr2 = this.f96891a;
                int i24 = iB >> 3;
                long j14 = jArr2[i24];
                int i25 = (iB & 7) << 3;
                this.f96836f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f96894d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iB - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return iB;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final void adjustStorage$collection() {
        if (this.f96894d > 8) {
            if (Long.compare(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96895e) * 32) ^ Long.MIN_VALUE, tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96894d) * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(m1.nextCapacity(this.f96894d));
    }

    public final int b(int i10) {
        int i11 = this.f96894d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f96891a;
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
        this.f96894d = iMax;
        if (iMax == 0) {
            jArr = m1.f96876a;
        } else {
            long[] jArr2 = new long[((iMax + 15) & (-8)) >> 3];
            uu.f0.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f96891a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f96836f = m1.loadedCapacity(getCapacity()) - this.f96895e;
        this.f96892b = new int[iMax];
        this.f96893c = new Object[iMax];
    }

    public final void clear() {
        this.f96895e = 0;
        long[] jArr = this.f96891a;
        if (jArr != m1.f96876a) {
            uu.f0.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f96891a;
            int i10 = this.f96894d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        uu.f0.fill(this.f96893c, (Object) null, 0, this.f96894d);
        this.f96836f = m1.loadedCapacity(getCapacity()) - this.f96895e;
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.f96891a;
        int i10 = this.f96894d;
        int[] iArr = this.f96892b;
        Object[] objArr = this.f96893c;
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
                int iHashCode = Integer.hashCode(iArr[i15]) * (-862048943);
                int i18 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iB = b(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iB - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[uu.k0.getLastIndex(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iB >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iB & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iB] = iArr[i15];
                        iArr[i15] = i20;
                        objArr[iB] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        int i23 = iArr[iB];
                        iArr[iB] = iArr[i15];
                        iArr[i15] = i23;
                        Object obj = objArr[iB];
                        objArr[iB] = objArr[i15];
                        objArr[i15] = obj;
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
        this.f96836f = m1.loadedCapacity(getCapacity()) - this.f96895e;
    }

    public final Object getOrPut(int i10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = get(i10);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = defaultValue.invoke();
        set(i10, objInvoke);
        return objInvoke;
    }

    public final void minusAssign(int i10) {
        remove(i10);
    }

    public final void plusAssign(p from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final Object put(int i10, Object obj) {
        int iA = a(i10);
        Object[] objArr = this.f96893c;
        Object obj2 = objArr[iA];
        this.f96892b[iA] = i10;
        objArr[iA] = obj;
        return obj2;
    }

    public final void putAll(p from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        int[] iArr = from.f96892b;
        Object[] objArr = from.f96893c;
        long[] jArr = from.f96891a;
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
                        set(iArr[i13], objArr[i13]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f96894d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f96891a
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f96892b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j0.remove(int):java.lang.Object");
    }

    public final void removeIf(kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96891a;
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
                        if (((Boolean) predicate.invoke(Integer.valueOf(this.f96892b[i13]), this.f96893c[i13])).booleanValue()) {
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
        this.f96895e--;
        long[] jArr = this.f96891a;
        int i11 = this.f96894d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f96893c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void resizeStorage$collection(int i10) {
        long[] jArr;
        j0 j0Var = this;
        long[] jArr2 = j0Var.f96891a;
        int[] iArr = j0Var.f96892b;
        Object[] objArr = j0Var.f96893c;
        int i11 = j0Var.f96894d;
        c(i10);
        long[] jArr3 = j0Var.f96891a;
        int[] iArr2 = j0Var.f96892b;
        Object[] objArr2 = j0Var.f96893c;
        int i12 = j0Var.f96894d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iB = j0Var.b(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iB >> 3;
                int i17 = (iB & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iB - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[iB] = i14;
                objArr2[iB] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            j0Var = this;
            jArr2 = jArr;
        }
    }

    public final void set(int i10, Object obj) {
        int iA = a(i10);
        this.f96892b[iA] = i10;
        this.f96893c[iA] = obj;
    }

    public final int trim() {
        int i10 = this.f96894d;
        int iNormalizeCapacity = m1.normalizeCapacity(m1.unloadedCapacity(this.f96895e));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this.f96894d;
    }

    public /* synthetic */ j0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(int[] keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        for (int i10 : keys) {
            remove(i10);
        }
    }

    public j0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            a0.d.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        c(m1.unloadedCapacity(i10));
    }

    public final void minusAssign(q keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.f96899b;
        long[] jArr = keys.f96898a;
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
                        remove(iArr[(i10 << 3) + i12]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(int r19, java.lang.Object r20) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f96894d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f96891a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f96892b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L7d
            r10 = -1
        L6a:
            if (r10 < 0) goto L7c
            java.lang.Object[] r1 = r0.f96893c
            r1 = r1[r10]
            r6 = r20
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r6)
            if (r1 == 0) goto L7c
            r0.removeValueAt(r10)
            return r11
        L7c:
            return r4
        L7d:
            r6 = r20
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.j0.remove(int, java.lang.Object):boolean");
    }

    public final void minusAssign(o keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.f96885a;
        int i10 = keys.f96886b;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(iArr[i11]);
        }
    }
}
