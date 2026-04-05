package com.ironsource;

import com.ironsource.C3460t8;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class X9 {

    /* renamed from: a, reason: collision with root package name */
    static String f35706a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f35706a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(M9 m9) {
        if (m9.i()) {
            return C3460t8.e.Banner.toString();
        }
        if (m9.n()) {
            return C3460t8.e.RewardedVideo.toString();
        }
        return C3460t8.e.Interstitial.toString();
    }
}
