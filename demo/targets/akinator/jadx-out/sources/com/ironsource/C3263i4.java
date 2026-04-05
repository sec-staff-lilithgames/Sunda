package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3263i4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36920a = "SSA_CORE.SDKController.runFunction";

    public static String a(C3280j4 c3280j4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f36920a, c3280j4.b(), a(c3280j4.c()), b(c3280j4));
    }

    private static String b(C3280j4 c3280j4) {
        return (c3280j4.d() == null || c3280j4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c3280j4.d(), c3280j4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
