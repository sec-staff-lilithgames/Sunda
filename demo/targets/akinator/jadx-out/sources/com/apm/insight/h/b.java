package com.apm.insight.h;

import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.n;
import com.ironsource.C3191e4;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f13052a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f13053b;

    public b(File file) {
        String strA;
        File fileC = j.c(file);
        if (!fileC.exists() || fileC.length() == 0 || (strA = NativeImpl.a(fileC.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strA.split("\n");
        this.f13053b = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(C3191e4.i.f36525b);
            if (strArrSplit2.length == 2) {
                this.f13053b.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    public static String a(String str) {
        return e.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        m.a().a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* renamed from: a, reason: collision with root package name */
            private boolean f13054a = false;

            @Override // java.lang.Runnable
            public final void run() {
                String strA;
                b.b();
                if (b.c(str)) {
                    return;
                }
                n.a("updateSo", str);
                File file = new File(b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                String str2 = "doUnpackLibrary: " + str;
                if (e.i().isDebugMode()) {
                    Log.w("npth", str2);
                }
                try {
                    strA = c.a(e.g(), str, file);
                } catch (Throwable th2) {
                    n.a("updateSoError", str);
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                    strA = null;
                }
                if (strA != null) {
                    if (this.f13054a) {
                        n.a("updateSoFailed", str);
                        return;
                    }
                    this.f13054a = true;
                    n.a("updateSoPostRetry", str);
                    m.a().a(this, 3000L);
                    return;
                }
                b.f13052a.put(file.getName(), "2008-20250701130429");
                try {
                    f.a(new File(e.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "2008-20250701130429", false);
                } catch (Throwable unused) {
                }
                n.a("updateSoSuccess", str);
            }
        });
    }

    public final boolean d() {
        Map<String, String> map = this.f13053b;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f13053b.get("process_name")) || TextUtils.isEmpty(this.f13053b.get("crash_thread_name")) || TextUtils.isEmpty(this.f13053b.get("pid")) || TextUtils.isEmpty(this.f13053b.get(ScarConstants.TOKEN_ID_KEY)) || TextUtils.isEmpty(this.f13053b.get("start_time")) || TextUtils.isEmpty(this.f13053b.get("crash_time")) || TextUtils.isEmpty(this.f13053b.get("signal_line"))) ? false : true;
    }

    public final String e() {
        return this.f13053b.get("signal_line");
    }

    public final Map<String, String> f() {
        return this.f13053b;
    }

    public static String a() {
        return e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static /* synthetic */ void b() {
        if (f13052a == null) {
            f13052a = new HashMap<>();
            File file = new File(e.g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f13052a.put(str.substring(0, str.length() - 4), f.a(file.getAbsolutePath() + "/" + str, "\n"));
                        } catch (Throwable th2) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        f.a(new File(file, str));
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean c(String str) {
        return "2008-20250701130429".equals(f13052a.get(str)) && new File(a(str)).exists();
    }
}
