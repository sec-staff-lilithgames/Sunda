package ph;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 extends Reader {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f81298b;

    /* renamed from: c, reason: collision with root package name */
    public int f81299c;

    /* renamed from: e, reason: collision with root package name */
    public int f81300e;

    public f0(CharSequence charSequence) {
        this.f81298b = (CharSequence) p1.checkNotNull(charSequence);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f81298b = null;
    }

    public final void d() throws IOException {
        if (this.f81298b == null) {
            throw new IOException("reader closed");
        }
    }

    public final int h() {
        Objects.requireNonNull(this.f81298b);
        return this.f81298b.length() - this.f81299c;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i10) throws IOException {
        p1.checkArgument(i10 >= 0, "readAheadLimit (%s) may not be negative", i10);
        d();
        this.f81300e = this.f81299c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        p1.checkNotNull(charBuffer);
        d();
        Objects.requireNonNull(this.f81298b);
        if (!(h() > 0)) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), h());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f81298b;
            int i11 = this.f81299c;
            this.f81299c = i11 + 1;
            charBuffer.put(charSequence.charAt(i11));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        d();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        d();
        this.f81299c = this.f81300e;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j10) throws IOException {
        int iMin;
        p1.checkArgument(j10 >= 0, "n (%s) may not be negative", j10);
        d();
        iMin = (int) Math.min(h(), j10);
        this.f81299c += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char cCharAt;
        d();
        Objects.requireNonNull(this.f81298b);
        if (h() > 0) {
            CharSequence charSequence = this.f81298b;
            int i10 = this.f81299c;
            this.f81299c = i10 + 1;
            cCharAt = charSequence.charAt(i10);
        } else {
            cCharAt = 65535;
        }
        return cCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i10, int i11) throws IOException {
        p1.checkPositionIndexes(i10, i10 + i11, cArr.length);
        d();
        Objects.requireNonNull(this.f81298b);
        if (!(h() > 0)) {
            return -1;
        }
        int iMin = Math.min(i11, h());
        for (int i12 = 0; i12 < iMin; i12++) {
            CharSequence charSequence = this.f81298b;
            int i13 = this.f81299c;
            this.f81299c = i13 + 1;
            cArr[i10 + i12] = charSequence.charAt(i13);
        }
        return iMin;
    }
}
