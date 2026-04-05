package com.inmobi.media;

import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class D7 {
    public static int a(String str, JSONObject jSONObject) {
        return (str == null || !jSONObject.has(str)) ? jSONObject.getInt(BuildConfig.FLAVOR) : jSONObject.getInt(str);
    }
}
