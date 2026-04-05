package io.ktor.utils.io.jvm.javaio;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class InputAdapter extends InputStream {
    private final ByteReadChannel channel;
    private final CompletableJob context;
    private final InputAdapter$loop$1 loop;
    private byte[] single;

    public InputAdapter(Job job, ByteReadChannel channel) {
        e0.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.context = JobKt.Job(job);
        this.loop = new InputAdapter$loop$1(job, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.channel.getAvailableForRead();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            super.close();
            ByteReadChannelKt.cancel(this.channel);
            if (!this.context.isCompleted()) {
                Job.DefaultImpls.cancel$default((Job) this.context, (CancellationException) null, 1, (Object) null);
            }
            this.loop.shutdown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = this.single;
            if (bArr == null) {
                bArr = new byte[1];
                this.single = bArr;
            }
            int iSubmitAndAwait = this.loop.submitAndAwait(bArr, 0, 1);
            if (iSubmitAndAwait == -1) {
                return -1;
            }
            if (iSubmitAndAwait == 1) {
                return bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iSubmitAndAwait + " bytes.").toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        InputAdapter$loop$1 inputAdapter$loop$1;
        inputAdapter$loop$1 = this.loop;
        e0.checkNotNull(bArr);
        return inputAdapter$loop$1.submitAndAwait(bArr, i10, i11);
    }
}
