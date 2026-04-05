package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b0 {
    @Deprecated
    default void onAudioInputFormatChanged(com.google.android.exoplayer2.z0 z0Var) {
    }

    default void onAudioInputFormatChanged(com.google.android.exoplayer2.z0 z0Var, ce.k kVar) {
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioDisabled(ce.f fVar) {
    }

    default void onAudioEnabled(ce.f fVar) {
    }

    default void onAudioPositionAdvancing(long j10) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    default void onAudioDecoderInitialized(String str, long j10, long j11) {
    }

    default void onAudioUnderrun(int i10, long j10, long j11) {
    }
}
