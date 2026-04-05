package tu;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h {
    public static void addSuppressed(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.e0.checkNotNullParameter(th2, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(exception, "exception");
        if (th2 != exception) {
            dv.c.f52904a.addSuppressed(th2, exception);
        }
    }

    public static final StackTraceElement[] getStackTrace(Throwable th2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        kotlin.jvm.internal.e0.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static List<Throwable> getSuppressedExceptions(Throwable th2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(th2, "<this>");
        return dv.c.f52904a.getSuppressed(th2);
    }

    public static String stackTraceToString(Throwable th2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th2) {
    }

    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th2) {
    }
}
