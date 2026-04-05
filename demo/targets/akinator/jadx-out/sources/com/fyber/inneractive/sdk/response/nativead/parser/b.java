package com.fyber.inneractive.sdk.response.nativead.parser;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {
    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(AbstractJsonLexerKt.NULL)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }
}
