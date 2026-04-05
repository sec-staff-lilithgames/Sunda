package com.bytedance.sdk.openadsdk.nmd.jd;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private List<C0148jpo> f21306jd;
    private String jpo;
    private List<C0148jpo> wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.nmd.jd.jpo$jpo, reason: collision with other inner class name */
    public static class C0148jpo {

        /* renamed from: jd, reason: collision with root package name */
        private String f21307jd;
        private String jpo;
        private int wqx;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0148jpo)) {
                return super.equals(obj);
            }
            String str2 = this.jpo;
            if (str2 != null) {
                C0148jpo c0148jpo = (C0148jpo) obj;
                if (str2.equals(c0148jpo.jpo) && (str = this.f21307jd) != null && str.equals(c0148jpo.f21307jd)) {
                    return true;
                }
            }
            return false;
        }

        public static C0148jpo jpo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0148jpo c0148jpo = new C0148jpo();
            c0148jpo.jpo = jSONObject.optString("url");
            c0148jpo.f21307jd = jSONObject.optString("md5");
            c0148jpo.wqx = jSONObject.optInt("type");
            return c0148jpo;
        }

        public String jpo() {
            return this.jpo;
        }
    }

    public void jd(List<C0148jpo> list) {
        this.wqx = list;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public List<C0148jpo> wqx() {
        return this.wqx;
    }

    public List<C0148jpo> jd() {
        return this.f21306jd;
    }

    public void jpo(List<C0148jpo> list) {
        this.f21306jd = list;
    }

    public static jpo jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jpo jpoVar = new jpo();
            jpoVar.jpo(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0148jpo c0148jpoJpo = C0148jpo.jpo(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0148jpoJpo != null) {
                        if (c0148jpoJpo.wqx != 1) {
                            if (c0148jpoJpo.wqx == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0148jpoJpo);
                            }
                        } else {
                            arrayList.add(c0148jpoJpo);
                        }
                    }
                }
            }
            jpoVar.jpo(arrayList);
            jpoVar.jd(arrayList2);
            return jpoVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String jpo() {
        return this.jpo;
    }
}
