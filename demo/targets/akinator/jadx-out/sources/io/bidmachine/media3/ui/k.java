package io.bidmachine.media3.ui;

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
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.b2;
import gn.i1;
import gn.r1;
import gn.t1;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class k extends FrameLayout {
    public static final float[] C0;
    public final ImageView A;
    public long A0;
    public final View B;
    public boolean B0;
    public final View C;
    public final View D;
    public final TextView E;
    public final TextView F;
    public final p0 G;
    public final StringBuilder H;
    public final Formatter I;
    public final r1 J;
    public final t1 K;
    public final com.unity3d.services.banners.view.a L;
    public final Drawable M;
    public final Drawable N;
    public final Drawable O;
    public final Drawable P;
    public final Drawable Q;
    public final String R;
    public final String S;
    public final String T;
    public final Drawable U;
    public final Drawable V;
    public final float W;

    /* renamed from: a0, reason: collision with root package name */
    public final float f61770a0;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f61771b;

    /* renamed from: b0, reason: collision with root package name */
    public final String f61772b0;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f61773c;

    /* renamed from: c0, reason: collision with root package name */
    public final String f61774c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Drawable f61775d0;

    /* renamed from: e, reason: collision with root package name */
    public final i f61776e;

    /* renamed from: e0, reason: collision with root package name */
    public final Drawable f61777e0;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f61778f;

    /* renamed from: f0, reason: collision with root package name */
    public final String f61779f0;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f61780g;

    /* renamed from: g0, reason: collision with root package name */
    public final String f61781g0;

    /* renamed from: h, reason: collision with root package name */
    public final c f61782h;

    /* renamed from: h0, reason: collision with root package name */
    public final Drawable f61783h0;

    /* renamed from: i, reason: collision with root package name */
    public final a f61784i;

    /* renamed from: i0, reason: collision with root package name */
    public final Drawable f61785i0;

    /* renamed from: j, reason: collision with root package name */
    public final m f61786j;

    /* renamed from: j0, reason: collision with root package name */
    public final String f61787j0;

    /* renamed from: k, reason: collision with root package name */
    public final h f61788k;

    /* renamed from: k0, reason: collision with root package name */
    public final String f61789k0;

    /* renamed from: l, reason: collision with root package name */
    public final f f61790l;

    /* renamed from: l0, reason: collision with root package name */
    public i1 f61791l0;

    /* renamed from: m, reason: collision with root package name */
    public final PopupWindow f61792m;

    /* renamed from: m0, reason: collision with root package name */
    public j f61793m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f61794n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f61795n0;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f61796o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f61797o0;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f61798p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f61799p0;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f61800q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f61801q0;

    /* renamed from: r, reason: collision with root package name */
    public final View f61802r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f61803r0;

    /* renamed from: s, reason: collision with root package name */
    public final View f61804s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f61805s0;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f61806t;

    /* renamed from: t0, reason: collision with root package name */
    public int f61807t0;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f61808u;

    /* renamed from: u0, reason: collision with root package name */
    public int f61809u0;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f61810v;

    /* renamed from: v0, reason: collision with root package name */
    public int f61811v0;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f61812w;

    /* renamed from: w0, reason: collision with root package name */
    public long[] f61813w0;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f61814x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean[] f61815x0;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f61816y;

    /* renamed from: y0, reason: collision with root package name */
    public long[] f61817y0;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f61818z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean[] f61819z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends RecyclerView.a {

        /* renamed from: i, reason: collision with root package name */
        public final String[] f61820i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f61821j;

        /* renamed from: k, reason: collision with root package name */
        public int f61822k;

        public a(String[] strArr, float[] fArr) {
            this.f61820i = strArr;
            this.f61821j = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.f61820i.length;
        }

        public String getSelectedText() {
            return this.f61820i[this.f61822k];
        }

        public void updateSelectedIndex(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f61821j;
                if (i10 >= fArr.length) {
                    this.f61822k = i11;
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
            String[] strArr = this.f61820i;
            if (i10 < strArr.length) {
                dVar.f61832c.setText(strArr[i10]);
            }
            if (i10 == this.f61822k) {
                dVar.itemView.setSelected(true);
                dVar.f61833d.setVisibility(0);
            } else {
                dVar.itemView.setSelected(false);
                dVar.f61833d.setVisibility(4);
            }
            dVar.itemView.setOnClickListener(new com.google.android.exoplayer2.ui.t(this, i10, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public d onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new d(LayoutInflater.from(k.this.getContext()).inflate(R.layout.bm_exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends RecyclerView.n {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f61824c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f61825d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f61826e;

        public b(View view) {
            super(view);
            if (a1.f60679a < 26) {
                view.setFocusable(true);
            }
            this.f61824c = (TextView) view.findViewById(R.id.exo_main_text);
            this.f61825d = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f61826e = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 23));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends RecyclerView.a {

        /* renamed from: i, reason: collision with root package name */
        public final String[] f61828i;

        /* renamed from: j, reason: collision with root package name */
        public final String[] f61829j;

        /* renamed from: k, reason: collision with root package name */
        public final Drawable[] f61830k;

        public c(String[] strArr, Drawable[] drawableArr) {
            this.f61828i = strArr;
            this.f61829j = new String[strArr.length];
            this.f61830k = drawableArr;
        }

        public final boolean a(int i10) {
            k kVar = k.this;
            i1 i1Var = kVar.f61791l0;
            if (i1Var == null) {
                return false;
            }
            if (i10 == 0) {
                return i1Var.isCommandAvailable(13);
            }
            if (i10 != 1) {
                return true;
            }
            return i1Var.isCommandAvailable(30) && kVar.f61791l0.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int getItemCount() {
            return this.f61828i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public long getItemId(int i10) {
            return i10;
        }

        public boolean hasSettingsToShow() {
            return a(1) || a(0);
        }

        public void setSubTextAtPosition(int i10, String str) {
            this.f61829j[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public void onBindViewHolder(b bVar, int i10) {
            if (a(i10)) {
                bVar.itemView.setLayoutParams(new RecyclerView.g(-1, -2));
            } else {
                bVar.itemView.setLayoutParams(new RecyclerView.g(0, 0));
            }
            TextView textView = bVar.f61824c;
            ImageView imageView = bVar.f61826e;
            TextView textView2 = bVar.f61825d;
            textView.setText(this.f61828i[i10]);
            String str = this.f61829j[i10];
            if (str == null) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str);
            }
            Drawable drawable = this.f61830k[i10];
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            k kVar = k.this;
            return kVar.new b(LayoutInflater.from(kVar.getContext()).inflate(R.layout.bm_exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends RecyclerView.n {

        /* renamed from: c, reason: collision with root package name */
        public final TextView f61832c;

        /* renamed from: d, reason: collision with root package name */
        public final View f61833d;

        public d(View view) {
            super(view);
            if (a1.f60679a < 26) {
                view.setFocusable(true);
            }
            this.f61832c = (TextView) view.findViewById(R.id.exo_text);
            this.f61833d = view.findViewById(R.id.exo_check);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final b2.a f61834a;

        /* renamed from: b, reason: collision with root package name */
        public final int f61835b;

        /* renamed from: c, reason: collision with root package name */
        public final String f61836c;

        public e(b2 b2Var, int i10, int i11, String str) {
            this.f61834a = (b2.a) b2Var.getGroups().get(i10);
            this.f61835b = i11;
            this.f61836c = str;
        }

        public boolean isSelected() {
            return this.f61834a.isTrackSelected(this.f61835b);
        }
    }

    static {
        gn.q0.registerModule("media3.ui");
        C0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public k(Context context) {
        this(context, null);
    }

    public static boolean b(i1 i1Var, t1 t1Var) {
        u1 currentTimeline;
        int windowCount;
        if (!i1Var.isCommandAvailable(17) || (windowCount = (currentTimeline = i1Var.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i10 = 0; i10 < windowCount; i10++) {
            if (currentTimeline.getWindow(i10, t1Var).f58187m == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        i1 i1Var = this.f61791l0;
        if (i1Var == null || !i1Var.isCommandAvailable(13)) {
            return;
        }
        i1 i1Var2 = this.f61791l0;
        i1Var2.setPlaybackParameters(i1Var2.getPlaybackParameters().withSpeed(f10));
    }

    @Deprecated
    public void addVisibilityListener(o oVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(oVar);
        this.f61778f.add(oVar);
    }

    public final void c(RecyclerView.a aVar, View view) {
        this.f61780g.setAdapter(aVar);
        k();
        this.B0 = false;
        PopupWindow popupWindow = this.f61792m;
        popupWindow.dismiss();
        this.B0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.f61794n;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    public final b5 d(b2 b2Var, int i10) {
        x4 x4Var = new x4();
        b5 groups = b2Var.getGroups();
        for (int i11 = 0; i11 < groups.size(); i11++) {
            b2.a aVar = (b2.a) groups.get(i11);
            if (aVar.getType() == i10) {
                for (int i12 = 0; i12 < aVar.f57825a; i12++) {
                    if (aVar.isTrackSupported(i12)) {
                        io.bidmachine.media3.common.b trackFormat = aVar.getTrackFormat(i12);
                        if ((trackFormat.f60655e & 2) == 0) {
                            x4Var.add((Object) new e(b2Var, i11, i12, this.f61790l.getTrackName(trackFormat)));
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
        i1 i1Var = this.f61791l0;
        if (i1Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (i1Var.getPlaybackState() == 4 || !i1Var.isCommandAvailable(12)) {
                return true;
            }
            i1Var.seekForward();
            return true;
        }
        if (keyCode == 89 && i1Var.isCommandAvailable(11)) {
            i1Var.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            a1.handlePlayPauseButtonAction(i1Var, this.f61801q0);
            return true;
        }
        if (keyCode == 87) {
            if (!i1Var.isCommandAvailable(9)) {
                return true;
            }
            i1Var.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!i1Var.isCommandAvailable(7)) {
                return true;
            }
            i1Var.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            a1.handlePlayButtonAction(i1Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        a1.handlePauseButtonAction(i1Var);
        return true;
    }

    public final void e() throws Resources.NotFoundException {
        h();
        g();
        j();
        l();
        n();
        i1 i1Var = this.f61791l0;
        if (i1Var != null) {
            float f10 = i1Var.getPlaybackParameters().f57847a;
            a aVar = this.f61784i;
            aVar.updateSelectedIndex(f10);
            String selectedText = aVar.getSelectedText();
            c cVar = this.f61782h;
            cVar.setSubTextAtPosition(0, selectedText);
            f(this.B, cVar.hasSettingsToShow());
        }
        m();
    }

    public final void f(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.W : this.f61770a0);
    }

    public final void g() throws Resources.NotFoundException {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.f61797o0) {
            i1 i1Var = this.f61791l0;
            if (i1Var != null) {
                zIsCommandAvailable = (this.f61799p0 && b(i1Var, this.K)) ? i1Var.isCommandAvailable(10) : i1Var.isCommandAvailable(5);
                zIsCommandAvailable3 = i1Var.isCommandAvailable(7);
                zIsCommandAvailable4 = i1Var.isCommandAvailable(11);
                zIsCommandAvailable5 = i1Var.isCommandAvailable(12);
                zIsCommandAvailable2 = i1Var.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            Resources resources = this.f61773c;
            View view = this.f61804s;
            if (zIsCommandAvailable4) {
                i1 i1Var2 = this.f61791l0;
                int seekBackIncrement = (int) ((i1Var2 != null ? i1Var2.getSeekBackIncrement() : 5000L) / 1000);
                TextView textView = this.f61808u;
                if (textView != null) {
                    textView.setText(String.valueOf(seekBackIncrement));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
                }
            }
            View view2 = this.f61802r;
            if (zIsCommandAvailable5) {
                i1 i1Var3 = this.f61791l0;
                int seekForwardIncrement = (int) ((i1Var3 != null ? i1Var3.getSeekForwardIncrement() : MBInterstitialActivity.WEB_LOAD_TIME) / 1000);
                TextView textView2 = this.f61806t;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(seekForwardIncrement));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
                }
            }
            f(this.f61796o, zIsCommandAvailable3);
            f(view, zIsCommandAvailable4);
            f(view2, zIsCommandAvailable5);
            f(this.f61798p, zIsCommandAvailable2);
            p0 p0Var = this.G;
            if (p0Var != null) {
                p0Var.setEnabled(zIsCommandAvailable);
            }
        }
    }

    public i1 getPlayer() {
        return this.f61791l0;
    }

    public int getRepeatToggleModes() {
        return this.f61811v0;
    }

    public boolean getShowShuffleButton() {
        return this.f61771b.getShowButton(this.f61812w);
    }

    public boolean getShowSubtitleButton() {
        return this.f61771b.getShowButton(this.f61816y);
    }

    public int getShowTimeoutMs() {
        return this.f61807t0;
    }

    public boolean getShowVrButton() {
        return this.f61771b.getShowButton(this.f61814x);
    }

    public final void h() throws Resources.NotFoundException {
        ImageView imageView;
        if (isVisible() && this.f61797o0 && (imageView = this.f61800q) != null) {
            boolean zShouldShowPlayButton = a1.shouldShowPlayButton(this.f61791l0, this.f61801q0);
            Drawable drawable = zShouldShowPlayButton ? this.M : this.N;
            int i10 = zShouldShowPlayButton ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f61773c.getString(i10));
            f(imageView, a1.shouldEnablePlayPauseButton(this.f61791l0));
        }
    }

    public void hide() {
        this.f61771b.hide();
    }

    public void hideImmediately() {
        this.f61771b.hideImmediately();
    }

    public final void i() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.f61797o0) {
            i1 i1Var = this.f61791l0;
            if (i1Var == null || !i1Var.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = i1Var.getContentPosition() + this.A0;
                contentBufferedPosition = i1Var.getContentBufferedPosition() + this.A0;
            }
            TextView textView = this.F;
            if (textView != null && !this.f61805s0) {
                textView.setText(a1.getStringForTime(this.H, this.I, contentPosition));
            }
            p0 p0Var = this.G;
            if (p0Var != null) {
                p0Var.setPosition(contentPosition);
                p0Var.setBufferedPosition(contentBufferedPosition);
            }
            com.unity3d.services.banners.view.a aVar = this.L;
            removeCallbacks(aVar);
            int playbackState = i1Var == null ? 1 : i1Var.getPlaybackState();
            if (i1Var != null && i1Var.isPlaying()) {
                long jMin = Math.min(p0Var != null ? p0Var.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f10 = i1Var.getPlaybackParameters().f57847a;
                postDelayed(aVar, a1.constrainValue(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f61809u0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(aVar, 1000L);
            }
        }
    }

    public boolean isAnimationEnabled() {
        return this.f61771b.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.f61771b.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public final void j() {
        ImageView imageView;
        if (isVisible() && this.f61797o0 && (imageView = this.f61810v) != null) {
            if (this.f61811v0 == 0) {
                f(imageView, false);
                return;
            }
            i1 i1Var = this.f61791l0;
            String str = this.R;
            Drawable drawable = this.O;
            if (i1Var == null || !i1Var.isCommandAvailable(15)) {
                f(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true);
            int repeatMode = i1Var.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.P);
                imageView.setContentDescription(this.S);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.Q);
                imageView.setContentDescription(this.T);
            }
        }
    }

    public final void k() {
        RecyclerView recyclerView = this.f61780g;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.f61794n;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.f61792m;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void l() {
        ImageView imageView;
        if (isVisible() && this.f61797o0 && (imageView = this.f61812w) != null) {
            i1 i1Var = this.f61791l0;
            if (!this.f61771b.getShowButton(imageView)) {
                f(imageView, false);
                return;
            }
            String str = this.f61774c0;
            Drawable drawable = this.V;
            if (i1Var == null || !i1Var.isCommandAvailable(14)) {
                f(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true);
            if (i1Var.getShuffleModeEnabled()) {
                drawable = this.U;
            }
            imageView.setImageDrawable(drawable);
            if (i1Var.getShuffleModeEnabled()) {
                str = this.f61772b0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.k.m():void");
    }

    public final void n() {
        m mVar = this.f61786j;
        mVar.getClass();
        List list = Collections.EMPTY_LIST;
        mVar.f61865i = list;
        h hVar = this.f61788k;
        hVar.getClass();
        hVar.f61865i = list;
        i1 i1Var = this.f61791l0;
        ImageView imageView = this.f61816y;
        if (i1Var != null && i1Var.isCommandAvailable(30) && this.f61791l0.isCommandAvailable(29)) {
            b2 currentTracks = this.f61791l0.getCurrentTracks();
            hVar.init(d(currentTracks, 1));
            if (this.f61771b.getShowButton(imageView)) {
                mVar.init(d(currentTracks, 3));
            } else {
                mVar.init(b5.of());
            }
        }
        f(imageView, mVar.getItemCount() > 0);
        f(this.B, this.f61782h.hasSettingsToShow());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        a0 a0Var = this.f61771b;
        a0Var.onAttachedToWindow();
        this.f61797o0 = true;
        if (isFullyVisible()) {
            a0Var.resetHideCallbacks();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a0 a0Var = this.f61771b;
        a0Var.onDetachedFromWindow();
        this.f61797o0 = false;
        removeCallbacks(this.L);
        a0Var.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f61771b.onLayout(z10, i10, i11, i12, i13);
    }

    @Deprecated
    public void removeVisibilityListener(o oVar) {
        this.f61778f.remove(oVar);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f61771b.setAnimationEnabled(z10);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.f61817y0 = new long[0];
            this.f61819z0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) io.bidmachine.media3.common.util.a.checkNotNull(zArr);
            io.bidmachine.media3.common.util.a.checkArgument(jArr.length == zArr2.length);
            this.f61817y0 = jArr;
            this.f61819z0 = zArr2;
        }
        m();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(j jVar) {
        this.f61793m0 = jVar;
        boolean z10 = jVar != null;
        ImageView imageView = this.f61818z;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z11 = jVar != null;
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

    public void setPlayer(i1 i1Var) throws Resources.NotFoundException {
        io.bidmachine.media3.common.util.a.checkState(Looper.myLooper() == Looper.getMainLooper());
        io.bidmachine.media3.common.util.a.checkArgument(i1Var == null || i1Var.getApplicationLooper() == Looper.getMainLooper());
        i1 i1Var2 = this.f61791l0;
        if (i1Var2 == i1Var) {
            return;
        }
        i iVar = this.f61776e;
        if (i1Var2 != null) {
            i1Var2.removeListener(iVar);
        }
        this.f61791l0 = i1Var;
        if (i1Var != null) {
            i1Var.addListener(iVar);
        }
        e();
    }

    public void setRepeatToggleModes(int i10) {
        this.f61811v0 = i10;
        i1 i1Var = this.f61791l0;
        if (i1Var != null && i1Var.isCommandAvailable(15)) {
            int repeatMode = this.f61791l0.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.f61791l0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.f61791l0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.f61791l0.setRepeatMode(2);
            }
        }
        this.f61771b.setShowButton(this.f61810v, i10 != 0);
        j();
    }

    public void setShowFastForwardButton(boolean z10) throws Resources.NotFoundException {
        this.f61771b.setShowButton(this.f61802r, z10);
        g();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f61799p0 = z10;
        m();
    }

    public void setShowNextButton(boolean z10) throws Resources.NotFoundException {
        this.f61771b.setShowButton(this.f61798p, z10);
        g();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) throws Resources.NotFoundException {
        this.f61801q0 = z10;
        h();
    }

    public void setShowPreviousButton(boolean z10) throws Resources.NotFoundException {
        this.f61771b.setShowButton(this.f61796o, z10);
        g();
    }

    public void setShowRewindButton(boolean z10) throws Resources.NotFoundException {
        this.f61771b.setShowButton(this.f61804s, z10);
        g();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f61771b.setShowButton(this.f61812w, z10);
        l();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f61771b.setShowButton(this.f61816y, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f61807t0 = i10;
        if (isFullyVisible()) {
            this.f61771b.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f61771b.setShowButton(this.f61814x, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f61809u0 = a1.constrainValue(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f61814x;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            f(imageView, onClickListener != null);
        }
    }

    public void show() throws Resources.NotFoundException {
        this.f61771b.show();
    }

    public void updateIsFullscreen(boolean z10) {
        if (this.f61795n0 == z10) {
            return;
        }
        this.f61795n0 = z10;
        String str = this.f61789k0;
        Drawable drawable = this.f61785i0;
        String str2 = this.f61787j0;
        Drawable drawable2 = this.f61783h0;
        ImageView imageView = this.f61818z;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            if (z10) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        j jVar = this.f61793m0;
        if (jVar != null) {
            jVar.onFullScreenModeChanged(z10);
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.view.View, android.view.ViewGroup, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public k(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) throws Resources.NotFoundException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i22;
        int i23;
        boolean z17;
        Context context2;
        int i24;
        boolean z18;
        int i25;
        ImageView imageView;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        i iVar;
        int i26;
        int i27;
        int i28;
        int i29;
        ?? r11;
        boolean z24;
        int i30;
        boolean z25;
        super(context, attributeSet, i10);
        this.f61801q0 = true;
        this.f61807t0 = 5000;
        this.f61811v0 = 0;
        this.f61809u0 = 200;
        int resourceId = R.layout.bm_exo_player_control_view;
        int resourceId2 = R.drawable.exo_styled_controls_play;
        int resourceId3 = R.drawable.exo_styled_controls_pause;
        int resourceId4 = R.drawable.exo_styled_controls_next;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g0.f61756c, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.bm_exo_player_control_view);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(41, R.drawable.exo_styled_controls_vr);
                this.f61807t0 = typedArrayObtainStyledAttributes.getInt(32, this.f61807t0);
                this.f61811v0 = typedArrayObtainStyledAttributes.getInt(19, this.f61811v0);
                z12 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                z13 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z14 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z15 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f61809u0));
                z17 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i17 = resourceId10;
                z10 = z26;
                i12 = resourceId5;
                i13 = resourceId6;
                i14 = resourceId7;
                i15 = resourceId8;
                i16 = resourceId9;
                i11 = resourceId11;
                i18 = resourceId13;
                i19 = resourceId14;
                i20 = resourceId15;
                i21 = resourceId16;
                i23 = resourceId17;
                i22 = resourceId12;
                z11 = z27;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = R.drawable.exo_styled_controls_repeat_one;
            i12 = R.drawable.exo_styled_controls_simple_fastforward;
            i13 = R.drawable.exo_styled_controls_previous;
            i14 = R.drawable.exo_styled_controls_simple_rewind;
            i15 = R.drawable.exo_styled_controls_fullscreen_exit;
            i16 = R.drawable.exo_styled_controls_fullscreen_enter;
            i17 = R.drawable.exo_styled_controls_repeat_off;
            i18 = R.drawable.exo_styled_controls_shuffle_on;
            i19 = R.drawable.exo_styled_controls_shuffle_off;
            i20 = R.drawable.exo_styled_controls_subtitle_on;
            i21 = R.drawable.exo_styled_controls_subtitle_off;
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = false;
            i22 = R.drawable.exo_styled_controls_repeat_all;
            i23 = R.drawable.exo_styled_controls_vr;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        i iVar2 = new i(this);
        this.f61776e = iVar2;
        this.f61778f = new CopyOnWriteArrayList();
        this.J = new r1();
        this.K = new t1();
        StringBuilder sb2 = new StringBuilder();
        this.H = sb2;
        int i31 = resourceId2;
        int i32 = resourceId3;
        this.I = new Formatter(sb2, Locale.getDefault());
        this.f61813w0 = new long[0];
        this.f61815x0 = new boolean[0];
        this.f61817y0 = new long[0];
        this.f61819z0 = new boolean[0];
        this.L = new com.unity3d.services.banners.view.a(this, 26);
        this.E = (TextView) findViewById(R.id.exo_duration);
        this.F = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f61816y = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(iVar2);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f61818z = imageView3;
        com.applovin.mediation.nativeAds.a aVar = new com.applovin.mediation.nativeAds.a(this, 21);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(aVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.A = imageView4;
        com.applovin.mediation.nativeAds.a aVar2 = new com.applovin.mediation.nativeAds.a(this, 21);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(aVar2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.B = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(iVar2);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.C = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(iVar2);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.D = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(iVar2);
        }
        p0 p0Var = (p0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (p0Var != null) {
            this.G = p0Var;
            context2 = context;
            i24 = i22;
            z18 = z11;
            i25 = i32;
            imageView = imageView2;
            z19 = z12;
            z20 = z13;
            z21 = z14;
            z22 = z15;
            z23 = z16;
            iVar = iVar2;
            i26 = resourceId4;
            i27 = i18;
            i28 = i19;
            i29 = i31;
            r11 = 0;
            z24 = z10;
            i30 = i12;
        } else if (viewFindViewById4 != null) {
            i28 = i19;
            r11 = 0;
            i25 = i32;
            z18 = z11;
            imageView = imageView2;
            z19 = z12;
            i26 = resourceId4;
            z20 = z13;
            z21 = z14;
            z22 = z15;
            z23 = z16;
            i27 = i18;
            i29 = i31;
            z24 = z10;
            context2 = context;
            i30 = i12;
            i24 = i22;
            iVar = iVar2;
            io.bidmachine.media3.ui.e eVar = new io.bidmachine.media3.ui.e(context2, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            eVar.setId(R.id.exo_progress);
            eVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(eVar, iIndexOfChild);
            this.G = eVar;
        } else {
            context2 = context;
            i24 = i22;
            z18 = z11;
            i25 = i32;
            imageView = imageView2;
            z19 = z12;
            z20 = z13;
            z21 = z14;
            z22 = z15;
            z23 = z16;
            iVar = iVar2;
            i26 = resourceId4;
            i27 = i18;
            i28 = i19;
            i29 = i31;
            r11 = 0;
            z24 = z10;
            i30 = i12;
            this.G = null;
        }
        p0 p0Var2 = this.G;
        if (p0Var2 != null) {
            p0Var2.addListener(iVar);
        }
        Resources resources = context2.getResources();
        this.f61773c = resources;
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f61800q = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(iVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_prev);
        this.f61796o = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(a1.getDrawable(context2, resources, i13));
            imageView6.setOnClickListener(iVar);
        }
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_next);
        this.f61798p = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(a1.getDrawable(context2, resources, i26));
            imageView7.setOnClickListener(iVar);
        }
        Typeface font = n3.p.getFont(context2, R.font.roboto_medium_numbers);
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(a1.getDrawable(context2, resources, i14));
            this.f61804s = imageView8;
            this.f61808u = r11;
        } else if (textView != null) {
            textView.setTypeface(font);
            this.f61808u = textView;
            this.f61804s = textView;
        } else {
            this.f61808u = r11;
            this.f61804s = r11;
        }
        View view = this.f61804s;
        if (view != null) {
            view.setOnClickListener(iVar);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(a1.getDrawable(context2, resources, i30));
            this.f61802r = imageView9;
            this.f61806t = r11;
        } else if (textView2 != null) {
            textView2.setTypeface(font);
            this.f61806t = textView2;
            this.f61802r = textView2;
        } else {
            this.f61806t = r11;
            this.f61802r = r11;
        }
        View view2 = this.f61802r;
        if (view2 != null) {
            view2.setOnClickListener(iVar);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f61810v = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(iVar);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f61812w = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(iVar);
        }
        this.W = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f61770a0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) findViewById(R.id.exo_vr);
        this.f61814x = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(a1.getDrawable(context2, resources, i23));
            f(imageView12, false);
        }
        a0 a0Var = new a0(this);
        this.f61771b = a0Var;
        a0Var.setAnimationEnabled(z17);
        c cVar = new c(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{a1.getDrawable(context2, resources, R.drawable.exo_styled_controls_speed), a1.getDrawable(context2, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.f61782h = cVar;
        this.f61794n = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(R.layout.bm_exo_styled_settings_list, (ViewGroup) r11);
        this.f61780g = recyclerView;
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f61792m = popupWindow;
        if (a1.f60679a < 23) {
            z25 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z25 = false;
        }
        popupWindow.setOnDismissListener(iVar);
        this.B0 = true;
        this.f61790l = new f(getResources());
        this.f61775d0 = a1.getDrawable(context2, resources, i20);
        this.f61777e0 = a1.getDrawable(context2, resources, i21);
        this.f61779f0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f61781g0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f61786j = new m(this);
        this.f61788k = new h(this);
        this.f61784i = new a(resources.getStringArray(R.array.exo_controls_playback_speeds), C0);
        this.M = a1.getDrawable(context2, resources, i29);
        this.N = a1.getDrawable(context2, resources, i25);
        this.f61783h0 = a1.getDrawable(context2, resources, i15);
        this.f61785i0 = a1.getDrawable(context2, resources, i16);
        this.O = a1.getDrawable(context2, resources, i17);
        this.P = a1.getDrawable(context2, resources, i11);
        this.Q = a1.getDrawable(context2, resources, i24);
        this.U = a1.getDrawable(context2, resources, i27);
        this.V = a1.getDrawable(context2, resources, i28);
        this.f61787j0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f61789k0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.R = resources.getString(R.string.exo_controls_repeat_off_description);
        this.S = resources.getString(R.string.exo_controls_repeat_one_description);
        this.T = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f61772b0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f61774c0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        a0Var.setShowButton((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        a0Var.setShowButton(this.f61802r, z20);
        a0Var.setShowButton(this.f61804s, z19);
        a0Var.setShowButton(imageView6, z21);
        a0Var.setShowButton(imageView7, z22);
        a0Var.setShowButton(imageView11, z24);
        a0Var.setShowButton(imageView, z18);
        a0Var.setShowButton(imageView12, z23);
        a0Var.setShowButton(imageView10, this.f61811v0 != 0 ? true : z25);
        addOnLayoutChangeListener(new com.google.android.exoplayer2.ui.p(this, 4));
    }

    public void setProgressUpdateListener(l lVar) {
    }
}
