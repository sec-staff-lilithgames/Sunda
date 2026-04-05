package com.bykv.vk.openvk.preload.geckox.logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class GeckoLogger {
    private static boolean DEBUG = false;
    private static Logger sLogger = new DefaultLogger();

    public static void d(String str, Object... objArr) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.d(str, objArr);
    }

    public static void disable() {
        DEBUG = false;
    }

    public static void e(String str, String str2, Throwable th2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.e(str, str2, th2);
    }

    public static void enable() {
        DEBUG = true;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void redirect(Logger logger) {
        sLogger = logger;
    }

    public static void w(String str, String str2, Throwable th2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.w(str, str2, th2);
    }

    public static void w(String str, String str2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.w(str, str2);
    }
}
