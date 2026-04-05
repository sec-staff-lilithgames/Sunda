package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends n {

    /* renamed from: f, reason: collision with root package name */
    public int f96821f;

    public h0() {
        this(0, 1, null);
    }

    public final int a(int i10) {
        int i11 = this.f96881d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f96878a;
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
        if (this.f96881d > 8) {
            if (Long.compare(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96882e) * 32) ^ Long.MIN_VALUE, tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96881d) * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(m1.nextCapacity(this.f96881d));
    }

    public final int b(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f96881d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f96878a;
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
                if (this.f96879b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i12);
                if (this.f96821f == 0 && ((this.f96878a[iA >> 3] >> ((iA & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iA = a(i12);
                }
                this.f96882e++;
                int i23 = this.f96821f;
                long[] jArr2 = this.f96878a;
                int i24 = iA >> 3;
                long j14 = jArr2[i24];
                int i25 = (iA & 7) << 3;
                this.f96821f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f96881d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iA - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return ~iA;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, m1.normalizeCapacity(i10)) : 0;
        this.f96881d = iMax;
        if (iMax == 0) {
            jArr = m1.f96876a;
        } else {
            long[] jArr2 = new long[((iMax + 15) & (-8)) >> 3];
            uu.f0.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f96878a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f96821f = m1.loadedCapacity(getCapacity()) - this.f96882e;
        this.f96879b = new int[iMax];
        this.f96880c = new int[iMax];
    }

    public final void clear() {
        this.f96882e = 0;
        long[] jArr = this.f96878a;
        if (jArr != m1.f96876a) {
            uu.f0.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f96878a;
            int i10 = this.f96881d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f96821f = m1.loadedCapacity(getCapacity()) - this.f96882e;
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.f96878a;
        int i10 = this.f96881d;
        int[] iArr = this.f96879b;
        int[] iArr2 = this.f96880c;
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
                int iA = a(i18);
                int i19 = i18 & i10;
                int i20 = i12;
                if (((iA - i19) & i10) / 8 == ((i15 - i19) & i10) / 8) {
                    jArr[i16] = ((r8 & 127) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[uu.k0.getLastIndex(jArr)] = (jArr[i20] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i20;
                } else {
                    int i21 = iA >> 3;
                    long j14 = jArr[i21];
                    int i22 = (iA & 7) << 3;
                    if (((j14 >> i22) & 255) == 128) {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iA] = iArr[i15];
                        iArr[i15] = i20;
                        iArr2[iA] = iArr2[i15];
                        iArr2[i15] = i20;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        int i23 = iArr[iA];
                        iArr[iA] = iArr[i15];
                        iArr[i15] = i23;
                        int i24 = iArr2[iA];
                        iArr2[iA] = iArr2[i15];
                        iArr2[i15] = i24;
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
        this.f96821f = m1.loadedCapacity(getCapacity()) - this.f96882e;
    }

    public final int getOrPut(int i10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i10);
        if (iFindKeyIndex >= 0) {
            return this.f96880c[iFindKeyIndex];
        }
        int iIntValue = ((Number) defaultValue.invoke()).intValue();
        put(i10, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(int i10) {
        remove(i10);
    }

    public final void plusAssign(n from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(int i10, int i11) {
        set(i10, i11);
    }

    public final void putAll(n from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        int[] iArr = from.f96879b;
        int[] iArr2 = from.f96880c;
        long[] jArr = from.f96878a;
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
                        set(iArr[i13], iArr2[i13]);
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

    public final void remove(int i10) {
        int iFindKeyIndex = findKeyIndex(i10);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
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
                        if (((Boolean) predicate.invoke(Integer.valueOf(this.f96879b[i13]), Integer.valueOf(this.f96880c[i13]))).booleanValue()) {
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

    public final void removeValueAt(int i10) {
        this.f96882e--;
        long[] jArr = this.f96878a;
        int i11 = this.f96881d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void resizeStorage$collection(int i10) {
        long[] jArr;
        h0 h0Var = this;
        long[] jArr2 = h0Var.f96878a;
        int[] iArr = h0Var.f96879b;
        int[] iArr2 = h0Var.f96880c;
        int i11 = h0Var.f96881d;
        c(i10);
        long[] jArr3 = h0Var.f96878a;
        int[] iArr3 = h0Var.f96879b;
        int[] iArr4 = h0Var.f96880c;
        int i12 = h0Var.f96881d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iA = h0Var.a(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iA >> 3;
                int i17 = (iA & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iA - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[iA] = i14;
                iArr4[iA] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            h0Var = this;
            jArr2 = jArr;
        }
    }

    public final void set(int i10, int i11) {
        int iB = b(i10);
        if (iB < 0) {
            iB = ~iB;
        }
        this.f96879b[iB] = i10;
        this.f96880c[iB] = i11;
    }

    public final int trim() {
        int i10 = this.f96881d;
        int iNormalizeCapacity = m1.normalizeCapacity(m1.unloadedCapacity(this.f96882e));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this.f96881d;
    }

    public h0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            a0.d.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        c(m1.unloadedCapacity(i10));
    }

    public final void minusAssign(int[] keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        for (int i10 : keys) {
            remove(i10);
        }
    }

    public final int put(int i10, int i11, int i12) {
        int iB = b(i10);
        if (iB < 0) {
            iB = ~iB;
        } else {
            i12 = this.f96880c[iB];
        }
        this.f96879b[iB] = i10;
        this.f96880c[iB] = i11;
        return i12;
    }

    public final boolean remove(int i10, int i11) {
        int iFindKeyIndex = findKeyIndex(i10);
        if (iFindKeyIndex < 0 || this.f96880c[iFindKeyIndex] != i11) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
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

    public /* synthetic */ h0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
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
