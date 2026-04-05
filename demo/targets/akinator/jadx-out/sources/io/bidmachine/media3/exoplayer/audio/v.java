package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface v {
    void configure(io.bidmachine.media3.common.b bVar, int i10, int[] iArr) throws q;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    gn.h getAudioAttributes();

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z10);

    default j getFormatOffloadSupport(io.bidmachine.media3.common.b bVar) {
        return j.f60951d;
    }

    int getFormatSupport(io.bidmachine.media3.common.b bVar);

    gn.c1 getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws u, r;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws u;

    void reset();

    void setAudioAttributes(gn.h hVar);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(gn.i iVar);

    void setListener(s sVar);

    void setPlaybackParameters(gn.c1 c1Var);

    void setSkipSilenceEnabled(boolean z10);

    void setVolume(float f10);

    boolean supportsFormat(io.bidmachine.media3.common.b bVar);

    default void release() {
    }

    default void setClock(io.bidmachine.media3.common.util.g gVar) {
    }

    default void setOffloadMode(int i10) {
    }

    default void setOutputStreamOffsetUs(long j10) {
    }

    default void setPlayerId(on.f0 f0Var) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    default void setOffloadDelayPadding(int i10, int i11) {
    }
}
