package io.odeeo.internal.d;

import b0.e2;
import io.odeeo.internal.b.k0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f63359a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63360b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.b.t f63361c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i10, int i11, int i12, int i13, io.odeeo.internal.b.t tVar, boolean z10, Exception exc) {
            StringBuilder sbF = w0.i.f(i10, i11, "AudioTrack init failed ", " Config(", ", ");
            a.b.x(i12, i13, ", ", ")", sbF);
            sbF.append(z10 ? " (recoverable)" : "");
            super(sbF.toString(), exc);
            this.f63359a = i10;
            this.f63360b = z10;
            this.f63361c = tVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f63362a;

        /* renamed from: b, reason: collision with root package name */
        public final long f63363b;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j10, long j11) {
            StringBuilder sbR = e2.r(j11, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            sbR.append(j10);
            super(sbR.toString());
            this.f63362a = j10;
            this.f63363b = j11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f63364a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63365b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.b.t f63366c;

        public e(int i10, io.odeeo.internal.b.t tVar, boolean z10) {
            super(a.b.e(i10, "AudioTrack write failed: "));
            this.f63365b = z10;
            this.f63364a = i10;
            this.f63366c = tVar;
        }
    }

    void configure(io.odeeo.internal.b.t tVar, int i10, int[] iArr) throws a;

    void disableTunneling();

    void enableTunnelingV21();

    void experimentalFlushWithoutAudioTrackRelease();

    void flush();

    long getCurrentPositionUs(boolean z10);

    int getFormatSupport(io.odeeo.internal.b.t tVar);

    k0 getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws e, b;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws e;

    void reset();

    void setAudioAttributes(io.odeeo.internal.d.d dVar);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(k kVar);

    void setListener(c cVar);

    void setPlaybackParameters(k0 k0Var);

    void setSkipSilenceEnabled(boolean z10);

    void setVolume(float f10);

    boolean supportsFormat(io.odeeo.internal.b.t tVar);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.b.t f63358a;

        public a(Throwable th2, io.odeeo.internal.b.t tVar) {
            super(th2);
            this.f63358a = tVar;
        }

        public a(String str, io.odeeo.internal.b.t tVar) {
            super(str);
            this.f63358a = tVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);

        default void onOffloadBufferEmptying() {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onOffloadBufferFull(long j10) {
        }

        default void onPositionAdvancing(long j10) {
        }
    }
}
