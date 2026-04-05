package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    private String f42692f;

    /* renamed from: g, reason: collision with root package name */
    private String f42693g;

    /* renamed from: h, reason: collision with root package name */
    private int f42694h;

    /* renamed from: a, reason: collision with root package name */
    private int f42687a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f42688b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f42689c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f42690d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f42691e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f42695i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            dVar = new d();
        } catch (Exception e11) {
            e10 = e11;
            dVar = null;
        }
        try {
            dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f40847f));
            dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f40853k));
            dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f40857o));
            dVar.d(jSONObject.optInt("type", 1));
            dVar.b(jSONObject.optInt("d_t", 30));
            dVar.a(jSONObject.optInt("d_a", 0));
            return dVar;
        } catch (Exception e12) {
            e10 = e12;
            e10.printStackTrace();
            return dVar;
        }
    }

    public int b() {
        return this.f42690d;
    }

    public String c() {
        return this.f42692f;
    }

    public String d() {
        return this.f42693g;
    }

    public int e() {
        return this.f42694h;
    }

    public void b(int i10) {
        this.f42690d = i10;
    }

    public void c(String str) {
        this.f42693g = str;
    }

    public void d(int i10) {
        this.f42695i = i10;
    }

    public void b(String str) {
        this.f42692f = str;
    }

    public void c(int i10) {
        this.f42694h = i10;
    }

    public int a() {
        return this.f42689c;
    }

    public void a(int i10) {
        this.f42689c = i10;
    }
}
