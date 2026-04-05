package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f16131a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private w0(JSONObject jSONObject) {
        this.f16131a = jSONObject;
    }

    public static w0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), C3191e4.h.W, null);
        if ("TOS".equalsIgnoreCase(string) && kVar.y().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.y().f() == null) {
            return null;
        }
        return new w0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f16131a, NotificationCompat.CATEGORY_EVENT, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f16131a, TtmlNode.TAG_STYLE, null);
        return BuildConfig.FLAVOR.equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f16131a, "title", (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, C3191e4.h.W, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f16131a, "destination_state_id", -1);
    }
}
