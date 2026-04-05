package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public UnitDisplayType f23357a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f23358b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f23359c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f23360d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        int iOptInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(ToolBar.REFRESH, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        bVar.f23357a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f23358b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        bVar.f23360d = numValueOf;
        bVar.f23359c = iOptInt2 != Integer.MIN_VALUE ? numValueOf2 : null;
        return bVar;
    }
}
