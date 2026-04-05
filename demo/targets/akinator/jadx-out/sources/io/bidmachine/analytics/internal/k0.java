package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.internal.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k0 {
    public static final j0 a(h0 h0Var) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        String strC = h0Var.c();
        String strD = h0Var.d();
        long jF = h0Var.f();
        String strA = h0Var.a();
        String string2 = a(h0Var.e()).toString();
        q0 q0VarB = h0Var.b();
        if (q0VarB == null || (jSONObjectA = r0.a(q0VarB)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(sv.g.f86134b)) == null) {
            bytes = new byte[0];
        }
        return new j0(strC, strD, jF, strA, string2, bytes, h0Var.g());
    }

    public static final h0 a(j0 j0Var) {
        return new h0(j0Var.c(), j0Var.d(), j0Var.f(), j0Var.a(), a(new JSONObject(j0Var.e())), j0Var.b().length == 0 ? null : r0.a(new JSONObject(new String(j0Var.b(), sv.g.f86134b))), j0Var.g());
    }

    public static final JSONObject a(h0.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", aVar.b());
        jSONObject.put("path", aVar.a());
        return jSONObject;
    }

    public static final h0.a a(JSONObject jSONObject) {
        return new h0.a(jSONObject.optString("tag"), jSONObject.optString("path"));
    }
}
