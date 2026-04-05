package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import ao.kwoC.zAQQWzBxnS;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.apm.insight.MonitorCrash;
import com.apm.insight.k.j;
import com.apm.insight.l.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    protected static MonitorCrash f12943a;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, d> f12944c = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private MonitorCrash f12945b;

    private d(MonitorCrash monitorCrash) {
        this.f12945b = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.c();
        j.e();
    }

    public final String b() {
        return this.f12945b.mConfig.mAid;
    }

    public final JSONObject c() {
        return d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f12945b.mConfig.mPackageName == null) {
                Context contextG = e.g();
                PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(contextG.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f12945b.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = packageInfo.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f12945b.mConfig.mDeviceId) || "0".equals(this.f12945b.mConfig.mDeviceId)) {
            this.f12945b.mConfig.mDeviceId = e.c().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f12945b.mConfig.mAid));
            jSONObject.put("update_version_code", this.f12945b.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f12945b.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f12945b.mConfig.mVersionStr);
            jSONObject.put("channel", this.f12945b.mConfig.mChannel);
            jSONObject.put("package", a.a(this.f12945b.mConfig.mPackageName));
            jSONObject.put("device_id", this.f12945b.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f12945b.mConfig.mUID);
            jSONObject.put("ssid", this.f12945b.mConfig.mSSID);
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", a.a(this.f12945b.mConfig.mSoList));
            jSONObject.put(zAQQWzBxnS.srYbKV, a.a(this.f12945b.mConfig.mThreadList));
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public final boolean a(Object obj) {
        return this.f12945b == obj;
    }

    public static Object a() {
        return f12943a;
    }

    public static void a(Context context, final MonitorCrash monitorCrash) {
        f12943a = monitorCrash;
        d dVar = new d(monitorCrash);
        final com.apm.insight.nativecrash.b bVarA = e.a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.d.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() throws JSONException {
                JSONObject jSONObjectD = d.this.d();
                HashMap map = new HashMap();
                if (jSONObjectD != null) {
                    Iterator<String> itKeys = jSONObjectD.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectD.opt(next));
                    }
                }
                return map;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? bVarA.d() : monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    public static void a(MonitorCrash monitorCrash) {
        d dVar = new d(monitorCrash);
        if (monitorCrash.mConfig != null) {
            f12944c.put(monitorCrash.mConfig.mAid, dVar);
        }
    }

    public static d a(String str) {
        return f12944c.get(str);
    }

    public final JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th2) {
        return a(stackTraceElementArr, th2, null);
    }

    public final JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th2, String str) {
        String[] strArr = this.f12945b.mConfig.mPackageName;
        if (strArr == null) {
            return new JSONArray().put(new m.a(0, stackTraceElementArr.length).a());
        }
        if (th2 == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray jSONArrayA = m.a(stackTraceElementArr, strArr);
        if (str != null && this.f12945b.mConfig.mThreadList != null && a.a(jSONArrayA)) {
            for (String str2 : this.f12945b.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    jSONArrayA.put(new m.a(0, stackTraceElementArr.length).a());
                }
            }
        }
        return jSONArrayA;
    }

    public final JSONArray a(String[] strArr) {
        if (this.f12945b.config().mPackageName == null) {
            return new JSONArray().put(new m.a(0, strArr.length).a());
        }
        return m.a(strArr, this.f12945b.mConfig.mPackageName);
    }

    public final boolean a(String str, String str2) {
        if (this.f12945b.config().mPackageName == null) {
            return true;
        }
        return com.apm.insight.entity.b.a(str, a.a(this.f12945b.mConfig.mSoList), str2, a.a(this.f12945b.mConfig.mThreadList));
    }

    public final JSONObject a(CrashType crashType, JSONArray jSONArray) {
        Map<? extends String, ? extends String> userData;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", d());
            jSONObject.put("line_num", jSONArray);
            if (crashType != null) {
                AttachUserData attachUserData = this.f12945b.mCustomData;
                jSONObject.put(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM, (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) ? null : new JSONObject(userData));
                jSONObject.put("filters", new JSONObject(this.f12945b.mTagMap));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
