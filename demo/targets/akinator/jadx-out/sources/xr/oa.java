package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class oa implements wr.f3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3.e f92855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta f92856b;

    public oa(ta taVar, b3.e eVar) {
        this.f92856b = taVar;
        this.f92855a = eVar;
    }

    @Override // wr.f3
    public void onSubchannelState(wr.g0 g0Var) {
        b3.f qaVar;
        ta taVar = this.f92856b;
        b3.c cVar = taVar.f93035f;
        wr.f0 state = g0Var.getState();
        if (state == wr.f0.f90916g) {
            return;
        }
        wr.f0 f0Var = wr.f0.f90915f;
        wr.f0 f0Var2 = wr.f0.f90914e;
        if (state == f0Var2 || state == f0Var) {
            cVar.refreshNameResolution();
        }
        if (taVar.f93037h == f0Var2) {
            if (state == wr.f0.f90912b) {
                return;
            }
            if (state == f0Var) {
                taVar.requestConnection();
                return;
            }
        }
        int iOrdinal = state.ordinal();
        if (iOrdinal != 0) {
            b3.e eVar = this.f92855a;
            if (iOrdinal == 1) {
                qaVar = new qa(wr.c3.withSubchannel(eVar));
            } else if (iOrdinal == 2) {
                qaVar = new qa(wr.c3.withError(g0Var.getStatus()));
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:" + state);
                }
                qaVar = new sa(taVar, eVar);
            }
        } else {
            qaVar = new qa(wr.c3.withNoResult());
        }
        taVar.f93037h = state;
        cVar.updateBalancingState(state, qaVar);
    }
}
