package gn;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final t1 f57954a = new t1();

    public final void a() {
        ((io.bidmachine.media3.exoplayer.l0) this).D();
    }

    @Override // gn.i1
    public abstract /* synthetic */ void addListener(g1 g1Var);

    @Override // gn.i1
    public final void addMediaItem(int i10, p0 p0Var) {
        addMediaItems(i10, b5.of(p0Var));
    }

    @Override // gn.i1
    public abstract /* synthetic */ void addMediaItems(int i10, List list);

    @Override // gn.i1
    public final void addMediaItems(List<p0> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    public abstract void b(long j10, int i10, boolean z10);

    public final void c(int i10) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            a();
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            b(C.TIME_UNSET, getCurrentMediaItemIndex(), true);
        } else {
            b(C.TIME_UNSET, previousMediaItemIndex, false);
        }
    }

    @Override // gn.i1
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // gn.i1
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // gn.i1
    public abstract /* synthetic */ void clearVideoSurface();

    @Override // gn.i1
    public abstract /* synthetic */ void clearVideoSurface(Surface surface);

    @Override // gn.i1
    public abstract /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // gn.i1
    public abstract /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // gn.i1
    public abstract /* synthetic */ void clearVideoTextureView(TextureView textureView);

    @Override // gn.i1
    @Deprecated
    public abstract /* synthetic */ void decreaseDeviceVolume();

    @Override // gn.i1
    public abstract /* synthetic */ void decreaseDeviceVolume(int i10);

    @Override // gn.i1
    public abstract /* synthetic */ Looper getApplicationLooper();

    @Override // gn.i1
    public abstract /* synthetic */ h getAudioAttributes();

    @Override // gn.i1
    public abstract /* synthetic */ e1 getAvailableCommands();

    @Override // gn.i1
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return io.bidmachine.media3.common.util.a1.constrainValue((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // gn.i1
    public abstract /* synthetic */ long getBufferedPosition();

    @Override // gn.i1
    public abstract /* synthetic */ long getContentBufferedPosition();

    @Override // gn.i1
    public final long getContentDuration() {
        u1 currentTimeline = getCurrentTimeline();
        return currentTimeline.isEmpty() ? C.TIME_UNSET : currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).getDurationMs();
    }

    @Override // gn.i1
    public abstract /* synthetic */ long getContentPosition();

    @Override // gn.i1
    public abstract /* synthetic */ int getCurrentAdGroupIndex();

    @Override // gn.i1
    public abstract /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // gn.i1
    public abstract /* synthetic */ in.d getCurrentCues();

    @Override // gn.i1
    public final long getCurrentLiveOffset() {
        u1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        t1 t1Var = this.f57954a;
        return currentTimeline.getWindow(currentMediaItemIndex, t1Var).f58180f == C.TIME_UNSET ? C.TIME_UNSET : (t1Var.getCurrentUnixTimeMs() - t1Var.f58180f) - getContentPosition();
    }

    @Override // gn.i1
    public final Object getCurrentManifest() {
        u1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).f58178d;
    }

    @Override // gn.i1
    public final p0 getCurrentMediaItem() {
        u1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).f58177c;
    }

    @Override // gn.i1
    public abstract /* synthetic */ int getCurrentMediaItemIndex();

    @Override // gn.i1
    public abstract /* synthetic */ int getCurrentPeriodIndex();

    @Override // gn.i1
    public abstract /* synthetic */ long getCurrentPosition();

    @Override // gn.i1
    public abstract /* synthetic */ u1 getCurrentTimeline();

    @Override // gn.i1
    public abstract /* synthetic */ b2 getCurrentTracks();

    @Override // gn.i1
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // gn.i1
    public abstract /* synthetic */ q getDeviceInfo();

    @Override // gn.i1
    public abstract /* synthetic */ int getDeviceVolume();

    @Override // gn.i1
    public abstract /* synthetic */ long getDuration();

    @Override // gn.i1
    public abstract /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // gn.i1
    public final p0 getMediaItemAt(int i10) {
        return getCurrentTimeline().getWindow(i10, this.f57954a).f58177c;
    }

    @Override // gn.i1
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // gn.i1
    public abstract /* synthetic */ s0 getMediaMetadata();

    @Override // gn.i1
    public final int getNextMediaItemIndex() {
        u1 currentTimeline = getCurrentTimeline();
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

    @Override // gn.i1
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // gn.i1
    public abstract /* synthetic */ boolean getPlayWhenReady();

    @Override // gn.i1
    public abstract /* synthetic */ c1 getPlaybackParameters();

    @Override // gn.i1
    public abstract /* synthetic */ int getPlaybackState();

    @Override // gn.i1
    public abstract /* synthetic */ int getPlaybackSuppressionReason();

    @Override // gn.i1
    public abstract /* synthetic */ b1 getPlayerError();

    @Override // gn.i1
    public abstract /* synthetic */ s0 getPlaylistMetadata();

    @Override // gn.i1
    public final int getPreviousMediaItemIndex() {
        u1 currentTimeline = getCurrentTimeline();
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

    @Override // gn.i1
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // gn.i1
    public abstract /* synthetic */ int getRepeatMode();

    @Override // gn.i1
    public abstract /* synthetic */ long getSeekBackIncrement();

    @Override // gn.i1
    public abstract /* synthetic */ long getSeekForwardIncrement();

    @Override // gn.i1
    public abstract /* synthetic */ boolean getShuffleModeEnabled();

    @Override // gn.i1
    public abstract /* synthetic */ io.bidmachine.media3.common.util.p0 getSurfaceSize();

    @Override // gn.i1
    public abstract /* synthetic */ long getTotalBufferedDuration();

    @Override // gn.i1
    public abstract /* synthetic */ a2 getTrackSelectionParameters();

    @Override // gn.i1
    public abstract /* synthetic */ k2 getVideoSize();

    @Override // gn.i1
    public abstract /* synthetic */ float getVolume();

    @Override // gn.i1
    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // gn.i1
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // gn.i1
    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // gn.i1
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // gn.i1
    @Deprecated
    public abstract /* synthetic */ void increaseDeviceVolume();

    @Override // gn.i1
    public abstract /* synthetic */ void increaseDeviceVolume(int i10);

    @Override // gn.i1
    public final boolean isCommandAvailable(int i10) {
        return getAvailableCommands().contains(i10);
    }

    @Override // gn.i1
    public final boolean isCurrentMediaItemDynamic() {
        u1 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).f58183i;
    }

    @Override // gn.i1
    public final boolean isCurrentMediaItemLive() {
        u1 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).isLive();
    }

    @Override // gn.i1
    public final boolean isCurrentMediaItemSeekable() {
        u1 currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.f57954a).f58182h;
    }

    @Override // gn.i1
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // gn.i1
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // gn.i1
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // gn.i1
    public abstract /* synthetic */ boolean isDeviceMuted();

    @Override // gn.i1
    public abstract /* synthetic */ boolean isLoading();

    @Override // gn.i1
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // gn.i1
    public abstract /* synthetic */ boolean isPlayingAd();

    @Override // gn.i1
    public final void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            moveMediaItems(i10, i10 + 1, i11);
        }
    }

    @Override // gn.i1
    public abstract /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // gn.i1
    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // gn.i1
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // gn.i1
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // gn.i1
    public abstract /* synthetic */ void prepare();

    @Override // gn.i1
    public abstract /* synthetic */ void release();

    @Override // gn.i1
    public abstract /* synthetic */ void removeListener(g1 g1Var);

    @Override // gn.i1
    public final void removeMediaItem(int i10) {
        removeMediaItems(i10, i10 + 1);
    }

    @Override // gn.i1
    public abstract /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // gn.i1
    public final void replaceMediaItem(int i10, p0 p0Var) {
        replaceMediaItems(i10, i10 + 1, b5.of(p0Var));
    }

    @Override // gn.i1
    public abstract /* synthetic */ void replaceMediaItems(int i10, int i11, List list);

    @Override // gn.i1
    public final void seekBack() {
        long currentPosition = getCurrentPosition() + (-getSeekBackIncrement());
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        b(Math.max(currentPosition, 0L), getCurrentMediaItemIndex(), false);
    }

    @Override // gn.i1
    public final void seekForward() {
        long currentPosition = getCurrentPosition() + getSeekForwardIncrement();
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        b(Math.max(currentPosition, 0L), getCurrentMediaItemIndex(), false);
    }

    @Override // gn.i1
    public final void seekTo(int i10, long j10) {
        b(j10, i10, false);
    }

    @Override // gn.i1
    public final void seekToDefaultPosition() {
        b(C.TIME_UNSET, getCurrentMediaItemIndex(), false);
    }

    @Override // gn.i1
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            a();
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                b(C.TIME_UNSET, getCurrentMediaItemIndex(), false);
                return;
            } else {
                a();
                return;
            }
        }
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            a();
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            b(C.TIME_UNSET, getCurrentMediaItemIndex(), true);
        } else {
            b(C.TIME_UNSET, nextMediaItemIndex, false);
        }
    }

    @Override // gn.i1
    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            a();
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            b(C.TIME_UNSET, getCurrentMediaItemIndex(), true);
        } else {
            b(C.TIME_UNSET, nextMediaItemIndex, false);
        }
    }

    @Override // gn.i1
    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // gn.i1
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            a();
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                c(7);
                return;
            } else {
                a();
                return;
            }
        }
        if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            b(0L, getCurrentMediaItemIndex(), false);
        } else {
            c(7);
        }
    }

    @Override // gn.i1
    public final void seekToPreviousMediaItem() {
        c(6);
    }

    @Override // gn.i1
    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // gn.i1
    public abstract /* synthetic */ void setAudioAttributes(h hVar, boolean z10);

    @Override // gn.i1
    @Deprecated
    public abstract /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // gn.i1
    public abstract /* synthetic */ void setDeviceMuted(boolean z10, int i10);

    @Override // gn.i1
    @Deprecated
    public abstract /* synthetic */ void setDeviceVolume(int i10);

    @Override // gn.i1
    public abstract /* synthetic */ void setDeviceVolume(int i10, int i11);

    @Override // gn.i1
    public final void setMediaItem(p0 p0Var) {
        setMediaItems(b5.of(p0Var));
    }

    @Override // gn.i1
    public final void setMediaItems(List<p0> list) {
        setMediaItems(list, true);
    }

    @Override // gn.i1
    public abstract /* synthetic */ void setMediaItems(List list, int i10, long j10);

    @Override // gn.i1
    public abstract /* synthetic */ void setMediaItems(List list, boolean z10);

    @Override // gn.i1
    public abstract /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // gn.i1
    public abstract /* synthetic */ void setPlaybackParameters(c1 c1Var);

    @Override // gn.i1
    public final void setPlaybackSpeed(float f10) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f10));
    }

    @Override // gn.i1
    public abstract /* synthetic */ void setPlaylistMetadata(s0 s0Var);

    @Override // gn.i1
    public abstract /* synthetic */ void setRepeatMode(int i10);

    @Override // gn.i1
    public abstract /* synthetic */ void setShuffleModeEnabled(boolean z10);

    @Override // gn.i1
    public abstract /* synthetic */ void setTrackSelectionParameters(a2 a2Var);

    @Override // gn.i1
    public abstract /* synthetic */ void setVideoSurface(Surface surface);

    @Override // gn.i1
    public abstract /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // gn.i1
    public abstract /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // gn.i1
    public abstract /* synthetic */ void setVideoTextureView(TextureView textureView);

    @Override // gn.i1
    public abstract /* synthetic */ void setVolume(float f10);

    @Override // gn.i1
    public abstract /* synthetic */ void stop();

    @Override // gn.i1
    public final void addMediaItem(p0 p0Var) {
        addMediaItems(b5.of(p0Var));
    }

    @Override // gn.i1
    public final void seekTo(long j10) {
        b(j10, getCurrentMediaItemIndex(), false);
    }

    @Override // gn.i1
    public final void setMediaItem(p0 p0Var, long j10) {
        setMediaItems(b5.of(p0Var), 0, j10);
    }

    @Override // gn.i1
    public final void seekToDefaultPosition(int i10) {
        b(C.TIME_UNSET, i10, false);
    }

    @Override // gn.i1
    public final void setMediaItem(p0 p0Var, boolean z10) {
        setMediaItems(b5.of(p0Var), z10);
    }
}
