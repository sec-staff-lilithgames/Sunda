package com.bytedance.sdk.component.adexpress.jpo.wqx;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3191e4;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private List<C0080jpo> f18534cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f18535jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f18536jj;
    private String jpo;
    private jd my;

    /* renamed from: qk, reason: collision with root package name */
    private Map<String, jpo> f18537qk = new ConcurrentHashMap();
    private String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: jd, reason: collision with root package name */
        private String f18538jd;
        private String jpo;
        private List<Pair<String, String>> wqx;

        public void jd(String str) {
            this.f18538jd = str;
        }

        public String jpo() {
            return this.jpo;
        }

        public List<Pair<String, String>> jd() {
            return this.wqx;
        }

        public void jpo(String str) {
            this.jpo = str;
        }

        public void jpo(List<Pair<String, String>> list) {
            this.wqx = list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.adexpress.jpo.wqx.jpo$jpo, reason: collision with other inner class name */
    public static class C0080jpo {

        /* renamed from: jd, reason: collision with root package name */
        private String f18539jd;
        private String jpo;
        private int wqx;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0080jpo)) {
                return super.equals(obj);
            }
            String str2 = this.jpo;
            if (str2 != null) {
                C0080jpo c0080jpo = (C0080jpo) obj;
                if (str2.equals(c0080jpo.jpo()) && (str = this.f18539jd) != null && str.equals(c0080jpo.jd())) {
                    return true;
                }
            }
            return false;
        }

        public String jd() {
            return this.f18539jd;
        }

        public String jpo() {
            return this.jpo;
        }

        public int wqx() {
            return this.wqx;
        }

        public void jd(String str) {
            this.f18539jd = str;
        }

        public void jpo(String str) {
            this.jpo = str;
        }

        public void jpo(int i10) {
            this.wqx = i10;
        }
    }

    public String cm() {
        return this.wqx;
    }

    public String jd() {
        return this.jpo;
    }

    public List<C0080jpo> jj() {
        if (this.f18534cm == null) {
            this.f18534cm = new ArrayList();
        }
        return this.f18534cm;
    }

    public Map<String, jpo> jpo() {
        return this.f18537qk;
    }

    public jd my() {
        return this.my;
    }

    public String qk() {
        return this.f18536jj;
    }

    public String wqx() {
        return this.f18535jd;
    }

    public boolean xyk() {
        return (TextUtils.isEmpty(cm()) || TextUtils.isEmpty(wqx()) || TextUtils.isEmpty(jd())) ? false : true;
    }

    public String yd() {
        JSONObject jSONObjectZz;
        if (!xyk() || (jSONObjectZz = zz()) == null) {
            return null;
        }
        return jSONObjectZz.toString();
    }

    public JSONObject zz() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", jd());
            jSONObject.putOpt("version", wqx());
            jSONObject.putOpt(C3191e4.h.Z, cm());
            if (!TextUtils.isEmpty(this.f18536jj)) {
                jSONObject.put("template_fetch_url", this.f18536jj);
            }
            JSONArray jSONArray = new JSONArray();
            if (jj() != null) {
                for (C0080jpo c0080jpo : jj()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0080jpo.jpo());
                    jSONObject2.putOpt("md5", c0080jpo.jd());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0080jpo.wqx()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.f18537qk.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.f18537qk.keySet()) {
                    jpo jpoVar = this.f18537qk.get(str);
                    if (jpoVar != null) {
                        jSONObject3.put(str, jpoVar.zz());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            jd jdVarMy = my();
            if (jdVarMy != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", jdVarMy.jpo);
                jSONObject4.put("md5", jdVarMy.f18538jd);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listJd = jdVarMy.jd();
                if (listJd != null) {
                    for (Pair<String, String> pair : listJd) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static jpo my(String str) {
        if (str == null) {
            return null;
        }
        try {
            return jpo(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void cm(String str) {
        this.f18536jj = str;
    }

    public void jd(String str) {
        this.f18535jd = str;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void wqx(String str) {
        this.wqx = str;
    }

    public void jpo(jd jdVar) {
        this.my = jdVar;
    }

    public void jpo(List<C0080jpo> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f18534cm = list;
    }

    public static jpo jpo(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        jpo jpoVar = new jpo();
        jpoVar.jpo(jSONObject.optString("name"));
        jpoVar.jd(jSONObject.optString("version"));
        jpoVar.wqx(jSONObject.optString(C3191e4.h.Z));
        jpoVar.cm(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0080jpo c0080jpo = new C0080jpo();
                c0080jpo.jpo(jSONObjectOptJSONObject2.optString("url"));
                c0080jpo.jd(jSONObjectOptJSONObject2.optString("md5"));
                c0080jpo.jpo(jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0080jpo);
            }
        }
        jpoVar.jpo(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jpo jpoVarJpo = jpo(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (jpoVarJpo != null) {
                        jpoVar.jpo().put(next, jpoVarJpo);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            jd jdVar = new jd();
            jdVar.jpo(jSONObjectOptJSONObject.optString("url"));
            jdVar.jd(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    o2.z(next2, jSONObjectOptJSONObject4.optString(next2), arrayList2);
                }
                jdVar.jpo(arrayList2);
            }
            jpoVar.jpo(jdVar);
        }
        if (jpoVar.xyk()) {
            return jpoVar;
        }
        return null;
    }
}
