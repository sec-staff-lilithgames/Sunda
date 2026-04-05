package com.apm.insight;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable th2, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}
