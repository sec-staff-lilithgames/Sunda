package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface e0 {
    void onPositionDiscontinuity();

    void onSkipSilenceEnabledChanged(boolean z10);

    void onUnderrun(int i10, long j10, long j11);

    default void onAudioCapabilitiesChanged() {
    }

    default void onOffloadBufferEmptying() {
    }

    default void onOffloadBufferFull() {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onPositionAdvancing(long j10) {
    }
}
