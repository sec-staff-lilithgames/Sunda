package com.bytedance.sdk.component.adexpress.dynamic.my;

import a.b;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.my.my;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: qk, reason: collision with root package name */
    private static HashMap<String, String> f18291qk;

    /* renamed from: cm, reason: collision with root package name */
    private jpo f18292cm;

    /* renamed from: jd, reason: collision with root package name */
    private JSONObject f18293jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.cm.cm f18294jj;
    private JSONObject jpo;
    private wqx my;
    private com.bytedance.sdk.component.adexpress.dynamic.cm.wqx wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        float f18295jd;
        float jpo;
        boolean wqx;

        public static jpo jpo(JSONObject jSONObject) {
            jpo jpoVar = new jpo();
            if (jSONObject != null) {
                jpoVar.jpo = (float) jSONObject.optDouble("width");
                jpoVar.f18295jd = (float) jSONObject.optDouble("height");
                jpoVar.wqx = jSONObject.optBoolean("isLandscape");
            }
            return jpoVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        f18291qk = map;
        map.put("subtitle", "description");
        f18291qk.put("source", "source|app.app_name");
        f18291qk.put("screenshot", "dynamic_creative.screenshot");
    }

    public jj(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.jpo = jSONObject;
        this.f18293jd = jSONObject2;
        this.wqx = new com.bytedance.sdk.component.adexpress.dynamic.cm.wqx(jSONObject2);
        this.f18292cm = jpo.jpo(jSONObject3);
        this.f18294jj = com.bytedance.sdk.component.adexpress.dynamic.cm.cm.jpo(jSONObject4);
    }

    private void jd(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        com.bytedance.sdk.component.adexpress.dynamic.cm.wqx wqxVar;
        Object objJpo;
        Object objJpo2;
        Object objJpo3;
        Object objJpo4;
        if (xykVar == null || (wqxVar = this.wqx) == null || (objJpo = wqxVar.jpo("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objJpo);
        if (TextUtils.isEmpty(strValueOf) || (objJpo2 = this.wqx.jpo("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objJpo2);
        if (TextUtils.isEmpty(strValueOf2) || (objJpo3 = this.wqx.jpo("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objJpo3);
        if (TextUtils.isEmpty(strValueOf3) || (objJpo4 = this.wqx.jpo("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objJpo4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objJpo5 = this.wqx.jpo("app.app_name");
        Object objJpo6 = this.wqx.jpo("source");
        if (objJpo5 == null && objJpo6 == null) {
            return;
        }
        if (objJpo5 == null) {
            objJpo5 = objJpo6;
        }
        String strValueOf5 = String.valueOf(objJpo5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        xykVar.jpo("imageUrl", strValueOf);
        xykVar.jpo("title", strValueOf2);
        xykVar.jpo("description", strValueOf3);
        xykVar.jpo("icon", strValueOf4);
        xykVar.jpo("app_name", strValueOf5);
        xykVar.jpo(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cm.xyk jpo(double d10, int i10, double d11, String str, au auVar) throws JSONException {
        JSONObject jSONObject;
        this.wqx.jpo();
        try {
            jSONObject = new JSONObject(this.f18294jj.f18130jd);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVarJpo = jpo(cm.jpo(this.jpo, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk) null);
        jpo(xykVarJpo);
        my myVar = new my(d10, i10, d11, str, auVar);
        my.jpo jpoVar = new my.jpo();
        jpo jpoVar2 = this.f18292cm;
        jpoVar.jpo = jpoVar2.jpo;
        jpoVar.f18299jd = jpoVar2.f18295jd;
        jpoVar.wqx = 0.0f;
        myVar.jpo(jpoVar);
        myVar.jpo(xykVarJpo, 0.0f, 0.0f);
        myVar.jpo();
        com.bytedance.sdk.component.adexpress.dynamic.cm.jd jdVar = myVar.jpo;
        if (jdVar.f18132cm == 65536.0f) {
            return null;
        }
        return jdVar.f18134jj;
    }

    private void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        int iJpo;
        if (xykVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() != null) {
            iJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().prr();
        } else {
            iJpo = com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo());
        }
        int iJd = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), iJpo);
        jpo jpoVar = this.f18292cm;
        float fMin = jpoVar.wqx ? jpoVar.jpo : Math.min(jpoVar.jpo, iJd);
        if (this.f18292cm.f18295jd == 0.0f) {
            xykVar.my(fMin);
            xykVar.yd().my().yd(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            xykVar.jj(0.0f);
        } else {
            xykVar.my(fMin);
            int iJd2 = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo()));
            jpo jpoVar2 = this.f18292cm;
            xykVar.jj(jpoVar2.wqx ? jpoVar2.f18295jd : Math.min(jpoVar2.f18295jd, iJd2));
            xykVar.yd().my().yd("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cm.xyk jpo(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) throws JSONException {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.f18294jj != null) {
                wqx wqxVar = new wqx();
                this.my = wqxVar;
                JSONObject jSONObjectJpo = wqxVar.jpo(this.f18294jj.jpo, iOptInt, jSONObject);
                if (jSONObjectJpo != null) {
                    jSONObject = jSONObjectJpo;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVarJpo = jpo(jSONObject);
        xykVarJpo.jpo(xykVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            xykVarJpo.jpo((List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>) null);
            return xykVarJpo;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i10);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = xykVarJpo.yd().my().voc();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVarJpo2 = jpo(jSONArrayOptJSONArray2.optJSONObject(i11), xykVarJpo);
                    if (com.bytedance.sdk.component.adexpress.cm.jd() && "skip-with-time".equals(xykVarJpo.yd().jd()) && !C3191e4.h.T.equals(xykVarJpo.dt()) && !TextUtils.isEmpty(xykVarJpo.dt())) {
                        xykVarJpo2.wqx(xykVarJpo.dt());
                    }
                    arrayList.add(xykVarJpo2);
                    arrayList3.add(xykVarJpo2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            xykVarJpo.jpo(arrayList);
        }
        if (arrayList2.size() > 0) {
            xykVarJpo.jd(arrayList2);
        }
        return xykVarJpo;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cm.xyk jpo(JSONObject jSONObject) throws JSONException {
        String strJpo;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        zz.jpo(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectJpo = zz.jpo(strOptString, zz.jpo(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = new com.bytedance.sdk.component.adexpress.dynamic.cm.xyk();
        if (TextUtils.isEmpty(strOptString2)) {
            xykVar.jd(String.valueOf(xykVar.hashCode()));
        } else {
            xykVar.jd(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            jd(xykVar);
            xykVar.wqx((float) jSONObjectOptJSONObject.optDouble("x"));
            xykVar.cm((float) jSONObjectOptJSONObject.optDouble("y"));
            xykVar.my((float) jSONObjectOptJSONObject.optDouble("width"));
            xykVar.jj((float) jSONObjectOptJSONObject.optDouble("height"));
            xykVar.qk(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.cm.my myVar = new com.bytedance.sdk.component.adexpress.dynamic.cm.my();
            myVar.jpo(strOptString);
            myVar.jd(jSONObjectOptJSONObject.optString("data"));
            myVar.wqx(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarJpo = com.bytedance.sdk.component.adexpress.dynamic.cm.jj.jpo(jSONObjectOptJSONObject);
            myVar.jpo(jjVarJpo);
            com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarJpo2 = com.bytedance.sdk.component.adexpress.dynamic.cm.jj.jpo(jSONObjectJpo);
            if (jjVarJpo2 == null) {
                myVar.jd(jjVarJpo);
            } else {
                myVar.jd(jjVarJpo2);
            }
            jpo(jjVarJpo);
            jpo(jjVarJpo2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.f18293jd) != null) {
                jpo(myVar, jSONObject2.optInt("image_mode"));
            }
            String strJd = myVar.jd();
            com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = myVar.my();
            if (f18291qk.containsKey(strJd) && !jjVarMy.sbx()) {
                jjVarMy.nmd(f18291qk.get(strJd));
            }
            if (jjVarMy.sbx()) {
                strJpo = myVar.wqx();
            } else {
                strJpo = jpo(myVar.wqx());
            }
            if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                if (TextUtils.equals(strJd, "star") || TextUtils.equals(strJd, "text_star")) {
                    strJpo = jpo("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strJd, "score-count") || TextUtils.equals(strJd, "score-count-type-1") || TextUtils.equals(strJd, "score-count-type-2")) {
                    strJpo = jpo("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strJd) && jjVarJpo.czp()) {
                    strJpo = jpo("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(jpo()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                StringBuilder sbT = b.t(strJpo, "adx:");
                sbT.append(jpo());
                myVar.jd(sbT.toString());
            } else {
                myVar.jd(strJpo);
            }
            xykVar.jpo(myVar);
        }
        return xykVar;
    }

    private void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.my myVar, int i10) throws JSONException {
        int iLastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            myVar.jpo("image");
            String strJpo = zz.jpo("image");
            com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = myVar.my();
            jjVarMy.nmd(strJpo);
            myVar.qk().nmd(strJpo);
            String strJpo2 = zz.jpo("image", "clickArea");
            if (!TextUtils.isEmpty(strJpo2)) {
                jjVarMy.prr(strJpo2);
                myVar.qk().prr(strJpo2);
            }
            JSONObject jSONObjectOu = jjVarMy.ou();
            if (jSONObjectOu != null) {
                jjVarMy.dt(jSONObjectOu.optString("imageLottieTosPath"));
                jjVarMy.m403if(jSONObjectOu.optBoolean("animationsLoop"));
                jjVarMy.se(jSONObjectOu.optInt("lottieAppNameMaxLength"));
                jjVarMy.pdm(jSONObjectOu.optInt("lottieAdDescMaxLength"));
                jjVarMy.hx(jSONObjectOu.optInt("lottieAdTitleMaxLength"));
            }
            myVar.jd(strJpo);
            if (strJpo != null && (iLastIndexOf = strJpo.lastIndexOf(".")) > 0) {
                String strSubstring = strJpo.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", jpo(strSubstring + ".width"));
                    jSONObject.put("height", jpo(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                myVar.wqx(jSONObject.toString());
            }
            jjVarMy.fri();
            return;
        }
        myVar.jpo("video");
        String strJpo3 = zz.jpo("video");
        myVar.my().nmd(strJpo3);
        String strJpo4 = zz.jpo("video", "clickArea");
        if (!TextUtils.isEmpty(strJpo4)) {
            myVar.my().prr(strJpo4);
            myVar.qk().prr(strJpo4);
        }
        myVar.qk().nmd(strJpo3);
        myVar.jd(strJpo3);
        myVar.my().iwg();
    }

    private String jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.wqx.jd(str2)) {
                String strValueOf = String.valueOf(this.wqx.jpo(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String jpo() {
        Object objJpo;
        com.bytedance.sdk.component.adexpress.dynamic.cm.wqx wqxVar = this.wqx;
        return (wqxVar == null || (objJpo = wqxVar.jpo("adx_name")) == null) ? "" : String.valueOf(objJpo);
    }

    private void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        String strRv = jjVar.rv();
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            String strWqx = com.bytedance.sdk.component.adexpress.cm.qk.wqx(com.bytedance.sdk.component.adexpress.cm.jpo());
            if ("zh".equals(strWqx)) {
                strWqx = "cn";
            }
            if (!TextUtils.isEmpty(strWqx) && jjVar.jj() != null) {
                String strOptString = jjVar.jj().optString(strWqx);
                if (!TextUtils.isEmpty(strOptString)) {
                    strRv = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strRv)) {
            return;
        }
        int iIndexOf = strRv.indexOf("{{");
        int iIndexOf2 = strRv.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strJpo = jpo(strRv.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(strRv.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strJpo)) {
                sb2.append(strJpo);
            }
            sb2.append(strRv.substring(iIndexOf2 + 2));
            jjVar.m402if(sb2.toString());
            return;
        }
        jjVar.m402if(strRv);
    }
}
