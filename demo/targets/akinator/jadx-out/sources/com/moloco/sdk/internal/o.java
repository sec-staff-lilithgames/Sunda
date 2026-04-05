package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class o {
    public static /* synthetic */ void a(HeadersBuilder headersBuilder, String str, String str2, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mediationInfo = null;
        }
        a(headersBuilder, str, str2, mediationInfo);
    }

    public static final void a(HeadersBuilder headersBuilder, String str, String str2, MediationInfo mediationInfo) {
        e0.checkNotNullParameter(headersBuilder, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("MolocoSDK/" + str + ';');
        }
        if (mediationInfo != null) {
            sb2.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str2 != null) {
            sb2.append("Android/" + str2 + ';');
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        headersBuilder.append("X-Moloco-User-Agent", string);
    }
}
