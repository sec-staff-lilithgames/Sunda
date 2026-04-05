package com.moloco.sdk.acm.http;

import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {
    public final l a(String str, String str2, String str3, String str4, String str5, String str6) {
        return new a(str4, str5, str3, str, str6, str2, 0);
    }

    public static final x0 a(String str, String str2, String str3, String str4, String str5, String str6, HeadersBuilder headersBuilder) {
        e0.checkNotNullParameter(headersBuilder, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("AppBundle/" + str + ';');
        }
        if (str2 != null) {
            sb2.append("AppVersion/" + str2 + ';');
        }
        if (str3 != null) {
            sb2.append("AppKey/" + str3 + ';');
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        if (str4 != null) {
            sb3.append("SdkVersion/" + str4 + ';');
        }
        if (str5 != null) {
            sb3.append("Mediator/" + str5 + ';');
        }
        String string2 = sb3.toString();
        e0.checkNotNullExpressionValue(string2, "toString(...)");
        StringBuilder sb4 = new StringBuilder("OS/Android;");
        if (str6 != null) {
            sb4.append("osv/" + str6 + ';');
        }
        String string3 = sb4.toString();
        e0.checkNotNullExpressionValue(string3, "toString(...)");
        headersBuilder.append("X-Moloco-App-Info", string);
        headersBuilder.append("X-Moloco-Device-Info", string3);
        headersBuilder.append("X-Moloco-SDK-Info", string2);
        return x0.f87415a;
    }
}
