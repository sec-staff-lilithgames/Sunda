package com.mbridge.msdk.dycreator.baseview.videoview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ConcatenatingMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBVideoView extends FrameLayout implements Player.EventListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f40093a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40094b;

    /* renamed from: c, reason: collision with root package name */
    private ExoPlayer f40095c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40096d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f40097e;

    /* renamed from: f, reason: collision with root package name */
    private VideoViewEventListener f40098f;

    /* renamed from: g, reason: collision with root package name */
    private final SurfaceHolder.Callback f40099g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f40100h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f40101i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBVideoView f40102a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40102a.f40098f != null) {
                this.f40102a.f40098f.onBufferingFail("Buffering timeout");
            }
        }
    }

    public MBVideoView(Context context) {
        super(context);
        this.f40093a = "MBVideoView";
        this.f40094b = 1000;
        this.f40096d = 5000L;
        this.f40099g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f40095c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    p0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        };
        this.f40100h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f40098f != null) {
                    MBVideoView.this.f40098f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f40101i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f40095c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f40095c.getCurrentPosition();
                    long duration = MBVideoView.this.f40095c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    p0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f40098f != null) {
                        MBVideoView.this.f40098f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    p0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.f40095c;
        return exoPlayer != null && exoPlayer.getPlaybackState() == 3 && this.f40095c.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        p0.b("MBVideoView", "onPlaybackParametersChanged : " + playbackParameters.speed);
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
            java.lang.String r2 = "MBVideoView"
            com.google.android.gms.internal.play_billing.a.v(r1, r0, r2)
            com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener r1 = r3.f40098f
            if (r1 == 0) goto L44
            int r4 = r4.type
            r1.onPlayerError(r4, r0)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.onPlayerError(com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException):void");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        p0.b("MBVideoView", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            p0.b("MBVideoView", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            p0.b("MBVideoView", "onPlaybackStateChanged : Buffering");
        } else if (i10 == 3) {
            p0.b("MBVideoView", "onPlaybackStateChanged : READY");
        } else {
            if (i10 != 4) {
                return;
            }
            p0.b("MBVideoView", "onPlaybackStateChanged : Ended : PLAY ENDED");
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
        this.f40095c.getCurrentWindowIndex();
    }

    public void setVideoUrl(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f40097e = strArr;
        a();
    }

    public void setVideoViewEventLister(VideoViewEventListener videoViewEventListener) {
        this.f40098f = videoViewEventListener;
    }

    private void a() {
        try {
            this.f40095c = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(getContext()), new DefaultTrackSelector(), new DefaultLoadControl());
            ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource();
            for (String str : this.f40097e) {
                concatenatingMediaSource.addMediaSource(new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(getContext(), "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str)));
            }
            this.f40095c.setRepeatMode(0);
            this.f40095c.prepare(concatenatingMediaSource);
            this.f40095c.addListener(this);
        } catch (Throwable th2) {
            p0.b("MBVideoView", th2.getMessage());
            th2.toString();
        }
    }

    public MBVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40093a = "MBVideoView";
        this.f40094b = 1000;
        this.f40096d = 5000L;
        this.f40099g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f40095c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    p0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        };
        this.f40100h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f40098f != null) {
                    MBVideoView.this.f40098f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f40101i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f40095c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f40095c.getCurrentPosition();
                    long duration = MBVideoView.this.f40095c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    p0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f40098f != null) {
                        MBVideoView.this.f40098f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    p0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public MBVideoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40093a = "MBVideoView";
        this.f40094b = 1000;
        this.f40096d = 5000L;
        this.f40099g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f40095c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    p0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i102, int i11, int i12) {
            }
        };
        this.f40100h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f40098f != null) {
                    MBVideoView.this.f40098f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f40101i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f40095c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f40095c.getCurrentPosition();
                    long duration = MBVideoView.this.f40095c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    p0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f40098f != null) {
                        MBVideoView.this.f40098f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    p0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    public void pause() {
    }

    public void play() {
    }

    public void stop() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    public MBVideoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f40093a = "MBVideoView";
        this.f40094b = 1000;
        this.f40096d = 5000L;
        this.f40099g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f40095c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    p0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i102, int i112, int i12) {
            }
        };
        this.f40100h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f40098f != null) {
                    MBVideoView.this.f40098f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f40101i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f40095c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f40095c.getCurrentPosition();
                    long duration = MBVideoView.this.f40095c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    p0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f40098f != null) {
                        MBVideoView.this.f40098f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    p0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i10) {
    }
}
