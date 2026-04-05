package com.mbridge.msdk.video.dynview.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {
    public static int a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 1;
        }
        return campaignEx.getRewardTemplateMode().b();
    }

    public static int b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 100;
        }
        int iF = campaignEx.getRewardTemplateMode().f();
        if (iF == 302 || iF == 802 || iF == 902) {
            return -3;
        }
        if (iF != 904) {
            return 100;
        }
        return !a(campaignEx.getRewardTemplateMode().e()) ? -1 : -3;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static String a(long j10, Context context) {
        String strP = l0.p(context);
        if (strP.startsWith("zh")) {
            if (!strP.contains("TW") && !strP.contains("HK")) {
                return j10 + " 秒后自动播放";
            }
            return j10 + " 秒後自動播放";
        }
        if (strP.startsWith("ja")) {
            return j10 + " 秒後自動的に再生 ";
        }
        if (strP.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return o2.n(j10, "Automatische Wiedergabe nach ", " Sekunden");
        }
        if (strP.startsWith("ko")) {
            return j10 + " 초 후 자동 재생 ";
        }
        if (strP.startsWith("fr")) {
            return o2.n(j10, "Lecture de vidéo dans ", " secondes");
        }
        if (strP.startsWith("ar")) {
            return o2.n(j10, " ثوان", "لعب تلقائيا بعد ");
        }
        if (strP.startsWith("ru")) {
            return o2.n(j10, "Автовоспроизведение через ", " секунд");
        }
        return o2.n(j10, "Auto play after ", " s");
    }

    public static String a(Context context, int i10) {
        String str;
        if (i10 == 1) {
            str = "_por";
        } else {
            str = "_land";
        }
        String strP = l0.p(context);
        if (strP.startsWith("zh")) {
            if (!strP.contains("TW") && !strP.contains("HK")) {
                return "mbridge_reward_two_title_zh";
            }
            return "mbridge_reward_two_title_zh_trad";
        }
        if (strP.startsWith("ja")) {
            return "mbridge_reward_two_title_japan".concat(str);
        }
        if (strP.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany".concat(str);
        }
        if (strP.startsWith("ko")) {
            return "mbridge_reward_two_title_korea".concat(str);
        }
        if (strP.startsWith("fr")) {
            return "mbridge_reward_two_title_france".concat(str);
        }
        if (strP.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia".concat(str);
        }
        if (strP.startsWith("ru")) {
            return "mbridge_reward_two_title_russian".concat(str);
        }
        return "mbridge_reward_two_title_en".concat(str);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("alecfc");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (queryParameter.equals("1")) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }
}
