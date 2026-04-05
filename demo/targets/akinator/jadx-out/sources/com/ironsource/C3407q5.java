package com.ironsource;

import com.ironsource.mediationsdk.d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3407q5 implements Lb<String, d.a> {
    @Override // com.ironsource.Lb
    public d.a a(String input) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        d.a aVarA = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
