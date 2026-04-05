package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f6005b;

    public t(u uVar) {
        this.f6005b = uVar.f6015g.slice();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f6005b.remaining();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f6005b.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ByteBuffer byteBuffer = this.f6005b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f6005b.reset();
        } catch (InvalidMarkException e10) {
            throw new IOException(e10);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        ByteBuffer byteBuffer = this.f6005b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}
