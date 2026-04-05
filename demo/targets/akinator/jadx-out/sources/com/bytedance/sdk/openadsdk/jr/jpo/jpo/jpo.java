package com.bytedance.sdk.openadsdk.jr.jpo.jpo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.cm.au;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends cm {
    public jpo(Context context, String str) {
        super(context, str);
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm
    public boolean jd(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, 1, null);
        if (dtVar.cnl() != null) {
            HashMap map = new HashMap();
            if (dtVar.tda() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(this.f21249cm >= 11));
            }
            if (jpo(dtVar.cnl().jpo(), jpo(), this.jpo, dtVar, map)) {
                return true;
            }
            if (!this.f21250jd || this.wqx.get()) {
                this.f21250jd = true;
                jpo(dtVar, map);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.jpo, "open_fallback_url", map);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, this.jpo, -1, null);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm, com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj
    public boolean jpo(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.model.jj jjVarXur;
        HashMap map;
        if (dtVar == null || (jjVarXur = dtVar.xur()) == null) {
            return false;
        }
        if (dtVar.tda() == 0) {
            map = new HashMap();
            map.put("dpl_probability_jump", Boolean.valueOf(this.f21249cm >= 11));
        } else {
            map = null;
        }
        return jpo(dtVar, jjVarXur.wqx(), jpo(), this.jpo, map);
    }

    public static boolean jpo(dt dtVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentJpo;
        if (dtVar != null && dtVar.yxp() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentJpo = tic.jpo(context, str)) == null) {
                return false;
            }
            intentJpo.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentJpo.addFlags(268435456);
            }
            context.startActivity(intentJpo);
            if (map == null) {
                map = new HashMap<>();
            }
            jpo(dtVar, map);
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void jpo(dt dtVar, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (dtVar != null && dtVar.tda() == 0) {
            map.put("auto_click", Boolean.valueOf(!dtVar.prr()));
        }
        map.put("can_query_install", 0);
    }

    public static boolean jpo(String str, Context context, String str2, dt dtVar, Map<String, Object> map) throws JSONException {
        Intent intent = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!TextUtils.isEmpty(str)) {
            Uri uri = Uri.parse(str);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            try {
                intent2.setData(uri);
                if (!(context instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                jpo(dtVar, map);
                map.put("url", str);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str2, "open_url_app", map);
                context.startActivity(intent2);
                au.jpo().jpo(map).jpo(dtVar, str2);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo("dp_start_act_success", dtVar, str2, map);
                return true;
            } catch (Throwable th3) {
                th = th3;
                intent = intent2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("exception", th.getMessage());
                    if (intent != null) {
                        jSONObject.put("intent", intent.toString());
                    }
                    jSONObject.put("can_query_install", 0);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, str2, -4, jSONObject);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, str2, -2, null);
        return false;
    }
}
