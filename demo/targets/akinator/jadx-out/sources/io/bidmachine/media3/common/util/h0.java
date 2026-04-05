package io.bidmachine.media3.common.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h0 {
    public static void disambiguate4gAnd5gNsa(Context context, k0 k0Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.checkNotNull((TelephonyManager) context.getSystemService("phone"));
            g0 g0Var = new g0(k0Var);
            telephonyManager.registerTelephonyCallback(k0Var.f60732a, g0Var);
            telephonyManager.unregisterTelephonyCallback(g0Var);
        } catch (RuntimeException unused) {
            k0Var.a(5);
        }
    }
}
