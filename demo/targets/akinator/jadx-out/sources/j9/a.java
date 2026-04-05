package j9;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f69176b;

    /* renamed from: c, reason: collision with root package name */
    public int f69177c = -1;

    public a(ByteBuffer byteBuffer) {
        this.f69176b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f69176b.remaining();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.f69177c = this.f69176b.position();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        ByteBuffer byteBuffer = this.f69176b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        int i10 = this.f69177c;
        if (i10 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f69176b.position(i10);
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f69176b;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j10, available());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f69176b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, available());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}
