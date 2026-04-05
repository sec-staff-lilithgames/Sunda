package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.h;
import com.explorestack.protobuf.adcom.s;
import com.explorestack.protobuf.openrtb.Request;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface AuctionContextOrBuilder extends MessageOrBuilder {
    int getAt();

    Context getContext();

    h getContextOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getId();

    ByteString getIdBytes();

    Request.Item getItem();

    Request.ItemOrBuilder getItemOrBuilder();

    Placement getPlacement();

    s getPlacementOrBuilder();

    PlacementTag getPlacementTag();

    int getPlacementTagValue();

    boolean getTest();

    String getTimestamp();

    ByteString getTimestampBytes();

    boolean hasContext();

    boolean hasItem();

    boolean hasPlacement();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
