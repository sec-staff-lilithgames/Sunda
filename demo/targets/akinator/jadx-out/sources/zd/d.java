package zd;

import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface d {
    default void onAudioDecoderInitialized(b bVar, String str, long j10, long j11) {
    }

    @Deprecated
    default void onAudioInputFormatChanged(b bVar, z0 z0Var) {
    }

    @Deprecated
    default void onCues(b bVar, List<ef.b> list) {
    }

    @Deprecated
    default void onDrmSessionAcquired(b bVar) {
    }

    @Deprecated
    default void onPositionDiscontinuity(b bVar, int i10) {
    }

    default void onVideoDecoderInitialized(b bVar, String str, long j10, long j11) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(b bVar, z0 z0Var) {
    }

    default void onVideoSizeChanged(b bVar, sf.x xVar) {
    }

    @Deprecated
    default void onAudioDecoderInitialized(b bVar, String str, long j10) {
    }

    default void onAudioInputFormatChanged(b bVar, z0 z0Var, ce.k kVar) {
    }

    default void onCues(b bVar, ef.e eVar) {
    }

    default void onDrmSessionAcquired(b bVar, int i10) {
    }

    default void onPositionDiscontinuity(b bVar, q2 q2Var, q2 q2Var2, int i10) {
    }

    @Deprecated
    default void onVideoDecoderInitialized(b bVar, String str, long j10) {
    }

    default void onVideoInputFormatChanged(b bVar, z0 z0Var, ce.k kVar) {
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

    default void onAudioAttributesChanged(b bVar, com.google.android.exoplayer2.audio.k kVar) {
    }

    default void onAudioCodecError(b bVar, Exception exc) {
    }

    default void onAudioDecoderReleased(b bVar, String str) {
    }

    default void onAudioDisabled(b bVar, ce.f fVar) {
    }

    default void onAudioEnabled(b bVar, ce.f fVar) {
    }

    default void onAudioPositionAdvancing(b bVar, long j10) {
    }

    default void onAudioSessionIdChanged(b bVar, int i10) {
    }

    default void onAudioSinkError(b bVar, Exception exc) {
    }

    default void onAvailableCommandsChanged(b bVar, n2 n2Var) {
    }

    default void onDeviceInfoChanged(b bVar, com.google.android.exoplayer2.q qVar) {
    }

    default void onDownstreamFormatChanged(b bVar, bf.y yVar) {
    }

    default void onDrmSessionManagerError(b bVar, Exception exc) {
    }

    default void onEvents(r2 r2Var, c cVar) {
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

    default void onMediaMetadataChanged(b bVar, w1 w1Var) {
    }

    default void onMetadata(b bVar, Metadata metadata) {
    }

    default void onPlaybackParametersChanged(b bVar, l2 l2Var) {
    }

    default void onPlaybackStateChanged(b bVar, int i10) {
    }

    default void onPlaybackSuppressionReasonChanged(b bVar, int i10) {
    }

    default void onPlayerError(b bVar, j2 j2Var) {
    }

    default void onPlayerErrorChanged(b bVar, j2 j2Var) {
    }

    default void onPlaylistMetadataChanged(b bVar, w1 w1Var) {
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

    default void onTrackSelectionParametersChanged(b bVar, pf.s sVar) {
    }

    default void onTracksChanged(b bVar, n3 n3Var) {
    }

    default void onUpstreamDiscarded(b bVar, bf.y yVar) {
    }

    default void onVideoCodecError(b bVar, Exception exc) {
    }

    default void onVideoDecoderReleased(b bVar, String str) {
    }

    default void onVideoDisabled(b bVar, ce.f fVar) {
    }

    default void onVideoEnabled(b bVar, ce.f fVar) {
    }

    default void onVolumeChanged(b bVar, float f10) {
    }

    default void onDeviceVolumeChanged(b bVar, int i10, boolean z10) {
    }

    default void onDroppedVideoFrames(b bVar, int i10, long j10) {
    }

    default void onLoadCanceled(b bVar, bf.t tVar, bf.y yVar) {
    }

    default void onLoadCompleted(b bVar, bf.t tVar, bf.y yVar) {
    }

    default void onLoadStarted(b bVar, bf.t tVar, bf.y yVar) {
    }

    default void onMediaItemTransition(b bVar, u1 u1Var, int i10) {
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

    default void onAudioUnderrun(b bVar, int i10, long j10, long j11) {
    }

    default void onBandwidthEstimate(b bVar, int i10, long j10, long j11) {
    }

    default void onLoadError(b bVar, bf.t tVar, bf.y yVar, IOException iOException, boolean z10) {
    }
}
