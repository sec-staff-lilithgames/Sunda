package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.C3119a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hmu {
    public static String jpo(Context context) {
        int iJpo = com.bytedance.sdk.component.utils.se.jpo(context, 0L);
        return iJpo != 2 ? iJpo != 3 ? iJpo != 4 ? iJpo != 5 ? iJpo != 6 ? DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY : "5g" : "4g" : C3119a4.f35922b : C3119a4.f35921a : "2g";
    }
}
