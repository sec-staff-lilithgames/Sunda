package ph;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f81289b;

    /* renamed from: c, reason: collision with root package name */
    public long f81290c;

    public d0(InputStream inputStream, long j10) {
        super(inputStream);
        this.f81290c = -1L;
        p1.checkNotNull(inputStream);
        p1.checkArgument(j10 >= 0, "limit must be non-negative");
        this.f81289b = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f81289b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f81290c = this.f81289b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f81289b == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f81289b--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f81290c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f81289b = this.f81290c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f81289b));
        this.f81289b -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f81289b;
        if (j10 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (i12 != -1) {
            this.f81289b -= i12;
        }
        return i12;
    }
}
