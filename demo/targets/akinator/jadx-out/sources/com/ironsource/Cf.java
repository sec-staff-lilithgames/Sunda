package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cf {
    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(initResponse, "initResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        Kf kf2 = Kf.f34769a;
        a(context, a(appKey, sdkVersion, kf2.c(context), kf2.a(context), kf2.b(context), bool, initResponse, z10, kf2.b(), kf2.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final String b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Kf.f34769a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z10, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(uu.p1.mapOf(tu.e0.to(C3144bb.f36078o, "Android"), tu.e0.to("appKey", str), tu.e0.to("sdkVersion", str2), tu.e0.to("bundleId", str3), tu.e0.to("appName", str4), tu.e0.to(C3191e4.i.W, str5), tu.e0.to("initResponse", jSONObject), tu.e0.to("isRvManual", Boolean.valueOf(z10)), tu.e0.to("generalProperties", jSONObject2), tu.e0.to("adaptersVersion", jSONObject3), tu.e0.to("metaData", jSONObject4), tu.e0.to("gdprConsent", bool))).toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }
}
