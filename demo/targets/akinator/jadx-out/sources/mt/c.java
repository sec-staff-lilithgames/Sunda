package mt;

import io.ktor.http.LinkHeader;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import xt.a2;
import xt.b1;
import xt.c1;
import xt.c2;
import xt.e1;
import xt.g1;
import xt.i1;
import xt.k1;
import xt.m1;
import xt.p1;
import xt.t1;
import xt.v1;
import xt.w0;
import xt.w1;
import xt.y0;
import xt.y1;
import xt.z0;
import zt.g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c implements i {
    public static c amb(Iterable<? extends i> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new xt.b(null, iterable));
    }

    public static c ambArray(i... iVarArr) {
        ut.o0.requireNonNull(iVarArr, "sources is null");
        return iVarArr.length == 0 ? complete() : iVarArr.length == 1 ? wrap(iVarArr[0]) : mu.a.onAssembly(new xt.b(iVarArr, null));
    }

    public static c b(tw.b bVar, int i10, boolean z10) {
        ut.o0.requireNonNull(bVar, "sources is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new xt.u0(bVar, i10, z10));
    }

    public static c complete() {
        return mu.a.onAssembly(xt.b0.f93376b);
    }

    public static c concat(Iterable<? extends i> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new xt.n(iterable));
    }

    public static c concatArray(i... iVarArr) {
        ut.o0.requireNonNull(iVarArr, "sources is null");
        return iVarArr.length == 0 ? complete() : iVarArr.length == 1 ? wrap(iVarArr[0]) : mu.a.onAssembly(new xt.l(iVarArr));
    }

    public static c create(g gVar) {
        ut.o0.requireNonNull(gVar, "source is null");
        return mu.a.onAssembly(new xt.p(gVar));
    }

    public static c defer(Callable<? extends i> callable) {
        ut.o0.requireNonNull(callable, "completableSupplier");
        return mu.a.onAssembly(new xt.q(callable));
    }

    public static c error(Callable<? extends Throwable> callable) {
        ut.o0.requireNonNull(callable, "errorSupplier is null");
        return mu.a.onAssembly(new xt.d0(callable));
    }

    public static c fromAction(st.a aVar) {
        ut.o0.requireNonNull(aVar, "run is null");
        return mu.a.onAssembly(new xt.e0(aVar));
    }

    public static c fromCallable(Callable<?> callable) {
        ut.o0.requireNonNull(callable, "callable is null");
        return mu.a.onAssembly(new xt.f0(callable));
    }

    public static c fromFuture(Future<?> future) {
        ut.o0.requireNonNull(future, "future is null");
        return fromAction(ut.m0.futureAction(future));
    }

    public static <T> c fromMaybe(y yVar) {
        ut.o0.requireNonNull(yVar, "maybe is null");
        return mu.a.onAssembly(new g2(yVar));
    }

    public static <T> c fromObservable(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "observable is null");
        return mu.a.onAssembly(new xt.h0(g0Var));
    }

    public static <T> c fromPublisher(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "publisher is null");
        return mu.a.onAssembly(new xt.j0(bVar));
    }

    public static c fromRunnable(Runnable runnable) {
        ut.o0.requireNonNull(runnable, "run is null");
        return mu.a.onAssembly(new xt.k0(runnable));
    }

    public static <T> c fromSingle(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "single is null");
        return mu.a.onAssembly(new xt.m0(t0Var));
    }

    public static c merge(Iterable<? extends i> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new b1(iterable));
    }

    public static c mergeArray(i... iVarArr) {
        ut.o0.requireNonNull(iVarArr, "sources is null");
        return iVarArr.length == 0 ? complete() : iVarArr.length == 1 ? wrap(iVarArr[0]) : mu.a.onAssembly(new w0(iVarArr));
    }

    public static c mergeArrayDelayError(i... iVarArr) {
        ut.o0.requireNonNull(iVarArr, "sources is null");
        return mu.a.onAssembly(new y0(iVarArr));
    }

    public static c mergeDelayError(Iterable<? extends i> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new z0(iterable));
    }

    public static c never() {
        return mu.a.onAssembly(c1.f93385b);
    }

    public static c timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, ou.j.computation());
    }

    public static c unsafeCreate(i iVar) {
        ut.o0.requireNonNull(iVar, "source is null");
        if (iVar instanceof c) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return mu.a.onAssembly(new xt.n0(iVar));
    }

    public static <R> c using(Callable<R> callable, st.o oVar, st.g gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static c wrap(i iVar) {
        ut.o0.requireNonNull(iVar, "source is null");
        return iVar instanceof c ? mu.a.onAssembly((c) iVar) : mu.a.onAssembly(new xt.n0(iVar));
    }

    public final c a(st.g gVar, st.g gVar2, st.a aVar, st.a aVar2, st.a aVar3, st.a aVar4) {
        ut.o0.requireNonNull(gVar, "onSubscribe is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o0.requireNonNull(aVar2, "onTerminate is null");
        ut.o0.requireNonNull(aVar3, "onAfterTerminate is null");
        ut.o0.requireNonNull(aVar4, "onDispose is null");
        return mu.a.onAssembly(new i1(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4));
    }

    public final c ambWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return ambArray(this, iVar);
    }

    public final <T> b0 andThen(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "next is null");
        return mu.a.onAssembly(new au.b(this, g0Var));
    }

    public final <R> R as(d dVar) {
        ut.o0.requireNonNull(dVar, "converter is null").getClass();
        throw new ClassCastException();
    }

    public final void blockingAwait() {
        wt.h hVar = new wt.h();
        subscribe(hVar);
        hVar.blockingGet();
    }

    public final Throwable blockingGet() {
        wt.h hVar = new wt.h();
        subscribe(hVar);
        return hVar.blockingGetError();
    }

    public final c c(long j10, TimeUnit timeUnit, m0 m0Var, i iVar) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new t1(this, j10, timeUnit, m0Var, iVar));
    }

    public final c cache() {
        return mu.a.onAssembly(new xt.g(this));
    }

    public final c compose(j jVar) {
        ut.o0.requireNonNull(jVar, "transformer is null").getClass();
        throw new ClassCastException();
    }

    public final c concatWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new xt.e(this, iVar));
    }

    public final c delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, ou.j.computation(), false);
    }

    public final c delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, ou.j.computation());
    }

    public final c doAfterTerminate(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVarEmptyConsumer2, oVar, oVar, aVar, oVar);
    }

    public final c doFinally(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onFinally is null");
        return mu.a.onAssembly(new xt.y(this, aVar));
    }

    public final c doOnComplete(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVarEmptyConsumer2, aVar, oVar, oVar, oVar);
    }

    public final c doOnDispose(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVarEmptyConsumer2, oVar, oVar, oVar, aVar);
    }

    public final c doOnError(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVar, oVar, oVar, oVar, oVar);
    }

    public final c doOnEvent(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onEvent is null");
        return mu.a.onAssembly(new xt.a0(this, gVar));
    }

    public final c doOnSubscribe(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVar, gVarEmptyConsumer, oVar, oVar, oVar, oVar);
    }

    public final c doOnTerminate(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVarEmptyConsumer2, oVar, aVar, oVar, oVar);
    }

    public final c hide() {
        return mu.a.onAssembly(new xt.p0(this));
    }

    public final c lift(h hVar) {
        ut.o0.requireNonNull(hVar, "onLift is null");
        return mu.a.onAssembly(new xt.q0(this, hVar));
    }

    public final <T> n0<a0> materialize() {
        return mu.a.onAssembly(new xt.r0(this));
    }

    public final c mergeWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mergeArray(this, iVar);
    }

    public final c observeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new e1(this, m0Var));
    }

    public final c onErrorComplete() {
        return onErrorComplete(ut.m0.alwaysTrue());
    }

    public final c onErrorResumeNext(st.o oVar) {
        ut.o0.requireNonNull(oVar, "errorMapper is null");
        return mu.a.onAssembly(new k1(this, oVar));
    }

    public final c onTerminateDetach() {
        return mu.a.onAssembly(new xt.u(this));
    }

    public final c repeat() {
        return fromPublisher(toFlowable().repeat());
    }

    public final c repeatUntil(st.e eVar) {
        return fromPublisher(toFlowable().repeatUntil(eVar));
    }

    public final c repeatWhen(st.o oVar) {
        return fromPublisher(toFlowable().repeatWhen(oVar));
    }

    public final c retry() {
        return fromPublisher(toFlowable().retry());
    }

    public final c retryWhen(st.o oVar) {
        return fromPublisher(toFlowable().retryWhen(oVar));
    }

    public final c startWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return concatArray(iVar, this);
    }

    public final pt.c subscribe() {
        wt.n nVar = new wt.n();
        subscribe(nVar);
        return nVar;
    }

    public abstract void subscribeActual(f fVar);

    public final c subscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new m1(this, m0Var));
    }

    public final <E extends f> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final c takeUntil(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new p1(this, iVar));
    }

    public final ku.o test() {
        ku.o oVar = new ku.o();
        subscribe(oVar);
        return oVar;
    }

    public final c timeout(long j10, TimeUnit timeUnit) {
        return c(j10, timeUnit, ou.j.computation(), null);
    }

    public final <U> U to(st.o oVar) {
        try {
            return (U) ((st.o) ut.o0.requireNonNull(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> l toFlowable() {
        return this instanceof vt.b ? ((vt.b) this).fuseToFlowable() : mu.a.onAssembly(new w1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> s toMaybe() {
        return this instanceof vt.c ? ((vt.c) this).fuseToMaybe() : mu.a.onAssembly(new zt.w1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> b0 toObservable() {
        return this instanceof vt.d ? ((vt.d) this).fuseToObservable() : mu.a.onAssembly(new y1(this));
    }

    public final <T> n0<T> toSingle(Callable<? extends T> callable) {
        ut.o0.requireNonNull(callable, "completionValueSupplier is null");
        return mu.a.onAssembly(new a2(this, callable, null));
    }

    public final <T> n0<T> toSingleDefault(T t10) {
        ut.o0.requireNonNull(t10, "completionValue is null");
        return mu.a.onAssembly(new a2(this, null, t10));
    }

    public final c unsubscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new xt.w(this, m0Var));
    }

    public static c timer(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new v1(j10, timeUnit, m0Var));
    }

    public static <R> c using(Callable<R> callable, st.o oVar, st.g gVar, boolean z10) {
        ut.o0.requireNonNull(callable, "resourceSupplier is null");
        ut.o0.requireNonNull(oVar, "completableFunction is null");
        ut.o0.requireNonNull(gVar, "disposer is null");
        return mu.a.onAssembly(new c2(callable, oVar, gVar, z10));
    }

    public final c delay(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delay(j10, timeUnit, m0Var, false);
    }

    public final c delaySubscription(long j10, TimeUnit timeUnit, m0 m0Var) {
        return timer(j10, timeUnit, m0Var).andThen(this);
    }

    public final c onErrorComplete(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new g1(this, qVar));
    }

    public final c repeat(long j10) {
        return fromPublisher(toFlowable().repeat(j10));
    }

    public final c retry(st.d dVar) {
        return fromPublisher(toFlowable().retry(dVar));
    }

    public final c timeout(long j10, TimeUnit timeUnit, i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return c(j10, timeUnit, ou.j.computation(), iVar);
    }

    public static c concat(tw.b bVar) {
        return concat(bVar, 2);
    }

    public static c error(Throwable th2) {
        ut.o0.requireNonNull(th2, "error is null");
        return mu.a.onAssembly(new xt.c0(th2));
    }

    public static c merge(tw.b bVar) {
        return b(bVar, Integer.MAX_VALUE, false);
    }

    public static c mergeDelayError(tw.b bVar) {
        return b(bVar, Integer.MAX_VALUE, true);
    }

    public final <T> l andThen(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "next is null");
        return mu.a.onAssembly(new au.d(this, bVar));
    }

    public final c delay(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new xt.s(this, j10, timeUnit, m0Var, z10));
    }

    public final c retry(long j10) {
        return fromPublisher(toFlowable().retry(j10));
    }

    public final <T> b0 startWith(b0 b0Var) {
        ut.o0.requireNonNull(b0Var, "other is null");
        return b0Var.concatWith(toObservable());
    }

    @Override // mt.i
    public final void subscribe(f fVar) {
        ut.o0.requireNonNull(fVar, "observer is null");
        try {
            f fVarOnSubscribe = mu.a.onSubscribe(this, fVar);
            ut.o0.requireNonNull(fVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(fVarOnSubscribe);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final ku.o test(boolean z10) {
        ku.o oVar = new ku.o();
        if (z10) {
            oVar.cancel();
        }
        subscribe(oVar);
        return oVar;
    }

    public static c concat(tw.b bVar, int i10) {
        ut.o0.requireNonNull(bVar, "sources is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new xt.j(bVar, i10));
    }

    public static c merge(tw.b bVar, int i10) {
        return b(bVar, i10, false);
    }

    public static c mergeDelayError(tw.b bVar, int i10) {
        return b(bVar, i10, true);
    }

    public final boolean blockingAwait(long j10, TimeUnit timeUnit) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        wt.h hVar = new wt.h();
        subscribe(hVar);
        return hVar.blockingAwait(j10, timeUnit);
    }

    public final Throwable blockingGet(long j10, TimeUnit timeUnit) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        wt.h hVar = new wt.h();
        subscribe(hVar);
        return hVar.blockingGetError(j10, timeUnit);
    }

    public final c retry(long j10, st.q qVar) {
        return fromPublisher(toFlowable().retry(j10, qVar));
    }

    public final c timeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return c(j10, timeUnit, m0Var, null);
    }

    public final <T> n0<T> andThen(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "next is null");
        return mu.a.onAssembly(new du.o(t0Var, this));
    }

    public final c retry(st.q qVar) {
        return fromPublisher(toFlowable().retry(qVar));
    }

    public final <T> l startWith(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return toFlowable().startWith(bVar);
    }

    public final c timeout(long j10, TimeUnit timeUnit, m0 m0Var, i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return c(j10, timeUnit, m0Var, iVar);
    }

    public final <T> s andThen(y yVar) {
        ut.o0.requireNonNull(yVar, "next is null");
        return mu.a.onAssembly(new zt.d0(yVar, this));
    }

    public final c andThen(i iVar) {
        ut.o0.requireNonNull(iVar, "next is null");
        return mu.a.onAssembly(new xt.e(this, iVar));
    }

    public final pt.c subscribe(st.a aVar, st.g gVar) {
        ut.o0.requireNonNull(gVar, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        wt.j jVar = new wt.j(gVar, aVar);
        subscribe(jVar);
        return jVar;
    }

    public final pt.c subscribe(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onComplete is null");
        wt.j jVar = new wt.j(aVar);
        subscribe(jVar);
        return jVar;
    }
}
