package ek;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n1 implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f54596b;

    public n1(v1 v1Var) {
        this.f54596b = v1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
        return emit((t0) obj, (zu.d<? super tu.x0>) dVar);
    }

    public final Object emit(t0 t0Var, zu.d<? super tu.x0> dVar) {
        v1 v1Var = this.f54596b;
        v1Var.setLocalSessionData$com_google_firebase_firebase_sessions(t0Var);
        Object objAccess$notifySubscribers = v1.access$notifySubscribers(v1Var, t0Var.getSessionDetails().getSessionId(), p1.f54609b, dVar);
        return objAccess$notifySubscribers == av.e.getCOROUTINE_SUSPENDED() ? objAccess$notifySubscribers : tu.x0.f87415a;
    }
}
