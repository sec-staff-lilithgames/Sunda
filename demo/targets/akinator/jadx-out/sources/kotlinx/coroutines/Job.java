package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.SelectClause0;
import kv.p;
import rv.t;
import tu.f;
import tu.x0;
import zu.d;
import zu.j;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Job extends k {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(Job job, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        public static <R> R fold(Job job, R r10, p pVar) {
            return (R) j.fold(job, r10, pVar);
        }

        public static <E extends k> E get(Job job, l lVar) {
            return (E) j.get(job, lVar);
        }

        public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z10, boolean z11, kv.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return job.invokeOnCompletion(z10, z11, lVar);
        }

        public static m minusKey(Job job, l lVar) {
            return j.minusKey(job, lVar);
        }

        @f
        public static Job plus(Job job, Job job2) {
            return job2;
        }

        public static /* synthetic */ boolean cancel$default(Job job, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return job.cancel(th2);
        }

        public static m plus(Job job, m mVar) {
            return j.plus(job, mVar);
        }

        public static /* synthetic */ void getParent$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    ChildHandle attachChild(ChildJob childJob);

    @f
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @f
    /* synthetic */ boolean cancel(Throwable th2);

    @Override // zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // zu.k, zu.m
    /* synthetic */ k get(l lVar);

    CancellationException getCancellationException();

    t getChildren();

    @Override // zu.k
    /* synthetic */ l getKey();

    SelectClause0 getOnJoin();

    Job getParent();

    DisposableHandle invokeOnCompletion(kv.l lVar);

    DisposableHandle invokeOnCompletion(boolean z10, boolean z11, kv.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(d<? super x0> dVar);

    @Override // zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @f
    Job plus(Job job);

    @Override // zu.k, zu.m
    /* synthetic */ m plus(m mVar);

    boolean start();
}
