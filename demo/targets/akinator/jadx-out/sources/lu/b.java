package lu;

import be.nVUQ.UupKET;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import cu.a0;
import cu.d0;
import cu.f;
import cu.f0;
import cu.h0;
import cu.j;
import cu.l0;
import cu.n;
import cu.p;
import cu.q0;
import cu.s;
import cu.t0;
import cu.x;
import io.ktor.http.LinkHeader;
import iu.k;
import iu.m;
import java.util.Comparator;
import java.util.concurrent.Callable;
import mt.l;
import p0.o2;
import st.g;
import st.o;
import ut.m0;
import ut.o0;
import ut.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b {
    public static <T> b from(tw.b bVar) {
        return from(bVar, Runtime.getRuntime().availableProcessors(), l.bufferSize());
    }

    public static <T> b fromArray(tw.b... bVarArr) {
        if (bVarArr.length != 0) {
            return mu.a.onAssembly(new p(bVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    public final boolean a(tw.c[] cVarArr) {
        int iParallelism = parallelism();
        if (cVarArr.length == iParallelism) {
            return true;
        }
        StringBuilder sbT = o2.t(iParallelism, "parallelism = ", ", subscribers = ");
        sbT.append(cVarArr.length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbT.toString());
        for (tw.c cVar : cVarArr) {
            hu.d.error(illegalArgumentException, cVar);
        }
        return false;
    }

    public final <R> R as(c cVar) {
        o0.requireNonNull(cVar, "converter is null").getClass();
        throw new ClassCastException();
    }

    public final <C> b collect(Callable<? extends C> callable, st.b bVar) {
        o0.requireNonNull(callable, "collectionSupplier is null");
        o0.requireNonNull(bVar, "collector is null");
        return mu.a.onAssembly(new cu.b(this, callable, bVar));
    }

    public final <U> b compose(d dVar) {
        o0.requireNonNull(dVar, "composer is null").getClass();
        throw new ClassCastException();
    }

    public final <R> b concatMap(o oVar) {
        return concatMap(oVar, 2);
    }

    public final <R> b concatMapDelayError(o oVar, boolean z10) {
        return concatMapDelayError(oVar, 2, z10);
    }

    public final b doAfterNext(g gVar) {
        o0.requireNonNull(gVar, "onAfterNext is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        q qVar = m0.f88683f;
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVar, gVarEmptyConsumer2, oVar, oVar, gVarEmptyConsumer3, qVar, oVar));
    }

    public final b doAfterTerminated(st.a aVar) {
        o0.requireNonNull(aVar, "onAfterTerminate is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        g gVarEmptyConsumer4 = m0.emptyConsumer();
        q qVar = m0.f88683f;
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, oVar, aVar, gVarEmptyConsumer4, qVar, oVar));
    }

    public final b doOnCancel(st.a aVar) {
        o0.requireNonNull(aVar, "onCancel is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        g gVarEmptyConsumer4 = m0.emptyConsumer();
        q qVar = m0.f88683f;
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, oVar, oVar, gVarEmptyConsumer4, qVar, aVar));
    }

    public final b doOnComplete(st.a aVar) {
        o0.requireNonNull(aVar, "onComplete is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        g gVarEmptyConsumer4 = m0.emptyConsumer();
        q qVar = m0.f88683f;
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, aVar, oVar, gVarEmptyConsumer4, qVar, oVar));
    }

    public final b doOnError(g gVar) {
        o0.requireNonNull(gVar, "onError is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        q qVar = m0.f88683f;
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVar, oVar, oVar, gVarEmptyConsumer3, qVar, oVar));
    }

    public final b doOnNext(g gVar) {
        o0.requireNonNull(gVar, "onNext is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        q qVar = m0.f88683f;
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVar, gVarEmptyConsumer, gVarEmptyConsumer2, oVar, oVar, gVarEmptyConsumer3, qVar, oVar));
    }

    public final b doOnRequest(st.p pVar) {
        o0.requireNonNull(pVar, "onRequest is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, oVar, oVar, m0.emptyConsumer(), pVar, oVar));
    }

    public final b doOnSubscribe(g gVar) {
        o0.requireNonNull(gVar, "onSubscribe is null");
        g gVarEmptyConsumer = m0.emptyConsumer();
        g gVarEmptyConsumer2 = m0.emptyConsumer();
        g gVarEmptyConsumer3 = m0.emptyConsumer();
        ut.o oVar = m0.f88680c;
        return mu.a.onAssembly(new f0(this, gVarEmptyConsumer, gVarEmptyConsumer2, gVarEmptyConsumer3, oVar, oVar, gVar, m0.f88683f, oVar));
    }

    public final b filter(st.q qVar) {
        o0.requireNonNull(qVar, "predicate");
        return mu.a.onAssembly(new j(this, qVar));
    }

    public final <R> b flatMap(o oVar) {
        return flatMap(oVar, false, Integer.MAX_VALUE, l.bufferSize());
    }

    public final <R> b map(o oVar) {
        o0.requireNonNull(oVar, "mapper");
        return mu.a.onAssembly(new a0(this, oVar));
    }

    public abstract int parallelism();

    public final l reduce(st.c cVar) {
        o0.requireNonNull(cVar, "reducer");
        return mu.a.onAssembly(new l0(this, cVar));
    }

    public final b runOn(mt.m0 m0Var) {
        return runOn(m0Var, l.bufferSize());
    }

    public final l sequential() {
        return sequential(l.bufferSize());
    }

    public final l sequentialDelayError() {
        return sequentialDelayError(l.bufferSize());
    }

    public final l sorted(Comparator<Object> comparator) {
        return sorted(comparator, 16);
    }

    public abstract void subscribe(tw.c[] cVarArr);

    public final <U> U to(o oVar) {
        try {
            return (U) ((o) o0.requireNonNull(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw m.wrapOrThrow(th2);
        }
    }

    public final l toSortedList(Comparator<Object> comparator) {
        return toSortedList(comparator, 16);
    }

    public static <T> b from(tw.b bVar, int i10) {
        return from(bVar, i10, l.bufferSize());
    }

    public final <R> b concatMap(o oVar, int i10) {
        o0.requireNonNull(oVar, "mapper is null");
        o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new cu.c(this, oVar, i10, k.f68411b));
    }

    public final <R> b concatMapDelayError(o oVar, int i10, boolean z10) {
        o0.requireNonNull(oVar, "mapper is null");
        o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new cu.c(this, oVar, i10, z10 ? k.f68413e : k.f68412c));
    }

    public final <R> b flatMap(o oVar, boolean z10) {
        return flatMap(oVar, z10, Integer.MAX_VALUE, l.bufferSize());
    }

    public final b runOn(mt.m0 m0Var, int i10) {
        o0.requireNonNull(m0Var, "scheduler");
        o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new q0(this, m0Var, i10));
    }

    public final l sequential(int i10) {
        o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new x(this, i10, false));
    }

    public final l sequentialDelayError(int i10) {
        o0.verifyPositive(i10, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new x(this, i10, true));
    }

    public final l sorted(Comparator<Object> comparator, int i10) {
        o0.requireNonNull(comparator, "comparator is null");
        o0.verifyPositive(i10, "capacityHint");
        return mu.a.onAssembly(new t0(reduce(m0.createArrayList((i10 / parallelism()) + 1), iu.p.instance()).map(new iu.a0(comparator)), comparator));
    }

    public final l toSortedList(Comparator<Object> comparator, int i10) {
        o0.requireNonNull(comparator, "comparator is null");
        o0.verifyPositive(i10, "capacityHint");
        return mu.a.onAssembly(reduce(m0.createArrayList((i10 / parallelism()) + 1), iu.p.instance()).map(new iu.a0(comparator)).reduce(new iu.q(comparator)));
    }

    public static <T> b from(tw.b bVar, int i10, int i11) {
        o0.requireNonNull(bVar, UupKET.MuVdQFWpqowz);
        o0.verifyPositive(i10, "parallelism");
        o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new s(bVar, i10, i11));
    }

    public final b filter(st.q qVar, a aVar) {
        o0.requireNonNull(qVar, "predicate");
        o0.requireNonNull(aVar, "errorHandler is null");
        return mu.a.onAssembly(new n(this, qVar, aVar));
    }

    public final <R> b flatMap(o oVar, boolean z10, int i10) {
        return flatMap(oVar, z10, i10, l.bufferSize());
    }

    public final <R> b map(o oVar, a aVar) {
        o0.requireNonNull(oVar, "mapper");
        o0.requireNonNull(aVar, "errorHandler is null");
        return mu.a.onAssembly(new d0(this, oVar, aVar));
    }

    public final <R> b reduce(Callable<R> callable, st.c cVar) {
        o0.requireNonNull(callable, "initialSupplier");
        o0.requireNonNull(cVar, NyKZx.AgPuu);
        return mu.a.onAssembly(new h0(this, callable, cVar));
    }

    public final <R> b flatMap(o oVar, boolean z10, int i10, int i11) {
        o0.requireNonNull(oVar, "mapper is null");
        o0.verifyPositive(i10, "maxConcurrency");
        o0.verifyPositive(i11, LinkHeader.Rel.Prefetch);
        return mu.a.onAssembly(new cu.o(this, oVar, z10, i10, i11));
    }

    public final b filter(st.q qVar, st.c cVar) {
        o0.requireNonNull(qVar, "predicate");
        o0.requireNonNull(cVar, "errorHandler is null");
        return mu.a.onAssembly(new n(this, qVar, cVar));
    }

    public final <R> b map(o oVar, st.c cVar) {
        o0.requireNonNull(oVar, "mapper");
        o0.requireNonNull(cVar, "errorHandler is null");
        return mu.a.onAssembly(new d0(this, oVar, cVar));
    }

    public final b doOnNext(g gVar, a aVar) {
        o0.requireNonNull(gVar, "onNext is null");
        o0.requireNonNull(aVar, "errorHandler is null");
        return mu.a.onAssembly(new f(this, gVar, aVar));
    }

    public final b doOnNext(g gVar, st.c cVar) {
        o0.requireNonNull(gVar, "onNext is null");
        o0.requireNonNull(cVar, "errorHandler is null");
        return mu.a.onAssembly(new f(this, gVar, cVar));
    }
}
