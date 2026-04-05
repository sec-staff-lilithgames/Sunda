package ec;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import ic.j0;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.a0;
import ub.p;
import ub.q;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k extends d {

    /* renamed from: k0, reason: collision with root package name */
    public final gc.b f54067k0;

    /* renamed from: l0, reason: collision with root package name */
    public int[] f54068l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f54069m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f54070n0;

    /* renamed from: o0, reason: collision with root package name */
    public final DataInput f54071o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f54072p0;

    public k(cc.h hVar, int i10, DataInput dataInput, a0 a0Var, gc.b bVar, int i11) {
        super(hVar, i10, a0Var);
        this.f54068l0 = new int[16];
        this.f54067k0 = bVar;
        this.f54071o0 = dataInput;
        this.f54072p0 = i11;
    }

    public static final int Q0(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    public final int A0() throws IOException {
        int unsignedByte = this.f54072p0;
        DataInput dataInput = this.f54071o0;
        if (unsignedByte < 0) {
            unsignedByte = dataInput.readUnsignedByte();
        } else {
            this.f54072p0 = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = dataInput.readUnsignedByte();
            return unsignedByte2 > 32 ? (unsignedByte2 == 47 || unsignedByte2 == 35) ? B0(unsignedByte2, true) : unsignedByte2 : ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = dataInput.readUnsignedByte()) > 32) ? (unsignedByte2 == 47 || unsignedByte2 == 35) ? B0(unsignedByte2, true) : unsignedByte2 : B0(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte != 58) {
            return B0(unsignedByte, false);
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        return unsignedByte3 > 32 ? (unsignedByte3 == 47 || unsignedByte3 == 35) ? B0(unsignedByte3, true) : unsignedByte3 : ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = dataInput.readUnsignedByte()) > 32) ? (unsignedByte3 == 47 || unsignedByte3 == 35) ? B0(unsignedByte3, true) : unsignedByte3 : B0(unsignedByte3, true);
    }

    public final int B0(int i10, boolean z10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    C0();
                } else if (i10 == 35 && (this.f88362b & d.f54029h0) != 0) {
                    D0();
                } else {
                    if (z10) {
                        return i10;
                    }
                    if (i10 != 58) {
                        r(i10, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z10 = true;
                }
            } else if (i10 == 13 || i10 == 10) {
                this.f90516y++;
            }
            i10 = this.f54071o0.readUnsignedByte();
        }
    }

    public final void C0() throws IOException {
        if ((this.f88362b & d.f54028g0) == 0) {
            r(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 47) {
            D0();
            return;
        }
        if (unsignedByte != 42) {
            r(unsignedByte, "was expecting either '*' or '/' for a comment");
            throw null;
        }
        int[] inputCodeComment = cc.d.getInputCodeComment();
        int unsignedByte2 = dataInput.readUnsignedByte();
        while (true) {
            int i10 = inputCodeComment[unsignedByte2];
            if (i10 != 0) {
                if (i10 == 2) {
                    F0();
                } else if (i10 == 3) {
                    G0();
                } else if (i10 == 4) {
                    H0();
                } else if (i10 == 10 || i10 == 13) {
                    this.f90516y++;
                } else {
                    if (i10 != 42) {
                        w0(unsignedByte2);
                        throw null;
                    }
                    unsignedByte2 = dataInput.readUnsignedByte();
                    if (unsignedByte2 == 47) {
                        return;
                    }
                }
            }
            unsignedByte2 = dataInput.readUnsignedByte();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r4.f90516y++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0() throws java.io.IOException {
        /*
            r4 = this;
            int[] r0 = cc.d.getInputCodeComment()
        L4:
            java.io.DataInput r1 = r4.f54071o0
            int r1 = r1.readUnsignedByte()
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r3 = 2
            if (r2 == r3) goto L3a
            r3 = 3
            if (r2 == r3) goto L36
            r3 = 4
            if (r2 == r3) goto L32
            r3 = 10
            if (r2 == r3) goto L2b
            r3 = 13
            if (r2 == r3) goto L2b
            r3 = 42
            if (r2 == r3) goto L4
            if (r2 < 0) goto L26
            goto L4
        L26:
            r4.w0(r1)
            r0 = 0
            throw r0
        L2b:
            int r0 = r4.f90516y
            int r0 = r0 + 1
            r4.f90516y = r0
            return
        L32:
            r4.H0()
            goto L4
        L36:
            r4.G0()
            goto L4
        L3a:
            r4.F0()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.k.D0():void");
    }

    public final void E0() throws IOException {
        this.f54069m0 = false;
        while (true) {
            int unsignedByte = this.f54071o0.readUnsignedByte();
            int i10 = d.f54031j0[unsignedByte];
            if (i10 != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i10 == 1) {
                    F();
                } else if (i10 == 2) {
                    F0();
                } else if (i10 == 3) {
                    G0();
                } else if (i10 == 4) {
                    H0();
                } else {
                    if (unsignedByte >= 32) {
                        w0(unsignedByte);
                        throw null;
                    }
                    Q(unsignedByte, "string value");
                }
            }
        }
    }

    @Override // wb.b
    public final char F() throws IOException {
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return '\r';
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            char cD0 = (char) d0(unsignedByte);
            L(cD0);
            return cD0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int unsignedByte2 = dataInput.readUnsignedByte();
            int iCharToHex = cc.d.charToHex(unsignedByte2);
            if (iCharToHex < 0) {
                r(unsignedByte2, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i10 = (i10 << 4) | iCharToHex;
        }
        return (char) i10;
    }

    public final void F0() throws IOException {
        int unsignedByte = this.f54071o0.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) == 128) {
            return;
        }
        y0(unsignedByte & 255);
        throw null;
    }

    public final void G0() throws IOException {
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte & 255);
            throw null;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) == 128) {
            return;
        }
        y0(unsignedByte2 & 255);
        throw null;
    }

    public final void H0() throws IOException {
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte & 255);
            throw null;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte2 & 255);
            throw null;
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) == 128) {
            return;
        }
        y0(unsignedByte3 & 255);
        throw null;
    }

    public final int I0() throws IOException {
        int unsignedByte = this.f54072p0;
        DataInput dataInput = this.f54071o0;
        if (unsignedByte < 0) {
            unsignedByte = dataInput.readUnsignedByte();
        } else {
            this.f54072p0 = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.f90516y++;
            }
            unsignedByte = dataInput.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? J0(unsignedByte) : unsignedByte;
    }

    public final int J0(int i10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    C0();
                } else {
                    if (i10 != 35) {
                        return i10;
                    }
                    if ((this.f88362b & d.f54029h0) == 0) {
                        return i10;
                    }
                    D0();
                }
            } else if (i10 == 13 || i10 == 10) {
                this.f90516y++;
            }
            i10 = this.f54071o0.readUnsignedByte();
        }
    }

    public final void K0() {
        int i10 = this.f54072p0;
        if (i10 > 32) {
            r(i10, "Expected space separating root-level values");
            throw null;
        }
        this.f54072p0 = -1;
        if (i10 == 13 || i10 == 10) {
            this.f90516y++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String L0(int r20, int r21, int[] r22) throws ub.q {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.k.L0(int, int, int[]):java.lang.String");
    }

    public final String M0(int i10, int i11) {
        int iQ0 = Q0(i10, i11);
        String strFindName = this.f54067k0.findName(iQ0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f54068l0;
        iArr[0] = iQ0;
        return L0(1, i11, iArr);
    }

    public final String N0(int i10, int i11, int i12) {
        int iQ0 = Q0(i11, i12);
        String strFindName = this.f54067k0.findName(i10, iQ0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f54068l0;
        iArr[0] = i10;
        iArr[1] = iQ0;
        return L0(2, i12, iArr);
    }

    @Override // wb.b
    public final void O() {
        super.O();
        this.f54067k0.release();
    }

    public final String O0(int i10, int i11, int i12, int i13) {
        int iQ0 = Q0(i12, i13);
        String strFindName = this.f54067k0.findName(i10, i11, iQ0);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this.f54068l0;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = Q0(iQ0, i13);
        return L0(3, i13, iArr);
    }

    public final String P0(int[] iArr, int i10, int i11, int i12) {
        if (i10 >= iArr.length) {
            iArr = wb.b.V(iArr.length, iArr);
            this.f54068l0 = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = Q0(i11, i12);
        String strFindName = this.f54067k0.findName(iArr, i13);
        return strFindName == null ? L0(i13, i12, iArr) : strFindName;
    }

    public final String R0(int[] iArr, int i10, int i11, int i12, int i13) throws IOException {
        while (true) {
            if (d.f54030i0[i12] != 0) {
                if (i12 == 34) {
                    break;
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
                            iArr = wb.b.V(iArr.length, iArr);
                            this.f54068l0 = iArr;
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
                                iArr = wb.b.V(iArr.length, iArr);
                                this.f54068l0 = iArr;
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
                    iArr = wb.b.V(iArr.length, iArr);
                    this.f54068l0 = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            i12 = this.f54071o0.readUnsignedByte();
        }
        if (i13 > 0) {
            if (i10 >= iArr.length) {
                iArr = wb.b.V(iArr.length, iArr);
                this.f54068l0 = iArr;
            }
            iArr[i10] = Q0(i11, i13);
            i10++;
        }
        String strFindName = this.f54067k0.findName(iArr, i10);
        return strFindName == null ? L0(i10, i13, iArr) : strFindName;
    }

    public final String S0(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f54068l0;
        iArr[0] = i10;
        iArr[1] = i11;
        return R0(iArr, 2, i12, i13, i14);
    }

    public final void b0(int i10) {
        if (i10 == 93) {
            if (!this.D.inArray()) {
                P(AbstractJsonLexerKt.END_OBJ, i10);
                throw null;
            }
            this.D = this.D.clearAndGetParent();
            u(z.END_ARRAY);
        }
        if (i10 == 125) {
            if (!this.D.inObject()) {
                P(AbstractJsonLexerKt.END_LIST, i10);
                throw null;
            }
            this.D = this.D.clearAndGetParent();
            u(z.END_OBJECT);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        throw wb.b.W(r10, r1, 3, "expected padding character '" + r10.getPaddingChar() + "'");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] c0(ub.b r10) throws java.io.IOException {
        /*
            r9 = this;
            ic.d r0 = r9._getByteArrayBuilder()
        L4:
            java.io.DataInput r1 = r9.f54071o0
            int r2 = r1.readUnsignedByte()
            r3 = 32
            if (r2 <= r3) goto L4
            int r3 = r10.decodeBase64Char(r2)
            r4 = 34
            if (r3 >= 0) goto L25
            if (r2 != r4) goto L1d
            byte[] r10 = r0.toByteArray()
            return r10
        L1d:
            r3 = 0
            int r3 = r9.E(r10, r2, r3)
            if (r3 >= 0) goto L25
            goto L4
        L25:
            int r2 = r1.readUnsignedByte()
            int r5 = r10.decodeBase64Char(r2)
            if (r5 >= 0) goto L34
            r5 = 1
            int r5 = r9.E(r10, r2, r5)
        L34:
            int r2 = r3 << 6
            r2 = r2 | r5
            int r3 = r1.readUnsignedByte()
            int r5 = r10.decodeBase64Char(r3)
            r6 = 3
            r7 = 2
            r8 = -2
            if (r5 >= 0) goto L9f
            if (r5 == r8) goto L65
            if (r3 != r4) goto L61
            int r1 = r2 >> 4
            r0.append(r1)
            boolean r1 = r10.requiresPaddingOnRead()
            if (r1 != 0) goto L58
            byte[] r10 = r0.toByteArray()
            return r10
        L58:
            java.lang.String r10 = r10.missingPaddingMessage()
            ub.q r10 = r9.e(r10)
            throw r10
        L61:
            int r5 = r9.E(r10, r3, r7)
        L65:
            if (r5 != r8) goto L9f
            int r1 = r1.readUnsignedByte()
            boolean r3 = r10.usesPaddingChar(r1)
            if (r3 != 0) goto L98
            r3 = 92
            if (r1 != r3) goto L7c
            int r3 = r9.E(r10, r1, r6)
            if (r3 != r8) goto L7c
            goto L98
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "expected padding character '"
            r0.<init>(r2)
            char r2 = r10.getPaddingChar()
            r0.append(r2)
            java.lang.String r2 = "'"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r10 = wb.b.W(r10, r1, r6, r0)
            throw r10
        L98:
            int r1 = r2 >> 4
            r0.append(r1)
            goto L4
        L9f:
            int r2 = r2 << 6
            r2 = r2 | r5
            int r1 = r1.readUnsignedByte()
            int r3 = r10.decodeBase64Char(r1)
            if (r3 >= 0) goto Ld6
            if (r3 == r8) goto Lcd
            if (r1 != r4) goto Lc9
            int r1 = r2 >> 2
            r0.appendTwoBytes(r1)
            boolean r1 = r10.requiresPaddingOnRead()
            if (r1 != 0) goto Lc0
            byte[] r10 = r0.toByteArray()
            return r10
        Lc0:
            java.lang.String r10 = r10.missingPaddingMessage()
            ub.q r10 = r9.e(r10)
            throw r10
        Lc9:
            int r3 = r9.E(r10, r1, r6)
        Lcd:
            if (r3 != r8) goto Ld6
            int r1 = r2 >> 2
            r0.appendTwoBytes(r1)
            goto L4
        Ld6:
            int r1 = r2 << 6
            r1 = r1 | r3
            r0.appendThreeBytes(r1)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.k.c0(ub.b):byte[]");
    }

    @Override // ec.d, ub.u
    public p currentLocation() {
        return new p(C(), -1L, -1L, this.f90516y, -1);
    }

    @Override // ec.d, ub.u
    public p currentTokenLocation() {
        return new p(C(), -1L, -1L, this.B, -1);
    }

    public final int d0(int i10) throws IOException {
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
                x0(i10 & 255);
                throw null;
            }
            i11 = i10 & 7;
            c10 = 3;
        }
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte & 255);
            throw null;
        }
        int i13 = (i11 << 6) | (unsignedByte & 63);
        if (c10 <= 1) {
            return i13;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte2 & 255);
            throw null;
        }
        int i14 = (i13 << 6) | (unsignedByte2 & 63);
        if (c10 <= 2) {
            return i14;
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) == 128) {
            return (i14 << 6) | (unsignedByte3 & 63);
        }
        y0(unsignedByte3 & 255);
        throw null;
    }

    public final int e0(int i10) throws IOException {
        int unsignedByte = this.f54071o0.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) == 128) {
            return ((i10 & 31) << 6) | (unsignedByte & 63);
        }
        y0(unsignedByte & 255);
        throw null;
    }

    public final int f0(int i10) throws IOException {
        int i11 = i10 & 15;
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte & 255);
            throw null;
        }
        int i12 = (i11 << 6) | (unsignedByte & 63);
        int unsignedByte2 = dataInput.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) == 128) {
            return (i12 << 6) | (unsignedByte2 & 63);
        }
        y0(unsignedByte2 & 255);
        throw null;
    }

    @Override // ub.u
    public void finishToken() throws IOException {
        if (this.f54069m0) {
            this.f54069m0 = false;
            i0();
        }
    }

    public final int g0(int i10) throws IOException {
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte & 255);
            throw null;
        }
        int i11 = ((i10 & 7) << 6) | (unsignedByte & 63);
        int unsignedByte2 = dataInput.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            y0(unsignedByte2 & 255);
            throw null;
        }
        int i12 = (i11 << 6) | (unsignedByte2 & 63);
        int unsignedByte3 = dataInput.readUnsignedByte();
        if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) == 128) {
            return ((i12 << 6) | (unsignedByte3 & 63)) - C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        y0(unsignedByte3 & 255);
        throw null;
    }

    @Override // wb.b, wb.c, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_STRING && (zVar != z.VALUE_EMBEDDED_OBJECT || this.J == null)) {
            throw e("Current token (" + this.f90528g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f54069m0) {
            try {
                this.J = c0(bVar);
                this.f54069m0 = false;
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
        return this.f54071o0;
    }

    @Override // wb.c, ub.u
    public String getText() throws IOException {
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            if (!this.f54069m0) {
                return j0Var.contentsAsString();
            }
            this.f54069m0 = false;
            return h0();
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
            } else if (this.f54069m0) {
                this.f54069m0 = false;
                i0();
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
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            if (this.f54069m0) {
                this.f54069m0 = false;
                i0();
            }
            return j0Var.size();
        }
        if (zVar == z.FIELD_NAME) {
            return this.D.getCurrentName().length();
        }
        if (zVar != null) {
            return zVar.isNumeric() ? j0Var.size() : this.f90528g.asCharArray().length;
        }
        return 0;
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
            boolean r0 = r3.f54069m0
            if (r0 == 0) goto L1d
            r3.f54069m0 = r1
            r3.i0()
        L1d:
            ic.j0 r0 = r3.F
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.k.getTextOffset():int");
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
        if (!this.f54069m0) {
            return this.F.contentsAsString();
        }
        this.f54069m0 = false;
        return h0();
    }

    @Override // ub.u
    public final p h() {
        return currentLocation();
    }

    public final String h0() throws IOException {
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length;
        int i10 = 0;
        while (true) {
            DataInput dataInput = this.f54071o0;
            int unsignedByte = dataInput.readUnsignedByte();
            if (d.f54031j0[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return j0Var.setCurrentAndReturn(i10);
                }
                j0(i10, cArrEmptyAndGetCurrentSegment, unsignedByte);
                return j0Var.contentsAsString();
            }
            int i11 = i10 + 1;
            cArrEmptyAndGetCurrentSegment[i10] = (char) unsignedByte;
            if (i11 >= length) {
                j0(i11, cArrEmptyAndGetCurrentSegment, dataInput.readUnsignedByte());
                return j0Var.contentsAsString();
            }
            i10 = i11;
        }
    }

    public final void i0() throws IOException {
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length;
        int i10 = 0;
        while (true) {
            DataInput dataInput = this.f54071o0;
            int unsignedByte = dataInput.readUnsignedByte();
            if (d.f54031j0[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    j0Var.setCurrentLength(i10);
                    return;
                } else {
                    j0(i10, cArrEmptyAndGetCurrentSegment, unsignedByte);
                    return;
                }
            }
            int i11 = i10 + 1;
            cArrEmptyAndGetCurrentSegment[i10] = (char) unsignedByte;
            if (i11 >= length) {
                j0(i11, cArrEmptyAndGetCurrentSegment, dataInput.readUnsignedByte());
                return;
            }
            i10 = i11;
        }
    }

    public final void j0(int i10, char[] cArr, int i11) throws IOException {
        int length = cArr.length;
        while (true) {
            int i12 = d.f54031j0[i11];
            DataInput dataInput = this.f54071o0;
            int i13 = 0;
            j0 j0Var = this.F;
            if (i12 == 0) {
                if (i10 >= length) {
                    char[] cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                    length = cArrFinishCurrentSegment.length;
                    cArr = cArrFinishCurrentSegment;
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = dataInput.readUnsignedByte();
                i10++;
            } else {
                if (i11 == 34) {
                    j0Var.setCurrentLength(i10);
                    return;
                }
                if (i12 == 1) {
                    i11 = F();
                } else if (i12 == 2) {
                    i11 = e0(i11);
                } else if (i12 == 3) {
                    i11 = f0(i11);
                } else if (i12 == 4) {
                    int iG0 = g0(i11);
                    if (i10 >= cArr.length) {
                        cArr = j0Var.finishCurrentSegment();
                        length = cArr.length;
                        i10 = 0;
                    }
                    cArr[i10] = (char) ((iG0 >> 10) | 55296);
                    i11 = 56320 | (iG0 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
                    i10++;
                } else {
                    if (i11 >= 32) {
                        w0(i11);
                        throw null;
                    }
                    Q(i11, "string value");
                }
                if (i10 >= cArr.length) {
                    char[] cArrFinishCurrentSegment2 = j0Var.finishCurrentSegment();
                    length = cArrFinishCurrentSegment2.length;
                    cArr = cArrFinishCurrentSegment2;
                } else {
                    i13 = i10;
                }
                i10 = i13 + 1;
                cArr[i13] = (char) i11;
                i11 = dataInput.readUnsignedByte();
            }
        }
    }

    public final z k0(int i10, boolean z10, boolean z11) throws IOException {
        String str;
        if (i10 == 73) {
            i10 = this.f54071o0.readUnsignedByte();
            if (i10 == 78) {
                str = z10 ? "-INF" : "+INF";
            } else if (i10 == 110) {
                str = z10 ? "-Infinity" : "+Infinity";
            }
            n0(3, str);
            if ((this.f88362b & d.f54023b0) != 0) {
                return X(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            throw e("Non-standard token '" + str + "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) || !z11 || z10) {
            s(i10, z10 ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
            throw null;
        }
        s(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        throw null;
    }

    public final int l0() throws IOException {
        DataInput dataInput = this.f54071o0;
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte < 48 || unsignedByte > 57) {
            return unsignedByte;
        }
        if ((this.f88362b & d.f54022a0) == 0) {
            w();
            throw null;
        }
        while (unsignedByte == 48) {
            unsignedByte = dataInput.readUnsignedByte();
        }
        return unsignedByte;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r12 != 44) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r11.D.inArray() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r11.D.inRoot() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if ((r11.f88362b & ec.d.f54024c0) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r11.f54072p0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        return ub.z.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z m0(int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.k.m0(int):ub.z");
    }

    public final void n0(int i10, String str) throws IOException {
        DataInput dataInput;
        int length = str.length();
        do {
            dataInput = this.f54071o0;
            int unsignedByte = dataInput.readUnsignedByte();
            if (unsignedByte != str.charAt(i10)) {
                z0(unsignedByte, str.substring(0, i10), R());
                throw null;
            }
            i10++;
        } while (i10 < length);
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            char cD0 = (char) d0(unsignedByte2);
            if (Character.isJavaIdentifierPart(cD0)) {
                z0(cD0, str.substring(0, i10), R());
                throw null;
            }
        }
        this.f54072p0 = unsignedByte2;
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

    @Override // ub.u
    public String nextFieldName() throws IOException {
        z zVarT0;
        this.K = 0;
        z zVar = this.f90528g;
        z zVar2 = z.FIELD_NAME;
        if (zVar == zVar2) {
            o0();
            return null;
        }
        if (this.f54069m0) {
            E0();
        }
        int iI0 = I0();
        this.J = null;
        this.B = this.f90516y;
        if ((iI0 | 32) == 125) {
            b0(iI0);
            return null;
        }
        if (this.D.expectComma()) {
            if (iI0 != 44) {
                r(iI0, "was expecting comma to separate " + this.D.typeDesc() + " entries");
                throw null;
            }
            iI0 = I0();
            if ((this.f88362b & d.Z) != 0 && (iI0 | 32) == 125) {
                b0(iI0);
                return null;
            }
        }
        if (!this.D.inObject()) {
            p0(iI0);
            return null;
        }
        String strS0 = s0(iI0);
        this.D.setCurrentName(strS0);
        u(zVar2);
        int iA0 = A0();
        if (iA0 == 34) {
            this.f54069m0 = true;
            this.E = z.VALUE_STRING;
            return strS0;
        }
        if (iA0 == 43) {
            zVarT0 = isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? t0(false) : m0(iA0);
        } else if (iA0 == 91) {
            zVarT0 = z.START_ARRAY;
        } else if (iA0 == 102) {
            n0(1, "false");
            zVarT0 = z.VALUE_FALSE;
        } else if (iA0 == 110) {
            n0(1, AbstractJsonLexerKt.NULL);
            zVarT0 = z.VALUE_NULL;
        } else if (iA0 == 116) {
            n0(1, "true");
            zVarT0 = z.VALUE_TRUE;
        } else if (iA0 == 123) {
            zVarT0 = z.START_OBJECT;
        } else if (iA0 != 45) {
            if (iA0 != 46) {
                switch (iA0) {
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
                        break;
                    default:
                        zVarT0 = m0(iA0);
                        break;
                }
            } else {
                r0(false);
            }
            zVarT0 = u0(iA0);
        } else {
            zVarT0 = t0(true);
        }
        this.E = zVarT0;
        return strS0;
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
                if (!this.f54069m0) {
                    return this.F.contentsAsString();
                }
                this.f54069m0 = false;
                return h0();
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
        z zVarT0;
        if (this.f90512u) {
            return null;
        }
        if (this.f90528g == z.FIELD_NAME) {
            return o0();
        }
        this.K = 0;
        if (this.f54069m0) {
            E0();
        }
        int unsignedByte = this.f54072p0;
        DataInput dataInput = this.f54071o0;
        int iI0 = -1;
        if (unsignedByte < 0) {
            try {
                unsignedByte = dataInput.readUnsignedByte();
            } catch (EOFException unused) {
                k();
            }
        } else {
            this.f54072p0 = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.f90516y++;
            }
            try {
                unsignedByte = dataInput.readUnsignedByte();
            } catch (EOFException unused2) {
                k();
            }
        }
        iI0 = (unsignedByte == 47 || unsignedByte == 35) ? J0(unsignedByte) : unsignedByte;
        if (iI0 < 0) {
            close();
            this.f90528g = null;
            return null;
        }
        this.J = null;
        this.B = this.f90516y;
        if ((iI0 | 32) == 125) {
            b0(iI0);
            return this.f90528g;
        }
        if (this.D.expectComma()) {
            if (iI0 != 44) {
                r(iI0, "was expecting comma to separate " + this.D.typeDesc() + " entries");
                throw null;
            }
            iI0 = I0();
            if ((this.f88362b & d.Z) != 0 && (iI0 | 32) == 125) {
                b0(iI0);
                return this.f90528g;
            }
        }
        if (!this.D.inObject()) {
            return p0(iI0);
        }
        this.D.setCurrentName(s0(iI0));
        u(z.FIELD_NAME);
        int iA0 = A0();
        if (iA0 == 34) {
            this.f54069m0 = true;
            this.E = z.VALUE_STRING;
            return this.f90528g;
        }
        if (iA0 == 43) {
            zVarT0 = isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? t0(false) : m0(iA0);
        } else if (iA0 == 91) {
            zVarT0 = z.START_ARRAY;
        } else if (iA0 == 102) {
            n0(1, "false");
            zVarT0 = z.VALUE_FALSE;
        } else if (iA0 == 110) {
            n0(1, AbstractJsonLexerKt.NULL);
            zVarT0 = z.VALUE_NULL;
        } else if (iA0 == 116) {
            n0(1, "true");
            zVarT0 = z.VALUE_TRUE;
        } else if (iA0 == 123) {
            zVarT0 = z.START_OBJECT;
        } else if (iA0 == 45) {
            zVarT0 = t0(true);
        } else if (iA0 != 46) {
            switch (iA0) {
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
                    zVarT0 = u0(iA0);
                    break;
                default:
                    zVarT0 = m0(iA0);
                    break;
            }
        } else {
            zVarT0 = r0(false);
        }
        this.E = zVarT0;
        return this.f90528g;
    }

    public final z o0() {
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

    public final z p0(int i10) throws IOException {
        if (i10 == 34) {
            this.f54069m0 = true;
            z zVar = z.VALUE_STRING;
            u(zVar);
            return zVar;
        }
        if (i10 == 43) {
            if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                z zVarT0 = t0(false);
                u(zVarT0);
                return zVarT0;
            }
            z zVarM0 = m0(i10);
            u(zVarM0);
            return zVarM0;
        }
        if (i10 == 91) {
            T(this.B, this.C);
            z zVar2 = z.START_ARRAY;
            u(zVar2);
            return zVar2;
        }
        if (i10 == 102) {
            n0(1, "false");
            z zVar3 = z.VALUE_FALSE;
            u(zVar3);
            return zVar3;
        }
        if (i10 == 110) {
            n0(1, AbstractJsonLexerKt.NULL);
            z zVar4 = z.VALUE_NULL;
            u(zVar4);
            return zVar4;
        }
        if (i10 == 116) {
            n0(1, "true");
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
            z zVarT02 = t0(true);
            u(zVarT02);
            return zVarT02;
        }
        if (i10 == 46) {
            z zVarR0 = r0(false);
            u(zVarR0);
            return zVarR0;
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
                z zVarU0 = u0(i10);
                u(zVarU0);
                return zVarU0;
            default:
                z zVarM02 = m0(i10);
                u(zVarM02);
                return zVarM02;
        }
    }

    public final z q0(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        int i13;
        int unsignedByte;
        DataInput dataInput = this.f54071o0;
        j0 j0Var = this.F;
        int i14 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = j0Var.finishCurrentSegment();
                i10 = 0;
            }
            cArr[i10] = (char) i11;
            i10++;
            int i15 = 0;
            while (true) {
                unsignedByte = dataInput.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                }
                i15++;
                if (i10 >= cArr.length) {
                    cArr = j0Var.finishCurrentSegment();
                    i10 = 0;
                }
                cArr[i10] = (char) unsignedByte;
                i10++;
            }
            if (i15 == 0 && !isEnabled(f.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                s(unsignedByte, "Decimal point not followed by a digit");
                throw null;
            }
            i13 = i15;
            i11 = unsignedByte;
        } else {
            i13 = 0;
        }
        if ((i11 | 32) == 101) {
            if (i10 >= cArr.length) {
                cArr = j0Var.finishCurrentSegment();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) i11;
            int unsignedByte2 = dataInput.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i16 >= cArr.length) {
                    cArr = j0Var.finishCurrentSegment();
                    i16 = 0;
                }
                cArr[i16] = (char) unsignedByte2;
                unsignedByte2 = dataInput.readUnsignedByte();
                i16++;
            }
            i11 = unsignedByte2;
            i10 = i16;
            int i17 = 0;
            while (i11 <= 57 && i11 >= 48) {
                i17++;
                if (i10 >= cArr.length) {
                    cArr = j0Var.finishCurrentSegment();
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = dataInput.readUnsignedByte();
                i10++;
            }
            if (i17 == 0) {
                s(i11, "Exponent indicator not followed by a digit");
                throw null;
            }
            i14 = i17;
        }
        this.f54072p0 = i11;
        if (this.D.inRoot()) {
            K0();
        }
        j0Var.setCurrentLength(i10);
        return Y(i12, i13, i14, z10);
    }

    public final z r0(boolean z10) {
        if (!isEnabled(f.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return m0(46);
        }
        char[] cArrEmptyAndGetCurrentSegment = this.F.emptyAndGetCurrentSegment();
        int i10 = 0;
        if (z10) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i10 = 1;
        }
        return q0(cArrEmptyAndGetCurrentSegment, i10, 46, z10, 0);
    }

    @Override // ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        if (!this.f54069m0 || this.f90528g != z.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(bVar);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        cc.h hVar = this.f90511t;
        byte[] bArrAllocBase64Buffer = hVar.allocBase64Buffer();
        try {
            return v0(bVar, outputStream, bArrAllocBase64Buffer);
        } finally {
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // ub.u
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        return 0;
    }

    public final String s0(int i10) throws IOException {
        int unsignedByte = i10;
        int[] iArr = d.f54030i0;
        int i11 = 0;
        DataInput dataInput = this.f54071o0;
        if (unsignedByte != 34) {
            gc.b bVar = this.f54067k0;
            if (unsignedByte != 39 || (this.f88362b & d.f54026e0) == 0) {
                if ((this.f88362b & d.f54027f0) == 0) {
                    r((char) d0(i10), "was expecting double-quote to start field name");
                    throw null;
                }
                int[] inputCodeUtf8JsNames = cc.d.getInputCodeUtf8JsNames();
                if (inputCodeUtf8JsNames[unsignedByte] != 0) {
                    r(unsignedByte, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                    throw null;
                }
                int i12 = 0;
                int[] iArrV = this.f54068l0;
                int i13 = 0;
                do {
                    if (i11 < 4) {
                        i11++;
                        unsignedByte |= i12 << 8;
                    } else {
                        if (i13 >= iArrV.length) {
                            iArrV = wb.b.V(iArrV.length, iArrV);
                            this.f54068l0 = iArrV;
                        }
                        iArrV[i13] = i12;
                        i13++;
                        i11 = 1;
                    }
                    i12 = unsignedByte;
                    unsignedByte = dataInput.readUnsignedByte();
                } while (inputCodeUtf8JsNames[unsignedByte] == 0);
                this.f54072p0 = unsignedByte;
                if (i11 > 0) {
                    if (i13 >= iArrV.length) {
                        iArrV = wb.b.V(iArrV.length, iArrV);
                        this.f54068l0 = iArrV;
                    }
                    iArrV[i13] = i12;
                    i13++;
                }
                String strFindName = bVar.findName(iArrV, i13);
                return strFindName == null ? L0(i13, i11, iArrV) : strFindName;
            }
            int unsignedByte2 = dataInput.readUnsignedByte();
            if (unsignedByte2 == 39) {
                return "";
            }
            int[] iArrV2 = this.f54068l0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (unsignedByte2 != 39) {
                if (unsignedByte2 != 34 && iArr[unsignedByte2] != 0) {
                    if (unsignedByte2 != 92) {
                        Q(unsignedByte2, "name");
                    } else {
                        unsignedByte2 = F();
                    }
                    if (unsignedByte2 > 127) {
                        if (i14 >= 4) {
                            if (i15 >= iArrV2.length) {
                                iArrV2 = wb.b.V(iArrV2.length, iArrV2);
                                this.f54068l0 = iArrV2;
                            }
                            iArrV2[i15] = i16;
                            i16 = 0;
                            i15++;
                            i14 = 0;
                        }
                        if (unsignedByte2 < 2048) {
                            i16 = (i16 << 8) | (unsignedByte2 >> 6) | PsExtractor.AUDIO_STREAM;
                            i14++;
                        } else {
                            int i17 = (i16 << 8) | (unsignedByte2 >> 12) | 224;
                            int i18 = i14 + 1;
                            if (i18 >= 4) {
                                if (i15 >= iArrV2.length) {
                                    iArrV2 = wb.b.V(iArrV2.length, iArrV2);
                                    this.f54068l0 = iArrV2;
                                }
                                iArrV2[i15] = i17;
                                i17 = 0;
                                i15++;
                                i18 = 0;
                            }
                            i16 = (i17 << 8) | ((unsignedByte2 >> 6) & 63) | 128;
                            i14 = i18 + 1;
                        }
                        unsignedByte2 = (unsignedByte2 & 63) | 128;
                    }
                }
                if (i14 < 4) {
                    i14++;
                    unsignedByte2 |= i16 << 8;
                } else {
                    if (i15 >= iArrV2.length) {
                        iArrV2 = wb.b.V(iArrV2.length, iArrV2);
                        this.f54068l0 = iArrV2;
                    }
                    iArrV2[i15] = i16;
                    i15++;
                    i14 = 1;
                }
                i16 = unsignedByte2;
                unsignedByte2 = dataInput.readUnsignedByte();
            }
            if (i14 > 0) {
                if (i15 >= iArrV2.length) {
                    iArrV2 = wb.b.V(iArrV2.length, iArrV2);
                    this.f54068l0 = iArrV2;
                }
                iArrV2[i15] = Q0(i16, i14);
                i15++;
            }
            String strFindName2 = bVar.findName(iArrV2, i15);
            return strFindName2 == null ? L0(i15, i14, iArrV2) : strFindName2;
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? "" : R0(this.f54068l0, 0, 0, unsignedByte3, 0);
        }
        int unsignedByte4 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? M0(unsignedByte3, 1) : R0(this.f54068l0, 0, unsignedByte3, unsignedByte4, 1);
        }
        int i19 = (unsignedByte3 << 8) | unsignedByte4;
        int unsignedByte5 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte5] != 0) {
            return unsignedByte5 == 34 ? M0(i19, 2) : R0(this.f54068l0, 0, i19, unsignedByte5, 2);
        }
        int i20 = (i19 << 8) | unsignedByte5;
        int unsignedByte6 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte6] != 0) {
            return unsignedByte6 == 34 ? M0(i20, 3) : R0(this.f54068l0, 0, i20, unsignedByte6, 3);
        }
        int i21 = (i20 << 8) | unsignedByte6;
        int unsignedByte7 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte7] != 0) {
            return unsignedByte7 == 34 ? M0(i21, 4) : R0(this.f54068l0, 0, i21, unsignedByte7, 4);
        }
        this.f54070n0 = i21;
        int unsignedByte8 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte8] != 0) {
            if (unsignedByte8 == 34) {
                return N0(this.f54070n0, unsignedByte7, 1);
            }
            int i22 = this.f54070n0;
            int[] iArr2 = this.f54068l0;
            iArr2[0] = i22;
            return R0(iArr2, 1, unsignedByte7, unsignedByte8, 1);
        }
        int i23 = (unsignedByte7 << 8) | unsignedByte8;
        int unsignedByte9 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte9] != 0) {
            if (unsignedByte9 == 34) {
                return N0(this.f54070n0, i23, 2);
            }
            int i24 = this.f54070n0;
            int[] iArr3 = this.f54068l0;
            iArr3[0] = i24;
            return R0(iArr3, 1, i23, unsignedByte9, 2);
        }
        int i25 = (i23 << 8) | unsignedByte9;
        int unsignedByte10 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte10] != 0) {
            if (unsignedByte10 == 34) {
                return N0(this.f54070n0, i25, 3);
            }
            int i26 = this.f54070n0;
            int[] iArr4 = this.f54068l0;
            iArr4[0] = i26;
            return R0(iArr4, 1, i25, unsignedByte10, 3);
        }
        int i27 = (i25 << 8) | unsignedByte10;
        int unsignedByte11 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte11] != 0) {
            if (unsignedByte11 == 34) {
                return N0(this.f54070n0, i27, 4);
            }
            int i28 = this.f54070n0;
            int[] iArr5 = this.f54068l0;
            iArr5[0] = i28;
            return R0(iArr5, 1, i27, unsignedByte11, 4);
        }
        int unsignedByte12 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte12] != 0) {
            return unsignedByte12 == 34 ? O0(this.f54070n0, i27, unsignedByte11, 1) : S0(this.f54070n0, i27, unsignedByte11, unsignedByte12, 1);
        }
        int i29 = (unsignedByte11 << 8) | unsignedByte12;
        int unsignedByte13 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte13] != 0) {
            return unsignedByte13 == 34 ? O0(this.f54070n0, i27, i29, 2) : S0(this.f54070n0, i27, i29, unsignedByte13, 2);
        }
        int i30 = (i29 << 8) | unsignedByte13;
        int unsignedByte14 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte14] != 0) {
            return unsignedByte14 == 34 ? O0(this.f54070n0, i27, i30, 3) : S0(this.f54070n0, i27, i30, unsignedByte14, 3);
        }
        int i31 = (i30 << 8) | unsignedByte14;
        int unsignedByte15 = dataInput.readUnsignedByte();
        if (iArr[unsignedByte15] != 0) {
            return unsignedByte15 == 34 ? O0(this.f54070n0, i27, i31, 4) : S0(this.f54070n0, i27, i31, unsignedByte15, 4);
        }
        int unsignedByte16 = unsignedByte15;
        int[] iArr6 = this.f54068l0;
        iArr6[0] = this.f54070n0;
        iArr6[1] = i27;
        iArr6[2] = i31;
        int i32 = 3;
        while (true) {
            int i33 = unsignedByte16;
            int unsignedByte17 = dataInput.readUnsignedByte();
            if (iArr[unsignedByte17] != 0) {
                return unsignedByte17 == 34 ? P0(this.f54068l0, i32, i33, 1) : R0(this.f54068l0, i32, i33, unsignedByte17, 1);
            }
            int[] iArr7 = iArr;
            int i34 = i32;
            int i35 = (i33 << 8) | unsignedByte17;
            int unsignedByte18 = dataInput.readUnsignedByte();
            if (iArr7[unsignedByte18] != 0) {
                return unsignedByte18 == 34 ? P0(this.f54068l0, i34, i35, 2) : R0(this.f54068l0, i34, i35, unsignedByte18, 2);
            }
            int i36 = (i35 << 8) | unsignedByte18;
            int unsignedByte19 = dataInput.readUnsignedByte();
            if (iArr7[unsignedByte19] != 0) {
                return unsignedByte19 == 34 ? P0(this.f54068l0, i34, i36, 3) : R0(this.f54068l0, i34, i36, unsignedByte19, 3);
            }
            int i37 = (i36 << 8) | unsignedByte19;
            unsignedByte16 = dataInput.readUnsignedByte();
            if (iArr7[unsignedByte16] != 0) {
                return unsignedByte16 == 34 ? P0(this.f54068l0, i34, i37, 4) : R0(this.f54068l0, i34, i37, unsignedByte16, 4);
            }
            int[] iArr8 = this.f54068l0;
            if (i34 >= iArr8.length) {
                this.f54068l0 = wb.b.V(i34, iArr8);
            }
            int i38 = i34 + 1;
            this.f54068l0[i34] = i37;
            iArr = iArr7;
            i32 = i38;
        }
    }

    public final z t0(boolean z10) throws IOException {
        int i10;
        int unsignedByte;
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        int i11 = 1;
        if (z10) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i10 = 1;
        } else {
            i10 = 0;
        }
        DataInput dataInput = this.f54071o0;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i12 = i10 + 1;
        cArrEmptyAndGetCurrentSegment[i10] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                return unsignedByte2 == 46 ? r0(z10) : k0(unsignedByte2, z10, true);
            }
            unsignedByte = l0();
        } else {
            if (unsignedByte2 > 57) {
                return k0(unsignedByte2, z10, true);
            }
            unsignedByte = dataInput.readUnsignedByte();
        }
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i11++;
            if (i12 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = j0Var.finishCurrentSegment();
                i12 = 0;
            }
            cArrEmptyAndGetCurrentSegment[i12] = (char) unsignedByte;
            unsignedByte = dataInput.readUnsignedByte();
            i12++;
        }
        if (unsignedByte == 46 || (unsignedByte | 32) == 101) {
            return q0(cArrEmptyAndGetCurrentSegment, i12, unsignedByte, z10, i11);
        }
        j0Var.setCurrentLength(i12);
        this.f54072p0 = unsignedByte;
        if (this.D.inRoot()) {
            K0();
        }
        return Z(i11, z10);
    }

    public final z u0(int i10) throws IOException {
        int unsignedByte;
        j0 j0Var = this.F;
        char[] cArrEmptyAndGetCurrentSegment = j0Var.emptyAndGetCurrentSegment();
        DataInput dataInput = this.f54071o0;
        int i11 = 1;
        if (i10 == 48) {
            unsignedByte = l0();
            if (unsignedByte <= 57 && unsignedByte >= 48) {
                i11 = 0;
            } else {
                if (unsignedByte == 120 || unsignedByte == 88) {
                    return k0(unsignedByte, false, false);
                }
                cArrEmptyAndGetCurrentSegment[0] = '0';
            }
        } else {
            cArrEmptyAndGetCurrentSegment[0] = (char) i10;
            unsignedByte = dataInput.readUnsignedByte();
        }
        int unsignedByte2 = unsignedByte;
        char[] cArrFinishCurrentSegment = cArrEmptyAndGetCurrentSegment;
        int i12 = i11;
        int i13 = i12;
        while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
            i13++;
            if (i12 >= cArrFinishCurrentSegment.length) {
                cArrFinishCurrentSegment = j0Var.finishCurrentSegment();
                i12 = 0;
            }
            cArrFinishCurrentSegment[i12] = (char) unsignedByte2;
            unsignedByte2 = dataInput.readUnsignedByte();
            i12++;
        }
        if (unsignedByte2 == 46 || (unsignedByte2 | 32) == 101) {
            return q0(cArrFinishCurrentSegment, i12, unsignedByte2, false, i13);
        }
        j0Var.setCurrentLength(i12);
        this.f54072p0 = unsignedByte2;
        if (this.D.inRoot()) {
            K0();
        }
        return Z(i13, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        throw wb.b.W(r13, r5, 3, "expected padding character '" + r13.getPaddingChar() + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r12.f54069m0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r3 <= 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        r4 = r4 + r3;
        r14.write(r15, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v0(ub.b r13, java.io.OutputStream r14, byte[] r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.k.v0(ub.b, java.io.OutputStream, byte[]):int");
    }

    public final void w0(int i10) throws q {
        if (i10 < 32) {
            t(i10);
            throw null;
        }
        x0(i10);
        throw null;
    }

    public final void x0(int i10) throws q {
        throw e("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public final void y0(int i10) throws q {
        throw e("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public final void z0(int i10, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            char cD0 = (char) d0(i10);
            if (!Character.isJavaIdentifierPart(cD0)) {
                throw e("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
            }
            sb2.append(cD0);
            i10 = this.f54071o0.readUnsignedByte();
        }
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
            if (this.f54069m0) {
                this.f54069m0 = false;
                return h0();
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
            if (this.f54069m0) {
                this.f54069m0 = false;
                i0();
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

    @Override // wb.b
    public final void B() {
    }
}
