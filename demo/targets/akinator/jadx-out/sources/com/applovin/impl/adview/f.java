package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import b0.e2;
import com.applovin.impl.adview.e;
import com.applovin.impl.m1;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class f extends Dialog implements m1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f13534a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13535b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13536c;

    /* renamed from: d, reason: collision with root package name */
    private final b f13537d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f13538e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f13539f;

    /* renamed from: g, reason: collision with root package name */
    private e f13540g;

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f13535b = kVar;
        this.f13536c = kVar.O();
        this.f13534a = activity;
        this.f13537d = bVar;
        this.f13538e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f13534a.runOnUiThread(new u(this, 1));
    }

    @Override // com.applovin.impl.m1
    public void dismiss(String str) {
        this.f13534a.runOnUiThread(new u(this, 0));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f13537d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f13534a.getWindow().getAttributes().flags, this.f13534a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f13536c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13536c.a("ExpandedAdDialog", "Setting window flags failed.", th2);
            }
        }
    }

    private void a() {
        this.f13537d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f13540g.isClickable()) {
            this.f13540g.performClick();
        }
    }

    private void d() {
        this.f13537d.setLayoutParams(e2.e(-1, -1, 13));
        RelativeLayout relativeLayout = new RelativeLayout(this.f13534a);
        this.f13539f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f13539f.setBackgroundColor(-1157627904);
        this.f13539f.addView(this.f13537d);
        if (!this.f13538e.x1()) {
            a(this.f13538e.r1());
            g();
        }
        setContentView(this.f13539f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f13539f.removeView(this.f13537d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f13540g == null) {
                a();
            }
            this.f13540g.setVisibility(0);
            this.f13540g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f13540g.startAnimation(alphaAnimation);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13536c.a("ExpandedAdDialog", "Unable to fade in close button", th2);
            }
            a();
        }
    }

    public b c() {
        return this.f13537d;
    }

    private void a(e.a aVar) {
        if (this.f13540g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13536c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f13534a);
        this.f13540g = eVarA;
        eVarA.setVisibility(8);
        final int i10 = 0;
        this.f13540g.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.t

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f13566c;

            {
                this.f13566c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f13566c.a(view);
                        break;
                    default:
                        this.f13566c.b(view);
                        break;
                }
            }
        });
        this.f13540g.setClickable(false);
        int iA = a(((Integer) this.f13535b.a(v4.f16065x1)).intValue());
        RelativeLayout.LayoutParams layoutParamsE = e2.e(iA, iA, 10);
        com.applovin.impl.sdk.k kVar = this.f13535b;
        v4 v4Var = v4.A1;
        layoutParamsE.addRule(((Boolean) kVar.a(v4Var)).booleanValue() ? 9 : 11);
        this.f13540g.a(iA);
        int iA2 = a(((Integer) this.f13535b.a(v4.f16081z1)).intValue());
        int iA3 = a(((Integer) this.f13535b.a(v4.f16073y1)).intValue());
        layoutParamsE.setMargins(iA3, iA2, iA3, 0);
        this.f13539f.addView(this.f13540g, layoutParamsE);
        this.f13540g.bringToFront();
        int iA4 = a(((Integer) this.f13535b.a(v4.B1)).intValue());
        View view = new View(this.f13534a);
        view.setBackgroundColor(0);
        int i11 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.addRule(10);
        layoutParams.addRule(((Boolean) this.f13535b.a(v4Var)).booleanValue() ? 9 : 11);
        layoutParams.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        final int i12 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.t

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f13566c;

            {
                this.f13566c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f13566c.a(view2);
                        break;
                    default:
                        this.f13566c.b(view2);
                        break;
                }
            }
        });
        this.f13539f.addView(view, layoutParams);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f13538e;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f13540g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f13534a, i10);
    }
}
