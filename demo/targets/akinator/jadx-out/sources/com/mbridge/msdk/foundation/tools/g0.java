package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f41123a;

    public static synchronized ConnectivityManager a() {
        try {
        } catch (Exception e10) {
            p0.b("NetManager", e10.getMessage());
        }
        if (f41123a != null || com.mbridge.msdk.foundation.controller.c.m().d() == null) {
        } else {
            f41123a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().d().getSystemService("connectivity");
        }
        return f41123a;
    }
}
