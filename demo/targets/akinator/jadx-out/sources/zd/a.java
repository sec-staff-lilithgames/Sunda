package zd;

import android.os.Looper;
import bf.d0;
import bf.j0;
import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o2;
import com.google.android.exoplayer2.p2;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface a extends p2, j0, qf.f, de.q {
    void addListener(d dVar);

    void notifySeekStarted();

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(com.google.android.exoplayer2.audio.k kVar) {
        super.onAudioAttributesChanged(kVar);
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(ce.f fVar);

    void onAudioEnabled(ce.f fVar);

    void onAudioInputFormatChanged(z0 z0Var, ce.k kVar);

    void onAudioPositionAdvancing(long j10);

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(int i10) {
        super.onAudioSessionIdChanged(i10);
    }

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j10, long j11);

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(n2 n2Var) {
        super.onAvailableCommandsChanged(n2Var);
    }

    @Override // qf.f
    /* synthetic */ void onBandwidthSample(int i10, long j10, long j11);

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onCues(ef.e eVar) {
        super.onCues(eVar);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(com.google.android.exoplayer2.q qVar) {
        super.onDeviceInfoChanged(qVar);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(int i10, boolean z10) {
        super.onDeviceVolumeChanged(i10, z10);
    }

    @Override // bf.j0
    /* bridge */ /* synthetic */ default void onDownstreamFormatChanged(int i10, d0 d0Var, bf.y yVar) {
        super.onDownstreamFormatChanged(i10, d0Var, yVar);
    }

    @Override // de.q
    /* bridge */ /* synthetic */ default void onDrmKeysLoaded(int i10, d0 d0Var) {
        super.onDrmKeysLoaded(i10, d0Var);
    }

    @Override // de.q
    /* bridge */ /* synthetic */ default void onDrmKeysRemoved(int i10, d0 d0Var) {
        super.onDrmKeysRemoved(i10, d0Var);
    }

    @Override // de.q
    /* bridge */ /* synthetic */ default void onDrmKeysRestored(int i10, d0 d0Var) {
        super.onDrmKeysRestored(i10, d0Var);
    }

    @Override // de.q
    @Deprecated
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, d0 d0Var) {
        super.onDrmSessionAcquired(i10, d0Var);
    }

    @Override // de.q
    /* bridge */ /* synthetic */ default void onDrmSessionManagerError(int i10, d0 d0Var, Exception exc) {
        super.onDrmSessionManagerError(i10, d0Var, exc);
    }

    @Override // de.q
    /* bridge */ /* synthetic */ default void onDrmSessionReleased(int i10, d0 d0Var) {
        super.onDrmSessionReleased(i10, d0Var);
    }

    void onDroppedFrames(int i10, long j10);

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onEvents(r2 r2Var, o2 o2Var) {
        super.onEvents(r2Var, o2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onIsPlayingChanged(boolean z10) {
        super.onIsPlayingChanged(z10);
    }

    @Override // bf.j0
    /* bridge */ /* synthetic */ default void onLoadCanceled(int i10, d0 d0Var, bf.t tVar, bf.y yVar) {
        super.onLoadCanceled(i10, d0Var, tVar, yVar);
    }

    @Override // bf.j0
    /* bridge */ /* synthetic */ default void onLoadCompleted(int i10, d0 d0Var, bf.t tVar, bf.y yVar) {
        super.onLoadCompleted(i10, d0Var, tVar, yVar);
    }

    @Override // bf.j0
    /* bridge */ /* synthetic */ default void onLoadError(int i10, d0 d0Var, bf.t tVar, bf.y yVar, IOException iOException, boolean z10) {
        super.onLoadError(i10, d0Var, tVar, yVar, iOException, z10);
    }

    @Override // bf.j0
    /* bridge */ /* synthetic */ default void onLoadStarted(int i10, d0 d0Var, bf.t tVar, bf.y yVar) {
        super.onLoadStarted(i10, d0Var, tVar, yVar);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z10) {
        super.onLoadingChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j10) {
        super.onMaxSeekToPreviousPositionChanged(j10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onMediaItemTransition(u1 u1Var, int i10) {
        super.onMediaItemTransition(u1Var, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(w1 w1Var) {
        super.onMediaMetadataChanged(w1Var);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onMetadata(Metadata metadata) {
        super.onMetadata(metadata);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(boolean z10, int i10) {
        super.onPlayWhenReadyChanged(z10, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(l2 l2Var) {
        super.onPlaybackParametersChanged(l2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(int i10) {
        super.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlayerError(j2 j2Var) {
        super.onPlayerError(j2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(j2 j2Var) {
        super.onPlayerErrorChanged(j2Var);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z10, int i10) {
        super.onPlayerStateChanged(z10, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(w1 w1Var) {
        super.onPlaylistMetadataChanged(w1Var);
    }

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i10) {
        super.onPositionDiscontinuity(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
    }

    void onRenderedFirstFrame(Object obj, long j10);

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onRepeatModeChanged(int i10) {
        super.onRepeatModeChanged(i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(long j10) {
        super.onSeekBackIncrementChanged(j10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(long j10) {
        super.onSeekForwardIncrementChanged(j10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onShuffleModeEnabledChanged(boolean z10) {
        super.onShuffleModeEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(boolean z10) {
        super.onSkipSilenceEnabledChanged(z10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(int i10, int i11) {
        super.onSurfaceSizeChanged(i10, i11);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onTimelineChanged(m3 m3Var, int i10) {
        super.onTimelineChanged(m3Var, i10);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(pf.s sVar) {
        super.onTrackSelectionParametersChanged(sVar);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onTracksChanged(n3 n3Var) {
        super.onTracksChanged(n3Var);
    }

    @Override // bf.j0
    /* bridge */ /* synthetic */ default void onUpstreamDiscarded(int i10, d0 d0Var, bf.y yVar) {
        super.onUpstreamDiscarded(i10, d0Var, yVar);
    }

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(ce.f fVar);

    void onVideoEnabled(ce.f fVar);

    void onVideoFrameProcessingOffset(long j10, int i10);

    void onVideoInputFormatChanged(z0 z0Var, ce.k kVar);

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(sf.x xVar) {
        super.onVideoSizeChanged(xVar);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
    }

    void release();

    void removeListener(d dVar);

    void setPlayer(r2 r2Var, Looper looper);

    void updateMediaPeriodQueueInfo(List<d0> list, d0 d0Var);

    @Override // com.google.android.exoplayer2.p2
    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(List list) {
        super.onCues((List<ef.b>) list);
    }

    @Override // de.q
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(int i10, d0 d0Var, int i11) {
        super.onDrmSessionAcquired(i10, d0Var, i11);
    }

    @Override // com.google.android.exoplayer2.p2
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(q2 q2Var, q2 q2Var2, int i10) {
        super.onPositionDiscontinuity(q2Var, q2Var2, i10);
    }
}
