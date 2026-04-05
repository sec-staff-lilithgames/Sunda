package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3352n2;
import com.ironsource.mediationsdk.d;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class uu {
    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, Double d10) {
        if (dtVar == null || dtVar.gy() == null) {
            return;
        }
        Map<String, Object> mapGy = dtVar.gy();
        try {
            Object obj = dtVar.gy().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapGy.get(C3352n2.A);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.sq.wqx().jpo(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.nmd.wqx("report Win error", new Object[0]);
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, Double d10, String str, String str2) {
        if (dtVar == null || dtVar.gy() == null) {
            return;
        }
        Map<String, Object> mapGy = dtVar.gy();
        try {
            Object obj = dtVar.gy().get(yFkbx.HulSMfL);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapGy.get(C3352n2.f37932z);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace(d.f37327n, String.valueOf(d10));
                }
                if (str != null) {
                    strReplace = strReplace.replace(d.f37325l, str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.sq.wqx().jpo(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.nmd.wqx("report Loss error", new Object[0]);
        }
    }
}
