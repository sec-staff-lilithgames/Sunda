package jw;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f69958a = new d();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        e0.checkNotNullParameter(record, "record");
        c cVar = c.f69955a;
        String loggerName = record.getLoggerName();
        e0.checkNotNullExpressionValue(loggerName, "getLoggerName(...)");
        int iAccess$getAndroidLevel = e.access$getAndroidLevel(record);
        String message = record.getMessage();
        e0.checkNotNullExpressionValue(message, "getMessage(...)");
        cVar.androidLog$okhttp(loggerName, iAccess$getAndroidLevel, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
