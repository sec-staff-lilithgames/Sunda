package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: q, reason: collision with root package name */
    public static final String f40368q = "c";

    /* renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f40369r = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected String f40371b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f40372c;

    /* renamed from: d, reason: collision with root package name */
    protected String f40373d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f40374e;

    /* renamed from: f, reason: collision with root package name */
    private String f40375f;

    /* renamed from: g, reason: collision with root package name */
    private int f40376g;

    /* renamed from: j, reason: collision with root package name */
    private String f40379j;

    /* renamed from: k, reason: collision with root package name */
    private String f40380k;

    /* renamed from: l, reason: collision with root package name */
    private int f40381l;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f40383n;

    /* renamed from: o, reason: collision with root package name */
    private JSONObject f40384o;

    /* renamed from: a, reason: collision with root package name */
    private final r f40370a = new r();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f40377h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    private boolean f40378i = false;

    /* renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f40382m = new ConcurrentHashMap<>();

    /* renamed from: p, reason: collision with root package name */
    private int f40385p = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    public class RunnableC0263a implements Runnable {
        public RunnableC0263a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f40372c).a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f40371b = (String) x0.a(aVar.f40372c, "sp_appId", "");
            } catch (Throwable th2) {
                p0.b(a.f40368q, th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f40379j = (String) x0.a(aVar.f40372c, "sp_appKey", "");
            } catch (Throwable th2) {
                p0.b(a.f40368q, th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
    }

    private void l() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = x0.a(this.f40372c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = x0.a(this.f40372c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        f.d();
                    } else {
                        f.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        f.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
        }
    }

    public abstract void a(e eVar);

    public void b(int i10) {
        this.f40381l = i10;
    }

    public void c(int i10) {
        this.f40385p = i10;
    }

    public Context d() {
        return this.f40372c;
    }

    public r e() {
        return this.f40370a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f40383n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.f40376g;
    }

    public String h() {
        try {
            if (!TextUtils.isEmpty(this.f40373d)) {
                return this.f40373d;
            }
            Context context = this.f40372c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f40373d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String i() {
        if (!TextUtils.isEmpty(this.f40380k)) {
            return this.f40380k;
        }
        Context context = this.f40372c;
        if (context != null) {
            return (String) x0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject j() {
        return this.f40384o;
    }

    public int k() {
        return this.f40385p;
    }

    public WeakReference<Activity> a() {
        return this.f40374e;
    }

    public void b(e eVar) {
        try {
            l0.C(this.f40372c);
            a(eVar);
            h.a(this.f40372c, this.f40371b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        l0.d(this.f40372c.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    } catch (Throwable th2) {
                        p0.b(f40368q, th2.getMessage());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    l0.d(0);
                }
            }
            try {
                g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                r rVarE = com.mbridge.msdk.foundation.controller.c.m().e();
                if (rVarE != null && rVarE.b() && gVarD != null && gVarD.E() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0263a());
                }
                if (rVarE == null || !rVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                p0.b(f40368q, th3.getMessage());
            }
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
        }
    }

    public void c(e eVar) throws JSONException {
        if (this.f40378i) {
            return;
        }
        l();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f40384o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            p0.b(f40368q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f40380k = str;
            Context context = this.f40372c;
            if (context != null) {
                x0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f40371b = str;
            if (TextUtils.isEmpty(str) || (context = this.f40372c) == null) {
                return;
            }
            x0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f40379j = str;
            if (TextUtils.isEmpty(str) || (context = this.f40372c) == null) {
                return;
            }
            x0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f40374e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f40383n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f40376g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        int i11;
        String str2;
        int i12;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f40382m) == null || !concurrentHashMap.containsKey(str) || !r0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f40382m.get(str);
        BitmapDrawable bitmapDrawableN = u0.n(str3);
        int i13 = TextUtils.isEmpty(str3) ? 2 : 1;
        String str4 = TextUtils.isEmpty(str3) ? "get watermark failed" : bitmapDrawableN != null ? "" : "str to bitmap failed";
        if (bitmapDrawableN == null) {
            i11 = 2;
            i12 = i10;
            str2 = str;
        } else {
            i11 = 1;
            str2 = str;
            i12 = i10;
        }
        j.a(str2, i12, i13, str4, i11, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f40379j)) {
                return this.f40379j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            p0.b(f40368q, th2.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f40384o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f40382m != null && !TextUtils.isEmpty(str) && this.f40382m.containsKey(str)) {
                this.f40382m.remove(str);
            }
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40373d = str;
    }

    public void a(String str, JSONObject jSONObject) throws JSONException {
        if (r0.a().a("w_m_r_l", true)) {
            try {
                if (this.f40377h == null) {
                    this.f40377h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f40377h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f40377h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f40382m == null) {
                        this.f40382m = new ConcurrentHashMap<>();
                    }
                    this.f40382m.put(str, this.f40377h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e10) {
                p0.b(f40368q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f40371b)) {
                return this.f40371b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f40375f = str;
            if (TextUtils.isEmpty(str) || (context = this.f40372c) == null) {
                return;
            }
            x0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            p0.b(f40368q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f40372c = context;
    }
}
