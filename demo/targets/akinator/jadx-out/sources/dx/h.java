package dx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h implements bx.a {

    /* renamed from: b, reason: collision with root package name */
    public final String f52938b;

    /* renamed from: c, reason: collision with root package name */
    public volatile bx.a f52939c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f52940e;

    /* renamed from: f, reason: collision with root package name */
    public Method f52941f;

    /* renamed from: g, reason: collision with root package name */
    public cx.a f52942g;

    /* renamed from: h, reason: collision with root package name */
    public final Queue f52943h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f52944i;

    public h(String str, Queue<cx.d> queue, boolean z10) {
        this.f52938b = str;
        this.f52943h = queue;
        this.f52944i = z10;
    }

    public final bx.a a() {
        if (this.f52939c != null) {
            return this.f52939c;
        }
        if (this.f52944i) {
            return d.f52937b;
        }
        if (this.f52942g == null) {
            this.f52942g = new cx.a(this, this.f52943h);
        }
        return this.f52942g;
    }

    @Override // bx.a
    public void debug(String str) {
        a().debug(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f52938b.equals(((h) obj).f52938b);
    }

    @Override // bx.a
    public void error(String str) {
        a().error(str);
    }

    @Override // bx.a
    public String getName() {
        return this.f52938b;
    }

    public int hashCode() {
        return this.f52938b.hashCode();
    }

    @Override // bx.a
    public void info(String str) {
        a().info(str);
    }

    @Override // bx.a
    public boolean isDebugEnabled() {
        return a().isDebugEnabled();
    }

    public boolean isDelegateEventAware() {
        Boolean bool = this.f52940e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f52941f = this.f52939c.getClass().getMethod("log", cx.c.class);
            this.f52940e = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f52940e = Boolean.FALSE;
        }
        return this.f52940e.booleanValue();
    }

    public boolean isDelegateNOP() {
        return this.f52939c instanceof d;
    }

    public boolean isDelegateNull() {
        return this.f52939c == null;
    }

    @Override // bx.a
    public boolean isErrorEnabled() {
        return a().isErrorEnabled();
    }

    @Override // bx.a
    public boolean isInfoEnabled() {
        return a().isInfoEnabled();
    }

    @Override // bx.a
    public boolean isTraceEnabled() {
        return a().isTraceEnabled();
    }

    @Override // bx.a
    public boolean isWarnEnabled() {
        return a().isWarnEnabled();
    }

    public void log(cx.c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (isDelegateEventAware()) {
            try {
                this.f52941f.invoke(this.f52939c, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void setDelegate(bx.a aVar) {
        this.f52939c = aVar;
    }

    @Override // bx.a
    public void trace(String str) {
        a().trace(str);
    }

    @Override // bx.a
    public void warn(String str) {
        a().warn(str);
    }

    @Override // bx.a
    public void debug(String str, Object obj) {
        a().debug(str, obj);
    }

    @Override // bx.a
    public void error(String str, Object obj) {
        a().error(str, obj);
    }

    @Override // bx.a
    public void info(String str, Object obj) {
        a().info(str, obj);
    }

    @Override // bx.a
    public boolean isDebugEnabled(bx.e eVar) {
        return a().isDebugEnabled(eVar);
    }

    @Override // bx.a
    public boolean isErrorEnabled(bx.e eVar) {
        return a().isErrorEnabled(eVar);
    }

    @Override // bx.a
    public boolean isInfoEnabled(bx.e eVar) {
        return a().isInfoEnabled(eVar);
    }

    @Override // bx.a
    public boolean isTraceEnabled(bx.e eVar) {
        return a().isTraceEnabled(eVar);
    }

    @Override // bx.a
    public boolean isWarnEnabled(bx.e eVar) {
        return a().isWarnEnabled(eVar);
    }

    @Override // bx.a
    public void trace(String str, Object obj) {
        a().trace(str, obj);
    }

    @Override // bx.a
    public void warn(String str, Object obj) {
        a().warn(str, obj);
    }

    @Override // bx.a
    public void debug(String str, Object obj, Object obj2) {
        a().debug(str, obj, obj2);
    }

    @Override // bx.a
    public void error(String str, Object obj, Object obj2) {
        a().error(str, obj, obj2);
    }

    @Override // bx.a
    public void info(String str, Object obj, Object obj2) {
        a().info(str, obj, obj2);
    }

    @Override // bx.a
    public void trace(String str, Object obj, Object obj2) {
        a().trace(str, obj, obj2);
    }

    @Override // bx.a
    public void warn(String str, Object obj, Object obj2) {
        a().warn(str, obj, obj2);
    }

    @Override // bx.a
    public void debug(String str, Object... objArr) {
        a().debug(str, objArr);
    }

    @Override // bx.a
    public void error(String str, Object... objArr) {
        a().error(str, objArr);
    }

    @Override // bx.a
    public void info(String str, Object... objArr) {
        a().info(str, objArr);
    }

    @Override // bx.a
    public void trace(String str, Object... objArr) {
        a().trace(str, objArr);
    }

    @Override // bx.a
    public void warn(String str, Object... objArr) {
        a().warn(str, objArr);
    }

    @Override // bx.a
    public void debug(String str, Throwable th2) {
        a().debug(str, th2);
    }

    @Override // bx.a
    public void error(String str, Throwable th2) {
        a().error(str, th2);
    }

    @Override // bx.a
    public void info(String str, Throwable th2) {
        a().info(str, th2);
    }

    @Override // bx.a
    public void trace(String str, Throwable th2) {
        a().trace(str, th2);
    }

    @Override // bx.a
    public void warn(String str, Throwable th2) {
        a().warn(str, th2);
    }

    @Override // bx.a
    public void debug(bx.e eVar, String str) {
        a().debug(eVar, str);
    }

    @Override // bx.a
    public void error(bx.e eVar, String str) {
        a().error(eVar, str);
    }

    @Override // bx.a
    public void info(bx.e eVar, String str) {
        a().info(eVar, str);
    }

    @Override // bx.a
    public void trace(bx.e eVar, String str) {
        a().trace(eVar, str);
    }

    @Override // bx.a
    public void warn(bx.e eVar, String str) {
        a().warn(eVar, str);
    }

    @Override // bx.a
    public void debug(bx.e eVar, String str, Object obj) {
        a().debug(eVar, str, obj);
    }

    @Override // bx.a
    public void error(bx.e eVar, String str, Object obj) {
        a().error(eVar, str, obj);
    }

    @Override // bx.a
    public void info(bx.e eVar, String str, Object obj) {
        a().info(eVar, str, obj);
    }

    @Override // bx.a
    public void trace(bx.e eVar, String str, Object obj) {
        a().trace(eVar, str, obj);
    }

    @Override // bx.a
    public void warn(bx.e eVar, String str, Object obj) {
        a().warn(eVar, str, obj);
    }

    @Override // bx.a
    public void debug(bx.e eVar, String str, Object obj, Object obj2) {
        a().debug(eVar, str, obj, obj2);
    }

    @Override // bx.a
    public void error(bx.e eVar, String str, Object obj, Object obj2) {
        a().error(eVar, str, obj, obj2);
    }

    @Override // bx.a
    public void info(bx.e eVar, String str, Object obj, Object obj2) {
        a().info(eVar, str, obj, obj2);
    }

    @Override // bx.a
    public void trace(bx.e eVar, String str, Object obj, Object obj2) {
        a().trace(eVar, str, obj, obj2);
    }

    @Override // bx.a
    public void warn(bx.e eVar, String str, Object obj, Object obj2) {
        a().warn(eVar, str, obj, obj2);
    }

    @Override // bx.a
    public void debug(bx.e eVar, String str, Object... objArr) {
        a().debug(eVar, str, objArr);
    }

    @Override // bx.a
    public void error(bx.e eVar, String str, Object... objArr) {
        a().error(eVar, str, objArr);
    }

    @Override // bx.a
    public void info(bx.e eVar, String str, Object... objArr) {
        a().info(eVar, str, objArr);
    }

    @Override // bx.a
    public void trace(bx.e eVar, String str, Object... objArr) {
        a().trace(eVar, str, objArr);
    }

    @Override // bx.a
    public void warn(bx.e eVar, String str, Object... objArr) {
        a().warn(eVar, str, objArr);
    }

    @Override // bx.a
    public void debug(bx.e eVar, String str, Throwable th2) {
        a().debug(eVar, str, th2);
    }

    @Override // bx.a
    public void error(bx.e eVar, String str, Throwable th2) {
        a().error(eVar, str, th2);
    }

    @Override // bx.a
    public void info(bx.e eVar, String str, Throwable th2) {
        a().info(eVar, str, th2);
    }

    @Override // bx.a
    public void trace(bx.e eVar, String str, Throwable th2) {
        a().trace(eVar, str, th2);
    }

    @Override // bx.a
    public void warn(bx.e eVar, String str, Throwable th2) {
        a().warn(eVar, str, th2);
    }
}
