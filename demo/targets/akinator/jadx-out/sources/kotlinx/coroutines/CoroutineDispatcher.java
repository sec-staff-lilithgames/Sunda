package kotlinx.coroutines;

import f.j0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import zu.d;
import zu.e;
import zu.f;
import zu.g;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class CoroutineDispatcher extends zu.a implements g {
    public static final Key Key = new Key(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key extends zu.b {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoroutineDispatcher _init_$lambda$0(k kVar) {
            if (kVar instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) kVar;
            }
            return null;
        }

        private Key() {
            super(f.f98853b, new j0(1));
        }
    }

    public CoroutineDispatcher() {
        super(f.f98853b);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i10, str);
    }

    /* renamed from: dispatch */
    public abstract void mo5197dispatch(m mVar, Runnable runnable);

    public void dispatchYield(m mVar, Runnable runnable) {
        DispatchedContinuationKt.safeDispatch(this, mVar, runnable);
    }

    @Override // zu.a, zu.k, zu.m
    public <E extends k> E get(l lVar) {
        return (E) e.get(this, lVar);
    }

    @Override // zu.g
    public final <T> d<T> interceptContinuation(d<? super T> dVar) {
        return new DispatchedContinuation(this, dVar);
    }

    public boolean isDispatchNeeded(m mVar) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        LimitedDispatcherKt.checkParallelism(i10);
        return new LimitedDispatcher(this, i10, str);
    }

    @Override // zu.a, zu.k, zu.m
    public m minusKey(l lVar) {
        return e.minusKey(this, lVar);
    }

    @Override // zu.g
    public final void releaseInterceptedContinuation(d<?> dVar) {
        e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation) dVar).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @tu.f
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i10) {
        return limitedParallelism(i10, null);
    }

    @tu.f
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }
}
