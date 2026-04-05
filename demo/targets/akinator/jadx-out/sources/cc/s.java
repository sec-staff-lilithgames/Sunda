package cc;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final h f12123b;

    /* renamed from: c, reason: collision with root package name */
    public OutputStream f12124c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f12125e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12126f;

    /* renamed from: g, reason: collision with root package name */
    public int f12127g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f12128h;

    public s(h hVar, OutputStream outputStream) {
        this.f12123b = hVar;
        this.f12124c = outputStream;
        this.f12125e = hVar.allocWriteEncodingBuffer();
        this.f12126f = r1.length - 4;
    }

    public static void b(int i10) throws IOException {
        throw new IOException(c(i10));
    }

    public static String c(int i10) {
        if (i10 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i10 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output";
        }
        if (i10 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
    }

    public final int a(int i10) throws IOException {
        int i11 = this.f12128h;
        this.f12128h = 0;
        if (i10 >= 56320 && i10 <= 57343) {
            return ((i11 << 10) + i10) - 56613888;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i11) + ", second 0x" + Integer.toHexString(i10) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f12124c;
        h hVar = this.f12123b;
        if (outputStream != null) {
            int i10 = this.f12127g;
            if (i10 > 0) {
                outputStream.write(this.f12125e, 0, i10);
                this.f12127g = 0;
            }
            OutputStream outputStream2 = this.f12124c;
            this.f12124c = null;
            byte[] bArr = this.f12125e;
            if (bArr != null) {
                this.f12125e = null;
                hVar.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i11 = this.f12128h;
            this.f12128h = 0;
            if (i11 > 0) {
                b(i11);
                throw null;
            }
        }
        hVar.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f12124c;
        if (outputStream != null) {
            int i10 = this.f12127g;
            if (i10 > 0) {
                outputStream.write(this.f12125e, 0, i10);
                this.f12127g = 0;
            }
            this.f12124c.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0023, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.s.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        int i11;
        if (this.f12128h > 0) {
            i10 = a(i10);
        } else if (i10 >= 55296 && i10 <= 57343) {
            if (i10 <= 56319) {
                this.f12128h = i10;
                return;
            } else {
                b(i10);
                throw null;
            }
        }
        int i12 = this.f12127g;
        if (i12 >= this.f12126f) {
            this.f12124c.write(this.f12125e, 0, i12);
            this.f12127g = 0;
        }
        if (i10 < 128) {
            byte[] bArr = this.f12125e;
            int i13 = this.f12127g;
            this.f12127g = i13 + 1;
            bArr[i13] = (byte) i10;
            return;
        }
        int i14 = this.f12127g;
        if (i10 < 2048) {
            byte[] bArr2 = this.f12125e;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            i11 = i14 + 2;
            bArr2[i15] = (byte) ((i10 & 63) | 128);
        } else if (i10 <= 65535) {
            byte[] bArr3 = this.f12125e;
            bArr3[i14] = (byte) ((i10 >> 12) | 224);
            int i16 = i14 + 2;
            bArr3[i14 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 3;
            bArr3[i16] = (byte) ((i10 & 63) | 128);
        } else if (i10 <= 1114111) {
            byte[] bArr4 = this.f12125e;
            bArr4[i14] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr4[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            int i17 = i14 + 3;
            bArr4[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 4;
            bArr4[i17] = (byte) ((i10 & 63) | 128);
        } else {
            b(i10);
            throw null;
        }
        this.f12127g = i11;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0027, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(java.lang.String r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.s.write(java.lang.String, int, int):void");
    }
}
