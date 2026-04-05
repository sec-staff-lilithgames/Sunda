package com.unity3d.ads.core.log;

import android.util.Log;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityLogger implements Logger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UnityAds";
    private LogLevel logLevel = LogLevel.INFO;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean canLog(int i10) {
        return Log.isLoggable("UnityAds", i10) && i10 >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(String message) {
        e0.checkNotNullParameter(message, "message");
        if (canLog(3)) {
            Log.d("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(String message, Throwable th2) {
        e0.checkNotNullParameter(message, "message");
        if (canLog(6)) {
            Log.e("UnityAds", message, th2);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(String message) {
        e0.checkNotNullParameter(message, "message");
        if (canLog(4)) {
            Log.i("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(LogLevel logLevel) {
        e0.checkNotNullParameter(logLevel, "<set-?>");
        this.logLevel = logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(String message, Throwable th2) {
        e0.checkNotNullParameter(message, "message");
        if (canLog(2)) {
            Log.v("UnityAds", message, th2);
        }
    }
}
