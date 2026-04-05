package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a1;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b8;
import com.applovin.impl.h7;
import com.applovin.impl.k7;
import com.applovin.impl.l7;
import com.applovin.impl.o0;
import com.applovin.impl.q7;
import com.applovin.impl.r0;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.v4;
import com.applovin.impl.v7;
import com.applovin.impl.w7;
import com.applovin.impl.x7;
import com.applovin.impl.z7;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final a1 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private boolean isViewAttached;
    private int lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.b lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private MediaPlayer mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final l7 vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<v7> videoProgressTrackers;
    private final e videoUiEventHandler;
    private final AppLovinVideoView videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements a1.b {
        public b() {
        }

        @Override // com.applovin.impl.a1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.videoView.getDuration() - AppLovinVastMediaView.this.videoView.getCurrentPosition()));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                v7 v7Var = (v7) it.next();
                if (v7Var.a(seconds, videoPercentViewed)) {
                    hashSet.add(v7Var);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(v7Var);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.a1.b
        public boolean b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriC;
            r7 r7VarX1 = AppLovinVastMediaView.this.vastAd.x1();
            if (r7VarX1 == null || (uriC = r7VarX1.c()) == null) {
                return;
            }
            o oVar = AppLovinVastMediaView.this.logger;
            if (o.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriC);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(l7.d.INDUSTRY_ICON_CLICK);
            h7.a(uriC, view.getContext(), AppLovinVastMediaView.this.sdk);
        }

        public /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements AppLovinTouchToClickListener.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinNativeAdImpl f15551a;

        public d(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f15551a = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri uriM0;
            AppLovinVastMediaView.this.maybeFireTrackers(l7.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (AppLovinVastMediaView.this.vastAd.N0() && (uriM0 = AppLovinVastMediaView.this.vastAd.m0()) != null) {
                o oVar = AppLovinVastMediaView.this.logger;
                if (o.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.k().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.b(motionEvent, false));
                this.f15551a.handleNativeAdClick(uriM0, null, motionEvent, (!((Boolean) AppLovinVastMediaView.this.sdk.a(v4.f16063x)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener {
        private e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            o oVar = AppLovinVastMediaView.this.logger;
            if (o.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Video completed");
            }
            AppLovinVastMediaView.this.videoWasCompleted = true;
            AppLovinVastMediaView.this.finishVideo();
            if (AppLovinVastMediaView.this.replayIconContainer != null) {
                b8.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new com.applovin.impl.sdk.nativeAd.d(this, 0));
            } else {
                AppLovinVastMediaView.this.showMediaImageView();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            AppLovinVastMediaView.this.handleMediaError(o2.i(i10, i11, "Video view error (", ",", ")"));
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            if (i10 != 3) {
                return false;
            }
            AppLovinVastMediaView.this.countdownManager.b();
            if (AppLovinVastMediaView.this.isViewAttached) {
                return false;
            }
            AppLovinVastMediaView.this.pauseVideo();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinVastMediaView.this.mediaPlayer = mediaPlayer;
            AppLovinVastMediaView.this.mediaPlayer.setOnInfoListener(AppLovinVastMediaView.this.videoUiEventHandler);
            AppLovinVastMediaView.this.mediaPlayer.setOnErrorListener(AppLovinVastMediaView.this.videoUiEventHandler);
            float f10 = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
            AppLovinVastMediaView.this.mediaPlayer.setVolume(f10, f10);
            AppLovinVastMediaView.this.videoDurationMillis = r4.mediaPlayer.getDuration();
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), k7.e(AppLovinVastMediaView.this.sdk));
            o oVar = AppLovinVastMediaView.this.logger;
            if (o.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            if (AppLovinVastMediaView.this.isViewAttached) {
                AppLovinVastMediaView.this.videoView.start();
            }
        }

        public /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoView.seekTo(0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.videoView.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == AppLovinVastMediaView.this.replayIconContainer) {
                    b8.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new com.applovin.impl.sdk.nativeAd.d(this, 1));
                }
            } else {
                if (AppLovinVastMediaView.this.mediaPlayer == null) {
                    return;
                }
                try {
                    AppLovinVastMediaView.this.isVideoMuted = !r4.isVideoMuted;
                    float f10 = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
                    AppLovinVastMediaView.this.mediaPlayer.setVolume(f10, f10);
                    AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                    appLovinVastMediaView.populateMuteImage(appLovinVastMediaView.isVideoMuted);
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(appLovinNativeAdImpl, kVar, context);
        a aVar = null;
        e eVar = new e(this, aVar);
        this.videoUiEventHandler = eVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new a1(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        l7 vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zO0 = vastAd.O0();
        this.isVideoStream = zO0;
        if (zO0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.D1()) {
            this.industryIconImageView = r7.a(vastAd.x1().e(), context, kVar);
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(v4.M4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) kVar.a(v4.O4)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, aVar));
            addView(this.industryIconImageView);
        }
        if (((Boolean) kVar.a(v4.T4)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            int iDpToPx2 = 0;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) kVar.a(v4.S4)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, aVar);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(v4.Q4)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(v4.P4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            }
            int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(v4.R4)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i10 = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3 + iDpToPx2 + i10, Math.max(iDpToPx3, iDpToPx2) + i10, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) kVar.a(v4.U4)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, aVar));
            ImageView imageView2 = new ImageView(getContext());
            int iDpToPx5 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(v4.V4)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(getContext());
        this.videoView = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, v4.f15944i0, getContext(), new d(appLovinNativeAdImpl)));
        addView(appLovinVideoView);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(appLovinVideoView);
        hashSet.addAll(vastAd.a(l7.d.VIDEO, w7.f16154a));
    }

    private void checkCachedAdResourcesImmediately(boolean z10) {
        if (k7.a(z10, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(l7.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.k().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        int currentPosition = this.videoView.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (o.a()) {
            this.logger.b(TAG, str);
        }
        maybeFireTrackers(l7.d.ERROR, q7.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.E().a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (o.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.p0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<v7> set) {
        maybeFireTrackers(set, q7.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.D1()) {
                maybeFireTrackers(l7.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(l7.d.IMPRESSION);
            maybeFireTrackers(l7.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.k().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.d.a(b8.b(this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            this.videoView.start();
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(l7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(l7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (o.a()) {
                    this.logger.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.videoView.start();
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (o.a()) {
                this.logger.a(TAG, "Invalid last video position");
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseVideo() {
        if (o.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.videoView.getCurrentPosition();
        this.videoView.pause();
        this.countdownManager.c();
        if (o.a()) {
            this.logger.a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z10) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (o0.e()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z10 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        Uri uriQ = z10 ? this.vastAd.Q() : this.vastAd.i0();
        if (uriQ == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, uriQ, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z10) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z10 ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        checkCachedAdResourcesImmediately(!this.isVideoStream);
        this.videoView.setVideoURI(this.vastAd.v0());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
            this.videoView.stopPlayback();
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isViewAttached = true;
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isViewAttached = false;
        maybeHandlePause();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !r0.a(i10)) || this.videoWasCompleted || this.videoView.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(l7.d dVar) {
        maybeFireTrackers(dVar, q7.UNSPECIFIED);
    }

    private void maybeFireTrackers(l7.d dVar, String str) {
        maybeFireTrackers(dVar, str, q7.UNSPECIFIED);
    }

    private void maybeFireTrackers(l7.d dVar, q7 q7Var) {
        maybeFireTrackers(dVar, "", q7Var);
    }

    private void maybeFireTrackers(l7.d dVar, String str, q7 q7Var) {
        maybeFireTrackers((Set<v7>) this.vastAd.a(dVar, str), q7Var);
    }

    private void maybeFireTrackers(Set<v7> set, q7 q7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        z7 z7VarC1 = this.vastAd.C1();
        Uri uriD = z7VarC1 != null ? z7VarC1.d() : null;
        if (o.a()) {
            this.logger.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        x7.a(set, seconds, uriD, q7Var, this.sdk);
    }
}
