package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.p0;
import j1.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static String f40337e = "BaseCandidateCache";

    /* renamed from: f, reason: collision with root package name */
    public static int f40338f = 4;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.foundation.db.c f40339a;

    /* renamed from: b, reason: collision with root package name */
    private JSONArray f40340b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f40341c;

    /* renamed from: d, reason: collision with root package name */
    private String f40342d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.cache.a$a, reason: collision with other inner class name */
    public class C0262a implements Comparator<b> {
        public C0262a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar.f40345b, bVar2.f40345b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.cache.b f40344a;

        /* renamed from: b, reason: collision with root package name */
        private double f40345b;

        public b(double d10, com.mbridge.msdk.foundation.cache.b bVar) {
            this.f40345b = d10;
            this.f40344a = bVar;
        }

        public com.mbridge.msdk.foundation.cache.b a() {
            return this.f40344a;
        }
    }

    public void a(int i10) throws JSONException {
        com.mbridge.msdk.foundation.db.c cVar = this.f40339a;
        if (cVar != null) {
            cVar.a(this.f40342d, i10);
            a(f40338f, 1, null, true, "", "", i10, this.f40342d);
        }
    }

    public double b(String str) throws NumberFormatException {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f40358k && cVarA.g() != c.f40356i) {
            try {
                String[] strArrSplit = j0.a(str.split("_")[3]).split("\\|");
                if (strArrSplit.length > 0) {
                    return Double.parseDouble(strArrSplit[0]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return -1.0d;
    }

    public JSONObject c(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = this.f40340b;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.f40340b.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i10 = 0; i10 < this.f40340b.length(); i10++) {
            try {
                jSONObjectOptJSONObject = this.f40340b.optJSONObject(i10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.getString("g"))) {
                this.f40341c = jSONObjectOptJSONObject;
                return jSONObjectOptJSONObject;
            }
        }
        return null;
    }

    public String d(String str) throws NumberFormatException {
        c cVarA = a(str);
        if (cVarA != null && cVarA.g() != c.f40358k && cVarA.g() != c.f40356i) {
            String[] strArrSplit = j0.a(str.split("_")[3]).split("\\|");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public void e(String str) {
        this.f40342d = str;
    }

    public c a(String str) throws NumberFormatException {
        c cVar = new c();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f40340b;
            if (jSONArray != null && jSONArray.length() != 0) {
                String strA = j0.a(str.split("_")[3]);
                if (TextUtils.isEmpty(strA)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.f40356i);
                    return cVar;
                }
                String[] strArrSplit = strA.split("\\|");
                if (strArrSplit.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.f40356i);
                    return cVar;
                }
                if (strArrSplit.length > 0) {
                    try {
                        Double.parseDouble(strArrSplit[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.f40356i);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.f40342d)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.f40358k);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.f40356i);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.f40356i);
        return cVar;
    }

    private List<Map<Integer, String>> b(List<Map<Integer, String>> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Map<Integer, String> map = list.get(i11);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i10, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public void a(JSONArray jSONArray) {
        this.f40340b = jSONArray;
    }

    public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, int i10, String str2, int i11, double d10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        CampaignEx campaignEx = list.get(i12);
                        campaignEx.setReadyState(0);
                        if (cVar != null) {
                            campaignEx.setNLRid(cVar.o());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i10);
                        String strB = j0.b(d10 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i11, str, strB));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i11, str, strB));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i11, str, strB));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i11, str, strB));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i11, str, strB));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i11, str, strB));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i11, str, strB));
                            nativeVideoTracking.k(a(nativeVideoTracking.k(), i11, str, strB));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i11, str, strB));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i11, str, strB));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i11, str, strB));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i11, str, strB));
                            nativeVideoTracking.t(a(nativeVideoTracking.u(), i11, str, strB));
                            nativeVideoTracking.u(a(nativeVideoTracking.u(), i11, str, strB));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i11, str, strB));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i11, str, strB));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i11, str, strB));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i11, str, strB));
                            nativeVideoTracking.i(a(nativeVideoTracking.i(), i11, str, strB));
                            nativeVideoTracking.j(a(nativeVideoTracking.j(), i11, str, strB));
                            nativeVideoTracking.l(a(nativeVideoTracking.l(), i11, str, strB));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i11, str, strB));
                            nativeVideoTracking.m(a(nativeVideoTracking.m(), i11, str, strB));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i11, str, strB));
                            nativeVideoTracking.n(a(nativeVideoTracking.n(), i11, str, strB));
                            nativeVideoTracking.a(b(nativeVideoTracking.o(), i11, str, strB));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i11, str, strB));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i11, str, strB));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(a(campaignEx.getPv_urls(), i11, str, strB));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public c a() {
        c cVar = new c();
        try {
            JSONArray jSONArray = this.f40340b;
            if (jSONArray != null && jSONArray.length() != 0) {
                if (this.f40339a == null) {
                    cVar.d("db error");
                    cVar.a(c.f40358k);
                }
                return cVar;
            }
            cVar.d("setting config is null");
            cVar.a(c.f40356i);
            return cVar;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.f40358k);
            return cVar;
        }
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(int i10, long j10) throws JSONException {
        if (i10 >= 0) {
            a(i10);
        }
        com.mbridge.msdk.foundation.db.c cVar = this.f40339a;
        if (cVar != null) {
            return cVar.a(this.f40342d, j10);
        }
        return null;
    }

    public void a(List<b> list, int i10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new C0262a());
                    int size = list.size() - i10;
                    if (size > 0) {
                        List<b> listSubList = list.subList(0, size);
                        if (this.f40339a == null || listSubList.size() <= 0) {
                            return;
                        }
                        for (int i11 = 0; i11 < listSubList.size(); i11++) {
                            com.mbridge.msdk.foundation.cache.b bVar = listSubList.get(i11).f40344a;
                            this.f40339a.a(this.f40342d, bVar.e(), bVar.d());
                            a(f40338f, 1, null, true, bVar.e(), bVar.d(), -1, this.f40342d);
                        }
                    }
                }
            } catch (Exception e10) {
                p0.a(f40337e, e10);
            }
        }
    }

    private String a(String str, int i10, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (b1.c(str) > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&ca_sce=");
            sb2.append(i10);
            sb2.append("&real_rid=");
            sb2.append(str2);
            return o2.o(sb2, "&real_bp=", str3);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?ca_sce=");
        sb3.append(i10);
        sb3.append("&real_rid=");
        sb3.append(str2);
        return o2.o(sb3, "&real_bp=", str3);
    }

    private String a(Map<Integer, String> map, int i10, String str, String str2) throws JSONException {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i10, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i10, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = a(strArr[i11], i10, str, str2);
        }
        return strArr2;
    }

    private List<String> a(List<String> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(a(list.get(i11), i10, str, str2));
        }
        return arrayList;
    }

    public long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String strA = j0.a(ecppv);
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(strA) <= 0.0d) {
                return 0L;
            }
            JSONObject jSONObjectC = c(d(str));
            int iOptInt = jSONObjectC != null ? jSONObjectC.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f40339a;
            if (cVar == null || iOptInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f40342d);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public void a(String str, String str2, int i10, String str3) {
        try {
            if (this.f40339a != null && !TextUtils.isEmpty(str3)) {
                if (i10 == 1) {
                    this.f40339a.a(str2, str, this.f40342d, i10);
                    a(f40338f, 3, null, true, str2, str, -1, this.f40342d);
                } else if (i10 == 2) {
                    this.f40339a.a(this.f40342d, str2, str);
                    a(f40338f, 1, null, true, str2, str, -1, this.f40342d);
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f40339a.b(str2, str, this.f40342d);
                    a(f40338f, 4, null, true, str2, str, -1, this.f40342d);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0188 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:3:0x0011, B:9:0x0031, B:11:0x0069, B:14:0x0079, B:16:0x007f, B:19:0x0086, B:21:0x0091, B:24:0x0098, B:26:0x009e, B:28:0x00a6, B:32:0x0104, B:33:0x0108, B:35:0x0113, B:38:0x0119, B:40:0x011f, B:42:0x012d, B:43:0x0131, B:47:0x0140, B:49:0x0146, B:51:0x014e, B:54:0x0169, B:55:0x016c, B:59:0x0180, B:61:0x0188, B:62:0x018d, B:57:0x0178), top: B:68:0x0011, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.cache.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
