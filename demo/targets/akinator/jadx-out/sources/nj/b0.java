package nj;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b0 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f76859c;

    public /* synthetic */ b0(g0 g0Var, int i10) {
        this.f76858b = i10;
        this.f76859c = g0Var;
    }

    @Override // st.g
    public final void accept(Object obj) {
        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) obj;
        switch (this.f76858b) {
            case 0:
                this.f76859c.f76906g.clearImpressions(fetchEligibleCampaignsResponse).subscribe();
                break;
            default:
                this.f76859c.f76902c.put(fetchEligibleCampaignsResponse).doOnComplete(new p(2)).doOnError(new ca.b(7)).onErrorResumeNext(new x(3)).subscribe();
                break;
        }
    }
}
