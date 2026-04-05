package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.Cif;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.au;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.core.zz.jr;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.core.zz.opi;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.sdk.openadsdk.core.zz.jpo {
    public static opi[] jpo = {new opi(1, 6.4f, 320, 50), new opi(4, 1.2f, 300, 250)};

    /* renamed from: au, reason: collision with root package name */
    private jpo f20244au;
    private PAGBannerAdWrapperListener hna;
    private nmd oya;
    private String prr;

    public jd(Context context) {
        super(context);
        this.f21072jd = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.hna = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.prr = str;
    }

    private void cm() {
        jpo jpoVarJj = jj();
        this.f20244au = jpoVarJj;
        View view = jpoVarJj.f20247jj;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jd.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21073jj);
                }
            });
        }
        au auVar = this.f20244au.jpo;
        if (auVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.opi> listFri = this.wqx.fri();
            if (listFri != null && !listFri.isEmpty()) {
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(listFri.get(0), auVar, this.wqx);
            }
            jpo((View) auVar, true);
            auVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private void jd() {
        opi opiVarJpo = jpo(this.oya.getExpectExpressWidth(), this.oya.getExpectExpressHeight());
        if (this.oya.getExpectExpressWidth() <= 0 || this.oya.getExpectExpressHeight() <= 0) {
            int iWqx = va.wqx(this.f21072jd);
            this.f21075qk = iWqx;
            this.xyk = Float.valueOf(iWqx / opiVarJpo.f21124jd).intValue();
        } else {
            this.f21075qk = va.jd(this.f21072jd, this.oya.getExpectExpressWidth());
            this.xyk = va.jd(this.f21072jd, this.oya.getExpectExpressHeight());
        }
        int i10 = this.f21075qk;
        if (i10 > 0 && i10 > va.wqx(this.f21072jd)) {
            this.f21075qk = va.wqx(this.f21072jd);
            this.xyk = Float.valueOf(this.xyk * (va.wqx(this.f21072jd) / this.f21075qk)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f21075qk, this.xyk);
        }
        layoutParams.width = this.f21075qk;
        layoutParams.height = this.xyk;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        dt dtVar = this.wqx;
        if (dtVar != null) {
            int iIqh = dtVar.iqh();
            if (iIqh == 1010 || iIqh == 1011 || iIqh == 1012) {
                cm();
            } else {
                jpo(opiVarJpo);
            }
        }
    }

    private jpo jj() {
        int iJd = va.jd(this.f21072jd, 8.0f);
        au auVar = new au(this.f21072jd);
        auVar.setId(520093736);
        auVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(auVar, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f21072jd, this.wqx);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iJd, iJd, 0, 0);
        layoutParams2.gravity = 8388659;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new jpo(viewCreatePAGLogoViewByMaterial, auVar);
    }

    private void my() {
        TextView textView;
        dt dtVar = this.wqx;
        if (dtVar != null) {
            int iIqh = dtVar.iqh();
            if (this.wqx.ww() == null) {
                jpo jpoVarXyk = xyk();
                this.f20244au = jpoVarXyk;
                au auVar = jpoVarXyk.jpo;
                ImageView imageView = jpoVarXyk.wqx;
                TextView textView2 = jpoVarXyk.f20246jd;
                TextView textView3 = jpoVarXyk.f20248qk;
                View view = jpoVarXyk.f20247jj;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jd.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21073jj);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = auVar.getLayoutParams();
                if (this.f21075qk - (va.jd(this.f21072jd, 8.0f) * 2) >= ((this.xyk - va.jd(this.f21072jd, 8.0f)) - (va.jd(this.f21072jd, 21.0f) * 2)) - va.jd(this.f21072jd, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                auVar.setLayoutParams(layoutParams);
                if (iIqh == 33) {
                    auVar.setRatio(1.0f);
                } else {
                    auVar.setRatio(1.91f);
                }
                List<com.bytedance.sdk.openadsdk.core.model.opi> listFri = this.wqx.fri();
                if (listFri != null && !listFri.isEmpty()) {
                    com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(listFri.get(0), auVar, this.wqx);
                    com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(listFri.get(0).jpo(), this.f20244au.my);
                }
                if (this.wqx.ou() == null || TextUtils.isEmpty(this.wqx.ou().jpo())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.wqx.ou().jpo(), this.wqx.ou().jd(), this.wqx.ou().wqx(), imageView, this.wqx);
                }
                textView.setText(this.wqx.ozw());
                if (TextUtils.isEmpty(this.wqx.clt())) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(this.wqx.clt());
                }
                va.jpo((TextView) null, this.f20244au.f20245cm, this.wqx);
                jpo((View) auVar, true);
                auVar.setTag(520093762, Boolean.TRUE);
                jpo((View) this, true);
                jpo((View) textView3, true);
                return;
            }
            jpo jpoVarZz = zz();
            this.f20244au = jpoVarZz;
            TextView textView4 = jpoVarZz.f20246jd;
            TextView textView5 = jpoVarZz.f20248qk;
            Cif cif = jpoVarZz.xyk;
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.wqx.ww().yd(), this.f20244au.my);
            View view2 = this.f20244au.f20247jj;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jd.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21073jj);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = cif.getLayoutParams();
            if (iIqh == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                cif.setLayoutParams(layoutParams2);
                cif.setRatio(0.5625f);
            } else if (iIqh == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                cif.setLayoutParams(layoutParams2);
                cif.setRatio(1.7777778f);
            } else {
                if (this.f21075qk - (va.jd(this.f21072jd, 8.0f) * 2) >= ((this.xyk - va.jd(this.f21072jd, 8.0f)) - (va.jd(this.f21072jd, 21.0f) * 2)) - va.jd(this.f21072jd, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                cif.setLayoutParams(layoutParams2);
                cif.setRatio(1.0f);
            }
            cif.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.au.jd.jj videoView = getVideoView();
            if (videoView != null) {
                if (this.oya instanceof jr) {
                    videoView.setNeedSelfManagerVideo(!((jr) r7).au());
                    ((jr) this.oya).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((jr) this.oya);
                }
                cif.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.jd.5
                    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jpo
                    public void jpo(View view3, int i10) {
                        if (jd.this.hna != null) {
                            jd.this.hna.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.zz.xyk clickCreativeListener = this.oya.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.jpo(videoView.getNativeVideoController());
                }
            }
            if (this.wqx.ou() != null && !TextUtils.isEmpty(this.wqx.ou().jpo())) {
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.wqx.ou().jpo(), this.wqx.ou().jd(), this.wqx.ou().wqx(), this.f20244au.wqx, this.wqx);
            }
            textView4.setText(this.wqx.ozw());
            va.jpo((TextView) null, this.f20244au.f20245cm, this.wqx);
            if (TextUtils.isEmpty(this.wqx.clt())) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(this.wqx.clt());
            }
            jpo((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            jpo((View) this, true);
            jpo((View) textView5, true);
            jpo(cif);
        }
    }

    private jpo qk() {
        int iJd = va.jd(this.f21072jd, 38.0f);
        int iJd2 = (int) (va.jd(this.f21072jd, 25.0f) / 5.0d);
        int iJd3 = va.jd(this.f21072jd, 10.0f);
        int iJd4 = va.jd(this.f21072jd, 2.0f);
        int iJd5 = va.jd(this.f21072jd, 6.0f);
        int iJd6 = va.jd(this.f21072jd, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f21072jd);
        addView(relativeLayout, -1, -1);
        sq sqVar = new sq(this.f21072jd);
        sqVar.setId(520093738);
        TextView textView = new TextView(this.f21072jd);
        textView.setId(520093730);
        hna hnaVar = new hna(this.f21072jd);
        hnaVar.setId(520093735);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f21072jd, this.wqx);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.f21072jd);
        textView2.setId(520093703);
        jpo jpoVar = new jpo(sqVar, textView, hnaVar, viewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iJd, iJd);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iJd5);
        layoutParams.setMargins(iJd5, 0, 0, 0);
        sqVar.setLayoutParams(layoutParams);
        sqVar.setBackgroundColor(-1);
        sqVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(sqVar);
        LinearLayout linearLayout = new LinearLayout(this.f21072jd);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, sqVar.getId());
        layoutParams2.setMarginStart(iJd6);
        layoutParams2.setMarginEnd(iJd6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, sqVar.getId());
        layoutParams2.setMargins(iJd6, 0, iJd6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iJd4;
        hnaVar.setLayoutParams(layoutParams4);
        linearLayout.addView(hnaVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iJd5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iJd5;
        textView2.setBackground(ju.jpo(this.f21072jd, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iJd3, iJd2, iJd3, iJd2);
        textView2.setText(com.bytedance.sdk.component.utils.dt.jpo(this.f21072jd, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return jpoVar;
    }

    private void wqx() {
        va.jd(this.f21072jd, 50.0f);
        jpo jpoVarQk = qk();
        this.f20244au = jpoVarQk;
        ImageView imageView = jpoVarQk.wqx;
        TextView textView = jpoVarQk.f20246jd;
        hna hnaVar = jpoVarQk.f20245cm;
        TextView textView2 = jpoVarQk.f20248qk;
        View view = jpoVarQk.f20247jj;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) jd.this).f21073jj);
                }
            });
        }
        if (this.wqx.ou() != null && !TextUtils.isEmpty(this.wqx.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.wqx.ou().jpo(), this.wqx.ou().jd(), this.wqx.ou().wqx(), imageView, this.wqx);
        }
        textView.setText(this.wqx.ozw());
        if (TextUtils.isEmpty(this.wqx.clt())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.wqx.clt());
        }
        va.jpo((TextView) null, hnaVar, this.wqx);
        jpo((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        jpo((View) this, true);
        jpo((View) textView2, true);
    }

    private jpo xyk() {
        int iJd = va.jd(this.f21072jd, 8.0f);
        int iJd2 = va.jd(this.f21072jd, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f21072jd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iJd, iJd, iJd, iJd2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f21072jd);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        sq sqVar = new sq(this.f21072jd);
        sqVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(va.jd(this.f21072jd, 52.0f), va.jd(this.f21072jd, 52.0f));
        sqVar.setScaleType(ImageView.ScaleType.FIT_XY);
        sqVar.setLayoutParams(layoutParams3);
        linearLayout.addView(sqVar);
        LinearLayout linearLayout2 = new LinearLayout(this.f21072jd);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iJd;
        layoutParams4.rightMargin = iJd;
        layoutParams4.setMarginStart(iJd);
        layoutParams4.setMarginEnd(iJd);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f21072jd);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        hna hnaVar = new hna(this.f21072jd);
        hnaVar.setId(520093735);
        linearLayout2.addView(hnaVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.f21072jd);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(va.jd(this.f21072jd, 76.0f), va.jd(this.f21072jd, 36.0f));
        textView2.setBackground(ju.jpo(this.f21072jd, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.dt.jpo(this.f21072jd, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f21072jd);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iJd2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        au auVar = new au(this.f21072jd);
        auVar.setId(520093736);
        auVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(auVar, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f21072jd, this.wqx);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iJd, iJd, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new jpo(sqVar, viewCreatePAGLogoViewByMaterial, textView2, textView, auVar, hnaVar, frameLayout);
    }

    private jpo zz() {
        int iJd = va.jd(this.f21072jd, 8.0f);
        int iJd2 = va.jd(this.f21072jd, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.f21072jd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iJd, iJd, iJd, iJd2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.f21072jd);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        sq sqVar = new sq(this.f21072jd);
        sqVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(va.jd(this.f21072jd, 52.0f), va.jd(this.f21072jd, 52.0f));
        sqVar.setScaleType(ImageView.ScaleType.FIT_XY);
        sqVar.setLayoutParams(layoutParams3);
        linearLayout.addView(sqVar);
        LinearLayout linearLayout2 = new LinearLayout(this.f21072jd);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iJd;
        layoutParams4.rightMargin = iJd;
        layoutParams4.setMarginStart(iJd);
        layoutParams4.setMarginEnd(iJd);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.f21072jd);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        hna hnaVar = new hna(this.f21072jd);
        hnaVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = va.jd(this.f21072jd, 4.0f);
        linearLayout2.addView(hnaVar, layoutParams6);
        TextView textView2 = new TextView(this.f21072jd);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(va.jd(this.f21072jd, 76.0f), va.jd(this.f21072jd, 36.0f));
        textView2.setBackground(ju.jpo(this.f21072jd, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.dt.jpo(this.f21072jd, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.f21072jd);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iJd2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        Cif cif = new Cif(this.f21072jd);
        cif.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        cif.setLayoutParams(layoutParams9);
        frameLayout.addView(cif);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f21072jd, this.wqx);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iJd, iJd, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new jpo(sqVar, viewCreatePAGLogoViewByMaterial, textView2, textView, cif, hnaVar, frameLayout);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.jpo
    public void jpo(View view, int i10, com.bytedance.sdk.openadsdk.core.model.hna hnaVar) {
        nmd nmdVar = this.oya;
        if (nmdVar != null) {
            nmdVar.jpo(view, i10, hnaVar);
        }
    }

    public void jpo(dt dtVar, nmd nmdVar, com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar) {
        setBackgroundColor(-1);
        this.wqx = dtVar;
        this.oya = nmdVar;
        this.f21073jj = "banner_ad";
        nmdVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        jd();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        hna f20245cm;

        /* renamed from: jd, reason: collision with root package name */
        public TextView f20246jd;

        /* renamed from: jj, reason: collision with root package name */
        View f20247jj;
        public au jpo;
        FrameLayout my;

        /* renamed from: qk, reason: collision with root package name */
        TextView f20248qk;
        ImageView wqx;
        private Cif xyk;

        public jpo(ImageView imageView, TextView textView, hna hnaVar, View view, TextView textView2) {
            this.wqx = imageView;
            this.f20246jd = textView;
            this.f20245cm = hnaVar;
            this.f20247jj = view;
            this.f20248qk = textView2;
        }

        public jpo(ImageView imageView, View view, TextView textView, TextView textView2, au auVar, hna hnaVar, FrameLayout frameLayout) {
            this.wqx = imageView;
            this.f20247jj = view;
            this.f20248qk = textView;
            this.f20246jd = textView2;
            this.jpo = auVar;
            this.f20245cm = hnaVar;
            this.my = frameLayout;
        }

        public jpo(ImageView imageView, View view, TextView textView, TextView textView2, Cif cif, hna hnaVar, FrameLayout frameLayout) {
            this.wqx = imageView;
            this.f20247jj = view;
            this.f20248qk = textView;
            this.f20246jd = textView2;
            this.xyk = cif;
            this.f20245cm = hnaVar;
            this.my = frameLayout;
        }

        public jpo(View view, au auVar) {
            this.f20247jj = view;
            this.jpo = auVar;
        }
    }

    private void jpo(opi opiVar) {
        if (opiVar.jpo == 1) {
            wqx();
        } else {
            my();
        }
    }

    public static opi jpo(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? jpo[1] : jpo[0];
        } catch (Throwable unused) {
            return jpo[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.jpo
    public void jpo() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.my;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.wqx.wqx wqxVar = this.f21071cm;
        if (wqxVar != null) {
            wqxVar.jpo();
        } else {
            TTDelegateActivity.jpo(this.wqx, this.prr);
        }
    }
}
