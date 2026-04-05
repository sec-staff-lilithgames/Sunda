package j9;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final Queue f69182e = s.createQueue(0);

    /* renamed from: b, reason: collision with root package name */
    public InputStream f69183b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f69184c;

    public static e obtain(InputStream inputStream) {
        e eVar;
        Queue queue = f69182e;
        synchronized (queue) {
            eVar = (e) queue.poll();
        }
        if (eVar == null) {
            eVar = new e();
        }
        eVar.f69183b = inputStream;
        return eVar;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f69183b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f69183b.close();
    }

    public IOException getException() {
        return this.f69184c;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f69183b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f69183b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f69183b.read();
        } catch (IOException e10) {
            this.f69184c = e10;
            throw e10;
        }
    }

    public void release() {
        this.f69184c = null;
        this.f69183b = null;
        Queue queue = f69182e;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f69183b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f69183b.skip(j10);
        } catch (IOException e10) {
            this.f69184c = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f69183b.read(bArr);
        } catch (IOException e10) {
            this.f69184c = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f69183b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f69184c = e10;
            throw e10;
        }
    }
}
