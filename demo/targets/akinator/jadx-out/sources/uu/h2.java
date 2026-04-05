package uu;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h2 {
    public static final void a(long[] jArr, int i10, int i11) {
        long j10;
        long jM7095getsVKNKU = tu.q0.m7095getsVKNKU(jArr, (i10 + i11) / 2);
        int i12 = i10;
        int i13 = i11;
        while (i12 <= i13) {
            while (true) {
                j10 = jM7095getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(tu.q0.m7095getsVKNKU(jArr, i12) ^ Long.MIN_VALUE, j10) >= 0) {
                    break;
                } else {
                    i12++;
                }
            }
            while (Long.compare(tu.q0.m7095getsVKNKU(jArr, i13) ^ Long.MIN_VALUE, j10) > 0) {
                i13--;
            }
            if (i12 <= i13) {
                long jM7095getsVKNKU2 = tu.q0.m7095getsVKNKU(jArr, i12);
                tu.q0.m7100setk8EXiF4(jArr, i12, tu.q0.m7095getsVKNKU(jArr, i13));
                tu.q0.m7100setk8EXiF4(jArr, i13, jM7095getsVKNKU2);
                i12++;
                i13--;
            }
        }
        int i14 = i12 - 1;
        if (i10 < i14) {
            a(jArr, i10, i14);
        }
        if (i12 < i11) {
            a(jArr, i12, i11);
        }
    }

    public static final void b(int i10, int i11, byte[] bArr) {
        int i12;
        byte bM7045getw2LRezQ = tu.i0.m7045getw2LRezQ(bArr, (i10 + i11) / 2);
        int i13 = i10;
        int i14 = i11;
        while (i13 <= i14) {
            while (true) {
                int iM7045getw2LRezQ = tu.i0.m7045getw2LRezQ(bArr, i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i12 = bM7045getw2LRezQ & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (kotlin.jvm.internal.e0.compare(iM7045getw2LRezQ, i12) >= 0) {
                    break;
                } else {
                    i13++;
                }
            }
            while (kotlin.jvm.internal.e0.compare(tu.i0.m7045getw2LRezQ(bArr, i14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i12) > 0) {
                i14--;
            }
            if (i13 <= i14) {
                byte bM7045getw2LRezQ2 = tu.i0.m7045getw2LRezQ(bArr, i13);
                tu.i0.m7050setVurrAj0(bArr, i13, tu.i0.m7045getw2LRezQ(bArr, i14));
                tu.i0.m7050setVurrAj0(bArr, i14, bM7045getw2LRezQ2);
                i13++;
                i14--;
            }
        }
        int i15 = i13 - 1;
        if (i10 < i15) {
            b(i10, i15, bArr);
        }
        if (i13 < i11) {
            b(i13, i11, bArr);
        }
    }

    public static final void c(short[] sArr, int i10, int i11) {
        int i12;
        short sM7120getMh2AYeg = tu.v0.m7120getMh2AYeg(sArr, (i10 + i11) / 2);
        int i13 = i10;
        int i14 = i11;
        while (i13 <= i14) {
            while (true) {
                i12 = sM7120getMh2AYeg & 65535;
                if (kotlin.jvm.internal.e0.compare(tu.v0.m7120getMh2AYeg(sArr, i13) & 65535, i12) >= 0) {
                    break;
                } else {
                    i13++;
                }
            }
            while (kotlin.jvm.internal.e0.compare(tu.v0.m7120getMh2AYeg(sArr, i14) & 65535, i12) > 0) {
                i14--;
            }
            if (i13 <= i14) {
                short sM7120getMh2AYeg2 = tu.v0.m7120getMh2AYeg(sArr, i13);
                tu.v0.m7125set01HTLdE(sArr, i13, tu.v0.m7120getMh2AYeg(sArr, i14));
                tu.v0.m7125set01HTLdE(sArr, i14, sM7120getMh2AYeg2);
                i13++;
                i14--;
            }
        }
        int i15 = i13 - 1;
        if (i10 < i15) {
            c(sArr, i10, i15);
        }
        if (i13 < i11) {
            c(sArr, i13, i11);
        }
    }

    public static final void d(int i10, int i11, int[] iArr) {
        int i12;
        int iM7070getpVg5ArA = tu.m0.m7070getpVg5ArA(iArr, (i10 + i11) / 2);
        int i13 = i10;
        int i14 = i11;
        while (i13 <= i14) {
            while (true) {
                i12 = iM7070getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(tu.m0.m7070getpVg5ArA(iArr, i13) ^ Integer.MIN_VALUE, i12) >= 0) {
                    break;
                } else {
                    i13++;
                }
            }
            while (Integer.compare(tu.m0.m7070getpVg5ArA(iArr, i14) ^ Integer.MIN_VALUE, i12) > 0) {
                i14--;
            }
            if (i13 <= i14) {
                int iM7070getpVg5ArA2 = tu.m0.m7070getpVg5ArA(iArr, i13);
                tu.m0.m7075setVXSXFK8(iArr, i13, tu.m0.m7070getpVg5ArA(iArr, i14));
                tu.m0.m7075setVXSXFK8(iArr, i14, iM7070getpVg5ArA2);
                i13++;
                i14--;
            }
        }
        int i15 = i13 - 1;
        if (i10 < i15) {
            d(i10, i15, iArr);
        }
        if (i13 < i11) {
            d(i13, i11, iArr);
        }
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m7404sortArraynroSd4(long[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        a(array, i10, i11 - 1);
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m7405sortArray4UcCI2c(byte[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        b(i10, i11 - 1, array);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m7406sortArrayAa5vz7o(short[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        c(array, i10, i11 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m7407sortArrayoBK06Vg(int[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        d(i10, i11 - 1, array);
    }
}
