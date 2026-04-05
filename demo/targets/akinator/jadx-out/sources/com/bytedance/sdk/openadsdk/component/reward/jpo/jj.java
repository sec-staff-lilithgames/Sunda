package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.wqx.jd;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private boolean f19903jd;
    private jpo jpo;

    public jj(jpo jpoVar) {
        this.jpo = jpoVar;
    }

    private void jd() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        jpo jpoVar = this.jpo;
        Activity activity = jpoVar.vrc;
        dt dtVar = jpoVar.f19914jd;
        String str = jpoVar.my;
        com.bytedance.sdk.openadsdk.core.zz.zz zzVar = new com.bytedance.sdk.openadsdk.core.zz.zz(activity, dtVar, str, tic.jpo(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.3
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        zzVar.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.4
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                jj.this.jpo.roc.dm();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        jpo jpoVar2 = this.jpo;
        if (jpoVar2.f19927tl && (xykVar = jpoVar2.ux) != null) {
            int i10 = xykVar.f19414ju + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        zzVar.jpo(map);
        jpo jpoVar3 = this.jpo;
        Activity activity2 = jpoVar3.vrc;
        dt dtVar2 = jpoVar3.f19914jd;
        String str2 = jpoVar3.my;
        com.bytedance.sdk.openadsdk.core.zz.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.zz.xyk(activity2, dtVar2, str2, tic.jpo(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.5
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo, com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
            public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                HashMap map2 = new HashMap();
                map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(jj.this.jpo.hmu.m442if()));
                if (jj.this.jpo.ux != null) {
                    jj.this.jpo.ux.jpo(map2, f10, f11);
                }
                jpo(map2);
                super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        xykVar2.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.6
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i11) {
                jj.this.jpo.roc.dm();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        xykVar2.jpo(map2);
        this.jpo.f19911hx.jpo(zzVar, xykVar2);
    }

    public void jpo(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar;
        this.f19903jd = true;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.jpo.f19914jd.jl())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        jpo jpoVar = this.jpo;
        jpoVar.f19911hx.jpo(adSlotBuild, jpoVar.tic.prr);
        jpo jpoVar2 = this.jpo;
        Cif cif = jpoVar2.duq;
        if (cif != null && (ydVar = jpoVar2.f19911hx) != null) {
            cif.jpo(ydVar.jpo());
        }
        this.jpo.f19911hx.jpo(new com.bytedance.sdk.openadsdk.core.zz.prr() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public long cm() {
                return jj.this.jpo.hmu.jpo();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public boolean jd(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.jpo.jpo(jj.this.jpo);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jj() {
                jj.this.jpo.sz.jpo(jj.this.jpo.ree);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jpo(boolean z10, String str) {
                if (jj.this.jpo.huv != z10) {
                    jj.this.jpo.duq.jpo(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public int my() {
                if (jj.this.jpo.f19911hx.wqx()) {
                    return 4;
                }
                if (jj.this.jpo.f19911hx.cm()) {
                    return 5;
                }
                if (jj.this.jpo.hmu.yd()) {
                    return 1;
                }
                if (jj.this.jpo.hmu.jj()) {
                    return 2;
                }
                jj.this.jpo.hmu.zz();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public long wqx() {
                return jj.this.jpo.hmu.au();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jd() {
                if (jj.this.jpo.tic == null || jj.this.jpo.tic.yd() == null) {
                    return;
                }
                jj.this.jpo.tic.yd().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jpo() {
                jj.this.jpo.duq.cm();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jd(int i10) {
                jj.this.jpo.wcn = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jpo(String str, JSONObject jSONObject) {
                if (jj.this.jpo == null || jj.this.jpo.roc == null) {
                    return;
                }
                jj.this.jpo.roc.jpo(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public boolean jpo(JSONObject jSONObject) {
                if (jj.this.jpo == null || jj.this.jpo.hmu == null) {
                    return false;
                }
                return jj.this.jpo.hmu.jpo(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jpo(int i10) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        jj.this.jpo.hmu.ef();
                        return;
                    }
                    if (i10 == 3) {
                        jj.this.jpo.hmu.jpo(jj.this.jpo.roc);
                        return;
                    } else if (i10 == 4) {
                        jj.this.jpo.hmu.opi();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (jj.this.jpo.hmu.jj() || jj.this.jpo.hmu.zz()) {
                    return;
                }
                jj.this.jpo.roc.jpo(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jpo(int i10, String str) {
                jj.this.jpo.hmu.jpo(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.prr
            public void jpo(int i10, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
                jj.this.jpo.tic.jpo(i10, oyaVar);
            }
        });
        this.jpo.f19911hx.jpo(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (jj.this.jpo == null || jj.this.jpo.f19914jd == null || !jj.this.jpo.f19914jd.jfy()) {
                    return;
                }
                jj.this.jpo.roc.dm();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                if (!jj.this.jpo.f19914jd.aul()) {
                    jj.this.jpo.f19909ef.jpo(true);
                    jj.this.jpo.f19909ef.my();
                }
                jj.this.jpo.f19911hx.my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jj.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jj.this.jpo.ree.jpo(false, false, false, 90);
                    }
                });
                jj.this.jpo.tic.au();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                nmd nmdVar;
                if (!jj.this.jpo.f19914jd.aul()) {
                    if (jj.this.jpo.f19911hx.zz()) {
                        jj.this.jpo.ree.jpo(true);
                        jj.this.jpo.hmu.cm(false);
                    } else {
                        jj.this.jpo.hmu.cm(true);
                    }
                    jj.this.jpo.tic.jpo(8);
                    jj.this.jpo.f19909ef.jpo(true);
                    jj.this.jpo.f19909ef.my();
                    if (jj.this.jpo.f19911hx.zz()) {
                        jj.this.jpo.f19911hx.jd().setBackgroundColor(-16777216);
                        jj.this.jpo.ree.jpo(jj.this.jpo.tic.jj());
                    } else if (jj.this.jpo.f19914jd.ww() != null && jj.this.jpo.ree.jpo()) {
                        jj.this.jpo.f19907dn = true;
                    }
                }
                jj.this.jpo.ree.nq();
                if (nmd.wqx(jj.this.jpo.f19914jd) && (nmdVar = jj.this.jpo.tic.prr) != null) {
                    nmdVar.wqx();
                }
                jj.this.jpo.tic.au();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }
        });
        jd();
        FrameLayout.LayoutParams layoutParams = (this.jpo.f19914jd.aul() || com.bytedance.sdk.openadsdk.core.ju.cm.jpo(this.jpo.f19914jd.tl()) || nmd.wqx(this.jpo.f19914jd)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.jpo.tic.jj().addView(this.jpo.f19911hx.jpo(), layoutParams);
        if (!this.jpo.f19911hx.zz()) {
            this.jpo.ree.jpo(false);
        }
        this.jpo.f19911hx.oya();
    }

    public void jpo(dt dtVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar = this.jpo.f19911hx;
        if (ydVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.cm cmVarJpo = ydVar.jpo();
            ViewParent parent = cmVarJpo.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(cmVarJpo);
            }
            this.jpo.tic.jj().addView(cmVarJpo);
            if (!this.jpo.f19911hx.zz()) {
                this.jpo.ree.jpo(false);
            }
            this.jpo.f19911hx.jpo(dtVar);
            jd();
        }
    }

    public boolean jpo() {
        return this.f19903jd;
    }

    public void jpo(jpo jpoVar) {
        this.jpo = jpoVar;
    }
}
