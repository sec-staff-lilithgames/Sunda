package com.bytedance.sdk.openadsdk.core.ju.cm;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.hna;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.ju.cm.jpo;
import com.bytedance.sdk.openadsdk.core.ju.jpo.jd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm;
import com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd implements hna, jpo.InterfaceC0121jpo {
    protected static int jpo = 8;

    /* renamed from: au, reason: collision with root package name */
    private View f20467au;

    /* renamed from: cm, reason: collision with root package name */
    private final dt f20468cm;
    private float hna;

    /* renamed from: if, reason: not valid java name */
    private String f122if;

    /* renamed from: jd, reason: collision with root package name */
    private jpo f20469jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f20470jj;

    /* renamed from: jr, reason: collision with root package name */
    private long f20471jr;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ju.qk.jpo f20472ju;
    private final com.bytedance.sdk.openadsdk.core.ju.xyk.jpo my;
    private boolean nmd = true;
    private long opi;
    private float oya;
    private float prr;

    /* renamed from: qk, reason: collision with root package name */
    private String f20473qk;

    /* renamed from: sq, reason: collision with root package name */
    private float f20474sq;
    private final Activity wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.ju.qk.jd f20475yd;
    private JSONObject zz;

    public jd(Activity activity, dt dtVar, com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVar, String str, com.bytedance.sdk.openadsdk.core.ju.qk.jd jdVar) {
        this.wqx = activity;
        this.f122if = str;
        this.f20468cm = dtVar;
        this.f20475yd = jdVar;
        this.my = jpoVar;
    }

    private void jd() {
        int iPzk = this.f20468cm.pzk();
        if (iPzk != 2 && iPzk != 3) {
            if (iPzk == 4) {
                qk.jpo(this.wqx, this.f122if).wqx(this.f20468cm);
                return;
            } else {
                if (iPzk != 5) {
                    return;
                }
                tic.jd(this.wqx, this.f20468cm.zq());
                return;
            }
        }
        if (iPzk == 3) {
            String strIwg = this.f20468cm.iwg();
            if (!TextUtils.isEmpty(strIwg) && strIwg.contains("play.google.com/store")) {
                if (cm.jpo(this.wqx, strIwg, strIwg.substring(strIwg.indexOf("?id=") + 4), this.f122if, this.f20468cm)) {
                    return;
                }
            }
        }
        Activity activity = this.wqx;
        dt dtVar = this.f20468cm;
        int iJpo = tic.jpo(this.f122if);
        String str = this.f122if;
        duq.jpo(activity, dtVar, iJpo, null, null, str, qk.jpo(this.wqx, str), true, 0);
    }

    public void jpo() {
        if (this.f20468cm == null) {
            this.f20475yd.jpo(1, "material is null", "net");
            return;
        }
        if (this.my == null) {
            this.f20475yd.jpo(1, "material ugen template is null", "net");
            return;
        }
        this.f20469jd = new jpo(this.wqx);
        this.xyk = this.my.wqx();
        this.f20470jj = this.my.jpo();
        this.f20473qk = this.my.jd();
        this.zz = this.f20468cm.gum();
        this.f20475yd.jpo(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.xyk, this.f20470jj, this.f20473qk, "", new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.core.ju.cm.jd.1
            @Override // com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo
            public void jpo(JSONObject jSONObject, String str) throws JSONException {
                jd jdVar = jd.this;
                jdVar.jpo(jSONObject, jdVar.zz);
                jd.this.f20475yd.jd(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo
            public void jpo(int i10, String str, String str2) {
                jd.this.f20475yd.jpo(i10, str, str2);
            }
        });
    }

    public void jpo(View view) {
        this.f20467au = view;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.ju.qk.jpo jpoVar) {
        this.f20472ju = jpoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.f20469jd.jpo((jpo.InterfaceC0121jpo) this);
        this.f20469jd.jpo((hna) this);
        this.f20475yd.jpo();
        this.f20469jd.jpo(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.ju.qk.cm() { // from class: com.bytedance.sdk.openadsdk.core.ju.cm.jd.2
            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.cm
            public void jpo(int i10, String str) {
                if (jd.this.f20475yd != null) {
                    jd.this.f20475yd.jpo(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.cm
            public void jpo(wqx<View> wqxVar) {
                if (jd.this.f20475yd != null) {
                    jd.this.f20475yd.jpo(wqxVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.cm.jpo.InterfaceC0121jpo
    public void jpo(au auVar) throws JSONException {
        String strOptString = auVar.wqx().optString("type");
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.wqx != null && !TextUtils.isEmpty(sq.cm().uu())) {
                    TTWebsiteActivity.jpo(this.wqx, this.f20468cm, this.f122if);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.ju.qk.jpo jpoVar = this.f20472ju;
                if (jpoVar != null) {
                    jpoVar.jd();
                    break;
                }
                break;
            case "creative":
                if (this.wqx != null && this.f20468cm != null) {
                    jd();
                    ComponentCallbacks2 componentCallbacks2 = this.wqx;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.au.cm.jd) {
                        ((com.bytedance.sdk.openadsdk.core.au.cm.jd) componentCallbacks2).et();
                    }
                    jpo(auVar, this.f20468cm);
                    break;
                }
                break;
        }
    }

    private void jpo(au auVar, dt dtVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.oya);
            jSONObject.put(SFPXhf.plzEJOFdwJrh, this.prr);
            jSONObject.put("down_time", this.opi);
            jSONObject.put("up_x", this.hna);
            jSONObject.put("up_y", this.f20474sq);
            jSONObject.put("up_time", this.f20471jr);
            View viewJu = auVar.jpo().ju();
            int i10 = 1;
            if (viewJu != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewJu.getWidth();
                float height = viewJu.getHeight();
                viewJu.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f10);
                jSONObject2.put("top", f11);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.f20467au;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.f20467au.getWidth());
                jSONObject.put("button_height", this.f20467au.getHeight());
            }
            View viewFindViewById = this.wqx.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", auVar.jpo().nzb());
            jSONObject.put("brick_id", auVar.jpo().ef());
            jSONObject.put("endcard_id", this.f20470jj);
            jSONObject.put("click_scence", 2);
            if (!this.nmd) {
                i10 = 2;
            }
            jSONObject.put("user_behavior_type", i10);
            com.bytedance.sdk.openadsdk.core.ju.qk.jpo jpoVar = this.f20472ju;
            if (jpoVar != null) {
                jSONObject.put("endcard_type", jpoVar.jpo());
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.f122if, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.hna
    public void jpo(wqx wqxVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.opi = System.currentTimeMillis();
            this.oya = motionEvent.getRawX();
            this.prr = motionEvent.getRawY();
            this.nmd = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.oya) >= jpo || Math.abs(motionEvent.getRawY() - this.prr) >= jpo) {
                this.nmd = false;
                return;
            }
            return;
        }
        this.hna = motionEvent.getRawX();
        this.f20474sq = motionEvent.getRawY();
        if (Math.abs(this.hna - this.oya) >= jpo || Math.abs(this.f20474sq - this.prr) >= jpo) {
            this.nmd = false;
        }
        this.f20471jr = System.currentTimeMillis();
    }
}
