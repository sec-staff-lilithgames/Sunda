package com.google.android.gms.common.util;

import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MapUtils {
    public static void writeStringMapToJson(StringBuilder sb2, HashMap<String, String> map) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : map.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            i.h(sb2, "\"", str, "\":");
            if (str2 == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else {
                i.h(sb2, "\"", str2, "\"");
            }
            z10 = false;
        }
        sb2.append("}");
    }
}
