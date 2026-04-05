package dd;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f52010b;

    public g(ByteBuffer byteBuffer) {
        this.f52010b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f52010b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        ByteBuffer byteBuffer = this.f52010b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        ByteBuffer byteBuffer = this.f52010b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}
