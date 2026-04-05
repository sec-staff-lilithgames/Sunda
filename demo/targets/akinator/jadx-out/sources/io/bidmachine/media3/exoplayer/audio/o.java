package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface o {
    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioDisabled(io.bidmachine.media3.exoplayer.j jVar) {
    }

    default void onAudioEnabled(io.bidmachine.media3.exoplayer.j jVar) {
    }

    default void onAudioPositionAdvancing(long j10) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioTrackInitialized(p pVar) {
    }

    default void onAudioTrackReleased(p pVar) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    default void onAudioInputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar) {
    }

    default void onAudioDecoderInitialized(String str, long j10, long j11) {
    }

    default void onAudioUnderrun(int i10, long j10, long j11) {
    }
}
