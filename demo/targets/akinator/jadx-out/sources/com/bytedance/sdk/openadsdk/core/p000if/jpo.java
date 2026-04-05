package com.bytedance.sdk.openadsdk.core.p000if;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private String f20398cm;

    /* renamed from: if, reason: not valid java name */
    private String f120if;

    /* renamed from: jd, reason: collision with root package name */
    jd f20399jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f20400jj;
    final cm jpo = new cm();

    /* renamed from: ju, reason: collision with root package name */
    private String f20401ju = "VAST_ACTION_BUTTON";
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private String f20402qk;
    wqx wqx;
    private double xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f20403yd;
    private int zz;

    private JSONArray prr() {
        Set<yd> setJd = this.jpo.jd();
        if (setJd == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (yd ydVar : setJd) {
            if (ydVar != null) {
                jSONArray.put(ydVar.cm());
            }
        }
        return jSONArray;
    }

    public Set<yd> au() {
        return this.jpo.jd();
    }

    public String cm() {
        return this.f20398cm;
    }

    /* renamed from: if, reason: not valid java name */
    public int m460if() {
        return this.f20403yd;
    }

    public jd jd() {
        return this.f20399jd;
    }

    public String jj() {
        return this.f20400jj;
    }

    public cm jpo() {
        return this.jpo.jpo();
    }

    public int ju() {
        return this.zz;
    }

    public String my() {
        return this.my;
    }

    public cm oya() {
        return this.jpo;
    }

    public String qk() {
        return this.f20402qk;
    }

    public wqx wqx() {
        return this.wqx;
    }

    public double xyk() {
        return this.xyk;
    }

    public JSONObject yd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        cm cmVarJpo = this.jpo.jpo();
        if (cmVarJpo != null) {
            jSONObject.put("videoTrackers", cmVarJpo.jpo());
        }
        jd jdVar = this.f20399jd;
        if (jdVar != null) {
            jSONObject.put("vastIcon", jdVar.jpo());
        }
        wqx wqxVar = this.wqx;
        if (wqxVar != null) {
            jSONObject.put("endCard", wqxVar.jpo());
        }
        jSONObject.put("title", this.f20398cm);
        jSONObject.put("description", this.my);
        jSONObject.put("clickThroughUrl", this.f20400jj);
        jSONObject.put("videoUrl", this.f20402qk);
        jSONObject.put("videDuration", this.xyk);
        jSONObject.put("videoWidth", this.zz);
        jSONObject.put("videoHeight", this.f20403yd);
        jSONObject.put("viewabilityVendor", prr());
        return jSONObject;
    }

    public String zz() {
        wqx wqxVar;
        String str = this.f20400jj;
        if (!TextUtils.isEmpty(this.f120if)) {
            String str2 = this.f120if;
            this.f120if = null;
            return str2;
        }
        String str3 = this.f20401ju;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            jd jdVar = this.f20399jd;
            if (jdVar != null && !TextUtils.isEmpty(jdVar.xyk)) {
                str = this.f20399jd.xyk;
            }
        } else if (str3.equals("VAST_END_CARD") && (wqxVar = this.wqx) != null && !TextUtils.isEmpty(wqxVar.xyk)) {
            str = this.wqx.xyk;
        }
        this.f20401ju = "VAST_ACTION_BUTTON";
        return str;
    }

    public void cm(String str) {
        this.f20402qk = str;
    }

    public void jd(String str) {
        this.my = str;
    }

    public void jj(String str) {
        this.f120if = str;
    }

    public void jpo(jd jdVar) {
        if (jdVar != null) {
            jdVar.jpo(this.f20402qk);
        }
        this.f20399jd = jdVar;
    }

    public void my(String str) {
        this.f20401ju = str;
    }

    public void wqx(String str) {
        this.f20400jj = str;
    }

    public void jd(int i10) {
        this.f20403yd = i10;
    }

    public void jpo(wqx wqxVar) {
        if (wqxVar != null) {
            wqxVar.jpo(this.f20402qk);
        }
        this.wqx = wqxVar;
    }

    public void jpo(String str) {
        this.f20398cm = str;
    }

    public void jpo(double d10) {
        this.xyk = d10;
    }

    public static jpo jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jpo jpoVar = new jpo();
        cm cmVarJpo = jpoVar.jpo.jpo();
        if (cmVarJpo == null) {
            cmVarJpo = new cm();
            jpoVar.jpo.jpo(cmVarJpo);
        }
        cmVarJpo.jpo(jSONObject.optJSONObject("videoTrackers"));
        jpoVar.f20399jd = jd.jpo(jSONObject.optJSONObject("vastIcon"));
        jpoVar.wqx = wqx.jd(jSONObject.optJSONObject("endCard"));
        jpoVar.f20398cm = jSONObject.optString("title");
        jpoVar.my = jSONObject.optString("description");
        jpoVar.f20400jj = jSONObject.optString("clickThroughUrl");
        jpoVar.f20402qk = jSONObject.optString("videoUrl");
        jpoVar.xyk = jSONObject.optDouble("videDuration");
        jpoVar.zz = jSONObject.optInt("videoWidth");
        jpoVar.zz = jSONObject.optInt("videoHeight");
        Set<yd> setJd = jpoVar.jpo.jd();
        if (setJd == null) {
            setJd = new HashSet<>();
            jpoVar.jpo.jpo(setJd);
        }
        setJd.addAll(yd.jpo(jSONObject.optJSONArray("viewabilityVendor")));
        return jpoVar;
    }

    public void jpo(dt dtVar) {
        this.jpo.jpo(dtVar);
        jd jdVar = this.f20399jd;
        if (jdVar != null) {
            jdVar.jpo(dtVar);
        }
        wqx wqxVar = this.wqx;
        if (wqxVar != null) {
            wqxVar.jpo(dtVar);
        }
    }

    public void jpo(int i10) {
        this.zz = i10;
    }

    public void jpo(Set<yd> set) {
        this.jpo.jd(set);
    }
}
