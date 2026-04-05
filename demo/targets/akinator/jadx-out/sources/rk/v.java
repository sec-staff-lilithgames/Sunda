package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import ds.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v extends ds.a {
    @Override // ds.e
    public final ds.e a(wr.j jVar, wr.i iVar) {
        return new v(jVar, iVar);
    }

    public void fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest, l0 l0Var) {
        ds.q.asyncUnaryCall(getChannel().newCall(x.getFetchEligibleCampaignsMethod(), getCallOptions()), fetchEligibleCampaignsRequest, l0Var);
    }
}
