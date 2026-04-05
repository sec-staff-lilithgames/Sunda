package com.mbridge.msdk.playercommon;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.l0;
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
import com.moloco.sdk.BKC.JzVV;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class VideoFeedsPlayer implements Player.EventListener {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private SimpleExoPlayer exoPlayer;
    private Timer mBufferTimeoutTimer;
    private long mCurrentPosition;
    private View mFullScreenLoadingView;
    private volatile VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private volatile VideoPlayerStatusListener mOutterVFListener;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private MediaSource mediaSource;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private Runnable playProgressRunnable = new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.2
        @Override // java.lang.Runnable
        public void run() {
            long duration;
            String str = QFzuMMDfrzagDN.pKJOVYByb;
            try {
                if (VideoFeedsPlayer.this.exoPlayer == null || !VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                    return;
                }
                VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.exoPlayer.getCurrentPosition();
                float f10 = VideoFeedsPlayer.this.mCurrentPosition % 1000;
                int iRound = Math.round(VideoFeedsPlayer.this.mCurrentPosition / 1000.0f);
                p0.c(str, "currentPosition:" + iRound + " mCurrentPosition:" + VideoFeedsPlayer.this.mCurrentPosition);
                if (VideoFeedsPlayer.this.exoPlayer == null || VideoFeedsPlayer.this.exoPlayer.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = VideoFeedsPlayer.this.exoPlayer.getDuration() / 1000;
                    if (f10 > 0.0f && f10 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0 && iRound < 1 + duration) {
                    VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(iRound, (int) duration);
                }
                VideoFeedsPlayer.this.mIsComplete = false;
                if (!VideoFeedsPlayer.this.mIsBuffering) {
                    VideoFeedsPlayer.this.hideLoading();
                }
                VideoFeedsPlayer.this.mHandler.postDelayed(this, 1000L);
            } catch (Exception e10) {
                p0.b(str, e10.getMessage());
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
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingTimeOutOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingTimeOut(str);
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingTimeOut(str);
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
            j.a(94, this.mPlayUrl, str);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i10, final int i11) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i10, i11);
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i10, i11);
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
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
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void postOnPlayStartOnMainThread(final long j10) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        int i10 = (int) j10;
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i10);
                            } catch (Exception e10) {
                                p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i10);
                            } catch (Exception e11) {
                                p0.b(VideoFeedsPlayer.TAG, e11.getMessage());
                            }
                        }
                    }
                });
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void startBufferIngTimer(final String str) {
        postOnBufferingStarOnMainThread(str);
        if (!this.mIsNeedBufferingTimeout) {
            p0.b(TAG, "不需要缓冲超时功能");
            return;
        }
        cancelBufferTimeoutTimer();
        Timer timer = new Timer();
        this.mBufferTimeoutTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    if (VideoFeedsPlayer.this.mHasPrepare && !VideoFeedsPlayer.this.mIsBuffering) {
                        return;
                    }
                    p0.b(VideoFeedsPlayer.TAG, "缓冲超时");
                    VideoFeedsPlayer.this.postOnBufferingTimeOutOnMainThread(str);
                } catch (Exception e10) {
                    p0.b(VideoFeedsPlayer.TAG, e10.getMessage());
                }
            }
        }, this.mBufferTime * 1000);
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
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
            this.mIsSilent = true;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public boolean exoPlayerIsPlaying() {
        return this.exoPlayer.getPlaybackState() == 3 && this.exoPlayer.getPlayWhenReady();
    }

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
            if (view != null) {
                return view.getVisibility() == 0;
            }
            return false;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return false;
        }
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public int getDuration() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer == null) {
            return 0;
        }
        simpleExoPlayer.getDuration();
        return 0;
    }

    public float getVolume() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            return this.mLoadingView.get().getVisibility() == 0;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return false;
        }
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

    public boolean initPlayer(Context context, View view, String str, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (view == null) {
                p0.c(TAG, "loadingView is NULL");
                postOnPlayErrorOnMainThread(PlayerErrorConstant.MEDIAPLAYER_INIT_FAILED);
                return false;
            }
            this.mOutterVFListener = videoPlayerStatusListener;
            this.mLoadingView = new WeakReference<>(view);
            this.exoPlayer = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(context), new DefaultTrackSelector(), new DefaultLoadControl());
            this.mediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(context, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.exoPlayer.setRepeatMode(0);
            this.exoPlayer.prepare(this.mediaSource);
            this.exoPlayer.addListener(this);
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

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i10) {
        try {
            this.mCurrentPosition = i10;
            if (this.mHasPrepare) {
                return;
            }
            p0.a(TAG, "seekTo return mHasPrepare false");
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void onBufferingUpdate(int i10) {
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
            p0.b(TAG, "onError what: " + i10 + " extra: " + str);
            hideLoading();
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
        if (!this.mIsFrontDesk && "MIX 3".equalsIgnoreCase(l0.n()) && l0.s().equalsIgnoreCase("Xiaomi")) {
            return true;
        }
        this.mHasPrepare = false;
        postOnPlayErrorOnMainThread(str);
        return true;
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
            java.lang.String r2 = "VideoFeedsPlayer"
            com.google.android.gms.internal.play_billing.a.v(r1, r0, r2)
            int r4 = r4.type
            r3.onError(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.VideoFeedsPlayer.onPlayerError(com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException):void");
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
            startBufferIngTimer(PlayerErrorConstant.PLAYERING_TIMEOUT);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            p0.b(TAG, "onPlaybackStateChanged : Ended : PLAY ENDED");
            cancelPlayProgressTimer();
            onCompletion();
            return;
        }
        p0.b(TAG, "onPlaybackStateChanged : READY");
        this.mIsBuffering = false;
        hideLoading();
        postOnBufferinEndOnMainThread();
        onPrepared();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
    }

    public void onPrepared() {
        try {
            p0.c(TAG, "onPrepared:" + this.mHasPrepare);
            this.mHasPrepare = true;
            boolean z10 = this.mIsFrontDesk;
            if (!z10) {
                p0.b(TAG, "At background, Do not process");
                if (this.exoPlayer != null) {
                    pause();
                    return;
                }
                return;
            }
            if (z10) {
                hideLoading();
                SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
                if (simpleExoPlayer != null) {
                    this.mIsPlaying = true;
                    if (!this.isStart) {
                        postOnPlayStartOnMainThread(simpleExoPlayer.getDuration() / 1000);
                        p0.c(TAG, "onPlayStarted()，getCurrentPosition:" + this.exoPlayer.getCurrentPosition());
                        this.isStart = true;
                    }
                }
                postOnBufferinEndOnMainThread();
                startPlayProgressTimer();
                p0.c(TAG, "onPrepare mCurrentPosition:" + this.mCurrentPosition + " onPrepare mHasPrepare：" + this.mHasPrepare);
            }
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

    public void pause() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null && exoPlayerIsPlaying()) {
                p0.c(TAG, "pause isPalying:" + exoPlayerIsPlaying() + " mIsPlaying:" + this.mIsPlaying);
                hideLoading();
                this.exoPlayer.setPlayWhenReady(false);
                this.mIsPlaying = false;
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void play(String str, int i10) {
        try {
            synchronized (this.mLock) {
                try {
                    p0.b(TAG, "Start Play currentionPosition:" + this.mCurrentPosition);
                    if (i10 > 0) {
                        this.mCurrentPosition = i10;
                    }
                    if (TextUtils.isEmpty(str)) {
                        postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                        return;
                    }
                    this.mPlayUrl = str;
                    this.mHasPrepare = false;
                    this.mIsFrontDesk = true;
                    showLoading();
                    setDataSource();
                    p0.c(TAG, "mPlayUrl:" + this.mPlayUrl);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void prepare() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.mHasPrepare || (simpleExoPlayer = this.exoPlayer) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.mediaSource);
            this.mHasPrepare = true;
            this.mIsPlaying = false;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void releasePlayer() {
        try {
            p0.c(TAG, "release");
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.removeListener(this);
                this.exoPlayer.release();
                this.mInnerVFPLisener = null;
                this.mOutterVFListener = null;
            }
            hideLoading();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void seekTo(int i10) {
        long j10 = i10;
        try {
            this.mCurrentPosition = j10;
            if (!this.mHasPrepare) {
                p0.a(TAG, "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void setDataSource() {
        try {
            p0.c(TAG, "setDataSource");
            if (this.exoPlayer != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setDisplay(surfaceHolder);
                }
                this.mHasPrepare = false;
                this.exoPlayer.prepare(this.mediaSource);
                this.exoPlayer.setPlayWhenReady(true);
                startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.exoPlayer.getVideoComponent().setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            postOnPlayErrorOnMainThread(th2.toString());
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e10) {
                p0.b(TAG, e10.getMessage());
            }
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

    public void setPlaybackParams(float f10) {
        try {
            if (exoPlayerIsPlaying()) {
                this.exoPlayer.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.exoPlayer.setPlaybackParameters(new PlaybackParameters(f10));
                this.exoPlayer.stop();
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void start(boolean z10) {
        try {
            if (!this.mHasPrepare) {
                p0.c(TAG, "!mHasPrepare");
                return;
            }
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            showLoading();
            play();
            this.mIsPlaying = true;
            if (z10) {
                startPlayProgressTimer();
            }
            p0.c(TAG, "start");
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void stop() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null && exoPlayerIsPlaying()) {
                hideLoading();
                this.exoPlayer.stop();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void openSound() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.exoPlayer;
            if (simpleExoPlayer == null) {
                return;
            }
            simpleExoPlayer.setVolume(1.0f);
            this.mIsSilent = false;
        } catch (Exception e10) {
            p0.b(JzVV.VlXmMhf, e10.getMessage());
        }
    }

    public void start(int i10) {
        try {
            if (!this.mHasPrepare || this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            if (i10 > 0) {
                this.exoPlayer.seekTo(i10);
                play();
            } else {
                play();
                this.mIsPlaying = true;
                p0.c(TAG, "=========start 指定进度");
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_URL_ILLEGAL);
                        return;
                    }
                    this.mPlayUrl = str;
                    this.mHasPrepare = false;
                    this.mIsFrontDesk = true;
                    this.mSurfaceHolder = surfaceHolder;
                    showLoading();
                    setDataSource();
                    p0.c(TAG, "mPlayUrl:" + this.mPlayUrl);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.PLAY_CANNOT_PALY);
        }
    }

    public void play() {
        this.exoPlayer.setPlayWhenReady(true);
    }
}
