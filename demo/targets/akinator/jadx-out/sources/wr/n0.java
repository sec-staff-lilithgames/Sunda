package wr;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 extends u0 implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public final z0 f91054h;

    /* renamed from: i, reason: collision with root package name */
    public final u0 f91055i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f91056j;

    /* renamed from: k, reason: collision with root package name */
    public l0 f91057k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f91058l;

    /* renamed from: m, reason: collision with root package name */
    public ScheduledFuture f91059m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91060n;

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(u0 u0Var) {
        e5 e5Var = u0Var.f91144c;
        super(u0Var, e5Var);
        this.f91054h = u0Var.getDeadline();
        this.f91055i = new u0(this, e5Var);
    }

    @Override // wr.u0
    public void addListener(o0 o0Var, Executor executor) {
        u0.a(o0Var, "cancellationListener");
        u0.a(executor, "executor");
        b(new q0(executor, o0Var, this));
    }

    @Override // wr.u0
    public u0 attach() {
        return this.f91055i.attach();
    }

    public final void b(q0 q0Var) {
        synchronized (this) {
            try {
                if (isCancelled()) {
                    q0Var.a();
                } else {
                    ArrayList arrayList = this.f91056j;
                    if (arrayList == null) {
                        ArrayList arrayList2 = new ArrayList();
                        this.f91056j = arrayList2;
                        arrayList2.add(q0Var);
                        n0 n0Var = this.f91143b;
                        if (n0Var != null) {
                            l0 l0Var = new l0(this);
                            this.f91057k = l0Var;
                            n0Var.b(new q0(p0.f91083b, l0Var, this));
                        }
                    } else {
                        arrayList.add(q0Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(o0 o0Var, u0 u0Var) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f91056j;
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        q0 q0Var = (q0) this.f91056j.get(size);
                        if (q0Var.f91095c == o0Var && q0Var.f91096e == u0Var) {
                            this.f91056j.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (this.f91056j.isEmpty()) {
                        n0 n0Var = this.f91143b;
                        if (n0Var != null) {
                            n0Var.removeListener(this.f91057k);
                        }
                        this.f91057k = null;
                        this.f91056j = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean cancel(Throwable th2) {
        boolean z10;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            try {
                if (this.f91060n) {
                    z10 = false;
                    scheduledFuture = null;
                } else {
                    z10 = true;
                    this.f91060n = true;
                    scheduledFuture = this.f91059m;
                    if (scheduledFuture != null) {
                        this.f91059m = null;
                    } else {
                        scheduledFuture = null;
                    }
                    this.f91058l = th2;
                }
            } finally {
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z10) {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f91056j;
                    if (arrayList == null) {
                        return z10;
                    }
                    l0 l0Var = this.f91057k;
                    this.f91057k = null;
                    this.f91056j = null;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        q0 q0Var = (q0) it.next();
                        if (q0Var.f91096e == this) {
                            q0Var.a();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        q0 q0Var2 = (q0) it2.next();
                        if (q0Var2.f91096e != this) {
                            q0Var2.a();
                        }
                    }
                    n0 n0Var = this.f91143b;
                    if (n0Var != null) {
                        n0Var.removeListener(l0Var);
                        return z10;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // wr.u0
    public Throwable cancellationCause() {
        if (isCancelled()) {
            return this.f91058l;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cancel(null);
    }

    @Override // wr.u0
    public void detach(u0 u0Var) {
        this.f91055i.detach(u0Var);
    }

    public void detachAndCancel(u0 u0Var, Throwable th2) {
        try {
            detach(u0Var);
        } finally {
            cancel(th2);
        }
    }

    @Override // wr.u0
    public z0 getDeadline() {
        return this.f91054h;
    }

    @Override // wr.u0
    public boolean isCancelled() {
        synchronized (this) {
            try {
                if (this.f91060n) {
                    return true;
                }
                if (!super.isCancelled()) {
                    return false;
                }
                cancel(super.cancellationCause());
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public boolean isCurrent() {
        u0 u0Var = this.f91055i;
        u0Var.getClass();
        return u0.current() == u0Var;
    }

    @Override // wr.u0
    public void removeListener(o0 o0Var) {
        c(o0Var, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(u0 u0Var, z0 z0Var) {
        e5 e5Var = u0Var.f91144c;
        super(u0Var, e5Var);
        this.f91054h = z0Var;
        this.f91055i = new u0(this, e5Var);
    }
}
