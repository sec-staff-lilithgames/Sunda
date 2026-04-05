package bc;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends a {
    public static int j(int i10, char[] cArr, int i11) {
        while (i10 < i11 && cArr[i10] <= ' ') {
            i10++;
        }
        return i10;
    }

    public abstract long g();

    public abstract long h();

    public abstract long i();

    public abstract long k(char[] cArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    public abstract long l(char[] cArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    public long parseFloatingPointLiteral(char[] cArr, int i10, int i11) {
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
        c cVar;
        int i18;
        int i19;
        boolean z12;
        char cB;
        int i20;
        int iMin;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        char cB2;
        char c10;
        int iD = a.d(cArr.length, i10, i11);
        int iJ = j(i10, cArr, iD);
        if (iJ == iD) {
            throw new NumberFormatException("illegal syntax");
        }
        char cB3 = cArr[iJ];
        boolean z14 = cB3 == '-';
        if ((z14 || cB3 == '+') && (cB3 = a.b((iJ = iJ + 1), cArr, iD)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (cB3 >= 'I') {
            char c11 = cArr[iJ];
            if (c11 == 'N') {
                int i25 = iJ + 2;
                if (i25 < iD && cArr[iJ + 1] == 'a' && cArr[i25] == 'N' && j(iJ + 3, cArr, iD) == iD) {
                    return g();
                }
            } else {
                int i26 = iJ + 7;
                if (i26 < iD && c11 == 'I' && cArr[iJ + 1] == 'n' && cArr[iJ + 2] == 'f' && cArr[iJ + 3] == 'i' && cArr[iJ + 4] == 'n' && cArr[iJ + 5] == 'i' && cArr[iJ + 6] == 't' && cArr[i26] == 'y' && j(iJ + 8, cArr, iD) == iD) {
                    return z14 ? h() : i();
                }
            }
            throw new NumberFormatException("illegal syntax");
        }
        boolean z15 = cB3 == '0';
        int i27 = -1;
        long j13 = 0;
        if (z15) {
            int i28 = iJ + 1;
            j10 = Long.MIN_VALUE;
            if ((a.b(i28, cArr, iD) | ' ') == 120) {
                int i29 = iJ + 2;
                int i30 = i29;
                long j14 = 0;
                char c12 = 0;
                boolean z16 = false;
                while (true) {
                    if (i30 >= iD) {
                        break;
                    }
                    char c13 = cArr[i30];
                    int iF = a.f(c13);
                    if (iF < 0) {
                        c10 = c13;
                        if (iF != -4) {
                            c12 = c10;
                            break;
                        }
                        z16 |= i27 >= 0;
                        int i31 = i30;
                        while (i31 < iD - 8) {
                            long jTryToParseEightHexDigits = g.tryToParseEightHexDigits(cArr, i31 + 1);
                            if (jTryToParseEightHexDigits < 0) {
                                break;
                            }
                            j14 = (j14 << 32) + jTryToParseEightHexDigits;
                            i31 += 8;
                        }
                        i27 = i30;
                        i30 = i31;
                    } else {
                        c10 = c13;
                        j14 = iF | (j14 << 4);
                    }
                    i30++;
                    c12 = c10;
                }
                if (i27 < 0) {
                    i20 = i30 - i29;
                    i27 = i30;
                    iMin = 0;
                } else {
                    i20 = (i30 - i29) - 1;
                    iMin = Math.min((i27 - i30) + 1, 1024) * 4;
                }
                boolean z17 = (c12 | ' ') == 112;
                if (z17) {
                    i22 = i30 + 1;
                    char cB4 = a.b(i22, cArr, iD);
                    boolean z18 = cB4 == '-';
                    i21 = i29;
                    if (z18 || cB4 == '+') {
                        i22 = i30 + 2;
                        cB4 = a.b(i22, cArr, iD);
                    }
                    char c14 = (char) (cB4 - '0');
                    boolean z19 = z16 | (c14 >= '\n');
                    int i32 = 0;
                    while (true) {
                        if (i32 < 1024) {
                            i32 = (i32 * 10) + c14;
                        }
                        i22++;
                        cB2 = a.b(i22, cArr, iD);
                        char c15 = (char) (cB2 - '0');
                        if (c15 >= '\n') {
                            break;
                        }
                        c14 = c15;
                    }
                    if (z18) {
                        i32 = -i32;
                    }
                    iMin += i32;
                    i23 = i32;
                    z16 = z19;
                    c12 = cB2;
                } else {
                    i21 = i29;
                    i22 = i30;
                    i23 = 0;
                }
                if ((c12 | AbstractJsonLexerKt.STRING) == 102) {
                    i22++;
                }
                int iJ2 = j(i22, cArr, iD);
                if (z16 || iJ2 < iD || i20 == 0 || !z17) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (i20 > 16) {
                    int i33 = i21;
                    int i34 = 0;
                    while (i33 < i30) {
                        int iF2 = a.f(cArr[i33]);
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
                return l(cArr, i10, iD, z14, j14, iMin, z13, (((i27 - iJ2) + i24) * 4) + i23);
            }
            iJ = i28;
        } else {
            j10 = Long.MIN_VALUE;
        }
        boolean z20 = z14;
        int iMin2 = Math.min(iD - 4, 1073741824);
        int i35 = iJ;
        long j15 = 0;
        char c16 = 0;
        boolean z21 = false;
        while (true) {
            if (i35 >= iD) {
                j11 = 10;
                break;
            }
            c16 = cArr[i35];
            j11 = 10;
            char c17 = (char) (c16 - '0');
            if (c17 >= '\n') {
                if (c16 != '.') {
                    break;
                }
                z21 |= i27 >= 0;
                int i36 = i35;
                while (i36 < iMin2) {
                    int iTryToParseFourDigits = g.tryToParseFourDigits(cArr, i36 + 1);
                    if (iTryToParseFourDigits < 0) {
                        break;
                    }
                    j15 = (j15 * 10000) + iTryToParseFourDigits;
                    i36 += 4;
                }
                i27 = i35;
                i35 = i36;
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
        if ((c16 | ' ') == 101) {
            int i37 = i35 + 1;
            char cB5 = a.b(i37, cArr, iD);
            boolean z22 = cB5 == '-';
            if (z22 || cB5 == '+') {
                i37 = i35 + 2;
                cB5 = a.b(i37, cArr, iD);
            }
            char c18 = (char) (cB5 - '0');
            boolean z23 = (c18 >= '\n') | z21;
            i14 = iJ;
            int i38 = 0;
            while (true) {
                if (i38 < 1024) {
                    i38 = (i38 * 10) + c18;
                }
                i37++;
                cB = a.b(i37, cArr, iD);
                char c19 = (char) (cB - '0');
                z10 = z20;
                if (c19 >= '\n') {
                    break;
                }
                c18 = c19;
                z20 = z10;
            }
            if (z22) {
                i38 = -i38;
            }
            i13 += i38;
            i15 = i37;
            i16 = i38;
            c16 = cB;
            z21 = z23;
        } else {
            i14 = iJ;
            z10 = z20;
            i15 = i35;
            i16 = 0;
        }
        if ((c16 | AbstractJsonLexerKt.STRING) == 102) {
            i15++;
        }
        int iJ3 = j(i15, cArr, iD);
        if (z21 || iJ3 < iD || (!z15 && i12 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i12 > 19) {
            int i39 = i14;
            int i40 = 0;
            while (i39 < i35) {
                char c20 = cArr[i39];
                if (c20 != '.') {
                    if (Long.compare(j13 ^ j10, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j13 = ((j13 * j11) + c20) - 48;
                } else {
                    i40++;
                }
                i39++;
            }
            i17 = (i27 - i39) + i40 + i16;
            z11 = i39 < i35;
            j12 = j13;
            i18 = i10;
            i19 = i13;
            z12 = z10;
            cVar = this;
        } else {
            j12 = j15;
            z11 = false;
            i17 = 0;
            cVar = this;
            i18 = i10;
            i19 = i13;
            z12 = z10;
        }
        return cVar.k(cArr, i18, iD, z12, j12, i19, z11, i17);
    }
}
