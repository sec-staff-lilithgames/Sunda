package xn;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.w0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f92046a;

    /* renamed from: b, reason: collision with root package name */
    public final f f92047b;

    /* renamed from: c, reason: collision with root package name */
    public final q f92048c;

    /* renamed from: d, reason: collision with root package name */
    public final k f92049d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92050e;

    /* renamed from: f, reason: collision with root package name */
    public int f92051f = 0;

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, q qVar, k kVar) {
        this.f92046a = mediaCodec;
        this.f92047b = new f(handlerThread);
        this.f92048c = qVar;
        this.f92049d = kVar;
    }

    public static void a(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        k kVar;
        f fVar = bVar.f92047b;
        MediaCodec mediaCodec = bVar.f92046a;
        fVar.initialize(mediaCodec);
        w0.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        w0.endSection();
        bVar.f92048c.start();
        w0.beginSection("startCodec");
        mediaCodec.start();
        w0.endSection();
        if (a1.f60679a >= 35 && (kVar = bVar.f92049d) != null) {
            kVar.addMediaCodec(mediaCodec);
        }
        bVar.f92051f = 1;
    }

    public static String b(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // xn.p
    public int dequeueInputBufferIndex() {
        this.f92048c.maybeThrowException();
        return this.f92047b.dequeueInputBufferIndex();
    }

    @Override // xn.p
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f92048c.maybeThrowException();
        return this.f92047b.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // xn.p
    public void detachOutputSurface() {
        this.f92046a.detachOutputSurface();
    }

    @Override // xn.p
    public void flush() {
        this.f92048c.flush();
        MediaCodec mediaCodec = this.f92046a;
        mediaCodec.flush();
        this.f92047b.flush();
        mediaCodec.start();
    }

    @Override // xn.p
    public ByteBuffer getInputBuffer(int i10) {
        return this.f92046a.getInputBuffer(i10);
    }

    @Override // xn.p
    public PersistableBundle getMetrics() {
        return this.f92046a.getMetrics();
    }

    @Override // xn.p
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f92046a.getOutputBuffer(i10);
    }

    @Override // xn.p
    public MediaFormat getOutputFormat() {
        return this.f92047b.getOutputFormat();
    }

    @Override // xn.p
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // xn.p
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f92048c.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // xn.p
    public void queueSecureInputBuffer(int i10, int i11, nn.d dVar, long j10, int i12) {
        this.f92048c.queueSecureInputBuffer(i10, i11, dVar, j10, i12);
    }

    @Override // xn.p
    public boolean registerOnBufferAvailableListener(n nVar) {
        this.f92047b.setOnBufferAvailableListener(nVar);
        return true;
    }

    @Override // xn.p
    public void release() {
        k kVar = this.f92049d;
        MediaCodec mediaCodec = this.f92046a;
        try {
            if (this.f92051f == 1) {
                this.f92048c.shutdown();
                this.f92047b.shutdown();
            }
            this.f92051f = 2;
            if (this.f92050e) {
                return;
            }
            try {
                int i10 = a1.f60679a;
                if (i10 >= 30 && i10 < 33) {
                    mediaCodec.stop();
                }
                if (i10 >= 35 && kVar != null) {
                    kVar.removeMediaCodec(mediaCodec);
                }
                mediaCodec.release();
                this.f92050e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f92050e) {
                try {
                    int i11 = a1.f60679a;
                    if (i11 >= 30 && i11 < 33) {
                        mediaCodec.stop();
                    }
                    if (i11 >= 35 && kVar != null) {
                        kVar.removeMediaCodec(mediaCodec);
                    }
                    mediaCodec.release();
                    this.f92050e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // xn.p
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f92046a.releaseOutputBuffer(i10, z10);
    }

    @Override // xn.p
    public void setOnFrameRenderedListener(o oVar, Handler handler) {
        this.f92046a.setOnFrameRenderedListener(new dt.a(4, this, oVar), handler);
    }

    @Override // xn.p
    public void setOutputSurface(Surface surface) {
        this.f92046a.setOutputSurface(surface);
    }

    @Override // xn.p
    public void setParameters(Bundle bundle) {
        this.f92048c.setParameters(bundle);
    }

    @Override // xn.p
    public void setVideoScalingMode(int i10) {
        this.f92046a.setVideoScalingMode(i10);
    }

    @Override // xn.p
    public void releaseOutputBuffer(int i10, long j10) {
        this.f92046a.releaseOutputBuffer(i10, j10);
    }
}
