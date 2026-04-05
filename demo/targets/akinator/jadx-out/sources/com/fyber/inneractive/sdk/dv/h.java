package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.r0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends com.fyber.inneractive.sdk.response.b {
    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        try {
            ((i) this.f26618a).N = new JSONObject(str).getString("adm");
        } catch (JSONException e10) {
            com.fyber.inneractive.sdk.dv.handler.e.a(r0Var != null ? r0Var.f23344b : null, com.fyber.inneractive.sdk.dv.enums.a.Parse, null, null, e10.getLocalizedMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final com.fyber.inneractive.sdk.response.e a() {
        return new i();
    }
}
