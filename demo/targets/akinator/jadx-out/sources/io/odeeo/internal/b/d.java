package io.odeeo.internal.b;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.y0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.d f62656a = new y0.d();

    public l0.b a(l0.b bVar) {
        return new l0.b.a().addAll(bVar).addIf(4, !isPlayingAd()).addIf(5, isCurrentMediaItemSeekable() && !isPlayingAd()).addIf(6, hasPreviousMediaItem() && !isPlayingAd()).addIf(7, !getCurrentTimeline().isEmpty() && (hasPreviousMediaItem() || !isCurrentMediaItemLive() || isCurrentMediaItemSeekable()) && !isPlayingAd()).addIf(8, hasNextMediaItem() && !isPlayingAd()).addIf(9, !getCurrentTimeline().isEmpty() && (hasNextMediaItem() || (isCurrentMediaItemLive() && isCurrentMediaItemDynamic())) && !isPlayingAd()).addIf(10, !isPlayingAd()).addIf(11, isCurrentMediaItemSeekable() && !isPlayingAd()).addIf(12, isCurrentMediaItemSeekable() && !isPlayingAd()).build();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void addListener(l0.e eVar);

    @Override // io.odeeo.internal.b.l0
    public final void addMediaItem(int i10, z zVar) {
        addMediaItems(i10, Collections.singletonList(zVar));
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void addMediaItems(int i10, List list);

    @Override // io.odeeo.internal.b.l0
    public final void addMediaItems(List<z> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // io.odeeo.internal.b.l0
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // io.odeeo.internal.b.l0
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void clearVideoSurface();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void clearVideoSurface(Surface surface);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void clearVideoTextureView(TextureView textureView);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void decreaseDeviceVolume();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ Looper getApplicationLooper();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ io.odeeo.internal.d.d getAudioAttributes();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ l0.b getAvailableCommands();

    @Override // io.odeeo.internal.b.l0
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return io.odeeo.internal.q0.g0.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getBufferedPosition();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getContentBufferedPosition();

    @Override // io.odeeo.internal.b.l0
    public final long getContentDuration() {
        y0 currentTimeline = getCurrentTimeline();
        return currentTimeline.isEmpty() ? C.TIME_UNSET : currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).getDurationMs();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getContentPosition();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getCurrentAdGroupIndex();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ List getCurrentCues();

    @Override // io.odeeo.internal.b.l0
    public final long getCurrentLiveOffset() {
        y0 currentTimeline = getCurrentTimeline();
        return (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).f63095f == C.TIME_UNSET) ? C.TIME_UNSET : (this.f62656a.getCurrentUnixTimeMs() - this.f62656a.f63095f) - getContentPosition();
    }

    @Override // io.odeeo.internal.b.l0
    public final Object getCurrentManifest() {
        y0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).f63093d;
    }

    @Override // io.odeeo.internal.b.l0
    public final z getCurrentMediaItem() {
        y0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).f63092c;
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getCurrentMediaItemIndex();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getCurrentPeriodIndex();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getCurrentPosition();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ y0 getCurrentTimeline();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public abstract /* synthetic */ io.odeeo.internal.a0.l0 getCurrentTrackGroups();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public abstract /* synthetic */ io.odeeo.internal.n0.h getCurrentTrackSelections();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ z0 getCurrentTracksInfo();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ m getDeviceInfo();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getDeviceVolume();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getDuration();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // io.odeeo.internal.b.l0
    public final z getMediaItemAt(int i10) {
        return getCurrentTimeline().getWindow(i10, this.f62656a).f63092c;
    }

    @Override // io.odeeo.internal.b.l0
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ a0 getMediaMetadata();

    @Override // io.odeeo.internal.b.l0
    public final int getNextMediaItemIndex() {
        y0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getNextWindowIndex(getCurrentMediaItemIndex(), a(), getShuffleModeEnabled());
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ boolean getPlayWhenReady();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ k0 getPlaybackParameters();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getPlaybackState();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getPlaybackSuppressionReason();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ i0 getPlayerError();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ a0 getPlaylistMetadata();

    @Override // io.odeeo.internal.b.l0
    public final int getPreviousMediaItemIndex() {
        y0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), a(), getShuffleModeEnabled());
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ int getRepeatMode();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getSeekBackIncrement();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getSeekForwardIncrement();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ boolean getShuffleModeEnabled();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ long getTotalBufferedDuration();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ io.odeeo.internal.n0.j getTrackSelectionParameters();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ io.odeeo.internal.r0.m getVideoSize();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ float getVolume();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void increaseDeviceVolume();

    @Override // io.odeeo.internal.b.l0
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().contains(i10);
    }

    @Override // io.odeeo.internal.b.l0
    public final boolean isCurrentMediaItemDynamic() {
        y0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).f63098i;
    }

    @Override // io.odeeo.internal.b.l0
    public final boolean isCurrentMediaItemLive() {
        y0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).isLive();
    }

    @Override // io.odeeo.internal.b.l0
    public final boolean isCurrentMediaItemSeekable() {
        y0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f62656a).f63097h;
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ boolean isDeviceMuted();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ boolean isLoading();

    @Override // io.odeeo.internal.b.l0
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ boolean isPlayingAd();

    @Override // io.odeeo.internal.b.l0
    public final void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            moveMediaItems(i10, i10 + 1, i11);
        }
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // io.odeeo.internal.b.l0
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void prepare();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final void previous() {
        seekToPreviousMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void release();

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void removeListener(l0.e eVar);

    @Override // io.odeeo.internal.b.l0
    public final void removeMediaItem(int i10) {
        removeMediaItems(i10, i10 + 1);
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // io.odeeo.internal.b.l0
    public final void seekBack() {
        a(-getSeekBackIncrement());
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekForward() {
        a(getSeekForwardIncrement());
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void seekTo(int i10, long j10);

    @Override // io.odeeo.internal.b.l0
    public final void seekTo(long j10) {
        seekTo(getCurrentMediaItemIndex(), j10);
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekToDefaultPosition() {
        seekToDefaultPosition(getCurrentMediaItemIndex());
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            return;
        }
        if (hasNextMediaItem()) {
            seekToNextMediaItem();
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            seekToDefaultPosition();
        }
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex != -1) {
            seekToDefaultPosition(nextMediaItemIndex);
        }
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                seekToPreviousMediaItem();
            }
        } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekTo(0L);
        } else {
            seekToPreviousMediaItem();
        }
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekToPreviousMediaItem() {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex != -1) {
            seekToDefaultPosition(previousMediaItemIndex);
        }
    }

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setDeviceVolume(int i10);

    @Override // io.odeeo.internal.b.l0
    public final void setMediaItem(z zVar) {
        setMediaItems(Collections.singletonList(zVar));
    }

    @Override // io.odeeo.internal.b.l0
    public final void setMediaItems(List<z> list) {
        setMediaItems(list, true);
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setMediaItems(List list, int i10, long j10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setMediaItems(List list, boolean z10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setPlaybackParameters(k0 k0Var);

    @Override // io.odeeo.internal.b.l0
    public final void setPlaybackSpeed(float f10) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f10));
    }

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setPlaylistMetadata(a0 a0Var);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setRepeatMode(int i10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setShuffleModeEnabled(boolean z10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setTrackSelectionParameters(io.odeeo.internal.n0.j jVar);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setVideoSurface(Surface surface);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setVideoTextureView(TextureView textureView);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void setVolume(float f10);

    @Override // io.odeeo.internal.b.l0
    public abstract /* synthetic */ void stop();

    @Override // io.odeeo.internal.b.l0
    @Deprecated
    public abstract /* synthetic */ void stop(boolean z10);

    @Override // io.odeeo.internal.b.l0
    public final void addMediaItem(z zVar) {
        addMediaItems(Collections.singletonList(zVar));
    }

    @Override // io.odeeo.internal.b.l0
    public final void seekToDefaultPosition(int i10) {
        seekTo(i10, C.TIME_UNSET);
    }

    @Override // io.odeeo.internal.b.l0
    public final void setMediaItem(z zVar, long j10) {
        setMediaItems(Collections.singletonList(zVar), 0, j10);
    }

    @Override // io.odeeo.internal.b.l0
    public final void setMediaItem(z zVar, boolean z10) {
        setMediaItems(Collections.singletonList(zVar), z10);
    }

    public final int a() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final void a(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }
}
