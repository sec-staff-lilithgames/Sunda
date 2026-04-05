package ec;

import com.amazon.aps.shared.util.APSSharedUtil;
import ic.j0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.a0;
import ub.p;
import ub.q;
import ub.r;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j extends d {

    /* renamed from: k0, reason: collision with root package name */
    public Reader f54058k0;

    /* renamed from: l0, reason: collision with root package name */
    public char[] f54059l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f54060m0;

    /* renamed from: n0, reason: collision with root package name */
    public final gc.e f54061n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f54062o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f54063p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f54064q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f54065r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f54066s0;

    public j(cc.h hVar, int i10, Reader reader, a0 a0Var, gc.e eVar, char[] cArr, int i11, int i12, boolean z10) {
        super(hVar, i10, a0Var);
        this.f54058k0 = reader;
        this.f54059l0 = cArr;
        this.f90513v = i11;
        this.f90514w = i12;
        this.f90517z = i11;
        this.f90515x = -i11;
        this.f54061n0 = eVar;
        this.f54062o0 = eVar.hashSeed();
        this.f54060m0 = z10;
    }

    public final int A0() {
        int i10 = this.f90513v;
        if (i10 + 4 >= this.f90514w) {
            return B0(false);
        }
        char[] cArr = this.f54059l0;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i11 = i10 + 1;
            this.f90513v = i11;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return B0(true);
                }
                this.f90513v = i10 + 2;
                return c11;
            }
            if (c11 == ' ' || c11 == '\t') {
                int i12 = i10 + 2;
                this.f90513v = i12;
                char c12 = cArr[i12];
                if (c12 > ' ') {
                    if (c12 == '/' || c12 == '#') {
                        return B0(true);
                    }
                    this.f90513v = i10 + 3;
                    return c12;
                }
            }
            return B0(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            int i13 = i10 + 1;
            this.f90513v = i13;
            c10 = cArr[i13];
        }
        if (c10 != ':') {
            return B0(false);
        }
        int i14 = this.f90513v;
        int i15 = i14 + 1;
        this.f90513v = i15;
        char c13 = cArr[i15];
        if (c13 > ' ') {
            if (c13 == '/' || c13 == '#') {
                return B0(true);
            }
            this.f90513v = i14 + 2;
            return c13;
        }
        if (c13 == ' ' || c13 == '\t') {
            int i16 = i14 + 2;
            this.f90513v = i16;
            char c14 = cArr[i16];
            if (c14 > ' ') {
                if (c14 == '/' || c14 == '#') {
                    return B0(true);
                }
                this.f90513v = i14 + 3;
                return c14;
            }
        }
        return B0(true);
    }

    @Override // wb.b
    public final void B() throws IOException {
        if (this.f54058k0 != null) {
            if (this.f90511t.isResourceManaged() || isEnabled(r.AUTO_CLOSE_SOURCE)) {
                this.f54058k0.close();
            }
            this.f54058k0 = null;
        }
    }

    public final int B0(boolean z10) {
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                p(" within/between " + this.D.typeDesc() + " entries", null);
                throw null;
            }
            char[] cArr = this.f54059l0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    D0();
                } else if (c10 == '#' && (this.f88362b & d.f54029h0) != 0) {
                    E0();
                } else {
                    if (z10) {
                        return c10;
                    }
                    if (c10 != ':') {
                        r(c10, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z10 = true;
                }
            } else if (c10 >= ' ') {
                continue;
            } else if (c10 == '\n') {
                this.f90516y++;
                this.f90517z = i11;
            } else if (c10 == '\r') {
                z0();
            } else if (c10 != '\t') {
                t(c10);
                throw null;
            }
        }
    }

    public final int C0(int i10) {
        if (i10 != 44) {
            r(i10, "was expecting comma to separate " + this.D.typeDesc() + " entries");
            throw null;
        }
        while (true) {
            int i11 = this.f90513v;
            if (i11 >= this.f90514w) {
                return y0();
            }
            char[] cArr = this.f54059l0;
            int i12 = i11 + 1;
            this.f90513v = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this.f90513v = i11;
                return y0();
            }
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.f90516y++;
                    this.f90517z = i12;
                } else if (c10 == '\r') {
                    z0();
                } else if (c10 != '\t') {
                    t(c10);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        p(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0() {
        /*
            r7 = this;
            int r0 = r7.f88362b
            int r1 = ec.d.f54028g0
            r0 = r0 & r1
            r1 = 47
            r2 = 0
            if (r0 == 0) goto L8f
            int r0 = r7.f90513v
            int r3 = r7.f90514w
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r7.h0()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r7.p(r4, r2)
            throw r2
        L1d:
            char[] r0 = r7.f54059l0
            int r3 = r7.f90513v
            int r5 = r3 + 1
            r7.f90513v = r5
            char r0 = r0[r3]
            if (r0 != r1) goto L2d
            r7.E0()
            return
        L2d:
            r3 = 42
            if (r0 != r3) goto L89
        L31:
            int r0 = r7.f90513v
            int r5 = r7.f90514w
            if (r0 < r5) goto L3d
            boolean r0 = r7.h0()
            if (r0 == 0) goto L56
        L3d:
            char[] r0 = r7.f54059l0
            int r5 = r7.f90513v
            int r6 = r5 + 1
            r7.f90513v = r6
            char r0 = r0[r5]
            if (r0 > r3) goto L31
            if (r0 != r3) goto L67
            int r0 = r7.f90514w
            if (r6 < r0) goto L5a
            boolean r0 = r7.h0()
            if (r0 == 0) goto L56
            goto L5a
        L56:
            r7.p(r4, r2)
            throw r2
        L5a:
            char[] r0 = r7.f54059l0
            int r5 = r7.f90513v
            char r0 = r0[r5]
            if (r0 != r1) goto L31
            int r5 = r5 + 1
            r7.f90513v = r5
            return
        L67:
            r5 = 32
            if (r0 >= r5) goto L31
            r5 = 10
            if (r0 != r5) goto L78
            int r0 = r7.f90516y
            int r0 = r0 + 1
            r7.f90516y = r0
            r7.f90517z = r6
            goto L31
        L78:
            r5 = 13
            if (r0 != r5) goto L80
            r7.z0()
            goto L31
        L80:
            r5 = 9
            if (r0 != r5) goto L85
            goto L31
        L85:
            r7.t(r0)
            throw r2
        L89:
            java.lang.String r1 = "was expecting either '*' or '/' for a comment"
            r7.r(r0, r1)
            throw r2
        L8f:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r7.r(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.D0():void");
    }

    public final void E0() {
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                return;
            }
            char[] cArr = this.f54059l0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            char c10 = cArr[i10];
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.f90516y++;
                    this.f90517z = i11;
                    return;
                } else if (c10 == '\r') {
                    z0();
                    return;
                } else if (c10 != '\t') {
                    t(c10);
                    throw null;
                }
            }
        }
    }

    @Override // wb.b
    public final char F() {
        if (this.f90513v >= this.f90514w && !h0()) {
            p(" in character escape sequence", z.VALUE_STRING);
            throw null;
        }
        char[] cArr = this.f54059l0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            L(c10);
            return c10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.f90513v >= this.f90514w && !h0()) {
                p(" in character escape sequence", z.VALUE_STRING);
                throw null;
            }
            char[] cArr2 = this.f54059l0;
            int i13 = this.f90513v;
            this.f90513v = i13 + 1;
            char c11 = cArr2[i13];
            int iCharToHex = cc.d.charToHex(c11);
            if (iCharToHex < 0) {
                r(c11, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i11 = (i11 << 4) | iCharToHex;
        }
        return (char) i11;
    }

    public final void F0() {
        this.f54063p0 = false;
        int i10 = this.f90513v;
        int i11 = this.f90514w;
        char[] cArr = this.f54059l0;
        while (true) {
            if (i10 >= i11) {
                this.f90513v = i10;
                if (!h0()) {
                    p(": was expecting closing quote for a string value", z.VALUE_STRING);
                    throw null;
                }
                i10 = this.f90513v;
                i11 = this.f90514w;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this.f90513v = i12;
                    F();
                    i10 = this.f90513v;
                    i11 = this.f90514w;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this.f90513v = i12;
                        return;
                    } else if (c10 < ' ') {
                        this.f90513v = i12;
                        Q(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    public final int G0() {
        if (this.f90513v >= this.f90514w && !h0()) {
            k();
            return -1;
        }
        char[] cArr = this.f54059l0;
        int i10 = this.f90513v;
        int i11 = i10 + 1;
        this.f90513v = i11;
        char c10 = cArr[i10];
        if (c10 > ' ') {
            if (c10 != '/' && c10 != '#') {
                return c10;
            }
            this.f90513v = i10;
            return H0();
        }
        if (c10 != ' ') {
            if (c10 == '\n') {
                this.f90516y++;
                this.f90517z = i11;
            } else if (c10 == '\r') {
                z0();
            } else if (c10 != '\t' && !a0(c10)) {
                t(c10);
                throw null;
            }
        }
        while (true) {
            int i12 = this.f90513v;
            if (i12 >= this.f90514w) {
                return H0();
            }
            char[] cArr2 = this.f54059l0;
            int i13 = i12 + 1;
            this.f90513v = i13;
            char c11 = cArr2[i12];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this.f90513v = i12;
                return H0();
            }
            if (c11 != ' ') {
                if (c11 == '\n') {
                    this.f90516y++;
                    this.f90517z = i13;
                } else if (c11 == '\r') {
                    z0();
                } else if (c11 != '\t' && !a0(c11)) {
                    t(c11);
                    throw null;
                }
            }
        }
    }

    public final int H0() {
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                k();
                return -1;
            }
            char[] cArr = this.f54059l0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    D0();
                } else {
                    if (c10 != '#') {
                        return c10;
                    }
                    if ((this.f88362b & d.f54029h0) == 0) {
                        return c10;
                    }
                    E0();
                }
            } else if (c10 == ' ') {
                continue;
            } else if (c10 == '\n') {
                this.f90516y++;
                this.f90517z = i11;
            } else if (c10 == '\r') {
                z0();
            } else if (c10 != '\t') {
                t(c10);
                throw null;
            }
        }
    }

    public final void I0() {
        int i10 = this.f90513v;
        this.A = this.f90515x + i10;
        this.B = this.f90516y;
        this.C = i10 - this.f90517z;
    }

    public final void J0(int i10) {
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

    public final char K0(String str, z zVar) {
        if (this.f90513v >= this.f90514w && !h0()) {
            p(str, zVar);
            throw null;
        }
        char[] cArr = this.f54059l0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        return cArr[i10];
    }

    @Override // wb.b
    public final void O() {
        char[] cArr;
        super.O();
        this.f54061n0.release();
        if (!this.f54060m0 || (cArr = this.f54059l0) == null) {
            return;
        }
        this.f54059l0 = null;
        this.f90511t.releaseTokenBuffer(cArr);
    }

    public final void b0(int i10) {
        if (i10 == 93) {
            I0();
            if (!this.D.inArray()) {
                P(AbstractJsonLexerKt.END_OBJ, i10);
                throw null;
            }
            this.D = this.D.clearAndGetParent();
            u(z.END_ARRAY);
        }
        if (i10 == 125) {
            I0();
            if (!this.D.inObject()) {
                P(AbstractJsonLexerKt.END_LIST, i10);
                throw null;
            }
            this.D = this.D.clearAndGetParent();
            u(z.END_OBJECT);
        }
    }

    public final byte[] c0(ub.b bVar) throws q {
        ic.d dVar_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this.f90513v >= this.f90514w) {
                i0();
            }
            char[] cArr = this.f54059l0;
            int i10 = this.f90513v;
            this.f90513v = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int iDecodeBase64Char = bVar.decodeBase64Char(c10);
                if (iDecodeBase64Char < 0) {
                    if (c10 == '\"') {
                        return dVar_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = D(bVar, c10, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.f90513v >= this.f90514w) {
                    i0();
                }
                char[] cArr2 = this.f54059l0;
                int i11 = this.f90513v;
                this.f90513v = i11 + 1;
                char c11 = cArr2[i11];
                int iDecodeBase64Char2 = bVar.decodeBase64Char(c11);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = D(bVar, c11, 1);
                }
                int i12 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.f90513v >= this.f90514w) {
                    i0();
                }
                char[] cArr3 = this.f54059l0;
                int i13 = this.f90513v;
                this.f90513v = i13 + 1;
                char c12 = cArr3[i13];
                int iDecodeBase64Char3 = bVar.decodeBase64Char(c12);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c12 == '\"') {
                            dVar_getByteArrayBuilder.append(i12 >> 4);
                            if (!bVar.requiresPaddingOnRead()) {
                                return dVar_getByteArrayBuilder.toByteArray();
                            }
                            this.f90513v--;
                            throw e(bVar.missingPaddingMessage());
                        }
                        iDecodeBase64Char3 = D(bVar, c12, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.f90513v >= this.f90514w) {
                            i0();
                        }
                        char[] cArr4 = this.f54059l0;
                        int i14 = this.f90513v;
                        this.f90513v = i14 + 1;
                        char c13 = cArr4[i14];
                        if (!bVar.usesPaddingChar(c13) && D(bVar, c13, 3) != -2) {
                            throw wb.b.W(bVar, c13, 3, "expected padding character '" + bVar.getPaddingChar() + "'");
                        }
                        dVar_getByteArrayBuilder.append(i12 >> 4);
                    }
                }
                int i15 = (i12 << 6) | iDecodeBase64Char3;
                if (this.f90513v >= this.f90514w) {
                    i0();
                }
                char[] cArr5 = this.f54059l0;
                int i16 = this.f90513v;
                this.f90513v = i16 + 1;
                char c14 = cArr5[i16];
                int iDecodeBase64Char4 = bVar.decodeBase64Char(c14);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c14 == '\"') {
                            dVar_getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                            if (!bVar.requiresPaddingOnRead()) {
                                return dVar_getByteArrayBuilder.toByteArray();
                            }
                            this.f90513v--;
                            throw e(bVar.missingPaddingMessage());
                        }
                        iDecodeBase64Char4 = D(bVar, c14, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        dVar_getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                    }
                }
                dVar_getByteArrayBuilder.appendThreeBytes((i15 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // ec.d, ub.u
    public p currentLocation() {
        return new p(C(), -1L, this.f90513v + this.f90515x, this.f90516y, (this.f90513v - this.f90517z) + 1);
    }

    @Override // ec.d, ub.u
    public p currentTokenLocation() {
        if (this.f90528g != z.FIELD_NAME) {
            return new p(C(), -1L, this.A - 1, this.B, this.C);
        }
        return new p(C(), -1L, (this.f54064q0 - 1) + this.f90515x, this.f54065r0, this.f54066s0);
    }

    public final void d0() throws IOException {
        int i10 = this.f90513v;
        int i11 = this.f90514w;
        int[] iArr = d.f54030i0;
        j0 j0Var = this.F;
        if (i10 < i11) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.f54059l0;
                char c10 = cArr[i10];
                if (c10 >= length || iArr[c10] == 0) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                } else if (c10 == '\"') {
                    int i12 = this.f90513v;
                    j0Var.resetWithShared(cArr, i12, i10 - i12);
                    this.f90513v = i10 + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.f54059l0;
        int i13 = this.f90513v;
        j0Var.resetWithCopy(cArr2, i13, i10 - i13);
        this.f90513v = i10;
        char[] currentSegment = j0Var.getCurrentSegment();
        int currentSegmentSize = j0Var.getCurrentSegmentSize();
        int length2 = iArr.length;
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                p(": was expecting closing quote for a string value", z.VALUE_STRING);
                throw null;
            }
            char[] cArr3 = this.f54059l0;
            int i14 = this.f90513v;
            this.f90513v = i14 + 1;
            char cF = cArr3[i14];
            if (cF < length2 && iArr[cF] != 0) {
                if (cF == '\"') {
                    j0Var.setCurrentLength(currentSegmentSize);
                    return;
                } else if (cF == '\\') {
                    cF = F();
                } else if (cF < ' ') {
                    Q(cF, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = j0Var.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = cF;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final ub.z e0(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f0(int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.f0(int):java.lang.String");
    }

    @Override // ub.u
    public void finishToken() throws IOException {
        if (this.f54063p0) {
            this.f54063p0 = false;
            d0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z g0(int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.g0(int):ub.z");
    }

    @Override // wb.b, wb.c, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        byte[] bArr;
        z zVar = this.f90528g;
        if (zVar == z.VALUE_EMBEDDED_OBJECT && (bArr = this.J) != null) {
            return bArr;
        }
        if (zVar != z.VALUE_STRING) {
            throw e("Current token (" + this.f90528g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f54063p0) {
            try {
                this.J = c0(bVar);
                this.f54063p0 = false;
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
        return this.f54058k0;
    }

    @Override // wb.c, ub.u
    public final String getText() throws IOException {
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_STRING;
        j0 j0Var = this.F;
        if (zVar == zVar2) {
            if (this.f54063p0) {
                this.f54063p0 = false;
                d0();
            }
            return j0Var.contentsAsString();
        }
        if (zVar == null) {
            return null;
        }
        int iId = zVar.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? j0Var.contentsAsString() : zVar.asString() : this.D.getCurrentName();
    }

    @Override // wb.c, ub.u
    public final char[] getTextCharacters() throws IOException {
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
            } else if (this.f54063p0) {
                this.f54063p0 = false;
                d0();
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
    public final int getTextLength() throws IOException {
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
        } else if (this.f54063p0) {
            this.f54063p0 = false;
            d0();
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
    public final int getTextOffset() throws java.io.IOException {
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
            boolean r0 = r3.f54063p0
            if (r0 == 0) goto L1d
            r3.f54063p0 = r1
            r3.d0()
        L1d:
            ic.j0 r0 = r3.F
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.getTextOffset():int");
    }

    @Override // wb.c, ub.u
    public final String getValueAsString() throws IOException {
        z zVar = this.f90528g;
        if (zVar != z.VALUE_STRING) {
            return zVar == z.FIELD_NAME ? currentName() : super.getValueAsString(null);
        }
        if (this.f54063p0) {
            this.f54063p0 = false;
            d0();
        }
        return this.F.contentsAsString();
    }

    @Override // ub.u
    public final p h() {
        int i10 = this.f90513v - 1;
        return new p(C(), -1L, this.f90515x + i10, this.f90516y, (i10 - this.f90517z) + 1);
    }

    public final boolean h0() throws IOException {
        if (this.f54058k0 != null) {
            int i10 = this.f90514w;
            long j10 = i10;
            long j11 = this.f90515x + j10;
            this.f90515x = j11;
            this.f90517z -= i10;
            this.f90527f.validateDocumentLength(j11);
            Reader reader = this.f54058k0;
            char[] cArr = this.f54059l0;
            int i11 = reader.read(cArr, 0, cArr.length);
            if (i11 > 0) {
                this.f54064q0 -= j10;
                this.f90513v = 0;
                this.f90514w = i11;
                return true;
            }
            this.f90514w = 0;
            this.f90513v = 0;
            B();
            if (i11 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f90514w);
            }
        }
        return false;
    }

    public final void i0() {
        if (h0()) {
            return;
        }
        o();
        throw null;
    }

    public final void j0() throws q {
        int i10;
        char c10;
        int i11 = this.f90513v;
        if (i11 + 4 < this.f90514w) {
            char[] cArr = this.f54059l0;
            if (cArr[i11] == 'a' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 's' && cArr[i11 + 3] == 'e' && ((c10 = cArr[(i10 = i11 + 4)]) < '0' || c10 == ']' || c10 == '}')) {
                this.f90513v = i10;
                return;
            }
        }
        l0(1, "false");
    }

    public final void k0() throws q {
        int i10;
        char c10;
        int i11 = this.f90513v;
        if (i11 + 3 < this.f90514w) {
            char[] cArr = this.f54059l0;
            if (cArr[i11] == 'u' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 'l' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.f90513v = i10;
                return;
            }
        }
        l0(1, AbstractJsonLexerKt.NULL);
    }

    public final void l0(int i10, String str) throws q {
        int i11;
        char c10;
        int length = str.length();
        if (this.f90513v + length < this.f90514w) {
            while (this.f54059l0[this.f90513v] == str.charAt(i10)) {
                int i12 = this.f90513v + 1;
                this.f90513v = i12;
                i10++;
                if (i10 >= length) {
                    char c11 = this.f54059l0[i12];
                    if (c11 < '0' || c11 == ']' || c11 == '}' || !Character.isJavaIdentifierPart(c11)) {
                        return;
                    }
                    x0(str.substring(0, i10), R());
                    throw null;
                }
            }
            x0(str.substring(0, i10), R());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.f90513v >= this.f90514w && !h0()) || this.f54059l0[this.f90513v] != str.charAt(i10)) {
                x0(str.substring(0, i10), R());
                throw null;
            }
            i11 = this.f90513v + 1;
            this.f90513v = i11;
            i10++;
        } while (i10 < length2);
        if ((i11 < this.f90514w || h0()) && (c10 = this.f54059l0[this.f90513v]) >= '0' && c10 != ']' && c10 != '}' && Character.isJavaIdentifierPart(c10)) {
            x0(str.substring(0, i10), R());
            throw null;
        }
    }

    public final void m0() throws q {
        int i10;
        char c10;
        int i11 = this.f90513v;
        if (i11 + 3 < this.f90514w) {
            char[] cArr = this.f54059l0;
            if (cArr[i11] == 'r' && cArr[i11 + 1] == 'u' && cArr[i11 + 2] == 'e' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.f90513v = i10;
                return;
            }
        }
        l0(1, "true");
    }

    public final z n0() {
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

    @Override // ub.u
    public final Boolean nextBooleanValue() throws IOException {
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
            if (zVarNextToken != null) {
                int iId = zVarNextToken.id();
                if (iId == 9) {
                    return Boolean.TRUE;
                }
                if (iId == 10) {
                    return Boolean.FALSE;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[PHI: r1
      0x00c8: PHI (r1v44 int) = (r1v43 int), (r1v42 int), (r1v42 int), (r1v42 int) binds: [B:51:0x00c7, B:45:0x00b8, B:41:0x00ae, B:42:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ub.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean nextFieldName(ub.c0 r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.nextFieldName(ub.c0):boolean");
    }

    @Override // ub.u
    public final int nextIntValue(int i10) throws IOException {
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
    public final long nextLongValue(long j10) throws IOException {
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
    public final String nextTextValue() throws IOException {
        if (this.f90528g == z.FIELD_NAME) {
            this.H = false;
            z zVar = this.E;
            this.E = null;
            u(zVar);
            if (zVar == z.VALUE_STRING) {
                if (this.f54063p0) {
                    this.f54063p0 = false;
                    d0();
                }
                return this.F.contentsAsString();
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
    public final z nextToken() throws IOException {
        z zVarU0;
        z zVar = this.f90528g;
        z zVar2 = z.FIELD_NAME;
        if (zVar == zVar2) {
            return n0();
        }
        this.K = 0;
        if (this.f54063p0) {
            F0();
        }
        int iG0 = G0();
        if (iG0 < 0) {
            close();
            this.f90528g = null;
            return null;
        }
        this.J = null;
        if ((iG0 | 32) == 125) {
            b0(iG0);
            return this.f90528g;
        }
        if (this.D.expectComma()) {
            iG0 = C0(iG0);
            if ((this.f88362b & d.Z) != 0 && (iG0 | 32) == 125) {
                b0(iG0);
                return this.f90528g;
            }
        }
        boolean zInObject = this.D.inObject();
        if (zInObject) {
            int i10 = this.f90513v;
            this.f54064q0 = i10;
            this.f54065r0 = this.f90516y;
            this.f54066s0 = i10 - this.f90517z;
            this.D.setCurrentName(iG0 == 34 ? r0() : f0(iG0));
            u(zVar2);
            iG0 = A0();
        }
        I0();
        if (iG0 == 34) {
            this.f54063p0 = true;
            zVarU0 = z.VALUE_STRING;
        } else if (iG0 == 43) {
            zVarU0 = isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? u0(false) : g0(iG0);
        } else if (iG0 == 91) {
            if (!zInObject) {
                T(this.B, this.C);
            }
            zVarU0 = z.START_ARRAY;
        } else if (iG0 == 102) {
            j0();
            zVarU0 = z.VALUE_FALSE;
        } else if (iG0 == 110) {
            k0();
            zVarU0 = z.VALUE_NULL;
        } else if (iG0 == 116) {
            m0();
            zVarU0 = z.VALUE_TRUE;
        } else if (iG0 == 123) {
            if (!zInObject) {
                U(this.B, this.C);
            }
            zVarU0 = z.START_OBJECT;
        } else {
            if (iG0 == 125) {
                r(iG0, "expected a value");
                throw null;
            }
            if (iG0 == 45) {
                zVarU0 = u0(true);
            } else if (iG0 != 46) {
                switch (iG0) {
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
                        zVarU0 = v0(iG0);
                        break;
                    default:
                        zVarU0 = g0(iG0);
                        break;
                }
            } else {
                zVarU0 = q0(false);
            }
        }
        if (zInObject) {
            this.E = zVarU0;
            return this.f90528g;
        }
        u(zVarU0);
        return zVarU0;
    }

    public final void o0(int i10) throws q {
        if (i10 == 34) {
            this.f54063p0 = true;
            u(z.VALUE_STRING);
            return;
        }
        if (i10 == 91) {
            T(this.B, this.C);
            u(z.START_ARRAY);
            return;
        }
        if (i10 == 102) {
            l0(1, "false");
            u(z.VALUE_FALSE);
            return;
        }
        if (i10 == 110) {
            l0(1, AbstractJsonLexerKt.NULL);
            u(z.VALUE_NULL);
            return;
        }
        if (i10 == 116) {
            l0(1, "true");
            u(z.VALUE_TRUE);
            return;
        }
        if (i10 == 123) {
            U(this.B, this.C);
            u(z.START_OBJECT);
            return;
        }
        switch (i10) {
            case 44:
                if (!this.D.inRoot() && (this.f88362b & d.f54024c0) != 0) {
                    this.f90513v--;
                    u(z.VALUE_NULL);
                    return;
                }
                break;
            case 45:
                u(u0(true));
                return;
            case 46:
                u(q0(false));
                return;
            default:
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
                        u(v0(i10));
                        break;
                }
                return;
        }
        u(g0(i10));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v18 ??, r11v2 ??, r11v9 ??, r11v8 ??, r11v6 ??, r11v13 ??, r11v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final ub.z p0(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v18 ??, r11v2 ??, r11v9 ??, r11v8 ??, r11v6 ??, r11v13 ??, r11v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    public final z q0(boolean z10) {
        if (!isEnabled(f.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return g0(46);
        }
        int i10 = this.f90513v;
        int i11 = i10 - 1;
        if (z10) {
            i11 = i10 - 2;
        }
        return p0(46, i11, i10, 0, z10);
    }

    public final String r0() {
        int i10 = this.f90513v;
        int i11 = this.f54062o0;
        while (true) {
            if (i10 >= this.f90514w) {
                break;
            }
            char[] cArr = this.f54059l0;
            char c10 = cArr[i10];
            int[] iArr = d.f54030i0;
            if (c10 >= iArr.length || iArr[c10] == 0) {
                i11 = (i11 * 33) + c10;
                i10++;
            } else if (c10 == '\"') {
                int i12 = this.f90513v;
                this.f90513v = i10 + 1;
                return this.f54061n0.findSymbol(cArr, i12, i10 - i12, i11);
            }
        }
        int i13 = this.f90513v;
        this.f90513v = i10;
        return s0(i13, i11, 34);
    }

    @Override // ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        if (!this.f54063p0 || this.f90528g != z.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(bVar);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        cc.h hVar = this.f90511t;
        byte[] bArrAllocBase64Buffer = hVar.allocBase64Buffer();
        try {
            return w0(bVar, outputStream, bArrAllocBase64Buffer);
        } finally {
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // ub.u
    public int releaseBuffered(Writer writer) throws IOException {
        int i10 = this.f90514w;
        int i11 = this.f90513v;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        this.f90513v = i11 + i12;
        writer.write(this.f54059l0, i11, i12);
        return i12;
    }

    public final String s0(int i10, int i11, int i12) throws IOException {
        char[] cArr = this.f54059l0;
        int i13 = this.f90513v - i10;
        j0 j0Var = this.F;
        j0Var.resetWithShared(cArr, i10, i13);
        char[] currentSegment = j0Var.getCurrentSegment();
        int currentSegmentSize = j0Var.getCurrentSegmentSize();
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                p(" in field name", z.FIELD_NAME);
                throw null;
            }
            char[] cArr2 = this.f54059l0;
            int i14 = this.f90513v;
            this.f90513v = i14 + 1;
            char cF = cArr2[i14];
            if (cF <= '\\') {
                if (cF == '\\') {
                    cF = F();
                } else if (cF <= i12) {
                    if (cF == i12) {
                        j0Var.setCurrentLength(currentSegmentSize);
                        return this.f54061n0.findSymbol(j0Var.getTextBuffer(), j0Var.getTextOffset(), j0Var.size(), i11);
                    }
                    if (cF < ' ') {
                        Q(cF, "name");
                    }
                }
            }
            i11 = (i11 * 33) + cF;
            int i15 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = cF;
            if (i15 >= currentSegment.length) {
                currentSegment = j0Var.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i15;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[EDGE_INSN: B:21:0x004a->B:47:0x008e BREAK  A[LOOP:0: B:34:0x006c->B:148:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.z t0(int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.t0(int, boolean):ub.z");
    }

    public final z u0(boolean z10) {
        int i10 = this.f90513v;
        int i11 = z10 ? i10 - 1 : i10;
        int i12 = this.f90514w;
        if (i10 >= i12) {
            return t0(i11, z10);
        }
        int i13 = i10 + 1;
        char c10 = this.f54059l0[i10];
        char c11 = '9';
        int i14 = 1;
        if (c10 > '9' || c10 < '0') {
            this.f90513v = i13;
            return c10 == '.' ? q0(z10) : e0(c10, z10, true);
        }
        if (c10 == '0') {
            return t0(i11, z10);
        }
        while (i13 < i12) {
            char c12 = c11;
            int i15 = i13 + 1;
            char c13 = this.f54059l0[i13];
            if (c13 < '0' || c13 > c12) {
                if (c13 == '.' || (c13 | ' ') == 101) {
                    this.f90513v = i15;
                    return p0(c13, i11, i15, i14, z10);
                }
                this.f90513v = i13;
                if (this.D.inRoot()) {
                    J0(c13);
                }
                this.F.resetWithShared(this.f54059l0, i11, i13 - i11);
                return Z(i14, z10);
            }
            i14++;
            i13 = i15;
            c11 = c12;
        }
        return t0(i11, z10);
    }

    public final z v0(int i10) {
        int i11 = this.f90513v;
        int i12 = i11 - 1;
        int i13 = this.f90514w;
        char c10 = '0';
        if (i10 == 48) {
            return t0(i12, false);
        }
        int i14 = 1;
        while (i11 < i13) {
            char c11 = c10;
            int i15 = i11 + 1;
            char c12 = this.f54059l0[i11];
            if (c12 < c11 || c12 > '9') {
                if (c12 == '.' || (c12 | ' ') == 101) {
                    this.f90513v = i15;
                    return p0(c12, i12, i15, i14, false);
                }
                this.f90513v = i11;
                if (this.D.inRoot()) {
                    J0(c12);
                }
                this.F.resetWithShared(this.f54059l0, i12, i11 - i12);
                return Z(i14, false);
            }
            i14++;
            i11 = i15;
            c10 = c11;
        }
        this.f90513v = i12;
        return t0(i12, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        r17.f54063p0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
    
        if (r7 <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        r8 = r8 + r7;
        r19.write(r20, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w0(ub.b r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.j.w0(ub.b, java.io.OutputStream, byte[]):int");
    }

    public final void x0(String str, String str2) throws q {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                break;
            }
            char c10 = this.f54059l0[this.f90513v];
            if (!Character.isJavaIdentifierPart(c10)) {
                break;
            }
            this.f90513v++;
            sb2.append(c10);
            if (sb2.length() >= this.f90511t.errorReportConfiguration().getMaxErrorTokenLength()) {
                sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                break;
            }
        }
        throw e("Unrecognized token '" + ((Object) sb2) + "': was expecting " + str2);
    }

    public final int y0() throws q {
        while (true) {
            if (this.f90513v >= this.f90514w && !h0()) {
                throw e("Unexpected end-of-input within/between " + this.D.typeDesc() + " entries");
            }
            char[] cArr = this.f54059l0;
            int i10 = this.f90513v;
            int i11 = i10 + 1;
            this.f90513v = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    D0();
                } else {
                    if (c10 != '#') {
                        return c10;
                    }
                    if ((this.f88362b & d.f54029h0) == 0) {
                        return c10;
                    }
                    E0();
                }
            } else if (c10 >= ' ') {
                continue;
            } else if (c10 == '\n') {
                this.f90516y++;
                this.f90517z = i11;
            } else if (c10 == '\r') {
                z0();
            } else if (c10 != '\t') {
                t(c10);
                throw null;
            }
        }
    }

    public final void z0() {
        if (this.f90513v < this.f90514w || h0()) {
            char[] cArr = this.f54059l0;
            int i10 = this.f90513v;
            if (cArr[i10] == '\n') {
                this.f90513v = i10 + 1;
            }
        }
        this.f90516y++;
        this.f90517z = this.f90513v;
    }

    @Override // wb.c, ub.u
    public final String getValueAsString(String str) throws IOException {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_STRING) {
            if (this.f54063p0) {
                this.f54063p0 = false;
                d0();
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
            if (this.f54063p0) {
                this.f54063p0 = false;
                d0();
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

    public j(cc.h hVar, int i10, Reader reader, a0 a0Var, gc.e eVar) {
        super(hVar, i10, a0Var);
        this.f54058k0 = reader;
        this.f54059l0 = hVar.allocTokenBuffer();
        this.f90513v = 0;
        this.f90514w = 0;
        this.f54061n0 = eVar;
        this.f54062o0 = eVar.hashSeed();
        this.f54060m0 = true;
    }

    @Override // ub.u
    public String nextFieldName() throws IOException {
        z zVarG0;
        this.K = 0;
        z zVar = this.f90528g;
        z zVar2 = z.FIELD_NAME;
        if (zVar == zVar2) {
            n0();
            return null;
        }
        if (this.f54063p0) {
            F0();
        }
        int iG0 = G0();
        if (iG0 < 0) {
            close();
            this.f90528g = null;
            return null;
        }
        this.J = null;
        if ((iG0 | 32) == 125) {
            b0(iG0);
            return null;
        }
        if (this.D.expectComma()) {
            iG0 = C0(iG0);
            if ((this.f88362b & d.Z) != 0 && (iG0 | 32) == 125) {
                b0(iG0);
                return null;
            }
        }
        if (!this.D.inObject()) {
            I0();
            o0(iG0);
            return null;
        }
        int i10 = this.f90513v;
        this.f54064q0 = i10;
        this.f54065r0 = this.f90516y;
        this.f54066s0 = i10 - this.f90517z;
        String strR0 = iG0 == 34 ? r0() : f0(iG0);
        this.D.setCurrentName(strR0);
        u(zVar2);
        int iA0 = A0();
        I0();
        if (iA0 == 34) {
            this.f54063p0 = true;
            this.E = z.VALUE_STRING;
            return strR0;
        }
        if (iA0 != 43) {
            if (iA0 == 91) {
                zVarG0 = z.START_ARRAY;
            } else if (iA0 == 102) {
                j0();
                zVarG0 = z.VALUE_FALSE;
            } else if (iA0 == 110) {
                k0();
                zVarG0 = z.VALUE_NULL;
            } else if (iA0 == 116) {
                m0();
                zVarG0 = z.VALUE_TRUE;
            } else if (iA0 == 123) {
                zVarG0 = z.START_OBJECT;
            } else if (iA0 == 45) {
                zVarG0 = u0(true);
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
                        zVarG0 = v0(iA0);
                        break;
                    default:
                        zVarG0 = g0(iA0);
                        break;
                }
            } else {
                zVarG0 = q0(false);
            }
        } else if (isEnabled(f.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            zVarG0 = u0(false);
        } else {
            zVarG0 = g0(iA0);
        }
        this.E = zVarG0;
        return strR0;
    }
}
