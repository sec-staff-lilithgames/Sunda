package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface p2 {
    @Deprecated
    default void onCues(List<ef.b> list) {
    }

    @Deprecated
    default void onPositionDiscontinuity(int i10) {
    }

    default void onCues(ef.e eVar) {
    }

    default void onPositionDiscontinuity(q2 q2Var, q2 q2Var2, int i10) {
    }

    default void onRenderedFirstFrame() {
    }

    default void onAudioAttributesChanged(com.google.android.exoplayer2.audio.k kVar) {
    }

    default void onAudioSessionIdChanged(int i10) {
    }

    default void onAvailableCommandsChanged(n2 n2Var) {
    }

    default void onDeviceInfoChanged(q qVar) {
    }

    default void onIsLoadingChanged(boolean z10) {
    }

    default void onIsPlayingChanged(boolean z10) {
    }

    @Deprecated
    default void onLoadingChanged(boolean z10) {
    }

    default void onMaxSeekToPreviousPositionChanged(long j10) {
    }

    default void onMediaMetadataChanged(w1 w1Var) {
    }

    default void onMetadata(Metadata metadata) {
    }

    default void onPlaybackParametersChanged(l2 l2Var) {
    }

    default void onPlaybackStateChanged(int i10) {
    }

    default void onPlaybackSuppressionReasonChanged(int i10) {
    }

    default void onPlayerError(j2 j2Var) {
    }

    default void onPlayerErrorChanged(j2 j2Var) {
    }

    default void onPlaylistMetadataChanged(w1 w1Var) {
    }

    default void onRepeatModeChanged(int i10) {
    }

    default void onSeekBackIncrementChanged(long j10) {
    }

    default void onSeekForwardIncrementChanged(long j10) {
    }

    default void onShuffleModeEnabledChanged(boolean z10) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    default void onTrackSelectionParametersChanged(pf.s sVar) {
    }

    default void onTracksChanged(n3 n3Var) {
    }

    default void onVideoSizeChanged(sf.x xVar) {
    }

    default void onVolumeChanged(float f10) {
    }

    default void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    default void onEvents(r2 r2Var, o2 o2Var) {
    }

    default void onMediaItemTransition(u1 u1Var, int i10) {
    }

    default void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Deprecated
    default void onPlayerStateChanged(boolean z10, int i10) {
    }

    default void onSurfaceSizeChanged(int i10, int i11) {
    }

    default void onTimelineChanged(m3 m3Var, int i10) {
    }
}
