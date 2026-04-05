package nj;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final CampaignImpressionList f77026c = CampaignImpressionList.getDefaultInstance();

    /* renamed from: a, reason: collision with root package name */
    public final q0 f77027a;

    /* renamed from: b, reason: collision with root package name */
    public mt.s f77028b = mt.s.empty();

    public z(q0 q0Var) {
        this.f77027a = q0Var;
    }

    public mt.c clearImpressions(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        HashSet hashSet = new HashSet();
        for (CampaignProto$ThickContent campaignProto$ThickContent : fetchEligibleCampaignsResponse.getMessagesList()) {
            hashSet.add(campaignProto$ThickContent.getPayloadCase().equals(qk.h.VANILLA_PAYLOAD) ? campaignProto$ThickContent.getVanillaPayload().getCampaignId() : campaignProto$ThickContent.getExperimentalPayload().getCampaignId());
        }
        j0.logd("Potential impressions to clear: " + hashSet.toString());
        return getAllImpressions().defaultIfEmpty(f77026c).flatMapCompletable(new v(1, this, hashSet));
    }

    public mt.s getAllImpressions() {
        final int i10 = 0;
        final int i11 = 1;
        return this.f77028b.switchIfEmpty(this.f77027a.read(CampaignImpressionList.parser()).doOnSuccess(new st.g(this) { // from class: nj.w

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f77021c;

            {
                this.f77021c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f77021c.f77028b = mt.s.just((CampaignImpressionList) obj);
                        break;
                    default:
                        z zVar = this.f77021c;
                        zVar.getClass();
                        zVar.f77028b = mt.s.empty();
                        break;
                }
            }
        })).doOnError(new st.g(this) { // from class: nj.w

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f77021c;

            {
                this.f77021c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f77021c.f77028b = mt.s.just((CampaignImpressionList) obj);
                        break;
                    default:
                        z zVar = this.f77021c;
                        zVar.getClass();
                        zVar.f77028b = mt.s.empty();
                        break;
                }
            }
        });
    }

    public mt.n0<Boolean> isImpressed(CampaignProto$ThickContent campaignProto$ThickContent) {
        return getAllImpressions().map(new x(0)).flatMapObservable(new x(1)).map(new x(2)).contains(campaignProto$ThickContent.getPayloadCase().equals(qk.h.VANILLA_PAYLOAD) ? campaignProto$ThickContent.getVanillaPayload().getCampaignId() : campaignProto$ThickContent.getExperimentalPayload().getCampaignId());
    }

    public mt.c storeImpression(CampaignImpression campaignImpression) {
        return getAllImpressions().defaultIfEmpty(f77026c).flatMapCompletable(new v(0, this, campaignImpression));
    }
}
