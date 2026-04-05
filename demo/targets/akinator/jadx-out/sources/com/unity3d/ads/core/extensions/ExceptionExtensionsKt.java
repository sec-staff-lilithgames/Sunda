package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import gv.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.e0;
import rv.f0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th2, int i10) {
        e0.checkNotNullParameter(th2, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th2.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    e0.checkNotNullExpressionValue(string, "stringWriter.toString()");
                    String strJoinToString$default = f0.joinToString$default(f0.take(n0.lineSequence(n0.trim(string).toString()), i10), "\n", null, null, 0, null, null, 62, null);
                    d.closeFinally(printWriter, null);
                    d.closeFinally(stringWriter, null);
                    return strJoinToString$default;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 15;
        }
        return getShortenedStackTrace(th2, i10);
    }

    public static final String retrieveUnityCrashValue(Throwable th2) {
        StackTraceElement stackTraceElement;
        boolean zContains$default;
        String className;
        e0.checkNotNullParameter(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        e0.checkNotNullExpressionValue(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            stackTraceElement = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i10];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                zContains$default = false;
            } else {
                e0.checkNotNullExpressionValue(className, "className");
                zContains$default = n0.contains$default((CharSequence) className, (CharSequence) SDKErrorHandler.UNITY_PACKAGE, false, 2, (Object) null);
            }
            if (zContains$default) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            } else {
                e0.checkNotNullExpressionValue(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }
}
