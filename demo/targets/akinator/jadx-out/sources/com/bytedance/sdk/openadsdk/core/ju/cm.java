package com.bytedance.sdk.openadsdk.core.ju;

import android.text.TextUtils;
import b0.e2;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.zz;
import h2.rl.UeklptUrP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class cm {
    private static String jpo = "";

    public static boolean jd(dt dtVar) {
        return dtVar != null && dtVar.tl() == 10;
    }

    public static boolean jpo(int i10) {
        return i10 == 10 || i10 == 9;
    }

    public static JSONObject jpo(dt dtVar, String str) throws JSONException {
        JSONObject jSONObjectGum = dtVar.gum();
        try {
            jSONObjectGum.put("show_dislike", dtVar.bl());
            jSONObjectGum.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, Cif.jd());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strXyk = zz.jd().xyk();
                int iZz = zz.jd().zz();
                jSONObject.put("app_name", strXyk);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iZz)));
                jSONObjectGum.put("open_app_info", jSONObject);
            }
            jSONObjectGum.put("os", "Android");
            JSONArray jSONArrayWqx = wqx(dtVar);
            if (jSONArrayWqx != null) {
                jSONObjectGum.put("dpa_data", jSONArrayWqx);
            }
            return jSONObjectGum;
        } catch (Throwable th2) {
            nmd.wqx("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
            return jSONObjectGum;
        }
    }

    private static JSONArray wqx(dt dtVar) {
        try {
            dt.jpo jpoVarVzb = dtVar.vzb();
            if (jpoVarVzb == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(jpoVarVzb.zz());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", dtVar.clt());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(UeklptUrP.AmbqFcPMz);
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject3.put("button_text", dtVar.clt());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean jpo(dt dtVar) {
        return dtVar != null && dtVar.tl() == 7;
    }

    public static String jpo() {
        return jpo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject jpo(dt dtVar, com.bytedance.sdk.openadsdk.core.ju.qk.wqx wqxVar) {
        dt.jpo jpoVarVzb;
        JSONObject jSONObject;
        wqxVar.jpo("ad");
        String strPrr = "";
        jpo = "";
        ?? r42 = 0;
        try {
            jpoVarVzb = dtVar.vzb();
            if (jpoVarVzb != null) {
                strPrr = jpoVarVzb.prr();
                if (TextUtils.isEmpty(strPrr) && !TextUtils.isEmpty(jpoVarVzb.oya()) && !TextUtils.isEmpty(jpoVarVzb.cm())) {
                    strPrr = com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo("ad", jpoVarVzb.cm(), jpoVarVzb.oya());
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!TextUtils.isEmpty(strPrr)) {
                try {
                    jSONObject = new JSONObject(strPrr);
                } catch (JSONException unused) {
                }
                try {
                    jpo = "getTemplate success";
                    wqxVar.jd("local");
                    return jSONObject;
                } catch (JSONException unused2) {
                    String strConcat = "parse json exception data is ".concat(String.valueOf(strPrr));
                    jpo = strConcat;
                    wqxVar.jpo(2, strConcat, "local");
                    return null;
                }
            }
            String str = "local data is null id is " + jpoVarVzb.cm() + " md5 is " + jpoVarVzb.oya();
            jpo = str;
            wqxVar.jpo(3, str, "net");
            return null;
        } catch (Throwable th3) {
            r42 = jpoVarVzb;
            th = th3;
            String strO = e2.o(th, new StringBuilder("get template error "));
            jpo = strO;
            wqxVar.jpo(2, strO, "local");
            return r42;
        }
    }
}
