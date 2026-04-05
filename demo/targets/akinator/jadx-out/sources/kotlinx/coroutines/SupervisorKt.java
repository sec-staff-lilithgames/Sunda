package kotlinx.coroutines;

import av.e;
import bv.h;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kv.p;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SupervisorKt {
    public static final CompletableJob SupervisorJob(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static /* synthetic */ CompletableJob SupervisorJob$default(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }

    public static final <R> Object supervisorScope(p pVar, d<? super R> dVar) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(dVar.getContext(), dVar);
        Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(supervisorCoroutine, supervisorCoroutine, pVar);
        if (objStartUndispatchedOrReturn == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return objStartUndispatchedOrReturn;
    }

    /* renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ Job m5136SupervisorJob$default(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }
}
