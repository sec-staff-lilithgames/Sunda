package com.apm.insight.l;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.ironsource.Q6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f13156a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f13157b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Field f13158c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Field f13159d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f13160e = false;

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        return i10 << 10;
    }

    public static boolean b(Context context) {
        String strB = b();
        if (strB != null && strB.contains(":")) {
            return false;
        }
        if (strB == null || !strB.equals(context.getPackageName())) {
            return strB != null && strB.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    private static String c() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private static String d() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    private static String e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i10 = bufferedReader.read();
                if (i10 <= 0) {
                    String string = sb2.toString();
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    return string;
                }
                sb2.append((char) i10);
            }
        } catch (Throwable unused2) {
            com.apm.insight.a.a((Closeable) bufferedReader);
            return null;
        }
    }

    public static boolean a() {
        return com.apm.insight.runtime.a.b.d().f();
    }

    public static ActivityManager.ProcessErrorStateInfo a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                    return processErrorStateInfo;
                }
            }
        }
        return null;
    }

    public static String c(Context context) {
        Class<?> clsE = e(context);
        if (f13158c == null && clsE != null) {
            try {
                f13158c = clsE.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f13158c;
        if (field != null) {
            try {
                return String.valueOf(field.get(null));
            } catch (Throwable unused2) {
                return "";
            }
        }
        return "";
    }

    public static String b() {
        if (!TextUtils.isEmpty(f13156a)) {
            return f13156a;
        }
        String strC = c();
        f13156a = strC;
        if (!TextUtils.isEmpty(strC)) {
            return f13156a;
        }
        String strD = d();
        f13156a = strD;
        if (!TextUtils.isEmpty(strD)) {
            return f13156a;
        }
        String strE = e();
        f13156a = strE;
        if (strE == null) {
            f13156a = "";
        }
        return f13156a;
    }

    public static int d(Context context) {
        Class<?> clsE = e(context);
        if (f13159d == null && clsE != null) {
            try {
                f13159d = clsE.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f13159d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    public static void a(String str) {
        f13156a = str;
    }

    private static Class<?> e(Context context) {
        if (f13157b == null && !f13160e) {
            try {
                f13157b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f13160e = true;
        }
        return f13157b;
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
            jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
            jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
            jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
            jSONObject2.put("nativePss", a(memoryInfo.nativePss));
            jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
            jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
            jSONObject2.put("otherPss", a(memoryInfo.otherPss));
            jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("totalPrivateClean", c.a(memoryInfo));
            jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
            jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
            jSONObject2.put("totalSharedClean", c.b(memoryInfo));
            jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
            jSONObject2.put("totalSwappablePss", a(c.c(memoryInfo)));
            jSONObject.put("memory_info", jSONObject2);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                JSONObject jSONObject3 = new JSONObject();
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo2);
                jSONObject3.put(Q6.f35308w, memoryInfo2.availMem);
                jSONObject3.put("lowMemory", memoryInfo2.lowMemory);
                jSONObject3.put("threshold", memoryInfo2.threshold);
                jSONObject3.put("totalMem", i.a(memoryInfo2));
                jSONObject.put("sys_memory_info", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            com.apm.insight.entity.a.a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
            jSONObject4.put("native_heap_size", Debug.getNativeHeapSize());
            jSONObject4.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
            jSONObject4.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.freeMemory();
            long j10 = runtime.totalMemory();
            jSONObject4.put("max_memory", jMaxMemory);
            jSONObject4.put("free_memory", jFreeMemory);
            jSONObject4.put("total_memory", j10);
            com.apm.insight.entity.a.a(jSONObject, "filters", "java_heap_leak", String.valueOf(((float) (j10 - jFreeMemory)) > ((float) jMaxMemory) * 0.95f));
            if (activityManager != null) {
                jSONObject4.put("memory_class", activityManager.getMemoryClass());
                jSONObject4.put("large_memory_class", activityManager.getLargeMemoryClass());
            }
            jSONObject.put("app_memory_info", jSONObject4);
        } catch (Throwable unused2) {
        }
    }
}
