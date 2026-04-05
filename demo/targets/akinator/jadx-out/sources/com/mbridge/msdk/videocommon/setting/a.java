package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.ironsource.C3434s;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f45356a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f45357b;

    /* renamed from: c, reason: collision with root package name */
    private long f45358c;

    /* renamed from: d, reason: collision with root package name */
    private long f45359d;

    /* renamed from: e, reason: collision with root package name */
    private long f45360e;

    /* renamed from: f, reason: collision with root package name */
    private long f45361f;

    /* renamed from: g, reason: collision with root package name */
    private long f45362g;

    /* renamed from: h, reason: collision with root package name */
    private long f45363h;

    /* renamed from: j, reason: collision with root package name */
    private String f45365j;

    /* renamed from: i, reason: collision with root package name */
    private int f45364i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f45366k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f45367l = "";

    public String a() {
        return this.f45365j;
    }

    public void b(String str) {
        this.f45365j = str;
    }

    public void c(String str) {
        this.f45367l = str;
    }

    public void d(String str) {
        this.f45366k = str;
    }

    public void e(long j10) {
        this.f45359d = j10;
    }

    public String f() {
        return this.f45367l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f45357b;
    }

    public long h() {
        return this.f45359d * 1000;
    }

    public long i() {
        return this.f45362g;
    }

    public String j() {
        return this.f45366k;
    }

    public JSONObject k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f45356a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f45356a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f45357b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f45357b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put(C3434s.f38309j, jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f45358c);
            jSONObject.put("ruct", this.f45359d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f45360e);
            jSONObject.put("dlct", this.f45361f);
            jSONObject.put("vcct", this.f45362g);
            jSONObject.put("current_time", this.f45363h);
            jSONObject.put("vtag", this.f45366k);
            jSONObject.put("isDefault", this.f45364i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(long j10) {
        this.f45363h = j10;
    }

    public void b(long j10) {
        this.f45361f = j10;
    }

    public void c(long j10) {
        this.f45358c = j10;
    }

    public long d() {
        return this.f45358c * 1000;
    }

    public long e() {
        return this.f45360e * 1000;
    }

    public void f(long j10) {
        this.f45362g = j10;
    }

    public void a(Map<String, Integer> map) {
        this.f45356a = map;
    }

    public long b() {
        return this.f45363h;
    }

    public long c() {
        return this.f45361f;
    }

    public void d(long j10) {
        this.f45360e = j10;
    }

    public void a(int i10) {
        this.f45364i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f45357b = map;
    }

    public static a a(String str) {
        a aVar;
        a aVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                aVar = new a();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                aVar.b(jSONObject.optString("ab_id", ""));
                aVar.c(jSONObject.optString("rid", ""));
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(next) && iOptInt == 0) {
                                map.put(next, 1000);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    aVar.a(map);
                }
                aVar.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray(C3434s.f38309j)));
                aVar.c(jSONObject.optLong("getpf", 43200L));
                aVar.e(jSONObject.optLong("ruct", 5400L));
                aVar.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                aVar.b(jSONObject.optLong("dlct", 3600L));
                aVar.f(jSONObject.optLong("vcct", 5L));
                aVar.a(jSONObject.optLong("current_time"));
                aVar.d(jSONObject.optString("vtag", ""));
                return aVar;
            } catch (Exception e11) {
                e = e11;
                aVar2 = aVar;
                e.printStackTrace();
                return aVar2;
            }
        }
        return aVar2;
    }
}
