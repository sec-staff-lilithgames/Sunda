package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.s;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.c;
import com.explorestack.protobuf.sb;
import io.bidmachine.protobuf.ResponsePayload;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ResponsePayloadOrBuilder extends MessageOrBuilder {
    Timestamp getCacheTime();

    sb getCacheTimeOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    ResponsePayload.PayloadOneofCase getPayloadOneofCase();

    Placement getRequestItemSpec();

    s getRequestItemSpecOrBuilder();

    Openrtb getResponseCache();

    c getResponseCacheOrBuilder();

    String getResponseCacheUrl();

    ByteString getResponseCacheUrlBytes();

    boolean hasCacheTime();

    boolean hasRequestItemSpec();

    boolean hasResponseCache();

    boolean hasResponseCacheUrl();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
