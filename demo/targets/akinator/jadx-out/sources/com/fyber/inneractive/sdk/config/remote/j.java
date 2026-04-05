package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f23379a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f23380b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f23381c;

    /* renamed from: d, reason: collision with root package name */
    public Skip f23382d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f23383e;

    /* renamed from: f, reason: collision with root package name */
    public TapAction f23384f;

    /* renamed from: g, reason: collision with root package name */
    public Orientation f23385g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f23386h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f23387i;

    /* renamed from: j, reason: collision with root package name */
    public UnitDisplayType f23388j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f23389k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int iOptInt = jSONObject.optInt("maxBitrate", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("minBitrate", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        jVar.f23380b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        jVar.f23381c = numValueOf2;
        jVar.f23382d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f23383e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f23379a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f23385g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f23384f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        jVar.f23386h = numValueOf3;
        jVar.f23387i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        jVar.f23388j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i10, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    jVar.f23389k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return jVar;
    }
}
