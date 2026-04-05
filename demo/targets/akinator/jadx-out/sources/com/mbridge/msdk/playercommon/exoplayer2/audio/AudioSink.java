package com.mbridge.msdk.playercommon.exoplayer2.audio;

import a.b;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th2) {
            super(th2);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i10, int i11, int i12, int i13) {
            StringBuilder sbF = i.f(i10, i11, "AudioTrack init failed: ", ", Config(", ", ");
            sbF.append(i12);
            sbF.append(", ");
            sbF.append(i13);
            sbF.append(")");
            super(sbF.toString());
            this.audioTrackState = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void onAudioSessionId(int i10);

        void onPositionDiscontinuity();

        void onUnderrun(int i10, long j10, long j11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i10) {
            super(b.e(i10, "AudioTrack write failed: "));
            this.errorCode = i10;
        }
    }

    void configure(int i10, int i11, int i12, int i13, int[] iArr, int i14, int i15) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i10);

    long getCurrentPositionUs(boolean z10);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i10);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i10);

    void setListener(Listener listener);

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);

    void setVolume(float f10);
}
