package t6;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e0;
import n6.c0;
import on.z;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final x6.b f86392a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f86393b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f86394c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f86395d;

    /* renamed from: e, reason: collision with root package name */
    public Object f86396e;

    public f(Context context, x6.b taskExecutor) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f86392a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f86393b = applicationContext;
        this.f86394c = new Object();
        this.f86395d = new LinkedHashSet();
    }

    public final void addListener(r6.a listener) {
        e0.checkNotNullParameter(listener, "listener");
        synchronized (this.f86394c) {
            try {
                if (this.f86395d.add(listener)) {
                    if (this.f86395d.size() == 1) {
                        this.f86396e = readSystemState();
                        c0.get().debug(g.f86397a, getClass().getSimpleName() + ": initial state = " + this.f86396e);
                        startTracking();
                    }
                    ((s6.a) listener).onConstraintChanged(this.f86396e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object getState() {
        Object obj = this.f86396e;
        return obj == null ? readSystemState() : obj;
    }

    public abstract Object readSystemState();

    public final void removeListener(r6.a listener) {
        e0.checkNotNullParameter(listener, "listener");
        synchronized (this.f86394c) {
            if (this.f86395d.remove(listener) && this.f86395d.isEmpty()) {
                stopTracking();
            }
        }
    }

    public final void setState(Object obj) {
        synchronized (this.f86394c) {
            Object obj2 = this.f86396e;
            if (obj2 == null || !e0.areEqual(obj2, obj)) {
                this.f86396e = obj;
                this.f86392a.getMainThreadExecutor().execute(new z(13, y0.toList(this.f86395d), this));
            }
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
