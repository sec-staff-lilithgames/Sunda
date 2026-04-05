package kotlinx.coroutines;

import kv.l;
import kv.q;
import tu.f;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CancellableContinuation<T> extends d<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return cancellableContinuation.cancel(th2);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable th2);

    void completeResume(Object obj);

    @Override // zu.d
    /* synthetic */ m getContext();

    void initCancellability();

    void invokeOnCancellation(l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @f
    void resume(T t10, l lVar);

    <R extends T> void resume(R r10, q qVar);

    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t10);

    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th2);

    @Override // zu.d
    /* synthetic */ void resumeWith(Object obj);

    Object tryResume(T t10, Object obj);

    <R extends T> Object tryResume(R r10, Object obj, q qVar);

    Object tryResumeWithException(Throwable th2);
}
