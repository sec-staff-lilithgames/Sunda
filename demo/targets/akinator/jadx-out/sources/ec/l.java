package ec;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import j1.o2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.a0;
import ub.b0;
import ub.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l extends c {
    public static final byte[] E = cc.d.copyHexBytes(true);
    public static final byte[] F = cc.d.copyHexBytes(false);
    public static final byte[] G = {110, 117, 108, 108};
    public static final byte[] H = {116, 114, 117, 101};
    public static final byte[] I = {102, 97, 108, 115, 101};
    public final int A;
    public char[] B;
    public final int C;
    public final boolean D;

    /* renamed from: v, reason: collision with root package name */
    public final OutputStream f54073v;

    /* renamed from: w, reason: collision with root package name */
    public final byte f54074w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f54075x;

    /* renamed from: y, reason: collision with root package name */
    public int f54076y;

    /* renamed from: z, reason: collision with root package name */
    public final int f54077z;

    public l(cc.h hVar, int i10, a0 a0Var, OutputStream outputStream, char c10) {
        super(hVar, i10, a0Var);
        this.f54073v = outputStream;
        this.f54074w = (byte) c10;
        boolean zIsEnabled = isEnabled(h.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c10 != '\"' || zIsEnabled) {
            this.f54016n = cc.d.get7BitOutputEscapes(c10, zIsEnabled);
        }
        this.D = true;
        byte[] bArrAllocWriteEncodingBuffer = hVar.allocWriteEncodingBuffer();
        this.f54075x = bArrAllocWriteEncodingBuffer;
        int length = bArrAllocWriteEncodingBuffer.length;
        this.f54077z = length;
        this.A = length >> 3;
        char[] cArrAllocConcatBuffer = hVar.allocConcatBuffer();
        this.B = cArrAllocConcatBuffer;
        this.C = cArrAllocConcatBuffer.length;
        if (isEnabled(h.ESCAPE_NON_ASCII.mappedFeature())) {
            setHighestNonEscapedChar(127);
        }
    }

    public static int v(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
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

    public final int A(int i10, int i11) {
        int i12;
        byte[] bArr = this.f54075x;
        byte[] bArr2 = this.f54021s ? E : F;
        bArr[i11] = 92;
        int i13 = i11 + 2;
        bArr[i11 + 1] = 117;
        if (i10 > 255) {
            int i14 = i10 >> 8;
            int i15 = i11 + 3;
            bArr[i13] = bArr2[(i14 & 255) >> 4];
            i12 = i11 + 4;
            bArr[i15] = bArr2[i14 & 15];
            i10 &= 255;
        } else {
            int i16 = i11 + 3;
            bArr[i13] = 48;
            i12 = i11 + 4;
            bArr[i16] = 48;
        }
        int i17 = i12 + 1;
        bArr[i12] = bArr2[i10 >> 4];
        int i18 = i12 + 2;
        bArr[i17] = bArr2[i10 & 15];
        return i18;
    }

    public final void B() throws IOException {
        if (this.f54076y + 4 >= this.f54077z) {
            r();
        }
        System.arraycopy(G, 0, this.f54075x, this.f54076y, 4);
        this.f54076y += 4;
    }

    public final void C(String str) throws IOException {
        int i10 = this.f54076y;
        int i11 = this.f54077z;
        if (i10 >= i11) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i12 = this.f54076y;
        this.f54076y = i12 + 1;
        byte b10 = this.f54074w;
        bArr[i12] = b10;
        writeRaw(str);
        if (this.f54076y >= i11) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i13 = this.f54076y;
        this.f54076y = i13 + 1;
        bArr2[i13] = b10;
    }

    public final void D(int i10, int i11, String str) throws IOException {
        int iS;
        byte b10;
        char cCharAt;
        int i12 = i11 + i10;
        int i13 = this.f54076y;
        byte[] bArr = this.f54075x;
        int[] iArr = this.f54016n;
        int i14 = i13;
        int i15 = i10;
        while (i15 < i12 && (cCharAt = str.charAt(i15)) <= 127 && iArr[cCharAt] == 0) {
            bArr[i14] = (byte) cCharAt;
            i15++;
            i14++;
        }
        this.f54076y = i14;
        if (i15 < i12) {
            cc.e eVar = this.f54018p;
            byte b11 = 92;
            int i16 = this.f54077z;
            if (eVar != null) {
                if (o2.b(i12, i15, 6, i14) > i16) {
                    r();
                }
                int iA = this.f54076y;
                byte[] bArr2 = this.f54075x;
                int[] iArr2 = this.f54016n;
                int i17 = this.f54017o;
                if (i17 <= 0) {
                    i17 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                }
                cc.e eVar2 = this.f54018p;
                while (i15 < i12) {
                    int i18 = i15 + 1;
                    char cCharAt2 = str.charAt(i15);
                    if (cCharAt2 <= 127) {
                        int i19 = iArr2[cCharAt2];
                        if (i19 == 0) {
                            bArr2[iA] = (byte) cCharAt2;
                            iA++;
                        } else if (i19 > 0) {
                            int i20 = iA + 1;
                            bArr2[iA] = b11;
                            iA += 2;
                            bArr2[i20] = (byte) i19;
                        } else if (i19 == -2) {
                            c0 escapeSequence = eVar2.getEscapeSequence(cCharAt2);
                            if (escapeSequence == null) {
                                e("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt2) + ", although was supposed to have one");
                                throw null;
                            }
                            iA = z(bArr2, iA, escapeSequence, i12 - i18);
                        } else {
                            iA = A(cCharAt2, iA);
                        }
                    } else if (cCharAt2 > i17) {
                        iA = A(cCharAt2, iA);
                    } else {
                        c0 escapeSequence2 = eVar2.getEscapeSequence(cCharAt2);
                        if (escapeSequence2 != null) {
                            iA = z(bArr2, iA, escapeSequence2, i12 - i18);
                        } else {
                            if (cCharAt2 <= 2047) {
                                int i21 = iA + 1;
                                bArr2[iA] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                                iA += 2;
                                bArr2[i21] = (byte) ((cCharAt2 & '?') | 128);
                                b10 = b11;
                            } else {
                                if ((cCharAt2 & 64512) == 55296) {
                                    b10 = b11;
                                    if (ub.n.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.f90506g) && i18 < i12) {
                                        i15 += 2;
                                        iA = u(cCharAt2, str.charAt(i18), iA);
                                        b11 = b10;
                                    }
                                } else {
                                    b10 = b11;
                                }
                                iA = s(cCharAt2, iA);
                            }
                            b11 = b10;
                        }
                    }
                    i15 = i18;
                }
                this.f54076y = iA;
                return;
            }
            if (this.f54017o != 0) {
                if (o2.b(i12, i15, 6, i14) > i16) {
                    r();
                }
                int iS2 = this.f54076y;
                byte[] bArr3 = this.f54075x;
                int[] iArr3 = this.f54016n;
                int i22 = this.f54017o;
                while (i15 < i12) {
                    int i23 = i15 + 1;
                    char cCharAt3 = str.charAt(i15);
                    if (cCharAt3 <= 127) {
                        int i24 = iArr3[cCharAt3];
                        if (i24 == 0) {
                            bArr3[iS2] = (byte) cCharAt3;
                            i15 = i23;
                            iS2++;
                        } else if (i24 > 0) {
                            int i25 = iS2 + 1;
                            bArr3[iS2] = 92;
                            iS2 += 2;
                            bArr3[i25] = (byte) i24;
                        } else {
                            iS2 = A(cCharAt3, iS2);
                        }
                    } else if (cCharAt3 > i22) {
                        iS2 = A(cCharAt3, iS2);
                    } else if (cCharAt3 <= 2047) {
                        int i26 = iS2 + 1;
                        bArr3[iS2] = (byte) ((cCharAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                        iS2 += 2;
                        bArr3[i26] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        iS2 = s(cCharAt3, iS2);
                    }
                    i15 = i23;
                }
                this.f54076y = iS2;
                return;
            }
            if (o2.b(i12, i15, 6, i14) > i16) {
                r();
            }
            int iA2 = this.f54076y;
            byte[] bArr4 = this.f54075x;
            int[] iArr4 = this.f54016n;
            while (i15 < i12) {
                int i27 = i15 + 1;
                char cCharAt4 = str.charAt(i15);
                if (cCharAt4 <= 127) {
                    int i28 = iArr4[cCharAt4];
                    if (i28 == 0) {
                        iS = iA2 + 1;
                        bArr4[iA2] = (byte) cCharAt4;
                        iA2 = iS;
                        i15 = i27;
                    } else {
                        if (i28 > 0) {
                            int i29 = iA2 + 1;
                            bArr4[iA2] = 92;
                            iA2 += 2;
                            bArr4[i29] = (byte) i28;
                        } else {
                            iA2 = A(cCharAt4, iA2);
                        }
                        i15 = i27;
                    }
                } else if (cCharAt4 <= 2047) {
                    int i30 = iA2 + 1;
                    bArr4[iA2] = (byte) ((cCharAt4 >> 6) | PsExtractor.AUDIO_STREAM);
                    iA2 += 2;
                    bArr4[i30] = (byte) ((cCharAt4 & '?') | 128);
                    i15 = i27;
                } else if ((cCharAt4 & 64512) == 55296 && ub.n.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.f90506g) && i27 < i12) {
                    i15 += 2;
                    iA2 = u(cCharAt4, str.charAt(i27), iA2);
                } else {
                    iS = s(cCharAt4, iA2);
                    iA2 = iS;
                    i15 = i27;
                }
            }
            this.f54076y = iA2;
        }
    }

    public final void E(int i10, char[] cArr, int i11) throws IOException {
        int iS;
        char c10;
        char c11;
        int i12 = i11 + i10;
        int i13 = this.f54076y;
        byte[] bArr = this.f54075x;
        int[] iArr = this.f54016n;
        int i14 = i13;
        int i15 = i10;
        while (i15 < i12 && (c11 = cArr[i15]) <= 127 && iArr[c11] == 0) {
            bArr[i14] = (byte) c11;
            i15++;
            i14++;
        }
        this.f54076y = i14;
        if (i15 < i12) {
            cc.e eVar = this.f54018p;
            char c12 = 64512;
            int i16 = this.f54077z;
            if (eVar != null) {
                if (o2.b(i12, i15, 6, i14) > i16) {
                    r();
                }
                int iA = this.f54076y;
                byte[] bArr2 = this.f54075x;
                int[] iArr2 = this.f54016n;
                int i17 = this.f54017o;
                if (i17 <= 0) {
                    i17 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                }
                cc.e eVar2 = this.f54018p;
                while (i15 < i12) {
                    int i18 = i15 + 1;
                    char c13 = cArr[i15];
                    if (c13 <= 127) {
                        int i19 = iArr2[c13];
                        if (i19 == 0) {
                            bArr2[iA] = (byte) c13;
                            iA++;
                        } else if (i19 > 0) {
                            int i20 = iA + 1;
                            bArr2[iA] = 92;
                            iA += 2;
                            bArr2[i20] = (byte) i19;
                        } else if (i19 == -2) {
                            c0 escapeSequence = eVar2.getEscapeSequence(c13);
                            if (escapeSequence == null) {
                                e("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c13) + ", although was supposed to have one");
                                throw null;
                            }
                            iA = z(bArr2, iA, escapeSequence, i12 - i18);
                        } else {
                            iA = A(c13, iA);
                        }
                    } else if (c13 > i17) {
                        iA = A(c13, iA);
                    } else {
                        c0 escapeSequence2 = eVar2.getEscapeSequence(c13);
                        if (escapeSequence2 != null) {
                            iA = z(bArr2, iA, escapeSequence2, i12 - i18);
                        } else {
                            if (c13 <= 2047) {
                                int i21 = iA + 1;
                                bArr2[iA] = (byte) ((c13 >> 6) | PsExtractor.AUDIO_STREAM);
                                iA += 2;
                                bArr2[i21] = (byte) ((c13 & '?') | 128);
                                c10 = c12;
                            } else {
                                if ((c13 & c12) == 55296) {
                                    c10 = c12;
                                    if (ub.n.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.f90506g) && i18 < i12) {
                                        i15 += 2;
                                        iA = u(c13, cArr[i18], iA);
                                        c12 = c10;
                                    }
                                } else {
                                    c10 = c12;
                                }
                                iA = s(c13, iA);
                            }
                            c12 = c10;
                        }
                    }
                    i15 = i18;
                }
                this.f54076y = iA;
                return;
            }
            if (this.f54017o != 0) {
                if (o2.b(i12, i15, 6, i14) > i16) {
                    r();
                }
                int iS2 = this.f54076y;
                byte[] bArr3 = this.f54075x;
                int[] iArr3 = this.f54016n;
                int i22 = this.f54017o;
                while (i15 < i12) {
                    int i23 = i15 + 1;
                    char c14 = cArr[i15];
                    if (c14 <= 127) {
                        int i24 = iArr3[c14];
                        if (i24 == 0) {
                            bArr3[iS2] = (byte) c14;
                            i15 = i23;
                            iS2++;
                        } else if (i24 > 0) {
                            int i25 = iS2 + 1;
                            bArr3[iS2] = 92;
                            iS2 += 2;
                            bArr3[i25] = (byte) i24;
                        } else {
                            iS2 = A(c14, iS2);
                        }
                    } else if (c14 > i22) {
                        iS2 = A(c14, iS2);
                    } else if (c14 <= 2047) {
                        int i26 = iS2 + 1;
                        bArr3[iS2] = (byte) ((c14 >> 6) | PsExtractor.AUDIO_STREAM);
                        iS2 += 2;
                        bArr3[i26] = (byte) ((c14 & '?') | 128);
                    } else {
                        iS2 = s(c14, iS2);
                    }
                    i15 = i23;
                }
                this.f54076y = iS2;
                return;
            }
            if (o2.b(i12, i15, 6, i14) > i16) {
                r();
            }
            int iA2 = this.f54076y;
            byte[] bArr4 = this.f54075x;
            int[] iArr4 = this.f54016n;
            while (i15 < i12) {
                int i27 = i15 + 1;
                char c15 = cArr[i15];
                if (c15 <= 127) {
                    int i28 = iArr4[c15];
                    if (i28 == 0) {
                        iS = iA2 + 1;
                        bArr4[iA2] = (byte) c15;
                        iA2 = iS;
                        i15 = i27;
                    } else {
                        if (i28 > 0) {
                            int i29 = iA2 + 1;
                            bArr4[iA2] = 92;
                            iA2 += 2;
                            bArr4[i29] = (byte) i28;
                        } else {
                            iA2 = A(c15, iA2);
                        }
                        i15 = i27;
                    }
                } else if (c15 <= 2047) {
                    int i30 = iA2 + 1;
                    bArr4[iA2] = (byte) ((c15 >> 6) | PsExtractor.AUDIO_STREAM);
                    iA2 += 2;
                    bArr4[i30] = (byte) ((c15 & '?') | 128);
                    i15 = i27;
                } else if ((c15 & 64512) == 55296 && ub.n.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this.f90506g) && i27 < i12) {
                    i15 += 2;
                    iA2 = u(c15, cArr[i27], iA2);
                } else {
                    iS = s(c15, iA2);
                    iA2 = iS;
                    i15 = i27;
                }
            }
            this.f54076y = iA2;
        }
    }

    public final void F(int i10, char[] cArr, int i11) throws IOException {
        do {
            int iMin = Math.min(this.A, i11);
            if (this.f54076y + iMin > this.f54077z) {
                r();
            }
            E(i10, cArr, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public final void G(String str, boolean z10) throws IOException {
        byte b10 = this.f54074w;
        int i10 = this.f54077z;
        if (z10) {
            if (this.f54076y >= i10) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i11 = this.f54076y;
            this.f54076y = i11 + 1;
            bArr[i11] = b10;
        }
        int length = str.length();
        int i12 = 0;
        while (length > 0) {
            int iMin = Math.min(this.A, length);
            if (this.f54076y + iMin > i10) {
                r();
            }
            D(i12, iMin, str);
            i12 += iMin;
            length -= iMin;
        }
        if (z10) {
            if (this.f54076y >= i10) {
                r();
            }
            byte[] bArr2 = this.f54075x;
            int i13 = this.f54076y;
            this.f54076y = i13 + 1;
            bArr2[i13] = b10;
        }
    }

    public final void H(int i10, int i11, byte[] bArr) throws IOException {
        int i12;
        int[] iArr = this.f54016n;
        int i13 = i10 + i11;
        int i14 = i10;
        while (true) {
            int i15 = this.f54077z;
            if (i14 >= i13) {
                if (this.f54076y + i11 > i15) {
                    r();
                }
                System.arraycopy(bArr, i10, this.f54075x, this.f54076y, i11);
                this.f54076y += i11;
                return;
            }
            int i16 = i14 + 1;
            byte b10 = bArr[i14];
            if (b10 >= 0 && iArr[b10] != 0) {
                int iA = this.f54076y;
                if ((i11 * 6) + iA > i15) {
                    r();
                    iA = this.f54076y;
                }
                byte[] bArr2 = this.f54075x;
                int[] iArr2 = this.f54016n;
                while (i10 < i13) {
                    int i17 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (b11 < 0 || (i12 = iArr2[b11]) == 0) {
                        bArr2[iA] = b11;
                        i10 = i17;
                        iA++;
                    } else {
                        if (i12 > 0) {
                            int i18 = iA + 1;
                            bArr2[iA] = 92;
                            iA += 2;
                            bArr2[i18] = (byte) i12;
                        } else {
                            iA = A(b11, iA);
                        }
                        i10 = i17;
                    }
                }
                this.f54076y = iA;
                return;
            }
            i14 = i16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
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
            byte[] r1 = r5.f54075x     // Catch: java.io.IOException -> L1e
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
            r5.r()     // Catch: java.io.IOException -> L1e
            r1 = r0
        L2e:
            r2 = 0
            r5.f54076y = r2
            cc.h r2 = r5.f90507h
            java.io.OutputStream r3 = r5.f54073v
            if (r3 == 0) goto L60
            boolean r4 = r2.isResourceManaged()     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            if (r4 != 0) goto L56
            ub.n r4 = ub.n.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            boolean r4 = r5.isEnabled(r4)     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            if (r4 == 0) goto L46
            goto L56
        L46:
            ub.n r4 = ub.n.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            boolean r4 = r5.isEnabled(r4)     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            if (r4 == 0) goto L60
            r3.flush()     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            goto L60
        L52:
            r0 = move-exception
            goto L5a
        L54:
            r0 = move-exception
            goto L5a
        L56:
            r3.close()     // Catch: java.lang.RuntimeException -> L52 java.io.IOException -> L54
            goto L60
        L5a:
            if (r1 == 0) goto L5f
            r0.addSuppressed(r1)
        L5f:
            throw r0
        L60:
            byte[] r3 = r5.f54075x
            if (r3 == 0) goto L6d
            boolean r4 = r5.D
            if (r4 == 0) goto L6d
            r5.f54075x = r0
            r2.releaseWriteEncodingBuffer(r3)
        L6d:
            char[] r3 = r5.B
            if (r3 == 0) goto L76
            r5.B = r0
            r2.releaseConcatBuffer(r3)
        L76:
            if (r1 != 0) goto L79
            return
        L79:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.l.close():void");
    }

    @Override // wb.a, ub.o, java.io.Flushable
    public void flush() throws IOException {
        r();
        OutputStream outputStream = this.f54073v;
        if (outputStream == null || !isEnabled(ub.n.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        outputStream.flush();
    }

    @Override // ub.o
    public int getOutputBuffered() {
        return this.f54076y;
    }

    @Override // ub.o
    public Object getOutputTarget() {
        return this.f54073v;
    }

    @Override // wb.a
    public final void o(String str) throws IOException {
        byte b10;
        int iWriteValue = this.f90509j.writeValue();
        if (this.f88311b != null) {
            q(iWriteValue, str);
            return;
        }
        if (iWriteValue == 1) {
            b10 = 44;
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
                    byte[] bArrAsUnquotedUTF8 = c0Var.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        y(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b10 = 58;
        }
        if (this.f54076y >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i10 = this.f54076y;
        this.f54076y = i10 + 1;
        bArr[i10] = b10;
    }

    public final void r() throws IOException {
        int i10 = this.f54076y;
        if (i10 > 0) {
            this.f54076y = 0;
            this.f54073v.write(this.f54075x, 0, i10);
        }
    }

    public final int s(int i10, int i11) {
        byte[] bArr = this.f54021s ? E : F;
        byte[] bArr2 = this.f54075x;
        if (i10 < 55296 || i10 > 57343) {
            bArr2[i11] = (byte) ((i10 >> 12) | 224);
            int i12 = i11 + 2;
            bArr2[i11 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            int i13 = i11 + 3;
            bArr2[i12] = (byte) ((i10 & 63) | 128);
            return i13;
        }
        bArr2[i11] = 92;
        bArr2[i11 + 1] = 117;
        bArr2[i11 + 2] = bArr[(i10 >> 12) & 15];
        bArr2[i11 + 3] = bArr[(i10 >> 8) & 15];
        int i14 = i11 + 5;
        bArr2[i11 + 4] = bArr[(i10 >> 4) & 15];
        int i15 = i11 + 6;
        bArr2[i14] = bArr[i10 & 15];
        return i15;
    }

    public final int t(int i10, int i11, char[] cArr, int i12) throws IOException {
        if (i10 < 55296 || i10 > 57343) {
            byte[] bArr = this.f54075x;
            int i13 = this.f54076y;
            int i14 = i13 + 1;
            this.f54076y = i14;
            bArr[i13] = (byte) ((i10 >> 12) | 224);
            int i15 = i13 + 2;
            this.f54076y = i15;
            bArr[i14] = (byte) (((i10 >> 6) & 63) | 128);
            this.f54076y = i13 + 3;
            bArr[i15] = (byte) ((i10 & 63) | 128);
            return i11;
        }
        if (i11 >= i12 || cArr == null) {
            e(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i10)));
            throw null;
        }
        char c10 = cArr[i11];
        if (c10 < 56320 || c10 > 57343) {
            e(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i10), Integer.valueOf(c10)));
            throw null;
        }
        int i16 = ((i10 << 10) + c10) - 56613888;
        if (this.f54076y + 4 > this.f54077z) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i17 = this.f54076y;
        int i18 = i17 + 1;
        this.f54076y = i18;
        bArr2[i17] = (byte) ((i16 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        int i19 = i17 + 2;
        this.f54076y = i19;
        bArr2[i18] = (byte) (((i16 >> 12) & 63) | 128);
        int i20 = i17 + 3;
        this.f54076y = i20;
        bArr2[i19] = (byte) (((i16 >> 6) & 63) | 128);
        this.f54076y = i17 + 4;
        bArr2[i20] = (byte) ((i16 & 63) | 128);
        return i11 + 1;
    }

    public final int u(char c10, char c11, int i10) {
        int i11 = ((c10 & 1023) << 10) + C.DEFAULT_BUFFER_SEGMENT_SIZE + (c11 & 1023);
        byte[] bArr = this.f54075x;
        bArr[i10] = (byte) (((i11 >> 18) & 7) + PsExtractor.VIDEO_STREAM_MASK);
        bArr[i10 + 1] = (byte) (((i11 >> 12) & 63) + 128);
        int i12 = i10 + 3;
        bArr[i10 + 2] = (byte) (((i11 >> 6) & 63) + 128);
        int i13 = i10 + 4;
        bArr[i12] = (byte) ((i11 & 63) + 128);
        return i13;
    }

    public final int w(ub.b bVar, InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f54077z - 6;
        int i11 = 2;
        int maxLineLength = bVar.getMaxLineLength() >> 2;
        int i12 = -3;
        int i13 = 0;
        int iV = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iV = v(inputStream, bArr, i13, iV, bArr.length);
                if (iV < 3) {
                    break;
                }
                i12 = iV - 3;
                i13 = 0;
            }
            if (this.f54076y > i10) {
                r();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iEncodeBase64Chunk = bVar.encodeBase64Chunk((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16, this.f54075x, this.f54076y);
            this.f54076y = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f54075x;
                int i17 = iEncodeBase64Chunk + 1;
                this.f54076y = i17;
                bArr2[iEncodeBase64Chunk] = 92;
                this.f54076y = iEncodeBase64Chunk + 2;
                bArr2[i17] = 110;
                maxLineLength = bVar.getMaxLineLength() >> 2;
            }
        }
        if (iV <= 0) {
            return i14;
        }
        if (this.f54076y > i10) {
            r();
        }
        int i18 = bArr[0] << 16;
        if (1 < iV) {
            i18 |= (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i14 + i11;
        this.f54076y = bVar.encodeBase64Partial(i18, i11, this.f54075x, this.f54076y);
        return i19;
    }

    @Override // ub.o
    public void writeBinary(ub.b bVar, byte[] bArr, int i10, int i11) throws IOException {
        int iEncodeBase64Chunk;
        k(i10, i11, bArr);
        o("write a binary value");
        int i12 = this.f54076y;
        int i13 = this.f54077z;
        if (i12 >= i13) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i14 = this.f54076y;
        this.f54076y = i14 + 1;
        byte b10 = this.f54074w;
        bArr2[i14] = b10;
        int i15 = i11 + i10;
        int i16 = i15 - 3;
        int i17 = i13 - 6;
        int maxLineLength = bVar.getMaxLineLength();
        loop0: while (true) {
            int i18 = maxLineLength >> 2;
            while (i10 <= i16) {
                if (this.f54076y > i17) {
                    r();
                }
                int i19 = i10 + 2;
                int i20 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iEncodeBase64Chunk = bVar.encodeBase64Chunk(i20 | (bArr[i19] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED), this.f54075x, this.f54076y);
                this.f54076y = iEncodeBase64Chunk;
                i18--;
                if (i18 <= 0) {
                    break;
                }
            }
            byte[] bArr3 = this.f54075x;
            int i21 = iEncodeBase64Chunk + 1;
            this.f54076y = i21;
            bArr3[iEncodeBase64Chunk] = 92;
            this.f54076y = iEncodeBase64Chunk + 2;
            bArr3[i21] = 110;
            maxLineLength = bVar.getMaxLineLength();
        }
        int i22 = i15 - i10;
        if (i22 > 0) {
            if (this.f54076y > i17) {
                r();
            }
            int i23 = i10 + 1;
            int i24 = bArr[i10] << 16;
            if (i22 == 2) {
                i24 |= (bArr[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            }
            this.f54076y = bVar.encodeBase64Partial(i24, i22, this.f54075x, this.f54076y);
        }
        if (this.f54076y >= i13) {
            r();
        }
        byte[] bArr4 = this.f54075x;
        int i25 = this.f54076y;
        this.f54076y = i25 + 1;
        bArr4[i25] = b10;
    }

    @Override // ub.o
    public void writeBoolean(boolean z10) throws IOException {
        o("write a boolean value");
        if (this.f54076y + 5 >= this.f54077z) {
            r();
        }
        byte[] bArr = z10 ? H : I;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f54075x, this.f54076y, length);
        this.f54076y += length;
    }

    @Override // ub.o
    public final void writeEndArray() throws IOException {
        if (!this.f90509j.inArray()) {
            e("Current context not Array but " + this.f90509j.typeDesc());
            throw null;
        }
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeEndArray(this, this.f90509j.getEntryCount());
        } else {
            if (this.f54076y >= this.f54077z) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i10 = this.f54076y;
            this.f54076y = i10 + 1;
            bArr[i10] = 93;
        }
        this.f90509j = this.f90509j.clearAndGetParent();
    }

    @Override // ub.o
    public final void writeEndObject() throws IOException {
        if (!this.f90509j.inObject()) {
            e("Current context not Object but " + this.f90509j.typeDesc());
            throw null;
        }
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeEndObject(this, this.f90509j.getEntryCount());
        } else {
            if (this.f54076y >= this.f54077z) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i10 = this.f54076y;
            this.f54076y = i10 + 1;
            bArr[i10] = 125;
        }
        this.f90509j = this.f90509j.clearAndGetParent();
    }

    @Override // ub.o
    public void writeFieldName(String str) throws IOException {
        b0 b0Var = this.f88311b;
        int i10 = this.C;
        int i11 = this.A;
        byte b10 = this.f54074w;
        int i12 = 0;
        int i13 = this.f54077z;
        if (b0Var != null) {
            int iWriteFieldName = this.f90509j.writeFieldName(str);
            if (iWriteFieldName == 4) {
                e("Can not write a field name, expecting a value");
                throw null;
            }
            if (iWriteFieldName == 1) {
                this.f88311b.writeObjectEntrySeparator(this);
            } else {
                this.f88311b.beforeObjectEntries(this);
            }
            if (this.f54020r) {
                G(str, false);
                return;
            }
            int length = str.length();
            if (length > i10) {
                G(str, true);
                return;
            }
            if (this.f54076y >= i13) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i14 = this.f54076y;
            this.f54076y = i14 + 1;
            bArr[i14] = b10;
            str.getChars(0, length, this.B, 0);
            if (length <= i11) {
                if (this.f54076y + length > i13) {
                    r();
                }
                E(0, this.B, length);
            } else {
                F(0, this.B, length);
            }
            if (this.f54076y >= i13) {
                r();
            }
            byte[] bArr2 = this.f54075x;
            int i15 = this.f54076y;
            this.f54076y = i15 + 1;
            bArr2[i15] = b10;
            return;
        }
        int iWriteFieldName2 = this.f90509j.writeFieldName(str);
        if (iWriteFieldName2 == 4) {
            e("Can not write a field name, expecting a value");
            throw null;
        }
        if (iWriteFieldName2 == 1) {
            if (this.f54076y >= i13) {
                r();
            }
            byte[] bArr3 = this.f54075x;
            int i16 = this.f54076y;
            this.f54076y = i16 + 1;
            bArr3[i16] = 44;
        }
        if (this.f54020r) {
            G(str, false);
            return;
        }
        int length2 = str.length();
        if (length2 > i10) {
            G(str, true);
            return;
        }
        if (this.f54076y >= i13) {
            r();
        }
        byte[] bArr4 = this.f54075x;
        int i17 = this.f54076y;
        int i18 = i17 + 1;
        this.f54076y = i18;
        bArr4[i17] = b10;
        if (length2 <= i11) {
            if (i18 + length2 > i13) {
                r();
            }
            D(0, length2, str);
        } else {
            do {
                int iMin = Math.min(i11, length2);
                if (this.f54076y + iMin > i13) {
                    r();
                }
                D(i12, iMin, str);
                i12 += iMin;
                length2 -= iMin;
            } while (length2 > 0);
        }
        if (this.f54076y >= i13) {
            r();
        }
        byte[] bArr5 = this.f54075x;
        int i19 = this.f54076y;
        this.f54076y = i19 + 1;
        bArr5[i19] = b10;
    }

    @Override // ub.o
    public void writeNull() throws IOException {
        o("write a null");
        B();
    }

    @Override // ub.o
    public void writeNumber(short s10) throws IOException {
        o("write a number");
        int i10 = this.f54076y + 6;
        int i11 = this.f54077z;
        if (i10 >= i11) {
            r();
        }
        if (!this.f90508i) {
            this.f54076y = cc.n.outputInt(s10, this.f54075x, this.f54076y);
            return;
        }
        if (this.f54076y + 8 >= i11) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i12 = this.f54076y;
        int i13 = i12 + 1;
        this.f54076y = i13;
        byte b10 = this.f54074w;
        bArr[i12] = b10;
        int iOutputInt = cc.n.outputInt(s10, bArr, i13);
        byte[] bArr2 = this.f54075x;
        this.f54076y = iOutputInt + 1;
        bArr2[iOutputInt] = b10;
    }

    @Override // ub.o
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.B;
        if (length > cArr.length) {
            writeRaw(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    @Override // ub.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeRawUTF8String(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            r5.k(r7, r8, r6)
            java.lang.String r0 = "write a string"
            r5.o(r0)
            int r0 = r5.f54076y
            int r1 = r5.f54077z
            if (r0 < r1) goto L11
            r5.r()
        L11:
            byte[] r0 = r5.f54075x
            int r2 = r5.f54076y
            int r3 = r2 + 1
            r5.f54076y = r3
            byte r4 = r5.f54074w
            r0[r2] = r4
            int r3 = r3 + r8
            if (r3 <= r1) goto L2d
            r5.r()
            r0 = 512(0x200, float:7.17E-43)
            if (r8 <= r0) goto L2d
            java.io.OutputStream r0 = r5.f54073v
            r0.write(r6, r7, r8)
            goto L39
        L2d:
            byte[] r0 = r5.f54075x
            int r2 = r5.f54076y
            java.lang.System.arraycopy(r6, r7, r0, r2, r8)
            int r6 = r5.f54076y
            int r6 = r6 + r8
            r5.f54076y = r6
        L39:
            int r6 = r5.f54076y
            if (r6 < r1) goto L40
            r5.r()
        L40:
            byte[] r6 = r5.f54075x
            int r7 = r5.f54076y
            int r8 = r7 + 1
            r5.f54076y = r8
            r6[r7] = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.l.writeRawUTF8String(byte[], int, int):void");
    }

    @Override // wb.a, ub.o
    public void writeRawValue(c0 c0Var) throws IOException {
        o("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = c0Var.appendUnquotedUTF8(this.f54075x, this.f54076y);
        if (iAppendUnquotedUTF8 < 0) {
            y(c0Var.asUnquotedUTF8());
        } else {
            this.f54076y += iAppendUnquotedUTF8;
        }
    }

    @Override // ub.o
    public final void writeStartArray() throws IOException {
        o("start an array");
        this.f90509j = this.f90509j.createChildArrayContext();
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartArray(this);
            return;
        }
        if (this.f54076y >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i10 = this.f54076y;
        this.f54076y = i10 + 1;
        bArr[i10] = 91;
    }

    @Override // ub.o
    public final void writeStartObject() throws IOException {
        o("start an object");
        this.f90509j = this.f90509j.createChildObjectContext();
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartObject(this);
            return;
        }
        if (this.f54076y >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i10 = this.f54076y;
        this.f54076y = i10 + 1;
        bArr[i10] = 123;
    }

    @Override // ub.o
    public void writeString(String str) throws IOException {
        o("write a string");
        if (str == null) {
            B();
            return;
        }
        int length = str.length();
        if (length > this.A) {
            G(str, true);
            return;
        }
        int i10 = this.f54076y + length;
        int i11 = this.f54077z;
        if (i10 >= i11) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i12 = this.f54076y;
        this.f54076y = i12 + 1;
        byte b10 = this.f54074w;
        bArr[i12] = b10;
        D(0, length, str);
        if (this.f54076y >= i11) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i13 = this.f54076y;
        this.f54076y = i13 + 1;
        bArr2[i13] = b10;
    }

    @Override // ub.o
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        k(i10, i11, bArr);
        o("write a string");
        int i12 = this.f54076y;
        int i13 = this.f54077z;
        if (i12 >= i13) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i14 = this.f54076y;
        this.f54076y = i14 + 1;
        byte b10 = this.f54074w;
        bArr2[i14] = b10;
        int i15 = this.A;
        if (i11 <= i15) {
            H(i10, i11, bArr);
        } else {
            do {
                int iMin = Math.min(i15, i11);
                H(i10, iMin, bArr);
                i10 += iMin;
                i11 -= iMin;
            } while (i11 > 0);
        }
        if (this.f54076y >= i13) {
            r();
        }
        byte[] bArr3 = this.f54075x;
        int i16 = this.f54076y;
        this.f54076y = i16 + 1;
        bArr3[i16] = b10;
    }

    public final int x(ub.b bVar, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int iV;
        int i11 = this.f54077z - 6;
        int i12 = 2;
        int maxLineLength = bVar.getMaxLineLength() >> 2;
        int i13 = -3;
        int i14 = 0;
        int iV2 = 0;
        while (true) {
            if (i10 <= 2) {
                break;
            }
            if (i14 > i13) {
                iV2 = v(inputStream, bArr, i14, iV2, i10);
                if (iV2 < 3) {
                    i14 = 0;
                    break;
                }
                i13 = iV2 - 3;
                i14 = 0;
            }
            if (this.f54076y > i11) {
                r();
            }
            int i15 = i14 + 2;
            int i16 = ((bArr[i14 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i14] << 8)) << 8;
            i14 += 3;
            i10 -= 3;
            int iEncodeBase64Chunk = bVar.encodeBase64Chunk((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16, this.f54075x, this.f54076y);
            this.f54076y = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.f54075x;
                int i17 = iEncodeBase64Chunk + 1;
                this.f54076y = i17;
                bArr2[iEncodeBase64Chunk] = 92;
                this.f54076y = iEncodeBase64Chunk + 2;
                bArr2[i17] = 110;
                maxLineLength = bVar.getMaxLineLength() >> 2;
            }
        }
        if (i10 <= 0 || (iV = v(inputStream, bArr, i14, iV2, i10)) <= 0) {
            return i10;
        }
        if (this.f54076y > i11) {
            r();
        }
        int i18 = bArr[0] << 16;
        if (1 < iV) {
            i18 |= (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        } else {
            i12 = 1;
        }
        this.f54076y = bVar.encodeBase64Partial(i18, i12, this.f54075x, this.f54076y);
        return i10 - i12;
    }

    public final void y(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f54076y + length > this.f54077z) {
            r();
            if (length > 512) {
                this.f54073v.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f54075x, this.f54076y, length);
        this.f54076y += length;
    }

    public final int z(byte[] bArr, int i10, c0 c0Var, int i11) throws IOException {
        byte[] bArrAsUnquotedUTF8 = c0Var.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length <= 6) {
            System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i10, length);
            return i10 + length;
        }
        int length2 = bArrAsUnquotedUTF8.length;
        int i12 = i10 + length2;
        int i13 = this.f54077z;
        if (i12 > i13) {
            this.f54076y = i10;
            r();
            i10 = this.f54076y;
            if (length2 > bArr.length) {
                this.f54073v.write(bArrAsUnquotedUTF8, 0, length2);
                return i10;
            }
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i10, length2);
        int i14 = i10 + length2;
        if ((i11 * 6) + i14 <= i13) {
            return i14;
        }
        this.f54076y = i14;
        r();
        return this.f54076y;
    }

    @Override // ub.o
    public void writeRaw(String str, int i10, int i11) throws IOException {
        char c10;
        m(i10, i11, str);
        char[] cArr = this.B;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            writeRaw(cArr, 0, i11);
            return;
        }
        int i12 = this.f54077z;
        int iMin = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = iMin * 3;
        while (i11 > 0) {
            int iMin2 = Math.min(iMin, i11);
            str.getChars(i10, i10 + iMin2, cArr, 0);
            if (this.f54076y + i13 > i12) {
                r();
            }
            if (iMin2 > 1 && (c10 = cArr[iMin2 - 1]) >= 55296 && c10 <= 56319) {
                iMin2--;
            }
            int iT = 0;
            while (iT < iMin2) {
                do {
                    char c11 = cArr[iT];
                    if (c11 > 127) {
                        iT++;
                        if (c11 < 2048) {
                            byte[] bArr = this.f54075x;
                            int i14 = this.f54076y;
                            int i15 = i14 + 1;
                            this.f54076y = i15;
                            bArr[i14] = (byte) ((c11 >> 6) | PsExtractor.AUDIO_STREAM);
                            this.f54076y = i14 + 2;
                            bArr[i15] = (byte) ((c11 & '?') | 128);
                        } else {
                            iT = t(c11, iT, cArr, iMin2);
                        }
                    } else {
                        byte[] bArr2 = this.f54075x;
                        int i16 = this.f54076y;
                        this.f54076y = i16 + 1;
                        bArr2[i16] = (byte) c11;
                        iT++;
                    }
                } while (iT < iMin2);
                i10 += iMin2;
                i11 -= iMin2;
            }
            i10 += iMin2;
            i11 -= iMin2;
        }
    }

    @Override // ub.o
    public final void writeStartArray(Object obj) throws IOException {
        o("start an array");
        this.f90509j = this.f90509j.createChildArrayContext(obj);
        streamWriteConstraints().validateNestingDepth(this.f90509j.getNestingDepth());
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartArray(this);
            return;
        }
        if (this.f54076y >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i10 = this.f54076y;
        this.f54076y = i10 + 1;
        bArr[i10] = 91;
    }

    @Override // wb.a, ub.o
    public void writeStartObject(Object obj) throws IOException {
        o("start an object");
        g gVarCreateChildObjectContext = this.f90509j.createChildObjectContext(obj);
        streamWriteConstraints().validateNestingDepth(gVarCreateChildObjectContext.getNestingDepth());
        this.f90509j = gVarCreateChildObjectContext;
        b0 b0Var = this.f88311b;
        if (b0Var != null) {
            b0Var.writeStartObject(this);
            return;
        }
        if (this.f54076y >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i10 = this.f54076y;
        this.f54076y = i10 + 1;
        bArr[i10] = 123;
    }

    @Override // ub.o
    public void writeNumber(int i10) throws IOException {
        o("write a number");
        int i11 = this.f54076y + 11;
        int i12 = this.f54077z;
        if (i11 >= i12) {
            r();
        }
        if (this.f90508i) {
            if (this.f54076y + 13 >= i12) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i13 = this.f54076y;
            int i14 = i13 + 1;
            this.f54076y = i14;
            byte b10 = this.f54074w;
            bArr[i13] = b10;
            int iOutputInt = cc.n.outputInt(i10, bArr, i14);
            byte[] bArr2 = this.f54075x;
            this.f54076y = iOutputInt + 1;
            bArr2[iOutputInt] = b10;
            return;
        }
        this.f54076y = cc.n.outputInt(i10, this.f54075x, this.f54076y);
    }

    @Override // ub.o
    public void writeString(Reader reader, int i10) throws IOException {
        o("write a string");
        if (reader != null) {
            int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
            char[] cArr = this.B;
            int i12 = this.f54076y;
            int i13 = this.f54077z;
            if (i12 >= i13) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i14 = this.f54076y;
            this.f54076y = i14 + 1;
            byte b10 = this.f54074w;
            bArr[i14] = b10;
            while (i11 > 0) {
                int i15 = reader.read(cArr, 0, Math.min(i11, cArr.length));
                if (i15 <= 0) {
                    break;
                }
                if (this.f54076y + i10 >= i13) {
                    r();
                }
                F(0, cArr, i15);
                i11 -= i15;
            }
            if (this.f54076y >= i13) {
                r();
            }
            byte[] bArr2 = this.f54075x;
            int i16 = this.f54076y;
            this.f54076y = i16 + 1;
            bArr2[i16] = b10;
            if (i11 <= 0 || i10 < 0) {
                return;
            }
            e("Didn't read enough from reader");
            throw null;
        }
        e("null reader");
        throw null;
    }

    public l(cc.h hVar, int i10, a0 a0Var, OutputStream outputStream, char c10, byte[] bArr, int i11, boolean z10) {
        super(hVar, i10, a0Var);
        this.f54073v = outputStream;
        this.f54074w = (byte) c10;
        boolean zIsEnabled = isEnabled(h.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c10 != '\"' || zIsEnabled) {
            this.f54016n = cc.d.get7BitOutputEscapes(c10, zIsEnabled);
        }
        this.D = z10;
        this.f54076y = i11;
        this.f54075x = bArr;
        int length = bArr.length;
        this.f54077z = length;
        this.A = length >> 3;
        char[] cArrAllocConcatBuffer = hVar.allocConcatBuffer();
        this.B = cArrAllocConcatBuffer;
        this.C = cArrAllocConcatBuffer.length;
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
        if (this.f54076y >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i11 = this.f54076y;
        this.f54076y = i11 + 1;
        bArr[i11] = 91;
    }

    @Override // ub.o
    public void writeStartObject(Object obj, int i10) throws IOException {
        writeStartObject(obj);
    }

    @Override // ub.o
    public void writeNumber(long j10) throws IOException {
        o("write a number");
        boolean z10 = this.f90508i;
        int i10 = this.f54077z;
        if (z10) {
            if (this.f54076y + 23 >= i10) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i11 = this.f54076y;
            int i12 = i11 + 1;
            this.f54076y = i12;
            byte b10 = this.f54074w;
            bArr[i11] = b10;
            int iOutputLong = cc.n.outputLong(j10, bArr, i12);
            byte[] bArr2 = this.f54075x;
            this.f54076y = iOutputLong + 1;
            bArr2[iOutputLong] = b10;
            return;
        }
        if (this.f54076y + 21 >= i10) {
            r();
        }
        this.f54076y = cc.n.outputLong(j10, this.f54075x, this.f54076y);
    }

    @Override // ub.o
    public void writeRaw(c0 c0Var) throws IOException {
        int iAppendUnquotedUTF8 = c0Var.appendUnquotedUTF8(this.f54075x, this.f54076y);
        if (iAppendUnquotedUTF8 < 0) {
            y(c0Var.asUnquotedUTF8());
        } else {
            this.f54076y += iAppendUnquotedUTF8;
        }
    }

    @Override // wb.a, ub.o
    public int writeBinary(ub.b bVar, InputStream inputStream, int i10) throws IOException {
        o("write a binary value");
        int i11 = this.f54076y;
        int i12 = this.f54077z;
        if (i11 >= i12) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i13 = this.f54076y;
        this.f54076y = i13 + 1;
        byte b10 = this.f54074w;
        bArr[i13] = b10;
        cc.h hVar = this.f90507h;
        byte[] bArrAllocBase64Buffer = hVar.allocBase64Buffer();
        try {
            if (i10 < 0) {
                i10 = w(bVar, inputStream, bArrAllocBase64Buffer);
            } else {
                int iX = x(bVar, inputStream, bArrAllocBase64Buffer, i10);
                if (iX > 0) {
                    e("Too few bytes available: missing " + iX + " bytes (out of " + i10 + ")");
                    throw null;
                }
            }
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this.f54076y >= i12) {
                r();
            }
            byte[] bArr2 = this.f54075x;
            int i14 = this.f54076y;
            this.f54076y = i14 + 1;
            bArr2[i14] = b10;
            return i10;
        } catch (Throwable th2) {
            hVar.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th2;
        }
    }

    @Deprecated
    public l(cc.h hVar, int i10, a0 a0Var, OutputStream outputStream) {
        this(hVar, i10, a0Var, outputStream, AbstractJsonLexerKt.STRING);
    }

    @Override // ub.o
    public final void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        l(i10, cArr, i11);
        int i12 = i11 + i11 + i11;
        int i13 = this.f54076y + i12;
        int i14 = this.f54077z;
        if (i13 > i14) {
            if (i14 < i12) {
                byte[] bArr = this.f54075x;
                int i15 = i11 + i10;
                while (i10 < i15) {
                    do {
                        char c10 = cArr[i10];
                        if (c10 > 127) {
                            if (this.f54076y + 3 >= i14) {
                                r();
                            }
                            int i16 = i10 + 1;
                            char c11 = cArr[i10];
                            if (c11 < 2048) {
                                int i17 = this.f54076y;
                                int i18 = i17 + 1;
                                this.f54076y = i18;
                                bArr[i17] = (byte) ((c11 >> 6) | PsExtractor.AUDIO_STREAM);
                                this.f54076y = i17 + 2;
                                bArr[i18] = (byte) ((c11 & '?') | 128);
                                i10 = i16;
                            } else {
                                i10 = t(c11, i16, cArr, i15);
                            }
                        } else {
                            if (this.f54076y >= i14) {
                                r();
                            }
                            int i19 = this.f54076y;
                            this.f54076y = i19 + 1;
                            bArr[i19] = (byte) c10;
                            i10++;
                        }
                    } while (i10 < i15);
                    return;
                }
                return;
            }
            r();
        }
        int i20 = i11 + i10;
        while (i10 < i20) {
            do {
                char c12 = cArr[i10];
                if (c12 > 127) {
                    i10++;
                    if (c12 < 2048) {
                        byte[] bArr2 = this.f54075x;
                        int i21 = this.f54076y;
                        int i22 = i21 + 1;
                        this.f54076y = i22;
                        bArr2[i21] = (byte) ((c12 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.f54076y = i21 + 2;
                        bArr2[i22] = (byte) ((c12 & '?') | 128);
                    } else {
                        i10 = t(c12, i10, cArr, i20);
                    }
                } else {
                    byte[] bArr3 = this.f54075x;
                    int i23 = this.f54076y;
                    this.f54076y = i23 + 1;
                    bArr3[i23] = (byte) c12;
                    i10++;
                }
            } while (i10 < i20);
            return;
        }
    }

    @Deprecated
    public l(cc.h hVar, int i10, a0 a0Var, OutputStream outputStream, byte[] bArr, int i11, boolean z10) {
        this(hVar, i10, a0Var, outputStream, AbstractJsonLexerKt.STRING, bArr, i11, z10);
    }

    @Override // ub.o
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        o("write a string");
        int i12 = this.f54076y;
        int i13 = this.f54077z;
        if (i12 >= i13) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i14 = this.f54076y;
        int i15 = i14 + 1;
        this.f54076y = i15;
        byte b10 = this.f54074w;
        bArr[i14] = b10;
        if (i11 <= this.A) {
            if (i15 + i11 > i13) {
                r();
            }
            E(i10, cArr, i11);
        } else {
            F(i10, cArr, i11);
        }
        if (this.f54076y >= i13) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i16 = this.f54076y;
        this.f54076y = i16 + 1;
        bArr2[i16] = b10;
    }

    @Override // ub.o
    public void writeNumber(BigInteger bigInteger) throws IOException {
        o("write a number");
        if (bigInteger == null) {
            B();
        } else if (this.f90508i) {
            C(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // ub.o
    public void writeNumber(double d10) throws IOException {
        if (!this.f90508i && (!cc.n.notFinite(d10) || !ub.n.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f90506g))) {
            o("write a number");
            writeRaw(cc.n.toString(d10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(cc.n.toString(d10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // wb.a, ub.o
    public final void writeString(c0 c0Var) throws IOException {
        o("write a string");
        int i10 = this.f54076y;
        int i11 = this.f54077z;
        if (i10 >= i11) {
            r();
        }
        byte[] bArr = this.f54075x;
        int i12 = this.f54076y;
        int i13 = i12 + 1;
        this.f54076y = i13;
        byte b10 = this.f54074w;
        bArr[i12] = b10;
        int iAppendQuotedUTF8 = c0Var.appendQuotedUTF8(bArr, i13);
        if (iAppendQuotedUTF8 < 0) {
            y(c0Var.asQuotedUTF8());
        } else {
            this.f54076y += iAppendQuotedUTF8;
        }
        if (this.f54076y >= i11) {
            r();
        }
        byte[] bArr2 = this.f54075x;
        int i14 = this.f54076y;
        this.f54076y = i14 + 1;
        bArr2[i14] = b10;
    }

    @Override // wb.a, ub.o
    public void writeFieldName(c0 c0Var) throws IOException {
        b0 b0Var = this.f88311b;
        byte b10 = this.f54074w;
        int i10 = this.f54077z;
        if (b0Var != null) {
            int iWriteFieldName = this.f90509j.writeFieldName(c0Var.getValue());
            if (iWriteFieldName != 4) {
                if (iWriteFieldName == 1) {
                    this.f88311b.writeObjectEntrySeparator(this);
                } else {
                    this.f88311b.beforeObjectEntries(this);
                }
                boolean z10 = this.f54020r;
                if (!z10) {
                    if (this.f54076y >= i10) {
                        r();
                    }
                    byte[] bArr = this.f54075x;
                    int i11 = this.f54076y;
                    this.f54076y = i11 + 1;
                    bArr[i11] = b10;
                }
                int iAppendQuotedUTF8 = c0Var.appendQuotedUTF8(this.f54075x, this.f54076y);
                if (iAppendQuotedUTF8 < 0) {
                    y(c0Var.asQuotedUTF8());
                } else {
                    this.f54076y += iAppendQuotedUTF8;
                }
                if (z10) {
                    return;
                }
                if (this.f54076y >= i10) {
                    r();
                }
                byte[] bArr2 = this.f54075x;
                int i12 = this.f54076y;
                this.f54076y = i12 + 1;
                bArr2[i12] = b10;
                return;
            }
            e("Can not write a field name, expecting a value");
            throw null;
        }
        int iWriteFieldName2 = this.f90509j.writeFieldName(c0Var.getValue());
        if (iWriteFieldName2 != 4) {
            if (iWriteFieldName2 == 1) {
                if (this.f54076y >= i10) {
                    r();
                }
                byte[] bArr3 = this.f54075x;
                int i13 = this.f54076y;
                this.f54076y = i13 + 1;
                bArr3[i13] = 44;
            }
            if (this.f54020r) {
                int iAppendQuotedUTF82 = c0Var.appendQuotedUTF8(this.f54075x, this.f54076y);
                if (iAppendQuotedUTF82 < 0) {
                    y(c0Var.asQuotedUTF8());
                    return;
                } else {
                    this.f54076y += iAppendQuotedUTF82;
                    return;
                }
            }
            if (this.f54076y >= i10) {
                r();
            }
            byte[] bArr4 = this.f54075x;
            int i14 = this.f54076y;
            int i15 = i14 + 1;
            this.f54076y = i15;
            bArr4[i14] = b10;
            int iAppendQuotedUTF83 = c0Var.appendQuotedUTF8(bArr4, i15);
            if (iAppendQuotedUTF83 < 0) {
                y(c0Var.asQuotedUTF8());
            } else {
                this.f54076y += iAppendQuotedUTF83;
            }
            if (this.f54076y >= i10) {
                r();
            }
            byte[] bArr5 = this.f54075x;
            int i16 = this.f54076y;
            this.f54076y = i16 + 1;
            bArr5[i16] = b10;
            return;
        }
        e("Can not write a field name, expecting a value");
        throw null;
    }

    @Override // ub.o
    public void writeNumber(float f10) throws IOException {
        if (!this.f90508i && (!cc.n.notFinite(f10) || !ub.n.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.f90506g))) {
            o("write a number");
            writeRaw(cc.n.toString(f10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(cc.n.toString(f10, isEnabled(ub.n.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // ub.o
    public void writeRaw(char c10) throws IOException {
        if (this.f54076y + 3 >= this.f54077z) {
            r();
        }
        byte[] bArr = this.f54075x;
        if (c10 <= 127) {
            int i10 = this.f54076y;
            this.f54076y = i10 + 1;
            bArr[i10] = (byte) c10;
        } else {
            if (c10 < 2048) {
                int i11 = this.f54076y;
                int i12 = i11 + 1;
                this.f54076y = i12;
                bArr[i11] = (byte) ((c10 >> 6) | PsExtractor.AUDIO_STREAM);
                this.f54076y = i11 + 2;
                bArr[i12] = (byte) ((c10 & '?') | 128);
                return;
            }
            t(c10, 0, null, 0);
        }
    }

    @Override // ub.o
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        o("write a number");
        if (bigDecimal == null) {
            B();
        } else if (this.f90508i) {
            C(j(bigDecimal));
        } else {
            writeRaw(j(bigDecimal));
        }
    }

    @Override // ub.o
    public void writeNumber(String str) throws IOException {
        o("write a number");
        if (str == null) {
            B();
        } else if (this.f90508i) {
            C(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // ub.o
    public void writeNumber(char[] cArr, int i10, int i11) throws IOException {
        o("write a number");
        if (this.f90508i) {
            int i12 = this.f54076y;
            int i13 = this.f54077z;
            if (i12 >= i13) {
                r();
            }
            byte[] bArr = this.f54075x;
            int i14 = this.f54076y;
            this.f54076y = i14 + 1;
            byte b10 = this.f54074w;
            bArr[i14] = b10;
            writeRaw(cArr, i10, i11);
            if (this.f54076y >= i13) {
                r();
            }
            byte[] bArr2 = this.f54075x;
            int i15 = this.f54076y;
            this.f54076y = i15 + 1;
            bArr2[i15] = b10;
            return;
        }
        writeRaw(cArr, i10, i11);
    }
}
