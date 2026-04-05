package mt;

import bu.h4;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import hr.kNq.ikJMrW;
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
import yt.a1;
import yt.a3;
import yt.a8;
import yt.a9;
import yt.af;
import yt.b7;
import yt.bb;
import yt.bc;
import yt.bd;
import yt.be;
import yt.c1;
import yt.c4;
import yt.c5;
import yt.c6;
import yt.d3;
import yt.d7;
import yt.db;
import yt.dd;
import yt.e5;
import yt.e8;
import yt.e9;
import yt.ec;
import yt.ef;
import yt.f2;
import yt.fd;
import yt.fe;
import yt.g3;
import yt.g5;
import yt.g7;
import yt.g8;
import yt.g9;
import yt.gc;
import yt.h9;
import yt.hf;
import yt.i2;
import yt.i4;
import yt.i8;
import yt.ia;
import yt.ie;
import yt.j1;
import yt.j3;
import yt.j7;
import yt.jb;
import yt.jc;
import yt.k6;
import yt.ka;
import yt.kb;
import yt.kd;
import yt.kf;
import yt.l1;
import yt.l2;
import yt.l4;
import yt.lc;
import yt.m1;
import yt.m2;
import yt.m3;
import yt.m6;
import yt.m7;
import yt.m8;
import yt.m9;
import yt.ma;
import yt.n5;
import yt.nc;
import yt.ne;
import yt.o3;
import yt.o6;
import yt.o9;
import yt.oa;
import yt.ob;
import yt.p1;
import yt.p4;
import yt.p5;
import yt.p7;
import yt.pc;
import yt.q6;
import yt.q7;
import yt.qb;
import yt.qd;
import yt.qe;
import yt.r1;
import yt.r2;
import yt.r4;
import yt.r5;
import yt.r6;
import yt.rc;
import yt.s3;
import yt.s9;
import yt.sb;
import yt.sd;
import yt.t1;
import yt.t5;
import yt.t6;
import yt.ta;
import yt.u2;
import yt.u3;
import yt.u4;
import yt.u7;
import yt.u8;
import yt.ub;
import yt.v3;
import yt.v4;
import yt.v6;
import yt.vc;
import yt.w0;
import yt.w2;
import yt.w3;
import yt.w4;
import yt.w6;
import yt.w7;
import yt.wb;
import yt.wd;
import yt.x1;
import yt.x8;
import yt.xa;
import yt.xc;
import yt.xe;
import yt.y2;
import yt.y6;
import yt.y7;
import yt.z3;
import yt.z4;
import yt.za;
import yt.zb;
import yt.zc;
import yt.zd;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class l implements tw.b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f74920b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static <T> l amb(Iterable<? extends tw.b> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new yt.r(null, iterable));
    }

    public static <T> l ambArray(tw.b... bVarArr) {
        ut.o0.requireNonNull(bVarArr, "sources is null");
        int length = bVarArr.length;
        return length == 0 ? empty() : length == 1 ? fromPublisher(bVarArr[0]) : mu.a.onAssembly(new yt.r(bVarArr, null));
    }

    public static int bufferSize() {
        return f74920b;
    }

    public static <T, R> l combineLatest(tw.b[] bVarArr, st.o oVar) {
        return combineLatest(bVarArr, oVar, bufferSize());
    }

    public static <T, R> l combineLatestDelayError(tw.b[] bVarArr, st.o oVar) {
        return combineLatestDelayError(bVarArr, oVar, bufferSize());
    }

    public static <T> l concat(Iterable<? extends tw.b> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(ut.m0.identity(), 2, false);
    }

    public static <T> l concatArray(tw.b... bVarArr) {
        return bVarArr.length == 0 ? empty() : bVarArr.length == 1 ? fromPublisher(bVarArr[0]) : mu.a.onAssembly(new c1(bVarArr, false));
    }

    public static <T> l concatArrayDelayError(tw.b... bVarArr) {
        return bVarArr.length == 0 ? empty() : bVarArr.length == 1 ? fromPublisher(bVarArr[0]) : mu.a.onAssembly(new c1(bVarArr, true));
    }

    public static <T> l concatArrayEager(tw.b... bVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), bVarArr);
    }

    public static <T> l concatArrayEagerDelayError(tw.b... bVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), bVarArr);
    }

    public static <T> l concatDelayError(Iterable<? extends tw.b> iterable) {
        ut.o0.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(ut.m0.identity());
    }

    public static <T> l concatEager(tw.b bVar) {
        return concatEager(bVar, bufferSize(), bufferSize());
    }

    public static <T> l create(o oVar, b bVar) {
        ut.o0.requireNonNull(oVar, "source is null");
        ut.o0.requireNonNull(bVar, "mode is null");
        return mu.a.onAssembly(new f2(oVar, bVar));
    }

    public static <T> l defer(Callable<? extends tw.b> callable) {
        ut.o0.requireNonNull(callable, "supplier is null");
        return mu.a.onAssembly(new m2(callable));
    }

    public static <T> l empty() {
        return mu.a.onAssembly(v3.f96434c);
    }

    public static <T> l error(Callable<? extends Throwable> callable) {
        ut.o0.requireNonNull(callable, "supplier is null");
        return mu.a.onAssembly(new w3(callable));
    }

    public static <T> l fromArray(T... tArr) {
        ut.o0.requireNonNull(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : mu.a.onAssembly(new u4(tArr));
    }

    public static <T> l fromCallable(Callable<? extends T> callable) {
        ut.o0.requireNonNull(callable, "supplier is null");
        return mu.a.onAssembly(new v4(callable));
    }

    public static <T> l fromFuture(Future<? extends T> future) {
        ut.o0.requireNonNull(future, "future is null");
        return mu.a.onAssembly(new w4(future, 0L, null));
    }

    public static <T> l fromIterable(Iterable<? extends T> iterable) {
        ut.o0.requireNonNull(iterable, "source is null");
        return mu.a.onAssembly(new z4(iterable));
    }

    public static <T> l fromPublisher(tw.b bVar) {
        if (bVar instanceof l) {
            return mu.a.onAssembly((l) bVar);
        }
        ut.o0.requireNonNull(bVar, "source is null");
        return mu.a.onAssembly(new c5(bVar));
    }

    public static <T> l generate(st.g gVar) {
        ut.o0.requireNonNull(gVar, "generator is null");
        return generate(ut.m0.nullSupplier(), k6.simpleGenerator(gVar), ut.m0.emptyConsumer());
    }

    public static l interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, ou.j.computation());
    }

    public static l intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, ou.j.computation());
    }

    public static <T> l just(T t10) {
        ut.o0.requireNonNull(t10, "item is null");
        return mu.a.onAssembly(new r6(t10));
    }

    public static <T> l merge(Iterable<? extends tw.b> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), false, i10, i11);
    }

    public static <T> l mergeArray(int i10, int i11, tw.b... bVarArr) {
        return fromArray(bVarArr).flatMap(ut.m0.identity(), false, i10, i11);
    }

    public static <T> l mergeArrayDelayError(int i10, int i11, tw.b... bVarArr) {
        return fromArray(bVarArr).flatMap(ut.m0.identity(), true, i10, i11);
    }

    public static <T> l mergeDelayError(Iterable<? extends tw.b> iterable) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), true);
    }

    public static <T> l never() {
        return mu.a.onAssembly(q7.f96194c);
    }

    public static l range(int i10, int i11) {
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
            return mu.a.onAssembly(new x8(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static l rangeLong(long j10, long j11) {
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
            return mu.a.onAssembly(new a9(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> n0<Boolean> sequenceEqual(tw.b bVar, tw.b bVar2) {
        return sequenceEqual(bVar, bVar2, ut.o0.equalsPredicate(), bufferSize());
    }

    public static <T> l switchOnNext(tw.b bVar, int i10) {
        return fromPublisher(bVar).switchMap(ut.m0.identity(), i10);
    }

    public static <T> l switchOnNextDelayError(tw.b bVar) {
        return switchOnNextDelayError(bVar, bufferSize());
    }

    public static l timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, ou.j.computation());
    }

    public static <T> l unsafeCreate(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "onSubscribe is null");
        if (bVar instanceof l) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return mu.a.onAssembly(new c5(bVar));
    }

    public static <T, D> l using(Callable<? extends D> callable, st.o oVar, st.g gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T, R> l zip(Iterable<? extends tw.b> iterable, st.o oVar) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(iterable, "sources is null");
        return mu.a.onAssembly(new hf(null, iterable, oVar, bufferSize(), false));
    }

    public static <T, R> l zipArray(st.o oVar, boolean z10, int i10, tw.b... bVarArr) {
        if (bVarArr.length == 0) {
            return empty();
        }
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new hf(bVarArr, null, oVar, i10, z10));
    }

    public static <T, R> l zipIterable(Iterable<? extends tw.b> iterable, st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new hf(null, iterable, oVar, i10, z10));
    }

    public final l a(st.g gVar, st.g gVar2, st.a aVar, st.a aVar2) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o0.requireNonNull(aVar2, "onAfterTerminate is null");
        return mu.a.onAssembly(new m3(this, gVar, gVar2, aVar, aVar2));
    }

    public final n0<Boolean> all(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new yt.o(this, qVar));
    }

    public final l ambWith(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return ambArray(this, bVar);
    }

    public final n0<Boolean> any(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new yt.v(this, qVar));
    }

    public final <R> R as(m mVar) {
        ut.o0.requireNonNull(mVar, "converter is null").getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l b(st.o oVar, int i10, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new jc(this, oVar, i10, z10));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : za.scalarXMap(objCall, oVar);
    }

    public final Object blockingFirst() throws InterruptedException {
        gu.d dVar = new gu.d();
        subscribe((q) dVar);
        Object objBlockingGet = dVar.blockingGet();
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
        gu.e eVar = new gu.e();
        subscribe((q) eVar);
        Object objBlockingGet = eVar.blockingGet();
        if (objBlockingGet != null) {
            return objBlockingGet;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<Object> blockingLatest() {
        return new yt.e(this);
    }

    public final Iterable<Object> blockingMostRecent(Object obj) {
        return new yt.h(this, obj);
    }

    public final Iterable<Object> blockingNext() {
        return new yt.k(this);
    }

    public final Object blockingSingle() {
        return singleOrError().blockingGet();
    }

    public final void blockingSubscribe() {
        yt.x.subscribe(this);
    }

    public final l buffer(int i10) {
        return buffer(i10, i10);
    }

    public final l c(long j10, TimeUnit timeUnit, m0 m0Var, tw.b bVar) {
        ut.o0.requireNonNull(timeUnit, "timeUnit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new qd(this, j10, timeUnit, m0Var, bVar));
    }

    public final l cache() {
        return cacheWithInitialCapacity(16);
    }

    public final l cacheWithInitialCapacity(int i10) {
        ut.o0.verifyPositive(i10, "initialCapacity");
        return mu.a.onAssembly(new yt.s0(this, i10));
    }

    public final <U> l cast(Class<U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return map(ut.m0.castFunction(cls));
    }

    public final <U> n0<U> collect(Callable<? extends U> callable, st.b bVar) {
        ut.o0.requireNonNull(callable, "initialItemSupplier is null");
        ut.o0.requireNonNull(bVar, "collector is null");
        return mu.a.onAssembly(new w0(this, callable, bVar));
    }

    public final <U> n0<U> collectInto(U u10, st.b bVar) {
        ut.o0.requireNonNull(u10, "initialItem is null");
        return collect(ut.m0.justCallable(u10), bVar);
    }

    public final <R> l compose(r rVar) {
        ut.o0.requireNonNull(rVar, "composer is null").getClass();
        throw new ClassCastException();
    }

    public final <R> l concatMap(st.o oVar) {
        return concatMap(oVar, 2);
    }

    public final c concatMapCompletable(st.o oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final c concatMapCompletableDelayError(st.o oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> l concatMapDelayError(st.o oVar) {
        return concatMapDelayError(oVar, 2, true);
    }

    public final <R> l concatMapEager(st.o oVar) {
        return concatMapEager(oVar, bufferSize(), bufferSize());
    }

    public final <R> l concatMapEagerDelayError(st.o oVar, boolean z10) {
        return concatMapEagerDelayError(oVar, bufferSize(), bufferSize(), z10);
    }

    public final <U> l concatMapIterable(st.o oVar) {
        return concatMapIterable(oVar, 2);
    }

    public final <R> l concatMapMaybe(st.o oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> l concatMapMaybeDelayError(st.o oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> l concatMapSingle(st.o oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> l concatMapSingleDelayError(st.o oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final l concatWith(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return concat(this, bVar);
    }

    public final n0<Boolean> contains(Object obj) {
        ut.o0.requireNonNull(obj, "item is null");
        return any(ut.m0.equalsWith(obj));
    }

    public final n0<Long> count() {
        return mu.a.onAssembly(new x1(this));
    }

    public final l d(tw.b bVar, st.o oVar, tw.b bVar2) {
        ut.o0.requireNonNull(oVar, "itemTimeoutIndicator is null");
        return mu.a.onAssembly(new kd(this, bVar, oVar, bVar2));
    }

    public final <U> l debounce(st.o oVar) {
        ut.o0.requireNonNull(oVar, "debounceIndicator is null");
        return mu.a.onAssembly(new i2(this, oVar));
    }

    public final l defaultIfEmpty(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem is null");
        return switchIfEmpty(just(obj));
    }

    public final <U> l delay(st.o oVar) {
        ut.o0.requireNonNull(oVar, "itemDelayIndicator is null");
        return flatMap(k6.itemDelay(oVar));
    }

    public final <U> l delaySubscription(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "subscriptionIndicator is null");
        return mu.a.onAssembly(new u2(this, bVar));
    }

    @Deprecated
    public final <T2> l dematerialize() {
        return mu.a.onAssembly(new w2(this, ut.m0.identity()));
    }

    public final l distinct() {
        return distinct(ut.m0.identity(), ut.m0.createHashSet());
    }

    public final l distinctUntilChanged() {
        return distinctUntilChanged(ut.m0.identity());
    }

    public final l doAfterNext(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onAfterNext is null");
        return mu.a.onAssembly(new g3(this, gVar));
    }

    public final l doAfterTerminate(st.a aVar) {
        return a(ut.m0.emptyConsumer(), ut.m0.emptyConsumer(), ut.m0.f88680c, aVar);
    }

    public final l doFinally(st.a aVar) {
        ut.o0.requireNonNull(aVar, "onFinally is null");
        return mu.a.onAssembly(new j3(this, aVar));
    }

    public final l doOnCancel(st.a aVar) {
        return doOnLifecycle(ut.m0.emptyConsumer(), ut.m0.f88683f, aVar);
    }

    public final l doOnComplete(st.a aVar) {
        return a(ut.m0.emptyConsumer(), ut.m0.emptyConsumer(), aVar, ut.m0.f88680c);
    }

    public final l doOnEach(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onNotification is null");
        return a(ut.m0.notificationOnNext(gVar), ut.m0.notificationOnError(gVar), ut.m0.notificationOnComplete(gVar), ut.m0.f88680c);
    }

    public final l doOnError(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVarEmptyConsumer, gVar, oVar, oVar);
    }

    public final l doOnLifecycle(st.g gVar, st.p pVar, st.a aVar) {
        ut.o0.requireNonNull(gVar, "onSubscribe is null");
        ut.o0.requireNonNull(pVar, "onRequest is null");
        ut.o0.requireNonNull(aVar, "onCancel is null");
        return mu.a.onAssembly(new o3(this, gVar, pVar, aVar));
    }

    public final l doOnNext(st.g gVar) {
        st.g gVarEmptyConsumer = ut.m0.emptyConsumer();
        ut.o oVar = ut.m0.f88680c;
        return a(gVar, gVarEmptyConsumer, oVar, oVar);
    }

    public final l doOnRequest(st.p pVar) {
        return doOnLifecycle(ut.m0.emptyConsumer(), pVar, ut.m0.f88680c);
    }

    public final l doOnSubscribe(st.g gVar) {
        return doOnLifecycle(gVar, ut.m0.f88683f, ut.m0.f88680c);
    }

    public final l doOnTerminate(st.a aVar) {
        return a(ut.m0.emptyConsumer(), ut.m0.actionConsumer(aVar), aVar, ut.m0.f88680c);
    }

    public final s elementAt(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new s3(this, j10));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "index >= 0 required but it was "));
    }

    public final n0<Object> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new u3(this, j10, null));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "index >= 0 required but it was "));
    }

    public final l filter(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new z3(this, qVar));
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

    public final <R> l flatMap(st.o oVar) {
        return flatMap(oVar, false, bufferSize(), bufferSize());
    }

    public final c flatMapCompletable(st.o oVar) {
        return flatMapCompletable(oVar, false, Integer.MAX_VALUE);
    }

    public final <U> l flatMapIterable(st.o oVar) {
        return flatMapIterable(oVar, bufferSize());
    }

    public final <R> l flatMapMaybe(st.o oVar) {
        return flatMapMaybe(oVar, false, Integer.MAX_VALUE);
    }

    public final <R> l flatMapSingle(st.o oVar) {
        return flatMapSingle(oVar, false, Integer.MAX_VALUE);
    }

    public final pt.c forEach(st.g gVar) {
        return subscribe(gVar);
    }

    public final pt.c forEachWhile(st.q qVar) {
        return forEachWhile(qVar, ut.m0.f88682e, ut.m0.f88680c);
    }

    public final <K> l groupBy(st.o oVar) {
        return groupBy(oVar, ut.m0.identity(), false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l groupJoin(tw.b bVar, st.o oVar, st.o oVar2, st.c cVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        ut.o0.requireNonNull(oVar, "leftEnd is null");
        ut.o0.requireNonNull(oVar2, "rightEnd is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return mu.a.onAssembly(new n5(this, bVar, oVar, oVar2, cVar));
    }

    public final l hide() {
        return mu.a.onAssembly(new p5(this));
    }

    public final c ignoreElements() {
        return mu.a.onAssembly(new t5(this));
    }

    public final n0<Boolean> isEmpty() {
        return all(ut.m0.alwaysFalse());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l join(tw.b bVar, st.o oVar, st.o oVar2, st.c cVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        ut.o0.requireNonNull(oVar, "leftEnd is null");
        ut.o0.requireNonNull(oVar2, "rightEnd is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return mu.a.onAssembly(new q6(this, bVar, oVar, oVar2, cVar));
    }

    public final n0<Object> last(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem");
        return mu.a.onAssembly(new v6(this, obj));
    }

    public final s lastElement() {
        return mu.a.onAssembly(new t6(this));
    }

    public final n0<Object> lastOrError() {
        return mu.a.onAssembly(new v6(this, null));
    }

    public final <R> l lift(p pVar) {
        ut.o0.requireNonNull(pVar, "lifter is null");
        return mu.a.onAssembly(new w6(this, pVar));
    }

    public final l limit(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new y6(this, j10));
        }
        throw new IllegalArgumentException(o2.m(j10, "count >= 0 required but it was "));
    }

    public final <R> l map(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new b7(this, oVar));
    }

    public final l materialize() {
        return mu.a.onAssembly(new g7(this));
    }

    public final l mergeWith(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return merge(this, bVar);
    }

    public final l observeOn(m0 m0Var) {
        return observeOn(m0Var, false, bufferSize());
    }

    public final <U> l ofType(Class<U> cls) {
        ut.o0.requireNonNull(cls, "clazz is null");
        return filter(ut.m0.isInstanceOf(cls)).cast(cls);
    }

    public final l onBackpressureBuffer() {
        return onBackpressureBuffer(bufferSize(), false, true);
    }

    public final l onBackpressureDrop() {
        return mu.a.onAssembly(new a8(this));
    }

    public final l onBackpressureLatest() {
        return mu.a.onAssembly(new e8(this));
    }

    public final l onErrorResumeNext(st.o oVar) {
        ut.o0.requireNonNull(oVar, "resumeFunction is null");
        return mu.a.onAssembly(new g8(this, oVar, false));
    }

    public final l onErrorReturn(st.o oVar) {
        ut.o0.requireNonNull(oVar, "valueSupplier is null");
        return mu.a.onAssembly(new i8(this, oVar));
    }

    public final l onErrorReturnItem(Object obj) {
        ut.o0.requireNonNull(obj, "item is null");
        return onErrorReturn(ut.m0.justFunction(obj));
    }

    public final l onExceptionResumeNext(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "next is null");
        return mu.a.onAssembly(new g8(this, ut.m0.justFunction(bVar), true));
    }

    public final l onTerminateDetach() {
        return mu.a.onAssembly(new y2(this));
    }

    public final lu.b parallel() {
        return lu.b.from(this);
    }

    public final rt.a publish() {
        return publish(bufferSize());
    }

    public final l rebatchRequests(int i10) {
        return observeOn(fu.n.f56055e, true, i10);
    }

    public final s reduce(st.c cVar) {
        ut.o0.requireNonNull(cVar, "reducer is null");
        return mu.a.onAssembly(new e9(this, cVar));
    }

    public final <R> n0<R> reduceWith(Callable<R> callable, st.c cVar) {
        ut.o0.requireNonNull(callable, "seedSupplier is null");
        ut.o0.requireNonNull(cVar, "reducer is null");
        return mu.a.onAssembly(new h9(this, callable, cVar));
    }

    public final l repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final l repeatUntil(st.e eVar) {
        ut.o0.requireNonNull(eVar, "stop is null");
        return mu.a.onAssembly(new o9(this, eVar));
    }

    public final l repeatWhen(st.o oVar) {
        ut.o0.requireNonNull(oVar, "handler is null");
        return mu.a.onAssembly(new s9(this, oVar));
    }

    public final rt.a replay() {
        return ia.createFrom(this);
    }

    public final l retry() {
        return retry(Long.MAX_VALUE, ut.m0.alwaysTrue());
    }

    public final l retryUntil(st.e eVar) {
        ut.o0.requireNonNull(eVar, "stop is null");
        return retry(Long.MAX_VALUE, ut.m0.predicateReverseFor(eVar));
    }

    public final l retryWhen(st.o oVar) {
        ut.o0.requireNonNull(oVar, "handler is null");
        return mu.a.onAssembly(new oa(this, oVar));
    }

    public final void safeSubscribe(tw.c cVar) {
        ut.o0.requireNonNull(cVar, "s is null");
        if (cVar instanceof qu.c) {
            subscribe((q) cVar);
        } else {
            subscribe((q) new qu.c(cVar));
        }
    }

    public final l sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, ou.j.computation());
    }

    public final l scan(st.c cVar) {
        ut.o0.requireNonNull(cVar, "accumulator is null");
        return mu.a.onAssembly(new bb(this, cVar));
    }

    public final <R> l scanWith(Callable<R> callable, st.c cVar) {
        ut.o0.requireNonNull(callable, "seedSupplier is null");
        ut.o0.requireNonNull(cVar, "accumulator is null");
        return mu.a.onAssembly(new db(this, callable, cVar));
    }

    public final l serialize() {
        return mu.a.onAssembly(new kb(this));
    }

    public final l share() {
        return publish().refCount();
    }

    public final n0<Object> single(Object obj) {
        ut.o0.requireNonNull(obj, "defaultItem is null");
        return mu.a.onAssembly(new qb(this, obj));
    }

    public final s singleElement() {
        return mu.a.onAssembly(new ob(this));
    }

    public final n0<Object> singleOrError() {
        return mu.a.onAssembly(new qb(this, null));
    }

    public final l skip(long j10) {
        return j10 <= 0 ? mu.a.onAssembly(this) : mu.a.onAssembly(new sb(this, j10));
    }

    public final l skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? mu.a.onAssembly(this) : mu.a.onAssembly(new ub(this, i10));
        }
        throw new IndexOutOfBoundsException(a.b.e(i10, "count >= 0 required but it was "));
    }

    public final <U> l skipUntil(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return mu.a.onAssembly(new zb(this, bVar));
    }

    public final l skipWhile(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new bc(this, qVar));
    }

    public final l sorted() {
        return toList().toFlowable().map(ut.m0.listSorter(ut.m0.naturalComparator())).flatMapIterable(ut.m0.identity());
    }

    public final l startWith(Iterable<Object> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final l startWithArray(Object... objArr) {
        l lVarFromArray = fromArray(objArr);
        return lVarFromArray == empty() ? mu.a.onAssembly(this) : concatArray(lVarFromArray, this);
    }

    public final pt.c subscribe() {
        return subscribe(ut.m0.emptyConsumer(), ut.m0.f88682e, ut.m0.f88680c, c6.f95256b);
    }

    public abstract void subscribeActual(tw.c cVar);

    public final l subscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return subscribeOn(m0Var, !(this instanceof f2));
    }

    public final <E extends tw.c> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    public final l switchIfEmpty(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return mu.a.onAssembly(new gc(this, bVar));
    }

    public final <R> l switchMap(st.o oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final c switchMapCompletable(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.p(this, oVar, false));
    }

    public final c switchMapCompletableDelayError(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.p(this, oVar, true));
    }

    public final <R> l switchMapDelayError(st.o oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final <R> l switchMapMaybe(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.s(this, oVar, false));
    }

    public final <R> l switchMapMaybeDelayError(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.s(this, oVar, true));
    }

    public final <R> l switchMapSingle(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.v(this, oVar, false));
    }

    public final <R> l switchMapSingleDelayError(st.o oVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        return mu.a.onAssembly(new au.v(this, oVar, true));
    }

    public final l take(long j10) {
        if (j10 >= 0) {
            return mu.a.onAssembly(new lc(this, j10));
        }
        throw new IllegalArgumentException(o2.m(j10, "count >= 0 required but it was "));
    }

    public final l takeLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? mu.a.onAssembly(new r5(this)) : i10 == 1 ? mu.a.onAssembly(new pc(this)) : mu.a.onAssembly(new nc(this, i10));
        }
        throw new IndexOutOfBoundsException(a.b.e(i10, "count >= 0 required but it was "));
    }

    public final l takeUntil(st.q qVar) {
        ut.o0.requireNonNull(qVar, "stopPredicate is null");
        return mu.a.onAssembly(new xc(this, qVar));
    }

    public final l takeWhile(st.q qVar) {
        ut.o0.requireNonNull(qVar, "predicate is null");
        return mu.a.onAssembly(new zc(this, qVar));
    }

    public final qu.f test() {
        qu.f fVar = new qu.f();
        subscribe((q) fVar);
        return fVar;
    }

    public final l throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, ou.j.computation());
    }

    public final l throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    public final l throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, ou.j.computation(), false);
    }

    public final l throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    public final l timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, ou.j.computation());
    }

    public final <V> l timeout(st.o oVar) {
        return d(null, oVar, null);
    }

    public final l timestamp() {
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

    public final Future<Object> toFuture() {
        return (Future) subscribeWith(new gu.j());
    }

    public final n0<List<Object>> toList() {
        return mu.a.onAssembly(new wd(this));
    }

    public final <K> n0<Map<K, Object>> toMap(st.o oVar) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        return collect(iu.o.asCallable(), ut.m0.toMapKeySelector(oVar));
    }

    public final <K> n0<Map<K, Collection<Object>>> toMultimap(st.o oVar) {
        return toMultimap(oVar, ut.m0.identity(), iu.o.asCallable(), iu.c.asFunction());
    }

    public final b0 toObservable() {
        return mu.a.onAssembly(new h4(this));
    }

    public final n0<List<Object>> toSortedList() {
        return toSortedList(ut.m0.naturalComparator());
    }

    public final l unsubscribeOn(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new zd(this, m0Var));
    }

    public final l window(long j10) {
        return window(j10, j10, bufferSize());
    }

    public final <U, R> l withLatestFrom(tw.b bVar, st.c cVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        ut.o0.requireNonNull(cVar, "combiner is null");
        return mu.a.onAssembly(new af(this, cVar, bVar));
    }

    public final <U, R> l zipWith(Iterable<U> iterable, st.c cVar) {
        ut.o0.requireNonNull(iterable, "other is null");
        ut.o0.requireNonNull(cVar, "zipper is null");
        return mu.a.onAssembly(new kf(this, iterable, cVar));
    }

    public static <T, R> l combineLatest(st.o oVar, tw.b... bVarArr) {
        return combineLatest(bVarArr, oVar, bufferSize());
    }

    public static <T, R> l combineLatestDelayError(st.o oVar, tw.b... bVarArr) {
        return combineLatestDelayError(bVarArr, oVar, bufferSize());
    }

    public static <T> l concatArrayEager(int i10, int i11, tw.b... bVarArr) {
        ut.o0.requireNonNull(bVarArr, "sources is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new l1(new u4(bVarArr), ut.m0.identity(), i10, i11, iu.k.f68411b));
    }

    public static <T> l concatArrayEagerDelayError(int i10, int i11, tw.b... bVarArr) {
        return fromArray(bVarArr).concatMapEagerDelayError(ut.m0.identity(), i10, i11, true);
    }

    public static <T> l concatEager(tw.b bVar, int i10, int i11) {
        ut.o0.requireNonNull(bVar, "sources is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new m1(bVar, ut.m0.identity(), i10, i11, iu.k.f68411b));
    }

    public static l interval(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new m6(Math.max(0L, j10), Math.max(0L, j11), timeUnit, m0Var));
    }

    public static l intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, m0 m0Var) {
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
        return mu.a.onAssembly(new o6(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, m0Var));
    }

    public static <T> l merge(Iterable<? extends tw.b> iterable) {
        return fromIterable(iterable).flatMap(ut.m0.identity());
    }

    public static <T> l mergeArray(tw.b... bVarArr) {
        return fromArray(bVarArr).flatMap(ut.m0.identity(), bVarArr.length);
    }

    public static <T> l mergeArrayDelayError(tw.b... bVarArr) {
        return fromArray(bVarArr).flatMap(ut.m0.identity(), true, bVarArr.length);
    }

    public static <T> l mergeDelayError(Iterable<? extends tw.b> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), true, i10, i11);
    }

    public static <T> n0<Boolean> sequenceEqual(tw.b bVar, tw.b bVar2, st.d dVar) {
        return sequenceEqual(bVar, bVar2, dVar, bufferSize());
    }

    public static <T> l switchOnNext(tw.b bVar) {
        return fromPublisher(bVar).switchMap(ut.m0.identity());
    }

    public static <T> l switchOnNextDelayError(tw.b bVar, int i10) {
        return fromPublisher(bVar).switchMapDelayError(ut.m0.identity(), i10);
    }

    public static l timer(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new sd(Math.max(0L, j10), timeUnit, m0Var));
    }

    public static <T, D> l using(Callable<? extends D> callable, st.o oVar, st.g gVar, boolean z10) {
        ut.o0.requireNonNull(callable, "resourceSupplier is null");
        ut.o0.requireNonNull(oVar, "sourceSupplier is null");
        ut.o0.requireNonNull(gVar, "resourceDisposer is null");
        return mu.a.onAssembly(new be(callable, oVar, gVar, z10));
    }

    public final Iterable<Object> blockingIterable(int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        return new yt.c(this, i10);
    }

    public final Object blockingSingle(Object obj) {
        return single(obj).blockingGet();
    }

    public final void blockingSubscribe(st.g gVar) {
        yt.x.subscribe(this, gVar, ut.m0.f88682e, ut.m0.f88680c);
    }

    public final l buffer(int i10, int i11) {
        return buffer(i10, i11, iu.c.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l concatMap(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new j1(this, oVar, i10, iu.k.f68411b));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : za.scalarXMap(objCall, oVar);
    }

    public final c concatMapCompletable(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.g(this, oVar, iu.k.f68411b, i10));
    }

    public final c concatMapCompletableDelayError(st.o oVar, boolean z10) {
        return concatMapCompletableDelayError(oVar, z10, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l concatMapDelayError(st.o oVar, int i10, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        if (!(this instanceof vt.m)) {
            return mu.a.onAssembly(new j1(this, oVar, i10, z10 ? iu.k.f68413e : iu.k.f68412c));
        }
        Object objCall = ((vt.m) this).call();
        return objCall == null ? empty() : za.scalarXMap(objCall, oVar);
    }

    public final <R> l concatMapEager(st.o oVar, int i10, int i11) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new l1(this, oVar, i10, i11, iu.k.f68411b));
    }

    public final <R> l concatMapEagerDelayError(st.o oVar, int i10, int i11, boolean z10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new l1(this, oVar, i10, i11, z10 ? iu.k.f68413e : iu.k.f68412c));
    }

    public final <U> l concatMapIterable(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new r4(this, oVar, i10));
    }

    public final <R> l concatMapMaybe(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.j(this, oVar, iu.k.f68411b, i10));
    }

    public final <R> l concatMapMaybeDelayError(st.o oVar, boolean z10) {
        return concatMapMaybeDelayError(oVar, z10, 2);
    }

    public final <R> l concatMapSingle(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.m(this, oVar, iu.k.f68411b, i10));
    }

    public final <R> l concatMapSingleDelayError(st.o oVar, boolean z10) {
        return concatMapSingleDelayError(oVar, z10, 2);
    }

    public final <R> l dematerialize(st.o oVar) {
        ut.o0.requireNonNull(oVar, "selector is null");
        return mu.a.onAssembly(new w2(this, oVar));
    }

    public final <K> l distinct(st.o oVar) {
        return distinct(oVar, ut.m0.createHashSet());
    }

    public final <K> l distinctUntilChanged(st.o oVar) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        return mu.a.onAssembly(new d3(this, oVar, ut.o0.equalsPredicate()));
    }

    public final <R> l flatMap(st.o oVar, boolean z10) {
        return flatMap(oVar, z10, bufferSize(), bufferSize());
    }

    public final c flatMapCompletable(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new i4(this, oVar, z10, i10));
    }

    public final <U> l flatMapIterable(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new r4(this, oVar, i10));
    }

    public final <R> l flatMapMaybe(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new l4(this, oVar, z10, i10));
    }

    public final <R> l flatMapSingle(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        return mu.a.onAssembly(new p4(this, oVar, z10, i10));
    }

    public final pt.c forEachWhile(st.q qVar, st.g gVar) {
        return forEachWhile(qVar, gVar, ut.m0.f88680c);
    }

    public final <K> l groupBy(st.o oVar, boolean z10) {
        return groupBy(oVar, ut.m0.identity(), z10, bufferSize());
    }

    public final l observeOn(m0 m0Var, boolean z10) {
        return observeOn(m0Var, z10, bufferSize());
    }

    public final l onBackpressureBuffer(boolean z10) {
        return onBackpressureBuffer(bufferSize(), z10, true);
    }

    public final l onBackpressureDrop(st.g gVar) {
        ut.o0.requireNonNull(gVar, "onDrop is null");
        return mu.a.onAssembly(new a8(this, gVar));
    }

    public final lu.b parallel(int i10) {
        ut.o0.verifyPositive(i10, "parallelism");
        return lu.b.from(this, i10);
    }

    public final <R> l publish(st.o oVar) {
        return publish(oVar, bufferSize());
    }

    public final l repeat(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? empty() : mu.a.onAssembly(new m9(this, j10));
        }
        throw new IllegalArgumentException(o2.m(j10, "times >= 0 required but it was "));
    }

    public final <R> l replay(st.o oVar) {
        ut.o0.requireNonNull(oVar, "selector is null");
        return ia.multicastSelector(k6.replayCallable(this), oVar);
    }

    public final l retry(st.d dVar) {
        ut.o0.requireNonNull(dVar, "predicate is null");
        return mu.a.onAssembly(new ka(this, dVar));
    }

    public final l sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, ou.j.computation(), z10);
    }

    public final l sorted(Comparator<Object> comparator) {
        ut.o0.requireNonNull(comparator, "sortFunction");
        return toList().toFlowable().map(ut.m0.listSorter(comparator)).flatMapIterable(ut.m0.identity());
    }

    public final l startWith(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return concatArray(bVar, this);
    }

    public final pt.c subscribe(st.g gVar) {
        return subscribe(gVar, ut.m0.f88682e, ut.m0.f88680c, c6.f95256b);
    }

    public final <R> l switchMap(st.o oVar, int i10) {
        return b(oVar, i10, false);
    }

    public final <R> l switchMapDelayError(st.o oVar, int i10) {
        return b(oVar, i10, true);
    }

    public final l throttleFirst(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new bd(this, j10, timeUnit, m0Var));
    }

    public final l throttleLast(long j10, TimeUnit timeUnit, m0 m0Var) {
        return sample(j10, timeUnit, m0Var);
    }

    public final l throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, ou.j.computation(), z10);
    }

    public final l throttleWithTimeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return debounce(j10, timeUnit, m0Var);
    }

    public final l timeInterval(m0 m0Var) {
        return timeInterval(TimeUnit.MILLISECONDS, m0Var);
    }

    public final <V> l timeout(st.o oVar, l lVar) {
        ut.o0.requireNonNull(lVar, "other is null");
        return d(null, oVar, lVar);
    }

    public final l timestamp(m0 m0Var) {
        return timestamp(TimeUnit.MILLISECONDS, m0Var);
    }

    public final n0<List<Object>> toList(int i10) {
        ut.o0.verifyPositive(i10, "capacityHint");
        return mu.a.onAssembly(new wd(this, ut.m0.createArrayList(i10)));
    }

    public final n0<List<Object>> toSortedList(Comparator<Object> comparator) {
        ut.o0.requireNonNull(comparator, "comparator is null");
        return toList().map(ut.m0.listSorter(comparator));
    }

    public final l window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    public static <T, R> l combineLatest(tw.b[] bVarArr, st.o oVar, int i10) {
        ut.o0.requireNonNull(bVarArr, "sources is null");
        if (bVarArr.length == 0) {
            return empty();
        }
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new a1(bVarArr, oVar, i10, false));
    }

    public static <T, R> l combineLatestDelayError(st.o oVar, int i10, tw.b... bVarArr) {
        return combineLatestDelayError(bVarArr, oVar, i10);
    }

    public static <T> l concat(tw.b bVar) {
        return concat(bVar, bufferSize());
    }

    public static <T> l concatDelayError(tw.b bVar) {
        return concatDelayError(bVar, bufferSize(), true);
    }

    public static <T> l error(Throwable th2) {
        ut.o0.requireNonNull(th2, "throwable is null");
        return error((Callable<? extends Throwable>) ut.m0.justCallable(th2));
    }

    public static <T> l fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        ut.o0.requireNonNull(future, "future is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        return mu.a.onAssembly(new w4(future, j10, timeUnit));
    }

    public static <T> l just(T t10, T t11) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        return fromArray(t10, t11);
    }

    public static <T> l merge(Iterable<? extends tw.b> iterable, int i10) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), i10);
    }

    public static <T> l mergeDelayError(Iterable<? extends tw.b> iterable, int i10) {
        return fromIterable(iterable).flatMap(ut.m0.identity(), true, i10);
    }

    public static <T> n0<Boolean> sequenceEqual(tw.b bVar, tw.b bVar2, st.d dVar, int i10) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(dVar, "isEqual is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new jb(bVar, bVar2, dVar, i10));
    }

    public final void blockingSubscribe(st.g gVar, int i10) {
        yt.x.subscribe(this, gVar, ut.m0.f88682e, ut.m0.f88680c, i10);
    }

    public final <U extends Collection<Object>> l buffer(int i10, int i11, Callable<U> callable) {
        ut.o0.verifyPositive(i10, "count");
        ut.o0.verifyPositive(i11, "skip");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new yt.b0(this, i10, i11, callable));
    }

    public final c concatMapCompletableDelayError(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.g(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10));
    }

    public final <R> l concatMapMaybeDelayError(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.j(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10));
    }

    public final <R> l concatMapSingleDelayError(st.o oVar, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new au.m(this, oVar, z10 ? iu.k.f68413e : iu.k.f68412c, i10));
    }

    public final l concatWith(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return mu.a.onAssembly(new t1(this, t0Var));
    }

    public final l debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, ou.j.computation());
    }

    public final l delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, ou.j.computation(), false);
    }

    public final l delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, ou.j.computation());
    }

    public final <K> l distinct(st.o oVar, Callable<? extends Collection<? super K>> callable) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(callable, "collectionSupplier is null");
        return mu.a.onAssembly(new a3(this, oVar, callable));
    }

    public final <R> l flatMap(st.o oVar, int i10) {
        return flatMap(oVar, false, i10, bufferSize());
    }

    public final pt.c forEachWhile(st.q qVar, st.g gVar, st.a aVar) {
        ut.o0.requireNonNull(qVar, "onNext is null");
        ut.o0.requireNonNull(gVar, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        gu.i iVar = new gu.i(qVar, gVar, aVar);
        subscribe((q) iVar);
        return iVar;
    }

    public final <K, V> l groupBy(st.o oVar, st.o oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final l mergeWith(t0 t0Var) {
        ut.o0.requireNonNull(t0Var, "other is null");
        return mu.a.onAssembly(new p7(this, t0Var));
    }

    public final l observeOn(m0 m0Var, boolean z10, int i10) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new u7(this, m0Var, z10, i10));
    }

    public final l onBackpressureBuffer(int i10) {
        return onBackpressureBuffer(i10, false, false);
    }

    public final l onErrorResumeNext(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "next is null");
        return onErrorResumeNext(ut.m0.justFunction(bVar));
    }

    public final <R> l publish(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new u8(this, oVar, i10, false));
    }

    public final <R> n0<R> reduce(R r10, st.c cVar) {
        ut.o0.requireNonNull(r10, "seed is null");
        ut.o0.requireNonNull(cVar, "reducer is null");
        return mu.a.onAssembly(new g9(this, r10, cVar));
    }

    public final l sample(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new xa(this, j10, timeUnit, m0Var, false));
    }

    public final <R> l scan(R r10, st.c cVar) {
        ut.o0.requireNonNull(r10, "initialValue is null");
        return scanWith(ut.m0.justCallable(r10), cVar);
    }

    public final l skip(long j10, TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2) {
        return subscribe(gVar, gVar2, ut.m0.f88680c, c6.f95256b);
    }

    public final l subscribeOn(m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new ec(this, m0Var, z10));
    }

    public final <U> l takeUntil(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return mu.a.onAssembly(new vc(this, bVar));
    }

    public final qu.f test(long j10) {
        qu.f fVar = new qu.f(j10);
        subscribe((q) fVar);
        return fVar;
    }

    public final l throttleLatest(long j10, TimeUnit timeUnit, m0 m0Var) {
        return throttleLatest(j10, timeUnit, m0Var, false);
    }

    public final l timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, ou.j.computation());
    }

    public final l timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, ou.j.computation());
    }

    public final <K, V> n0<Map<K, V>> toMap(st.o oVar, st.o oVar2) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        return collect(iu.o.asCallable(), ut.m0.toMapKeyValueSelector(oVar, oVar2));
    }

    public final l window(long j10, long j11, int i10) {
        ut.o0.verifyPositive(j11, "skip");
        ut.o0.verifyPositive(j10, "count");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new fe(this, j10, j11, i10));
    }

    public static <T, R> l combineLatestDelayError(tw.b[] bVarArr, st.o oVar, int i10) {
        ut.o0.requireNonNull(bVarArr, "sources is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        if (bVarArr.length == 0) {
            return empty();
        }
        return mu.a.onAssembly(new a1(bVarArr, oVar, i10, true));
    }

    public static <T> l concat(tw.b bVar, int i10) {
        return fromPublisher(bVar).concatMap(ut.m0.identity(), i10);
    }

    public static <T> l concatDelayError(tw.b bVar, int i10, boolean z10) {
        return fromPublisher(bVar).concatMapDelayError(ut.m0.identity(), i10, z10);
    }

    public static <T> l merge(tw.b bVar) {
        return merge(bVar, bufferSize());
    }

    public static <T> l mergeDelayError(tw.b bVar) {
        return mergeDelayError(bVar, bufferSize());
    }

    public static <T, R> l zip(tw.b bVar, st.o oVar) {
        ut.o0.requireNonNull(oVar, "zipper is null");
        return fromPublisher(bVar).toList().flatMapPublisher(k6.zipIterable(oVar));
    }

    public final void blockingSubscribe(st.g gVar, st.g gVar2) {
        yt.x.subscribe(this, gVar, gVar2, ut.m0.f88680c);
    }

    public final l debounce(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new l2(this, j10, timeUnit, m0Var));
    }

    public final l delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, ou.j.computation(), z10);
    }

    public final l delaySubscription(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delaySubscription(timer(j10, timeUnit, m0Var));
    }

    public final l distinctUntilChanged(st.d dVar) {
        ut.o0.requireNonNull(dVar, "comparer is null");
        return mu.a.onAssembly(new d3(this, ut.m0.identity(), dVar));
    }

    public final <R> l flatMap(st.o oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, bufferSize());
    }

    public final <K, V> l groupBy(st.o oVar, st.o oVar2, boolean z10) {
        return groupBy(oVar, oVar2, z10, bufferSize());
    }

    public final l onBackpressureBuffer(int i10, boolean z10) {
        return onBackpressureBuffer(i10, z10, false);
    }

    public final lu.b parallel(int i10, int i11) {
        ut.o0.verifyPositive(i10, "parallelism");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return lu.b.from(this, i10, i11);
    }

    public final <R> l replay(st.o oVar, int i10) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return ia.multicastSelector(k6.replayCallable(this, i10), oVar);
    }

    public final l retry(long j10) {
        return retry(j10, ut.m0.alwaysTrue());
    }

    public final l skip(long j10, TimeUnit timeUnit, m0 m0Var) {
        return skipUntil(timer(j10, timeUnit, m0Var));
    }

    public final l startWith(Object obj) {
        ut.o0.requireNonNull(obj, "value is null");
        return concatArray(just(obj), this);
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2, st.a aVar) {
        return subscribe(gVar, gVar2, aVar, c6.f95256b);
    }

    public final l throttleLatest(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new dd(this, j10, timeUnit, m0Var, z10));
    }

    public final l timeInterval(TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new fd(this, timeUnit, m0Var));
    }

    public final l timeout(long j10, TimeUnit timeUnit) {
        return c(j10, timeUnit, ou.j.computation(), null);
    }

    public final l timestamp(TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return map(ut.m0.timestampWith(timeUnit, m0Var));
    }

    public final <U extends Collection<Object>> n0<U> toList(Callable<U> callable) {
        ut.o0.requireNonNull(callable, "collectionSupplier is null");
        return mu.a.onAssembly(new wd(this, callable));
    }

    public final n0<List<Object>> toSortedList(Comparator<Object> comparator, int i10) {
        ut.o0.requireNonNull(comparator, "comparator is null");
        return toList(i10).map(ut.m0.listSorter(comparator));
    }

    public final <T1, T2, R> l withLatestFrom(tw.b bVar, tw.b bVar2, st.h hVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return withLatestFrom(new tw.b[]{bVar, bVar2}, ut.m0.toFunction(hVar));
    }

    public final <U, R> l zipWith(tw.b bVar, st.c cVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return zip(this, bVar, cVar);
    }

    public static <T> l concat(tw.b bVar, tw.b bVar2) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return concatArray(bVar, bVar2);
    }

    public static l interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, ou.j.computation());
    }

    public static <T> l merge(tw.b bVar, int i10) {
        return fromPublisher(bVar).flatMap(ut.m0.identity(), i10);
    }

    public static <T> l mergeDelayError(tw.b bVar, int i10) {
        return fromPublisher(bVar).flatMap(ut.m0.identity(), true, i10);
    }

    public final Object blockingFirst(Object obj) throws InterruptedException {
        gu.d dVar = new gu.d();
        subscribe((q) dVar);
        Object objBlockingGet = dVar.blockingGet();
        return objBlockingGet != null ? objBlockingGet : obj;
    }

    public final Object blockingLast(Object obj) throws InterruptedException {
        gu.e eVar = new gu.e();
        subscribe((q) eVar);
        Object objBlockingGet = eVar.blockingGet();
        return objBlockingGet != null ? objBlockingGet : obj;
    }

    public final void blockingSubscribe(st.g gVar, st.g gVar2, int i10) {
        yt.x.subscribe(this, gVar, gVar2, ut.m0.f88680c, i10);
    }

    public final l concatWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return mu.a.onAssembly(new r1(this, yVar));
    }

    public final l delay(long j10, TimeUnit timeUnit, m0 m0Var) {
        return delay(j10, timeUnit, m0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l flatMap(st.o oVar, boolean z10, int i10, int i11) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, "bufferSize");
        if (this instanceof vt.m) {
            Object objCall = ((vt.m) this).call();
            if (objCall == null) {
                return empty();
            }
            return za.scalarXMap(objCall, oVar);
        }
        return mu.a.onAssembly(new c4(this, oVar, z10, i10, i11));
    }

    public final <U, V> l flatMapIterable(st.o oVar, st.c cVar) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return flatMap(k6.flatMapIntoIterable(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final <K, V> l groupBy(st.o oVar, st.o oVar2, boolean z10, int i10) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new g5(this, oVar, oVar2, i10, z10, null));
    }

    public final l mergeWith(y yVar) {
        ut.o0.requireNonNull(yVar, "other is null");
        return mu.a.onAssembly(new m7(this, yVar));
    }

    public final l onBackpressureBuffer(int i10, boolean z10, boolean z11) {
        ut.o0.verifyPositive(i10, "capacity");
        return mu.a.onAssembly(new w7(this, i10, z11, z10, ut.m0.f88680c));
    }

    public final l retry(long j10, st.q qVar) {
        if (j10 >= 0) {
            ut.o0.requireNonNull(qVar, "predicate is null");
            return mu.a.onAssembly(new ma(this, j10, qVar));
        }
        throw new IllegalArgumentException(o2.m(j10, "times >= 0 required but it was "));
    }

    public final pt.c subscribe(st.g gVar, st.g gVar2, st.a aVar, st.g gVar3) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o0.requireNonNull(gVar3, "onSubscribe is null");
        gu.m mVar = new gu.m(gVar, gVar2, aVar, gVar3);
        subscribe((q) mVar);
        return mVar;
    }

    public final qu.f test(long j10, boolean z10) {
        qu.f fVar = new qu.f(j10);
        if (z10) {
            fVar.cancel();
        }
        subscribe((q) fVar);
        return fVar;
    }

    public final l timeout(long j10, TimeUnit timeUnit, tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return c(j10, timeUnit, ou.j.computation(), bVar);
    }

    public final <K, V> n0<Map<K, Collection<V>>> toMultimap(st.o oVar, st.o oVar2) {
        return toMultimap(oVar, oVar2, iu.o.asCallable(), iu.c.asFunction());
    }

    public static <T> l concatEager(Iterable<? extends tw.b> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> l fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(m0Var);
    }

    public static <T, S> l generate(Callable<S> callable, st.b bVar) {
        ut.o0.requireNonNull(bVar, "generator is null");
        return generate(callable, k6.simpleBiGenerator(bVar), ut.m0.emptyConsumer());
    }

    public static l interval(long j10, TimeUnit timeUnit, m0 m0Var) {
        return interval(j10, j10, timeUnit, m0Var);
    }

    public static <T> l just(T t10, T t11, T t12) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        return fromArray(t10, t11, t12);
    }

    public static <T> l merge(tw.b bVar, tw.b bVar2) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return fromArray(bVar, bVar2).flatMap(ut.m0.identity(), false, 2);
    }

    public static <T> l mergeDelayError(tw.b bVar, tw.b bVar2) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return fromArray(bVar, bVar2).flatMap(ut.m0.identity(), true, 2);
    }

    public static <T1, T2, R> l zip(tw.b bVar, tw.b bVar2, st.c cVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), false, bufferSize(), bVar, bVar2);
    }

    public final void blockingSubscribe(st.g gVar, st.g gVar2, st.a aVar) {
        yt.x.subscribe(this, gVar, gVar2, aVar);
    }

    public final l delay(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new r2(this, Math.max(0L, j10), timeUnit, m0Var, z10));
    }

    public final l doOnEach(tw.c cVar) {
        ut.o0.requireNonNull(cVar, "subscriber is null");
        return a(k6.subscriberOnNext(cVar), k6.subscriberOnError(cVar), k6.subscriberOnComplete(cVar), ut.m0.f88680c);
    }

    public final rt.a publish(int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        return m8.create(this, i10);
    }

    public final l sample(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new xa(this, j10, timeUnit, m0Var, z10));
    }

    public final <K, V> n0<Map<K, V>> toMap(st.o oVar, st.o oVar2, Callable<? extends Map<K, V>> callable) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        return collect(callable, ut.m0.toMapKeyValueSelector(oVar, oVar2));
    }

    public final n0<List<Object>> toSortedList(int i10) {
        return toSortedList(ut.m0.naturalComparator(), i10);
    }

    public final <U, R> l zipWith(tw.b bVar, st.c cVar, boolean z10) {
        return zip(this, bVar, cVar, z10);
    }

    public static <T> l concatEager(Iterable<? extends tw.b> iterable, int i10, int i11) {
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new l1(new z4(iterable), ut.m0.identity(), i10, i11, iu.k.f68411b));
    }

    public final void blockingSubscribe(st.g gVar, st.g gVar2, st.a aVar, int i10) {
        yt.x.subscribe(this, gVar, gVar2, aVar, i10);
    }

    public final <U extends Collection<Object>> l buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    public final l concatWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new p1(this, iVar));
    }

    public final l mergeWith(i iVar) {
        ut.o0.requireNonNull(iVar, "other is null");
        return mu.a.onAssembly(new j7(this, iVar));
    }

    public final l onBackpressureBuffer(int i10, boolean z10, boolean z11, st.a aVar) {
        ut.o0.requireNonNull(aVar, "onOverflow is null");
        ut.o0.verifyPositive(i10, "capacity");
        return mu.a.onAssembly(new w7(this, i10, z11, z10, aVar));
    }

    public final <R> l replay(st.o oVar, int i10, long j10, TimeUnit timeUnit) {
        return replay(oVar, i10, j10, timeUnit, ou.j.computation());
    }

    public final l timeout(long j10, TimeUnit timeUnit, m0 m0Var, tw.b bVar) {
        ut.o0.requireNonNull(bVar, "other is null");
        return c(j10, timeUnit, m0Var, bVar);
    }

    public final l window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, ou.j.computation(), bufferSize());
    }

    public final <U, R> l zipWith(tw.b bVar, st.c cVar, boolean z10, int i10) {
        return zip(this, bVar, cVar, z10, i10);
    }

    public static <T> l concat(tw.b bVar, tw.b bVar2, tw.b bVar3) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        return concatArray(bVar, bVar2, bVar3);
    }

    public static <T> l fromFuture(Future<? extends T> future, m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return fromFuture(future).subscribeOn(m0Var);
    }

    public static <T> n0<Boolean> sequenceEqual(tw.b bVar, tw.b bVar2, int i10) {
        return sequenceEqual(bVar, bVar2, ut.o0.equalsPredicate(), i10);
    }

    public final void blockingSubscribe(tw.c cVar) {
        yt.x.subscribe(this, cVar);
    }

    public final l buffer(long j10, long j11, TimeUnit timeUnit) {
        return buffer(j10, j11, timeUnit, ou.j.computation(), iu.c.asCallable());
    }

    public final <U, V> l flatMapIterable(st.o oVar, st.c cVar, int i10) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.requireNonNull(cVar, "resultSelector is null");
        return flatMap(k6.flatMapIntoIterable(oVar), cVar, false, bufferSize(), i10);
    }

    public final <R> l replay(st.o oVar, int i10, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return ia.multicastSelector(k6.replayCallable(this, i10, j10, timeUnit, m0Var), oVar);
    }

    public final <K, V> n0<Map<K, Collection<V>>> toMultimap(st.o oVar, st.o oVar2, Callable<? extends Map<K, Collection<V>>> callable, st.o oVar3) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        ut.o0.requireNonNull(callable, "mapSupplier is null");
        ut.o0.requireNonNull(oVar3, "collectionFactory is null");
        return collect(callable, ut.m0.toMultimapKeyValueSelector(oVar, oVar2, oVar3));
    }

    public final l window(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        return window(j10, j11, timeUnit, m0Var, bufferSize());
    }

    public final <T1, T2, T3, R> l withLatestFrom(tw.b bVar, tw.b bVar2, tw.b bVar3, st.i iVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        return withLatestFrom(new tw.b[]{bVar, bVar2, bVar3}, ut.m0.toFunction(iVar));
    }

    public static <T, R> l combineLatest(Iterable<? extends tw.b> iterable, st.o oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T> l merge(tw.b bVar, tw.b bVar2, tw.b bVar3) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        return fromArray(bVar, bVar2, bVar3).flatMap(ut.m0.identity(), false, 3);
    }

    public static <T> l mergeDelayError(tw.b bVar, tw.b bVar2, tw.b bVar3) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        return fromArray(bVar, bVar2, bVar3).flatMap(ut.m0.identity(), true, 3);
    }

    public static <T1, T2, R> l zip(tw.b bVar, tw.b bVar2, st.c cVar, boolean z10) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), z10, bufferSize(), bVar, bVar2);
    }

    public final l buffer(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        return buffer(j10, j11, timeUnit, m0Var, iu.c.asCallable());
    }

    public final <U, V> l delay(tw.b bVar, st.o oVar) {
        return delaySubscription(bVar).delay(oVar);
    }

    public final n0<Object> elementAt(long j10, Object obj) {
        if (j10 >= 0) {
            ut.o0.requireNonNull(obj, "defaultItem is null");
            return mu.a.onAssembly(new u3(this, j10, obj));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "index >= 0 required but it was "));
    }

    public final <K, V> l groupBy(st.o oVar, st.o oVar2, boolean z10, int i10, st.o oVar3) {
        ut.o0.requireNonNull(oVar, "keySelector is null");
        ut.o0.requireNonNull(oVar2, "valueSelector is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(oVar3, "evictingMapFactory is null");
        return mu.a.onAssembly(new g5(this, oVar, oVar2, i10, z10, oVar3));
    }

    public final <U> l sample(tw.b bVar) {
        ut.o0.requireNonNull(bVar, "sampler is null");
        return mu.a.onAssembly(new ta(this, bVar, false));
    }

    public final l take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    public final l timeout(long j10, TimeUnit timeUnit, m0 m0Var) {
        return c(j10, timeUnit, m0Var, null);
    }

    public final l window(long j10, long j11, TimeUnit timeUnit, m0 m0Var, int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.verifyPositive(j10, "timespan");
        ut.o0.verifyPositive(j11, "timeskip");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        return mu.a.onAssembly(new xe(this, j10, j11, timeUnit, m0Var, Long.MAX_VALUE, i10, false));
    }

    public static <T, R> l combineLatest(Iterable<? extends tw.b> iterable, st.o oVar, int i10) {
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new a1(iterable, oVar, i10, false));
    }

    public static <T, R> l combineLatestDelayError(Iterable<? extends tw.b> iterable, st.o oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T, S> l generate(Callable<S> callable, st.b bVar, st.g gVar) {
        ut.o0.requireNonNull(bVar, "generator is null");
        return generate(callable, k6.simpleBiGenerator(bVar), gVar);
    }

    public static <T> l just(T t10, T t11, T t12, T t13) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        return fromArray(t10, t11, t12, t13);
    }

    public final <U extends Collection<Object>> l buffer(long j10, long j11, TimeUnit timeUnit, m0 m0Var, Callable<U> callable) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new yt.q0(this, j10, j11, timeUnit, m0Var, callable, Integer.MAX_VALUE, false));
    }

    public final l onBackpressureBuffer(int i10, st.a aVar) {
        return onBackpressureBuffer(i10, false, false, aVar);
    }

    public final l skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, ou.j.computation(), false, bufferSize());
    }

    public final l take(long j10, TimeUnit timeUnit, m0 m0Var) {
        return takeUntil(timer(j10, timeUnit, m0Var));
    }

    public final <U, V> l timeout(tw.b bVar, st.o oVar) {
        ut.o0.requireNonNull(bVar, "firstTimeoutIndicator is null");
        return d(bVar, oVar, null);
    }

    public static <T, R> l combineLatestDelayError(Iterable<? extends tw.b> iterable, st.o oVar, int i10) {
        ut.o0.requireNonNull(iterable, "sources is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new a1(iterable, oVar, i10, true));
    }

    public final l onBackpressureBuffer(long j10, st.a aVar, a aVar2) {
        ut.o0.requireNonNull(aVar2, "overflowStrategy is null");
        ut.o0.verifyPositive(j10, "capacity");
        return mu.a.onAssembly(new y7(this, j10, aVar, aVar2));
    }

    public final <U> l sample(tw.b bVar, boolean z10) {
        ut.o0.requireNonNull(bVar, "sampler is null");
        return mu.a.onAssembly(new ta(this, bVar, z10));
    }

    public final l skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, ou.j.computation(), z10, bufferSize());
    }

    @Override // tw.b
    public final void subscribe(tw.c cVar) {
        if (cVar instanceof q) {
            subscribe((q) cVar);
        } else {
            ut.o0.requireNonNull(cVar, "s is null");
            subscribe((q) new gu.p(cVar));
        }
    }

    public final l takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, ou.j.computation(), false, bufferSize());
    }

    public static <T> l concat(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        return concatArray(bVar, bVar2, bVar3, bVar4);
    }

    public static <T, S> l generate(Callable<S> callable, st.c cVar) {
        return generate(callable, cVar, ut.m0.emptyConsumer());
    }

    public static <T1, T2, R> l zip(tw.b bVar, tw.b bVar2, st.c cVar, boolean z10, int i10) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return zipArray(ut.m0.toFunction(cVar), z10, i10, bVar, bVar2);
    }

    public final l skipLast(long j10, TimeUnit timeUnit, m0 m0Var) {
        return skipLast(j10, timeUnit, m0Var, false, bufferSize());
    }

    public final l takeLast(long j10, long j11, TimeUnit timeUnit, m0 m0Var) {
        return takeLast(j10, j11, timeUnit, m0Var, false, bufferSize());
    }

    public final <U, V> l timeout(tw.b bVar, st.o oVar, tw.b bVar2) {
        ut.o0.requireNonNull(bVar, "firstTimeoutSelector is null");
        ut.o0.requireNonNull(bVar2, "other is null");
        return d(bVar, oVar, bVar2);
    }

    public static <T, S> l generate(Callable<S> callable, st.c cVar, st.g gVar) {
        ut.o0.requireNonNull(callable, "initialState is null");
        ut.o0.requireNonNull(cVar, "generator is null");
        ut.o0.requireNonNull(gVar, "disposeState is null");
        return mu.a.onAssembly(new e5(callable, cVar, gVar));
    }

    public static <T> l merge(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        return fromArray(bVar, bVar2, bVar3, bVar4).flatMap(ut.m0.identity(), false, 4);
    }

    public static <T> l mergeDelayError(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        return fromArray(bVar, bVar2, bVar3, bVar4).flatMap(ut.m0.identity(), true, 4);
    }

    public final <R> l flatMap(st.o oVar, st.o oVar2, Callable<? extends tw.b> callable) {
        ut.o0.requireNonNull(oVar, "onNextMapper is null");
        ut.o0.requireNonNull(oVar2, "onErrorMapper is null");
        ut.o0.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new d7(this, oVar, oVar2, callable));
    }

    public final l skipLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        return skipLast(j10, timeUnit, m0Var, z10, bufferSize());
    }

    public final l takeLast(long j10, long j11, TimeUnit timeUnit, m0 m0Var, boolean z10, int i10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        if (j10 >= 0) {
            return mu.a.onAssembly(new rc(this, j10, j11, timeUnit, m0Var, i10, z10));
        }
        throw new IndexOutOfBoundsException(o2.m(j10, "count >= 0 required but it was "));
    }

    public final <K, V> n0<Map<K, Collection<V>>> toMultimap(st.o oVar, st.o oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, iu.c.asFunction());
    }

    public final <T1, T2, T3, T4, R> l withLatestFrom(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, st.j jVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        return withLatestFrom(new tw.b[]{bVar, bVar2, bVar3, bVar4}, ut.m0.toFunction(jVar));
    }

    public static <T1, T2, R> l combineLatest(tw.b bVar, tw.b bVar2, st.c cVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        return combineLatest(ut.m0.toFunction(cVar), bVar, bVar2);
    }

    public final l buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, ou.j.computation(), Integer.MAX_VALUE);
    }

    public final <R> l replay(st.o oVar, int i10, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return ia.multicastSelector(k6.replayCallable(this, i10), k6.replayFunction(oVar, m0Var));
    }

    public final l retry(st.q qVar) {
        return retry(Long.MAX_VALUE, qVar);
    }

    public final l skipLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10, int i10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new wb(this, j10, timeUnit, m0Var, i10 << 1, z10));
    }

    public static <T> l just(T t10, T t11, T t12, T t13, T t14) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        return fromArray(t10, t11, t12, t13, t14);
    }

    public static <T1, T2, T3, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, st.h hVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        return zipArray(ut.m0.toFunction(hVar), false, bufferSize(), bVar, bVar2, bVar3);
    }

    public final l buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, ou.j.computation(), i10);
    }

    public final void subscribe(q qVar) {
        ut.o0.requireNonNull(qVar, "s is null");
        try {
            tw.c cVarOnSubscribe = mu.a.onSubscribe(this, qVar);
            ut.o0.requireNonNull(cVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(cVarOnSubscribe);
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

    public final l window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, ou.j.computation(), Long.MAX_VALUE, false);
    }

    public final l buffer(long j10, TimeUnit timeUnit, m0 m0Var, int i10) {
        return buffer(j10, timeUnit, m0Var, i10, iu.c.asCallable(), false);
    }

    public final l window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, ou.j.computation(), j11, false);
    }

    public final <U extends Collection<Object>> l buffer(long j10, TimeUnit timeUnit, m0 m0Var, int i10, Callable<U> callable, boolean z10) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        ut.o0.verifyPositive(i10, "count");
        return mu.a.onAssembly(new yt.q0(this, j10, j10, timeUnit, m0Var, callable, i10, z10));
    }

    public final <R> l flatMap(st.o oVar, st.o oVar2, Callable<? extends tw.b> callable, int i10) {
        ut.o0.requireNonNull(oVar, "onNextMapper is null");
        ut.o0.requireNonNull(oVar2, "onErrorMapper is null");
        ut.o0.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new d7(this, oVar, oVar2, callable), i10);
    }

    public final l window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, ou.j.computation(), j11, z10);
    }

    public static <T1, T2, T3, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, st.h hVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        return combineLatest(ut.m0.toFunction(hVar), bVar, bVar2, bVar3);
    }

    public final l window(long j10, TimeUnit timeUnit, m0 m0Var) {
        return window(j10, timeUnit, m0Var, Long.MAX_VALUE, false);
    }

    public static <T1, T2, T3, T4, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, st.i iVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        return zipArray(ut.m0.toFunction(iVar), false, bufferSize(), bVar, bVar2, bVar3, bVar4);
    }

    public final l window(long j10, TimeUnit timeUnit, m0 m0Var, long j11) {
        return window(j10, timeUnit, m0Var, j11, false);
    }

    public final <R> l withLatestFrom(tw.b[] bVarArr, st.o oVar) {
        ut.o0.requireNonNull(bVarArr, "others is null");
        ut.o0.requireNonNull(oVar, wHkgq.QDzUQf);
        return mu.a.onAssembly(new ef(this, bVarArr, oVar));
    }

    public final <R> l replay(st.o oVar, long j10, TimeUnit timeUnit) {
        return replay(oVar, j10, timeUnit, ou.j.computation());
    }

    public final l window(long j10, TimeUnit timeUnit, m0 m0Var, long j11, boolean z10) {
        return window(j10, timeUnit, m0Var, j11, z10, bufferSize());
    }

    public static <T> l just(T t10, T t11, T t12, T t13, T t14, T t15) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        return fromArray(t10, t11, t12, t13, t14, t15);
    }

    public final <U, R> l flatMap(st.o oVar, st.c cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> l replay(st.o oVar, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return ia.multicastSelector(k6.replayCallable(this, j10, timeUnit, m0Var), oVar);
    }

    public final l window(long j10, TimeUnit timeUnit, m0 m0Var, long j11, boolean z10, int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.verifyPositive(j11, "count");
        return mu.a.onAssembly(new xe(this, j10, j10, timeUnit, m0Var, j11, i10, z10));
    }

    public static <T1, T2, T3, T4, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, st.i iVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        return combineLatest(ut.m0.toFunction(iVar), bVar, bVar2, bVar3, bVar4);
    }

    public final l buffer(long j10, TimeUnit timeUnit, m0 m0Var) {
        return buffer(j10, timeUnit, m0Var, Integer.MAX_VALUE, iu.c.asCallable(), false);
    }

    public final <U, R> l flatMap(st.o oVar, st.c cVar, boolean z10) {
        return flatMap(oVar, cVar, z10, bufferSize(), bufferSize());
    }

    public final <R> l withLatestFrom(Iterable<? extends tw.b> iterable, st.o oVar) {
        ut.o0.requireNonNull(iterable, "others is null");
        ut.o0.requireNonNull(oVar, "combiner is null");
        return mu.a.onAssembly(new ef(this, iterable, oVar));
    }

    public final <TOpening, TClosing> l buffer(l lVar, st.o oVar) {
        return buffer(lVar, oVar, iu.c.asCallable());
    }

    public final <U, R> l flatMap(st.o oVar, st.c cVar, boolean z10, int i10) {
        return flatMap(oVar, cVar, z10, i10, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, st.j jVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        return zipArray(ut.m0.toFunction(jVar), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final <TOpening, TClosing, U extends Collection<Object>> l buffer(l lVar, st.o oVar, Callable<U> callable) {
        ut.o0.requireNonNull(lVar, "openingIndicator is null");
        ut.o0.requireNonNull(oVar, "closingIndicator is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new yt.f0(this, lVar, oVar, callable));
    }

    public final <U, R> l flatMap(st.o oVar, st.c cVar, boolean z10, int i10, int i11) {
        ut.o0.requireNonNull(oVar, "mapper is null");
        ut.o0.requireNonNull(cVar, "combiner is null");
        ut.o0.verifyPositive(i10, "maxConcurrency");
        ut.o0.verifyPositive(i11, "bufferSize");
        return flatMap(k6.flatMapWithCombiner(oVar, cVar), z10, i10, i11);
    }

    public final l takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, ou.j.computation(), false, bufferSize());
    }

    public final <R> l replay(st.o oVar, m0 m0Var) {
        ut.o0.requireNonNull(oVar, "selector is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return ia.multicastSelector(k6.replayCallable(this), k6.replayFunction(oVar, m0Var));
    }

    public final l takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, ou.j.computation(), z10, bufferSize());
    }

    public final l takeLast(long j10, TimeUnit timeUnit, m0 m0Var) {
        return takeLast(j10, timeUnit, m0Var, false, bufferSize());
    }

    public final <B> l window(tw.b bVar) {
        return window(bVar, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, st.j jVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, ikJMrW.mdkRGs);
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, duhsDlGWdBkekB.faYetMzT);
        ut.o0.requireNonNull(bVar5, "source5 is null");
        return combineLatest(ut.m0.toFunction(jVar), bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final l takeLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10) {
        return takeLast(j10, timeUnit, m0Var, z10, bufferSize());
    }

    public final <B> l window(tw.b bVar, int i10) {
        ut.o0.requireNonNull(bVar, "boundaryIndicator is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new ie(this, bVar, i10));
    }

    public static <T> l just(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        ut.o0.requireNonNull(t10, "item1 is null");
        ut.o0.requireNonNull(t11, "item2 is null");
        ut.o0.requireNonNull(t12, "item3 is null");
        ut.o0.requireNonNull(t13, "item4 is null");
        ut.o0.requireNonNull(t14, "item5 is null");
        ut.o0.requireNonNull(t15, "item6 is null");
        ut.o0.requireNonNull(t16, "item7 is null");
        return fromArray(t10, t11, t12, t13, t14, t15, t16);
    }

    public final <B> l buffer(tw.b bVar) {
        return buffer(bVar, iu.c.asCallable());
    }

    public final l takeLast(long j10, TimeUnit timeUnit, m0 m0Var, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, m0Var, z10, i10);
    }

    public final <B> l buffer(tw.b bVar, int i10) {
        ut.o0.verifyPositive(i10, "initialCapacity");
        return buffer(bVar, ut.m0.createArrayList(i10));
    }

    public final <U, R> l flatMap(st.o oVar, st.c cVar, int i10) {
        return flatMap(oVar, cVar, false, i10, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, T6, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, st.k kVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        return zipArray(ut.m0.toFunction(kVar), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final rt.a replay(int i10) {
        ut.o0.verifyPositive(i10, "bufferSize");
        return ia.create(this, i10);
    }

    public final <U, V> l window(tw.b bVar, st.o oVar) {
        return window(bVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<Object>> l buffer(tw.b bVar, Callable<U> callable) {
        ut.o0.requireNonNull(bVar, "boundaryIndicator is null");
        ut.o0.requireNonNull(callable, "bufferSupplier is null");
        return mu.a.onAssembly(new yt.l0(this, bVar, callable));
    }

    public final <U, V> l window(tw.b bVar, st.o oVar, int i10) {
        ut.o0.requireNonNull(bVar, "openingIndicator is null");
        ut.o0.requireNonNull(oVar, "closingIndicator is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new ne(this, bVar, oVar, i10));
    }

    public final rt.a replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, ou.j.computation());
    }

    public static <T1, T2, T3, T4, T5, T6, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, st.k kVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        return combineLatest(ut.m0.toFunction(kVar), bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final rt.a replay(int i10, long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.verifyPositive(i10, "bufferSize");
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return ia.create(this, j10, timeUnit, m0Var, i10);
    }

    public final <B> l buffer(Callable<? extends tw.b> callable) {
        return buffer(callable, iu.c.asCallable());
    }

    public final <B, U extends Collection<Object>> l buffer(Callable<? extends tw.b> callable, Callable<U> callable2) {
        ut.o0.requireNonNull(callable, "boundaryIndicatorSupplier is null");
        ut.o0.requireNonNull(callable2, "bufferSupplier is null");
        return mu.a.onAssembly(new yt.i0(this, callable, callable2));
    }

    public final <B> l window(Callable<? extends tw.b> callable) {
        return window(callable, bufferSize());
    }

    public static <T> l just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
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

    public final <B> l window(Callable<? extends tw.b> callable, int i10) {
        ut.o0.requireNonNull(callable, "boundaryIndicatorSupplier is null");
        ut.o0.verifyPositive(i10, "bufferSize");
        return mu.a.onAssembly(new qe(this, callable, i10));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, tw.b bVar7, st.l lVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        ut.o0.requireNonNull(bVar7, "source7 is null");
        return zipArray(ut.m0.toFunction(lVar), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final rt.a replay(int i10, m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return ia.observeOn(replay(i10), m0Var);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, tw.b bVar7, st.l lVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        ut.o0.requireNonNull(bVar7, "source7 is null");
        return combineLatest(ut.m0.toFunction(lVar), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final rt.a replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, ou.j.computation());
    }

    public final rt.a replay(long j10, TimeUnit timeUnit, m0 m0Var) {
        ut.o0.requireNonNull(timeUnit, "unit is null");
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return ia.create(this, j10, timeUnit, m0Var);
    }

    public final rt.a replay(m0 m0Var) {
        ut.o0.requireNonNull(m0Var, "scheduler is null");
        return ia.observeOn(replay(), m0Var);
    }

    public static <T> l just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
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

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, tw.b bVar7, tw.b bVar8, st.m mVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        ut.o0.requireNonNull(bVar7, "source7 is null");
        ut.o0.requireNonNull(bVar8, "source8 is null");
        return zipArray(ut.m0.toFunction(mVar), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, tw.b bVar7, tw.b bVar8, st.m mVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        ut.o0.requireNonNull(bVar7, "source7 is null");
        ut.o0.requireNonNull(bVar8, "source8 is null");
        return combineLatest(ut.m0.toFunction(mVar), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l zip(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, tw.b bVar7, tw.b bVar8, tw.b bVar9, st.n nVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        ut.o0.requireNonNull(bVar7, "source7 is null");
        ut.o0.requireNonNull(bVar8, "source8 is null");
        ut.o0.requireNonNull(bVar9, "source9 is null");
        return zipArray(ut.m0.toFunction(nVar), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public static <T> l just(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
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

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l combineLatest(tw.b bVar, tw.b bVar2, tw.b bVar3, tw.b bVar4, tw.b bVar5, tw.b bVar6, tw.b bVar7, tw.b bVar8, tw.b bVar9, st.n nVar) {
        ut.o0.requireNonNull(bVar, "source1 is null");
        ut.o0.requireNonNull(bVar2, "source2 is null");
        ut.o0.requireNonNull(bVar3, "source3 is null");
        ut.o0.requireNonNull(bVar4, "source4 is null");
        ut.o0.requireNonNull(bVar5, "source5 is null");
        ut.o0.requireNonNull(bVar6, "source6 is null");
        ut.o0.requireNonNull(bVar7, VPCjETNfjxu.exsDJPfFULGfp);
        ut.o0.requireNonNull(bVar8, "source8 is null");
        ut.o0.requireNonNull(bVar9, "source9 is null");
        return combineLatest(ut.m0.toFunction(nVar), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }
}
