package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.j;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: l, reason: collision with root package name */
    private static volatile d f40411l;

    /* renamed from: a, reason: collision with root package name */
    private int f40412a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f40413b;

    /* renamed from: c, reason: collision with root package name */
    private FastKV f40414c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40415d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f40416e;

    /* renamed from: f, reason: collision with root package name */
    private String f40417f;

    /* renamed from: g, reason: collision with root package name */
    private String f40418g;

    /* renamed from: h, reason: collision with root package name */
    private Context f40419h;

    /* renamed from: i, reason: collision with root package name */
    private String f40420i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.preload.a f40421j;

    /* renamed from: k, reason: collision with root package name */
    private String f40422k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f40423a;

        public a(Context context) {
            this.f40423a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.h(this.f40423a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.f40416e);
            new h(d.this.f40419h).a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    public class C0266d implements a.e {
        public C0266d() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40428a;

        public e(String str) {
            this.f40428a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e10) {
                p0.b("SDKController", e10.getMessage());
            }
            new j().b(d.this.f40419h, this.f40428a, d.this.f40417f);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.timer.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), null);
        } catch (Throwable th2) {
            p0.b("SDKController", th2.getMessage(), th2);
        }
    }

    public boolean e() {
        return true;
    }

    private void c() throws JSONException {
        com.mbridge.msdk.foundation.controller.c.m().b(this.f40419h);
        com.mbridge.msdk.foundation.controller.c.m().e(this.f40416e);
        com.mbridge.msdk.foundation.controller.c.m().f(this.f40417f);
        com.mbridge.msdk.foundation.controller.c.m().d(this.f40422k);
        com.mbridge.msdk.foundation.controller.c.m().b(this.f40418g);
        com.mbridge.msdk.foundation.controller.c.m().c(new C0266d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th2) {
            p0.b("SDKController", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD == null || (listG = gVarD.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.f40419h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance, null);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance2, null);
                }
            }
        } catch (Throwable th2) {
            p0.b("SDKController", th2.getMessage());
        }
    }

    public void b() {
        a(this.f40419h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            com.mbridge.msdk.foundation.same.report.j.b();
        } catch (Exception unused) {
            p0.b("SDKController", "get app setting failed");
        }
        this.f40415d = true;
    }

    public static d a() {
        if (f40411l == null) {
            synchronized (d.class) {
                try {
                    if (f40411l == null) {
                        f40411l = new d();
                    }
                } finally {
                }
            }
        }
        return f40411l;
    }

    public void b(String str) {
        if (this.f40421j == null) {
            this.f40421j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.f40413b;
            if (map == null || map.size() <= 0 || !this.f40413b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.f40413b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.f40421j.a(this.f40413b, this.f40412a);
                return;
            }
            if (1 == iIntValue) {
                this.f40421j.a(this.f40413b);
            } else if (2 != iIntValue) {
                p0.b("SDKController", "unknow layout type in preload");
            } else {
                this.f40421j.b(this.f40413b);
            }
        } catch (Exception e10) {
            p0.b("SDKController", e10.getMessage());
        }
    }

    public void a(Map map, Context context) throws JSONException {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.m().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.m().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f40416e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f40417f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f40422k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f40418g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f40420i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f40419h = context.getApplicationContext();
            c();
            if (this.f40415d) {
                return;
            }
            b();
            l0.l(context);
            long jX0 = com.mbridge.msdk.setting.h.b().b(this.f40416e).x0();
            if (jX0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jX0);
            }
        }
    }

    public void f() {
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.f40414c == null) {
                try {
                    this.f40414c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), j0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f40414c = null;
                }
            }
            FastKV fastKV = this.f40414c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(j0.a("H+tU+bfPhM=="), "");
                String string4 = this.f40414c.getString(j0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f40710g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                        return;
                    }
                    this.f40414c.putString(j0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.f40414c.putString(j0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f40710g);
                    return;
                }
                com.mbridge.msdk.foundation.same.a.V = string3;
                com.mbridge.msdk.foundation.same.a.f40710g = string4;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(j0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences != null) {
                string2 = sharedPreferences.getString(j0.a("H+tU+bfPhM=="), "");
                string = sharedPreferences.getString(j0.a("H+tU+Fz8"), "");
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                com.mbridge.msdk.foundation.same.a.f40710g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            }
            if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                if ((TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f40710g)) || sharedPreferences == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(j0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                editorEdit.putString(j0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f40710g);
                editorEdit.apply();
                return;
            }
            com.mbridge.msdk.foundation.same.a.V = string2;
            com.mbridge.msdk.foundation.same.a.f40710g = string;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
        } catch (Throwable th2) {
            p0.b("SDKController", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.mbridge.msdk.setting.h.b() == null) {
            return;
        }
        com.mbridge.msdk.setting.h hVarB = com.mbridge.msdk.setting.h.b();
        if (hVarB != null) {
            g gVarD = hVarB.d(str);
            if (gVarD != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
                MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
                if (!TextUtils.isEmpty(gVarD.u())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f40851i = gVarD.u();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarD.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f40855m = gVarD.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.f42721b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f42720a;
            }
        }
        if (com.mbridge.msdk.setting.h.b().f(str) && com.mbridge.msdk.setting.h.b().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    if (TextUtils.isEmpty(f.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                        return;
                    } else {
                        new j().b(this.f40419h, str, this.f40417f);
                        return;
                    }
                } catch (Throwable unused) {
                    new j().b(this.f40419h, str, this.f40417f);
                    return;
                }
            }
            new j().b(this.f40419h, str, this.f40417f);
        }
    }

    public void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            p0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f40413b = map;
        this.f40412a = i10;
        String strB = com.mbridge.msdk.foundation.controller.c.m().b();
        if (map != null) {
            b(strB);
        }
    }
}
