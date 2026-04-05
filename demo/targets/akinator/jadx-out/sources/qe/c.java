package qe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f82790a;

    /* renamed from: b, reason: collision with root package name */
    public final g f82791b;

    /* renamed from: c, reason: collision with root package name */
    public final f f82792c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82793d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82794e;

    /* renamed from: f, reason: collision with root package name */
    public int f82795f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f82790a = mediaCodec;
        this.f82791b = new g(handlerThread);
        this.f82792c = new f(mediaCodec, handlerThread2);
        this.f82793d = z10;
    }

    public static String a(int i10, String str) {
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

    public final void b() {
        if (this.f82793d) {
            try {
                this.f82792c.waitUntilQueueingComplete();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // qe.o
    public int dequeueInputBufferIndex() {
        this.f82792c.maybeThrowException();
        return this.f82791b.dequeueInputBufferIndex();
    }

    @Override // qe.o
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f82792c.maybeThrowException();
        return this.f82791b.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // qe.o
    public void flush() {
        this.f82792c.flush();
        MediaCodec mediaCodec = this.f82790a;
        mediaCodec.flush();
        this.f82791b.flush();
        mediaCodec.start();
    }

    @Override // qe.o
    public ByteBuffer getInputBuffer(int i10) {
        return this.f82790a.getInputBuffer(i10);
    }

    @Override // qe.o
    public PersistableBundle getMetrics() {
        b();
        return this.f82790a.getMetrics();
    }

    @Override // qe.o
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f82790a.getOutputBuffer(i10);
    }

    @Override // qe.o
    public MediaFormat getOutputFormat() {
        return this.f82791b.getOutputFormat();
    }

    @Override // qe.o
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // qe.o
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f82792c.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // qe.o
    public void queueSecureInputBuffer(int i10, int i11, ce.d dVar, long j10, int i12) {
        this.f82792c.queueSecureInputBuffer(i10, i11, dVar, j10, i12);
    }

    @Override // qe.o
    public void release() {
        MediaCodec mediaCodec = this.f82790a;
        try {
            if (this.f82795f == 1) {
                this.f82792c.shutdown();
                this.f82791b.shutdown();
            }
            this.f82795f = 2;
            if (this.f82794e) {
                return;
            }
            mediaCodec.release();
            this.f82794e = true;
        } catch (Throwable th2) {
            if (!this.f82794e) {
                mediaCodec.release();
                this.f82794e = true;
            }
            throw th2;
        }
    }

    @Override // qe.o
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f82790a.releaseOutputBuffer(i10, z10);
    }

    @Override // qe.o
    public void setOnFrameRenderedListener(n nVar, Handler handler) {
        b();
        this.f82790a.setOnFrameRenderedListener(new dt.a(2, this, nVar), handler);
    }

    @Override // qe.o
    public void setOutputSurface(Surface surface) {
        b();
        this.f82790a.setOutputSurface(surface);
    }

    @Override // qe.o
    public void setParameters(Bundle bundle) {
        b();
        this.f82790a.setParameters(bundle);
    }

    @Override // qe.o
    public void setVideoScalingMode(int i10) {
        b();
        this.f82790a.setVideoScalingMode(i10);
    }

    @Override // qe.o
    public void releaseOutputBuffer(int i10, long j10) {
        this.f82790a.releaseOutputBuffer(i10, j10);
    }
}
