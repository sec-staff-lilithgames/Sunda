package com.bytedance.sdk.openadsdk.core.zz.jpo;

import android.text.TextUtils;
import b0.e2;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.ju.qk.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.jr;
import com.bytedance.sdk.openadsdk.core.model.kln;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jd, reason: collision with root package name */
    private static String f21077jd = "";
    public static String jpo = "https://pag_open_icon_id/appicon.png";

    public static JSONObject jd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Cif.jd());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            ef.jd(jSONObject3);
            jSONObject3.put(Q6.H, "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            nmd.wqx("TemplateUtils", e10.getMessage());
            return jSONObject;
        }
    }

    public static String jpo() {
        return f21077jd;
    }

    public static boolean wqx() {
        return true;
    }

    public static JSONObject jpo(float f10, float f11, boolean z10, dt dtVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Q6.H, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME, jpo(false, dtVar));
            jSONObject.put("template_Plugin", jd(dtVar.vzb()));
            jSONObject.put("diff_template_Plugin", jpo(dtVar.vzb()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject wqx(dt dtVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            ef.jpo(jSONObject, dtVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String jd(dt.jpo jpoVar) {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jd jdVarWqx;
        if (jpoVar != null) {
            String strQk = jpoVar.qk();
            return (!TextUtils.isEmpty(strQk) || (jdVarWqx = com.bytedance.sdk.component.adexpress.jpo.jd.jd.wqx(jpoVar.cm())) == null) ? strQk : jdVarWqx.my();
        }
        return "";
    }

    public static JSONObject jpo(dt dtVar) {
        return jpo(dtVar, false, (JSONObject) null);
    }

    public static JSONObject jpo(dt dtVar, boolean z10, JSONObject jSONObject) {
        JSONObject jSONObjectJpo = null;
        if (dtVar == null) {
            return null;
        }
        try {
            jSONObjectJpo = jpo(dtVar, false, z10);
            if (jSONObjectJpo == null) {
                jSONObjectJpo = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            ef.jd(jSONObject2);
            jSONObject2.put(Q6.H, "android");
            jSONObjectJpo.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectJpo.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectJd = ef.jd(dtVar);
            jSONObjectJd.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Cif.jd());
            jSONObjectJpo.put("xSetting", jSONObjectJd);
            return jSONObjectJpo;
        } catch (Throwable th2) {
            th2.getMessage();
            return jSONObjectJpo;
        }
    }

    public static Map<String, String> jd(dt dtVar) {
        HashMap map = null;
        if (dtVar == null) {
            return null;
        }
        List<opi> listFri = dtVar.fri();
        if (listFri != null && listFri.size() > 0) {
            map = new HashMap();
            for (opi opiVar : listFri) {
                if (opiVar != null) {
                    map.put(opiVar.jpo(), opiVar.qk());
                }
            }
            opi opiVarOu = dtVar.ou();
            if (opiVarOu != null) {
                map.put(opiVarOu.jpo(), opiVarOu.qk());
            }
        }
        return map;
    }

    private static JSONObject jpo(dt dtVar, boolean z10, boolean z11) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (dtVar != null) {
            try {
                String strKfh = dtVar.kfh();
                if (strKfh != null) {
                    JSONObject jSONObject2 = new JSONObject(strKfh);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z10 && !z11) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= dtVar.wqx() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(dtVar.wqx())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th2) {
                nmd.jpo("TemplateUtils", "filterTemplateInfo", th2);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject jpo(float f10, float f11, boolean z10, dt dtVar, String str, wqx wqxVar) throws JSONException {
        f21077jd = "";
        JSONObject jSONObject = null;
        if (dtVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectJpo = jpo(dtVar, true, true);
            if (jSONObjectJpo == null) {
                return null;
            }
            try {
                jpo(jSONObjectJpo, dtVar, str);
                JSONObject jSONObjectJd = ef.jd(dtVar);
                jSONObjectJd.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Cif.jd());
                jSONObjectJpo.put("xSetting", jSONObjectJd);
                jSONObjectJpo.put("xAdInfo", jpo(str, wqx(dtVar), dtVar));
                JSONObject jSONObject2 = new JSONObject();
                ef.jd(jSONObject2);
                jSONObject2.put(Q6.H, "android");
                jSONObjectJpo.put("xAppInfo", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", f10);
                jSONObject3.put("height", f11);
                if (z10) {
                    jSONObject3.put("isLandscape", true);
                }
                jSONObjectJpo.put("xSize", jSONObject3);
                if (wqxVar != null) {
                    wqxVar.jpo("adv3");
                }
                kln klnVarJrx = dtVar.jrx();
                if (klnVarJrx != null) {
                    String strCm = klnVarJrx.cm();
                    if (!TextUtils.isEmpty(strCm)) {
                        jSONObjectJpo.put("xTemplate", new JSONObject(strCm));
                        f21077jd = "getTemplate success by local data";
                        if (wqxVar != null) {
                            wqxVar.jd("local");
                            return jSONObjectJpo;
                        }
                    } else {
                        String strJpo = com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo("adv3", klnVarJrx.jpo(), klnVarJrx.jd());
                        if (!TextUtils.isEmpty(strJpo)) {
                            jSONObjectJpo.put("xTemplate", new JSONObject(strJpo));
                            f21077jd = "getTemplate success by db data";
                            if (wqxVar != null) {
                                wqxVar.jd("local");
                                return jSONObjectJpo;
                            }
                        } else {
                            String str2 = "local db data is null id is " + klnVarJrx.jpo() + " md5 is " + klnVarJrx.jd();
                            f21077jd = str2;
                            if (wqxVar != null) {
                                wqxVar.jpo(3, str2, "net");
                            }
                        }
                    }
                }
                return jSONObjectJpo;
            } catch (Exception e10) {
                e = e10;
                jSONObject = jSONObjectJpo;
                String strL = e2.l(e, new StringBuilder("load template exception "));
                f21077jd = strL;
                if (wqxVar != null) {
                    wqxVar.jpo(3, strL, "net");
                }
                return jSONObject;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static void jpo(JSONObject jSONObject, dt dtVar, String str) throws JSONException {
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw;
        if (dtVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (jdVarWw = dtVar.ww()) == null) {
                return;
            }
            JSONObject jSONObjectOpi = jdVarWw.opi();
            if (jSONObjectOpi != null) {
                if ("open_ad".equals(str)) {
                    jSONObjectOpi.put("video_duration", sq.cm().tu(String.valueOf(dtVar.jl())));
                } else {
                    jSONObjectOpi.put("video_duration", jdVarWw.jj() * jdVarWw.tu());
                }
            }
            jSONObject.put("video", jSONObjectOpi);
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private static JSONObject jpo(String str, JSONObject jSONObject, dt dtVar) throws JSONException {
        if (dtVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", zz.jd().xyk());
                    int iZz = zz.jd().zz();
                    if (iZz != 0) {
                        int iTl = dtVar.tl();
                        if (9 == iTl) {
                            jSONObject2.put("app_icon", jpo);
                        } else if (10 == iTl) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iZz)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject jpo(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String jpo(dt.jpo jpoVar) {
        if (jpoVar != null) {
            return jpoVar.xyk();
        }
        return "";
    }

    public static JSONObject jpo(boolean z10, dt dtVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", dtVar.clt());
            if (dtVar.ou() != null) {
                if (dtVar.ou() != null && !TextUtils.isEmpty(dtVar.ou().jpo())) {
                    jSONObject.put("icon", dtVar.ou().jpo());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (dtVar.fri() != null) {
                for (int i10 = 0; i10 < dtVar.fri().size(); i10++) {
                    opi opiVar = dtVar.fri().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", opiVar.wqx());
                    jSONObject2.put("width", opiVar.jd());
                    jSONObject2.put("url", opiVar.jpo());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", dtVar.iqh());
            jSONObject.put("interaction_type", dtVar.pzk());
            jSONObject.put("interaction_method", dtVar.cgn());
            jSONObject.put("is_compliance_template", wqx());
            jSONObject.put("title", dtVar.ozw());
            jSONObject.put("description", dtVar.xp());
            jSONObject.put("source", dtVar.as());
            JSONObject jSONObject3 = new JSONObject();
            jr jrVarTu = dtVar.tu();
            if (jrVarTu == null) {
                jrVarTu = new jr();
            }
            jSONObject3.put("ceiling_time", jrVarTu.cm());
            jSONObject3.put("ceiling_ratio", jrVarTu.my());
            jSONObject3.put("expand_ratio", jrVarTu.jj());
            jSONObject.put("interaction_params", jSONObject3);
            if (dtVar.xur() != null) {
                jSONObject.put("comment_num", dtVar.xur().my());
                jSONObject.put("score", dtVar.xur().cm());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, dtVar.xur().jj());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, dtVar.xur().xyk());
            }
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
            if (jdVarWw != null) {
                JSONObject jSONObjectOpi = jdVarWw.opi();
                jSONObjectOpi.put("video_duration", jdVarWw.jj() * jdVarWw.tu());
                jSONObject.put("video", jSONObjectOpi);
            }
            if (dtVar.vzb() != null) {
                jSONObject.put("dynamic_creative", dtVar.vzb().zz());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String jpo(dt dtVar, String str) {
        List<opi> listFri;
        if (dtVar != null && (listFri = dtVar.fri()) != null && listFri.size() > 0) {
            for (opi opiVar : listFri) {
                if (opiVar != null && TextUtils.equals(str, opiVar.jpo())) {
                    return opiVar.qk();
                }
            }
        }
        return null;
    }
}
