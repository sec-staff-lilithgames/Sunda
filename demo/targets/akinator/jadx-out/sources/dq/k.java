package dq;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f52499a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f52500b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f52501c = new Object();

    public static void b(Context context) {
        AtomicBoolean atomicBoolean = f52500b;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (f52501c) {
            try {
                if (f52499a.compareAndSet(false, true)) {
                    new cr.d().clean(cr.e.getExternalDir(context));
                    cr.e.clearTempFiles(context);
                    atomicBoolean.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
