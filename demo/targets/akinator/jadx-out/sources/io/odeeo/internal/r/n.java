package io.odeeo.internal.r;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import io.odeeo.internal.q0.f0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.r.h;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f66120a;

    /* renamed from: b, reason: collision with root package name */
    public final Surface f66121b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f66122c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer[] f66123d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public static Surface createCodecInputSurface(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }

        public static void signalEndOfInputStream(MediaCodec mediaCodec) {
            mediaCodec.signalEndOfInputStream();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements h.b {
        public MediaCodec a(h.a aVar) throws IOException {
            io.odeeo.internal.q0.a.checkNotNull(aVar.f66046a);
            String str = aVar.f66046a.f66056a;
            f0.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            f0.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [io.odeeo.internal.r.n$a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Surface] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // io.odeeo.internal.r.h.b
        public h createAdapter(h.a aVar) throws Throwable {
            MediaCodec mediaCodecA;
            Surface surfaceCreateCodecInputSurface;
            ?? r02 = 0;
            r02 = 0;
            r02 = 0;
            try {
                mediaCodecA = a(aVar);
                try {
                    f0.beginSection("configureCodec");
                    mediaCodecA.configure(aVar.f66047b, aVar.f66049d, aVar.f66050e, aVar.f66051f);
                    f0.endSection();
                    if (!aVar.f66052g) {
                        surfaceCreateCodecInputSurface = null;
                    } else {
                        if (g0.f65861a < 18) {
                            throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                        }
                        surfaceCreateCodecInputSurface = b.createCodecInputSurface(mediaCodecA);
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (RuntimeException e11) {
                    e = e11;
                }
                try {
                    f0.beginSection("startCodec");
                    mediaCodecA.start();
                    f0.endSection();
                    return new n(mediaCodecA, surfaceCreateCodecInputSurface);
                } catch (IOException | RuntimeException e12) {
                    r02 = surfaceCreateCodecInputSurface;
                    e = e12;
                    if (r02 != 0) {
                        r02.release();
                    }
                    if (mediaCodecA != null) {
                        mediaCodecA.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e13) {
                e = e13;
                mediaCodecA = null;
            }
        }
    }

    @Override // io.odeeo.internal.r.h
    public int dequeueInputBufferIndex() {
        return this.f66120a.dequeueInputBuffer(0L);
    }

    @Override // io.odeeo.internal.r.h
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f66120a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && g0.f65861a < 21) {
                this.f66123d = this.f66120a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // io.odeeo.internal.r.h
    public void flush() {
        this.f66120a.flush();
    }

    @Override // io.odeeo.internal.r.h
    public ByteBuffer getInputBuffer(int i10) {
        return g0.f65861a >= 21 ? this.f66120a.getInputBuffer(i10) : ((ByteBuffer[]) g0.castNonNull(this.f66122c))[i10];
    }

    @Override // io.odeeo.internal.r.h
    public Surface getInputSurface() {
        return this.f66121b;
    }

    @Override // io.odeeo.internal.r.h
    public ByteBuffer getOutputBuffer(int i10) {
        return g0.f65861a >= 21 ? this.f66120a.getOutputBuffer(i10) : ((ByteBuffer[]) g0.castNonNull(this.f66123d))[i10];
    }

    @Override // io.odeeo.internal.r.h
    public MediaFormat getOutputFormat() {
        return this.f66120a.getOutputFormat();
    }

    @Override // io.odeeo.internal.r.h
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // io.odeeo.internal.r.h
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f66120a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // io.odeeo.internal.r.h
    public void queueSecureInputBuffer(int i10, int i11, io.odeeo.internal.e.c cVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.f66120a.queueSecureInputBuffer(i10, i11, cVar.getFrameworkCryptoInfo(), j10, i12);
    }

    @Override // io.odeeo.internal.r.h
    public void release() {
        this.f66122c = null;
        this.f66123d = null;
        Surface surface = this.f66121b;
        if (surface != null) {
            surface.release();
        }
        this.f66120a.release();
    }

    @Override // io.odeeo.internal.r.h
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f66120a.releaseOutputBuffer(i10, z10);
    }

    @Override // io.odeeo.internal.r.h
    public void setOnFrameRenderedListener(h.c cVar, Handler handler) {
        this.f66120a.setOnFrameRenderedListener(new dt.a(1, this, cVar), handler);
    }

    @Override // io.odeeo.internal.r.h
    public void setOutputSurface(Surface surface) {
        this.f66120a.setOutputSurface(surface);
    }

    @Override // io.odeeo.internal.r.h
    public void setParameters(Bundle bundle) {
        this.f66120a.setParameters(bundle);
    }

    @Override // io.odeeo.internal.r.h
    public void setVideoScalingMode(int i10) {
        this.f66120a.setVideoScalingMode(i10);
    }

    @Override // io.odeeo.internal.r.h
    public void signalEndOfInputStream() {
        b.signalEndOfInputStream(this.f66120a);
    }

    public n(MediaCodec mediaCodec, Surface surface) {
        this.f66120a = mediaCodec;
        this.f66121b = surface;
        if (g0.f65861a < 21) {
            this.f66122c = mediaCodec.getInputBuffers();
            this.f66123d = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.onFrameRendered(this, j10, j11);
    }

    @Override // io.odeeo.internal.r.h
    public void releaseOutputBuffer(int i10, long j10) {
        this.f66120a.releaseOutputBuffer(i10, j10);
    }
}
