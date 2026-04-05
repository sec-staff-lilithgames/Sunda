package com.apm.insight.l;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static String f13184a;

    /* renamed from: b, reason: collision with root package name */
    private static File f13185b;

    /* renamed from: c, reason: collision with root package name */
    private static File f13186c;

    public static File a(Context context) {
        return new File(j(context), "apminsight/CrashLogJava");
    }

    public static File b(Context context) {
        return new File(j(context), "apminsight/CrashLogSimple");
    }

    public static File c(Context context) {
        return new File(j(context), "apminsight/RuntimeContext");
    }

    public static File d(Context context) {
        if (f13185b == null) {
            if (context == null) {
                context = com.apm.insight.e.g();
            }
            f13185b = new File(j(context), "apminsight/CrashLogNative");
        }
        return f13185b;
    }

    public static File e(Context context) {
        if (f13186c == null) {
            f13186c = new File(j(context) + "/apminsight/CrashCommonLog/" + com.apm.insight.e.f());
        }
        return f13186c;
    }

    public static File f(Context context) {
        return new File(j(context), "apminsight/CrashCommonLog");
    }

    public static File g(Context context) {
        return new File(j(context), "apminsight/issueCrashTimes");
    }

    public static File h(Context context) {
        return new File(j(context) + "/apminsight/issueCrashTimes/current.times");
    }

    public static File i(Context context) {
        return new File(j(context), "apminsight/alogCrash");
    }

    public static File j(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "threads.txt");
    }

    public static File k(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "meminfo.txt");
    }

    public static File l(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "pthreads.txt");
    }

    public static File m(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "rountines.txt");
    }

    public static File n(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "leakd_threads.txt");
    }

    public static File o(File file) {
        return new File(file, "abortmsg.txt");
    }

    public static File a() {
        File file = f13185b;
        return file == null ? d(com.apm.insight.e.g()) : file;
    }

    public static String b() {
        return "anr_" + com.apm.insight.e.e();
    }

    public static String c() {
        return a.b.k("ensure_", com.apm.insight.e.e());
    }

    public static File f(File file) {
        return new File(file, "upload.json");
    }

    public static File g(File file) {
        return new File(file, "javastack.txt");
    }

    public static File h(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "logcat.txt");
    }

    public static File i(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "fds.txt");
    }

    public static String j(Context context) {
        if (TextUtils.isEmpty(f13184a)) {
            try {
                f13184a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e10) {
                f13184a = "/sdcard/";
                e10.printStackTrace();
            }
        }
        return f13184a;
    }

    public static File b(File file) {
        return new File(file, "tombstone.txt");
    }

    public static File f(String str) {
        return new File(a(com.apm.insight.e.g(), str), "rountines.txt");
    }

    public static File g(String str) {
        return new File(a(com.apm.insight.e.g(), str), "leakd_threads.txt");
    }

    public static File a(Context context, String str) {
        return new File(j(context) + "/apminsight/CrashCommonLog/" + str);
    }

    public static File b(String str) {
        return new File(a(com.apm.insight.e.g(), str), "fds.txt");
    }

    public static File e(File file) {
        return new File(file, "callback.json");
    }

    public static String a(String str) {
        return "dart_".concat(String.valueOf(str));
    }

    public static File d(File file) {
        return new File(a(com.apm.insight.e.g(), file.getName()), "maps.txt");
    }

    public static File e(String str) {
        return new File(a(com.apm.insight.e.g(), str), "pthreads.txt");
    }

    public static File a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    public static File d(String str) {
        return new File(a(com.apm.insight.e.g(), str), "meminfo.txt");
    }

    public static File a(File file) {
        return new File(file, "flog.txt");
    }

    public static File c(File file) {
        return new File(file, "header.bin");
    }

    public static File c(String str) {
        return new File(a(com.apm.insight.e.g(), str), "threads.txt");
    }
}
