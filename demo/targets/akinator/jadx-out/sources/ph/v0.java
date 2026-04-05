package ph;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f81360b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f81361c;

    public v0(Iterator<? extends z> it) throws IOException {
        this.f81360b = (Iterator) p1.checkNotNull(it);
        d();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f81361c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f81361c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f81361c = null;
            }
        }
    }

    public final void d() throws IOException {
        close();
        Iterator it = this.f81360b;
        if (it.hasNext()) {
            this.f81361c = ((z) it.next()).openStream();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f81361c;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read();
            if (i10 != -1) {
                return i10;
            }
            d();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        InputStream inputStream = this.f81361c;
        if (inputStream == null || j10 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j10);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f81361c.skip(j10 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        p1.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f81361c;
            if (inputStream == null) {
                return -1;
            }
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                return i12;
            }
            d();
        }
    }
}
