package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3521x1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3384p> f39191a;

    public C3521x1(JSONObject applicationAuctionSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(C3518wf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C3384p(jSONObjectOptJSONObject));
        }
        this.f39191a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C3384p> a() {
        return this.f39191a;
    }
}
