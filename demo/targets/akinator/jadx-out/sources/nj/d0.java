package nj;

import com.google.firebase.inappmessaging.model.MessageType;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import nh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class d0 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f76877c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f76878e;

    public /* synthetic */ d0(g0 g0Var, String str, int i10) {
        this.f76876b = i10;
        this.f76877c = g0Var;
        this.f76878e = str;
    }

    @Override // st.o
    public final Object apply(Object obj) {
        String campaignId;
        String campaignName;
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        switch (this.f76876b) {
            case 0:
                if (campaignProto$ThickContent.getPayloadCase().equals(qk.h.VANILLA_PAYLOAD)) {
                    campaignId = campaignProto$ThickContent.getVanillaPayload().getCampaignId();
                    campaignName = campaignProto$ThickContent.getVanillaPayload().getCampaignName();
                } else {
                    if (!campaignProto$ThickContent.getPayloadCase().equals(qk.h.EXPERIMENTAL_PAYLOAD)) {
                        return mt.s.empty();
                    }
                    campaignId = campaignProto$ThickContent.getExperimentalPayload().getCampaignId();
                    campaignName = campaignProto$ThickContent.getExperimentalPayload().getCampaignName();
                    if (!campaignProto$ThickContent.getIsTestCampaign()) {
                        a aVar = this.f76877c.f76911l;
                        aVar.f76855b.execute(new im.k(26, aVar, campaignProto$ThickContent.getExperimentalPayload().getExperimentPayload()));
                    }
                }
                rj.o oVarDecode = rj.s.decode(campaignProto$ThickContent.getContent(), campaignId, campaignName, campaignProto$ThickContent.getIsTestCampaign(), campaignProto$ThickContent.getDataBundleMap());
                return oVarDecode.getMessageType().equals(MessageType.UNSUPPORTED) ? mt.s.empty() : mt.s.just(new rj.y(oVarDecode, this.f76878e));
            default:
                if (campaignProto$ThickContent.getIsTestCampaign() || !g0.isAppForegroundEvent(this.f76878e)) {
                    return mt.s.just(campaignProto$ThickContent);
                }
                g0 g0Var = this.f76877c;
                return g0Var.f76907h.isRateLimited(g0Var.f76908i).doOnSuccess(new ca.b(4)).onErrorResumeNext(mt.n0.just(Boolean.FALSE)).filter(new n1(4)).map(new n(campaignProto$ThickContent, 1));
        }
    }
}
