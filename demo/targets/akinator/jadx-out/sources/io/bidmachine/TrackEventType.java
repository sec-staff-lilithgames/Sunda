package io.bidmachine;

import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum TrackEventType {
    GetBidToken(EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE),
    InitLoading(506),
    AuctionRequest(507),
    AuctionRequestCancel(508),
    AuctionRequestExpired(509),
    AuctionRequestDestroy(510),
    BrokenCreativeDetector(EventTypeExtended.EVENT_TYPE_EXTENDED_BROKEN_CREATIVE_DETECTOR_VALUE),
    Load(500),
    FillAd(512),
    Impression(502),
    Show(501),
    Click(503),
    Close(504),
    Expired(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE),
    Destroy(505),
    Error(1000),
    TrackingError(1001),
    HeaderBiddingNetworksPrepare(703),
    HeaderBiddingNetworkInitialize(701),
    HeaderBiddingNetworkPrepare(702),
    MediationWin(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE),
    MediationLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE),
    WaterfallLoadStart(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE),
    WaterfallLoadFinish(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE),
    AdUnitLoadStart(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE),
    AdUnitLoadFinish(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE),
    AdUnitExpired(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE),
    AdUnitCheapestDequeued(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_INVALIDATED_VALUE),
    AdUnitShown(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_IMPRESSION_VALUE),
    AdUnitWin(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_WIN_VALUE),
    AdUnitLoss(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE),
    AdUnitPaidEvent(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE),
    ImpressionOpportunity(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE);

    private final int actionValue;

    TrackEventType(int i10) {
        this.actionValue = i10;
    }

    public static TrackEventType fromNumber(int i10) {
        for (TrackEventType trackEventType : values()) {
            if (trackEventType.actionValue == i10) {
                return trackEventType;
            }
        }
        return null;
    }

    public int getActionValue() {
        return this.actionValue;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append(" (");
        return a.b.f(this.actionValue, ")", sb2);
    }
}
