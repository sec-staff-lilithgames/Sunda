package com.bytedance.sdk.openadsdk.jr.jpo.jpo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.cm.au;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    public static boolean jpo() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("deeplink_utils_new", 0) == 1;
    }

    public static boolean jpo(Context context, String str, dt dtVar, int i10, Map<String, Object> map, boolean z10) throws JSONException {
        Map<String, Object> map2 = map;
        String strJpo = tic.jpo(dtVar);
        com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, strJpo, 1, null);
        Intent intentJpo = jpo(context, str, dtVar);
        if (TextUtils.isEmpty(str) || intentJpo == null) {
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, strJpo, -2, dtVar.cnl().cm());
            return false;
        }
        boolean zCm = tic.cm(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (dtVar != null && dtVar.tda() == 0) {
            map3.put("auto_click", Boolean.valueOf(!dtVar.prr()));
        }
        map3.put("can_query_install", Integer.valueOf(zCm ? 1 : 0));
        map3.put("url", str);
        if (zCm) {
            tic.jd jdVarJpo = tic.jpo(context, intentJpo);
            if (jdVarJpo.f21607jd <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentJpo.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, strJpo, -3, jSONObject);
                return false;
            }
            try {
                jpo(context, dtVar, map3);
                map3.put("matched_count", Integer.valueOf(jdVarJpo.f21607jd));
                ComponentName componentName = jdVarJpo.jpo;
                if (componentName != null) {
                    intentJpo.setComponent(componentName);
                }
            } catch (Throwable th2) {
                nmd.wqx("DeepLinkUtils", th2.getMessage());
            }
        }
        if (sq.cm().xyk()) {
            tic.jpo(dtVar, strJpo);
        }
        try {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, strJpo, "open_url_app", map3);
            context.startActivity(intentJpo);
            au.jpo().jpo(map3).jpo(dtVar, strJpo);
            com.bytedance.sdk.openadsdk.cm.wqx.jpo("dp_start_act_success", dtVar, strJpo, map3);
            return true;
        } catch (Throwable th3) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th3.getMessage());
                jSONObject2.put("intent", intentJpo.toString());
                jSONObject2.put("can_query_install", zCm ? 1 : 0);
            } catch (Exception unused2) {
            }
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar, strJpo, -4, jSONObject2);
            if (zCm && !sq.cm().xyk()) {
                duq.jpo(context, dtVar.iwg(), dtVar, i10, strJpo, z10);
            }
            return false;
        }
    }

    private static Intent jpo(Context context, String str, dt dtVar) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (dtVar != null && dtVar.zwh() != null && !TextUtils.isEmpty(dtVar.zwh().cm())) {
                intent.setPackage(dtVar.zwh().cm());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th2) {
            nmd.wqx("DeepLinkUtils", th2.getMessage());
            return null;
        }
    }

    private static void jpo(Context context, dt dtVar, Map<String, Object> map) {
        if (dtVar != null && dtVar.tda() == 0) {
            map.put("auto_click", Boolean.valueOf(!dtVar.prr()));
        }
        map.put("can_query_install", Integer.valueOf(tic.cm(context) ? 1 : 0));
    }
}
