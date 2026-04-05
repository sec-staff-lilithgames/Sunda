package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n1 {
    public static String a(String str) {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        UnitDisplayType unitDisplayType3;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        HashMap map = iAConfigManager.f23206a;
        com.fyber.inneractive.sdk.config.q0 q0Var = (map == null || !map.containsKey(str)) ? null : (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f23206a.get(str);
        UnitDisplayType unitDisplayType4 = UnitDisplayType.BANNER;
        if (q0Var == null) {
            return unitDisplayType4.name().toLowerCase(Locale.US);
        }
        for (int i10 = 0; i10 < q0Var.f23341a.size(); i10++) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f23341a.get(i10);
            if (r0Var != null && ((l0Var = r0Var.f23345c) != null || r0Var.f23348f != null || r0Var.f23347e != null)) {
                if (l0Var == null || (unitDisplayType3 = l0Var.f23330b) == null || unitDisplayType3.isDeprecated() || UnitDisplayType.DEFAULT == unitDisplayType3) {
                    com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f23348f;
                    if (t0Var != null && (unitDisplayType2 = t0Var.f23408j) != null && !unitDisplayType2.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType2) {
                        unitDisplayType4 = r0Var.f23348f.f23408j;
                    } else if (r0Var.f23347e != null && (unitDisplayType = UnitDisplayType.NATIVE) != null && !unitDisplayType.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType) {
                        r0Var.f23347e.getClass();
                        unitDisplayType4 = unitDisplayType;
                    }
                } else {
                    unitDisplayType4 = r0Var.f23345c.f23330b;
                }
                if (UnitDisplayType.MRECT == unitDisplayType4) {
                    unitDisplayType4 = UnitDisplayType.BANNER;
                }
                if (UnitDisplayType.REWARDED == unitDisplayType4 || UnitDisplayType.INTERSTITIAL == unitDisplayType4 || UnitDisplayType.BANNER == unitDisplayType4 || UnitDisplayType.NATIVE == unitDisplayType4) {
                    return unitDisplayType4.name().toLowerCase(Locale.US);
                }
            }
        }
        return UnitDisplayType.BANNER.name().toLowerCase(Locale.US);
    }
}
