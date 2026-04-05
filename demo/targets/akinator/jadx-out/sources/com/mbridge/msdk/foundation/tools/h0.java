package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h0 {
    public static boolean a(int i10) {
        return (i10 == -1 || ((-16777216) & i10) == 0 || (i10 & 16711680) == 0) ? false : true;
    }

    public static int a(Context context, String str, String str2) {
        String packageName = "";
        try {
            try {
                packageName = com.mbridge.msdk.foundation.controller.c.m().h();
            } catch (Exception unused) {
                p0.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (z0.a(packageName) && context != null) {
                packageName = context.getPackageName();
            }
            if (z0.a(packageName) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            com.google.android.gms.internal.play_billing.a.v("Resource not found resName:", str, "ResourceUtil");
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e10) {
                p0.b("ResourceUtil", "Resource error:" + e10.getMessage());
            }
        }
        return null;
    }
}
