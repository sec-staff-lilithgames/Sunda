package d0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f51503a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Mutex f51504b = MutexKt.Mutex$default(false, 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l3 f51505a;

        /* renamed from: b, reason: collision with root package name */
        public final Job f51506b;

        public a(l3 priority, Job job) {
            kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
            kotlin.jvm.internal.e0.checkNotNullParameter(job, "job");
            this.f51505a = priority;
            this.f51506b = job;
        }

        public final boolean canInterrupt(a other) {
            kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
            return this.f51505a.compareTo(other.f51505a) >= 0;
        }

        public final void cancel() {
            Job.DefaultImpls.cancel$default(this.f51506b, (CancellationException) null, 1, (Object) null);
        }

        public final Job getJob() {
            return this.f51506b;
        }

        public final l3 getPriority() {
            return this.f51505a;
        }
    }

    public static final void access$tryMutateOrCancel(m3 m3Var, a aVar) {
        AtomicReference atomicReference = m3Var.f51503a;
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

    public static /* synthetic */ Object mutate$default(m3 m3Var, l3 l3Var, kv.l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l3Var = l3.f51488b;
        }
        return m3Var.mutate(l3Var, lVar, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(m3 m3Var, Object obj, l3 l3Var, kv.p pVar, zu.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l3Var = l3.f51488b;
        }
        return m3Var.mutateWith(obj, l3Var, pVar, dVar);
    }

    public final <R> Object mutate(l3 l3Var, kv.l lVar, zu.d<? super R> dVar) {
        return CoroutineScopeKt.coroutineScope(new n3(l3Var, this, lVar, null), dVar);
    }

    public final <T, R> Object mutateWith(T t10, l3 l3Var, kv.p pVar, zu.d<? super R> dVar) {
        return CoroutineScopeKt.coroutineScope(new o3(l3Var, this, pVar, t10, null), dVar);
    }
}
