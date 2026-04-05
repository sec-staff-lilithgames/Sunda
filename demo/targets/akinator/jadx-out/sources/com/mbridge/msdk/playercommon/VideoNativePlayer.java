package com.mbridge.msdk.playercommon;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.webkit.URLUtil;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class VideoNativePlayer implements Player.EventListener {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final int INTERVAL_TIME_PLAY_TIME_PROGRESS = 100;
    public static final String TAG = "VideoNativePlayer";
    private SimpleExoPlayer exoPlayer;
    private Timer mBufferTimeoutTimer;
    private long mCurrentPosition;
    private VideoPlayerStatusListener mInnerVFPLisener;
    private View mLoadingView;
    private String mNetUrl;
    private VideoPlayerStatusListener mOutterVFListener;
    private String mPlayUrl;
    private Surface mSurfaceHolder;
    private MediaSource mediaSource;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsStartPlay = true;
    private boolean mIsAllowLoopPlay = true;
    private boolean mHasChaoDi = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private boolean mIsOpenSound = true;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private Runnable playProgressRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VideoNativePlayer.this.exoPlayer == null || !VideoNativePlayer.this.exoPlayerIsPlaying()) {
                    return;
                }
                VideoNativePlayer videoNativePlayer = VideoNativePlayer.this;
                videoNativePlayer.mCurrentPosition = videoNativePlayer.exoPlayer.getCurrentPosition();
                int i10 = (int) (VideoNativePlayer.this.mCurrentPosition / 1000);
                p0.c(VideoNativePlayer.TAG, "currentPosition:" + i10 + " mCurrentPosition:" + VideoNativePlayer.this.mCurrentPosition);
                int duration = (VideoNativePlayer.this.exoPlayer == null || VideoNativePlayer.this.exoPlayer.getDuration() <= 0) ? 0 : (int) (VideoNativePlayer.this.exoPlayer.getDuration() / 1000);
                if (VideoNativePlayer.this.mIsStartPlay) {
                    VideoNativePlayer.this.postOnPlayStartOnMainThread(duration);
                    p0.c(VideoNativePlayer.TAG, "onPlayStarted()");
                    VideoNativePlayer.this.mIsStartPlay = false;
                }
                if (i10 >= 0 && duration > 0 && VideoNativePlayer.this.exoPlayerIsPlaying()) {
                    VideoNativePlayer.this.postOnPlayProgressOnMainThread(i10, duration);
                }
                VideoNativePlayer.this.mIsComplete = false;
                if (!VideoNativePlayer.this.mIsBuffering) {
                    VideoNativePlayer.this.hideLoading();
                }
                VideoNativePlayer.this.mHandler.postDelayed(this, 1000L);
            } catch (Exception e10) {
                p0.b(VideoNativePlayer.TAG, e10.getMessage());
            }
        }
    };
    private Runnable playProgressMSRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.3
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VideoNativePlayer.this.exoPlayer == null || !VideoNativePlayer.this.exoPlayerIsPlaying()) {
                    return;
                }
                VideoNativePlayer videoNativePlayer = VideoNativePlayer.this;
                videoNativePlayer.mCurrentPosition = videoNativePlayer.exoPlayer.getCurrentPosition();
                long j10 = VideoNativePlayer.this.mCurrentPosition / 100;
                long duration = (VideoNativePlayer.this.exoPlayer == null || VideoNativePlayer.this.exoPlayer.getDuration() <= 0) ? 0L : VideoNativePlayer.this.exoPlayer.getDuration() / 100;
                if (j10 >= 0 && duration > 0 && VideoNativePlayer.this.exoPlayerIsPlaying()) {
                    VideoNativePlayer videoNativePlayer2 = VideoNativePlayer.this;
                    videoNativePlayer2.postOnPlayProgressMSOnMainThread(videoNativePlayer2.mCurrentPosition / 100, duration);
                }
                VideoNativePlayer.this.mHandler.postDelayed(this, 100L);
            } catch (Exception e10) {
                p0.b(VideoNativePlayer.TAG, e10.getMessage());
            }
        }
    };

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            this.mHandler.removeCallbacks(this.playProgressRunnable);
            this.mHandler.removeCallbacks(this.playProgressMSRunnable);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.6
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoNativePlayer.this.mLoadingView != null) {
                        VideoNativePlayer.this.mLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onBufferingEnd();
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onBufferingEnd();
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onBufferingStart(str);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onBufferingStart(str);
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.14
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayCompleted();
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayCompleted();
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayError(str);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayError(str);
                        }
                    }
                });
            }
            j.a(42, this.mPlayUrl, str);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressMSOnMainThread(final long j10, final long j11) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayProgressMS((int) j10, (int) j11);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayProgressMS((int) j10, (int) j11);
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i10, final int i11) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayProgress(i10, i11);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayProgress(i10, i11);
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                        }
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayStartOnMainThread(final int i10) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoNativePlayer.this.mOutterVFListener != null) {
                            VideoNativePlayer.this.mOutterVFListener.onPlayStarted(i10);
                        }
                        if (VideoNativePlayer.this.mInnerVFPLisener != null) {
                            VideoNativePlayer.this.mInnerVFPLisener.onPlayStarted(i10);
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void startBufferingTimer(final String str) {
        if (!this.mIsNeedBufferingTimeout) {
            p0.b(TAG, "不需要缓冲超时功能");
            return;
        }
        cancelBufferTimeoutTimer();
        Timer timer = new Timer();
        this.mBufferTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    if (VideoNativePlayer.this.mHasPrepare && !VideoNativePlayer.this.mIsBuffering) {
                        return;
                    }
                    p0.b(VideoNativePlayer.TAG, "缓冲超时");
                    VideoNativePlayer.this.postOnBufferingStarOnMainThread(str);
                } catch (Exception e10) {
                    p0.b(VideoNativePlayer.TAG, e10.getMessage());
                }
            }
        }, this.mBufferTime * 1000);
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
            this.mHandler.post(this.playProgressMSRunnable);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void closeSound() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer == null) {
                return;
            }
            simpleExoPlayer.setVolume(0.0f);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public boolean exoPlayerIsPlaying() {
        return this.exoPlayer.getPlaybackState() == 3 && this.exoPlayer.getPlayWhenReady();
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i10) {
        if (i10 > 0) {
            this.mBufferTime = i10;
        }
        this.mIsNeedBufferingTimeout = true;
        p0.c(TAG, "mIsNeedBufferingTimeout:" + this.mIsNeedBufferingTimeout + "  mMaxBufferTime:" + this.mBufferTime);
    }

    public boolean initParameter(String str, boolean z10, boolean z11, View view, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                p0.c(TAG, "netUrl为空 return");
                postOnPlayErrorOnMainThread(PlayerErrorConstant.MEDIAPLAYER_INIT_FAILED);
                return false;
            }
            if (view == null) {
                p0.c(TAG, "loadingView为空 return");
                postOnPlayErrorOnMainThread(PlayerErrorConstant.MEDIAPLAYER_INIT_FAILED);
                return false;
            }
            this.mIsOpenSound = z10;
            this.mIsAllowLoopPlay = z11;
            this.mLoadingView = view;
            this.mNetUrl = str;
            this.mOutterVFListener = videoPlayerStatusListener;
            return true;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            postOnPlayErrorOnMainThread(th2.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            if (this.exoPlayer != null) {
                return exoPlayerIsPlaying();
            }
            return false;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        return exoPlayerIsPlaying();
    }

    public void onCompletion() {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0L;
            hideLoading();
            postOnPlayCompletedOnMainThread();
            p0.c(TAG, "======onCompletion");
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public boolean onError(int i10, String str) {
        try {
            p0.b(TAG, "onError what:" + i10 + " extra:" + str);
            hideLoading();
            this.mHasPrepare = false;
            this.mIsPlaying = false;
            postOnPlayErrorOnMainThread(str);
            return true;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        p0.b(TAG, "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPlayerError(com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L16
            int r0 = r4.type
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 2
            if (r0 == r1) goto Ld
            goto L16
        Ld:
            java.lang.String r0 = "Play error, because have a UnexpectedException."
            goto L18
        L10:
            java.lang.String r0 = "Play error, because have a RendererException."
            goto L18
        L13:
            java.lang.String r0 = "Play error, because have a SourceException."
            goto L18
        L16:
            java.lang.String r0 = "Play error and ExoPlayer have not message."
        L18:
            java.lang.Throwable r1 = r4.getCause()
            if (r1 == 0) goto L34
            java.lang.Throwable r1 = r4.getCause()
            java.lang.String r1 = r1.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L34
            java.lang.Throwable r0 = r4.getCause()
            java.lang.String r0 = r0.getMessage()
        L34:
            java.lang.String r1 = "onPlayerError : "
            java.lang.String r2 = "VideoNativePlayer"
            com.google.android.gms.internal.play_billing.a.v(r1, r0, r2)
            int r4 = r4.type
            r3.onError(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.VideoNativePlayer.onPlayerError(com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException):void");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        p0.b(TAG, "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            p0.b(TAG, "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            p0.b(TAG, "onPlaybackStateChanged : Buffering");
            this.mIsBuffering = true;
            showLoading();
            startBufferingTimer(PlayerErrorConstant.PLAYERING_TIMEOUT);
            return;
        }
        if (i10 == 3) {
            p0.b(TAG, "onPlaybackStateChanged : READY");
            this.mIsBuffering = false;
            hideLoading();
            postOnBufferinEndOnMainThread();
            onPrepared();
            return;
        }
        if (i10 != 4) {
            return;
        }
        p0.b(TAG, "onPlaybackStateChanged : Ended : PLAY ENDED");
        cancelPlayProgressTimer();
        onCompletion();
        if (this.mIsAllowLoopPlay) {
            return;
        }
        this.mHasPrepare = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
        p0.b(TAG, "onPositionDiscontinuity : " + i10);
        if (i10 == 0) {
            onCompletion();
        }
    }

    public void onPrepared() {
        try {
            p0.c(TAG, "onPrepared:" + this.mHasPrepare);
            if (!this.mIsFrontDesk) {
                p0.b(TAG, "At background, Do not process");
                return;
            }
            this.mHasPrepare = true;
            postOnBufferinEndOnMainThread();
            startPlayProgressTimer();
            if (this.exoPlayer != null) {
                this.mIsPlaying = true;
            }
            p0.c(TAG, "onprepare mCurrentPosition:" + this.mCurrentPosition + " mHasPrepare：" + this.mHasPrepare);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void openSound() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer == null) {
                return;
            }
            simpleExoPlayer.setVolume(1.0f);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void pause() {
        try {
            p0.c(TAG, "player pause");
            if (!this.mHasPrepare) {
                p0.c(TAG, "pause !mHasPrepare retrun");
                return;
            }
            if (this.exoPlayer == null || !exoPlayerIsPlaying()) {
                return;
            }
            p0.c(TAG, "pause " + this.mIsPlaying);
            hideLoading();
            this.exoPlayer.setPlayWhenReady(false);
            this.mIsPlaying = false;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void play(Context context, String str, int i10) {
        try {
            p0.b(TAG, "进来播放 currentionPosition:" + this.mCurrentPosition);
            this.mCurrentPosition = (long) i10;
            if (TextUtils.isEmpty(str)) {
                postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                return;
            }
            showLoading();
            this.mPlayUrl = str;
            this.mHasPrepare = false;
            this.mIsFrontDesk = true;
            setDataSource(context);
            p0.c(TAG, "mPlayUrl:" + this.mPlayUrl);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void replaySameSource(Context context, String str, Surface surface) {
        MediaSource mediaSource;
        try {
            showLoading();
            this.mHasPrepare = false;
            this.mIsFrontDesk = true;
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer == null || (mediaSource = this.mediaSource) == null) {
                play(context, str, surface);
            } else {
                simpleExoPlayer.prepare(mediaSource);
                this.exoPlayer.setPlayWhenReady(true);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void setDataSource(Context context) {
        try {
            p0.c(TAG, "setDataSource begin");
            if (this.exoPlayer != null) {
                try {
                    if (exoPlayerIsPlaying()) {
                        this.exoPlayer.stop();
                    }
                    this.exoPlayer.release();
                } catch (Throwable th2) {
                    p0.b(TAG, th2.getMessage());
                }
            }
            if (!this.mIsOpenSound) {
                closeSound();
            }
            if (!TextUtils.isEmpty(this.mPlayUrl)) {
                this.exoPlayer = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(context), new DefaultTrackSelector(), new DefaultLoadControl());
                Uri uri = Uri.parse(this.mPlayUrl);
                if (this.mPlayUrl.startsWith("http") || this.mPlayUrl.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                    this.mediaSource = new ExtractorMediaSource.Factory(new DefaultHttpDataSourceFactory("MBridge_ExoPlayer")).createMediaSource(uri);
                } else {
                    this.mediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(context, "MBridge_ExoPlayer")).createMediaSource(uri);
                }
                this.exoPlayer.setRepeatMode(this.mIsAllowLoopPlay ? 2 : 0);
                this.exoPlayer.prepare(this.mediaSource);
                this.exoPlayer.setPlayWhenReady(true);
                this.exoPlayer.addListener(this);
            }
            Surface surface = this.mSurfaceHolder;
            if (surface != null) {
                this.exoPlayer.setVideoSurface(surface);
            }
            startBufferingTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
            p0.c(TAG, "setDataSource done");
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            hideLoading();
            if (URLUtil.isNetworkUrl(this.mPlayUrl)) {
                p0.c(TAG, "setDataSource error : Is Online source : " + this.mNetUrl);
                postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
                postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.SET_DATA_SOURCE_ERROR);
            } else if (TextUtils.isEmpty(this.mNetUrl) || this.mHasChaoDi) {
                postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
            } else {
                this.mHasChaoDi = true;
                p0.c(TAG, "setDataSource error : Will play online source : " + this.mNetUrl);
                this.mPlayUrl = this.mNetUrl;
                showLoading();
                setDataSource(context);
            }
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.SET_DATA_SOURCE_ERROR);
        }
    }

    public void setIsComplete(boolean z10) {
        this.mIsComplete = z10;
    }

    public void setIsFrontDesk(boolean z10) {
        try {
            this.mIsFrontDesk = z10;
            p0.b(TAG, "isFrontDesk: ".concat(z10 ? "frontStage" : "backStage"));
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoNativePlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoNativePlayer.this.mLoadingView != null) {
                        VideoNativePlayer.this.mLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void start() {
        start((Surface) null);
    }

    public void stop() {
        try {
            if (!this.mHasPrepare) {
                p0.c(TAG, "stop !mHasPrepare retrun");
                return;
            }
            if (this.exoPlayer == null || !exoPlayerIsPlaying()) {
                return;
            }
            hideLoading();
            this.exoPlayer.stop();
            cancelPlayProgressTimer();
            this.mIsPlaying = false;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public boolean loadingViewIsVisible() {
        try {
            View view = this.mLoadingView;
            if (view != null) {
                return view.getVisibility() == 0;
            }
            return false;
        } catch (Throwable th2) {
            p0.b(PtLatqAYjEFT.qszbkbwJpe, th2.getMessage());
            return false;
        }
    }

    public void releasePlayer() {
        String str = KGUkpTlXZlJLy.JPoT;
        try {
            p0.c(str, "releasePlayer");
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.removeListener(this);
                this.exoPlayer.release();
                this.exoPlayer = null;
                this.mIsPlaying = false;
            }
            if (this.mOutterVFListener != null) {
                this.mOutterVFListener = null;
            }
        } catch (Throwable th2) {
            p0.b(str, th2.getMessage(), th2);
        }
        hideLoading();
    }

    public void start(Surface surface) {
        try {
            if (!this.mHasPrepare) {
                p0.c(TAG, "start !mHasPrepare retrun");
                return;
            }
            boolean z10 = true;
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                StringBuilder sb2 = new StringBuilder("exoplayer is null : ");
                if (this.exoPlayer != null) {
                    z10 = false;
                }
                sb2.append(z10);
                p0.c(TAG, sb2.toString());
                return;
            }
            showLoading();
            if (surface != null) {
                this.mSurfaceHolder = surface;
                this.exoPlayer.setVideoSurface(surface);
            }
            play();
            startPlayProgressTimer();
            this.mIsPlaying = true;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void start(int i10) {
        try {
            if (!this.mHasPrepare) {
                p0.c(TAG, "start mHasprepare is false return");
                return;
            }
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            if (i10 > 0) {
                this.exoPlayer.seekTo(i10);
            }
            play();
            startPlayProgressTimer();
            this.mIsPlaying = true;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void play(Context context, String str, Surface surface) {
        try {
            if (TextUtils.isEmpty(str)) {
                postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                return;
            }
            showLoading();
            this.mPlayUrl = str;
            this.mHasPrepare = false;
            this.mIsFrontDesk = true;
            this.mSurfaceHolder = surface;
            setDataSource(context);
            p0.c(TAG, "mPlayUrl:" + this.mPlayUrl);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void play() {
        try {
            this.exoPlayer.setPlayWhenReady(true);
            startPlayProgressTimer();
            this.mIsPlaying = true;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }
}
