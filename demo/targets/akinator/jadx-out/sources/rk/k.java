package rk;

import com.google.developers.mobile.targeting.proto.ClientSignalsProto$ClientSignals;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.ClientAppInfo;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k extends GeneratedMessageLite.Builder implements l {
    public k addAllAlreadySeenCampaigns(Iterable<? extends CampaignImpression> iterable) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).addAllAlreadySeenCampaigns(iterable);
        return this;
    }

    public k addAlreadySeenCampaigns(CampaignImpression campaignImpression) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).addAlreadySeenCampaigns(campaignImpression);
        return this;
    }

    public k clearAlreadySeenCampaigns() {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).clearAlreadySeenCampaigns();
        return this;
    }

    public k clearClientSignals() {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).clearClientSignals();
        return this;
    }

    public k clearProjectNumber() {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).clearProjectNumber();
        return this;
    }

    public k clearRequestingClientApp() {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).clearRequestingClientApp();
        return this;
    }

    @Override // rk.l
    public CampaignImpression getAlreadySeenCampaigns(int i10) {
        return ((FetchEligibleCampaignsRequest) this.instance).getAlreadySeenCampaigns(i10);
    }

    @Override // rk.l
    public int getAlreadySeenCampaignsCount() {
        return ((FetchEligibleCampaignsRequest) this.instance).getAlreadySeenCampaignsCount();
    }

    @Override // rk.l
    public List<CampaignImpression> getAlreadySeenCampaignsList() {
        return Collections.unmodifiableList(((FetchEligibleCampaignsRequest) this.instance).getAlreadySeenCampaignsList());
    }

    @Override // rk.l
    public ClientSignalsProto$ClientSignals getClientSignals() {
        return ((FetchEligibleCampaignsRequest) this.instance).getClientSignals();
    }

    @Override // rk.l
    public String getProjectNumber() {
        return ((FetchEligibleCampaignsRequest) this.instance).getProjectNumber();
    }

    @Override // rk.l
    public ByteString getProjectNumberBytes() {
        return ((FetchEligibleCampaignsRequest) this.instance).getProjectNumberBytes();
    }

    @Override // rk.l
    public ClientAppInfo getRequestingClientApp() {
        return ((FetchEligibleCampaignsRequest) this.instance).getRequestingClientApp();
    }

    @Override // rk.l
    public boolean hasClientSignals() {
        return ((FetchEligibleCampaignsRequest) this.instance).hasClientSignals();
    }

    @Override // rk.l
    public boolean hasRequestingClientApp() {
        return ((FetchEligibleCampaignsRequest) this.instance).hasRequestingClientApp();
    }

    public k mergeClientSignals(ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).mergeClientSignals(clientSignalsProto$ClientSignals);
        return this;
    }

    public k mergeRequestingClientApp(ClientAppInfo clientAppInfo) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).mergeRequestingClientApp(clientAppInfo);
        return this;
    }

    public k removeAlreadySeenCampaigns(int i10) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).removeAlreadySeenCampaigns(i10);
        return this;
    }

    public k setAlreadySeenCampaigns(int i10, CampaignImpression campaignImpression) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setAlreadySeenCampaigns(i10, campaignImpression);
        return this;
    }

    public k setClientSignals(ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setClientSignals(clientSignalsProto$ClientSignals);
        return this;
    }

    public k setProjectNumber(String str) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setProjectNumber(str);
        return this;
    }

    public k setProjectNumberBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setProjectNumberBytes(byteString);
        return this;
    }

    public k setRequestingClientApp(ClientAppInfo clientAppInfo) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setRequestingClientApp(clientAppInfo);
        return this;
    }

    public k addAlreadySeenCampaigns(int i10, CampaignImpression campaignImpression) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).addAlreadySeenCampaigns(i10, campaignImpression);
        return this;
    }

    public k setAlreadySeenCampaigns(int i10, b bVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setAlreadySeenCampaigns(i10, (CampaignImpression) bVar.build());
        return this;
    }

    public k setClientSignals(uh.d dVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setClientSignals((ClientSignalsProto$ClientSignals) dVar.build());
        return this;
    }

    public k setRequestingClientApp(h hVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).setRequestingClientApp((ClientAppInfo) hVar.build());
        return this;
    }

    public k addAlreadySeenCampaigns(b bVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).addAlreadySeenCampaigns((CampaignImpression) bVar.build());
        return this;
    }

    public k addAlreadySeenCampaigns(int i10, b bVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsRequest) this.instance).addAlreadySeenCampaigns(i10, (CampaignImpression) bVar.build());
        return this;
    }
}
