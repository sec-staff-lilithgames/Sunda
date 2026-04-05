package n0;

import c0.m2;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final m2 f75234a = new m2(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 0, c0.i0.getFastOutSlowInEasing(), 2, null);

    /* renamed from: b, reason: collision with root package name */
    public static final m2 f75235b = new m2(150, 0, new c0.a0(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c, reason: collision with root package name */
    public static final m2 f75236c = new m2(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 0, new c0.a0(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m5705animateElevationrAjV9yQ(c0.e eVar, float f10, f0.n nVar, f0.n nVar2, zu.d<? super tu.x0> dVar) {
        x xVar = x.f75219a;
        c0.n nVarIncomingAnimationSpecForInteraction = nVar2 != null ? xVar.incomingAnimationSpecForInteraction(nVar2) : nVar != null ? xVar.outgoingAnimationSpecForInteraction(nVar) : null;
        tu.x0 x0Var = tu.x0.f87415a;
        if (nVarIncomingAnimationSpecForInteraction != null) {
            Object objAnimateTo$default = c0.e.animateTo$default(eVar, s2.i.m6815boximpl(f10), nVarIncomingAnimationSpecForInteraction, null, null, dVar, 12, null);
            return objAnimateTo$default == av.e.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : x0Var;
        }
        Object objSnapTo = eVar.snapTo(s2.i.m6815boximpl(f10), dVar);
        return objSnapTo == av.e.getCOROUTINE_SUSPENDED() ? objSnapTo : x0Var;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m5706animateElevationrAjV9yQ$default(c0.e eVar, float f10, f0.n nVar, f0.n nVar2, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        if ((i10 & 4) != 0) {
            nVar2 = null;
        }
        return m5705animateElevationrAjV9yQ(eVar, f10, nVar, nVar2, dVar);
    }
}
