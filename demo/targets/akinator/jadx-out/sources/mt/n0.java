package mt;

import bu.z9;
import com.apm.insight.b.El.rJqlArycrfkilN;
import du.a1;
import du.b2;
import du.b3;
import du.c1;
import du.d2;
import du.d3;
import du.f1;
import du.f2;
import du.h1;
import du.h2;
import du.i1;
import du.k1;
import du.k2;
import du.l1;
import du.n1;
import du.n2;
import du.p2;
import du.r2;
import du.t1;
import du.t2;
import du.u1;
import du.v1;
import du.v2;
import du.w0;
import du.x1;
import du.x2;
import du.y0;
import du.y1;
import du.z1;
import io.ktor.http.LinkHeader;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import xt.w1;
import yt.j1;
import yt.m4;
import yt.qb;
import zt.a2;
import zt.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n0<T> implements t0 {
    public static <T> n0<T> amb(Iterable<? extends t0> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new du.b(null, iterable));
    }

    public static <T> n0<T> ambArray(t0... t0VarArr) {
        return t0VarArr.length == 0 ? error(t1.emptyThrower()) : t0VarArr.length == 1 ? wrap(t0VarArr[0]) : mu.a.onAssembly(new du.b(t0VarArr, null));
    }

    public static n0 b(l lVar) {
        return mu.a.onAssembly(new qb(lVar, null));
    }

    public static <T> l concat(Iterable<? extends t0> iterable) {
        return concat(l.fromIterable(iterable));
    }

    public static <T> l concatArray(t0... t0VarArr) {
        return mu.a.onAssembly(new j1(l.fromArray(t0VarArr), t1.toFlowable(), 2, iu.k.f68412c));
    }

    public static <T> l concatArrayEager(t0... t0VarArr) {
        return l.fromArray(t0VarArr).concatMapEager(t1.toFlowable());
    }

    public static <T> l concatEager(tw.b bVar) {
        return l.fromPublisher(bVar).concatMapEager(t1.toFlowable());
    }

    public static <T> n0<T> create(r0 r0Var) {
        ut.o0.requireNonNull(r0Var, "source is null");
        return mu.a.onAssembly(new du.h(r0Var));
    }

    public static <T> n0<T> defer(Callable<? extends t0> callable) {
        ut.o0.requireNonNull(callable, "singleSupplier is null");
        return mu.a.onAssembly(new du.i(callable));
    }

    public static <T> n0<Boolean> equals(t0 t0Var, t0 t0Var2) {
        ut.o0.requireNonNull(t0Var, "first is null");
        ut.o0.requireNonNull(t0Var2, "second is null");
        return mu.a.onAssembly(new du.s0(t0Var, t0Var2));
    }

    public static <T> n0<T> error(Callable<? extends Throwable> callable) {
        ut.o0.requireNonNull(callable, "errorSupplier is null");
        return mu.a.onAssembly(new du.t0(callable));
    }

    public static <T> n0<T> fromCallable(Callable<? extends T> callable) {
        ut.o0.requireNonNull(callable, "callable is null");
        return mu.a.onAssembly(new i1(callable));
    }

    public static <T> n0<T> fromFuture(Future<? extends T> future) {
        return b(l.fromFuture(future));
    }

    public static <T> n0<T> fromObservable(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "observableSource is null");
        return mu.a.onAssembly(new z9(g0Var, null));
    }

    public static <T> n0<T> fromPublisher(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "publisher is null");
        return mu.a.onAssembly(new k1(bVar));
    }

    public static <T> n0<T> just(T t10) {
        ut.o0.requireNonNull(t10, "item is null");
        return mu.a.onAssembly(new u1(t10));
    }

    public static <T> l merge(Iterable<? extends t0> iterable) {
        return merge(l.fromIterable(iterable));
    }

    public static <T> l mergeDelayError(Iterable<? extends t0> iterable) {
        return mergeDelayError(l.fromIterable(iterable));
    }

    public static <T> n0<T> never() {
        return mu.a.onAssembly(z1.f52897b);
    }

    public static n0<Long> timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, ou.j.computation());
    }

    public static <T> n0<T> unsafeCreate(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "onSubscribe is null");
        if (t0Var instanceof n0) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return mu.a.onAssembly(new l1(t0Var));
    }

    public static <T, U> n0<T> using(Callable<U> callable, st.o oVar, st.g gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T> n0<T> wrap(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "source is null");
        return t0Var instanceof n0 ? mu.a.onAssembly((n0) t0Var) : mu.a.onAssembly(new l1(t0Var));
    }

    public static <T, R> n0<R> zip(Iterable<? extends t0> iterable, st.o oVar) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new d3(iterable, oVar));
    }

    public static <T, R> n0<R> zipArray(st.o oVar, t0... t0VarArr) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(t0VarArr, "sources is null");
        return t0VarArr.length == 0 ? error(new NoSuchElementException()) : mu.a.onAssembly(new b3(t0VarArr, oVar));
    }

    public final n0 a(long j10, TimeUnit timeUnit, m0 m0Var, t0 t0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new n2(this, j10, timeUnit, m0Var, t0Var));
    }

    public final n0<T> ambWith(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return ambArray(this, t0Var);
    }

    public final <R> R as(o0 o0Var) {
        ut.o0.requireNonNull(o0Var, "converter is null").getClass();
        throw new ClassCastException();
    }

    public final T blockingGet() {
        wt.h hVar = new wt.h();
        subscribe(hVar);
        return (T) hVar.blockingGet();
    }

    public final n0<T> cache() {
        return mu.a.onAssembly(new du.d(this));
    }

    public final <U> n0<U> cast(Class<? extends U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return (n0<U>) map(ut.m0.castFunction(cls));
    }

    public final <R> n0<R> compose(u0 u0Var) {
        ut.o0.requireNonNull(u0Var, "transformer is null").getClass();
        throw new ClassCastException();
    }

    public final l concatWith(t0 t0Var) {
        return concat(this, t0Var);
    }

    public final n0<Boolean> contains(Object obj) {
        return contains(obj, ut.o0.equalsPredicate());
    }

    public final n0<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, ou.j.computation(), false);
    }

    public final n0<T> delaySubscription(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new du.o(this, iVar));
    }

    public final <R> s dematerialize(st.o oVar) {
        ut.o0.requireNonNull(oVar, "selector is null");
        return mu.a.onAssembly(new du.w(this, oVar));
    }

    public final n0<T> doAfterSuccess(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onAfterSuccess is null");
        return mu.a.onAssembly(new du.a0(this, gVar));
    }

    public final n0<T> doAfterTerminate(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onAfterTerminate is null");
        return mu.a.onAssembly(new du.c0(this, aVar));
    }

    public final n0<T> doFinally(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onFinally is null");
        return mu.a.onAssembly(new du.e0(this, aVar));
    }

    public final n0<T> doOnDispose(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onDispose is null");
        return mu.a.onAssembly(new du.g0(this, aVar));
    }

    public final n0<T> doOnError(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onError is null");
        return mu.a.onAssembly(new du.i0(this, gVar));
    }

    public final n0<T> doOnEvent(st.b bVar) {
        ut.o0.requireNonNull(bVar, "onEvent is null");
        return mu.a.onAssembly(new du.k0(this, bVar));
    }

    public final n0<T> doOnSubscribe(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onSubscribe is null");
        return mu.a.onAssembly(new du.m0(this, gVar));
    }

    public final n0<T> doOnSuccess(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onSuccess is null");
        return mu.a.onAssembly(new du.o0(this, gVar));
    }

    public final n0<T> doOnTerminate(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onTerminate is null");
        return mu.a.onAssembly(new du.q0(this, aVar));
    }

    public final s filter(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new x0(this, qVar));
    }

    public final <R> n0<R> flatMap(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new w0(this, oVar));
    }

    public final c flatMapCompletable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new y0(this, oVar));
    }

    public final <R> s flatMapMaybe(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new f1(this, oVar));
    }

    public final <R> b0 flatMapObservable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.u0(this, oVar));
    }

    public final <R> l flatMapPublisher(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new h1(this, oVar));
    }

    public final <U> l flattenAsFlowable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new a1(this, oVar));
    }

    public final <U> b0 flattenAsObservable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new c1(this, oVar));
    }

    public final n0<T> hide() {
        return mu.a.onAssembly(new n1(this));
    }

    public final c ignoreElement() {
        return mu.a.onAssembly(new xt.m0(this));
    }

    public final <R> n0<R> lift(s0 s0Var) {
        ut.o0.requireNonNull(s0Var, "lift is null");
        return mu.a.onAssembly(new v1(this, s0Var));
    }

    public final <R> n0<R> map(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new x1(this, oVar));
    }

    public final n0<a0> materialize() {
        return mu.a.onAssembly(new y1(this));
    }

    public final l mergeWith(t0 t0Var) {
        return merge(this, t0Var);
    }

    public final n0<T> observeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new b2(this, m0Var));
    }

    public final n0<T> onErrorResumeNext(n0<? extends T> n0Var) {
        ut.o0.requireNonNull(n0Var, "resumeSingleInCaseOfError is null");
        return onErrorResumeNext(ut.m0.justFunction(n0Var));
    }

    public final n0<T> onErrorReturn(st.o oVar) {
        ut.o0.requireNonNull(oVar, "resumeFunction is null");
        return mu.a.onAssembly(new d2(this, oVar, null));
    }

    public final n0<T> onErrorReturnItem(T t10) {
        ut.o0.requireNonNull(t10, "value is null");
        return mu.a.onAssembly(new d2(this, null, t10));
    }

    public final n0<T> onTerminateDetach() {
        return mu.a.onAssembly(new du.y(this));
    }

    public final l repeat() {
        return toFlowable().repeat();
    }

    public final l repeatUntil(st.e eVar) {
        return toFlowable().repeatUntil(eVar);
    }

    public final l repeatWhen(st.o oVar) {
        return toFlowable().repeatWhen(oVar);
    }

    public final n0<T> retry() {
        return b(toFlowable().retry());
    }

    public final n0<T> retryWhen(st.o oVar) {
        return b(toFlowable().retryWhen(oVar));
    }

    public final pt.c subscribe() {
        return subscribe(ut.m0.emptyConsumer(), ut.m0.f88682e);
    }

    public abstract void subscribeActual(q0 q0Var);

    public final n0<T> subscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new h2(this, m0Var));
    }

    public final <E extends q0> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final n0<T> takeUntil(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return takeUntil(new w1(iVar));
    }

    public final ku.o test() {
        ku.o oVar = new ku.o();
        subscribe(oVar);
        return oVar;
    }

    public final n0<T> timeout(long j10, TimeUnit timeUnit) {
        return a(j10, timeUnit, ou.j.computation(), null);
    }

    public final <R> R to(st.o oVar) {
        try {
            return (R) ((st.o) ut.o0.requireNonNull(oVar, "convert is null")).apply(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Deprecated
    public final c toCompletable() {
        return mu.a.onAssembly(new xt.m0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l toFlowable() {
        return this instanceof vt.b ? ((vt.b) this).fuseToFlowable() : mu.a.onAssembly(new r2(this));
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new wt.q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s toMaybe() {
        return this instanceof vt.c ? ((vt.c) this).fuseToMaybe() : mu.a.onAssembly(new a2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0 toObservable() {
        return this instanceof vt.d ? ((vt.d) this).fuseToObservable() : mu.a.onAssembly(new t2(this));
    }

    public final n0<T> unsubscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new v2(this, m0Var));
    }

    public final <U, R> n0<R> zipWith(t0 t0Var, st.c cVar) {
        return zip(this, t0Var, cVar);
    }

    public static <T> b0 concat(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        return mu.a.onAssembly(new bu.f1(g0Var, t1.toObservable(), 2, iu.k.f68411b));
    }

    public static <T> l concatEager(Iterable<? extends t0> iterable) {
        return l.fromIterable(iterable).concatMapEager(t1.toFlowable());
    }

    public static <T> n0<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        return b(l.fromFuture(future, j10, timeUnit));
    }

    public static <T> l merge(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "sources is null");
        return mu.a.onAssembly(new m4(bVar, t1.toFlowable(), false, Integer.MAX_VALUE, l.bufferSize()));
    }

    public static <T> l mergeDelayError(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "sources is null");
        return mu.a.onAssembly(new m4(bVar, t1.toFlowable(), true, Integer.MAX_VALUE, l.bufferSize()));
    }

    public static n0<Long> timer(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new p2(j10, timeUnit, m0Var));
    }

    public static <T, U> n0<T> using(Callable<U> callable, st.o oVar, st.g gVar, boolean z10) {
        ut.o0.requireNonNull(callable, "resourceSupplier is null");
        ut.o0.requireNonNull(oVar, "singleFunction is null");
        ut.o0.requireNonNull(gVar, "disposer is null");
        return mu.a.onAssembly(new x2(callable, oVar, gVar, z10));
    }

    public final n0<Boolean> contains(Object obj, st.d dVar) {
        ut.o0.requireNonNull(obj, "value is null");
        ut.o0.requireNonNull(dVar, "comparer is null");
        return mu.a.onAssembly(new du.f(this, obj, dVar));
    }

    public final n0<T> delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, ou.j.computation(), z10);
    }

    public final l repeat(long j10) {
        return toFlowable().repeat(j10);
    }

    public final n0<T> retry(long j10) {
        return b(toFlowable().retry(j10));
    }

    public final pt.c subscribe(st.b bVar) {
        ut.o0.requireNonNull(bVar, "onCallback is null");
        wt.d dVar = new wt.d(bVar);
        subscribe(dVar);
        return dVar;
    }

    public final n0<T> timeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return a(j10, timeUnit, m0Var, null);
    }

    public static <T> n0<T> error(Throwable th2) {
        ut.o0.requireNonNull(th2, "exception is null");
        return error((Callable<? extends Throwable>) ut.m0.justCallable(th2));
    }

    public static <T> n0<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, m0 m0Var) {
        return b(l.fromFuture(future, j10, timeUnit, m0Var));
    }

    public final n0<T> delay(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delay(j10, timeUnit, m0Var, false);
    }

    public final <U> n0<T> delaySubscription(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return mu.a.onAssembly(new du.u(this, t0Var));
    }

    public final n0<T> onErrorResumeNext(st.o oVar) {
        ut.o0.requireNonNull(oVar, "resumeFunctionInCaseOfError is null");
        return mu.a.onAssembly(new f2(this, oVar));
    }

    public final n0<T> retry(st.d dVar) {
        return b(toFlowable().retry(dVar));
    }

    public final <E> n0<T> takeUntil(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return mu.a.onAssembly(new k2(this, bVar));
    }

    public final ku.o test(boolean z10) {
        ku.o oVar = new ku.o();
        if (z10) {
            oVar.cancel();
        }
        subscribe(oVar);
        return oVar;
    }

    public final n0<T> timeout(long j10, TimeUnit timeUnit, m0 m0Var, t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return a(j10, timeUnit, m0Var, t0Var);
    }

    public static <T> l concat(tw.b bVar) {
        return concat(bVar, 2);
    }

    public static <T> n0<T> fromFuture(Future<? extends T> future, m0 m0Var) {
        return b(l.fromFuture(future, m0Var));
    }

    public static <T> n0<T> merge(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "source is null");
        return mu.a.onAssembly(new w0(t0Var, ut.m0.identity()));
    }

    public static <T> l mergeDelayError(t0 t0Var, t0 t0Var2) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        return mergeDelayError(l.fromArray(t0Var, t0Var2));
    }

    public static <T1, T2, R> n0<R> zip(t0 t0Var, t0 t0Var2, st.c cVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), t0Var, t0Var2);
    }

    public final n0<T> delay(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new du.m(this, j10, timeUnit, m0Var, z10));
    }

    public final n0<T> retry(long j10, st.q qVar) {
        return b(toFlowable().retry(j10, qVar));
    }

    public static <T> l concat(tw.b bVar, int i10) {
        ut.o0.requireNonNull(bVar, rJqlArycrfkilN.xJMj);
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new yt.n1(bVar, t1.toFlowable(), i10, iu.k.f68411b));
    }

    public final <U> n0<T> delaySubscription(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return mu.a.onAssembly(new du.q(this, g0Var));
    }

    public final n0<T> retry(st.q qVar) {
        return b(toFlowable().retry(qVar));
    }

    public final pt.c subscribe(st.g gVar) {
        return subscribe(gVar, ut.m0.f88682e);
    }

    public final <E> n0<T> takeUntil(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return takeUntil(new r2(t0Var));
    }

    public final n0<T> timeout(long j10, TimeUnit timeUnit, t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return a(j10, timeUnit, ou.j.computation(), t0Var);
    }

    public static <T> l merge(t0 t0Var, t0 t0Var2) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        return merge(l.fromArray(t0Var, t0Var2));
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2) {
        ut.o0.requireNonNull(gVar, "onSuccess is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        wt.k kVar = new wt.k(gVar, gVar2);
        subscribe(kVar);
        return kVar;
    }

    public static <T> l mergeDelayError(t0 t0Var, t0 t0Var2, t0 t0Var3) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        return mergeDelayError(l.fromArray(t0Var, t0Var2, t0Var3));
    }

    public static <T1, T2, T3, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, st.h hVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        return zipArray(ut.m0.toFunction(hVar), t0Var, t0Var2, t0Var3);
    }

    public final <U> n0<T> delaySubscription(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return mu.a.onAssembly(new du.s(this, bVar));
    }

    public static <T> l concat(t0 t0Var, t0 t0Var2) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        return concat(l.fromArray(t0Var, t0Var2));
    }

    public static <T> l merge(t0 t0Var, t0 t0Var2, t0 t0Var3) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        return merge(l.fromArray(t0Var, t0Var2, t0Var3));
    }

    public final n0<T> delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, ou.j.computation());
    }

    public final n0<T> delaySubscription(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delaySubscription(b0.timer(j10, timeUnit, m0Var));
    }

    @Override // mt.t0
    public final void subscribe(q0 q0Var) {
        ut.o0.requireNonNull(q0Var, "observer is null");
        q0 q0VarOnSubscribe = mu.a.onSubscribe(this, q0Var);
        ut.o0.requireNonNull(q0VarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(q0VarOnSubscribe);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static <T> l concat(t0 t0Var, t0 t0Var2, t0 t0Var3) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        return concat(l.fromArray(t0Var, t0Var2, t0Var3));
    }

    public static <T> l mergeDelayError(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        return mergeDelayError(l.fromArray(t0Var, t0Var2, t0Var3, t0Var4));
    }

    public static <T1, T2, T3, T4, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, st.i iVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        return zipArray(ut.m0.toFunction(iVar), t0Var, t0Var2, t0Var3, t0Var4);
    }

    public static <T> l merge(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        return merge(l.fromArray(t0Var, t0Var2, t0Var3, t0Var4));
    }

    public static <T> l concat(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        return concat(l.fromArray(t0Var, t0Var2, t0Var3, t0Var4));
    }

    public static <T1, T2, T3, T4, T5, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, t0 t0Var5, st.j jVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        ut.o0.requireNonNull(t0Var5, "source5 is null");
        return zipArray(ut.m0.toFunction(jVar), t0Var, t0Var2, t0Var3, t0Var4, t0Var5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, t0 t0Var5, t0 t0Var6, st.k kVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        ut.o0.requireNonNull(t0Var5, "source5 is null");
        ut.o0.requireNonNull(t0Var6, "source6 is null");
        return zipArray(ut.m0.toFunction(kVar), t0Var, t0Var2, t0Var3, t0Var4, t0Var5, t0Var6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, t0 t0Var5, t0 t0Var6, t0 t0Var7, st.l lVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        ut.o0.requireNonNull(t0Var5, "source5 is null");
        ut.o0.requireNonNull(t0Var6, "source6 is null");
        ut.o0.requireNonNull(t0Var7, "source7 is null");
        return zipArray(ut.m0.toFunction(lVar), t0Var, t0Var2, t0Var3, t0Var4, t0Var5, t0Var6, t0Var7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, t0 t0Var5, t0 t0Var6, t0 t0Var7, t0 t0Var8, st.m mVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        ut.o0.requireNonNull(t0Var5, "source5 is null");
        ut.o0.requireNonNull(t0Var6, "source6 is null");
        ut.o0.requireNonNull(t0Var7, "source7 is null");
        ut.o0.requireNonNull(t0Var8, "source8 is null");
        return zipArray(ut.m0.toFunction(mVar), t0Var, t0Var2, t0Var3, t0Var4, t0Var5, t0Var6, t0Var7, t0Var8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> n0<R> zip(t0 t0Var, t0 t0Var2, t0 t0Var3, t0 t0Var4, t0 t0Var5, t0 t0Var6, t0 t0Var7, t0 t0Var8, t0 t0Var9, st.n nVar) {
        ut.o0.requireNonNull(t0Var, "source1 is null");
        ut.o0.requireNonNull(t0Var2, "source2 is null");
        ut.o0.requireNonNull(t0Var3, "source3 is null");
        ut.o0.requireNonNull(t0Var4, "source4 is null");
        ut.o0.requireNonNull(t0Var5, "source5 is null");
        ut.o0.requireNonNull(t0Var6, "source6 is null");
        ut.o0.requireNonNull(t0Var7, "source7 is null");
        ut.o0.requireNonNull(t0Var8, "source8 is null");
        ut.o0.requireNonNull(t0Var9, "source9 is null");
        return zipArray(ut.m0.toFunction(nVar), t0Var, t0Var2, t0Var3, t0Var4, t0Var5, t0Var6, t0Var7, t0Var8, t0Var9);
    }
}
