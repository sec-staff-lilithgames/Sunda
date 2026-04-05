package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.ju.wqx.cm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.se;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi implements cm.jpo, com.bytedance.sdk.openadsdk.core.ju.wqx.jpo, se, com.bytedance.sdk.openadsdk.core.zz.prr {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.jj.wqx f20955cm;

    /* renamed from: jd, reason: collision with root package name */
    private final jpo f20956jd;

    /* renamed from: jj, reason: collision with root package name */
    private ef f20957jj;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f20958ju;
    private final com.bytedance.sdk.openadsdk.core.wqx.jpo my;
    private final com.bytedance.sdk.openadsdk.core.ju.wqx.jd wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f20960yd;

    /* renamed from: qk, reason: collision with root package name */
    private int f20959qk = 0;
    private int zz = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        int cm();

        void jd();

        void jj();

        void jpo();

        void my();

        void wqx();
    }

    public opi(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar, jpo jpoVar2) {
        this.jpo = jpoVar;
        this.f20956jd = jpoVar2;
        this.f20955cm = new com.bytedance.sdk.openadsdk.core.jj.wqx(jpoVar.vrc) { // from class: com.bytedance.sdk.openadsdk.core.widget.opi.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                opi.this.jpo(z10);
            }
        };
        com.bytedance.sdk.openadsdk.core.ju.wqx.jd jdVar = new com.bytedance.sdk.openadsdk.core.ju.wqx.jd(jpoVar.f19920pe, jpoVar.f19914jd, true);
        this.wqx = jdVar;
        jdVar.jpo((com.bytedance.sdk.openadsdk.core.zz.prr) this);
        jdVar.jpo((com.bytedance.sdk.openadsdk.core.ju.wqx.jpo) this);
        com.bytedance.sdk.openadsdk.core.ju.wqx.wqx wqxVarJpo = jdVar.jpo();
        if (wqxVarJpo instanceof com.bytedance.sdk.openadsdk.core.ju.wqx.cm) {
            com.bytedance.sdk.openadsdk.core.ju.wqx.cm cmVar = (com.bytedance.sdk.openadsdk.core.ju.wqx.cm) wqxVarJpo;
            cmVar.jpo((cm.jpo) this);
            ef efVarMy = cmVar.my();
            this.f20957jj = efVarMy;
            if (efVarMy != null) {
                efVarMy.jpo((se) this);
                this.f20957jj.jd(jpoVar.f19914jd.my());
            }
        }
        Context context = jpoVar.f19920pe;
        dt dtVar = jpoVar.f19914jd;
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.core.wqx.jpo(context, dtVar, dtVar.my(), tic.jd(jpoVar.f19914jd));
        this.my = jpoVar3;
        jpoVar3.jpo(com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), jpoVar.f19914jd.my()));
        HashMap map = new HashMap();
        if (rv.jd(jpoVar.f19914jd)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        jpoVar3.jpo(map);
    }

    private void au() {
        this.f20955cm.setVisibility(8);
    }

    /* renamed from: if, reason: not valid java name */
    private boolean m480if() {
        return this.f20955cm.isAttachedToWindow() && this.f20955cm.getVisibility() == 0;
    }

    private void ju() throws JSONException {
        this.f20959qk++;
        jpo jpoVar = this.f20956jd;
        if (jpoVar != null) {
            jpoVar.wqx();
        }
        jpo(true);
        ef efVar = this.f20957jj;
        if (efVar != null) {
            efVar.jpo("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jpo jpoVar2 = this.f20956jd;
            if (jpoVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(jpoVar2.cm(), 0));
            }
            jSONObject2.put("popup_sequence", this.f20959qk);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("UserIdleAskDialog", e10.getMessage());
        }
        dt dtVar = this.jpo.f19914jd;
        com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, dtVar.my(), "show_popup", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public long cm() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jd() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.se
    public void l_() {
        if (this.f20960yd || !m480if()) {
            return;
        }
        au();
        jpo jpoVar = this.f20956jd;
        if (jpoVar != null) {
            jpoVar.jd();
        }
        jpo(false);
        ef efVar = this.f20957jj;
        if (efVar != null) {
            efVar.jpo("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.se
    public int m_() {
        jpo jpoVar = this.f20956jd;
        if (jpoVar != null) {
            return jpoVar.cm();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public int my() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.se
    public void n_() {
        jpo jpoVar = this.f20956jd;
        if (jpoVar != null) {
            jpoVar.my();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.se
    public void o_() {
        jpo jpoVar = this.f20956jd;
        if (jpoVar != null) {
            jpoVar.jj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.se
    public void p_() {
        this.zz = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.cm.jpo
    public void qk() {
        if (this.xyk != 1) {
            return;
        }
        this.xyk = 3;
        View viewWqx = this.wqx.wqx();
        if (viewWqx != null) {
            ViewGroup viewGroup = (ViewGroup) viewWqx.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.f20955cm) {
                    return;
                } else {
                    viewGroup.removeView(viewWqx);
                }
            }
            if (this.f20955cm != null) {
                viewWqx.setVisibility(0);
                this.f20955cm.addView(viewWqx, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public long wqx() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.cm.jpo
    public void xyk() {
        this.xyk = 2;
    }

    public boolean yd() {
        if (this.f20960yd || !m480if()) {
            return false;
        }
        l_();
        return true;
    }

    public void zz() {
        this.f20960yd = true;
        ViewParent parent = this.f20955cm.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f20955cm);
        }
        com.bytedance.sdk.openadsdk.core.ju.wqx.jd jdVar = this.wqx;
        if (jdVar != null) {
            jdVar.cm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jd(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public boolean jd(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
    }

    private boolean jd(Activity activity) {
        if (!this.f20955cm.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.f20958ju = false;
                return false;
            }
            this.f20958ju = true;
            window.addContentView(this.f20955cm, new WindowManager.LayoutParams(-1, -1));
        }
        this.f20955cm.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(boolean z10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public boolean jpo(JSONObject jSONObject) {
        return false;
    }

    public void jpo(ViewGroup viewGroup) {
        View viewWqx = this.wqx.wqx();
        if (viewWqx == null) {
            return;
        }
        viewWqx.setVisibility(4);
        viewGroup.addView(viewWqx, new ViewGroup.LayoutParams(-1, -1));
        this.wqx.jd();
        this.xyk = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10) {
        com.bytedance.sdk.openadsdk.core.ju.wqx.wqx wqxVarJpo = this.wqx.jpo();
        if (wqxVarJpo instanceof com.bytedance.sdk.openadsdk.core.ju.wqx.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.wqx.cm) wqxVarJpo).jpo(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(String str, JSONObject jSONObject) {
        jpo jpoVar;
        if (!"skipToNextAd".equals(str) || (jpoVar = this.f20956jd) == null) {
            return;
        }
        jpoVar.jpo();
    }

    public boolean jpo(Activity activity) throws JSONException {
        if (!this.f20960yd && activity != null && !activity.isFinishing()) {
            if (this.xyk == 3 && this.zz == 2) {
                if (this.f20955cm.isAttachedToWindow() && this.f20955cm.getVisibility() == 0) {
                    return true;
                }
                if (jd(activity)) {
                    ju();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.xyk);
                jSONObject.put("js_finish", this.zz);
                jSONObject.put("has_window", this.f20958ju ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                dt dtVar = this.jpo.f19914jd;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo("show_popup_fail", dtVar, dtVar.my(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.prr
    public void jj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.se
    public void k_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.jpo
    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        if (i10 == 2) {
            com.bytedance.sdk.openadsdk.core.model.hna hnaVar = (com.bytedance.sdk.openadsdk.core.model.hna) wqxVar;
            String str = hnaVar.f20655qk;
            if (hnaVar.f127if > 0) {
                duq.jpo(true);
            }
            this.my.jpo(str);
            this.my.jpo(view, hnaVar.jpo, hnaVar.f20652jd, hnaVar.wqx, hnaVar.f20651cm, hnaVar.f20656yd, hnaVar.f20654ju);
            this.jpo.roc.et();
            duq.jpo(false);
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.jpo.f19914jd, 9);
        }
    }
}
