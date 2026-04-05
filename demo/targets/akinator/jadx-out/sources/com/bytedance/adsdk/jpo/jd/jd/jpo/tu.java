package com.bytedance.adsdk.jpo.jd.jd.jpo;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class tu implements com.bytedance.adsdk.jpo.jd.jd.jpo {
    private final String jpo;

    public tu(String str) {
        this.jpo = str;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        return this.jpo;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        Object objJpo;
        if (map == null || map.size() <= 0 || (objJpo = jpo(this.jpo, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objJpo;
    }

    public String toString() {
        return o2.o(new StringBuilder("VariableNode [literals="), this.jpo, C3191e4.i.f36531e);
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jj.VARIABLE;
    }

    public Object jpo(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return jpo(str.split("\\."), 0, jSONObject);
    }

    private Object jpo(String[] strArr, int i10, JSONObject jSONObject) throws NumberFormatException {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf(C3191e4.i.f36529d);
            int iIndexOf2 = str.indexOf(C3191e4.i.f36531e);
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return jpo(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return jpo(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
