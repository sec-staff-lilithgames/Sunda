package rk;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n extends GeneratedMessageLite.Builder implements o {
    public n addAllMessages(Iterable<? extends CampaignProto$ThickContent> iterable) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).addAllMessages(iterable);
        return this;
    }

    public n addMessages(CampaignProto$ThickContent campaignProto$ThickContent) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).addMessages(campaignProto$ThickContent);
        return this;
    }

    public n clearExpirationEpochTimestampMillis() {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).clearExpirationEpochTimestampMillis();
        return this;
    }

    public n clearMessages() {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).clearMessages();
        return this;
    }

    @Override // rk.o
    public long getExpirationEpochTimestampMillis() {
        return ((FetchEligibleCampaignsResponse) this.instance).getExpirationEpochTimestampMillis();
    }

    @Override // rk.o
    public CampaignProto$ThickContent getMessages(int i10) {
        return ((FetchEligibleCampaignsResponse) this.instance).getMessages(i10);
    }

    @Override // rk.o
    public int getMessagesCount() {
        return ((FetchEligibleCampaignsResponse) this.instance).getMessagesCount();
    }

    @Override // rk.o
    public List<CampaignProto$ThickContent> getMessagesList() {
        return Collections.unmodifiableList(((FetchEligibleCampaignsResponse) this.instance).getMessagesList());
    }

    public n removeMessages(int i10) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).removeMessages(i10);
        return this;
    }

    public n setExpirationEpochTimestampMillis(long j10) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).setExpirationEpochTimestampMillis(j10);
        return this;
    }

    public n setMessages(int i10, CampaignProto$ThickContent campaignProto$ThickContent) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).setMessages(i10, campaignProto$ThickContent);
        return this;
    }

    public n addMessages(int i10, CampaignProto$ThickContent campaignProto$ThickContent) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).addMessages(i10, campaignProto$ThickContent);
        return this;
    }

    public n setMessages(int i10, qk.f fVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).setMessages(i10, (CampaignProto$ThickContent) fVar.build());
        return this;
    }

    public n addMessages(qk.f fVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).addMessages((CampaignProto$ThickContent) fVar.build());
        return this;
    }

    public n addMessages(int i10, qk.f fVar) {
        copyOnWrite();
        ((FetchEligibleCampaignsResponse) this.instance).addMessages(i10, (CampaignProto$ThickContent) fVar.build());
        return this;
    }
}
