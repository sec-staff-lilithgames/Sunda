package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends GeneratedMessageLite.Builder implements e {
    public d addAllAlreadySeenCampaigns(Iterable<? extends CampaignImpression> iterable) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).addAllAlreadySeenCampaigns(iterable);
        return this;
    }

    public d addAlreadySeenCampaigns(CampaignImpression campaignImpression) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(campaignImpression);
        return this;
    }

    public d clearAlreadySeenCampaigns() {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).clearAlreadySeenCampaigns();
        return this;
    }

    @Override // rk.e
    public CampaignImpression getAlreadySeenCampaigns(int i10) {
        return ((CampaignImpressionList) this.instance).getAlreadySeenCampaigns(i10);
    }

    @Override // rk.e
    public int getAlreadySeenCampaignsCount() {
        return ((CampaignImpressionList) this.instance).getAlreadySeenCampaignsCount();
    }

    @Override // rk.e
    public List<CampaignImpression> getAlreadySeenCampaignsList() {
        return Collections.unmodifiableList(((CampaignImpressionList) this.instance).getAlreadySeenCampaignsList());
    }

    public d removeAlreadySeenCampaigns(int i10) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).removeAlreadySeenCampaigns(i10);
        return this;
    }

    public d setAlreadySeenCampaigns(int i10, CampaignImpression campaignImpression) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).setAlreadySeenCampaigns(i10, campaignImpression);
        return this;
    }

    public d addAlreadySeenCampaigns(int i10, CampaignImpression campaignImpression) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(i10, campaignImpression);
        return this;
    }

    public d setAlreadySeenCampaigns(int i10, b bVar) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).setAlreadySeenCampaigns(i10, (CampaignImpression) bVar.build());
        return this;
    }

    public d addAlreadySeenCampaigns(b bVar) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns((CampaignImpression) bVar.build());
        return this;
    }

    public d addAlreadySeenCampaigns(int i10, b bVar) {
        copyOnWrite();
        ((CampaignImpressionList) this.instance).addAlreadySeenCampaigns(i10, (CampaignImpression) bVar.build());
        return this;
    }
}
