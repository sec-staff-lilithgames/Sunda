package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.m().d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb2.append(C3191e4.i.f36527c);
                        sb2.append(str);
                        sb2.append(C3191e4.i.f36525b);
                        sb2.append(str2);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b(TAG, e10.getMessage());
                }
                sb2 = null;
            }
            if (sb2 != null && sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.h<?> createRequest(int i10, int i11, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (i10 == 0) {
            return new k(i11, str, str2, j10, new i(bVar));
        }
        if (i10 != 1) {
            return null;
        }
        return new com.mbridge.msdk.tracker.network.i(i11, str, str2, j10, new i(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: Exception -> 0x00c3, TRY_ENTER, TryCatch #1 {Exception -> 0x00c3, blocks: (B:31:0x0097, B:33:0x009d, B:37:0x00a8, B:43:0x00cb, B:45:0x00e8), top: B:84:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.mbridge.msdk.tracker.network.h, com.mbridge.msdk.tracker.network.t] */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.mbridge.msdk.tracker.network.u] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x018a -> B:83:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01ca -> B:83:0x01e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void post(int r11, java.lang.String r12, com.mbridge.msdk.foundation.same.net.wrapper.e r13, com.mbridge.msdk.foundation.same.net.b r14, boolean r15, boolean r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.wrapper.c.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.wrapper.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar == null) {
            p0.b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String strA = Aa.a();
        if (strA == null) {
            strA = "";
        }
        eVar.a("channel", strA);
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a("open", com.mbridge.msdk.foundation.same.a.S);
        if (com.mbridge.msdk.util.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String strB = Aa.b();
            if (!TextUtils.isEmpty(strB)) {
                eVar.a("keyword", strB);
            }
        }
        String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), str2);
            if (lVarE != null && !TextUtils.isEmpty(lVarE.a())) {
                eVar.a("u_stid", lVarE.a());
            }
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
    }

    public boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i10, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j10) {
        e eVar2;
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
        int iP0 = TextUtils.isEmpty(str) ? gVarB.p0() : gVarB.B();
        String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iP0);
        if (iP0 < 2) {
            postV5(i10, strA, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
            return;
        }
        if (iP0 % 2 == 0) {
            if (eVar == null) {
                eVar = new e();
            }
            eVar2 = eVar;
            JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (jSONArrayB != null) {
                String string = jSONArrayB.toString();
                int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                if (i11 > 0 && string.length() > i11) {
                    post(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                    return;
                }
                eVar2.a(e.f40879k, string);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i10, strA, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
    }

    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        get(i10, str, eVar, bVar, false, false, str2, j10);
    }

    public void getCampaign(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j10) {
        e eVar2;
        try {
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
            int iP0 = TextUtils.isEmpty(str) ? gVarB.p0() : gVarB.B();
            String strA = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, iP0);
            if (iP0 < 2) {
                postV5(i10, strA, eVar, bVar, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                return;
            }
            if (iP0 % 2 == 0) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar2 = eVar;
                JSONArray jSONArrayB = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (jSONArrayB != null) {
                    String string = jSONArrayB.toString();
                    int i11 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                    if (i11 > 0 && string.length() > i11) {
                        post(i10, strA, eVar2, bVar, true, false, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
                        return;
                    }
                    eVar2.a(e.f40879k, string);
                }
            } else {
                eVar2 = eVar;
            }
            get(i10, strA, eVar2, bVar, true, true, MBInterstitialActivity.INTENT_CAMAPIGN, j10);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(TAG, e10.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        getLoadOrSetting(i10, str, eVar, bVar, true, str2, j10);
    }

    public void postFocusReport(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, true, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }

    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, boolean z11, String str2, long j10) {
        if (eVar == null) {
            try {
                eVar = new e();
            } catch (Exception e10) {
                p0.a(TAG, e10.getMessage());
            }
        }
        addExtraParams(str, eVar);
        f.k(eVar);
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, SameMD5.getMD5(str3 + jCurrentTimeMillis));
        } else {
            eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, SameMD5.getMD5(jCurrentTimeMillis + str3));
        }
        com.mbridge.msdk.foundation.same.net.e eVarA = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar);
        if (eVarA != null && bVar != null) {
            bVar.onSuccess(eVarA);
            return;
        }
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f40851i) && com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("uri", com.mbridge.msdk.foundation.same.net.utils.d.h().f40855m + Uri.parse(str).getPath());
                    jSONObject.put("data", eVar.b());
                } catch (Throwable th2) {
                    p0.b(TAG, th2.getMessage());
                }
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().f40855m, com.mbridge.msdk.foundation.same.net.utils.d.h().f40859q, jSONObject.toString(), true, bVar);
                return;
            } catch (Throwable th3) {
                p0.b(TAG, th3.getMessage());
            }
        }
        StringBuilder sbT = a.b.t(str, "?");
        sbT.append(eVar.toString());
        String string = sbT.toString();
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
        if (string.length() >= gVarB.m0() && string.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f40851i)) {
            post(i10, str, eVar, bVar, z11, false, str2, j10);
            return;
        }
        e eVar2 = eVar;
        if (string.length() >= gVarB.L() && z10) {
            post(i10, str, eVar2, bVar, z11, false, str2, j10);
            return;
        }
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest = createRequest(i10, 0, str, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            if (eVar2.a() != null) {
                String str4 = eVar2.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                hVarCreateRequest.a("local_id", str4);
                String str5 = eVar2.a().get("ad_type");
                hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
                hVarCreateRequest.a(eVar2.a());
            }
            hVarCreateRequest.d(canTrack());
            com.mbridge.msdk.tracker.network.l.a().b().a(hVarCreateRequest);
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        get(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j10) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", jCurrentTimeMillis + "");
        eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, SameMD5.getMD5(jCurrentTimeMillis + str3));
        post(i10, str, eVar, bVar, z10, false, str2, j10);
    }

    public void get(int i10, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("app_id", com.mbridge.msdk.foundation.controller.c.m().b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put(Q6.H, "1");
        String strAsUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(strAsUrlParams)) {
            str = w0.i.d(str, "?", strAsUrlParams);
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            com.google.android.gms.internal.play_billing.a.D("get wx scheme url = ", str3, "AppletsModel");
        }
        com.mbridge.msdk.tracker.network.h<?> hVarCreateRequest = createRequest(i10, 0, str3, bVar, str2, j10);
        if (hVarCreateRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            hVarCreateRequest.a("local_id", str4);
            String str5 = map.get("ad_type");
            hVarCreateRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            hVarCreateRequest.a(map);
            hVarCreateRequest.d(canTrack());
            com.mbridge.msdk.tracker.network.l.a().b().a(hVarCreateRequest);
        }
    }

    public void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j10) {
        post(i10, str, eVar, bVar, false, false, str2, j10);
    }
}
