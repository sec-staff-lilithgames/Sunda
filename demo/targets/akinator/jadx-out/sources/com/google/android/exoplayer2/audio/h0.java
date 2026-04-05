package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import com.google.android.exoplayer2.l2;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface h0 {
    void configure(com.google.android.exoplayer2.z0 z0Var, int i10, int[] iArr) throws c0;

    void disableTunneling();

    void enableTunnelingV21();

    void experimentalFlushWithoutAudioTrackRelease();

    void flush();

    k getAudioAttributes();

    long getCurrentPositionUs(boolean z10);

    int getFormatSupport(com.google.android.exoplayer2.z0 z0Var);

    l2 getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws g0, d0;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws g0;

    void reset();

    void setAudioAttributes(k kVar);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(l0 l0Var);

    void setListener(e0 e0Var);

    void setPlaybackParameters(l2 l2Var);

    void setSkipSilenceEnabled(boolean z10);

    void setVolume(float f10);

    boolean supportsFormat(com.google.android.exoplayer2.z0 z0Var);

    default void release() {
    }

    default void setOutputStreamOffsetUs(long j10) {
    }

    default void setPlayerId(zd.c0 c0Var) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }
}
