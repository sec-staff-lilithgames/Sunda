package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c extends b {

    /* renamed from: j, reason: collision with root package name */
    private static volatile c f40407j;

    private c() {
        h();
    }

    public static void c(boolean z10) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (f40407j == null) {
            synchronized (c.class) {
                try {
                    if (f40407j == null) {
                        f40407j = new c();
                    }
                } finally {
                }
            }
        }
        return f40407j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = h.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.t0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.s0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.u0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z10;
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
            z10 = true;
        } else {
            z10 = false;
        }
        int iH0 = gVarF.h0();
        boolean z11 = iH0 != 0 ? iH0 == 1 && a(gVarF, str) == 1 : a(str) == 1 && a(gVarF, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z11 = a(str) == 1;
        }
        return (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) ? (gVarF.E0() || z10 || a(str) != 1) ? false : true : z11;
    }
}
