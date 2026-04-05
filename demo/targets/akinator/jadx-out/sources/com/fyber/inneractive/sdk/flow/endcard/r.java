package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.x0;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends c {
    public r(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i10) {
        super(x0Var, cVar, i10);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(JSONArray jSONArray) {
        this.f23556b = jSONArray;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new u(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean k() {
        JSONArray jSONArray = this.f23556b;
        return jSONArray != null && jSONArray.length() > 0;
    }
}
