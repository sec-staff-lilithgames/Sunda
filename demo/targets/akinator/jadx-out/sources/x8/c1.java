package x8;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c1 extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f91811b;

    public c1(ByteBuffer byteBuffer) {
        this.f91811b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.f91811b.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f91811b;
        if (j10 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j10);
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
