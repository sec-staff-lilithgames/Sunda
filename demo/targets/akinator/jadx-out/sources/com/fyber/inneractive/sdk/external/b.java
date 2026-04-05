package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f23513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f23514b;

    public b(SharedPreferences sharedPreferences, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f23513a = sharedPreferences;
        this.f23514b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        SharedPreferences sharedPreferences = this.f23513a;
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        if (string.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", string).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th2.getClass().getName()).putString("FyberDescriptionKey", th2.getLocalizedMessage()).commit();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f23514b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
