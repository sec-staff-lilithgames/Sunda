package on;

import ao.g0;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.h1;
import gn.i1;
import gn.k2;
import gn.p0;
import gn.s0;
import gn.u0;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface d {
    default void onAudioDecoderInitialized(b bVar, String str, long j10, long j11) {
    }

    @Deprecated
    default void onCues(b bVar, List<in.b> list) {
    }

    @Deprecated
    default void onDrmSessionAcquired(b bVar) {
    }

    @Deprecated
    default void onLoadStarted(b bVar, ao.b0 b0Var, g0 g0Var) {
    }

    @Deprecated
    default void onPositionDiscontinuity(b bVar, int i10) {
    }

    default void onVideoDecoderInitialized(b bVar, String str, long j10, long j11) {
    }

    default void onVideoSizeChanged(b bVar, k2 k2Var) {
    }

    @Deprecated
    default void onAudioDecoderInitialized(b bVar, String str, long j10) {
    }

    default void onCues(b bVar, in.d dVar) {
    }

    default void onDrmSessionAcquired(b bVar, int i10) {
    }

    default void onLoadStarted(b bVar, ao.b0 b0Var, g0 g0Var, int i10) {
    }

    default void onPositionDiscontinuity(b bVar, h1 h1Var, h1 h1Var2, int i10) {
    }

    @Deprecated
    default void onVideoDecoderInitialized(b bVar, String str, long j10) {
    }

    @Deprecated
    default void onVideoSizeChanged(b bVar, int i10, int i11, int i12, float f10) {
    }

    default void onDrmKeysLoaded(b bVar) {
    }

    default void onDrmKeysRemoved(b bVar) {
    }

    default void onDrmKeysRestored(b bVar) {
    }

    default void onDrmSessionReleased(b bVar) {
    }

    default void onPlayerReleased(b bVar) {
    }

    @Deprecated
    default void onSeekStarted(b bVar) {
    }

    default void onAudioAttributesChanged(b bVar, gn.h hVar) {
    }

    default void onAudioCodecError(b bVar, Exception exc) {
    }

    default void onAudioDecoderReleased(b bVar, String str) {
    }

    default void onAudioDisabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
    }

    default void onAudioEnabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
    }

    default void onAudioPositionAdvancing(b bVar, long j10) {
    }

    default void onAudioSessionIdChanged(b bVar, int i10) {
    }

    default void onAudioSinkError(b bVar, Exception exc) {
    }

    default void onAudioTrackInitialized(b bVar, io.bidmachine.media3.exoplayer.audio.p pVar) {
    }

    default void onAudioTrackReleased(b bVar, io.bidmachine.media3.exoplayer.audio.p pVar) {
    }

    default void onAvailableCommandsChanged(b bVar, e1 e1Var) {
    }

    default void onDeviceInfoChanged(b bVar, gn.q qVar) {
    }

    default void onDownstreamFormatChanged(b bVar, g0 g0Var) {
    }

    default void onDrmSessionManagerError(b bVar, Exception exc) {
    }

    default void onEvents(i1 i1Var, c cVar) {
    }

    default void onIsLoadingChanged(b bVar, boolean z10) {
    }

    default void onIsPlayingChanged(b bVar, boolean z10) {
    }

    @Deprecated
    default void onLoadingChanged(b bVar, boolean z10) {
    }

    default void onMaxSeekToPreviousPositionChanged(b bVar, long j10) {
    }

    default void onMediaMetadataChanged(b bVar, s0 s0Var) {
    }

    default void onMetadata(b bVar, u0 u0Var) {
    }

    default void onPlaybackParametersChanged(b bVar, c1 c1Var) {
    }

    default void onPlaybackStateChanged(b bVar, int i10) {
    }

    default void onPlaybackSuppressionReasonChanged(b bVar, int i10) {
    }

    default void onPlayerError(b bVar, b1 b1Var) {
    }

    default void onPlayerErrorChanged(b bVar, b1 b1Var) {
    }

    default void onPlaylistMetadataChanged(b bVar, s0 s0Var) {
    }

    default void onRepeatModeChanged(b bVar, int i10) {
    }

    default void onSeekBackIncrementChanged(b bVar, long j10) {
    }

    default void onSeekForwardIncrementChanged(b bVar, long j10) {
    }

    default void onShuffleModeChanged(b bVar, boolean z10) {
    }

    default void onSkipSilenceEnabledChanged(b bVar, boolean z10) {
    }

    default void onTimelineChanged(b bVar, int i10) {
    }

    default void onTrackSelectionParametersChanged(b bVar, a2 a2Var) {
    }

    default void onTracksChanged(b bVar, b2 b2Var) {
    }

    default void onUpstreamDiscarded(b bVar, g0 g0Var) {
    }

    default void onVideoCodecError(b bVar, Exception exc) {
    }

    default void onVideoDecoderReleased(b bVar, String str) {
    }

    default void onVideoDisabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
    }

    default void onVideoEnabled(b bVar, io.bidmachine.media3.exoplayer.j jVar) {
    }

    default void onVolumeChanged(b bVar, float f10) {
    }

    default void onAudioInputFormatChanged(b bVar, io.bidmachine.media3.common.b bVar2, io.bidmachine.media3.exoplayer.k kVar) {
    }

    default void onDeviceVolumeChanged(b bVar, int i10, boolean z10) {
    }

    default void onDroppedVideoFrames(b bVar, int i10, long j10) {
    }

    default void onLoadCanceled(b bVar, ao.b0 b0Var, g0 g0Var) {
    }

    default void onLoadCompleted(b bVar, ao.b0 b0Var, g0 g0Var) {
    }

    default void onMediaItemTransition(b bVar, p0 p0Var, int i10) {
    }

    default void onPlayWhenReadyChanged(b bVar, boolean z10, int i10) {
    }

    @Deprecated
    default void onPlayerStateChanged(b bVar, boolean z10, int i10) {
    }

    default void onRenderedFirstFrame(b bVar, Object obj, long j10) {
    }

    default void onSurfaceSizeChanged(b bVar, int i10, int i11) {
    }

    default void onVideoFrameProcessingOffset(b bVar, long j10, int i10) {
    }

    default void onVideoInputFormatChanged(b bVar, io.bidmachine.media3.common.b bVar2, io.bidmachine.media3.exoplayer.k kVar) {
    }

    default void onAudioUnderrun(b bVar, int i10, long j10, long j11) {
    }

    default void onBandwidthEstimate(b bVar, int i10, long j10, long j11) {
    }

    default void onRendererReadyChanged(b bVar, int i10, int i11, boolean z10) {
    }

    default void onLoadError(b bVar, ao.b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
    }
}
