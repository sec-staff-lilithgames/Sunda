package cx;

import bx.e;
import dx.h;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a implements bx.a {

    /* renamed from: b, reason: collision with root package name */
    public final String f51262b;

    /* renamed from: c, reason: collision with root package name */
    public final h f51263c;

    /* renamed from: e, reason: collision with root package name */
    public final Queue f51264e;

    public a(h hVar, Queue<d> queue) {
        this.f51263c = hVar;
        this.f51262b = hVar.getName();
        this.f51264e = queue;
    }

    public final void a(b bVar, String str, Object[] objArr, Throwable th2) {
        d dVar = new d();
        dVar.setTimeStamp(System.currentTimeMillis());
        dVar.setLevel(bVar);
        dVar.setLogger(this.f51263c);
        dVar.setLoggerName(this.f51262b);
        dVar.setMarker(null);
        dVar.setMessage(str);
        dVar.setThreadName(Thread.currentThread().getName());
        dVar.setArgumentArray(objArr);
        dVar.setThrowable(th2);
        this.f51264e.add(dVar);
    }

    public final void b(b bVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            a(bVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            a(bVar, str, new Object[]{obj, obj2}, null);
        }
    }

    public final void c(b bVar, String str, Object[] objArr) {
        Throwable throwableCandidate = dx.c.getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            a(bVar, str, dx.c.trimmedCopy(objArr), throwableCandidate);
        } else {
            a(bVar, str, objArr, null);
        }
    }

    public final void d(b bVar, String str, Object obj) {
        a(bVar, str, new Object[]{obj}, null);
    }

    @Override // bx.a
    public void debug(String str) {
        a(b.DEBUG, str, null, null);
    }

    @Override // bx.a
    public void error(String str) {
        a(b.ERROR, str, null, null);
    }

    @Override // bx.a
    public String getName() {
        return this.f51262b;
    }

    @Override // bx.a
    public void info(String str) {
        a(b.INFO, str, null, null);
    }

    @Override // bx.a
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // bx.a
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // bx.a
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // bx.a
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // bx.a
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // bx.a
    public void trace(String str) {
        a(b.TRACE, str, null, null);
    }

    @Override // bx.a
    public void warn(String str) {
        a(b.WARN, str, null, null);
    }

    @Override // bx.a
    public boolean isDebugEnabled(e eVar) {
        return true;
    }

    @Override // bx.a
    public boolean isErrorEnabled(e eVar) {
        return true;
    }

    @Override // bx.a
    public boolean isInfoEnabled(e eVar) {
        return true;
    }

    @Override // bx.a
    public boolean isTraceEnabled(e eVar) {
        return true;
    }

    @Override // bx.a
    public boolean isWarnEnabled(e eVar) {
        return true;
    }

    @Override // bx.a
    public void debug(String str, Object obj) {
        d(b.DEBUG, str, obj);
    }

    @Override // bx.a
    public void error(String str, Object obj) {
        d(b.ERROR, str, obj);
    }

    @Override // bx.a
    public void info(String str, Object obj) {
        d(b.INFO, str, obj);
    }

    @Override // bx.a
    public void trace(String str, Object obj) {
        d(b.TRACE, str, obj);
    }

    @Override // bx.a
    public void warn(String str, Object obj) {
        d(b.WARN, str, obj);
    }

    @Override // bx.a
    public void debug(String str, Object obj, Object obj2) {
        b(b.DEBUG, str, obj, obj2);
    }

    @Override // bx.a
    public void error(String str, Object obj, Object obj2) {
        b(b.ERROR, str, obj, obj2);
    }

    @Override // bx.a
    public void info(String str, Object obj, Object obj2) {
        b(b.INFO, str, obj, obj2);
    }

    @Override // bx.a
    public void trace(String str, Object obj, Object obj2) {
        b(b.TRACE, str, obj, obj2);
    }

    @Override // bx.a
    public void warn(String str, Object obj, Object obj2) {
        b(b.WARN, str, obj, obj2);
    }

    @Override // bx.a
    public void debug(String str, Object... objArr) {
        c(b.DEBUG, str, objArr);
    }

    @Override // bx.a
    public void error(String str, Object... objArr) {
        c(b.ERROR, str, objArr);
    }

    @Override // bx.a
    public void info(String str, Object... objArr) {
        c(b.INFO, str, objArr);
    }

    @Override // bx.a
    public void trace(String str, Object... objArr) {
        c(b.TRACE, str, objArr);
    }

    @Override // bx.a
    public void warn(String str, Object... objArr) {
        c(b.WARN, str, objArr);
    }

    @Override // bx.a
    public void debug(String str, Throwable th2) {
        a(b.DEBUG, str, null, th2);
    }

    @Override // bx.a
    public void error(String str, Throwable th2) {
        a(b.ERROR, str, null, th2);
    }

    @Override // bx.a
    public void info(String str, Throwable th2) {
        a(b.INFO, str, null, th2);
    }

    @Override // bx.a
    public void trace(String str, Throwable th2) {
        a(b.TRACE, str, null, th2);
    }

    @Override // bx.a
    public void warn(String str, Throwable th2) {
        a(b.WARN, str, null, th2);
    }

    @Override // bx.a
    public void debug(e eVar, String str) {
        a(b.DEBUG, str, null, null);
    }

    @Override // bx.a
    public void error(e eVar, String str) {
        a(b.ERROR, str, null, null);
    }

    @Override // bx.a
    public void info(e eVar, String str) {
        a(b.INFO, str, null, null);
    }

    @Override // bx.a
    public void trace(e eVar, String str) {
        a(b.TRACE, str, null, null);
    }

    @Override // bx.a
    public void warn(e eVar, String str) {
        a(b.WARN, str, null, null);
    }

    @Override // bx.a
    public void debug(e eVar, String str, Object obj) {
        d(b.DEBUG, str, obj);
    }

    @Override // bx.a
    public void error(e eVar, String str, Object obj) {
        d(b.ERROR, str, obj);
    }

    @Override // bx.a
    public void info(e eVar, String str, Object obj) {
        d(b.INFO, str, obj);
    }

    @Override // bx.a
    public void trace(e eVar, String str, Object obj) {
        d(b.TRACE, str, obj);
    }

    @Override // bx.a
    public void warn(e eVar, String str, Object obj) {
        d(b.WARN, str, obj);
    }

    @Override // bx.a
    public void debug(e eVar, String str, Object obj, Object obj2) {
        b(b.DEBUG, str, obj, obj2);
    }

    @Override // bx.a
    public void error(e eVar, String str, Object obj, Object obj2) {
        b(b.ERROR, str, obj, obj2);
    }

    @Override // bx.a
    public void info(e eVar, String str, Object obj, Object obj2) {
        b(b.INFO, str, obj, obj2);
    }

    @Override // bx.a
    public void trace(e eVar, String str, Object obj, Object obj2) {
        b(b.TRACE, str, obj, obj2);
    }

    @Override // bx.a
    public void warn(e eVar, String str, Object obj, Object obj2) {
        b(b.WARN, str, obj, obj2);
    }

    @Override // bx.a
    public void debug(e eVar, String str, Object... objArr) {
        c(b.DEBUG, str, objArr);
    }

    @Override // bx.a
    public void error(e eVar, String str, Object... objArr) {
        c(b.ERROR, str, objArr);
    }

    @Override // bx.a
    public void info(e eVar, String str, Object... objArr) {
        c(b.INFO, str, objArr);
    }

    @Override // bx.a
    public void trace(e eVar, String str, Object... objArr) {
        c(b.TRACE, str, objArr);
    }

    @Override // bx.a
    public void warn(e eVar, String str, Object... objArr) {
        c(b.WARN, str, objArr);
    }

    @Override // bx.a
    public void debug(e eVar, String str, Throwable th2) {
        a(b.DEBUG, str, null, th2);
    }

    @Override // bx.a
    public void error(e eVar, String str, Throwable th2) {
        a(b.ERROR, str, null, th2);
    }

    @Override // bx.a
    public void info(e eVar, String str, Throwable th2) {
        a(b.INFO, str, null, th2);
    }

    @Override // bx.a
    public void trace(e eVar, String str, Throwable th2) {
        a(b.TRACE, str, null, th2);
    }

    @Override // bx.a
    public void warn(e eVar, String str, Throwable th2) {
        a(b.WARN, str, null, th2);
    }
}
