package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.C3271ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {
    public static boolean a(String str) {
        return (str.equals(C3271ic.f36943a) || str.equals("HEAD")) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals(C3271ic.f36944b) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
