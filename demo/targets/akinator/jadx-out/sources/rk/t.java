package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t extends ds.b {
    @Override // ds.e
    public final ds.e a(wr.j jVar, wr.i iVar) {
        return new t(jVar, iVar);
    }

    public FetchEligibleCampaignsResponse fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        return (FetchEligibleCampaignsResponse) ds.q.blockingUnaryCall(getChannel(), x.getFetchEligibleCampaignsMethod(), getCallOptions(), fetchEligibleCampaignsRequest);
    }
}
