package ec;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.util.date.GMTDateParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.a0;
import ub.b0;
import ub.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends c {
    public static final char[] E = cc.d.copyHexChars(true);
    public static final char[] F = cc.d.copyHexChars(false);
    public final int A;
    public char[] B;
    public c0 C;
    public char[] D;

    /* renamed from: v, reason: collision with root package name */
    public final Writer f54087v;

    /* renamed from: w, reason: collision with root package name */
    public final char f54088w;

    /* renamed from: x, reason: collision with root package name */
    public char[] f54089x;

    /* renamed from: y, reason: collision with root package name */
    public int f54090y;

    /* renamed from: z, reason: collision with root package name */
    public int f54091z;

    @Deprecated
    public n(cc.h hVar, int i10, a0 a0Var, Writer writer) {
        this(hVar, i10, a0Var, writer, AbstractJsonLexerKt.STRING);
    }

    public static int w(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14 = 0;
        while (i10 < i11) {
            bArr[i14] = bArr[i10];
            i14++;
            i10++;
        }
        int iMin = Math.min(i12, bArr.length);
        do {
            int i15 = iMin - i14;
            if (i15 == 0 || (i13 = inputStream.read(bArr, i14, i15)) < 0) {
                return i14;
            }
            i14 += i13;
        } while (i14 < 3);
        return i14;
    }

    public final void A(String str) throws IOException {
        int i10 = this.f54091z;
        int i11 = this.A;
        if (i10 >= i11) {
            t();
        }
        char[] cArr = this.f54089x;
        int i12 = this.f54091z;
        this.f54091z = i12 + 1;
        char c10 = this.f54088w;
        cArr[i12] = c10;
        writeRaw(str);
        if (this.f54091z >= i11) {
            t();
        }
        char[] cArr2 = this.f54089x;
        int i13 = this.f54091z;
        this.f54091z = i13 + 1;
        cArr2[i13] = c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[PHI: r12
      0x0041: PHI (r12v7 int) = (r12v3 int), (r12v8 int) binds: [B:18:0x003d, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[PHI: r9
      0x0094: PHI (r9v10 int) = (r9v7 int), (r9v11 int) binds: [B:43:0x0090, B:41:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r17, char[] r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.n.B(int, char[], int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[PHI: r16
      0x005f: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:24:0x005a, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[PHI: r10
      0x00ae: PHI (r10v4 int) = (r10v1 int), (r10v5 int) binds: [B:44:0x00aa, B:42:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.lang.String r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.n.C(java.lang.String):void");
    }

    public final void D(String str) throws IOException {
        int i10 = this.f54091z;
        int i11 = this.A;
        int i12 = i11 - i10;
        str.getChars(0, i12, this.f54089x, i10);
        this.f54091z += i12;
        t();
        int length = str.length() - i12;
        while (length > i11) {
            int i13 = i12 + i11;
            str.getChars(i12, i13, this.f54089x, 0);
            this.f54090y = 0;
            this.f54091z = i11;
            t();
            length -= i11;
            i12 = i13;
        }
        str.getChars(i12, i12 + length, this.f54089x, 0);
        this.f54090y = 0;
        this.f54091z = length;
    }

    @Override // ub.o
    public boolean canWriteFormattedNumbers() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    @Override // wb.a, ub.o, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.lang.Throwable {
        /*
            r5 = this;
            super.close()
            r0 = 0
            char[] r1 = r5.f54089x     // Catch: java.io.IOException -> L1e
            if (r1 == 0) goto L2a
            ub.n r1 = ub.n.AUTO_CLOSE_JSON_CONTENT     // Catch: java.io.IOException -> L1e
            boolean r1 = r5.isEnabled(r1)     // Catch: java.io.IOException -> L1e
            if (r1 == 0) goto L2a
        L10:
            ub.y r1 = r5.getOutputContext()     // Catch: java.io.IOException -> L1e
            boolean r2 = r1.inArray()     // Catch: java.io.IOException -> L1e
            if (r2 == 0) goto L20
            r5.writeEndArray()     // Catch: java.io.IOException -> L1e
            goto L10
        L1e:
            r1 = move-exception
            goto L2e
        L20:
            boolean r1 = r1.inObject()     // Catch: java.io.IOException -> L1e
            if (r1 == 0) goto L2a
            r5.writeEndObject()     // Catch: java.io.IOException -> L1e
            goto L10
        L2a:
            r5.t()     // Catch: java.io.IOException -> L1e
            r1 = r0
        L2e:
            r2 = 0
            r5.f54090y = r2
            r5.f54091z = r2
            cc.h r2 = r5.f90507h
            java.io.Writer r3 = r5.f54087v
            if (r3 == 0) goto L62
            boolean r4 = r2.isResourceManaged()     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            if (r4 != 0) goto L58
            ub.n r4 = ub.n.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            boolean r4 = r5.isEnabled(r4)     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            if (r4 == 0) goto L48
            goto L58
        L48:
            ub.n r4 = ub.n.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            boolean r4 = r5.isEnabled(r4)     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            if (r4 == 0) goto L62
            r3.flush()     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            goto L62
        L54:
            r0 = move-exception
            goto L5c
        L56:
            r0 = move-exception
            goto L5c
        L58:
            r3.close()     // Catch: java.lang.RuntimeException -> L54 java.io.IOException -> L56
            goto L62
        L5c:
            if (r1 == 0) goto L61
            r0.addSuppressed(r1)
        L61:
            throw r0
        L62:
            char[] r3 = r5.f54089x
            if (r3 == 0) goto L6b
            r5.f54089x = r0
            r2.releaseConcatBuffer(r3)
        L6b:
            char[] r3 = r5.D
            if (r3 == 0) goto L74
            r5.D = r0
            r2.releaseNameCopyBuffer(r3)
        L74:
            if (r1 != 0) goto L77
            return
        L77:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.n.close():void");
    }

    @Override // wb.a, ub.o, java.io.Flushable
    public void flush() throws IOException {
        t();
        Writer writer = this.f54087v;
        if (writer == null || !isEnabled(ub.n.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        writer.flush();
    }

    @Override // ub.o
    public int getOutputBuffered() {
        return Math.max(0, this.f54091z - this.f54090y);
    }

    @Override // ub.o
    public Object getOutputTarget() {
        return this.f54087v;
    }

    @Override // wb.a
    public final void o(String str) throws IOException {
        char c10;
        int iWriteValue = this.f90509j.writeValue();
        if (this.f88311b != null) {
            q(iWriteValue, str);
            return;
        }
        if (iWriteValue == 1) {
            c10 = AbstractJsonLexerKt.COMMA;
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    p(str);
                    throw null;
                }
                c0 c0Var = this.f54019q;
                if (c0Var != null) {
                    writeRaw(c0Var.getValue());
                    return;
                }
                return;
            }
            c10 = AbstractJsonLexerKt.COLON;
        }
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i10 = this.f54091z;
        this.f54091z = i10 + 1;
        cArr[i10] = c10;
    }

    public final char[] r() {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, 0, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, '0', '0', 0, 0, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        this.B = cArr;
        return cArr;
    }

    public final void s(char c10, int i10) throws IOException {
        String value;
        int i11;
        int i12 = this.A;
        if (i10 >= 0) {
            if (this.f54091z + 2 > i12) {
                t();
            }
            char[] cArr = this.f54089x;
            int i13 = this.f54091z;
            int i14 = i13 + 1;
            this.f54091z = i14;
            cArr[i13] = AbstractJsonLexerKt.STRING_ESC;
            this.f54091z = i13 + 2;
            cArr[i14] = (char) i10;
            return;
        }
        if (i10 == -2) {
            c0 c0Var = this.C;
            if (c0Var == null) {
                value = this.f54018p.getEscapeSequence(c10).getValue();
            } else {
                value = c0Var.getValue();
                this.C = null;
            }
            int length = value.length();
            if (this.f54091z + length > i12) {
                t();
                if (length > i12) {
                    this.f54087v.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.f54089x, this.f54091z);
            this.f54091z += length;
            return;
        }
        if (this.f54091z + 5 >= i12) {
            t();
        }
        int i15 = this.f54091z;
        char[] cArr2 = this.f54089x;
        char[] cArr3 = this.f54021s ? E : F;
        cArr2[i15] = AbstractJsonLexerKt.STRING_ESC;
        int i16 = i15 + 2;
        cArr2[i15 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i17 = c10 >> '\b';
            int i18 = i15 + 3;
            cArr2[i16] = cArr3[(i17 & 255) >> 4];
            i11 = i15 + 4;
            cArr2[i18] = cArr3[i17 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i19 = i15 + 3;
            cArr2[i16] = '0';
            i11 = i15 + 4;
            cArr2[i19] = '0';
        }
        cArr2[i11] = cArr3[c10 >> 4];
        cArr2[i11 + 1] = cArr3[c10 & 15];
        this.f54091z = i11 + 2;
    }

    public final void t() throws IOException {
        int i10 = this.f54091z;
        int i11 = this.f54090y;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f54090y = 0;
            this.f54091z = 0;
            this.f54087v.write(this.f54089x, i11, i12);
        }
    }

    public final int u(char[] cArr, int i10, int i11, char c10, int i12) throws IOException {
        String value;
        int i13;
        Writer writer = this.f54087v;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArrR = this.B;
            if (cArrR == null) {
                cArrR = r();
            }
            cArrR[1] = (char) i12;
            writer.write(cArrR, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            c0 c0Var = this.C;
            if (c0Var == null) {
                value = this.f54018p.getEscapeSequence(c10).getValue();
            } else {
                value = c0Var.getValue();
                this.C = null;
            }
            int length = value.length();
            if (i10 < length || i10 >= i11) {
                writer.write(value);
                return i10;
            }
            int i15 = i10 - length;
            value.getChars(0, length, cArr, i15);
            return i15;
        }
        char[] cArr2 = this.f54021s ? E : F;
        if (i10 <= 5 || i10 >= i11) {
            char[] cArrR2 = this.B;
            if (cArrR2 == null) {
                cArrR2 = r();
            }
            this.f54090y = this.f54091z;
            if (c10 <= 255) {
                cArrR2[6] = cArr2[c10 >> 4];
                cArrR2[7] = cArr2[c10 & 15];
                writer.write(cArrR2, 2, 6);
                return i10;
            }
            int i16 = c10 >> '\b';
            cArrR2[10] = cArr2[(i16 & 255) >> 4];
            cArrR2[11] = cArr2[i16 & 15];
            cArrR2[12] = cArr2[(c10 & 255) >> 4];
            cArrR2[13] = cArr2[c10 & 15];
            writer.write(cArrR2, 8, 6);
            return i10;
        }
        cArr[i10 - 6] = AbstractJsonLexerKt.STRING_ESC;
        int i17 = i10 - 4;
        cArr[i10 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            int i19 = i10 - 3;
            cArr[i17] = cArr2[(i18 & 255) >> 4];
            i13 = i10 - 2;
            cArr[i19] = cArr2[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i20 = i10 - 3;
            cArr[i17] = '0';
            i13 = i10 - 2;
            cArr[i20] = '0';
        }
        cArr[i13] = cArr2[c10 >> 4];
        cArr[i13 + 1] = cArr2[c10 & 15];
        return i13 - 4;
    }

    public final void v(char c10, int i10) throws IOException {
        String value;
        int i11;
        Writer writer = this.f54087v;
        if (i10 >= 0) {
            int i12 = this.f54091z;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this.f54090y = i13;
                char[] cArr = this.f54089x;
                cArr[i13] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArrR = this.B;
            if (cArrR == null) {
                cArrR = r();
            }
            this.f54090y = this.f54091z;
            cArrR[1] = (char) i10;
            writer.write(cArrR, 0, 2);
            return;
        }
        if (i10 == -2) {
            c0 c0Var = this.C;
            if (c0Var == null) {
                value = this.f54018p.getEscapeSequence(c10).getValue();
            } else {
                value = c0Var.getValue();
                this.C = null;
            }
            int length = value.length();
            int i14 = this.f54091z;
            if (i14 < length) {
                this.f54090y = i14;
                writer.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this.f54090y = i15;
                value.getChars(0, length, this.f54089x, i15);
                return;
            }
        }
        char[] cArr2 = this.f54021s ? E : F;
        int i16 = this.f54091z;
        if (i16 < 6) {
            char[] cArrR2 = this.B;
            if (cArrR2 == null) {
                cArrR2 = r();
            }
            this.f54090y = this.f54091z;
            if (c10 <= 255) {
                cArrR2[6] = cArr2[c10 >> 4];
                cArrR2[7] = cArr2[c10 & 15];
                writer.write(cArrR2, 2, 6);
                return;
            } else {
                int i17 = c10 >> '\b';
                cArrR2[10] = cArr2[(i17 & 255) >> 4];
                cArrR2[11] = cArr2[i17 & 15];
                cArrR2[12] = cArr2[(c10 & 255) >> 4];
                cArrR2[13] = cArr2[c10 & 15];
                writer.write(cArrR2, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.f54089x;
        int i18 = i16 - 6;
        this.f54090y = i18;
        cArr3[i18] = AbstractJsonLexerKt.STRING_ESC;
        cArr3[i16 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            cArr3[i16 - 4] = cArr2[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr3[i11] = cArr2[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr3[i16 - 4] = '0';
            i11 = i16 - 3;
            cArr3[i11] = '0';
        }
        cArr3[i11 + 1] = cArr2[c10 >> 4];
        cArr3[i11 + 2] = cArr2[c10 & 15];
    }

    @Override // ub.o
    public void writeBinary(ub.b bVar, byte[] bArr, int i10, int i11) throws IOException {
        int iEncodeBase64Chunk;
        k(i10, i11, bArr);
        o("write a binary value");
        int i12 = this.f54091z;
        int i13 = this.A;
        if (i12 >= i13) {
            t();
        }
        char[] cArr = this.f54089x;
        int i14 = this.f54091z;
        this.f54091z = i14 + 1;
        char c10 = this.f54088w;
        cArr[i14] = c10;
        int i15 = i11 + i10;
        int i16 = i15 - 3;
        int i17 = i13 - 6;
        int maxLineLength = bVar.getMaxLineLength();
        loop0: while (true) {
            int i18 = maxLineLength >> 2;
            while (i10 <= i16) {
                if (this.f54091z > i17) {
                    t();
                }
                int i19 = i10 + 2;
                int i20 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iEncodeBase64Chunk = bVar.encodeBase64Chunk(i20 | (bArr[i19] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED), this.f54089x, this.f54091z);
                this.f54091z = iEncodeBase64Chunk;
                i18--;
                if (i18 <= 0) {
                    break;
                }
            }
            char[] cArr2 = this.f54089x;
            int i21 = iEncodeBase64Chunk + 1;
            this.f54091z = i21;
            cArr2[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
            this.f54091z = iEncodeBase64Chunk + 2;
            cArr2[i21] = 'n';
            maxLineLength = bVar.getMaxLineLength();
        }
        int i22 = i15 - i10;
        if (i22 > 0) {
            if (this.f54091z > i17) {
                t();
            }
            int i23 = i10 + 1;
            int i24 = bArr[i10] << 16;
            if (i22 == 2) {
                i24 |= (bArr[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            }
            this.f54091z = bVar.encodeBase64Partial(i24, i22, this.f54089x, this.f54091z);
        }
        if (this.f54091z >= i13) {
            t();
        }
        char[] cArr3 = this.f54089x;
        int i25 = this.f54091z;
        this.f54091z = i25 + 1;
        cArr3[i25] = c10;
    }

    @Override // ub.o
    public void writeBoolean(boolean z10) throws IOException {
        int i10;
        o("write a boolean value");
        if (this.f54091z + 5 >= this.A) {
            t();
        }
        int i11 = this.f54091z;
        char[] cArr = this.f54089x;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = AbstractJsonLexerKt.UNICODE_ESC;
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = GMTDateParser.SECONDS;
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this.f54091z = i10 + 1;
    }

    @Override // ub.o
    public void writeEndArray() throws IOException {
        if (!this.f90509j.inArray()) {
            e("Current context not Array but " + this.f90509j.typeDesc());
            throw null;
        }
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeEndArray(this, this.f90509j.getEntryCount());
        } else {
            if (this.f54091z >= this.A) {
                t();
            }
            char[] cArr = this.f54089x;
            int i10 = this.f54091z;
            this.f54091z = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.END_LIST;
        }
        this.f90509j = this.f90509j.clearAndGetParent();
    }

    @Override // ub.o
    public void writeEndObject() throws IOException {
        if (!this.f90509j.inObject()) {
            e("Current context not Object but " + this.f90509j.typeDesc());
            throw null;
        }
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeEndObject(this, this.f90509j.getEntryCount());
        } else {
            if (this.f54091z >= this.A) {
                t();
            }
            char[] cArr = this.f54089x;
            int i10 = this.f54091z;
            this.f54091z = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.END_OBJ;
        }
        this.f90509j = this.f90509j.clearAndGetParent();
    }

    @Override // ub.o
    public void writeFieldName(String str) throws IOException {
        int iWriteFieldName = this.f90509j.writeFieldName(str);
        if (iWriteFieldName == 4) {
            e("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z10 = iWriteFieldName == 1;
        b0 b0Var = this.f88311b;
        int i10 = this.A;
        char c10 = this.f54088w;
        if (b0Var != null) {
            if (z10) {
                b0Var.writeObjectEntrySeparator(this);
            } else {
                b0Var.beforeObjectEntries(this);
            }
            if (this.f54020r) {
                C(str);
                return;
            }
            if (this.f54091z >= i10) {
                t();
            }
            char[] cArr = this.f54089x;
            int i11 = this.f54091z;
            this.f54091z = i11 + 1;
            cArr[i11] = c10;
            C(str);
            if (this.f54091z >= i10) {
                t();
            }
            char[] cArr2 = this.f54089x;
            int i12 = this.f54091z;
            this.f54091z = i12 + 1;
            cArr2[i12] = c10;
            return;
        }
        if (this.f54091z + 1 >= i10) {
            t();
        }
        if (z10) {
            char[] cArr3 = this.f54089x;
            int i13 = this.f54091z;
            this.f54091z = i13 + 1;
            cArr3[i13] = AbstractJsonLexerKt.COMMA;
        }
        if (this.f54020r) {
            C(str);
            return;
        }
        char[] cArr4 = this.f54089x;
        int i14 = this.f54091z;
        this.f54091z = i14 + 1;
        cArr4[i14] = c10;
        C(str);
        if (this.f54091z >= i10) {
            t();
        }
        char[] cArr5 = this.f54089x;
        int i15 = this.f54091z;
        this.f54091z = i15 + 1;
        cArr5[i15] = c10;
    }

    @Override // ub.o
    public void writeNull() throws IOException {
        o("write a null");
        z();
    }

    @Override // ub.o
    public void writeNumber(short s10) throws IOException {
        o("write a number");
        boolean z10 = this.f90508i;
        int i10 = this.A;
        if (!z10) {
            if (this.f54091z + 6 >= i10) {
                t();
            }
            this.f54091z = cc.n.outputInt(s10, this.f54089x, this.f54091z);
            return;
        }
        if (this.f54091z + 8 >= i10) {
            t();
        }
        char[] cArr = this.f54089x;
        int i11 = this.f54091z;
        int i12 = i11 + 1;
        this.f54091z = i12;
        char c10 = this.f54088w;
        cArr[i11] = c10;
        int iOutputInt = cc.n.outputInt(s10, cArr, i12);
        char[] cArr2 = this.f54089x;
        this.f54091z = iOutputInt + 1;
        cArr2[iOutputInt] = c10;
    }

    @Override // ub.o
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i10 = this.f54091z;
        int i11 = this.A;
        int i12 = i11 - i10;
        if (i12 == 0) {
            t();
            i12 = i11 - this.f54091z;
        }
        if (i12 < length) {
            D(str);
        } else {
            str.getChars(0, length, this.f54089x, this.f54091z);
            this.f54091z += length;
        }
    }

    @Override // ub.o
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeStartArray() throws IOException {
        o("start an array");
        this.f90509j = this.f90509j.createChildArrayContext();
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartArray(this);
            return;
        }
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i10 = this.f54091z;
        this.f54091z = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // ub.o
    public void writeStartObject() throws IOException {
        o("start an object");
        this.f90509j = this.f90509j.createChildObjectContext();
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartObject(this);
            return;
        }
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i10 = this.f54091z;
        this.f54091z = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // ub.o
    public void writeString(String str) throws IOException {
        o("write a string");
        if (str == null) {
            z();
            return;
        }
        int i10 = this.f54091z;
        int i11 = this.A;
        if (i10 >= i11) {
            t();
        }
        char[] cArr = this.f54089x;
        int i12 = this.f54091z;
        this.f54091z = i12 + 1;
        char c10 = this.f54088w;
        cArr[i12] = c10;
        C(str);
        if (this.f54091z >= i11) {
            t();
        }
        char[] cArr2 = this.f54089x;
        int i13 = this.f54091z;
        this.f54091z = i13 + 1;
        cArr2[i13] = c10;
    }

    @Override // ub.o
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        h();
        throw null;
    }

    public final int x(ub.b bVar, InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.A - 6;
        int i11 = 2;
        int maxLineLength = bVar.getMaxLineLength() >> 2;
        int i12 = -3;
        int i13 = 0;
        int iW = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iW = w(inputStream, bArr, i13, iW, bArr.length);
                if (iW < 3) {
                    break;
                }
                i12 = iW - 3;
                i13 = 0;
            }
            if (this.f54091z > i10) {
                t();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iEncodeBase64Chunk = bVar.encodeBase64Chunk((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16, this.f54089x, this.f54091z);
            this.f54091z = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f54089x;
                int i17 = iEncodeBase64Chunk + 1;
                this.f54091z = i17;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this.f54091z = iEncodeBase64Chunk + 2;
                cArr[i17] = 'n';
                maxLineLength = bVar.getMaxLineLength() >> 2;
            }
        }
        if (iW <= 0) {
            return i14;
        }
        if (this.f54091z > i10) {
            t();
        }
        int i18 = bArr[0] << 16;
        if (1 < iW) {
            i18 |= (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i14 + i11;
        this.f54091z = bVar.encodeBase64Partial(i18, i11, this.f54089x, this.f54091z);
        return i19;
    }

    public final int y(ub.b bVar, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int iW;
        int i11 = this.A - 6;
        int i12 = 2;
        int maxLineLength = bVar.getMaxLineLength() >> 2;
        int i13 = -3;
        int i14 = 0;
        int iW2 = 0;
        while (true) {
            if (i10 <= 2) {
                break;
            }
            if (i14 > i13) {
                iW2 = w(inputStream, bArr, i14, iW2, i10);
                if (iW2 < 3) {
                    i14 = 0;
                    break;
                }
                i13 = iW2 - 3;
                i14 = 0;
            }
            if (this.f54091z > i11) {
                t();
            }
            int i15 = i14 + 2;
            int i16 = ((bArr[i14 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i14] << 8)) << 8;
            i14 += 3;
            i10 -= 3;
            int iEncodeBase64Chunk = bVar.encodeBase64Chunk((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16, this.f54089x, this.f54091z);
            this.f54091z = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.f54089x;
                int i17 = iEncodeBase64Chunk + 1;
                this.f54091z = i17;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this.f54091z = iEncodeBase64Chunk + 2;
                cArr[i17] = 'n';
                maxLineLength = bVar.getMaxLineLength() >> 2;
            }
        }
        if (i10 <= 0 || (iW = w(inputStream, bArr, i14, iW2, i10)) <= 0) {
            return i10;
        }
        if (this.f54091z > i11) {
            t();
        }
        int i18 = bArr[0] << 16;
        if (1 < iW) {
            i18 |= (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        } else {
            i12 = 1;
        }
        this.f54091z = bVar.encodeBase64Partial(i18, i12, this.f54089x, this.f54091z);
        return i10 - i12;
    }

    public final void z() throws IOException {
        if (this.f54091z + 4 >= this.A) {
            t();
        }
        int i10 = this.f54091z;
        char[] cArr = this.f54089x;
        cArr[i10] = 'n';
        cArr[i10 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this.f54091z = i10 + 4;
    }

    public n(cc.h hVar, int i10, a0 a0Var, Writer writer, char c10) {
        super(hVar, i10, a0Var);
        this.f54087v = writer;
        char[] cArrAllocConcatBuffer = hVar.allocConcatBuffer();
        this.f54089x = cArrAllocConcatBuffer;
        this.A = cArrAllocConcatBuffer.length;
        this.f54088w = c10;
        boolean zIsEnabled = isEnabled(h.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c10 != '\"' || zIsEnabled) {
            this.f54016n = cc.d.get7BitOutputEscapes(c10, zIsEnabled);
        }
    }

    @Override // ub.o
    public void writeRaw(String str, int i10, int i11) throws IOException {
        m(i10, i11, str);
        int i12 = this.f54091z;
        int i13 = this.A;
        int i14 = i13 - i12;
        if (i14 < i11) {
            t();
            i14 = i13 - this.f54091z;
        }
        if (i14 >= i11) {
            str.getChars(i10, i10 + i11, this.f54089x, this.f54091z);
            this.f54091z += i11;
        } else {
            D(str.substring(i10, i11 + i10));
        }
    }

    @Override // ub.o
    public void writeStartArray(Object obj) throws IOException {
        o("start an array");
        this.f90509j = this.f90509j.createChildArrayContext(obj);
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartArray(this);
            return;
        }
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i10 = this.f54091z;
        this.f54091z = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // wb.a, ub.o
    public void writeStartObject(Object obj) throws IOException {
        o("start an object");
        g gVarCreateChildObjectContext = this.f90509j.createChildObjectContext(obj);
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        this.f90509j = gVarCreateChildObjectContext;
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartObject(this);
            return;
        }
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i10 = this.f54091z;
        this.f54091z = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // ub.o
    public void writeString(Reader reader, int i10) throws IOException {
        o("write a string");
        if (reader != null) {
            int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
            int i12 = this.f54091z;
            int i13 = this.A;
            if (i12 >= i13) {
                t();
            }
            char[] cArr = this.f54089x;
            int i14 = this.f54091z;
            this.f54091z = i14 + 1;
            char c10 = this.f54088w;
            cArr[i14] = c10;
            if (this.D == null) {
                this.D = this.f90507h.allocNameCopyBuffer(2000);
            }
            char[] cArr2 = this.D;
            while (i11 > 0) {
                int i15 = reader.read(cArr2, 0, Math.min(i11, cArr2.length));
                if (i15 <= 0) {
                    break;
                }
                B(0, cArr2, i15);
                i11 -= i15;
            }
            if (this.f54091z >= i13) {
                t();
            }
            char[] cArr3 = this.f54089x;
            int i16 = this.f54091z;
            this.f54091z = i16 + 1;
            cArr3[i16] = c10;
            if (i11 <= 0 || i10 < 0) {
                return;
            }
            e("Didn't read enough from reader");
            throw null;
        }
        e("null reader");
        throw null;
    }

    @Override // ub.o
    public void writeNumber(int i10) throws IOException {
        o("write a number");
        boolean z10 = this.f90508i;
        int i11 = this.A;
        if (z10) {
            if (this.f54091z + 13 >= i11) {
                t();
            }
            char[] cArr = this.f54089x;
            int i12 = this.f54091z;
            int i13 = i12 + 1;
            this.f54091z = i13;
            char c10 = this.f54088w;
            cArr[i12] = c10;
            int iOutputInt = cc.n.outputInt(i10, cArr, i13);
            char[] cArr2 = this.f54089x;
            this.f54091z = iOutputInt + 1;
            cArr2[iOutputInt] = c10;
            return;
        }
        if (this.f54091z + 11 >= i11) {
            t();
        }
        this.f54091z = cc.n.outputInt(i10, this.f54089x, this.f54091z);
    }

    @Override // ub.o
    public void writeRaw(c0 c0Var) throws IOException {
        int iAppendUnquoted = c0Var.appendUnquoted(this.f54089x, this.f54091z);
        if (iAppendUnquoted < 0) {
            writeRaw(c0Var.getValue());
        } else {
            this.f54091z += iAppendUnquoted;
        }
    }

    @Override // ub.o
    public void writeStartArray(Object obj, int i10) throws IOException {
        o("start an array");
        this.f90509j = this.f90509j.createChildArrayContext(obj);
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartArray(this);
            return;
        }
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i11 = this.f54091z;
        this.f54091z = i11 + 1;
        cArr[i11] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // ub.o
    public void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        l(i10, cArr, i11);
        if (i11 < 32) {
            if (i11 > this.A - this.f54091z) {
                t();
            }
            System.arraycopy(cArr, i10, this.f54089x, this.f54091z, i11);
            this.f54091z += i11;
            return;
        }
        t();
        this.f54087v.write(cArr, i10, i11);
    }

    @Override // ub.o
    public void writeStartObject(Object obj, int i10) throws IOException {
        writeStartObject(obj);
    }

    @Override // ub.o
    public void writeNumber(long j10) throws IOException {
        o("write a number");
        boolean z10 = this.f90508i;
        int i10 = this.A;
        if (z10) {
            if (this.f54091z + 23 >= i10) {
                t();
            }
            char[] cArr = this.f54089x;
            int i11 = this.f54091z;
            int i12 = i11 + 1;
            this.f54091z = i12;
            char c10 = this.f54088w;
            cArr[i11] = c10;
            int iOutputLong = cc.n.outputLong(j10, cArr, i12);
            char[] cArr2 = this.f54089x;
            this.f54091z = iOutputLong + 1;
            cArr2[iOutputLong] = c10;
            return;
        }
        if (this.f54091z + 21 >= i10) {
            t();
        }
        this.f54091z = cc.n.outputLong(j10, this.f54089x, this.f54091z);
    }

    @Override // wb.a, ub.o
    public int writeBinary(ub.b bVar, InputStream inputStream, int i10) throws IOException {
        o("write a binary value");
        int i11 = this.f54091z;
        int i12 = this.A;
        if (i11 >= i12) {
            t();
        }
        char[] cArr = this.f54089x;
        int i13 = this.f54091z;
        this.f54091z = i13 + 1;
        char c10 = this.f54088w;
        cArr[i13] = c10;
        cc.h hVar = this.f90507h;
        byte[] bArrAllocBase64Buffer = hVar.allocBase64Buffer();
        try {
            if (i10 < 0) {
                i10 = x(bVar, inputStream, bArrAllocBase64Buffer);
            } else {
                int iY = y(bVar, inputStream, bArrAllocBase64Buffer, i10);
                if (iY > 0) {
                    e("Too few bytes available: missing " + iY + " bytes (out of " + i10 + ")");
                    throw null;
                }
            }
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this.f54091z >= i12) {
                t();
            }
            char[] cArr2 = this.f54089x;
            int i14 = this.f54091z;
            this.f54091z = i14 + 1;
            cArr2[i14] = c10;
            return i10;
        } catch (Throwable th2) {
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th2;
        }
    }

    @Override // wb.a, ub.o
    public void writeFieldName(c0 c0Var) throws IOException {
        int iWriteFieldName = this.f90509j.writeFieldName(c0Var.getValue());
        if (iWriteFieldName != 4) {
            boolean z10 = iWriteFieldName == 1;
            b0 b0Var = this.f88311b;
            int i10 = this.A;
            char c10 = this.f54088w;
            if (b0Var != null) {
                if (z10) {
                    b0Var.writeObjectEntrySeparator(this);
                } else {
                    b0Var.beforeObjectEntries(this);
                }
                char[] cArrAsQuotedChars = c0Var.asQuotedChars();
                if (this.f54020r) {
                    writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
                    return;
                }
                if (this.f54091z >= i10) {
                    t();
                }
                char[] cArr = this.f54089x;
                int i11 = this.f54091z;
                this.f54091z = i11 + 1;
                cArr[i11] = c10;
                writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
                if (this.f54091z >= i10) {
                    t();
                }
                char[] cArr2 = this.f54089x;
                int i12 = this.f54091z;
                this.f54091z = i12 + 1;
                cArr2[i12] = c10;
                return;
            }
            if (this.f54091z + 1 >= i10) {
                t();
            }
            if (z10) {
                char[] cArr3 = this.f54089x;
                int i13 = this.f54091z;
                this.f54091z = i13 + 1;
                cArr3[i13] = AbstractJsonLexerKt.COMMA;
            }
            if (this.f54020r) {
                char[] cArrAsQuotedChars2 = c0Var.asQuotedChars();
                writeRaw(cArrAsQuotedChars2, 0, cArrAsQuotedChars2.length);
                return;
            }
            char[] cArr4 = this.f54089x;
            int i14 = this.f54091z;
            int i15 = i14 + 1;
            this.f54091z = i15;
            cArr4[i14] = c10;
            int iAppendQuoted = c0Var.appendQuoted(cArr4, i15);
            if (iAppendQuoted < 0) {
                char[] cArrAsQuotedChars3 = c0Var.asQuotedChars();
                writeRaw(cArrAsQuotedChars3, 0, cArrAsQuotedChars3.length);
                if (this.f54091z >= i10) {
                    t();
                }
                char[] cArr5 = this.f54089x;
                int i16 = this.f54091z;
                this.f54091z = i16 + 1;
                cArr5[i16] = c10;
                return;
            }
            int i17 = this.f54091z + iAppendQuoted;
            this.f54091z = i17;
            if (i17 >= i10) {
                t();
            }
            char[] cArr6 = this.f54089x;
            int i18 = this.f54091z;
            this.f54091z = i18 + 1;
            cArr6[i18] = c10;
            return;
        }
        e("Can not write a field name, expecting a value");
        throw null;
    }

    @Override // ub.o
    public void writeRaw(char c10) throws IOException {
        if (this.f54091z >= this.A) {
            t();
        }
        char[] cArr = this.f54089x;
        int i10 = this.f54091z;
        this.f54091z = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // ub.o
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        o("write a string");
        int i12 = this.f54091z;
        int i13 = this.A;
        if (i12 >= i13) {
            t();
        }
        char[] cArr2 = this.f54089x;
        int i14 = this.f54091z;
        this.f54091z = i14 + 1;
        char c10 = this.f54088w;
        cArr2[i14] = c10;
        B(i10, cArr, i11);
        if (this.f54091z >= i13) {
            t();
        }
        char[] cArr3 = this.f54089x;
        int i15 = this.f54091z;
        this.f54091z = i15 + 1;
        cArr3[i15] = c10;
    }

    @Override // ub.o
    public void writeNumber(BigInteger bigInteger) throws IOException {
        o("write a number");
        if (bigInteger == null) {
            z();
        } else if (this.f90508i) {
            A(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // wb.a, ub.o
    public void writeString(c0 c0Var) throws IOException {
        o("write a string");
        int i10 = this.f54091z;
        int i11 = this.A;
        if (i10 >= i11) {
            t();
        }
        char[] cArr = this.f54089x;
        int i12 = this.f54091z;
        int i13 = i12 + 1;
        this.f54091z = i13;
        char c10 = this.f54088w;
        cArr[i12] = c10;
        int iAppendQuoted = c0Var.appendQuoted(cArr, i13);
        if (iAppendQuoted < 0) {
            char[] cArrAsQuotedChars = c0Var.asQuotedChars();
            int length = cArrAsQuotedChars.length;
            if (length < 32) {
                if (length > i11 - this.f54091z) {
                    t();
                }
                System.arraycopy(cArrAsQuotedChars, 0, this.f54089x, this.f54091z, length);
                this.f54091z += length;
            } else {
                t();
                this.f54087v.write(cArrAsQuotedChars, 0, length);
            }
            if (this.f54091z >= i11) {
                t();
            }
            char[] cArr2 = this.f54089x;
            int i14 = this.f54091z;
            this.f54091z = i14 + 1;
            cArr2[i14] = c10;
            return;
        }
        int i15 = this.f54091z + iAppendQuoted;
        this.f54091z = i15;
        if (i15 >= i11) {
            t();
        }
        char[] cArr3 = this.f54089x;
        int i16 = this.f54091z;
        this.f54091z = i16 + 1;
        cArr3[i16] = c10;
    }

    @Override // ub.o
    public void writeNumber(double d10) throws IOException {
        if (!this.f90508i && (!cc.n.notFinite(d10) || !isEnabled(ub.n.QUOTE_NON_NUMERIC_NUMBERS))) {
            o("write a number");
            writeRaw(cc.n.toString(d10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(cc.n.toString(d10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // ub.o
    public void writeNumber(float f10) throws IOException {
        if (!this.f90508i && (!cc.n.notFinite(f10) || !isEnabled(ub.n.QUOTE_NON_NUMERIC_NUMBERS))) {
            o("write a number");
            writeRaw(cc.n.toString(f10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(cc.n.toString(f10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // ub.o
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        o("write a number");
        if (bigDecimal == null) {
            z();
        } else if (this.f90508i) {
            A(j(bigDecimal));
        } else {
            writeRaw(j(bigDecimal));
        }
    }

    @Override // ub.o
    public void writeNumber(String str) throws IOException {
        o("write a number");
        if (str == null) {
            z();
        } else if (this.f90508i) {
            A(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // ub.o
    public void writeNumber(char[] cArr, int i10, int i11) throws IOException {
        o("write a number");
        if (this.f90508i) {
            int i12 = this.f54091z;
            int i13 = this.A;
            if (i12 >= i13) {
                t();
            }
            char[] cArr2 = this.f54089x;
            int i14 = this.f54091z;
            this.f54091z = i14 + 1;
            char c10 = this.f54088w;
            cArr2[i14] = c10;
            writeRaw(cArr, i10, i11);
            if (this.f54091z >= i13) {
                t();
            }
            char[] cArr3 = this.f54089x;
            int i15 = this.f54091z;
            this.f54091z = i15 + 1;
            cArr3[i15] = c10;
            return;
        }
        writeRaw(cArr, i10, i11);
    }
}
