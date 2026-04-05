package x8;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o0 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f91853b;

    /* renamed from: c, reason: collision with root package name */
    public int f91854c;

    /* renamed from: e, reason: collision with root package name */
    public int f91855e;

    /* renamed from: f, reason: collision with root package name */
    public int f91856f;

    /* renamed from: g, reason: collision with root package name */
    public int f91857g;

    /* renamed from: h, reason: collision with root package name */
    public final q8.b f91858h;

    public o0(InputStream inputStream, q8.b bVar) {
        super(inputStream);
        this.f91856f = -1;
        this.f91858h = bVar;
        this.f91853b = (byte[]) bVar.get(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
    }

    public static void d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f91856f;
        if (i10 != -1) {
            int i11 = this.f91857g - i10;
            int i12 = this.f91855e;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f91854c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f91858h.get(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f91853b = bArr2;
                    this.f91858h.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f91857g - this.f91856f;
                this.f91857g = i13;
                this.f91856f = 0;
                this.f91854c = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f91857g;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f91854c = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f91856f = -1;
            this.f91857g = 0;
            this.f91854c = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f91853b == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.f91854c - this.f91857g) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f91853b != null) {
            this.f91858h.put(this.f91853b);
            this.f91853b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void fixMarkLimit() {
        this.f91855e = this.f91853b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f91855e = Math.max(this.f91855e, i10);
        this.f91856f = this.f91857g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f91853b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        }
        if (this.f91857g >= this.f91854c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f91853b && (bArr = this.f91853b) == null) {
            d();
            throw null;
        }
        int i10 = this.f91854c;
        int i11 = this.f91857g;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f91857g = i11 + 1;
        return bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public synchronized void release() {
        if (this.f91853b != null) {
            this.f91858h.put(this.f91853b);
            this.f91853b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f91853b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f91856f;
        if (-1 == i10) {
            throw new androidx.datastore.preferences.protobuf.h0("Mark has been invalidated, pos: " + this.f91857g + " markLimit: " + this.f91855e);
        }
        this.f91857g = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f91853b;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i10 = this.f91854c;
        int i11 = this.f91857g;
        if (i10 - i11 >= j10) {
            this.f91857g = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f91857g = i10;
        if (this.f91856f == -1 || j10 > this.f91855e) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f91856f = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f91854c;
        int i13 = this.f91857g;
        if (i12 - i13 >= j10 - j11) {
            this.f91857g = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f91857g = i12;
        return j12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f91853b;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f91857g;
            int i15 = this.f91854c;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f91857g += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f91856f == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f91853b && (bArr2 = this.f91853b) == null) {
                        d();
                        throw null;
                    }
                    int i17 = this.f91854c;
                    int i18 = this.f91857g;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f91857g += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            d();
            throw null;
        }
    }
}
