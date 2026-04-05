package bc;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends a {
    public static int j(int i10, int i11, byte[] bArr) {
        while (i10 < i11 && (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) <= 32) {
            i10++;
        }
        return i10;
    }

    public abstract long g();

    public abstract long h();

    public abstract long i();

    public abstract long k(byte[] bArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    public abstract long l(byte[] bArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13);

    public long parseFloatingPointLiteral(byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j12;
        boolean z10;
        int i17;
        b bVar;
        int i18;
        int i19;
        boolean z11;
        byte bA;
        int iTryToParseFourDigits;
        byte[] bArr2;
        boolean z12;
        int i20;
        int iMin;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z13;
        byte bA2;
        int iD = a.d(bArr.length, i10, i11);
        int iJ = j(i10, iD, bArr);
        if (iJ == iD) {
            throw new NumberFormatException("illegal syntax");
        }
        byte bA3 = bArr[iJ];
        boolean z14 = bA3 == 45;
        if ((z14 || bA3 == 43) && (bA3 = a.a((iJ = iJ + 1), iD, bArr)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (bA3 >= 73) {
            if (bArr[iJ] == 78) {
                int i25 = iJ + 2;
                if (i25 < iD && bArr[iJ + 1] == 97 && bArr[i25] == 78 && j(iJ + 3, iD, bArr) == iD) {
                    return g();
                }
            } else if (iJ + 7 < iD && g.readLongLE(bArr, iJ) == 8751735898823355977L && j(iJ + 8, iD, bArr) == iD) {
                return z14 ? h() : i();
            }
            throw new NumberFormatException("illegal syntax");
        }
        boolean z15 = bA3 == 48;
        int i26 = -1;
        long j13 = 0;
        if (z15) {
            j10 = Long.MIN_VALUE;
            int i27 = iJ + 1;
            if ((a.a(i27, iD, bArr) | 32) == 120) {
                int i28 = iJ + 2;
                int i29 = i28;
                long j14 = 0;
                byte b10 = 0;
                boolean z16 = false;
                while (true) {
                    bArr2 = a.f9022a;
                    if (i29 >= iD) {
                        z12 = z14;
                        break;
                    }
                    b10 = bArr[i29];
                    byte b11 = bArr2[b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                    if (b11 < 0) {
                        z12 = z14;
                        if (b11 != -4) {
                            break;
                        }
                        z16 |= i26 >= 0;
                        i26 = i29;
                    } else {
                        z12 = z14;
                        j14 = (j14 << 4) | b11;
                    }
                    i29++;
                    z14 = z12;
                }
                if (i26 < 0) {
                    i20 = i29 - i28;
                    i26 = i29;
                    iMin = 0;
                } else {
                    i20 = (i29 - i28) - 1;
                    iMin = Math.min((i26 - i29) + 1, 1024) * 4;
                }
                boolean z17 = (b10 | 32) == 112;
                if (z17) {
                    i22 = i29 + 1;
                    byte bA4 = a.a(i22, iD, bArr);
                    boolean z18 = bA4 == 45;
                    if (z18 || bA4 == 43) {
                        i22 = i29 + 2;
                        bA4 = a.a(i22, iD, bArr);
                    }
                    char c10 = (char) (bA4 - 48);
                    boolean z19 = z16 | (c10 >= '\n');
                    int i30 = 0;
                    while (true) {
                        if (i30 < 1024) {
                            i30 = (i30 * 10) + c10;
                        }
                        i22++;
                        bA2 = a.a(i22, iD, bArr);
                        char c11 = (char) (bA2 - 48);
                        i21 = i28;
                        if (c11 >= '\n') {
                            break;
                        }
                        c10 = c11;
                        i28 = i21;
                    }
                    if (z18) {
                        i30 = -i30;
                    }
                    iMin += i30;
                    i23 = i30;
                    z16 = z19;
                    b10 = bA2;
                } else {
                    i21 = i28;
                    i22 = i29;
                    i23 = 0;
                }
                if ((b10 | 34) == 102) {
                    i22++;
                }
                int iJ2 = j(i22, iD, bArr);
                if (z16 || iJ2 < iD || i20 == 0 || !z17) {
                    throw new NumberFormatException("illegal syntax");
                }
                if (i20 > 16) {
                    int i31 = i21;
                    int i32 = 0;
                    while (i31 < i29) {
                        byte b12 = bArr2[bArr[i31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                        if (b12 < 0) {
                            i32++;
                        } else {
                            if (Long.compare(j13 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                break;
                            }
                            j13 = (j13 << 4) | b12;
                        }
                        i31++;
                    }
                    z13 = i31 < i29;
                    int i33 = i32;
                    iJ2 = i31;
                    i24 = i33;
                    j14 = j13;
                } else {
                    i24 = 0;
                    z13 = false;
                }
                return l(bArr, i10, iD, z12, j14, iMin, z13, (((i26 - iJ2) + i24) * 4) + i23);
            }
            iJ = i27;
        } else {
            j10 = Long.MIN_VALUE;
        }
        boolean z20 = z14;
        int i34 = iJ;
        long j15 = 0;
        byte b13 = 0;
        boolean z21 = false;
        while (true) {
            if (i34 >= iD) {
                j11 = 10;
                break;
            }
            b13 = bArr[i34];
            char c12 = (char) (b13 - 48);
            j11 = 10;
            if (c12 >= '\n') {
                if (b13 != 46) {
                    break;
                }
                z21 |= i26 >= 0;
                int i35 = i34;
                while (i35 < iD - 4 && (iTryToParseFourDigits = g.tryToParseFourDigits(bArr, i35 + 1)) >= 0) {
                    j15 = (j15 * 10000) + iTryToParseFourDigits;
                    i35 += 4;
                }
                i26 = i34;
                i34 = i35;
            } else {
                j15 = (j15 * 10) + c12;
            }
            i34++;
        }
        if (i26 < 0) {
            i12 = i34 - iJ;
            i26 = i34;
            i13 = 0;
        } else {
            i12 = (i34 - iJ) - 1;
            i13 = (i26 - i34) + 1;
        }
        if ((b13 | 32) == 101) {
            int i36 = i34 + 1;
            byte bA5 = a.a(i36, iD, bArr);
            boolean z22 = bA5 == 45;
            if (z22 || bA5 == 43) {
                i36 = i34 + 2;
                bA5 = a.a(i36, iD, bArr);
            }
            char c13 = (char) (bA5 - 48);
            boolean z23 = (c13 >= '\n') | z21;
            int i37 = 0;
            while (true) {
                if (i37 < 1024) {
                    i37 = (i37 * 10) + c13;
                }
                i36++;
                bA = a.a(i36, iD, bArr);
                char c14 = (char) (bA - 48);
                i14 = iJ;
                if (c14 >= '\n') {
                    break;
                }
                c13 = c14;
                iJ = i14;
            }
            if (z22) {
                i37 = -i37;
            }
            i13 += i37;
            i15 = i36;
            b13 = bA;
            i16 = i37;
            z21 = z23;
        } else {
            i14 = iJ;
            i15 = i34;
            i16 = 0;
        }
        if ((b13 | 34) == 102) {
            i15++;
        }
        int iJ3 = j(i15, iD, bArr);
        if (z21 || iJ3 < iD || (!z15 && i12 == 0)) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i12 > 19) {
            int i38 = i14;
            int i39 = 0;
            while (i38 < i34) {
                byte b14 = bArr[i38];
                if (b14 != 46) {
                    if (Long.compare(j13 ^ j10, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j13 = ((j13 * j11) + b14) - 48;
                } else {
                    i39++;
                }
                i38++;
            }
            i17 = (i26 - i38) + i39 + i16;
            z10 = i38 < i34;
            j12 = j13;
            i18 = i10;
            i19 = i13;
            z11 = z20;
            bVar = this;
        } else {
            j12 = j15;
            z10 = false;
            i17 = 0;
            bVar = this;
            i18 = i10;
            i19 = i13;
            z11 = z20;
        }
        return bVar.k(bArr, i18, iD, z11, j12, i19, z10, i17);
    }
}
