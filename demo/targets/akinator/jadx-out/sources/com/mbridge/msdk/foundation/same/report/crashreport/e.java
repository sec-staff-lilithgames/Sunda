package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.p0;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    private static volatile e f40912d;

    /* renamed from: a, reason: collision with root package name */
    private final String f40913a = "CrashHandlerUtil";

    /* renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f40914b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f40915c;

    private e(Context context) {
        this.f40915c = new WeakReference<>(context);
    }

    public static e a(Context context) {
        if (f40912d == null) {
            synchronized (e.class) {
                try {
                    if (f40912d == null) {
                        f40912d = new e(context);
                    }
                } finally {
                }
            }
        }
        return f40912d;
    }

    private void b(Thread thread, Throwable th2) {
        try {
            List<String> listA = b.a();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            StringBuilder sb2 = new StringBuilder();
            String str = th2.getClass() + ": " + th2.getMessage();
            sb2.append(str);
            sb2.append("\n");
            boolean zA = a(listA, str);
            int i10 = 0;
            for (int i11 = 0; i11 < stackTrace.length; i11++) {
                String string = stackTrace[i11].toString();
                if (a(listA, string)) {
                    zA = true;
                    if (i11 == 0) {
                        i10 = 1;
                    }
                }
                sb2.append(string);
                sb2.append("\n");
            }
            if (zA && sb2.length() >= 1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000052");
                jSONObject.put("crash_first_index_from_mtg", i10);
                JSONObject jSONObjectA = a(String.valueOf(System.currentTimeMillis()));
                jSONObjectA.put("crashinfo", sb2.toString());
                jSONObject.put("exception", jSONObjectA);
                if (jSONObject.length() > 0) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
                try {
                    Thread.sleep(500L);
                    return;
                } catch (InterruptedException e10) {
                    p0.b("CrashHandlerUtil", e10.getMessage());
                    return;
                }
            }
            a(thread, th2);
        } catch (Throwable th3) {
            a(thread, th2);
            p0.b("CrashHandlerUtil", th3.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (th2 != null) {
            try {
                b(thread, th2);
            } catch (Throwable th3) {
                p0.b("CrashHandlerUtil", th3.getMessage());
            }
        }
        a(thread, th2);
    }

    public void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f40914b = defaultUncaughtExceptionHandler;
        if (defaultUncaughtExceptionHandler instanceof e) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f40915c.get() == null) {
                return jSONObject;
            }
            jSONObject.put("max_memory", String.valueOf((float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d)));
            jSONObject.put("memoryby_app", String.valueOf((float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d)));
            jSONObject.put("remaining_memory", (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d));
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th2) {
            p0.b("CrashHandlerUtil", th2.getMessage());
            return jSONObject;
        }
    }

    private boolean a(List<String> list, String str) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(Thread thread, Throwable th2) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f40914b;
            if (uncaughtExceptionHandler != null) {
                if (uncaughtExceptionHandler instanceof e) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                Process.killProcess(Process.myPid());
                System.exit(1);
            }
        } catch (Throwable th3) {
            p0.b("CrashHandlerUtil", th3.getMessage());
        }
    }
}
