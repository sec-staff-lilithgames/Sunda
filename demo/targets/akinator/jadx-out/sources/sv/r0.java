package sv;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.inmobi.commons.core.configs.AdConfig;
import tu.t0;
import tu.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class r0 {
    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m7005toStringJSWoG40(long j10, int i10) {
        return z0.ulongToString(j10, e.checkRadix(i10));
    }

    /* renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m7006toStringLxnNnR4(byte b10, int i10) {
        String string = Integer.toString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, e.checkRadix(i10));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m7007toStringV7xB4Y4(int i10, int i11) {
        return z0.ulongToString(i10 & 4294967295L, e.checkRadix(i11));
    }

    /* renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m7008toStringolVBNx4(short s10, int i10) {
        String string = Integer.toString(s10 & 65535, e.checkRadix(i10));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte toUByte(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.g0 uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m7036unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final tu.g0 toUByteOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    public static final int toUInt(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.k0 uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m7061unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final tu.k0 toUIntOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    public static final long toULong(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.o0 uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m7086unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final tu.o0 toULongOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    public static final short toUShort(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        t0 uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m7111unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final t0 toUShortOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    public static final byte toUByte(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.g0 uByteOrNull = toUByteOrNull(str, i10);
        if (uByteOrNull != null) {
            return uByteOrNull.m7036unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final tu.g0 toUByteOrNull(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.k0 uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull == null) {
            return null;
        }
        int iM7061unboximpl = uIntOrNull.m7061unboximpl();
        if (Integer.compare(iM7061unboximpl ^ Integer.MIN_VALUE, tu.k0.m7056constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return tu.g0.m7030boximpl(tu.g0.m7031constructorimpl((byte) iM7061unboximpl));
    }

    public static final int toUInt(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.k0 uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull != null) {
            return uIntOrNull.m7061unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final tu.k0 toUIntOrNull(String str, int i10) {
        int i11;
        tu.k0 k0Var;
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        e.checkRadix(i10);
        int length = str.length();
        tu.k0 k0Var2 = null;
        if (length == 0) {
            return null;
        }
        int iM7056constructorimpl = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.e0.compare((int) cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iM7056constructorimpl2 = tu.k0.m7056constructorimpl(i10);
        int i13 = 119304647;
        while (i11 < length) {
            int iDigitOf = e.digitOf(str.charAt(i11), i10);
            if (iDigitOf < 0) {
                return k0Var2;
            }
            int i14 = iM7056constructorimpl ^ Integer.MIN_VALUE;
            if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) <= 0) {
                k0Var = k0Var2;
                i12 = iM7056constructorimpl;
            } else {
                if (i13 != 119304647) {
                    return k0Var2;
                }
                k0Var = k0Var2;
                i12 = iM7056constructorimpl;
                i13 = (int) (((-1) & 4294967295L) / (iM7056constructorimpl2 & 4294967295L));
                if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                    return k0Var;
                }
            }
            int iM7056constructorimpl3 = tu.k0.m7056constructorimpl(i12 * iM7056constructorimpl2);
            iM7056constructorimpl = tu.k0.m7056constructorimpl(tu.k0.m7056constructorimpl(iDigitOf) + iM7056constructorimpl3);
            if (Integer.compare(iM7056constructorimpl ^ Integer.MIN_VALUE, iM7056constructorimpl3 ^ Integer.MIN_VALUE) < 0) {
                return k0Var;
            }
            i11++;
            k0Var2 = k0Var;
        }
        return tu.k0.m7055boximpl(iM7056constructorimpl);
    }

    public static final long toULong(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.o0 uLongOrNull = toULongOrNull(str, i10);
        if (uLongOrNull != null) {
            return uLongOrNull.m7086unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tu.o0 toULongOrNull(java.lang.String r26, int r27) {
        /*
            r0 = r26
            r1 = r27
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r2)
            sv.e.checkRadix(r1)
            int r2 = r0.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.e0.compare(r5, r6)
            r7 = 1
            if (r6 >= 0) goto L2c
            if (r2 == r7) goto L2b
            r6 = 43
            if (r5 == r6) goto L29
            goto L2b
        L29:
            r5 = r7
            goto L2d
        L2b:
            return r3
        L2c:
            r5 = r4
        L2d:
            long r8 = (long) r1
            long r8 = tu.o0.m7081constructorimpl(r8)
            r10 = 0
            r12 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r14 = r10
            r16 = r12
        L3c:
            if (r5 >= r2) goto Lca
            char r6 = r0.charAt(r5)
            int r6 = sv.e.digitOf(r6, r1)
            if (r6 >= 0) goto L49
            return r3
        L49:
            r18 = -9223372036854775808
            r20 = r3
            long r3 = r14 ^ r18
            r21 = r7
            r22 = r8
            long r7 = r16 ^ r18
            int r7 = java.lang.Long.compare(r3, r7)
            if (r7 <= 0) goto L98
            int r7 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r7 != 0) goto L97
            int r7 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 >= 0) goto L76
            long r16 = r22 ^ r18
            int r7 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r7 >= 0) goto L71
            r16 = r10
            goto L8f
        L71:
            r7 = 1
        L73:
            r16 = r7
            goto L8f
        L76:
            long r8 = r8 / r22
            long r7 = r8 << r21
            long r16 = r7 * r22
            r24 = -1
            long r24 = r24 - r16
            long r16 = r24 ^ r18
            long r24 = r22 ^ r18
            int r9 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r9 < 0) goto L8b
            r9 = r21
            goto L8c
        L8b:
            r9 = 0
        L8c:
            long r10 = (long) r9
            long r7 = r7 + r10
            goto L73
        L8f:
            long r7 = r16 ^ r18
            int r3 = java.lang.Long.compare(r3, r7)
            if (r3 <= 0) goto L98
        L97:
            return r20
        L98:
            long r14 = r14 * r22
            long r3 = tu.o0.m7081constructorimpl(r14)
            int r6 = tu.k0.m7056constructorimpl(r6)
            long r6 = (long) r6
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            long r6 = tu.o0.m7081constructorimpl(r6)
            long r6 = r6 + r3
            long r14 = tu.o0.m7081constructorimpl(r6)
            long r6 = r14 ^ r18
            long r3 = r3 ^ r18
            int r3 = java.lang.Long.compare(r6, r3)
            if (r3 >= 0) goto Lbd
            return r20
        Lbd:
            int r5 = r5 + 1
            r3 = r20
            r7 = r21
            r8 = r22
            r4 = 0
            r10 = 0
            goto L3c
        Lca:
            tu.o0 r0 = tu.o0.m7080boximpl(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.r0.toULongOrNull(java.lang.String, int):tu.o0");
    }

    public static final short toUShort(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        t0 uShortOrNull = toUShortOrNull(str, i10);
        if (uShortOrNull != null) {
            return uShortOrNull.m7111unboximpl();
        }
        j0.numberFormatError(str);
        throw new tu.k();
    }

    public static final t0 toUShortOrNull(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        tu.k0 uIntOrNull = toUIntOrNull(str, i10);
        if (uIntOrNull == null) {
            return null;
        }
        int iM7061unboximpl = uIntOrNull.m7061unboximpl();
        if (Integer.compare(iM7061unboximpl ^ Integer.MIN_VALUE, tu.k0.m7056constructorimpl(Settings.DEFAULT_INITIAL_WINDOW_SIZE) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return t0.m7105boximpl(t0.m7106constructorimpl((short) iM7061unboximpl));
    }
}
