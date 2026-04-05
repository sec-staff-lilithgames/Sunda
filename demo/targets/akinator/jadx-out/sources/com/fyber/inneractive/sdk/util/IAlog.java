package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.ironsource.C3191e4;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class IAlog {

    /* renamed from: a, reason: collision with root package name */
    public static int f26748a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.logger.a f26749b = new com.fyber.inneractive.sdk.logger.a();

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f26750c = new x0();

    public static void a(String str, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    public static void f(String str, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    public static void a(String str, Throwable th2, Object... objArr) {
        Iterator it = f26750c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th2, objArr);
        }
    }

    public static String a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + C3191e4.i.f36529d + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    public static String a(Class cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + C3191e4.i.f36529d + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
