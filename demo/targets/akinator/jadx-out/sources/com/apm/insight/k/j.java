package com.apm.insight.k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static File f13152a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13153b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13154c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f13155d;

    public static boolean a() {
        return f13153b;
    }

    public static boolean b() {
        return f13154c;
    }

    public static void c() {
        if (f13153b) {
            return;
        }
        f13154c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, "\n")), false);
                f13153b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f13155d;
        if (map != null) {
            map.clear();
        }
    }

    public static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = f13155d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            f13155d = mapC;
            if (mapC == null) {
                f13155d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f13155d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = false;
            for (Map.Entry<String, String> entry : f13155d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.a.a(th2);
                }
            }
            if (z10) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z10;
        } catch (Throwable th3) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th3);
            return true;
        }
    }

    private static File h() {
        if (f13152a == null) {
            f13152a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f13152a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), f13155d);
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str) {
        if (f13155d == null) {
            f13155d = new HashMap();
        }
        f13155d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
