package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.jd;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.core.zz.xyk;
import com.bytedance.sdk.openadsdk.core.zz.zz;
import com.ironsource.C3191e4;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.jj.jd f19762au;
    private com.bytedance.sdk.openadsdk.component.zz.qk hna;
    private com.bytedance.sdk.openadsdk.component.zz.jd oya;
    private boolean prr;

    public jd(Activity activity, dt dtVar, FrameLayout frameLayout, jpo jpoVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar2, com.bytedance.sdk.openadsdk.component.jj.jd jdVar) {
        super(activity, dtVar, frameLayout, jpoVar, i10, z10, jpoVar2);
        this.f19762au = jdVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public void my() {
        com.bytedance.sdk.openadsdk.component.zz.jd jdVar = this.oya;
        if (jdVar != null) {
            jdVar.opi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public int cm() {
        return this.oya.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public void jd() {
        this.oya.jr();
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public void wqx() {
        super.wqx();
        com.bytedance.sdk.openadsdk.component.zz.jd jdVar = this.oya;
        if (jdVar != null) {
            jdVar.mo446if();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public void jpo(ViewGroup viewGroup) {
        Pair<Float, Float> pairJpo = com.bytedance.sdk.openadsdk.core.zz.jpo.jpo.jpo(this.jpo.getWindow(), this.f20087qk);
        com.bytedance.sdk.openadsdk.component.zz.jd jdVar = new com.bytedance.sdk.openadsdk.component.zz.jd(this.jpo, this.f20082jd, new AdSlot.Builder().setCodeId(String.valueOf(this.f20082jd.jl())).setExpressViewAcceptedSize(((Float) pairJpo.first).floatValue(), ((Float) pairJpo.second).floatValue()).build(), "open_ad", this.my, this.f19762au, this.f111if);
        this.oya = jdVar;
        jdVar.setTopListener(this.my);
        this.oya.setExpressVideoListenerProxy(this.my);
        this.oya.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.jd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                jd.this.my.cm();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (jd.this.oya.rq()) {
                    jd.this.prr = true;
                    if (jd.this.hna != null) {
                        jd jdVar2 = jd.this;
                        if (jdVar2.f20079cm == jdVar2.hna.getParent()) {
                            jd jdVar3 = jd.this;
                            jdVar3.f20079cm.removeView(jdVar3.hna);
                        }
                    }
                    jd jdVar4 = jd.this;
                    jd.super.jpo((ViewGroup) jdVar4.f20079cm);
                    jd.super.jpo();
                    jd.super.jd();
                    return;
                }
                if (jd.this.f20082jd.se()) {
                    jd.this.my.wqx();
                    return;
                }
                jd jdVar5 = jd.this;
                if (!jdVar5.wqx) {
                    jdVar5.my.wqx();
                } else if (!jdVar5.jpo(jdVar5.oya.getVideoFrameLayout())) {
                    jd.this.my.cm();
                } else {
                    jd.this.oya.setVideoManager(jd.this.qk());
                    jd.this.my.wqx();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }
        });
        this.f20082jd.prr(1);
        this.f20079cm.addView(this.oya, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.zz.qk qkVar = new com.bytedance.sdk.openadsdk.component.zz.qk(this.jpo);
        this.hna = qkVar;
        this.f20079cm.addView(qkVar);
        this.zz = this.hna.getTopDislike();
        this.f20092yd = this.hna.getTopSkip();
        this.f20085ju = this.hna.getTopCountDown();
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public void jpo() {
        zz zzVarJpo = com.bytedance.sdk.openadsdk.component.jpo.jd.jpo(this.f20082jd, this.jpo, this.f111if, this.oya);
        zzVarJpo.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.jd.2
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                jd.this.my.my();
            }
        });
        this.oya.setClickListener(zzVarJpo);
        xyk xykVarJd = com.bytedance.sdk.openadsdk.component.jpo.jd.jd(this.f20082jd, this.jpo, this.f111if, this.oya);
        this.oya.setClickCreativeListener(xykVarJd);
        xykVarJd.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.jd.3
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                jd.this.my.my();
            }
        });
        super.jj();
        this.oya.setBackupListener(new com.bytedance.sdk.component.adexpress.jd.wqx() { // from class: com.bytedance.sdk.openadsdk.component.jd.4
            @Override // com.bytedance.sdk.component.adexpress.jd.wqx
            public boolean jpo(ViewGroup viewGroup, int i10) {
                StringBuilder sb2 = new StringBuilder("isUseBackup() called with: view = [");
                sb2.append(viewGroup);
                sb2.append("], errCode = [");
                sb2.append(i10);
                sb2.append(C3191e4.i.f36531e);
                try {
                    ((nmd) viewGroup).nmd();
                    new com.bytedance.sdk.openadsdk.component.zz.jpo(jd.this.jpo).jpo((nmd) jd.this.oya);
                    return true;
                } catch (Exception e10) {
                    Log.e("AppOpenAdExpressManager", "", e10);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public void jpo(int i10, boolean z10) {
        super.jpo(i10, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.component.wqx
    public JSONObject jpo(JSONObject jSONObject) {
        return this.oya.jpo(jSONObject, this.f20082jd);
    }

    public void jpo(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.zz.jd jdVar = this.oya;
        if (jdVar != null) {
            jdVar.jpo(j10, j11);
        }
    }
}
