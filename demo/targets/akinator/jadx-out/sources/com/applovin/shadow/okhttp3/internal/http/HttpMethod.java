package com.applovin.shadow.okhttp3.internal.http;

import bp.oM.DwaEpyvxz;
import com.ironsource.C3271ic;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean requiresRequestBody(String method) {
        e0.checkNotNullParameter(method, "method");
        return e0.areEqual(method, C3271ic.f36944b) || e0.areEqual(method, "PUT") || e0.areEqual(method, "PATCH") || e0.areEqual(method, "PROPPATCH") || e0.areEqual(method, "REPORT");
    }

    public final boolean invalidatesCache(String method) {
        e0.checkNotNullParameter(method, "method");
        return e0.areEqual(method, C3271ic.f36944b) || e0.areEqual(method, "PATCH") || e0.areEqual(method, "PUT") || e0.areEqual(method, "DELETE") || e0.areEqual(method, "MOVE");
    }

    public final boolean redirectsToGet(String method) {
        e0.checkNotNullParameter(method, "method");
        return !e0.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        e0.checkNotNullParameter(method, "method");
        return e0.areEqual(method, "PROPFIND");
    }

    public static final boolean permitsRequestBody(String method) {
        e0.checkNotNullParameter(method, "method");
        return (e0.areEqual(method, DwaEpyvxz.pcDrHwbOfQZmn) || e0.areEqual(method, "HEAD")) ? false : true;
    }
}
