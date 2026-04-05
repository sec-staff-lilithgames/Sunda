package xn;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import io.bidmachine.media3.common.util.a1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f92098a;

    /* renamed from: b, reason: collision with root package name */
    public final k f92099b;

    public j0(MediaCodec mediaCodec, k kVar) {
        this.f92098a = mediaCodec;
        this.f92099b = kVar;
        if (a1.f60679a < 35 || kVar == null) {
            return;
        }
        kVar.addMediaCodec(mediaCodec);
    }

    @Override // xn.p
    public int dequeueInputBufferIndex() {
        return this.f92098a.dequeueInputBuffer(0L);
    }

    @Override // xn.p
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f92098a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // xn.p
    public void detachOutputSurface() {
        this.f92098a.detachOutputSurface();
    }

    @Override // xn.p
    public void flush() {
        this.f92098a.flush();
    }

    @Override // xn.p
    public ByteBuffer getInputBuffer(int i10) {
        return this.f92098a.getInputBuffer(i10);
    }

    @Override // xn.p
    public PersistableBundle getMetrics() {
        return this.f92098a.getMetrics();
    }

    @Override // xn.p
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f92098a.getOutputBuffer(i10);
    }

    @Override // xn.p
    public MediaFormat getOutputFormat() {
        return this.f92098a.getOutputFormat();
    }

    @Override // xn.p
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // xn.p
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f92098a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // xn.p
    public void queueSecureInputBuffer(int i10, int i11, nn.d dVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.f92098a.queueSecureInputBuffer(i10, i11, dVar.getFrameworkCryptoInfo(), j10, i12);
    }

    @Override // xn.p
    public /* bridge */ /* synthetic */ boolean registerOnBufferAvailableListener(n nVar) {
        return super.registerOnBufferAvailableListener(nVar);
    }

    @Override // xn.p
    public void release() {
        k kVar = this.f92099b;
        MediaCodec mediaCodec = this.f92098a;
        try {
            int i10 = a1.f60679a;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
            if (i10 >= 35 && kVar != null) {
                kVar.removeMediaCodec(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (a1.f60679a >= 35 && kVar != null) {
                kVar.removeMediaCodec(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override // xn.p
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f92098a.releaseOutputBuffer(i10, z10);
    }

    @Override // xn.p
    public void setOnFrameRenderedListener(o oVar, Handler handler) {
        this.f92098a.setOnFrameRenderedListener(new dt.a(5, this, oVar), handler);
    }

    @Override // xn.p
    public void setOutputSurface(Surface surface) {
        this.f92098a.setOutputSurface(surface);
    }

    @Override // xn.p
    public void setParameters(Bundle bundle) {
        this.f92098a.setParameters(bundle);
    }

    @Override // xn.p
    public void setVideoScalingMode(int i10) {
        this.f92098a.setVideoScalingMode(i10);
    }

    @Override // xn.p
    public void releaseOutputBuffer(int i10, long j10) {
        this.f92098a.releaseOutputBuffer(i10, j10);
    }
}
