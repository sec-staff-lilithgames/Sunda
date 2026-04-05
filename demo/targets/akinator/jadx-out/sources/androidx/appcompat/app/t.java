package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4841b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f4842c = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final u f4843e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f4844f;

    public t(u uVar) {
        this.f4843e = uVar;
    }

    public final void a() {
        synchronized (this.f4841b) {
            try {
                Runnable runnable = (Runnable) this.f4842c.poll();
                this.f4844f = runnable;
                if (runnable != null) {
                    this.f4843e.execute(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f4841b) {
            try {
                this.f4842c.add(new af.n(2, this, runnable));
                if (this.f4844f == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
