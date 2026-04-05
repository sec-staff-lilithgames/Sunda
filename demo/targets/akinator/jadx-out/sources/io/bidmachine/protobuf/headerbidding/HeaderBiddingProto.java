package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class HeaderBiddingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n5bidmachine/protobuf/headerbidding/headerbidding.proto\u0012!bidmachine.protobuf.headerbidding\"Ö\u0002\n\u0016HeaderBiddingPlacement\u0012R\n\bad_units\u0018\u0001 \u0003(\u000b2@.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit\u001aç\u0001\n\u0006AdUnit\u0012\u000e\n\u0006bidder\u0018\u0001 \u0001(\t\u0012\u0015\n\rbidder_sdkver\u0018\u0002 \u0001(\t\u0012i\n\rclient_params\u0018\u0003 \u0003(\u000b2R.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.ClientParamsEntry\u0012\u0016\n\u000eprice_estimate\u0018\u0004 \u0001(\u0001\u001a3\n\u0011ClientParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"Å\u0002\n\u000fHeaderBiddingAd\u0012\u000e\n\u0006bidder\u0018\u0001 \u0001(\t\u0012[\n\rclient_params\u0018\u0002 \u0003(\u000b2D.bidmachine.protobuf.headerbidding.HeaderBiddingAd.ClientParamsEntry\u0012[\n\rserver_params\u0018\u0003 \u0003(\u000b2D.bidmachine.protobuf.headerbidding.HeaderBiddingAd.ServerParamsEntry\u001a3\n\u0011ClientParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a3\n\u0011ServerParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001BB\n$io.bidmachine.protobuf.headerbiddingB\u0012HeaderBiddingProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
    static final i7 internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
    static final i7 internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
    static final i7 internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable = new i7(descriptor2, new String[]{"AdUnits"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable = new i7(descriptor3, new String[]{"Bidder", "BidderSdkver", "ClientParams", "PriceEstimate"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_fieldAccessorTable = new i7(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable = new i7(descriptor5, new String[]{"Bidder", "ClientParams", "ServerParams"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_fieldAccessorTable = new i7(descriptor6, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor7 = descriptor5.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_fieldAccessorTable = new i7(descriptor7, new String[]{"Key", "Value"});
    }

    private HeaderBiddingProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}
