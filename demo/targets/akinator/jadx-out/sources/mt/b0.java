package mt;

import bu.a1;
import bu.a2;
import bu.a6;
import bu.a7;
import bu.a8;
import bu.ab;
import bu.ac;
import bu.b2;
import bu.b4;
import bu.ba;
import bu.c3;
import bu.c4;
import bu.c6;
import bu.c9;
import bu.cc;
import bu.d4;
import bu.da;
import bu.db;
import bu.e3;
import bu.e6;
import bu.ec;
import bu.ed;
import bu.f1;
import bu.f3;
import bu.f4;
import bu.fa;
import bu.fb;
import bu.g2;
import bu.g3;
import bu.g6;
import bu.h1;
import bu.h4;
import bu.h7;
import bu.h9;
import bu.hb;
import bu.hc;
import bu.hd;
import bu.i3;
import bu.i4;
import bu.ia;
import bu.j1;
import bu.j2;
import bu.j6;
import bu.j7;
import bu.jb;
import bu.jc;
import bu.k4;
import bu.k9;
import bu.ka;
import bu.l1;
import bu.l2;
import bu.l3;
import bu.l4;
import bu.l7;
import bu.lb;
import bu.ld;
import bu.m6;
import bu.m9;
import bu.mc;
import bu.n1;
import bu.n2;
import bu.n7;
import bu.na;
import bu.nb;
import bu.o5;
import bu.o9;
import bu.od;
import bu.p2;
import bu.p6;
import bu.p7;
import bu.pa;
import bu.pc;
import bu.q5;
import bu.q6;
import bu.q7;
import bu.qd;
import bu.r1;
import bu.r2;
import bu.r3;
import bu.r8;
import bu.s4;
import bu.s5;
import bu.s6;
import bu.sa;
import bu.sb;
import bu.t2;
import bu.t8;
import bu.u1;
import bu.u3;
import bu.u4;
import bu.u5;
import bu.u6;
import bu.u9;
import bu.ua;
import bu.uc;
import bu.v2;
import bu.v5;
import bu.v7;
import bu.v8;
import bu.v9;
import bu.w4;
import bu.w6;
import bu.wa;
import bu.x0;
import bu.x1;
import bu.x2;
import bu.x3;
import bu.x5;
import bu.x7;
import bu.x9;
import bu.xc;
import bu.y2;
import bu.y4;
import bu.y8;
import bu.ya;
import bu.yb;
import bu.z3;
import bu.z5;
import bu.z9;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.unity3d.ads.beta.xyn.RnJusJ;
import cv.BLca.YsiBvdpw;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import io.ktor.http.LinkHeader;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p0.o2;
import yt.b5;
import yt.c8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b0 implements g0 {
    public static <T> b0 amb(Iterable<? extends g0> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new bu.r(null, iterable));
    }

    public static <T> b0 ambArray(g0... g0VarArr) {
        ut.o0.requireNonNull(g0VarArr, "sources is null");
        int length = g0VarArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(g0VarArr[0]) : mu.a.onAssembly(new bu.r(g0VarArr, null));
    }

    public static int bufferSize() {
        return l.bufferSize();
    }

    public static <T, R> b0 combineLatest(st.o oVar, int i10, g0... g0VarArr) {
        return combineLatest(g0VarArr, oVar, i10);
    }

    public static <T, R> b0 combineLatestDelayError(g0[] g0VarArr, st.o oVar) {
        return combineLatestDelayError(g0VarArr, oVar, bufferSize());
    }

    public static <T> b0 concat(Iterable<? extends g0> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(ut.m0.identity(), bufferSize(), false);
    }

    public static <T> b0 concatArray(g0... g0VarArr) {
        return g0VarArr.length == 0 ? empty() : g0VarArr.length == 1 ? wrap(g0VarArr[0]) : mu.a.onAssembly(new f1(fromArray(g0VarArr), ut.m0.identity(), bufferSize(), iu.k.f68412c));
    }

    public static <T> b0 concatArrayDelayError(g0... g0VarArr) {
        return g0VarArr.length == 0 ? empty() : g0VarArr.length == 1 ? wrap(g0VarArr[0]) : concatDelayError(fromArray(g0VarArr));
    }

    public static <T> b0 concatArrayEager(g0... g0VarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), g0VarArr);
    }

    public static <T> b0 concatArrayEagerDelayError(g0... g0VarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), g0VarArr);
    }

    public static <T> b0 concatDelayError(Iterable<? extends g0> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> b0 concatEager(g0 g0Var) {
        return concatEager(g0Var, bufferSize(), bufferSize());
    }

    public static <T> b0 create(e0 e0Var) {
        ut.o0.requireNonNull(e0Var, "source is null");
        return mu.a.onAssembly(new u1(e0Var));
    }

    public static <T> b0 defer(Callable<? extends g0> callable) {
        ut.o0.requireNonNull(callable, "supplier is null");
        return mu.a.onAssembly(new b2(callable));
    }

    public static <T> b0 empty() {
        return mu.a.onAssembly(f3.f10301b);
    }

    public static <T> b0 error(Callable<? extends Throwable> callable) {
        ut.o0.requireNonNull(callable, "errorSupplier is null");
        return mu.a.onAssembly(new g3(callable));
    }

    public static <T> b0 fromArray(T... tArr) {
        ut.o0.requireNonNull(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : mu.a.onAssembly(new b4(tArr));
    }

    public static <T> b0 fromCallable(Callable<? extends T> callable) {
        ut.o0.requireNonNull(callable, "supplier is null");
        return mu.a.onAssembly(new c4(callable));
    }

    public static <T> b0 fromFuture(Future<? extends T> future) {
        ut.o0.requireNonNull(future, "future is null");
        return mu.a.onAssembly(new d4(future, 0L, null));
    }

    public static <T> b0 fromIterable(Iterable<? extends T> iterable) {
        ut.o0.requireNonNull(iterable, "source is null");
        return mu.a.onAssembly(new f4(iterable));
    }

    public static <T> b0 fromPublisher(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "publisher is null");
        return mu.a.onAssembly(new h4(bVar));
    }

    public static <T> b0 generate(st.g gVar) {
        ut.o0.requireNonNull(gVar, "generator is null");
        return generate(ut.m0.nullSupplier(), o5.simpleGenerator(gVar), ut.m0.emptyConsumer());
    }

    public static b0 interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, ou.j.computation());
    }

    public static b0 intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, ou.j.computation());
    }

    public static <T> b0 just(T t10) {
        ut.o0.requireNonNull(t10, "item is null");
        return mu.a.onAssembly(new v5(t10));
    }

    public static <T> b0 merge(Iterable<? extends g0> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), false, i10, i11);
    }

    public static <T> b0 mergeArray(int i10, int i11, g0... g0VarArr) {
        return fromArray(g0VarArr).flatMap(ut.m0.identity(), false, i10, i11);
    }

    public static <T> b0 mergeArrayDelayError(int i10, int i11, g0... g0VarArr) {
        return fromArray(g0VarArr).flatMap(ut.m0.identity(), true, i10, i11);
    }

    public static <T> b0 mergeDelayError(Iterable<? extends g0> iterable) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), true);
    }

    public static <T> b0 never() {
        return mu.a.onAssembly(q6.f10854b);
    }

    public static b0 range(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(a.b.e(i11, "count >= 0 required but it was "));
        }
        if (i11 == 0) {
            return empty();
        }
        if (i11 == 1) {
            return just(Integer.valueOf(i10));
        }
        if (i10 + (i11 - 1) <= 2147483647L) {
            return mu.a.onAssembly(new j7(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static b0 rangeLong(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(o2.m(j11, "count >= 0 required but it was "));
        }
        if (j11 == 0) {
            return empty();
        }
        if (j11 == 1) {
            return just(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return mu.a.onAssembly(new l7(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> n0<Boolean> sequenceEqual(g0 g0Var, g0 g0Var2) {
        return sequenceEqual(g0Var, g0Var2, ut.o0.equalsPredicate(), bufferSize());
    }

    public static <T> b0 switchOnNext(g0 g0Var, int i10) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new sa(g0Var, ut.m0.identity(), i10, false));
    }

    public static <T> b0 switchOnNextDelayError(g0 g0Var) {
        return switchOnNextDelayError(g0Var, bufferSize());
    }

    public static b0 timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, ou.j.computation());
    }

    public static <T> b0 unsafeCreate(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "onSubscribe is null");
        if (g0Var instanceof b0) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return mu.a.onAssembly(new i4(g0Var));
    }

    public static <T, D> b0 using(Callable<? extends D> callable, st.o oVar, st.g gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T> b0 wrap(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "source is null");
        return g0Var instanceof b0 ? mu.a.onAssembly((b0) g0Var) : mu.a.onAssembly(new i4(g0Var));
    }

    public static <T, R> b0 zip(Iterable<? extends g0> iterable, st.o oVar) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new od(null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> b0 zipArray(st.o oVar, boolean z10, int i10, g0... g0VarArr) {
        if (g0VarArr.length == 0) {
            return empty();
        }
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new od(g0VarArr, null, oVar, i10, z10));
    }

    public static <T, R> b0 zipIterable(Iterable<? extends g0> iterable, st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new od(null, iterable, oVar, i10, z10));
    }

    public final b0 a(st.g gVar, st.g gVar2, st.a aVar, st.a aVar2) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o0.requireNonNull(aVar2, "onAfterTerminate is null");
        return mu.a.onAssembly(new x2(this, gVar, gVar2, aVar, aVar2));
    }

    public final n0<Boolean> all(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new bu.o(this, qVar));
    }

    public final n0<Boolean> any(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new bu.v(this, qVar));
    }

    public final <R> R as(c0 c0Var) {
        ut.o0.requireNonNull(c0Var, "converter is null").getClass();
        throw new ClassCastException();
    }

    public final b0 b(long j10, TimeUnit timeUnit, m0 m0Var, g0 g0Var) {
        ut.o0.requireNonNull(timeUnit, "timeUnit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new yb(this, j10, timeUnit, m0Var, g0Var));
    }

    public final Object blockingFirst() throws InterruptedException {
        wt.f fVar = new wt.f();
        subscribe(fVar);
        Object objBlockingGet = fVar.blockingGet();
        if (objBlockingGet != null) {
            return objBlockingGet;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(st.g gVar) {
        Iterator<Object> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                ((pt.c) it).dispose();
                throw iu.m.wrapOrThrow(th2);
            }
        }
    }

    public final Iterable<Object> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final Object blockingLast() throws InterruptedException {
        wt.g gVar = new wt.g();
        subscribe(gVar);
        Object objBlockingGet = gVar.blockingGet();
        if (objBlockingGet != null) {
            return objBlockingGet;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<Object> blockingLatest() {
        return new bu.e(this);
    }

    public final Iterable<Object> blockingMostRecent(Object obj) {
        return new bu.h(this, obj);
    }

    public final Iterable<Object> blockingNext() {
        return new bu.k(this);
    }

    public final Object blockingSingle() {
        Object objBlockingGet = singleElement().blockingGet();
        if (objBlockingGet != null) {
            return objBlockingGet;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        bu.x.subscribe(this);
    }

    public final b0 buffer(int i10) {
        return buffer(i10, i10);
    }

    public final b0 c(g0 g0Var, st.o oVar, g0 g0Var2) {
        ut.o0.requireNonNull(oVar, "itemTimeoutIndicator is null");
        return mu.a.onAssembly(new sb(this, g0Var, oVar, g0Var2));
    }

    public final b0 cache() {
        return cacheWithInitialCapacity(16);
    }

    public final b0 cacheWithInitialCapacity(int i10) {
        ut.o0.verifyPositive(i10, "initialCapacity");
        return mu.a.onAssembly(new bu.t0(this, i10));
    }

    public final <U> b0 cast(Class<U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return map(ut.m0.castFunction(cls));
    }

    public final <U> n0<U> collect(Callable<? extends U> callable, st.b bVar) {
        ut.o0.requireNonNull(callable, "initialValueSupplier is null");
        ut.o0.requireNonNull(bVar, "collector is null");
        return mu.a.onAssembly(new x0(this, callable, bVar));
    }

    public final <U> n0<U> collectInto(U u10, st.b bVar) {
        ut.o0.requireNonNull(u10, "initialValue is null");
        return collect(ut.m0.justCallable(u10), bVar);
    }

    public final <R> b0 compose(h0 h0Var) {
        ut.o0.requireNonNull(h0Var, "composer is null").getClass();
        throw new ClassCastException();
    }

    public final <R> b0 concatMap(st.o oVar) {
        return concatMap(oVar, 2);
    }

    public final c concatMapCompletable(st.o oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final c concatMapCompletableDelayError(st.o oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> b0 concatMapDelayError(st.o oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> b0 concatMapEager(st.o oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> b0 concatMapEagerDelayError(st.o oVar, boolean z10) {
        return concatMapEagerDelayError(oVar, Integer.MAX_VALUE, bufferSize(), z10);
    }

    public final <U> b0 concatMapIterable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new z3(this, oVar));
    }

    public final <R> b0 concatMapMaybe(st.o oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> b0 concatMapMaybeDelayError(st.o oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> b0 concatMapSingle(st.o oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> b0 concatMapSingleDelayError(st.o oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final b0 concatWith(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return concat(this, g0Var);
    }

    public final n0<Boolean> contains(Object obj) {
        ut.o0.requireNonNull(obj, "element is null");
        return any(ut.m0.equalsWith(obj));
    }

    public final n0<Long> count() {
        return mu.a.onAssembly(new r1(this));
    }

    public final <U> b0 debounce(st.o oVar) {
        ut.o0.requireNonNull(oVar, "debounceSelector is null");
        return mu.a.onAssembly(new x1(this, oVar));
    }

    public final b0 defaultIfEmpty(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem is null");
        return switchIfEmpty(just(obj));
    }

    public final <U> b0 delay(st.o oVar) {
        ut.o0.requireNonNull(oVar, "itemDelay is null");
        return flatMap(o5.itemDelay(oVar));
    }

    public final <U> b0 delaySubscription(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return mu.a.onAssembly(new j2(this, g0Var));
    }

    @Deprecated
    public final <T2> b0 dematerialize() {
        return mu.a.onAssembly(new l2(this, ut.m0.identity()));
    }

    public final b0 distinct() {
        return distinct(ut.m0.identity(), ut.m0.createHashSet());
    }

    public final b0 distinctUntilChanged() {
        return distinctUntilChanged(ut.m0.identity());
    }

    public final b0 doAfterNext(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onAfterNext is null");
        return mu.a.onAssembly(new t2(this, gVar));
    }

    public final b0 doAfterTerminate(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onFinally is null");
        return a(ut.m0.emptyConsumer(), ut.m0.emptyConsumer(), ut.m0.f88680c, aVar);
    }

    public final b0 doFinally(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onFinally is null");
        return mu.a.onAssembly(new v2(this, aVar));
    }

    public final b0 doOnComplete(st.a aVar) {
        return a(ut.m0.emptyConsumer(), ut.m0.emptyConsumer(), aVar, ut.m0.f88680c);
    }

    public final b0 doOnDispose(st.a aVar) {
        return doOnLifecycle(ut.m0.emptyConsumer(), aVar);
    }

    public final b0 doOnEach(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onNotification is null");
        return a(ut.m0.notificationOnNext(gVar), ut.m0.notificationOnError(gVar), ut.m0.notificationOnComplete(gVar), ut.m0.f88680c);
    }

    public final b0 doOnError(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVar, oVar, oVar);
    }

    public final b0 doOnLifecycle(st.g gVar, st.a aVar) {
        ut.o0.requireNonNull(gVar, "onSubscribe is null");
        ut.o0.requireNonNull(aVar, "onDispose is null");
        return mu.a.onAssembly(new y2(this, gVar, aVar));
    }

    public final b0 doOnNext(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVar, gVarEmptyConsumer, oVar, oVar);
    }

    public final b0 doOnSubscribe(st.g gVar) {
        return doOnLifecycle(gVar, ut.m0.f88680c);
    }

    public final b0 doOnTerminate(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onTerminate is null");
        return a(ut.m0.emptyConsumer(), ut.m0.actionConsumer(aVar), aVar, ut.m0.f88680c);
    }

    public final s elementAt(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new c3(this, j10));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "index >= 0 required but it was "));
    }

    public final n0<Object> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new e3(this, j10, null));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "index >= 0 required but it was "));
    }

    public final b0 filter(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new i3(this, qVar));
    }

    public final n0<Object> first(Object obj) {
        return elementAt(0L, obj);
    }

    public final s firstElement() {
        return elementAt(0L);
    }

    public final n0<Object> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> b0 flatMap(st.o oVar) {
        return flatMap(oVar, false);
    }

    public final c flatMapCompletable(st.o oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> b0 flatMapIterable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new z3(this, oVar));
    }

    public final <R> b0 flatMapMaybe(st.o oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> b0 flatMapSingle(st.o oVar) {
        return flatMapSingle(oVar, false);
    }

    public final pt.c forEach(st.g gVar) {
        return subscribe(gVar);
    }

    public final pt.c forEachWhile(st.q qVar) {
        return forEachWhile(qVar, ut.m0.f88682e, ut.m0.f88680c);
    }

    public final <K> b0 groupBy(st.o oVar) {
        return groupBy(oVar, ut.m0.identity(), false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> b0 groupJoin(g0 g0Var, st.o oVar, st.o oVar2, st.c cVar) {
        ut.o0.requireNonNull(g0Var, "other is null");
        ut.o0.requireNonNull(oVar, "leftEnd is null");
        ut.o0.requireNonNull(oVar2, "rightEnd is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return mu.a.onAssembly(new s4(this, g0Var, oVar, oVar2, cVar));
    }

    public final b0 hide() {
        return mu.a.onAssembly(new u4(this));
    }

    public final c ignoreElements() {
        return mu.a.onAssembly(new y4(this));
    }

    public final n0<Boolean> isEmpty() {
        return all(ut.m0.alwaysFalse());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> b0 join(g0 g0Var, st.o oVar, st.o oVar2, st.c cVar) {
        ut.o0.requireNonNull(g0Var, "other is null");
        ut.o0.requireNonNull(oVar, "leftEnd is null");
        ut.o0.requireNonNull(oVar2, "rightEnd is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return mu.a.onAssembly(new u5(this, g0Var, oVar, oVar2, cVar));
    }

    public final n0<Object> last(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem is null");
        return mu.a.onAssembly(new z5(this, obj));
    }

    public final s lastElement() {
        return mu.a.onAssembly(new x5(this));
    }

    public final n0<Object> lastOrError() {
        return mu.a.onAssembly(new z5(this, null));
    }

    public final <R> b0 lift(f0 f0Var) {
        ut.o0.requireNonNull(f0Var, "lifter is null");
        return mu.a.onAssembly(new a6(this, f0Var));
    }

    public final <R> b0 map(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new c6(this, oVar));
    }

    public final b0 materialize() {
        return mu.a.onAssembly(new g6(this));
    }

    public final b0 mergeWith(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return merge(this, g0Var);
    }

    public final b0 observeOn(m0 m0Var) {
        return observeOn(m0Var, false, bufferSize());
    }

    public final <U> b0 ofType(Class<U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return filter(ut.m0.isInstanceOf(cls)).cast(cls);
    }

    public final b0 onErrorResumeNext(st.o oVar) {
        ut.o0.requireNonNull(oVar, "resumeFunction is null");
        return mu.a.onAssembly(new u6(this, oVar, false));
    }

    public final b0 onErrorReturn(st.o oVar) {
        ut.o0.requireNonNull(oVar, "valueSupplier is null");
        return mu.a.onAssembly(new w6(this, oVar));
    }

    public final b0 onErrorReturnItem(Object obj) {
        ut.o0.requireNonNull(obj, "item is null");
        return onErrorReturn(ut.m0.justFunction(obj));
    }

    public final b0 onExceptionResumeNext(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "next is null");
        return mu.a.onAssembly(new u6(this, ut.m0.justFunction(g0Var), true));
    }

    public final b0 onTerminateDetach() {
        return mu.a.onAssembly(new n2(this));
    }

    public final ju.a publish() {
        return a7.create(this);
    }

    public final s reduce(st.c cVar) {
        ut.o0.requireNonNull(cVar, "reducer is null");
        return mu.a.onAssembly(new n7(this, cVar));
    }

    public final <R> n0<R> reduceWith(Callable<R> callable, st.c cVar) {
        ut.o0.requireNonNull(callable, "seedSupplier is null");
        ut.o0.requireNonNull(cVar, "reducer is null");
        return mu.a.onAssembly(new q7(this, callable, cVar));
    }

    public final b0 repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final b0 repeatUntil(st.e eVar) {
        ut.o0.requireNonNull(eVar, "stop is null");
        return mu.a.onAssembly(new x7(this, eVar));
    }

    public final ju.a replay() {
        return r8.createFrom(this);
    }

    public final b0 retry() {
        return retry(Long.MAX_VALUE, ut.m0.alwaysTrue());
    }

    public final b0 retryUntil(st.e eVar) {
        ut.o0.requireNonNull(eVar, "stop is null");
        return retry(Long.MAX_VALUE, ut.m0.predicateReverseFor(eVar));
    }

    public final b0 retryWhen(st.o oVar) {
        ut.o0.requireNonNull(oVar, "handler is null");
        return mu.a.onAssembly(new y8(this, oVar));
    }

    public final void safeSubscribe(i0 i0Var) {
        ut.o0.requireNonNull(i0Var, "observer is null");
        if (i0Var instanceof ku.l) {
            subscribe(i0Var);
        } else {
            subscribe(new ku.l(i0Var));
        }
    }

    public final b0 sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, ou.j.computation());
    }

    public final b0 scan(st.c cVar) {
        ut.o0.requireNonNull(cVar, "accumulator is null");
        return mu.a.onAssembly(new m9(this, cVar));
    }

    public final <R> b0 scanWith(Callable<R> callable, st.c cVar) {
        ut.o0.requireNonNull(callable, "seedSupplier is null");
        ut.o0.requireNonNull(cVar, "accumulator is null");
        return mu.a.onAssembly(new o9(this, callable, cVar));
    }

    public final b0 serialize() {
        return mu.a.onAssembly(new v9(this));
    }

    public final b0 share() {
        return publish().refCount();
    }

    public final n0<Object> single(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem is null");
        return mu.a.onAssembly(new z9(this, obj));
    }

    public final s singleElement() {
        return mu.a.onAssembly(new x9(this));
    }

    public final n0<Object> singleOrError() {
        return mu.a.onAssembly(new z9(this, null));
    }

    public final b0 skip(long j10) {
        return j10 <= 0 ? mu.a.onAssembly(this) : mu.a.onAssembly(new ba(this, j10));
    }

    public final b0 skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? mu.a.onAssembly(this) : mu.a.onAssembly(new da(this, i10));
        }
        throw new IndexOutOfBoundsException(a.b.e(i10, "count >= 0 required but it was "));
    }

    public final <U> b0 skipUntil(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return mu.a.onAssembly(new ia(this, g0Var));
    }

    public final b0 skipWhile(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new ka(this, qVar));
    }

    public final b0 sorted() {
        return toList().toObservable().map(ut.m0.listSorter(ut.m0.naturalComparator())).flatMapIterable(ut.m0.identity());
    }

    public final b0 startWith(Iterable<Object> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final b0 startWithArray(Object... objArr) {
        b0 b0VarFromArray = fromArray(objArr);
        return b0VarFromArray == empty() ? mu.a.onAssembly(this) : concatArray(b0VarFromArray, this);
    }

    public final pt.c subscribe() {
        return subscribe(ut.m0.emptyConsumer(), ut.m0.f88682e, ut.m0.f88680c, ut.m0.emptyConsumer());
    }

    public abstract void subscribeActual(i0 i0Var);

    public final b0 subscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new na(this, m0Var));
    }

    public final <E extends i0> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final b0 switchIfEmpty(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return mu.a.onAssembly(new pa(this, g0Var));
    }

    public final <R> b0 switchMap(st.o oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final c switchMapCompletable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.m0(this, oVar, false));
    }

    public final c switchMapCompletableDelayError(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.m0(this, oVar, true));
    }

    public final <R> b0 switchMapDelayError(st.o oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final <R> b0 switchMapMaybe(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.p0(this, oVar, false));
    }

    public final <R> b0 switchMapMaybeDelayError(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.p0(this, oVar, true));
    }

    public final <R> b0 switchMapSingle(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.s0(this, oVar, false));
    }

    public final <R> b0 switchMapSingleDelayError(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.s0(this, oVar, true));
    }

    public final b0 take(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new ua(this, j10));
        }
        throw new IllegalArgumentException(o2.m(j10, "count >= 0 required but it was "));
    }

    public final b0 takeLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? mu.a.onAssembly(new w4(this)) : i10 == 1 ? mu.a.onAssembly(new ya(this)) : mu.a.onAssembly(new wa(this, i10));
        }
        throw new IndexOutOfBoundsException(a.b.e(i10, "count >= 0 required but it was "));
    }

    public final <U> b0 takeUntil(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return mu.a.onAssembly(new db(this, g0Var));
    }

    public final b0 takeWhile(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new hb(this, qVar));
    }

    public final ku.o test() {
        ku.o oVar = new ku.o();
        subscribe(oVar);
        return oVar;
    }

    public final b0 throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, ou.j.computation());
    }

    public final b0 throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    public final b0 throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, ou.j.computation(), false);
    }

    public final b0 throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    public final b0 timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, ou.j.computation());
    }

    public final <V> b0 timeout(st.o oVar) {
        return c(null, oVar, null);
    }

    public final b0 timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, ou.j.computation());
    }

    public final <R> R to(st.o oVar) {
        try {
            return (R) ((st.o) ut.o0.requireNonNull(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    public final l toFlowable(b bVar) {
        b5 b5Var = new b5(this);
        int iOrdinal = bVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 3 ? iOrdinal != 4 ? b5Var.onBackpressureBuffer() : b5Var.onBackpressureLatest() : b5Var.onBackpressureDrop() : mu.a.onAssembly(new c8(b5Var)) : b5Var;
    }

    public final Future<Object> toFuture() {
        return (Future) subscribeWith(new wt.p());
    }

    public final n0<List<Object>> toList() {
        return toList(16);
    }

    public final <K> n0<Map<K, Object>> toMap(st.o oVar) {
        ut.o0.requireNonNull(oVar, YsiBvdpw.CgSdMxTHergej);
        return collect(iu.o.asCallable(), ut.m0.toMapKeySelector(oVar));
    }

    public final <K> n0<Map<K, Collection<Object>>> toMultimap(st.o oVar) {
        return toMultimap(oVar, ut.m0.identity(), iu.o.asCallable(), iu.c.asFunction());
    }

    public final n0<List<Object>> toSortedList() {
        return toSortedList(ut.m0.naturalOrder());
    }

    public final b0 unsubscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new hc(this, m0Var));
    }

    public final b0 window(long j10) {
        return window(j10, j10, bufferSize());
    }

    public final <U, R> b0 withLatestFrom(g0 g0Var, st.c cVar) {
        ut.o0.requireNonNull(g0Var, "other is null");
        ut.o0.requireNonNull(cVar, "combiner is null");
        return mu.a.onAssembly(new hd(this, cVar, g0Var));
    }

    public final <U, R> b0 zipWith(Iterable<U> iterable, st.c cVar) {
        ut.o0.requireNonNull(iterable, "other is null");
        ut.o0.requireNonNull(cVar, "zipper is null");
        return mu.a.onAssembly(new qd(this, iterable, cVar));
    }

    public static <T, R> b0 combineLatest(Iterable<? extends g0> iterable, st.o oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> b0 combineLatestDelayError(st.o oVar, int i10, g0... g0VarArr) {
        return combineLatestDelayError(g0VarArr, oVar, i10);
    }

    public static <T> b0 concatArrayEager(int i10, int i11, g0... g0VarArr) {
        return fromArray(g0VarArr).concatMapEagerDelayError(ut.m0.identity(), i10, i11, false);
    }

    public static <T> b0 concatArrayEagerDelayError(int i10, int i11, g0... g0VarArr) {
        return fromArray(g0VarArr).concatMapEagerDelayError(ut.m0.identity(), i10, i11, true);
    }

    public static <T> b0 concatEager(g0 g0Var, int i10, int i11) {
        return wrap(g0Var).concatMapEager(ut.m0.identity(), i10, i11);
    }

    public static b0 interval(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new q5(Math.max(0L, j10), Math.max(0L, j11), timeUnit, m0Var));
    }

    public static b0 intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, m0 m0Var) {
        if (j11 < 0) {
            throw new IllegalArgumentException(o2.m(j11, "count >= 0 required but it was "));
        }
        if (j11 == 0) {
            return empty().delay(j12, timeUnit, m0Var);
        }
        long j14 = (j11 - 1) + j10;
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new s5(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, m0Var));
    }

    public static <T> b0 merge(Iterable<? extends g0> iterable) {
        return fromIterable(iterable).flatMap(ut.m0.identity());
    }

    public static <T> b0 mergeArray(g0... g0VarArr) {
        return fromArray(g0VarArr).flatMap(ut.m0.identity(), g0VarArr.length);
    }

    public static <T> b0 mergeArrayDelayError(g0... g0VarArr) {
        return fromArray(g0VarArr).flatMap(ut.m0.identity(), true, g0VarArr.length);
    }

    public static <T> b0 mergeDelayError(Iterable<? extends g0> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), true, i10, i11);
    }

    public static <T> n0<Boolean> sequenceEqual(g0 g0Var, g0 g0Var2, st.d dVar) {
        return sequenceEqual(g0Var, g0Var2, dVar, bufferSize());
    }

    public static <T> b0 switchOnNextDelayError(g0 g0Var, int i10) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new sa(g0Var, ut.m0.identity(), i10, true));
    }

    public static b0 timer(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new ac(Math.max(j10, 0L), timeUnit, m0Var));
    }

    public static <T, D> b0 using(Callable<? extends D> callable, st.o oVar, st.g gVar, boolean z10) {
        ut.o0.requireNonNull(callable, "resourceSupplier is null");
        ut.o0.requireNonNull(oVar, "sourceSupplier is null");
        ut.o0.requireNonNull(gVar, "disposer is null");
        return mu.a.onAssembly(new jc(callable, oVar, gVar, z10));
    }

    public final b0 ambWith(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, RnJusJ.YDSjAgL);
        return ambArray(this, g0Var);
    }

    public final Iterable<Object> blockingIterable(int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        return new bu.c(this, i10);
    }

    public final void blockingSubscribe(st.g gVar) {
        bu.x.subscribe(this, gVar, ut.m0.f88682e, ut.m0.f88680c);
    }

    public final b0 buffer(int i10, int i11) {
        return buffer(i10, i11, iu.c.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> b0 concatMap(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new f1(this, oVar, i10, iu.k.f68411b));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : k9.scalarXMap(objCall, oVar);
    }

    public final c concatMapCompletable(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "capacityHint");
        return mu.a.onAssembly(new au.d0(this, oVar, iu.k.f68411b, i10));
    }

    public final c concatMapCompletableDelayError(st.o oVar, boolean z10) {
        return concatMapCompletableDelayError(oVar, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> b0 concatMapDelayError(st.o oVar, int i10, boolean z10) {
        ut.o0.requireNonNull(oVar, QGjYBESwAiCc.LhI);
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new f1(this, oVar, i10, z10 ? iu.k.f68413e : iu.k.f68412c));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : k9.scalarXMap(objCall, oVar);
    }

    public final <R> b0 concatMapEager(st.o oVar, int i10, int i11) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new h1(this, oVar, iu.k.f68411b, i10, i11));
    }

    public final <R> b0 concatMapEagerDelayError(st.o oVar, int i10, int i11, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new h1(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10, i11));
    }

    public final <R> b0 concatMapMaybe(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.g0(this, oVar, iu.k.f68411b, i10));
    }

    public final <R> b0 concatMapMaybeDelayError(st.o oVar, boolean z10) {
        return concatMapMaybeDelayError(oVar, z10, 2);
    }

    public final <R> b0 concatMapSingle(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.j0(this, oVar, iu.k.f68411b, i10));
    }

    public final <R> b0 concatMapSingleDelayError(st.o oVar, boolean z10) {
        return concatMapSingleDelayError(oVar, z10, 2);
    }

    public final <R> b0 dematerialize(st.o oVar) {
        ut.o0.requireNonNull(oVar, "selector is null");
        return mu.a.onAssembly(new l2(this, oVar));
    }

    public final <K> b0 distinct(st.o oVar) {
        return distinct(oVar, ut.m0.createHashSet());
    }

    public final <K> b0 distinctUntilChanged(st.o oVar) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        return mu.a.onAssembly(new r2(this, oVar, ut.o0.equalsPredicate()));
    }

    public final <R> b0 flatMap(st.o oVar, boolean z10) {
        return flatMap(oVar, z10, Integer.MAX_VALUE);
    }

    public final c flatMapCompletable(st.o oVar, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new r3(this, oVar, z10));
    }

    public final <R> b0 flatMapMaybe(st.o oVar, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new u3(this, oVar, z10));
    }

    public final <R> b0 flatMapSingle(st.o oVar, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new x3(this, oVar, z10));
    }

    public final pt.c forEachWhile(st.q qVar, st.g gVar) {
        return forEachWhile(qVar, gVar, ut.m0.f88680c);
    }

    public final <K> b0 groupBy(st.o oVar, boolean z10) {
        return groupBy(oVar, ut.m0.identity(), z10, bufferSize());
    }

    public final b0 observeOn(m0 m0Var, boolean z10) {
        return observeOn(m0Var, z10, bufferSize());
    }

    public final <R> b0 publish(st.o oVar) {
        ut.o0.requireNonNull(oVar, "selector is null");
        return mu.a.onAssembly(new h7(this, oVar));
    }

    public final b0 repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : mu.a.onAssembly(new v7(this, j10));
        }
        throw new IllegalArgumentException(o2.m(j10, "times >= 0 required but it was "));
    }

    public final b0 repeatWhen(st.o oVar) {
        ut.o0.requireNonNull(oVar, TJzY.cbFnujEdFeZGVX);
        return mu.a.onAssembly(new a8(this, oVar));
    }

    public final <R> b0 replay(st.o oVar) {
        ut.o0.requireNonNull(oVar, "selector is null");
        return r8.multicastSelector(o5.replayCallable(this), oVar);
    }

    public final b0 retry(st.d dVar) {
        ut.o0.requireNonNull(dVar, "predicate is null");
        return mu.a.onAssembly(new t8(this, dVar));
    }

    public final b0 sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, ou.j.computation(), z10);
    }

    public final b0 sorted(Comparator<Object> comparator) {
        ut.o0.requireNonNull(comparator, "sortFunction is null");
        return toList().toObservable().map(ut.m0.listSorter(comparator)).flatMapIterable(ut.m0.identity());
    }

    public final b0 startWith(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return concatArray(g0Var, this);
    }

    public final pt.c subscribe(st.g gVar) {
        return subscribe(gVar, ut.m0.f88682e, ut.m0.f88680c, ut.m0.emptyConsumer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> b0 switchMap(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new sa(this, oVar, i10, false));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : k9.scalarXMap(objCall, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> b0 switchMapDelayError(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new sa(this, oVar, i10, true));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : k9.scalarXMap(objCall, oVar);
    }

    public final b0 throttleFirst(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new jb(this, j10, timeUnit, m0Var));
    }

    public final b0 throttleLast(long j10, TimeUnit timeUnit, m0 m0Var) {
        return sample(j10, timeUnit, m0Var);
    }

    public final b0 throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, ou.j.computation(), z10);
    }

    public final b0 throttleWithTimeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return debounce(j10, timeUnit, m0Var);
    }

    public final b0 timeInterval(m0 m0Var) {
        return timeInterval(TimeUnit.MILLISECONDS, m0Var);
    }

    public final <V> b0 timeout(st.o oVar, g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return c(null, oVar, g0Var);
    }

    public final b0 timestamp(m0 m0Var) {
        return timestamp(TimeUnit.MILLISECONDS, m0Var);
    }

    public final n0<List<Object>> toList(int i10) {
        ut.o0.verifyPositive(i10, "capacityHint");
        return mu.a.onAssembly(new ec(this, i10));
    }

    public final n0<List<Object>> toSortedList(Comparator<Object> comparator) {
        ut.o0.requireNonNull(comparator, "comparator is null");
        return toList().map(ut.m0.listSorter(comparator));
    }

    public final b0 window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    public static <T, R> b0 combineLatest(Iterable<? extends g0> iterable, st.o oVar, int i10) {
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new a1(null, iterable, oVar, i10 << 1, false));
    }

    public static <T, R> b0 combineLatestDelayError(g0[] g0VarArr, st.o oVar, int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(oVar, "combiner is null");
        if (g0VarArr.length == 0) {
            return empty();
        }
        return mu.a.onAssembly(new a1(g0VarArr, null, oVar, i10 << 1, true));
    }

    public static <T> b0 concat(g0 g0Var) {
        return concat(g0Var, bufferSize());
    }

    public static <T> b0 concatDelayError(g0 g0Var) {
        return concatDelayError(g0Var, bufferSize(), true);
    }

    public static <T> b0 concatEager(Iterable<? extends g0> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> b0 error(Throwable th2) {
        ut.o0.requireNonNull(th2, "exception is null");
        return error((Callable<? extends Throwable>) ut.m0.justCallable(th2));
    }

    public static <T> b0 fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        ut.o0.requireNonNull(future, "future is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        return mu.a.onAssembly(new d4(future, j10, timeUnit));
    }

    public static <T> b0 just(T t10, T t11) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        return fromArray(t10, t11);
    }

    public static <T> b0 merge(Iterable<? extends g0> iterable, int i10) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), i10);
    }

    public static <T> b0 mergeDelayError(Iterable<? extends g0> iterable, int i10) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), true, i10);
    }

    public static <T> n0<Boolean> sequenceEqual(g0 g0Var, g0 g0Var2, st.d dVar, int i10) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(dVar, "isEqual is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new u9(g0Var, g0Var2, dVar, i10));
    }

    public final Object blockingSingle(Object obj) {
        return single(obj).blockingGet();
    }

    public final void blockingSubscribe(st.g gVar, st.g gVar2) {
        bu.x.subscribe(this, gVar, gVar2, ut.m0.f88680c);
    }

    public final <U extends Collection<Object>> b0 buffer(int i10, int i11, Callable<U> callable) {
        ut.o0.verifyPositive(i10, "count");
        ut.o0.verifyPositive(i11, "skip");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new bu.a0(this, i10, i11, callable));
    }

    public final c concatMapCompletableDelayError(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.d0(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10));
    }

    public final <U> b0 concatMapIterable(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return concatMap(o5.flatMapIntoIterable(oVar), i10);
    }

    public final <R> b0 concatMapMaybeDelayError(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.g0(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10));
    }

    public final <R> b0 concatMapSingleDelayError(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.j0(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10));
    }

    public final b0 concatWith(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return mu.a.onAssembly(new n1(this, t0Var));
    }

    public final b0 debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, ou.j.computation());
    }

    public final b0 delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, ou.j.computation(), false);
    }

    public final b0 delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, ou.j.computation());
    }

    public final <K> b0 distinct(st.o oVar, Callable<? extends Collection<? super K>> callable) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(callable, "collectionSupplier is null");
        return mu.a.onAssembly(new p2(this, oVar, callable));
    }

    public final <R> b0 flatMap(st.o oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, bufferSize());
    }

    public final <U, V> b0 flatMapIterable(st.o oVar, st.c cVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return flatMap(o5.flatMapIntoIterable(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final pt.c forEachWhile(st.q qVar, st.g gVar, st.a aVar) {
        ut.o0.requireNonNull(qVar, "onNext is null");
        ut.o0.requireNonNull(gVar, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        wt.o oVar = new wt.o(qVar, gVar, aVar);
        subscribe(oVar);
        return oVar;
    }

    public final <K, V> b0 groupBy(st.o oVar, st.o oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final b0 mergeWith(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return mu.a.onAssembly(new p6(this, t0Var));
    }

    public final b0 observeOn(m0 m0Var, boolean z10, int i10) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new s6(this, m0Var, z10, i10));
    }

    public final b0 onErrorResumeNext(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "next is null");
        return onErrorResumeNext(ut.m0.justFunction(g0Var));
    }

    public final <R> n0<R> reduce(R r10, st.c cVar) {
        ut.o0.requireNonNull(r10, "seed is null");
        ut.o0.requireNonNull(cVar, "reducer is null");
        return mu.a.onAssembly(new p7(this, r10, cVar));
    }

    public final b0 sample(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new c9(this, j10, timeUnit, m0Var, false));
    }

    public final <R> b0 scan(R r10, st.c cVar) {
        ut.o0.requireNonNull(r10, "initialValue is null");
        return scanWith(ut.m0.justCallable(r10), cVar);
    }

    public final b0 skip(long j10, TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2) {
        return subscribe(gVar, gVar2, ut.m0.f88680c, ut.m0.emptyConsumer());
    }

    public final b0 takeUntil(st.q qVar) {
        ut.o0.requireNonNull(qVar, "stopPredicate is null");
        return mu.a.onAssembly(new fb(this, qVar));
    }

    public final ku.o test(boolean z10) {
        ku.o oVar = new ku.o();
        if (z10) {
            oVar.dispose();
        }
        subscribe(oVar);
        return oVar;
    }

    public final b0 throttleLatest(long j10, TimeUnit timeUnit, m0 m0Var) {
        return throttleLatest(j10, timeUnit, m0Var, false);
    }

    public final b0 timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, ou.j.computation());
    }

    public final b0 timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, ou.j.computation());
    }

    public final <K, V> n0<Map<K, V>> toMap(st.o oVar, st.o oVar2) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        return collect(iu.o.asCallable(), ut.m0.toMapKeyValueSelector(oVar, oVar2));
    }

    public final b0 window(long j10, long j11, int i10) {
        ut.o0.verifyPositive(j10, "count");
        ut.o0.verifyPositive(j11, "skip");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new mc(this, j10, j11, i10));
    }

    public static <T> b0 concat(g0 g0Var, int i10) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new f1(g0Var, ut.m0.identity(), i10, iu.k.f68411b));
    }

    public static <T> b0 concatDelayError(g0 g0Var, int i10, boolean z10) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        ut.o0.verifyPositive(i10, "prefetch is null");
        return mu.a.onAssembly(new f1(g0Var, ut.m0.identity(), i10, z10 ? iu.k.f68413e : iu.k.f68412c));
    }

    public static <T> b0 concatEager(Iterable<? extends g0> iterable, int i10, int i11) {
        return fromIterable(iterable).concatMapEagerDelayError(ut.m0.identity(), i10, i11, false);
    }

    public static <T> b0 merge(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        return mu.a.onAssembly(new l3(g0Var, ut.m0.identity(), false, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> b0 mergeDelayError(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        return mu.a.onAssembly(new l3(g0Var, ut.m0.identity(), true, Integer.MAX_VALUE, bufferSize()));
    }

    public static <T> b0 switchOnNext(g0 g0Var) {
        return switchOnNext(g0Var, bufferSize());
    }

    public static <T, R> b0 zip(g0 g0Var, st.o oVar) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(g0Var, "sources is null");
        return mu.a.onAssembly(new cc(g0Var, 16).flatMap(o5.zipIterable(oVar)));
    }

    public final void blockingSubscribe(st.g gVar, st.g gVar2, st.a aVar) {
        bu.x.subscribe(this, gVar, gVar2, aVar);
    }

    public final b0 debounce(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new a2(this, j10, timeUnit, m0Var));
    }

    public final b0 delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, ou.j.computation(), z10);
    }

    public final b0 delaySubscription(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delaySubscription(timer(j10, timeUnit, m0Var));
    }

    public final b0 distinctUntilChanged(st.d dVar) {
        ut.o0.requireNonNull(dVar, "comparer is null");
        return mu.a.onAssembly(new r2(this, ut.m0.identity(), dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> b0 flatMap(st.o oVar, boolean z10, int i10, int i11) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, "bufferSize");
        if (this instanceof vt.m) {
            Object objCall = ((vt.m) this).call();
            if (objCall == null) {
                return empty();
            }
            return k9.scalarXMap(objCall, oVar);
        }
        return mu.a.onAssembly(new l3(this, oVar, z10, i10, i11));
    }

    public final <K, V> b0 groupBy(st.o oVar, st.o oVar2, boolean z10) {
        return groupBy(oVar, oVar2, z10, bufferSize());
    }

    public final <R> b0 replay(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return r8.multicastSelector(o5.replayCallable(this, i10), oVar);
    }

    public final b0 retry(long j10) {
        return retry(j10, ut.m0.alwaysTrue());
    }

    public final b0 skip(long j10, TimeUnit timeUnit, m0 m0Var) {
        return skipUntil(timer(j10, timeUnit, m0Var));
    }

    public final b0 startWith(Object obj) {
        ut.o0.requireNonNull(obj, "item is null");
        return concatArray(just(obj), this);
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2, st.a aVar) {
        return subscribe(gVar, gVar2, aVar, ut.m0.emptyConsumer());
    }

    public final b0 throttleLatest(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new lb(this, j10, timeUnit, m0Var, z10));
    }

    public final b0 timeInterval(TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new nb(this, timeUnit, m0Var));
    }

    public final b0 timeout(long j10, TimeUnit timeUnit) {
        return b(j10, timeUnit, ou.j.computation(), null);
    }

    public final b0 timestamp(TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return map(ut.m0.timestampWith(timeUnit, m0Var));
    }

    public final <U extends Collection<Object>> n0<U> toList(Callable<U> callable) {
        ut.o0.requireNonNull(callable, "collectionSupplier is null");
        return mu.a.onAssembly(new ec(this, callable));
    }

    public final n0<List<Object>> toSortedList(Comparator<Object> comparator, int i10) {
        ut.o0.requireNonNull(comparator, "comparator is null");
        return toList(i10).map(ut.m0.listSorter(comparator));
    }

    public final <T1, T2, R> b0 withLatestFrom(g0 g0Var, g0 g0Var2, st.h hVar) {
        ut.o0.requireNonNull(g0Var, "o1 is null");
        ut.o0.requireNonNull(g0Var2, "o2 is null");
        ut.o0.requireNonNull(hVar, "combiner is null");
        return withLatestFrom(new g0[]{g0Var, g0Var2}, ut.m0.toFunction(hVar));
    }

    public final <U, R> b0 zipWith(g0 g0Var, st.c cVar) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return zip(this, g0Var, cVar);
    }

    public static <T, S> b0 generate(Callable<S> callable, st.b bVar) {
        ut.o0.requireNonNull(bVar, "generator is null");
        return generate(callable, o5.simpleBiGenerator(bVar), ut.m0.emptyConsumer());
    }

    public static b0 interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, ou.j.computation());
    }

    public final Object blockingFirst(Object obj) throws InterruptedException {
        wt.f fVar = new wt.f();
        subscribe(fVar);
        Object objBlockingGet = fVar.blockingGet();
        return objBlockingGet != null ? objBlockingGet : obj;
    }

    public final Object blockingLast(Object obj) throws InterruptedException {
        wt.g gVar = new wt.g();
        subscribe(gVar);
        Object objBlockingGet = gVar.blockingGet();
        return objBlockingGet != null ? objBlockingGet : obj;
    }

    public final void blockingSubscribe(i0 i0Var) {
        bu.x.subscribe(this, i0Var);
    }

    public final b0 concatWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return mu.a.onAssembly(new l1(this, yVar));
    }

    public final b0 delay(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delay(j10, timeUnit, m0Var, false);
    }

    public final <K, V> b0 groupBy(st.o oVar, st.o oVar2, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new l4(this, oVar, oVar2, i10, z10));
    }

    public final b0 mergeWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return mu.a.onAssembly(new m6(this, yVar));
    }

    public final b0 retry(long j10, st.q qVar) {
        if (j10 >= 0) {
            ut.o0.requireNonNull(qVar, "predicate is null");
            return mu.a.onAssembly(new v8(this, j10, qVar));
        }
        throw new IllegalArgumentException(o2.m(j10, "times >= 0 required but it was "));
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2, st.a aVar, st.g gVar3) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o0.requireNonNull(gVar3, "onSubscribe is null");
        wt.t tVar = new wt.t(gVar, gVar2, aVar, gVar3);
        subscribe(tVar);
        return tVar;
    }

    public final b0 timeout(long j10, TimeUnit timeUnit, g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return b(j10, timeUnit, ou.j.computation(), g0Var);
    }

    public final <K, V> n0<Map<K, Collection<V>>> toMultimap(st.o oVar, st.o oVar2) {
        return toMultimap(oVar, oVar2, iu.o.asCallable(), iu.c.asFunction());
    }

    public static <T> b0 fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(m0Var);
    }

    public static b0 interval(long j10, TimeUnit timeUnit, m0 m0Var) {
        return interval(j10, j10, timeUnit, m0Var);
    }

    public static <T> b0 just(T t10, T t11, T t12) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        return fromArray(t10, t11, t12);
    }

    public static <T> b0 merge(g0 g0Var, int i10) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new l3(g0Var, ut.m0.identity(), false, i10, bufferSize()));
    }

    public static <T> b0 mergeDelayError(g0 g0Var, int i10) {
        ut.o0.requireNonNull(g0Var, "sources is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new l3(g0Var, ut.m0.identity(), true, i10, bufferSize()));
    }

    public final b0 delay(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new g2(this, j10, timeUnit, m0Var, z10));
    }

    public final b0 doOnEach(i0 i0Var) {
        ut.o0.requireNonNull(i0Var, "observer is null");
        return a(o5.observerOnNext(i0Var), o5.observerOnError(i0Var), o5.observerOnComplete(i0Var), ut.m0.f88680c);
    }

    public final b0 sample(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new c9(this, j10, timeUnit, m0Var, z10));
    }

    public final <K, V> n0<Map<K, V>> toMap(st.o oVar, st.o oVar2, Callable<? extends Map<K, V>> callable) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        ut.o0.requireNonNull(callable, "mapSupplier is null");
        return collect(callable, ut.m0.toMapKeyValueSelector(oVar, oVar2));
    }

    public final n0<List<Object>> toSortedList(int i10) {
        return toSortedList(ut.m0.naturalOrder(), i10);
    }

    public final <U, R> b0 zipWith(g0 g0Var, st.c cVar, boolean z10) {
        return zip(this, g0Var, cVar, z10);
    }

    public static <T, R> b0 combineLatest(g0[] g0VarArr, st.o oVar) {
        return combineLatest(g0VarArr, oVar, bufferSize());
    }

    public static <T> b0 concat(g0 g0Var, g0 g0Var2) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return concatArray(g0Var, g0Var2);
    }

    public static <T, S> b0 generate(Callable<S> callable, st.b bVar, st.g gVar) {
        ut.o0.requireNonNull(bVar, "generator is null");
        return generate(callable, o5.simpleBiGenerator(bVar), gVar);
    }

    public final <U extends Collection<Object>> b0 buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    public final b0 concatWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new j1(this, iVar));
    }

    public final b0 mergeWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new j6(this, iVar));
    }

    public final <R> b0 replay(st.o oVar, int i10, long j10, TimeUnit timeUnit) {
        return replay(oVar, i10, j10, timeUnit, ou.j.computation());
    }

    public final b0 timeout(long j10, TimeUnit timeUnit, m0 m0Var, g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "other is null");
        return b(j10, timeUnit, m0Var, g0Var);
    }

    public final b0 window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, ou.j.computation(), bufferSize());
    }

    public final <U, R> b0 zipWith(g0 g0Var, st.c cVar, boolean z10, int i10) {
        return zip(this, g0Var, cVar, z10, i10);
    }

    public static <T, R> b0 combineLatest(g0[] g0VarArr, st.o oVar, int i10) {
        ut.o0.requireNonNull(g0VarArr, "sources is null");
        if (g0VarArr.length == 0) {
            return empty();
        }
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new a1(g0VarArr, null, oVar, i10 << 1, false));
    }

    public static <T, R> b0 combineLatestDelayError(Iterable<? extends g0> iterable, st.o oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> n0<Boolean> sequenceEqual(g0 g0Var, g0 g0Var2, int i10) {
        return sequenceEqual(g0Var, g0Var2, ut.o0.equalsPredicate(), i10);
    }

    public final b0 buffer(long j10, long j11, TimeUnit timeUnit) {
        return buffer(j10, j11, timeUnit, ou.j.computation(), iu.c.asCallable());
    }

    public final <R> b0 replay(st.o oVar, int i10, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return r8.multicastSelector(o5.replayCallable(this, i10, j10, timeUnit, m0Var), oVar);
    }

    public final <K, V> n0<Map<K, Collection<V>>> toMultimap(st.o oVar, st.o oVar2, Callable<? extends Map<K, Collection<V>>> callable, st.o oVar3) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        ut.o0.requireNonNull(callable, "mapSupplier is null");
        ut.o0.requireNonNull(oVar3, "collectionFactory is null");
        return collect(callable, ut.m0.toMultimapKeyValueSelector(oVar, oVar2, oVar3));
    }

    public final b0 window(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        return window(j10, j11, timeUnit, m0Var, bufferSize());
    }

    public static <T, R> b0 combineLatestDelayError(Iterable<? extends g0> iterable, st.o oVar, int i10) {
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new a1(null, iterable, oVar, i10 << 1, true));
    }

    public static <T> b0 fromFuture(Future<? extends T> future, m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return fromFuture(future).subscribeOn(m0Var);
    }

    public static <T, S> b0 generate(Callable<S> callable, st.c cVar) {
        return generate(callable, cVar, ut.m0.emptyConsumer());
    }

    public static <T> b0 merge(g0 g0Var, g0 g0Var2) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return fromArray(g0Var, g0Var2).flatMap(ut.m0.identity(), false, 2);
    }

    public static <T> b0 mergeDelayError(g0 g0Var, g0 g0Var2) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return fromArray(g0Var, g0Var2).flatMap(ut.m0.identity(), true, 2);
    }

    public static <T1, T2, R> b0 zip(g0 g0Var, g0 g0Var2, st.c cVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), false, bufferSize(), g0Var, g0Var2);
    }

    public final b0 buffer(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        return buffer(j10, j11, timeUnit, m0Var, iu.c.asCallable());
    }

    public final <U, V> b0 delay(g0 g0Var, st.o oVar) {
        return delaySubscription(g0Var).delay(oVar);
    }

    public final n0<Object> elementAt(long j10, Object obj) {
        if (j10 >= 0) {
            ut.o0.requireNonNull(obj, "defaultItem is null");
            return mu.a.onAssembly(new e3(this, j10, obj));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "index >= 0 required but it was "));
    }

    public final <U> b0 sample(g0 g0Var) {
        ut.o0.requireNonNull(g0Var, "sampler is null");
        return mu.a.onAssembly(new h9(this, g0Var, false));
    }

    public final b0 take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    public final b0 timeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return b(j10, timeUnit, m0Var, null);
    }

    public final b0 window(long j10, long j11, TimeUnit timeUnit, m0 m0Var, int i10) {
        ut.o0.verifyPositive(j10, "timespan");
        ut.o0.verifyPositive(j11, "timeskip");
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        return mu.a.onAssembly(new ed(this, j10, j11, timeUnit, m0Var, Long.MAX_VALUE, i10, false));
    }

    public final <T1, T2, T3, R> b0 withLatestFrom(g0 g0Var, g0 g0Var2, g0 g0Var3, st.i iVar) {
        ut.o0.requireNonNull(g0Var, "o1 is null");
        ut.o0.requireNonNull(g0Var2, "o2 is null");
        ut.o0.requireNonNull(g0Var3, "o3 is null");
        ut.o0.requireNonNull(iVar, "combiner is null");
        return withLatestFrom(new g0[]{g0Var, g0Var2, g0Var3}, ut.m0.toFunction(iVar));
    }

    public static <T> b0 concat(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        return concatArray(g0Var, g0Var2, g0Var3);
    }

    public static <T, S> b0 generate(Callable<S> callable, st.c cVar, st.g gVar) {
        ut.o0.requireNonNull(callable, "initialState is null");
        ut.o0.requireNonNull(cVar, "generator is null");
        ut.o0.requireNonNull(gVar, "disposeState is null");
        return mu.a.onAssembly(new k4(callable, cVar, gVar));
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        return fromArray(t10, t11, t12, t13);
    }

    public final <U extends Collection<Object>> b0 buffer(long j10, long j11, TimeUnit timeUnit, m0 m0Var, Callable<U> callable) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new bu.q0(this, j10, j11, timeUnit, m0Var, callable, Integer.MAX_VALUE, false));
    }

    public final b0 skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, ou.j.trampoline(), false, bufferSize());
    }

    public final b0 take(long j10, TimeUnit timeUnit, m0 m0Var) {
        return takeUntil(timer(j10, timeUnit, m0Var));
    }

    public final <U, V> b0 timeout(g0 g0Var, st.o oVar) {
        ut.o0.requireNonNull(g0Var, "firstTimeoutIndicator is null");
        return c(g0Var, oVar, null);
    }

    public final <U> b0 sample(g0 g0Var, boolean z10) {
        ut.o0.requireNonNull(g0Var, "sampler is null");
        return mu.a.onAssembly(new h9(this, g0Var, z10));
    }

    public final b0 skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, ou.j.trampoline(), z10, bufferSize());
    }

    @Override // mt.g0
    public final void subscribe(i0 i0Var) {
        ut.o0.requireNonNull(i0Var, "observer is null");
        try {
            i0 i0VarOnSubscribe = mu.a.onSubscribe(this, i0Var);
            ut.o0.requireNonNull(i0VarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(i0VarOnSubscribe);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final b0 takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, ou.j.trampoline(), false, bufferSize());
    }

    public static <T> b0 merge(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        return fromArray(g0Var, g0Var2, g0Var3).flatMap(ut.m0.identity(), false, 3);
    }

    public static <T> b0 mergeDelayError(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        return fromArray(g0Var, g0Var2, g0Var3).flatMap(ut.m0.identity(), true, 3);
    }

    public static <T1, T2, R> b0 zip(g0 g0Var, g0 g0Var2, st.c cVar, boolean z10) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), z10, bufferSize(), g0Var, g0Var2);
    }

    public final <R> b0 flatMap(st.o oVar, st.o oVar2, Callable<? extends g0> callable) {
        ut.o0.requireNonNull(oVar, "onNextMapper is null");
        ut.o0.requireNonNull(oVar2, "onErrorMapper is null");
        ut.o0.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new e6(this, oVar, oVar2, callable));
    }

    public final b0 skipLast(long j10, TimeUnit timeUnit, m0 m0Var) {
        return skipLast(j10, timeUnit, m0Var, false, bufferSize());
    }

    public final b0 takeLast(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        return takeLast(j10, j11, timeUnit, m0Var, false, bufferSize());
    }

    public final <U, V> b0 timeout(g0 g0Var, st.o oVar, g0 g0Var2) {
        ut.o0.requireNonNull(g0Var, "firstTimeoutIndicator is null");
        ut.o0.requireNonNull(g0Var2, "other is null");
        return c(g0Var, oVar, g0Var2);
    }

    public final b0 skipLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        return skipLast(j10, timeUnit, m0Var, z10, bufferSize());
    }

    public final b0 takeLast(long j10, long j11, TimeUnit timeUnit, m0 m0Var, boolean z10, int i10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        if (j10 >= 0) {
            return mu.a.onAssembly(new ab(this, j10, j11, timeUnit, m0Var, i10, z10));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "count >= 0 required but it was "));
    }

    public final <K, V> n0<Map<K, Collection<V>>> toMultimap(st.o oVar, st.o oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, iu.c.asFunction());
    }

    public static <T1, T2, R> b0 combineLatest(g0 g0Var, g0 g0Var2, st.c cVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return combineLatest(ut.m0.toFunction(cVar), bufferSize(), g0Var, g0Var2);
    }

    public static <T> b0 concat(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        return concatArray(g0Var, g0Var2, g0Var3, g0Var4);
    }

    public final b0 buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, ou.j.computation(), Integer.MAX_VALUE);
    }

    public final <R> b0 replay(st.o oVar, int i10, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return r8.multicastSelector(o5.replayCallable(this, i10), o5.replayFunction(oVar, m0Var));
    }

    public final b0 retry(st.q qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final b0 skipLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10, int i10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new fa(this, j10, timeUnit, m0Var, i10 << 1, z10));
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13, T t14) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    public static <T1, T2, R> b0 zip(g0 g0Var, g0 g0Var2, st.c cVar, boolean z10, int i10) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), z10, i10, g0Var, g0Var2);
    }

    public final b0 buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, ou.j.computation(), i10);
    }

    public final b0 window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, ou.j.computation(), Long.MAX_VALUE, false);
    }

    public final <T1, T2, T3, T4, R> b0 withLatestFrom(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, st.j jVar) {
        ut.o0.requireNonNull(g0Var, "o1 is null");
        ut.o0.requireNonNull(g0Var2, "o2 is null");
        ut.o0.requireNonNull(g0Var3, "o3 is null");
        ut.o0.requireNonNull(g0Var4, "o4 is null");
        ut.o0.requireNonNull(jVar, "combiner is null");
        return withLatestFrom(new g0[]{g0Var, g0Var2, g0Var3, g0Var4}, ut.m0.toFunction(jVar));
    }

    public static <T> b0 merge(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        return fromArray(g0Var, g0Var2, g0Var3, g0Var4).flatMap(ut.m0.identity(), false, 4);
    }

    public static <T> b0 mergeDelayError(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        return fromArray(g0Var, g0Var2, g0Var3, g0Var4).flatMap(ut.m0.identity(), true, 4);
    }

    public final b0 buffer(long j10, TimeUnit timeUnit, m0 m0Var, int i10) {
        return buffer(j10, timeUnit, m0Var, i10, iu.c.asCallable(), false);
    }

    public final <R> b0 flatMap(st.o oVar, st.o oVar2, Callable<? extends g0> callable, int i10) {
        ut.o0.requireNonNull(oVar, "onNextMapper is null");
        ut.o0.requireNonNull(oVar2, "onErrorMapper is null");
        ut.o0.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new e6(this, oVar, oVar2, callable), i10);
    }

    public final b0 window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, ou.j.computation(), j11, false);
    }

    public static <T1, T2, T3, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, st.h hVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        return combineLatest(ut.m0.toFunction(hVar), bufferSize(), g0Var, g0Var2, g0Var3);
    }

    public final <U extends Collection<Object>> b0 buffer(long j10, TimeUnit timeUnit, m0 m0Var, int i10, Callable<U> callable, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        ut.o0.verifyPositive(i10, "count");
        return mu.a.onAssembly(new bu.q0(this, j10, j10, timeUnit, m0Var, callable, i10, z10));
    }

    public final b0 window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, ou.j.computation(), j11, z10);
    }

    public static <T1, T2, T3, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, st.h hVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        return zipArray(ut.m0.toFunction(hVar), false, bufferSize(), g0Var, g0Var2, g0Var3);
    }

    public final b0 window(long j10, TimeUnit timeUnit, m0 m0Var) {
        return window(j10, timeUnit, m0Var, Long.MAX_VALUE, false);
    }

    public final b0 window(long j10, TimeUnit timeUnit, m0 m0Var, long j11) {
        return window(j10, timeUnit, m0Var, j11, false);
    }

    public final <R> b0 flatMap(st.o oVar, int i10) {
        return flatMap(oVar, false, i10, bufferSize());
    }

    public final <R> b0 replay(st.o oVar, long j10, TimeUnit timeUnit) {
        return replay(oVar, j10, timeUnit, ou.j.computation());
    }

    public final b0 window(long j10, TimeUnit timeUnit, m0 m0Var, long j11, boolean z10) {
        return window(j10, timeUnit, m0Var, j11, z10, bufferSize());
    }

    public static <T1, T2, T3, T4, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, st.i iVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        return combineLatest(ut.m0.toFunction(iVar), bufferSize(), g0Var, g0Var2, g0Var3, g0Var4);
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13, T t14, T t15) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    public final <U, R> b0 flatMap(st.o oVar, st.c cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> b0 replay(st.o oVar, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return r8.multicastSelector(o5.replayCallable(this, j10, timeUnit, m0Var), oVar);
    }

    public final b0 window(long j10, TimeUnit timeUnit, m0 m0Var, long j11, boolean z10, int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.verifyPositive(j11, "count");
        return mu.a.onAssembly(new ed(this, j10, j10, timeUnit, m0Var, j11, i10, z10));
    }

    public static <T1, T2, T3, T4, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, st.i iVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        return zipArray(ut.m0.toFunction(iVar), false, bufferSize(), g0Var, g0Var2, g0Var3, g0Var4);
    }

    public final b0 buffer(long j10, TimeUnit timeUnit, m0 m0Var) {
        return buffer(j10, timeUnit, m0Var, Integer.MAX_VALUE, iu.c.asCallable(), false);
    }

    public final <U, R> b0 flatMap(st.o oVar, st.c cVar, boolean z10) {
        return flatMap(oVar, cVar, z10, bufferSize(), bufferSize());
    }

    public final <R> b0 withLatestFrom(g0[] g0VarArr, st.o oVar) {
        ut.o0.requireNonNull(g0VarArr, "others is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        return mu.a.onAssembly(new ld(this, g0VarArr, oVar));
    }

    public final <TOpening, TClosing> b0 buffer(g0 g0Var, st.o oVar) {
        return buffer(g0Var, oVar, iu.c.asCallable());
    }

    public final <U, R> b0 flatMap(st.o oVar, st.c cVar, boolean z10, int i10) {
        return flatMap(oVar, cVar, z10, i10, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<Object>> b0 buffer(g0 g0Var, st.o oVar, Callable<U> callable) {
        ut.o0.requireNonNull(g0Var, "openingIndicator is null");
        ut.o0.requireNonNull(oVar, "closingIndicator is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new bu.e0(this, g0Var, oVar, callable));
    }

    public final <U, R> b0 flatMap(st.o oVar, st.c cVar, boolean z10, int i10, int i11) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.requireNonNull(cVar, "combiner is null");
        return flatMap(o5.flatMapWithCombiner(oVar, cVar), z10, i10, i11);
    }

    public final b0 takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, ou.j.trampoline(), false, bufferSize());
    }

    public final <R> b0 replay(st.o oVar, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return r8.multicastSelector(o5.replayCallable(this), o5.replayFunction(oVar, m0Var));
    }

    public final b0 takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, ou.j.trampoline(), z10, bufferSize());
    }

    public final <R> b0 withLatestFrom(Iterable<? extends g0> iterable, st.o oVar) {
        ut.o0.requireNonNull(iterable, "others is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        return mu.a.onAssembly(new ld(this, iterable, oVar));
    }

    public static <T1, T2, T3, T4, T5, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, st.j jVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        return combineLatest(ut.m0.toFunction(jVar), bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5);
    }

    public final b0 takeLast(long j10, TimeUnit timeUnit, m0 m0Var) {
        return takeLast(j10, timeUnit, m0Var, false, bufferSize());
    }

    public final <B> b0 window(g0 g0Var) {
        return window(g0Var, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, st.j jVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        return zipArray(ut.m0.toFunction(jVar), false, bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5);
    }

    public final <U, R> b0 flatMap(st.o oVar, st.c cVar, int i10) {
        return flatMap(oVar, cVar, false, i10, bufferSize());
    }

    public final b0 takeLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        return takeLast(j10, timeUnit, m0Var, z10, bufferSize());
    }

    public final <B> b0 window(g0 g0Var, int i10) {
        ut.o0.requireNonNull(g0Var, "boundary is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new pc(this, g0Var, i10));
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        ut.o0.requireNonNull(t16, "item7 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    public final <B> b0 buffer(g0 g0Var) {
        return buffer(g0Var, iu.c.asCallable());
    }

    public final b0 takeLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, m0Var, z10, i10);
    }

    public final <B> b0 buffer(g0 g0Var, int i10) {
        ut.o0.verifyPositive(i10, "initialCapacity");
        return buffer(g0Var, ut.m0.createArrayList(i10));
    }

    public final ju.a replay(int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        return r8.create(this, i10);
    }

    public final <U, V> b0 window(g0 g0Var, st.o oVar) {
        return window(g0Var, oVar, bufferSize());
    }

    public final <B, U extends Collection<Object>> b0 buffer(g0 g0Var, Callable<U> callable) {
        ut.o0.requireNonNull(g0Var, "boundary is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new bu.k0(this, g0Var, callable));
    }

    public final <U, V> b0 window(g0 g0Var, st.o oVar, int i10) {
        ut.o0.requireNonNull(g0Var, "openingIndicator is null");
        ut.o0.requireNonNull(oVar, "closingIndicator is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new uc(this, g0Var, oVar, i10));
    }

    public static <T1, T2, T3, T4, T5, T6, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, st.k kVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        return combineLatest(ut.m0.toFunction(kVar), bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6);
    }

    public final ju.a replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, ou.j.computation());
    }

    public static <T1, T2, T3, T4, T5, T6, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, st.k kVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        return zipArray(ut.m0.toFunction(kVar), false, bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6);
    }

    public final ju.a replay(int i10, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return r8.create(this, j10, timeUnit, m0Var, i10);
    }

    public final <B> b0 buffer(Callable<? extends g0> callable) {
        return buffer(callable, iu.c.asCallable());
    }

    public final <B, U extends Collection<Object>> b0 buffer(Callable<? extends g0> callable, Callable<U> callable2) {
        ut.o0.requireNonNull(callable, "boundarySupplier is null");
        ut.o0.requireNonNull(callable2, "bufferSupplier is null");
        return mu.a.onAssembly(new bu.h0(this, callable, callable2));
    }

    public final <B> b0 window(Callable<? extends g0> callable) {
        return window(callable, bufferSize());
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        ut.o0.requireNonNull(t16, "item7 is null");
        ut.o0.requireNonNull(t17, "item8 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    public final <B> b0 window(Callable<? extends g0> callable, int i10) {
        ut.o0.requireNonNull(callable, "boundary is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new xc(this, callable, i10));
    }

    public final ju.a replay(int i10, m0 m0Var) {
        ut.o0.verifyPositive(i10, "bufferSize");
        return r8.observeOn(replay(i10), m0Var);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, g0 g0Var7, st.l lVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        ut.o0.requireNonNull(g0Var7, "source7 is null");
        return combineLatest(ut.m0.toFunction(lVar), bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7);
    }

    public final ju.a replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, ou.j.computation());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, g0 g0Var7, st.l lVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        ut.o0.requireNonNull(g0Var7, "source7 is null");
        return zipArray(ut.m0.toFunction(lVar), false, bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7);
    }

    public final ju.a replay(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return r8.create(this, j10, timeUnit, m0Var);
    }

    public final ju.a replay(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return r8.observeOn(replay(), m0Var);
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        ut.o0.requireNonNull(t16, "item7 is null");
        ut.o0.requireNonNull(t17, "item8 is null");
        ut.o0.requireNonNull(t18, "item9 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, g0 g0Var7, g0 g0Var8, st.m mVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        ut.o0.requireNonNull(g0Var7, "source7 is null");
        ut.o0.requireNonNull(g0Var8, "source8 is null");
        return combineLatest(ut.m0.toFunction(mVar), bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, g0 g0Var7, g0 g0Var8, st.m mVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        ut.o0.requireNonNull(g0Var7, "source7 is null");
        ut.o0.requireNonNull(g0Var8, "source8 is null");
        return zipArray(ut.m0.toFunction(mVar), false, bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8);
    }

    public static <T> b0 just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        ut.o0.requireNonNull(t16, "item7 is null");
        ut.o0.requireNonNull(t17, "item8 is null");
        ut.o0.requireNonNull(t18, "item9 is null");
        ut.o0.requireNonNull(t19, "item10 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> b0 combineLatest(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, g0 g0Var7, g0 g0Var8, g0 g0Var9, st.n nVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        ut.o0.requireNonNull(g0Var7, "source7 is null");
        ut.o0.requireNonNull(g0Var8, "source8 is null");
        ut.o0.requireNonNull(g0Var9, "source9 is null");
        return combineLatest(ut.m0.toFunction(nVar), bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> b0 zip(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, g0 g0Var5, g0 g0Var6, g0 g0Var7, g0 g0Var8, g0 g0Var9, st.n nVar) {
        ut.o0.requireNonNull(g0Var, "source1 is null");
        ut.o0.requireNonNull(g0Var2, "source2 is null");
        ut.o0.requireNonNull(g0Var3, "source3 is null");
        ut.o0.requireNonNull(g0Var4, "source4 is null");
        ut.o0.requireNonNull(g0Var5, "source5 is null");
        ut.o0.requireNonNull(g0Var6, "source6 is null");
        ut.o0.requireNonNull(g0Var7, "source7 is null");
        ut.o0.requireNonNull(g0Var8, "source8 is null");
        ut.o0.requireNonNull(g0Var9, "source9 is null");
        return zipArray(ut.m0.toFunction(nVar), false, bufferSize(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9);
    }
}
