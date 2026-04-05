package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u extends ds.c {
    @Override // ds.e
    public final ds.e a(wr.j jVar, wr.i iVar) {
        return new u(jVar, iVar);
    }

    public n1 fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        return ds.q.futureUnaryCall(getChannel().newCall(x.getFetchEligibleCampaignsMethod(), getCallOptions()), fetchEligibleCampaignsRequest);
    }
}
