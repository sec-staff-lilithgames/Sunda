package com.mbridge.msdk.foundation.same;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);
    }

    public static long a(long j10, long j11) {
        return j10 >= 0 ? j10 : j11;
    }

    public static String b(List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null && campaignEx.getCreativeId() != 0) {
                arrayList.add(campaignEx);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                CampaignEx campaignEx2 = (CampaignEx) arrayList.get(i10);
                if (campaignEx2 != null) {
                    long creativeId = campaignEx2.getCreativeId();
                    if (i10 == arrayList.size() - 1) {
                        sb2.append(creativeId);
                    } else {
                        sb2.append(creativeId);
                        sb2.append(",");
                    }
                }
            } catch (Exception e10) {
                p0.b("SameCommon", "getCreativeID", e10);
            }
        }
        return sb2.toString();
    }

    public static boolean a(Context context, CampaignEx campaignEx) {
        if (context == null || campaignEx == null) {
            return false;
        }
        boolean zC = u0.c(context, campaignEx.getPackageName());
        boolean zC2 = u0.c(campaignEx);
        return campaignEx.getWtick() == 1 || (zC2 && zC) || !(zC2 || zC);
    }

    public static void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, a aVar) {
        a(campaignEx, context, cVar, aVar, 1);
    }

    public static void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, a aVar, int i10) {
        int i11;
        if (campaignEx == null || aVar == null) {
            return;
        }
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean zC = u0.c(campaignEx);
        int iD = u0.d(context, campaignEx.getPackageName());
        if (context != null) {
            try {
                i11 = f.b(context) ? 1 : 2;
            } catch (Exception e11) {
                p0.b("SameCommon", e11.getMessage());
            }
        } else {
            i11 = 0;
        }
        e eVar = new e();
        eVar.a(BidResponsedEx.KEY_CID, campaignEx.getId());
        eVar.a(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
        eVar.a(CampaignEx.JSON_KEY_RETARGET_OFFER, Integer.valueOf(campaignEx.getRetarget_offer()));
        eVar.a("ind", Integer.valueOf(iD));
        eVar.a(C3191e4.h.f36503q, Integer.valueOf(i10));
        eVar.a(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, 0);
        eVar.a("per", Integer.valueOf(i11));
        if (zC) {
            if (iD != 1) {
                cVar.a("m_campaign_filtered", eVar);
                aVar.a("m_campaign_filtered", cVar);
            }
            cVar.a("m_campaign_ind_retarget", eVar);
            aVar.a("m_campaign_ind_retarget", cVar);
            return;
        }
        if (iD == 1) {
            cVar.a("m_campaign_filtered", eVar);
            aVar.a("m_campaign_filtered", cVar);
        }
        cVar.a("m_campaign_ind_unretarget", eVar);
        aVar.a("m_campaign_ind_unretarget", cVar);
    }

    public static boolean b(Context context, CampaignEx campaignEx) {
        if (context == null || campaignEx == null) {
            return false;
        }
        return u0.c(campaignEx) || campaignEx.getWtick() == 1 || !u0.c(context, campaignEx.getPackageName());
    }

    public static byte[] b(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length != 4) {
                return null;
            }
            byte[] bArr = new byte[4];
            for (int i10 = 0; i10 < 4; i10++) {
                int i11 = Integer.parseInt(strArrSplit[i10]);
                if (i11 >= 0 && i11 <= 255) {
                    bArr[i10] = (byte) i11;
                }
                return null;
            }
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : str.split(C3191e4.i.f36527c)) {
                String[] strArrSplit = str2.split(C3191e4.i.f36525b);
                String str3 = "";
                if (strArrSplit.length == 2) {
                    String str4 = strArrSplit[0];
                    if (!TextUtils.isEmpty(str4)) {
                        String str5 = strArrSplit[1];
                        if (str5 != null) {
                            str3 = str5;
                        }
                        jSONObject.put(str4, str3);
                    }
                } else if (strArrSplit.length == 1) {
                    String str6 = strArrSplit[0];
                    if (!TextUtils.isEmpty(str6)) {
                        jSONObject.put(str6, "");
                    }
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            p0.a("SameCommon", "coverReportMessage", e10);
            return null;
        } catch (Throwable th2) {
            p0.a("SameCommon", "coverReportMessage", th2);
            return null;
        }
    }

    public static String a(List<CampaignEx> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    CampaignEx campaignEx = list.get(i10);
                    if (campaignEx != null) {
                        String id2 = campaignEx.getId();
                        if (i10 == list.size() - 1) {
                            sb2.append(id2);
                        } else {
                            sb2.append(id2);
                            sb2.append(",");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return sb2.toString();
        }
        return "";
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 != -1) {
                    sb2.append(new String(bArr, 0, i10));
                } else {
                    return sb2.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
