package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private int B;
    private CampaignEx C;
    private CopyOnWriteArrayList<CampaignEx> D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f40971a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f40972b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f40973c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Map<String, String>> f40974d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Long> f40975e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.error.b f40976f;

    /* renamed from: g, reason: collision with root package name */
    private String f40977g;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f40978h;

    /* renamed from: i, reason: collision with root package name */
    private String f40979i;

    /* renamed from: j, reason: collision with root package name */
    private int f40980j;

    /* renamed from: k, reason: collision with root package name */
    private String f40981k;

    /* renamed from: l, reason: collision with root package name */
    private String f40982l;

    /* renamed from: m, reason: collision with root package name */
    private String f40983m;

    /* renamed from: n, reason: collision with root package name */
    private String f40984n;

    /* renamed from: o, reason: collision with root package name */
    private String f40985o;

    /* renamed from: p, reason: collision with root package name */
    private String f40986p;

    /* renamed from: q, reason: collision with root package name */
    private String f40987q;

    /* renamed from: r, reason: collision with root package name */
    private String f40988r;

    /* renamed from: s, reason: collision with root package name */
    private int f40989s;

    /* renamed from: t, reason: collision with root package name */
    private int f40990t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f40991u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f40992v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f40993w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f40994x;

    /* renamed from: y, reason: collision with root package name */
    private int f40995y;

    /* renamed from: z, reason: collision with root package name */
    private int f40996z;

    public c() {
        this.f40971a = false;
        this.f40972b = new HashMap();
        this.f40973c = new HashMap();
        this.f40974d = new HashMap();
        this.f40975e = new HashMap();
        this.f40977g = "";
        this.f40978h = new CopyOnWriteArrayList<>();
        this.f40989s = -1;
        this.f40991u = false;
        this.f40993w = false;
        this.D = new CopyOnWriteArrayList<>();
    }

    public boolean A() {
        return this.f40992v;
    }

    public boolean B() {
        return this.f40971a;
    }

    public void a(boolean z10) {
        this.f40991u = z10;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.D.isEmpty()) {
                        this.D.clear();
                    }
                    this.D.addAll(list);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public String c() {
        return this.f40987q;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (this.f40975e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f40975e.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(int i10) {
        this.f40989s = i10;
    }

    public void f(String str) {
        this.f40987q = str;
    }

    public List<CampaignEx> g() {
        return this.f40978h;
    }

    public void h(String str) {
        this.f40986p = str;
    }

    public void i(String str) {
        this.f40977g = str;
    }

    public void j(String str) {
        this.f40988r = str;
    }

    public void k(String str) {
        this.f40982l = str;
    }

    public int l() {
        return this.f40989s;
    }

    public void m(String str) {
        this.f40983m = str;
    }

    public void n(String str) {
        this.f40979i = str;
    }

    public String o() {
        return this.f40977g;
    }

    public com.mbridge.msdk.foundation.error.b p() {
        return this.f40976f;
    }

    public Map<String, Map<String, String>> q() {
        return this.f40974d;
    }

    public Map<String, Map<String, String>> r() {
        return this.f40972b;
    }

    public String s() {
        return this.f40982l;
    }

    public String t() {
        return this.f40985o;
    }

    public String u() {
        return this.f40983m;
    }

    public int v() {
        return this.B;
    }

    public String w() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f40979i)) {
            return this.f40979i;
        }
        try {
            if (TextUtils.isEmpty(this.f40979i)) {
                String str = this.f40977g + this.f40988r;
                Map<String, Map<String, String>> map2 = this.f40972b;
                if (map2 != null && map2.containsKey(str) && (map = this.f40972b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f40979i = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return this.f40979i;
    }

    public String x() {
        return this.f40984n;
    }

    public boolean y() {
        return this.f40991u;
    }

    public boolean z() {
        return this.f40993w;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.f40978h.isEmpty()) {
                    this.f40978h.clear();
                }
                this.f40978h.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> c(String str) {
        com.mbridge.msdk.foundation.error.b bVarP;
        com.mbridge.msdk.foundation.error.b bVarP2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.f40988r = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(w())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, w());
            }
            if (this.f40980j != 0) {
                eVar.a("adtp", Integer.valueOf(a()));
            }
            if (!TextUtils.isEmpty(n())) {
                eVar.a(CampaignEx.JSON_KEY_HB, n());
            }
            if (!TextUtils.isEmpty(f())) {
                eVar.a("bid_tk", f());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a(C3191e4.h.W, str);
            }
            if (Arrays.asList(b.f40956a).contains(str)) {
                eVar.a("from_cache", y() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarP2 = p()) != null) {
                eVar.a("type", Integer.valueOf(bVarP2.c()));
                eVar.a("reason", bVarP2.g());
                if (!TextUtils.isEmpty(bVarP2.h())) {
                    eVar.a("reason_d", bVarP2.h());
                    eVar.a("type_d", Integer.valueOf(bVarP2.i()));
                }
            }
            if ("2000048".contains(str) && (bVarP = p()) != null && !TextUtils.isEmpty(bVarP.h())) {
                eVar.a("type", Integer.valueOf(bVarP.i()));
                eVar.a("reason", bVarP.h());
            }
            if (this.f40980j == 296) {
                eVar.a("auto_load", c());
                eVar.a("auto_refresh", Integer.valueOf(b()));
                eVar.a("auto_refresh_interval", Integer.valueOf(e()));
                eVar.a("content_type", Integer.valueOf(k()));
                eVar.a("temp_display_type", Integer.valueOf(v()));
            }
            a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f40977g + str;
            Map<String, Map<String, String>> map = this.f40972b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f40972b.remove(str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public String f() {
        return this.f40981k;
    }

    public void g(String str) {
        this.f40981k = str;
    }

    public CampaignEx i() {
        return this.C;
    }

    public List<CampaignEx> j() {
        return this.D;
    }

    public int k() {
        return this.A;
    }

    public void l(String str) {
        this.f40985o = str;
    }

    public int m() {
        return this.f40990t;
    }

    public String n() {
        return this.f40986p;
    }

    public void o(String str) {
        this.f40984n = str;
    }

    public void d(boolean z10) {
        this.f40994x = z10;
    }

    public void f(int i10) {
        this.f40990t = i10;
    }

    public void g(int i10) {
        this.B = i10;
    }

    public void d(int i10) {
        this.A = i10;
    }

    public void b(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f40977g + str;
            Map<String, Map<String, String>> map2 = this.f40973c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f40973c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f40973c.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        this.C = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.D;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= this.D.size()) {
                        break;
                    }
                    if (this.D.get(i10) != null && this.D.get(i10).getId().equals(campaignEx.getId())) {
                        this.D.set(i10, campaignEx);
                        break;
                    }
                    i10++;
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f40978h;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.f40978h.size(); i11++) {
                if (this.f40978h.get(i11) != null && this.f40978h.get(i11).getId().equals(campaignEx.getId())) {
                    this.f40978h.set(i11, campaignEx);
                    return;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public int e() {
        return this.f40996z;
    }

    public c(boolean z10) {
        this.f40971a = false;
        this.f40972b = new HashMap();
        this.f40973c = new HashMap();
        this.f40974d = new HashMap();
        this.f40975e = new HashMap();
        this.f40977g = "";
        this.f40978h = new CopyOnWriteArrayList<>();
        this.f40989s = -1;
        this.f40991u = false;
        this.f40993w = false;
        this.D = new CopyOnWriteArrayList<>();
        this.f40971a = z10;
    }

    public long b(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f40975e) != null && map.containsKey(str)) {
                Long l9 = this.f40975e.get(str);
                return System.currentTimeMillis() - (l9 != null ? l9.longValue() : 0L);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    public int a() {
        return this.f40980j;
    }

    public void a(int i10) {
        this.f40980j = i10;
    }

    public Map<String, String> a(String str) {
        return this.f40973c.containsKey(str) ? this.f40973c.remove(str) : new HashMap();
    }

    public void b(boolean z10) {
        this.f40993w = z10;
    }

    public int b() {
        return this.f40995y;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f40977g + str;
            Map<String, Map<String, String>> map2 = this.f40972b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f40972b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.f40972b.put(str2, eVar.a());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void b(int i10) {
        this.f40995y = i10;
    }

    private void a(e eVar) {
        if ("2000126".equals(this.f40988r)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(f());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.f40976f = bVar;
    }

    public void c(boolean z10) {
        this.f40992v = z10;
    }

    public void c(int i10) {
        this.f40996z = i10;
    }
}
