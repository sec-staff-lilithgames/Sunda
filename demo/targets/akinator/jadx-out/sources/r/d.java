package r;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f83642a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f83643b = Executors.newFixedThreadPool(4, new b());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f83644c;

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // r.e
    public void executeOnDiskIO(Runnable runnable) {
        this.f83643b.execute(runnable);
    }

    @Override // r.e
    public boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // r.e
    public void postToMainThread(Runnable runnable) {
        if (this.f83644c == null) {
            synchronized (this.f83642a) {
                try {
                    if (this.f83644c == null) {
                        this.f83644c = a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f83644c.post(runnable);
    }
}
