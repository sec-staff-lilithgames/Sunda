package qe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import com.google.android.exoplayer2.util.n1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f82806a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f82807b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f82808c;

    public e0(MediaCodec mediaCodec) {
        this.f82806a = mediaCodec;
        if (n1.f28506a < 21) {
            this.f82807b = mediaCodec.getInputBuffers();
            this.f82808c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // qe.o
    public int dequeueInputBufferIndex() {
        return this.f82806a.dequeueInputBuffer(0L);
    }

    @Override // qe.o
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f82806a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && n1.f28506a < 21) {
                this.f82808c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // qe.o
    public void flush() {
        this.f82806a.flush();
    }

    @Override // qe.o
    public ByteBuffer getInputBuffer(int i10) {
        return n1.f28506a >= 21 ? this.f82806a.getInputBuffer(i10) : ((ByteBuffer[]) n1.castNonNull(this.f82807b))[i10];
    }

    @Override // qe.o
    public PersistableBundle getMetrics() {
        return this.f82806a.getMetrics();
    }

    @Override // qe.o
    public ByteBuffer getOutputBuffer(int i10) {
        return n1.f28506a >= 21 ? this.f82806a.getOutputBuffer(i10) : ((ByteBuffer[]) n1.castNonNull(this.f82808c))[i10];
    }

    @Override // qe.o
    public MediaFormat getOutputFormat() {
        return this.f82806a.getOutputFormat();
    }

    @Override // qe.o
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // qe.o
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f82806a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // qe.o
    public void queueSecureInputBuffer(int i10, int i11, ce.d dVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.f82806a.queueSecureInputBuffer(i10, i11, dVar.getFrameworkCryptoInfo(), j10, i12);
    }

    @Override // qe.o
    public void release() {
        this.f82807b = null;
        this.f82808c = null;
        this.f82806a.release();
    }

    @Override // qe.o
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f82806a.releaseOutputBuffer(i10, z10);
    }

    @Override // qe.o
    public void setOnFrameRenderedListener(n nVar, Handler handler) {
        this.f82806a.setOnFrameRenderedListener(new dt.a(3, this, nVar), handler);
    }

    @Override // qe.o
    public void setOutputSurface(Surface surface) {
        this.f82806a.setOutputSurface(surface);
    }

    @Override // qe.o
    public void setParameters(Bundle bundle) {
        this.f82806a.setParameters(bundle);
    }

    @Override // qe.o
    public void setVideoScalingMode(int i10) {
        this.f82806a.setVideoScalingMode(i10);
    }

    @Override // qe.o
    public void releaseOutputBuffer(int i10, long j10) {
        this.f82806a.releaseOutputBuffer(i10, j10);
    }
}
