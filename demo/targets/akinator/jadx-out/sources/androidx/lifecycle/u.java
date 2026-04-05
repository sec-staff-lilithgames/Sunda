package androidx.lifecycle;

import java.util.ArrayDeque;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public boolean f6714b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6715c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6713a = true;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6716d = new ArrayDeque();

    public final boolean canRun() {
        return this.f6714b || !this.f6713a;
    }

    public final void dispatchAndEnqueue(zu.m context, Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(context) || canRun()) {
            immediate.mo5197dispatch(context, new af.n(4, this, runnable));
        } else {
            if (!this.f6716d.offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            drainQueue();
        }
    }

    public final void drainQueue() {
        ArrayDeque arrayDeque = this.f6716d;
        if (this.f6715c) {
            return;
        }
        try {
            this.f6715c = true;
            while (!arrayDeque.isEmpty() && canRun()) {
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f6715c = false;
        }
    }

    public final void finish() {
        this.f6714b = true;
        drainQueue();
    }

    public final void pause() {
        this.f6713a = true;
    }

    public final void resume() {
        if (this.f6713a) {
            if (this.f6714b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f6713a = false;
            drainQueue();
        }
    }
}
