package com.moloco.sdk.internal.error.crash.filters;

import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {
    @Override // com.moloco.sdk.internal.error.crash.filters.a
    public boolean a(Throwable crash) {
        e0.checkNotNullParameter(crash, "crash");
        StackTraceElement[] stackTrace = crash.getStackTrace();
        e0.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            e0.checkNotNullExpressionValue(className, "getClassName(...)");
            if (n0.contains$default((CharSequence) className, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoSDKExceptionFilter", "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        Throwable cause = crash.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            e0.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                String className2 = stackTraceElement2.getClassName();
                e0.checkNotNullExpressionValue(className2, "getClassName(...)");
                if (n0.contains$default((CharSequence) className2, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoSDKExceptionFilter", "SDK detected in stacktrace", null, false, 12, null);
                    return true;
                }
            }
        }
        return false;
    }
}
