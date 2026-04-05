package com.mbridge.msdk.util;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f44146a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f44147b;

    public static boolean a() {
        if (f44146a == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2;
                f44146a = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonUtils", "isChina", e10);
                }
            }
        }
        return f44146a != null && f44146a.booleanValue();
    }

    public static boolean b() {
        if (f44147b == null) {
            try {
                boolean z10 = Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1;
                f44147b = Boolean.valueOf(z10);
                return z10;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonUtils", "isOversea", e10);
                }
            }
        }
        return f44147b != null && f44147b.booleanValue();
    }
}
