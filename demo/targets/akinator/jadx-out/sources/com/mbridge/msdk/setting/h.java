package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import b0.e2;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.f0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.x0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f42703a = "h";

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f42704b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f42705c;

    /* renamed from: d, reason: collision with root package name */
    private static HashMap<String, l> f42706d = new HashMap<>();

    private h() {
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild == null) {
            try {
                Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
                for (String str2 : all2.keySet()) {
                    if (str2.startsWith(str + "_")) {
                        f42706d.put(str2, l.l((String) all2.get(str2)));
                    }
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            all = fastKVBuild.getAll();
        } catch (Exception unused2) {
        }
        if (all != null) {
            try {
                for (String str3 : all.keySet()) {
                    if (str3.startsWith(str + "_")) {
                        f42706d.put(str3, l.l((String) all.get(str3)));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static h b() {
        if (f42704b == null) {
            synchronized (h.class) {
                try {
                    if (f42704b == null) {
                        f42704b = new h();
                    }
                } finally {
                }
            }
        }
        return f42704b;
    }

    public g c() {
        return f42705c != null ? f42705c : a();
    }

    public g d(String str) {
        if (f42705c == null) {
            try {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
                if (!TextUtils.isEmpty(strA)) {
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                        jSONObject.remove(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                    }
                    f42705c = g.C(jSONObject.toString());
                    if (f42705c != null) {
                        f42705c.K0();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return f42705c;
    }

    public l e(String str, String str2) {
        l lVarB = b(str, str2);
        if (lVarB != null && lVarB.L() == 0) {
            lVarB.d(1);
        }
        return lVarB;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(w0.i.d(str, "_", str2));
    }

    public boolean g(String str, String str2) {
        g gVarD = d(str2);
        if (f(str2) && a(str2, 1, str)) {
            new j().b(com.mbridge.msdk.foundation.controller.c.m().d(), str2, com.mbridge.msdk.foundation.controller.c.m().c());
        }
        l lVarE = e(str2, str);
        if (gVarD != null && lVarE != null) {
            long jQ0 = gVarD.q0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jO = lVarE.o() + jQ0;
            if (jO > jCurrentTimeMillis) {
                String str3 = f42703a;
                StringBuilder sbR = e2.r(jO, "unit setting  nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                sbR.append(jCurrentTimeMillis);
                sbR.append(C3191e4.i.f36531e);
                p0.c(str3, sbR.toString());
                return false;
            }
        }
        p0.c(f42703a, "unit setting timeout or not exists");
        return true;
    }

    public void h(String str) {
        try {
            String strE = e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strE);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th2) {
            p0.b(f42703a, th2.getMessage());
        }
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public void j(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            p0.b(f42703a, th2.getMessage());
        }
    }

    public String c(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            return strA == null ? "" : strA;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    public l c(String str, String str2) {
        l lVarA = a(str, str2);
        return lVarA == null ? l.N() : lVarA;
    }

    public g b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g gVarD = d(str);
            return gVarD == null ? a() : gVarD;
        } catch (Exception unused) {
            return a();
        }
    }

    public void h(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str, str2);
        f42705c = g.C(str2);
        if (f42705c != null) {
            f42705c.K0();
        }
        i.a(f42705c);
        f0.a().a(f42705c.Q());
    }

    public boolean f(String str) {
        g gVarD = d(str);
        if (gVarD != null) {
            long jA = gVarD.A() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jW = gVarD.w() + jA;
            if (jW > jCurrentTimeMillis) {
                String str2 = f42703a;
                StringBuilder sbR = e2.r(jW, "app setting nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                sbR.append(jCurrentTimeMillis);
                sbR.append(C3191e4.i.f36531e);
                p0.c(str2, sbR.toString());
                return false;
            }
        }
        p0.c(f42703a, "app setting timeout or not exists");
        return true;
    }

    private l b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.m().b();
        }
        String strD = w0.i.d(str, "_", str2);
        if (f42706d.containsKey(strD)) {
            return f42706d.get(strD);
        }
        l lVarL = null;
        try {
            lVarL = l.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strD));
            f42706d.put(strD, lVarL);
            return lVarL;
        } catch (Exception e10) {
            e10.printStackTrace();
            return lVarL;
        }
    }

    public l d(String str, String str2) {
        l lVarE = e(str, str2);
        return lVarE == null ? l.N() : lVarE;
    }

    public void g(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void a(String str) {
        i.a(str, this);
    }

    public g a() {
        return i.a();
    }

    public l a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i10, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            String str3 = str + "_" + i10 + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = 0;
            long jLongValue = ((Long) x0.a(contextD, str3, 0L)).longValue();
            g gVarD = d(str);
            if (gVarD == null) {
                gVarD = b().a();
            } else {
                j10 = jLongValue;
            }
            if ((gVarD.l0() * 1000) + j10 > jCurrentTimeMillis) {
                return false;
            }
            x0.b(contextD, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                    jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                    jSONObject.put(next, jSONArray);
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String strD = w0.i.d(str, "_", str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strD, str3);
        f42706d.put(strD, l.l(str3));
    }
}
