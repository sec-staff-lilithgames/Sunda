package com.mbridge.msdk.reward.candidate;

import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.cache.d;
import com.mbridge.msdk.foundation.controller.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private d f42445a;

    public a(String str, boolean z10) {
        try {
            this.f42445a = b.a().b(str, com.mbridge.msdk.videocommon.setting.b.b().a(c.m().b(), str, z10).B());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(List<CampaignEx> list, String str, com.mbridge.msdk.reward.adapter.c cVar, String str2) {
        try {
            if (this.f42445a == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f42445a.a(com.mbridge.msdk.foundation.cache.a.f40338f, 2, list, this.f42445a.a(list, str) > 0, "", "", -1, str2);
            d dVar = this.f42445a;
            JSONObject jSONObjectC = dVar.c(dVar.d(str));
            if (jSONObjectC == null || this.f42445a.b(str) <= 0.0d) {
                return;
            }
            a(this.f42445a.a(jSONObjectC.optInt("max_usage_limit", 10), 0L), jSONObjectC, jSONObjectC.optInt("max_cache_num", 20), -1.0d, cVar, new com.mbridge.msdk.foundation.same.report.metrics.c(), str, false, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public com.mbridge.msdk.foundation.cache.c a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, CampaignEx campaignEx, com.mbridge.msdk.foundation.error.b bVar, int i10, com.mbridge.msdk.reward.adapter.c cVar2) {
        String requestId;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                try {
                    requestId = campaignEx.getRequestId();
                } catch (Exception unused) {
                    cVar3.d("getRewardCandidateCampaignList result exception");
                    cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                    return cVar3;
                }
            } catch (Exception unused2) {
                cVar3.d("getCandidateCampaignList result exception");
                cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                return cVar3;
            }
        }
        return a(str, cVar, requestId, bVar, i10, cVar2);
    }

    private com.mbridge.msdk.foundation.cache.c a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str2, com.mbridge.msdk.foundation.error.b bVar, int i10, com.mbridge.msdk.reward.adapter.c cVar2) throws NumberFormatException {
        String strG;
        int i11;
        String str3;
        if (bVar != null) {
            int iC = bVar.c();
            strG = bVar.g();
            i11 = iC;
        } else {
            strG = null;
            i11 = 0;
        }
        String str4 = strG;
        d dVar = this.f42445a;
        if (dVar == null) {
            com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
            cVar3.d("can not get manager");
            cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
            return cVar3;
        }
        com.mbridge.msdk.foundation.cache.c cVarA = dVar.a(str);
        if (cVarA.g() > com.mbridge.msdk.foundation.cache.c.f40357j) {
            return cVarA;
        }
        String[] strArrSplit = j0.a(str.split("_")[3]).split("\\|");
        double d10 = Double.parseDouble(strArrSplit[0]);
        if (strArrSplit.length > 1) {
            str3 = strArrSplit[1];
        } else {
            str3 = "";
        }
        com.mbridge.msdk.foundation.cache.c cVarA2 = a(d10, str3, cVar2, cVar, str, i10);
        this.f42445a.a(cVarA2.c(), cVar, str2, i11, str4, i10, d10);
        return cVarA2;
    }

    private com.mbridge.msdk.foundation.cache.c a(double d10, String str, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar2, String str2, int i10) {
        com.mbridge.msdk.foundation.cache.c cVarA = this.f42445a.a();
        try {
            if (cVarA.g() > 0) {
                return cVarA;
            }
            JSONObject jSONObjectC = this.f42445a.c(str);
            try {
                if (jSONObjectC != null) {
                    int iOptInt = jSONObjectC.optInt("max_usage_limit", 10);
                    int iOptInt2 = jSONObjectC.optInt("max_cache_num", 20);
                    if (iOptInt2 > 0) {
                        long j10 = 8640000;
                        long jOptLong = jSONObjectC.optLong("show_interval_time", 8640000L);
                        if (jOptLong != 0) {
                            j10 = jOptLong;
                        }
                        List<com.mbridge.msdk.foundation.cache.b> listA = this.f42445a.a(iOptInt, System.currentTimeMillis() - (j10 * 1000));
                        if (listA != null && listA.size() > 0) {
                            return a(listA, jSONObjectC, iOptInt2, d10, cVar, cVar2, str2, true, i10);
                        }
                        cVarA.d("no cache");
                        cVarA.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                        a(cVar2, str2, cVarA, (List<a.b>) null, jSONObjectC, 2);
                        return cVarA;
                    }
                    cVarA.d("max cache num error");
                    cVarA.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                    return cVarA;
                }
                cVarA.d("setting config not mapping");
                cVarA.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                return cVarA;
            } catch (Exception unused) {
                cVarA.d("getHighestCampaigns exception");
                cVarA.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                return cVarA;
            }
        } catch (Exception unused2) {
        }
    }

    private com.mbridge.msdk.foundation.cache.c a(List<com.mbridge.msdk.foundation.cache.b> list, JSONObject jSONObject, int i10, double d10, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar2, String str, boolean z10, int i11) {
        List<com.mbridge.msdk.foundation.cache.b> list2;
        int i12;
        int i13;
        List<com.mbridge.msdk.foundation.cache.b> listA = list;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        if (jSONObject == null) {
            cVar3.d("config is null");
            cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
            return cVar3;
        }
        if (listA != null && listA.size() != 0) {
            for (int i14 = 0; i14 < listA.size(); i14++) {
                com.mbridge.msdk.foundation.cache.b bVar = listA.get(i14);
                if (bVar != null) {
                    cVar3.a(bVar.e());
                }
            }
            if (listA.size() > 0 && ((listA = a(listA, cVar3)) == null || listA.size() == 0)) {
                cVar3.d("existed");
                cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
            }
            if (listA.size() > 0 && ((listA = a(listA, cVar, cVar3)) == null || listA.size() == 0)) {
                cVar3.d("not ready");
                cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
            }
            ArrayList arrayList = null;
            if (listA != null && listA.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                double dOptDouble = jSONObject.optDouble("t_disc", 0.8d);
                double dOptDouble2 = jSONObject.optDouble("u_disc", 0.95d);
                double dOptDouble3 = jSONObject.optDouble("max_ecppv_diff", 0.0d);
                int iOptInt = jSONObject.optInt("time_interval", 1800);
                int size = listA.size();
                double d11 = 0.0d;
                com.mbridge.msdk.foundation.cache.b bVar2 = null;
                int i15 = 0;
                while (i15 < size) {
                    com.mbridge.msdk.foundation.cache.b bVar3 = listA.get(i15);
                    if (bVar3 != null) {
                        i13 = i15;
                        list2 = listA;
                        i12 = iOptInt;
                        double dPow = Math.pow(dOptDouble2, bVar3.f()) * Math.pow(dOptDouble, (System.currentTimeMillis() - bVar3.h()) / (iOptInt * 1000.0d)) * bVar3.b();
                        arrayList2.add(new a.b(dPow, bVar3));
                        if (dPow >= d10 - dOptDouble3 && dPow > d11) {
                            d11 = dPow;
                            bVar2 = bVar3;
                        }
                    } else {
                        list2 = listA;
                        i12 = iOptInt;
                        i13 = i15;
                    }
                    i15 = i13 + 1;
                    listA = list2;
                    iOptInt = i12;
                }
                d dVar = this.f42445a;
                if (dVar != null) {
                    dVar.a(arrayList2, i10);
                }
                if (bVar2 != null) {
                    cVar3.a(bVar2.a());
                    cVar3.a(com.mbridge.msdk.foundation.cache.c.f40359l);
                } else {
                    cVar3.d("no match campaign");
                    cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                }
                arrayList = arrayList2;
            }
            if (z10) {
                a(cVar2, str, cVar3, arrayList, jSONObject, 2);
            }
            return cVar3;
        }
        cVar3.d("candidate is null");
        cVar3.a(com.mbridge.msdk.foundation.cache.c.f40358k);
        return cVar3;
    }

    private List<com.mbridge.msdk.foundation.cache.b> a(List<com.mbridge.msdk.foundation.cache.b> list, com.mbridge.msdk.foundation.cache.c cVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.foundation.cache.b bVar = list.get(i10);
            if (bVar != null && (copyOnWriteArrayListA = bVar.a()) != null && copyOnWriteArrayListA.size() != 0) {
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 >= copyOnWriteArrayListA.size()) {
                        break;
                    }
                    CampaignEx campaignEx = copyOnWriteArrayListA.get(i11);
                    boolean zC = u0.c(c.m().d(), campaignEx.getPackageName());
                    if (zC) {
                        cVar.b(bVar.e());
                        d dVar = this.f42445a;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                        z10 = zC;
                    } else {
                        i11++;
                        z10 = zC;
                    }
                }
                if (!z10) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.foundation.cache.b> a(List<com.mbridge.msdk.foundation.cache.b> list, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.cache.c cVar2) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.foundation.cache.b bVar = list.get(i10);
            if (bVar != null && (copyOnWriteArrayListA = bVar.a()) != null && copyOnWriteArrayListA.size() != 0) {
                int i11 = 0;
                boolean zA = false;
                while (true) {
                    if (i11 >= copyOnWriteArrayListA.size()) {
                        break;
                    }
                    CampaignEx campaignEx = copyOnWriteArrayListA.get(i11);
                    if (cVar == null || (zA = cVar.a(copyOnWriteArrayListA, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())))) {
                        i11++;
                    } else {
                        cVar2.c(bVar.e());
                        d dVar = this.f42445a;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                    }
                }
                if (zA) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean a(String str) {
        JSONObject jSONObjectC;
        try {
            d dVar = this.f42445a;
            if (dVar != null && (jSONObjectC = dVar.c(dVar.d(str))) != null) {
                return jSONObjectC.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    public void a(String str, String str2, int i10, String str3) {
        d dVar = this.f42445a;
        if (dVar != null) {
            dVar.a(str, str2, i10, str3);
        }
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.cache.c cVar2, List<a.b> list, JSONObject jSONObject, int i10) {
        String str2;
        try {
            e eVar = new e();
            if (i10 == 1) {
                str2 = "cb";
            } else if (i10 == 2) {
                str2 = "candidate";
            } else if (i10 != 3) {
                str2 = "unknown";
            } else {
                str2 = "track";
            }
            eVar.a("scene", str2);
            d dVar = this.f42445a;
            if (dVar != null) {
                double dB = dVar.b(str);
                if (dB >= 0.0d) {
                    eVar.a("bp", j0.b(dB + ""));
                }
                eVar.a("cb_state", a(str) ? "open" : "close");
                try {
                    d dVar2 = this.f42445a;
                    JSONObject jSONObjectC = dVar2.c(dVar2.d(str));
                    if (jSONObjectC != null) {
                        eVar.a(DTBMetricsConfiguration.CONFIG_DIR, jSONObjectC.toString());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (cVar2 != null) {
                if (cVar2.g() == com.mbridge.msdk.foundation.cache.c.f40359l) {
                    eVar.a("result", 1);
                } else {
                    eVar.a("result", 2);
                    eVar.a("reason", cVar2.e());
                }
                eVar.a("acr", cVar2.a());
                eVar.a("her", cVar2.d());
                eVar.a("nrr", cVar2.f());
                eVar.a("cer", cVar2.b());
            } else {
                eVar.a("result", 2);
                eVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    com.mbridge.msdk.foundation.cache.b bVarA = list.get(i11).a();
                    if (bVarA != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", j0.b(bVarA.b() + ""));
                        jSONObject2.put("showCount", bVarA.f());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - bVarA.h());
                        jSONArray.put(jSONObject2);
                    }
                }
                eVar.a("data", jSONArray.toString());
            }
            String str3 = QpyI.qHBVGnRWPab;
            if (cVar != null) {
                cVar.j(str3);
                cVar.e(str3);
                cVar.a(str3, eVar);
                if (cVar2 != null && cVar2.c() != null) {
                    cVar.b(cVar2.c());
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str3, cVar, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
