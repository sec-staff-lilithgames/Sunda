package c7;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f11843b;

    /* renamed from: c, reason: collision with root package name */
    public int f11844c = 1073741824;

    public m(InputStream inputStream) {
        this.f11843b = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f11844c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11843b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f11843b.read();
        if (i10 == -1) {
            this.f11844c = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f11843b.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i10 = this.f11843b.read(bArr);
        if (i10 == -1) {
            this.f11844c = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f11843b.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f11844c = 0;
        }
        return i12;
    }
}
