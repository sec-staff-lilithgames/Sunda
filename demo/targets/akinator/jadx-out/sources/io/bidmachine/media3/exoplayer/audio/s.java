package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface s {
    void onPositionDiscontinuity();

    void onSkipSilenceEnabledChanged(boolean z10);

    void onUnderrun(int i10, long j10, long j11);

    default void onAudioCapabilitiesChanged() {
    }

    default void onOffloadBufferEmptying() {
    }

    default void onOffloadBufferFull() {
    }

    default void onSilenceSkipped() {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioTrackInitialized(p pVar) {
    }

    default void onAudioTrackReleased(p pVar) {
    }

    default void onPositionAdvancing(long j10) {
    }
}
