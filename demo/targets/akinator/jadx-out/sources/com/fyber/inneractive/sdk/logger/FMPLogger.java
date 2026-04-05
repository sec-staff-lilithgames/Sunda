package com.fyber.inneractive.sdk.logger;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class FMPLogger {
    public abstract void debug(String str, Object... objArr);

    public abstract void error(String str, Throwable th2, Object... objArr);

    public abstract void info(String str, Object... objArr);

    public abstract void initialize(Context context);

    public abstract void log(int i10, Exception exc, String str, Object... objArr);

    public abstract void verbose(String str, Throwable th2, Object... objArr);

    public abstract void verbose(String str, Object... objArr);

    public abstract void warning(String str, Object... objArr);
}
