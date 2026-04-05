package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.a;
import com.explorestack.protobuf.openrtb.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface BidEventOrBuilder extends MessageOrBuilder {
    Ad getAd();

    a getAdOrBuilder();

    AuctionContext getAuctionContext();

    AuctionContextOrBuilder getAuctionContextOrBuilder();

    Response.Seatbid.Bid getBid();

    Response.Seatbid.BidOrBuilder getBidOrBuilder();

    String getBidid();

    ByteString getBididBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getSeat();

    ByteString getSeatBytes();

    String getTimestamp();

    ByteString getTimestampBytes();

    boolean hasAd();

    boolean hasAuctionContext();

    boolean hasBid();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
