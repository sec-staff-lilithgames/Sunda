package com.mbridge.msdk.video.module.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {
    public static void a(String str, CampaignEx campaignEx, e eVar) {
        String strA;
        String strA2;
        if (TextUtils.isEmpty(str) || campaignEx == null || eVar == null) {
            return;
        }
        try {
            String mof_template_url = campaignEx.getMof_template_url();
            String strA3 = "";
            if (TextUtils.isEmpty(mof_template_url)) {
                strA = "";
                strA2 = strA;
            } else {
                strA2 = b1.a(mof_template_url, "cltp");
                strA = b1.a(mof_template_url, "xt");
            }
            if (!TextUtils.isEmpty(strA2)) {
                eVar.a("cltp", strA2);
            }
            if (!TextUtils.isEmpty(strA)) {
                eVar.a("xt", strA);
            }
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                String strE = rewardTemplateMode.e();
                if (!TextUtils.isEmpty(strE)) {
                    strA3 = b1.a(strE, "alecfc");
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                eVar.a("alecfc", strA3);
            }
            d.b().a(str, campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
