package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o extends l {
    public ViewGroup J;
    public TextView K;
    public TextView L;
    public ImageView M;
    public ImageView N;
    public IAsmoothProgressBar O;
    public View P;
    public View Q;
    public View R;
    public TextView S;
    public TextView T;

    public o(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        super(context, gVar, aVar, rVar, str);
        this.P = null;
        this.f26279z.inflate(R.layout.ia_layout_video_view, (ViewGroup) this, true);
        q();
        com.fyber.inneractive.sdk.flow.g gVar2 = this.A;
        if (gVar2 != null) {
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar2.f23645d;
            iFyberAdIdentifier.f26733k = corner;
            iFyberAdIdentifier.a(this);
        }
        h(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i10, int i11) {
        IAsmoothProgressBar iAsmoothProgressBar = this.O;
        if (iAsmoothProgressBar == null) {
            return;
        }
        iAsmoothProgressBar.setMax(i10);
        super.a(i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z10) {
        TextView textView = this.S;
        if (textView != null) {
            textView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void c() {
        this.f26271h = true;
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void d() {
        this.f26271h = false;
        k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        super.destroy();
        k kVar = this.D;
        if (kVar != null) {
            removeCallbacks(kVar);
            this.D = null;
        }
        p();
        ViewGroup viewGroup = this.f26320l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z10) {
        View view = this.R;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z10) {
        IAsmoothProgressBar iAsmoothProgressBar = this.O;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z10) {
        TextView textView = this.T;
        if (textView != null) {
            textView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.L, this.S, this.T, this.M, this.O, this.P, this.f26329u};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.K, this.J};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        g(false);
        d(false);
        f(false);
        TextView textView = this.L;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        c(false);
        a(false, (String) null);
        b(false);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public boolean i() {
        TextView textView = this.T;
        return textView != null && textView.getVisibility() == 0 && this.T.isEnabled();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.S == null && this.O == null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.N.setSelected(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        ImageView imageView = this.N;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.N.setSelected(false);
        }
    }

    public void q() {
        this.f26320l = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.f26325q = (ViewGroup) findViewById(R.id.ia_default_endcard_video_overlay);
        this.f26326r = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.f26321m = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        TextView textView = (TextView) findViewById(R.id.ia_endcard_tv_app_info_button);
        this.f26329u = textView;
        a(textView, 10);
        a(this.f26321m, 8);
        a(this.f26320l, 7);
        a(this.f26325q, -1);
        this.N = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.R = findViewById(R.id.ia_paused_video_overlay);
        this.K = (TextView) findViewById(R.id.ia_tv_app_info_button);
        this.L = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.O = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        this.J = (ViewGroup) findViewById(R.id.ia_identifier_overlay);
        this.P = findViewById(R.id.ia_click_overlay);
        this.O.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.M = imageView;
        imageView.setVisibility(0);
        this.Q = findViewById(R.id.ia_buffering_overlay);
        this.S = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.T = (TextView) findViewById(R.id.ia_tv_skip);
        a(this, 7);
        a(this.L, 3);
        a(this.M, 1);
        a(this.K, 10);
        a(this.N, 5);
        a(this.R, 9);
        a(this.T, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(R.drawable.ia_bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z10) {
        ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setSelected(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        TextView textView = this.S;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) throws NumberFormatException {
        if (this.T != null) {
            try {
                Integer.parseInt(str);
                int i10 = R.string.ia_video_before_skip_format;
                str = String.format(Locale.US, IAConfigManager.O.f23227v.a().getString(i10), Integer.valueOf(Integer.parseInt(str)));
            } catch (Exception unused) {
            }
            this.T.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z10) {
        ViewGroup viewGroup = this.J;
        if (viewGroup != null) {
            viewGroup.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z10) {
        ImageView imageView = this.M;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        TextView textView = this.T;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i10) {
        IAsmoothProgressBar iAsmoothProgressBar = this.O;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setProgress(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    @Override // com.fyber.inneractive.sdk.player.ui.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r5, com.fyber.inneractive.sdk.ignite.m r6) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.L
            if (r0 == 0) goto L72
            com.fyber.inneractive.sdk.config.global.r r1 = r4.f26330v
            r2 = 0
            if (r1 == 0) goto L26
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.u> r3 = com.fyber.inneractive.sdk.config.global.features.u.class
            com.fyber.inneractive.sdk.config.global.features.h r1 = r1.a(r3)
            if (r1 == 0) goto L26
            com.fyber.inneractive.sdk.config.global.r r1 = r4.f26330v
            com.fyber.inneractive.sdk.config.global.features.h r1 = r1.a(r3)
            com.fyber.inneractive.sdk.config.global.features.u r1 = (com.fyber.inneractive.sdk.config.global.features.u) r1
            java.lang.String r3 = "cta_text_all_caps"
            java.lang.Boolean r1 = r1.c(r3)
            if (r1 == 0) goto L26
            boolean r1 = r1.booleanValue()
            goto L27
        L26:
            r1 = r2
        L27:
            r0.setAllCaps(r1)
            android.widget.TextView r0 = r4.L
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.ignite.h r1 = r1.E
            boolean r1 = r1.n()
            if (r1 == 0) goto L48
            r6.getClass()
            com.fyber.inneractive.sdk.ignite.m r1 = com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP
            if (r6 != r1) goto L48
            android.content.Context r6 = r4.getContext()
            int r1 = com.fyber.inneractive.sdk.R.string.ia_video_instant_install_text
            java.lang.String r6 = r6.getString(r1)
            goto L5c
        L48:
            java.lang.String r6 = r4.getLocalizedCtaButtonText()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L5c
            android.content.Context r6 = r4.getContext()
            int r1 = com.fyber.inneractive.sdk.R.string.ia_video_install_now_text
            java.lang.String r6 = r6.getString(r1)
        L5c:
            java.lang.String r1 = r4.f26331w
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L66
            java.lang.String r6 = r4.f26331w
        L66:
            r0.setText(r6)
            android.widget.TextView r6 = r4.L
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            r2 = 4
        L6f:
            r6.setVisibility(r2)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.ui.o.a(boolean, com.fyber.inneractive.sdk.ignite.m):void");
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10, String str) {
        TextView textView;
        TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.K);
            }
            if (z10 && (textView = this.L) != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -2;
                this.L.setLayoutParams(layoutParams);
                this.L.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_for_cta));
            }
            this.K.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z10) {
        View view = this.Q;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }
}
