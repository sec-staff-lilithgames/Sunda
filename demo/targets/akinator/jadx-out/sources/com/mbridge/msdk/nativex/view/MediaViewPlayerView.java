package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler L = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a F;
    private VideoNativePlayer G;
    private h H;
    private AdSession I;
    private MediaEvents J;
    private boolean K;

    /* renamed from: a, reason: collision with root package name */
    private boolean f42043a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42044b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42045c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42046d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42047e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42048f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f42049g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42050h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42051i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42052j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42053k;

    /* renamed from: l, reason: collision with root package name */
    private volatile int f42054l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f42055m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f42056n;

    /* renamed from: o, reason: collision with root package name */
    private TextureView f42057o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f42058p;

    /* renamed from: q, reason: collision with root package name */
    private Surface f42059q;

    /* renamed from: r, reason: collision with root package name */
    private ProgressBar f42060r;

    /* renamed from: s, reason: collision with root package name */
    private MyImageView f42061s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f42062t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f42063u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f42064v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f42065w;

    /* renamed from: x, reason: collision with root package name */
    private View f42066x;

    /* renamed from: y, reason: collision with root package name */
    private AnimationDrawable f42067y;

    /* renamed from: z, reason: collision with root package name */
    private AlphaAnimation f42068z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (MediaViewPlayerView.this.f42053k) {
                    MediaViewPlayerView.this.closeSound();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.b();
                        return;
                    }
                    return;
                }
                MediaViewPlayerView.this.openSound();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.a();
                }
            } catch (Throwable th2) {
                p0.b("MediaViewPlayerView", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MediaViewPlayerView.this.pause();
                MediaViewPlayerView.this.f42062t.setVisibility(0);
                MediaViewPlayerView.this.n();
                MediaViewPlayerView.this.c();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.c();
                }
                MediaViewPlayerView.this.f42047e = true;
            } catch (Throwable th2) {
                p0.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaViewPlayerView.this.onClickPlayButton();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.c();
                MediaViewPlayerView.this.f();
            } catch (Exception e10) {
                p0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends TimerTask {
        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.gonePauseView();
            } catch (Throwable th2) {
                p0.b("MediaViewPlayerView", th2.getMessage(), th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private MediaViewPlayerView f42076a;

        public h(MediaViewPlayerView mediaViewPlayerView) {
            this.f42076a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f42076a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.f42052j) {
                    return;
                }
                p0.c("MediaViewPlayerView", "play end and display endcardView");
                this.f42076a.m();
            } catch (Exception e10) {
                p0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements TextureView.SurfaceTextureListener {
        private i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            try {
                MediaViewPlayerView.this.f42059q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f42049g = true;
                MediaViewPlayerView.this.f42051i = true;
                if (MediaViewPlayerView.this.f42046d) {
                    if (MediaViewPlayerView.this.f42050h) {
                        MediaViewPlayerView.this.f42045c = false;
                        MediaViewPlayerView.this.f42050h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f42047e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.m();
                    return;
                }
                if (MediaViewPlayerView.this.f42044b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.m();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.m();
            } catch (Exception e10) {
                p0.b("MediaViewPlayerView", e10.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.G != null && MediaViewPlayerView.this.G.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f42045c = true;
                MediaViewPlayerView.this.f42049g = false;
            } catch (Throwable th2) {
                p0.b("MediaViewPlayerView", th2.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            p0.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        public /* synthetic */ i(MediaViewPlayerView mediaViewPlayerView, a aVar) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f42043a = false;
        this.f42044b = false;
        this.f42045c = false;
        this.f42046d = false;
        this.f42047e = false;
        this.f42048f = false;
        this.f42049g = false;
        this.f42050h = true;
        this.f42051i = false;
        this.f42052j = true;
        this.f42053k = false;
        this.f42054l = -1;
        this.f42055m = true;
        this.f42056n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    private String getPlayUrl() {
        CampaignEx campaignEx;
        String str;
        try {
            campaignEx = this.C;
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
        if (campaignEx == null) {
            return null;
        }
        try {
            if (this.F == null) {
                if (campaignEx.getAdType() == 287 || this.C.getAdType() == 94) {
                    str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                } else {
                    str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                }
                this.F = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
            }
        } catch (Exception e11) {
            p0.b("MediaViewPlayerView", e11.getMessage());
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.F;
        if (aVar != null && aVar.j() == 5) {
            String strK = this.F.k();
            if (new File(strK).exists()) {
                return strK;
            }
        }
        String videoUrlEncode = this.C.getVideoUrlEncode();
        if (z0.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    public void closeSound() {
        this.f42053k = false;
        try {
            if (this.G != null) {
                this.f42064v.setImageResource(h0.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.G.closeSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                }
            } catch (IllegalArgumentException e10) {
                p0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.f42046d;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public boolean getIsActiviePause() {
        return this.f42047e;
    }

    public void gonePauseView() {
        Handler handler = L;
        if (handler != null) {
            handler.post(new e());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.loadingViewIsVisible();
            }
            return false;
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z10, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
            this.f42043a = false;
        }
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return false;
        }
        this.B = str;
        this.f42044b = z10;
        this.C = campaignEx;
        this.F = aVar;
        this.A = str2;
        this.G.initParameter(campaignEx.getVideoUrlEncode(), true, this.f42052j, this.f42061s, videoPlayerStatusListener);
        h();
        this.f42043a = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            e();
            f();
            setIsComplete(false);
            if (this.f42048f) {
                this.G.play();
            } else if (!hasPrepare() || this.f42045c) {
                p0.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.G.replaySameSource(getContext(), this.B, this.f42059q);
            } else {
                p0.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f42045c);
                startOrPlayVideo();
            }
            if (this.f42047e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.f42047e = false;
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f42061s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.f42063u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    a();
                    return;
                }
                AlphaAnimation alphaAnimation = this.f42068z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.f42068z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.f42068z.setInterpolator(new DecelerateInterpolator());
                this.f42068z.setAnimationListener(new d());
                n();
                this.f42066x.startAnimation(this.f42068z);
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.a(this.B);
        }
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            return;
        }
        try {
            if (this.f42052j) {
                return;
            }
            this.f42045c = true;
            m();
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f42045c = true;
            m();
            if (this.K) {
                return;
            }
            this.G.play(getContext(), this.B, this.f42059q);
            this.K = true;
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        try {
            e();
            l();
            this.f42047e = false;
            this.f42045c = false;
            this.f42054l = i10;
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        a(i10, i11);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f42045c = true;
            b();
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        if (this.D == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.b(this.B);
    }

    public void openSound() {
        this.f42053k = true;
        try {
            if (this.G != null) {
                this.f42064v.setImageResource(h0.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.G.openSound();
            }
            try {
                MediaEvents mediaEvents = this.J;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (IllegalArgumentException e10) {
                p0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f42048f = true;
            }
            if (this.J != null) {
                p0.b("omsdk", "mediaviewplayerview pause");
                this.J.pause();
            }
            d();
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void playVideo() {
        MediaEvents mediaEvents;
        try {
            if (this.f42043a && this.G != null) {
                if (!this.f42049g) {
                    m();
                    return;
                }
                if ((!TextUtils.isEmpty(this.B) && this.B.startsWith("http")) || this.B.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                    this.B = getPlayUrl();
                }
                e();
                this.G.play(getContext(), this.B, this.f42059q);
                if ((this.f42048f || this.f42047e) && (mediaEvents = this.J) != null) {
                    this.f42048f = false;
                    mediaEvents.resume();
                }
                if (this.f42053k) {
                    this.G.openSound();
                } else {
                    this.G.closeSound();
                }
                this.f42045c = false;
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void registerView(AdSession adSession) {
        this.I = adSession;
        if (adSession != null) {
            adSession.registerAdView(this);
            LinearLayout linearLayout = this.f42058p;
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            adSession.addFriendlyObstruction(linearLayout, friendlyObstructionPurpose, null);
            adSession.addFriendlyObstruction(this.f42060r, friendlyObstructionPurpose, null);
            MyImageView myImageView = this.f42061s;
            FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            adSession.addFriendlyObstruction(myImageView, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f42062t, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f42063u, friendlyObstructionPurpose2, null);
            adSession.addFriendlyObstruction(this.f42064v, friendlyObstructionPurpose, null);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.G = null;
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f42052j = z10;
    }

    public void setEnterFullScreen() {
        try {
            p0.c("MediaViewPlayerView", "setEnterFullScreen");
            this.f42046d = true;
            this.f42050h = true;
            this.f42064v.setVisibility(0);
            d();
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f42046d = false;
            this.f42045c = false;
            this.f42064v.setVisibility(8);
            l();
            e();
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    public void setIsActivePause(boolean z10) {
        this.f42047e = z10;
    }

    public void setIsComplete(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z10);
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z10);
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    public void setMediaViewPlayListener(h hVar) {
        this.H = hVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.J = mediaEvents;
    }

    public void showPlayView() {
        this.f42062t.setVisibility(0);
    }

    public void showProgressView(boolean z10) {
        this.f42056n = z10;
        ProgressBar progressBar = this.f42060r;
        if (progressBar != null) {
            progressBar.setVisibility(z10 ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z10) {
        this.f42055m = z10;
        if (z10) {
            l();
        } else {
            d();
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f42049g) {
                m();
            } else if (hasPrepare()) {
                o();
            } else {
                playVideo();
            }
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            d();
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void unregisterView() {
        AdSession adSession = this.I;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f42062t.getVisibility() != 0) {
            this.f42066x.setVisibility(8);
        }
    }

    private void g() {
        try {
            j();
            i();
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (!z0.a(imageUrl) && getContext() != null) {
                if (!com.mbridge.msdk.foundation.same.image.b.a(getContext()).c(imageUrl)) {
                    com.mbridge.msdk.foundation.same.image.b.a(getContext()).a(imageUrl, new f());
                    return;
                }
                Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).b(imageUrl);
                MyImageView myImageView = this.f42061s;
                if (myImageView == null || bitmapB == null) {
                    return;
                }
                myImageView.setImageUrl(imageUrl);
                this.f42061s.setImageBitmap(bitmapB);
                this.f42061s.setVisibility(0);
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void i() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.G = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void j() {
        try {
            a aVar = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(h0.a(getContext(), "mbridge_nativex_playerview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            if (viewInflate != null) {
                this.f42058p = (LinearLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) viewInflate.findViewById(h0.a(getContext(), "mbridge_textureview", "id"));
                this.f42057o = textureView;
                textureView.setKeepScreenOn(true);
                this.f42057o.setSurfaceTextureListener(new i(this, aVar));
                this.f42060r = (ProgressBar) viewInflate.findViewById(h0.a(getContext(), QFzuMMDfrzagDN.nLUWcjw, "id"));
                this.f42061s = (MyImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f42062t = (ImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_iv_play", "id"));
                this.f42063u = (ImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_iv_pause", "id"));
                this.f42064v = (ImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_iv_sound", "id"));
                this.f42066x = viewInflate.findViewById(h0.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f42065w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f42067y = animationDrawable;
                animationDrawable.start();
                k();
                addView(viewInflate, -1, -1);
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void k() {
        this.f42064v.setOnClickListener(new a());
        this.f42063u.setOnClickListener(new b());
        this.f42062t.setOnClickListener(new c());
    }

    private void l() {
        ImageView imageView;
        if (this.f42046d || (imageView = this.f42065w) == null || imageView.getVisibility() == 0 || !this.f42055m) {
            return;
        }
        this.f42065w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.f42061s.setVisibility(0);
            this.f42062t.setVisibility(0);
            n();
            c();
            this.f42060r.setVisibility(8);
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f42066x.setVisibility(0);
    }

    private void o() {
        MediaEvents mediaEvents;
        try {
            if (this.G == null) {
                return;
            }
            e();
            if (this.f42051i) {
                this.G.start(this.f42059q);
                this.f42051i = false;
            } else {
                this.G.start();
            }
            if ((this.f42048f || this.f42047e) && (mediaEvents = this.J) != null) {
                this.f42048f = false;
                mediaEvents.resume();
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a();
        this.E = new Timer();
        this.E.schedule(new g(), 2000L);
    }

    private void b() {
        try {
            if (URLUtil.isNetworkUrl(this.B)) {
                return;
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (z0.b(videoUrlEncode)) {
                this.B = videoUrlEncode;
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f42063u.setVisibility(8);
    }

    private void d() {
        if (this.f42065w.getVisibility() == 0) {
            this.f42065w.setVisibility(8);
        }
    }

    private void e() {
        try {
            this.f42061s.setVisibility(8);
            this.f42062t.setVisibility(8);
            f();
            showProgressView(this.f42056n);
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void a(int i10, int i11) {
        try {
            ProgressBar progressBar = this.f42060r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i11 > 0) {
                this.f42060r.setMax(i11);
            }
            if (i10 >= 0) {
                this.f42060r.setProgress(i10 + 1);
            }
        } catch (Throwable th2) {
            p0.b("MediaViewPlayerView", th2.getMessage());
        }
    }

    private void a() {
        try {
            Handler handler = L;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            p0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42043a = false;
        this.f42044b = false;
        this.f42045c = false;
        this.f42046d = false;
        this.f42047e = false;
        this.f42048f = false;
        this.f42049g = false;
        this.f42050h = true;
        this.f42051i = false;
        this.f42052j = true;
        this.f42053k = false;
        this.f42054l = -1;
        this.f42055m = true;
        this.f42056n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MediaViewPlayerView.this.f42063u.setVisibility(0);
            MediaViewPlayerView.this.p();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements com.mbridge.msdk.foundation.same.image.c {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MediaViewPlayerView.this.f42061s == null || bitmap == null) {
                return;
            }
            MediaViewPlayerView.this.f42061s.setImageUrl(str);
            MediaViewPlayerView.this.f42061s.setImageBitmap(bitmap);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
