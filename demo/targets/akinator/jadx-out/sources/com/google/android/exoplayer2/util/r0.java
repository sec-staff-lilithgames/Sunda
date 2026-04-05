package com.google.android.exoplayer2.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r0 {
    public static void disambiguate4gAnd5gNsa(Context context, t0 t0Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.checkNotNull((TelephonyManager) context.getSystemService("phone"));
            q0 q0Var = new q0(t0Var);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), q0Var);
            telephonyManager.unregisterTelephonyCallback(q0Var);
        } catch (RuntimeException unused) {
            t0.a(t0Var, 5);
        }
    }
}
