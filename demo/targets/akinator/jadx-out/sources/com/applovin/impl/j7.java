package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14209a;

    /* renamed from: b, reason: collision with root package name */
    private String f14210b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14211c = a(x4.f16183k);

    /* renamed from: d, reason: collision with root package name */
    private final String f14212d = a(x4.f16184l);

    /* renamed from: e, reason: collision with root package name */
    private String f14213e = (String) y4.a(x4.f16185m, (Object) null, com.applovin.impl.sdk.k.o());

    /* renamed from: f, reason: collision with root package name */
    private String f14214f = (String) y4.a(x4.f16186n, (Object) null, com.applovin.impl.sdk.k.o());

    public j7(com.applovin.impl.sdk.k kVar) {
        this.f14209a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f14209a.a(v4.H3)).booleanValue()) {
            this.f14209a.c(x4.f16182j);
        }
        String str = (String) this.f14209a.a(x4.f16182j);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f14209a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14209a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f14212d;
    }

    public String b() {
        return this.f14213e;
    }

    public String c() {
        return this.f14211c;
    }

    public String d() {
        return this.f14214f;
    }

    public String e() {
        return this.f14210b;
    }

    private String a(x4 x4Var) {
        String str = (String) y4.a(x4Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        y4.b(x4Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    public void b(String str) {
        this.f14213e = str;
        y4.b(x4.f16185m, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f14214f = str;
        y4.b(x4.f16186n, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.f14209a.a(v4.H3)).booleanValue()) {
            this.f14209a.b(x4.f16182j, str);
        }
        this.f14210b = str;
        this.f14209a.u().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        x4 x4Var = x4.f16187o;
        String str = (String) kVar.a(x4Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(x4Var, strValueOf);
        return strValueOf;
    }
}
