package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u extends FrameLayout {

    /* renamed from: z0, reason: collision with root package name */
    public static final float[] f28329z0;
    public final ImageView A;
    public final View B;
    public final View C;
    public final View D;
    public final TextView E;
    public final TextView F;
    public final t0 G;
    public final StringBuilder H;
    public final Formatter I;
    public final k3 J;
    public final l3 K;
    public final a2.s L;
    public final Drawable M;
    public final Drawable N;
    public final Drawable O;
    public final String P;
    public final String Q;
    public final String R;
    public final Drawable S;
    public final Drawable T;
    public final float U;
    public final float V;
    public final String W;

    /* renamed from: a0, reason: collision with root package name */
    public final String f28330a0;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f28331b;

    /* renamed from: b0, reason: collision with root package name */
    public final Drawable f28332b0;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f28333c;

    /* renamed from: c0, reason: collision with root package name */
    public final Drawable f28334c0;

    /* renamed from: d0, reason: collision with root package name */
    public final String f28335d0;

    /* renamed from: e, reason: collision with root package name */
    public final r f28336e;

    /* renamed from: e0, reason: collision with root package name */
    public final String f28337e0;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f28338f;

    /* renamed from: f0, reason: collision with root package name */
    public final Drawable f28339f0;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f28340g;

    /* renamed from: g0, reason: collision with root package name */
    public final Drawable f28341g0;

    /* renamed from: h, reason: collision with root package name */
    public final c f28342h;

    /* renamed from: h0, reason: collision with root package name */
    public final String f28343h0;

    /* renamed from: i, reason: collision with root package name */
    public final a f28344i;

    /* renamed from: i0, reason: collision with root package name */
    public final String f28345i0;

    /* renamed from: j, reason: collision with root package name */
    public final w f28346j;

    /* renamed from: j0, reason: collision with root package name */
    public r2 f28347j0;

    /* renamed from: k, reason: collision with root package name */
    public final q f28348k;

    /* renamed from: k0, reason: collision with root package name */
    public s f28349k0;

    /* renamed from: l, reason: collision with root package name */
    public final i f28350l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f28351l0;

    /* renamed from: m, reason: collision with root package name */
    public final PopupWindow f28352m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f28353m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f28354n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f28355n0;

    /* renamed from: o, reason: collision with root package name */
    public final View f28356o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f28357o0;

    /* renamed from: p, reason: collision with root package name */
    public final View f28358p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f28359p0;

    /* renamed from: q, reason: collision with root package name */
    public final View f28360q;

    /* renamed from: q0, reason: collision with root package name */
    public int f28361q0;

    /* renamed from: r, reason: collision with root package name */
    public final View f28362r;

    /* renamed from: r0, reason: collision with root package name */
    public int f28363r0;

    /* renamed from: s, reason: collision with root package name */
    public final View f28364s;

    /* renamed from: s0, reason: collision with root package name */
    public int f28365s0;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f28366t;

    /* renamed from: t0, reason: collision with root package name */
    public long[] f28367t0;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f28368u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean[] f28369u0;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f28370v;

    /* renamed from: v0, reason: collision with root package name */
    public long[] f28371v0;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f28372w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean[] f28373w0;

    /* renamed from: x, reason: collision with root package name */
    public final View f28374x;

    /* renamed from: x0, reason: collision with root package name */
    public long f28375x0;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f28376y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f28377y0;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f28378z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends RecyclerView.a {

        /* renamed from: i, reason: collision with root package name */
        public final String[] f28379i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f28380j;

        /* renamed from: k, reason: collision with root package name */
        public int f28381k;

        public a(String[] strArr, float[] fArr) {
            this.f28379i = strArr;
            this.f28380j = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.f28379i.length;
        }

        public String getSelectedText() {
            return this.f28379i[this.f28381k];
        }

        public void updateSelectedIndex(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f28380j;
                if (i10 >= fArr.length) {
                    this.f28381k = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(d dVar, int i10) {
            String[] strArr = this.f28379i;
            if (i10 < strArr.length) {
                dVar.f28391c.setText(strArr[i10]);
            }
            if (i10 == this.f28381k) {
                dVar.itemView.setSelected(true);
                dVar.f28392d.setVisibility(0);
            } else {
                dVar.itemView.setSelected(false);
                dVar.f28392d.setVisibility(4);
            }
            dVar.itemView.setOnClickListener(new t(this, i10, 0));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public d onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new d(LayoutInflater.from(u.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends RecyclerView.n {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f28383c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f28384d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f28385e;

        public b(View view) {
            super(view);
            if (n1.f28506a < 26) {
                view.setFocusable(true);
            }
            this.f28383c = (TextView) view.findViewById(R.id.exo_main_text);
            this.f28384d = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f28385e = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 3));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends RecyclerView.a {

        /* renamed from: i, reason: collision with root package name */
        public final String[] f28387i;

        /* renamed from: j, reason: collision with root package name */
        public final String[] f28388j;

        /* renamed from: k, reason: collision with root package name */
        public final Drawable[] f28389k;

        public c(String[] strArr, Drawable[] drawableArr) {
            this.f28387i = strArr;
            this.f28388j = new String[strArr.length];
            this.f28389k = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.f28387i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public long getItemId(int i10) {
            return i10;
        }

        public void setSubTextAtPosition(int i10, String str) {
            this.f28388j[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(b bVar, int i10) {
            TextView textView = bVar.f28383c;
            ImageView imageView = bVar.f28385e;
            TextView textView2 = bVar.f28384d;
            textView.setText(this.f28387i[i10]);
            String str = this.f28388j[i10];
            if (str == null) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str);
            }
            Drawable drawable = this.f28389k[i10];
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            u uVar = u.this;
            return uVar.new b(LayoutInflater.from(uVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends RecyclerView.n {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f28391c;

        /* renamed from: d, reason: collision with root package name */
        public final View f28392d;

        public d(View view) {
            super(view);
            if (n1.f28506a < 26) {
                view.setFocusable(true);
            }
            this.f28391c = (TextView) view.findViewById(R.id.exo_text);
            this.f28392d = view.findViewById(R.id.exo_check);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final n3.a f28393a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28394b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28395c;

        public e(n3 n3Var, int i10, int i11, String str) {
            this.f28393a = (n3.a) n3Var.getGroups().get(i10);
            this.f28394b = i11;
            this.f28395c = str;
        }

        public boolean isSelected() {
            return this.f28393a.isTrackSelected(this.f28394b);
        }
    }

    static {
        com.google.android.exoplayer2.w0.registerModule("goog.exo.ui");
        f28329z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public u(Context context) {
        this(context, null);
    }

    public static void a(u uVar) {
        String str = uVar.f28345i0;
        Drawable drawable = uVar.f28341g0;
        String str2 = uVar.f28343h0;
        Drawable drawable2 = uVar.f28339f0;
        if (uVar.f28349k0 == null) {
            return;
        }
        boolean z10 = uVar.f28351l0;
        uVar.f28351l0 = !z10;
        ImageView imageView = uVar.f28378z;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        ImageView imageView2 = uVar.A;
        boolean z11 = uVar.f28351l0;
        if (imageView2 != null) {
            if (z11) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        s sVar = uVar.f28349k0;
        if (sVar != null) {
            sVar.onFullScreenModeChanged(uVar.f28351l0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        r2 r2Var = this.f28347j0;
        if (r2Var == null) {
            return;
        }
        r2Var.setPlaybackParameters(r2Var.getPlaybackParameters().withSpeed(f10));
    }

    @Deprecated
    public void addVisibilityListener(z zVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(zVar);
        this.f28338f.add(zVar);
    }

    public final void c(RecyclerView.a aVar, View view) {
        this.f28340g.setAdapter(aVar);
        k();
        this.f28377y0 = false;
        PopupWindow popupWindow = this.f28352m;
        popupWindow.dismiss();
        this.f28377y0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.f28354n;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    public final b5 d(n3 n3Var, int i10) {
        x4 x4Var = new x4();
        b5 groups = n3Var.getGroups();
        for (int i11 = 0; i11 < groups.size(); i11++) {
            n3.a aVar = (n3.a) groups.get(i11);
            if (aVar.getType() == i10) {
                for (int i12 = 0; i12 < aVar.f27838b; i12++) {
                    if (aVar.isTrackSupported(i12)) {
                        com.google.android.exoplayer2.z0 trackFormat = aVar.getTrackFormat(i12);
                        if ((trackFormat.f28794f & 2) == 0) {
                            x4Var.add((Object) new e(n3Var, i11, i12, this.f28350l.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return x4Var.build();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        r2 r2Var = this.f28347j0;
        if (r2Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (r2Var.getPlaybackState() != 4) {
                    r2Var.seekForward();
                }
            } else if (keyCode == 89) {
                r2Var.seekBack();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    int playbackState = r2Var.getPlaybackState();
                    if (playbackState == 1 || playbackState == 4 || !r2Var.getPlayWhenReady()) {
                        int playbackState2 = r2Var.getPlaybackState();
                        if (playbackState2 == 1) {
                            r2Var.prepare();
                        } else if (playbackState2 == 4) {
                            r2Var.seekTo(r2Var.getCurrentMediaItemIndex(), C.TIME_UNSET);
                        }
                        r2Var.play();
                    } else {
                        r2Var.pause();
                    }
                } else if (keyCode == 87) {
                    r2Var.seekToNext();
                } else if (keyCode == 88) {
                    r2Var.seekToPrevious();
                } else if (keyCode == 126) {
                    int playbackState3 = r2Var.getPlaybackState();
                    if (playbackState3 == 1) {
                        r2Var.prepare();
                    } else if (playbackState3 == 4) {
                        r2Var.seekTo(r2Var.getCurrentMediaItemIndex(), C.TIME_UNSET);
                    }
                    r2Var.play();
                } else if (keyCode == 127) {
                    r2Var.pause();
                }
            }
        }
        return true;
    }

    public final void e() {
        h();
        g();
        j();
        l();
        n();
        r2 r2Var = this.f28347j0;
        if (r2Var != null) {
            float f10 = r2Var.getPlaybackParameters().f27637b;
            a aVar = this.f28344i;
            aVar.updateSelectedIndex(f10);
            this.f28342h.setSubTextAtPosition(0, aVar.getSelectedText());
        }
        m();
    }

    public final void f(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.U : this.V);
    }

    public final void g() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.f28353m0) {
            r2 r2Var = this.f28347j0;
            if (r2Var != null) {
                zIsCommandAvailable = r2Var.isCommandAvailable(5);
                zIsCommandAvailable3 = r2Var.isCommandAvailable(7);
                zIsCommandAvailable4 = r2Var.isCommandAvailable(11);
                zIsCommandAvailable5 = r2Var.isCommandAvailable(12);
                zIsCommandAvailable2 = r2Var.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            Resources resources = this.f28333c;
            View view = this.f28364s;
            if (zIsCommandAvailable4) {
                r2 r2Var2 = this.f28347j0;
                int seekBackIncrement = (int) ((r2Var2 != null ? r2Var2.getSeekBackIncrement() : 5000L) / 1000);
                TextView textView = this.f28368u;
                if (textView != null) {
                    textView.setText(String.valueOf(seekBackIncrement));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
                }
            }
            View view2 = this.f28362r;
            if (zIsCommandAvailable5) {
                r2 r2Var3 = this.f28347j0;
                int seekForwardIncrement = (int) ((r2Var3 != null ? r2Var3.getSeekForwardIncrement() : MBInterstitialActivity.WEB_LOAD_TIME) / 1000);
                TextView textView2 = this.f28366t;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(seekForwardIncrement));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
                }
            }
            f(this.f28356o, zIsCommandAvailable3);
            f(view, zIsCommandAvailable4);
            f(view2, zIsCommandAvailable5);
            f(this.f28358p, zIsCommandAvailable2);
            t0 t0Var = this.G;
            if (t0Var != null) {
                t0Var.setEnabled(zIsCommandAvailable);
            }
        }
    }

    public r2 getPlayer() {
        return this.f28347j0;
    }

    public int getRepeatToggleModes() {
        return this.f28365s0;
    }

    public boolean getShowShuffleButton() {
        return this.f28331b.getShowButton(this.f28372w);
    }

    public boolean getShowSubtitleButton() {
        return this.f28331b.getShowButton(this.f28376y);
    }

    public int getShowTimeoutMs() {
        return this.f28361q0;
    }

    public boolean getShowVrButton() {
        return this.f28331b.getShowButton(this.f28374x);
    }

    public final void h() {
        View view;
        if (isVisible() && this.f28353m0 && (view = this.f28360q) != null) {
            r2 r2Var = this.f28347j0;
            Resources resources = this.f28333c;
            if (r2Var == null || r2Var.getPlaybackState() == 4 || this.f28347j0.getPlaybackState() == 1 || !this.f28347j0.getPlayWhenReady()) {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_play));
                view.setContentDescription(resources.getString(R.string.exo_controls_play_description));
            } else {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_pause));
                view.setContentDescription(resources.getString(R.string.exo_controls_pause_description));
            }
        }
    }

    public void hide() {
        this.f28331b.hide();
    }

    public void hideImmediately() {
        this.f28331b.hideImmediately();
    }

    public final void i() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.f28353m0) {
            r2 r2Var = this.f28347j0;
            if (r2Var != null) {
                contentPosition = r2Var.getContentPosition() + this.f28375x0;
                contentBufferedPosition = r2Var.getContentBufferedPosition() + this.f28375x0;
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            TextView textView = this.F;
            if (textView != null && !this.f28359p0) {
                textView.setText(n1.getStringForTime(this.H, this.I, contentPosition));
            }
            t0 t0Var = this.G;
            if (t0Var != null) {
                t0Var.setPosition(contentPosition);
                t0Var.setBufferedPosition(contentBufferedPosition);
            }
            a2.s sVar = this.L;
            removeCallbacks(sVar);
            int playbackState = r2Var == null ? 1 : r2Var.getPlaybackState();
            if (r2Var != null && r2Var.isPlaying()) {
                long jMin = Math.min(t0Var != null ? t0Var.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f10 = r2Var.getPlaybackParameters().f27637b;
                postDelayed(sVar, n1.constrainValue(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f28363r0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(sVar, 1000L);
            }
        }
    }

    public boolean isAnimationEnabled() {
        return this.f28331b.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.f28331b.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public final void j() {
        ImageView imageView;
        if (isVisible() && this.f28353m0 && (imageView = this.f28370v) != null) {
            if (this.f28365s0 == 0) {
                f(imageView, false);
                return;
            }
            r2 r2Var = this.f28347j0;
            String str = this.P;
            Drawable drawable = this.M;
            if (r2Var == null) {
                f(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true);
            int repeatMode = r2Var.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.N);
                imageView.setContentDescription(this.Q);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.O);
                imageView.setContentDescription(this.R);
            }
        }
    }

    public final void k() {
        RecyclerView recyclerView = this.f28340g;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.f28354n;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.f28352m;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void l() {
        ImageView imageView;
        if (isVisible() && this.f28353m0 && (imageView = this.f28372w) != null) {
            r2 r2Var = this.f28347j0;
            if (!this.f28331b.getShowButton(imageView)) {
                f(imageView, false);
                return;
            }
            String str = this.f28330a0;
            Drawable drawable = this.T;
            if (r2Var == null) {
                f(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true);
            if (r2Var.getShuffleModeEnabled()) {
                drawable = this.S;
            }
            imageView.setImageDrawable(drawable);
            if (r2Var.getShuffleModeEnabled()) {
                str = this.W;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[EDGE_INSN: B:17:0x0037->B:18:0x0038 BREAK  A[LOOP:0: B:11:0x0025->B:15:0x0032]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.u.m():void");
    }

    public final void n() {
        w wVar = this.f28346j;
        wVar.getClass();
        List list = Collections.EMPTY_LIST;
        wVar.f28405i = list;
        q qVar = this.f28348k;
        qVar.getClass();
        qVar.f28405i = list;
        r2 r2Var = this.f28347j0;
        ImageView imageView = this.f28376y;
        if (r2Var != null && r2Var.isCommandAvailable(30) && this.f28347j0.isCommandAvailable(29)) {
            n3 currentTracks = this.f28347j0.getCurrentTracks();
            qVar.init(d(currentTracks, 1));
            if (this.f28331b.getShowButton(imageView)) {
                wVar.init(d(currentTracks, 3));
            } else {
                wVar.init(b5.of());
            }
        }
        f(imageView, wVar.getItemCount() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l0 l0Var = this.f28331b;
        l0Var.onAttachedToWindow();
        this.f28353m0 = true;
        if (isFullyVisible()) {
            l0Var.resetHideCallbacks();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.f28331b;
        l0Var.onDetachedFromWindow();
        this.f28353m0 = false;
        removeCallbacks(this.L);
        l0Var.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f28331b.onLayout(z10, i10, i11, i12, i13);
    }

    @Deprecated
    public void removeVisibilityListener(z zVar) {
        this.f28338f.remove(zVar);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f28331b.setAnimationEnabled(z10);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.f28371v0 = new long[0];
            this.f28373w0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) com.google.android.exoplayer2.util.a.checkNotNull(zArr);
            com.google.android.exoplayer2.util.a.checkArgument(jArr.length == zArr2.length);
            this.f28371v0 = jArr;
            this.f28373w0 = zArr2;
        }
        m();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(s sVar) {
        this.f28349k0 = sVar;
        boolean z10 = sVar != null;
        ImageView imageView = this.f28378z;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z11 = sVar != null;
        ImageView imageView2 = this.A;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(r2 r2Var) {
        com.google.android.exoplayer2.util.a.checkState(Looper.myLooper() == Looper.getMainLooper());
        com.google.android.exoplayer2.util.a.checkArgument(r2Var == null || r2Var.getApplicationLooper() == Looper.getMainLooper());
        r2 r2Var2 = this.f28347j0;
        if (r2Var2 == r2Var) {
            return;
        }
        r rVar = this.f28336e;
        if (r2Var2 != null) {
            r2Var2.removeListener(rVar);
        }
        this.f28347j0 = r2Var;
        if (r2Var != null) {
            r2Var.addListener(rVar);
        }
        e();
    }

    public void setRepeatToggleModes(int i10) {
        this.f28365s0 = i10;
        r2 r2Var = this.f28347j0;
        if (r2Var != null) {
            int repeatMode = r2Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.f28347j0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.f28347j0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.f28347j0.setRepeatMode(2);
            }
        }
        this.f28331b.setShowButton(this.f28370v, i10 != 0);
        j();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f28331b.setShowButton(this.f28362r, z10);
        g();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f28355n0 = z10;
        m();
    }

    public void setShowNextButton(boolean z10) {
        this.f28331b.setShowButton(this.f28358p, z10);
        g();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f28331b.setShowButton(this.f28356o, z10);
        g();
    }

    public void setShowRewindButton(boolean z10) {
        this.f28331b.setShowButton(this.f28364s, z10);
        g();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f28331b.setShowButton(this.f28372w, z10);
        l();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f28331b.setShowButton(this.f28376y, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f28361q0 = i10;
        if (isFullyVisible()) {
            this.f28331b.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f28331b.setShowButton(this.f28374x, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f28363r0 = n1.constrainValue(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f28374x;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            f(view, onClickListener != null);
        }
    }

    public void show() {
        this.f28331b.show();
    }

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public u(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public u(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) throws Resources.NotFoundException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        r rVar;
        boolean z18;
        boolean z19;
        ImageView imageView;
        TextView textView;
        boolean z20;
        super(context, attributeSet, i10);
        this.f28361q0 = 5000;
        this.f28365s0 = 0;
        this.f28363r0 = 200;
        int resourceId = R.layout.exo_styled_player_control_view;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.f28229c, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f28361q0 = typedArrayObtainStyledAttributes.getInt(21, this.f28361q0);
                this.f28365s0 = typedArrayObtainStyledAttributes.getInt(9, this.f28365s0);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(18, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(19, false);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(20, false);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(23, this.f28363r0));
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                z12 = z26;
                z10 = z27;
                z16 = z23;
                z17 = z24;
                z14 = z21;
                z13 = z28;
                z11 = z25;
                z15 = z22;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        r rVar2 = new r(this);
        this.f28336e = rVar2;
        this.f28338f = new CopyOnWriteArrayList();
        this.J = new k3();
        this.K = new l3();
        StringBuilder sb2 = new StringBuilder();
        this.H = sb2;
        this.I = new Formatter(sb2, Locale.getDefault());
        this.f28367t0 = new long[0];
        this.f28369u0 = new boolean[0];
        this.f28371v0 = new long[0];
        this.f28373w0 = new boolean[0];
        this.L = new a2.s(this, 20);
        this.E = (TextView) findViewById(R.id.exo_duration);
        this.F = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f28376y = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(rVar2);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f28378z = imageView3;
        com.applovin.mediation.nativeAds.a aVar = new com.applovin.mediation.nativeAds.a(this, 1);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(aVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.A = imageView4;
        com.applovin.mediation.nativeAds.a aVar2 = new com.applovin.mediation.nativeAds.a(this, 1);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(aVar2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.B = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(rVar2);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.C = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(rVar2);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.D = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(rVar2);
        }
        t0 t0Var = (t0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (t0Var != null) {
            this.G = t0Var;
            rVar = rVar2;
            z18 = z10;
            z19 = z13;
            imageView = imageView2;
            textView = null;
        } else if (viewFindViewById4 != null) {
            z18 = z10;
            imageView = imageView2;
            rVar = rVar2;
            textView = null;
            z19 = z13;
            h hVar = new h(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            hVar.setId(R.id.exo_progress);
            hVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(hVar, iIndexOfChild);
            this.G = hVar;
        } else {
            rVar = rVar2;
            z18 = z10;
            z19 = z13;
            imageView = imageView2;
            textView = null;
            this.G = null;
        }
        t0 t0Var2 = this.G;
        r rVar3 = rVar;
        if (t0Var2 != null) {
            t0Var2.addListener(rVar3);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.f28360q = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(rVar3);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.f28356o = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(rVar3);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.f28358p = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(rVar3);
        }
        Typeface font = n3.p.getFont(context, R.font.roboto_medium_numbers);
        View viewFindViewById8 = findViewById(R.id.exo_rew);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : textView;
        this.f28368u = textView2;
        if (textView2 != null) {
            textView2.setTypeface(font);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.f28364s = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(rVar3);
        }
        View viewFindViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : textView;
        this.f28366t = textView3;
        if (textView3 != null) {
            textView3.setTypeface(font);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.f28362r = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(rVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f28370v = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(rVar3);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f28372w = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(rVar3);
        }
        Resources resources = context.getResources();
        this.f28333c = resources;
        this.U = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.V = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(R.id.exo_vr);
        this.f28374x = viewFindViewById10;
        if (viewFindViewById10 != null) {
            f(viewFindViewById10, false);
        }
        l0 l0Var = new l0(this);
        this.f28331b = l0Var;
        l0Var.setAnimationEnabled(z19);
        boolean z29 = z12;
        c cVar = new c(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.f28342h = cVar;
        this.f28354n = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        boolean z30 = z11;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f28340g = recyclerView;
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f28352m = popupWindow;
        if (n1.f28506a < 23) {
            z20 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z20 = false;
        }
        popupWindow.setOnDismissListener(rVar3);
        this.f28377y0 = true;
        this.f28350l = new i(getResources());
        this.f28332b0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.f28334c0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.f28335d0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f28337e0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f28346j = new w(this);
        this.f28348k = new q(this);
        this.f28344i = new a(resources.getStringArray(R.array.exo_controls_playback_speeds), f28329z0);
        this.f28339f0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.f28341g0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.M = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.N = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.O = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.S = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.T = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.f28343h0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f28345i0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.P = resources.getString(R.string.exo_controls_repeat_off_description);
        this.Q = resources.getString(R.string.exo_controls_repeat_one_description);
        this.R = resources.getString(R.string.exo_controls_repeat_all_description);
        this.W = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f28330a0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        l0Var.setShowButton((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        l0Var.setShowButton(viewFindViewById9, z15);
        l0Var.setShowButton(viewFindViewById8, z14);
        l0Var.setShowButton(viewFindViewById6, z16);
        l0Var.setShowButton(viewFindViewById7, z17);
        l0Var.setShowButton(imageView6, z30);
        l0Var.setShowButton(imageView, z29);
        l0Var.setShowButton(viewFindViewById10, z18);
        l0Var.setShowButton(imageView5, this.f28365s0 != 0 ? true : z20);
        addOnLayoutChangeListener(new p(this, 0));
    }

    public void setProgressUpdateListener(v vVar) {
    }
}
