package org.chromium.net;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends UploadDataProvider {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f79823b;

    public d(ByteBuffer byteBuffer) {
        this.f79823b = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.f79823b.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f79823b;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int iLimit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(iLimit);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) {
        this.f79823b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
