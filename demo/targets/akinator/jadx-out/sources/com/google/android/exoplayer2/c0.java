package com.google.android.exoplayer2;

import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c0 extends r2 {
    void addAnalyticsListener(zd.d dVar);

    void addAudioOffloadListener(t tVar);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void addListener(p2 p2Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void addMediaItem(int i10, u1 u1Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void addMediaItem(u1 u1Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void addMediaItems(int i10, List list);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i10, bf.f0 f0Var);

    void addMediaSource(bf.f0 f0Var);

    void addMediaSources(int i10, List<bf.f0> list);

    void addMediaSources(List<bf.f0> list);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(tf.a aVar);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(sf.l lVar);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void clearVideoSurface();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void clearVideoSurface(Surface surface);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void clearVideoTextureView(TextureView textureView);

    u2 createMessage(t2 t2Var);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void decreaseDeviceVolume();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void decreaseDeviceVolume(int i10);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z10);

    zd.a getAnalyticsCollector();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ Looper getApplicationLooper();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ com.google.android.exoplayer2.audio.k getAudioAttributes();

    @Deprecated
    s getAudioComponent();

    ce.f getAudioDecoderCounters();

    z0 getAudioFormat();

    int getAudioSessionId();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ n2 getAvailableCommands();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getBufferedPercentage();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getBufferedPosition();

    com.google.android.exoplayer2.util.d getClock();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getContentBufferedPosition();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getContentDuration();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getContentPosition();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ ef.e getCurrentCues();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getCurrentLiveOffset();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ Object getCurrentManifest();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ u1 getCurrentMediaItem();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getCurrentPosition();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ m3 getCurrentTimeline();

    @Deprecated
    bf.n1 getCurrentTrackGroups();

    @Deprecated
    pf.p getCurrentTrackSelections();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ n3 getCurrentTracks();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Deprecated
    z getDeviceComponent();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ q getDeviceInfo();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getDeviceVolume();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getDuration();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getMaxSeekToPreviousPosition();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ u1 getMediaItemAt(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getMediaItemCount();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ w1 getMediaMetadata();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getNextMediaItemIndex();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ l2 getPlaybackParameters();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getPlaybackState();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // com.google.android.exoplayer2.r2
    r getPlayerError();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ w1 getPlaylistMetadata();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getPreviousMediaItemIndex();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    z2 getRenderer(int i10);

    int getRendererCount();

    int getRendererType(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ int getRepeatMode();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getSeekBackIncrement();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getSeekForwardIncrement();

    e3 getSeekParameters();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ com.google.android.exoplayer2.util.a1 getSurfaceSize();

    @Deprecated
    a0 getTextComponent();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ long getTotalBufferedDuration();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ pf.s getTrackSelectionParameters();

    pf.w getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    b0 getVideoComponent();

    ce.f getVideoDecoderCounters();

    z0 getVideoFormat();

    int getVideoScalingMode();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ sf.x getVideoSize();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ float getVolume();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean hasNextMediaItem();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean hasPrevious();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean hasPreviousMediaItem();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void increaseDeviceVolume();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void increaseDeviceVolume(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isCommandAvailable(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isDeviceMuted();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isLoading();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isPlaying();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ boolean isPlayingAd();

    boolean isTunnelingEnabled();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void moveMediaItem(int i10, int i11);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void next();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void pause();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void play();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(bf.f0 f0Var);

    @Deprecated
    void prepare(bf.f0 f0Var, boolean z10, boolean z11);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void previous();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void release();

    void removeAnalyticsListener(zd.d dVar);

    void removeAudioOffloadListener(t tVar);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void removeListener(p2 p2Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void removeMediaItem(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void removeMediaItems(int i10, int i11);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void replaceMediaItem(int i10, u1 u1Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void replaceMediaItems(int i10, int i11, List list);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekBack();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekForward();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekTo(int i10, long j10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekTo(long j10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekToDefaultPosition();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekToDefaultPosition(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekToNext();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekToNextMediaItem();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekToPrevious();

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void seekToPreviousMediaItem();

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    void setAudioAttributes(com.google.android.exoplayer2.audio.k kVar, boolean z10);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(com.google.android.exoplayer2.audio.l0 l0Var);

    void setCameraMotionListener(tf.a aVar);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void setDeviceMuted(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setDeviceMuted(boolean z10, int i10);

    @Override // com.google.android.exoplayer2.r2
    @Deprecated
    /* synthetic */ void setDeviceVolume(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setDeviceVolume(int i10, int i11);

    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setMediaItem(u1 u1Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setMediaItem(u1 u1Var, long j10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setMediaItem(u1 u1Var, boolean z10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setMediaItems(List list);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setMediaItems(List list, int i10, long j10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setMediaItems(List list, boolean z10);

    void setMediaSource(bf.f0 f0Var);

    void setMediaSource(bf.f0 f0Var, long j10);

    void setMediaSource(bf.f0 f0Var, boolean z10);

    void setMediaSources(List<bf.f0> list);

    void setMediaSources(List<bf.f0> list, int i10, long j10);

    void setMediaSources(List<bf.f0> list, boolean z10);

    void setPauseAtEndOfMediaItems(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setPlaybackParameters(l2 l2Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setPlaybackSpeed(float f10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setPlaylistMetadata(w1 w1Var);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(com.google.android.exoplayer2.util.x0 x0Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setRepeatMode(int i10);

    void setSeekParameters(e3 e3Var);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setShuffleModeEnabled(boolean z10);

    void setShuffleOrder(bf.f1 f1Var);

    void setSkipSilenceEnabled(boolean z10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setTrackSelectionParameters(pf.s sVar);

    void setVideoChangeFrameRateStrategy(int i10);

    void setVideoEffects(List<com.google.android.exoplayer2.util.l> list);

    void setVideoFrameMetadataListener(sf.l lVar);

    void setVideoScalingMode(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setVideoSurface(Surface surface);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setVideoTextureView(TextureView textureView);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void setVolume(float f10);

    void setWakeMode(int i10);

    @Override // com.google.android.exoplayer2.r2
    /* synthetic */ void stop();
}
