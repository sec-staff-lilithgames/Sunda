package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.amazon.device.ads.DtbDeviceData;
import com.apm.insight.e;
import com.apm.insight.l.k;
import com.apm.insight.l.l;
import com.apm.insight.runtime.o;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Header {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f12983a = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d, reason: collision with root package name */
    private static String f12984d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f12985e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static int f12986f = -1;

    /* renamed from: b, reason: collision with root package name */
    private Context f12987b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f12988c = new JSONObject();

    public Header(Context context) {
        this.f12987b = context;
    }

    public static Header a(Context context) throws JSONException {
        Header header = new Header(context);
        JSONObject jSONObject = header.f12988c;
        try {
            jSONObject.put("sdk_version", 20089);
            jSONObject.put("sdk_version_name", "2008-20250701130429");
        } catch (Exception unused) {
        }
        return header;
    }

    public static void addOtherHeader(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            if (com.apm.insight.l.d.b()) {
                sb2.append("MIUI-");
            } else if (com.apm.insight.l.d.c()) {
                sb2.append("FLYME-");
            } else {
                String strA = com.apm.insight.l.d.a();
                if (com.apm.insight.l.d.a(strA)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strA)) {
                    sb2.append(strA);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
            if (sb2.length() > 0) {
                jSONObject.put("rom", sb2.toString());
            }
            jSONObject.put("rom_version", l.a());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = e.g().getResources().getDisplayMetrics();
            int i10 = displayMetrics.densityDpi;
            String str = i10 != 120 ? i10 != 240 ? i10 != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i10);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = e.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", e.c().a());
            String strConcat = Build.VERSION.RELEASE;
            if (!strConcat.contains(".")) {
                strConcat = strConcat.concat(".0");
            }
            jSONObject.put("os_version", strConcat);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str2 = Build.MODEL;
            String str3 = Build.BRAND;
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null && !str2.contains(str3)) {
                str2 = str3 + ' ' + str2;
            }
            jSONObject.put("device_model", str2);
            jSONObject.put("device_brand", str3);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context contextG = e.g();
            String packageName = contextG.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i11 = applicationInfo.labelRes;
                if (i11 > 0) {
                    jSONObject.put("display_name", contextG.getString(i11));
                } else {
                    jSONObject.put("display_name", contextG.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("access", k.a(e.g()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) e.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static Header b(Context context) throws JSONException {
        Header headerA = a(context);
        a(headerA);
        b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        return headerA;
    }

    private static String g() {
        if (f12984d == null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i10 >= strArr.length) {
                            break;
                        }
                        sb2.append(strArr[i10]);
                        if (i10 != strArr.length - 1) {
                            sb2.append(", ");
                        }
                        i10++;
                    }
                } else {
                    sb2 = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb2.toString())) {
                    f12984d = "unknown";
                }
                f12984d = sb2.toString();
            } catch (Exception e10) {
                com.apm.insight.a.b((Throwable) e10);
                f12984d = "unknown";
            }
        }
        return f12984d;
    }

    public final JSONObject c() {
        return a(e.a().a());
    }

    public final JSONObject d() throws JSONException {
        try {
            this.f12988c.put("device_id", e.c().a());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this.f12988c;
    }

    public final JSONObject e() throws JSONException {
        try {
            long jF = e.a().f();
            if (jF > 0) {
                this.f12988c.put("user_id", jF);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return this.f12988c;
    }

    public final JSONObject f() {
        return this.f12988c;
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static Header a(long j10) throws JSONException {
        Header headerA;
        o oVarA = o.a();
        if (j10 == 0) {
            j10 = System.currentTimeMillis();
        }
        JSONObject jSONObjectA = oVarA.a(j10);
        if (jSONObjectA != null && jSONObjectA.length() != 0) {
            try {
                if (!jSONObjectA.has("aid")) {
                    jSONObjectA.put("aid", 4444);
                }
            } catch (Exception unused) {
            }
            headerA = new Header(e.g());
        } else {
            headerA = a(e.g());
            headerA.c();
            try {
                headerA.f12988c.put("errHeader", 1);
            } catch (Throwable unused2) {
            }
        }
        b(headerA);
        headerA.a(jSONObjectA);
        return headerA;
    }

    public static boolean b() {
        if (f12986f == -1) {
            f12986f = g().contains("86") ? 1 : 0;
        }
        return f12986f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static void b(Header header) throws JSONException {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f12988c);
    }

    public static boolean a() {
        if (f12985e == -1) {
            f12985e = g().contains("64") ? 1 : 0;
        }
        return f12985e == 1;
    }

    public final JSONObject a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return this.f12988c;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.f12988c.put(next, jSONObject.opt(next));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return this.f12988c;
    }

    public final JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return this.f12988c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.f12988c.has(entry.getKey())) {
                this.f12988c.put(entry.getKey(), entry.getValue());
            }
        }
        String[] strArr = f12983a;
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (map.containsKey(str)) {
                try {
                    this.f12988c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.f12988c.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.f12988c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("iid")) {
            this.f12988c.put("udid", map.get("iid"));
            this.f12988c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.f12988c.put("app_version", map.get("version_name"));
            this.f12988c.remove("version_name");
        }
        return this.f12988c;
    }

    public static Header a(Header header) throws JSONException {
        addRuntimeHeader(header.f12988c);
        return header;
    }
}
