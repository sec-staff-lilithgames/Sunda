package com.bytedance.sdk.openadsdk.jpo.jd;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.hna;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.jd.jpo;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends xyk implements wqx.cm, wqx.InterfaceC0052wqx, jpo.InterfaceC0146jpo {

    /* renamed from: au, reason: collision with root package name */
    private long f21215au;

    /* renamed from: if, reason: not valid java name */
    private AdSlot f154if;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f21216ju;
    private wqx xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f21217yd;
    private final com.bytedance.sdk.openadsdk.multipro.jd.jpo zz;

    public jd(Context context, dt dtVar, int i10, AdSlot adSlot) {
        super(context, dtVar, i10, true);
        this.f21217yd = false;
        this.f21216ju = true;
        this.my = i10;
        this.f154if = adSlot;
        this.zz = new com.bytedance.sdk.openadsdk.multipro.jd.jpo();
        jpo(this.f21236jj);
        jpo("embeded_ad");
        this.f21234cm.jpo(this);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void e_() {
        wqx wqxVar = this.xyk;
        if (wqxVar != null) {
            wqxVar.jpo(this);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void f_() {
        wqx wqxVar = this.xyk;
        if (wqxVar != null) {
            wqxVar.jd(this);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void h_() {
        wqx wqxVar = this.xyk;
        if (wqxVar != null) {
            wqxVar.wqx(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jd.jpo.InterfaceC0146jpo
    public com.bytedance.sdk.openadsdk.multipro.jd.jpo jj() {
        return this.zz;
    }

    public View my() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar;
        dt dtVar = this.f21235jd;
        if (dtVar != null && this.wqx != null) {
            if (dt.my(dtVar)) {
                try {
                    jjVar = new com.bytedance.sdk.openadsdk.core.au.jd.jj(this.wqx, this.f21235jd, this.jpo.jpo());
                    dt dtVar2 = this.f21235jd;
                    if (dtVar2 != null && dtVar2.ig()) {
                        com.bytedance.sdk.openadsdk.core.p000if.jj jjVarJpo = jjVar.jpo((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        jpo jpoVar = this.f21234cm;
                        if (jpoVar != null) {
                            jpoVar.jpo(jjVarJpo);
                        }
                    }
                    this.jpo.jpo(jjVar.getNativeVideoController());
                    jpo jpoVar2 = this.f21234cm;
                    if (jpoVar2 != null) {
                        jpoVar2.jpo(jjVar);
                    }
                    jjVar.setVideoAdClickListenerTTNativeAd(this);
                    jjVar.setAdCreativeClickListener(new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jd.1
                        @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jpo
                        public void jpo(View view, int i10) {
                            hna hnaVar = jd.this.jpo;
                            if (hnaVar != null) {
                                hnaVar.jpo(view, i10);
                            }
                        }
                    });
                    jjVar.setControllerStatusCallBack(new jj.jd() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jd.2
                        @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jd
                        public void jpo(boolean z10, long j10, long j11, long j12, boolean z11) {
                            jd.this.zz.jpo = z10;
                            jd.this.zz.my = j10;
                            jd.this.zz.f21287jj = j11;
                            jd.this.zz.f21288qk = j12;
                            jd.this.zz.f21285cm = z11;
                        }
                    });
                    jjVar.setVideoAdLoadListener(this);
                    jjVar.setVideoAdInteractionListener(this);
                    if (5 == this.my) {
                        jjVar.setIsAutoPlay(this.f21217yd ? this.f154if.isAutoPlay() : this.f21216ju);
                    } else {
                        jjVar.setIsAutoPlay(this.f21216ju);
                    }
                    jjVar.jpo(sq.cm().jd(String.valueOf(this.f21236jj)), "feedGetAdView");
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("", "getAdView null", e10);
                }
                if (!dt.my(this.f21235jd) && jjVar != null && jjVar.jpo(0L, true, false)) {
                    return jjVar;
                }
                ApmHelper.reportCustomError(this.f21235jd.iqh() + "," + jjVar, "getAdView null", new RuntimeException());
            } else {
                jjVar = null;
                if (!dt.my(this.f21235jd)) {
                }
                ApmHelper.reportCustomError(this.f21235jd.iqh() + "," + jjVar, "getAdView null", new RuntimeException());
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.jd.xyk, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        jpo jpoVar = this.f21234cm;
        if (jpoVar != null) {
            jpoVar.m486if();
        }
    }

    private void jpo(int i10) {
        int iJd = sq.cm().jd(i10);
        int iWqx = opi.wqx(sq.jpo());
        if (3 == iJd) {
            this.f21217yd = false;
            this.f21216ju = false;
        } else {
            if (1 == iJd && tic.cm(iWqx)) {
                this.f21217yd = false;
            } else if (2 == iJd) {
                if (tic.my(iWqx) || tic.cm(iWqx) || tic.jj(iWqx)) {
                    this.f21217yd = false;
                }
            } else if (4 == iJd) {
                this.f21217yd = true;
            } else if (5 == iJd && (tic.cm(iWqx) || tic.jj(iWqx))) {
            }
            this.f21216ju = true;
        }
        jpo jpoVar = this.f21234cm;
        if (jpoVar != null) {
            jpoVar.jpo(this.f21217yd);
        }
    }

    public jd(Context context, dt dtVar, int i10, AdSlot adSlot, jpo jpoVar, hna hnaVar) {
        super(context, dtVar, i10, false);
        this.f21217yd = false;
        this.f21216ju = true;
        this.f21234cm = jpoVar;
        this.jpo = hnaVar;
        this.my = i10;
        this.f154if = adSlot;
        this.zz = new com.bytedance.sdk.openadsdk.multipro.jd.jpo();
        jpo(this.f21236jj);
        jpo("embeded_ad");
        jpoVar.jpo(this);
    }

    public void jpo(wqx wqxVar) {
        this.xyk = wqxVar;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.cm
    public void jpo(int i10, int i11) {
        wqx wqxVar = this.xyk;
        if (wqxVar != null) {
            wqxVar.jpo(i10, i11);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void jpo(long j10, long j11) {
        this.f21215au = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.jd.xyk
    public void jpo(String str) {
        super.jpo(str);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void g_() {
    }
}
