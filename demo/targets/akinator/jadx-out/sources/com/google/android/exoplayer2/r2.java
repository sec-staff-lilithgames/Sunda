package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface r2 {
    void addListener(p2 p2Var);

    void addMediaItem(int i10, u1 u1Var);

    void addMediaItem(u1 u1Var);

    void addMediaItems(int i10, List<u1> list);

    void addMediaItems(List<u1> list);

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

    com.google.android.exoplayer2.audio.k getAudioAttributes();

    n2 getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    ef.e getCurrentCues();

    long getCurrentLiveOffset();

    Object getCurrentManifest();

    u1 getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    m3 getCurrentTimeline();

    n3 getCurrentTracks();

    @Deprecated
    int getCurrentWindowIndex();

    q getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    u1 getMediaItemAt(int i10);

    int getMediaItemCount();

    w1 getMediaMetadata();

    int getNextMediaItemIndex();

    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    l2 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    j2 getPlayerError();

    w1 getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    com.google.android.exoplayer2.util.a1 getSurfaceSize();

    long getTotalBufferedDuration();

    pf.s getTrackSelectionParameters();

    sf.x getVideoSize();

    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @Deprecated
    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @Deprecated
    boolean hasPreviousWindow();

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

    @Deprecated
    void previous();

    void release();

    void removeListener(p2 p2Var);

    void removeMediaItem(int i10);

    void removeMediaItems(int i10, int i11);

    void replaceMediaItem(int i10, u1 u1Var);

    void replaceMediaItems(int i10, int i11, List<u1> list);

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

    @Deprecated
    void setDeviceMuted(boolean z10);

    void setDeviceMuted(boolean z10, int i10);

    @Deprecated
    void setDeviceVolume(int i10);

    void setDeviceVolume(int i10, int i11);

    void setMediaItem(u1 u1Var);

    void setMediaItem(u1 u1Var, long j10);

    void setMediaItem(u1 u1Var, boolean z10);

    void setMediaItems(List<u1> list);

    void setMediaItems(List<u1> list, int i10, long j10);

    void setMediaItems(List<u1> list, boolean z10);

    void setPlayWhenReady(boolean z10);

    void setPlaybackParameters(l2 l2Var);

    void setPlaybackSpeed(float f10);

    void setPlaylistMetadata(w1 w1Var);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setTrackSelectionParameters(pf.s sVar);

    void setVideoSurface(Surface surface);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f10);

    void stop();
}
