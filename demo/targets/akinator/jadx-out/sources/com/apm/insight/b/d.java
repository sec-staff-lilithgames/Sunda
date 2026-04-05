package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.b.h;
import com.apm.insight.l.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f12862a = null;

    /* renamed from: b, reason: collision with root package name */
    private static long f12863b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f12864c = false;

    /* renamed from: d, reason: collision with root package name */
    private static FileObserver f12865d;

    /* renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f12866e;

    public static boolean b() {
        return f12864c;
    }

    public static void c() {
        f12866e = null;
    }

    public static void a(final String str, final h.a aVar) {
        FileObserver fileObserver = f12865d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i10, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f12862a = aVar.a();
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        };
        f12865d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static JSONObject a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", m.a(stackTrace));
            return jSONObject;
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            return null;
        }
    }

    public static String a(Context context) {
        if (SystemClock.uptimeMillis() - f12863b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = com.apm.insight.l.a.a(context);
            if (processErrorStateInfoA != null && Process.myPid() == processErrorStateInfoA.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f12866e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfoA.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfoA.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfoA.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfoA.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfoA.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfoA.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfoA.longMsg))) {
                    return null;
                }
                f12866e = processErrorStateInfoA;
                f12862a = null;
                f12863b = SystemClock.uptimeMillis();
                f12864c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb2 = new StringBuilder("|------------- processErrorStateInfo--------------|\n");
                sb2.append("condition: " + processErrorStateInfoA.condition + "\n");
                sb2.append("processName: " + processErrorStateInfoA.processName + "\n");
                sb2.append("pid: " + processErrorStateInfoA.pid + "\n");
                sb2.append("uid: " + processErrorStateInfoA.uid + "\n");
                sb2.append("tag: " + processErrorStateInfoA.tag + "\n");
                sb2.append("shortMsg : " + processErrorStateInfoA.shortMsg + "\n");
                sb2.append("longMsg : " + processErrorStateInfoA.longMsg + "\n");
                sb2.append("-----------------------end----------------------------");
                return sb2.toString();
            }
        } catch (Throwable unused) {
        }
        String str = f12862a;
        if (str == null) {
            return null;
        }
        f12864c = true;
        f12862a = null;
        f12863b = SystemClock.uptimeMillis();
        return str;
    }
}
