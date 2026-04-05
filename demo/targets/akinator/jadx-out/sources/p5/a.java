package p5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kv.a f80677a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f80678b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f80679c;

    public a(kv.a closeAction) {
        e0.checkNotNullParameter(closeAction, "closeAction");
        this.f80677a = closeAction;
        this.f80678b = new AtomicInteger(0);
        this.f80679c = new AtomicBoolean(false);
    }

    public final boolean block$room_runtime_release() {
        synchronized (this) {
            if (this.f80679c.get()) {
                return false;
            }
            this.f80678b.incrementAndGet();
            return true;
        }
    }

    public final void close$room_runtime_release() {
        synchronized (this) {
            if (this.f80679c.compareAndSet(false, true)) {
                while (this.f80678b.get() != 0) {
                }
                this.f80677a.invoke();
            }
        }
    }

    public final void unblock$room_runtime_release() {
        synchronized (this) {
            this.f80678b.decrementAndGet();
            if (this.f80678b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
