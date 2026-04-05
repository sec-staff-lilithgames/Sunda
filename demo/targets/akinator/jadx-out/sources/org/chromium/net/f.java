package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends UploadDataProvider {

    /* renamed from: b, reason: collision with root package name */
    public volatile FileChannel f79824b;

    /* renamed from: c, reason: collision with root package name */
    public final e f79825c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f79826e = new Object();

    public f(e eVar) {
        this.f79825c = eVar;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        FileChannel fileChannel = this.f79824b;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public final FileChannel d() {
        if (this.f79824b == null) {
            synchronized (this.f79826e) {
                try {
                    if (this.f79824b == null) {
                        this.f79824b = this.f79825c.getChannel();
                    }
                } finally {
                }
            }
        }
        return this.f79824b;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() throws IOException {
        return d().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelD = d();
        int i10 = 0;
        while (i10 == 0) {
            int i11 = fileChannelD.read(byteBuffer);
            if (i11 == -1) {
                break;
            } else {
                i10 += i11;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        d().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
