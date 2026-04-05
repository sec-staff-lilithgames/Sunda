package ec;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import ic.j0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.a0;
import ub.p;
import ub.q;
import ub.r;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m extends d {

    /* renamed from: k0, reason: collision with root package name */
    public final gc.b f54078k0;

    /* renamed from: l0, reason: collision with root package name */
    public int[] f54079l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f54080m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f54081n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f54082o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f54083p0;

    /* renamed from: q0, reason: collision with root package name */
    public InputStream f54084q0;

    /* renamed from: r0, reason: collision with root package name */
    public byte[] f54085r0;

    /* renamed from: s0, reason: collision with root package name */
    public final boolean f54086s0;

    @Deprecated
    public m(cc.h hVar, int i10, InputStream inputStream, a0 a0Var, gc.b bVar, byte[] bArr, int i11, int i12, boolean z10) {
        this(hVar, i10, inputStream, a0Var, bVar, bArr, i11, i12, 0, z10);
    }

    public static final int y0(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    public final z A0(boolean z10) {
        if (!isEnabled(f.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return o0(46);
        }
        char[] cArrEmptyAndGetCurrentSegment = this.F.emptyAndGetCurrentSegment();
        int i10 = 0;
        if (z10) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i10 = 1;
        }
        return z0(cArrEmptyAndGetCurrentSegment, i10, 46, z10, 0);
    }

    @Override // wb.b
    public final void B() throws IOException {
        if (this.f54084q0 != null) {
            if (this.f90511t.isResourceManaged() || isEnabled(r.AUTO_CLOSE_SOURCE)) {
                this.f54084q0.close();
            }
            this.f54084q0 = null;
        }
    }

    public final String B0(int i10) throws Throwable {
        int i11 = i10;
        Throwable th2 = null;
        int[] iArr = d.f54030i0;
        int i12 = 0;
        if (i11 != 34) {
            gc.b bVar = this.f54078k0;
            if (i11 == 39 && (this.f88362b & d.f54026e0) != 0) {
                if (this.f90513v >= this.f90514w && !p0()) {
                    p(": was expecting closing ''' for field name", z.FIELD_NAME);
                    throw null;
                }
                byte[] bArr = this.f54085r0;
                int i13 = this.f90513v;
                this.f90513v = i13 + 1;
                int iF = bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iF == 39) {
                    return "";
                }
                int[] iArrK = this.f54079l0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (iF != 39) {
                    if (iArr[iF] != 0 && iF != 34) {
                        if (iF != 92) {
                            Q(iF, "name");
                        } else {
                            iF = F();
                        }
                        if (iF > 127) {
                            if (i14 >= 4) {
                                if (i15 >= iArrK.length) {
                                    iArrK = K(iArrK.length, iArrK);
                                    this.f54079l0 = iArrK;
                                }
                                iArrK[i15] = i16;
                                i16 = 0;
                                i15++;
                                i14 = 0;
                            }
                            if (iF < 2048) {
                                i16 = (i16 << 8) | (iF >> 6) | PsExtractor.AUDIO_STREAM;
                                i14++;
                            } else {
                                int i17 = (i16 << 8) | (iF >> 12) | 224;
                                int i18 = i14 + 1;
                                if (i18 >= 4) {
                                    if (i15 >= iArrK.length) {
                                        iArrK = K(iArrK.length, iArrK);
                                        this.f54079l0 = iArrK;
                                    }
                                    iArrK[i15] = i17;
                                    i17 = 0;
                                    i15++;
                                    i18 = 0;
                                }
                                i16 = (i17 << 8) | ((iF >> 6) & 63) | 128;
                                i14 = i18 + 1;
                            }
                            iF = (iF & 63) | 128;
                        }
                    }
                    if (i14 < 4) {
                        i14++;
                        iF |= i16 << 8;
                    } else {
                        if (i15 >= iArrK.length) {
                            iArrK = K(iArrK.length, iArrK);
                            this.f54079l0 = iArrK;
                        }
                        iArrK[i15] = i16;
                        i15++;
                        i14 = 1;
                    }
                    i16 = iF;
                    if (this.f90513v >= this.f90514w && !p0()) {
                        p(" in field name", z.FIELD_NAME);
                        throw th2;
                    }
                    byte[] bArr2 = this.f54085r0;
                    int i19 = this.f90513v;
                    this.f90513v = i19 + 1;
                    iF = bArr2[i19] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    th2 = th2;
                }
                if (i14 > 0) {
                    if (i15 >= iArrK.length) {
                        iArrK = K(iArrK.length, iArrK);
                        this.f54079l0 = iArrK;
                    }
                    iArrK[i15] = y0(i16, i14);
                    i15++;
                }
                String strFindName = bVar.findName(iArrK, i15);
                return strFindName == null ? b1(i15, i14, iArrK) : strFindName;
            }
            if ((this.f88362b & d.f54027f0) == 0) {
                r((char) f0(i10), "was expecting double-quote to start field name");
                throw null;
            }
            int[] inputCodeUtf8JsNames = cc.d.getInputCodeUtf8JsNames();
            if (inputCodeUtf8JsNames[i11] != 0) {
                r(i11, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                throw null;
            }
            int i20 = 0;
            int[] iArrK2 = this.f54079l0;
            int i21 = 0;
            while (true) {
                if (i12 < 4) {
                    i12++;
                    i11 |= i20 << 8;
                } else {
                    if (i21 >= iArrK2.length) {
                        iArrK2 = K(iArrK2.length, iArrK2);
                        this.f54079l0 = iArrK2;
                    }
                    iArrK2[i21] = i20;
                    i21++;
                    i12 = 1;
                }
                i20 = i11;
                if (this.f90513v >= this.f90514w && !p0()) {
                    p(" in field name", z.FIELD_NAME);
                    throw null;
                }
                byte[] bArr3 = this.f54085r0;
                int i22 = this.f90513v;
                i11 = bArr3[i22] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (inputCodeUtf8JsNames[i11] != 0) {
                    if (i12 > 0) {
                        if (i21 >= iArrK2.length) {
                            iArrK2 = K(iArrK2.length, iArrK2);
                            this.f54079l0 = iArrK2;
                        }
                        iArrK2[i21] = i20;
                        i21++;
                    }
                    String strFindName2 = bVar.findName(iArrK2, i21);
                    return strFindName2 == null ? b1(i21, i12, iArrK2) : strFindName2;
                }
                this.f90513v = i22 + 1;
            }
        } else {
            int i23 = this.f90513v;
            int i24 = i23 + 13;
            int i25 = this.f90514w;
            if (i24 > i25) {
                if (i23 >= i25 && !p0()) {
                    p(": was expecting closing '\"' for name", z.FIELD_NAME);
                    throw null;
                }
                byte[] bArr4 = this.f54085r0;
                int i26 = this.f90513v;
                this.f90513v = i26 + 1;
                int i27 = bArr4[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                return i27 == 34 ? "" : h1(this.f54079l0, 0, 0, i27, 0);
            }
            byte[] bArr5 = this.f54085r0;
            int i28 = i23 + 1;
            this.f90513v = i28;
            int i29 = bArr5[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i29] != 0) {
                return i29 == 34 ? "" : h1(this.f54079l0, 0, 0, i29, 0);
            }
            int i30 = i23 + 2;
            this.f90513v = i30;
            int i31 = bArr5[i28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i31] != 0) {
                return i31 == 34 ? c1(i29, 1) : h1(this.f54079l0, 0, i29, i31, 1);
            }
            int i32 = i31 | (i29 << 8);
            int i33 = i23 + 3;
            this.f90513v = i33;
            int i34 = bArr5[i30] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i34] != 0) {
                return i34 == 34 ? c1(i32, 2) : h1(this.f54079l0, 0, i32, i34, 2);
            }
            int i35 = (i32 << 8) | i34;
            int i36 = i23 + 4;
            this.f90513v = i36;
            int i37 = bArr5[i33] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i37] != 0) {
                return i37 == 34 ? c1(i35, 3) : h1(this.f54079l0, 0, i35, i37, 3);
            }
            int i38 = (i35 << 8) | i37;
            int i39 = i23 + 5;
            this.f90513v = i39;
            int i40 = bArr5[i36] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i40] != 0) {
                return i40 == 34 ? c1(i38, 4) : h1(this.f54079l0, 0, i38, i40, 4);
            }
            int i41 = i23 + 6;
            this.f90513v = i41;
            int i42 = bArr5[i39] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i42] != 0) {
                if (i42 == 34) {
                    return d1(i38, i40, 1);
                }
                int[] iArr2 = this.f54079l0;
                iArr2[0] = i38;
                return h1(iArr2, 1, i40, i42, 1);
            }
            int i43 = (i40 << 8) | i42;
            int i44 = i23 + 7;
            this.f90513v = i44;
            int i45 = bArr5[i41] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i45] != 0) {
                if (i45 == 34) {
                    return d1(i38, i43, 2);
                }
                int[] iArr3 = this.f54079l0;
                iArr3[0] = i38;
                return h1(iArr3, 1, i43, i45, 2);
            }
            int i46 = (i43 << 8) | i45;
            int i47 = i23 + 8;
            this.f90513v = i47;
            int i48 = bArr5[i44] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i48] != 0) {
                if (i48 == 34) {
                    return d1(i38, i46, 3);
                }
                int[] iArr4 = this.f54079l0;
                iArr4[0] = i38;
                return h1(iArr4, 1, i46, i48, 3);
            }
            int i49 = (i46 << 8) | i48;
            int i50 = i23 + 9;
            this.f90513v = i50;
            int i51 = bArr5[i47] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i51] != 0) {
                if (i51 == 34) {
                    return d1(i38, i49, 4);
                }
                int[] iArr5 = this.f54079l0;
                iArr5[0] = i38;
                return h1(iArr5, 1, i49, i51, 4);
            }
            int i52 = i23 + 10;
            this.f90513v = i52;
            int i53 = bArr5[i50] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i53] != 0) {
                return i53 == 34 ? e1(i38, i49, i51, 1) : i1(i38, i49, i51, i53, 1);
            }
            int i54 = (i51 << 8) | i53;
            int i55 = i23 + 11;
            this.f90513v = i55;
            int i56 = bArr5[i52] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i56] != 0) {
                return i56 == 34 ? e1(i38, i49, i54, 2) : i1(i38, i49, i54, i56, 2);
            }
            int i57 = (i54 << 8) | i56;
            int i58 = i23 + 12;
            this.f90513v = i58;
            int i59 = bArr5[i55] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i59] != 0) {
                return i59 == 34 ? e1(i38, i49, i57, 3) : i1(i38, i49, i57, i59, 3);
            }
            int i60 = (i57 << 8) | i59;
            this.f90513v = i24;
            int i61 = bArr5[i58] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iArr[i61] != 0) {
                return i61 == 34 ? e1(i38, i49, i60, 4) : i1(i38, i49, i60, i61, 4);
            }
            int[] iArr6 = this.f54079l0;
            iArr6[0] = i38;
            iArr6[1] = i49;
            iArr6[2] = i60;
            int i62 = 3;
            while (true) {
                int i63 = i61;
                int i64 = this.f90513v;
                int i65 = i64 + 4;
                if (i65 > this.f90514w) {
                    return h1(this.f54079l0, i62, 0, i63, 0);
                }
                int i66 = i64 + 1;
                this.f90513v = i66;
                int i67 = bArr5[i64] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iArr[i67] != 0) {
                    return i67 == 34 ? f1(this.f54079l0, i62, i63, 1) : h1(this.f54079l0, i62, i63, i67, 1);
                }
                int i68 = (i63 << 8) | i67;
                int i69 = i64 + 2;
                this.f90513v = i69;
                int i70 = bArr5[i66] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iArr[i70] != 0) {
                    return i70 == 34 ? f1(this.f54079l0, i62, i68, 2) : h1(this.f54079l0, i62, i68, i70, 2);
                }
                int i71 = (i68 << 8) | i70;
                int i72 = i64 + 3;
                this.f90513v = i72;
                int i73 = bArr5[i69] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iArr[i73] != 0) {
                    return i73 == 34 ? f1(this.f54079l0, i62, i71, 3) : h1(this.f54079l0, i62, i71, i73, 3);
                }
                int i74 = (i71 << 8) | i73;
                this.f90513v = i65;
                i61 = bArr5[i72] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (iArr[i61] != 0) {
                    return i61 == 34 ? f1(this.f54079l0, i62, i74, 4) : h1(this.f54079l0, i62, i74, i61, 4);
                }
                int[] iArr7 = this.f54079l0;
                if (i62 >= iArr7.length) {
                    this.f54079l0 = K(i62, iArr7);
                }
                this.f54079l0[i62] = i74;
                i62++;
            }
        }
    }

    public final z C0(char[] cArr, int i10, int i11, boolean z10) throws IOException {
        j0 j0Var;
        int i12;
        int i13;
        char[] cArrFinishCurrentSegment = cArr;
        int i14 = i10;
        int i15 = i11;
        while (true) {
            int i16 = this.f90513v;
            int i17 = this.f90514w;
            j0Var = this.F;
            if (i16 >= i17 && !p0()) {
                j0Var.setCurrentLength(i14);
                return Z(i15, z10);
            }
            byte[] bArr = this.f54085r0;
            i12 = this.f90513v;
            this.f90513v = i12 + 1;
            i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i13 > 57 || i13 < 48) {
                break;
            }
            if (i14 >= cArrFinishCurrentSegment.length) {
                i14 = 0;
                cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
            }
            cArrFinishCurrentSegment[i14] = (char) i13;
            i15++;
            i14++;
        }
        if (i13 == 46 || (i13 | 32) == 101) {
            return z0(cArrFinishCurrentSegment, i14, i13, z10, i15);
        }
        this.f90513v = i12;
        j0Var.setCurrentLength(i14);
        if (this.D.inRoot()) {
            a1(this.f54085r0[this.f90513v] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return Z(i15, z10);
    }

    public final z D0(boolean z10) {
        int i10;
        int i11;
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int i12 = 1;
        int i13 = 0;
        if (z10) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i13 = 1;
        }
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i14 = this.f90513v;
        this.f90513v = i14 + 1;
        int iZ0 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (iZ0 <= 48) {
            if (iZ0 != 48) {
                return iZ0 == 46 ? A0(z10) : n0(iZ0, z10, true);
            }
            iZ0 = Z0();
        } else if (iZ0 > 57) {
            return n0(iZ0, z10, true);
        }
        int i15 = i13 + 1;
        cArrEmptyAndGetCurrentSegment[i13] = (char) iZ0;
        int iMin = Math.min(this.f90514w, (this.f90513v + cArrEmptyAndGetCurrentSegment.length) - i15);
        while (true) {
            i10 = this.f90513v;
            if (i10 >= iMin) {
                return C0(cArrEmptyAndGetCurrentSegment, i15, i12, z10);
            }
            byte[] bArr2 = this.f54085r0;
            this.f90513v = i10 + 1;
            i11 = bArr2[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 < 48 || i11 > 57) {
                break;
            }
            i12++;
            cArrEmptyAndGetCurrentSegment[i15] = (char) i11;
            i15++;
        }
        if (i11 == 46 || (i11 | 32) == 101) {
            return z0(cArrEmptyAndGetCurrentSegment, i15, i11, z10, i12);
        }
        this.f90513v = i10;
        j0Var.setCurrentLength(i15);
        if (this.D.inRoot()) {
            a1(i11);
        }
        return Z(i12, z10);
    }

    public final z E0(int i10) {
        int i11;
        int i12;
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        if (i10 == 48) {
            i10 = Z0();
        }
        cArrEmptyAndGetCurrentSegment[0] = (char) i10;
        int i13 = 1;
        int iMin = Math.min(this.f90514w, (this.f90513v + cArrEmptyAndGetCurrentSegment.length) - 1);
        int i14 = 1;
        while (true) {
            i11 = this.f90513v;
            if (i11 >= iMin) {
                return C0(cArrEmptyAndGetCurrentSegment, i13, i14, false);
            }
            byte[] bArr = this.f54085r0;
            this.f90513v = i11 + 1;
            i12 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 < 48 || i12 > 57) {
                break;
            }
            i14++;
            cArrEmptyAndGetCurrentSegment[i13] = (char) i12;
            i13++;
        }
        if (i12 == 46 || (i12 | 32) == 101) {
            return z0(cArrEmptyAndGetCurrentSegment, i13, i12, false, i14);
        }
        this.f90513v = i11;
        j0Var.setCurrentLength(i13);
        if (this.D.inRoot()) {
            a1(i12);
        }
        return Z(i14, false);
    }

    @Override // wb.b
    public final char F() {
        if (this.f90513v >= this.f90514w && !p0()) {
            p(" in character escape sequence", z.VALUE_STRING);
            throw null;
        }
        byte[] bArr = this.f54085r0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            char cF0 = (char) f0(b10);
            L(cF0);
            return cF0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.f90513v >= this.f90514w && !p0()) {
                p(" in character escape sequence", z.VALUE_STRING);
                throw null;
            }
            byte[] bArr2 = this.f54085r0;
            int i13 = this.f90513v;
            this.f90513v = i13 + 1;
            byte b11 = bArr2[i13];
            int iCharToHex = cc.d.charToHex(b11);
            if (iCharToHex < 0) {
                r(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i11 = (i11 << 4) | iCharToHex;
        }
        return (char) i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
    
        r17.f54080m0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
    
        if (r7 <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
    
        r8 = r8 + r7;
        r19.write(r20, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F0(ub.b r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.F0(ub.b, java.io.OutputStream, byte[]):int");
    }

    public final void G0(int i10) throws q {
        if (i10 < 32) {
            t(i10);
            throw null;
        }
        H0(i10);
        throw null;
    }

    public final void H0(int i10) throws q {
        throw e("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public final void I0(int i10, int i11) throws q {
        this.f90513v = i11;
        J0(i10);
        throw null;
    }

    public final void J0(int i10) throws q {
        throw e("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public final void K0(String str, String str2) throws q {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.f90513v >= this.f90514w && !p0()) {
                break;
            }
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            this.f90513v = i10 + 1;
            char cF0 = (char) f0(bArr[i10]);
            if (!Character.isJavaIdentifierPart(cF0)) {
                break;
            }
            sb2.append(cF0);
            if (sb2.length() >= this.f90511t.errorReportConfiguration().getMaxErrorTokenLength()) {
                sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                break;
            }
        }
        throw e("Unrecognized token '" + ((Object) sb2) + "': was expecting " + str2);
    }

    public final void L0() {
        if (this.f90513v < this.f90514w || p0()) {
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            if (bArr[i10] == 10) {
                this.f90513v = i10 + 1;
            }
        }
        this.f90516y++;
        this.f90517z = this.f90513v;
    }

    public final int M0() {
        int i10 = this.f90513v;
        if (i10 + 4 >= this.f90514w) {
            return N0(false);
        }
        byte[] bArr = this.f54085r0;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i11 = i10 + 1;
            this.f90513v = i11;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (b11 == 47 || b11 == 35) {
                    return N0(true);
                }
                this.f90513v = i10 + 2;
                return b11;
            }
            if (b11 == 32 || b11 == 9) {
                int i12 = i10 + 2;
                this.f90513v = i12;
                byte b12 = bArr[i12];
                if (b12 > 32) {
                    if (b12 == 47 || b12 == 35) {
                        return N0(true);
                    }
                    this.f90513v = i10 + 3;
                    return b12;
                }
            }
            return N0(true);
        }
        if (b10 == 32 || b10 == 9) {
            int i13 = i10 + 1;
            this.f90513v = i13;
            b10 = bArr[i13];
        }
        if (b10 != 58) {
            return N0(false);
        }
        int i14 = this.f90513v;
        int i15 = i14 + 1;
        this.f90513v = i15;
        byte b13 = bArr[i15];
        if (b13 > 32) {
            if (b13 == 47 || b13 == 35) {
                return N0(true);
            }
            this.f90513v = i14 + 2;
            return b13;
        }
        if (b13 == 32 || b13 == 9) {
            int i16 = i14 + 2;
            this.f90513v = i16;
            byte b14 = bArr[i16];
            if (b14 > 32) {
                if (b14 == 47 || b14 == 35) {
                    return N0(true);
                }
                this.f90513v = i14 + 3;
                return b14;
            }
        }
        return N0(true);
    }

    public final int N0(boolean z10) throws q {
        while (true) {
            if (this.f90513v >= this.f90514w && !p0()) {
                p(" within/between " + this.D.typeDesc() + " entries", null);
                throw null;
            }
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 == 47) {
                    O0();
                } else if (i12 == 35 && (this.f88362b & d.f54029h0) != 0) {
                    P0();
                } else {
                    if (z10) {
                        return i12;
                    }
                    if (i12 != 58) {
                        r(i12, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z10 = true;
                }
            } else if (i12 == 32) {
                continue;
            } else if (i12 == 10) {
                this.f90516y++;
                this.f90517z = i11;
            } else if (i12 == 13) {
                L0();
            } else if (i12 != 9) {
                t(i12);
                throw null;
            }
        }
    }

    @Override // wb.b
    public final void O() {
        byte[] bArr;
        byte[] bArr2;
        super.O();
        this.f54078k0.release();
        if (!this.f54086s0 || (bArr = this.f54085r0) == null || bArr == (bArr2 = wb.c.f90518k)) {
            return;
        }
        this.f54085r0 = bArr2;
        this.f90511t.releaseReadIOBuffer(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        p(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0() throws ub.q {
        /*
            r9 = this;
            int r0 = r9.f88362b
            int r1 = ec.d.f54028g0
            r0 = r0 & r1
            r1 = 47
            r2 = 0
            if (r0 == 0) goto La5
            int r0 = r9.f90513v
            int r3 = r9.f90514w
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r9.p0()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r9.p(r4, r2)
            throw r2
        L1d:
            byte[] r0 = r9.f54085r0
            int r3 = r9.f90513v
            int r5 = r3 + 1
            r9.f90513v = r5
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L2f
            r9.P0()
            return
        L2f:
            r3 = 42
            if (r0 != r3) goto L9f
            int[] r5 = cc.d.getInputCodeComment()
        L37:
            int r0 = r9.f90513v
            int r6 = r9.f90514w
            if (r0 < r6) goto L43
            boolean r0 = r9.p0()
            if (r0 == 0) goto L71
        L43:
            byte[] r0 = r9.f54085r0
            int r6 = r9.f90513v
            int r7 = r6 + 1
            r9.f90513v = r7
            r0 = r0[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r5[r0]
            if (r6 == 0) goto L37
            r8 = 2
            if (r6 == r8) goto L9b
            r8 = 3
            if (r6 == r8) goto L97
            r8 = 4
            if (r6 == r8) goto L93
            r8 = 10
            if (r6 == r8) goto L8a
            r8 = 13
            if (r6 == r8) goto L86
            if (r6 != r3) goto L82
            int r0 = r9.f90514w
            if (r7 < r0) goto L75
            boolean r0 = r9.p0()
            if (r0 == 0) goto L71
            goto L75
        L71:
            r9.p(r4, r2)
            throw r2
        L75:
            byte[] r0 = r9.f54085r0
            int r6 = r9.f90513v
            r0 = r0[r6]
            if (r0 != r1) goto L37
            int r6 = r6 + 1
            r9.f90513v = r6
            return
        L82:
            r9.G0(r0)
            throw r2
        L86:
            r9.L0()
            goto L37
        L8a:
            int r0 = r9.f90516y
            int r0 = r0 + 1
            r9.f90516y = r0
            r9.f90517z = r7
            goto L37
        L93:
            r9.T0()
            goto L37
        L97:
            r9.S0()
            goto L37
        L9b:
            r9.R0()
            goto L37
        L9f:
            java.lang.String r1 = "was expecting either '*' or '/' for a comment"
            r9.r(r0, r1)
            throw r2
        La5:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r9.r(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.O0():void");
    }

    public final void P0() throws q {
        int[] inputCodeComment = cc.d.getInputCodeComment();
        while (true) {
            if (this.f90513v >= this.f90514w && !p0()) {
                return;
            }
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i13 = inputCodeComment[i12];
            if (i13 != 0) {
                if (i13 == 2) {
                    R0();
                } else if (i13 == 3) {
                    S0();
                } else if (i13 == 4) {
                    T0();
                } else if (i13 == 10) {
                    this.f90516y++;
                    this.f90517z = i11;
                    return;
                } else if (i13 == 13) {
                    L0();
                    return;
                } else if (i13 != 42 && i13 < 0) {
                    G0(i12);
                    throw null;
                }
            }
        }
    }

    public final void Q0() throws q {
        this.f54080m0 = false;
        byte[] bArr = this.f54085r0;
        while (true) {
            int i10 = this.f90513v;
            int i11 = this.f90514w;
            if (i10 >= i11) {
                q0();
                i10 = this.f90513v;
                i11 = this.f90514w;
            }
            while (true) {
                if (i10 >= i11) {
                    this.f90513v = i10;
                    break;
                }
                int i12 = i10 + 1;
                int i13 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = d.f54031j0[i13];
                if (i14 != 0) {
                    this.f90513v = i12;
                    if (i13 == 34) {
                        return;
                    }
                    if (i14 == 1) {
                        F();
                    } else if (i14 == 2) {
                        R0();
                    } else if (i14 == 3) {
                        S0();
                    } else if (i14 == 4) {
                        T0();
                    } else {
                        if (i13 >= 32) {
                            G0(i13);
                            throw null;
                        }
                        Q(i13, "string value");
                    }
                } else {
                    i10 = i12;
                }
            }
        }
    }

    public final void R0() throws q {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i10 = this.f90513v;
        int i11 = i10 + 1;
        this.f90513v = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) == 128) {
            return;
        }
        I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i11);
        throw null;
    }

    public final void S0() throws q {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i10 = this.f90513v;
        int i11 = i10 + 1;
        this.f90513v = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i11);
            throw null;
        }
        if (i11 >= this.f90514w) {
            q0();
        }
        byte[] bArr2 = this.f54085r0;
        int i12 = this.f90513v;
        int i13 = i12 + 1;
        this.f90513v = i13;
        byte b11 = bArr2[i12];
        if ((b11 & 192) == 128) {
            return;
        }
        I0(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
        throw null;
    }

    public final void T0() throws q {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i10 = this.f90513v;
        int i11 = i10 + 1;
        this.f90513v = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i11);
            throw null;
        }
        if (i11 >= this.f90514w) {
            q0();
        }
        byte[] bArr2 = this.f54085r0;
        int i12 = this.f90513v;
        int i13 = i12 + 1;
        this.f90513v = i13;
        byte b11 = bArr2[i12];
        if ((b11 & 192) != 128) {
            I0(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
            throw null;
        }
        if (i13 >= this.f90514w) {
            q0();
        }
        byte[] bArr3 = this.f54085r0;
        int i14 = this.f90513v;
        int i15 = i14 + 1;
        this.f90513v = i15;
        byte b12 = bArr3[i14];
        if ((b12 & 192) == 128) {
            return;
        }
        I0(b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i15);
        throw null;
    }

    public final int U0() {
        while (true) {
            int i10 = this.f90513v;
            if (i10 >= this.f90514w) {
                return V0();
            }
            byte[] bArr = this.f54085r0;
            int i11 = i10 + 1;
            this.f90513v = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 != 47 && i12 != 35) {
                    return i12;
                }
                this.f90513v = i10;
                return V0();
            }
            if (i12 != 32) {
                if (i12 == 10) {
                    this.f90516y++;
                    this.f90517z = i11;
                } else if (i12 == 13) {
                    L0();
                } else if (i12 != 9) {
                    t(i12);
                    throw null;
                }
            }
        }
    }

    public final int V0() throws q {
        while (true) {
            if (this.f90513v >= this.f90514w && !p0()) {
                throw e("Unexpected end-of-input within/between " + this.D.typeDesc() + " entries");
            }
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 == 47) {
                    O0();
                } else {
                    if (i12 != 35) {
                        return i12;
                    }
                    if ((this.f88362b & d.f54029h0) == 0) {
                        return i12;
                    }
                    P0();
                }
            } else if (i12 == 32) {
                continue;
            } else if (i12 == 10) {
                this.f90516y++;
                this.f90517z = i11;
            } else if (i12 == 13) {
                L0();
            } else if (i12 != 9) {
                t(i12);
                throw null;
            }
        }
    }

    public final int W0() {
        if (this.f90513v >= this.f90514w && !p0()) {
            k();
            return -1;
        }
        byte[] bArr = this.f54085r0;
        int i10 = this.f90513v;
        int i11 = i10 + 1;
        this.f90513v = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i12 > 32) {
            if (i12 != 47 && i12 != 35) {
                return i12;
            }
            this.f90513v = i10;
            return X0();
        }
        if (i12 != 32) {
            if (i12 == 10) {
                this.f90516y++;
                this.f90517z = i11;
            } else if (i12 == 13) {
                L0();
            } else if (i12 != 9 && !a0(i12)) {
                t(i12);
                throw null;
            }
        }
        while (true) {
            int i13 = this.f90513v;
            if (i13 >= this.f90514w) {
                return X0();
            }
            byte[] bArr2 = this.f54085r0;
            int i14 = i13 + 1;
            this.f90513v = i14;
            int i15 = bArr2[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i15 > 32) {
                if (i15 != 47 && i15 != 35) {
                    return i15;
                }
                this.f90513v = i13;
                return X0();
            }
            if (i15 != 32) {
                if (i15 == 10) {
                    this.f90516y++;
                    this.f90517z = i14;
                } else if (i15 == 13) {
                    L0();
                } else if (i15 != 9 && !a0(i15)) {
                    t(i15);
                    throw null;
                }
            }
        }
    }

    public final int X0() throws q {
        while (true) {
            if (this.f90513v >= this.f90514w && !p0()) {
                k();
                return -1;
            }
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i12 > 32) {
                if (i12 == 47) {
                    O0();
                } else {
                    if (i12 != 35) {
                        return i12;
                    }
                    if ((this.f88362b & d.f54029h0) == 0) {
                        return i12;
                    }
                    P0();
                }
            } else if (i12 == 32) {
                continue;
            } else if (i12 == 10) {
                this.f90516y++;
                this.f90517z = i11;
            } else if (i12 == 13) {
                L0();
            } else if (i12 != 9) {
                t(i12);
                throw null;
            }
        }
    }

    public final void Y0() {
        this.B = this.f90516y;
        int i10 = this.f90513v;
        this.A = this.f90515x + i10;
        this.C = i10 - this.f90517z;
    }

    public final int Z0() {
        if (this.f90513v < this.f90514w || p0()) {
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 >= 48 && i11 <= 57) {
                if ((this.f88362b & d.f54022a0) == 0) {
                    w();
                    throw null;
                }
                this.f90513v = i10 + 1;
                if (i11 == 48) {
                    do {
                        if (this.f90513v >= this.f90514w && !p0()) {
                            return i11;
                        }
                        byte[] bArr2 = this.f54085r0;
                        int i12 = this.f90513v;
                        i11 = bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i11 >= 48 && i11 <= 57) {
                            this.f90513v = i12 + 1;
                        }
                    } while (i11 == 48);
                }
                return i11;
            }
        }
        return 48;
    }

    public final void a1(int i10) {
        int i11 = this.f90513v;
        int i12 = i11 + 1;
        this.f90513v = i12;
        if (i10 != 9) {
            if (i10 == 10) {
                this.f90516y++;
                this.f90517z = i12;
            } else if (i10 == 13) {
                this.f90513v = i11;
            } else {
                if (i10 == 32) {
                    return;
                }
                r(i10, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    public final void b0() {
        Y0();
        if (this.D.inArray()) {
            this.D = this.D.clearAndGetParent();
        } else {
            P(AbstractJsonLexerKt.END_OBJ, 93);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b1(int r20, int r21, int[] r22) throws xb.b, ub.q {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.b1(int, int, int[]):java.lang.String");
    }

    public final void c0() {
        Y0();
        if (this.D.inObject()) {
            this.D = this.D.clearAndGetParent();
        } else {
            P(AbstractJsonLexerKt.END_LIST, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
            throw null;
        }
    }

    public final String c1(int i10, int i11) {
        int iY0 = y0(i10, i11);
        String strFindName = this.f54078k0.findName(iY0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f54079l0;
        iArr[0] = iY0;
        return b1(1, i11, iArr);
    }

    @Override // ec.d, ub.u
    public p currentLocation() {
        return new p(C(), this.f90515x + this.f90513v, -1L, this.f90516y, (this.f90513v - this.f90517z) + 1);
    }

    @Override // ec.d, ub.u
    public p currentTokenLocation() {
        if (this.f90528g != z.FIELD_NAME) {
            return new p(C(), this.A - 1, -1L, this.B, this.C);
        }
        return new p(C(), this.f90515x + (this.f54081n0 - 1), -1L, this.f54082o0, this.f54083p0);
    }

    public final z d0(int i10) {
        if (i10 == 125) {
            c0();
            z zVar = z.END_OBJECT;
            u(zVar);
            return zVar;
        }
        b0();
        z zVar2 = z.END_ARRAY;
        u(zVar2);
        return zVar2;
    }

    public final String d1(int i10, int i11, int i12) {
        int iY0 = y0(i11, i12);
        String strFindName = this.f54078k0.findName(i10, iY0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f54079l0;
        iArr[0] = i10;
        iArr[1] = iY0;
        return b1(2, i12, iArr);
    }

    public final byte[] e0(ub.b bVar) throws q {
        ic.d dVar_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this.f90513v >= this.f90514w) {
                q0();
            }
            byte[] bArr = this.f54085r0;
            int i10 = this.f90513v;
            this.f90513v = i10 + 1;
            int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 > 32) {
                int iDecodeBase64Char = bVar.decodeBase64Char(i11);
                if (iDecodeBase64Char < 0) {
                    if (i11 == 34) {
                        return dVar_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = E(bVar, i11, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.f90513v >= this.f90514w) {
                    q0();
                }
                byte[] bArr2 = this.f54085r0;
                int i12 = this.f90513v;
                this.f90513v = i12 + 1;
                int i13 = bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int iDecodeBase64Char2 = bVar.decodeBase64Char(i13);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = E(bVar, i13, 1);
                }
                int i14 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.f90513v >= this.f90514w) {
                    q0();
                }
                byte[] bArr3 = this.f54085r0;
                int i15 = this.f90513v;
                this.f90513v = i15 + 1;
                int i16 = bArr3[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int iDecodeBase64Char3 = bVar.decodeBase64Char(i16);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i16 == 34) {
                            dVar_getByteArrayBuilder.append(i14 >> 4);
                            if (!bVar.requiresPaddingOnRead()) {
                                return dVar_getByteArrayBuilder.toByteArray();
                            }
                            this.f90513v--;
                            throw e(bVar.missingPaddingMessage());
                        }
                        iDecodeBase64Char3 = E(bVar, i16, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.f90513v >= this.f90514w) {
                            q0();
                        }
                        byte[] bArr4 = this.f54085r0;
                        int i17 = this.f90513v;
                        this.f90513v = i17 + 1;
                        int i18 = bArr4[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (!bVar.usesPaddingChar(i18) && E(bVar, i18, 3) != -2) {
                            throw wb.b.W(bVar, i18, 3, "expected padding character '" + bVar.getPaddingChar() + "'");
                        }
                        dVar_getByteArrayBuilder.append(i14 >> 4);
                    }
                }
                int i19 = (i14 << 6) | iDecodeBase64Char3;
                if (this.f90513v >= this.f90514w) {
                    q0();
                }
                byte[] bArr5 = this.f54085r0;
                int i20 = this.f90513v;
                this.f90513v = i20 + 1;
                int i21 = bArr5[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int iDecodeBase64Char4 = bVar.decodeBase64Char(i21);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i21 == 34) {
                            dVar_getByteArrayBuilder.appendTwoBytes(i19 >> 2);
                            if (!bVar.requiresPaddingOnRead()) {
                                return dVar_getByteArrayBuilder.toByteArray();
                            }
                            this.f90513v--;
                            throw e(bVar.missingPaddingMessage());
                        }
                        iDecodeBase64Char4 = E(bVar, i21, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        dVar_getByteArrayBuilder.appendTwoBytes(i19 >> 2);
                    }
                }
                dVar_getByteArrayBuilder.appendThreeBytes((i19 << 6) | iDecodeBase64Char4);
            }
        }
    }

    public final String e1(int i10, int i11, int i12, int i13) {
        int iY0 = y0(i12, i13);
        String strFindName = this.f54078k0.findName(i10, i11, iY0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f54079l0;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = y0(iY0, i13);
        return b1(3, i13, iArr);
    }

    public final int f0(int i10) throws q {
        int i11;
        char c10;
        int i12 = i10 & 255;
        if (i12 <= 127) {
            return i12;
        }
        if ((i10 & 224) == 192) {
            i11 = i10 & 31;
            c10 = 1;
        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
            i11 = i10 & 15;
            c10 = 2;
        } else {
            if ((i10 & 248) != 240) {
                H0(i10 & 255);
                throw null;
            }
            i11 = i10 & 7;
            c10 = 3;
        }
        int iG1 = g1();
        if ((iG1 & PsExtractor.AUDIO_STREAM) != 128) {
            J0(iG1 & 255);
            throw null;
        }
        int i13 = (i11 << 6) | (iG1 & 63);
        if (c10 <= 1) {
            return i13;
        }
        int iG12 = g1();
        if ((iG12 & PsExtractor.AUDIO_STREAM) != 128) {
            J0(iG12 & 255);
            throw null;
        }
        int i14 = (i13 << 6) | (iG12 & 63);
        if (c10 <= 2) {
            return i14;
        }
        int iG13 = g1();
        if ((iG13 & PsExtractor.AUDIO_STREAM) == 128) {
            return (i14 << 6) | (iG13 & 63);
        }
        J0(iG13 & 255);
        throw null;
    }

    public final String f1(int[] iArr, int i10, int i11, int i12) throws xb.b {
        if (i10 >= iArr.length) {
            iArr = K(iArr.length, iArr);
            this.f54079l0 = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = y0(i11, i12);
        String strFindName = this.f54078k0.findName(iArr, i13);
        return strFindName == null ? b1(i13, i12, iArr) : strFindName;
    }

    @Override // ub.u
    public void finishToken() throws IOException {
        if (this.f54080m0) {
            this.f54080m0 = false;
            l0();
        }
    }

    public final int g0(int i10) throws q {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i11 = this.f90513v;
        int i12 = i11 + 1;
        this.f90513v = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) == 128) {
            return ((i10 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i12);
        throw null;
    }

    public final int g1() {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // wb.b, wb.c, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_STRING && (zVar != z.VALUE_EMBEDDED_OBJECT || this.J == null)) {
            throw e("Current token (" + this.f90528g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f54080m0) {
            try {
                this.J = e0(bVar);
                this.f54080m0 = false;
            } catch (IllegalArgumentException e10) {
                throw e("Failed to decode VALUE_STRING as base64 (" + bVar + "): " + e10.getMessage());
            }
        } else if (this.J == null) {
            ic.d dVar_getByteArrayBuilder = _getByteArrayBuilder();
            i(getText(), dVar_getByteArrayBuilder, bVar);
            this.J = dVar_getByteArrayBuilder.toByteArray();
        }
        return this.J;
    }

    @Override // ub.u
    public Object getInputSource() {
        return this.f54084q0;
    }

    @Override // wb.c, ub.u
    public String getText() throws IOException {
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            if (!this.f54080m0) {
                return j0Var.contentsAsString();
            }
            this.f54080m0 = false;
            return k0();
        }
        if (zVar == null) {
            return null;
        }
        int iId = zVar.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? j0Var.contentsAsString() : zVar.asString() : this.D.getCurrentName();
    }

    @Override // wb.c, ub.u
    public char[] getTextCharacters() throws IOException {
        z zVar = this.f90528g;
        if (zVar == null) {
            return null;
        }
        int iId = zVar.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return this.f90528g.asCharArray();
                }
            } else if (this.f54080m0) {
                this.f54080m0 = false;
                l0();
            }
            return this.F.getTextBuffer();
        }
        if (!this.H) {
            String currentName = this.D.getCurrentName();
            int length = currentName.length();
            char[] cArr = this.G;
            if (cArr == null) {
                this.G = this.f90511t.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this.G = new char[length];
            }
            currentName.getChars(0, length, this.G, 0);
            this.H = true;
        }
        return this.G;
    }

    @Override // wb.c, ub.u
    public int getTextLength() throws IOException {
        z zVar = this.f90528g;
        if (zVar == null) {
            return 0;
        }
        int iId = zVar.id();
        if (iId == 5) {
            return this.D.getCurrentName().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this.f90528g.asCharArray().length;
            }
        } else if (this.f54080m0) {
            this.f54080m0 = false;
            l0();
        }
        return this.F.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // wb.c, ub.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            ub.z r0 = r3.f90528g
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3.f54080m0
            if (r0 == 0) goto L1d
            r3.f54080m0 = r1
            r3.l0()
        L1d:
            ic.j0 r0 = r3.F
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.getTextOffset():int");
    }

    @Override // wb.c, ub.u
    public int getValueAsInt() throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_NUMBER_INT && zVar != z.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i10 = this.K;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return M();
            }
            if ((i10 & 1) == 0) {
                S();
            }
        }
        return this.L;
    }

    @Override // wb.c, ub.u
    public String getValueAsString() throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_STRING) {
            return zVar == z.FIELD_NAME ? currentName() : super.getValueAsString(null);
        }
        if (!this.f54080m0) {
            return this.F.contentsAsString();
        }
        this.f54080m0 = false;
        return k0();
    }

    @Override // ub.u
    public final p h() {
        int i10 = this.f90513v - 1;
        return new p(C(), this.f90515x + i10, -1L, this.f90516y, (i10 - this.f90517z) + 1);
    }

    public final int h0(int i10) throws q {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        int i11 = i10 & 15;
        byte[] bArr = this.f54085r0;
        int i12 = this.f90513v;
        int i13 = i12 + 1;
        this.f90513v = i13;
        byte b10 = bArr[i12];
        if ((b10 & 192) != 128) {
            I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
            throw null;
        }
        int i14 = (i11 << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        if (i13 >= this.f90514w) {
            q0();
        }
        byte[] bArr2 = this.f54085r0;
        int i15 = this.f90513v;
        int i16 = i15 + 1;
        this.f90513v = i16;
        byte b11 = bArr2[i15];
        if ((b11 & 192) == 128) {
            return (i14 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        I0(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i16);
        throw null;
    }

    public final String h1(int[] iArr, int i10, int i11, int i12, int i13) throws xb.b {
        while (true) {
            if (d.f54030i0[i12] != 0) {
                if (i12 == 34) {
                    if (i13 > 0) {
                        if (i10 >= iArr.length) {
                            iArr = K(iArr.length, iArr);
                            this.f54079l0 = iArr;
                        }
                        iArr[i10] = y0(i11, i13);
                        i10++;
                    }
                    String strFindName = this.f54078k0.findName(iArr, i10);
                    return strFindName == null ? b1(i10, i13, iArr) : strFindName;
                }
                if (i12 != 92) {
                    Q(i12, "name");
                } else {
                    i12 = F();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (i13 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = K(iArr.length, iArr);
                            this.f54079l0 = iArr;
                        }
                        iArr[i10] = i11;
                        i10++;
                        i11 = 0;
                        i13 = 0;
                    }
                    if (i12 < 2048) {
                        i11 = (i11 << 8) | (i12 >> 6) | PsExtractor.AUDIO_STREAM;
                        i13++;
                    } else {
                        int i15 = (i11 << 8) | (i12 >> 12) | 224;
                        int i16 = i13 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = K(iArr.length, iArr);
                                this.f54079l0 = iArr;
                            }
                            iArr[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        i13 = i16 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (i13 < 4) {
                i13++;
                i11 = (i11 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = K(iArr.length, iArr);
                    this.f54079l0 = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            if (this.f90513v >= this.f90514w && !p0()) {
                p(" in field name", z.FIELD_NAME);
                throw null;
            }
            byte[] bArr = this.f54085r0;
            int i17 = this.f90513v;
            this.f90513v = i17 + 1;
            i12 = bArr[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
    }

    public final int i0(int i10) throws q {
        int i11 = i10 & 15;
        byte[] bArr = this.f54085r0;
        int i12 = this.f90513v;
        int i13 = i12 + 1;
        this.f90513v = i13;
        byte b10 = bArr[i12];
        if ((b10 & 192) != 128) {
            I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i13);
            throw null;
        }
        int i14 = (i11 << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        int i15 = i12 + 2;
        this.f90513v = i15;
        byte b11 = bArr[i13];
        if ((b11 & 192) == 128) {
            return (i14 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        I0(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i15);
        throw null;
    }

    public final String i1(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f54079l0;
        iArr[0] = i10;
        iArr[1] = i11;
        return h1(iArr, 2, i12, i13, i14);
    }

    public final int j0(int i10) throws q {
        if (this.f90513v >= this.f90514w) {
            q0();
        }
        byte[] bArr = this.f54085r0;
        int i11 = this.f90513v;
        int i12 = i11 + 1;
        this.f90513v = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            I0(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i12);
            throw null;
        }
        int i13 = ((i10 & 7) << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        if (i12 >= this.f90514w) {
            q0();
        }
        byte[] bArr2 = this.f54085r0;
        int i14 = this.f90513v;
        int i15 = i14 + 1;
        this.f90513v = i15;
        byte b11 = bArr2[i14];
        if ((b11 & 192) != 128) {
            I0(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i15);
            throw null;
        }
        int i16 = (i13 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        if (i15 >= this.f90514w) {
            q0();
        }
        byte[] bArr3 = this.f54085r0;
        int i17 = this.f90513v;
        int i18 = i17 + 1;
        this.f90513v = i18;
        byte b12 = bArr3[i17];
        if ((b12 & 192) == 128) {
            return ((i16 << 6) | (b12 & Utf8.REPLACEMENT_BYTE)) - C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        I0(b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, i18);
        throw null;
    }

    public final String k0() throws IOException {
        int i10 = this.f90513v;
        if (i10 >= this.f90514w) {
            q0();
            i10 = this.f90513v;
        }
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int iMin = Math.min(this.f90514w, cArrEmptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this.f54085r0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (d.f54031j0[i12] == 0) {
                i10++;
                cArrEmptyAndGetCurrentSegment[i11] = (char) i12;
                i11++;
            } else if (i12 == 34) {
                this.f90513v = i10 + 1;
                return j0Var.setCurrentAndReturn(i11);
            }
        }
        this.f90513v = i10;
        m0(i11, cArrEmptyAndGetCurrentSegment);
        return j0Var.contentsAsString();
    }

    public final void l0() throws IOException {
        int i10 = this.f90513v;
        if (i10 >= this.f90514w) {
            q0();
            i10 = this.f90513v;
        }
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int iMin = Math.min(this.f90514w, cArrEmptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this.f54085r0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (d.f54031j0[i12] == 0) {
                i10++;
                cArrEmptyAndGetCurrentSegment[i11] = (char) i12;
                i11++;
            } else if (i12 == 34) {
                this.f90513v = i10 + 1;
                j0Var.setCurrentLength(i11);
                return;
            }
        }
        this.f90513v = i10;
        m0(i11, cArrEmptyAndGetCurrentSegment);
    }

    public final void m0(int i10, char[] cArr) throws IOException {
        byte[] bArr = this.f54085r0;
        while (true) {
            int i11 = this.f90513v;
            if (i11 >= this.f90514w) {
                q0();
                i11 = this.f90513v;
            }
            int length = cArr.length;
            int i12 = 0;
            j0 j0Var = this.F;
            if (i10 >= length) {
                cArr = j0Var.finishCurrentSegment();
                i10 = 0;
            }
            int iMin = Math.min(this.f90514w, ic.j.addOverflowSafe(i11, cArr.length - i10));
            while (true) {
                if (i11 >= iMin) {
                    this.f90513v = i11;
                    break;
                }
                int i13 = i11 + 1;
                int iF = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = d.f54031j0[iF];
                if (i14 != 0) {
                    this.f90513v = i13;
                    if (iF == 34) {
                        j0Var.setCurrentLength(i10);
                        return;
                    }
                    if (i14 == 1) {
                        iF = F();
                    } else if (i14 == 2) {
                        iF = g0(iF);
                    } else if (i14 == 3) {
                        iF = this.f90514w - i13 >= 2 ? i0(iF) : h0(iF);
                    } else if (i14 == 4) {
                        int iJ0 = j0(iF);
                        int i15 = i10 + 1;
                        cArr[i10] = (char) ((iJ0 >> 10) | 55296);
                        if (i15 >= cArr.length) {
                            cArr = j0Var.finishCurrentSegment();
                            i10 = 0;
                        } else {
                            i10 = i15;
                        }
                        iF = (iJ0 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | Utf8.LOG_SURROGATE_HEADER;
                    } else {
                        if (iF >= 32) {
                            G0(iF);
                            throw null;
                        }
                        Q(iF, "string value");
                    }
                    if (i10 >= cArr.length) {
                        cArr = j0Var.finishCurrentSegment();
                    } else {
                        i12 = i10;
                    }
                    i10 = i12 + 1;
                    cArr[i12] = (char) iF;
                } else {
                    cArr[i10] = (char) iF;
                    i11 = i13;
                    i10++;
                }
            }
        }
    }

    public final z n0(int i10, boolean z10, boolean z11) throws q {
        String str;
        if (i10 == 73) {
            if (this.f90513v >= this.f90514w && !p0()) {
                q(z.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.f54085r0;
            int i11 = this.f90513v;
            this.f90513v = i11 + 1;
            i10 = bArr[i11];
            if (i10 == 78) {
                str = z10 ? "-INF" : "+INF";
            } else if (i10 == 110) {
                str = z10 ? "-Infinity" : "+Infinity";
            }
            t0(3, str);
            if ((this.f88362b & d.f54023b0) != 0) {
                return X(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            n(str, "Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            throw null;
        }
        if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) || z10) {
            s(i10, z10 ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
            throw null;
        }
        s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        throw null;
    }

    @Override // ub.u
    public Boolean nextBooleanValue() throws IOException {
        if (this.f90528g == z.FIELD_NAME) {
            this.H = false;
            z zVar = this.E;
            this.E = null;
            u(zVar);
            if (zVar == z.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (zVar == z.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (zVar == z.START_ARRAY) {
                T(this.B, this.C);
                return null;
            }
            if (zVar == z.START_OBJECT) {
                U(this.B, this.C);
                return null;
            }
        } else {
            z zVarNextToken = nextToken();
            if (zVarNextToken == z.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (zVarNextToken == z.VALUE_FALSE) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[PHI: r2
      0x00f5: PHI (r2v27 int) = (r2v26 int), (r2v25 int), (r2v25 int), (r2v25 int) binds: [B:59:0x00f4, B:53:0x00e5, B:49:0x00dc, B:50:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129 A[PHI: r2
      0x0129: PHI (r2v14 int) = (r2v13 int), (r2v11 int), (r2v11 int), (r2v11 int) binds: [B:77:0x0128, B:71:0x0118, B:67:0x010e, B:68:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ub.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean nextFieldName(ub.c0 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.nextFieldName(ub.c0):boolean");
    }

    @Override // ub.u
    public int nextIntValue(int i10) throws IOException {
        if (this.f90528g != z.FIELD_NAME) {
            return nextToken() == z.VALUE_NUMBER_INT ? getIntValue() : i10;
        }
        this.H = false;
        z zVar = this.E;
        this.E = null;
        u(zVar);
        if (zVar == z.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (zVar == z.START_ARRAY) {
            T(this.B, this.C);
            return i10;
        }
        if (zVar != z.START_OBJECT) {
            return i10;
        }
        U(this.B, this.C);
        return i10;
    }

    @Override // ub.u
    public long nextLongValue(long j10) throws IOException {
        if (this.f90528g != z.FIELD_NAME) {
            return nextToken() == z.VALUE_NUMBER_INT ? getLongValue() : j10;
        }
        this.H = false;
        z zVar = this.E;
        this.E = null;
        u(zVar);
        if (zVar == z.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (zVar == z.START_ARRAY) {
            T(this.B, this.C);
            return j10;
        }
        if (zVar != z.START_OBJECT) {
            return j10;
        }
        U(this.B, this.C);
        return j10;
    }

    @Override // ub.u
    public String nextTextValue() throws IOException {
        if (this.f90528g == z.FIELD_NAME) {
            this.H = false;
            z zVar = this.E;
            this.E = null;
            u(zVar);
            if (zVar == z.VALUE_STRING) {
                if (!this.f54080m0) {
                    return this.F.contentsAsString();
                }
                this.f54080m0 = false;
                return k0();
            }
            if (zVar == z.START_ARRAY) {
                T(this.B, this.C);
                return null;
            }
            if (zVar == z.START_OBJECT) {
                U(this.B, this.C);
                return null;
            }
        } else if (nextToken() == z.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    @Override // wb.c, ub.u
    public z nextToken() throws IOException {
        z zVarD0;
        z zVar = this.f90528g;
        z zVar2 = z.FIELD_NAME;
        if (zVar == zVar2) {
            return w0();
        }
        this.K = 0;
        if (this.f54080m0) {
            Q0();
        }
        int iW0 = W0();
        if (iW0 < 0) {
            close();
            this.f90528g = null;
            return null;
        }
        this.J = null;
        if (iW0 == 93) {
            b0();
            z zVar3 = z.END_ARRAY;
            u(zVar3);
            return zVar3;
        }
        if (iW0 == 125) {
            c0();
            z zVar4 = z.END_OBJECT;
            u(zVar4);
            return zVar4;
        }
        if (this.D.expectComma()) {
            if (iW0 != 44) {
                r(iW0, "was expecting comma to separate " + this.D.typeDesc() + " entries");
                throw null;
            }
            iW0 = U0();
            if ((this.f88362b & d.Z) != 0 && (iW0 == 93 || iW0 == 125)) {
                return d0(iW0);
            }
        }
        if (!this.D.inObject()) {
            Y0();
            return x0(iW0);
        }
        this.f54082o0 = this.f90516y;
        int i10 = this.f90513v;
        this.f54081n0 = i10;
        this.f54083p0 = i10 - this.f90517z;
        this.D.setCurrentName(B0(iW0));
        u(zVar2);
        int iM0 = M0();
        Y0();
        if (iM0 == 34) {
            this.f54080m0 = true;
            this.E = z.VALUE_STRING;
            return this.f90528g;
        }
        if (iM0 == 43) {
            zVarD0 = isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? D0(false) : o0(iM0);
        } else if (iM0 == 91) {
            zVarD0 = z.START_ARRAY;
        } else if (iM0 == 102) {
            r0();
            zVarD0 = z.VALUE_FALSE;
        } else if (iM0 == 110) {
            s0();
            zVarD0 = z.VALUE_NULL;
        } else if (iM0 == 116) {
            v0();
            zVarD0 = z.VALUE_TRUE;
        } else if (iM0 == 123) {
            zVarD0 = z.START_OBJECT;
        } else if (iM0 == 45) {
            zVarD0 = D0(true);
        } else if (iM0 != 46) {
            switch (iM0) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    zVarD0 = E0(iM0);
                    break;
                default:
                    zVarD0 = o0(iM0);
                    break;
            }
        } else {
            zVarD0 = A0(false);
        }
        this.E = zVarD0;
        return this.f90528g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r13 != 44) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r12.D.inArray() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r12.D.inRoot() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((r12.f88362b & ec.d.f54024c0) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r12.f90513v--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return ub.z.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z o0(int r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.o0(int):ub.z");
    }

    public final boolean p0() throws IOException {
        int length;
        if (this.f54084q0 == null || (length = this.f54085r0.length) == 0) {
            return false;
        }
        int i10 = this.f90514w;
        long j10 = this.f90515x + i10;
        this.f90515x = j10;
        this.f90517z -= i10;
        this.f90527f.validateDocumentLength(j10);
        int i11 = this.f54084q0.read(this.f54085r0, 0, length);
        if (i11 > 0) {
            this.f54081n0 -= i10;
            this.f90513v = 0;
            this.f90514w = i11;
            return true;
        }
        this.f90514w = 0;
        this.f90513v = 0;
        B();
        if (i11 == 0) {
            throw new IOException(a.b.f(this.f54085r0.length, " bytes", new StringBuilder("InputStream.read() returned 0 characters when trying to read ")));
        }
        return false;
    }

    public final void q0() {
        if (p0()) {
            return;
        }
        o();
        throw null;
    }

    public final void r0() throws q {
        int i10;
        int i11 = this.f90513v;
        if (i11 + 4 < this.f90514w) {
            byte[] bArr = this.f54085r0;
            int i12 = i11 + 1;
            if (bArr[i11] == 97) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 115) {
                        int i15 = i11 + 4;
                        if (bArr[i14] == 101 && ((i10 = bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || (i10 | 32) == 125)) {
                            this.f90513v = i15;
                            return;
                        }
                    }
                }
            }
        }
        u0(1, "false");
    }

    @Override // ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        if (!this.f54080m0 || this.f90528g != z.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(bVar);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        cc.h hVar = this.f90511t;
        byte[] bArrAllocBase64Buffer = hVar.allocBase64Buffer();
        try {
            return F0(bVar, outputStream, bArrAllocBase64Buffer);
        } finally {
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // ub.u
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i10 = this.f90514w;
        int i11 = this.f90513v;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        this.f90513v = i11 + i12;
        outputStream.write(this.f54085r0, i11, i12);
        return i12;
    }

    public final void s0() throws q {
        int i10;
        int i11 = this.f90513v;
        if (i11 + 3 < this.f90514w) {
            byte[] bArr = this.f54085r0;
            int i12 = i11 + 1;
            if (bArr[i11] == 117) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 108 && ((i10 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || (i10 | 32) == 125)) {
                        this.f90513v = i14;
                        return;
                    }
                }
            }
        }
        u0(1, AbstractJsonLexerKt.NULL);
    }

    public final void t0(int i10, String str) throws q {
        int length = str.length();
        if (this.f90513v + length >= this.f90514w) {
            u0(i10, str);
            return;
        }
        while (this.f54085r0[this.f90513v] == str.charAt(i10)) {
            int i11 = this.f90513v + 1;
            this.f90513v = i11;
            i10++;
            if (i10 >= length) {
                int i12 = this.f54085r0[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i12 < 48 || i12 == 93 || i12 == 125 || !Character.isJavaIdentifierPart((char) f0(i12))) {
                    return;
                }
                K0(str.substring(0, i10), R());
                throw null;
            }
        }
        K0(str.substring(0, i10), R());
        throw null;
    }

    public final void u0(int i10, String str) throws q {
        int i11;
        int i12;
        int length = str.length();
        do {
            if ((this.f90513v >= this.f90514w && !p0()) || this.f54085r0[this.f90513v] != str.charAt(i10)) {
                K0(str.substring(0, i10), R());
                throw null;
            }
            i11 = this.f90513v + 1;
            this.f90513v = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.f90514w || p0()) && (i12 = this.f54085r0[this.f90513v] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 48 && i12 != 93 && i12 != 125 && Character.isJavaIdentifierPart((char) f0(i12))) {
            K0(str.substring(0, i10), R());
            throw null;
        }
    }

    public final void v0() throws q {
        int i10;
        int i11 = this.f90513v;
        if (i11 + 3 < this.f90514w) {
            byte[] bArr = this.f54085r0;
            int i12 = i11 + 1;
            if (bArr[i11] == 114) {
                int i13 = i11 + 2;
                if (bArr[i12] == 117) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 101 && ((i10 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 48 || (i10 | 32) == 125)) {
                        this.f90513v = i14;
                        return;
                    }
                }
            }
        }
        u0(1, "true");
    }

    public final z w0() {
        this.H = false;
        z zVar = this.E;
        this.E = null;
        if (zVar == z.START_ARRAY) {
            T(this.B, this.C);
        } else if (zVar == z.START_OBJECT) {
            U(this.B, this.C);
        }
        u(zVar);
        return zVar;
    }

    public final z x0(int i10) throws IOException {
        if (i10 == 34) {
            this.f54080m0 = true;
            z zVar = z.VALUE_STRING;
            u(zVar);
            return zVar;
        }
        if (i10 == 43) {
            if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                z zVarD0 = D0(false);
                u(zVarD0);
                return zVarD0;
            }
            z zVarO0 = o0(i10);
            u(zVarO0);
            return zVarO0;
        }
        if (i10 == 91) {
            T(this.B, this.C);
            z zVar2 = z.START_ARRAY;
            u(zVar2);
            return zVar2;
        }
        if (i10 == 102) {
            r0();
            z zVar3 = z.VALUE_FALSE;
            u(zVar3);
            return zVar3;
        }
        if (i10 == 110) {
            s0();
            z zVar4 = z.VALUE_NULL;
            u(zVar4);
            return zVar4;
        }
        if (i10 == 116) {
            v0();
            z zVar5 = z.VALUE_TRUE;
            u(zVar5);
            return zVar5;
        }
        if (i10 == 123) {
            U(this.B, this.C);
            z zVar6 = z.START_OBJECT;
            u(zVar6);
            return zVar6;
        }
        if (i10 == 45) {
            z zVarD02 = D0(true);
            u(zVarD02);
            return zVarD02;
        }
        if (i10 == 46) {
            z zVarA0 = A0(false);
            u(zVarA0);
            return zVarA0;
        }
        switch (i10) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                z zVarE0 = E0(i10);
                u(zVarE0);
                return zVarE0;
            default:
                z zVarO02 = o0(i10);
                u(zVarO02);
                return zVarO02;
        }
    }

    public final z z0(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        char[] cArrFinishCurrentSegment;
        int i13;
        int i14;
        boolean z11;
        int i15 = i11;
        j0 j0Var = this.F;
        int i16 = 0;
        if (i15 == 46) {
            cArrFinishCurrentSegment = cArr;
            int i17 = i10;
            if (i17 >= cArrFinishCurrentSegment.length) {
                cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                i17 = 0;
            }
            int i18 = i17 + 1;
            cArrFinishCurrentSegment[i17] = (char) i15;
            int i19 = 0;
            while (true) {
                if (this.f90513v >= this.f90514w && !p0()) {
                    z11 = true;
                    break;
                }
                byte[] bArr = this.f54085r0;
                int i20 = this.f90513v;
                this.f90513v = i20 + 1;
                i15 = bArr[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i15 < 48 || i15 > 57) {
                    break;
                }
                i19++;
                if (i18 >= cArrFinishCurrentSegment.length) {
                    cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                    i18 = 0;
                }
                cArrFinishCurrentSegment[i18] = (char) i15;
                i18++;
            }
            z11 = false;
            if (i19 == 0 && !isEnabled(f.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                s(i15, "Decimal point not followed by a digit");
                throw null;
            }
            int i21 = i19;
            i13 = i18;
            i14 = i21;
        } else {
            cArrFinishCurrentSegment = cArr;
            i13 = i10;
            i14 = 0;
            z11 = false;
        }
        if ((i15 | 32) == 101) {
            if (i13 >= cArrFinishCurrentSegment.length) {
                cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                i13 = 0;
            }
            int i22 = i13 + 1;
            cArrFinishCurrentSegment[i13] = (char) i15;
            if (this.f90513v >= this.f90514w) {
                q0();
            }
            byte[] bArr2 = this.f54085r0;
            int i23 = this.f90513v;
            this.f90513v = i23 + 1;
            i15 = bArr2[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i15 == 45 || i15 == 43) {
                if (i22 >= cArrFinishCurrentSegment.length) {
                    cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                    i22 = 0;
                }
                int i24 = i22 + 1;
                cArrFinishCurrentSegment[i22] = (char) i15;
                if (this.f90513v >= this.f90514w) {
                    q0();
                }
                byte[] bArr3 = this.f54085r0;
                int i25 = this.f90513v;
                this.f90513v = i25 + 1;
                i15 = bArr3[i25] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i22 = i24;
            }
            int i26 = 0;
            while (i15 >= 48 && i15 <= 57) {
                i26++;
                if (i22 >= cArrFinishCurrentSegment.length) {
                    cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                    i22 = 0;
                }
                int i27 = i22 + 1;
                cArrFinishCurrentSegment[i22] = (char) i15;
                if (this.f90513v >= this.f90514w && !p0()) {
                    z11 = true;
                    i16 = i26;
                    i13 = i27;
                    break;
                }
                byte[] bArr4 = this.f54085r0;
                int i28 = this.f90513v;
                this.f90513v = i28 + 1;
                i15 = bArr4[i28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i22 = i27;
            }
            i16 = i26;
            i13 = i22;
            if (i16 == 0) {
                s(i15, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z11) {
            this.f90513v--;
            if (this.D.inRoot()) {
                a1(i15);
            }
        }
        j0Var.setCurrentLength(i13);
        return Y(i12, i14, i16, z10);
    }

    public m(cc.h hVar, int i10, InputStream inputStream, a0 a0Var, gc.b bVar, byte[] bArr, int i11, int i12, int i13, boolean z10) {
        super(hVar, i10, a0Var);
        this.f54079l0 = new int[16];
        this.f54084q0 = inputStream;
        this.f54078k0 = bVar;
        this.f54085r0 = bArr;
        this.f90513v = i11;
        this.f90514w = i12;
        this.f90517z = i11 - i13;
        this.f90515x = (-i11) + i13;
        this.f54086s0 = z10;
    }

    @Override // wb.c, ub.u
    public int getValueAsInt(int i10) throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_NUMBER_INT && zVar != z.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i10);
        }
        int i11 = this.K;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return M();
            }
            if ((i11 & 1) == 0) {
                S();
            }
        }
        return this.L;
    }

    @Override // wb.c, ub.u
    public String getValueAsString(String str) throws IOException {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_STRING) {
            if (this.f54080m0) {
                this.f54080m0 = false;
                return k0();
            }
            return this.F.contentsAsString();
        }
        if (zVar == z.FIELD_NAME) {
            return currentName();
        }
        return super.getValueAsString(str);
    }

    @Override // ub.u
    public int getText(Writer writer) throws IOException {
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            if (this.f54080m0) {
                this.f54080m0 = false;
                l0();
            }
            return j0Var.contentsToWriter(writer);
        }
        if (zVar == z.FIELD_NAME) {
            String currentName = this.D.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (zVar == null) {
            return 0;
        }
        if (zVar.isNumeric()) {
            return j0Var.contentsToWriter(writer);
        }
        char[] cArrAsCharArray = zVar.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // ub.u
    public String nextFieldName() throws Throwable {
        z zVarO0;
        this.K = 0;
        z zVar = this.f90528g;
        z zVar2 = z.FIELD_NAME;
        if (zVar == zVar2) {
            w0();
            return null;
        }
        if (this.f54080m0) {
            Q0();
        }
        int iW0 = W0();
        if (iW0 < 0) {
            close();
            this.f90528g = null;
            return null;
        }
        this.J = null;
        if (iW0 == 93) {
            b0();
            u(z.END_ARRAY);
            return null;
        }
        if (iW0 == 125) {
            c0();
            u(z.END_OBJECT);
            return null;
        }
        if (this.D.expectComma()) {
            if (iW0 == 44) {
                iW0 = U0();
                if ((this.f88362b & d.Z) != 0 && (iW0 == 93 || iW0 == 125)) {
                    d0(iW0);
                    return null;
                }
            } else {
                r(iW0, "was expecting comma to separate " + this.D.typeDesc() + " entries");
                throw null;
            }
        }
        if (!this.D.inObject()) {
            Y0();
            x0(iW0);
            return null;
        }
        this.f54082o0 = this.f90516y;
        int i10 = this.f90513v;
        this.f54081n0 = i10;
        this.f54083p0 = i10 - this.f90517z;
        String strB0 = B0(iW0);
        this.D.setCurrentName(strB0);
        u(zVar2);
        int iM0 = M0();
        Y0();
        if (iM0 == 34) {
            this.f54080m0 = true;
            this.E = z.VALUE_STRING;
            return strB0;
        }
        if (iM0 != 43) {
            if (iM0 == 91) {
                zVarO0 = z.START_ARRAY;
            } else if (iM0 == 102) {
                r0();
                zVarO0 = z.VALUE_FALSE;
            } else if (iM0 == 110) {
                s0();
                zVarO0 = z.VALUE_NULL;
            } else if (iM0 == 116) {
                v0();
                zVarO0 = z.VALUE_TRUE;
            } else if (iM0 == 123) {
                zVarO0 = z.START_OBJECT;
            } else if (iM0 == 45) {
                zVarO0 = D0(true);
            } else if (iM0 != 46) {
                switch (iM0) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        zVarO0 = E0(iM0);
                        break;
                    default:
                        zVarO0 = o0(iM0);
                        break;
                }
            } else {
                zVarO0 = A0(false);
            }
        } else if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            zVarO0 = D0(false);
        } else {
            zVarO0 = o0(iM0);
        }
        this.E = zVarO0;
        return strB0;
    }
}
