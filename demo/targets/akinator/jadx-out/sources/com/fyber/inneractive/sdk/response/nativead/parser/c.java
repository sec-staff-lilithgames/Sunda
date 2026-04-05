package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.h;
import com.fyber.inneractive.sdk.util.v;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c {
    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        if (jSONObject != null) {
            hVar.f26673a = v.a(jSONObject, "url");
            hVar.f26675c = v.a(jSONObject, "fallback");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clicktrackers");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(AbstractJsonLexerKt.NULL)) {
                        hVar.f26674b.add(strOptString);
                    }
                }
            }
        }
        return hVar;
    }
}
