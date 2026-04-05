package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends v {

    /* renamed from: e, reason: collision with root package name */
    public int f96896e;

    public p0() {
        this(0, 1, null);
    }

    public final int a(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f96954c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f96952a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f96953b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iB = b(i11);
                if (this.f96896e == 0 && ((this.f96952a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iB = b(i11);
                }
                this.f96955d++;
                int i19 = this.f96896e;
                long[] jArr2 = this.f96952a;
                int i20 = iB >> 3;
                long j15 = jArr2[i20];
                int i21 = (iB & 7) << 3;
                this.f96896e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f96954c;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iB - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iB;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final boolean add(long j10) {
        int i10 = this.f96955d;
        this.f96953b[a(j10)] = j10;
        return this.f96955d != i10;
    }

    public final boolean addAll(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96955d;
        plusAssign(elements);
        return i10 != this.f96955d;
    }

    public final void adjustStorage$collection() {
        if (this.f96954c > 8) {
            if (Long.compare(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96955d) * 32) ^ Long.MIN_VALUE, tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96954c) * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(m1.nextCapacity(this.f96954c));
    }

    public final int b(int i10) {
        int i11 = this.f96954c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f96952a;
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
        this.f96954c = iMax;
        if (iMax == 0) {
            jArr = m1.f96876a;
        } else {
            long[] jArr2 = new long[((iMax + 15) & (-8)) >> 3];
            uu.f0.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f96952a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f96896e = m1.loadedCapacity(getCapacity()) - this.f96955d;
        this.f96953b = new long[iMax];
    }

    public final void clear() {
        this.f96955d = 0;
        long[] jArr = this.f96952a;
        if (jArr != m1.f96876a) {
            uu.f0.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f96952a;
            int i10 = this.f96954c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f96896e = m1.loadedCapacity(getCapacity()) - this.f96955d;
    }

    public final void d(int i10) {
        this.f96955d--;
        long[] jArr = this.f96952a;
        int i11 = this.f96954c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.f96952a;
        int i10 = this.f96954c;
        long[] jArr2 = this.f96953b;
        int i11 = (i10 + 7) >> 3;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = uu.k0.getLastIndex(jArr);
        int i13 = lastIndex - 1;
        long j12 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j13 = (jArr[i15] >> i16) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Long.hashCode(jArr2[i14]) * (-862048943);
                int i17 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                int iB = b(i17);
                int i18 = i17 & i10;
                boolean z11 = z10;
                if (((iB - i18) & i10) / 8 == ((i14 - i18) & i10) / 8) {
                    jArr[i15] = ((r7 & 127) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[uu.k0.getLastIndex(jArr)] = (jArr[z11 ? 1 : 0] & j12) | Long.MIN_VALUE;
                    i14++;
                    z10 = z11 ? 1 : 0;
                } else {
                    int i19 = iB >> 3;
                    long j14 = jArr[i19];
                    int i20 = (iB & 7) << 3;
                    if (((j14 >> i20) & 255) == 128) {
                        j10 = j12;
                        jArr[i19] = ((r7 & 127) << i20) | (j14 & (~(255 << i20)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iB] = jArr2[i14];
                        jArr2[i14] = 0;
                    } else {
                        j10 = j12;
                        jArr[i19] = ((r7 & 127) << i20) | (j14 & (~(255 << i20)));
                        long j15 = jArr2[iB];
                        jArr2[iB] = jArr2[i14];
                        jArr2[i14] = j15;
                        i14--;
                    }
                    jArr[uu.k0.getLastIndex(jArr)] = (jArr[z11 ? 1 : 0] & j10) | Long.MIN_VALUE;
                    i14++;
                    z10 = z11 ? 1 : 0;
                    j12 = j10;
                }
            } else {
                i14++;
            }
        }
        this.f96896e = m1.loadedCapacity(getCapacity()) - this.f96955d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f96954c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f96952a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f96953b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r10 = -1
        L66:
            if (r10 < 0) goto L6b
            r14.d(r10)
        L6b:
            return
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.p0.minusAssign(long):void");
    }

    public final void plusAssign(long j10) {
        this.f96953b[a(j10)] = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f96954c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f96952a
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
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f96953b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.d(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.p0.remove(long):boolean");
    }

    public final boolean removeAll(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96955d;
        minusAssign(elements);
        return i10 != this.f96955d;
    }

    public final void resizeStorage$collection(int i10) {
        long[] jArr = this.f96952a;
        long[] jArr2 = this.f96953b;
        int i11 = this.f96954c;
        c(i10);
        long[] jArr3 = this.f96952a;
        long[] jArr4 = this.f96953b;
        int i12 = this.f96954c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iB = b(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iB >> 3;
                int i16 = (iB & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((iB - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[iB] = j10;
            }
        }
    }

    public final int trim() {
        int i10 = this.f96954c;
        int iNormalizeCapacity = m1.normalizeCapacity(m1.unloadedCapacity(this.f96955d));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this.f96954c;
    }

    public p0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            a0.d.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        c(m1.unloadedCapacity(i10));
    }

    public final void plusAssign(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            plusAssign(j10);
        }
    }

    public final boolean addAll(v elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96955d;
        plusAssign(elements);
        return i10 != this.f96955d;
    }

    public final boolean removeAll(v elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int i10 = this.f96955d;
        minusAssign(elements);
        return i10 != this.f96955d;
    }

    public final void plusAssign(v elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.f96953b;
        long[] jArr2 = elements.f96952a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        plusAssign(jArr[(i10 << 3) + i12]);
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

    public /* synthetic */ p0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            minusAssign(j10);
        }
    }

    public final void minusAssign(v elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.f96953b;
        long[] jArr2 = elements.f96952a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        minusAssign(jArr[(i10 << 3) + i12]);
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
}
