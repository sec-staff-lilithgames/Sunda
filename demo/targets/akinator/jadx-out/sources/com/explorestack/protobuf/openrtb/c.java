package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.openrtb.Openrtb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDomainspec();

    ByteString getDomainspecBytes();

    String getDomainver();

    ByteString getDomainverBytes();

    Openrtb.PayloadCase getPayloadCase();

    Request getRequest();

    e getRequestOrBuilder();

    Response getResponse();

    f getResponseOrBuilder();

    String getVer();

    ByteString getVerBytes();

    boolean hasRequest();

    boolean hasResponse();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
