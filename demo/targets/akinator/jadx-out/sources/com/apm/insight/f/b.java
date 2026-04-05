package com.apm.insight.f;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.m;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f12996a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f12997b;

    /* renamed from: c, reason: collision with root package name */
    private String f12998c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12999d;

    /* renamed from: e, reason: collision with root package name */
    private String f13000e;

    /* renamed from: f, reason: collision with root package name */
    private String f13001f;

    /* renamed from: g, reason: collision with root package name */
    private String f13002g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f13003h;

    public final JSONObject b() {
        return this.f12997b;
    }

    public final String c() {
        return this.f12998c;
    }

    public final String d() {
        return this.f13000e;
    }

    public final String e() {
        return this.f13001f;
    }

    public final String f() {
        return this.f13002g;
    }

    public final List<String> g() {
        return this.f13003h;
    }

    public static void a(final Throwable th2, final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.1

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ boolean f13006c = true;

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ Map f13007d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(null, th2, str, this.f13006c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        this.f12998c = str;
    }

    public final void c(String str) {
        this.f13000e = str;
    }

    public final void d(String str) {
        this.f13001f = str;
    }

    public final void e(String str) {
        this.f13002g = str;
    }

    public static void a(final Object obj, final Throwable th2, final String str, final String str2, final String str3) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.2

                /* renamed from: d, reason: collision with root package name */
                private /* synthetic */ boolean f13012d = true;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f13013e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(obj, th2, str, this.f13012d, null, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, Throwable th2, String str, boolean z10, Map<String, String> map, String str2, String str3) {
        if (th2 == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String strA = com.apm.insight.l.m.a(th2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            c cVarA = c.a(stackTraceElement, strA, str, Thread.currentThread().getName(), z10, str2, str3);
            if (obj != null) {
                cVarA.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th2, stackTrace));
            }
            a(null, cVarA);
            f.a().a(CrashType.ENSURE, cVarA);
            g.a(obj, cVarA);
            com.apm.insight.a.b((Object) "[reportException] ".concat(String.valueOf(str)));
        } catch (Throwable th3) {
            com.apm.insight.a.b(th3);
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.3

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ int f13017b = 5;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f13020e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(stackTraceElementArr, this.f13017b, str, str2, "core_exception_monitor", (Map) null);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM, jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void a(StackTraceElement[] stackTraceElementArr, int i10, String str, String str2, String str3, Map map) {
        StackTraceElement stackTraceElement;
        String string;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i10 + 1 && (stackTraceElement = stackTraceElementArr[i10]) != null) {
                    if (stackTraceElementArr.length <= 0) {
                        string = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        while (i10 < stackTraceElementArr.length) {
                            com.apm.insight.l.m.a(stackTraceElementArr[i10], sb2);
                            i10++;
                        }
                        string = sb2.toString();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    c cVarA = c.a(stackTraceElement, string, str, Thread.currentThread().getName(), true, str2, str3);
                    a(null, cVarA);
                    f.a().a(CrashType.ENSURE, cVarA);
                    g.a(cVarA);
                    com.apm.insight.a.b((Object) "[report] ".concat(String.valueOf(str)));
                }
            } catch (Throwable th2) {
                com.apm.insight.a.b(th2);
            }
        }
    }

    public final String a() {
        return this.f12996a;
    }

    public final void a(String str) {
        this.f12996a = str;
    }

    public final void a(JSONObject jSONObject) {
        this.f12997b = jSONObject;
    }

    public final void a(boolean z10) {
        this.f12999d = z10;
    }

    public final void a(List<String> list) {
        this.f13003h = list;
    }
}
