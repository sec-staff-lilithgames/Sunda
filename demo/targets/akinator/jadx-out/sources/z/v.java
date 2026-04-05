package z;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f96952a = m1.f96876a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f96953b = w.getEmptyLongArray();

    /* renamed from: c, reason: collision with root package name */
    public int f96954c;

    /* renamed from: d, reason: collision with root package name */
    public int f96955d;

    public v(kotlin.jvm.internal.u uVar) {
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(v vVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return vVar.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean all(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && !((Boolean) predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i12]))).booleanValue()) {
                        return false;
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
        return this.f96955d != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(long r18) {
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
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.contains(long):boolean");
    }

    public final int count() {
        return this.f96955d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof z.v
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            z.v r1 = (z.v) r1
            int r3 = r1.f96955d
            int r5 = r0.f96955d
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f96953b
            long[] r5 = r0.f96952a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f96954c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f96952a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f96953b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long first() {
        /*
            r14 = this;
            long[] r0 = r14.f96953b
            long[] r1 = r14.f96952a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L41
            r3 = 0
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
            if (r7 == 0) goto L3c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L36
            int r1 = r4 << 3
            int r1 = r1 + r9
            r1 = r0[r1]
            return r1
        L36:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3a:
            if (r7 != r8) goto L41
        L3c:
            if (r4 == r2) goto L41
            int r4 = r4 + 1
            goto Lb
        L41:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The LongSet is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.first():long");
    }

    public final void forEach(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
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
                        block.invoke(Long.valueOf(jArr[(i10 << 3) + i12]));
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

    public final void forEachIndex(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96952a;
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

    public final int getCapacity() {
        return this.f96954c;
    }

    public final int getSize() {
        return this.f96955d;
    }

    public int hashCode() {
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        iHashCode = Long.hashCode(jArr[(i10 << 3) + i12]) + iHashCode;
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
        return this.f96955d == 0;
    }

    public final boolean isNotEmpty() {
        return this.f96955d != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this.f96955d == 0;
    }

    public String toString() {
        return joinToString$default(this, null, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, 25, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kv.l r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.e0.checkNotNullParameter(r15, r0)
            long[] r0 = r14.f96953b
            long[] r1 = r14.f96952a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L57
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L52
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L50
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4c
            r15 = 1
            return r15
        L4c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L50:
            if (r7 != r8) goto L57
        L52:
            if (r4 == r2) goto L57
            int r4 = r4 + 1
            goto L10
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.any(kv.l):boolean");
    }

    public final int count(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && ((Boolean) predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i13]))).booleanValue()) {
                        i11++;
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[PHI: r11
      0x00ab: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x0064, B:42:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String joinToString$default(z.v r20, java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, java.lang.CharSequence r25, kv.l r26, int r27, java.lang.Object r28) {
        /*
            r0 = r20
            r1 = r26
            if (r28 != 0) goto Lbd
            r2 = r27 & 1
            if (r2 == 0) goto Ld
            java.lang.String r2 = ", "
            goto Lf
        Ld:
            r2 = r21
        Lf:
            r3 = r27 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L17
            r3 = r4
            goto L19
        L17:
            r3 = r22
        L19:
            r5 = r27 & 4
            if (r5 == 0) goto L1e
            goto L20
        L1e:
            r4 = r23
        L20:
            r5 = r27 & 8
            if (r5 == 0) goto L26
            r5 = -1
            goto L28
        L26:
            r5 = r24
        L28:
            r6 = r27 & 16
            if (r6 == 0) goto L2f
            java.lang.String r6 = "..."
            goto L31
        L2f:
            r6 = r25
        L31:
            java.lang.String r7 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r7)
            java.lang.String r7 = "prefix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r7)
            java.lang.String r7 = "postfix"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r7)
            java.lang.String r7 = "truncated"
            java.lang.String r8 = "transform"
            java.lang.StringBuilder r3 = w0.i.g(r6, r7, r1, r8, r3)
            long[] r7 = r0.f96953b
            long[] r0 = r0.f96952a
            int r8 = r0.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lb0
            r10 = 0
            r11 = 0
        L53:
            r12 = r0[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto Lab
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L70:
            if (r9 >= r14) goto La8
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L9f
            int r16 = r10 << 3
            int r16 = r16 + r9
            r16 = r7[r16]
            if (r11 != r5) goto L88
            r3.append(r6)
            goto Lb3
        L88:
            if (r11 == 0) goto L8d
            r3.append(r2)
        L8d:
            r21 = r15
            java.lang.Long r15 = java.lang.Long.valueOf(r16)
            java.lang.Object r15 = r1.invoke(r15)
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r3.append(r15)
            int r11 = r11 + 1
            goto La1
        L9f:
            r21 = r15
        La1:
            long r12 = r12 >> r21
            int r9 = r9 + 1
            r15 = r21
            goto L70
        La8:
            r9 = r15
            if (r14 != r9) goto Lb0
        Lab:
            if (r10 == r8) goto Lb0
            int r10 = r10 + 1
            goto L53
        Lb0:
            r3.append(r4)
        Lb3:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            return r0
        Lbd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: joinToString"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.joinToString$default(z.v, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kv.l, int, java.lang.Object):java.lang.String");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence charSequence, kv.l lVar) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbG = w0.i.g(charSequence, "truncated", lVar, "transform", prefix);
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            long j11 = jArr[(i12 << 3) + i16];
                            i11 = i14;
                            if (i13 == i10) {
                                sbG.append(charSequence);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbG.append(separator);
                            }
                            sbG.append((CharSequence) lVar.invoke(Long.valueOf(j11)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
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
            }
            sbG.append(postfix);
        } else {
            sbG.append(postfix);
        }
        String string = sbG.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long first(kv.l r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.e0.checkNotNullParameter(r15, r0)
            long[] r0 = r14.f96953b
            long[] r1 = r14.f96952a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r12 = r15.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L4b
            return r10
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L10
        L56:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.first(kv.l):long");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i10, kv.l lVar) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbG = w0.i.g(charSequence, "postfix", lVar, "transform", prefix);
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            long j11 = jArr[(i12 << 3) + i16];
                            if (i13 == i10) {
                                sbG.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbG.append(separator);
                            }
                            i11 = i14;
                            sbG.append((CharSequence) lVar.invoke(Long.valueOf(j11)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
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
            }
            sbG.append(charSequence);
        } else {
            sbG.append(charSequence);
        }
        String string = sbG.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[PHI: r10
      0x0076: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0035, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kv.l r24) {
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
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = w0.i.g(r3, r5, r4, r6, r2)
            long[] r5 = r0.f96953b
            long[] r6 = r0.f96952a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r9 = 0
            r10 = 0
        L27:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L76
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L41:
            if (r15 >= r13) goto L74
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L5c
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L7e
        L5c:
            if (r10 == 0) goto L61
            r2.append(r1)
        L61:
            java.lang.Long r8 = java.lang.Long.valueOf(r16)
            java.lang.Object r8 = r4.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
        L70:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L41
        L74:
            if (r13 != r14) goto L7b
        L76:
            if (r9 == r7) goto L7b
            int r9 = r9 + 1
            goto L27
        L7b:
            r2.append(r3)
        L7e:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kv.l):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[PHI: r9
      0x006d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002e, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r20, java.lang.CharSequence r21, kv.l r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "prefix"
            java.lang.String r4 = "transform"
            r5 = r21
            java.lang.StringBuilder r3 = w0.i.g(r5, r3, r2, r4, r5)
            long[] r4 = r0.f96953b
            long[] r5 = r0.f96952a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L72
            r8 = 0
            r9 = 0
        L20:
            r10 = r5[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L6d
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3a:
            if (r14 >= r12) goto L6b
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L67
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r4[r15]
            r7 = -1
            if (r9 != r7) goto L53
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L77
        L53:
            if (r9 == 0) goto L58
            r3.append(r1)
        L58:
            java.lang.Long r7 = java.lang.Long.valueOf(r15)
            java.lang.Object r7 = r2.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r3.append(r7)
            int r9 = r9 + 1
        L67:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L3a
        L6b:
            if (r12 != r13) goto L72
        L6d:
            if (r8 == r6) goto L72
            int r8 = r8 + 1
            goto L20
        L72:
            java.lang.String r1 = ""
            r3.append(r1)
        L77:
            java.lang.String r1 = r3.toString()
            r2 = 0
            java.lang.String r2 = ao.kwoC.zAQQWzBxnS.BmbmWAfrsPLEYCj
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.joinToString(java.lang.CharSequence, java.lang.CharSequence, kv.l):java.lang.String");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        int i11;
        int i12;
        int i13;
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f96953b;
        long[] jArr2 = this.f96952a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                long j10 = jArr2[i14];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i14 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j10 & 255) < 128) {
                            i12 = i14;
                            long j11 = jArr[(i14 << 3) + i18];
                            i13 = i16;
                            if (i15 == i10) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i15 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(j11);
                            i15++;
                        } else {
                            i12 = i14;
                            i13 = i16;
                        }
                        j10 >>= i13;
                        i18++;
                        i16 = i13;
                        i14 = i12;
                    }
                    int i19 = i14;
                    if (i17 != i16) {
                        break;
                    }
                    i11 = i19;
                } else {
                    i11 = i14;
                }
                if (i11 == length) {
                    break;
                }
                i14 = i11 + 1;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[PHI: r10
      0x0071: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:18:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, kv.l r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            long[] r5 = r0.f96953b
            long[] r6 = r0.f96952a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L76
            r9 = 0
            r10 = 0
        L22:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L71
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3c:
            if (r15 >= r13) goto L6f
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L6b
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L57
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L79
        L57:
            if (r10 == 0) goto L5c
            r3.append(r1)
        L5c:
            java.lang.Long r8 = java.lang.Long.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
        L6b:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L3c
        L6f:
            if (r13 != r14) goto L76
        L71:
            if (r9 == r7) goto L76
            int r9 = r9 + 1
            goto L22
        L76:
            r3.append(r4)
        L79:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.joinToString(java.lang.CharSequence, kv.l):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[PHI: r9
      0x006a: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0029, B:18:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String joinToString(kv.l r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            long[] r4 = r0.f96953b
            long[] r5 = r0.f96952a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L6f
            r8 = 0
            r9 = 0
        L1b:
            r10 = r5[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L6a
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L35:
            if (r14 >= r12) goto L68
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L64
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r4[r15]
            r7 = -1
            if (r9 != r7) goto L4e
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L72
        L4e:
            if (r9 == 0) goto L55
            java.lang.String r7 = ", "
            r2.append(r7)
        L55:
            java.lang.Long r7 = java.lang.Long.valueOf(r15)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2.append(r7)
            int r9 = r9 + 1
        L64:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L35
        L68:
            if (r12 != r13) goto L6f
        L6a:
            if (r8 == r6) goto L6f
            int r8 = r8 + 1
            goto L1b
        L6f:
            r2.append(r3)
        L72:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.v.joinToString(kv.l):java.lang.String");
    }
}
