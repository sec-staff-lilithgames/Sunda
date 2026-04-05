package bc;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d extends a {
    public static int j(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11 && charSequence.charAt(i10) <= ' ') {
            i10++;
        }
        return i10;
    }

    public abstract long g();

    public abstract long h();

    public abstract long i();

    public abstract long k(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    public abstract long l(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    public final long parseFloatingPointLiteral(CharSequence charSequence, int i10, int i11) {
        long j10;
        long j11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        long j12;
        boolean z11;
        int i17;
        d dVar;
        int i18;
        int i19;
        boolean z12;
        char c10;
        int i20;
        int iMin;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        char c11;
        char c12;
        int iD = a.d(charSequence.length(), i10, i11);
        int iJ = j(charSequence, i10, iD);
        if (iJ == iD) {
            throw new NumberFormatException("illegal syntax");
        }
        char cCharAt = charSequence.charAt(iJ);
        boolean z14 = cCharAt == '-';
        if ((z14 || cCharAt == '+') && (cCharAt = a.c(charSequence, (iJ = iJ + 1), iD)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (cCharAt >= 'I') {
            if (charSequence.charAt(iJ) == 'N') {
                int i25 = iJ + 2;
                if (i25 < iD && charSequence.charAt(iJ + 1) == 'a' && charSequence.charAt(i25) == 'N' && j(charSequence, iJ + 3, iD) == iD) {
                    return g();
                }
            } else {
                int i26 = iJ + 7;
                if (i26 < iD && charSequence.charAt(iJ) == 'I' && charSequence.charAt(iJ + 1) == 'n' && charSequence.charAt(iJ + 2) == 'f' && charSequence.charAt(iJ + 3) == 'i' && charSequence.charAt(iJ + 4) == 'n' && charSequence.charAt(iJ + 5) == 'i' && charSequence.charAt(iJ + 6) == 't' && charSequence.charAt(i26) == 'y' && j(charSequence, iJ + 8, iD) == iD) {
                    return z14 ? h() : i();
                }
            }
            throw new NumberFormatException("illegal syntax");
        }
        boolean z15 = cCharAt == '0';
        int i27 = -1;
        long j13 = 0;
        if (z15) {
            int i28 = iJ + 1;
            j10 = Long.MIN_VALUE;
            if ((a.c(charSequence, i28, iD) | ' ') == 120) {
                int i29 = iJ + 2;
                int i30 = i29;
                long j14 = 0;
                char c13 = 0;
                boolean z16 = false;
                while (true) {
                    if (i30 >= iD) {
                        break;
                    }
                    char cCharAt2 = charSequence.charAt(i30);
                    int iF = a.f(cCharAt2);
                    if (iF < 0) {
                        c12 = cCharAt2;
                        if (iF != -4) {
                            c13 = c12;
                            break;
                        }
                        z16 |= i27 >= 0;
                        int i31 = i30;
                        while (i31 < iD - 8) {
                            long jTryToParseEightHexDigits = g.tryToParseEightHexDigits(charSequence, i31 + 1);
                            if (jTryToParseEightHexDigits < 0) {
                                break;
                            }
                            j14 = (j14 << 32) + jTryToParseEightHexDigits;
                            i31 += 8;
                        }
                        i27 = i30;
                        i30 = i31;
                    } else {
                        c12 = cCharAt2;
                        j14 = iF | (j14 << 4);
                    }
                    i30++;
                    c13 = c12;
                }
                if (i27 < 0) {
                    i20 = i30 - i29;
                    i27 = i30;
                    iMin = 0;
                } else {
                    i20 = (i30 - i29) - 1;
                    iMin = Math.min((i27 - i30) + 1, 1024) * 4;
                }
                boolean z17 = (c13 | ' ') == 112;
                if (z17) {
                    i22 = i30 + 1;
                    char c14 = a.c(charSequence, i22, iD);
                    boolean z18 = c14 == '-';
                    i21 = i29;
                    if (z18 || c14 == '+') {
                        i22 = i30 + 2;
                        c14 = a.c(charSequence, i22, iD);
                    }
                    char c15 = (char) (c14 - '0');
                    boolean z19 = z16 | (c15 >= '\n');
                    int i32 = 0;
                    while (true) {
                        if (i32 < 1024) {
                            i32 = (i32 * 10) + c15;
                        }
                        i22++;
                        c11 = a.c(charSequence, i22, iD);
                        char c16 = (char) (c11 - '0');
                        if (c16 >= '\n') {
                            break;
                        }
                        c15 = c16;
                    }
                    if (z18) {
                        i32 = -i32;
                    }
                    iMin += i32;
                    i23 = i32;
                    z16 = z19;
                    c13 = c11;
                } else {
                    i21 = i29;
                    i22 = i30;
                    i23 = 0;
                }
                if ((c13 | AbstractJsonLexerKt.STRING) == 102) {
                    i22++;
                }
                int iJ2 = j(charSequence, i22, iD);
                if (z16 || iJ2 < iD || i20 == 0 || !z17) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (i20 > 16) {
                    int i33 = i21;
                    int i34 = 0;
                    while (i33 < i30) {
                        int iF2 = a.f(charSequence.charAt(i33));
                        if (iF2 < 0) {
                            i34++;
                        } else {
                            if (Long.compare(j13 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                break;
                            }
                            j13 = iF2 | (j13 << 4);
                        }
                        i33++;
                    }
                    z13 = i33 < i30;
                    j14 = j13;
                    i24 = i34;
                    iJ2 = i33;
                } else {
                    i24 = 0;
                    z13 = false;
                }
                return l(charSequence, i10, iD, z14, j14, iMin, z13, (((i27 - iJ2) + i24) * 4) + i23);
            }
            iJ = i28;
        } else {
            j10 = Long.MIN_VALUE;
        }
        boolean z20 = z14;
        int i35 = iJ;
        long j15 = 0;
        char cCharAt3 = 0;
        boolean z21 = false;
        while (true) {
            if (i35 >= iD) {
                j11 = 10;
                break;
            }
            cCharAt3 = charSequence.charAt(i35);
            char c17 = (char) (cCharAt3 - '0');
            j11 = 10;
            if (c17 >= '\n') {
                if (cCharAt3 != '.') {
                    break;
                }
                z21 |= i27 >= 0;
                i27 = i35;
            } else {
                j15 = (j15 * 10) + c17;
            }
            i35++;
        }
        if (i27 < 0) {
            i12 = i35 - iJ;
            i27 = i35;
            i13 = 0;
        } else {
            i12 = (i35 - iJ) - 1;
            i13 = (i27 - i35) + 1;
        }
        if ((cCharAt3 | ' ') == 101) {
            int i36 = i35 + 1;
            char c18 = a.c(charSequence, i36, iD);
            boolean z22 = c18 == '-';
            if (z22 || c18 == '+') {
                i36 = i35 + 2;
                c18 = a.c(charSequence, i36, iD);
            }
            char c19 = (char) (c18 - '0');
            boolean z23 = (c19 >= '\n') | z21;
            i14 = iJ;
            int i37 = 0;
            while (true) {
                if (i37 < 1024) {
                    i37 = (i37 * 10) + c19;
                }
                i36++;
                c10 = a.c(charSequence, i36, iD);
                char c20 = (char) (c10 - '0');
                z10 = z20;
                if (c20 >= '\n') {
                    break;
                }
                c19 = c20;
                z20 = z10;
            }
            if (z22) {
                i37 = -i37;
            }
            i13 += i37;
            i15 = i36;
            i16 = i37;
            cCharAt3 = c10;
            z21 = z23;
        } else {
            i14 = iJ;
            z10 = z20;
            i15 = i35;
            i16 = 0;
        }
        if ((cCharAt3 | AbstractJsonLexerKt.STRING) == 102) {
            i15++;
        }
        int iJ3 = j(charSequence, i15, iD);
        if (z21 || iJ3 < iD || (!z15 && i12 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i12 > 19) {
            int i38 = i14;
            int i39 = 0;
            while (i38 < i35) {
                char cCharAt4 = charSequence.charAt(i38);
                if (cCharAt4 != '.') {
                    if (Long.compare(j13 ^ j10, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j13 = ((j13 * j11) + cCharAt4) - 48;
                } else {
                    i39++;
                }
                i38++;
            }
            i17 = (i27 - i38) + i39 + i16;
            z11 = i38 < i35;
            j12 = j13;
            i18 = i10;
            i19 = i13;
            z12 = z10;
            dVar = this;
        } else {
            j12 = j15;
            z11 = false;
            i17 = 0;
            dVar = this;
            i18 = i10;
            i19 = i13;
            z12 = z10;
        }
        return dVar.k(charSequence, i18, iD, z12, j12, i19, z11, i17);
    }
}
