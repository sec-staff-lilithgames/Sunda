package ci;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f12370h = Logger.getLogger(z.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12371b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f12372c = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public int f12373e = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f12374f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final y f12375g = new y(this);

    public z(Executor executor) {
        this.f12371b = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f12372c) {
            int i10 = this.f12373e;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f12374f;
                x xVar = new x(runnable);
                this.f12372c.add(xVar);
                this.f12373e = 2;
                try {
                    this.f12371b.execute(this.f12375g);
                    if (this.f12373e != 2) {
                        return;
                    }
                    synchronized (this.f12372c) {
                        try {
                            if (this.f12374f == j10 && this.f12373e == 2) {
                                this.f12373e = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f12372c) {
                        try {
                            int i11 = this.f12373e;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f12372c.removeLastOccurrence(xVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f12372c.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f12371b + "}";
    }
}
