package hi;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f58804a;

    /* renamed from: b, reason: collision with root package name */
    public final pi.j f58805b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f58806c;

    /* renamed from: d, reason: collision with root package name */
    public final ei.a f58807d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f58808e = new AtomicBoolean(false);

    public e0(d0 d0Var, pi.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ei.a aVar) {
        this.f58804a = d0Var;
        this.f58805b = jVar;
        this.f58806c = uncaughtExceptionHandler;
        this.f58807d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            ei.f.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            ei.f.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f58807d.hasCrashDataForCurrentSession()) {
            return true;
        }
        ei.f.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f58806c;
        AtomicBoolean atomicBoolean = this.f58808e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    ((n) this.f58804a).onUncaughtException(this.f58805b, thread, th2);
                } else {
                    ei.f.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (uncaughtExceptionHandler != null) {
                    ei.f.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    ei.f.getLogger().d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e10) {
                ei.f.getLogger().e("An error occurred in the uncaught exception handler", e10);
                if (uncaughtExceptionHandler != null) {
                    ei.f.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    ei.f.getLogger().d("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th3) {
            if (uncaughtExceptionHandler != null) {
                ei.f.getLogger().d("Completed exception processing. Invoking default exception handler.");
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                ei.f.getLogger().d("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
