package io.odeeo.internal.b1;

import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.i0;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.m;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.b.z0;
import io.odeeo.internal.n0.h;
import io.odeeo.internal.n0.j;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements l0.e {
    @Override // io.odeeo.internal.b.l0.e
    public void onAudioAttributesChanged(io.odeeo.internal.d.d audioAttributes) {
        e0.checkNotNullParameter(audioAttributes, "audioAttributes");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onAvailableCommandsChanged(l0.b availableCommands) {
        e0.checkNotNullParameter(availableCommands, "availableCommands");
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onCues(List<io.odeeo.internal.d0.a> cues) {
        e0.checkNotNullParameter(cues, "cues");
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onDeviceInfoChanged(m deviceInfo) {
        e0.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onEvents(l0 player, l0.d events) {
        e0.checkNotNullParameter(player, "player");
        e0.checkNotNullParameter(events, "events");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onMediaMetadataChanged(a0 mediaMetadata) {
        e0.checkNotNullParameter(mediaMetadata, "mediaMetadata");
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onMetadata(io.odeeo.internal.s.a metadata) {
        e0.checkNotNullParameter(metadata, "metadata");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlaybackParametersChanged(k0 playbackParameters) {
        e0.checkNotNullParameter(playbackParameters, "playbackParameters");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlayerError(i0 error) {
        e0.checkNotNullParameter(error, "error");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlaylistMetadataChanged(a0 mediaMetadata) {
        e0.checkNotNullParameter(mediaMetadata, "mediaMetadata");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onTimelineChanged(y0 timeline, int i10) {
        e0.checkNotNullParameter(timeline, "timeline");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onTrackSelectionParametersChanged(j parameters) {
        e0.checkNotNullParameter(parameters, "parameters");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onTracksChanged(io.odeeo.internal.a0.l0 trackGroups, h trackSelections) {
        e0.checkNotNullParameter(trackGroups, "trackGroups");
        e0.checkNotNullParameter(trackSelections, "trackSelections");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onTracksInfoChanged(z0 tracksInfo) {
        e0.checkNotNullParameter(tracksInfo, "tracksInfo");
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onVideoSizeChanged(io.odeeo.internal.r0.m videoSize) {
        e0.checkNotNullParameter(videoSize, "videoSize");
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPositionDiscontinuity(l0.f oldPosition, l0.f newPosition, int i10) {
        e0.checkNotNullParameter(oldPosition, "oldPosition");
        e0.checkNotNullParameter(newPosition, "newPosition");
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onRenderedFirstFrame() {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onSeekProcessed() {
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onAudioSessionIdChanged(int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onIsLoadingChanged(boolean z10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onIsPlayingChanged(boolean z10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onLoadingChanged(boolean z10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onMaxSeekToPreviousPositionChanged(long j10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlaybackStateChanged(int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlayerErrorChanged(i0 i0Var) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onRepeatModeChanged(int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onSeekBackIncrementChanged(long j10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onSeekForwardIncrementChanged(long j10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onVolumeChanged(float f10) {
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onMediaItemTransition(z zVar, int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlayerStateChanged(boolean z10, int i10) {
    }

    @Override // io.odeeo.internal.b.l0.e
    public void onSurfaceSizeChanged(int i10, int i11) {
    }
}
