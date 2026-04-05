package com.bytedance.sdk.openadsdk.core.ju.jj;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.opi;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class my {

    /* renamed from: au, reason: collision with root package name */
    private boolean f20522au;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jd.wqx f20523cm;
    private JSONArray hna;

    /* renamed from: if, reason: not valid java name */
    private final JSONObject f124if;

    /* renamed from: ju, reason: collision with root package name */
    private JSONObject f20526ju;
    private com.bytedance.adsdk.ugeno.jd.wqx my;
    private boolean oya;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private final Context f20527qk;
    private com.bytedance.adsdk.ugeno.jd.wqx wqx;
    private final dt xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.my f20528yd;
    private final String zz;
    private int jpo = -1;

    /* renamed from: jd, reason: collision with root package name */
    private int f20524jd = -1;

    /* renamed from: jj, reason: collision with root package name */
    private final String f20525jj = "UGenSwiperEvent";

    public my(Context context, dt dtVar, String str, JSONObject jSONObject) {
        this.f20527qk = context;
        this.xyk = dtVar;
        this.zz = str;
        this.f124if = jSONObject;
    }

    public JSONObject cm() {
        return this.f20526ju;
    }

    public void jd() {
        int i10;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.my;
        if (!(wqxVar instanceof com.bytedance.adsdk.ugeno.wqx) || (i10 = this.jpo) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.wqx) wqxVar).jpo(i10 - 1);
    }

    public void wqx() {
        int i10;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.my;
        if (!(wqxVar instanceof com.bytedance.adsdk.ugeno.wqx) || (i10 = this.jpo) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.wqx) wqxVar).jpo(i10 + 1);
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
        com.bytedance.adsdk.ugeno.jd.wqx<T> wqxVarCm = wqxVar.cm("swiperLayout");
        this.my = wqxVarCm;
        if (wqxVarCm instanceof com.bytedance.adsdk.ugeno.wqx) {
            this.hna = this.f124if.optJSONArray("dpa_data");
            this.wqx = wqxVar.cm("swiperLeftArrow");
            this.f20523cm = wqxVar.cm("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.wqx) this.my).jpo(new com.bytedance.adsdk.ugeno.jj.wqx() { // from class: com.bytedance.sdk.openadsdk.core.ju.jj.my.1
                @Override // com.bytedance.adsdk.ugeno.jj.wqx
                public void jpo(boolean z10, int i10) {
                }

                @Override // com.bytedance.adsdk.ugeno.jj.wqx
                public void jpo(boolean z10, int i10, float f10, int i11) {
                }

                @Override // com.bytedance.adsdk.ugeno.jj.wqx
                public void jpo(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                    my.this.f20524jd = i10;
                    my.this.jpo = i11;
                    my.this.f20522au = z10;
                    my.this.oya = z11;
                    my.this.prr = z12;
                    my.this.jpo(z10, z11, z12);
                    my.this.jpo(i10);
                }
            });
        }
    }

    public void jpo() {
        jpo(this.f20522au, this.oya, this.prr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.wqx;
        if (wqxVar == null || this.f20523cm == null) {
            return;
        }
        View viewJu = wqxVar.ju();
        View viewJu2 = this.f20523cm.ju();
        JSONArray jSONArray = this.hna;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewJu.setVisibility(8);
            viewJu2.setVisibility(8);
            return;
        }
        if (z10) {
            return;
        }
        if (z11) {
            if (viewJu instanceof TextView) {
                jpo((TextView) viewJu, 90);
            }
            if (viewJu2 instanceof TextView) {
                jpo((TextView) viewJu2, 255);
                return;
            }
            return;
        }
        if (z12) {
            if (viewJu instanceof TextView) {
                jpo((TextView) viewJu, 255);
            }
            if (viewJu2 instanceof TextView) {
                jpo((TextView) viewJu2, 90);
                return;
            }
            return;
        }
        if (viewJu instanceof TextView) {
            jpo((TextView) viewJu, 255);
        }
        if (viewJu2 instanceof TextView) {
            jpo((TextView) viewJu2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i10);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.xyk, this.zz, "carousel_show", jSONObject);
    }

    private void jpo(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        this.f20528yd = myVar;
    }

    public boolean jpo(au auVar) {
        JSONObject jSONObjectOptJSONObject;
        this.f20526ju = null;
        int i10 = this.f20524jd;
        if (i10 != -1 && i10 != 0) {
            try {
                JSONObject jSONObjectWqx = auVar.wqx();
                if (jSONObjectWqx != null && (jSONObjectOptJSONObject = jSONObjectWqx.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.hna != null) {
                            String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectOptJSONObject.optString("url"), this.hna.optJSONObject(this.f20524jd));
                            String strJpo2 = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectOptJSONObject.optString("fallback_url"), this.hna.optJSONObject(this.f20524jd));
                            jSONObjectOptJSONObject.put("url", strJpo);
                            jSONObjectOptJSONObject.put("fallback_url", strJpo2);
                            jpo(jSONObjectOptJSONObject, this.hna.optJSONObject(this.f20524jd));
                        }
                        jpo(jSONObjectOptJSONObject, auVar.jpo().ju());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th2) {
                nmd.wqx("UGenSwiperEvent", th2.getMessage());
            }
        }
        return false;
    }

    private void jpo(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.f20526ju = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.f20526ju.putOpt(next, com.bytedance.adsdk.ugeno.wqx.jd.jpo((String) this.f20526ju.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.f20526ju);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean jpo(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            return r0
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.opi.jpo(r6)
            if (r4 != 0) goto L26
            return r0
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.opi.jpo(r5)
            if (r4 != 0) goto L26
            return r0
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ju.jj.my.jpo(int, java.lang.String, java.lang.String):boolean");
    }

    private void jpo(JSONObject jSONObject, View view) {
        if (jpo(jSONObject.optInt("landingStyle"), jSONObject.optString(TJzY.esfplF), jSONObject.optString("fallback_url"))) {
            opi.jpo(jpo(view), this.f20527qk instanceof Activity, jSONObject, this.xyk, this.zz, tic.jpo(this.zz), null, this.f20528yd);
        }
    }

    private Context jpo(View view) {
        Activity activityJpo = view != null ? com.bytedance.sdk.component.utils.jd.jpo(view) : null;
        return activityJpo == null ? this.f20527qk : activityJpo;
    }
}
