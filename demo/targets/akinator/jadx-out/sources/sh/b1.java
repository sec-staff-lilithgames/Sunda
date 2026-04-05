package sh;

import j$.time.Duration;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nh.b5;
import nh.we;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class b1 {
    public static <V> void addCallback(n1 n1Var, t0 t0Var, Executor executor) {
        mh.p1.checkNotNull(t0Var);
        n1Var.addListener(new v0(n1Var, t0Var), executor);
    }

    @SafeVarargs
    public static <V> n1 allAsList(n1... n1VarArr) {
        return new f0(b5.copyOf(n1VarArr), true);
    }

    public static <V, X extends Throwable> n1 catching(n1 n1Var, Class<X> cls, mh.v0 v0Var, Executor executor) {
        int i10 = c.f85780m;
        b bVar = new b(n1Var, cls, v0Var);
        n1Var.addListener(bVar, w1.b(executor, bVar));
        return bVar;
    }

    public static <V, X extends Throwable> n1 catchingAsync(n1 n1Var, Class<X> cls, e0 e0Var, Executor executor) {
        int i10 = c.f85780m;
        a aVar = new a(n1Var, cls, e0Var);
        n1Var.addListener(aVar, w1.b(executor, aVar));
        return aVar;
    }

    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        we weVar = f1.f85805a;
        e1.f85803a.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw f1.a(cls, e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof Error) {
                throw new n0((Error) cause);
            }
            if (cause instanceof RuntimeException) {
                throw new j2(cause);
            }
            throw f1.a(cls, cause);
        }
    }

    public static <V> V getDone(Future<V> future) throws ExecutionException {
        mh.p1.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) k2.getUninterruptibly(future);
    }

    public static <V> V getUnchecked(Future<V> future) {
        mh.p1.checkNotNull(future);
        try {
            return (V) k2.getUninterruptibly(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new n0((Error) e10.getCause());
            }
            throw new j2(e10.getCause());
        }
    }

    public static <V> n1 immediateCancelledFuture() {
        g1 g1Var = g1.f85811j;
        return g1Var != null ? g1Var : new g1();
    }

    public static <V> n1 immediateFailedFuture(Throwable th2) {
        mh.p1.checkNotNull(th2);
        h1 h1Var = new h1();
        h1Var.setException(th2);
        return h1Var;
    }

    public static <V> n1 immediateFuture(V v10) {
        return v10 == null ? i1.f85822c : new i1(v10);
    }

    public static n1 immediateVoidFuture() {
        return i1.f85822c;
    }

    public static <T> b5 inCompletionOrder(Iterable<? extends n1> iterable) {
        n1[] n1VarArr = (n1[]) (iterable instanceof Collection ? (Collection) iterable : b5.copyOf(iterable)).toArray(new n1[0]);
        z0 z0Var = new z0(n1VarArr);
        x4 x4VarBuilderWithExpectedSize = b5.builderWithExpectedSize(n1VarArr.length);
        for (int i10 = 0; i10 < n1VarArr.length; i10++) {
            y0 y0Var = new y0();
            y0Var.f85883j = z0Var;
            x4VarBuilderWithExpectedSize.add((Object) y0Var);
        }
        b5 b5VarBuild = x4VarBuilderWithExpectedSize.build();
        for (int i11 = 0; i11 < n1VarArr.length; i11++) {
            n1VarArr[i11].addListener(new androidx.browser.customtabs.h(z0Var, b5VarBuild, i11, 13), w1.directExecutor());
        }
        return b5VarBuild;
    }

    public static <I, O> Future<O> lazyTransform(Future<I> future, mh.v0 v0Var) {
        mh.p1.checkNotNull(future);
        mh.p1.checkNotNull(v0Var);
        return new u0(future, v0Var);
    }

    public static <V> n1 nonCancellationPropagating(n1 n1Var) {
        if (n1Var.isDone()) {
            return n1Var;
        }
        a1 a1Var = new a1();
        a1Var.f85773j = n1Var;
        n1Var.addListener(a1Var, w1.directExecutor());
        return a1Var;
    }

    public static <O> n1 scheduleAsync(d0 d0Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        i2 i2Var = new i2();
        i2Var.f85825j = new g2(i2Var);
        i2Var.addListener(new on.w(scheduledExecutorService.schedule(i2Var, j10, timeUnit), 10), w1.directExecutor());
        return i2Var;
    }

    public static <O> n1 submit(Callable<O> callable, Executor executor) {
        i2 i2Var = new i2(callable);
        executor.execute(i2Var);
        return i2Var;
    }

    public static <O> n1 submitAsync(d0 d0Var, Executor executor) {
        i2 i2Var = new i2();
        i2Var.f85825j = new g2(i2Var);
        executor.execute(i2Var);
        return i2Var;
    }

    @SafeVarargs
    public static <V> n1 successfulAsList(n1... n1VarArr) {
        return new f0(b5.copyOf(n1VarArr), false);
    }

    public static <I, O> n1 transform(n1 n1Var, mh.v0 v0Var, Executor executor) {
        int i10 = x.f85874l;
        w wVar = new w(n1Var, v0Var);
        n1Var.addListener(wVar, w1.b(executor, wVar));
        return wVar;
    }

    public static <I, O> n1 transformAsync(n1 n1Var, e0 e0Var, Executor executor) {
        int i10 = x.f85874l;
        v vVar = new v(n1Var, e0Var);
        n1Var.addListener(vVar, w1.b(executor, vVar));
        return vVar;
    }

    @SafeVarargs
    public static <V> x0 whenAllComplete(n1... n1VarArr) {
        return new x0(b5.copyOf(n1VarArr), false);
    }

    @SafeVarargs
    public static <V> x0 whenAllSucceed(n1... n1VarArr) {
        return new x0(b5.copyOf(n1VarArr), true);
    }

    public static <V> n1 withTimeout(n1 n1Var, Duration duration, ScheduledExecutorService scheduledExecutorService) {
        return withTimeout(n1Var, kc.p.U(duration), TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public static <V> n1 successfulAsList(Iterable<? extends n1> iterable) {
        return new f0(b5.copyOf(iterable), false);
    }

    public static <V> x0 whenAllComplete(Iterable<? extends n1> iterable) {
        return new x0(b5.copyOf(iterable), false);
    }

    public static <V> x0 whenAllSucceed(Iterable<? extends n1> iterable) {
        return new x0(b5.copyOf(iterable), true);
    }

    public static <V> n1 withTimeout(n1 n1Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (n1Var.isDone()) {
            return n1Var;
        }
        f2 f2Var = new f2();
        f2Var.f85806j = (n1) mh.p1.checkNotNull(n1Var);
        d2 d2Var = new d2();
        d2Var.f85800b = f2Var;
        f2Var.f85807k = scheduledExecutorService.schedule(d2Var, j10, timeUnit);
        n1Var.addListener(d2Var, w1.directExecutor());
        return f2Var;
    }

    public static <V> n1 allAsList(Iterable<? extends n1> iterable) {
        return new f0(b5.copyOf(iterable), true);
    }

    public static n1 submit(Runnable runnable, Executor executor) {
        i2 i2Var = new i2(Executors.callable(runnable, null));
        executor.execute(i2Var);
        return i2Var;
    }

    public static <O> n1 scheduleAsync(d0 d0Var, Duration duration, ScheduledExecutorService scheduledExecutorService) {
        return scheduleAsync(d0Var, kc.p.U(duration), TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, Duration duration) throws Exception {
        return (V) getChecked(future, cls, kc.p.U(duration), TimeUnit.NANOSECONDS);
    }

    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j10, TimeUnit timeUnit) throws Exception {
        we weVar = f1.f85805a;
        e1.f85803a.validateClass(cls);
        try {
            return future.get(j10, timeUnit);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw f1.a(cls, e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof Error)) {
                if (cause instanceof RuntimeException) {
                    throw new j2(cause);
                }
                throw f1.a(cls, cause);
            }
            throw new n0((Error) cause);
        } catch (TimeoutException e12) {
            throw f1.a(cls, e12);
        }
    }
}
