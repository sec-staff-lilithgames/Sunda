package com.ironsource;

import java.lang.Thread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3389p4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f38123a;

    public C3389p4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f38123a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C3406q4 c3406q4 = new C3406q4(th2);
        if (c3406q4.d()) {
            new P5(c3406q4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f38123a.uncaughtException(thread, th2);
    }
}
