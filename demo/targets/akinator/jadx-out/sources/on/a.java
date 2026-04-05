package on;

import android.os.Looper;
import ao.g0;
import ao.k0;
import ao.s0;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.f1;
import gn.g1;
import gn.h1;
import gn.i1;
import gn.k2;
import gn.p0;
import gn.u0;
import gn.u1;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a extends g1, s0, go.e, sn.r {
    void addListener(d dVar);

    void notifySeekStarted();

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(gn.h hVar) {
        super.onAudioAttributesChanged(hVar);
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(io.bidmachine.media3.exoplayer.j jVar);

    void onAudioEnabled(io.bidmachine.media3.exoplayer.j jVar);

    void onAudioInputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar);

    void onAudioPositionAdvancing(long j10);

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(io.bidmachine.media3.exoplayer.audio.p pVar);

    void onAudioTrackReleased(io.bidmachine.media3.exoplayer.audio.p pVar);

    void onAudioUnderrun(int i10, long j10, long j11);

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(e1 e1Var) {
        super.onAvailableCommandsChanged(e1Var);
    }

    @Override // go.e
    /* synthetic */ void onBandwidthSample(int i10, long j10, long j11);

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onCues(in.d dVar) {
        super.onCues(dVar);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(gn.q qVar) {
        super.onDeviceInfoChanged(qVar);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // ao.s0
    /* bridge */ /* synthetic */ default void onDownstreamFormatChanged(int i10, k0 k0Var, g0 g0Var) {
        super.onDownstreamFormatChanged(i10, k0Var, g0Var);
    }

    @Override // sn.r
    /* bridge */ /* synthetic */ default void onDrmKeysLoaded(int i10, k0 k0Var) {
        super.onDrmKeysLoaded(i10, k0Var);
    }

    @Override // sn.r
    /* bridge */ /* synthetic */ default void onDrmKeysRemoved(int i10, k0 k0Var) {
        super.onDrmKeysRemoved(i10, k0Var);
    }

    @Override // sn.r
    /* bridge */ /* synthetic */ default void onDrmKeysRestored(int i10, k0 k0Var) {
        super.onDrmKeysRestored(i10, k0Var);
    }

    @Override // sn.r
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, k0 k0Var, int i11) {
        super.onDrmSessionAcquired(i10, k0Var, i11);
    }

    @Override // sn.r
    /* bridge */ /* synthetic */ default void onDrmSessionManagerError(int i10, k0 k0Var, Exception exc) {
        super.onDrmSessionManagerError(i10, k0Var, exc);
    }

    @Override // sn.r
    /* bridge */ /* synthetic */ default void onDrmSessionReleased(int i10, k0 k0Var) {
        super.onDrmSessionReleased(i10, k0Var);
    }

    void onDroppedFrames(int i10, long j10);

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onEvents(i1 i1Var, f1 f1Var) {
        super.onEvents(i1Var, f1Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
    }

    @Override // ao.s0
    /* bridge */ /* synthetic */ default void onLoadCanceled(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var) {
        super.onLoadCanceled(i10, k0Var, b0Var, g0Var);
    }

    @Override // ao.s0
    /* bridge */ /* synthetic */ default void onLoadCompleted(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var) {
        super.onLoadCompleted(i10, k0Var, b0Var, g0Var);
    }

    @Override // ao.s0
    /* bridge */ /* synthetic */ default void onLoadError(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var, IOException iOException, boolean z10) {
        super.onLoadError(i10, k0Var, b0Var, g0Var, iOException, z10);
    }

    @Override // ao.s0
    /* bridge */ /* synthetic */ default void onLoadStarted(int i10, k0 k0Var, ao.b0 b0Var, g0 g0Var, int i11) {
        super.onLoadStarted(i10, k0Var, b0Var, g0Var, i11);
    }

    @Override // gn.g1
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onMediaItemTransition(p0 p0Var, int i10) {
        super.onMediaItemTransition(p0Var, i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(gn.s0 s0Var) {
        super.onMediaMetadataChanged(s0Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onMetadata(u0 u0Var) {
        super.onMetadata(u0Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(c1 c1Var) {
        super.onPlaybackParametersChanged(c1Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlayerError(b1 b1Var) {
        super.onPlayerError(b1Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(b1 b1Var) {
        super.onPlayerErrorChanged(b1Var);
    }

    @Override // gn.g1
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(gn.s0 s0Var) {
        super.onPlaylistMetadataChanged(s0Var);
    }

    @Override // gn.g1
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    void onRenderedFirstFrame(Object obj, long j10);

    void onRendererReadyChanged(int i10, int i11, boolean z10);

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onTimelineChanged(u1 u1Var, int i10) {
        super.onTimelineChanged(u1Var, i10);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(a2 a2Var) {
        super.onTrackSelectionParametersChanged(a2Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onTracksChanged(b2 b2Var) {
        super.onTracksChanged(b2Var);
    }

    @Override // ao.s0
    /* bridge */ /* synthetic */ default void onUpstreamDiscarded(int i10, k0 k0Var, g0 g0Var) {
        super.onUpstreamDiscarded(i10, k0Var, g0Var);
    }

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(io.bidmachine.media3.exoplayer.j jVar);

    void onVideoEnabled(io.bidmachine.media3.exoplayer.j jVar);

    void onVideoFrameProcessingOffset(long j10, int i10);

    void onVideoInputFormatChanged(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.exoplayer.k kVar);

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(k2 k2Var) {
        super.onVideoSizeChanged(k2Var);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    void release();

    void removeListener(d dVar);

    void setPlayer(i1 i1Var, Looper looper);

    void updateMediaPeriodQueueInfo(List<k0> list, k0 k0Var);

    @Override // gn.g1
    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(List list) {
        super.onCues((List<in.b>) list);
    }

    @Override // gn.g1
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(h1 h1Var, h1 h1Var2, int i10) {
        super.onPositionDiscontinuity(h1Var, h1Var2, i10);
    }
}
