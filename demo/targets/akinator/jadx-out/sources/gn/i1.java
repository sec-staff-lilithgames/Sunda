package gn;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i1 {
    void addListener(g1 g1Var);

    void addMediaItem(int i10, p0 p0Var);

    void addMediaItem(p0 p0Var);

    void addMediaItems(int i10, List<p0> list);

    void addMediaItems(List<p0> list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(Surface surface);

    void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    @Deprecated
    void decreaseDeviceVolume();

    void decreaseDeviceVolume(int i10);

    Looper getApplicationLooper();

    h getAudioAttributes();

    e1 getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    in.d getCurrentCues();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    p0 getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    u1 getCurrentTimeline();

    b2 getCurrentTracks();

    @Deprecated
    int getCurrentWindowIndex();

    q getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    p0 getMediaItemAt(int i10);

    int getMediaItemCount();

    s0 getMediaMetadata();

    int getNextMediaItemIndex();

    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    c1 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    b1 getPlayerError();

    s0 getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    io.bidmachine.media3.common.util.p0 getSurfaceSize();

    long getTotalBufferedDuration();

    a2 getTrackSelectionParameters();

    k2 getVideoSize();

    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @Deprecated
    boolean hasNextWindow();

    boolean hasPreviousMediaItem();

    @Deprecated
    void increaseDeviceVolume();

    void increaseDeviceVolume(int i10);

    boolean isCommandAvailable(int i10);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @Deprecated
    boolean isCurrentWindowDynamic();

    @Deprecated
    boolean isCurrentWindowLive();

    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i10, int i11);

    void moveMediaItems(int i10, int i11, int i12);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    void release();

    void removeListener(g1 g1Var);

    void removeMediaItem(int i10);

    void removeMediaItems(int i10, int i11);

    void replaceMediaItem(int i10, p0 p0Var);

    void replaceMediaItems(int i10, int i11, List<p0> list);

    void seekBack();

    void seekForward();

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i10);

    void seekToNext();

    void seekToNextMediaItem();

    @Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @Deprecated
    void seekToPreviousWindow();

    void setAudioAttributes(h hVar, boolean z10);

    @Deprecated
    void setDeviceMuted(boolean z10);

    void setDeviceMuted(boolean z10, int i10);

    @Deprecated
    void setDeviceVolume(int i10);

    void setDeviceVolume(int i10, int i11);

    void setMediaItem(p0 p0Var);

    void setMediaItem(p0 p0Var, long j10);

    void setMediaItem(p0 p0Var, boolean z10);

    void setMediaItems(List<p0> list);

    void setMediaItems(List<p0> list, int i10, long j10);

    void setMediaItems(List<p0> list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setPlaybackParameters(c1 c1Var);

    void setPlaybackSpeed(float f10);

    void setPlaylistMetadata(s0 s0Var);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setTrackSelectionParameters(a2 a2Var);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();
}
