package z;

import bp.oM.DwaEpyvxz;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.G5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public long[] f96878a = m1.f96876a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f96879b = r.getEmptyIntArray();

    /* renamed from: c, reason: collision with root package name */
    public int[] f96880c = r.getEmptyIntArray();

    /* renamed from: d, reason: collision with root package name */
    public int f96881d;

    /* renamed from: e, reason: collision with root package name */
    public int f96882e;

    public n(kotlin.jvm.internal.u uVar) {
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(n nVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return nVar.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean all(kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f96879b;
        int[] iArr2 = this.f96880c;
        long[] jArr = this.f96878a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!((Boolean) predicate.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr2[i13]))).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this.f96882e != 0;
    }

    public final boolean contains(int i10) {
        return containsKey(i10);
    }

    public final boolean containsKey(int i10) {
        return findKeyIndex(i10) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(int r15) {
        /*
            r14 = this;
            int[] r0 = r14.f96880c
            long[] r1 = r14.f96878a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L44
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L3f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L39
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            if (r15 != r10) goto L39
            r15 = 1
            return r15
        L39:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3d:
            if (r7 != r8) goto L44
        L3f:
            if (r4 == r2) goto L44
            int r4 = r4 + 1
            goto Lb
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.containsValue(int):boolean");
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof z.n
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            z.n r1 = (z.n) r1
            int r3 = r1.getSize()
            int r5 = r0.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            int[] r3 = r0.f96879b
            int[] r5 = r0.f96880c
            long[] r6 = r0.f96878a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L78
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L6a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.findKeyIndex(r15)
            if (r15 < 0) goto L61
            r16 = r2
            int[] r2 = r1.f96880c
            r2 = r2[r15]
            if (r14 == r2) goto L64
        L61:
            return r4
        L62:
            r16 = r2
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L41
        L6a:
            r16 = r2
            if (r11 != r12) goto L7a
            goto L71
        L6f:
            r16 = r2
        L71:
            if (r8 == r7) goto L7a
            int r8 = r8 + 1
            r2 = r16
            goto L27
        L78:
            r16 = r2
        L7a:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f96881d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f96878a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f96879b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final void forEach(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int[] iArr = this.f96879b;
        int[] iArr2 = this.f96880c;
        long[] jArr = this.f96878a;
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
                        block.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr2[i13]));
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

    public final void forEachIndexed(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96878a;
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
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
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

    public final void forEachKey(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int[] iArr = this.f96879b;
        long[] jArr = this.f96878a;
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
                        block.invoke(Integer.valueOf(iArr[(i10 << 3) + i12]));
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

    public final void forEachValue(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int[] iArr = this.f96880c;
        long[] jArr = this.f96878a;
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
                        block.invoke(Integer.valueOf(iArr[(i10 << 3) + i12]));
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

    public final int get(int i10) {
        int iFindKeyIndex = findKeyIndex(i10);
        if (iFindKeyIndex < 0) {
            a0.d.throwNoSuchElementException("Cannot find value for key " + i10);
        }
        return this.f96880c[iFindKeyIndex];
    }

    public final int getCapacity() {
        return this.f96881d;
    }

    public final int getOrDefault(int i10, int i11) {
        int iFindKeyIndex = findKeyIndex(i10);
        return iFindKeyIndex >= 0 ? this.f96880c[iFindKeyIndex] : i11;
    }

    public final int getOrElse(int i10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i10);
        return iFindKeyIndex < 0 ? ((Number) defaultValue.invoke()).intValue() : this.f96880c[iFindKeyIndex];
    }

    public final int getSize() {
        return this.f96882e;
    }

    public int hashCode() {
        int[] iArr = this.f96879b;
        int[] iArr2 = this.f96880c;
        long[] jArr = this.f96878a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = iArr[i13];
                        iHashCode += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return this.f96882e == 0;
    }

    public final boolean isNotEmpty() {
        return this.f96882e != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this.f96882e == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[PHI: r8
      0x0068: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f96879b
            int[] r3 = r0.f96880c
            long[] r4 = r0.f96878a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6d
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f96882e
            if (r8 >= r14) goto L62
            java.lang.String r14 = ", "
            r1.append(r14)
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r7 == r5) goto L6d
            int r7 = r7 + 1
            goto L20
        L6d:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kv.p r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            int[] r2 = r0.f96879b
            int[] r3 = r0.f96880c
            long[] r4 = r0.f96878a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L63
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
            if (r10 == 0) goto L5e
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L58
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L58
            r1 = 1
            return r1
        L58:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L5c:
            if (r10 != r11) goto L63
        L5e:
            if (r7 == r5) goto L63
            int r7 = r7 + 1
            goto L16
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.any(kv.p):boolean");
    }

    public final int count(kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f96879b;
        int[] iArr2 = this.f96880c;
        long[] jArr = this.f96878a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i14]), Integer.valueOf(iArr2[i14]))).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final String joinToString(CharSequence separator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(n nVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.p transform, int i11, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i12;
        if (obj == null) {
            CharSequence separator = (i11 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i11 & 2) != 0 ? "" : charSequence2;
            CharSequence charSequence5 = (i11 & 4) == 0 ? charSequence3 : "";
            int i13 = (i11 & 8) != 0 ? -1 : i10;
            CharSequence truncated = (i11 & 16) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : charSequence4;
            kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
            kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
            kotlin.jvm.internal.e0.checkNotNullParameter(charSequence5, DwaEpyvxz.aNjIuwspPU);
            kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
            kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            int[] iArr = nVar.f96879b;
            int[] iArr2 = nVar.f96880c;
            long[] jArr3 = nVar.f96878a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                int i15 = 0;
                loop0: while (true) {
                    long j10 = jArr3[i14];
                    int i16 = i14;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j10 & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                int i21 = iArr[i20];
                                int i22 = iArr2[i20];
                                if (i15 == i13) {
                                    sb2.append(truncated);
                                    break loop0;
                                }
                                if (i15 != 0) {
                                    sb2.append(separator);
                                }
                                i12 = i17;
                                Integer numValueOf = Integer.valueOf(i21);
                                jArr2 = jArr3;
                                sb2.append((CharSequence) transform.invoke(numValueOf, Integer.valueOf(i22)));
                                i15++;
                            } else {
                                jArr2 = jArr3;
                                i12 = i17;
                            }
                            j10 >>= i12;
                            i19++;
                            i17 = i12;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i14 = i16 + 1;
                    jArr3 = jArr;
                }
                sb2.append(charSequence5);
            } else {
                sb2.append(charSequence5);
            }
            String string = sb2.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        int[] iArr;
        int[] iArr2;
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr3 = this.f96879b;
        int[] iArr4 = this.f96880c;
        long[] jArr = this.f96878a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            i11 = i14;
                            int i18 = iArr3[i17];
                            int i19 = iArr4[i17];
                            iArr2 = iArr3;
                            if (i13 == i10) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(i18);
                            sb2.append(G5.T);
                            sb2.append(i19);
                            i13++;
                        } else {
                            iArr2 = iArr3;
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        iArr3 = iArr2;
                        i14 = i11;
                    }
                    iArr = iArr3;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                iArr3 = iArr;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[PHI: r12
      0x009b: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x004c, B:19:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, java.lang.CharSequence r26, kv.p r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r26
            r5 = r27
            java.lang.String r6 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "prefix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "postfix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "truncated"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            int[] r2 = r0.f96879b
            int[] r7 = r0.f96880c
            long[] r8 = r0.f96878a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto La4
            r11 = 0
            r12 = 0
        L3a:
            r13 = r8[r11]
            r15 = r11
            long r10 = ~r13
            r16 = 7
            long r10 = r10 << r16
            long r10 = r10 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r16
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto L9b
            int r11 = r15 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r16 = r11
            r11 = 0
        L5a:
            if (r11 >= r10) goto L97
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L8e
            int r17 = r15 << 3
            int r17 = r17 + r11
            r18 = r2[r17]
            r17 = r7[r17]
            r0 = r25
            if (r12 != r0) goto L76
            r6.append(r4)
            goto La7
        L76:
            if (r12 == 0) goto L7b
            r6.append(r1)
        L7b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
            int r12 = r12 + 1
        L8e:
            long r13 = r13 >> r16
            int r11 = r11 + 1
            r0 = r21
            r1 = r22
            goto L5a
        L97:
            r0 = r16
            if (r10 != r0) goto La4
        L9b:
            if (r15 == r9) goto La4
            int r11 = r15 + 1
            r0 = r21
            r1 = r22
            goto L3a
        La4:
            r6.append(r3)
        La7:
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kv.p):java.lang.String");
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i10, kv.p transform) {
        int i11;
        CharSequence separator = charSequence;
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f96879b;
        int[] iArr2 = this.f96880c;
        long[] jArr = this.f96878a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            int i17 = (i12 << 3) + i16;
                            int i18 = iArr[i17];
                            int i19 = iArr2[i17];
                            i11 = i14;
                            if (i13 == i10) {
                                sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append((CharSequence) transform.invoke(Integer.valueOf(i18), Integer.valueOf(i19)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        separator = charSequence;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                separator = charSequence;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[PHI: r11
      0x0096: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kv.p r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "postfix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            int[] r2 = r0.f96879b
            int[] r6 = r0.f96880c
            long[] r7 = r0.f96878a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9d
            r10 = 0
            r11 = 0
        L33:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L96
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L50:
            if (r9 >= r14) goto L93
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L88
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r2[r16]
            r16 = r6[r16]
            r18 = r15
            r15 = -1
            if (r11 != r15) goto L6f
            java.lang.String r1 = "..."
            r5.append(r1)
            goto La0
        L6f:
            if (r11 == 0) goto L74
            r5.append(r1)
        L74:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.append(r0)
            int r11 = r11 + 1
            goto L8a
        L88:
            r18 = r15
        L8a:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r20
            r15 = r18
            goto L50
        L93:
            r0 = r15
            if (r14 != r0) goto L9d
        L96:
            if (r10 == r8) goto L9d
            int r10 = r10 + 1
            r0 = r20
            goto L33
        L9d:
            r5.append(r3)
        La0:
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kv.p):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[PHI: r10
      0x008a: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003a, B:20:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, kv.p r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "prefix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            int[] r2 = r0.f96879b
            int[] r5 = r0.f96880c
            long[] r6 = r0.f96878a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8f
            r9 = 0
            r10 = 0
        L2c:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8a
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L46:
            if (r15 >= r13) goto L87
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7e
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r2[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L63
            java.lang.String r1 = "..."
            r4.append(r1)
            goto L94
        L63:
            if (r10 == 0) goto L68
            r4.append(r1)
        L68:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r17 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r3.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r4.append(r8)
            int r10 = r10 + 1
            goto L80
        L7e:
            r17 = r14
        L80:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L46
        L87:
            r8 = r14
            if (r13 != r8) goto L8f
        L8a:
            if (r9 == r7) goto L8f
            int r9 = r9 + 1
            goto L2c
        L8f:
            java.lang.String r1 = ""
            r4.append(r1)
        L94:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.joinToString(java.lang.CharSequence, java.lang.CharSequence, kv.p):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[PHI: r11
      0x0087: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, kv.p r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            int[] r5 = r0.f96879b
            int[] r6 = r0.f96880c
            long[] r7 = r0.f96878a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8e
            r10 = 0
            r11 = 0
        L24:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L41:
            if (r9 >= r14) goto L84
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L79
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r5[r17]
            r17 = r6[r17]
            r19 = r15
            r15 = -1
            if (r11 != r15) goto L60
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L91
        L60:
            if (r11 == 0) goto L65
            r3.append(r1)
        L65:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L7b
        L79:
            r19 = r15
        L7b:
            long r12 = r12 >> r19
            int r9 = r9 + 1
            r0 = r21
            r15 = r19
            goto L41
        L84:
            r0 = r15
            if (r14 != r0) goto L8e
        L87:
            if (r10 == r8) goto L8e
            int r10 = r10 + 1
            r0 = r21
            goto L24
        L8e:
            r3.append(r4)
        L91:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.joinToString(java.lang.CharSequence, kv.p):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[PHI: r10
      0x007d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(kv.p r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            int[] r4 = r0.f96879b
            int[] r5 = r0.f96880c
            long[] r6 = r0.f96878a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L82
            r9 = 0
            r10 = 0
        L1d:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7d
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L37:
            if (r15 >= r13) goto L7a
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L71
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r4[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L54
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L85
        L54:
            if (r10 == 0) goto L5b
            java.lang.String r8 = ", "
            r2.append(r8)
        L5b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r17 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L73
        L71:
            r17 = r14
        L73:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L37
        L7a:
            r8 = r14
            if (r13 != r8) goto L82
        L7d:
            if (r9 == r7) goto L82
            int r9 = r9 + 1
            goto L1d
        L82:
            r2.append(r3)
        L85:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.joinToString(kv.p):java.lang.String");
    }
}
