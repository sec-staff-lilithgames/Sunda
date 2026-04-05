package z;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    public int f96932f;

    public s0() {
        this(0, 1, null);
    }

    public final int a(int i10) {
        int i11 = this.f96781d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f96778a;
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
        if (this.f96781d > 8) {
            if (Long.compare(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96782e) * 32) ^ Long.MIN_VALUE, tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(this.f96781d) * 25) ^ Long.MIN_VALUE) <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(m1.nextCapacity(this.f96781d));
    }

    public final int b(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f96781d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f96778a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.e0.areEqual(this.f96779b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                if (this.f96932f == 0 && ((this.f96778a[iA >> 3] >> ((iA & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iA = a(i11);
                }
                this.f96782e++;
                int i19 = this.f96932f;
                long[] jArr2 = this.f96778a;
                int i20 = iA >> 3;
                long j14 = jArr2[i20];
                int i21 = (iA & 7) << 3;
                this.f96932f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f96781d;
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

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, m1.normalizeCapacity(i10)) : 0;
        this.f96781d = iMax;
        if (iMax == 0) {
            jArr = m1.f96876a;
        } else {
            long[] jArr2 = new long[((iMax + 15) & (-8)) >> 3];
            uu.f0.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.f96778a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f96932f = m1.loadedCapacity(getCapacity()) - this.f96782e;
        this.f96779b = new Object[iMax];
        this.f96780c = new int[iMax];
    }

    public final void clear() {
        this.f96782e = 0;
        long[] jArr = this.f96778a;
        if (jArr != m1.f96876a) {
            uu.f0.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f96778a;
            int i10 = this.f96781d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        uu.f0.fill(this.f96779b, (Object) null, 0, this.f96781d);
        this.f96932f = m1.loadedCapacity(getCapacity()) - this.f96782e;
    }

    public final void dropDeletes$collection() {
        long j10;
        long[] jArr = this.f96778a;
        int i10 = this.f96781d;
        Object[] objArr = this.f96779b;
        int[] iArr = this.f96780c;
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
                        objArr[iA] = objArr[i15];
                        objArr[i15] = null;
                        iArr[iA] = iArr[i15];
                        iArr[i15] = i20;
                    } else {
                        j10 = j12;
                        jArr[i21] = ((r8 & 127) << i22) | (j14 & (~(255 << i22)));
                        Object obj2 = objArr[iA];
                        objArr[iA] = objArr[i15];
                        objArr[i15] = obj2;
                        int i23 = iArr[iA];
                        iArr[iA] = iArr[i15];
                        iArr[i15] = i23;
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
        this.f96932f = m1.loadedCapacity(getCapacity()) - this.f96782e;
    }

    public final int getOrPut(Object obj, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(obj);
        if (iFindKeyIndex >= 0) {
            return this.f96780c[iFindKeyIndex];
        }
        int iIntValue = ((Number) defaultValue.invoke()).intValue();
        set(obj, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(Object obj) {
        remove(obj);
    }

    public final void plusAssign(c1 from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(Object obj, int i10) {
        set(obj, i10);
    }

    public final void putAll(c1 from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        Object[] objArr = from.f96779b;
        int[] iArr = from.f96780c;
        long[] jArr = from.f96778a;
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
                        set(objArr[i13], iArr[i13]);
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

    public final void remove(Object obj) {
        int iFindKeyIndex = findKeyIndex(obj);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96778a;
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
                        if (((Boolean) predicate.invoke(this.f96779b[i13], Integer.valueOf(this.f96780c[i13]))).booleanValue()) {
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
        this.f96782e--;
        long[] jArr = this.f96778a;
        int i11 = this.f96781d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f96779b[i10] = null;
    }

    public final void resizeStorage$collection(int i10) {
        int i11;
        long[] jArr = this.f96778a;
        Object[] objArr = this.f96779b;
        int[] iArr = this.f96780c;
        int i12 = this.f96781d;
        c(i10);
        long[] jArr2 = this.f96778a;
        Object[] objArr2 = this.f96779b;
        int[] iArr2 = this.f96780c;
        int i13 = this.f96781d;
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
                objArr2[iA] = obj;
                iArr2[iA] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void set(Object obj, int i10) {
        int iB = b(obj);
        if (iB < 0) {
            iB = ~iB;
        }
        this.f96779b[iB] = obj;
        this.f96780c[iB] = i10;
    }

    public final int trim() {
        int i10 = this.f96781d;
        int iNormalizeCapacity = m1.normalizeCapacity(m1.unloadedCapacity(this.f96782e));
        if (iNormalizeCapacity >= i10) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i10 - this.f96781d;
    }

    public /* synthetic */ s0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final void minusAssign(Object[] keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        for (Object obj : keys) {
            remove(obj);
        }
    }

    public final int put(Object obj, int i10, int i11) {
        int iB = b(obj);
        if (iB < 0) {
            iB = ~iB;
        } else {
            i11 = this.f96780c[iB];
        }
        this.f96779b[iB] = obj;
        this.f96780c[iB] = i10;
        return i11;
    }

    public s0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            a0.d.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        c(m1.unloadedCapacity(i10));
    }

    public final boolean remove(Object obj, int i10) {
        int iFindKeyIndex = findKeyIndex(obj);
        if (iFindKeyIndex < 0 || this.f96780c[iFindKeyIndex] != i10) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(Iterable<Object> keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Iterator<Object> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(rv.t keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Iterator<Object> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
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
}
