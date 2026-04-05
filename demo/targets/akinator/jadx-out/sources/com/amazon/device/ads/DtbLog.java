package com.amazon.device.ads;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbLog {
    public static final String DEBUG_ERROR = "DTBERROR::";
    public static boolean androidLogAvailable = false;
    public static boolean isCallerInfoEnabled = false;
    public static final Object listenerLock;
    public static DTBLogLevel logLevel = null;
    public static DtbLogListener logListener = null;
    public static final String sdkName = "Amazon DTB Ads API";

    static {
        try {
            Log.isLoggable("1234", 7);
            androidLogAvailable = true;
        } catch (Throwable unused) {
            androidLogAvailable = false;
        }
        listenerLock = new Object();
        isCallerInfoEnabled = false;
        logLevel = DTBLogLevel.Warn;
    }

    public static void debug(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(getTag(), str);
    }

    public static void debugError(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(getTag(), DEBUG_ERROR + str);
    }

    public static void enableCallerInfo(boolean z10) {
        isCallerInfoEnabled = z10;
    }

    public static void error(String str) {
        if (logLevel.intValue() > DTBLogLevel.Error.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, String str2) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Fatal;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static String getCallerInfo() {
        StackTraceElement stackTraceElement;
        if (!isCallerInfoEnabled) {
            return "Amazon DTB Ads API";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            int i10 = 0;
            while (i10 < stackTrace.length) {
                String className = stackTrace[i10].getClassName();
                if (className.startsWith("dalvik") || className.startsWith("java")) {
                    i10++;
                } else {
                    int i11 = i10 + 2;
                    if (i11 < stackTrace.length) {
                        i10 = i11;
                    }
                    stackTraceElement = stackTrace[i10];
                }
            }
            stackTraceElement = null;
        } else {
            stackTraceElement = null;
        }
        if (stackTraceElement == null) {
            return "Amazon DTB Ads API";
        }
        return stackTraceElement.getClassName() + ":" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }

    public static String getTag() {
        return isCallerInfoEnabled ? getCallerInfo() : "Amazon DTB Ads API";
    }

    public static void info(String str) {
        if (logLevel.intValue() > DTBLogLevel.Info.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(getTag(), str);
    }

    public static void postMessageToListener(String str, DTBLogLevel dTBLogLevel, String str2) {
        if (logListener == null) {
            return;
        }
        synchronized (listenerLock) {
            try {
                DtbLogListener dtbLogListener = logListener;
                if (dtbLogListener != null && str.equals(dtbLogListener.getTag())) {
                    logListener.postMessage(dTBLogLevel, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setLogLevel(DTBLogLevel dTBLogLevel) {
        logLevel = dTBLogLevel;
    }

    public static void warn(String str) {
        if (logLevel.intValue() > DTBLogLevel.Warn.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(getTag(), str);
    }

    public static void debug(String str, String str2) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void debugError(String str, String str2) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, DEBUG_ERROR + str2);
        postMessageToListener(str, dTBLogLevel, DEBUG_ERROR + str2);
    }

    public static void error(String str, String str2) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Error;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void info(String str, String str2) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Info;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void warn(String str, String str2) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Warn;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void fatal(String str) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, Exception exc) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str, exc);
    }

    public static void fatal(String str, String str2, Exception exc) {
        int iIntValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Fatal;
        if (iIntValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2, exc);
        postMessageToListener(str, dTBLogLevel, str2);
    }
}
