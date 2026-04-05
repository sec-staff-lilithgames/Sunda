package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements f {
    public b clearCampaignId() {
        copyOnWrite();
        ((CampaignImpression) this.instance).clearCampaignId();
        return this;
    }

    public b clearImpressionTimestampMillis() {
        copyOnWrite();
        ((CampaignImpression) this.instance).clearImpressionTimestampMillis();
        return this;
    }

    @Override // rk.f
    public String getCampaignId() {
        return ((CampaignImpression) this.instance).getCampaignId();
    }

    @Override // rk.f
    public ByteString getCampaignIdBytes() {
        return ((CampaignImpression) this.instance).getCampaignIdBytes();
    }

    @Override // rk.f
    public long getImpressionTimestampMillis() {
        return ((CampaignImpression) this.instance).getImpressionTimestampMillis();
    }

    public b setCampaignId(String str) {
        copyOnWrite();
        ((CampaignImpression) this.instance).setCampaignId(str);
        return this;
    }

    public b setCampaignIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignImpression) this.instance).setCampaignIdBytes(byteString);
        return this;
    }

    public b setImpressionTimestampMillis(long j10) {
        copyOnWrite();
        ((CampaignImpression) this.instance).setImpressionTimestampMillis(j10);
        return this;
    }
}
