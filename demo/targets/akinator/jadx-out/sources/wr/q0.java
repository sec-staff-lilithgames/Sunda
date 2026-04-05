package wr;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f91094b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f91095c;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f91096e;

    public q0(Executor executor, o0 o0Var, u0 u0Var) {
        this.f91094b = executor;
        this.f91095c = o0Var;
        this.f91096e = u0Var;
    }

    public final void a() {
        try {
            this.f91094b.execute(this);
        } catch (Throwable th2) {
            u0.f91141f.log(Level.INFO, "Exception notifying context listener", th2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f91095c.cancelled(this.f91096e);
    }
}
