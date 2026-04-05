package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f23329a = null;

    /* renamed from: b, reason: collision with root package name */
    public UnitDisplayType f23330b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f23331c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f23332d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, ToolBar.REFRESH, this.f23329a);
        c1.a(jSONObject, "unitDisplayType", this.f23330b);
        c1.a(jSONObject, "close", this.f23331c);
        c1.a(jSONObject, "hideDelay", this.f23332d);
        return jSONObject;
    }
}
