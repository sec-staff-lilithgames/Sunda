package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import gn.a;
import gn.a2;
import gn.b1;
import gn.b2;
import gn.c1;
import gn.e1;
import gn.f1;
import gn.g1;
import gn.h1;
import gn.i1;
import gn.k2;
import gn.r1;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c0 extends FrameLayout implements gn.c {
    public static final /* synthetic */ int I = 0;
    public int A;
    public boolean B;
    public CharSequence C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: b, reason: collision with root package name */
    public final a f61694b;

    /* renamed from: c, reason: collision with root package name */
    public final AspectRatioFrameLayout f61695c;

    /* renamed from: e, reason: collision with root package name */
    public final View f61696e;

    /* renamed from: f, reason: collision with root package name */
    public final View f61697f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61698g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f61699h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f61700i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f61701j;

    /* renamed from: k, reason: collision with root package name */
    public final SubtitleView f61702k;

    /* renamed from: l, reason: collision with root package name */
    public final View f61703l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f61704m;

    /* renamed from: n, reason: collision with root package name */
    public final k f61705n;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f61706o;

    /* renamed from: p, reason: collision with root package name */
    public final FrameLayout f61707p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f61708q;

    /* renamed from: r, reason: collision with root package name */
    public final Class f61709r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f61710s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f61711t;

    /* renamed from: u, reason: collision with root package name */
    public i1 f61712u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f61713v;

    /* renamed from: w, reason: collision with root package name */
    public o f61714w;

    /* renamed from: x, reason: collision with root package name */
    public int f61715x;

    /* renamed from: y, reason: collision with root package name */
    public int f61716y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f61717z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements g1, View.OnClickListener, o, j {

        /* renamed from: b, reason: collision with root package name */
        public final r1 f61718b = new r1();

        /* renamed from: c, reason: collision with root package name */
        public Object f61719c;

        public a() {
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(gn.h hVar) {
            super.onAudioAttributesChanged(hVar);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
            super.onAudioSessionIdChanged(i10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(e1 e1Var) {
            super.onAvailableCommandsChanged(e1Var);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            int i10 = c0.I;
            c0.this.h();
        }

        @Override // gn.g1
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues((List<in.b>) list);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(gn.q qVar) {
            super.onDeviceInfoChanged(qVar);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            super.onDeviceVolumeChanged(i10, z10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onEvents(i1 i1Var, f1 f1Var) {
            super.onEvents(i1Var, f1Var);
        }

        @Override // io.bidmachine.media3.ui.j
        public void onFullScreenModeChanged(boolean z10) {
            int i10 = c0.I;
            c0.this.getClass();
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
            super.onIsLoadingChanged(z10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
        }

        @Override // gn.g1
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
            super.onLoadingChanged(z10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            super.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onMediaItemTransition(gn.p0 p0Var, int i10) {
            super.onMediaItemTransition(p0Var, i10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(gn.s0 s0Var) {
            super.onMediaMetadataChanged(s0Var);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onMetadata(gn.u0 u0Var) {
            super.onMetadata(u0Var);
        }

        @Override // gn.g1
        public void onPlayWhenReadyChanged(boolean z10, int i10) throws Resources.NotFoundException {
            int i11 = c0.I;
            c0 c0Var = c0.this;
            c0Var.j();
            if (c0Var.d() && c0Var.F) {
                c0Var.hideController();
            } else {
                c0Var.e(false);
            }
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(c1 c1Var) {
            super.onPlaybackParametersChanged(c1Var);
        }

        @Override // gn.g1
        public void onPlaybackStateChanged(int i10) throws Resources.NotFoundException {
            int i11 = c0.I;
            c0 c0Var = c0.this;
            c0Var.j();
            c0Var.l();
            if (c0Var.d() && c0Var.F) {
                c0Var.hideController();
            } else {
                c0Var.e(false);
            }
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            super.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onPlayerError(b1 b1Var) {
            super.onPlayerError(b1Var);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(b1 b1Var) {
            super.onPlayerErrorChanged(b1Var);
        }

        @Override // gn.g1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            super.onPlayerStateChanged(z10, i10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(gn.s0 s0Var) {
            super.onPlaylistMetadataChanged(s0Var);
        }

        @Override // gn.g1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
            super.onPositionDiscontinuity(i10);
        }

        @Override // gn.g1
        public void onRenderedFirstFrame() {
            c0 c0Var = c0.this;
            View view = c0Var.f61696e;
            if (view != null) {
                view.setVisibility(4);
                if (!c0Var.b()) {
                    c0Var.c();
                    return;
                }
                ImageView imageView = c0Var.f61700i;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
            super.onRepeatModeChanged(i10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            super.onSeekBackIncrementChanged(j10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            super.onSeekForwardIncrementChanged(j10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            super.onShuffleModeEnabledChanged(z10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            super.onSkipSilenceEnabledChanged(z10);
        }

        @Override // gn.g1
        public void onSurfaceSizeChanged(int i10, int i11) {
            if (a1.f60679a == 34) {
                c0 c0Var = c0.this;
                if ((c0Var.f61697f instanceof SurfaceView) && c0Var.H) {
                    ((f0) io.bidmachine.media3.common.util.a.checkNotNull(c0Var.f61699h)).postRegister(c0Var.f61708q, (SurfaceView) c0Var.f61697f, new com.unity3d.services.banners.view.a(c0Var, 27));
                }
            }
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onTimelineChanged(u1 u1Var, int i10) {
            super.onTimelineChanged(u1Var, i10);
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(a2 a2Var) {
            super.onTrackSelectionParametersChanged(a2Var);
        }

        @Override // gn.g1
        public void onTracksChanged(b2 b2Var) {
            c0 c0Var = c0.this;
            i1 i1Var = (i1) io.bidmachine.media3.common.util.a.checkNotNull(c0Var.f61712u);
            u1 currentTimeline = i1Var.isCommandAvailable(17) ? i1Var.getCurrentTimeline() : u1.f58195a;
            if (currentTimeline.isEmpty()) {
                this.f61719c = null;
            } else {
                boolean zIsCommandAvailable = i1Var.isCommandAvailable(30);
                r1 r1Var = this.f61718b;
                if (!zIsCommandAvailable || i1Var.getCurrentTracks().isEmpty()) {
                    Object obj = this.f61719c;
                    if (obj != null) {
                        int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                        if (indexOfPeriod != -1) {
                            if (i1Var.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, r1Var).f58110c) {
                                return;
                            }
                        }
                        this.f61719c = null;
                    }
                } else {
                    this.f61719c = currentTimeline.getPeriod(i1Var.getCurrentPeriodIndex(), r1Var, true).f58109b;
                }
            }
            c0Var.m(false);
        }

        @Override // gn.g1
        public void onVideoSizeChanged(k2 k2Var) {
            c0 c0Var;
            i1 i1Var;
            if (k2Var.equals(k2.f57977d) || (i1Var = (c0Var = c0.this).f61712u) == null || i1Var.getPlaybackState() == 1) {
                return;
            }
            c0Var.i();
        }

        @Override // io.bidmachine.media3.ui.o
        public void onVisibilityChange(int i10) {
            int i11 = c0.I;
            c0 c0Var = c0.this;
            c0Var.k();
            c0Var.getClass();
        }

        @Override // gn.g1
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
            super.onVolumeChanged(f10);
        }

        @Override // gn.g1
        public void onCues(in.d dVar) {
            SubtitleView subtitleView = c0.this.f61702k;
            if (subtitleView != null) {
                subtitleView.setCues(dVar.f59799a);
            }
        }

        @Override // gn.g1
        public void onPositionDiscontinuity(h1 h1Var, h1 h1Var2, int i10) {
            int i11 = c0.I;
            c0 c0Var = c0.this;
            if (c0Var.d() && c0Var.F) {
                c0Var.hideController();
            }
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    public static void a(c0 c0Var, Bitmap bitmap) {
        c0Var.setImage(new BitmapDrawable(c0Var.getResources(), bitmap));
        i1 i1Var = c0Var.f61712u;
        if (i1Var != null && i1Var.isCommandAvailable(30) && i1Var.getCurrentTracks().isTypeSelected(2)) {
            return;
        }
        ImageView imageView = c0Var.f61700i;
        if (imageView != null) {
            imageView.setVisibility(0);
            c0Var.n();
        }
        View view = c0Var.f61696e;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f61700i;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        n();
    }

    private void setImageOutput(i1 i1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f61709r;
        if (cls == null || !cls.isAssignableFrom(i1Var.getClass())) {
            return;
        }
        try {
            ((Method) io.bidmachine.media3.common.util.a.checkNotNull(this.f61710s)).invoke(i1Var, io.bidmachine.media3.common.util.a.checkNotNull(this.f61711t));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void switchTargetView(i1 i1Var, c0 c0Var, c0 c0Var2) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        if (c0Var == c0Var2) {
            return;
        }
        if (c0Var2 != null) {
            c0Var2.setPlayer(i1Var);
        }
        if (c0Var != null) {
            c0Var.setPlayer(null);
        }
    }

    public final boolean b() {
        i1 i1Var = this.f61712u;
        return i1Var != null && this.f61711t != null && i1Var.isCommandAvailable(30) && i1Var.getCurrentTracks().isTypeSelected(4);
    }

    public final void c() {
        ImageView imageView = this.f61700i;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final boolean d() {
        i1 i1Var = this.f61712u;
        return i1Var != null && i1Var.isCommandAvailable(16) && this.f61712u.isPlayingAd() && this.f61712u.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f0 f0Var;
        super.dispatchDraw(canvas);
        if (a1.f60679a == 34 && (f0Var = this.f61699h) != null && this.H) {
            f0Var.maybeMarkSyncReadyAndClear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) throws Resources.NotFoundException {
        i1 i1Var = this.f61712u;
        if (i1Var != null && i1Var.isCommandAvailable(16) && this.f61712u.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z10 && o() && !this.f61705n.isFullyVisible()) {
            e(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z10 && o()) {
            e(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return o() && this.f61705n.dispatchMediaKeyEvent(keyEvent);
    }

    public final void e(boolean z10) throws Resources.NotFoundException {
        if (!(d() && this.F) && o()) {
            k kVar = this.f61705n;
            boolean z11 = kVar.isFullyVisible() && kVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if ((z10 || z11 || zG) && o()) {
                kVar.setShowTimeoutMs(zG ? 0 : this.D);
                kVar.show();
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.f61701j;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f61715x == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f61695c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        i1 i1Var = this.f61712u;
        if (i1Var == null) {
            return true;
        }
        int playbackState = i1Var.getPlaybackState();
        if (!this.E) {
            return false;
        }
        if (this.f61712u.isCommandAvailable(17) && this.f61712u.getCurrentTimeline().isEmpty()) {
            return false;
        }
        return playbackState == 1 || playbackState == 4 || !((i1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61712u)).getPlayWhenReady();
    }

    @Override // gn.c
    public List<gn.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f61707p;
        if (frameLayout != null) {
            arrayList.add(new a.C0574a(frameLayout, 4).setDetailedReason("Transparent overlay does not impact viewability").build());
        }
        k kVar = this.f61705n;
        if (kVar != null) {
            arrayList.add(new a.C0574a(kVar, 1).build());
        }
        return b5.copyOf((Collection) arrayList);
    }

    @Override // gn.c
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61706o, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f61715x;
    }

    public boolean getControllerAutoShow() {
        return this.E;
    }

    public boolean getControllerHideOnTouch() {
        return this.G;
    }

    public int getControllerShowTimeoutMs() {
        return this.D;
    }

    public Drawable getDefaultArtwork() {
        return this.f61717z;
    }

    public int getImageDisplayMode() {
        return this.f61716y;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f61707p;
    }

    public i1 getPlayer() {
        return this.f61712u;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f61695c;
        io.bidmachine.media3.common.util.a.checkStateNotNull(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f61702k;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f61715x != 0;
    }

    public boolean getUseController() {
        return this.f61713v;
    }

    public View getVideoSurfaceView() {
        return this.f61697f;
    }

    public final void h() throws Resources.NotFoundException {
        if (!o() || this.f61712u == null) {
            return;
        }
        k kVar = this.f61705n;
        if (!kVar.isFullyVisible()) {
            e(true);
        } else if (this.G) {
            kVar.hide();
        }
    }

    public void hideController() {
        k kVar = this.f61705n;
        if (kVar != null) {
            kVar.hide();
        }
    }

    public final void i() {
        i1 i1Var = this.f61712u;
        k2 videoSize = i1Var != null ? i1Var.getVideoSize() : k2.f57977d;
        int i10 = videoSize.f57981a;
        int i11 = videoSize.f57982b;
        float f10 = this.f61698g ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f57983c) / i11;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f61695c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public boolean isControllerFullyVisible() {
        k kVar = this.f61705n;
        return kVar != null && kVar.isFullyVisible();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            android.view.View r0 = r5.f61703l
            if (r0 == 0) goto L29
            gn.i1 r1 = r5.f61712u
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.getPlaybackState()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.A
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            gn.i1 r1 = r5.f61712u
            boolean r1 = r1.getPlayWhenReady()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.c0.j():void");
    }

    public final void k() {
        k kVar = this.f61705n;
        if (kVar == null || !this.f61713v) {
            setContentDescription(null);
        } else if (kVar.isFullyVisible()) {
            setContentDescription(this.G ? getResources().getString(com.digidust.elokence.akinator.freemium.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.digidust.elokence.akinator.freemium.R.string.exo_controls_show));
        }
    }

    public final void l() {
        TextView textView = this.f61704m;
        if (textView != null) {
            CharSequence charSequence = this.C;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                i1 i1Var = this.f61712u;
                if (i1Var != null) {
                    i1Var.getPlayerError();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void m(boolean z10) {
        byte[] bArr;
        Drawable drawable;
        i1 i1Var = this.f61712u;
        boolean zF = false;
        boolean z11 = (i1Var == null || !i1Var.isCommandAvailable(30) || i1Var.getCurrentTracks().isEmpty()) ? false : true;
        boolean z12 = this.B;
        ImageView imageView = this.f61701j;
        View view = this.f61696e;
        if (!z12 && (!z11 || z10)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z11) {
            i1 i1Var2 = this.f61712u;
            boolean z13 = i1Var2 != null && i1Var2.isCommandAvailable(30) && i1Var2.getCurrentTracks().isTypeSelected(2);
            boolean zB = b();
            if (!z13 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.f61700i;
            boolean z14 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z13 && z14) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    n();
                }
            } else if (z13 && !zB && z14) {
                c();
            }
            if (!z13 && !zB && this.f61715x != 0) {
                io.bidmachine.media3.common.util.a.checkStateNotNull(imageView);
                if (i1Var != null && i1Var.isCommandAvailable(18) && (bArr = i1Var.getMediaMetadata().f58145k) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.f61717z)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void n() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f61700i;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f61716y == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f61695c) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    public final boolean o() {
        if (!this.f61713v) {
            return false;
        }
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61705n);
        return true;
    }

    public void onPause() {
        View view = this.f61697f;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.f61697f;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        if (!o() || this.f61712u == null) {
            return false;
        }
        e(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() throws Resources.NotFoundException {
        h();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        io.bidmachine.media3.common.util.a.checkState(i10 == 0 || this.f61701j != null);
        if (this.f61715x != i10) {
            this.f61715x = i10;
            m(false);
        }
    }

    public void setAspectRatioListener(io.bidmachine.media3.ui.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f61695c;
        io.bidmachine.media3.common.util.a.checkStateNotNull(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.E = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.F = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61705n);
        this.G = z10;
        k();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(j jVar) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setOnFullScreenModeChangedListener(jVar);
    }

    public void setControllerShowTimeoutMs(int i10) throws Resources.NotFoundException {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        this.D = i10;
        if (kVar.isFullyVisible()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(d0 d0Var) {
        if (d0Var != null) {
            setControllerVisibilityListener((o) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        io.bidmachine.media3.common.util.a.checkState(this.f61704m != null);
        this.C = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f61717z != drawable) {
            this.f61717z = drawable;
            m(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.H = z10;
    }

    public void setErrorMessageProvider(gn.s sVar) {
        if (sVar != null) {
            l();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(e0 e0Var) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setOnFullScreenModeChangedListener(this.f61694b);
    }

    public void setFullscreenButtonState(boolean z10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.updateIsFullscreen(z10);
    }

    public void setImageDisplayMode(int i10) {
        io.bidmachine.media3.common.util.a.checkState(this.f61700i != null);
        if (this.f61716y != i10) {
            this.f61716y = i10;
            n();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            m(false);
        }
    }

    public void setPlayer(i1 i1Var) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        io.bidmachine.media3.common.util.a.checkState(Looper.myLooper() == Looper.getMainLooper());
        io.bidmachine.media3.common.util.a.checkArgument(i1Var == null || i1Var.getApplicationLooper() == Looper.getMainLooper());
        i1 i1Var2 = this.f61712u;
        if (i1Var2 == i1Var) {
            return;
        }
        View view = this.f61697f;
        a aVar = this.f61694b;
        if (i1Var2 != null) {
            i1Var2.removeListener(aVar);
            if (i1Var2.isCommandAvailable(27)) {
                if (view instanceof TextureView) {
                    i1Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    i1Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            Class cls = this.f61709r;
            if (cls != null && cls.isAssignableFrom(i1Var2.getClass())) {
                try {
                    ((Method) io.bidmachine.media3.common.util.a.checkNotNull(this.f61710s)).invoke(i1Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        SubtitleView subtitleView = this.f61702k;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f61712u = i1Var;
        if (o()) {
            this.f61705n.setPlayer(i1Var);
        }
        j();
        l();
        m(true);
        if (i1Var == null) {
            hideController();
            return;
        }
        if (i1Var.isCommandAvailable(27)) {
            if (view instanceof TextureView) {
                i1Var.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                i1Var.setVideoSurfaceView((SurfaceView) view);
            }
            if (!i1Var.isCommandAvailable(30) || i1Var.getCurrentTracks().isTypeSupported(2)) {
                i();
            }
        }
        if (subtitleView != null && i1Var.isCommandAvailable(28)) {
            subtitleView.setCues(i1Var.getCurrentCues().f59799a);
        }
        i1Var.addListener(aVar);
        setImageOutput(i1Var);
        e(false);
    }

    public void setRepeatToggleModes(int i10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f61695c;
        io.bidmachine.media3.common.util.a.checkStateNotNull(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.A != i10) {
            this.A = i10;
            j();
        }
    }

    public void setShowFastForwardButton(boolean z10) throws Resources.NotFoundException {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) throws Resources.NotFoundException {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) throws Resources.NotFoundException {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) throws Resources.NotFoundException {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) throws Resources.NotFoundException {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        kVar.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f61696e;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) throws Resources.NotFoundException {
        boolean z11 = true;
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkState((z10 && kVar == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f61713v == z10) {
            return;
        }
        this.f61713v = z10;
        if (o()) {
            kVar.setPlayer(this.f61712u);
        } else if (kVar != null) {
            kVar.hide();
            kVar.setPlayer(null);
        }
        k();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f61697f;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void showController() throws Resources.NotFoundException {
        boolean zG = g();
        if (o()) {
            int i10 = zG ? 0 : this.D;
            k kVar = this.f61705n;
            kVar.setShowTimeoutMs(i10);
            kVar.show();
        }
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(o oVar) {
        k kVar = this.f61705n;
        io.bidmachine.media3.common.util.a.checkStateNotNull(kVar);
        o oVar2 = this.f61714w;
        if (oVar2 == oVar) {
            return;
        }
        if (oVar2 != null) {
            kVar.removeVisibilityListener(oVar2);
        }
        this.f61714w = oVar;
        if (oVar != null) {
            kVar.addVisibilityListener(oVar);
            setControllerVisibilityListener((d0) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z14;
        boolean z15;
        int i19;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f61694b = aVar;
        this.f61708q = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f61695c = null;
            this.f61696e = null;
            this.f61697f = null;
            this.f61698g = false;
            this.f61699h = null;
            this.f61700i = null;
            this.f61701j = null;
            this.f61702k = null;
            this.f61703l = null;
            this.f61704m = null;
            this.f61705n = null;
            this.f61706o = null;
            this.f61707p = null;
            this.f61709r = null;
            this.f61710s = null;
            this.f61711t = null;
            ImageView imageView = new ImageView(context);
            if (a1.f60679a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(a1.getDrawable(context, resources, 2131231420));
                imageView.setBackgroundColor(resources.getColor(com.digidust.elokence.akinator.freemium.R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(a1.getDrawable(context, resources2, 2131231420));
                imageView.setBackgroundColor(resources2.getColor(com.digidust.elokence.akinator.freemium.R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g0.f61757d, i10, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, com.digidust.elokence.akinator.freemium.R.layout.bm_exo_player_view);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(49, true);
                int i21 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i22 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i23 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i24 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z10 = z18;
                i11 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.B = typedArrayObtainStyledAttributes.getBoolean(16, this.B);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                z13 = z21;
                z11 = z19;
                z15 = z17;
                i18 = color;
                i12 = resourceId;
                i14 = resourceId2;
                i16 = i24;
                z12 = z20;
                i13 = integer;
                i19 = i21;
                z14 = zHasValue;
                i17 = i23;
                i15 = i22;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = com.digidust.elokence.akinator.freemium.R.layout.bm_exo_player_view;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 1;
            i18 = 0;
            z14 = false;
            z15 = true;
            i19 = 1;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_content_frame);
        this.f61695c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i16);
        }
        View viewFindViewById = findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_shutter);
        this.f61696e = viewFindViewById;
        if (viewFindViewById != null && z14) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout != null && i17 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i17 == 2) {
                this.f61697f = new TextureView(context);
            } else if (i17 == 3) {
                try {
                    int i25 = jo.k.f69867n;
                    this.f61697f = (View) jo.k.class.getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f61697f.setLayoutParams(layoutParams);
                    this.f61697f.setOnClickListener(aVar);
                    this.f61697f.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f61697f, 0);
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i17 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (a1.f60679a >= 34) {
                    b0.setSurfaceLifecycleToFollowsAttachment(surfaceView);
                }
                this.f61697f = surfaceView;
            } else {
                try {
                    int i26 = io.t.f68217c;
                    this.f61697f = (View) io.t.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f61697f.setLayoutParams(layoutParams);
            this.f61697f.setOnClickListener(aVar);
            this.f61697f.setClickable(false);
            aspectRatioFrameLayout.addView(this.f61697f, 0);
        } else {
            this.f61697f = null;
            z16 = false;
        }
        this.f61698g = z16;
        this.f61699h = a1.f60679a == 34 ? new f0() : null;
        this.f61706o = (FrameLayout) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_ad_overlay);
        this.f61707p = (FrameLayout) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_overlay);
        this.f61700i = (ImageView) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_image);
        this.f61716y = i15;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new com.unity3d.services.ads.offerwall.a(this, 1));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f61709r = cls;
        this.f61710s = method;
        this.f61711t = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_artwork);
        this.f61701j = imageView2;
        this.f61715x = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i14 != 0) {
            this.f61717z = m3.a.getDrawable(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_subtitles);
        this.f61702k = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_buffering);
        this.f61703l = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.A = i13;
        TextView textView = (TextView) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_error_message);
        this.f61704m = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        k kVar = (k) findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_controller);
        View viewFindViewById3 = findViewById(com.digidust.elokence.akinator.freemium.R.id.exo_controller_placeholder);
        if (kVar != null) {
            this.f61705n = kVar;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            k kVar2 = new k(context, null, 0, attributeSet);
            this.f61705n = kVar2;
            kVar2.setId(com.digidust.elokence.akinator.freemium.R.id.exo_controller);
            kVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(kVar2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f61705n = null;
        }
        k kVar3 = this.f61705n;
        this.D = kVar3 != null ? i11 : i20;
        this.G = z11;
        this.E = z12;
        this.F = z13;
        this.f61713v = (!z10 || kVar3 == null) ? i20 : 1;
        if (kVar3 != null) {
            kVar3.hideImmediately();
            this.f61705n.addVisibilityListener(this.f61694b);
        }
        if (z10) {
            setClickable(true);
        }
        k();
    }
}
