package com.inmobi.ads;

import com.inmobi.media.A0;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f31535a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f31536b;

    public AdMetaInfo(String creativeID, JSONObject jSONObject) {
        e0.checkNotNullParameter(creativeID, "creativeID");
        this.f31535a = creativeID;
        this.f31536b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f31536b;
        if (jSONObject != null) {
            return jSONObject.optDouble(A0.BUYER_PRICE);
        }
        return 0.0d;
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f31536b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f31536b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    public final String getCreativeID() {
        return this.f31535a;
    }
}
