package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class z0 {
    public static boolean a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str);
    }

    public static boolean b(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str)) ? false : true;
    }
}
