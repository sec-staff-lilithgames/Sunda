package com.ironsource;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3131ag {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f36005a = Zf.f35901a.a();

    /* renamed from: b, reason: collision with root package name */
    private final S6 f36006b = new S6();

    @tu.f
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f36006b.a(this.f36005a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    public final JSONObject a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        JSONObject jSONObjectA = this.f36006b.a(context, this.f36005a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject("md"));
        if (jSONObjectB != null) {
            jSONObject.put("md", jSONObjectB);
        }
        return jSONObject;
    }
}
