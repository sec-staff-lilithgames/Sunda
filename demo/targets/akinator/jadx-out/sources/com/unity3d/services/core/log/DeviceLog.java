package com.unity3d.services.core.log;

import a.b;
import android.util.Log;
import b0.e2;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceLog {
    private static boolean FORCE_DEBUG_LOG = false;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 3072;
    private static final HashMap<UnityAdsLogLevel, DeviceLogLevel> _deviceLogLevel;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.log.DeviceLog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel;

        static {
            int[] iArr = new int[UnityAdsLogLevel.values().length];
            $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel = iArr;
            try {
                iArr[UnityAdsLogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[UnityAdsLogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[UnityAdsLogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[UnityAdsLogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<UnityAdsLogLevel, DeviceLogLevel> map = new HashMap<>();
        _deviceLogLevel = map;
        if (map.size() == 0) {
            map.put(UnityAdsLogLevel.INFO, new DeviceLogLevel("i"));
            map.put(UnityAdsLogLevel.DEBUG, new DeviceLogLevel(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D));
            map.put(UnityAdsLogLevel.WARNING, new DeviceLogLevel("w"));
            map.put(UnityAdsLogLevel.ERROR, new DeviceLogLevel("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            FORCE_DEBUG_LOG = true;
        }
    }

    private static String checkMessage(String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    private static DeviceLogEntry createLogEntry(UnityAdsLogLevel unityAdsLogLevel, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        DeviceLogLevel logLevel = getLogLevel(unityAdsLogLevel);
        if (logLevel == null) {
            return null;
        }
        int i10 = 0;
        boolean z10 = false;
        while (i10 < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (stackTraceElement.getClassName().equals(DeviceLog.class.getName())) {
                z10 = true;
            }
            if (!stackTraceElement.getClassName().equals(DeviceLog.class.getName()) && z10) {
                break;
            }
            i10++;
        }
        StackTraceElement stackTraceElement2 = i10 < stackTrace.length ? stackTrace[i10] : null;
        if (stackTraceElement2 != null) {
            return new DeviceLogEntry(logLevel, str, stackTraceElement2);
        }
        return null;
    }

    public static void debug(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (isDebugEnabled()) {
            if (str.length() <= MAX_DEBUG_MSG_LENGTH) {
                write(UnityAdsLogLevel.DEBUG, checkMessage(str));
                return;
            }
            debug(str.substring(0, MAX_DEBUG_MSG_LENGTH));
            if (str.length() < 30720) {
                debug(str.substring(MAX_DEBUG_MSG_LENGTH));
            }
        }
    }

    public static void entered() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        debug("ENTERED METHOD");
    }

    public static void error(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        write(UnityAdsLogLevel.ERROR, checkMessage(str));
    }

    private static DeviceLogLevel getLogLevel(UnityAdsLogLevel unityAdsLogLevel) {
        return _deviceLogLevel.get(unityAdsLogLevel);
    }

    public static void info(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        write(UnityAdsLogLevel.INFO, checkMessage(str));
    }

    private static boolean isDebugEnabled() {
        return LOG_DEBUG || FORCE_DEBUG_LOG;
    }

    public static void setLogLevel(int i10) {
        if (i10 >= 8) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = true;
            return;
        }
        if (i10 >= 4) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = false;
            return;
        }
        if (i10 >= 2) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        if (i10 >= 1) {
            LOG_ERROR = true;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        LOG_ERROR = false;
        LOG_WARNING = false;
        LOG_INFO = false;
        LOG_DEBUG = false;
    }

    public static void warning(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        write(UnityAdsLogLevel.WARNING, checkMessage(str));
    }

    private static void write(UnityAdsLogLevel unityAdsLogLevel, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[unityAdsLogLevel.ordinal()];
        if (FORCE_DEBUG_LOG ? true : i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? true : LOG_ERROR : LOG_WARNING : LOG_DEBUG : LOG_INFO) {
            writeToLog(createLogEntry(unityAdsLogLevel, str));
        }
    }

    private static void writeToLog(DeviceLogEntry deviceLogEntry) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (deviceLogEntry == null || deviceLogEntry.getLogLevel() == null) {
            return;
        }
        try {
            method = Log.class.getMethod(deviceLogEntry.getLogLevel().getReceivingMethodName(), String.class, String.class);
        } catch (Exception e10) {
            Log.e(Q6.G1, "Writing to log failed!", e10);
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(null, deviceLogEntry.getLogLevel().getLogTag(), deviceLogEntry.getParsedMessage());
            } catch (Exception e11) {
                Log.e(Q6.G1, "Writing to log failed!", e11);
            }
        }
    }

    public static void error(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        error(String.format(str, objArr));
    }

    public static void exception(String str, Exception exc) {
        if (str == null) {
            str = "";
        }
        String str2 = uQjDr.YNZBCrSCtvp;
        if (exc != null) {
            str = e2.l(exc, b.t(str, str2));
        }
        if (exc != null && exc.getCause() != null) {
            StringBuilder sbT = b.t(str, str2);
            sbT.append(exc.getCause().getMessage());
            str = sbT.toString();
        }
        write(UnityAdsLogLevel.ERROR, str);
    }

    public static void info(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        info(String.format(str, objArr));
    }

    public static void warning(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        warning(String.format(str, objArr));
    }

    public static void debug(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (isDebugEnabled()) {
            debug(String.format(str, objArr));
        }
    }
}
