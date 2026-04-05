package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
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
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.j2;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o2;
import com.google.android.exoplayer2.p2;
import com.google.android.exoplayer2.q2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m0 extends FrameLayout implements b {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: b, reason: collision with root package name */
    public final a f28266b;

    /* renamed from: c, reason: collision with root package name */
    public final AspectRatioFrameLayout f28267c;

    /* renamed from: e, reason: collision with root package name */
    public final View f28268e;

    /* renamed from: f, reason: collision with root package name */
    public final View f28269f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28270g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f28271h;

    /* renamed from: i, reason: collision with root package name */
    public final SubtitleView f28272i;

    /* renamed from: j, reason: collision with root package name */
    public final View f28273j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f28274k;

    /* renamed from: l, reason: collision with root package name */
    public final u f28275l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f28276m;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f28277n;

    /* renamed from: o, reason: collision with root package name */
    public r2 f28278o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28279p;

    /* renamed from: q, reason: collision with root package name */
    public z f28280q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28281r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f28282s;

    /* renamed from: t, reason: collision with root package name */
    public int f28283t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28284u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f28285v;

    /* renamed from: w, reason: collision with root package name */
    public int f28286w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28287x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28288y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28289z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements p2, View.OnLayoutChangeListener, View.OnClickListener, z, s {

        /* renamed from: b, reason: collision with root package name */
        public final k3 f28290b = new k3();

        /* renamed from: c, reason: collision with root package name */
        public Object f28291c;

        public a() {
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.k kVar) {
            super.onAudioAttributesChanged(kVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
            super.onAudioSessionIdChanged(i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(n2 n2Var) {
            super.onAvailableCommandsChanged(n2Var);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10 = m0.B;
            m0.this.f();
        }

        @Override // com.google.android.exoplayer2.p2
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues((List<ef.b>) list);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.q qVar) {
            super.onDeviceInfoChanged(qVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            super.onDeviceVolumeChanged(i10, z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onEvents(r2 r2Var, o2 o2Var) {
            super.onEvents(r2Var, o2Var);
        }

        @Override // com.google.android.exoplayer2.ui.s
        public void onFullScreenModeChanged(boolean z10) {
            int i10 = m0.B;
            m0.this.getClass();
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
            super.onIsLoadingChanged(z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z10) {
            super.onIsPlayingChanged(z10);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            m0.a((TextureView) view, m0.this.A);
        }

        @Override // com.google.android.exoplayer2.p2
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
            super.onLoadingChanged(z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            super.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onMediaItemTransition(u1 u1Var, int i10) {
            super.onMediaItemTransition(u1Var, i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(w1 w1Var) {
            super.onMediaMetadataChanged(w1Var);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
            super.onMetadata(metadata);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            int i11 = m0.B;
            m0 m0Var = m0.this;
            m0Var.h();
            if (m0Var.b() && m0Var.f28288y) {
                m0Var.hideController();
            } else {
                m0Var.c(false);
            }
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(l2 l2Var) {
            super.onPlaybackParametersChanged(l2Var);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onPlaybackStateChanged(int i10) {
            int i11 = m0.B;
            m0 m0Var = m0.this;
            m0Var.h();
            m0Var.j();
            if (m0Var.b() && m0Var.f28288y) {
                m0Var.hideController();
            } else {
                m0Var.c(false);
            }
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            super.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onPlayerError(j2 j2Var) {
            super.onPlayerError(j2Var);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(j2 j2Var) {
            super.onPlayerErrorChanged(j2Var);
        }

        @Override // com.google.android.exoplayer2.p2
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            super.onPlayerStateChanged(z10, i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(w1 w1Var) {
            super.onPlaylistMetadataChanged(w1Var);
        }

        @Override // com.google.android.exoplayer2.p2
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
            super.onPositionDiscontinuity(i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onRenderedFirstFrame() {
            View view = m0.this.f28268e;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
            super.onRepeatModeChanged(i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            super.onSeekBackIncrementChanged(j10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            super.onSeekForwardIncrementChanged(j10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            super.onShuffleModeEnabledChanged(z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            super.onSkipSilenceEnabledChanged(z10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            super.onSurfaceSizeChanged(i10, i11);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onTimelineChanged(m3 m3Var, int i10) {
            super.onTimelineChanged(m3Var, i10);
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(pf.s sVar) {
            super.onTrackSelectionParametersChanged(sVar);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onTracksChanged(n3 n3Var) {
            m0 m0Var = m0.this;
            r2 r2Var = (r2) com.google.android.exoplayer2.util.a.checkNotNull(m0Var.f28278o);
            m3 currentTimeline = r2Var.getCurrentTimeline();
            if (currentTimeline.isEmpty()) {
                this.f28291c = null;
            } else {
                boolean zIsEmpty = r2Var.getCurrentTracks().isEmpty();
                k3 k3Var = this.f28290b;
                if (zIsEmpty) {
                    Object obj = this.f28291c;
                    if (obj != null) {
                        int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                        if (indexOfPeriod != -1) {
                            if (r2Var.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, k3Var).f27598e) {
                                return;
                            }
                        }
                        this.f28291c = null;
                    }
                } else {
                    this.f28291c = currentTimeline.getPeriod(r2Var.getCurrentPeriodIndex(), k3Var, true).f27597c;
                }
            }
            m0Var.k(false);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onVideoSizeChanged(sf.x xVar) {
            int i10 = m0.B;
            m0.this.g();
        }

        @Override // com.google.android.exoplayer2.ui.z
        public void onVisibilityChange(int i10) {
            int i11 = m0.B;
            m0 m0Var = m0.this;
            m0Var.i();
            m0Var.getClass();
        }

        @Override // com.google.android.exoplayer2.p2
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
            super.onVolumeChanged(f10);
        }

        @Override // com.google.android.exoplayer2.p2
        public void onCues(ef.e eVar) {
            SubtitleView subtitleView = m0.this.f28272i;
            if (subtitleView != null) {
                subtitleView.setCues(eVar.f54311b);
            }
        }

        @Override // com.google.android.exoplayer2.p2
        public void onPositionDiscontinuity(q2 q2Var, q2 q2Var2, int i10) {
            int i11 = m0.B;
            m0 m0Var = m0.this;
            if (m0Var.b() && m0Var.f28288y) {
                m0Var.hideController();
            }
        }
    }

    public m0(Context context) {
        this(context, null);
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public static void switchTargetView(r2 r2Var, m0 m0Var, m0 m0Var2) {
        if (m0Var == m0Var2) {
            return;
        }
        if (m0Var2 != null) {
            m0Var2.setPlayer(r2Var);
        }
        if (m0Var != null) {
            m0Var.setPlayer(null);
        }
    }

    public final boolean b() {
        r2 r2Var = this.f28278o;
        return r2Var != null && r2Var.isPlayingAd() && this.f28278o.getPlayWhenReady();
    }

    public final void c(boolean z10) {
        if (!(b() && this.f28288y) && l()) {
            u uVar = this.f28275l;
            boolean z11 = uVar.isFullyVisible() && uVar.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if ((z10 || z11 || zE) && l()) {
                uVar.setShowTimeoutMs(zE ? 0 : this.f28286w);
                uVar.show();
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f28267c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                ImageView imageView = this.f28271h;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r2 r2Var = this.f28278o;
        if (r2Var != null && r2Var.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        if (z10 && l() && !this.f28275l.isFullyVisible()) {
            c(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            c(true);
            return true;
        }
        if (z10 && l()) {
            c(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return l() && this.f28275l.dispatchMediaKeyEvent(keyEvent);
    }

    public final boolean e() {
        r2 r2Var = this.f28278o;
        if (r2Var == null) {
            return true;
        }
        int playbackState = r2Var.getPlaybackState();
        if (!this.f28287x || this.f28278o.getCurrentTimeline().isEmpty()) {
            return false;
        }
        return playbackState == 1 || playbackState == 4 || !((r2) com.google.android.exoplayer2.util.a.checkNotNull(this.f28278o)).getPlayWhenReady();
    }

    public final void f() {
        if (!l() || this.f28278o == null) {
            return;
        }
        u uVar = this.f28275l;
        if (!uVar.isFullyVisible()) {
            c(true);
        } else if (this.f28289z) {
            uVar.hide();
        }
    }

    public final void g() {
        r2 r2Var = this.f28278o;
        sf.x videoSize = r2Var != null ? r2Var.getVideoSize() : sf.x.f85734g;
        int i10 = videoSize.f85739b;
        int i11 = videoSize.f85740c;
        int i12 = videoSize.f85741e;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f85742f) / i11;
        View view = this.f28269f;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            int i13 = this.A;
            a aVar = this.f28266b;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(aVar);
            }
            this.A = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(aVar);
            }
            a((TextureView) view, this.A);
        }
        float f11 = this.f28270g ? 0.0f : f10;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f28267c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    @Override // com.google.android.exoplayer2.ui.b
    public List<com.google.android.exoplayer2.ui.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f28277n;
        if (frameLayout != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        u uVar = this.f28275l;
        if (uVar != null) {
            arrayList.add(new com.google.android.exoplayer2.ui.a(uVar, 1));
        }
        return b5.copyOf((Collection) arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.b
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f28276m, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f28287x;
    }

    public boolean getControllerHideOnTouch() {
        return this.f28289z;
    }

    public int getControllerShowTimeoutMs() {
        return this.f28286w;
    }

    public Drawable getDefaultArtwork() {
        return this.f28282s;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f28277n;
    }

    public r2 getPlayer() {
        return this.f28278o;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f28267c;
        com.google.android.exoplayer2.util.a.checkStateNotNull(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f28272i;
    }

    public boolean getUseArtwork() {
        return this.f28281r;
    }

    public boolean getUseController() {
        return this.f28279p;
    }

    public View getVideoSurfaceView() {
        return this.f28269f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r5 = this;
            android.view.View r0 = r5.f28273j
            if (r0 == 0) goto L29
            com.google.android.exoplayer2.r2 r1 = r5.f28278o
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.getPlaybackState()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.f28283t
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            com.google.android.exoplayer2.r2 r1 = r5.f28278o
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.m0.h():void");
    }

    public void hideController() {
        u uVar = this.f28275l;
        if (uVar != null) {
            uVar.hide();
        }
    }

    public final void i() {
        u uVar = this.f28275l;
        if (uVar == null || !this.f28279p) {
            setContentDescription(null);
        } else if (uVar.isFullyVisible()) {
            setContentDescription(this.f28289z ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public boolean isControllerFullyVisible() {
        u uVar = this.f28275l;
        return uVar != null && uVar.isFullyVisible();
    }

    public final void j() {
        TextView textView = this.f28274k;
        if (textView != null) {
            CharSequence charSequence = this.f28285v;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                r2 r2Var = this.f28278o;
                if (r2Var != null) {
                    r2Var.getPlayerError();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void k(boolean z10) {
        r2 r2Var = this.f28278o;
        View view = this.f28268e;
        ImageView imageView = this.f28271h;
        boolean zD = false;
        if (r2Var == null || r2Var.getCurrentTracks().isEmpty()) {
            if (this.f28284u) {
                return;
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (z10 && !this.f28284u && view != null) {
            view.setVisibility(0);
        }
        if (r2Var.getCurrentTracks().isTypeSelected(2)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f28281r) {
            com.google.android.exoplayer2.util.a.checkStateNotNull(imageView);
            byte[] bArr = r2Var.getMediaMetadata().f28672l;
            if (bArr != null) {
                zD = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (zD || d(this.f28282s)) {
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    public final boolean l() {
        if (!this.f28279p) {
            return false;
        }
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f28275l);
        return true;
    }

    public void onPause() {
        View view = this.f28269f;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.f28269f;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!l() || this.f28278o == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        f();
        return super.performClick();
    }

    public void setAspectRatioListener(c cVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f28267c;
        com.google.android.exoplayer2.util.a.checkStateNotNull(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(cVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f28287x = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f28288y = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f28275l);
        this.f28289z = z10;
        i();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(s sVar) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setOnFullScreenModeChangedListener(sVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        this.f28286w = i10;
        if (uVar.isFullyVisible()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(n0 n0Var) {
        setControllerVisibilityListener((z) null);
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        com.google.android.exoplayer2.util.a.checkState(this.f28274k != null);
        this.f28285v = charSequence;
        j();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f28282s != drawable) {
            this.f28282s = drawable;
            k(false);
        }
    }

    public void setErrorMessageProvider(com.google.android.exoplayer2.util.m mVar) {
        if (mVar != null) {
            j();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(o0 o0Var) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setOnFullScreenModeChangedListener(this.f28266b);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f28284u != z10) {
            this.f28284u = z10;
            k(false);
        }
    }

    public void setPlayer(r2 r2Var) {
        com.google.android.exoplayer2.util.a.checkState(Looper.myLooper() == Looper.getMainLooper());
        com.google.android.exoplayer2.util.a.checkArgument(r2Var == null || r2Var.getApplicationLooper() == Looper.getMainLooper());
        r2 r2Var2 = this.f28278o;
        if (r2Var2 == r2Var) {
            return;
        }
        View view = this.f28269f;
        a aVar = this.f28266b;
        if (r2Var2 != null) {
            r2Var2.removeListener(aVar);
            if (view instanceof TextureView) {
                r2Var2.clearVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                r2Var2.clearVideoSurfaceView((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.f28272i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f28278o = r2Var;
        if (l()) {
            this.f28275l.setPlayer(r2Var);
        }
        h();
        j();
        k(true);
        if (r2Var == null) {
            hideController();
            return;
        }
        if (r2Var.isCommandAvailable(27)) {
            if (view instanceof TextureView) {
                r2Var.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                r2Var.setVideoSurfaceView((SurfaceView) view);
            }
            g();
        }
        if (subtitleView != null && r2Var.isCommandAvailable(28)) {
            subtitleView.setCues(r2Var.getCurrentCues().f54311b);
        }
        r2Var.addListener(aVar);
        c(false);
    }

    public void setRepeatToggleModes(int i10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f28267c;
        com.google.android.exoplayer2.util.a.checkStateNotNull(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f28283t != i10) {
            this.f28283t = i10;
            h();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        uVar.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f28268e;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState((z10 && this.f28271h == null) ? false : true);
        if (this.f28281r != z10) {
            this.f28281r = z10;
            k(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkState((z10 && uVar == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f28279p == z10) {
            return;
        }
        this.f28279p = z10;
        if (l()) {
            uVar.setPlayer(this.f28278o);
        } else if (uVar != null) {
            uVar.hide();
            uVar.setPlayer(null);
        }
        i();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f28269f;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void showController() {
        boolean zE = e();
        if (l()) {
            int i10 = zE ? 0 : this.f28286w;
            u uVar = this.f28275l;
            uVar.setShowTimeoutMs(i10);
            uVar.show();
        }
    }

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(z zVar) {
        u uVar = this.f28275l;
        com.google.android.exoplayer2.util.a.checkStateNotNull(uVar);
        z zVar2 = this.f28280q;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 != null) {
            uVar.removeVisibilityListener(zVar2);
        }
        this.f28280q = zVar;
        if (zVar != null) {
            uVar.addVisibilityListener(zVar);
        }
        setControllerVisibilityListener((n0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int color;
        boolean zHasValue;
        boolean z13;
        int resourceId;
        int i15;
        boolean z14;
        boolean z15;
        int i16;
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f28266b = aVar;
        if (isInEditMode()) {
            this.f28267c = null;
            this.f28268e = null;
            this.f28269f = null;
            this.f28270g = false;
            this.f28271h = null;
            this.f28272i = null;
            this.f28273j = null;
            this.f28274k = null;
            this.f28275l = null;
            this.f28276m = null;
            this.f28277n = null;
            ImageView imageView = new ImageView(context);
            if (n1.f28506a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231420, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231420));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.f28230d, i10, 0);
            try {
                zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
                color = typedArrayObtainStyledAttributes.getColor(27, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(14, R.layout.exo_styled_player_view);
                z13 = typedArrayObtainStyledAttributes.getBoolean(32, true);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, 0);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, true);
                i13 = typedArrayObtainStyledAttributes.getInt(28, 1);
                int i17 = typedArrayObtainStyledAttributes.getInt(16, 0);
                int i18 = typedArrayObtainStyledAttributes.getInt(25, 5000);
                z11 = typedArrayObtainStyledAttributes.getBoolean(10, true);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(3, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(22, 0);
                this.f28284u = typedArrayObtainStyledAttributes.getBoolean(11, this.f28284u);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(9, true);
                typedArrayObtainStyledAttributes.recycle();
                i12 = i17;
                z10 = z16;
                z12 = z17;
                i11 = i18;
                i15 = resourceId2;
                z14 = z18;
                i14 = integer;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            z10 = true;
            i12 = 0;
            z11 = true;
            i13 = 1;
            z12 = true;
            i14 = 0;
            color = 0;
            zHasValue = false;
            z13 = true;
            resourceId = 0;
            i15 = R.layout.exo_styled_player_view;
            z14 = true;
        }
        LayoutInflater.from(context).inflate(i15, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f28267c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i12);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f28268e = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (aspectRatioFrameLayout != null && i13 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 == 2) {
                this.f28269f = new TextureView(context);
            } else if (i13 == 3) {
                try {
                    int i19 = tf.k.f86887n;
                    this.f28269f = (View) tf.k.class.getConstructor(Context.class).newInstance(context);
                    z15 = true;
                    this.f28269f.setLayoutParams(layoutParams);
                    this.f28269f.setOnClickListener(aVar);
                    this.f28269f.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f28269f, 0);
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i13 != 4) {
                this.f28269f = new SurfaceView(context);
            } else {
                try {
                    int i20 = sf.j.f85683c;
                    this.f28269f = (View) sf.j.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z15 = false;
            this.f28269f.setLayoutParams(layoutParams);
            this.f28269f.setOnClickListener(aVar);
            this.f28269f.setClickable(false);
            aspectRatioFrameLayout.addView(this.f28269f, 0);
        } else {
            this.f28269f = null;
            z15 = false;
        }
        this.f28270g = z15;
        this.f28276m = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f28277n = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f28271h = imageView2;
        this.f28281r = z13 && imageView2 != null;
        if (resourceId != 0) {
            this.f28282s = m3.a.getDrawable(getContext(), resourceId);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f28272i = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f28273j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f28283t = i14;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f28274k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        u uVar = (u) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (uVar != null) {
            this.f28275l = uVar;
            i16 = 0;
        } else if (viewFindViewById3 != null) {
            i16 = 0;
            u uVar2 = new u(context, null, 0, attributeSet);
            this.f28275l = uVar2;
            uVar2.setId(R.id.exo_controller);
            uVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(uVar2, iIndexOfChild);
        } else {
            i16 = 0;
            this.f28275l = null;
        }
        u uVar3 = this.f28275l;
        this.f28286w = uVar3 != null ? i11 : i16;
        this.f28289z = z11;
        this.f28287x = z12;
        this.f28288y = z14;
        this.f28279p = (!z10 || uVar3 == null) ? i16 : 1;
        if (uVar3 != null) {
            uVar3.hideImmediately();
            this.f28275l.addVisibilityListener(aVar);
        }
        if (z10) {
            setClickable(true);
        }
        i();
    }
}
