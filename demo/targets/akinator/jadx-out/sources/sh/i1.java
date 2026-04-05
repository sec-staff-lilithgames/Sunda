package sh;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i1 implements n1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f85822c = new i1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final m1 f85823e = new m1(i1.class);

    /* renamed from: b, reason: collision with root package name */
    public final Object f85824b;

    public i1(Object obj) {
        this.f85824b = obj;
    }

    @Override // sh.n1
    public void addListener(Runnable runnable, Executor executor) {
        mh.p1.checkNotNull(runnable, "Runnable was null.");
        mh.p1.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f85823e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f85824b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=SUCCESS, result=[");
        return w0.i.e(sb2, this.f85824b, "]]");
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        mh.p1.checkNotNull(timeUnit);
        return get();
    }
}
