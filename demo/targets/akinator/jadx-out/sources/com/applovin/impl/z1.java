package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a1;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b6;
import com.applovin.impl.j8;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z1 extends v1 implements AppLovinCommunicatorSubscriber {
    private final a2 M;
    private MediaPlayer N;
    private final View O;
    protected final AppLovinVideoView P;
    protected final com.applovin.impl.a Q;
    protected final com.applovin.impl.adview.g R;
    protected i0 S;
    protected final ImageView T;
    protected com.applovin.impl.adview.l U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final e Y;
    private final d Z;

    /* renamed from: a0, reason: collision with root package name */
    private final Handler f16318a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Handler f16319b0;

    /* renamed from: c0, reason: collision with root package name */
    protected final a1 f16320c0;

    /* renamed from: d0, reason: collision with root package name */
    protected final a1 f16321d0;

    /* renamed from: e0, reason: collision with root package name */
    private final boolean f16322e0;

    /* renamed from: f0, reason: collision with root package name */
    protected boolean f16323f0;

    /* renamed from: g0, reason: collision with root package name */
    protected long f16324g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f16325h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f16326i0;

    /* renamed from: j0, reason: collision with root package name */
    protected boolean f16327j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f16328k0;

    /* renamed from: l0, reason: collision with root package name */
    private final AtomicBoolean f16329l0;

    /* renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f16330m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f16331n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f16332o0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements a1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16333a;

        public a(int i10) {
            this.f16333a = i10;
        }

        @Override // com.applovin.impl.a1.b
        public void a() {
            if (z1.this.S != null) {
                long seconds = this.f16333a - TimeUnit.MILLISECONDS.toSeconds(r0.P.getCurrentPosition());
                if (seconds <= 0) {
                    z1.this.f15852v = true;
                } else if (z1.this.P()) {
                    z1.this.S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.a1.b
        public boolean b() {
            return z1.this.P();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements a1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f16335a;

        public b(Integer num) {
            this.f16335a = num;
        }

        @Override // com.applovin.impl.a1.b
        public void a() {
            z1 z1Var = z1.this;
            if (z1Var.f16327j0) {
                z1Var.V.setVisibility(8);
            } else {
                z1.this.V.setProgress((int) ((z1Var.P.getCurrentPosition() / z1.this.f16324g0) * this.f16335a.intValue()));
            }
        }

        @Override // com.applovin.impl.a1.b
        public boolean b() {
            return !z1.this.f16327j0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements a1.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16337a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f16338b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f16339c;

        public c(long j10, Integer num, Long l9) {
            this.f16337a = j10;
            this.f16338b = num;
            this.f16339c = l9;
        }

        @Override // com.applovin.impl.a1.b
        public void a() {
            z1.this.W.setProgress((int) ((z1.this.f15848r / this.f16337a) * this.f16338b.intValue()));
            z1 z1Var = z1.this;
            z1Var.f15848r = this.f16339c.longValue() + z1Var.f15848r;
        }

        @Override // com.applovin.impl.a1.b
        public boolean b() {
            return z1.this.f15848r < this.f16337a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements j8.a {
        private d() {
        }

        @Override // com.applovin.impl.j8.a
        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            z1.this.a("video_button");
        }

        @Override // com.applovin.impl.j8.a
        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            z1.this.a(lVar.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.j8.a
        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            z1.this.J = true;
        }

        @Override // com.applovin.impl.j8.a
        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            z1.this.S();
        }

        public /* synthetic */ d(z1 z1Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.j8.a
        public void a(com.applovin.impl.adview.l lVar, Bundle bundle) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            z1.this.a(lVar.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.j8.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            h7.c(uri, z1.this.f15839i.getController().g(), z1.this.f15832b);
        }

        @Override // com.applovin.impl.j8.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            h7.a(uri, z1.this.f15839i.getController(), z1.this.f15832b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            z1.this.a(motionEvent, (Bundle) null);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "Video completed");
            }
            z1.this.f16328k0 = true;
            z1 z1Var = z1.this;
            if (!z1Var.f15850t) {
                z1Var.R();
            } else if (z1Var.g()) {
                z1.this.z();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            z1.this.g(p0.o2.i(i10, i11, "Video view error (", ",", ")"));
            z1.this.P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", p0.o2.i(i10, i11, "MediaPlayer Info: (", ", ", ")"));
            }
            if (i10 == 701) {
                z1.this.Q();
                return false;
            }
            if (i10 != 3) {
                if (i10 != 702) {
                    return false;
                }
                z1.this.D();
                return false;
            }
            z1.this.f16320c0.b();
            z1 z1Var = z1.this;
            if (z1Var.R != null) {
                z1Var.O();
            }
            z1.this.D();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            z1.this.N = mediaPlayer;
            mediaPlayer.setOnInfoListener(z1.this.Y);
            mediaPlayer.setOnErrorListener(z1.this.Y);
            float f10 = !z1.this.f16323f0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            z1.this.f15851u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            z1.this.d(mediaPlayer.getDuration());
            z1.this.N();
            com.applovin.impl.sdk.o oVar = z1.this.f15833c;
            if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + z1.this.N);
            }
        }

        public /* synthetic */ e(z1 z1Var, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z1 z1Var = z1.this;
            if (view == z1Var.R) {
                z1Var.S();
                return;
            }
            if (view == z1Var.T) {
                z1Var.T();
            } else if (com.applovin.impl.sdk.o.a()) {
                z1.this.f15833c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(z1 z1Var, a aVar) {
            this();
        }
    }

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new a2(this.f15831a, this.f15834d, this.f15832b);
        a aVar = null;
        this.X = null;
        e eVar = new e(this, aVar);
        this.Y = eVar;
        d dVar = new d(this, aVar);
        this.Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f16318a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f16319b0 = handler2;
        a1 a1Var = new a1(handler, this.f15832b);
        this.f16320c0 = a1Var;
        this.f16321d0 = new a1(handler2, this.f15832b);
        boolean zO0 = this.f15831a.O0();
        this.f16322e0 = zO0;
        this.f16323f0 = k7.e(this.f15832b);
        this.f16326i0 = -1;
        this.f16329l0 = new AtomicBoolean();
        this.f16330m0 = new AtomicBoolean();
        this.f16331n0 = -2L;
        this.f16332o0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", b8.a(appLovinVideoView));
        View view = new View(activity);
        this.O = view;
        boolean z10 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) kVar.a(v4.f15961k1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(kVar, v4.f15936h0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, v4.f15936h0, activity, eVar));
            view.setOnTouchListener(new com.applovin.impl.adview.r(1));
        }
        f fVar = new f(this, aVar);
        if (bVar.n0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.e0(), activity);
            this.R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.R = null;
        }
        if (a(this.f16323f0, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f16323f0);
        } else {
            this.T = null;
        }
        String strK0 = bVar.k0();
        if (StringUtils.isValidString(strK0)) {
            j8 j8Var = new j8(kVar);
            j8Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.j0(), bVar, j8Var, activity);
            this.U = lVar;
            lVar.a(strK0);
        } else {
            this.U = null;
        }
        if (zO0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) kVar.a(v4.f15946i2)).intValue(), R.attr.progressBarStyleLarge);
            this.Q = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.Q = null;
        }
        int iB = b();
        if (((Boolean) kVar.a(v4.S1)).booleanValue() && iB > 0) {
            z10 = true;
        }
        if (this.S == null && z10) {
            this.S = new i0(activity);
            int iT = bVar.t();
            this.S.setTextColor(iT);
            this.S.setTextSize(((Integer) kVar.a(v4.R1)).intValue());
            this.S.setFinishedStrokeColor(iT);
            this.S.setFinishedStrokeWidth(((Integer) kVar.a(v4.Q1)).intValue());
            this.S.setMax(iB);
            this.S.setProgress(iB);
            a1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iB));
        }
        if (!bVar.u0()) {
            this.V = null;
            return;
        }
        Long l9 = (Long) kVar.a(v4.f15922f2);
        Integer num = (Integer) kVar.a(v4.f15930g2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.V = progressBar;
        a(progressBar, bVar.t0(), num.intValue());
        a1Var.a("PROGRESS_BAR", l9.longValue(), new b(num));
    }

    private void L() {
        com.applovin.impl.adview.l lVar;
        a8 a8VarL0 = this.f15831a.l0();
        if (a8VarL0 == null || !a8VarL0.j() || this.f16327j0 || (lVar = this.U) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.sdk.a0(this, lVar.getVisibility() == 4, a8VarL0.h(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.f16327j0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f15832b.n0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f16326i0 < 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f16326i0 + "ms for MediaPlayer: " + this.N);
        }
        this.P.seekTo(this.f16326i0);
        this.P.start();
        this.f16320c0.b();
        this.f16326i0 = -1;
        a(new pa(this, 0), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f16330m0.compareAndSet(false, true)) {
            a(this.R, this.f15831a.n0(), new pa(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z10) {
        if (o0.e()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f15834d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.T.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.T, z10 ? this.f15831a.Q() : this.f15831a.i0(), this.f15832b);
    }

    private void f(boolean z10) {
        this.f16325h0 = B();
        if (z10) {
            this.P.pause();
        } else {
            this.P.stopPlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        l8.a(this.U, str, "AppLovinFullscreenActivity", this.f15832b);
    }

    public void N() {
        long jZ;
        long millis;
        if (this.f15831a.Y() >= 0 || this.f15831a.Z() >= 0) {
            if (this.f15831a.Y() >= 0) {
                jZ = this.f15831a.Y();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f15831a;
                long j10 = this.f16324g0;
                long j11 = j10 > 0 ? j10 : 0L;
                if (aVar.j1()) {
                    int iT1 = (int) ((com.applovin.impl.sdk.ad.a) this.f15831a).t1();
                    if (iT1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iT1);
                    } else {
                        int iS = (int) aVar.s();
                        if (iS > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iS);
                        }
                    }
                    j11 += millis;
                }
                jZ = (long) ((this.f15831a.Z() / 100.0d) * j11);
            }
            c(jZ);
        }
    }

    public boolean P() {
        return (this.f15852v || this.f16327j0 || !this.P.isPlaying()) ? false : true;
    }

    public void Q() {
        AppLovinSdkUtils.runOnUiThread(new pa(this, 4));
    }

    public void R() {
        z1 z1Var;
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f15831a.q1());
        long jW = this.f15831a.W();
        if (jW > 0) {
            this.f15848r = 0L;
            Long l9 = (Long) this.f15832b.a(v4.f15986n2);
            Integer num = (Integer) this.f15832b.a(v4.f16010q2);
            ProgressBar progressBar = new ProgressBar(this.f15834d, null, R.attr.progressBarStyleHorizontal);
            this.W = progressBar;
            a(progressBar, this.f15831a.V(), num.intValue());
            z1Var = this;
            this.f16321d0.a("POSTITIAL_PROGRESS_BAR", l9.longValue(), z1Var.new c(jW, num, l9));
            z1Var.f16321d0.b();
        } else {
            z1Var = this;
        }
        z1Var.M.a(z1Var.f15841k, z1Var.f15840j, z1Var.f15839i, z1Var.W);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(z1Var.f15855y);
        sb2.append(",");
        a(a.b.f(z1Var.f15856z, ");", sb2), z1Var.f15831a.H());
        if (z1Var.f15841k != null) {
            if (z1Var.f15831a.s() >= 0) {
                a(z1Var.f15841k, z1Var.f15831a.s(), new pa(this, 3));
            } else {
                z1Var.f15841k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = z1Var.f15841k;
        if (gVar != null) {
            arrayList.add(new e4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = z1Var.f15840j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = z1Var.f15840j;
            arrayList.add(new e4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = z1Var.W;
        if (progressBar2 != null) {
            arrayList.add(new e4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        z1Var.f15831a.getAdEventTracker().b(z1Var.f15839i, arrayList);
        o();
        z1Var.f16327j0 = true;
    }

    public void S() {
        this.f16331n0 = SystemClock.elapsedRealtime() - this.f16332o0;
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", a.b.g(this.f16331n0, "ms", new StringBuilder("Attempting to skip video with skip time: ")));
        }
        C();
    }

    public void T() {
        MediaPlayer mediaPlayer = this.N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f16323f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f16323f0;
            this.f16323f0 = z10;
            e(z10);
            a(this.f16323f0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void d(long j10) {
        this.f16324g0 = j10;
    }

    public void g(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f15833c;
            StringBuilder sbO = e3.g.o("Encountered media error: ", str, " for ad: ");
            sbO.append(this.f15831a);
            oVar.b("AppLovinFullscreenActivity", sbO.toString());
        }
        if (this.f16329l0.compareAndSet(false, true)) {
            if (((Boolean) this.f15832b.a(v4.O0)).booleanValue()) {
                this.f15832b.H().d(this.f15831a, com.applovin.impl.sdk.k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
            if (appLovinAdDisplayListener instanceof k2) {
                ((k2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f15831a instanceof l7 ? "handleVastVideoError" : "handleVideoError";
            this.f15832b.E().a(str2, str, this.f15831a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f15832b.g().a(c2.f13735s, this.f15831a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.v1
    public void l() {
        super.a(B(), this.f16322e0, E(), this.f16331n0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f15831a.getAdIdNumber() && this.f16322e0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !r0.a(i10)) || this.f16328k0 || this.P.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.v1
    public void q() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f15832b.a(v4.f15958j6)).booleanValue()) {
                l8.b(this.U);
                this.U = null;
            }
            if (this.f16322e0) {
                AppLovinCommunicator.getInstance(this.f15834d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th2);
        }
        super.q();
    }

    @Override // com.applovin.impl.v1
    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f16326i0 = this.P.getCurrentPosition();
        this.P.pause();
        this.f16320c0.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f16326i0 + "ms");
        }
    }

    @Override // com.applovin.impl.v1
    public void v() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.v1
    public void z() {
        this.M.a(this.f15842l);
        this.f15847q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
            com.applovin.impl.a aVar2 = this.Q;
            Objects.requireNonNull(aVar2);
            a(new m9(aVar2, 13), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f16331n0 = -1L;
        this.f16332o0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        this.f15847q = SystemClock.elapsedRealtime();
    }

    public int B() {
        long currentPosition = this.P.getCurrentPosition();
        if (this.f16328k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f16324g0) * 100.0f) : this.f16325h0;
    }

    public void C() {
        this.f15855y++;
        if (this.f15831a.E()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            R();
        }
    }

    public void D() {
        AppLovinSdkUtils.runOnUiThread(new pa(this, 5));
    }

    public boolean E() {
        if (this.J && this.f15831a.n1()) {
            return true;
        }
        return F();
    }

    public boolean F() {
        return B() >= this.f15831a.p0();
    }

    @Override // com.applovin.impl.v1
    public void b(boolean z10) {
        super.b(z10);
        if (z10) {
            b(0L);
            if (this.f16327j0) {
                this.f16321d0.b();
                return;
            }
            return;
        }
        if (this.f16327j0) {
            this.f16321d0.c();
        } else {
            u();
        }
    }

    @Override // com.applovin.impl.v1
    public void d() {
        super.d();
        z();
    }

    @Override // com.applovin.impl.v1
    public void a(ViewGroup viewGroup) {
        String str;
        this.M.a(this.T, this.R, this.U, this.Q, this.V, this.S, this.P, this.O, this.f15839i, this.f15840j, this.X, viewGroup);
        if (o0.h() && (str = this.f15832b.o0().getExtraParameters().get("audio_focus_request")) != null) {
            this.P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f15832b.a(v4.L5)).booleanValue() || !a(!this.f16322e0)) {
            this.P.setVideoURI(this.f15831a.v0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.f15840j;
            if (kVar != null) {
                kVar.b();
            }
            this.P.start();
            if (this.f16322e0) {
                Q();
            }
            this.f15839i.renderAd(this.f15831a);
            if (this.R != null) {
                this.f15832b.r0().a(new p6(this.f15832b, "scheduleSkipButton", new pa(this, 2)), b6.b.TIMEOUT, this.f15831a.o0(), true);
            }
            super.c(this.f16323f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10, long j10) {
        if (z10) {
            b8.a(this.U, j10, (Runnable) null);
        } else {
            b8.b(this.U, j10, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.v1
    public void e() {
        super.e();
        this.M.a(this.U);
        this.M.a((View) this.R);
        if (!g() || this.f16327j0) {
            z();
        }
    }

    @Override // com.applovin.impl.v1
    public void b(long j10) {
        a(new pa(this, 6), j10);
    }

    @Override // com.applovin.impl.v1
    public void a(String str, long j10) {
        super.a(str, j10);
        if (this.U == null || j10 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new s8(24, this, str), j10);
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        if (o0.e()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // com.applovin.impl.v1
    public void a(String str) {
        this.f16320c0.a();
        this.f16321d0.a();
        this.f16318a0.removeCallbacksAndMessages(null);
        this.f16319b0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f15832b.a(v4.D6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f15831a;
            if (bVar != null) {
                bVar.a(str);
            }
            l();
        }
        super.a(str);
    }

    public void a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f15831a.N0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriM0 = this.f15831a.m0();
            if (uriM0 != null) {
                if (!((Boolean) this.f15832b.a(v4.f16063x)).booleanValue() || (context = this.f15834d) == null) {
                    AppLovinAdView appLovinAdView = this.f15839i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : com.applovin.impl.sdk.k.o();
                }
                this.f15832b.k().trackAndLaunchVideoClick(this.f15831a, uriM0, motionEvent, bundle, this, context);
                q2.a(this.E, this.f15831a);
                this.f15856z++;
                return;
            }
            return;
        }
        L();
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(v4.X1)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(v4.Y1)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) kVar.a(v4.f15880a2)).booleanValue();
    }
}
