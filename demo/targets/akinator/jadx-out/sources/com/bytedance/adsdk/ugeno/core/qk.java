package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: cm, reason: collision with root package name */
    private JSONObject f17756cm;

    /* renamed from: jd, reason: collision with root package name */
    private JSONObject f17757jd;

    /* renamed from: jj, reason: collision with root package name */
    private JSONObject f17758jj;
    private JSONObject jpo;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f17759qk;
    private String wqx;
    private float xyk;
    private float zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private JSONObject f17760cm;

        /* renamed from: jd, reason: collision with root package name */
        private String f17761jd;

        /* renamed from: jj, reason: collision with root package name */
        private jpo f17762jj;
        private String jpo;
        private LinkedList<jpo> my;

        /* renamed from: qk, reason: collision with root package name */
        private String f17763qk;
        private JSONObject wqx;
        private String xyk;

        /* renamed from: yd, reason: collision with root package name */
        private boolean f17764yd;
        private boolean zz;

        public JSONObject jj() {
            return this.f17760cm;
        }

        public List<jpo> my() {
            return this.my;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UGNode{id='");
            sb2.append(this.jpo);
            sb2.append("', name='");
            return o2.o(sb2, this.f17761jd, "'}");
        }

        public JSONObject cm() {
            return this.wqx;
        }

        public String jd() {
            return this.f17763qk;
        }

        public String wqx() {
            return this.f17761jd;
        }

        public void jd(boolean z10) {
            this.f17764yd = z10;
        }

        public String jpo() {
            return this.jpo;
        }

        public void jd(jpo jpoVar) {
            if (this.my == null) {
                this.my = new LinkedList<>();
            }
            this.my.addLast(jpoVar);
        }

        public void jpo(String str) {
            this.f17761jd = str;
        }

        public void jpo(boolean z10) {
            this.zz = z10;
        }

        public void jpo(jpo jpoVar) {
            if (this.my == null) {
                this.my = new LinkedList<>();
            }
            this.my.add(jpoVar);
        }

        public void jpo(int i10, jpo jpoVar) {
            if (this.my == null) {
                this.my = new LinkedList<>();
            }
            this.my.add(i10, jpoVar);
        }
    }

    public qk(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private jpo my() throws JSONException {
        if (!cm()) {
            return jpo(this.jpo, (jpo) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.xyk;
            if (f10 > 0.0f) {
                jSONObject.put("width", f10);
            }
            float f11 = this.zz;
            if (f11 > 0.0f) {
                jSONObject.put("height", f11);
            }
            String strOptString = this.f17756cm.optString("xSize");
            if (!TextUtils.isEmpty(strOptString)) {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                if (jSONObject2.optInt("width") > 0) {
                    jSONObject.put("width", jSONObject2.optInt("width"));
                }
                if (jSONObject2.optInt("height") > 0) {
                    jSONObject.put("height", jSONObject2.optInt("height"));
                }
            }
        } catch (JSONException unused) {
        }
        jpo jpoVar = new jpo();
        jpoVar.f17761jd = "View";
        jpoVar.jpo = "virtualNode";
        jpoVar.wqx = jSONObject;
        jpoVar.f17762jj = null;
        jpoVar.f17763qk = this.wqx;
        jpoVar.xyk = this.my;
        jpoVar.jpo(jpo(this.jpo, jpoVar));
        return jpoVar;
    }

    public boolean cm() {
        return this.f17759qk;
    }

    public String jd() {
        return this.wqx;
    }

    public jpo jpo() {
        return my();
    }

    public List<jpo> wqx() throws JSONException {
        if (this.f17757jd == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f17757jd.keys();
        while (itKeys.hasNext()) {
            jpo jpoVarJpo = jpo(this.f17757jd.optJSONObject(itKeys.next()), (jpo) null);
            if (jpoVarJpo != null) {
                arrayList.add(jpoVarJpo);
            }
        }
        return arrayList;
    }

    public qk(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.jpo = jSONObject.optJSONObject("body");
            } else {
                this.jpo = jSONObject.optJSONObject("main_template");
            }
            this.f17757jd = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.f17759qk = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.wqx = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.wqx = "3.0";
                    }
                } else {
                    this.wqx = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.my = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.wqx = "3.0";
                this.f17759qk = true;
            }
            this.f17756cm = jSONObject2;
            this.f17758jj = jSONObject3;
        }
    }

    public static boolean cm(jpo jpoVar) {
        return (jpoVar == null || jpoVar.wqx == null) ? false : true;
    }

    public boolean jd(jpo jpoVar) {
        JSONObject jSONObjectCm;
        if (jpoVar == null || (jSONObjectCm = jpoVar.cm()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectCm.optString("height"), "match_parent");
    }

    public void jpo(float f10, float f11) {
        this.xyk = f10;
        this.zz = f11;
    }

    private jpo jpo(JSONObject jSONObject, jpo jpoVar) throws JSONException {
        String strOptString;
        String strOptString2;
        jpo jpoVarJpo;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = jSONObject.optString("name");
        }
        String strOptString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        jpo jpoVar2 = new jpo();
        jpoVar2.jpo = strOptString3;
        if (!this.f17759qk || !TextUtils.equals("Video", strOptString)) {
            jpoVar2.f17761jd = strOptString;
        } else {
            jpoVar2.f17761jd = strOptString + "V3";
        }
        jpoVar2.wqx = jSONObject2;
        jpoVar2.f17762jj = jpoVar;
        jpoVar2.f17763qk = this.wqx;
        jpoVar2.xyk = this.my;
        if (jSONObject2.has("i18n")) {
            jpoVar2.f17760cm = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            jpo(jSONObject, jpoVar2.wqx);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectOptJSONObject.optString("id"), this.f17756cm);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.f17757jd;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strJpo);
                        jpoVarJpo = jpo(jSONObjectOptJSONObject, jpoVar2);
                    } else {
                        jpoVarJpo = null;
                    }
                } else {
                    jpoVarJpo = jpo(jSONObjectOptJSONObject, jpoVar2);
                }
                if (jpoVarJpo != null) {
                    jpoVarJpo.jd(jd(jpoVarJpo));
                    jpoVarJpo.jpo(jpo(jpoVarJpo));
                }
                if (wqx(jpoVarJpo)) {
                    i10++;
                    jpoVar2.jd(jpoVarJpo);
                } else if (jpoVarJpo != null) {
                    jpoVar2.jpo(i11 - i10, jpoVarJpo);
                }
            }
        }
        return jpoVar2;
    }

    public boolean wqx(jpo jpoVar) {
        JSONObject jSONObjectCm;
        if (jpoVar == null || (jSONObjectCm = jpoVar.cm()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectCm.optString(C3191e4.h.L), "absolute");
    }

    public boolean jpo(jpo jpoVar) {
        JSONObject jSONObjectCm;
        if (jpoVar == null || (jSONObjectCm = jpoVar.cm()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectCm.optString("width"), "match_parent");
    }

    private void jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (this.f17758jj == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.f17758jj.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.qk.jd.jpo(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}
