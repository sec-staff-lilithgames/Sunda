package kotlinx.coroutines.sync;

import av.e;
import bv.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import kv.q;
import p0.o2;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    private static final /* synthetic */ AtomicReferenceFieldUpdater owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private final q onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class CancellableContinuationWithOwner implements CancellableContinuation<x0>, Waiter {
        public final CancellableContinuationImpl<x0> cont;
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(CancellableContinuationImpl<? super x0> cancellableContinuationImpl, Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x0 resume$lambda$6(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th2) {
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return x0.f87415a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x0 tryResume$lambda$3(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th2, x0 x0Var, m mVar) {
            MutexImpl.getOwner$volatile$FU().set(mutexImpl, cancellableContinuationWithOwner.owner);
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return x0.f87415a;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable th2) {
            return this.cont.cancel(th2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation, zu.d
        public m getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i10) {
            this.cont.invokeOnCancellation(segment, i10);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @f
        public void resume(x0 x0Var, l lVar) {
            this.cont.resume((CancellableContinuationImpl<x0>) x0Var, lVar);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, x0 x0Var) {
            this.cont.resumeUndispatched(coroutineDispatcher, x0Var);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation, zu.d
        public void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResume(x0 x0Var, Object obj) {
            return this.cont.tryResume(x0Var, obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResumeWithException(Throwable th2) {
            return this.cont.tryResumeWithException(th2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(l lVar) {
            this.cont.invokeOnCancellation(lVar);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public <R extends x0> void resume(R r10, q qVar) {
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            CancellableContinuationImpl<x0> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            cancellableContinuationImpl.resume((CancellableContinuationImpl<x0>) r10, new l() { // from class: kotlinx.coroutines.sync.b
                @Override // kv.l
                public final Object invoke(Object obj) {
                    return MutexImpl.CancellableContinuationWithOwner.resume$lambda$6(mutexImpl, this, (Throwable) obj);
                }
            });
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public <R extends x0> Object tryResume(R r10, Object obj, q qVar) {
            Object objTryResume = this.cont.tryResume(r10, obj, new a(MutexImpl.this, this, 0));
            if (objTryResume != null) {
                MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            }
            return objTryResume;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final Object owner;
        public final SelectInstanceInternal<Q> select;

        public SelectInstanceWithOwner(SelectInstanceInternal<Q> selectInstanceInternal, Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public m getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i10) {
            this.select.invokeOnCancellation(segment, i10);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object obj) {
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object obj, Object obj2) {
            boolean zTrySelect = this.select.trySelect(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zTrySelect) {
                MutexImpl.getOwner$volatile$FU().set(mutexImpl, this.owner);
            }
            return zTrySelect;
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new kotlinx.coroutines.a(this, 1);
    }

    private final /* synthetic */ Object getOwner$volatile() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return owner$volatile$FU;
    }

    private final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object lock$suspendImpl(MutexImpl mutexImpl, Object obj, d<? super x0> dVar) {
        Object objLockSuspend;
        boolean zTryLock = mutexImpl.tryLock(obj);
        x0 x0Var = x0.f87415a;
        return (!zTryLock && (objLockSuspend = mutexImpl.lockSuspend(obj, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objLockSuspend : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lockSuspend(Object obj, d<? super x0> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(av.b.intercepted(dVar));
        try {
            acquire((CancellableContinuation<? super x0>) new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
            Object result = orCreateCancellableContinuation.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return result == e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q onSelectCancellationUnlockConstructor$lambda$1(MutexImpl mutexImpl, SelectInstance selectInstance, Object obj, Object obj2) {
        return new a(mutexImpl, obj, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onSelectCancellationUnlockConstructor$lambda$1$lambda$0(MutexImpl mutexImpl, Object obj, Throwable th2, Object obj2, m mVar) {
        mutexImpl.unlock(obj);
        return x0.f87415a;
    }

    private final /* synthetic */ void setOwner$volatile(Object obj) {
        this.owner$volatile = obj;
    }

    private final int tryLockImpl(Object obj) {
        while (!tryAcquire()) {
            if (obj == null) {
                return 1;
            }
            int iHoldsLockImpl = holdsLockImpl(obj);
            if (iHoldsLockImpl == 1) {
                return 2;
            }
            if (iHoldsLockImpl == 2) {
                return 1;
            }
        }
        owner$volatile$FU.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.INSTANCE;
        e0.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) h1.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.INSTANCE;
        e0.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, qVar, (q) h1.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.onSelectCancellationUnlockConstructor);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object obj) {
        return holdsLockImpl(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, d<? super x0> dVar) {
        return lock$suspendImpl(this, obj, dVar);
    }

    public Object onLockProcessResult(Object obj, Object obj2) {
        if (e0.areEqual(obj2, MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER)) {
            throw new IllegalStateException(o2.o(obj, "This mutex is already locked by the specified owner: "));
        }
        return this;
    }

    public void onLockRegFunction(SelectInstance<?> selectInstance, Object obj) {
        if (obj != null && holdsLock(obj)) {
            selectInstance.selectInRegistrationPhase(MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER);
        } else {
            e0.checkNotNull(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            onAcquireRegFunction(new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj), obj);
        }
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$volatile$FU.get(this) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        int iTryLockImpl = tryLockImpl(obj);
        if (iTryLockImpl == 0) {
            return true;
        }
        if (iTryLockImpl == 1) {
            return false;
        }
        if (iTryLockImpl != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(o2.o(obj, "This mutex is already locked by the specified owner: "));
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$volatile$FU;
                Symbol symbol = MutexKt.NO_OWNER;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                release();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }
}
