package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import pw.l;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        e0.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strHex = l.of(Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        e0.checkNotNullExpressionValue(strHex, "bytes.sha256().hex()");
        return strHex;
    }

    public static final String guessMimeType(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
