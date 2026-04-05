package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.CampaignStateOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface CampaignRepository {
    CampaignStateOuterClass.Campaign getCampaign(ByteString byteString);

    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(ByteString byteString);

    void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(ByteString byteString);

    void setShowTimestamp(ByteString byteString);
}
