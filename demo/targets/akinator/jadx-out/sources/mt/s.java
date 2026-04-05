package mt;

import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import io.ktor.http.LinkHeader;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import yt.n1;
import zt.a1;
import zt.a2;
import zt.c1;
import zt.c2;
import zt.c3;
import zt.d4;
import zt.e1;
import zt.e3;
import zt.f4;
import zt.g1;
import zt.g2;
import zt.g3;
import zt.h4;
import zt.j1;
import zt.j3;
import zt.j4;
import zt.k2;
import zt.k4;
import zt.l2;
import zt.m1;
import zt.m2;
import zt.m3;
import zt.m4;
import zt.n4;
import zt.o2;
import zt.p1;
import zt.p2;
import zt.p3;
import zt.p4;
import zt.r4;
import zt.s1;
import zt.s3;
import zt.t1;
import zt.u1;
import zt.u2;
import zt.v0;
import zt.v2;
import zt.v3;
import zt.v4;
import zt.w1;
import zt.x1;
import zt.x2;
import zt.x4;
import zt.y1;
import zt.z2;
import zt.z3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s implements y {
    public static <T> s amb(Iterable<? extends y> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new zt.c(null, iterable));
    }

    public static <T> s ambArray(y... yVarArr) {
        return yVarArr.length == 0 ? empty() : yVarArr.length == 1 ? wrap(yVarArr[0]) : mu.a.onAssembly(new zt.c(yVarArr, null));
    }

    public static <T> l concat(Iterable<? extends y> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new zt.l(iterable));
    }

    public static <T> l concatArray(y... yVarArr) {
        ut.o0.requireNonNull(yVarArr, "sources is null");
        return yVarArr.length == 0 ? l.empty() : yVarArr.length == 1 ? mu.a.onAssembly(new h4(yVarArr[0])) : mu.a.onAssembly(new zt.h(yVarArr));
    }

    public static <T> l concatArrayDelayError(y... yVarArr) {
        return yVarArr.length == 0 ? l.empty() : yVarArr.length == 1 ? mu.a.onAssembly(new h4(yVarArr[0])) : mu.a.onAssembly(new zt.j(yVarArr));
    }

    public static <T> l concatArrayEager(y... yVarArr) {
        return l.fromArray(yVarArr).concatMapEager(k4.instance());
    }

    public static <T> l concatDelayError(Iterable<? extends y> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return l.fromIterable(iterable).concatMapDelayError(k4.instance());
    }

    public static <T> l concatEager(Iterable<? extends y> iterable) {
        return l.fromIterable(iterable).concatMapEager(k4.instance());
    }

    public static <T> s create(w wVar) {
        ut.o0.requireNonNull(wVar, "onSubscribe is null");
        return mu.a.onAssembly(new zt.r(wVar));
    }

    public static <T> s defer(Callable<? extends y> callable) {
        ut.o0.requireNonNull(callable, "maybeSupplier is null");
        return mu.a.onAssembly(new zt.s(callable));
    }

    public static <T> s empty() {
        return mu.a.onAssembly(zt.o0.f98711b);
    }

    public static <T> s error(Throwable th2) {
        ut.o0.requireNonNull(th2, "exception is null");
        return mu.a.onAssembly(new zt.s0(th2));
    }

    public static <T> s fromAction(st.a aVar) {
        ut.o0.requireNonNull(aVar, "run is null");
        return mu.a.onAssembly(new t1(aVar));
    }

    public static <T> s fromCallable(Callable<? extends T> callable) {
        ut.o0.requireNonNull(callable, "callable is null");
        return mu.a.onAssembly(new u1(callable));
    }

    public static <T> s fromCompletable(i iVar) {
        ut.o0.requireNonNull(iVar, "completableSource is null");
        return mu.a.onAssembly(new w1(iVar));
    }

    public static <T> s fromFuture(Future<? extends T> future) {
        ut.o0.requireNonNull(future, "future is null");
        return mu.a.onAssembly(new x1(future, 0L, null));
    }

    public static <T> s fromRunnable(Runnable runnable) {
        ut.o0.requireNonNull(runnable, "run is null");
        return mu.a.onAssembly(new y1(runnable));
    }

    public static <T> s fromSingle(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "singleSource is null");
        return mu.a.onAssembly(new a2(t0Var));
    }

    public static <T> s just(T t10) {
        ut.o0.requireNonNull(t10, "item is null");
        return mu.a.onAssembly(new l2(t10));
    }

    public static <T> l merge(Iterable<? extends y> iterable) {
        return merge(l.fromIterable(iterable));
    }

    public static <T> l mergeArray(y... yVarArr) {
        ut.o0.requireNonNull(yVarArr, "sources is null");
        return yVarArr.length == 0 ? l.empty() : yVarArr.length == 1 ? mu.a.onAssembly(new h4(yVarArr[0])) : mu.a.onAssembly(new u2(yVarArr));
    }

    public static <T> l mergeArrayDelayError(y... yVarArr) {
        return yVarArr.length == 0 ? l.empty() : l.fromArray(yVarArr).flatMap(k4.instance(), true, yVarArr.length);
    }

    public static <T> l mergeDelayError(Iterable<? extends y> iterable) {
        return l.fromIterable(iterable).flatMap(k4.instance(), true);
    }

    public static <T> s never() {
        return mu.a.onAssembly(v2.f98802b);
    }

    public static <T> n0<Boolean> sequenceEqual(y yVar, y yVar2) {
        return sequenceEqual(yVar, yVar2, ut.o0.equalsPredicate());
    }

    public static s timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, ou.j.computation());
    }

    public static <T, D> s using(Callable<? extends D> callable, st.o oVar, st.g gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T> s wrap(y yVar) {
        if (yVar instanceof s) {
            return mu.a.onAssembly((s) yVar);
        }
        ut.o0.requireNonNull(yVar, "onSubscribe is null");
        return mu.a.onAssembly(new n4(yVar));
    }

    public static <T, R> s zip(Iterable<? extends y> iterable, st.o oVar) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new x4(iterable, oVar));
    }

    public static <T, R> s zipArray(st.o oVar, y... yVarArr) {
        ut.o0.requireNonNull(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return empty();
        }
        ut.o0.requireNonNull(oVar, "zipper is null");
        return mu.a.onAssembly(new v4(yVarArr, oVar));
    }

    public final s ambWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return ambArray(this, yVar);
    }

    public final <R> R as(t tVar) {
        ut.o0.requireNonNull(tVar, "converter is null").getClass();
        throw new ClassCastException();
    }

    public final Object blockingGet() {
        wt.h hVar = new wt.h();
        subscribe(hVar);
        return hVar.blockingGet();
    }

    public final s cache() {
        return mu.a.onAssembly(new zt.e(this));
    }

    public final <U> s cast(Class<? extends U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return map(ut.m0.castFunction(cls));
    }

    public final <R> s compose(z zVar) {
        ut.o0.requireNonNull(zVar, "transformer is null").getClass();
        throw new ClassCastException();
    }

    public final <R> s concatMap(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new s1(this, oVar));
    }

    public final l concatWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return concat(this, yVar);
    }

    public final n0<Boolean> contains(Object obj) {
        ut.o0.requireNonNull(obj, "item is null");
        return mu.a.onAssembly(new zt.n(this, obj));
    }

    public final n0<Long> count() {
        return mu.a.onAssembly(new zt.p(this));
    }

    public final s defaultIfEmpty(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem is null");
        return switchIfEmpty(just(obj));
    }

    public final s delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, ou.j.computation());
    }

    public final <U> s delaySubscription(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "subscriptionIndicator is null");
        return mu.a.onAssembly(new zt.a0(this, bVar));
    }

    public final s doAfterSuccess(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onAfterSuccess is null");
        return mu.a.onAssembly(new zt.h0(this, gVar));
    }

    public final s doAfterTerminate(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer3 = ut.m0.emptyConsumer();
        st.a aVar2 = (st.a) ut.o0.requireNonNull(aVar, "onAfterTerminate is null");
        ut.o oVar = ut.m0.f88680c;
        return mu.a.onAssembly(new g3(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, oVar, aVar2, oVar));
    }

    public final s doFinally(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onFinally is null");
        return mu.a.onAssembly(new zt.j0(this, aVar));
    }

    public final s doOnComplete(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer3 = ut.m0.emptyConsumer();
        st.a aVar2 = (st.a) ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o oVar = ut.m0.f88680c;
        return mu.a.onAssembly(new g3(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, aVar2, oVar, oVar));
    }

    public final s doOnDispose(st.a aVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer3 = ut.m0.emptyConsumer();
        st.a aVar2 = (st.a) ut.o0.requireNonNull(aVar, "onDispose is null");
        ut.o oVar = ut.m0.f88680c;
        return mu.a.onAssembly(new g3(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, oVar, oVar, aVar2));
    }

    public final s doOnError(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        st.g gVar2 = (st.g) ut.o0.requireNonNull(gVar, "onError is null");
        ut.o oVar = ut.m0.f88680c;
        return mu.a.onAssembly(new g3(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVar2, oVar, oVar, oVar));
    }

    public final s doOnEvent(st.b bVar) {
        ut.o0.requireNonNull(bVar, "onEvent is null");
        return mu.a.onAssembly(new zt.l0(this, bVar));
    }

    public final s doOnSubscribe(st.g gVar) {
        st.g gVar2 = (st.g) ut.o0.requireNonNull(gVar, "onSubscribe is null");
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return mu.a.onAssembly(new g3(this, gVar2, gVarEmptyConsumer, gVarEmptyConsumer2, oVar, oVar, oVar));
    }

    public final s doOnSuccess(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        st.g gVar2 = (st.g) ut.o0.requireNonNull(gVar, "onSuccess is null");
        st.g gVarEmptyConsumer2 = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return mu.a.onAssembly(new g3(this, gVarEmptyConsumer, gVar2, gVarEmptyConsumer2, oVar, oVar, oVar));
    }

    public final s filter(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new v0(this, qVar));
    }

    public final <R> s flatMap(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new s1(this, oVar));
    }

    public final c flatMapCompletable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new c1(this, oVar));
    }

    public final <R> b0 flatMapObservable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.y(this, oVar));
    }

    public final <R> l flatMapPublisher(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.a0(this, oVar));
    }

    public final <R> n0<R> flatMapSingle(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new m1(this, oVar));
    }

    public final <R> s flatMapSingleElement(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new p1(this, oVar));
    }

    public final <U> l flattenAsFlowable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new e1(this, oVar));
    }

    public final <U> b0 flattenAsObservable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new g1(this, oVar));
    }

    public final s hide() {
        return mu.a.onAssembly(new c2(this));
    }

    public final c ignoreElement() {
        return mu.a.onAssembly(new g2(this));
    }

    public final n0<Boolean> isEmpty() {
        return mu.a.onAssembly(new k2(this));
    }

    public final <R> s lift(x xVar) {
        ut.o0.requireNonNull(xVar, "lift is null");
        return mu.a.onAssembly(new m2(this, xVar));
    }

    public final <R> s map(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new o2(this, oVar));
    }

    public final n0<a0> materialize() {
        return mu.a.onAssembly(new p2(this));
    }

    public final l mergeWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return merge(this, yVar);
    }

    public final s observeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new x2(this, m0Var));
    }

    public final <U> s ofType(Class<U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return filter(ut.m0.isInstanceOf(cls)).cast(cls);
    }

    public final s onErrorComplete() {
        return onErrorComplete(ut.m0.alwaysTrue());
    }

    public final s onErrorResumeNext(y yVar) {
        ut.o0.requireNonNull(yVar, "next is null");
        return onErrorResumeNext(ut.m0.justFunction(yVar));
    }

    public final s onErrorReturn(st.o oVar) {
        ut.o0.requireNonNull(oVar, "valueSupplier is null");
        return mu.a.onAssembly(new e3(this, oVar));
    }

    public final s onErrorReturnItem(Object obj) {
        ut.o0.requireNonNull(obj, "item is null");
        return onErrorReturn(ut.m0.justFunction(obj));
    }

    public final s onExceptionResumeNext(y yVar) {
        ut.o0.requireNonNull(yVar, "next is null");
        return mu.a.onAssembly(new c3(this, ut.m0.justFunction(yVar), false));
    }

    public final s onTerminateDetach() {
        return mu.a.onAssembly(new zt.f0(this));
    }

    public final l repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final l repeatUntil(st.e eVar) {
        return toFlowable().repeatUntil(eVar);
    }

    public final l repeatWhen(st.o oVar) {
        return toFlowable().repeatWhen(oVar);
    }

    public final s retry() {
        return retry(Long.MAX_VALUE, ut.m0.alwaysTrue());
    }

    public final s retryUntil(st.e eVar) {
        ut.o0.requireNonNull(eVar, "stop is null");
        return retry(Long.MAX_VALUE, ut.m0.predicateReverseFor(eVar));
    }

    public final s retryWhen(st.o oVar) {
        return toFlowable().retryWhen(oVar).singleElement();
    }

    public final pt.c subscribe() {
        return subscribe(ut.m0.emptyConsumer(), ut.m0.f88682e, ut.m0.f88680c);
    }

    public abstract void subscribeActual(v vVar);

    public final s subscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new j3(this, m0Var));
    }

    public final <E extends v> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final s switchIfEmpty(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return mu.a.onAssembly(new m3(this, yVar));
    }

    public final <U> s takeUntil(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return mu.a.onAssembly(new s3(this, yVar));
    }

    public final ku.o test() {
        ku.o oVar = new ku.o();
        subscribe(oVar);
        return oVar;
    }

    public final s timeout(long j10, TimeUnit timeUnit) {
        return timeout(j10, timeUnit, ou.j.computation());
    }

    public final <R> R to(st.o oVar) {
        try {
            return (R) ((st.o) ut.o0.requireNonNull(oVar, "convert is null")).apply(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l toFlowable() {
        return this instanceof vt.b ? ((vt.b) this).fuseToFlowable() : mu.a.onAssembly(new h4(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0 toObservable() {
        return this instanceof vt.d ? ((vt.d) this).fuseToObservable() : mu.a.onAssembly(new j4(this));
    }

    public final n0<Object> toSingle(Object obj) {
        ut.o0.requireNonNull(obj, "defaultValue is null");
        return mu.a.onAssembly(new m4(this, obj));
    }

    public final s unsubscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new p4(this, m0Var));
    }

    public final <U, R> s zipWith(y yVar, st.c cVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return zip(this, yVar, cVar);
    }

    public static <T> l concatEager(tw.b bVar) {
        return l.fromPublisher(bVar).concatMapEager(k4.instance());
    }

    public static <T> l merge(tw.b bVar) {
        return merge(bVar, Integer.MAX_VALUE);
    }

    public static <T> l mergeDelayError(tw.b bVar) {
        return mergeDelayError(bVar, Integer.MAX_VALUE);
    }

    public static <T> n0<Boolean> sequenceEqual(y yVar, y yVar2, st.d dVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(dVar, "isEqual is null");
        return mu.a.onAssembly(new zt.r0(yVar, yVar2, dVar));
    }

    public static s timer(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new f4(Math.max(0L, j10), timeUnit, m0Var));
    }

    public static <T> s unsafeCreate(y yVar) {
        if (yVar instanceof s) {
            throw new IllegalArgumentException(NyKZx.HsEQNPA);
        }
        ut.o0.requireNonNull(yVar, "onSubscribe is null");
        return mu.a.onAssembly(new n4(yVar));
    }

    public static <T, D> s using(Callable<? extends D> callable, st.o oVar, st.g gVar, boolean z10) {
        ut.o0.requireNonNull(callable, "resourceSupplier is null");
        ut.o0.requireNonNull(oVar, "sourceSupplier is null");
        ut.o0.requireNonNull(gVar, "disposer is null");
        return mu.a.onAssembly(new r4(callable, oVar, gVar, z10));
    }

    public final s delay(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new zt.u(this, Math.max(0L, j10), timeUnit, m0Var));
    }

    public final s doOnTerminate(st.a aVar) {
        ut.o0.requireNonNull(aVar, PcrIk.jPPOwoLvjzAdDP);
        return mu.a.onAssembly(new zt.n0(this, aVar));
    }

    public final s onErrorComplete(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new z2(this, qVar));
    }

    public final l repeat(long j10) {
        return toFlowable().repeat(j10);
    }

    public final s retry(st.d dVar) {
        return toFlowable().retry(dVar).singleElement();
    }

    public final pt.c subscribe(st.g gVar) {
        return subscribe(gVar, ut.m0.f88682e, ut.m0.f88680c);
    }

    public final s timeout(long j10, TimeUnit timeUnit, y yVar) {
        ut.o0.requireNonNull(yVar, "fallback is null");
        return timeout(j10, timeUnit, ou.j.computation(), yVar);
    }

    public static <T> l concat(y yVar, y yVar2) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        return concatArray(yVar, yVar2);
    }

    public static <T> l concatDelayError(tw.b bVar) {
        return l.fromPublisher(bVar).concatMapDelayError(k4.instance());
    }

    public static <T> s error(Callable<? extends Throwable> callable) {
        ut.o0.requireNonNull(callable, "errorSupplier is null");
        return mu.a.onAssembly(new zt.t0(callable));
    }

    public static <T> s fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        ut.o0.requireNonNull(future, "future is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        return mu.a.onAssembly(new x1(future, j10, timeUnit));
    }

    public static <T> l merge(tw.b bVar, int i10) {
        ut.o0.requireNonNull(bVar, "source is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new yt.m4(bVar, k4.instance(), false, i10, 1));
    }

    public static <T> l mergeDelayError(tw.b bVar, int i10) {
        ut.o0.requireNonNull(bVar, "source is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new yt.m4(bVar, k4.instance(), true, i10, 1));
    }

    public final s delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, ou.j.computation());
    }

    public final <R> s flatMap(st.o oVar, st.o oVar2, Callable<? extends y> callable) {
        ut.o0.requireNonNull(oVar, "onSuccessMapper is null");
        ut.o0.requireNonNull(oVar2, "onErrorMapper is null");
        ut.o0.requireNonNull(callable, "onCompleteSupplier is null");
        return mu.a.onAssembly(new j1(this, oVar, oVar2, callable));
    }

    public final s onErrorResumeNext(st.o oVar) {
        ut.o0.requireNonNull(oVar, "resumeFunction is null");
        return mu.a.onAssembly(new c3(this, oVar, true));
    }

    public final s retry(long j10) {
        return retry(j10, ut.m0.alwaysTrue());
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2) {
        return subscribe(gVar, gVar2, ut.m0.f88680c);
    }

    public final n0<Object> switchIfEmpty(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return mu.a.onAssembly(new p3(this, t0Var));
    }

    public final <U> s takeUntil(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return mu.a.onAssembly(new v3(this, bVar));
    }

    public final ku.o test(boolean z10) {
        ku.o oVar = new ku.o();
        if (z10) {
            oVar.cancel();
        }
        subscribe(oVar);
        return oVar;
    }

    public final n0<Object> toSingle() {
        return mu.a.onAssembly(new m4(this, null));
    }

    public static <T1, T2, R> s zip(y yVar, y yVar2, st.c cVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), yVar, yVar2);
    }

    public final Object blockingGet(Object obj) {
        ut.o0.requireNonNull(obj, "defaultValue is null");
        wt.h hVar = new wt.h();
        subscribe(hVar);
        return hVar.blockingGet(obj);
    }

    public final s delaySubscription(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delaySubscription(l.timer(j10, timeUnit, m0Var));
    }

    public final s retry(long j10, st.q qVar) {
        return toFlowable().retry(j10, qVar).singleElement();
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2, st.a aVar) {
        ut.o0.requireNonNull(gVar, "onSuccess is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        return (pt.c) subscribeWith(new zt.f(gVar, gVar2, aVar));
    }

    public final s timeout(long j10, TimeUnit timeUnit, m0 m0Var, y yVar) {
        ut.o0.requireNonNull(yVar, "fallback is null");
        return timeout(timer(j10, timeUnit, m0Var), yVar);
    }

    public final <U, V> s delay(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "delayIndicator is null");
        return mu.a.onAssembly(new zt.x(this, bVar));
    }

    public final s retry(st.q qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public static <T> l concat(y yVar, y yVar2, y yVar3) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        return concatArray(yVar, yVar2, yVar3);
    }

    public static <T> s merge(y yVar) {
        ut.o0.requireNonNull(yVar, "source is null");
        return mu.a.onAssembly(new s1(yVar, ut.m0.identity()));
    }

    public static <T> l mergeDelayError(y yVar, y yVar2) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        return mergeArrayDelayError(yVar, yVar2);
    }

    public final s timeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return timeout(timer(j10, timeUnit, m0Var));
    }

    public static <T1, T2, T3, R> s zip(y yVar, y yVar2, y yVar3, st.h hVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        return zipArray(ut.m0.toFunction(hVar), yVar, yVar2, yVar3);
    }

    public final <U, R> s flatMap(st.o oVar, st.c cVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return mu.a.onAssembly(new a1(this, oVar, cVar));
    }

    public final <U> s timeout(y yVar) {
        ut.o0.requireNonNull(yVar, "timeoutIndicator is null");
        return mu.a.onAssembly(new z3(this, yVar, null));
    }

    public static <T> l merge(y yVar, y yVar2) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        return mergeArray(yVar, yVar2);
    }

    @Override // mt.y
    public final void subscribe(v vVar) {
        ut.o0.requireNonNull(vVar, "observer is null");
        v vVarOnSubscribe = mu.a.onSubscribe(this, vVar);
        ut.o0.requireNonNull(vVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(vVarOnSubscribe);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static <T> l mergeDelayError(y yVar, y yVar2, y yVar3) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        return mergeArrayDelayError(yVar, yVar2, yVar3);
    }

    public final <U> s timeout(y yVar, y yVar2) {
        ut.o0.requireNonNull(yVar, "timeoutIndicator is null");
        ut.o0.requireNonNull(yVar2, "fallback is null");
        return mu.a.onAssembly(new z3(this, yVar, yVar2));
    }

    public static <T> l concat(y yVar, y yVar2, y yVar3, y yVar4) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        return concatArray(yVar, yVar2, yVar3, yVar4);
    }

    public static <T> l merge(y yVar, y yVar2, y yVar3) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        return mergeArray(yVar, yVar2, yVar3);
    }

    public static <T1, T2, T3, T4, R> s zip(y yVar, y yVar2, y yVar3, y yVar4, st.i iVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        return zipArray(ut.m0.toFunction(iVar), yVar, yVar2, yVar3, yVar4);
    }

    public final <U> s timeout(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "timeoutIndicator is null");
        return mu.a.onAssembly(new d4(this, bVar, null));
    }

    public static <T> l mergeDelayError(y yVar, y yVar2, y yVar3, y yVar4) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        return mergeArrayDelayError(yVar, yVar2, yVar3, yVar4);
    }

    public final <U> s timeout(tw.b bVar, y yVar) {
        ut.o0.requireNonNull(bVar, "timeoutIndicator is null");
        ut.o0.requireNonNull(yVar, "fallback is null");
        return mu.a.onAssembly(new d4(this, bVar, yVar));
    }

    public static <T> l concat(tw.b bVar) {
        return concat(bVar, 2);
    }

    public static <T> l merge(y yVar, y yVar2, y yVar3, y yVar4) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        return mergeArray(yVar, yVar2, yVar3, yVar4);
    }

    public static <T> l concat(tw.b bVar, int i10) {
        ut.o0.requireNonNull(bVar, "sources is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new n1(bVar, k4.instance(), i10, iu.k.f68411b));
    }

    public static <T1, T2, T3, T4, T5, R> s zip(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, st.j jVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        ut.o0.requireNonNull(yVar5, "source5 is null");
        return zipArray(ut.m0.toFunction(jVar), yVar, yVar2, yVar3, yVar4, yVar5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> s zip(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, y yVar6, st.k kVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        ut.o0.requireNonNull(yVar5, "source5 is null");
        ut.o0.requireNonNull(yVar6, "source6 is null");
        return zipArray(ut.m0.toFunction(kVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> s zip(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, y yVar6, y yVar7, st.l lVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        ut.o0.requireNonNull(yVar5, "source5 is null");
        ut.o0.requireNonNull(yVar6, "source6 is null");
        ut.o0.requireNonNull(yVar7, "source7 is null");
        return zipArray(ut.m0.toFunction(lVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> s zip(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, y yVar6, y yVar7, y yVar8, st.m mVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, "source3 is null");
        ut.o0.requireNonNull(yVar4, "source4 is null");
        ut.o0.requireNonNull(yVar5, "source5 is null");
        ut.o0.requireNonNull(yVar6, "source6 is null");
        ut.o0.requireNonNull(yVar7, "source7 is null");
        ut.o0.requireNonNull(yVar8, "source8 is null");
        return zipArray(ut.m0.toFunction(mVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> s zip(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, y yVar6, y yVar7, y yVar8, y yVar9, st.n nVar) {
        ut.o0.requireNonNull(yVar, "source1 is null");
        ut.o0.requireNonNull(yVar2, "source2 is null");
        ut.o0.requireNonNull(yVar3, TJzY.DZlFWQVhyUFPlq);
        ut.o0.requireNonNull(yVar4, "source4 is null");
        ut.o0.requireNonNull(yVar5, "source5 is null");
        ut.o0.requireNonNull(yVar6, "source6 is null");
        ut.o0.requireNonNull(yVar7, "source7 is null");
        ut.o0.requireNonNull(yVar8, "source8 is null");
        ut.o0.requireNonNull(yVar9, "source9 is null");
        return zipArray(ut.m0.toFunction(nVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9);
    }
}
