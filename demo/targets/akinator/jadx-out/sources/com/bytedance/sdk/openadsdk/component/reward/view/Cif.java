package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.jpo.oya;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.prr;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {

    /* renamed from: cm, reason: collision with root package name */
    final dt f20021cm;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.ju f20022dt;
    com.bytedance.sdk.openadsdk.core.jj.jj hna;

    /* renamed from: if, reason: not valid java name */
    oya f110if;

    /* renamed from: jd, reason: collision with root package name */
    final Activity f20023jd;

    /* renamed from: jj, reason: collision with root package name */
    FrameLayout f20024jj;

    /* renamed from: jr, reason: collision with root package name */
    private final String f20025jr;

    /* renamed from: ju, reason: collision with root package name */
    RelativeLayout f20026ju;
    ImageView my;
    private int nmd;
    private final boolean opi;
    public nmd prr;

    /* renamed from: qk, reason: collision with root package name */
    View f20027qk;

    /* renamed from: rq, reason: collision with root package name */
    private boolean f20028rq;

    /* renamed from: tu, reason: collision with root package name */
    private my f20030tu;
    protected final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo wqx;
    View xyk;

    /* renamed from: yd, reason: collision with root package name */
    ImageView f20031yd;
    PAGLogoView zz;
    int jpo = 3;

    /* renamed from: au, reason: collision with root package name */
    protected int f20020au = 0;
    protected final AtomicBoolean oya = new AtomicBoolean(false);

    /* renamed from: sq, reason: collision with root package name */
    Runnable f20029sq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.if.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                dt dtVar = Cif.this.f20021cm;
                if ((dtVar == null || !dtVar.aul()) && (imageView = Cif.this.my) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    Cif.this.wqx.duq.jpo(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public Cif(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.wqx = jpoVar;
        this.f20023jd = jpoVar.vrc;
        this.f20021cm = jpoVar.f19914jd;
        this.f20025jr = jpoVar.my;
        this.opi = jpoVar.f19905cm;
    }

    private void opi() {
        RelativeLayout relativeLayout;
        my myVar = (my) this.wqx.f19930va.findViewById(hna.f164if);
        this.f20030tu = myVar;
        myVar.jpo(this.wqx);
        com.bytedance.sdk.openadsdk.core.widget.ju juVar = (com.bytedance.sdk.openadsdk.core.widget.ju) this.wqx.f19930va.findViewById(hna.cz);
        this.f20022dt = juVar;
        if (juVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.wqx;
            juVar.jpo(jpoVar.f19914jd, jpoVar.my, null);
        }
        this.zz = (PAGLogoView) this.wqx.f19930va.findViewById(520093757);
        this.f20031yd = (ImageView) this.wqx.f19930va.findViewById(hna.afh);
        this.my = (ImageView) this.wqx.f19930va.findViewById(520093708);
        this.f20024jj = (FrameLayout) this.wqx.f19930va.findViewById(hna.f21533ju);
        this.f20027qk = this.wqx.f19930va.findViewById(hna.hna);
        this.xyk = this.wqx.f19930va.findViewById(hna.umr);
        this.f20026ju = (RelativeLayout) this.wqx.f19930va.findViewById(hna.pve);
        oya oyaVar = this.f110if;
        if (oyaVar == null || oyaVar.cm() == null || (relativeLayout = this.f20026ju) == null) {
            return;
        }
        relativeLayout.addView(this.f110if.cm(), new LinearLayout.LayoutParams(-1, -1));
        this.f110if.jd();
    }

    public void au() {
        try {
            Activity activity = this.wqx.vrc;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, com.bytedance.sdk.component.utils.dt.zz(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.wqx.tic.mo445if();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.if.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        Cif.this.wqx.tic.mo445if();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.wqx.tic.jpo(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.wqx.tic.mo445if();
        }
    }

    public void cm() {
        if (this.wqx.f19914jd.ci() && rv.wqx(this.wqx.f19914jd)) {
            return;
        }
        va.jpo((View) this.f20024jj, 8);
        va.jpo((View) this.f20022dt, 8);
        va.jpo(this.f20027qk, 8);
        va.jpo(this.xyk, 8);
        jd(8);
        va.jpo((View) this.my, 8);
        va.jpo((View) this.zz, 8);
        va.jpo((View) this.f20026ju, 8);
        va.jpo((View) this.f20031yd, 8);
    }

    public void hna() {
        nmd nmdVar = this.prr;
        if (nmdVar != null) {
            nmdVar.xyk();
        }
    }

    /* renamed from: if */
    public void mo445if() {
        try {
            oya oyaVar = this.f110if;
            if (oyaVar != null) {
                oyaVar.wqx();
            }
            RelativeLayout relativeLayout = this.f20026ju;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.f20026ju;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void jd() {
        if (this.f20028rq) {
            return;
        }
        this.f20028rq = true;
        this.nmd = this.wqx.sbx;
        if (jpo()) {
            oya oyaVar = new oya(this.wqx);
            this.f110if = oyaVar;
            oyaVar.jpo();
        }
        opi();
        Activity activity = this.f20023jd;
        dt dtVar = this.f20021cm;
        String str = this.f20025jr;
        FrameLayout frameLayout = this.f20024jj;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.wqx;
        nmd nmdVar = new nmd(activity, dtVar, str, frameLayout, jpoVar.roc, jpoVar.f19930va);
        this.prr = nmdVar;
        nmdVar.jpo();
    }

    public FrameLayout jj() {
        return this.f20024jj;
    }

    public boolean jpo() {
        return true;
    }

    public View ju() {
        return this.f20030tu;
    }

    public void my() {
        int iUmr = this.f20021cm.umr();
        this.jpo = iUmr;
        if (iUmr == -200) {
            this.jpo = sq.cm().oya(String.valueOf(this.f20021cm.jl()));
        }
        if (this.jpo != -1 || jpo()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx.ree;
        if ((jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.cm) || (jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.wqx)) {
            return;
        }
        jd(0);
    }

    public void oya() {
        nmd nmdVar = this.prr;
        if (nmdVar != null) {
            nmdVar.jj();
        }
        ImageView imageView = this.my;
        if (imageView != null) {
            imageView.removeCallbacks(this.f20029sq);
        }
    }

    public void prr() {
        nmd nmdVar = this.prr;
        if (nmdVar != null) {
            nmdVar.qk();
        }
    }

    public void qk() {
        if (this.f20031yd.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20031yd.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.f20031yd.setLayoutParams(marginLayoutParams);
        }
    }

    public void sq() {
        com.bytedance.sdk.openadsdk.core.wqx.my myVarMy = this.wqx.f19923rv.my();
        View view = this.f20030tu;
        if (view == null) {
            view = this.wqx.f19930va;
        }
        myVarMy.onClick(view);
    }

    public void wqx() {
        this.f20024jj.removeAllViews();
    }

    public void xyk() {
        my myVar = this.f20030tu;
        if (myVar == null) {
            return;
        }
        myVar.jpo();
    }

    public View yd() {
        return this.my;
    }

    public boolean zz() {
        ImageView imageView = this.my;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void jj(int i10) {
        va.jpo((View) this.my, i10);
    }

    public void wqx(int i10) {
        dt dtVar = this.f20021cm;
        if (dtVar != null && dtVar.ci() && rv.wqx(this.f20021cm)) {
            va.jpo((View) this.f20022dt, i10);
        }
    }

    public void jpo(boolean z10) {
        va.jpo((View) this.zz, rv.wqx(this.f20021cm) ? 8 : 0);
        va.jpo((View) this.f20031yd, (this.f20021cm.ig() && this.f20021cm.jr()) ? 0 : 8);
        jd(z10);
        if (this.opi) {
            my();
        }
    }

    public void my(int i10) {
        int i11 = this.jpo;
        if (i11 == -1 || i10 != i11 || this.oya.get()) {
            return;
        }
        jd(0);
        this.oya.set(true);
        xyk();
    }

    public void jpo(int i10) {
        if (this.hna == null) {
            this.hna = new com.bytedance.sdk.openadsdk.core.jj.jj(this.wqx.vrc);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            layoutParams.gravity = 17;
            this.hna.setLayoutParams(layoutParams);
            this.hna.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(this.wqx.vrc, "tt_video_loading_progress_bar"));
            this.wqx.tic.jj().addView(this.hna);
        }
        this.hna.setVisibility(i10);
    }

    public void jd(boolean z10) {
        ImageView imageView;
        int iJpo;
        if (this.nmd != 1 && (imageView = this.my) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iJpo = jpo("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iJpo > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iJpo;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx.ree;
        if ((jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.cm) || (jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.wqx)) {
            return;
        }
        jd(0);
    }

    public void cm(int i10) {
        va.jpo((View) this.zz, i10);
    }

    public void jpo(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.f20021cm.wu() == 1 && (frameLayout = this.f20024jj) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iWqx = va.wqx((Context) this.f20023jd);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20024jj.getLayoutParams();
            layoutParams.width = iWqx;
            int i12 = (iWqx * 9) / 16;
            layoutParams.height = i12;
            this.f20024jj.setLayoutParams(layoutParams);
            this.f20020au = (va.my(this.f20023jd) - i12) / 2;
        }
    }

    public void jd(int i10) {
        dt dtVar = this.f20021cm;
        if (dtVar != null && dtVar.ig() && prr.jpo(this.f20021cm)) {
            va.jpo((View) this.f20030tu, 8);
        } else {
            va.jpo((View) this.f20030tu, i10);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.wqx wqxVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        dt dtVar;
        if (this.f20024jj != null && (dtVar = this.f20021cm) != null && dtVar.sg() != null) {
            if (this.f20021cm.sg().f20707jj && !nmd.jd(this.f20021cm)) {
                jpo((View.OnClickListener) wqxVar);
                jpo(wqxVar);
            } else {
                jpo(onClickListener);
            }
        }
        dt dtVar2 = this.f20021cm;
        if (dtVar2 != null && dtVar2.wu() == 1) {
            if (this.f20021cm.sg() != null && (view2 = this.f20027qk) != null) {
                va.jpo(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20027qk.getLayoutParams();
                layoutParams.height = this.f20020au;
                this.f20027qk.setLayoutParams(layoutParams);
                if (this.f20021cm.sg().f20706jd) {
                    this.f20027qk.setOnClickListener(wqxVar);
                    this.f20027qk.setOnTouchListener(onTouchListener);
                } else {
                    this.f20027qk.setOnClickListener(onClickListener);
                }
            }
            if (this.f20021cm.sg() != null && (view = this.xyk) != null) {
                va.jpo(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.xyk.getLayoutParams();
                layoutParams2.height = this.f20020au;
                this.xyk.setLayoutParams(layoutParams2);
                if (this.f20021cm.sg().f20705cm) {
                    this.xyk.setOnClickListener(wqxVar);
                    this.xyk.setOnTouchListener(onTouchListener);
                } else {
                    this.xyk.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.zz;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.if.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        Cif cif = Cif.this;
                        TTWebsiteActivity.jpo(cif.f20023jd, cif.f20021cm, cif.f20025jr);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.nmd.wqx("TTAD.RFullVideoLayout", th2.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.f20031yd;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo((int) va.jpo(sq.jpo(), 14.0f, true), this.f20031yd, this.wqx.f19914jd);
        }
    }

    private int jpo(String str) {
        Resources resources = this.f20023jd.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void jpo(View.OnClickListener onClickListener) {
        va.jpo(this.f20024jj, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.wqx.wqx wqxVar) {
        va.jpo((View) this.f20024jj, (View.OnTouchListener) wqxVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void jpo(float f10) {
        va.jpo(this.my, f10);
    }

    public void jpo(Animation animation) {
        RelativeLayout relativeLayout = this.f20026ju;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void jpo(int i10, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        nmd nmdVar = this.prr;
        if (nmdVar != null) {
            nmdVar.jpo(i10, oyaVar);
        }
    }
}
