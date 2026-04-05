package o5;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f77520a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f77521b;

    /* renamed from: c, reason: collision with root package name */
    public final tu.o f77522c;

    public c2(y0 database) {
        kotlin.jvm.internal.e0.checkNotNullParameter(database, "database");
        this.f77520a = database;
        this.f77521b = new AtomicBoolean(false);
        this.f77522c = tu.q.lazy(new a1.e(this, 28));
    }

    public y5.j acquire() {
        y0 y0Var = this.f77520a;
        y0Var.assertNotMainThread();
        return this.f77521b.compareAndSet(false, true) ? (y5.j) this.f77522c.getValue() : y0Var.compileStatement(createQuery());
    }

    public abstract String createQuery();

    public void release(y5.j statement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
        if (statement == ((y5.j) this.f77522c.getValue())) {
            this.f77521b.set(false);
        }
    }
}
