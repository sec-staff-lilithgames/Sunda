package fu;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends AtomicReferenceArray implements Runnable, Callable, pt.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f55999c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f56000e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f56001f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final Object f56002g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56003b;

    public a0(Runnable runnable, tt.c cVar) {
        super(3);
        this.f56003b = runnable;
        lazySet(0, cVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // pt.c
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f56002g;
            if (obj6 == obj || obj6 == (obj4 = f56000e) || obj6 == (obj5 = f56001f)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z10);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f55999c) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((tt.c) obj2).delete(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f55999c || obj == f56002g;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        boolean zCompareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = f56001f;
        Object obj5 = f56000e;
        Object obj6 = f55999c;
        Object obj7 = f56002g;
        lazySet(2, Thread.currentThread());
        try {
            this.f56003b.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((tt.c) obj2).delete(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th2) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((tt.c) obj2).delete(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f56002g) {
                return;
            }
            if (obj == f56000e) {
                future.cancel(false);
                return;
            } else if (obj == f56001f) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
