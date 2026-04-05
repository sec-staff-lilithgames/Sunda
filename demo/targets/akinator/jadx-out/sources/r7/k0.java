package r7;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.ga;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f83955e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f83956a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f83957b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f83958c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i0 f83959d;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f83955e = new ga(2);
        } else {
            f83955e = Executors.newCachedThreadPool(new e8.f());
        }
    }

    public k0(Callable<i0> callable) {
        this(callable, false);
    }

    public final void a() {
        i0 i0Var = this.f83959d;
        if (i0Var == null) {
            return;
        }
        if (i0Var.getValue() != null) {
            Object value = i0Var.getValue();
            synchronized (this) {
                Iterator it = new ArrayList(this.f83956a).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).onResult(value);
                }
            }
            return;
        }
        Throwable exception = i0Var.getException();
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f83957b);
            if (arrayList.isEmpty()) {
                e8.e.warning("Lottie encountered an error but no failure listener was added:", exception);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((e0) it2.next()).onResult(exception);
            }
        }
    }

    public synchronized k0 addFailureListener(e0 e0Var) {
        try {
            i0 i0Var = this.f83959d;
            if (i0Var != null && i0Var.getException() != null) {
                e0Var.onResult(i0Var.getException());
            }
            this.f83957b.add(e0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized k0 addListener(e0 e0Var) {
        try {
            i0 i0Var = this.f83959d;
            if (i0Var != null && i0Var.getValue() != null) {
                e0Var.onResult(i0Var.getValue());
            }
            this.f83956a.add(e0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final void b(i0 i0Var) {
        if (this.f83959d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f83959d = i0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a();
        } else {
            this.f83958c.post(new on.w(this, 9));
        }
    }

    public i0 getResult() {
        return this.f83959d;
    }

    public synchronized k0 removeFailureListener(e0 e0Var) {
        this.f83957b.remove(e0Var);
        return this;
    }

    public synchronized k0 removeListener(e0 e0Var) {
        this.f83956a.remove(e0Var);
        return this;
    }

    public k0(Object obj) {
        this.f83956a = new LinkedHashSet(1);
        this.f83957b = new LinkedHashSet(1);
        this.f83958c = new Handler(Looper.getMainLooper());
        this.f83959d = null;
        b(new i0(obj));
    }

    public k0(Callable callable, boolean z10) {
        this.f83956a = new LinkedHashSet(1);
        this.f83957b = new LinkedHashSet(1);
        this.f83958c = new Handler(Looper.getMainLooper());
        this.f83959d = null;
        if (z10) {
            try {
                b((i0) callable.call());
                return;
            } catch (Throwable th2) {
                b(new i0(th2));
                return;
            }
        }
        Executor executor = f83955e;
        j0 j0Var = new j0(callable);
        j0Var.f83950b = this;
        executor.execute(j0Var);
    }
}
