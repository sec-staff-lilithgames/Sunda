package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u7 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final y9 f93087b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f93088c;

    public u7(y9 y9Var) {
        this.f93087b = (y9) mh.p1.checkNotNull(y9Var, "executorPool");
    }

    public final synchronized Executor a() {
        try {
            if (this.f93088c == null) {
                this.f93088c = (Executor) mh.p1.checkNotNull((Executor) this.f93087b.getObject(), "%s.getObject()", this.f93088c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f93088c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        a().execute(runnable);
    }

    public final synchronized void release() {
        Executor executor = this.f93088c;
        if (executor != null) {
            this.f93088c = (Executor) this.f93087b.returnObject(executor);
        }
    }
}
