package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: jd, reason: collision with root package name */
    private cm f20712jd;
    private ArrayList<jpo> jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private Set<com.bytedance.sdk.openadsdk.core.p000if.yd> f20713cm;

        /* renamed from: jd, reason: collision with root package name */
        private final String f20714jd;
        private final String jpo;
        private com.bytedance.sdk.openadsdk.core.p000if.cm wqx;

        public jpo(JSONObject jSONObject) {
            this.jpo = jSONObject.optString("vast_url");
            this.f20714jd = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVar = new com.bytedance.sdk.openadsdk.core.p000if.cm();
                this.wqx = cmVar;
                cmVar.jpo(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.f20713cm = com.bytedance.sdk.openadsdk.core.p000if.yd.jpo(jSONArrayOptJSONArray);
            }
        }

        public String cm() {
            return this.f20714jd;
        }

        public Set<com.bytedance.sdk.openadsdk.core.p000if.yd> jd() {
            return this.f20713cm;
        }

        public com.bytedance.sdk.openadsdk.core.p000if.cm jpo() {
            return this.wqx;
        }

        public JSONObject my() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.jpo);
            jSONObject.put("vast_content", this.f20714jd);
            com.bytedance.sdk.openadsdk.core.p000if.cm cmVar = this.wqx;
            if (cmVar != null) {
                jSONObject.put("videoTrackers", cmVar.jpo());
            }
            if (this.f20713cm != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.p000if.yd ydVar : this.f20713cm) {
                    if (ydVar != null) {
                        jSONArray.put(ydVar.cm());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }

        public String wqx() {
            return this.jpo;
        }

        public void jpo(com.bytedance.sdk.openadsdk.core.p000if.cm cmVar) {
            this.wqx = cmVar;
        }

        public void jpo(Set<com.bytedance.sdk.openadsdk.core.p000if.yd> set) {
            this.f20713cm = set;
        }
    }

    public my(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jpo jpoVar = new jpo(jSONArray.optJSONObject(i10));
            if (this.jpo == null) {
                this.jpo = new ArrayList<>();
            }
            this.jpo.add(jpoVar);
        }
    }

    public static boolean jpo(dt dtVar) {
        if (dtVar == null || dtVar.se()) {
            return false;
        }
        int iCxb = dtVar.cxb();
        int iIqh = dtVar.iqh();
        return (iCxb == 3 || iCxb == 7 || iCxb == 8) && (iIqh == 5 || iIqh == 15 || iIqh == 50);
    }

    public boolean cm() {
        ArrayList<jpo> arrayList = this.jpo;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public JSONArray jd() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<jpo> arrayList = this.jpo;
        if (arrayList != null) {
            try {
                Iterator<jpo> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().my());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public cm wqx() {
        if (this.f20712jd == null) {
            this.f20712jd = new cm();
            ArrayList<jpo> arrayList = this.jpo;
            if (arrayList != null) {
                Iterator<jpo> it = arrayList.iterator();
                while (it.hasNext()) {
                    jpo next = it.next();
                    com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo = next.jpo();
                    Set<com.bytedance.sdk.openadsdk.core.p000if.yd> setJd = next.jd();
                    if (cmVarJpo != null) {
                        this.f20712jd.jpo().jpo(cmVarJpo);
                    }
                    if (setJd != null) {
                        this.f20712jd.jd().addAll(setJd);
                    }
                }
            }
        }
        return this.f20712jd;
    }

    public ArrayList<jpo> jpo() {
        return this.jpo;
    }
}
