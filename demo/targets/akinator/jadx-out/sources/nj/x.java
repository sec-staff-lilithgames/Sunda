package nj;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class x implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77022b;

    public /* synthetic */ x(int i10) {
        this.f77022b = i10;
    }

    @Override // st.o
    public final Object apply(Object obj) {
        switch (this.f77022b) {
            case 0:
                return ((CampaignImpressionList) obj).getAlreadySeenCampaignsList();
            case 1:
                return mt.b0.fromIterable((List) obj);
            case 2:
                return ((CampaignImpression) obj).getCampaignId();
            case 3:
                return mt.c.complete();
            default:
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                int iOrdinal = campaignProto$ThickContent.getContent().getMessageDetailsCase().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                    return mt.s.just(campaignProto$ThickContent);
                }
                j0.logd("Filtering non-displayable message");
                return mt.s.empty();
        }
    }
}
