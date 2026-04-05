package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.b.d;
import com.apm.insight.b.f;
import com.apm.insight.e;
import com.apm.insight.l.j;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class NativeImpl {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f13196a = false;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f13197b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13198c = true;

    public static boolean a() {
        if (f13197b) {
            return f13196a;
        }
        f13197b = true;
        if (!f13196a) {
            f13196a = com.apm.insight.a.b("apminsighta");
        }
        return f13196a;
    }

    public static int b() {
        if (f13196a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    public static void c() {
    }

    public static void d() {
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i10);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i10, int i11, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i10);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i10);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j10);

    private static native void doSetAlogLogDirAddr(long j10);

    private static native void doSetResendSigQuit(int i10);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i10, String str, String str2, String str3, int i11);

    private static native void doStartAnrMonitor(int i10);

    private static native void doWriteFile(int i10, String str, int i11);

    public static boolean e() {
        if (!f13196a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f() {
        if (!f13196a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void g() {
        new Thread(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    NativeImpl.l();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.c.a(th2, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    public static int h(String str) {
        if (!f13196a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    public static void i(String str) {
        if (f13196a) {
            doDump(str);
        }
    }

    private static native boolean is64Bit();

    public static void j() {
        if (f13196a) {
            doSetUploadEnd();
        }
    }

    public static void k() {
        if (f13196a) {
            doInitThreadDump();
        }
    }

    public static /* synthetic */ void l() {
        if (f13196a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            e.j();
            d.c();
            f.a(e.g()).a().e();
        } catch (Throwable unused) {
        }
    }

    public static int c(String str) {
        if (f13196a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void d(String str) {
        if (f13196a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(long j10) {
        if (f13196a) {
            try {
                doSetAlogLogDirAddr(j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str) {
        if (f13196a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void f(String str) {
        if (f13196a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean h() {
        return f13198c;
    }

    public static void i() {
        if (f13196a) {
            doSignalMainThread();
        }
    }

    public static void g(String str) {
        if (f13196a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str) {
        if (f13196a) {
            doDumpHprof(str);
        }
    }

    public static boolean a(Context context) {
        String strA;
        boolean zA = a();
        if (zA) {
            String str = j.j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                strA = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strA = com.apm.insight.h.b.a();
                com.apm.insight.h.b.b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, strA, str, e.f(), e.m());
        }
        return zA;
    }

    public static void b(int i10) {
        if (f13196a) {
            try {
                doCloseFile(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(long j10) {
        if (f13196a) {
            try {
                doSetAlogFlushAddr(j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(String str) {
        if (f13196a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    public static void a(File file) {
        if (f13196a) {
            doRebuildTombstone(j.c(file).getAbsolutePath(), j.b(file).getAbsolutePath(), j.d(file).getAbsolutePath());
        }
    }

    public static int a(int i10) {
        if (f13196a && i10 >= 0) {
            try {
                return doLock("", i10);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void a(String str, String str2, String str3) {
        if (f13196a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(int i10, String str) {
        if (!f13196a || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i10, str, str.length());
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z10) {
        f13198c = z10;
        if (f13196a) {
            doSetResendSigQuit(z10 ? 1 : 0);
        }
    }
}
