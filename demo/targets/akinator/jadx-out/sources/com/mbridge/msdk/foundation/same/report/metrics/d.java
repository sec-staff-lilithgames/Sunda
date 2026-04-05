package com.mbridge.msdk.foundation.same.report.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static d f40997e;

    /* renamed from: a, reason: collision with root package name */
    private volatile m f40998a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, e> f40999b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private LinkedHashMap<String, c> f41000c = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, e> f41001d = new HashMap();

    private d() {
        if (this.f40998a == null) {
            this.f40998a = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.m().d(), a());
        }
        JSONObject jSONObjectB = com.mbridge.msdk.foundation.same.report.c.b();
        if (this.f40998a != null) {
            this.f40998a.a(jSONObjectB);
            this.f40998a.h();
        }
    }

    public c a(boolean z10, String str, e eVar, CampaignEx campaignEx, String str2) {
        c cVar;
        c cVar2 = new c();
        try {
            a(z10, str2);
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(u0.d()) : a(str);
            campaignEx.setLocalRequestId(md5);
            cVar2 = b().b(md5);
            if (cVar2 == null) {
                cVar = new c();
                try {
                    b().c().put(md5, cVar);
                    cVar.d(true);
                    b().c().put(md5, cVar);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        p0.b("MetricsManager", e.getMessage());
                    }
                    return cVar;
                }
            }
            cVar2.i(md5);
            cVar2.n(str2);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str3 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str3);
                    if (str3.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
    }

    public void b(c cVar) {
        if (cVar != null) {
            try {
                if (this.f40999b != null) {
                    e eVar = new e();
                    eVar.a("rs_rid", cVar.s());
                    eVar.a("r_stid", cVar.t());
                    eVar.a("rus_rid", cVar.u());
                    eVar.a("u_stid", cVar.x());
                    this.f40999b.put(cVar.w(), eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public e c(String str) {
        Map<String, e> map;
        e eVar = new e();
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f40999b) != null && map.containsKey(str)) {
                return this.f40999b.get(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    public void d(String str) {
        b(str, "");
    }

    public void e(String str) {
        try {
            JSONObject jSONObjectA = com.mbridge.msdk.foundation.same.c.a(str);
            if (jSONObjectA != null && jSONObjectA.length() != 0) {
                String strOptString = jSONObjectA.optString(C3191e4.h.W);
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(strOptString);
                eVar.a(0);
                eVar.b(0);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                eVar.a(jSONObjectA);
                m mVarD = b().d();
                if (mVarD == null || !mVarD.g()) {
                    return;
                }
                mVarD.d(eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("EventLibraryReport", "reportByTrackManager error: " + e10.getMessage());
            }
        }
    }

    public m d() {
        try {
            JSONObject jSONObjectB = com.mbridge.msdk.foundation.same.report.c.b();
            if (this.f40998a == null) {
                this.f40998a = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.m().d(), a());
                if (this.f40998a != null) {
                    this.f40998a.a(jSONObjectB);
                    this.f40998a.h();
                }
            } else {
                this.f40998a.a(jSONObjectB);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f40998a;
    }

    public LinkedHashMap<String, c> c() {
        return this.f41000c;
    }

    public static d b() {
        if (f40997e == null) {
            synchronized (d.class) {
                try {
                    if (f40997e == null) {
                        f40997e = new d();
                    }
                } finally {
                }
            }
        }
        return f40997e;
    }

    public void b(String str, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        a(str, cVar, aVar);
    }

    public void b(String str, e eVar) {
        try {
            c cVar = new c();
            if (eVar.b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                cVar.n(String.valueOf(eVar.b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (eVar.b("lrid") != null && (eVar.b("lrid") instanceof String)) {
                cVar.i(String.valueOf(eVar.b("lrid")));
            }
            cVar.a(str, eVar);
            new f().b(str, d(), cVar, null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public String a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(u0.d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(u0.d()) : md5;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return md5;
        }
    }

    public c b(String str) {
        return a(str, "");
    }

    public void b(String str, String str2) {
        LinkedHashMap<String, c> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.f41000c) != null && linkedHashMap.containsKey(str3)) {
                this.f41000c.remove(str3);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(boolean z10, String str) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                if (eVarA != null && (listE = eVarA.e(str)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        b().d(it.next());
                    }
                }
                LinkedHashMap<String, c> linkedHashMapC = b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, c> next = it2.next();
                    if (next != null && next.getValue().z()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void a(String str, e eVar) {
        Map<String, e> map = this.f41001d;
        if (map != null) {
            map.put(str, eVar);
        }
    }

    public e a(int i10, int i11, String str, boolean z10, int i12) {
        e eVar = new e();
        try {
            eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i10));
            eVar.a("adtp", Integer.valueOf(i11));
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z10) {
                eVar.a("auto_load", Integer.valueOf(i12));
                return eVar;
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar;
    }

    private x a() {
        try {
            int iB = r0.a().b("metrics", "t_m_e_t", r0.a().b("t_m_e_t", 604800000));
            int iB2 = r0.a().b("metrics", "t_m_e_s", r0.a().b("t_m_e_s", 50));
            int iB3 = r0.a().b("metrics", "t_m_r_c", r0.a().b("t_m_r_c", 50));
            int iB4 = r0.a().b("metrics", "t_m_t", r0.a().b("t_m_t", 15000));
            int iB5 = r0.a().b("metrics", "t_m_r_t_s", r0.a().b("t_m_r_t_s", 2));
            int iB6 = r0.a().b("metrics", "t_r_t", r0.a().b("t_r_t", 1));
            if (iB6 != 0 && iB6 != 1) {
                iB6 = 0;
            }
            return new x.b().a(iB).b(iB2).d(iB3).c(iB4).e(iB5).a(new com.mbridge.msdk.foundation.same.report.d()).a(com.mbridge.msdk.foundation.same.report.c.c()).a(new n()).a(iB6, a(iB6)).a();
        } catch (Exception e10) {
            p0.b("EventLibraryReport", "configTrackManager error: " + e10.getMessage());
            return null;
        }
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new com.mbridge.msdk.foundation.same.report.m((byte) 2), com.mbridge.msdk.foundation.same.net.utils.d.h().f40852j, com.mbridge.msdk.foundation.same.net.utils.d.h().f40856n);
        }
        return new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f40843d, 0);
    }

    public void a(String str, CampaignEx campaignEx, e eVar) {
        c cVar;
        String localRequestId = "";
        if (campaignEx != null) {
            try {
                localRequestId = campaignEx.getLocalRequestId();
                cVar = c().get(localRequestId);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            if (Arrays.asList(b.f40963h).contains(str)) {
                cVar = a(cVar);
            }
        } else {
            cVar = new c();
        }
        cVar.a(campaignEx);
        cVar.i(localRequestId);
        cVar.a(str, eVar);
        a(str, cVar, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
    }

    public void a(String str, CampaignEx campaignEx) {
        String currentLocalRid = "";
        if (campaignEx != null) {
            try {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        c cVar = c().get(currentLocalRid);
        if (cVar == null) {
            cVar = new c();
        }
        if (cVar.j() != null && !cVar.j().isEmpty() && campaignEx != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= cVar.j().size()) {
                    break;
                }
                if (cVar.j().get(i10).getId().equals(campaignEx.getId())) {
                    cVar.j().set(i10, campaignEx);
                    break;
                }
                i10++;
            }
        }
        cVar.a(campaignEx);
        cVar.i(currentLocalRid);
        a(str, cVar, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
    }

    public void a(String str, List<CampaignEx> list, e eVar) {
        CampaignEx campaignEx;
        String currentLocalRid = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    currentLocalRid = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        c cVar = c().get(currentLocalRid);
        if (cVar == null) {
            cVar = new c();
        }
        cVar.b(list);
        if (list != null && list.size() > 0) {
            cVar.i(list.get(0).getCurrentLocalRid());
        }
        cVar.a(str, eVar);
        a(str, cVar, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
    }

    public void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        e eVar = new e();
        eVar.a("result", Integer.valueOf(nVar.x()));
        eVar.a("scenes", nVar.a("scenes", ""));
        eVar.a("resource_type", Integer.valueOf(nVar.y()));
        eVar.a("url", nVar.a("url", ""));
        eVar.a("reason", nVar.t());
        eVar.a("mraid_type", Integer.valueOf(nVar.p()));
        b().a(nVar.n(), campaignEx, eVar);
    }

    public void a(String str, c cVar) {
        try {
            Map<String, e> map = this.f41001d;
            if (map != null && map.containsKey(str) && cVar != null) {
                cVar.a(str, this.f41001d.get(str));
            }
            new f().a(str, d(), cVar, null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (cVar == null) {
                cVar = new c();
            }
            e eVar = new e();
            eVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                eVar.a(BidResponsedEx.KEY_CID, campaignEx.getId());
                eVar.a("lrid", campaignEx.getLocalRequestId());
                eVar.a("rid", campaignEx.getRequestId());
                eVar.a("rid_n", campaignEx.getRequestIdNotice());
                eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                eVar.a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                eVar.a("network_type", Integer.valueOf(l0.s(context)));
            }
            cVar.a(str, eVar);
            a(str, cVar, aVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(String str, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            if (Arrays.asList(b.f40958c).contains(str)) {
                cVar.d(str);
            }
            Map<String, e> map = this.f41001d;
            if (map != null && map.containsKey(str)) {
                cVar.a(str, this.f41001d.get(str));
            }
            new f().a(str, d(), cVar, aVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public c a(String str, String str2) {
        LinkedHashMap<String, c> linkedHashMap;
        try {
            String str3 = str + str2;
            if (!TextUtils.isEmpty(str3) && (linkedHashMap = this.f41000c) != null && linkedHashMap.containsKey(str3)) {
                return this.f41000c.get(str3);
            }
            return null;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        }
    }

    public c a(c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            return (c) cVar.clone();
        } catch (CloneNotSupportedException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        }
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() == 0) {
                    return;
                }
                String strOptString = jSONObject.optString(C3191e4.h.W);
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(strOptString);
                eVar.a(0);
                eVar.b(0);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
                eVar.a(jSONObject);
                m mVarD = b().d();
                if (mVarD == null || !mVarD.g()) {
                    return;
                }
                mVarD.d(eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("EventLibraryReport", "reportByTrackManager error: " + e10.getMessage());
                }
            }
        }
    }
}
