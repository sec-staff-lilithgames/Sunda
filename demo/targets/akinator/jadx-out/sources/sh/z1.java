package sh;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class z1 implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final m1 f85895h = new m1(z1.class);

    /* renamed from: b, reason: collision with root package name */
    public final Executor f85896b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f85897c = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public int f85898e = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f85899f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final y1 f85900g = new y1(this);

    public z1(Executor executor) {
        this.f85896b = (Executor) mh.p1.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mh.p1.checkNotNull(runnable);
        synchronized (this.f85897c) {
            int i10 = this.f85898e;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f85899f;
                x1 x1Var = new x1(runnable);
                this.f85897c.add(x1Var);
                this.f85898e = 2;
                try {
                    this.f85896b.execute(this.f85900g);
                    if (this.f85898e != 2) {
                        return;
                    }
                    synchronized (this.f85897c) {
                        try {
                            if (this.f85899f == j10 && this.f85898e == 2) {
                                this.f85898e = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (this.f85897c) {
                        try {
                            int i11 = this.f85898e;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f85897c.removeLastOccurrence(x1Var)) {
                                z10 = false;
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z10) {
                                throw th2;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.f85897c.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f85896b + "}";
    }
}
