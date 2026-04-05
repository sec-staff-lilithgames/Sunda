package com.mbridge.msdk.mbbid.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    public static void a(Context context, String str, String str2, String str3, String str4) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            e eVar = new e();
            eVar.a("result", 1);
            eVar.a("bidid", str2);
            eVar.a("bid_tk", str4);
            eVar.a("lrid", str3);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            d.b().b("2000064", eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            e eVar = new e();
            eVar.a("result", 2);
            eVar.a("lrid", str3);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("reason", str2);
            d.b().b("2000064", eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
