package ek;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f54629i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f54630j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(v1 v1Var, zu.d dVar) {
        super(2, dVar);
        this.f54630j = v1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        s1 s1Var = new s1(this.f54630j, dVar);
        s1Var.f54629i = obj;
        return s1Var;
    }

    @Override // kv.p
    public final Object invoke(t0 t0Var, zu.d<? super t0> dVar) {
        return ((s1) create(t0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        t0 t0Var = (t0) this.f54629i;
        v1 v1Var = this.f54630j;
        boolean zB = v1Var.b(t0Var);
        boolean zAccess$isColdStart = v1.access$isColdStart(v1Var, t0Var);
        boolean zA = v1Var.a(t0Var);
        Map<String, k0> mapGenerateProcessDataMap = zAccess$isColdStart ? v1Var.f54655f.generateProcessDataMap() : zA ? v1Var.f54655f.updateProcessDataMap(t0Var.getProcessDataMap()) : t0Var.getProcessDataMap();
        x0 sessionDetails = zAccess$isColdStart ? null : t0Var.getSessionDetails();
        if (!zB && !zAccess$isColdStart) {
            return zA ? t0.copy$default(t0Var, null, null, v1Var.f54655f.updateProcessDataMap(mapGenerateProcessDataMap), 3, null) : t0Var;
        }
        x0 x0VarGenerateNewSession = v1Var.f54651b.generateNewSession(sessionDetails);
        v1Var.f54652c.mayLogSession(x0VarGenerateNewSession);
        v1Var.f54655f.onSessionGenerated();
        return t0Var.copy(x0VarGenerateNewSession, null, mapGenerateProcessDataMap);
    }
}
