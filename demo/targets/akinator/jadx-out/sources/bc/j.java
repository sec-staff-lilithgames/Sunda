package bc;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final double f9035a = Math.cos(0.7853981633974483d);

    /* renamed from: b, reason: collision with root package name */
    public static final double f9036b = Math.sin(0.7853981633974483d);

    /* renamed from: c, reason: collision with root package name */
    public static volatile as.n[] f9037c = new as.n[20];

    /* renamed from: d, reason: collision with root package name */
    public static volatile as.n[] f9038d = new as.n[20];

    public static int a(int i10) {
        if (i10 <= 9728) {
            return 19;
        }
        if (i10 <= 18432) {
            return 18;
        }
        if (i10 <= 69632) {
            return 17;
        }
        if (i10 <= 262144) {
            return 16;
        }
        if (i10 <= 983040) {
            return 15;
        }
        if (i10 <= 3670016) {
            return 14;
        }
        if (i10 <= 13631488) {
            return 13;
        }
        if (i10 <= 25165824) {
            return 12;
        }
        if (i10 <= 92274688) {
            return 11;
        }
        if (i10 <= 335544320) {
            return 10;
        }
        return i10 <= 1207959552 ? 9 : 8;
    }

    public static as.n b(int i10) {
        if (i10 == 1) {
            as.n nVar = new as.n(1);
            nVar.l(0, 1.0d);
            nVar.d(0, 0.0d);
            return nVar;
        }
        as.n nVar2 = new as.n(i10);
        nVar2.n(0, 1.0d, 0.0d);
        int i11 = i10 / 2;
        nVar2.n(i11, f9035a, f9036b);
        double d10 = 1.5707963267948966d / i10;
        int i12 = 1;
        while (i12 < i11) {
            double d11 = i12 * d10;
            double dCos = Math.cos(d11);
            double dSin = Math.sin(d11);
            nVar2.n(i12, dCos, dSin);
            int i13 = i12;
            nVar2.n(i10 - i13, dSin, dCos);
            i12 = i13 + 1;
        }
        return nVar2;
    }

    public static void c(as.n nVar, as.n[] nVarArr) {
        int i10 = nVar.f7991a;
        double[] dArr = (double[]) nVar.f7993c;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i10);
        while (iNumberOfLeadingZeros >= 2) {
            as.n nVar2 = nVarArr[iNumberOfLeadingZeros - 2];
            int i11 = 1 << iNumberOfLeadingZeros;
            int i12 = 0;
            while (i12 < i10) {
                int i13 = 0;
                while (true) {
                    int i14 = i11 / 4;
                    if (i13 < i14) {
                        double dK = nVar2.k(i13);
                        double dC = nVar2.c(i13);
                        double dFma = g.fma(dK, dK, (-dC) * dC);
                        double d10 = 2.0d * dK * dC;
                        int i15 = i12 + i13;
                        int i16 = i14 + i15;
                        int i17 = (i11 / 2) + i15;
                        int iA = a.b.a(i11, 3, 4, i15);
                        double dK2 = nVar.k(i16) + dArr[nVar.m(i15)];
                        double dC2 = nVar.c(i16) + dArr[nVar.e(i15)];
                        double dK3 = nVar.k(i17) + dK2;
                        double dC3 = nVar.c(i17) + dC2;
                        double dK4 = nVar.k(iA) + dK3;
                        double[] dArr2 = dArr;
                        double dC4 = nVar.c(iA) + dC3;
                        double dC5 = nVar.c(i16) + dArr2[nVar.m(i15)];
                        double dK5 = dArr2[nVar.e(i15)] - nVar.k(i16);
                        double dK6 = dC5 - nVar.k(i17);
                        double dC6 = dK5 - nVar.c(i17);
                        double dC7 = dK6 - nVar.c(iA);
                        double dK7 = nVar.k(iA) + dC6;
                        double dFma2 = g.fma(dC7, dK, dK7 * dC);
                        double dFma3 = g.fma(-dC7, dC, dK7 * dK);
                        double dK8 = dArr2[nVar.m(i15)] - nVar.k(i16);
                        double dC8 = dArr2[nVar.e(i15)] - nVar.c(i16);
                        double dK9 = nVar.k(i17) + dK8;
                        double dC9 = nVar.c(i17) + dC8;
                        double dK10 = dK9 - nVar.k(iA);
                        double dC10 = dC9 - nVar.c(iA);
                        int i18 = i10;
                        double dFma4 = g.fma(dK10, dFma, dC10 * d10);
                        double dFma5 = g.fma(-dK10, d10, dC10 * dFma);
                        double dC11 = dArr2[nVar.m(i15)] - nVar.c(i16);
                        double dK11 = nVar.k(i16) + dArr2[nVar.e(i15)];
                        double dK12 = dC11 - nVar.k(i17);
                        double dC12 = dK11 - nVar.c(i17);
                        double dC13 = nVar.c(iA) + dK12;
                        double dK13 = dC12 - nVar.k(iA);
                        double dFma6 = g.fma(dC13, dK, (-dK13) * dC);
                        double dFma7 = g.fma(dC13, dC, dK13 * dK);
                        nVar.l(i15, dK4);
                        nVar.d(i15, dC4);
                        nVar.l(i16, dFma2);
                        nVar.d(i16, dFma3);
                        nVar.l(i17, dFma4);
                        nVar.d(i17, dFma5);
                        nVar.l(iA, dFma6);
                        nVar.d(iA, dFma7);
                        i13++;
                        nVar2 = nVar2;
                        dArr = dArr2;
                        iNumberOfLeadingZeros = iNumberOfLeadingZeros;
                        i11 = i11;
                        i12 = i12;
                        i10 = i18;
                    }
                }
                i12 += i11;
            }
            iNumberOfLeadingZeros -= 2;
        }
        int i19 = i10;
        double[] dArr3 = dArr;
        if (iNumberOfLeadingZeros > 0) {
            for (int i20 = 0; i20 < i19; i20 += 2) {
                double d11 = dArr3[nVar.m(i20)];
                double d12 = dArr3[nVar.e(i20)];
                int i21 = i20 + 1;
                double d13 = dArr3[nVar.m(i21)];
                double d14 = dArr3[nVar.e(i21)];
                int iM = nVar.m(i20);
                dArr3[iM] = dArr3[iM] + d13;
                int iE = nVar.e(i20);
                dArr3[iE] = dArr3[iE] + d14;
                nVar.l(i21, d11 - d13);
                nVar.d(i21, d12 - d14);
            }
        }
    }

    public static void d(as.n nVar, as.n nVar2, as.n nVar3, int i10, double d10) {
        double dSqrt = Math.sqrt(3.0d) * i10 * (-0.5d);
        for (int i11 = 0; i11 < nVar.f7991a; i11++) {
            double dK = nVar3.k(i11) + nVar2.k(i11) + nVar.k(i11);
            double dC = nVar3.c(i11) + nVar2.c(i11) + nVar.c(i11);
            double dC2 = (nVar3.c(i11) - nVar2.c(i11)) * dSqrt;
            double dK2 = (nVar2.k(i11) - nVar3.k(i11)) * dSqrt;
            double dK3 = (nVar3.k(i11) + nVar2.k(i11)) * 0.5d;
            double dC3 = (nVar3.c(i11) + nVar2.c(i11)) * 0.5d;
            double dK4 = (nVar.k(i11) - dK3) + dC2;
            double dC4 = (nVar.c(i11) + dK2) - dC3;
            double dK5 = (nVar.k(i11) - dK3) - dC2;
            double dC5 = (nVar.c(i11) - dK2) - dC3;
            nVar.l(i11, dK * d10);
            nVar.d(i11, dC * d10);
            nVar2.l(i11, dK4 * d10);
            nVar2.d(i11, dC4 * d10);
            nVar3.l(i11, dK5 * d10);
            nVar3.d(i11, dC5 * d10);
        }
    }

    public static void e(as.n nVar, as.n[] nVarArr, as.n nVar2) {
        int i10;
        int i11 = nVar.f7991a;
        int i12 = i11 / 3;
        int i13 = 0;
        as.n nVar3 = new as.n(nVar, 0, i12);
        int i14 = i12 * 2;
        as.n nVar4 = new as.n(nVar, i12, i14);
        as.n nVar5 = new as.n(nVar, i14, i11);
        d(nVar3, nVar4, nVar5, 1, 1.0d);
        i iVar = new i();
        while (true) {
            i10 = i11 / 4;
            if (i13 >= i10) {
                break;
            }
            iVar.f9033a = nVar2.k(i13);
            iVar.f9034b = nVar2.c(i13);
            nVar4.h(i13, iVar);
            nVar5.h(i13, iVar);
            nVar5.h(i13, iVar);
            i13++;
        }
        for (int i15 = i10; i15 < i12; i15++) {
            int i16 = i15 - i10;
            iVar.f9033a = nVar2.k(i16);
            iVar.f9034b = nVar2.c(i16);
            nVar4.i(i15, iVar);
            nVar5.i(i15, iVar);
            nVar5.i(i15, iVar);
        }
        c(nVar3, nVarArr);
        c(nVar4, nVarArr);
        c(nVar5, nVarArr);
    }

    public static BigInteger f(as.n nVar, int i10, int i11) {
        as.n nVar2 = nVar;
        int i12 = i11;
        long j10 = i12;
        int iMin = (int) Math.min(nVar2.f7991a, (2147483648L / j10) + 1);
        int i13 = (int) ((((iMin * j10) + 31) * 8) / 32);
        byte[] bArr = new byte[i13];
        int i14 = 1;
        int i15 = (1 << i12) - 1;
        int i16 = 32 - i12;
        int i17 = (i13 * 8) - i12;
        int i18 = 0;
        int i19 = i13 - 4;
        int iMin2 = Math.min(Math.max(0, i17 >> 3), i19);
        long j11 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i20 <= i14) {
            int i22 = i18;
            while (i22 < iMin) {
                long jRound = Math.round(((double[]) nVar2.f7993c)[(i22 << 1) + i20]) + j11;
                long j12 = jRound >> i12;
                int iMin3 = Math.min(Math.max(i18, i17 >> 3), i19);
                i21 = (int) (((jRound & i15) << ((i16 - i17) + (iMin3 << 3))) | (i21 >>> ((iMin2 - iMin3) << 3)));
                g.writeIntBE(bArr, iMin3, i21);
                i17 -= i11;
                i22++;
                nVar2 = nVar;
                i12 = i11;
                iMin2 = iMin3;
                j11 = j12;
                i18 = 0;
            }
            i20++;
            nVar2 = nVar;
            i12 = i11;
            i14 = 1;
            i18 = 0;
        }
        return new BigInteger(i10, bArr);
    }

    public static as.n[] g(int i10) {
        as.n[] nVarArr = new as.n[i10 + 1];
        while (i10 >= 0) {
            if (i10 < 20) {
                if (f9037c[i10] == null) {
                    f9037c[i10] = b(1 << i10);
                }
                nVarArr[i10] = f9037c[i10];
            } else {
                nVarArr[i10] = b(1 << i10);
            }
            i10 -= 2;
        }
        return nVarArr;
    }

    public static as.n h(int i10) {
        if (i10 >= 20) {
            return b(3 << i10);
        }
        if (f9038d[i10] == null) {
            f9038d[i10] = b(3 << i10);
        }
        return f9038d[i10];
    }

    public static void i(as.n nVar, as.n[] nVarArr) {
        int i10;
        int i11 = nVar.f7991a;
        double[] dArr = (double[]) nVar.f7993c;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i11);
        int i12 = 1;
        if (iNumberOfLeadingZeros % 2 != 0) {
            for (int i13 = 0; i13 < i11; i13 += 2) {
                int i14 = i13 + 1;
                double d10 = dArr[nVar.m(i14)];
                double d11 = dArr[nVar.e(i14)];
                double d12 = dArr[nVar.m(i13)];
                double d13 = dArr[nVar.e(i13)];
                int iM = nVar.m(i13);
                dArr[iM] = dArr[iM] + d10;
                int iE = nVar.e(i13);
                dArr[iE] = dArr[iE] + d11;
                nVar.l(i14, d12 - d10);
                nVar.d(i14, d13 - d11);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        while (i10 <= iNumberOfLeadingZeros) {
            as.n nVar2 = nVarArr[i10 - 1];
            int i15 = i12 << (i10 + 1);
            int i16 = 0;
            while (i16 < i11) {
                int i17 = 0;
                while (true) {
                    int i18 = i15 / 4;
                    if (i17 < i18) {
                        double dK = nVar2.k(i17);
                        double dC = nVar2.c(i17);
                        double dFma = g.fma(dK, dK, (-dC) * dC);
                        double d14 = 2.0d * dK * dC;
                        int i19 = i16 + i17;
                        int i20 = i18 + i19;
                        int i21 = (i15 / 2) + i19;
                        int iA = a.b.a(i15, 3, 4, i19);
                        double d15 = dArr[nVar.m(i19)];
                        double d16 = dArr[nVar.e(i19)];
                        double d17 = dArr[nVar.m(i20)];
                        as.n nVar3 = nVar2;
                        double d18 = dArr[nVar.e(i20)];
                        int i22 = i17;
                        double dFma2 = g.fma(d17, dK, (-d18) * dC);
                        double dFma3 = g.fma(d17, dC, d18 * dK);
                        double d19 = dArr[nVar.m(i21)];
                        double d20 = dArr[nVar.e(i21)];
                        double dFma4 = g.fma(d19, dFma, (-d20) * d14);
                        double dFma5 = g.fma(d19, d14, d20 * dFma);
                        double d21 = dArr[nVar.m(iA)];
                        double d22 = dArr[nVar.e(iA)];
                        double dFma6 = g.fma(d21, dK, d22 * dC);
                        double dFma7 = g.fma(-d21, dC, d22 * dK);
                        double d23 = d15 + dFma2 + dFma4 + dFma6;
                        nVar.l(i19, d23);
                        nVar.d(i19, d16 + dFma3 + dFma5 + dFma7);
                        nVar.l(i20, ((d15 - dFma3) - dFma4) + dFma7);
                        nVar.d(i20, ((d16 + dFma2) - dFma5) - dFma6);
                        nVar.l(i21, ((d15 - dFma2) + dFma4) - dFma6);
                        nVar.d(i21, ((d16 - dFma3) + dFma5) - dFma7);
                        nVar.l(iA, ((d15 + dFma3) - dFma4) - dFma7);
                        nVar.d(iA, ((d16 - dFma2) - dFma5) + dFma6);
                        i17 = i22 + 1;
                        iNumberOfLeadingZeros = iNumberOfLeadingZeros;
                        dArr = dArr;
                        nVar2 = nVar3;
                        i15 = i15;
                        i16 = i16;
                    }
                }
                i16 += i15;
            }
            i10 += 2;
            i12 = 1;
        }
        double[] dArr2 = dArr;
        int i23 = iNumberOfLeadingZeros;
        for (int i24 = 0; i24 < i11; i24++) {
            int iM2 = nVar.m(i24);
            int iE2 = nVar.e(i24);
            double d24 = dArr2[iM2];
            double d25 = dArr2[iE2];
            long j10 = ((-i23) + 1023) << 52;
            dArr2[iM2] = Double.longBitsToDouble(j10) * d24;
            dArr2[iE2] = Double.longBitsToDouble(j10) * d25;
        }
    }

    public static void j(as.n nVar, as.n[] nVarArr, as.n nVar2) {
        int i10;
        int i11 = nVar.f7991a;
        int i12 = i11 / 3;
        as.n nVar3 = new as.n(nVar, 0, i12);
        int i13 = i12 * 2;
        as.n nVar4 = new as.n(nVar, i12, i13);
        int i14 = 0;
        as.n nVar5 = new as.n(nVar, i13, i11);
        i(nVar3, nVarArr);
        i(nVar4, nVarArr);
        i(nVar5, nVarArr);
        i iVar = new i();
        while (true) {
            i10 = i11 / 4;
            if (i14 >= i10) {
                break;
            }
            iVar.f9033a = nVar2.k(i14);
            iVar.f9034b = nVar2.c(i14);
            nVar4.f(i14, iVar);
            nVar5.f(i14, iVar);
            nVar5.f(i14, iVar);
            i14++;
        }
        for (int i15 = i10; i15 < i12; i15++) {
            int i16 = i15 - i10;
            iVar.f9033a = nVar2.k(i16);
            iVar.f9034b = nVar2.c(i16);
            nVar4.g(i15, iVar);
            nVar5.g(i15, iVar);
            nVar5.g(i15, iVar);
        }
        d(nVar3, nVar4, nVar5, -1, 0.3333333333333333d);
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            if (bigInteger2.signum() == 0) {
                return BigInteger.ZERO;
            }
            if (bigInteger2.bitLength() < 33220) {
                return bigInteger2.multiply(bigInteger2);
            }
            byte[] byteArray = bigInteger2.toByteArray();
            int length = byteArray.length * 8;
            int iA = a(length);
            int i10 = ((length + iA) - 1) / iA;
            int i11 = i10 + 1;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
            int i12 = 32 - iNumberOfLeadingZeros;
            int i13 = 1 << i12;
            int i14 = (i13 * 3) / 4;
            if (i11 >= i14) {
                as.n nVarL = l(i13, iA, byteArray);
                as.n[] nVarArrG = g(i12);
                nVarL.b(nVarArrG[i12]);
                c(nVarL, nVarArrG);
                nVarL.o();
                i(nVarL, nVarArrG);
                nVarL.a(nVarArrG[i12]);
                return f(nVarL, 1, iA);
            }
            as.n nVarL2 = l(i14, iA, byteArray);
            int i15 = 30 - iNumberOfLeadingZeros;
            as.n[] nVarArrG2 = g(i15);
            as.n nVarH = h(i15);
            as.n nVarH2 = h(28 - iNumberOfLeadingZeros);
            nVarL2.b(nVarH);
            e(nVarL2, nVarArrG2, nVarH2);
            nVarL2.o();
            j(nVarL2, nVarArrG2, nVarH2);
            nVarL2.a(nVarH);
            return f(nVarL2, 1, iA);
        }
        int iBitLength = bigInteger.bitLength();
        int iBitLength2 = bigInteger2.bitLength();
        if (iBitLength + iBitLength2 > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
        }
        if (iBitLength <= 1920 || iBitLength2 <= 1920 || (iBitLength <= 33220 && iBitLength2 <= 33220)) {
            return bigInteger.multiply(bigInteger2);
        }
        int iSignum = bigInteger2.signum() * bigInteger.signum();
        if (bigInteger.signum() < 0) {
            bigInteger = bigInteger.negate();
        }
        byte[] byteArray2 = bigInteger.toByteArray();
        if (bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.negate();
        }
        byte[] byteArray3 = bigInteger2.toByteArray();
        int iMax = Math.max(byteArray2.length, byteArray3.length) * 8;
        int iA2 = a(iMax);
        int i16 = ((iMax + iA2) - 1) / iA2;
        int i17 = i16 + 1;
        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i16);
        int i18 = 32 - iNumberOfLeadingZeros2;
        int i19 = 1 << i18;
        int i20 = (i19 * 3) / 4;
        if (i17 >= i20 || i18 <= 3) {
            as.n[] nVarArrG3 = g(i18);
            as.n nVarL3 = l(i19, iA2, byteArray2);
            nVarL3.b(nVarArrG3[i18]);
            c(nVarL3, nVarArrG3);
            as.n nVarL4 = l(i19, iA2, byteArray3);
            nVarL4.b(nVarArrG3[i18]);
            c(nVarL4, nVarArrG3);
            nVarL3.j(nVarL4);
            i(nVarL3, nVarArrG3);
            nVarL3.a(nVarArrG3[i18]);
            return f(nVarL3, iSignum, iA2);
        }
        int i21 = 30 - iNumberOfLeadingZeros2;
        as.n[] nVarArrG4 = g(i21);
        as.n nVarH3 = h(i21);
        as.n nVarH4 = h(28 - iNumberOfLeadingZeros2);
        as.n nVarL5 = l(i20, iA2, byteArray2);
        nVarL5.b(nVarH3);
        e(nVarL5, nVarArrG4, nVarH4);
        as.n nVarL6 = l(i20, iA2, byteArray3);
        nVarL6.b(nVarH3);
        e(nVarL6, nVarArrG4, nVarH4);
        nVarL5.j(nVarL6);
        j(nVarL5, nVarArrG4, nVarH4);
        nVarL5.a(nVarH3);
        return f(nVarL5, iSignum, iA2);
    }

    public static as.n l(int i10, int i11, byte[] bArr) {
        as.n nVar = new as.n(i10);
        if (bArr.length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        int i12 = 1 << i11;
        int i13 = i12 / 2;
        int i14 = i12 - 1;
        int i15 = 32 - i11;
        int length = (bArr.length * 8) - i11;
        int intBE = 0;
        int i16 = 0;
        while (length > (-i11)) {
            int iMin = Math.min(Math.max(0, length >> 3), bArr.length - 4);
            intBE = (i13 - (((g.readIntBE(bArr, iMin) >>> ((i15 - length) + (iMin << 3))) & i14) + intBE)) >>> 31;
            nVar.l(i16, r9 - ((-intBE) & i12));
            i16++;
            length -= i11;
        }
        if (intBE > 0) {
            nVar.l(i16, intBE);
        }
        return nVar;
    }
}
