package com.bytedance.sdk.component.adexpress.dynamic.jd;

import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.bytedance.sdk.component.adexpress.dynamic.cm.qk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static int jpo(qk qkVar) {
        if (qkVar == null) {
            return 0;
        }
        String strDm = qkVar.dm();
        String strHmu = qkVar.hmu();
        if (TextUtils.isEmpty(strHmu) || TextUtils.isEmpty(strDm) || !strHmu.equals(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME)) {
            return 0;
        }
        if (strDm.equals("shake")) {
            return 2;
        }
        if (strDm.equals("twist")) {
            return 3;
        }
        return strDm.equals("slide") ? 1 : 0;
    }
}
