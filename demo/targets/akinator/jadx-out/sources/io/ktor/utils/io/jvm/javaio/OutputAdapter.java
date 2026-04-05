package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteWriteChannel;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class OutputAdapter extends OutputStream {
    private final ByteWriteChannel channel;
    private final OutputAdapter$loop$1 loop;
    private byte[] single;

    public OutputAdapter(Job job, ByteWriteChannel channel) {
        e0.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.loop = new OutputAdapter$loop$1(job, this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.loop.submitAndAwait(BlockingKt.CloseToken);
            this.loop.shutdown();
        } finally {
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        this.loop.submitAndAwait(BlockingKt.FlushToken);
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            byte[] bArr = this.single;
            if (bArr == null) {
                bArr = new byte[1];
                this.single = bArr;
            }
            bArr[0] = (byte) i10;
            this.loop.submitAndAwait(bArr, 0, 1);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        OutputAdapter$loop$1 outputAdapter$loop$1 = this.loop;
        e0.checkNotNull(bArr);
        outputAdapter$loop$1.submitAndAwait(bArr, i10, i11);
    }
}
