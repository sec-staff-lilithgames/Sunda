package fu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends AtomicInteger implements Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56034b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.c f56035c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Thread f56036e;

    public j(Runnable runnable, tt.c cVar) {
        this.f56034b = runnable;
        this.f56035c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        while (true) {
            int i10 = get();
            if (i10 >= 2) {
                return;
            }
            if (i10 == 0) {
                if (compareAndSet(0, 4)) {
                    tt.c cVar = this.f56035c;
                    if (cVar != null) {
                        cVar.delete(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.f56036e;
                if (thread != null) {
                    thread.interrupt();
                    this.f56036e = null;
                }
                set(4);
                tt.c cVar2 = this.f56035c;
                if (cVar2 != null) {
                    cVar2.delete(this);
                    return;
                }
                return;
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() >= 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0) {
            this.f56036e = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.f56036e = null;
                return;
            }
            try {
                this.f56034b.run();
                this.f56036e = null;
                if (!compareAndSet(1, 2)) {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } else {
                    tt.c cVar = this.f56035c;
                    if (cVar != null) {
                        cVar.delete(this);
                    }
                }
            } catch (Throwable th2) {
                this.f56036e = null;
                if (compareAndSet(1, 2)) {
                    tt.c cVar2 = this.f56035c;
                    if (cVar2 != null) {
                        cVar2.delete(this);
                    }
                } else {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                }
                throw th2;
            }
        }
    }
}
