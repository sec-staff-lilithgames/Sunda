package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface RequestExtensionOrBuilder extends MessageOrBuilder {
    boolean containsSellerData(String str);

    String getBmIfv();

    ByteString getBmIfvBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    HeaderBiddingType getHeaderBiddingType();

    int getHeaderBiddingTypeValue();

    String getIfv();

    ByteString getIfvBytes();

    String getIntegrationType();

    ByteString getIntegrationTypeBytes();

    @Deprecated
    Map<String, String> getSellerData();

    int getSellerDataCount();

    Map<String, String> getSellerDataMap();

    String getSellerDataOrDefault(String str, String str2);

    String getSellerDataOrThrow(String str);

    String getSellerId();

    ByteString getSellerIdBytes();

    String getSessionId();

    ByteString getSessionIdBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
