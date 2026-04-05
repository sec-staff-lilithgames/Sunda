package com.mbridge.msdk.setting;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private String f42592e;

    /* renamed from: f, reason: collision with root package name */
    private String f42593f;

    /* renamed from: g, reason: collision with root package name */
    private int f42594g;

    /* renamed from: a, reason: collision with root package name */
    private int f42588a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f42589b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f42590c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f42591d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f42595h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            aVar = new a();
        } catch (Exception e11) {
            e10 = e11;
            aVar = null;
        }
        try {
            aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f40850h));
            aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f40854l));
            aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f40858p));
            aVar.f(jSONObject.optInt("type", 0));
            aVar.a(jSONObject.optInt("batch_size", 1));
            aVar.c(jSONObject.optInt(IronSourceConstants.EVENTS_DURATION, 0));
            aVar.b(jSONObject.optInt("disable", 0));
            aVar.d(jSONObject.optInt("e_t_l", 0));
            return aVar;
        } catch (Exception e12) {
            e10 = e12;
            e10.printStackTrace();
            return aVar;
        }
    }

    public int b() {
        return this.f42589b;
    }

    public int c() {
        return this.f42590c;
    }

    public int d() {
        return this.f42591d;
    }

    public String e() {
        return this.f42592e;
    }

    public String f() {
        return this.f42593f;
    }

    public int g() {
        return this.f42594g;
    }

    public int h() {
        return this.f42595h;
    }

    public void b(int i10) {
        this.f42589b = i10;
    }

    public void c(int i10) {
        this.f42590c = i10;
    }

    public void d(int i10) {
        this.f42591d = i10;
    }

    public void e(int i10) {
        this.f42594g = i10;
    }

    public void f(int i10) {
        this.f42595h = i10;
    }

    public void b(String str) {
        this.f42592e = str;
    }

    public void c(String str) {
        this.f42593f = str;
    }

    public int a() {
        return this.f42588a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f42588a = i10;
    }
}
