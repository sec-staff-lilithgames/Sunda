package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Oe {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";

    /* renamed from: a, reason: collision with root package name */
    private static String f35132a = "https://i-sdk.mediation.unity3d.com/sdk/v";

    /* renamed from: b, reason: collision with root package name */
    private static final String f35133b = "?request=";

    /* renamed from: c, reason: collision with root package name */
    private static final String f35134c = "platform";

    /* renamed from: d, reason: collision with root package name */
    private static final String f35135d = "applicationKey";

    /* renamed from: e, reason: collision with root package name */
    private static final String f35136e = "applicationUserId";

    /* renamed from: f, reason: collision with root package name */
    private static final String f35137f = "sdkVersion";

    /* renamed from: g, reason: collision with root package name */
    private static final String f35138g = "pluginType";

    /* renamed from: h, reason: collision with root package name */
    private static final String f35139h = "pluginVersion";

    /* renamed from: i, reason: collision with root package name */
    private static final String f35140i = "plugin_fw_v";

    /* renamed from: j, reason: collision with root package name */
    private static final String f35141j = "advId";

    /* renamed from: k, reason: collision with root package name */
    private static final String f35142k = "auid";

    /* renamed from: l, reason: collision with root package name */
    private static final String f35143l = "isDemandOnly";

    /* renamed from: m, reason: collision with root package name */
    private static final String f35144m = "serr";

    /* renamed from: n, reason: collision with root package name */
    private static final String f35145n = "appVer";

    /* renamed from: o, reason: collision with root package name */
    private static final String f35146o = "osVer";

    /* renamed from: p, reason: collision with root package name */
    private static final String f35147p = "devModel";

    /* renamed from: q, reason: collision with root package name */
    private static final String f35148q = "devMake";

    /* renamed from: r, reason: collision with root package name */
    private static final String f35149r = "connType";

    /* renamed from: s, reason: collision with root package name */
    private static final String f35150s = "rawConnType";

    /* renamed from: t, reason: collision with root package name */
    private static final String f35151t = "mt";

    /* renamed from: u, reason: collision with root package name */
    private static final String f35152u = "fs";

    /* renamed from: v, reason: collision with root package name */
    private static final String f35153v = "coppa";

    /* renamed from: w, reason: collision with root package name */
    private static final String f35154w = "dff";

    /* renamed from: x, reason: collision with root package name */
    private static final String f35155x = "browserUserAgent";

    /* renamed from: y, reason: collision with root package name */
    private static final String f35156y = "deviceLang";

    /* renamed from: z, reason: collision with root package name */
    private static final String f35157z = "bundleId";

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, List<Pair<String, String>> list, boolean z11) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        B7 b7I = Mb.U().i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            j1.o2.z("applicationUserId", str2, arrayList);
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z10) {
            j1.o2.z(G, "1", arrayList);
        }
        if (!IronSourceUtils.g()) {
            j1.o2.z(f35144m, "0", arrayList);
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(f35138g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(f35139h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(f35140i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            j1.o2.z(f35141j, str3, arrayList);
        }
        if (!TextUtils.isEmpty(str4)) {
            j1.o2.z("mt", str4, arrayList);
        }
        String strB = C1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            j1.o2.z(f35145n, strB, arrayList);
        }
        arrayList.add(new Pair(f35146o, p0.o2.j(Build.VERSION.SDK_INT, "")));
        j1.o2.z(f35148q, Build.MANUFACTURER, arrayList);
        arrayList.add(new Pair(f35147p, Build.MODEL));
        arrayList.add(new Pair("fs", p0.o2.j(IronSourceUtils.c(context) ? 1 : 0, "")));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C3360na.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f37596b)) {
            arrayList.add(new Pair(f35153v, concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f37596b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f37600f)) {
            String str6 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f37600f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f37604j)) {
                j1.o2.z("ts", "1", arrayList);
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f37598d)) {
            String str7 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f37598d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                j1.o2.z(f35154w, "1", arrayList);
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f37599e) && (list2 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f37599e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.f37599e, list2.get(0)));
        }
        String strA = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(strA)) {
            j1.o2.z(f35149r, strA, arrayList);
        }
        String strD = C3137b4.d(context);
        if (!TextUtils.isEmpty(strD)) {
            j1.o2.z(f35150s, strD, arrayList);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = b7I.s();
        if (strS.length() != 0) {
            j1.o2.z(f35155x, strS, arrayList);
        }
        try {
            str5 = b7I.c(context) + "-" + b7I.A(context);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            j1.o2.z(f35156y, str5, arrayList);
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + C3119a4.b(context)));
        arrayList.add(new Pair("mnc", "" + C3119a4.c(context)));
        String strG = b7I.G(context);
        if (!TextUtils.isEmpty(strG)) {
            j1.o2.z("icc", strG, arrayList);
        }
        String strU = b7I.u(context);
        if (!TextUtils.isEmpty(strU)) {
            j1.o2.z(D, strU, arrayList);
        }
        String strD2 = b7I.d();
        if (!TextUtils.isEmpty(strD2)) {
            j1.o2.z("tz", strD2, arrayList);
        }
        arrayList.add(new Pair(F, "" + b7I.m()));
        String strD3 = b7I.d(context);
        if (!TextUtils.isEmpty(strD3)) {
            j1.o2.z("auid", strD3, arrayList);
        }
        if (z11) {
            j1.o2.z("isDemandOnly", "1", arrayList);
        }
        j1.o2.z(Q6.f35267i0, String.valueOf(C3276j0.a()), arrayList);
        return j1.o2.o(new StringBuilder(), a(LevelPlay.getSdkVersion()), URLEncoder.encode(L9.e(C3390p5.b().c(), a(arrayList)), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
    }

    private static void b(String str) {
        f35132a = str;
    }

    public static String a(String str, boolean z10, int i10) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z10)));
        arrayList.add(new Pair("placementId", Integer.toString(i10)));
        return w0.i.d(str, "&", a(arrayList));
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String string = "";
        for (Pair<String, String> pair : list) {
            if (string.length() > 0) {
                string = string.concat("&");
            }
            StringBuilder sbU = p0.o2.u(string);
            sbU.append((String) pair.first);
            sbU.append("=");
            sbU.append(URLEncoder.encode((String) pair.second, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            string = sbU.toString();
        }
        return string;
    }

    private static String a(String str) {
        return a.b.o(new StringBuilder(), f35132a, str, f35133b);
    }
}
