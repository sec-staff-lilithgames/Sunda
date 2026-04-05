package c0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11641a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Mutex f11642b = MutexKt.Mutex$default(false, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final u0 f11643a;

        /* renamed from: b, reason: collision with root package name */
        public final Job f11644b;

        public a(u0 priority, Job job) {
            kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
            kotlin.jvm.internal.e0.checkNotNullParameter(job, "job");
            this.f11643a = priority;
            this.f11644b = job;
        }

        public final boolean canInterrupt(a other) {
            kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
            return this.f11643a.compareTo(other.f11643a) >= 0;
        }

        public final void cancel() {
            Job.DefaultImpls.cancel$default(this.f11644b, (CancellationException) null, 1, (Object) null);
        }

        public final Job getJob() {
            return this.f11644b;
        }

        public final u0 getPriority() {
            return this.f11643a;
        }
    }

    public static final void access$tryMutateOrCancel(v0 v0Var, a aVar) {
        AtomicReference atomicReference = v0Var.f11641a;
        while (true) {
            a aVar2 = (a) atomicReference.get();
            if (aVar2 != null && !aVar.canInterrupt(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.cancel();
                return;
            }
            return;
        }
    }

    public static /* synthetic */ Object mutate$default(v0 v0Var, u0 u0Var, kv.l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u0Var = u0.f11632b;
        }
        return v0Var.mutate(u0Var, lVar, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(v0 v0Var, Object obj, u0 u0Var, kv.p pVar, zu.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            u0Var = u0.f11632b;
        }
        return v0Var.mutateWith(obj, u0Var, pVar, dVar);
    }

    public final <R> Object mutate(u0 u0Var, kv.l lVar, zu.d<? super R> dVar) {
        return CoroutineScopeKt.coroutineScope(new w0(u0Var, this, lVar, null), dVar);
    }

    public final <T, R> Object mutateWith(T t10, u0 u0Var, kv.p pVar, zu.d<? super R> dVar) {
        return CoroutineScopeKt.coroutineScope(new x0(u0Var, this, pVar, t10, null), dVar);
    }
}
