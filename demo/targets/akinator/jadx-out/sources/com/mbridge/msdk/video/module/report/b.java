package com.mbridge.msdk.video.module.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import j1.o2;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f44884a = new HashMap<>();

    public static void a(String str) {
        f44884a.remove(str);
    }

    public static void b(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().e() == null) {
            return;
        }
        d.b().a("2000143", campaignEx);
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().e(), false, false);
    }

    public static void c(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().n() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().n(), false, false);
    }

    public static void d(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().k() == null) {
            return;
        }
        d.b().a("2000141", campaignEx);
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().k(), false, false);
    }

    public static void e(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m(), false, false);
    }

    public static void f(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().s() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().s(), false, false);
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().d() == null) {
            return;
        }
        String campaignUnitId = campaignEx.getCampaignUnitId();
        ArrayList<String> arrayList = f44884a.get(campaignUnitId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f44884a.put(campaignUnitId, arrayList);
        }
        if (arrayList.contains(campaignEx.getId())) {
            return;
        }
        try {
            d.b().a("2000142", campaignEx);
        } catch (Exception unused) {
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().d(), false, false);
        arrayList.add(campaignEx.getId());
    }

    public static void a(Context context, CampaignEx campaignEx, int i10, int i11) {
        try {
            String[] strArrH = campaignEx.getNativeVideoTracking().h();
            if (campaignEx.getNativeVideoTracking() == null || strArrH == null) {
                return;
            }
            String[] strArr = new String[strArrH.length];
            for (int i12 = 0; i12 < strArrH.length; i12++) {
                String str = strArrH[i12];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i10);
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = j0.b(string);
                }
                if (!TextUtils.isEmpty(string)) {
                    str = str + "&value=" + URLEncoder.encode(string);
                }
                strArr[i12] = campaignEx.getSpareOfferFlag() == 1 ? str + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i11 : str + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i11;
            }
            try {
                e eVar = new e();
                eVar.a("type", Integer.valueOf(i10));
                d.b().a("2000144", campaignEx, eVar);
                d.b().a("2000147", campaignEx, eVar);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
        } catch (Throwable unused2) {
            p0.b("VideoViewReport", "reportEndcardshowData error");
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i10, int i11, int i12) {
        String str;
        if (i11 == 0 || context == null || campaignEx == null) {
            return;
        }
        try {
            List<Map<Integer, String>> listO = campaignEx.getNativeVideoTracking().o();
            int i13 = ((i10 + 1) * 100) / i11;
            if (listO != null) {
                int i14 = 0;
                int i15 = 0;
                while (i14 < listO.size()) {
                    Map<Integer, String> map = listO.get(i14);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        int i16 = i14;
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            Integer key = next.getKey();
                            int iIntValue = key.intValue();
                            String value = next.getValue();
                            if (campaignEx.getSpareOfferFlag() == 1) {
                                str = value + PcrIk.nCfRGdUrnzjW + campaignEx.getCbt() + "&tmorl=" + i12;
                            } else {
                                str = value + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i12;
                            }
                            if (iIntValue <= i13 && !TextUtils.isEmpty(str)) {
                                String[] strArr = {str};
                                if (i15 < 1) {
                                    i15++;
                                    try {
                                        e eVar = new e();
                                        eVar.a("percent", key);
                                        d.b().a("2000140", campaignEx, eVar);
                                    } catch (Exception unused) {
                                    }
                                }
                                int i17 = i15;
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
                                it.remove();
                                listO.remove(i16);
                                i16--;
                                i15 = i17;
                            }
                        }
                        i14 = i16;
                    }
                    i14++;
                }
            }
        } catch (Throwable unused2) {
            p0.b("VideoViewReport", "reportPlayPercentageData error");
        }
    }

    public static void a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i10) {
        if (campaignEx == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i10 == key.intValue() && !TextUtils.isEmpty(value)) {
                        CampaignEx campaignEx2 = campaignEx;
                        String str2 = str;
                        com.mbridge.msdk.click.a.a(c.m().d(), campaignEx2, str2, value, false, false);
                        it.remove();
                        campaignEx = campaignEx2;
                        str = str2;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() == null || campaignEx.getAdUrlList().size() <= 0) {
                    return;
                }
                for (String str2 : campaignEx.getAdUrlList()) {
                    if (!TextUtils.isEmpty(str2)) {
                        CampaignEx campaignEx2 = campaignEx;
                        String str3 = str;
                        com.mbridge.msdk.click.a.a(c.m().d(), campaignEx2, str3, str2, false, false);
                        campaignEx = campaignEx2;
                        str = str3;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, String str3) {
        if (campaignEx == null || cVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.video.module.request.b bVar = new com.mbridge.msdk.video.module.request.b(c.m().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            eVar.a("user_id", j0.b(str2));
            eVar.a("cb_type", "1");
            eVar.a(CampaignEx.JSON_KEY_REWARD_NAME, cVar.c());
            eVar.a(CampaignEx.JSON_KEY_REWARD_AMOUNT, cVar.a() + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("click_id", campaignEx.getRequestIdNotice());
            if (!TextUtils.isEmpty(str3)) {
                eVar.a("extra", str3);
            }
            bVar.addExtraParams("", eVar);
            String strA = a(campaignEx.getHost() + "/addReward?", eVar);
            StringBuilder sb2 = new StringBuilder("rewardUrl:");
            sb2.append(strA);
            p0.b("VideoViewReport", sb2.toString());
            com.mbridge.msdk.click.a.a(c.m().d(), campaignEx, campaignEx.getCampaignUnitId(), strA, false, false);
        } catch (Throwable th2) {
            p0.b("VideoViewReport", th2.getMessage(), th2);
        }
    }

    private static String a(String str, com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        if (eVar != null) {
            String strTrim = eVar.b().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (!str.endsWith("?") && !str.endsWith(C3191e4.i.f36527c)) {
                    str = str.concat(str.contains("?") ? C3191e4.i.f36527c : "?");
                }
                return o2.l(str, strTrim);
            }
            return "";
        }
        return "";
    }
}
