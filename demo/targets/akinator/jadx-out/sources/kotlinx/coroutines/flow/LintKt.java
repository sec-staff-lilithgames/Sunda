package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import j1.o2;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.p;
import kv.q;
import kv.r;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class LintKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.LintKt$retry$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return bv.b.boxBoolean(true);
        }

        @Override // kv.p
        public final Object invoke(Throwable th2, zu.d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(th2, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    @tu.f
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        throw o2.r();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    @tu.f
    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        throw o2.r();
    }

    @tu.f
    /* renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m5183catch(SharedFlow<? extends T> sharedFlow, q qVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return FlowKt.m5171catch(sharedFlow, qVar);
    }

    @tu.f
    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        throw o2.r();
    }

    @tu.f
    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, zu.d<? super Integer> dVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        b0.mark(0);
        Object objCount = FlowKt.count(sharedFlow, dVar);
        b0.mark(1);
        return objCount;
    }

    @tu.f
    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, m mVar) {
        throw o2.r();
    }

    public static final m getCoroutineContext(FlowCollector<?> flowCollector) {
        throw o2.r();
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        throw o2.r();
    }

    @tu.f
    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j10, p pVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j10, pVar);
    }

    public static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new AnonymousClass1(null);
        }
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j10, pVar);
    }

    @tu.f
    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, r rVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return FlowKt.retryWhen(sharedFlow, rVar);
    }

    @tu.f
    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, zu.d<? super List<? extends T>> dVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        b0.mark(0);
        Object list$default = FlowKt__CollectionKt.toList$default(sharedFlow, null, dVar, 1, null);
        b0.mark(1);
        return list$default;
    }

    @tu.f
    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, zu.d<? super Set<? extends T>> dVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        b0.mark(0);
        Object set$default = FlowKt__CollectionKt.toSet$default(sharedFlow, null, dVar, 1, null);
        b0.mark(1);
        return set$default;
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, zu.d<?> dVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        b0.mark(0);
        FlowKt.toList(sharedFlow, list, dVar);
        b0.mark(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, zu.d<?> dVar) {
        e0.checkNotNull(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        b0.mark(0);
        FlowKt.toSet(sharedFlow, set, dVar);
        b0.mark(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @tu.f
    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    @tu.f
    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }
}
