package io.odeeo.internal.r;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import io.odeeo.internal.b.t;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f66046a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f66047b;

        /* renamed from: c, reason: collision with root package name */
        public final t f66048c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f66049d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f66050e;

        /* renamed from: f, reason: collision with root package name */
        public final int f66051f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f66052g;

        public a(j jVar, MediaFormat mediaFormat, t tVar, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
            this.f66046a = jVar;
            this.f66047b = mediaFormat;
            this.f66048c = tVar;
            this.f66049d = surface;
            this.f66050e = mediaCrypto;
            this.f66051f = i10;
            this.f66052g = z10;
        }

        public static a createForAudioDecoding(j jVar, MediaFormat mediaFormat, t tVar, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, tVar, null, mediaCrypto, 0, false);
        }

        public static a createForAudioEncoding(j jVar, MediaFormat mediaFormat, t tVar) {
            return new a(jVar, mediaFormat, tVar, null, null, 1, false);
        }

        public static a createForVideoDecoding(j jVar, MediaFormat mediaFormat, t tVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, tVar, surface, mediaCrypto, 0, false);
        }

        public static a createForVideoEncoding(j jVar, MediaFormat mediaFormat, t tVar) {
            return new a(jVar, mediaFormat, tVar, null, null, 1, true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66053a = new f();

        h createAdapter(a aVar) throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void onFrameRendered(h hVar, long j10, long j11);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void flush();

    ByteBuffer getInputBuffer(int i10);

    Surface getInputSurface();

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void queueSecureInputBuffer(int i10, int i11, io.odeeo.internal.e.c cVar, long j10, int i12);

    void release();

    void releaseOutputBuffer(int i10, long j10);

    void releaseOutputBuffer(int i10, boolean z10);

    void setOnFrameRenderedListener(c cVar, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i10);

    void signalEndOfInputStream();
}
