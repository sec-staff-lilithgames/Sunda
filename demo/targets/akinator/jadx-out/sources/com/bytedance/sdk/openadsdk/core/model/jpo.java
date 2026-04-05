package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: if, reason: not valid java name */
    private dt f132if;

    /* renamed from: jd, reason: collision with root package name */
    private int f20695jd;

    /* renamed from: jj, reason: collision with root package name */
    private nq f20696jj;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private String f20697ju;
    private dt my;
    private String wqx;

    /* renamed from: yd, reason: collision with root package name */
    private tu f20699yd;
    private int zz;

    /* renamed from: cm, reason: collision with root package name */
    private List<dt> f20694cm = new ArrayList();

    /* renamed from: qk, reason: collision with root package name */
    private JSONObject f20698qk = new JSONObject();
    private volatile boolean xyk = false;

    public JSONObject au() {
        try {
            JSONObject jSONObject = new JSONObject();
            tu tuVarQk = qk();
            if (tuVarQk != null) {
                jSONObject.put("loop_config", tuVarQk.ju());
            }
            nq nqVarM472if = m472if();
            if (nqVarM472if != null) {
                jSONObject.put("multi_ad_config", nqVarM472if.sq());
            }
            List<dt> list = this.f20694cm;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f20694cm.size(); i10++) {
                    jSONArray.put(this.f20694cm.get(i10).gum());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.zz);
            jSONObject.put("request_id", this.jpo);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("AdInfo", "toJsonObj: ", th2);
            return null;
        }
    }

    public List<dt> cm() {
        return this.f20694cm;
    }

    /* renamed from: if, reason: not valid java name */
    public nq m472if() {
        return this.f20696jj;
    }

    public String jd() {
        dt dtVarJj = jj();
        return dtVarJj != null ? dtVarJj.hbg() : "";
    }

    public dt jj() {
        if (this.f20694cm.size() > 0) {
            return this.f20694cm.get(0);
        }
        return null;
    }

    public JSONObject jpo() {
        return this.f20698qk;
    }

    public dt ju() {
        return this.f132if;
    }

    public boolean my() {
        List<dt> list = this.f20694cm;
        return list != null && list.size() > 0;
    }

    public String oya() {
        return this.f20697ju;
    }

    public dt prr() {
        return this.my;
    }

    public tu qk() {
        return this.f20699yd;
    }

    public int wqx() {
        return this.f20695jd;
    }

    public boolean xyk() {
        return this.xyk;
    }

    public boolean yd() {
        return this.zz == 1;
    }

    public void zz() {
        this.xyk = false;
    }

    public void jpo(JSONObject jSONObject) {
        this.f20698qk = jSONObject;
    }

    public void wqx(String str) {
        this.f20697ju = str;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void jd(String str) {
        this.wqx = str;
    }

    public void jpo(int i10) {
        this.f20695jd = i10;
    }

    public void jd(int i10) {
        this.zz = i10;
    }

    public void jpo(dt dtVar) {
        this.f20694cm.add(dtVar);
        if (this.f132if == null) {
            this.f132if = dtVar;
        }
    }

    public static jpo jd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            jpo jpoVar = new jpo();
            jpoVar.jpo(tu.jpo(jSONObject.optJSONObject("loop_config")));
            jpoVar.jd(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    dt dtVarJpo = com.bytedance.sdk.openadsdk.core.jd.jpo(jSONArrayOptJSONArray.optJSONObject(i10), null, null, jpoVar, i10);
                    if (dtVarJpo != null) {
                        arrayList.add(dtVarJpo);
                    }
                }
                jpoVar.jpo(arrayList);
            }
            jpoVar.jpo(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                jpoVar.jpo(nq.jpo(strOptString));
            }
            return jpoVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("AdInfo", "fromJson: ", th2);
            return null;
        }
    }

    public void jpo(List<dt> list) {
        this.f20694cm = list;
        if (list.isEmpty()) {
            return;
        }
        this.f132if = list.get(0);
    }

    public static Map<String, dt> jpo(jpo jpoVar) {
        if (jpoVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (dt dtVar : jpoVar.cm()) {
            if (!TextUtils.isEmpty(dtVar.afh())) {
                map.put(dtVar.afh(), dtVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void jpo(tu tuVar) {
        this.f20699yd = tuVar;
    }

    public void jpo(nq nqVar) {
        this.f20696jj = nqVar;
    }

    public void jd(dt dtVar) {
        this.my = dtVar;
    }
}
