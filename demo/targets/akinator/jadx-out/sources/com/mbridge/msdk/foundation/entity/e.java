package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f40548a;

    /* renamed from: b, reason: collision with root package name */
    private String f40549b;

    /* renamed from: c, reason: collision with root package name */
    private String f40550c;

    /* renamed from: d, reason: collision with root package name */
    private int f40551d;

    /* renamed from: e, reason: collision with root package name */
    private int f40552e;

    /* renamed from: f, reason: collision with root package name */
    private String f40553f;

    /* renamed from: g, reason: collision with root package name */
    private String f40554g;

    /* renamed from: h, reason: collision with root package name */
    private String f40555h;

    /* renamed from: i, reason: collision with root package name */
    private int f40556i;

    /* renamed from: j, reason: collision with root package name */
    private String f40557j;

    /* renamed from: k, reason: collision with root package name */
    private int f40558k;

    /* renamed from: l, reason: collision with root package name */
    private String f40559l;

    /* renamed from: m, reason: collision with root package name */
    private int f40560m;

    /* renamed from: n, reason: collision with root package name */
    private String f40561n;

    /* renamed from: o, reason: collision with root package name */
    private String f40562o;

    /* renamed from: p, reason: collision with root package name */
    private int f40563p;

    /* renamed from: q, reason: collision with root package name */
    private String f40564q;

    public String a() {
        return this.f40548a;
    }

    public String b() {
        return this.f40550c;
    }

    public int c() {
        return this.f40551d;
    }

    public String d() {
        return this.f40549b;
    }

    public void e(int i10) {
        this.f40560m = i10;
    }

    public void f(int i10) {
        this.f40563p = i10;
    }

    public String g() {
        return this.f40554g;
    }

    public void h(String str) {
        this.f40559l = str;
    }

    public void i(String str) {
        this.f40561n = str;
    }

    public String j() {
        return this.f40557j;
    }

    public void k(String str) {
        this.f40564q = str;
    }

    public String l() {
        return this.f40559l;
    }

    public int m() {
        return this.f40560m;
    }

    public String n() {
        return this.f40561n;
    }

    public String o() {
        return this.f40562o;
    }

    public int p() {
        return this.f40563p;
    }

    public String q() {
        return this.f40564q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickTime [campaignId=");
        sb2.append(this.f40548a);
        sb2.append(", click_duration=");
        sb2.append(this.f40549b);
        sb2.append(", lastUrl=");
        sb2.append(this.f40557j);
        sb2.append(", code=");
        sb2.append(this.f40552e);
        sb2.append(", excepiton=");
        sb2.append(this.f40554g);
        sb2.append(", header=");
        sb2.append(this.f40555h);
        sb2.append(", content=");
        sb2.append(this.f40553f);
        sb2.append(", type=");
        sb2.append(this.f40563p);
        sb2.append(", click_type=");
        return a.b.f(this.f40551d, C3191e4.i.f36531e, sb2);
    }

    public void a(int i10) {
        this.f40551d = i10;
    }

    public void b(String str) {
        this.f40550c = str;
    }

    public void c(int i10) {
        this.f40556i = i10;
    }

    public void d(int i10) {
        this.f40558k = i10;
    }

    public int e() {
        return this.f40552e;
    }

    public String f() {
        return this.f40553f;
    }

    public void g(String str) {
        this.f40557j = str;
    }

    public String h() {
        return this.f40555h;
    }

    public int i() {
        return this.f40556i;
    }

    public void j(String str) {
        this.f40562o = str;
    }

    public int k() {
        return this.f40558k;
    }

    public void a(String str) {
        this.f40548a = str;
    }

    public void b(int i10) {
        this.f40552e = i10;
    }

    public void c(String str) {
        this.f40549b = str;
    }

    public void d(String str) {
        this.f40553f = str;
    }

    public void e(String str) {
        this.f40554g = str;
    }

    public void f(String str) {
        this.f40555h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
            jSONObject.put("click_duration", eVar.d());
            jSONObject.put(C3191e4.h.W, "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put("code", eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            p0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put(BidResponsedEx.KEY_CID, eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put("click_duration", eVar.d());
                jSONObject.put(C3191e4.h.W, "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put("code", eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f40369r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                p0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }
}
