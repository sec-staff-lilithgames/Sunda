package io.sfbx.appconsent.logger;

import android.util.Log;
import io.sfbx.appconsent.logger.ACLoggerContract;
import io.sfbx.appconsent.logger.tree.ACTree;
import io.sfbx.appconsent.logger.tree.ACTreeContract;
import io.sfbx.appconsent.logger.type.ACLogType;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ACLogger implements ACLoggerContract {
    public static final ACLogger INSTANCE;
    private static final String tag;
    private static final ACTreeContract treeLogger;

    static {
        ACLogger aCLogger = new ACLogger();
        INSTANCE = aCLogger;
        tag = "ACLogger";
        treeLogger = new ACTree();
        e0.checkNotNullExpressionValue("ACLogger", "tag");
        ACLoggerContract.DefaultImpls.d$default(aCLogger, "ACLogger", ">><< ACDebugTree planted on " + aCLogger, null, 4, null);
    }

    private ACLogger() {
    }

    private final String buildFullMessageLog(String str, Throwable th2) {
        String stackTraceString = Log.getStackTraceString(th2);
        e0.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(throwable)");
        return str + System.lineSeparator() + stackTraceString;
    }

    private final void logger(ACLogType aCLogType, String str, String str2, Throwable th2) {
        treeLogger.log(aCLogType, str, str2, th2);
    }

    public static /* synthetic */ void logger$default(ACLogger aCLogger, ACLogType aCLogType, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            th2 = null;
        }
        aCLogger.logger(aCLogType, str, str2, th2);
    }

    @Override // io.sfbx.appconsent.logger.ACLoggerContract
    public void d(String tag2, String msg, Throwable th2) {
        e0.checkNotNullParameter(tag2, "tag");
        e0.checkNotNullParameter(msg, "msg");
        logger(ACLogType.DEBUG, tag2, buildFullMessageLog(msg, th2), th2);
    }

    @Override // io.sfbx.appconsent.logger.ACLoggerContract
    public void e(String tag2, String msg, Throwable th2) {
        e0.checkNotNullParameter(tag2, "tag");
        e0.checkNotNullParameter(msg, "msg");
        logger(ACLogType.ERROR, tag2, buildFullMessageLog(msg, th2), th2);
    }

    @Override // io.sfbx.appconsent.logger.ACLoggerContract
    public void i(String tag2, String msg, Throwable th2) {
        e0.checkNotNullParameter(tag2, "tag");
        e0.checkNotNullParameter(msg, "msg");
        logger$default(this, ACLogType.INFO, tag2, buildFullMessageLog(msg, th2), null, 8, null);
    }

    @Override // io.sfbx.appconsent.logger.ACLoggerContract
    public void w(String tag2, String msg, Throwable th2) {
        e0.checkNotNullParameter(tag2, "tag");
        e0.checkNotNullParameter(msg, "msg");
        logger$default(this, ACLogType.WARNING, tag2, buildFullMessageLog(msg, th2), null, 8, null);
    }

    @Override // io.sfbx.appconsent.logger.ACLoggerContract
    public void e(String tag2, Throwable throwable) {
        e0.checkNotNullParameter(tag2, "tag");
        e0.checkNotNullParameter(throwable, "throwable");
        logger(ACLogType.ERROR, tag2, buildFullMessageLog(String.valueOf(throwable.getMessage()), throwable), throwable);
    }
}
