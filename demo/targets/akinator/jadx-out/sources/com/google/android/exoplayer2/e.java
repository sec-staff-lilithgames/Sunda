package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final l3 f27437a = new l3();

    public final void a(int i10) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            return;
        }
        if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), C.TIME_UNSET, i10, true);
        } else {
            seekTo(previousMediaItemIndex, C.TIME_UNSET, i10, false);
        }
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void addListener(p2 p2Var);

    @Override // com.google.android.exoplayer2.r2
    public final void addMediaItem(int i10, u1 u1Var) {
        addMediaItems(i10, b5.of(u1Var));
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void addMediaItems(int i10, List list);

    @Override // com.google.android.exoplayer2.r2
    public final void addMediaItems(List<u1> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // com.google.android.exoplayer2.r2
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // com.google.android.exoplayer2.r2
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void clearVideoSurface();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void clearVideoSurface(Surface surface);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void clearVideoTextureView(TextureView textureView);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public abstract /* synthetic */ void decreaseDeviceVolume();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void decreaseDeviceVolume(int i10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ Looper getApplicationLooper();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ com.google.android.exoplayer2.audio.k getAudioAttributes();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ n2 getAvailableCommands();

    @Override // com.google.android.exoplayer2.r2
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return com.google.android.exoplayer2.util.n1.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getBufferedPosition();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getContentBufferedPosition();

    @Override // com.google.android.exoplayer2.r2
    public final long getContentDuration() {
        m3 currentTimeline = getCurrentTimeline();
        return currentTimeline.isEmpty() ? C.TIME_UNSET : currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).getDurationMs();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getContentPosition();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getCurrentAdGroupIndex();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ ef.e getCurrentCues();

    @Override // com.google.android.exoplayer2.r2
    public final long getCurrentLiveOffset() {
        m3 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        l3 l3Var = this.f27437a;
        return currentTimeline.getWindow(currentMediaItemIndex, l3Var).f27652h == C.TIME_UNSET ? C.TIME_UNSET : (l3Var.getCurrentUnixTimeMs() - l3Var.f27652h) - getContentPosition();
    }

    @Override // com.google.android.exoplayer2.r2
    public final Object getCurrentManifest() {
        m3 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).f27650f;
    }

    @Override // com.google.android.exoplayer2.r2
    public final u1 getCurrentMediaItem() {
        m3 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).f27649e;
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getCurrentMediaItemIndex();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getCurrentPeriodIndex();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getCurrentPosition();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ m3 getCurrentTimeline();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ n3 getCurrentTracks();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ q getDeviceInfo();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getDeviceVolume();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getDuration();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // com.google.android.exoplayer2.r2
    public final u1 getMediaItemAt(int i10) {
        return getCurrentTimeline().getWindow(i10, this.f27437a).f27649e;
    }

    @Override // com.google.android.exoplayer2.r2
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ w1 getMediaMetadata();

    @Override // com.google.android.exoplayer2.r2
    public final int getNextMediaItemIndex() {
        m3 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getNextWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ boolean getPlayWhenReady();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ l2 getPlaybackParameters();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getPlaybackState();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getPlaybackSuppressionReason();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ j2 getPlayerError();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ w1 getPlaylistMetadata();

    @Override // com.google.android.exoplayer2.r2
    public final int getPreviousMediaItemIndex() {
        m3 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getPreviousWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ int getRepeatMode();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getSeekBackIncrement();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getSeekForwardIncrement();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ boolean getShuffleModeEnabled();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ com.google.android.exoplayer2.util.a1 getSurfaceSize();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ long getTotalBufferedDuration();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ pf.s getTrackSelectionParameters();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ sf.x getVideoSize();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ float getVolume();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public abstract /* synthetic */ void increaseDeviceVolume();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void increaseDeviceVolume(int i10);

    @Override // com.google.android.exoplayer2.r2
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().contains(i10);
    }

    @Override // com.google.android.exoplayer2.r2
    public final boolean isCurrentMediaItemDynamic() {
        m3 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).f27655k;
    }

    @Override // com.google.android.exoplayer2.r2
    public final boolean isCurrentMediaItemLive() {
        m3 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).isLive();
    }

    @Override // com.google.android.exoplayer2.r2
    public final boolean isCurrentMediaItemSeekable() {
        m3 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f27437a).f27654j;
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ boolean isDeviceMuted();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ boolean isLoading();

    @Override // com.google.android.exoplayer2.r2
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ boolean isPlayingAd();

    @Override // com.google.android.exoplayer2.r2
    public final void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            moveMediaItems(i10, i10 + 1, i11);
        }
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void prepare();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final void previous() {
        seekToPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void release();

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void removeListener(p2 p2Var);

    @Override // com.google.android.exoplayer2.r2
    public final void removeMediaItem(int i10) {
        removeMediaItems(i10, i10 + 1);
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // com.google.android.exoplayer2.r2
    public final void replaceMediaItem(int i10, u1 u1Var) {
        replaceMediaItems(i10, i10 + 1, b5.of(u1Var));
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void replaceMediaItems(int i10, int i11, List list);

    @Override // com.google.android.exoplayer2.r2
    public final void seekBack() {
        long currentPosition = getCurrentPosition() + (-getSeekBackIncrement());
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), 11, false);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekForward() {
        long currentPosition = getCurrentPosition() + getSeekForwardIncrement();
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), 12, false);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekTo(int i10, long j10) {
        seekTo(i10, j10, 10, false);
    }

    public abstract void seekTo(int i10, long j10, int i11, boolean z10);

    @Override // com.google.android.exoplayer2.r2
    public final void seekToDefaultPosition() {
        seekTo(getCurrentMediaItemIndex(), C.TIME_UNSET, 4, false);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                seekTo(getCurrentMediaItemIndex(), C.TIME_UNSET, 9, false);
                return;
            }
            return;
        }
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), C.TIME_UNSET, 9, true);
        } else {
            seekTo(nextMediaItemIndex, C.TIME_UNSET, 9, false);
        }
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            seekTo(getCurrentMediaItemIndex(), C.TIME_UNSET, 8, true);
        } else {
            seekTo(nextMediaItemIndex, C.TIME_UNSET, 8, false);
        }
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                a(7);
            }
        } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekTo(getCurrentMediaItemIndex(), 0L, 7, false);
        } else {
            a(7);
        }
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekToPreviousMediaItem() {
        a(6);
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public abstract /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setDeviceMuted(boolean z10, int i10);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    public abstract /* synthetic */ void setDeviceVolume(int i10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setDeviceVolume(int i10, int i11);

    @Override // com.google.android.exoplayer2.r2
    public final void setMediaItem(u1 u1Var) {
        setMediaItems(b5.of(u1Var));
    }

    @Override // com.google.android.exoplayer2.r2
    public final void setMediaItems(List<u1> list) {
        setMediaItems(list, true);
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setMediaItems(List list, int i10, long j10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setMediaItems(List list, boolean z10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setPlaybackParameters(l2 l2Var);

    @Override // com.google.android.exoplayer2.r2
    public final void setPlaybackSpeed(float f10) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f10));
    }

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setPlaylistMetadata(w1 w1Var);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setRepeatMode(int i10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setShuffleModeEnabled(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setTrackSelectionParameters(pf.s sVar);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setVideoSurface(Surface surface);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setVideoTextureView(TextureView textureView);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void setVolume(float f10);

    @Override // com.google.android.exoplayer2.r2
    public abstract /* synthetic */ void stop();

    @Override // com.google.android.exoplayer2.r2
    public final void addMediaItem(u1 u1Var) {
        addMediaItems(b5.of(u1Var));
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekTo(long j10) {
        seekTo(getCurrentMediaItemIndex(), j10, 5, false);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void setMediaItem(u1 u1Var, long j10) {
        setMediaItems(b5.of(u1Var), 0, j10);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void seekToDefaultPosition(int i10) {
        seekTo(i10, C.TIME_UNSET, 10, false);
    }

    @Override // com.google.android.exoplayer2.r2
    public final void setMediaItem(u1 u1Var, boolean z10) {
        setMediaItems(b5.of(u1Var), z10);
    }
}
