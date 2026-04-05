package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f41105a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f41106b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f41107c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f41108d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f41109e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f41110f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f41111g = "";

    /* renamed from: h, reason: collision with root package name */
    private static boolean f41112h = false;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f41113i = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41114a;

        public a(Context context) {
            this.f41114a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f41114a);
                    f.a(advertisingIdInfo.getId());
                    f.f41108d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    f.b(this.f41114a, advertisingIdInfo.getId(), f.f41108d);
                } catch (Exception unused) {
                    p0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        b.C0278b c0278bA = new b().a(this.f41114a);
                        f.a(c0278bA.a());
                        f.f41108d = c0278bA.b() ? 1 : 0;
                        f.b(this.f41114a, c0278bA.a(), f.f41108d);
                    } catch (Exception unused2) {
                        p0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    p0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (z0.b(str)) {
                x0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            x0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            p0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f41106b) ? "" : f41106b;
        }
        if (!TextUtils.isEmpty(f41106b)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f41108d == 0 ? f41106b : "" : f41106b;
        }
        if (!f41107c) {
            a(com.mbridge.msdk.foundation.controller.c.m().d());
            f41107c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f41105a) ? "" : f41105a;
        }
        if (!TextUtils.isEmpty(f41105a)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f41108d == 0 ? f41105a : "" : f41105a;
        }
        l0.k();
        if (!f41107c) {
            a(com.mbridge.msdk.foundation.controller.c.m().d());
            f41107c = true;
        }
        return TextUtils.isEmpty(f41105a) ? "" : f41105a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f41111g) && !f41110f) {
            b();
        }
        return f41111g;
    }

    public static int a() {
        return f41108d;
    }

    public static void a(int i10) {
        f41108d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f41110f) {
            return f41109e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.m().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f41111g = string2;
                    f41109e = j0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                p0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            p0.b("DomainSameDiTool", th2.getMessage());
        }
        f41110f = true;
        return f41109e;
    }

    public static void a(String str) {
        f41106b = j0.b(str);
        f41105a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f41112h = false;
        }
        if (f41113i) {
            return f41112h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f41112h = context.getPackageManager().checkPermission(j0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f41112h = true;
        }
        f41113i = true;
        return f41112h;
    }
}
