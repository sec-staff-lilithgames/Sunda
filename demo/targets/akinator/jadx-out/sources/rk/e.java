package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface e extends MessageLiteOrBuilder {
    CampaignImpression getAlreadySeenCampaigns(int i10);

    int getAlreadySeenCampaignsCount();

    List<CampaignImpression> getAlreadySeenCampaignsList();
}
