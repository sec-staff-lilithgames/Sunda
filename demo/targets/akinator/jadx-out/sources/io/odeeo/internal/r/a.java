package io.odeeo.internal.r;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import io.odeeo.internal.q0.f0;
import io.odeeo.internal.r.a;
import io.odeeo.internal.r.h;
import io.odeeo.internal.t0.b0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f65992a;

    /* renamed from: b, reason: collision with root package name */
    public final c f65993b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.r.b f65994c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65995d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65996e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65997f;

    /* renamed from: g, reason: collision with root package name */
    public int f65998g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f65999h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        public final b0<HandlerThread> f66000b;

        /* renamed from: c, reason: collision with root package name */
        public final b0<HandlerThread> f66001c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f66002d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f66003e;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(final int i10, boolean z10, boolean z11) {
            final int i11 = 0;
            final int i12 = 1;
            this(new b0() { // from class: dt.b
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return a.b.a(i10);
                        default:
                            return a.b.b(i10);
                    }
                }
            }, new b0() { // from class: dt.b
                @Override // io.odeeo.internal.t0.b0
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return a.b.a(i10);
                        default:
                            return a.b.b(i10);
                    }
                }
            }, z10, z11);
        }

        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(a.c(i10));
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(a.d(i10));
        }

        public b(b0<HandlerThread> b0Var, b0<HandlerThread> b0Var2, boolean z10, boolean z11) {
            this.f66000b = b0Var;
            this.f66001c = b0Var2;
            this.f66002d = z10;
            this.f66003e = z11;
        }

        @Override // io.odeeo.internal.r.h.b
        public a createAdapter(h.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f66046a.f66056a;
            a aVar2 = null;
            try {
                f0.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    a aVar3 = new a(mediaCodecCreateByCodecName, this.f66000b.get(), this.f66001c.get(), this.f66002d, this.f66003e);
                    try {
                        f0.endSection();
                    } catch (Exception e10) {
                        e = e10;
                    }
                    try {
                        aVar3.a(aVar.f66047b, aVar.f66049d, aVar.f66050e, aVar.f66051f, aVar.f66052g);
                        return aVar3;
                    } catch (Exception e11) {
                        e = e11;
                        aVar3 = aVar3;
                        exc = e;
                        aVar2 = aVar3;
                        if (aVar2 != null) {
                            aVar2.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e12) {
                    exc = e12;
                }
            } catch (Exception e13) {
                exc = e13;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public static String c(int i10) {
        return a(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String d(int i10) {
        return a(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // io.odeeo.internal.r.h
    public int dequeueInputBufferIndex() {
        return this.f65993b.dequeueInputBufferIndex();
    }

    @Override // io.odeeo.internal.r.h
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.f65993b.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // io.odeeo.internal.r.h
    public void flush() {
        this.f65994c.flush();
        this.f65992a.flush();
        if (!this.f65996e) {
            this.f65993b.flush(this.f65992a);
        } else {
            this.f65993b.flush(null);
            this.f65992a.start();
        }
    }

    @Override // io.odeeo.internal.r.h
    public ByteBuffer getInputBuffer(int i10) {
        return this.f65992a.getInputBuffer(i10);
    }

    @Override // io.odeeo.internal.r.h
    public Surface getInputSurface() {
        return this.f65999h;
    }

    @Override // io.odeeo.internal.r.h
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f65992a.getOutputBuffer(i10);
    }

    @Override // io.odeeo.internal.r.h
    public MediaFormat getOutputFormat() {
        return this.f65993b.getOutputFormat();
    }

    @Override // io.odeeo.internal.r.h
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // io.odeeo.internal.r.h
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f65994c.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // io.odeeo.internal.r.h
    public void queueSecureInputBuffer(int i10, int i11, io.odeeo.internal.e.c cVar, long j10, int i12) {
        this.f65994c.queueSecureInputBuffer(i10, i11, cVar, j10, i12);
    }

    @Override // io.odeeo.internal.r.h
    public void release() {
        try {
            if (this.f65998g == 1) {
                this.f65994c.shutdown();
                this.f65993b.shutdown();
            }
            this.f65998g = 2;
            Surface surface = this.f65999h;
            if (surface != null) {
                surface.release();
            }
            if (this.f65997f) {
                return;
            }
            this.f65992a.release();
            this.f65997f = true;
        } catch (Throwable th2) {
            Surface surface2 = this.f65999h;
            if (surface2 != null) {
                surface2.release();
            }
            if (!this.f65997f) {
                this.f65992a.release();
                this.f65997f = true;
            }
            throw th2;
        }
    }

    @Override // io.odeeo.internal.r.h
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f65992a.releaseOutputBuffer(i10, z10);
    }

    @Override // io.odeeo.internal.r.h
    public void setOnFrameRenderedListener(h.c cVar, Handler handler) {
        a();
        this.f65992a.setOnFrameRenderedListener(new dt.a(0, this, cVar), handler);
    }

    @Override // io.odeeo.internal.r.h
    public void setOutputSurface(Surface surface) {
        a();
        this.f65992a.setOutputSurface(surface);
    }

    @Override // io.odeeo.internal.r.h
    public void setParameters(Bundle bundle) {
        a();
        this.f65992a.setParameters(bundle);
    }

    @Override // io.odeeo.internal.r.h
    public void setVideoScalingMode(int i10) {
        a();
        this.f65992a.setVideoScalingMode(i10);
    }

    @Override // io.odeeo.internal.r.h
    public void signalEndOfInputStream() {
        a();
        this.f65992a.signalEndOfInputStream();
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f65992a = mediaCodec;
        this.f65993b = new c(handlerThread);
        this.f65994c = new io.odeeo.internal.r.b(mediaCodec, handlerThread2);
        this.f65995d = z10;
        this.f65996e = z11;
        this.f65998g = 0;
    }

    @Override // io.odeeo.internal.r.h
    public void releaseOutputBuffer(int i10, long j10) {
        this.f65992a.releaseOutputBuffer(i10, j10);
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f65993b.initialize(this.f65992a);
        f0.beginSection("configureCodec");
        this.f65992a.configure(mediaFormat, surface, mediaCrypto, i10);
        f0.endSection();
        if (z10) {
            this.f65999h = this.f65992a.createInputSurface();
        }
        this.f65994c.start();
        f0.beginSection("startCodec");
        this.f65992a.start();
        f0.endSection();
        this.f65998g = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.onFrameRendered(this, j10, j11);
    }

    public final void a() {
        if (this.f65995d) {
            try {
                this.f65994c.waitUntilQueueingComplete();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
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
}
