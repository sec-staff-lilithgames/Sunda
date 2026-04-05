package fc;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.core.request.NJc.yFkbx;
import ec.f;
import ic.j;
import ic.j0;
import ic.m0;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.q;
import ub.r;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d extends c {
    public static final int D0 = r.ALLOW_TRAILING_COMMA.getMask();
    public static final int E0 = r.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int F0 = r.ALLOW_MISSING_VALUES.getMask();
    public static final int G0 = r.ALLOW_SINGLE_QUOTES.getMask();
    public static final int H0 = r.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int I0 = r.ALLOW_COMMENTS.getMask();
    public static final int J0 = r.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] K0 = cc.d.getInputCodeUtf8();
    public static final int[] L0 = cc.d.getInputCodeLatin1();
    public int C0;

    public final String A0() {
        int i10 = this.f90513v;
        int i11 = i10 + 1;
        int iO1 = o1(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int[] iArr = L0;
        if (iArr[iO1] != 0) {
            if (iO1 != 34) {
                return null;
            }
            this.f90513v = i11;
            return "";
        }
        int i12 = i10 + 2;
        int iO12 = o1(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[iO12] != 0) {
            if (iO12 != 34) {
                return null;
            }
            this.f90513v = i12;
            return g0(iO1, 1);
        }
        int i13 = iO12 | (iO1 << 8);
        int i14 = i10 + 3;
        int iO13 = o1(i12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[iO13] != 0) {
            if (iO13 != 34) {
                return null;
            }
            this.f90513v = i14;
            return g0(i13, 2);
        }
        int i15 = (i13 << 8) | iO13;
        int i16 = i10 + 4;
        int iO14 = o1(i14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[iO14] != 0) {
            if (iO14 != 34) {
                return null;
            }
            this.f90513v = i16;
            return g0(i15, 3);
        }
        int i17 = (i15 << 8) | iO14;
        int i18 = i10 + 5;
        int iO15 = o1(i16) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[iO15] != 0) {
            if (iO15 != 34) {
                return null;
            }
            this.f90513v = i18;
            return g0(i17, 4);
        }
        this.f55590n0 = i17;
        int i19 = i10 + 6;
        int iO16 = o1(i18) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iArr[iO16] == 0) {
            int i20 = iO16 | (iO15 << 8);
            int i21 = i10 + 7;
            int iO17 = o1(i19) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[iO17] == 0) {
                int i22 = iO17 | (i20 << 8);
                int i23 = i10 + 8;
                int iO18 = o1(i21) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iArr[iO18] == 0) {
                    int i24 = (i22 << 8) | iO18;
                    int i25 = i10 + 9;
                    int iO19 = o1(i23) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (iArr[iO19] == 0) {
                        int i26 = i10 + 10;
                        int iO110 = o1(i25) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (iArr[iO110] == 0) {
                            int i27 = (iO19 << 8) | iO110;
                            int i28 = i10 + 11;
                            int iO111 = o1(i26) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            if (iArr[iO111] == 0) {
                                int i29 = (i27 << 8) | iO111;
                                int i30 = i10 + 12;
                                int iO112 = o1(i28) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (iArr[iO112] == 0) {
                                    int i31 = (i29 << 8) | iO112;
                                    int i32 = i10 + 13;
                                    if ((o1(i30) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 34) {
                                        this.f90513v = i32;
                                        return i0(this.f55590n0, i24, i31, 4);
                                    }
                                } else if (iO112 == 34) {
                                    this.f90513v = i30;
                                    return i0(this.f55590n0, i24, i29, 3);
                                }
                            } else if (iO111 == 34) {
                                this.f90513v = i28;
                                return i0(this.f55590n0, i24, i27, 2);
                            }
                        } else if (iO110 == 34) {
                            this.f90513v = i26;
                            return i0(this.f55590n0, i24, iO19, 1);
                        }
                    } else if (iO19 == 34) {
                        this.f90513v = i25;
                        return h0(this.f55590n0, i24, 4);
                    }
                } else if (iO18 == 34) {
                    this.f90513v = i23;
                    return h0(this.f55590n0, i22, 3);
                }
            } else if (iO17 == 34) {
                this.f90513v = i21;
                return h0(this.f55590n0, i20, 2);
            }
        } else if (iO16 == 34) {
            this.f90513v = i19;
            return h0(this.f55590n0, iO15, 1);
        }
        return null;
    }

    public final z B0(int i10, int i11, int i12) throws xb.b, q {
        int[] iArrK = this.f55588l0;
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            if (iQ1 == 39) {
                if (i12 > 0) {
                    if (i10 >= iArrK.length) {
                        iArrK = K(iArrK.length, iArrK);
                        this.f55588l0 = iArrK;
                    }
                    iArrK[i10] = c.j0(i11, i12);
                    i10++;
                } else if (i10 == 0) {
                    return f0("");
                }
                String strFindName = this.f55587k0.findName(iArrK, i10);
                if (strFindName == null) {
                    strFindName = b0(i10, i12, iArrK);
                }
                return f0(strFindName);
            }
            if (iQ1 != 34 && L0[iQ1] != 0) {
                int i13 = 0;
                if (iQ1 != 92) {
                    Q(iQ1, "name");
                } else {
                    iQ1 = this.f90514w - this.f90513v < 5 ? t0(0, -1) : s0();
                    if (iQ1 < 0) {
                        this.f55597u0 = 8;
                        this.f55598v0 = 9;
                        this.f55589m0 = i10;
                        this.f55591o0 = i11;
                        this.f55592p0 = i12;
                        z zVar = z.NOT_AVAILABLE;
                        this.f90528g = zVar;
                        return zVar;
                    }
                }
                if (iQ1 > 127) {
                    if (i12 >= 4) {
                        if (i10 >= iArrK.length) {
                            iArrK = K(iArrK.length, iArrK);
                            this.f55588l0 = iArrK;
                        }
                        iArrK[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (iQ1 < 2048) {
                        i11 = (i11 << 8) | (iQ1 >> 6) | PsExtractor.AUDIO_STREAM;
                        i12++;
                    } else {
                        int i14 = (i11 << 8) | (iQ1 >> 12) | 224;
                        int i15 = i12 + 1;
                        if (i15 >= 4) {
                            if (i10 >= iArrK.length) {
                                iArrK = K(iArrK.length, iArrK);
                                this.f55588l0 = iArrK;
                            }
                            iArrK[i10] = i14;
                            i10++;
                            i15 = 0;
                        } else {
                            i13 = i14;
                        }
                        i11 = (i13 << 8) | ((iQ1 >> 6) & 63) | 128;
                        i12 = i15 + 1;
                    }
                    iQ1 = (iQ1 & 63) | 128;
                }
            }
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | iQ1;
            } else {
                if (i10 >= iArrK.length) {
                    iArrK = K(iArrK.length, iArrK);
                    this.f55588l0 = iArrK;
                }
                iArrK[i10] = i11;
                i10++;
                i11 = iQ1;
                i12 = 1;
            }
        }
        this.f55589m0 = i10;
        this.f55591o0 = i11;
        this.f55592p0 = i12;
        this.f55597u0 = 9;
        z zVar2 = z.NOT_AVAILABLE;
        this.f90528g = zVar2;
        return zVar2;
    }

    public final z C0() throws IOException {
        j0 j0Var = this.F;
        char[] bufferWithoutReset = j0Var.getBufferWithoutReset();
        int currentSegmentSize = j0Var.getCurrentSegmentSize();
        int i10 = this.f90513v;
        int i11 = this.f90514w - 5;
        while (i10 < this.f90514w) {
            int i12 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = j0Var.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int iMin = Math.min(this.f90514w, j.addOverflowSafe(i10, bufferWithoutReset.length - currentSegmentSize));
            while (true) {
                if (i10 < iMin) {
                    int i13 = i10 + 1;
                    int iO1 = o1(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int[] iArr = K0;
                    int i14 = iArr[iO1];
                    if (i14 == 0 || iO1 == 34) {
                        if (iO1 == 39) {
                            this.f90513v = i13;
                            j0Var.setCurrentLength(currentSegmentSize);
                            z zVar = z.VALUE_STRING;
                            p0(zVar);
                            return zVar;
                        }
                        bufferWithoutReset[currentSegmentSize] = (char) iO1;
                        currentSegmentSize++;
                        i10 = i13;
                    } else if (i13 >= i11) {
                        this.f90513v = i13;
                        j0Var.setCurrentLength(currentSegmentSize);
                        if (!u0(iO1, iArr[iO1], i13 < this.f90514w)) {
                            this.f55598v0 = 45;
                            z zVar2 = z.NOT_AVAILABLE;
                            this.f90528g = zVar2;
                            return zVar2;
                        }
                        bufferWithoutReset = j0Var.getBufferWithoutReset();
                        currentSegmentSize = j0Var.getCurrentSegmentSize();
                        i10 = this.f90513v;
                    } else {
                        if (i14 == 1) {
                            this.f90513v = i13;
                            iO1 = s0();
                            i10 = this.f90513v;
                        } else if (i14 == 2) {
                            i10 += 2;
                            iO1 = x0(iO1, o1(i13));
                        } else if (i14 == 3) {
                            int i15 = i10 + 2;
                            i10 += 3;
                            iO1 = y0(iO1, o1(i13), o1(i15));
                        } else if (i14 == 4) {
                            byte bO1 = o1(i13);
                            int i16 = i10 + 3;
                            byte bO12 = o1(i10 + 2);
                            i10 += 4;
                            int iZ0 = z0(iO1, bO1, bO12, o1(i16));
                            int i17 = currentSegmentSize + 1;
                            bufferWithoutReset[currentSegmentSize] = (char) ((iZ0 >> 10) | 55296);
                            if (i17 >= bufferWithoutReset.length) {
                                bufferWithoutReset = j0Var.finishCurrentSegment();
                                currentSegmentSize = 0;
                            } else {
                                currentSegmentSize = i17;
                            }
                            iO1 = (iZ0 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | Utf8.LOG_SURROGATE_HEADER;
                        } else {
                            if (iO1 >= 32) {
                                if (iO1 < 32) {
                                    t(iO1);
                                    throw null;
                                }
                                throw e("Invalid UTF-8 start byte 0x" + Integer.toHexString(iO1));
                            }
                            Q(iO1, "string value");
                            i10 = i13;
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = j0Var.finishCurrentSegment();
                        } else {
                            i12 = currentSegmentSize;
                        }
                        currentSegmentSize = i12 + 1;
                        bufferWithoutReset[i12] = (char) iO1;
                    }
                }
            }
        }
        this.f90513v = i10;
        this.f55597u0 = 45;
        j0Var.setCurrentLength(currentSegmentSize);
        z zVar3 = z.NOT_AVAILABLE;
        this.f90528g = zVar3;
        return zVar3;
    }

    public final z D0(int i10) {
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.f90515x -= 3;
                        return W0(iQ1);
                    }
                } else if (iQ1 != 191) {
                    n(Integer.valueOf(iQ1), "Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM");
                    throw null;
                }
            } else if (iQ1 != 187) {
                n(Integer.valueOf(iQ1), "Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM");
                throw null;
            }
            i10++;
        }
        this.f55591o0 = i10;
        this.f55597u0 = 1;
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    public final z E0(int i10, boolean z10) {
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            if (iQ1 < 32) {
                if (iQ1 == 10) {
                    this.f90516y++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 == 13) {
                    this.f55602z0++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 != 9) {
                    t(iQ1);
                    throw null;
                }
            } else if (iQ1 == 42) {
                z10 = true;
            } else if (iQ1 == 47 && z10) {
                return V0(i10);
            }
            z10 = false;
        }
        this.f55597u0 = z10 ? 52 : 53;
        this.f55591o0 = i10;
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    @Override // wb.b
    public final char F() {
        m0.throwInternal();
        return ' ';
    }

    public final z F0(int i10) {
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            if (iQ1 < 32) {
                if (iQ1 == 10) {
                    this.f90516y++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 == 13) {
                    this.f55602z0++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 != 9) {
                    t(iQ1);
                    throw null;
                }
                return V0(i10);
            }
        }
        this.f55597u0 = 54;
        this.f55591o0 = i10;
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    public final z G0() throws IOException {
        while (this.f90513v < this.f90514w) {
            char cP1 = (char) p1();
            boolean zIsJavaIdentifierPart = Character.isJavaIdentifierPart(cP1);
            j0 j0Var = this.F;
            if (zIsJavaIdentifierPart) {
                j0Var.append(cP1);
                if (j0Var.size() < this.f90511t.errorReportConfiguration().getMaxErrorTokenLength()) {
                }
            }
            j0Var.contentsAsString();
            throw e("Unrecognized token '" + j0Var.contentsAsString() + "': was expecting " + R());
        }
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    public final z H0(int i10, boolean z10) throws IOException {
        j0 j0Var = this.F;
        if (z10) {
            this.f55597u0 = 32;
            if (i10 == 45 || i10 == 43) {
                j0Var.append((char) i10);
                if (this.f90513v >= this.f90514w) {
                    this.f55597u0 = 32;
                    this.W = 0;
                    return z.NOT_AVAILABLE;
                }
                i10 = p1();
            }
        }
        char[] bufferWithoutReset = j0Var.getBufferWithoutReset();
        int currentSegmentSize = j0Var.getCurrentSegmentSize();
        int i11 = this.W;
        while (i10 >= 48 && i10 <= 57) {
            i11++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = j0Var.expandCurrentSegment();
            }
            int i12 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) i10;
            if (this.f90513v >= this.f90514w) {
                j0Var.setCurrentLength(i12);
                this.W = i11;
                return z.NOT_AVAILABLE;
            }
            i10 = p1();
            currentSegmentSize = i12;
        }
        int i13 = i10 & 255;
        if (i11 == 0) {
            s(i13, "Exponent indicator not followed by a digit");
            throw null;
        }
        this.f90513v--;
        j0Var.setCurrentLength(currentSegmentSize);
        this.W = i11;
        z zVar = z.VALUE_NUMBER_FLOAT;
        p0(zVar);
        return zVar;
    }

    public final z I0(int i10) {
        if ((this.f88362b & J0) == 0) {
            r(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
            throw null;
        }
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            if (iQ1 < 32) {
                if (iQ1 == 10) {
                    this.f90516y++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 == 13) {
                    this.f55602z0++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 != 9) {
                    t(iQ1);
                    throw null;
                }
                return V0(i10);
            }
        }
        this.f55597u0 = 55;
        this.f55591o0 = i10;
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        r3.f55597u0 = 50;
        r3.F.resetWithCopy(r4, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return G0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z J0(java.lang.String r4, int r5, ub.z r6) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r4.length()
        L4:
            int r1 = r3.f90513v
            int r2 = r3.f90514w
            if (r1 < r2) goto L11
            r3.f55591o0 = r5
            ub.z r4 = ub.z.NOT_AVAILABLE
            r3.f90528g = r4
            return r4
        L11:
            byte r1 = r3.o1(r1)
            if (r5 != r0) goto L25
            r0 = 48
            if (r1 < r0) goto L21
            r0 = r1 | 32
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L2b
        L21:
            r3.p0(r6)
            return r6
        L25:
            char r2 = r4.charAt(r5)
            if (r1 == r2) goto L3a
        L2b:
            r6 = 50
            r3.f55597u0 = r6
            ic.j0 r6 = r3.F
            r0 = 0
            r6.resetWithCopy(r4, r0, r5)
            ub.z r4 = r3.G0()
            return r4
        L3a:
            int r5 = r5 + 1
            int r1 = r3.f90513v
            int r1 = r1 + 1
            r3.f90513v = r1
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.d.J0(java.lang.String, int, ub.z):ub.z");
    }

    public final void K0(String str, int i10, z zVar) throws IOException {
        if (i10 == str.length()) {
            u(zVar);
            return;
        }
        j0 j0Var = this.F;
        j0Var.resetWithCopy(str, 0, i10);
        j0Var.contentsAsString();
        throw e("Unrecognized token '" + j0Var.contentsAsString() + "': was expecting " + R());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r4.f55597u0 = 50;
        r4.F.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        return G0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z L0(int r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String[] r0 = fc.c.A0
            r0 = r0[r5]
            int r1 = r0.length()
        L8:
            int r2 = r4.f90513v
            int r3 = r4.f90514w
            if (r2 < r3) goto L1b
            r4.f55600x0 = r5
            r4.f55591o0 = r6
            r5 = 19
            r4.f55597u0 = r5
            ub.z r5 = ub.z.NOT_AVAILABLE
            r4.f90528g = r5
            return r5
        L1b:
            byte r2 = r4.o1(r2)
            if (r6 != r1) goto L30
            r1 = 48
            if (r2 < r1) goto L2b
            r1 = r2 | 32
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L36
        L2b:
            ub.z r5 = r4.r0(r5)
            return r5
        L30:
            char r3 = r0.charAt(r6)
            if (r2 == r3) goto L45
        L36:
            r5 = 50
            r4.f55597u0 = r5
            ic.j0 r5 = r4.F
            r1 = 0
            r5.resetWithCopy(r0, r1, r6)
            ub.z r5 = r4.G0()
            return r5
        L45:
            int r6 = r6 + 1
            int r2 = r4.f90513v
            int r2 = r2 + 1
            r4.f90513v = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.d.L0(int, int):ub.z");
    }

    public final z M0(int i10, char[] cArr) {
        j0 j0Var;
        int i11 = this.T ? -1 : 0;
        while (true) {
            int i12 = this.f90513v;
            int i13 = this.f90514w;
            j0Var = this.F;
            if (i12 >= i13) {
                this.f55597u0 = 26;
                j0Var.setCurrentLength(i10);
                z zVar = z.NOT_AVAILABLE;
                this.f90528g = zVar;
                return zVar;
            }
            int iO1 = o1(i12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iO1 < 48) {
                if (iO1 == 46) {
                    this.U = i11 + i10;
                    this.f90513v++;
                    return a1(i10, cArr, iO1);
                }
            } else if (iO1 <= 57) {
                this.f90513v++;
                if (i10 >= cArr.length) {
                    cArr = j0Var.expandCurrentSegment();
                }
                cArr[i10] = (char) iO1;
                i10++;
            } else if ((iO1 | 32) == 101) {
                this.U = i11 + i10;
                this.f90513v++;
                return a1(i10, cArr, iO1);
            }
        }
        this.U = i11 + i10;
        j0Var.setCurrentLength(i10);
        z zVar2 = z.VALUE_NUMBER_INT;
        p0(zVar2);
        return zVar2;
    }

    public final z N0(boolean z10) {
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            j0 j0Var = this.F;
            if (iQ1 < 48) {
                if (iQ1 == 46) {
                    char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment[0] = z10 ? '-' : '+';
                    cArrEmptyAndGetCurrentSegment[1] = '0';
                    this.U = 1;
                    return a1(2, cArrEmptyAndGetCurrentSegment, iQ1);
                }
            } else if (iQ1 > 57) {
                int i10 = iQ1 | 32;
                if (i10 == 101) {
                    char[] cArrEmptyAndGetCurrentSegment2 = j0Var.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment2[0] = z10 ? '-' : '+';
                    cArrEmptyAndGetCurrentSegment2[1] = '0';
                    this.U = 1;
                    return a1(2, cArrEmptyAndGetCurrentSegment2, iQ1);
                }
                if (i10 != 125) {
                    s(iQ1, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                    throw null;
                }
            } else {
                if ((this.f88362b & E0) == 0) {
                    w();
                    throw null;
                }
                if (iQ1 != 48) {
                    char[] cArrEmptyAndGetCurrentSegment3 = j0Var.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment3[0] = z10 ? '-' : '+';
                    cArrEmptyAndGetCurrentSegment3[1] = (char) iQ1;
                    this.U = 1;
                    return M0(2, cArrEmptyAndGetCurrentSegment3);
                }
            }
            this.f90513v--;
            return q0();
        }
        this.f55597u0 = z10 ? 25 : 24;
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    public final z O0() {
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            j0 j0Var = this.F;
            if (iQ1 < 48) {
                if (iQ1 == 46) {
                    char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment[0] = '0';
                    this.U = 1;
                    return a1(1, cArrEmptyAndGetCurrentSegment, iQ1);
                }
            } else if (iQ1 > 57) {
                int i10 = iQ1 | 32;
                if (i10 == 101) {
                    char[] cArrEmptyAndGetCurrentSegment2 = j0Var.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment2[0] = '0';
                    this.U = 1;
                    return a1(1, cArrEmptyAndGetCurrentSegment2, iQ1);
                }
                if (i10 != 125) {
                    s(iQ1, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                    throw null;
                }
            } else {
                if ((this.f88362b & E0) == 0) {
                    w();
                    throw null;
                }
                if (iQ1 != 48) {
                    char[] cArrEmptyAndGetCurrentSegment3 = j0Var.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment3[0] = (char) iQ1;
                    this.U = 1;
                    return M0(1, cArrEmptyAndGetCurrentSegment3);
                }
            }
            this.f90513v--;
            return q0();
        }
        this.f55597u0 = 24;
        z zVar = z.NOT_AVAILABLE;
        this.f90528g = zVar;
        return zVar;
    }

    public final z P0(int i10, boolean z10) {
        String str = yFkbx.hIlDvYjDTy;
        if (i10 > 48) {
            if (i10 > 57) {
                if (i10 == 73) {
                    return L0(z10 ? 3 : 2, 2);
                }
                s(i10, z10 ? str : "expected digit (0-9) for valid numeric value");
                throw null;
            }
            if (!z10 && !isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                throw null;
            }
            char[] cArrEmptyAndGetCurrentSegment = this.F.emptyAndGetCurrentSegment();
            cArrEmptyAndGetCurrentSegment[0] = z10 ? '-' : '+';
            cArrEmptyAndGetCurrentSegment[1] = (char) i10;
            this.U = 1;
            return M0(2, cArrEmptyAndGetCurrentSegment);
        }
        if (i10 == 48) {
            if (z10) {
                return N0(true);
            }
            if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                return N0(false);
            }
            s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
            throw null;
        }
        if (i10 != 46 || !isEnabled(f.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            s(i10, z10 ? str : "expected digit (0-9) for valid numeric value");
            throw null;
        }
        if (z10) {
            this.f90513v--;
            return N0(true);
        }
        if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            this.f90513v--;
            return N0(false);
        }
        s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        throw null;
    }

    public final z Q0() throws IOException {
        j0 j0Var = this.F;
        char[] bufferWithoutReset = j0Var.getBufferWithoutReset();
        int currentSegmentSize = j0Var.getCurrentSegmentSize();
        int i10 = this.f90513v;
        int i11 = this.f90514w - 5;
        while (i10 < this.f90514w) {
            int i12 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = j0Var.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int iMin = Math.min(this.f90514w, j.addOverflowSafe(i10, bufferWithoutReset.length - currentSegmentSize));
            while (true) {
                if (i10 < iMin) {
                    int i13 = i10 + 1;
                    int iO1 = o1(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int[] iArr = K0;
                    int i14 = iArr[iO1];
                    if (i14 == 0) {
                        bufferWithoutReset[currentSegmentSize] = (char) iO1;
                        currentSegmentSize++;
                        i10 = i13;
                    } else {
                        if (iO1 == 34) {
                            this.f90513v = i13;
                            j0Var.setCurrentLength(currentSegmentSize);
                            z zVar = z.VALUE_STRING;
                            p0(zVar);
                            return zVar;
                        }
                        if (i13 >= i11) {
                            this.f90513v = i13;
                            j0Var.setCurrentLength(currentSegmentSize);
                            if (!u0(iO1, iArr[iO1], i13 < this.f90514w)) {
                                this.f55598v0 = 40;
                                z zVar2 = z.NOT_AVAILABLE;
                                this.f90528g = zVar2;
                                return zVar2;
                            }
                            bufferWithoutReset = j0Var.getBufferWithoutReset();
                            currentSegmentSize = j0Var.getCurrentSegmentSize();
                            i10 = this.f90513v;
                        } else {
                            if (i14 == 1) {
                                this.f90513v = i13;
                                iO1 = s0();
                                i10 = this.f90513v;
                            } else if (i14 == 2) {
                                i10 += 2;
                                iO1 = x0(iO1, o1(i13));
                            } else if (i14 == 3) {
                                int i15 = i10 + 2;
                                i10 += 3;
                                iO1 = y0(iO1, o1(i13), o1(i15));
                            } else if (i14 == 4) {
                                byte bO1 = o1(i13);
                                int i16 = i10 + 3;
                                byte bO12 = o1(i10 + 2);
                                i10 += 4;
                                int iZ0 = z0(iO1, bO1, bO12, o1(i16));
                                int i17 = currentSegmentSize + 1;
                                bufferWithoutReset[currentSegmentSize] = (char) ((iZ0 >> 10) | 55296);
                                if (i17 >= bufferWithoutReset.length) {
                                    bufferWithoutReset = j0Var.finishCurrentSegment();
                                    currentSegmentSize = 0;
                                } else {
                                    currentSegmentSize = i17;
                                }
                                iO1 = (iZ0 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | Utf8.LOG_SURROGATE_HEADER;
                            } else {
                                if (iO1 >= 32) {
                                    if (iO1 < 32) {
                                        t(iO1);
                                        throw null;
                                    }
                                    throw e("Invalid UTF-8 start byte 0x" + Integer.toHexString(iO1));
                                }
                                Q(iO1, "string value");
                                i10 = i13;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = j0Var.finishCurrentSegment();
                            } else {
                                i12 = currentSegmentSize;
                            }
                            currentSegmentSize = i12 + 1;
                            bufferWithoutReset[i12] = (char) iO1;
                        }
                    }
                }
            }
        }
        this.f90513v = i10;
        this.f55597u0 = 40;
        j0Var.setCurrentLength(currentSegmentSize);
        z zVar3 = z.NOT_AVAILABLE;
        this.f90528g = zVar3;
        return zVar3;
    }

    public final z R0(int i10, int i11, int i12) throws xb.b, q {
        int[] iArrK = this.f55588l0;
        int[] inputCodeUtf8JsNames = cc.d.getInputCodeUtf8JsNames();
        while (true) {
            int i13 = this.f90513v;
            if (i13 >= this.f90514w) {
                this.f55589m0 = i10;
                this.f55591o0 = i11;
                this.f55592p0 = i12;
                this.f55597u0 = 10;
                z zVar = z.NOT_AVAILABLE;
                this.f90528g = zVar;
                return zVar;
            }
            int iO1 = o1(i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (inputCodeUtf8JsNames[iO1] != 0) {
                if (i12 > 0) {
                    if (i10 >= iArrK.length) {
                        iArrK = K(iArrK.length, iArrK);
                        this.f55588l0 = iArrK;
                    }
                    iArrK[i10] = i11;
                    i10++;
                }
                String strFindName = this.f55587k0.findName(iArrK, i10);
                if (strFindName == null) {
                    strFindName = b0(i10, i12, iArrK);
                }
                return f0(strFindName);
            }
            this.f90513v++;
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | iO1;
            } else {
                if (i10 >= iArrK.length) {
                    iArrK = K(iArrK.length, iArrK);
                    this.f55588l0 = iArrK;
                }
                iArrK[i10] = i11;
                i10++;
                i11 = iO1;
                i12 = 1;
            }
        }
    }

    public final z S0(int i10) {
        if (i10 != 35) {
            if (i10 != 39) {
                if (i10 == 47) {
                    return g1(4);
                }
                if (i10 == 93) {
                    return c0();
                }
            } else if ((this.f88362b & G0) != 0) {
                return B0(0, 0, 0);
            }
        } else if ((this.f88362b & J0) != 0) {
            return I0(4);
        }
        if ((this.f88362b & H0) == 0) {
            r((char) i10, "was expecting double-quote to start field name");
            throw null;
        }
        if (cc.d.getInputCodeUtf8JsNames()[i10] == 0) {
            return R0(0, i10, 1);
        }
        r(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        throw null;
    }

    public final z T0(int i10, int i11, int i12) throws xb.b, q {
        int i13;
        int[] iArrK = this.f55588l0;
        while (this.f90513v < this.f90514w) {
            int iQ1 = q1();
            if (L0[iQ1] == 0) {
                if (i12 < 4) {
                    i12++;
                    i11 = (i11 << 8) | iQ1;
                } else {
                    if (i10 >= iArrK.length) {
                        int[] iArrK2 = K(iArrK.length, iArrK);
                        this.f55588l0 = iArrK2;
                        iArrK = iArrK2;
                    }
                    i13 = i10 + 1;
                    iArrK[i10] = i11;
                    i10 = i13;
                    i11 = iQ1;
                    i12 = 1;
                }
            } else {
                if (iQ1 == 34) {
                    if (i12 > 0) {
                        if (i10 >= iArrK.length) {
                            iArrK = K(iArrK.length, iArrK);
                            this.f55588l0 = iArrK;
                        }
                        iArrK[i10] = c.j0(i11, i12);
                        i10++;
                    } else if (i10 == 0) {
                        return f0("");
                    }
                    String strFindName = this.f55587k0.findName(iArrK, i10);
                    if (strFindName == null) {
                        strFindName = b0(i10, i12, iArrK);
                    }
                    return f0(strFindName);
                }
                int i14 = 0;
                if (iQ1 != 92) {
                    Q(iQ1, "name");
                } else {
                    iQ1 = this.f90514w - this.f90513v < 5 ? t0(0, -1) : s0();
                    if (iQ1 < 0) {
                        this.f55597u0 = 8;
                        this.f55598v0 = 7;
                        this.f55589m0 = i10;
                        this.f55591o0 = i11;
                        this.f55592p0 = i12;
                        z zVar = z.NOT_AVAILABLE;
                        this.f90528g = zVar;
                        return zVar;
                    }
                }
                if (i10 >= iArrK.length) {
                    iArrK = K(iArrK.length, iArrK);
                    this.f55588l0 = iArrK;
                }
                if (iQ1 > 127) {
                    if (i12 >= 4) {
                        iArrK[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (iQ1 < 2048) {
                        i11 = (i11 << 8) | (iQ1 >> 6) | PsExtractor.AUDIO_STREAM;
                        i12++;
                    } else {
                        int i15 = (i11 << 8) | (iQ1 >> 12) | 224;
                        int i16 = i12 + 1;
                        if (i16 >= 4) {
                            iArrK[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((iQ1 >> 6) & 63) | 128;
                        i12 = i16 + 1;
                    }
                    iQ1 = (iQ1 & 63) | 128;
                }
                if (i12 < 4) {
                    i12++;
                    i11 = (i11 << 8) | iQ1;
                } else {
                    i13 = i10 + 1;
                    iArrK[i10] = i11;
                    i10 = i13;
                    i11 = iQ1;
                    i12 = 1;
                }
            }
        }
        this.f55589m0 = i10;
        this.f55591o0 = i11;
        this.f55592p0 = i12;
        this.f55597u0 = 7;
        z zVar2 = z.NOT_AVAILABLE;
        this.f90528g = zVar2;
        return zVar2;
    }

    public final int U0(int i10) {
        do {
            if (i10 != 32) {
                if (i10 == 10) {
                    this.f90516y++;
                    this.f90517z = this.f90513v;
                } else if (i10 == 13) {
                    this.f55602z0++;
                    this.f90517z = this.f90513v;
                } else if (i10 != 9 && !a0(i10)) {
                    t(i10);
                    throw null;
                }
            }
            if (this.f90513v >= this.f90514w) {
                this.f90528g = z.NOT_AVAILABLE;
                return 0;
            }
            i10 = q1();
        } while (i10 <= 32);
        return i10;
    }

    public final z V0(int i10) {
        if (this.f90513v >= this.f90514w) {
            this.f55597u0 = i10;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iQ1 = q1();
        if (i10 == 4) {
            return Y0(iQ1);
        }
        if (i10 == 5) {
            return Z0(iQ1);
        }
        switch (i10) {
            case 12:
                return k1(iQ1);
            case 13:
                return n1(iQ1);
            case 14:
                return m1(iQ1);
            case 15:
                return l1(iQ1);
            default:
                m0.throwInternal();
                return null;
        }
    }

    public final z W0(int i10) throws IOException {
        int iQ1 = i10 & 255;
        if (iQ1 == 239 && this.f55597u0 != 1) {
            return D0(1);
        }
        while (iQ1 <= 32) {
            if (iQ1 != 32) {
                if (iQ1 == 10) {
                    this.f90516y++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 == 13) {
                    this.f55602z0++;
                    this.f90517z = this.f90513v;
                } else if (iQ1 != 9) {
                    t(iQ1);
                    throw null;
                }
            }
            if (this.f90513v >= this.f90514w) {
                this.f55597u0 = 3;
                if (this.f90512u) {
                    return null;
                }
                if (!this.f55599w0) {
                    return z.NOT_AVAILABLE;
                }
                e0();
                return null;
            }
            iQ1 = q1();
        }
        return k1(iQ1);
    }

    public final z X0() {
        int iO1;
        int i10 = this.f90513v;
        int i11 = i10 + 4;
        if (i11 < this.f90514w) {
            int i12 = i10 + 1;
            if (o1(i10) == 97) {
                int i13 = i10 + 2;
                if (o1(i12) == 108) {
                    int i14 = i10 + 3;
                    if (o1(i13) == 115 && o1(i14) == 101 && ((iO1 = o1(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || (iO1 | 32) == 125)) {
                        this.f90513v = i11;
                        z zVar = z.VALUE_FALSE;
                        p0(zVar);
                        return zVar;
                    }
                }
            }
        }
        this.f55597u0 = 18;
        return J0("false", 1, z.VALUE_FALSE);
    }

    public final z Y0(int i10) {
        String strA0;
        if (i10 > 32 || (i10 = U0(i10)) > 0) {
            o0();
            return i10 != 34 ? i10 == 125 ? d0() : S0(i10) : (this.f90513v + 13 > this.f90514w || (strA0 = A0()) == null) ? T0(0, 0, 0) : f0(strA0);
        }
        this.f55597u0 = 4;
        return this.f90528g;
    }

    public final z Z0(int i10) {
        String strA0;
        if (i10 <= 32 && (i10 = U0(i10)) <= 0) {
            this.f55597u0 = 5;
            return this.f90528g;
        }
        if (i10 != 44) {
            if (i10 == 125) {
                return d0();
            }
            if (i10 == 35) {
                return I0(5);
            }
            if (i10 == 47) {
                return g1(5);
            }
            r(i10, "was expecting comma to separate " + this.D.typeDesc() + " entries");
            throw null;
        }
        int i11 = this.f90513v;
        if (i11 >= this.f90514w) {
            this.f55597u0 = 4;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iO1 = o1(i11);
        this.f90513v = i11 + 1;
        if (iO1 > 32 || (iO1 = U0(iO1)) > 0) {
            o0();
            return iO1 != 34 ? (iO1 != 125 || (this.f88362b & D0) == 0) ? S0(iO1) : d0() : (this.f90513v + 13 > this.f90514w || (strA0 = A0()) == null) ? T0(0, 0, 0) : f0(strA0);
        }
        this.f55597u0 = 4;
        return this.f90528g;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00de -> B:42:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z a1(int r9, char[] r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.d.a1(int, char[], int):ub.z");
    }

    public final z b1() {
        this.T = true;
        if (this.f90513v >= this.f90514w) {
            this.f55597u0 = 23;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iQ1 = q1();
        if (iQ1 <= 48) {
            if (iQ1 == 48) {
                return N0(true);
            }
            s(iQ1, "expected digit (0-9) to follow minus sign, for valid numeric value");
            throw null;
        }
        int i10 = 2;
        if (iQ1 > 57) {
            if (iQ1 == 73) {
                return L0(3, 2);
            }
            s(iQ1, "expected digit (0-9) to follow minus sign, for valid numeric value");
            throw null;
        }
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        cArrEmptyAndGetCurrentSegment[1] = (char) iQ1;
        int i11 = this.f90513v;
        if (i11 >= this.f90514w) {
            this.f55597u0 = 26;
            j0Var.setCurrentLength(2);
            this.U = 1;
            z zVar2 = z.NOT_AVAILABLE;
            this.f90528g = zVar2;
            return zVar2;
        }
        int iO1 = o1(i11);
        while (true) {
            if (iO1 < 48) {
                if (iO1 == 46) {
                    this.U = i10 - 1;
                    this.f90513v++;
                    return a1(i10, cArrEmptyAndGetCurrentSegment, iO1);
                }
            } else if (iO1 <= 57) {
                if (i10 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = j0Var.expandCurrentSegment();
                }
                int i12 = i10 + 1;
                cArrEmptyAndGetCurrentSegment[i10] = (char) iO1;
                int i13 = this.f90513v + 1;
                this.f90513v = i13;
                if (i13 >= this.f90514w) {
                    this.f55597u0 = 26;
                    j0Var.setCurrentLength(i12);
                    z zVar3 = z.NOT_AVAILABLE;
                    this.f90528g = zVar3;
                    return zVar3;
                }
                iO1 = o1(i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i10 = i12;
            } else if ((iO1 | 32) == 101) {
                this.U = i10 - 1;
                this.f90513v++;
                return a1(i10, cArrEmptyAndGetCurrentSegment, iO1);
            }
        }
        this.U = i10 - 1;
        j0Var.setCurrentLength(i10);
        z zVar4 = z.VALUE_NUMBER_INT;
        p0(zVar4);
        return zVar4;
    }

    public final z c1() {
        int iO1;
        int i10 = this.f90513v;
        int i11 = i10 + 3;
        if (i11 < this.f90514w) {
            int i12 = i10 + 1;
            if (o1(i10) == 117) {
                int i13 = i10 + 2;
                if (o1(i12) == 108 && o1(i13) == 108 && ((iO1 = o1(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || (iO1 | 32) == 125)) {
                    this.f90513v = i11;
                    z zVar = z.VALUE_NULL;
                    p0(zVar);
                    return zVar;
                }
            }
        }
        this.f55597u0 = 16;
        return J0(AbstractJsonLexerKt.NULL, 1, z.VALUE_NULL);
    }

    public final z d1() {
        int i10 = this.f90513v;
        if (i10 >= this.f90514w) {
            this.f55597u0 = 24;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int i11 = i10 + 1;
        int iO1 = o1(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        j0 j0Var = this.F;
        if (iO1 < 48) {
            if (iO1 == 46) {
                this.f90513v = i11;
                this.U = 1;
                char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
                cArrEmptyAndGetCurrentSegment[0] = '0';
                return a1(1, cArrEmptyAndGetCurrentSegment, iO1);
            }
        } else {
            if (iO1 <= 57) {
                return O0();
            }
            int i12 = iO1 | 32;
            if (i12 == 101) {
                this.f90513v = i11;
                this.U = 1;
                char[] cArrEmptyAndGetCurrentSegment2 = j0Var.emptyAndGetCurrentSegment();
                cArrEmptyAndGetCurrentSegment2[0] = '0';
                return a1(1, cArrEmptyAndGetCurrentSegment2, iO1);
            }
            if (i12 != 125) {
                s(iO1, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                throw null;
            }
        }
        return q0();
    }

    public final z e1() {
        this.T = false;
        if (this.f90513v >= this.f90514w) {
            this.f55597u0 = 22;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iQ1 = q1();
        if (iQ1 <= 48) {
            if (iQ1 != 48) {
                s(iQ1, "expected digit (0-9) to follow plus sign, for valid numeric value");
                throw null;
            }
            if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                return N0(false);
            }
            s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
            throw null;
        }
        int i10 = 2;
        if (iQ1 > 57) {
            if (iQ1 == 73) {
                return L0(2, 2);
            }
            s(iQ1, "expected digit (0-9) to follow plus sign, for valid numeric value");
            throw null;
        }
        if (!isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
            throw null;
        }
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '+';
        cArrEmptyAndGetCurrentSegment[1] = (char) iQ1;
        int i11 = this.f90513v;
        if (i11 >= this.f90514w) {
            this.f55597u0 = 26;
            j0Var.setCurrentLength(2);
            this.U = 1;
            z zVar2 = z.NOT_AVAILABLE;
            this.f90528g = zVar2;
            return zVar2;
        }
        int iO1 = o1(i11);
        while (true) {
            if (iO1 < 48) {
                if (iO1 == 46) {
                    this.U = i10 - 1;
                    this.f90513v++;
                    return a1(i10, cArrEmptyAndGetCurrentSegment, iO1);
                }
            } else if (iO1 <= 57) {
                if (i10 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = j0Var.expandCurrentSegment();
                }
                int i12 = i10 + 1;
                cArrEmptyAndGetCurrentSegment[i10] = (char) iO1;
                int i13 = this.f90513v + 1;
                this.f90513v = i13;
                if (i13 >= this.f90514w) {
                    this.f55597u0 = 26;
                    j0Var.setCurrentLength(i12);
                    z zVar3 = z.NOT_AVAILABLE;
                    this.f90528g = zVar3;
                    return zVar3;
                }
                iO1 = o1(i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i10 = i12;
            } else if ((iO1 | 32) == 101) {
                this.U = i10 - 1;
                this.f90513v++;
                return a1(i10, cArrEmptyAndGetCurrentSegment, iO1);
            }
        }
        this.U = i10 - 1;
        j0Var.setCurrentLength(i10);
        z zVar4 = z.VALUE_NUMBER_INT;
        p0(zVar4);
        return zVar4;
    }

    public void endOfInput() {
        this.f55599w0 = true;
    }

    public final z f1(int i10) {
        this.T = false;
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = (char) i10;
        int i11 = this.f90513v;
        if (i11 >= this.f90514w) {
            this.f55597u0 = 26;
            j0Var.setCurrentLength(1);
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iO1 = o1(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = 1;
        while (true) {
            if (iO1 < 48) {
                if (iO1 == 46) {
                    this.U = i12;
                    this.f90513v++;
                    return a1(i12, cArrEmptyAndGetCurrentSegment, iO1);
                }
            } else if (iO1 <= 57) {
                if (i12 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = j0Var.expandCurrentSegment();
                }
                int i13 = i12 + 1;
                cArrEmptyAndGetCurrentSegment[i12] = (char) iO1;
                int i14 = this.f90513v + 1;
                this.f90513v = i14;
                if (i14 >= this.f90514w) {
                    this.f55597u0 = 26;
                    j0Var.setCurrentLength(i13);
                    z zVar2 = z.NOT_AVAILABLE;
                    this.f90528g = zVar2;
                    return zVar2;
                }
                iO1 = o1(i14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i12 = i13;
            } else if ((iO1 | 32) == 101) {
                this.U = i12;
                this.f90513v++;
                return a1(i12, cArrEmptyAndGetCurrentSegment, iO1);
            }
        }
        this.U = i12;
        j0Var.setCurrentLength(i12);
        z zVar3 = z.VALUE_NUMBER_INT;
        p0(zVar3);
        return zVar3;
    }

    public final z g1(int i10) {
        if ((this.f88362b & I0) == 0) {
            r(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (this.f90513v >= this.f90514w) {
            this.f55591o0 = i10;
            this.f55597u0 = 51;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        byte bP1 = p1();
        if (bP1 == 42) {
            return E0(i10, false);
        }
        if (bP1 == 47) {
            return F0(i10);
        }
        r(bP1 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, "was expecting either '*' or '/' for a comment");
        throw null;
    }

    public final z h1() {
        int i10 = this.f90513v;
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int iMin = Math.min(this.f90514w, cArrEmptyAndGetCurrentSegment.length + i10);
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            int iO1 = o1(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (K0[iO1] == 0) {
                i10++;
                cArrEmptyAndGetCurrentSegment[i11] = (char) iO1;
                i11++;
            } else if (iO1 == 34) {
                this.f90513v = i10 + 1;
                j0Var.setCurrentLength(i11);
                z zVar = z.VALUE_STRING;
                p0(zVar);
                return zVar;
            }
        }
        j0Var.setCurrentLength(i11);
        this.f90513v = i10;
        return Q0();
    }

    public final z i1() {
        int iO1;
        int i10 = this.f90513v;
        int i11 = i10 + 3;
        if (i11 < this.f90514w) {
            int i12 = i10 + 1;
            if (o1(i10) == 114) {
                int i13 = i10 + 2;
                if (o1(i12) == 117 && o1(i13) == 101 && ((iO1 = o1(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || (iO1 | 32) == 125)) {
                    this.f90513v = i11;
                    z zVar = z.VALUE_TRUE;
                    p0(zVar);
                    return zVar;
                }
            }
        }
        this.f55597u0 = 17;
        return J0("true", 1, z.VALUE_TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z j1(int r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 39
            if (r9 == r2) goto L51
            r2 = 73
            if (r9 == r2) goto L4c
            r2 = 78
            if (r9 == r2) goto L47
            r0 = 93
            if (r9 == r0) goto L25
            r0 = 125(0x7d, float:1.75E-43)
            if (r9 == r0) goto L98
            r0 = 43
            if (r9 == r0) goto L1f
            r0 = 44
            if (r9 != r0) goto L98
            goto L2d
        L1f:
            r9 = 2
            ub.z r9 = r8.L0(r9, r1)
            return r9
        L25:
            ec.e r0 = r8.D
            boolean r0 = r0.inArray()
            if (r0 == 0) goto L98
        L2d:
            ec.e r0 = r8.D
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto L98
            int r0 = r8.f88362b
            int r2 = fc.d.F0
            r0 = r0 & r2
            if (r0 == 0) goto L98
            int r9 = r8.f90513v
            int r9 = r9 - r1
            r8.f90513v = r9
            ub.z r9 = ub.z.VALUE_NULL
            r8.p0(r9)
            return r9
        L47:
            ub.z r9 = r8.L0(r0, r1)
            return r9
        L4c:
            ub.z r9 = r8.L0(r1, r1)
            return r9
        L51:
            int r3 = r8.f88362b
            int r4 = fc.d.G0
            r3 = r3 & r4
            if (r3 == 0) goto L98
            int r9 = r8.f90513v
            ic.j0 r3 = r8.F
            char[] r4 = r3.emptyAndGetCurrentSegment()
            int r5 = r8.f90514w
            int r6 = r4.length
            int r6 = r6 + r9
            int r5 = java.lang.Math.min(r5, r6)
        L68:
            if (r9 >= r5) goto L8e
            byte r6 = r8.o1(r9)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != r2) goto L7e
            int r9 = r9 + r1
            r8.f90513v = r9
            r3.setCurrentLength(r0)
            ub.z r9 = ub.z.VALUE_STRING
            r8.p0(r9)
            return r9
        L7e:
            int[] r7 = fc.d.K0
            r7 = r7[r6]
            if (r7 == 0) goto L85
            goto L8e
        L85:
            int r9 = r9 + 1
            int r7 = r0 + 1
            char r6 = (char) r6
            r4[r0] = r6
            r0 = r7
            goto L68
        L8e:
            r3.setCurrentLength(r0)
            r8.f90513v = r9
            ub.z r9 = r8.C0()
            return r9
        L98:
            java.lang.String r0 = r8.R()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r8.r(r9, r0)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.d.j1(int):ub.z");
    }

    public final z k1(int i10) {
        if (i10 <= 32 && (i10 = U0(i10)) <= 0) {
            this.f55597u0 = 12;
            return this.f90528g;
        }
        o0();
        this.D.expectComma();
        if (i10 == 34) {
            return h1();
        }
        if (i10 == 35) {
            return I0(12);
        }
        if (i10 == 43) {
            return e1();
        }
        if (i10 == 91) {
            return m0();
        }
        if (i10 == 93) {
            return c0();
        }
        if (i10 == 102) {
            return X0();
        }
        if (i10 == 110) {
            return c1();
        }
        if (i10 == 116) {
            return i1();
        }
        if (i10 == 123) {
            return n0();
        }
        if (i10 == 125) {
            return d0();
        }
        switch (i10) {
            case 45:
                return b1();
            case 46:
                if (isEnabled(f.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                    this.T = false;
                    this.U = 0;
                    return a1(0, this.F.emptyAndGetCurrentSegment(), 46);
                }
                break;
            case 47:
                return g1(12);
            case 48:
                return d1();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return f1(i10);
        }
        return j1(i10);
    }

    public final z l1(int i10) {
        if (i10 <= 32 && (i10 = U0(i10)) <= 0) {
            this.f55597u0 = 15;
            return this.f90528g;
        }
        o0();
        if (i10 == 34) {
            return h1();
        }
        if (i10 == 35) {
            return I0(15);
        }
        if (i10 == 43) {
            return e1();
        }
        if (i10 == 45) {
            return b1();
        }
        if (i10 == 91) {
            return m0();
        }
        int i11 = D0;
        if (i10 != 93) {
            if (i10 == 102) {
                return X0();
            }
            if (i10 == 110) {
                return c1();
            }
            if (i10 == 116) {
                return i1();
            }
            if (i10 == 123) {
                return n0();
            }
            if (i10 != 125) {
                switch (i10) {
                    case 47:
                        return g1(15);
                    case 48:
                        return d1();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return f1(i10);
                }
            }
            if ((this.f88362b & i11) != 0) {
                return d0();
            }
        } else if ((this.f88362b & i11) != 0) {
            return c0();
        }
        return j1(i10);
    }

    public final z m1(int i10) {
        if (i10 <= 32 && (i10 = U0(i10)) <= 0) {
            this.f55597u0 = 14;
            return this.f90528g;
        }
        if (i10 != 58) {
            if (i10 == 47) {
                return g1(14);
            }
            if (i10 == 35) {
                return I0(14);
            }
            r(i10, "was expecting a colon to separate field name and value");
            throw null;
        }
        int i11 = this.f90513v;
        if (i11 >= this.f90514w) {
            this.f55597u0 = 12;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iO1 = o1(i11);
        this.f90513v = i11 + 1;
        if (iO1 <= 32 && (iO1 = U0(iO1)) <= 0) {
            this.f55597u0 = 12;
            return this.f90528g;
        }
        o0();
        if (iO1 == 34) {
            return h1();
        }
        if (iO1 == 35) {
            return I0(12);
        }
        if (iO1 == 43) {
            return e1();
        }
        if (iO1 == 45) {
            return b1();
        }
        if (iO1 == 91) {
            return m0();
        }
        if (iO1 == 102) {
            return X0();
        }
        if (iO1 == 110) {
            return c1();
        }
        if (iO1 == 116) {
            return i1();
        }
        if (iO1 == 123) {
            return n0();
        }
        switch (iO1) {
            case 47:
                return g1(12);
            case 48:
                return d1();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return f1(iO1);
            default:
                return j1(iO1);
        }
    }

    public final z n1(int i10) {
        if (i10 <= 32 && (i10 = U0(i10)) <= 0) {
            this.f55597u0 = 13;
            return this.f90528g;
        }
        if (i10 != 44) {
            if (i10 == 93) {
                return c0();
            }
            if (i10 == 125) {
                return d0();
            }
            if (i10 == 47) {
                return g1(13);
            }
            if (i10 == 35) {
                return I0(13);
            }
            r(i10, "was expecting comma to separate " + this.D.typeDesc() + " entries");
            throw null;
        }
        this.D.expectComma();
        int i11 = this.f90513v;
        if (i11 >= this.f90514w) {
            this.f55597u0 = 15;
            z zVar = z.NOT_AVAILABLE;
            this.f90528g = zVar;
            return zVar;
        }
        int iO1 = o1(i11);
        this.f90513v = i11 + 1;
        if (iO1 <= 32 && (iO1 = U0(iO1)) <= 0) {
            this.f55597u0 = 15;
            return this.f90528g;
        }
        o0();
        if (iO1 == 34) {
            return h1();
        }
        if (iO1 == 35) {
            return I0(15);
        }
        if (iO1 == 43) {
            return e1();
        }
        if (iO1 == 45) {
            return b1();
        }
        if (iO1 == 91) {
            return m0();
        }
        int i12 = D0;
        if (iO1 != 93) {
            if (iO1 == 102) {
                return X0();
            }
            if (iO1 == 110) {
                return c1();
            }
            if (iO1 == 116) {
                return i1();
            }
            if (iO1 == 123) {
                return n0();
            }
            if (iO1 != 125) {
                switch (iO1) {
                    case 47:
                        return g1(15);
                    case 48:
                        return d1();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return f1(iO1);
                }
            }
            if ((i12 & this.f88362b) != 0) {
                return d0();
            }
        } else if ((i12 & this.f88362b) != 0) {
            return c0();
        }
        return j1(iO1);
    }

    public final boolean needMoreInput() {
        return this.f90513v >= this.f90514w && !this.f55599w0;
    }

    @Override // wb.c, ub.u
    public z nextToken() throws IOException {
        int i10;
        int i11;
        int i12 = this.f90513v;
        int i13 = this.f90514w;
        j0 j0Var = this.F;
        int i14 = 0;
        if (i12 >= i13) {
            if (this.f90512u) {
                return null;
            }
            if (!this.f55599w0) {
                return z.NOT_AVAILABLE;
            }
            z zVar = this.f90528g;
            z zVar2 = z.NOT_AVAILABLE;
            if (zVar != zVar2) {
                e0();
                return null;
            }
            int i15 = this.f55597u0;
            if (i15 == 3) {
                e0();
                return null;
            }
            if (i15 == 12) {
                e0();
                return null;
            }
            if (i15 == 50) {
                j0Var.contentsAsString();
                throw e("Unrecognized token '" + j0Var.contentsAsString() + "': was expecting " + R());
            }
            switch (i15) {
                case 16:
                    int i16 = this.f55591o0;
                    z zVar3 = z.VALUE_NULL;
                    K0(AbstractJsonLexerKt.NULL, i16, zVar3);
                    return zVar3;
                case 17:
                    int i17 = this.f55591o0;
                    z zVar4 = z.VALUE_TRUE;
                    K0("true", i17, zVar4);
                    return zVar4;
                case 18:
                    int i18 = this.f55591o0;
                    z zVar5 = z.VALUE_FALSE;
                    K0("false", i18, zVar5);
                    return zVar5;
                case 19:
                    int i19 = this.f55600x0;
                    int i20 = this.f55591o0;
                    String str = c.A0[i19];
                    if (i20 == str.length()) {
                        return r0(i19);
                    }
                    j0Var.resetWithCopy(str, 0, i20);
                    j0Var.contentsAsString();
                    throw e("Unrecognized token '" + j0Var.contentsAsString() + "': was expecting " + R());
                default:
                    switch (i15) {
                        case 24:
                        case 25:
                            return q0();
                        case 26:
                            int currentSegmentSize = j0Var.getCurrentSegmentSize();
                            if (this.T) {
                                currentSegmentSize--;
                            }
                            this.U = currentSegmentSize;
                            z zVar6 = z.VALUE_NUMBER_INT;
                            p0(zVar6);
                            return zVar6;
                        default:
                            switch (i15) {
                                case 30:
                                    this.W = 0;
                                    break;
                                case 31:
                                    p(": was expecting fraction after exponent marker", z.VALUE_NUMBER_FLOAT);
                                    throw null;
                                case 32:
                                    break;
                                default:
                                    switch (i15) {
                                        case 52:
                                        case 53:
                                            p(": was expecting closing '*/' for comment", zVar2);
                                            throw null;
                                        case 54:
                                        case 55:
                                            e0();
                                            return null;
                                        default:
                                            p(a.b.f(this.f55597u0, ")", new StringBuilder(": was expecting rest of token (internal state: ")), this.f90528g);
                                            throw null;
                                    }
                            }
                            z zVar7 = z.VALUE_NUMBER_FLOAT;
                            p0(zVar7);
                            return zVar7;
                    }
            }
        }
        z zVar8 = this.f90528g;
        z zVar9 = z.NOT_AVAILABLE;
        if (zVar8 != zVar9) {
            this.K = 0;
            this.A = this.f90515x + (i12 - this.f55601y0);
            this.J = null;
            int iQ1 = q1();
            switch (this.f55595s0) {
                case 0:
                    return W0(iQ1);
                case 1:
                    return k1(iQ1);
                case 2:
                    return Y0(iQ1);
                case 3:
                    return Z0(iQ1);
                case 4:
                    return m1(iQ1);
                case 5:
                    return k1(iQ1);
                case 6:
                    return n1(iQ1);
                default:
                    m0.throwInternal();
                    return null;
            }
        }
        int i21 = this.f55597u0;
        int i22 = 1;
        if (i21 == 1) {
            return D0(this.f55591o0);
        }
        if (i21 == 4) {
            return Y0(q1());
        }
        if (i21 == 5) {
            return Z0(q1());
        }
        switch (i21) {
            case 7:
                return T0(this.f55589m0, this.f55591o0, this.f55592p0);
            case 8:
                int iT0 = t0(this.f55593q0, this.f55594r0);
                if (iT0 < 0) {
                    this.f55597u0 = 8;
                    return zVar9;
                }
                int i23 = this.f55589m0;
                int[] iArr = this.f55588l0;
                if (i23 >= iArr.length) {
                    this.f55588l0 = K(32, iArr);
                }
                int i24 = this.f55591o0;
                int i25 = this.f55592p0;
                if (iT0 > 127) {
                    if (i25 >= 4) {
                        int[] iArr2 = this.f55588l0;
                        int i26 = this.f55589m0;
                        this.f55589m0 = i26 + 1;
                        iArr2[i26] = i24;
                        i24 = 0;
                        i25 = 0;
                    }
                    if (iT0 < 2048) {
                        i10 = i24 << 8;
                        i11 = (iT0 >> 6) | PsExtractor.AUDIO_STREAM;
                    } else {
                        int i27 = (i24 << 8) | (iT0 >> 12) | 224;
                        i25++;
                        if (i25 >= 4) {
                            int[] iArr3 = this.f55588l0;
                            int i28 = this.f55589m0;
                            this.f55589m0 = i28 + 1;
                            iArr3[i28] = i27;
                            i25 = 0;
                        } else {
                            i14 = i27;
                        }
                        i10 = i14 << 8;
                        i11 = ((iT0 >> 6) & 63) | 128;
                    }
                    i24 = i10 | i11;
                    i25++;
                    iT0 = (iT0 & 63) | 128;
                }
                if (i25 < 4) {
                    i22 = 1 + i25;
                    iT0 |= i24 << 8;
                } else {
                    int[] iArr4 = this.f55588l0;
                    int i29 = this.f55589m0;
                    this.f55589m0 = i29 + 1;
                    iArr4[i29] = i24;
                }
                return this.f55598v0 == 9 ? B0(this.f55589m0, iT0, i22) : T0(this.f55589m0, iT0, i22);
            case 9:
                return B0(this.f55589m0, this.f55591o0, this.f55592p0);
            case 10:
                return R0(this.f55589m0, this.f55591o0, this.f55592p0);
            default:
                switch (i21) {
                    case 12:
                        return k1(q1());
                    case 13:
                        return n1(q1());
                    case 14:
                        return m1(q1());
                    case 15:
                        return l1(q1());
                    case 16:
                        return J0(AbstractJsonLexerKt.NULL, this.f55591o0, z.VALUE_NULL);
                    case 17:
                        return J0("true", this.f55591o0, z.VALUE_TRUE);
                    case 18:
                        return J0("false", this.f55591o0, z.VALUE_FALSE);
                    case 19:
                        return L0(this.f55600x0, this.f55591o0);
                    default:
                        switch (i21) {
                            case 22:
                                return P0(q1(), false);
                            case 23:
                                return P0(q1(), true);
                            case 24:
                                return O0();
                            case 25:
                                return N0(true);
                            case 26:
                                return M0(j0Var.getCurrentSegmentSize(), j0Var.getBufferWithoutReset());
                            default:
                                switch (i21) {
                                    case 30:
                                        int i30 = this.V;
                                        char[] bufferWithoutReset = j0Var.getBufferWithoutReset();
                                        int currentSegmentSize2 = j0Var.getCurrentSegmentSize();
                                        byte bP1 = p1();
                                        boolean z10 = true;
                                        while (z10) {
                                            if (bP1 >= 48 && bP1 <= 57) {
                                                i30++;
                                                if (currentSegmentSize2 >= bufferWithoutReset.length) {
                                                    bufferWithoutReset = j0Var.expandCurrentSegment();
                                                }
                                                int i31 = currentSegmentSize2 + 1;
                                                bufferWithoutReset[currentSegmentSize2] = (char) bP1;
                                                if (this.f90513v >= this.f90514w) {
                                                    j0Var.setCurrentLength(i31);
                                                    this.V = i30;
                                                    return z.NOT_AVAILABLE;
                                                }
                                                bP1 = p1();
                                                currentSegmentSize2 = i31;
                                            } else {
                                                if ((bP1 | 34) == 102) {
                                                    s(bP1, "JSON does not support parsing numbers that have 'f' or 'd' suffixes");
                                                    throw null;
                                                }
                                                if (bP1 == 46) {
                                                    s(bP1, "Cannot parse number with more than one decimal point");
                                                    throw null;
                                                }
                                                z10 = false;
                                            }
                                        }
                                        if (i30 == 0 && !isEnabled(f.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                                            s(bP1, "Decimal point not followed by a digit");
                                            throw null;
                                        }
                                        this.V = i30;
                                        j0Var.setCurrentLength(currentSegmentSize2);
                                        if ((bP1 | 32) != 101) {
                                            this.f90513v--;
                                            j0Var.setCurrentLength(currentSegmentSize2);
                                            this.W = 0;
                                            z zVar10 = z.VALUE_NUMBER_FLOAT;
                                            p0(zVar10);
                                            return zVar10;
                                        }
                                        j0Var.append((char) bP1);
                                        this.W = 0;
                                        if (this.f90513v >= this.f90514w) {
                                            this.f55597u0 = 31;
                                            return z.NOT_AVAILABLE;
                                        }
                                        this.f55597u0 = 32;
                                        return H0(q1(), true);
                                    case 31:
                                        return H0(q1(), true);
                                    case 32:
                                        return H0(q1(), false);
                                    default:
                                        switch (i21) {
                                            case 40:
                                                return Q0();
                                            case 41:
                                                int iT02 = t0(this.f55593q0, this.f55594r0);
                                                if (iT02 >= 0) {
                                                    j0Var.append((char) iT02);
                                                    return this.f55598v0 == 45 ? C0() : Q0();
                                                }
                                                return zVar9;
                                            case 42:
                                                j0Var.append((char) x0(this.f55591o0, p1()));
                                                return this.f55598v0 == 45 ? C0() : Q0();
                                            case 43:
                                                if (v0(this.f55591o0, this.f55592p0, p1())) {
                                                    return this.f55598v0 == 45 ? C0() : Q0();
                                                }
                                                return zVar9;
                                            case 44:
                                                if (w0(this.f55591o0, this.f55592p0, p1())) {
                                                    return this.f55598v0 == 45 ? C0() : Q0();
                                                }
                                                return zVar9;
                                            case 45:
                                                return C0();
                                            default:
                                                switch (i21) {
                                                    case 50:
                                                        return G0();
                                                    case 51:
                                                        return g1(this.f55591o0);
                                                    case 52:
                                                        return E0(this.f55591o0, true);
                                                    case 53:
                                                        return E0(this.f55591o0, false);
                                                    case 54:
                                                        return F0(this.f55591o0);
                                                    case 55:
                                                        return I0(this.f55591o0);
                                                    default:
                                                        m0.throwInternal();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public abstract byte o1(int i10);

    public abstract byte p1();

    public abstract int q1();

    public final int s0() {
        int iCharToHex;
        byte bP1 = p1();
        if (bP1 == 34 || bP1 == 47 || bP1 == 92) {
            return (char) bP1;
        }
        if (bP1 == 98) {
            return 8;
        }
        if (bP1 == 102) {
            return 12;
        }
        if (bP1 == 110) {
            return 10;
        }
        if (bP1 == 114) {
            return 13;
        }
        if (bP1 == 116) {
            return 9;
        }
        if (bP1 != 117) {
            char c10 = (char) bP1;
            L(c10);
            return c10;
        }
        byte bP12 = p1();
        int iCharToHex2 = cc.d.charToHex(bP12);
        if (iCharToHex2 >= 0 && (iCharToHex = cc.d.charToHex((bP12 = p1()))) >= 0) {
            int i10 = (iCharToHex2 << 4) | iCharToHex;
            byte bP13 = p1();
            int iCharToHex3 = cc.d.charToHex(bP13);
            if (iCharToHex3 >= 0) {
                int i11 = (i10 << 4) | iCharToHex3;
                bP13 = p1();
                int iCharToHex4 = cc.d.charToHex(bP13);
                if (iCharToHex4 >= 0) {
                    return (i11 << 4) | iCharToHex4;
                }
            }
            bP12 = bP13;
        }
        r(bP12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, "expected a hex-digit for character escape sequence");
        throw null;
    }

    public final int t0(int i10, int i11) {
        if (this.f90513v >= this.f90514w) {
            this.f55593q0 = i10;
            this.f55594r0 = i11;
            return -1;
        }
        byte bP1 = p1();
        if (i11 == -1) {
            if (bP1 == 34 || bP1 == 47 || bP1 == 92) {
                return bP1;
            }
            if (bP1 == 98) {
                return 8;
            }
            if (bP1 == 102) {
                return 12;
            }
            if (bP1 == 110) {
                return 10;
            }
            if (bP1 == 114) {
                return 13;
            }
            if (bP1 == 116) {
                return 9;
            }
            if (bP1 != 117) {
                char c10 = (char) bP1;
                L(c10);
                return c10;
            }
            if (this.f90513v >= this.f90514w) {
                this.f55594r0 = 0;
                this.f55593q0 = 0;
                return -1;
            }
            bP1 = p1();
            i11 = 0;
        }
        int iQ1 = bP1 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        while (true) {
            int iCharToHex = cc.d.charToHex(iQ1);
            if (iCharToHex < 0) {
                r(iQ1 & 255, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i10 = (i10 << 4) | iCharToHex;
            i11++;
            if (i11 == 4) {
                return i10;
            }
            if (this.f90513v >= this.f90514w) {
                this.f55594r0 = i11;
                this.f55593q0 = i10;
                return -1;
            }
            iQ1 = q1();
        }
    }

    public final boolean u0(int i10, int i11, boolean z10) throws IOException {
        j0 j0Var = this.F;
        if (i11 == 1) {
            int iT0 = t0(0, -1);
            if (iT0 < 0) {
                this.f55597u0 = 41;
                return false;
            }
            j0Var.append((char) iT0);
            return true;
        }
        if (i11 == 2) {
            if (z10) {
                j0Var.append((char) x0(i10, p1()));
                return true;
            }
            this.f55597u0 = 42;
            this.f55591o0 = i10;
            return false;
        }
        if (i11 == 3) {
            int i12 = i10 & 15;
            if (z10) {
                return v0(i12, 1, p1());
            }
            this.f55597u0 = 43;
            this.f55591o0 = i12;
            this.f55592p0 = 1;
            return false;
        }
        if (i11 == 4) {
            int i13 = i10 & 7;
            if (z10) {
                return w0(i13, 1, p1());
            }
            this.f55591o0 = i13;
            this.f55592p0 = 1;
            this.f55597u0 = 44;
            return false;
        }
        if (i10 < 32) {
            Q(i10, "string value");
            j0Var.append((char) i10);
            return true;
        }
        if (i10 < 32) {
            t(i10);
            throw null;
        }
        throw e("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public final boolean v0(int i10, int i11, int i12) throws IOException {
        if (i11 == 1) {
            if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
                k0(i12 & 255, this.f90513v);
                throw null;
            }
            i10 = (i10 << 6) | (i12 & 63);
            if (this.f90513v >= this.f90514w) {
                this.f55597u0 = 43;
                this.f55591o0 = i10;
                this.f55592p0 = 2;
                return false;
            }
            i12 = p1();
        }
        if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
            k0(i12 & 255, this.f90513v);
            throw null;
        }
        this.F.append((char) ((i10 << 6) | (i12 & 63)));
        return true;
    }

    public final boolean w0(int i10, int i11, int i12) throws IOException {
        if (i11 == 1) {
            if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
                k0(i12 & 255, this.f90513v);
                throw null;
            }
            i10 = (i10 << 6) | (i12 & 63);
            if (this.f90513v >= this.f90514w) {
                this.f55597u0 = 44;
                this.f55591o0 = i10;
                this.f55592p0 = 2;
                return false;
            }
            i12 = p1();
            i11 = 2;
        }
        if (i11 == 2) {
            if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
                k0(i12 & 255, this.f90513v);
                throw null;
            }
            i10 = (i10 << 6) | (i12 & 63);
            if (this.f90513v >= this.f90514w) {
                this.f55597u0 = 44;
                this.f55591o0 = i10;
                this.f55592p0 = 3;
                return false;
            }
            i12 = p1();
        }
        if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
            k0(i12 & 255, this.f90513v);
            throw null;
        }
        int i13 = ((i10 << 6) | (i12 & 63)) - C.DEFAULT_BUFFER_SEGMENT_SIZE;
        j0 j0Var = this.F;
        j0Var.append((char) ((i13 >> 10) | 55296));
        j0Var.append((char) ((i13 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | Utf8.LOG_SURROGATE_HEADER));
        return true;
    }

    public final int x0(int i10, int i11) throws q {
        if ((i11 & PsExtractor.AUDIO_STREAM) == 128) {
            return ((i10 & 31) << 6) | (i11 & 63);
        }
        k0(i11 & 255, this.f90513v);
        throw null;
    }

    public final int y0(int i10, int i11, int i12) throws q {
        int i13 = i10 & 15;
        if ((i11 & PsExtractor.AUDIO_STREAM) != 128) {
            k0(i11 & 255, this.f90513v);
            throw null;
        }
        int i14 = (i13 << 6) | (i11 & 63);
        if ((i12 & PsExtractor.AUDIO_STREAM) == 128) {
            return (i14 << 6) | (i12 & 63);
        }
        k0(i12 & 255, this.f90513v);
        throw null;
    }

    public final int z0(int i10, int i11, int i12, int i13) throws q {
        if ((i11 & PsExtractor.AUDIO_STREAM) != 128) {
            k0(i11 & 255, this.f90513v);
            throw null;
        }
        int i14 = ((i10 & 7) << 6) | (i11 & 63);
        if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
            k0(i12 & 255, this.f90513v);
            throw null;
        }
        int i15 = (i14 << 6) | (i12 & 63);
        if ((i13 & PsExtractor.AUDIO_STREAM) == 128) {
            return ((i15 << 6) | (i13 & 63)) - C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        k0(i13 & 255, this.f90513v);
        throw null;
    }
}
