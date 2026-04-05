package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hna;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.Cif;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.core.zz.opi;
import com.bytedance.sdk.openadsdk.utils.va;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends com.bytedance.sdk.openadsdk.core.zz.jpo implements wqx.cm, wqx.InterfaceC0052wqx {

    /* renamed from: au, reason: collision with root package name */
    private nmd f20284au;
    private String hna;
    public boolean jpo;
    private PAGBannerAdWrapperListener opi;
    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj oya;
    private com.bytedance.sdk.openadsdk.core.au.jd.jj prr;

    /* renamed from: sq, reason: collision with root package name */
    private long f20285sq;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public PAGLogoView f20286cm;

        /* renamed from: jd, reason: collision with root package name */
        public Cif f20287jd;
        public FrameLayout jpo;
        public com.bytedance.sdk.openadsdk.core.jj.cm my;
        public com.bytedance.sdk.openadsdk.core.jj.cm wqx;

        private jpo() {
        }
    }

    public zz(Context context) {
        super(context);
        this.jpo = true;
        this.f21072jd = context;
    }

    private void my() {
        opi opiVarJpo = jd.jpo(this.f20284au.getExpectExpressWidth(), this.f20284au.getExpectExpressHeight());
        if (this.f20284au.getExpectExpressWidth() <= 0 || this.f20284au.getExpectExpressHeight() <= 0) {
            int iWqx = va.wqx(this.f21072jd);
            this.f21075qk = iWqx;
            this.xyk = Float.valueOf(iWqx / opiVarJpo.f21124jd).intValue();
        } else {
            this.f21075qk = va.jd(this.f21072jd, this.f20284au.getExpectExpressWidth());
            this.xyk = va.jd(this.f21072jd, this.f20284au.getExpectExpressHeight());
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
        jpo(opiVarJpo);
    }

    public long getVideoProgress() {
        return this.f20285sq;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.cm
    public void jpo(int i10, int i11) {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.opi = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.hna = str;
    }

    private jpo jd(opi opiVar) {
        jpo jpoVar = new jpo();
        jpoVar.jpo = new FrameLayout(this.f21072jd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        jpoVar.jpo.setLayoutParams(layoutParams);
        jpoVar.f20287jd = new Cif(this.f21072jd);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        jpoVar.f20287jd.setLayoutParams(layoutParams2);
        jpoVar.jpo.addView(jpoVar.f20287jd);
        int iJd = va.jd(this.f21072jd, 5.0f);
        if (opiVar == null || opiVar.jpo != 1) {
            jpoVar.wqx = com.bytedance.sdk.openadsdk.core.widget.jj.jd(getContext());
        } else {
            jpoVar.wqx = com.bytedance.sdk.openadsdk.core.widget.jj.jpo(getContext());
        }
        jpoVar.wqx.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(iJd, iJd, iJd, iJd);
        jpoVar.wqx.setLayoutParams(layoutParams3);
        jpoVar.jpo.addView(jpoVar.wqx);
        jpoVar.f20286cm = PAGLogoView.createPAGLogoViewByMaterial(this.f21072jd, this.wqx);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(iJd, iJd, iJd, iJd);
        jpoVar.f20286cm.setLayoutParams(layoutParams4);
        jpoVar.jpo.addView(jpoVar.f20286cm);
        jpoVar.my = new com.bytedance.sdk.openadsdk.core.jj.cm(this.f21072jd);
        int iJd2 = va.jd(this.f21072jd, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iJd2, iJd2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = iJd;
        layoutParams5.bottomMargin = iJd;
        jpoVar.my.setVisibility(8);
        jpoVar.my.setScaleType(ImageView.ScaleType.FIT_CENTER);
        jpoVar.my.setLayoutParams(layoutParams5);
        jpoVar.jpo.addView(jpoVar.my);
        return jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.jpo
    public void jpo(View view, int i10, hna hnaVar) {
        nmd nmdVar = this.f20284au;
        if (nmdVar != null) {
            nmdVar.jpo(view, i10, hnaVar);
            com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.prr;
            if (jjVar == null || jjVar.getNativeVideoController() == null) {
                return;
            }
            this.prr.getNativeVideoController().dm();
        }
    }

    public void jpo(dt dtVar, nmd nmdVar, com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar) {
        setBackgroundColor(-16777216);
        this.wqx = dtVar;
        this.f20284au = nmdVar;
        this.oya = jjVar;
        this.f21073jj = "banner_ad";
        nmdVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        my();
    }

    private void jpo(opi opiVar) {
        View view;
        dt dtVar = this.wqx;
        if (dtVar != null) {
            int iIqh = dtVar.iqh();
            jpo jpoVarJd = jd(opiVar);
            if (jpoVarJd == null || (view = jpoVarJd.jpo) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.jj.cm cmVar = jpoVarJd.wqx;
            PAGLogoView pAGLogoView = jpoVarJd.f20286cm;
            com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = jpoVarJd.my;
            if (cmVar2 != null && this.wqx.jr()) {
                va.jpo((View) cmVar2, 0);
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo((int) va.jpo(sq.jpo(), 11.0f, true), cmVar2, this.wqx);
            }
            com.bytedance.sdk.openadsdk.core.au.jd.jj videoView = getVideoView();
            if (videoView != null) {
                this.prr = videoView;
                videoView.setVideoAdLoadListener(this);
                this.prr.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(cmVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(cmVar2, friendlyObstructionPurpose));
                this.prr.jpo(arrayList);
                this.prr.setAdCreativeClickListener(new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.zz.1
                    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jpo
                    public void jpo(View view2, int i10) {
                        if (zz.this.opi != null) {
                            zz.this.opi.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.zz.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.jpo(((com.bytedance.sdk.openadsdk.core.zz.jpo) zz.this).f21072jd, ((com.bytedance.sdk.openadsdk.core.zz.jpo) zz.this).wqx, ((com.bytedance.sdk.openadsdk.core.zz.jpo) zz.this).f21073jj);
                    }
                });
            }
            if (cmVar != null) {
                cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.zz.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        zz.this.jpo();
                    }
                });
            }
            Cif cif = jpoVarJd.f20287jd;
            dt dtVar2 = this.wqx;
            if (dtVar2 != null && dtVar2.zuz() != null && cif != null) {
                int iJu = this.wqx.zuz().ju();
                float fM460if = this.wqx.zuz().m460if();
                if (iJu > 0 && fM460if > 0.0f) {
                    cif.setRatio(iJu / fM460if);
                } else if (iIqh == 15) {
                    cif.setRatio(0.5625f);
                } else if (iIqh == 5) {
                    cif.setRatio(1.7777778f);
                } else {
                    cif.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && cif != null) {
                cif.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            jpo((View) videoView, true);
            jpo((View) this, true);
            jpo(cif);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void e_() {
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void f_() {
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void g_() {
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void h_() {
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
            TTDelegateActivity.jpo(this.wqx, this.hna);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void jpo(long j10, long j11) {
        this.f20285sq = j10;
    }
}
