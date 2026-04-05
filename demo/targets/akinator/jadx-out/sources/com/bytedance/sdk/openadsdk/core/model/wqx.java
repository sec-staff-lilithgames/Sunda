package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    public ArrayList<Integer> f20802cm;

    /* renamed from: jd, reason: collision with root package name */
    public int f20803jd;

    /* renamed from: jj, reason: collision with root package name */
    public String f20804jj;
    public String jpo;
    public AdSlot my;

    /* renamed from: qk, reason: collision with root package name */
    public int f20805qk;
    public int wqx = 1;

    public AdSlot cm() {
        return this.my;
    }

    public int jd() {
        return this.f20803jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public ArrayList<Integer> my() {
        return this.f20802cm;
    }

    public int wqx() {
        return this.wqx;
    }

    public void jd(int i10) {
        this.wqx = i10;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void wqx(int i10) {
        this.f20805qk = i10;
    }

    public void jd(String str) {
        this.f20804jj = str;
    }

    public void jpo(int i10) {
        this.f20803jd = i10;
    }

    public void jpo(AdSlot adSlot) {
        this.my = adSlot;
    }

    public void jpo(ArrayList<Integer> arrayList) {
        this.f20802cm = arrayList;
    }

    public static void jpo(wqx wqxVar) {
        int iJd;
        if (wqxVar == null || wqxVar.cm() == null || (iJd = wqxVar.jd()) >= 0 || iJd == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.prr.wqx.jpo();
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.model.wqx.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", wqx.this.wqx());
                jSONObject.put("err_code", wqx.this.jd());
                jSONObject.put("err_msg", wqx.this.f20804jj);
                jSONObject.put("ext_from", wqx.this.f20805qk);
                jSONObject.put("server_res_str", wqx.this.jpo());
                if (wqx.this.my() != null && wqx.this.my().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) wqx.this.my()).toString());
                }
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("rd_client_custom_error").jpo(wqx.this.cm().getDurationSlotType()).jd(jSONObject.toString());
            }
        });
    }
}
