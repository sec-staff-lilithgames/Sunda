package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23834a = b("app_screen_%d");

    /* renamed from: b, reason: collision with root package name */
    public static final String f23835b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";

    /* renamed from: c, reason: collision with root package name */
    public static final String f23836c = b("app_video_url_%d");

    /* renamed from: d, reason: collision with root package name */
    public static final String f23837d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";

    /* renamed from: e, reason: collision with root package name */
    public static final String f23838e = b("app_icon");

    /* renamed from: f, reason: collision with root package name */
    public static final String f23839f = "document.getElementById(\"app_icon\").src = app_icon;\n";

    /* renamed from: g, reason: collision with root package name */
    public static final String f23840g = b("app_name");

    /* renamed from: h, reason: collision with root package name */
    public static final String f23841h = a("app_name");

    /* renamed from: i, reason: collision with root package name */
    public static final String f23842i = b("app_pub_name");

    /* renamed from: j, reason: collision with root package name */
    public static final String f23843j = a("app_pub_name");

    /* renamed from: k, reason: collision with root package name */
    public static final String f23844k = b("app_label");

    /* renamed from: l, reason: collision with root package name */
    public static final String f23845l = a("app_label");

    /* renamed from: m, reason: collision with root package name */
    public static final String f23846m = b(CampaignEx.JSON_KEY_APP_SIZE);

    /* renamed from: n, reason: collision with root package name */
    public static final String f23847n = a(CampaignEx.JSON_KEY_APP_SIZE);

    /* renamed from: o, reason: collision with root package name */
    public static final String f23848o = b("app_rating");

    /* renamed from: p, reason: collision with root package name */
    public static final String f23849p = a("app_rating");

    /* renamed from: q, reason: collision with root package name */
    public static final String f23850q = b("app_rating_icon");

    /* renamed from: r, reason: collision with root package name */
    public static final String f23851r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";

    public static String a(String str) {
        return e3.g.l("document.getElementById(\"", str, "\").innerHTML = `${", str, "}`;\n");
    }

    public static String b(String str) {
        return a.b.l("var ", str, " = `%s`;\n");
    }

    public static String a(boolean z10, String str) {
        return o2.o(e3.g.o("document.getElementById(\"", str, "\").style.display = "), z10 ? "'block'" : "'none'", ";\n");
    }
}
