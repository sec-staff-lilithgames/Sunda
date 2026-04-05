package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33952a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f33953b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33954c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33955d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33956e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33957f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33958g;

    public D1(JSONObject applicationCrashReporterSettings) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f33952a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> listB = C3286ja.b(applicationCrashReporterSettings.optJSONArray(F1.f34341b));
        this.f33953b = listB != null ? uu.y0.toHashSet(listB) : null;
        String strOptString = applicationCrashReporterSettings.optString(F1.f34342c);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f33954c = strOptString;
        String strOptString2 = applicationCrashReporterSettings.optString(F1.f34343d);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f33955d = strOptString2;
        this.f33956e = applicationCrashReporterSettings.optBoolean(F1.f34344e, false);
        this.f33957f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f33958g = applicationCrashReporterSettings.optBoolean(F1.f34346g, false);
    }

    public final int a() {
        return this.f33957f;
    }

    public final HashSet<String> b() {
        return this.f33953b;
    }

    public final String c() {
        return this.f33955d;
    }

    public final String d() {
        return this.f33954c;
    }

    public final boolean e() {
        return this.f33956e;
    }

    public final boolean f() {
        return this.f33952a;
    }

    public final boolean g() {
        return this.f33958g;
    }
}
