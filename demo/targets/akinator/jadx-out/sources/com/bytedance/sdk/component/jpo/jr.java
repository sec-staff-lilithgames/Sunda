package com.bytedance.sdk.component.jpo;

import a.b;
import android.text.TextUtils;
import e3.g;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jr {
    private static boolean jpo;

    public static String jpo(Throwable th2) {
        return b.f(th2 instanceof hna ? ((hna) th2).jpo : 0, "}", new StringBuilder("{\"code\":"));
    }

    public static String jpo(String str, boolean z10) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (jpo && !z10) {
            strSubstring = str.substring(1, str.length() - 1);
        } else {
            strSubstring = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return g.k(strConcat, ",", strSubstring, "}");
        }
        return o2.l(strConcat, "}");
    }

    public static String jpo() {
        return "";
    }

    public static void jpo(boolean z10) {
        jpo = z10;
    }
}
