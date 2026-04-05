package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f45341a;

    /* renamed from: b, reason: collision with root package name */
    private String f45342b;

    public a(String str, String str2) {
        this.f45341a = str;
        this.f45342b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
