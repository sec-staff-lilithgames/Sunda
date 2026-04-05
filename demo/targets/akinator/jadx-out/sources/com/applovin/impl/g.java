package com.applovin.impl;

import android.content.Context;
import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.k kVar) {
        String strB = d.b(appLovinFullscreenActivity);
        String strA = d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z10 = false;
        boolean z11 = StringUtils.isValidString(strB) && !strB.equals(packageName);
        if (StringUtils.isValidString(strA) && !strA.equals(packageName)) {
            z10 = true;
        }
        if (z11 || z10) {
            Map mapA = e2.a((AppLovinAdImpl) bVar);
            mapA.put("activity_task_affinity_mismatch", String.valueOf(z11));
            mapA.put("base_activity_task_affinity_mismatch", String.valueOf(z10));
            kVar.E().a(c2.f13732q0, "taskAffinityMismatch", mapA);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.k kVar) {
        if (bVar == null) {
            return;
        }
        boolean zA = s.a(bVar);
        boolean zA2 = a(bVar.getContext());
        if (zA2 || zA) {
            Map mapA = e2.a((AppLovinAdImpl) bVar.getCurrentAd());
            mapA.put("can_draw_overlays", String.valueOf(zA2));
            mapA.put("is_ad_view_overlaid", String.valueOf(zA));
            kVar.E().a(c2.f13732q0, "overlayViolation", mapA);
        }
    }

    private static boolean a(Context context) {
        if (o0.f()) {
            return Settings.canDrawOverlays(context);
        }
        return o0.a("android.permission.SYSTEM_ALERT_WINDOW", context);
    }
}
