package cc;

import b0.e2;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r extends Reader {

    /* renamed from: b, reason: collision with root package name */
    public final h f12112b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f12113c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f12114e;

    /* renamed from: f, reason: collision with root package name */
    public int f12115f;

    /* renamed from: g, reason: collision with root package name */
    public int f12116g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12117h;

    /* renamed from: i, reason: collision with root package name */
    public char f12118i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f12119j;

    /* renamed from: k, reason: collision with root package name */
    public int f12120k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12121l;

    /* renamed from: m, reason: collision with root package name */
    public char[] f12122m;

    public r(h hVar, InputStream inputStream, byte[] bArr, int i10, int i11, boolean z10) {
        this.f12112b = hVar;
        this.f12113c = inputStream;
        this.f12114e = bArr;
        this.f12115f = i10;
        this.f12116g = i11;
        this.f12117h = z10;
        this.f12121l = inputStream != null;
    }

    public final void a(int i10) throws CharConversionException {
        throw new CharConversionException(a.b.f(this.f12120k + i10, ")", w0.i.f(i10, this.f12119j, "Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", ", needed 4, at char #", ", byte #")));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f12113c;
        if (inputStream != null) {
            this.f12113c = null;
            byte[] bArr = this.f12114e;
            if (bArr != null) {
                this.f12114e = null;
                h hVar = this.f12112b;
                if (hVar != null) {
                    hVar.releaseReadIOBuffer(bArr);
                }
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.f12122m == null) {
            this.f12122m = new char[1];
        }
        if (read(this.f12122m, 0, 1) < 1) {
            return -1;
        }
        return this.f12122m[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr;
        byte[] bArr2;
        int i14;
        int i15;
        byte[] bArr3 = this.f12114e;
        if (bArr3 == null) {
            return -1;
        }
        if (i11 < 1) {
            return i11;
        }
        if (i10 >= 0 && (i12 = i10 + i11) <= cArr.length) {
            char c10 = this.f12118i;
            if (c10 != 0) {
                i13 = i10 + 1;
                cArr[i10] = c10;
                this.f12118i = (char) 0;
            } else {
                int i16 = this.f12116g;
                int i17 = this.f12115f;
                int i18 = i16 - i17;
                if (i18 < 4) {
                    InputStream inputStream = this.f12113c;
                    if (inputStream != null) {
                        this.f12120k = (i16 - i18) + this.f12120k;
                        h hVar = this.f12112b;
                        boolean z10 = this.f12121l;
                        if (i18 > 0) {
                            if (i17 > 0) {
                                System.arraycopy(bArr3, i17, bArr3, 0, i18);
                                this.f12115f = 0;
                            }
                            this.f12116g = i18;
                        } else {
                            this.f12115f = 0;
                            int i19 = inputStream.read(bArr3);
                            if (i19 < 1) {
                                this.f12116g = 0;
                                if (i19 >= 0) {
                                    throw new IOException("Strange I/O stream, returned 0 bytes on read");
                                }
                                if (z10 && (bArr = this.f12114e) != null) {
                                    this.f12114e = null;
                                    if (hVar != null) {
                                        hVar.releaseReadIOBuffer(bArr);
                                    }
                                }
                            } else {
                                this.f12116g = i19;
                            }
                        }
                        while (true) {
                            int i20 = this.f12116g;
                            if (i20 >= 4) {
                                break;
                            }
                            InputStream inputStream2 = this.f12113c;
                            byte[] bArr4 = this.f12114e;
                            int i21 = inputStream2.read(bArr4, i20, bArr4.length - i20);
                            if (i21 < 1) {
                                if (i21 < 0) {
                                    if (z10 && (bArr2 = this.f12114e) != null) {
                                        this.f12114e = null;
                                        if (hVar != null) {
                                            hVar.releaseReadIOBuffer(bArr2);
                                        }
                                    }
                                    a(this.f12116g);
                                    throw null;
                                }
                                throw new IOException("Strange I/O stream, returned 0 bytes on read");
                            }
                            this.f12116g += i21;
                        }
                    }
                    if (i18 == 0) {
                        return -1;
                    }
                    a(this.f12116g - this.f12115f);
                    throw null;
                }
                i13 = i10;
            }
            int i22 = this.f12116g - 4;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                int i23 = this.f12115f;
                if (i23 > i22) {
                    break;
                }
                if (this.f12117h) {
                    byte[] bArr5 = this.f12114e;
                    i14 = (bArr5[i23] << 8) | (bArr5[i23 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    i15 = (bArr5[i23 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr5[i23 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                } else {
                    byte[] bArr6 = this.f12114e;
                    int i24 = (bArr6[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr6[i23 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                    i14 = (bArr6[i23 + 3] << 8) | (bArr6[i23 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    i15 = i24;
                }
                this.f12115f = i23 + 4;
                if (i14 != 0) {
                    int i25 = 65535 & i14;
                    int i26 = i15 | ((i25 - 1) << 16);
                    if (i25 <= 16) {
                        int i27 = i13 + 1;
                        cArr[i13] = (char) ((i26 >> 10) + 55296);
                        int i28 = (i26 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | Utf8.LOG_SURROGATE_HEADER;
                        if (i27 >= i12) {
                            this.f12118i = (char) i26;
                            i13 = i27;
                            break;
                        }
                        i15 = i28;
                        i13 = i27;
                    } else {
                        int i29 = i13 - i10;
                        String str = String.format(" (above 0x%08x)", 1114111);
                        int i30 = (this.f12120k + this.f12115f) - 1;
                        int i31 = this.f12119j + i29;
                        StringBuilder sb2 = new StringBuilder("Invalid UTF-32 character 0x");
                        sb2.append(Integer.toHexString(i26));
                        sb2.append(str);
                        sb2.append(" at char #");
                        sb2.append(i31);
                        throw new CharConversionException(e2.n(sb2, ", byte #", i30, ")"));
                    }
                }
                cArr[i13] = (char) i15;
                i13++;
            }
            int i32 = i13 - i10;
            this.f12119j += i32;
            return i32;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(cArr.length)));
    }
}
