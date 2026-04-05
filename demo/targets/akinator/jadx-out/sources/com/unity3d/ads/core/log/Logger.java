package com.unity3d.ads.core.log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Logger {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.error(str, th2);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.trace(str, th2);
        }
    }

    void debug(String str);

    void error(String str, Throwable th2);

    LogLevel getLogLevel();

    void info(String str);

    void setLogLevel(LogLevel logLevel);

    void trace(String str, Throwable th2);
}
